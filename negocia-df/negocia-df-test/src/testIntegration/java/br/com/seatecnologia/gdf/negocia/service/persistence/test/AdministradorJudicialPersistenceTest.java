/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.persistence.test;

import br.com.seatecnologia.gdf.negocia.exception.NoSuchAdministradorJudicialException;
import br.com.seatecnologia.gdf.negocia.model.AdministradorJudicial;
import br.com.seatecnologia.gdf.negocia.service.AdministradorJudicialLocalServiceUtil;
import br.com.seatecnologia.gdf.negocia.service.persistence.AdministradorJudicialPersistence;
import br.com.seatecnologia.gdf.negocia.service.persistence.AdministradorJudicialUtil;

import com.liferay.arquillian.extension.junit.bridge.junit.Arquillian;
import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.ProjectionFactoryUtil;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.test.rule.AggregateTestRule;
import com.liferay.portal.kernel.test.util.RandomTestUtil;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.util.IntegerWrapper;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.OrderByComparatorFactoryUtil;
import com.liferay.portal.test.rule.LiferayIntegrationTestRule;
import com.liferay.portal.test.rule.PersistenceTestRule;
import com.liferay.portal.test.rule.TransactionalTestRule;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * @generated
 */
@RunWith(Arquillian.class)
public class AdministradorJudicialPersistenceTest {

	@ClassRule
	@Rule
	public static final AggregateTestRule aggregateTestRule =
		new AggregateTestRule(
			new LiferayIntegrationTestRule(), PersistenceTestRule.INSTANCE,
			new TransactionalTestRule(
				Propagation.REQUIRED,
				"br.com.seatecnologia.gdf.negocia.service"));

	@Before
	public void setUp() {
		_persistence = AdministradorJudicialUtil.getPersistence();

		Class<?> clazz = _persistence.getClass();

		_dynamicQueryClassLoader = clazz.getClassLoader();
	}

	@After
	public void tearDown() throws Exception {
		Iterator<AdministradorJudicial> iterator =
			_administradorJudicials.iterator();

		while (iterator.hasNext()) {
			_persistence.remove(iterator.next());

			iterator.remove();
		}
	}

	@Test
	public void testCreate() throws Exception {
		long pk = RandomTestUtil.nextLong();

		AdministradorJudicial administradorJudicial = _persistence.create(pk);

		Assert.assertNotNull(administradorJudicial);

		Assert.assertEquals(administradorJudicial.getPrimaryKey(), pk);
	}

	@Test
	public void testRemove() throws Exception {
		AdministradorJudicial newAdministradorJudicial =
			addAdministradorJudicial();

		_persistence.remove(newAdministradorJudicial);

		AdministradorJudicial existingAdministradorJudicial =
			_persistence.fetchByPrimaryKey(
				newAdministradorJudicial.getPrimaryKey());

		Assert.assertNull(existingAdministradorJudicial);
	}

	@Test
	public void testUpdateNew() throws Exception {
		addAdministradorJudicial();
	}

	@Test
	public void testUpdateExisting() throws Exception {
		long pk = RandomTestUtil.nextLong();

		AdministradorJudicial newAdministradorJudicial = _persistence.create(
			pk);

		newAdministradorJudicial.setUuid(RandomTestUtil.randomString());

		newAdministradorJudicial.setQualificacaoId(RandomTestUtil.nextLong());

		newAdministradorJudicial.setRegimeFalencia(
			RandomTestUtil.randomBoolean());

		newAdministradorJudicial.setRecuperacao(RandomTestUtil.randomString());

		newAdministradorJudicial.setNumeroProcesso(
			RandomTestUtil.randomString());

		newAdministradorJudicial.setAnexoRecuperacao(RandomTestUtil.nextLong());

		_administradorJudicials.add(
			_persistence.update(newAdministradorJudicial));

		AdministradorJudicial existingAdministradorJudicial =
			_persistence.findByPrimaryKey(
				newAdministradorJudicial.getPrimaryKey());

		Assert.assertEquals(
			existingAdministradorJudicial.getUuid(),
			newAdministradorJudicial.getUuid());
		Assert.assertEquals(
			existingAdministradorJudicial.getAdministradorJudicialId(),
			newAdministradorJudicial.getAdministradorJudicialId());
		Assert.assertEquals(
			existingAdministradorJudicial.getQualificacaoId(),
			newAdministradorJudicial.getQualificacaoId());
		Assert.assertEquals(
			existingAdministradorJudicial.isRegimeFalencia(),
			newAdministradorJudicial.isRegimeFalencia());
		Assert.assertEquals(
			existingAdministradorJudicial.getRecuperacao(),
			newAdministradorJudicial.getRecuperacao());
		Assert.assertEquals(
			existingAdministradorJudicial.getNumeroProcesso(),
			newAdministradorJudicial.getNumeroProcesso());
		Assert.assertEquals(
			existingAdministradorJudicial.getAnexoRecuperacao(),
			newAdministradorJudicial.getAnexoRecuperacao());
	}

	@Test
	public void testCountByUuid() throws Exception {
		_persistence.countByUuid("");

		_persistence.countByUuid("null");

		_persistence.countByUuid((String)null);
	}

	@Test
	public void testFindByPrimaryKeyExisting() throws Exception {
		AdministradorJudicial newAdministradorJudicial =
			addAdministradorJudicial();

		AdministradorJudicial existingAdministradorJudicial =
			_persistence.findByPrimaryKey(
				newAdministradorJudicial.getPrimaryKey());

		Assert.assertEquals(
			existingAdministradorJudicial, newAdministradorJudicial);
	}

	@Test(expected = NoSuchAdministradorJudicialException.class)
	public void testFindByPrimaryKeyMissing() throws Exception {
		long pk = RandomTestUtil.nextLong();

		_persistence.findByPrimaryKey(pk);
	}

	@Test
	public void testFindAll() throws Exception {
		_persistence.findAll(
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, getOrderByComparator());
	}

	protected OrderByComparator<AdministradorJudicial> getOrderByComparator() {
		return OrderByComparatorFactoryUtil.create(
			"GDF_AdministradorJudicial", "uuid", true,
			"administradorJudicialId", true, "qualificacaoId", true,
			"regimeFalencia", true, "recuperacao", true, "numeroProcesso", true,
			"anexoRecuperacao", true);
	}

	@Test
	public void testFetchByPrimaryKeyExisting() throws Exception {
		AdministradorJudicial newAdministradorJudicial =
			addAdministradorJudicial();

		AdministradorJudicial existingAdministradorJudicial =
			_persistence.fetchByPrimaryKey(
				newAdministradorJudicial.getPrimaryKey());

		Assert.assertEquals(
			existingAdministradorJudicial, newAdministradorJudicial);
	}

	@Test
	public void testFetchByPrimaryKeyMissing() throws Exception {
		long pk = RandomTestUtil.nextLong();

		AdministradorJudicial missingAdministradorJudicial =
			_persistence.fetchByPrimaryKey(pk);

		Assert.assertNull(missingAdministradorJudicial);
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereAllPrimaryKeysExist()
		throws Exception {

		AdministradorJudicial newAdministradorJudicial1 =
			addAdministradorJudicial();
		AdministradorJudicial newAdministradorJudicial2 =
			addAdministradorJudicial();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newAdministradorJudicial1.getPrimaryKey());
		primaryKeys.add(newAdministradorJudicial2.getPrimaryKey());

		Map<Serializable, AdministradorJudicial> administradorJudicials =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(2, administradorJudicials.size());
		Assert.assertEquals(
			newAdministradorJudicial1,
			administradorJudicials.get(
				newAdministradorJudicial1.getPrimaryKey()));
		Assert.assertEquals(
			newAdministradorJudicial2,
			administradorJudicials.get(
				newAdministradorJudicial2.getPrimaryKey()));
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereNoPrimaryKeysExist()
		throws Exception {

		long pk1 = RandomTestUtil.nextLong();

		long pk2 = RandomTestUtil.nextLong();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(pk1);
		primaryKeys.add(pk2);

		Map<Serializable, AdministradorJudicial> administradorJudicials =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertTrue(administradorJudicials.isEmpty());
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereSomePrimaryKeysExist()
		throws Exception {

		AdministradorJudicial newAdministradorJudicial =
			addAdministradorJudicial();

		long pk = RandomTestUtil.nextLong();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newAdministradorJudicial.getPrimaryKey());
		primaryKeys.add(pk);

		Map<Serializable, AdministradorJudicial> administradorJudicials =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(1, administradorJudicials.size());
		Assert.assertEquals(
			newAdministradorJudicial,
			administradorJudicials.get(
				newAdministradorJudicial.getPrimaryKey()));
	}

	@Test
	public void testFetchByPrimaryKeysWithNoPrimaryKeys() throws Exception {
		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		Map<Serializable, AdministradorJudicial> administradorJudicials =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertTrue(administradorJudicials.isEmpty());
	}

	@Test
	public void testFetchByPrimaryKeysWithOnePrimaryKey() throws Exception {
		AdministradorJudicial newAdministradorJudicial =
			addAdministradorJudicial();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newAdministradorJudicial.getPrimaryKey());

		Map<Serializable, AdministradorJudicial> administradorJudicials =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(1, administradorJudicials.size());
		Assert.assertEquals(
			newAdministradorJudicial,
			administradorJudicials.get(
				newAdministradorJudicial.getPrimaryKey()));
	}

	@Test
	public void testActionableDynamicQuery() throws Exception {
		final IntegerWrapper count = new IntegerWrapper();

		ActionableDynamicQuery actionableDynamicQuery =
			AdministradorJudicialLocalServiceUtil.getActionableDynamicQuery();

		actionableDynamicQuery.setPerformActionMethod(
			new ActionableDynamicQuery.PerformActionMethod
				<AdministradorJudicial>() {

				@Override
				public void performAction(
					AdministradorJudicial administradorJudicial) {

					Assert.assertNotNull(administradorJudicial);

					count.increment();
				}

			});

		actionableDynamicQuery.performActions();

		Assert.assertEquals(count.getValue(), _persistence.countAll());
	}

	@Test
	public void testDynamicQueryByPrimaryKeyExisting() throws Exception {
		AdministradorJudicial newAdministradorJudicial =
			addAdministradorJudicial();

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			AdministradorJudicial.class, _dynamicQueryClassLoader);

		dynamicQuery.add(
			RestrictionsFactoryUtil.eq(
				"administradorJudicialId",
				newAdministradorJudicial.getAdministradorJudicialId()));

		List<AdministradorJudicial> result = _persistence.findWithDynamicQuery(
			dynamicQuery);

		Assert.assertEquals(1, result.size());

		AdministradorJudicial existingAdministradorJudicial = result.get(0);

		Assert.assertEquals(
			existingAdministradorJudicial, newAdministradorJudicial);
	}

	@Test
	public void testDynamicQueryByPrimaryKeyMissing() throws Exception {
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			AdministradorJudicial.class, _dynamicQueryClassLoader);

		dynamicQuery.add(
			RestrictionsFactoryUtil.eq(
				"administradorJudicialId", RandomTestUtil.nextLong()));

		List<AdministradorJudicial> result = _persistence.findWithDynamicQuery(
			dynamicQuery);

		Assert.assertEquals(0, result.size());
	}

	@Test
	public void testDynamicQueryByProjectionExisting() throws Exception {
		AdministradorJudicial newAdministradorJudicial =
			addAdministradorJudicial();

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			AdministradorJudicial.class, _dynamicQueryClassLoader);

		dynamicQuery.setProjection(
			ProjectionFactoryUtil.property("administradorJudicialId"));

		Object newAdministradorJudicialId =
			newAdministradorJudicial.getAdministradorJudicialId();

		dynamicQuery.add(
			RestrictionsFactoryUtil.in(
				"administradorJudicialId",
				new Object[] {newAdministradorJudicialId}));

		List<Object> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(1, result.size());

		Object existingAdministradorJudicialId = result.get(0);

		Assert.assertEquals(
			existingAdministradorJudicialId, newAdministradorJudicialId);
	}

	@Test
	public void testDynamicQueryByProjectionMissing() throws Exception {
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			AdministradorJudicial.class, _dynamicQueryClassLoader);

		dynamicQuery.setProjection(
			ProjectionFactoryUtil.property("administradorJudicialId"));

		dynamicQuery.add(
			RestrictionsFactoryUtil.in(
				"administradorJudicialId",
				new Object[] {RandomTestUtil.nextLong()}));

		List<Object> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(0, result.size());
	}

	protected AdministradorJudicial addAdministradorJudicial()
		throws Exception {

		long pk = RandomTestUtil.nextLong();

		AdministradorJudicial administradorJudicial = _persistence.create(pk);

		administradorJudicial.setUuid(RandomTestUtil.randomString());

		administradorJudicial.setQualificacaoId(RandomTestUtil.nextLong());

		administradorJudicial.setRegimeFalencia(RandomTestUtil.randomBoolean());

		administradorJudicial.setRecuperacao(RandomTestUtil.randomString());

		administradorJudicial.setNumeroProcesso(RandomTestUtil.randomString());

		administradorJudicial.setAnexoRecuperacao(RandomTestUtil.nextLong());

		_administradorJudicials.add(_persistence.update(administradorJudicial));

		return administradorJudicial;
	}

	private List<AdministradorJudicial> _administradorJudicials =
		new ArrayList<AdministradorJudicial>();
	private AdministradorJudicialPersistence _persistence;
	private ClassLoader _dynamicQueryClassLoader;

}
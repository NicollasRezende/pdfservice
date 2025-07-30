/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.persistence.test;

import br.com.seatecnologia.gdf.negocia.exception.NoSuchAcaoJudicialException;
import br.com.seatecnologia.gdf.negocia.model.AcaoJudicial;
import br.com.seatecnologia.gdf.negocia.service.AcaoJudicialLocalServiceUtil;
import br.com.seatecnologia.gdf.negocia.service.persistence.AcaoJudicialPersistence;
import br.com.seatecnologia.gdf.negocia.service.persistence.AcaoJudicialUtil;

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
public class AcaoJudicialPersistenceTest {

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
		_persistence = AcaoJudicialUtil.getPersistence();

		Class<?> clazz = _persistence.getClass();

		_dynamicQueryClassLoader = clazz.getClassLoader();
	}

	@After
	public void tearDown() throws Exception {
		Iterator<AcaoJudicial> iterator = _acaoJudicials.iterator();

		while (iterator.hasNext()) {
			_persistence.remove(iterator.next());

			iterator.remove();
		}
	}

	@Test
	public void testCreate() throws Exception {
		long pk = RandomTestUtil.nextLong();

		AcaoJudicial acaoJudicial = _persistence.create(pk);

		Assert.assertNotNull(acaoJudicial);

		Assert.assertEquals(acaoJudicial.getPrimaryKey(), pk);
	}

	@Test
	public void testRemove() throws Exception {
		AcaoJudicial newAcaoJudicial = addAcaoJudicial();

		_persistence.remove(newAcaoJudicial);

		AcaoJudicial existingAcaoJudicial = _persistence.fetchByPrimaryKey(
			newAcaoJudicial.getPrimaryKey());

		Assert.assertNull(existingAcaoJudicial);
	}

	@Test
	public void testUpdateNew() throws Exception {
		addAcaoJudicial();
	}

	@Test
	public void testUpdateExisting() throws Exception {
		long pk = RandomTestUtil.nextLong();

		AcaoJudicial newAcaoJudicial = _persistence.create(pk);

		newAcaoJudicial.setUuid(RandomTestUtil.randomString());

		newAcaoJudicial.setOrgaoTribunal(RandomTestUtil.randomString());

		newAcaoJudicial.setNumeroProcesso(RandomTestUtil.randomString());

		newAcaoJudicial.setUnidadeVara(RandomTestUtil.randomString());

		newAcaoJudicial.setParteAutora(RandomTestUtil.randomString());

		newAcaoJudicial.setParteRe(RandomTestUtil.randomString());

		newAcaoJudicial.setObservacoes(RandomTestUtil.randomString());

		newAcaoJudicial.setPropostaId(RandomTestUtil.nextLong());

		_acaoJudicials.add(_persistence.update(newAcaoJudicial));

		AcaoJudicial existingAcaoJudicial = _persistence.findByPrimaryKey(
			newAcaoJudicial.getPrimaryKey());

		Assert.assertEquals(
			existingAcaoJudicial.getUuid(), newAcaoJudicial.getUuid());
		Assert.assertEquals(
			existingAcaoJudicial.getAcaoId(), newAcaoJudicial.getAcaoId());
		Assert.assertEquals(
			existingAcaoJudicial.getOrgaoTribunal(),
			newAcaoJudicial.getOrgaoTribunal());
		Assert.assertEquals(
			existingAcaoJudicial.getNumeroProcesso(),
			newAcaoJudicial.getNumeroProcesso());
		Assert.assertEquals(
			existingAcaoJudicial.getUnidadeVara(),
			newAcaoJudicial.getUnidadeVara());
		Assert.assertEquals(
			existingAcaoJudicial.getParteAutora(),
			newAcaoJudicial.getParteAutora());
		Assert.assertEquals(
			existingAcaoJudicial.getParteRe(), newAcaoJudicial.getParteRe());
		Assert.assertEquals(
			existingAcaoJudicial.getObservacoes(),
			newAcaoJudicial.getObservacoes());
		Assert.assertEquals(
			existingAcaoJudicial.getPropostaId(),
			newAcaoJudicial.getPropostaId());
	}

	@Test
	public void testCountByUuid() throws Exception {
		_persistence.countByUuid("");

		_persistence.countByUuid("null");

		_persistence.countByUuid((String)null);
	}

	@Test
	public void testCountByPropostaId() throws Exception {
		_persistence.countByPropostaId(RandomTestUtil.nextLong());

		_persistence.countByPropostaId(0L);
	}

	@Test
	public void testFindByPrimaryKeyExisting() throws Exception {
		AcaoJudicial newAcaoJudicial = addAcaoJudicial();

		AcaoJudicial existingAcaoJudicial = _persistence.findByPrimaryKey(
			newAcaoJudicial.getPrimaryKey());

		Assert.assertEquals(existingAcaoJudicial, newAcaoJudicial);
	}

	@Test(expected = NoSuchAcaoJudicialException.class)
	public void testFindByPrimaryKeyMissing() throws Exception {
		long pk = RandomTestUtil.nextLong();

		_persistence.findByPrimaryKey(pk);
	}

	@Test
	public void testFindAll() throws Exception {
		_persistence.findAll(
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, getOrderByComparator());
	}

	protected OrderByComparator<AcaoJudicial> getOrderByComparator() {
		return OrderByComparatorFactoryUtil.create(
			"GDF_AcaoJudicial", "uuid", true, "acaoId", true, "orgaoTribunal",
			true, "numeroProcesso", true, "unidadeVara", true, "parteAutora",
			true, "parteRe", true, "observacoes", true, "propostaId", true);
	}

	@Test
	public void testFetchByPrimaryKeyExisting() throws Exception {
		AcaoJudicial newAcaoJudicial = addAcaoJudicial();

		AcaoJudicial existingAcaoJudicial = _persistence.fetchByPrimaryKey(
			newAcaoJudicial.getPrimaryKey());

		Assert.assertEquals(existingAcaoJudicial, newAcaoJudicial);
	}

	@Test
	public void testFetchByPrimaryKeyMissing() throws Exception {
		long pk = RandomTestUtil.nextLong();

		AcaoJudicial missingAcaoJudicial = _persistence.fetchByPrimaryKey(pk);

		Assert.assertNull(missingAcaoJudicial);
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereAllPrimaryKeysExist()
		throws Exception {

		AcaoJudicial newAcaoJudicial1 = addAcaoJudicial();
		AcaoJudicial newAcaoJudicial2 = addAcaoJudicial();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newAcaoJudicial1.getPrimaryKey());
		primaryKeys.add(newAcaoJudicial2.getPrimaryKey());

		Map<Serializable, AcaoJudicial> acaoJudicials =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(2, acaoJudicials.size());
		Assert.assertEquals(
			newAcaoJudicial1,
			acaoJudicials.get(newAcaoJudicial1.getPrimaryKey()));
		Assert.assertEquals(
			newAcaoJudicial2,
			acaoJudicials.get(newAcaoJudicial2.getPrimaryKey()));
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereNoPrimaryKeysExist()
		throws Exception {

		long pk1 = RandomTestUtil.nextLong();

		long pk2 = RandomTestUtil.nextLong();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(pk1);
		primaryKeys.add(pk2);

		Map<Serializable, AcaoJudicial> acaoJudicials =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertTrue(acaoJudicials.isEmpty());
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereSomePrimaryKeysExist()
		throws Exception {

		AcaoJudicial newAcaoJudicial = addAcaoJudicial();

		long pk = RandomTestUtil.nextLong();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newAcaoJudicial.getPrimaryKey());
		primaryKeys.add(pk);

		Map<Serializable, AcaoJudicial> acaoJudicials =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(1, acaoJudicials.size());
		Assert.assertEquals(
			newAcaoJudicial,
			acaoJudicials.get(newAcaoJudicial.getPrimaryKey()));
	}

	@Test
	public void testFetchByPrimaryKeysWithNoPrimaryKeys() throws Exception {
		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		Map<Serializable, AcaoJudicial> acaoJudicials =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertTrue(acaoJudicials.isEmpty());
	}

	@Test
	public void testFetchByPrimaryKeysWithOnePrimaryKey() throws Exception {
		AcaoJudicial newAcaoJudicial = addAcaoJudicial();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newAcaoJudicial.getPrimaryKey());

		Map<Serializable, AcaoJudicial> acaoJudicials =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(1, acaoJudicials.size());
		Assert.assertEquals(
			newAcaoJudicial,
			acaoJudicials.get(newAcaoJudicial.getPrimaryKey()));
	}

	@Test
	public void testActionableDynamicQuery() throws Exception {
		final IntegerWrapper count = new IntegerWrapper();

		ActionableDynamicQuery actionableDynamicQuery =
			AcaoJudicialLocalServiceUtil.getActionableDynamicQuery();

		actionableDynamicQuery.setPerformActionMethod(
			new ActionableDynamicQuery.PerformActionMethod<AcaoJudicial>() {

				@Override
				public void performAction(AcaoJudicial acaoJudicial) {
					Assert.assertNotNull(acaoJudicial);

					count.increment();
				}

			});

		actionableDynamicQuery.performActions();

		Assert.assertEquals(count.getValue(), _persistence.countAll());
	}

	@Test
	public void testDynamicQueryByPrimaryKeyExisting() throws Exception {
		AcaoJudicial newAcaoJudicial = addAcaoJudicial();

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			AcaoJudicial.class, _dynamicQueryClassLoader);

		dynamicQuery.add(
			RestrictionsFactoryUtil.eq("acaoId", newAcaoJudicial.getAcaoId()));

		List<AcaoJudicial> result = _persistence.findWithDynamicQuery(
			dynamicQuery);

		Assert.assertEquals(1, result.size());

		AcaoJudicial existingAcaoJudicial = result.get(0);

		Assert.assertEquals(existingAcaoJudicial, newAcaoJudicial);
	}

	@Test
	public void testDynamicQueryByPrimaryKeyMissing() throws Exception {
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			AcaoJudicial.class, _dynamicQueryClassLoader);

		dynamicQuery.add(
			RestrictionsFactoryUtil.eq("acaoId", RandomTestUtil.nextLong()));

		List<AcaoJudicial> result = _persistence.findWithDynamicQuery(
			dynamicQuery);

		Assert.assertEquals(0, result.size());
	}

	@Test
	public void testDynamicQueryByProjectionExisting() throws Exception {
		AcaoJudicial newAcaoJudicial = addAcaoJudicial();

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			AcaoJudicial.class, _dynamicQueryClassLoader);

		dynamicQuery.setProjection(ProjectionFactoryUtil.property("acaoId"));

		Object newAcaoId = newAcaoJudicial.getAcaoId();

		dynamicQuery.add(
			RestrictionsFactoryUtil.in("acaoId", new Object[] {newAcaoId}));

		List<Object> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(1, result.size());

		Object existingAcaoId = result.get(0);

		Assert.assertEquals(existingAcaoId, newAcaoId);
	}

	@Test
	public void testDynamicQueryByProjectionMissing() throws Exception {
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			AcaoJudicial.class, _dynamicQueryClassLoader);

		dynamicQuery.setProjection(ProjectionFactoryUtil.property("acaoId"));

		dynamicQuery.add(
			RestrictionsFactoryUtil.in(
				"acaoId", new Object[] {RandomTestUtil.nextLong()}));

		List<Object> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(0, result.size());
	}

	protected AcaoJudicial addAcaoJudicial() throws Exception {
		long pk = RandomTestUtil.nextLong();

		AcaoJudicial acaoJudicial = _persistence.create(pk);

		acaoJudicial.setUuid(RandomTestUtil.randomString());

		acaoJudicial.setOrgaoTribunal(RandomTestUtil.randomString());

		acaoJudicial.setNumeroProcesso(RandomTestUtil.randomString());

		acaoJudicial.setUnidadeVara(RandomTestUtil.randomString());

		acaoJudicial.setParteAutora(RandomTestUtil.randomString());

		acaoJudicial.setParteRe(RandomTestUtil.randomString());

		acaoJudicial.setObservacoes(RandomTestUtil.randomString());

		acaoJudicial.setPropostaId(RandomTestUtil.nextLong());

		_acaoJudicials.add(_persistence.update(acaoJudicial));

		return acaoJudicial;
	}

	private List<AcaoJudicial> _acaoJudicials = new ArrayList<AcaoJudicial>();
	private AcaoJudicialPersistence _persistence;
	private ClassLoader _dynamicQueryClassLoader;

}
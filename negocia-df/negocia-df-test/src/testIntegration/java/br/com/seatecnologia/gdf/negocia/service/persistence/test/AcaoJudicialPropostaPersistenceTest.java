/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.persistence.test;

import br.com.seatecnologia.gdf.negocia.exception.NoSuchAcaoJudicialPropostaException;
import br.com.seatecnologia.gdf.negocia.model.AcaoJudicialProposta;
import br.com.seatecnologia.gdf.negocia.service.AcaoJudicialPropostaLocalServiceUtil;
import br.com.seatecnologia.gdf.negocia.service.persistence.AcaoJudicialPropostaPersistence;
import br.com.seatecnologia.gdf.negocia.service.persistence.AcaoJudicialPropostaUtil;

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
public class AcaoJudicialPropostaPersistenceTest {

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
		_persistence = AcaoJudicialPropostaUtil.getPersistence();

		Class<?> clazz = _persistence.getClass();

		_dynamicQueryClassLoader = clazz.getClassLoader();
	}

	@After
	public void tearDown() throws Exception {
		Iterator<AcaoJudicialProposta> iterator =
			_acaoJudicialPropostas.iterator();

		while (iterator.hasNext()) {
			_persistence.remove(iterator.next());

			iterator.remove();
		}
	}

	@Test
	public void testCreate() throws Exception {
		long pk = RandomTestUtil.nextLong();

		AcaoJudicialProposta acaoJudicialProposta = _persistence.create(pk);

		Assert.assertNotNull(acaoJudicialProposta);

		Assert.assertEquals(acaoJudicialProposta.getPrimaryKey(), pk);
	}

	@Test
	public void testRemove() throws Exception {
		AcaoJudicialProposta newAcaoJudicialProposta =
			addAcaoJudicialProposta();

		_persistence.remove(newAcaoJudicialProposta);

		AcaoJudicialProposta existingAcaoJudicialProposta =
			_persistence.fetchByPrimaryKey(
				newAcaoJudicialProposta.getPrimaryKey());

		Assert.assertNull(existingAcaoJudicialProposta);
	}

	@Test
	public void testUpdateNew() throws Exception {
		addAcaoJudicialProposta();
	}

	@Test
	public void testUpdateExisting() throws Exception {
		long pk = RandomTestUtil.nextLong();

		AcaoJudicialProposta newAcaoJudicialProposta = _persistence.create(pk);

		newAcaoJudicialProposta.setUuid(RandomTestUtil.randomString());

		newAcaoJudicialProposta.setPropostaId(RandomTestUtil.nextLong());

		newAcaoJudicialProposta.setAcaoId(RandomTestUtil.nextLong());

		_acaoJudicialPropostas.add(
			_persistence.update(newAcaoJudicialProposta));

		AcaoJudicialProposta existingAcaoJudicialProposta =
			_persistence.findByPrimaryKey(
				newAcaoJudicialProposta.getPrimaryKey());

		Assert.assertEquals(
			existingAcaoJudicialProposta.getUuid(),
			newAcaoJudicialProposta.getUuid());
		Assert.assertEquals(
			existingAcaoJudicialProposta.getAcaoPropostaId(),
			newAcaoJudicialProposta.getAcaoPropostaId());
		Assert.assertEquals(
			existingAcaoJudicialProposta.getPropostaId(),
			newAcaoJudicialProposta.getPropostaId());
		Assert.assertEquals(
			existingAcaoJudicialProposta.getAcaoId(),
			newAcaoJudicialProposta.getAcaoId());
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
		AcaoJudicialProposta newAcaoJudicialProposta =
			addAcaoJudicialProposta();

		AcaoJudicialProposta existingAcaoJudicialProposta =
			_persistence.findByPrimaryKey(
				newAcaoJudicialProposta.getPrimaryKey());

		Assert.assertEquals(
			existingAcaoJudicialProposta, newAcaoJudicialProposta);
	}

	@Test(expected = NoSuchAcaoJudicialPropostaException.class)
	public void testFindByPrimaryKeyMissing() throws Exception {
		long pk = RandomTestUtil.nextLong();

		_persistence.findByPrimaryKey(pk);
	}

	@Test
	public void testFindAll() throws Exception {
		_persistence.findAll(
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, getOrderByComparator());
	}

	protected OrderByComparator<AcaoJudicialProposta> getOrderByComparator() {
		return OrderByComparatorFactoryUtil.create(
			"GDF_AcaoJudicialProposta", "uuid", true, "acaoPropostaId", true,
			"propostaId", true, "acaoId", true);
	}

	@Test
	public void testFetchByPrimaryKeyExisting() throws Exception {
		AcaoJudicialProposta newAcaoJudicialProposta =
			addAcaoJudicialProposta();

		AcaoJudicialProposta existingAcaoJudicialProposta =
			_persistence.fetchByPrimaryKey(
				newAcaoJudicialProposta.getPrimaryKey());

		Assert.assertEquals(
			existingAcaoJudicialProposta, newAcaoJudicialProposta);
	}

	@Test
	public void testFetchByPrimaryKeyMissing() throws Exception {
		long pk = RandomTestUtil.nextLong();

		AcaoJudicialProposta missingAcaoJudicialProposta =
			_persistence.fetchByPrimaryKey(pk);

		Assert.assertNull(missingAcaoJudicialProposta);
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereAllPrimaryKeysExist()
		throws Exception {

		AcaoJudicialProposta newAcaoJudicialProposta1 =
			addAcaoJudicialProposta();
		AcaoJudicialProposta newAcaoJudicialProposta2 =
			addAcaoJudicialProposta();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newAcaoJudicialProposta1.getPrimaryKey());
		primaryKeys.add(newAcaoJudicialProposta2.getPrimaryKey());

		Map<Serializable, AcaoJudicialProposta> acaoJudicialPropostas =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(2, acaoJudicialPropostas.size());
		Assert.assertEquals(
			newAcaoJudicialProposta1,
			acaoJudicialPropostas.get(
				newAcaoJudicialProposta1.getPrimaryKey()));
		Assert.assertEquals(
			newAcaoJudicialProposta2,
			acaoJudicialPropostas.get(
				newAcaoJudicialProposta2.getPrimaryKey()));
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereNoPrimaryKeysExist()
		throws Exception {

		long pk1 = RandomTestUtil.nextLong();

		long pk2 = RandomTestUtil.nextLong();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(pk1);
		primaryKeys.add(pk2);

		Map<Serializable, AcaoJudicialProposta> acaoJudicialPropostas =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertTrue(acaoJudicialPropostas.isEmpty());
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereSomePrimaryKeysExist()
		throws Exception {

		AcaoJudicialProposta newAcaoJudicialProposta =
			addAcaoJudicialProposta();

		long pk = RandomTestUtil.nextLong();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newAcaoJudicialProposta.getPrimaryKey());
		primaryKeys.add(pk);

		Map<Serializable, AcaoJudicialProposta> acaoJudicialPropostas =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(1, acaoJudicialPropostas.size());
		Assert.assertEquals(
			newAcaoJudicialProposta,
			acaoJudicialPropostas.get(newAcaoJudicialProposta.getPrimaryKey()));
	}

	@Test
	public void testFetchByPrimaryKeysWithNoPrimaryKeys() throws Exception {
		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		Map<Serializable, AcaoJudicialProposta> acaoJudicialPropostas =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertTrue(acaoJudicialPropostas.isEmpty());
	}

	@Test
	public void testFetchByPrimaryKeysWithOnePrimaryKey() throws Exception {
		AcaoJudicialProposta newAcaoJudicialProposta =
			addAcaoJudicialProposta();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newAcaoJudicialProposta.getPrimaryKey());

		Map<Serializable, AcaoJudicialProposta> acaoJudicialPropostas =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(1, acaoJudicialPropostas.size());
		Assert.assertEquals(
			newAcaoJudicialProposta,
			acaoJudicialPropostas.get(newAcaoJudicialProposta.getPrimaryKey()));
	}

	@Test
	public void testActionableDynamicQuery() throws Exception {
		final IntegerWrapper count = new IntegerWrapper();

		ActionableDynamicQuery actionableDynamicQuery =
			AcaoJudicialPropostaLocalServiceUtil.getActionableDynamicQuery();

		actionableDynamicQuery.setPerformActionMethod(
			new ActionableDynamicQuery.PerformActionMethod
				<AcaoJudicialProposta>() {

				@Override
				public void performAction(
					AcaoJudicialProposta acaoJudicialProposta) {

					Assert.assertNotNull(acaoJudicialProposta);

					count.increment();
				}

			});

		actionableDynamicQuery.performActions();

		Assert.assertEquals(count.getValue(), _persistence.countAll());
	}

	@Test
	public void testDynamicQueryByPrimaryKeyExisting() throws Exception {
		AcaoJudicialProposta newAcaoJudicialProposta =
			addAcaoJudicialProposta();

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			AcaoJudicialProposta.class, _dynamicQueryClassLoader);

		dynamicQuery.add(
			RestrictionsFactoryUtil.eq(
				"acaoPropostaId", newAcaoJudicialProposta.getAcaoPropostaId()));

		List<AcaoJudicialProposta> result = _persistence.findWithDynamicQuery(
			dynamicQuery);

		Assert.assertEquals(1, result.size());

		AcaoJudicialProposta existingAcaoJudicialProposta = result.get(0);

		Assert.assertEquals(
			existingAcaoJudicialProposta, newAcaoJudicialProposta);
	}

	@Test
	public void testDynamicQueryByPrimaryKeyMissing() throws Exception {
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			AcaoJudicialProposta.class, _dynamicQueryClassLoader);

		dynamicQuery.add(
			RestrictionsFactoryUtil.eq(
				"acaoPropostaId", RandomTestUtil.nextLong()));

		List<AcaoJudicialProposta> result = _persistence.findWithDynamicQuery(
			dynamicQuery);

		Assert.assertEquals(0, result.size());
	}

	@Test
	public void testDynamicQueryByProjectionExisting() throws Exception {
		AcaoJudicialProposta newAcaoJudicialProposta =
			addAcaoJudicialProposta();

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			AcaoJudicialProposta.class, _dynamicQueryClassLoader);

		dynamicQuery.setProjection(
			ProjectionFactoryUtil.property("acaoPropostaId"));

		Object newAcaoPropostaId = newAcaoJudicialProposta.getAcaoPropostaId();

		dynamicQuery.add(
			RestrictionsFactoryUtil.in(
				"acaoPropostaId", new Object[] {newAcaoPropostaId}));

		List<Object> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(1, result.size());

		Object existingAcaoPropostaId = result.get(0);

		Assert.assertEquals(existingAcaoPropostaId, newAcaoPropostaId);
	}

	@Test
	public void testDynamicQueryByProjectionMissing() throws Exception {
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			AcaoJudicialProposta.class, _dynamicQueryClassLoader);

		dynamicQuery.setProjection(
			ProjectionFactoryUtil.property("acaoPropostaId"));

		dynamicQuery.add(
			RestrictionsFactoryUtil.in(
				"acaoPropostaId", new Object[] {RandomTestUtil.nextLong()}));

		List<Object> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(0, result.size());
	}

	protected AcaoJudicialProposta addAcaoJudicialProposta() throws Exception {
		long pk = RandomTestUtil.nextLong();

		AcaoJudicialProposta acaoJudicialProposta = _persistence.create(pk);

		acaoJudicialProposta.setUuid(RandomTestUtil.randomString());

		acaoJudicialProposta.setPropostaId(RandomTestUtil.nextLong());

		acaoJudicialProposta.setAcaoId(RandomTestUtil.nextLong());

		_acaoJudicialPropostas.add(_persistence.update(acaoJudicialProposta));

		return acaoJudicialProposta;
	}

	private List<AcaoJudicialProposta> _acaoJudicialPropostas =
		new ArrayList<AcaoJudicialProposta>();
	private AcaoJudicialPropostaPersistence _persistence;
	private ClassLoader _dynamicQueryClassLoader;

}
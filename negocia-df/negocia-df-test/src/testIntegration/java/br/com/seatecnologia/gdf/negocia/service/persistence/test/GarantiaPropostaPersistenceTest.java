/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.persistence.test;

import br.com.seatecnologia.gdf.negocia.exception.NoSuchGarantiaPropostaException;
import br.com.seatecnologia.gdf.negocia.model.GarantiaProposta;
import br.com.seatecnologia.gdf.negocia.service.GarantiaPropostaLocalServiceUtil;
import br.com.seatecnologia.gdf.negocia.service.persistence.GarantiaPropostaPersistence;
import br.com.seatecnologia.gdf.negocia.service.persistence.GarantiaPropostaUtil;

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
public class GarantiaPropostaPersistenceTest {

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
		_persistence = GarantiaPropostaUtil.getPersistence();

		Class<?> clazz = _persistence.getClass();

		_dynamicQueryClassLoader = clazz.getClassLoader();
	}

	@After
	public void tearDown() throws Exception {
		Iterator<GarantiaProposta> iterator = _garantiaPropostas.iterator();

		while (iterator.hasNext()) {
			_persistence.remove(iterator.next());

			iterator.remove();
		}
	}

	@Test
	public void testCreate() throws Exception {
		long pk = RandomTestUtil.nextLong();

		GarantiaProposta garantiaProposta = _persistence.create(pk);

		Assert.assertNotNull(garantiaProposta);

		Assert.assertEquals(garantiaProposta.getPrimaryKey(), pk);
	}

	@Test
	public void testRemove() throws Exception {
		GarantiaProposta newGarantiaProposta = addGarantiaProposta();

		_persistence.remove(newGarantiaProposta);

		GarantiaProposta existingGarantiaProposta =
			_persistence.fetchByPrimaryKey(newGarantiaProposta.getPrimaryKey());

		Assert.assertNull(existingGarantiaProposta);
	}

	@Test
	public void testUpdateNew() throws Exception {
		addGarantiaProposta();
	}

	@Test
	public void testUpdateExisting() throws Exception {
		long pk = RandomTestUtil.nextLong();

		GarantiaProposta newGarantiaProposta = _persistence.create(pk);

		newGarantiaProposta.setUuid(RandomTestUtil.randomString());

		newGarantiaProposta.setPropostaId(RandomTestUtil.nextLong());

		newGarantiaProposta.setGarantiaId(RandomTestUtil.nextLong());

		_garantiaPropostas.add(_persistence.update(newGarantiaProposta));

		GarantiaProposta existingGarantiaProposta =
			_persistence.findByPrimaryKey(newGarantiaProposta.getPrimaryKey());

		Assert.assertEquals(
			existingGarantiaProposta.getUuid(), newGarantiaProposta.getUuid());
		Assert.assertEquals(
			existingGarantiaProposta.getGarantiaPropostaId(),
			newGarantiaProposta.getGarantiaPropostaId());
		Assert.assertEquals(
			existingGarantiaProposta.getPropostaId(),
			newGarantiaProposta.getPropostaId());
		Assert.assertEquals(
			existingGarantiaProposta.getGarantiaId(),
			newGarantiaProposta.getGarantiaId());
	}

	@Test
	public void testCountByUuid() throws Exception {
		_persistence.countByUuid("");

		_persistence.countByUuid("null");

		_persistence.countByUuid((String)null);
	}

	@Test
	public void testFindByPrimaryKeyExisting() throws Exception {
		GarantiaProposta newGarantiaProposta = addGarantiaProposta();

		GarantiaProposta existingGarantiaProposta =
			_persistence.findByPrimaryKey(newGarantiaProposta.getPrimaryKey());

		Assert.assertEquals(existingGarantiaProposta, newGarantiaProposta);
	}

	@Test(expected = NoSuchGarantiaPropostaException.class)
	public void testFindByPrimaryKeyMissing() throws Exception {
		long pk = RandomTestUtil.nextLong();

		_persistence.findByPrimaryKey(pk);
	}

	@Test
	public void testFindAll() throws Exception {
		_persistence.findAll(
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, getOrderByComparator());
	}

	protected OrderByComparator<GarantiaProposta> getOrderByComparator() {
		return OrderByComparatorFactoryUtil.create(
			"GDF_GarantiaProposta", "uuid", true, "garantiaPropostaId", true,
			"propostaId", true, "garantiaId", true);
	}

	@Test
	public void testFetchByPrimaryKeyExisting() throws Exception {
		GarantiaProposta newGarantiaProposta = addGarantiaProposta();

		GarantiaProposta existingGarantiaProposta =
			_persistence.fetchByPrimaryKey(newGarantiaProposta.getPrimaryKey());

		Assert.assertEquals(existingGarantiaProposta, newGarantiaProposta);
	}

	@Test
	public void testFetchByPrimaryKeyMissing() throws Exception {
		long pk = RandomTestUtil.nextLong();

		GarantiaProposta missingGarantiaProposta =
			_persistence.fetchByPrimaryKey(pk);

		Assert.assertNull(missingGarantiaProposta);
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereAllPrimaryKeysExist()
		throws Exception {

		GarantiaProposta newGarantiaProposta1 = addGarantiaProposta();
		GarantiaProposta newGarantiaProposta2 = addGarantiaProposta();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newGarantiaProposta1.getPrimaryKey());
		primaryKeys.add(newGarantiaProposta2.getPrimaryKey());

		Map<Serializable, GarantiaProposta> garantiaPropostas =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(2, garantiaPropostas.size());
		Assert.assertEquals(
			newGarantiaProposta1,
			garantiaPropostas.get(newGarantiaProposta1.getPrimaryKey()));
		Assert.assertEquals(
			newGarantiaProposta2,
			garantiaPropostas.get(newGarantiaProposta2.getPrimaryKey()));
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereNoPrimaryKeysExist()
		throws Exception {

		long pk1 = RandomTestUtil.nextLong();

		long pk2 = RandomTestUtil.nextLong();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(pk1);
		primaryKeys.add(pk2);

		Map<Serializable, GarantiaProposta> garantiaPropostas =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertTrue(garantiaPropostas.isEmpty());
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereSomePrimaryKeysExist()
		throws Exception {

		GarantiaProposta newGarantiaProposta = addGarantiaProposta();

		long pk = RandomTestUtil.nextLong();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newGarantiaProposta.getPrimaryKey());
		primaryKeys.add(pk);

		Map<Serializable, GarantiaProposta> garantiaPropostas =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(1, garantiaPropostas.size());
		Assert.assertEquals(
			newGarantiaProposta,
			garantiaPropostas.get(newGarantiaProposta.getPrimaryKey()));
	}

	@Test
	public void testFetchByPrimaryKeysWithNoPrimaryKeys() throws Exception {
		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		Map<Serializable, GarantiaProposta> garantiaPropostas =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertTrue(garantiaPropostas.isEmpty());
	}

	@Test
	public void testFetchByPrimaryKeysWithOnePrimaryKey() throws Exception {
		GarantiaProposta newGarantiaProposta = addGarantiaProposta();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newGarantiaProposta.getPrimaryKey());

		Map<Serializable, GarantiaProposta> garantiaPropostas =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(1, garantiaPropostas.size());
		Assert.assertEquals(
			newGarantiaProposta,
			garantiaPropostas.get(newGarantiaProposta.getPrimaryKey()));
	}

	@Test
	public void testActionableDynamicQuery() throws Exception {
		final IntegerWrapper count = new IntegerWrapper();

		ActionableDynamicQuery actionableDynamicQuery =
			GarantiaPropostaLocalServiceUtil.getActionableDynamicQuery();

		actionableDynamicQuery.setPerformActionMethod(
			new ActionableDynamicQuery.PerformActionMethod<GarantiaProposta>() {

				@Override
				public void performAction(GarantiaProposta garantiaProposta) {
					Assert.assertNotNull(garantiaProposta);

					count.increment();
				}

			});

		actionableDynamicQuery.performActions();

		Assert.assertEquals(count.getValue(), _persistence.countAll());
	}

	@Test
	public void testDynamicQueryByPrimaryKeyExisting() throws Exception {
		GarantiaProposta newGarantiaProposta = addGarantiaProposta();

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			GarantiaProposta.class, _dynamicQueryClassLoader);

		dynamicQuery.add(
			RestrictionsFactoryUtil.eq(
				"garantiaPropostaId",
				newGarantiaProposta.getGarantiaPropostaId()));

		List<GarantiaProposta> result = _persistence.findWithDynamicQuery(
			dynamicQuery);

		Assert.assertEquals(1, result.size());

		GarantiaProposta existingGarantiaProposta = result.get(0);

		Assert.assertEquals(existingGarantiaProposta, newGarantiaProposta);
	}

	@Test
	public void testDynamicQueryByPrimaryKeyMissing() throws Exception {
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			GarantiaProposta.class, _dynamicQueryClassLoader);

		dynamicQuery.add(
			RestrictionsFactoryUtil.eq(
				"garantiaPropostaId", RandomTestUtil.nextLong()));

		List<GarantiaProposta> result = _persistence.findWithDynamicQuery(
			dynamicQuery);

		Assert.assertEquals(0, result.size());
	}

	@Test
	public void testDynamicQueryByProjectionExisting() throws Exception {
		GarantiaProposta newGarantiaProposta = addGarantiaProposta();

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			GarantiaProposta.class, _dynamicQueryClassLoader);

		dynamicQuery.setProjection(
			ProjectionFactoryUtil.property("garantiaPropostaId"));

		Object newGarantiaPropostaId =
			newGarantiaProposta.getGarantiaPropostaId();

		dynamicQuery.add(
			RestrictionsFactoryUtil.in(
				"garantiaPropostaId", new Object[] {newGarantiaPropostaId}));

		List<Object> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(1, result.size());

		Object existingGarantiaPropostaId = result.get(0);

		Assert.assertEquals(existingGarantiaPropostaId, newGarantiaPropostaId);
	}

	@Test
	public void testDynamicQueryByProjectionMissing() throws Exception {
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			GarantiaProposta.class, _dynamicQueryClassLoader);

		dynamicQuery.setProjection(
			ProjectionFactoryUtil.property("garantiaPropostaId"));

		dynamicQuery.add(
			RestrictionsFactoryUtil.in(
				"garantiaPropostaId",
				new Object[] {RandomTestUtil.nextLong()}));

		List<Object> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(0, result.size());
	}

	protected GarantiaProposta addGarantiaProposta() throws Exception {
		long pk = RandomTestUtil.nextLong();

		GarantiaProposta garantiaProposta = _persistence.create(pk);

		garantiaProposta.setUuid(RandomTestUtil.randomString());

		garantiaProposta.setPropostaId(RandomTestUtil.nextLong());

		garantiaProposta.setGarantiaId(RandomTestUtil.nextLong());

		_garantiaPropostas.add(_persistence.update(garantiaProposta));

		return garantiaProposta;
	}

	private List<GarantiaProposta> _garantiaPropostas =
		new ArrayList<GarantiaProposta>();
	private GarantiaPropostaPersistence _persistence;
	private ClassLoader _dynamicQueryClassLoader;

}
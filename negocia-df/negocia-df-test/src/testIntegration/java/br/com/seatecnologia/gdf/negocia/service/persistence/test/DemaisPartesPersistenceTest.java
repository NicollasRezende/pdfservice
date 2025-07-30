/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.persistence.test;

import br.com.seatecnologia.gdf.negocia.exception.NoSuchDemaisPartesException;
import br.com.seatecnologia.gdf.negocia.model.DemaisPartes;
import br.com.seatecnologia.gdf.negocia.service.DemaisPartesLocalServiceUtil;
import br.com.seatecnologia.gdf.negocia.service.persistence.DemaisPartesPersistence;
import br.com.seatecnologia.gdf.negocia.service.persistence.DemaisPartesUtil;

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
public class DemaisPartesPersistenceTest {

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
		_persistence = DemaisPartesUtil.getPersistence();

		Class<?> clazz = _persistence.getClass();

		_dynamicQueryClassLoader = clazz.getClassLoader();
	}

	@After
	public void tearDown() throws Exception {
		Iterator<DemaisPartes> iterator = _demaisParteses.iterator();

		while (iterator.hasNext()) {
			_persistence.remove(iterator.next());

			iterator.remove();
		}
	}

	@Test
	public void testCreate() throws Exception {
		long pk = RandomTestUtil.nextLong();

		DemaisPartes demaisPartes = _persistence.create(pk);

		Assert.assertNotNull(demaisPartes);

		Assert.assertEquals(demaisPartes.getPrimaryKey(), pk);
	}

	@Test
	public void testRemove() throws Exception {
		DemaisPartes newDemaisPartes = addDemaisPartes();

		_persistence.remove(newDemaisPartes);

		DemaisPartes existingDemaisPartes = _persistence.fetchByPrimaryKey(
			newDemaisPartes.getPrimaryKey());

		Assert.assertNull(existingDemaisPartes);
	}

	@Test
	public void testUpdateNew() throws Exception {
		addDemaisPartes();
	}

	@Test
	public void testUpdateExisting() throws Exception {
		long pk = RandomTestUtil.nextLong();

		DemaisPartes newDemaisPartes = _persistence.create(pk);

		newDemaisPartes.setUuid(RandomTestUtil.randomString());

		newDemaisPartes.setQualificacaoId(RandomTestUtil.nextLong());

		newDemaisPartes.setPropostaId(RandomTestUtil.nextLong());

		newDemaisPartes.setTipoParte(RandomTestUtil.randomString());

		_demaisParteses.add(_persistence.update(newDemaisPartes));

		DemaisPartes existingDemaisPartes = _persistence.findByPrimaryKey(
			newDemaisPartes.getPrimaryKey());

		Assert.assertEquals(
			existingDemaisPartes.getUuid(), newDemaisPartes.getUuid());
		Assert.assertEquals(
			existingDemaisPartes.getDemaisPartesId(),
			newDemaisPartes.getDemaisPartesId());
		Assert.assertEquals(
			existingDemaisPartes.getQualificacaoId(),
			newDemaisPartes.getQualificacaoId());
		Assert.assertEquals(
			existingDemaisPartes.getPropostaId(),
			newDemaisPartes.getPropostaId());
		Assert.assertEquals(
			existingDemaisPartes.getTipoParte(),
			newDemaisPartes.getTipoParte());
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
		DemaisPartes newDemaisPartes = addDemaisPartes();

		DemaisPartes existingDemaisPartes = _persistence.findByPrimaryKey(
			newDemaisPartes.getPrimaryKey());

		Assert.assertEquals(existingDemaisPartes, newDemaisPartes);
	}

	@Test(expected = NoSuchDemaisPartesException.class)
	public void testFindByPrimaryKeyMissing() throws Exception {
		long pk = RandomTestUtil.nextLong();

		_persistence.findByPrimaryKey(pk);
	}

	@Test
	public void testFindAll() throws Exception {
		_persistence.findAll(
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, getOrderByComparator());
	}

	protected OrderByComparator<DemaisPartes> getOrderByComparator() {
		return OrderByComparatorFactoryUtil.create(
			"GDF_DemaisPartes", "uuid", true, "demaisPartesId", true,
			"qualificacaoId", true, "propostaId", true, "tipoParte", true);
	}

	@Test
	public void testFetchByPrimaryKeyExisting() throws Exception {
		DemaisPartes newDemaisPartes = addDemaisPartes();

		DemaisPartes existingDemaisPartes = _persistence.fetchByPrimaryKey(
			newDemaisPartes.getPrimaryKey());

		Assert.assertEquals(existingDemaisPartes, newDemaisPartes);
	}

	@Test
	public void testFetchByPrimaryKeyMissing() throws Exception {
		long pk = RandomTestUtil.nextLong();

		DemaisPartes missingDemaisPartes = _persistence.fetchByPrimaryKey(pk);

		Assert.assertNull(missingDemaisPartes);
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereAllPrimaryKeysExist()
		throws Exception {

		DemaisPartes newDemaisPartes1 = addDemaisPartes();
		DemaisPartes newDemaisPartes2 = addDemaisPartes();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newDemaisPartes1.getPrimaryKey());
		primaryKeys.add(newDemaisPartes2.getPrimaryKey());

		Map<Serializable, DemaisPartes> demaisParteses =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(2, demaisParteses.size());
		Assert.assertEquals(
			newDemaisPartes1,
			demaisParteses.get(newDemaisPartes1.getPrimaryKey()));
		Assert.assertEquals(
			newDemaisPartes2,
			demaisParteses.get(newDemaisPartes2.getPrimaryKey()));
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereNoPrimaryKeysExist()
		throws Exception {

		long pk1 = RandomTestUtil.nextLong();

		long pk2 = RandomTestUtil.nextLong();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(pk1);
		primaryKeys.add(pk2);

		Map<Serializable, DemaisPartes> demaisParteses =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertTrue(demaisParteses.isEmpty());
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereSomePrimaryKeysExist()
		throws Exception {

		DemaisPartes newDemaisPartes = addDemaisPartes();

		long pk = RandomTestUtil.nextLong();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newDemaisPartes.getPrimaryKey());
		primaryKeys.add(pk);

		Map<Serializable, DemaisPartes> demaisParteses =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(1, demaisParteses.size());
		Assert.assertEquals(
			newDemaisPartes,
			demaisParteses.get(newDemaisPartes.getPrimaryKey()));
	}

	@Test
	public void testFetchByPrimaryKeysWithNoPrimaryKeys() throws Exception {
		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		Map<Serializable, DemaisPartes> demaisParteses =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertTrue(demaisParteses.isEmpty());
	}

	@Test
	public void testFetchByPrimaryKeysWithOnePrimaryKey() throws Exception {
		DemaisPartes newDemaisPartes = addDemaisPartes();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newDemaisPartes.getPrimaryKey());

		Map<Serializable, DemaisPartes> demaisParteses =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(1, demaisParteses.size());
		Assert.assertEquals(
			newDemaisPartes,
			demaisParteses.get(newDemaisPartes.getPrimaryKey()));
	}

	@Test
	public void testActionableDynamicQuery() throws Exception {
		final IntegerWrapper count = new IntegerWrapper();

		ActionableDynamicQuery actionableDynamicQuery =
			DemaisPartesLocalServiceUtil.getActionableDynamicQuery();

		actionableDynamicQuery.setPerformActionMethod(
			new ActionableDynamicQuery.PerformActionMethod<DemaisPartes>() {

				@Override
				public void performAction(DemaisPartes demaisPartes) {
					Assert.assertNotNull(demaisPartes);

					count.increment();
				}

			});

		actionableDynamicQuery.performActions();

		Assert.assertEquals(count.getValue(), _persistence.countAll());
	}

	@Test
	public void testDynamicQueryByPrimaryKeyExisting() throws Exception {
		DemaisPartes newDemaisPartes = addDemaisPartes();

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			DemaisPartes.class, _dynamicQueryClassLoader);

		dynamicQuery.add(
			RestrictionsFactoryUtil.eq(
				"demaisPartesId", newDemaisPartes.getDemaisPartesId()));

		List<DemaisPartes> result = _persistence.findWithDynamicQuery(
			dynamicQuery);

		Assert.assertEquals(1, result.size());

		DemaisPartes existingDemaisPartes = result.get(0);

		Assert.assertEquals(existingDemaisPartes, newDemaisPartes);
	}

	@Test
	public void testDynamicQueryByPrimaryKeyMissing() throws Exception {
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			DemaisPartes.class, _dynamicQueryClassLoader);

		dynamicQuery.add(
			RestrictionsFactoryUtil.eq(
				"demaisPartesId", RandomTestUtil.nextLong()));

		List<DemaisPartes> result = _persistence.findWithDynamicQuery(
			dynamicQuery);

		Assert.assertEquals(0, result.size());
	}

	@Test
	public void testDynamicQueryByProjectionExisting() throws Exception {
		DemaisPartes newDemaisPartes = addDemaisPartes();

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			DemaisPartes.class, _dynamicQueryClassLoader);

		dynamicQuery.setProjection(
			ProjectionFactoryUtil.property("demaisPartesId"));

		Object newDemaisPartesId = newDemaisPartes.getDemaisPartesId();

		dynamicQuery.add(
			RestrictionsFactoryUtil.in(
				"demaisPartesId", new Object[] {newDemaisPartesId}));

		List<Object> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(1, result.size());

		Object existingDemaisPartesId = result.get(0);

		Assert.assertEquals(existingDemaisPartesId, newDemaisPartesId);
	}

	@Test
	public void testDynamicQueryByProjectionMissing() throws Exception {
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			DemaisPartes.class, _dynamicQueryClassLoader);

		dynamicQuery.setProjection(
			ProjectionFactoryUtil.property("demaisPartesId"));

		dynamicQuery.add(
			RestrictionsFactoryUtil.in(
				"demaisPartesId", new Object[] {RandomTestUtil.nextLong()}));

		List<Object> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(0, result.size());
	}

	protected DemaisPartes addDemaisPartes() throws Exception {
		long pk = RandomTestUtil.nextLong();

		DemaisPartes demaisPartes = _persistence.create(pk);

		demaisPartes.setUuid(RandomTestUtil.randomString());

		demaisPartes.setQualificacaoId(RandomTestUtil.nextLong());

		demaisPartes.setPropostaId(RandomTestUtil.nextLong());

		demaisPartes.setTipoParte(RandomTestUtil.randomString());

		_demaisParteses.add(_persistence.update(demaisPartes));

		return demaisPartes;
	}

	private List<DemaisPartes> _demaisParteses = new ArrayList<DemaisPartes>();
	private DemaisPartesPersistence _persistence;
	private ClassLoader _dynamicQueryClassLoader;

}
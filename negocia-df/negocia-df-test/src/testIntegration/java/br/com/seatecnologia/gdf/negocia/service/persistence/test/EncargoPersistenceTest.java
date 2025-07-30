/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.persistence.test;

import br.com.seatecnologia.gdf.negocia.exception.NoSuchEncargoException;
import br.com.seatecnologia.gdf.negocia.model.Encargo;
import br.com.seatecnologia.gdf.negocia.service.EncargoLocalServiceUtil;
import br.com.seatecnologia.gdf.negocia.service.persistence.EncargoPersistence;
import br.com.seatecnologia.gdf.negocia.service.persistence.EncargoUtil;

import com.liferay.arquillian.extension.junit.bridge.junit.Arquillian;
import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.ProjectionFactoryUtil;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.test.AssertUtils;
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
public class EncargoPersistenceTest {

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
		_persistence = EncargoUtil.getPersistence();

		Class<?> clazz = _persistence.getClass();

		_dynamicQueryClassLoader = clazz.getClassLoader();
	}

	@After
	public void tearDown() throws Exception {
		Iterator<Encargo> iterator = _encargos.iterator();

		while (iterator.hasNext()) {
			_persistence.remove(iterator.next());

			iterator.remove();
		}
	}

	@Test
	public void testCreate() throws Exception {
		long pk = RandomTestUtil.nextLong();

		Encargo encargo = _persistence.create(pk);

		Assert.assertNotNull(encargo);

		Assert.assertEquals(encargo.getPrimaryKey(), pk);
	}

	@Test
	public void testRemove() throws Exception {
		Encargo newEncargo = addEncargo();

		_persistence.remove(newEncargo);

		Encargo existingEncargo = _persistence.fetchByPrimaryKey(
			newEncargo.getPrimaryKey());

		Assert.assertNull(existingEncargo);
	}

	@Test
	public void testUpdateNew() throws Exception {
		addEncargo();
	}

	@Test
	public void testUpdateExisting() throws Exception {
		long pk = RandomTestUtil.nextLong();

		Encargo newEncargo = _persistence.create(pk);

		newEncargo.setUuid(RandomTestUtil.randomString());

		newEncargo.setPropostaId(RandomTestUtil.nextLong());

		newEncargo.setValorEncargos(RandomTestUtil.nextDouble());

		newEncargo.setDescricaoEncargos(RandomTestUtil.randomString());

		_encargos.add(_persistence.update(newEncargo));

		Encargo existingEncargo = _persistence.findByPrimaryKey(
			newEncargo.getPrimaryKey());

		Assert.assertEquals(existingEncargo.getUuid(), newEncargo.getUuid());
		Assert.assertEquals(
			existingEncargo.getEncargoId(), newEncargo.getEncargoId());
		Assert.assertEquals(
			existingEncargo.getPropostaId(), newEncargo.getPropostaId());
		AssertUtils.assertEquals(
			existingEncargo.getValorEncargos(), newEncargo.getValorEncargos());
		Assert.assertEquals(
			existingEncargo.getDescricaoEncargos(),
			newEncargo.getDescricaoEncargos());
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
		Encargo newEncargo = addEncargo();

		Encargo existingEncargo = _persistence.findByPrimaryKey(
			newEncargo.getPrimaryKey());

		Assert.assertEquals(existingEncargo, newEncargo);
	}

	@Test(expected = NoSuchEncargoException.class)
	public void testFindByPrimaryKeyMissing() throws Exception {
		long pk = RandomTestUtil.nextLong();

		_persistence.findByPrimaryKey(pk);
	}

	@Test
	public void testFindAll() throws Exception {
		_persistence.findAll(
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, getOrderByComparator());
	}

	protected OrderByComparator<Encargo> getOrderByComparator() {
		return OrderByComparatorFactoryUtil.create(
			"GDF_Encargo", "uuid", true, "encargoId", true, "propostaId", true,
			"valorEncargos", true, "descricaoEncargos", true);
	}

	@Test
	public void testFetchByPrimaryKeyExisting() throws Exception {
		Encargo newEncargo = addEncargo();

		Encargo existingEncargo = _persistence.fetchByPrimaryKey(
			newEncargo.getPrimaryKey());

		Assert.assertEquals(existingEncargo, newEncargo);
	}

	@Test
	public void testFetchByPrimaryKeyMissing() throws Exception {
		long pk = RandomTestUtil.nextLong();

		Encargo missingEncargo = _persistence.fetchByPrimaryKey(pk);

		Assert.assertNull(missingEncargo);
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereAllPrimaryKeysExist()
		throws Exception {

		Encargo newEncargo1 = addEncargo();
		Encargo newEncargo2 = addEncargo();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newEncargo1.getPrimaryKey());
		primaryKeys.add(newEncargo2.getPrimaryKey());

		Map<Serializable, Encargo> encargos = _persistence.fetchByPrimaryKeys(
			primaryKeys);

		Assert.assertEquals(2, encargos.size());
		Assert.assertEquals(
			newEncargo1, encargos.get(newEncargo1.getPrimaryKey()));
		Assert.assertEquals(
			newEncargo2, encargos.get(newEncargo2.getPrimaryKey()));
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereNoPrimaryKeysExist()
		throws Exception {

		long pk1 = RandomTestUtil.nextLong();

		long pk2 = RandomTestUtil.nextLong();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(pk1);
		primaryKeys.add(pk2);

		Map<Serializable, Encargo> encargos = _persistence.fetchByPrimaryKeys(
			primaryKeys);

		Assert.assertTrue(encargos.isEmpty());
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereSomePrimaryKeysExist()
		throws Exception {

		Encargo newEncargo = addEncargo();

		long pk = RandomTestUtil.nextLong();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newEncargo.getPrimaryKey());
		primaryKeys.add(pk);

		Map<Serializable, Encargo> encargos = _persistence.fetchByPrimaryKeys(
			primaryKeys);

		Assert.assertEquals(1, encargos.size());
		Assert.assertEquals(
			newEncargo, encargos.get(newEncargo.getPrimaryKey()));
	}

	@Test
	public void testFetchByPrimaryKeysWithNoPrimaryKeys() throws Exception {
		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		Map<Serializable, Encargo> encargos = _persistence.fetchByPrimaryKeys(
			primaryKeys);

		Assert.assertTrue(encargos.isEmpty());
	}

	@Test
	public void testFetchByPrimaryKeysWithOnePrimaryKey() throws Exception {
		Encargo newEncargo = addEncargo();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newEncargo.getPrimaryKey());

		Map<Serializable, Encargo> encargos = _persistence.fetchByPrimaryKeys(
			primaryKeys);

		Assert.assertEquals(1, encargos.size());
		Assert.assertEquals(
			newEncargo, encargos.get(newEncargo.getPrimaryKey()));
	}

	@Test
	public void testActionableDynamicQuery() throws Exception {
		final IntegerWrapper count = new IntegerWrapper();

		ActionableDynamicQuery actionableDynamicQuery =
			EncargoLocalServiceUtil.getActionableDynamicQuery();

		actionableDynamicQuery.setPerformActionMethod(
			new ActionableDynamicQuery.PerformActionMethod<Encargo>() {

				@Override
				public void performAction(Encargo encargo) {
					Assert.assertNotNull(encargo);

					count.increment();
				}

			});

		actionableDynamicQuery.performActions();

		Assert.assertEquals(count.getValue(), _persistence.countAll());
	}

	@Test
	public void testDynamicQueryByPrimaryKeyExisting() throws Exception {
		Encargo newEncargo = addEncargo();

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			Encargo.class, _dynamicQueryClassLoader);

		dynamicQuery.add(
			RestrictionsFactoryUtil.eq("encargoId", newEncargo.getEncargoId()));

		List<Encargo> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(1, result.size());

		Encargo existingEncargo = result.get(0);

		Assert.assertEquals(existingEncargo, newEncargo);
	}

	@Test
	public void testDynamicQueryByPrimaryKeyMissing() throws Exception {
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			Encargo.class, _dynamicQueryClassLoader);

		dynamicQuery.add(
			RestrictionsFactoryUtil.eq("encargoId", RandomTestUtil.nextLong()));

		List<Encargo> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(0, result.size());
	}

	@Test
	public void testDynamicQueryByProjectionExisting() throws Exception {
		Encargo newEncargo = addEncargo();

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			Encargo.class, _dynamicQueryClassLoader);

		dynamicQuery.setProjection(ProjectionFactoryUtil.property("encargoId"));

		Object newEncargoId = newEncargo.getEncargoId();

		dynamicQuery.add(
			RestrictionsFactoryUtil.in(
				"encargoId", new Object[] {newEncargoId}));

		List<Object> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(1, result.size());

		Object existingEncargoId = result.get(0);

		Assert.assertEquals(existingEncargoId, newEncargoId);
	}

	@Test
	public void testDynamicQueryByProjectionMissing() throws Exception {
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			Encargo.class, _dynamicQueryClassLoader);

		dynamicQuery.setProjection(ProjectionFactoryUtil.property("encargoId"));

		dynamicQuery.add(
			RestrictionsFactoryUtil.in(
				"encargoId", new Object[] {RandomTestUtil.nextLong()}));

		List<Object> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(0, result.size());
	}

	protected Encargo addEncargo() throws Exception {
		long pk = RandomTestUtil.nextLong();

		Encargo encargo = _persistence.create(pk);

		encargo.setUuid(RandomTestUtil.randomString());

		encargo.setPropostaId(RandomTestUtil.nextLong());

		encargo.setValorEncargos(RandomTestUtil.nextDouble());

		encargo.setDescricaoEncargos(RandomTestUtil.randomString());

		_encargos.add(_persistence.update(encargo));

		return encargo;
	}

	private List<Encargo> _encargos = new ArrayList<Encargo>();
	private EncargoPersistence _persistence;
	private ClassLoader _dynamicQueryClassLoader;

}
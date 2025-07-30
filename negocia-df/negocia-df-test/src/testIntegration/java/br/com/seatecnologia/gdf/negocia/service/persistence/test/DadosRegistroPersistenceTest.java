/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.persistence.test;

import br.com.seatecnologia.gdf.negocia.exception.NoSuchDadosRegistroException;
import br.com.seatecnologia.gdf.negocia.model.DadosRegistro;
import br.com.seatecnologia.gdf.negocia.service.DadosRegistroLocalServiceUtil;
import br.com.seatecnologia.gdf.negocia.service.persistence.DadosRegistroPersistence;
import br.com.seatecnologia.gdf.negocia.service.persistence.DadosRegistroUtil;

import com.liferay.arquillian.extension.junit.bridge.junit.Arquillian;
import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.ProjectionFactoryUtil;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.test.ReflectionTestUtil;
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
public class DadosRegistroPersistenceTest {

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
		_persistence = DadosRegistroUtil.getPersistence();

		Class<?> clazz = _persistence.getClass();

		_dynamicQueryClassLoader = clazz.getClassLoader();
	}

	@After
	public void tearDown() throws Exception {
		Iterator<DadosRegistro> iterator = _dadosRegistros.iterator();

		while (iterator.hasNext()) {
			_persistence.remove(iterator.next());

			iterator.remove();
		}
	}

	@Test
	public void testCreate() throws Exception {
		long pk = RandomTestUtil.nextLong();

		DadosRegistro dadosRegistro = _persistence.create(pk);

		Assert.assertNotNull(dadosRegistro);

		Assert.assertEquals(dadosRegistro.getPrimaryKey(), pk);
	}

	@Test
	public void testRemove() throws Exception {
		DadosRegistro newDadosRegistro = addDadosRegistro();

		_persistence.remove(newDadosRegistro);

		DadosRegistro existingDadosRegistro = _persistence.fetchByPrimaryKey(
			newDadosRegistro.getPrimaryKey());

		Assert.assertNull(existingDadosRegistro);
	}

	@Test
	public void testUpdateNew() throws Exception {
		addDadosRegistro();
	}

	@Test
	public void testUpdateExisting() throws Exception {
		long pk = RandomTestUtil.nextLong();

		DadosRegistro newDadosRegistro = _persistence.create(pk);

		newDadosRegistro.setUuid(RandomTestUtil.randomString());

		newDadosRegistro.setGarantiaId(RandomTestUtil.nextLong());

		newDadosRegistro.setMatriculaImovel(RandomTestUtil.randomString());

		newDadosRegistro.setCartorioRegistro(RandomTestUtil.randomString());

		newDadosRegistro.setRenavam(RandomTestUtil.randomString());

		newDadosRegistro.setLocalizacao(RandomTestUtil.randomString());

		_dadosRegistros.add(_persistence.update(newDadosRegistro));

		DadosRegistro existingDadosRegistro = _persistence.findByPrimaryKey(
			newDadosRegistro.getPrimaryKey());

		Assert.assertEquals(
			existingDadosRegistro.getUuid(), newDadosRegistro.getUuid());
		Assert.assertEquals(
			existingDadosRegistro.getDadosRegistroId(),
			newDadosRegistro.getDadosRegistroId());
		Assert.assertEquals(
			existingDadosRegistro.getGarantiaId(),
			newDadosRegistro.getGarantiaId());
		Assert.assertEquals(
			existingDadosRegistro.getMatriculaImovel(),
			newDadosRegistro.getMatriculaImovel());
		Assert.assertEquals(
			existingDadosRegistro.getCartorioRegistro(),
			newDadosRegistro.getCartorioRegistro());
		Assert.assertEquals(
			existingDadosRegistro.getRenavam(), newDadosRegistro.getRenavam());
		Assert.assertEquals(
			existingDadosRegistro.getLocalizacao(),
			newDadosRegistro.getLocalizacao());
	}

	@Test
	public void testCountByUuid() throws Exception {
		_persistence.countByUuid("");

		_persistence.countByUuid("null");

		_persistence.countByUuid((String)null);
	}

	@Test
	public void testCountByGarantiaId() throws Exception {
		_persistence.countByGarantiaId(RandomTestUtil.nextLong());

		_persistence.countByGarantiaId(0L);
	}

	@Test
	public void testFindByPrimaryKeyExisting() throws Exception {
		DadosRegistro newDadosRegistro = addDadosRegistro();

		DadosRegistro existingDadosRegistro = _persistence.findByPrimaryKey(
			newDadosRegistro.getPrimaryKey());

		Assert.assertEquals(existingDadosRegistro, newDadosRegistro);
	}

	@Test(expected = NoSuchDadosRegistroException.class)
	public void testFindByPrimaryKeyMissing() throws Exception {
		long pk = RandomTestUtil.nextLong();

		_persistence.findByPrimaryKey(pk);
	}

	@Test
	public void testFindAll() throws Exception {
		_persistence.findAll(
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, getOrderByComparator());
	}

	protected OrderByComparator<DadosRegistro> getOrderByComparator() {
		return OrderByComparatorFactoryUtil.create(
			"GDF_DadosRegistro", "uuid", true, "dadosRegistroId", true,
			"garantiaId", true, "matriculaImovel", true, "cartorioRegistro",
			true, "renavam", true, "localizacao", true);
	}

	@Test
	public void testFetchByPrimaryKeyExisting() throws Exception {
		DadosRegistro newDadosRegistro = addDadosRegistro();

		DadosRegistro existingDadosRegistro = _persistence.fetchByPrimaryKey(
			newDadosRegistro.getPrimaryKey());

		Assert.assertEquals(existingDadosRegistro, newDadosRegistro);
	}

	@Test
	public void testFetchByPrimaryKeyMissing() throws Exception {
		long pk = RandomTestUtil.nextLong();

		DadosRegistro missingDadosRegistro = _persistence.fetchByPrimaryKey(pk);

		Assert.assertNull(missingDadosRegistro);
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereAllPrimaryKeysExist()
		throws Exception {

		DadosRegistro newDadosRegistro1 = addDadosRegistro();
		DadosRegistro newDadosRegistro2 = addDadosRegistro();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newDadosRegistro1.getPrimaryKey());
		primaryKeys.add(newDadosRegistro2.getPrimaryKey());

		Map<Serializable, DadosRegistro> dadosRegistros =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(2, dadosRegistros.size());
		Assert.assertEquals(
			newDadosRegistro1,
			dadosRegistros.get(newDadosRegistro1.getPrimaryKey()));
		Assert.assertEquals(
			newDadosRegistro2,
			dadosRegistros.get(newDadosRegistro2.getPrimaryKey()));
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereNoPrimaryKeysExist()
		throws Exception {

		long pk1 = RandomTestUtil.nextLong();

		long pk2 = RandomTestUtil.nextLong();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(pk1);
		primaryKeys.add(pk2);

		Map<Serializable, DadosRegistro> dadosRegistros =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertTrue(dadosRegistros.isEmpty());
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereSomePrimaryKeysExist()
		throws Exception {

		DadosRegistro newDadosRegistro = addDadosRegistro();

		long pk = RandomTestUtil.nextLong();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newDadosRegistro.getPrimaryKey());
		primaryKeys.add(pk);

		Map<Serializable, DadosRegistro> dadosRegistros =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(1, dadosRegistros.size());
		Assert.assertEquals(
			newDadosRegistro,
			dadosRegistros.get(newDadosRegistro.getPrimaryKey()));
	}

	@Test
	public void testFetchByPrimaryKeysWithNoPrimaryKeys() throws Exception {
		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		Map<Serializable, DadosRegistro> dadosRegistros =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertTrue(dadosRegistros.isEmpty());
	}

	@Test
	public void testFetchByPrimaryKeysWithOnePrimaryKey() throws Exception {
		DadosRegistro newDadosRegistro = addDadosRegistro();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newDadosRegistro.getPrimaryKey());

		Map<Serializable, DadosRegistro> dadosRegistros =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(1, dadosRegistros.size());
		Assert.assertEquals(
			newDadosRegistro,
			dadosRegistros.get(newDadosRegistro.getPrimaryKey()));
	}

	@Test
	public void testActionableDynamicQuery() throws Exception {
		final IntegerWrapper count = new IntegerWrapper();

		ActionableDynamicQuery actionableDynamicQuery =
			DadosRegistroLocalServiceUtil.getActionableDynamicQuery();

		actionableDynamicQuery.setPerformActionMethod(
			new ActionableDynamicQuery.PerformActionMethod<DadosRegistro>() {

				@Override
				public void performAction(DadosRegistro dadosRegistro) {
					Assert.assertNotNull(dadosRegistro);

					count.increment();
				}

			});

		actionableDynamicQuery.performActions();

		Assert.assertEquals(count.getValue(), _persistence.countAll());
	}

	@Test
	public void testDynamicQueryByPrimaryKeyExisting() throws Exception {
		DadosRegistro newDadosRegistro = addDadosRegistro();

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			DadosRegistro.class, _dynamicQueryClassLoader);

		dynamicQuery.add(
			RestrictionsFactoryUtil.eq(
				"dadosRegistroId", newDadosRegistro.getDadosRegistroId()));

		List<DadosRegistro> result = _persistence.findWithDynamicQuery(
			dynamicQuery);

		Assert.assertEquals(1, result.size());

		DadosRegistro existingDadosRegistro = result.get(0);

		Assert.assertEquals(existingDadosRegistro, newDadosRegistro);
	}

	@Test
	public void testDynamicQueryByPrimaryKeyMissing() throws Exception {
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			DadosRegistro.class, _dynamicQueryClassLoader);

		dynamicQuery.add(
			RestrictionsFactoryUtil.eq(
				"dadosRegistroId", RandomTestUtil.nextLong()));

		List<DadosRegistro> result = _persistence.findWithDynamicQuery(
			dynamicQuery);

		Assert.assertEquals(0, result.size());
	}

	@Test
	public void testDynamicQueryByProjectionExisting() throws Exception {
		DadosRegistro newDadosRegistro = addDadosRegistro();

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			DadosRegistro.class, _dynamicQueryClassLoader);

		dynamicQuery.setProjection(
			ProjectionFactoryUtil.property("dadosRegistroId"));

		Object newDadosRegistroId = newDadosRegistro.getDadosRegistroId();

		dynamicQuery.add(
			RestrictionsFactoryUtil.in(
				"dadosRegistroId", new Object[] {newDadosRegistroId}));

		List<Object> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(1, result.size());

		Object existingDadosRegistroId = result.get(0);

		Assert.assertEquals(existingDadosRegistroId, newDadosRegistroId);
	}

	@Test
	public void testDynamicQueryByProjectionMissing() throws Exception {
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			DadosRegistro.class, _dynamicQueryClassLoader);

		dynamicQuery.setProjection(
			ProjectionFactoryUtil.property("dadosRegistroId"));

		dynamicQuery.add(
			RestrictionsFactoryUtil.in(
				"dadosRegistroId", new Object[] {RandomTestUtil.nextLong()}));

		List<Object> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(0, result.size());
	}

	@Test
	public void testResetOriginalValues() throws Exception {
		DadosRegistro newDadosRegistro = addDadosRegistro();

		_persistence.clearCache();

		_assertOriginalValues(
			_persistence.findByPrimaryKey(newDadosRegistro.getPrimaryKey()));
	}

	@Test
	public void testResetOriginalValuesWithDynamicQueryLoadFromDatabase()
		throws Exception {

		_testResetOriginalValuesWithDynamicQuery(true);
	}

	@Test
	public void testResetOriginalValuesWithDynamicQueryLoadFromSession()
		throws Exception {

		_testResetOriginalValuesWithDynamicQuery(false);
	}

	private void _testResetOriginalValuesWithDynamicQuery(boolean clearSession)
		throws Exception {

		DadosRegistro newDadosRegistro = addDadosRegistro();

		if (clearSession) {
			Session session = _persistence.openSession();

			session.flush();

			session.clear();
		}

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			DadosRegistro.class, _dynamicQueryClassLoader);

		dynamicQuery.add(
			RestrictionsFactoryUtil.eq(
				"dadosRegistroId", newDadosRegistro.getDadosRegistroId()));

		List<DadosRegistro> result = _persistence.findWithDynamicQuery(
			dynamicQuery);

		_assertOriginalValues(result.get(0));
	}

	private void _assertOriginalValues(DadosRegistro dadosRegistro) {
		Assert.assertEquals(
			Long.valueOf(dadosRegistro.getGarantiaId()),
			ReflectionTestUtil.<Long>invoke(
				dadosRegistro, "getColumnOriginalValue",
				new Class<?>[] {String.class}, "garantiaId"));
	}

	protected DadosRegistro addDadosRegistro() throws Exception {
		long pk = RandomTestUtil.nextLong();

		DadosRegistro dadosRegistro = _persistence.create(pk);

		dadosRegistro.setUuid(RandomTestUtil.randomString());

		dadosRegistro.setGarantiaId(RandomTestUtil.nextLong());

		dadosRegistro.setMatriculaImovel(RandomTestUtil.randomString());

		dadosRegistro.setCartorioRegistro(RandomTestUtil.randomString());

		dadosRegistro.setRenavam(RandomTestUtil.randomString());

		dadosRegistro.setLocalizacao(RandomTestUtil.randomString());

		_dadosRegistros.add(_persistence.update(dadosRegistro));

		return dadosRegistro;
	}

	private List<DadosRegistro> _dadosRegistros =
		new ArrayList<DadosRegistro>();
	private DadosRegistroPersistence _persistence;
	private ClassLoader _dynamicQueryClassLoader;

}
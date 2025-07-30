/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.persistence.test;

import br.com.seatecnologia.gdf.negocia.exception.NoSuchAdvogadoException;
import br.com.seatecnologia.gdf.negocia.model.Advogado;
import br.com.seatecnologia.gdf.negocia.service.AdvogadoLocalServiceUtil;
import br.com.seatecnologia.gdf.negocia.service.persistence.AdvogadoPersistence;
import br.com.seatecnologia.gdf.negocia.service.persistence.AdvogadoUtil;

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
public class AdvogadoPersistenceTest {

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
		_persistence = AdvogadoUtil.getPersistence();

		Class<?> clazz = _persistence.getClass();

		_dynamicQueryClassLoader = clazz.getClassLoader();
	}

	@After
	public void tearDown() throws Exception {
		Iterator<Advogado> iterator = _advogados.iterator();

		while (iterator.hasNext()) {
			_persistence.remove(iterator.next());

			iterator.remove();
		}
	}

	@Test
	public void testCreate() throws Exception {
		long pk = RandomTestUtil.nextLong();

		Advogado advogado = _persistence.create(pk);

		Assert.assertNotNull(advogado);

		Assert.assertEquals(advogado.getPrimaryKey(), pk);
	}

	@Test
	public void testRemove() throws Exception {
		Advogado newAdvogado = addAdvogado();

		_persistence.remove(newAdvogado);

		Advogado existingAdvogado = _persistence.fetchByPrimaryKey(
			newAdvogado.getPrimaryKey());

		Assert.assertNull(existingAdvogado);
	}

	@Test
	public void testUpdateNew() throws Exception {
		addAdvogado();
	}

	@Test
	public void testUpdateExisting() throws Exception {
		long pk = RandomTestUtil.nextLong();

		Advogado newAdvogado = _persistence.create(pk);

		newAdvogado.setUuid(RandomTestUtil.randomString());

		newAdvogado.setQualificacaoId(RandomTestUtil.nextLong());

		newAdvogado.setNumeroOab(RandomTestUtil.randomString());

		newAdvogado.setSeccional(RandomTestUtil.randomString());

		newAdvogado.setCarteirinhaOAB(RandomTestUtil.nextLong());

		_advogados.add(_persistence.update(newAdvogado));

		Advogado existingAdvogado = _persistence.findByPrimaryKey(
			newAdvogado.getPrimaryKey());

		Assert.assertEquals(existingAdvogado.getUuid(), newAdvogado.getUuid());
		Assert.assertEquals(
			existingAdvogado.getAdvogadoId(), newAdvogado.getAdvogadoId());
		Assert.assertEquals(
			existingAdvogado.getQualificacaoId(),
			newAdvogado.getQualificacaoId());
		Assert.assertEquals(
			existingAdvogado.getNumeroOab(), newAdvogado.getNumeroOab());
		Assert.assertEquals(
			existingAdvogado.getSeccional(), newAdvogado.getSeccional());
		Assert.assertEquals(
			existingAdvogado.getCarteirinhaOAB(),
			newAdvogado.getCarteirinhaOAB());
	}

	@Test
	public void testCountByUuid() throws Exception {
		_persistence.countByUuid("");

		_persistence.countByUuid("null");

		_persistence.countByUuid((String)null);
	}

	@Test
	public void testFindByPrimaryKeyExisting() throws Exception {
		Advogado newAdvogado = addAdvogado();

		Advogado existingAdvogado = _persistence.findByPrimaryKey(
			newAdvogado.getPrimaryKey());

		Assert.assertEquals(existingAdvogado, newAdvogado);
	}

	@Test(expected = NoSuchAdvogadoException.class)
	public void testFindByPrimaryKeyMissing() throws Exception {
		long pk = RandomTestUtil.nextLong();

		_persistence.findByPrimaryKey(pk);
	}

	@Test
	public void testFindAll() throws Exception {
		_persistence.findAll(
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, getOrderByComparator());
	}

	protected OrderByComparator<Advogado> getOrderByComparator() {
		return OrderByComparatorFactoryUtil.create(
			"GDF_Advogado", "uuid", true, "advogadoId", true, "qualificacaoId",
			true, "numeroOab", true, "seccional", true, "carteirinhaOAB", true);
	}

	@Test
	public void testFetchByPrimaryKeyExisting() throws Exception {
		Advogado newAdvogado = addAdvogado();

		Advogado existingAdvogado = _persistence.fetchByPrimaryKey(
			newAdvogado.getPrimaryKey());

		Assert.assertEquals(existingAdvogado, newAdvogado);
	}

	@Test
	public void testFetchByPrimaryKeyMissing() throws Exception {
		long pk = RandomTestUtil.nextLong();

		Advogado missingAdvogado = _persistence.fetchByPrimaryKey(pk);

		Assert.assertNull(missingAdvogado);
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereAllPrimaryKeysExist()
		throws Exception {

		Advogado newAdvogado1 = addAdvogado();
		Advogado newAdvogado2 = addAdvogado();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newAdvogado1.getPrimaryKey());
		primaryKeys.add(newAdvogado2.getPrimaryKey());

		Map<Serializable, Advogado> advogados = _persistence.fetchByPrimaryKeys(
			primaryKeys);

		Assert.assertEquals(2, advogados.size());
		Assert.assertEquals(
			newAdvogado1, advogados.get(newAdvogado1.getPrimaryKey()));
		Assert.assertEquals(
			newAdvogado2, advogados.get(newAdvogado2.getPrimaryKey()));
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereNoPrimaryKeysExist()
		throws Exception {

		long pk1 = RandomTestUtil.nextLong();

		long pk2 = RandomTestUtil.nextLong();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(pk1);
		primaryKeys.add(pk2);

		Map<Serializable, Advogado> advogados = _persistence.fetchByPrimaryKeys(
			primaryKeys);

		Assert.assertTrue(advogados.isEmpty());
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereSomePrimaryKeysExist()
		throws Exception {

		Advogado newAdvogado = addAdvogado();

		long pk = RandomTestUtil.nextLong();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newAdvogado.getPrimaryKey());
		primaryKeys.add(pk);

		Map<Serializable, Advogado> advogados = _persistence.fetchByPrimaryKeys(
			primaryKeys);

		Assert.assertEquals(1, advogados.size());
		Assert.assertEquals(
			newAdvogado, advogados.get(newAdvogado.getPrimaryKey()));
	}

	@Test
	public void testFetchByPrimaryKeysWithNoPrimaryKeys() throws Exception {
		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		Map<Serializable, Advogado> advogados = _persistence.fetchByPrimaryKeys(
			primaryKeys);

		Assert.assertTrue(advogados.isEmpty());
	}

	@Test
	public void testFetchByPrimaryKeysWithOnePrimaryKey() throws Exception {
		Advogado newAdvogado = addAdvogado();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newAdvogado.getPrimaryKey());

		Map<Serializable, Advogado> advogados = _persistence.fetchByPrimaryKeys(
			primaryKeys);

		Assert.assertEquals(1, advogados.size());
		Assert.assertEquals(
			newAdvogado, advogados.get(newAdvogado.getPrimaryKey()));
	}

	@Test
	public void testActionableDynamicQuery() throws Exception {
		final IntegerWrapper count = new IntegerWrapper();

		ActionableDynamicQuery actionableDynamicQuery =
			AdvogadoLocalServiceUtil.getActionableDynamicQuery();

		actionableDynamicQuery.setPerformActionMethod(
			new ActionableDynamicQuery.PerformActionMethod<Advogado>() {

				@Override
				public void performAction(Advogado advogado) {
					Assert.assertNotNull(advogado);

					count.increment();
				}

			});

		actionableDynamicQuery.performActions();

		Assert.assertEquals(count.getValue(), _persistence.countAll());
	}

	@Test
	public void testDynamicQueryByPrimaryKeyExisting() throws Exception {
		Advogado newAdvogado = addAdvogado();

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			Advogado.class, _dynamicQueryClassLoader);

		dynamicQuery.add(
			RestrictionsFactoryUtil.eq(
				"advogadoId", newAdvogado.getAdvogadoId()));

		List<Advogado> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(1, result.size());

		Advogado existingAdvogado = result.get(0);

		Assert.assertEquals(existingAdvogado, newAdvogado);
	}

	@Test
	public void testDynamicQueryByPrimaryKeyMissing() throws Exception {
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			Advogado.class, _dynamicQueryClassLoader);

		dynamicQuery.add(
			RestrictionsFactoryUtil.eq(
				"advogadoId", RandomTestUtil.nextLong()));

		List<Advogado> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(0, result.size());
	}

	@Test
	public void testDynamicQueryByProjectionExisting() throws Exception {
		Advogado newAdvogado = addAdvogado();

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			Advogado.class, _dynamicQueryClassLoader);

		dynamicQuery.setProjection(
			ProjectionFactoryUtil.property("advogadoId"));

		Object newAdvogadoId = newAdvogado.getAdvogadoId();

		dynamicQuery.add(
			RestrictionsFactoryUtil.in(
				"advogadoId", new Object[] {newAdvogadoId}));

		List<Object> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(1, result.size());

		Object existingAdvogadoId = result.get(0);

		Assert.assertEquals(existingAdvogadoId, newAdvogadoId);
	}

	@Test
	public void testDynamicQueryByProjectionMissing() throws Exception {
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			Advogado.class, _dynamicQueryClassLoader);

		dynamicQuery.setProjection(
			ProjectionFactoryUtil.property("advogadoId"));

		dynamicQuery.add(
			RestrictionsFactoryUtil.in(
				"advogadoId", new Object[] {RandomTestUtil.nextLong()}));

		List<Object> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(0, result.size());
	}

	protected Advogado addAdvogado() throws Exception {
		long pk = RandomTestUtil.nextLong();

		Advogado advogado = _persistence.create(pk);

		advogado.setUuid(RandomTestUtil.randomString());

		advogado.setQualificacaoId(RandomTestUtil.nextLong());

		advogado.setNumeroOab(RandomTestUtil.randomString());

		advogado.setSeccional(RandomTestUtil.randomString());

		advogado.setCarteirinhaOAB(RandomTestUtil.nextLong());

		_advogados.add(_persistence.update(advogado));

		return advogado;
	}

	private List<Advogado> _advogados = new ArrayList<Advogado>();
	private AdvogadoPersistence _persistence;
	private ClassLoader _dynamicQueryClassLoader;

}
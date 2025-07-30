/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.persistence.test;

import br.com.seatecnologia.gdf.negocia.exception.NoSuchAnexosOutrosException;
import br.com.seatecnologia.gdf.negocia.model.AnexosOutros;
import br.com.seatecnologia.gdf.negocia.service.AnexosOutrosLocalServiceUtil;
import br.com.seatecnologia.gdf.negocia.service.persistence.AnexosOutrosPersistence;
import br.com.seatecnologia.gdf.negocia.service.persistence.AnexosOutrosUtil;

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
public class AnexosOutrosPersistenceTest {

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
		_persistence = AnexosOutrosUtil.getPersistence();

		Class<?> clazz = _persistence.getClass();

		_dynamicQueryClassLoader = clazz.getClassLoader();
	}

	@After
	public void tearDown() throws Exception {
		Iterator<AnexosOutros> iterator = _anexosOutroses.iterator();

		while (iterator.hasNext()) {
			_persistence.remove(iterator.next());

			iterator.remove();
		}
	}

	@Test
	public void testCreate() throws Exception {
		long pk = RandomTestUtil.nextLong();

		AnexosOutros anexosOutros = _persistence.create(pk);

		Assert.assertNotNull(anexosOutros);

		Assert.assertEquals(anexosOutros.getPrimaryKey(), pk);
	}

	@Test
	public void testRemove() throws Exception {
		AnexosOutros newAnexosOutros = addAnexosOutros();

		_persistence.remove(newAnexosOutros);

		AnexosOutros existingAnexosOutros = _persistence.fetchByPrimaryKey(
			newAnexosOutros.getPrimaryKey());

		Assert.assertNull(existingAnexosOutros);
	}

	@Test
	public void testUpdateNew() throws Exception {
		addAnexosOutros();
	}

	@Test
	public void testUpdateExisting() throws Exception {
		long pk = RandomTestUtil.nextLong();

		AnexosOutros newAnexosOutros = _persistence.create(pk);

		newAnexosOutros.setUuid(RandomTestUtil.randomString());

		newAnexosOutros.setDadosRegistroId(RandomTestUtil.nextLong());

		newAnexosOutros.setOutrosAnexo(RandomTestUtil.nextLong());

		_anexosOutroses.add(_persistence.update(newAnexosOutros));

		AnexosOutros existingAnexosOutros = _persistence.findByPrimaryKey(
			newAnexosOutros.getPrimaryKey());

		Assert.assertEquals(
			existingAnexosOutros.getUuid(), newAnexosOutros.getUuid());
		Assert.assertEquals(
			existingAnexosOutros.getAnexosOutrosId(),
			newAnexosOutros.getAnexosOutrosId());
		Assert.assertEquals(
			existingAnexosOutros.getDadosRegistroId(),
			newAnexosOutros.getDadosRegistroId());
		Assert.assertEquals(
			existingAnexosOutros.getOutrosAnexo(),
			newAnexosOutros.getOutrosAnexo());
	}

	@Test
	public void testCountByUuid() throws Exception {
		_persistence.countByUuid("");

		_persistence.countByUuid("null");

		_persistence.countByUuid((String)null);
	}

	@Test
	public void testCountByDadosRegistroId() throws Exception {
		_persistence.countByDadosRegistroId(RandomTestUtil.nextLong());

		_persistence.countByDadosRegistroId(0L);
	}

	@Test
	public void testFindByPrimaryKeyExisting() throws Exception {
		AnexosOutros newAnexosOutros = addAnexosOutros();

		AnexosOutros existingAnexosOutros = _persistence.findByPrimaryKey(
			newAnexosOutros.getPrimaryKey());

		Assert.assertEquals(existingAnexosOutros, newAnexosOutros);
	}

	@Test(expected = NoSuchAnexosOutrosException.class)
	public void testFindByPrimaryKeyMissing() throws Exception {
		long pk = RandomTestUtil.nextLong();

		_persistence.findByPrimaryKey(pk);
	}

	@Test
	public void testFindAll() throws Exception {
		_persistence.findAll(
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, getOrderByComparator());
	}

	protected OrderByComparator<AnexosOutros> getOrderByComparator() {
		return OrderByComparatorFactoryUtil.create(
			"GDF_AnexosOutros", "uuid", true, "anexosOutrosId", true,
			"dadosRegistroId", true, "outrosAnexo", true);
	}

	@Test
	public void testFetchByPrimaryKeyExisting() throws Exception {
		AnexosOutros newAnexosOutros = addAnexosOutros();

		AnexosOutros existingAnexosOutros = _persistence.fetchByPrimaryKey(
			newAnexosOutros.getPrimaryKey());

		Assert.assertEquals(existingAnexosOutros, newAnexosOutros);
	}

	@Test
	public void testFetchByPrimaryKeyMissing() throws Exception {
		long pk = RandomTestUtil.nextLong();

		AnexosOutros missingAnexosOutros = _persistence.fetchByPrimaryKey(pk);

		Assert.assertNull(missingAnexosOutros);
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereAllPrimaryKeysExist()
		throws Exception {

		AnexosOutros newAnexosOutros1 = addAnexosOutros();
		AnexosOutros newAnexosOutros2 = addAnexosOutros();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newAnexosOutros1.getPrimaryKey());
		primaryKeys.add(newAnexosOutros2.getPrimaryKey());

		Map<Serializable, AnexosOutros> anexosOutroses =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(2, anexosOutroses.size());
		Assert.assertEquals(
			newAnexosOutros1,
			anexosOutroses.get(newAnexosOutros1.getPrimaryKey()));
		Assert.assertEquals(
			newAnexosOutros2,
			anexosOutroses.get(newAnexosOutros2.getPrimaryKey()));
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereNoPrimaryKeysExist()
		throws Exception {

		long pk1 = RandomTestUtil.nextLong();

		long pk2 = RandomTestUtil.nextLong();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(pk1);
		primaryKeys.add(pk2);

		Map<Serializable, AnexosOutros> anexosOutroses =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertTrue(anexosOutroses.isEmpty());
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereSomePrimaryKeysExist()
		throws Exception {

		AnexosOutros newAnexosOutros = addAnexosOutros();

		long pk = RandomTestUtil.nextLong();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newAnexosOutros.getPrimaryKey());
		primaryKeys.add(pk);

		Map<Serializable, AnexosOutros> anexosOutroses =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(1, anexosOutroses.size());
		Assert.assertEquals(
			newAnexosOutros,
			anexosOutroses.get(newAnexosOutros.getPrimaryKey()));
	}

	@Test
	public void testFetchByPrimaryKeysWithNoPrimaryKeys() throws Exception {
		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		Map<Serializable, AnexosOutros> anexosOutroses =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertTrue(anexosOutroses.isEmpty());
	}

	@Test
	public void testFetchByPrimaryKeysWithOnePrimaryKey() throws Exception {
		AnexosOutros newAnexosOutros = addAnexosOutros();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newAnexosOutros.getPrimaryKey());

		Map<Serializable, AnexosOutros> anexosOutroses =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(1, anexosOutroses.size());
		Assert.assertEquals(
			newAnexosOutros,
			anexosOutroses.get(newAnexosOutros.getPrimaryKey()));
	}

	@Test
	public void testActionableDynamicQuery() throws Exception {
		final IntegerWrapper count = new IntegerWrapper();

		ActionableDynamicQuery actionableDynamicQuery =
			AnexosOutrosLocalServiceUtil.getActionableDynamicQuery();

		actionableDynamicQuery.setPerformActionMethod(
			new ActionableDynamicQuery.PerformActionMethod<AnexosOutros>() {

				@Override
				public void performAction(AnexosOutros anexosOutros) {
					Assert.assertNotNull(anexosOutros);

					count.increment();
				}

			});

		actionableDynamicQuery.performActions();

		Assert.assertEquals(count.getValue(), _persistence.countAll());
	}

	@Test
	public void testDynamicQueryByPrimaryKeyExisting() throws Exception {
		AnexosOutros newAnexosOutros = addAnexosOutros();

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			AnexosOutros.class, _dynamicQueryClassLoader);

		dynamicQuery.add(
			RestrictionsFactoryUtil.eq(
				"anexosOutrosId", newAnexosOutros.getAnexosOutrosId()));

		List<AnexosOutros> result = _persistence.findWithDynamicQuery(
			dynamicQuery);

		Assert.assertEquals(1, result.size());

		AnexosOutros existingAnexosOutros = result.get(0);

		Assert.assertEquals(existingAnexosOutros, newAnexosOutros);
	}

	@Test
	public void testDynamicQueryByPrimaryKeyMissing() throws Exception {
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			AnexosOutros.class, _dynamicQueryClassLoader);

		dynamicQuery.add(
			RestrictionsFactoryUtil.eq(
				"anexosOutrosId", RandomTestUtil.nextLong()));

		List<AnexosOutros> result = _persistence.findWithDynamicQuery(
			dynamicQuery);

		Assert.assertEquals(0, result.size());
	}

	@Test
	public void testDynamicQueryByProjectionExisting() throws Exception {
		AnexosOutros newAnexosOutros = addAnexosOutros();

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			AnexosOutros.class, _dynamicQueryClassLoader);

		dynamicQuery.setProjection(
			ProjectionFactoryUtil.property("anexosOutrosId"));

		Object newAnexosOutrosId = newAnexosOutros.getAnexosOutrosId();

		dynamicQuery.add(
			RestrictionsFactoryUtil.in(
				"anexosOutrosId", new Object[] {newAnexosOutrosId}));

		List<Object> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(1, result.size());

		Object existingAnexosOutrosId = result.get(0);

		Assert.assertEquals(existingAnexosOutrosId, newAnexosOutrosId);
	}

	@Test
	public void testDynamicQueryByProjectionMissing() throws Exception {
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			AnexosOutros.class, _dynamicQueryClassLoader);

		dynamicQuery.setProjection(
			ProjectionFactoryUtil.property("anexosOutrosId"));

		dynamicQuery.add(
			RestrictionsFactoryUtil.in(
				"anexosOutrosId", new Object[] {RandomTestUtil.nextLong()}));

		List<Object> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(0, result.size());
	}

	protected AnexosOutros addAnexosOutros() throws Exception {
		long pk = RandomTestUtil.nextLong();

		AnexosOutros anexosOutros = _persistence.create(pk);

		anexosOutros.setUuid(RandomTestUtil.randomString());

		anexosOutros.setDadosRegistroId(RandomTestUtil.nextLong());

		anexosOutros.setOutrosAnexo(RandomTestUtil.nextLong());

		_anexosOutroses.add(_persistence.update(anexosOutros));

		return anexosOutros;
	}

	private List<AnexosOutros> _anexosOutroses = new ArrayList<AnexosOutros>();
	private AnexosOutrosPersistence _persistence;
	private ClassLoader _dynamicQueryClassLoader;

}
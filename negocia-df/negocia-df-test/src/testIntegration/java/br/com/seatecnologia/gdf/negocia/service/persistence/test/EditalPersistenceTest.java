/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.persistence.test;

import br.com.seatecnologia.gdf.negocia.exception.NoSuchEditalException;
import br.com.seatecnologia.gdf.negocia.model.Edital;
import br.com.seatecnologia.gdf.negocia.service.EditalLocalServiceUtil;
import br.com.seatecnologia.gdf.negocia.service.persistence.EditalPersistence;
import br.com.seatecnologia.gdf.negocia.service.persistence.EditalUtil;

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
import com.liferay.portal.kernel.util.Time;
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
public class EditalPersistenceTest {

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
		_persistence = EditalUtil.getPersistence();

		Class<?> clazz = _persistence.getClass();

		_dynamicQueryClassLoader = clazz.getClassLoader();
	}

	@After
	public void tearDown() throws Exception {
		Iterator<Edital> iterator = _editals.iterator();

		while (iterator.hasNext()) {
			_persistence.remove(iterator.next());

			iterator.remove();
		}
	}

	@Test
	public void testCreate() throws Exception {
		long pk = RandomTestUtil.nextLong();

		Edital edital = _persistence.create(pk);

		Assert.assertNotNull(edital);

		Assert.assertEquals(edital.getPrimaryKey(), pk);
	}

	@Test
	public void testRemove() throws Exception {
		Edital newEdital = addEdital();

		_persistence.remove(newEdital);

		Edital existingEdital = _persistence.fetchByPrimaryKey(
			newEdital.getPrimaryKey());

		Assert.assertNull(existingEdital);
	}

	@Test
	public void testUpdateNew() throws Exception {
		addEdital();
	}

	@Test
	public void testUpdateExisting() throws Exception {
		long pk = RandomTestUtil.nextLong();

		Edital newEdital = _persistence.create(pk);

		newEdital.setUuid(RandomTestUtil.randomString());

		newEdital.setTitulo(RandomTestUtil.randomString());

		newEdital.setDescricao(RandomTestUtil.randomString());

		newEdital.setArquivo(RandomTestUtil.nextLong());

		newEdital.setDataInicio(RandomTestUtil.nextDate());

		newEdital.setDataFim(RandomTestUtil.nextDate());

		_editals.add(_persistence.update(newEdital));

		Edital existingEdital = _persistence.findByPrimaryKey(
			newEdital.getPrimaryKey());

		Assert.assertEquals(existingEdital.getUuid(), newEdital.getUuid());
		Assert.assertEquals(
			existingEdital.getEditalId(), newEdital.getEditalId());
		Assert.assertEquals(existingEdital.getTitulo(), newEdital.getTitulo());
		Assert.assertEquals(
			existingEdital.getDescricao(), newEdital.getDescricao());
		Assert.assertEquals(
			existingEdital.getArquivo(), newEdital.getArquivo());
		Assert.assertEquals(
			Time.getShortTimestamp(existingEdital.getDataInicio()),
			Time.getShortTimestamp(newEdital.getDataInicio()));
		Assert.assertEquals(
			Time.getShortTimestamp(existingEdital.getDataFim()),
			Time.getShortTimestamp(newEdital.getDataFim()));
	}

	@Test
	public void testCountByUuid() throws Exception {
		_persistence.countByUuid("");

		_persistence.countByUuid("null");

		_persistence.countByUuid((String)null);
	}

	@Test
	public void testFindByPrimaryKeyExisting() throws Exception {
		Edital newEdital = addEdital();

		Edital existingEdital = _persistence.findByPrimaryKey(
			newEdital.getPrimaryKey());

		Assert.assertEquals(existingEdital, newEdital);
	}

	@Test(expected = NoSuchEditalException.class)
	public void testFindByPrimaryKeyMissing() throws Exception {
		long pk = RandomTestUtil.nextLong();

		_persistence.findByPrimaryKey(pk);
	}

	@Test
	public void testFindAll() throws Exception {
		_persistence.findAll(
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, getOrderByComparator());
	}

	protected OrderByComparator<Edital> getOrderByComparator() {
		return OrderByComparatorFactoryUtil.create(
			"GDF_Edital", "uuid", true, "editalId", true, "titulo", true,
			"descricao", true, "arquivo", true, "dataInicio", true, "dataFim",
			true);
	}

	@Test
	public void testFetchByPrimaryKeyExisting() throws Exception {
		Edital newEdital = addEdital();

		Edital existingEdital = _persistence.fetchByPrimaryKey(
			newEdital.getPrimaryKey());

		Assert.assertEquals(existingEdital, newEdital);
	}

	@Test
	public void testFetchByPrimaryKeyMissing() throws Exception {
		long pk = RandomTestUtil.nextLong();

		Edital missingEdital = _persistence.fetchByPrimaryKey(pk);

		Assert.assertNull(missingEdital);
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereAllPrimaryKeysExist()
		throws Exception {

		Edital newEdital1 = addEdital();
		Edital newEdital2 = addEdital();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newEdital1.getPrimaryKey());
		primaryKeys.add(newEdital2.getPrimaryKey());

		Map<Serializable, Edital> editals = _persistence.fetchByPrimaryKeys(
			primaryKeys);

		Assert.assertEquals(2, editals.size());
		Assert.assertEquals(
			newEdital1, editals.get(newEdital1.getPrimaryKey()));
		Assert.assertEquals(
			newEdital2, editals.get(newEdital2.getPrimaryKey()));
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereNoPrimaryKeysExist()
		throws Exception {

		long pk1 = RandomTestUtil.nextLong();

		long pk2 = RandomTestUtil.nextLong();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(pk1);
		primaryKeys.add(pk2);

		Map<Serializable, Edital> editals = _persistence.fetchByPrimaryKeys(
			primaryKeys);

		Assert.assertTrue(editals.isEmpty());
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereSomePrimaryKeysExist()
		throws Exception {

		Edital newEdital = addEdital();

		long pk = RandomTestUtil.nextLong();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newEdital.getPrimaryKey());
		primaryKeys.add(pk);

		Map<Serializable, Edital> editals = _persistence.fetchByPrimaryKeys(
			primaryKeys);

		Assert.assertEquals(1, editals.size());
		Assert.assertEquals(newEdital, editals.get(newEdital.getPrimaryKey()));
	}

	@Test
	public void testFetchByPrimaryKeysWithNoPrimaryKeys() throws Exception {
		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		Map<Serializable, Edital> editals = _persistence.fetchByPrimaryKeys(
			primaryKeys);

		Assert.assertTrue(editals.isEmpty());
	}

	@Test
	public void testFetchByPrimaryKeysWithOnePrimaryKey() throws Exception {
		Edital newEdital = addEdital();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newEdital.getPrimaryKey());

		Map<Serializable, Edital> editals = _persistence.fetchByPrimaryKeys(
			primaryKeys);

		Assert.assertEquals(1, editals.size());
		Assert.assertEquals(newEdital, editals.get(newEdital.getPrimaryKey()));
	}

	@Test
	public void testActionableDynamicQuery() throws Exception {
		final IntegerWrapper count = new IntegerWrapper();

		ActionableDynamicQuery actionableDynamicQuery =
			EditalLocalServiceUtil.getActionableDynamicQuery();

		actionableDynamicQuery.setPerformActionMethod(
			new ActionableDynamicQuery.PerformActionMethod<Edital>() {

				@Override
				public void performAction(Edital edital) {
					Assert.assertNotNull(edital);

					count.increment();
				}

			});

		actionableDynamicQuery.performActions();

		Assert.assertEquals(count.getValue(), _persistence.countAll());
	}

	@Test
	public void testDynamicQueryByPrimaryKeyExisting() throws Exception {
		Edital newEdital = addEdital();

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			Edital.class, _dynamicQueryClassLoader);

		dynamicQuery.add(
			RestrictionsFactoryUtil.eq("editalId", newEdital.getEditalId()));

		List<Edital> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(1, result.size());

		Edital existingEdital = result.get(0);

		Assert.assertEquals(existingEdital, newEdital);
	}

	@Test
	public void testDynamicQueryByPrimaryKeyMissing() throws Exception {
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			Edital.class, _dynamicQueryClassLoader);

		dynamicQuery.add(
			RestrictionsFactoryUtil.eq("editalId", RandomTestUtil.nextLong()));

		List<Edital> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(0, result.size());
	}

	@Test
	public void testDynamicQueryByProjectionExisting() throws Exception {
		Edital newEdital = addEdital();

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			Edital.class, _dynamicQueryClassLoader);

		dynamicQuery.setProjection(ProjectionFactoryUtil.property("editalId"));

		Object newEditalId = newEdital.getEditalId();

		dynamicQuery.add(
			RestrictionsFactoryUtil.in("editalId", new Object[] {newEditalId}));

		List<Object> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(1, result.size());

		Object existingEditalId = result.get(0);

		Assert.assertEquals(existingEditalId, newEditalId);
	}

	@Test
	public void testDynamicQueryByProjectionMissing() throws Exception {
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			Edital.class, _dynamicQueryClassLoader);

		dynamicQuery.setProjection(ProjectionFactoryUtil.property("editalId"));

		dynamicQuery.add(
			RestrictionsFactoryUtil.in(
				"editalId", new Object[] {RandomTestUtil.nextLong()}));

		List<Object> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(0, result.size());
	}

	protected Edital addEdital() throws Exception {
		long pk = RandomTestUtil.nextLong();

		Edital edital = _persistence.create(pk);

		edital.setUuid(RandomTestUtil.randomString());

		edital.setTitulo(RandomTestUtil.randomString());

		edital.setDescricao(RandomTestUtil.randomString());

		edital.setArquivo(RandomTestUtil.nextLong());

		edital.setDataInicio(RandomTestUtil.nextDate());

		edital.setDataFim(RandomTestUtil.nextDate());

		_editals.add(_persistence.update(edital));

		return edital;
	}

	private List<Edital> _editals = new ArrayList<Edital>();
	private EditalPersistence _persistence;
	private ClassLoader _dynamicQueryClassLoader;

}
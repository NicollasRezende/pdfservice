/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.persistence.test;

import br.com.seatecnologia.gdf.negocia.exception.NoSuchDemonstracaoDocumentosException;
import br.com.seatecnologia.gdf.negocia.model.DemonstracaoDocumentos;
import br.com.seatecnologia.gdf.negocia.service.DemonstracaoDocumentosLocalServiceUtil;
import br.com.seatecnologia.gdf.negocia.service.persistence.DemonstracaoDocumentosPersistence;
import br.com.seatecnologia.gdf.negocia.service.persistence.DemonstracaoDocumentosUtil;

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
public class DemonstracaoDocumentosPersistenceTest {

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
		_persistence = DemonstracaoDocumentosUtil.getPersistence();

		Class<?> clazz = _persistence.getClass();

		_dynamicQueryClassLoader = clazz.getClassLoader();
	}

	@After
	public void tearDown() throws Exception {
		Iterator<DemonstracaoDocumentos> iterator =
			_demonstracaoDocumentoses.iterator();

		while (iterator.hasNext()) {
			_persistence.remove(iterator.next());

			iterator.remove();
		}
	}

	@Test
	public void testCreate() throws Exception {
		long pk = RandomTestUtil.nextLong();

		DemonstracaoDocumentos demonstracaoDocumentos = _persistence.create(pk);

		Assert.assertNotNull(demonstracaoDocumentos);

		Assert.assertEquals(demonstracaoDocumentos.getPrimaryKey(), pk);
	}

	@Test
	public void testRemove() throws Exception {
		DemonstracaoDocumentos newDemonstracaoDocumentos =
			addDemonstracaoDocumentos();

		_persistence.remove(newDemonstracaoDocumentos);

		DemonstracaoDocumentos existingDemonstracaoDocumentos =
			_persistence.fetchByPrimaryKey(
				newDemonstracaoDocumentos.getPrimaryKey());

		Assert.assertNull(existingDemonstracaoDocumentos);
	}

	@Test
	public void testUpdateNew() throws Exception {
		addDemonstracaoDocumentos();
	}

	@Test
	public void testUpdateExisting() throws Exception {
		long pk = RandomTestUtil.nextLong();

		DemonstracaoDocumentos newDemonstracaoDocumentos = _persistence.create(
			pk);

		newDemonstracaoDocumentos.setUuid(RandomTestUtil.randomString());

		newDemonstracaoDocumentos.setDemonstracaoId(RandomTestUtil.nextLong());

		newDemonstracaoDocumentos.setTipoDocumento(RandomTestUtil.nextInt());

		_demonstracaoDocumentoses.add(
			_persistence.update(newDemonstracaoDocumentos));

		DemonstracaoDocumentos existingDemonstracaoDocumentos =
			_persistence.findByPrimaryKey(
				newDemonstracaoDocumentos.getPrimaryKey());

		Assert.assertEquals(
			existingDemonstracaoDocumentos.getUuid(),
			newDemonstracaoDocumentos.getUuid());
		Assert.assertEquals(
			existingDemonstracaoDocumentos.getDemonstracaoDocumentosId(),
			newDemonstracaoDocumentos.getDemonstracaoDocumentosId());
		Assert.assertEquals(
			existingDemonstracaoDocumentos.getDemonstracaoId(),
			newDemonstracaoDocumentos.getDemonstracaoId());
		Assert.assertEquals(
			existingDemonstracaoDocumentos.getTipoDocumento(),
			newDemonstracaoDocumentos.getTipoDocumento());
	}

	@Test
	public void testCountByUuid() throws Exception {
		_persistence.countByUuid("");

		_persistence.countByUuid("null");

		_persistence.countByUuid((String)null);
	}

	@Test
	public void testCountByDemonstracaoId() throws Exception {
		_persistence.countByDemonstracaoId(RandomTestUtil.nextLong());

		_persistence.countByDemonstracaoId(0L);
	}

	@Test
	public void testFindByPrimaryKeyExisting() throws Exception {
		DemonstracaoDocumentos newDemonstracaoDocumentos =
			addDemonstracaoDocumentos();

		DemonstracaoDocumentos existingDemonstracaoDocumentos =
			_persistence.findByPrimaryKey(
				newDemonstracaoDocumentos.getPrimaryKey());

		Assert.assertEquals(
			existingDemonstracaoDocumentos, newDemonstracaoDocumentos);
	}

	@Test(expected = NoSuchDemonstracaoDocumentosException.class)
	public void testFindByPrimaryKeyMissing() throws Exception {
		long pk = RandomTestUtil.nextLong();

		_persistence.findByPrimaryKey(pk);
	}

	@Test
	public void testFindAll() throws Exception {
		_persistence.findAll(
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, getOrderByComparator());
	}

	protected OrderByComparator<DemonstracaoDocumentos> getOrderByComparator() {
		return OrderByComparatorFactoryUtil.create(
			"GDF_DemonstracaoDocumentos", "uuid", true,
			"demonstracaoDocumentosId", true, "demonstracaoId", true,
			"tipoDocumento", true);
	}

	@Test
	public void testFetchByPrimaryKeyExisting() throws Exception {
		DemonstracaoDocumentos newDemonstracaoDocumentos =
			addDemonstracaoDocumentos();

		DemonstracaoDocumentos existingDemonstracaoDocumentos =
			_persistence.fetchByPrimaryKey(
				newDemonstracaoDocumentos.getPrimaryKey());

		Assert.assertEquals(
			existingDemonstracaoDocumentos, newDemonstracaoDocumentos);
	}

	@Test
	public void testFetchByPrimaryKeyMissing() throws Exception {
		long pk = RandomTestUtil.nextLong();

		DemonstracaoDocumentos missingDemonstracaoDocumentos =
			_persistence.fetchByPrimaryKey(pk);

		Assert.assertNull(missingDemonstracaoDocumentos);
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereAllPrimaryKeysExist()
		throws Exception {

		DemonstracaoDocumentos newDemonstracaoDocumentos1 =
			addDemonstracaoDocumentos();
		DemonstracaoDocumentos newDemonstracaoDocumentos2 =
			addDemonstracaoDocumentos();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newDemonstracaoDocumentos1.getPrimaryKey());
		primaryKeys.add(newDemonstracaoDocumentos2.getPrimaryKey());

		Map<Serializable, DemonstracaoDocumentos> demonstracaoDocumentoses =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(2, demonstracaoDocumentoses.size());
		Assert.assertEquals(
			newDemonstracaoDocumentos1,
			demonstracaoDocumentoses.get(
				newDemonstracaoDocumentos1.getPrimaryKey()));
		Assert.assertEquals(
			newDemonstracaoDocumentos2,
			demonstracaoDocumentoses.get(
				newDemonstracaoDocumentos2.getPrimaryKey()));
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereNoPrimaryKeysExist()
		throws Exception {

		long pk1 = RandomTestUtil.nextLong();

		long pk2 = RandomTestUtil.nextLong();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(pk1);
		primaryKeys.add(pk2);

		Map<Serializable, DemonstracaoDocumentos> demonstracaoDocumentoses =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertTrue(demonstracaoDocumentoses.isEmpty());
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereSomePrimaryKeysExist()
		throws Exception {

		DemonstracaoDocumentos newDemonstracaoDocumentos =
			addDemonstracaoDocumentos();

		long pk = RandomTestUtil.nextLong();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newDemonstracaoDocumentos.getPrimaryKey());
		primaryKeys.add(pk);

		Map<Serializable, DemonstracaoDocumentos> demonstracaoDocumentoses =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(1, demonstracaoDocumentoses.size());
		Assert.assertEquals(
			newDemonstracaoDocumentos,
			demonstracaoDocumentoses.get(
				newDemonstracaoDocumentos.getPrimaryKey()));
	}

	@Test
	public void testFetchByPrimaryKeysWithNoPrimaryKeys() throws Exception {
		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		Map<Serializable, DemonstracaoDocumentos> demonstracaoDocumentoses =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertTrue(demonstracaoDocumentoses.isEmpty());
	}

	@Test
	public void testFetchByPrimaryKeysWithOnePrimaryKey() throws Exception {
		DemonstracaoDocumentos newDemonstracaoDocumentos =
			addDemonstracaoDocumentos();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newDemonstracaoDocumentos.getPrimaryKey());

		Map<Serializable, DemonstracaoDocumentos> demonstracaoDocumentoses =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(1, demonstracaoDocumentoses.size());
		Assert.assertEquals(
			newDemonstracaoDocumentos,
			demonstracaoDocumentoses.get(
				newDemonstracaoDocumentos.getPrimaryKey()));
	}

	@Test
	public void testActionableDynamicQuery() throws Exception {
		final IntegerWrapper count = new IntegerWrapper();

		ActionableDynamicQuery actionableDynamicQuery =
			DemonstracaoDocumentosLocalServiceUtil.getActionableDynamicQuery();

		actionableDynamicQuery.setPerformActionMethod(
			new ActionableDynamicQuery.PerformActionMethod
				<DemonstracaoDocumentos>() {

				@Override
				public void performAction(
					DemonstracaoDocumentos demonstracaoDocumentos) {

					Assert.assertNotNull(demonstracaoDocumentos);

					count.increment();
				}

			});

		actionableDynamicQuery.performActions();

		Assert.assertEquals(count.getValue(), _persistence.countAll());
	}

	@Test
	public void testDynamicQueryByPrimaryKeyExisting() throws Exception {
		DemonstracaoDocumentos newDemonstracaoDocumentos =
			addDemonstracaoDocumentos();

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			DemonstracaoDocumentos.class, _dynamicQueryClassLoader);

		dynamicQuery.add(
			RestrictionsFactoryUtil.eq(
				"demonstracaoDocumentosId",
				newDemonstracaoDocumentos.getDemonstracaoDocumentosId()));

		List<DemonstracaoDocumentos> result = _persistence.findWithDynamicQuery(
			dynamicQuery);

		Assert.assertEquals(1, result.size());

		DemonstracaoDocumentos existingDemonstracaoDocumentos = result.get(0);

		Assert.assertEquals(
			existingDemonstracaoDocumentos, newDemonstracaoDocumentos);
	}

	@Test
	public void testDynamicQueryByPrimaryKeyMissing() throws Exception {
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			DemonstracaoDocumentos.class, _dynamicQueryClassLoader);

		dynamicQuery.add(
			RestrictionsFactoryUtil.eq(
				"demonstracaoDocumentosId", RandomTestUtil.nextLong()));

		List<DemonstracaoDocumentos> result = _persistence.findWithDynamicQuery(
			dynamicQuery);

		Assert.assertEquals(0, result.size());
	}

	@Test
	public void testDynamicQueryByProjectionExisting() throws Exception {
		DemonstracaoDocumentos newDemonstracaoDocumentos =
			addDemonstracaoDocumentos();

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			DemonstracaoDocumentos.class, _dynamicQueryClassLoader);

		dynamicQuery.setProjection(
			ProjectionFactoryUtil.property("demonstracaoDocumentosId"));

		Object newDemonstracaoDocumentosId =
			newDemonstracaoDocumentos.getDemonstracaoDocumentosId();

		dynamicQuery.add(
			RestrictionsFactoryUtil.in(
				"demonstracaoDocumentosId",
				new Object[] {newDemonstracaoDocumentosId}));

		List<Object> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(1, result.size());

		Object existingDemonstracaoDocumentosId = result.get(0);

		Assert.assertEquals(
			existingDemonstracaoDocumentosId, newDemonstracaoDocumentosId);
	}

	@Test
	public void testDynamicQueryByProjectionMissing() throws Exception {
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			DemonstracaoDocumentos.class, _dynamicQueryClassLoader);

		dynamicQuery.setProjection(
			ProjectionFactoryUtil.property("demonstracaoDocumentosId"));

		dynamicQuery.add(
			RestrictionsFactoryUtil.in(
				"demonstracaoDocumentosId",
				new Object[] {RandomTestUtil.nextLong()}));

		List<Object> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(0, result.size());
	}

	protected DemonstracaoDocumentos addDemonstracaoDocumentos()
		throws Exception {

		long pk = RandomTestUtil.nextLong();

		DemonstracaoDocumentos demonstracaoDocumentos = _persistence.create(pk);

		demonstracaoDocumentos.setUuid(RandomTestUtil.randomString());

		demonstracaoDocumentos.setDemonstracaoId(RandomTestUtil.nextLong());

		demonstracaoDocumentos.setTipoDocumento(RandomTestUtil.nextInt());

		_demonstracaoDocumentoses.add(
			_persistence.update(demonstracaoDocumentos));

		return demonstracaoDocumentos;
	}

	private List<DemonstracaoDocumentos> _demonstracaoDocumentoses =
		new ArrayList<DemonstracaoDocumentos>();
	private DemonstracaoDocumentosPersistence _persistence;
	private ClassLoader _dynamicQueryClassLoader;

}
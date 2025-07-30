/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.persistence.test;

import br.com.seatecnologia.gdf.negocia.exception.NoSuchDemonstracaoContabilException;
import br.com.seatecnologia.gdf.negocia.model.DemonstracaoContabil;
import br.com.seatecnologia.gdf.negocia.service.DemonstracaoContabilLocalServiceUtil;
import br.com.seatecnologia.gdf.negocia.service.persistence.DemonstracaoContabilPersistence;
import br.com.seatecnologia.gdf.negocia.service.persistence.DemonstracaoContabilUtil;

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
public class DemonstracaoContabilPersistenceTest {

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
		_persistence = DemonstracaoContabilUtil.getPersistence();

		Class<?> clazz = _persistence.getClass();

		_dynamicQueryClassLoader = clazz.getClassLoader();
	}

	@After
	public void tearDown() throws Exception {
		Iterator<DemonstracaoContabil> iterator =
			_demonstracaoContabils.iterator();

		while (iterator.hasNext()) {
			_persistence.remove(iterator.next());

			iterator.remove();
		}
	}

	@Test
	public void testCreate() throws Exception {
		long pk = RandomTestUtil.nextLong();

		DemonstracaoContabil demonstracaoContabil = _persistence.create(pk);

		Assert.assertNotNull(demonstracaoContabil);

		Assert.assertEquals(demonstracaoContabil.getPrimaryKey(), pk);
	}

	@Test
	public void testRemove() throws Exception {
		DemonstracaoContabil newDemonstracaoContabil =
			addDemonstracaoContabil();

		_persistence.remove(newDemonstracaoContabil);

		DemonstracaoContabil existingDemonstracaoContabil =
			_persistence.fetchByPrimaryKey(
				newDemonstracaoContabil.getPrimaryKey());

		Assert.assertNull(existingDemonstracaoContabil);
	}

	@Test
	public void testUpdateNew() throws Exception {
		addDemonstracaoContabil();
	}

	@Test
	public void testUpdateExisting() throws Exception {
		long pk = RandomTestUtil.nextLong();

		DemonstracaoContabil newDemonstracaoContabil = _persistence.create(pk);

		newDemonstracaoContabil.setUuid(RandomTestUtil.randomString());

		newDemonstracaoContabil.setPropostaId(RandomTestUtil.nextLong());

		newDemonstracaoContabil.setFileEntryId(RandomTestUtil.nextLong());

		newDemonstracaoContabil.setTipoDocumento(RandomTestUtil.nextInt());

		_demonstracaoContabils.add(
			_persistence.update(newDemonstracaoContabil));

		DemonstracaoContabil existingDemonstracaoContabil =
			_persistence.findByPrimaryKey(
				newDemonstracaoContabil.getPrimaryKey());

		Assert.assertEquals(
			existingDemonstracaoContabil.getUuid(),
			newDemonstracaoContabil.getUuid());
		Assert.assertEquals(
			existingDemonstracaoContabil.getDemonstracaoId(),
			newDemonstracaoContabil.getDemonstracaoId());
		Assert.assertEquals(
			existingDemonstracaoContabil.getPropostaId(),
			newDemonstracaoContabil.getPropostaId());
		Assert.assertEquals(
			existingDemonstracaoContabil.getFileEntryId(),
			newDemonstracaoContabil.getFileEntryId());
		Assert.assertEquals(
			existingDemonstracaoContabil.getTipoDocumento(),
			newDemonstracaoContabil.getTipoDocumento());
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
		DemonstracaoContabil newDemonstracaoContabil =
			addDemonstracaoContabil();

		DemonstracaoContabil existingDemonstracaoContabil =
			_persistence.findByPrimaryKey(
				newDemonstracaoContabil.getPrimaryKey());

		Assert.assertEquals(
			existingDemonstracaoContabil, newDemonstracaoContabil);
	}

	@Test(expected = NoSuchDemonstracaoContabilException.class)
	public void testFindByPrimaryKeyMissing() throws Exception {
		long pk = RandomTestUtil.nextLong();

		_persistence.findByPrimaryKey(pk);
	}

	@Test
	public void testFindAll() throws Exception {
		_persistence.findAll(
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, getOrderByComparator());
	}

	protected OrderByComparator<DemonstracaoContabil> getOrderByComparator() {
		return OrderByComparatorFactoryUtil.create(
			"GDF_DemonstracaoContabil", "uuid", true, "demonstracaoId", true,
			"propostaId", true, "fileEntryId", true, "tipoDocumento", true);
	}

	@Test
	public void testFetchByPrimaryKeyExisting() throws Exception {
		DemonstracaoContabil newDemonstracaoContabil =
			addDemonstracaoContabil();

		DemonstracaoContabil existingDemonstracaoContabil =
			_persistence.fetchByPrimaryKey(
				newDemonstracaoContabil.getPrimaryKey());

		Assert.assertEquals(
			existingDemonstracaoContabil, newDemonstracaoContabil);
	}

	@Test
	public void testFetchByPrimaryKeyMissing() throws Exception {
		long pk = RandomTestUtil.nextLong();

		DemonstracaoContabil missingDemonstracaoContabil =
			_persistence.fetchByPrimaryKey(pk);

		Assert.assertNull(missingDemonstracaoContabil);
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereAllPrimaryKeysExist()
		throws Exception {

		DemonstracaoContabil newDemonstracaoContabil1 =
			addDemonstracaoContabil();
		DemonstracaoContabil newDemonstracaoContabil2 =
			addDemonstracaoContabil();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newDemonstracaoContabil1.getPrimaryKey());
		primaryKeys.add(newDemonstracaoContabil2.getPrimaryKey());

		Map<Serializable, DemonstracaoContabil> demonstracaoContabils =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(2, demonstracaoContabils.size());
		Assert.assertEquals(
			newDemonstracaoContabil1,
			demonstracaoContabils.get(
				newDemonstracaoContabil1.getPrimaryKey()));
		Assert.assertEquals(
			newDemonstracaoContabil2,
			demonstracaoContabils.get(
				newDemonstracaoContabil2.getPrimaryKey()));
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereNoPrimaryKeysExist()
		throws Exception {

		long pk1 = RandomTestUtil.nextLong();

		long pk2 = RandomTestUtil.nextLong();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(pk1);
		primaryKeys.add(pk2);

		Map<Serializable, DemonstracaoContabil> demonstracaoContabils =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertTrue(demonstracaoContabils.isEmpty());
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereSomePrimaryKeysExist()
		throws Exception {

		DemonstracaoContabil newDemonstracaoContabil =
			addDemonstracaoContabil();

		long pk = RandomTestUtil.nextLong();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newDemonstracaoContabil.getPrimaryKey());
		primaryKeys.add(pk);

		Map<Serializable, DemonstracaoContabil> demonstracaoContabils =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(1, demonstracaoContabils.size());
		Assert.assertEquals(
			newDemonstracaoContabil,
			demonstracaoContabils.get(newDemonstracaoContabil.getPrimaryKey()));
	}

	@Test
	public void testFetchByPrimaryKeysWithNoPrimaryKeys() throws Exception {
		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		Map<Serializable, DemonstracaoContabil> demonstracaoContabils =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertTrue(demonstracaoContabils.isEmpty());
	}

	@Test
	public void testFetchByPrimaryKeysWithOnePrimaryKey() throws Exception {
		DemonstracaoContabil newDemonstracaoContabil =
			addDemonstracaoContabil();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newDemonstracaoContabil.getPrimaryKey());

		Map<Serializable, DemonstracaoContabil> demonstracaoContabils =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(1, demonstracaoContabils.size());
		Assert.assertEquals(
			newDemonstracaoContabil,
			demonstracaoContabils.get(newDemonstracaoContabil.getPrimaryKey()));
	}

	@Test
	public void testActionableDynamicQuery() throws Exception {
		final IntegerWrapper count = new IntegerWrapper();

		ActionableDynamicQuery actionableDynamicQuery =
			DemonstracaoContabilLocalServiceUtil.getActionableDynamicQuery();

		actionableDynamicQuery.setPerformActionMethod(
			new ActionableDynamicQuery.PerformActionMethod
				<DemonstracaoContabil>() {

				@Override
				public void performAction(
					DemonstracaoContabil demonstracaoContabil) {

					Assert.assertNotNull(demonstracaoContabil);

					count.increment();
				}

			});

		actionableDynamicQuery.performActions();

		Assert.assertEquals(count.getValue(), _persistence.countAll());
	}

	@Test
	public void testDynamicQueryByPrimaryKeyExisting() throws Exception {
		DemonstracaoContabil newDemonstracaoContabil =
			addDemonstracaoContabil();

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			DemonstracaoContabil.class, _dynamicQueryClassLoader);

		dynamicQuery.add(
			RestrictionsFactoryUtil.eq(
				"demonstracaoId", newDemonstracaoContabil.getDemonstracaoId()));

		List<DemonstracaoContabil> result = _persistence.findWithDynamicQuery(
			dynamicQuery);

		Assert.assertEquals(1, result.size());

		DemonstracaoContabil existingDemonstracaoContabil = result.get(0);

		Assert.assertEquals(
			existingDemonstracaoContabil, newDemonstracaoContabil);
	}

	@Test
	public void testDynamicQueryByPrimaryKeyMissing() throws Exception {
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			DemonstracaoContabil.class, _dynamicQueryClassLoader);

		dynamicQuery.add(
			RestrictionsFactoryUtil.eq(
				"demonstracaoId", RandomTestUtil.nextLong()));

		List<DemonstracaoContabil> result = _persistence.findWithDynamicQuery(
			dynamicQuery);

		Assert.assertEquals(0, result.size());
	}

	@Test
	public void testDynamicQueryByProjectionExisting() throws Exception {
		DemonstracaoContabil newDemonstracaoContabil =
			addDemonstracaoContabil();

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			DemonstracaoContabil.class, _dynamicQueryClassLoader);

		dynamicQuery.setProjection(
			ProjectionFactoryUtil.property("demonstracaoId"));

		Object newDemonstracaoId = newDemonstracaoContabil.getDemonstracaoId();

		dynamicQuery.add(
			RestrictionsFactoryUtil.in(
				"demonstracaoId", new Object[] {newDemonstracaoId}));

		List<Object> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(1, result.size());

		Object existingDemonstracaoId = result.get(0);

		Assert.assertEquals(existingDemonstracaoId, newDemonstracaoId);
	}

	@Test
	public void testDynamicQueryByProjectionMissing() throws Exception {
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			DemonstracaoContabil.class, _dynamicQueryClassLoader);

		dynamicQuery.setProjection(
			ProjectionFactoryUtil.property("demonstracaoId"));

		dynamicQuery.add(
			RestrictionsFactoryUtil.in(
				"demonstracaoId", new Object[] {RandomTestUtil.nextLong()}));

		List<Object> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(0, result.size());
	}

	protected DemonstracaoContabil addDemonstracaoContabil() throws Exception {
		long pk = RandomTestUtil.nextLong();

		DemonstracaoContabil demonstracaoContabil = _persistence.create(pk);

		demonstracaoContabil.setUuid(RandomTestUtil.randomString());

		demonstracaoContabil.setPropostaId(RandomTestUtil.nextLong());

		demonstracaoContabil.setFileEntryId(RandomTestUtil.nextLong());

		demonstracaoContabil.setTipoDocumento(RandomTestUtil.nextInt());

		_demonstracaoContabils.add(_persistence.update(demonstracaoContabil));

		return demonstracaoContabil;
	}

	private List<DemonstracaoContabil> _demonstracaoContabils =
		new ArrayList<DemonstracaoContabil>();
	private DemonstracaoContabilPersistence _persistence;
	private ClassLoader _dynamicQueryClassLoader;

}
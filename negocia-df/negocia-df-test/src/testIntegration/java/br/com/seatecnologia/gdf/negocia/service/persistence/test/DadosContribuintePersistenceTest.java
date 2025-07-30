/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.persistence.test;

import br.com.seatecnologia.gdf.negocia.exception.NoSuchDadosContribuinteException;
import br.com.seatecnologia.gdf.negocia.model.DadosContribuinte;
import br.com.seatecnologia.gdf.negocia.service.DadosContribuinteLocalServiceUtil;
import br.com.seatecnologia.gdf.negocia.service.persistence.DadosContribuintePersistence;
import br.com.seatecnologia.gdf.negocia.service.persistence.DadosContribuinteUtil;

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
public class DadosContribuintePersistenceTest {

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
		_persistence = DadosContribuinteUtil.getPersistence();

		Class<?> clazz = _persistence.getClass();

		_dynamicQueryClassLoader = clazz.getClassLoader();
	}

	@After
	public void tearDown() throws Exception {
		Iterator<DadosContribuinte> iterator = _dadosContribuintes.iterator();

		while (iterator.hasNext()) {
			_persistence.remove(iterator.next());

			iterator.remove();
		}
	}

	@Test
	public void testCreate() throws Exception {
		long pk = RandomTestUtil.nextLong();

		DadosContribuinte dadosContribuinte = _persistence.create(pk);

		Assert.assertNotNull(dadosContribuinte);

		Assert.assertEquals(dadosContribuinte.getPrimaryKey(), pk);
	}

	@Test
	public void testRemove() throws Exception {
		DadosContribuinte newDadosContribuinte = addDadosContribuinte();

		_persistence.remove(newDadosContribuinte);

		DadosContribuinte existingDadosContribuinte =
			_persistence.fetchByPrimaryKey(
				newDadosContribuinte.getPrimaryKey());

		Assert.assertNull(existingDadosContribuinte);
	}

	@Test
	public void testUpdateNew() throws Exception {
		addDadosContribuinte();
	}

	@Test
	public void testUpdateExisting() throws Exception {
		long pk = RandomTestUtil.nextLong();

		DadosContribuinte newDadosContribuinte = _persistence.create(pk);

		newDadosContribuinte.setUuid(RandomTestUtil.randomString());

		newDadosContribuinte.setCreateDate(RandomTestUtil.nextDate());

		newDadosContribuinte.setModifiedDate(RandomTestUtil.nextDate());

		newDadosContribuinte.setUserId(RandomTestUtil.nextLong());

		newDadosContribuinte.setGroupId(RandomTestUtil.nextLong());

		newDadosContribuinte.setCompanyId(RandomTestUtil.nextLong());

		newDadosContribuinte.setQualificacaoId(RandomTestUtil.nextLong());

		newDadosContribuinte.setPropostaId(RandomTestUtil.nextLong());

		_dadosContribuintes.add(_persistence.update(newDadosContribuinte));

		DadosContribuinte existingDadosContribuinte =
			_persistence.findByPrimaryKey(newDadosContribuinte.getPrimaryKey());

		Assert.assertEquals(
			existingDadosContribuinte.getUuid(),
			newDadosContribuinte.getUuid());
		Assert.assertEquals(
			existingDadosContribuinte.getDadosContribuinteId(),
			newDadosContribuinte.getDadosContribuinteId());
		Assert.assertEquals(
			Time.getShortTimestamp(existingDadosContribuinte.getCreateDate()),
			Time.getShortTimestamp(newDadosContribuinte.getCreateDate()));
		Assert.assertEquals(
			Time.getShortTimestamp(existingDadosContribuinte.getModifiedDate()),
			Time.getShortTimestamp(newDadosContribuinte.getModifiedDate()));
		Assert.assertEquals(
			existingDadosContribuinte.getUserId(),
			newDadosContribuinte.getUserId());
		Assert.assertEquals(
			existingDadosContribuinte.getGroupId(),
			newDadosContribuinte.getGroupId());
		Assert.assertEquals(
			existingDadosContribuinte.getCompanyId(),
			newDadosContribuinte.getCompanyId());
		Assert.assertEquals(
			existingDadosContribuinte.getQualificacaoId(),
			newDadosContribuinte.getQualificacaoId());
		Assert.assertEquals(
			existingDadosContribuinte.getPropostaId(),
			newDadosContribuinte.getPropostaId());
	}

	@Test
	public void testCountByUuid() throws Exception {
		_persistence.countByUuid("");

		_persistence.countByUuid("null");

		_persistence.countByUuid((String)null);
	}

	@Test
	public void testCountByUUID_G() throws Exception {
		_persistence.countByUUID_G("", RandomTestUtil.nextLong());

		_persistence.countByUUID_G("null", 0L);

		_persistence.countByUUID_G((String)null, 0L);
	}

	@Test
	public void testCountByUuid_C() throws Exception {
		_persistence.countByUuid_C("", RandomTestUtil.nextLong());

		_persistence.countByUuid_C("null", 0L);

		_persistence.countByUuid_C((String)null, 0L);
	}

	@Test
	public void testFindByPrimaryKeyExisting() throws Exception {
		DadosContribuinte newDadosContribuinte = addDadosContribuinte();

		DadosContribuinte existingDadosContribuinte =
			_persistence.findByPrimaryKey(newDadosContribuinte.getPrimaryKey());

		Assert.assertEquals(existingDadosContribuinte, newDadosContribuinte);
	}

	@Test(expected = NoSuchDadosContribuinteException.class)
	public void testFindByPrimaryKeyMissing() throws Exception {
		long pk = RandomTestUtil.nextLong();

		_persistence.findByPrimaryKey(pk);
	}

	@Test
	public void testFindAll() throws Exception {
		_persistence.findAll(
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, getOrderByComparator());
	}

	protected OrderByComparator<DadosContribuinte> getOrderByComparator() {
		return OrderByComparatorFactoryUtil.create(
			"GDF_DadosContribuinte", "uuid", true, "dadosContribuinteId", true,
			"createDate", true, "modifiedDate", true, "userId", true, "groupId",
			true, "companyId", true, "qualificacaoId", true, "propostaId",
			true);
	}

	@Test
	public void testFetchByPrimaryKeyExisting() throws Exception {
		DadosContribuinte newDadosContribuinte = addDadosContribuinte();

		DadosContribuinte existingDadosContribuinte =
			_persistence.fetchByPrimaryKey(
				newDadosContribuinte.getPrimaryKey());

		Assert.assertEquals(existingDadosContribuinte, newDadosContribuinte);
	}

	@Test
	public void testFetchByPrimaryKeyMissing() throws Exception {
		long pk = RandomTestUtil.nextLong();

		DadosContribuinte missingDadosContribuinte =
			_persistence.fetchByPrimaryKey(pk);

		Assert.assertNull(missingDadosContribuinte);
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereAllPrimaryKeysExist()
		throws Exception {

		DadosContribuinte newDadosContribuinte1 = addDadosContribuinte();
		DadosContribuinte newDadosContribuinte2 = addDadosContribuinte();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newDadosContribuinte1.getPrimaryKey());
		primaryKeys.add(newDadosContribuinte2.getPrimaryKey());

		Map<Serializable, DadosContribuinte> dadosContribuintes =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(2, dadosContribuintes.size());
		Assert.assertEquals(
			newDadosContribuinte1,
			dadosContribuintes.get(newDadosContribuinte1.getPrimaryKey()));
		Assert.assertEquals(
			newDadosContribuinte2,
			dadosContribuintes.get(newDadosContribuinte2.getPrimaryKey()));
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereNoPrimaryKeysExist()
		throws Exception {

		long pk1 = RandomTestUtil.nextLong();

		long pk2 = RandomTestUtil.nextLong();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(pk1);
		primaryKeys.add(pk2);

		Map<Serializable, DadosContribuinte> dadosContribuintes =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertTrue(dadosContribuintes.isEmpty());
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereSomePrimaryKeysExist()
		throws Exception {

		DadosContribuinte newDadosContribuinte = addDadosContribuinte();

		long pk = RandomTestUtil.nextLong();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newDadosContribuinte.getPrimaryKey());
		primaryKeys.add(pk);

		Map<Serializable, DadosContribuinte> dadosContribuintes =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(1, dadosContribuintes.size());
		Assert.assertEquals(
			newDadosContribuinte,
			dadosContribuintes.get(newDadosContribuinte.getPrimaryKey()));
	}

	@Test
	public void testFetchByPrimaryKeysWithNoPrimaryKeys() throws Exception {
		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		Map<Serializable, DadosContribuinte> dadosContribuintes =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertTrue(dadosContribuintes.isEmpty());
	}

	@Test
	public void testFetchByPrimaryKeysWithOnePrimaryKey() throws Exception {
		DadosContribuinte newDadosContribuinte = addDadosContribuinte();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newDadosContribuinte.getPrimaryKey());

		Map<Serializable, DadosContribuinte> dadosContribuintes =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(1, dadosContribuintes.size());
		Assert.assertEquals(
			newDadosContribuinte,
			dadosContribuintes.get(newDadosContribuinte.getPrimaryKey()));
	}

	@Test
	public void testActionableDynamicQuery() throws Exception {
		final IntegerWrapper count = new IntegerWrapper();

		ActionableDynamicQuery actionableDynamicQuery =
			DadosContribuinteLocalServiceUtil.getActionableDynamicQuery();

		actionableDynamicQuery.setPerformActionMethod(
			new ActionableDynamicQuery.PerformActionMethod
				<DadosContribuinte>() {

				@Override
				public void performAction(DadosContribuinte dadosContribuinte) {
					Assert.assertNotNull(dadosContribuinte);

					count.increment();
				}

			});

		actionableDynamicQuery.performActions();

		Assert.assertEquals(count.getValue(), _persistence.countAll());
	}

	@Test
	public void testDynamicQueryByPrimaryKeyExisting() throws Exception {
		DadosContribuinte newDadosContribuinte = addDadosContribuinte();

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			DadosContribuinte.class, _dynamicQueryClassLoader);

		dynamicQuery.add(
			RestrictionsFactoryUtil.eq(
				"dadosContribuinteId",
				newDadosContribuinte.getDadosContribuinteId()));

		List<DadosContribuinte> result = _persistence.findWithDynamicQuery(
			dynamicQuery);

		Assert.assertEquals(1, result.size());

		DadosContribuinte existingDadosContribuinte = result.get(0);

		Assert.assertEquals(existingDadosContribuinte, newDadosContribuinte);
	}

	@Test
	public void testDynamicQueryByPrimaryKeyMissing() throws Exception {
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			DadosContribuinte.class, _dynamicQueryClassLoader);

		dynamicQuery.add(
			RestrictionsFactoryUtil.eq(
				"dadosContribuinteId", RandomTestUtil.nextLong()));

		List<DadosContribuinte> result = _persistence.findWithDynamicQuery(
			dynamicQuery);

		Assert.assertEquals(0, result.size());
	}

	@Test
	public void testDynamicQueryByProjectionExisting() throws Exception {
		DadosContribuinte newDadosContribuinte = addDadosContribuinte();

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			DadosContribuinte.class, _dynamicQueryClassLoader);

		dynamicQuery.setProjection(
			ProjectionFactoryUtil.property("dadosContribuinteId"));

		Object newDadosContribuinteId =
			newDadosContribuinte.getDadosContribuinteId();

		dynamicQuery.add(
			RestrictionsFactoryUtil.in(
				"dadosContribuinteId", new Object[] {newDadosContribuinteId}));

		List<Object> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(1, result.size());

		Object existingDadosContribuinteId = result.get(0);

		Assert.assertEquals(
			existingDadosContribuinteId, newDadosContribuinteId);
	}

	@Test
	public void testDynamicQueryByProjectionMissing() throws Exception {
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			DadosContribuinte.class, _dynamicQueryClassLoader);

		dynamicQuery.setProjection(
			ProjectionFactoryUtil.property("dadosContribuinteId"));

		dynamicQuery.add(
			RestrictionsFactoryUtil.in(
				"dadosContribuinteId",
				new Object[] {RandomTestUtil.nextLong()}));

		List<Object> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(0, result.size());
	}

	@Test
	public void testResetOriginalValues() throws Exception {
		DadosContribuinte newDadosContribuinte = addDadosContribuinte();

		_persistence.clearCache();

		_assertOriginalValues(
			_persistence.findByPrimaryKey(
				newDadosContribuinte.getPrimaryKey()));
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

		DadosContribuinte newDadosContribuinte = addDadosContribuinte();

		if (clearSession) {
			Session session = _persistence.openSession();

			session.flush();

			session.clear();
		}

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			DadosContribuinte.class, _dynamicQueryClassLoader);

		dynamicQuery.add(
			RestrictionsFactoryUtil.eq(
				"dadosContribuinteId",
				newDadosContribuinte.getDadosContribuinteId()));

		List<DadosContribuinte> result = _persistence.findWithDynamicQuery(
			dynamicQuery);

		_assertOriginalValues(result.get(0));
	}

	private void _assertOriginalValues(DadosContribuinte dadosContribuinte) {
		Assert.assertEquals(
			dadosContribuinte.getUuid(),
			ReflectionTestUtil.invoke(
				dadosContribuinte, "getColumnOriginalValue",
				new Class<?>[] {String.class}, "uuid_"));
		Assert.assertEquals(
			Long.valueOf(dadosContribuinte.getGroupId()),
			ReflectionTestUtil.<Long>invoke(
				dadosContribuinte, "getColumnOriginalValue",
				new Class<?>[] {String.class}, "groupId"));
	}

	protected DadosContribuinte addDadosContribuinte() throws Exception {
		long pk = RandomTestUtil.nextLong();

		DadosContribuinte dadosContribuinte = _persistence.create(pk);

		dadosContribuinte.setUuid(RandomTestUtil.randomString());

		dadosContribuinte.setCreateDate(RandomTestUtil.nextDate());

		dadosContribuinte.setModifiedDate(RandomTestUtil.nextDate());

		dadosContribuinte.setUserId(RandomTestUtil.nextLong());

		dadosContribuinte.setGroupId(RandomTestUtil.nextLong());

		dadosContribuinte.setCompanyId(RandomTestUtil.nextLong());

		dadosContribuinte.setQualificacaoId(RandomTestUtil.nextLong());

		dadosContribuinte.setPropostaId(RandomTestUtil.nextLong());

		_dadosContribuintes.add(_persistence.update(dadosContribuinte));

		return dadosContribuinte;
	}

	private List<DadosContribuinte> _dadosContribuintes =
		new ArrayList<DadosContribuinte>();
	private DadosContribuintePersistence _persistence;
	private ClassLoader _dynamicQueryClassLoader;

}
/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.persistence.test;

import br.com.seatecnologia.gdf.negocia.exception.NoSuchQualificacaoContribuinteException;
import br.com.seatecnologia.gdf.negocia.model.QualificacaoContribuinte;
import br.com.seatecnologia.gdf.negocia.service.QualificacaoContribuinteLocalServiceUtil;
import br.com.seatecnologia.gdf.negocia.service.persistence.QualificacaoContribuintePersistence;
import br.com.seatecnologia.gdf.negocia.service.persistence.QualificacaoContribuinteUtil;

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
public class QualificacaoContribuintePersistenceTest {

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
		_persistence = QualificacaoContribuinteUtil.getPersistence();

		Class<?> clazz = _persistence.getClass();

		_dynamicQueryClassLoader = clazz.getClassLoader();
	}

	@After
	public void tearDown() throws Exception {
		Iterator<QualificacaoContribuinte> iterator =
			_qualificacaoContribuintes.iterator();

		while (iterator.hasNext()) {
			_persistence.remove(iterator.next());

			iterator.remove();
		}
	}

	@Test
	public void testCreate() throws Exception {
		long pk = RandomTestUtil.nextLong();

		QualificacaoContribuinte qualificacaoContribuinte = _persistence.create(
			pk);

		Assert.assertNotNull(qualificacaoContribuinte);

		Assert.assertEquals(qualificacaoContribuinte.getPrimaryKey(), pk);
	}

	@Test
	public void testRemove() throws Exception {
		QualificacaoContribuinte newQualificacaoContribuinte =
			addQualificacaoContribuinte();

		_persistence.remove(newQualificacaoContribuinte);

		QualificacaoContribuinte existingQualificacaoContribuinte =
			_persistence.fetchByPrimaryKey(
				newQualificacaoContribuinte.getPrimaryKey());

		Assert.assertNull(existingQualificacaoContribuinte);
	}

	@Test
	public void testUpdateNew() throws Exception {
		addQualificacaoContribuinte();
	}

	@Test
	public void testUpdateExisting() throws Exception {
		long pk = RandomTestUtil.nextLong();

		QualificacaoContribuinte newQualificacaoContribuinte =
			_persistence.create(pk);

		newQualificacaoContribuinte.setUuid(RandomTestUtil.randomString());

		newQualificacaoContribuinte.setDadosContribuinteId(
			RandomTestUtil.nextLong());

		newQualificacaoContribuinte.setQualificacaoId(
			RandomTestUtil.nextLong());

		newQualificacaoContribuinte.setCreateDate(RandomTestUtil.nextDate());

		newQualificacaoContribuinte.setModifiedDate(RandomTestUtil.nextDate());

		newQualificacaoContribuinte.setUserId(RandomTestUtil.nextLong());

		newQualificacaoContribuinte.setGroupId(RandomTestUtil.nextLong());

		newQualificacaoContribuinte.setCompanyId(RandomTestUtil.nextLong());

		newQualificacaoContribuinte.setTipoQualificacao(
			RandomTestUtil.randomString());

		_qualificacaoContribuintes.add(
			_persistence.update(newQualificacaoContribuinte));

		QualificacaoContribuinte existingQualificacaoContribuinte =
			_persistence.findByPrimaryKey(
				newQualificacaoContribuinte.getPrimaryKey());

		Assert.assertEquals(
			existingQualificacaoContribuinte.getUuid(),
			newQualificacaoContribuinte.getUuid());
		Assert.assertEquals(
			existingQualificacaoContribuinte.getQualificacaoContribuinteId(),
			newQualificacaoContribuinte.getQualificacaoContribuinteId());
		Assert.assertEquals(
			existingQualificacaoContribuinte.getDadosContribuinteId(),
			newQualificacaoContribuinte.getDadosContribuinteId());
		Assert.assertEquals(
			existingQualificacaoContribuinte.getQualificacaoId(),
			newQualificacaoContribuinte.getQualificacaoId());
		Assert.assertEquals(
			Time.getShortTimestamp(
				existingQualificacaoContribuinte.getCreateDate()),
			Time.getShortTimestamp(
				newQualificacaoContribuinte.getCreateDate()));
		Assert.assertEquals(
			Time.getShortTimestamp(
				existingQualificacaoContribuinte.getModifiedDate()),
			Time.getShortTimestamp(
				newQualificacaoContribuinte.getModifiedDate()));
		Assert.assertEquals(
			existingQualificacaoContribuinte.getUserId(),
			newQualificacaoContribuinte.getUserId());
		Assert.assertEquals(
			existingQualificacaoContribuinte.getGroupId(),
			newQualificacaoContribuinte.getGroupId());
		Assert.assertEquals(
			existingQualificacaoContribuinte.getCompanyId(),
			newQualificacaoContribuinte.getCompanyId());
		Assert.assertEquals(
			existingQualificacaoContribuinte.getTipoQualificacao(),
			newQualificacaoContribuinte.getTipoQualificacao());
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
		QualificacaoContribuinte newQualificacaoContribuinte =
			addQualificacaoContribuinte();

		QualificacaoContribuinte existingQualificacaoContribuinte =
			_persistence.findByPrimaryKey(
				newQualificacaoContribuinte.getPrimaryKey());

		Assert.assertEquals(
			existingQualificacaoContribuinte, newQualificacaoContribuinte);
	}

	@Test(expected = NoSuchQualificacaoContribuinteException.class)
	public void testFindByPrimaryKeyMissing() throws Exception {
		long pk = RandomTestUtil.nextLong();

		_persistence.findByPrimaryKey(pk);
	}

	@Test
	public void testFindAll() throws Exception {
		_persistence.findAll(
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, getOrderByComparator());
	}

	protected OrderByComparator<QualificacaoContribuinte>
		getOrderByComparator() {

		return OrderByComparatorFactoryUtil.create(
			"GDF_QualificacaoContribuinte", "uuid", true,
			"qualificacaoContribuinteId", true, "dadosContribuinteId", true,
			"qualificacaoId", true, "createDate", true, "modifiedDate", true,
			"userId", true, "groupId", true, "companyId", true,
			"tipoQualificacao", true);
	}

	@Test
	public void testFetchByPrimaryKeyExisting() throws Exception {
		QualificacaoContribuinte newQualificacaoContribuinte =
			addQualificacaoContribuinte();

		QualificacaoContribuinte existingQualificacaoContribuinte =
			_persistence.fetchByPrimaryKey(
				newQualificacaoContribuinte.getPrimaryKey());

		Assert.assertEquals(
			existingQualificacaoContribuinte, newQualificacaoContribuinte);
	}

	@Test
	public void testFetchByPrimaryKeyMissing() throws Exception {
		long pk = RandomTestUtil.nextLong();

		QualificacaoContribuinte missingQualificacaoContribuinte =
			_persistence.fetchByPrimaryKey(pk);

		Assert.assertNull(missingQualificacaoContribuinte);
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereAllPrimaryKeysExist()
		throws Exception {

		QualificacaoContribuinte newQualificacaoContribuinte1 =
			addQualificacaoContribuinte();
		QualificacaoContribuinte newQualificacaoContribuinte2 =
			addQualificacaoContribuinte();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newQualificacaoContribuinte1.getPrimaryKey());
		primaryKeys.add(newQualificacaoContribuinte2.getPrimaryKey());

		Map<Serializable, QualificacaoContribuinte> qualificacaoContribuintes =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(2, qualificacaoContribuintes.size());
		Assert.assertEquals(
			newQualificacaoContribuinte1,
			qualificacaoContribuintes.get(
				newQualificacaoContribuinte1.getPrimaryKey()));
		Assert.assertEquals(
			newQualificacaoContribuinte2,
			qualificacaoContribuintes.get(
				newQualificacaoContribuinte2.getPrimaryKey()));
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereNoPrimaryKeysExist()
		throws Exception {

		long pk1 = RandomTestUtil.nextLong();

		long pk2 = RandomTestUtil.nextLong();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(pk1);
		primaryKeys.add(pk2);

		Map<Serializable, QualificacaoContribuinte> qualificacaoContribuintes =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertTrue(qualificacaoContribuintes.isEmpty());
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereSomePrimaryKeysExist()
		throws Exception {

		QualificacaoContribuinte newQualificacaoContribuinte =
			addQualificacaoContribuinte();

		long pk = RandomTestUtil.nextLong();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newQualificacaoContribuinte.getPrimaryKey());
		primaryKeys.add(pk);

		Map<Serializable, QualificacaoContribuinte> qualificacaoContribuintes =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(1, qualificacaoContribuintes.size());
		Assert.assertEquals(
			newQualificacaoContribuinte,
			qualificacaoContribuintes.get(
				newQualificacaoContribuinte.getPrimaryKey()));
	}

	@Test
	public void testFetchByPrimaryKeysWithNoPrimaryKeys() throws Exception {
		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		Map<Serializable, QualificacaoContribuinte> qualificacaoContribuintes =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertTrue(qualificacaoContribuintes.isEmpty());
	}

	@Test
	public void testFetchByPrimaryKeysWithOnePrimaryKey() throws Exception {
		QualificacaoContribuinte newQualificacaoContribuinte =
			addQualificacaoContribuinte();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newQualificacaoContribuinte.getPrimaryKey());

		Map<Serializable, QualificacaoContribuinte> qualificacaoContribuintes =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(1, qualificacaoContribuintes.size());
		Assert.assertEquals(
			newQualificacaoContribuinte,
			qualificacaoContribuintes.get(
				newQualificacaoContribuinte.getPrimaryKey()));
	}

	@Test
	public void testActionableDynamicQuery() throws Exception {
		final IntegerWrapper count = new IntegerWrapper();

		ActionableDynamicQuery actionableDynamicQuery =
			QualificacaoContribuinteLocalServiceUtil.
				getActionableDynamicQuery();

		actionableDynamicQuery.setPerformActionMethod(
			new ActionableDynamicQuery.PerformActionMethod
				<QualificacaoContribuinte>() {

				@Override
				public void performAction(
					QualificacaoContribuinte qualificacaoContribuinte) {

					Assert.assertNotNull(qualificacaoContribuinte);

					count.increment();
				}

			});

		actionableDynamicQuery.performActions();

		Assert.assertEquals(count.getValue(), _persistence.countAll());
	}

	@Test
	public void testDynamicQueryByPrimaryKeyExisting() throws Exception {
		QualificacaoContribuinte newQualificacaoContribuinte =
			addQualificacaoContribuinte();

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			QualificacaoContribuinte.class, _dynamicQueryClassLoader);

		dynamicQuery.add(
			RestrictionsFactoryUtil.eq(
				"qualificacaoContribuinteId",
				newQualificacaoContribuinte.getQualificacaoContribuinteId()));

		List<QualificacaoContribuinte> result =
			_persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(1, result.size());

		QualificacaoContribuinte existingQualificacaoContribuinte = result.get(
			0);

		Assert.assertEquals(
			existingQualificacaoContribuinte, newQualificacaoContribuinte);
	}

	@Test
	public void testDynamicQueryByPrimaryKeyMissing() throws Exception {
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			QualificacaoContribuinte.class, _dynamicQueryClassLoader);

		dynamicQuery.add(
			RestrictionsFactoryUtil.eq(
				"qualificacaoContribuinteId", RandomTestUtil.nextLong()));

		List<QualificacaoContribuinte> result =
			_persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(0, result.size());
	}

	@Test
	public void testDynamicQueryByProjectionExisting() throws Exception {
		QualificacaoContribuinte newQualificacaoContribuinte =
			addQualificacaoContribuinte();

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			QualificacaoContribuinte.class, _dynamicQueryClassLoader);

		dynamicQuery.setProjection(
			ProjectionFactoryUtil.property("qualificacaoContribuinteId"));

		Object newQualificacaoContribuinteId =
			newQualificacaoContribuinte.getQualificacaoContribuinteId();

		dynamicQuery.add(
			RestrictionsFactoryUtil.in(
				"qualificacaoContribuinteId",
				new Object[] {newQualificacaoContribuinteId}));

		List<Object> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(1, result.size());

		Object existingQualificacaoContribuinteId = result.get(0);

		Assert.assertEquals(
			existingQualificacaoContribuinteId, newQualificacaoContribuinteId);
	}

	@Test
	public void testDynamicQueryByProjectionMissing() throws Exception {
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			QualificacaoContribuinte.class, _dynamicQueryClassLoader);

		dynamicQuery.setProjection(
			ProjectionFactoryUtil.property("qualificacaoContribuinteId"));

		dynamicQuery.add(
			RestrictionsFactoryUtil.in(
				"qualificacaoContribuinteId",
				new Object[] {RandomTestUtil.nextLong()}));

		List<Object> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(0, result.size());
	}

	@Test
	public void testResetOriginalValues() throws Exception {
		QualificacaoContribuinte newQualificacaoContribuinte =
			addQualificacaoContribuinte();

		_persistence.clearCache();

		_assertOriginalValues(
			_persistence.findByPrimaryKey(
				newQualificacaoContribuinte.getPrimaryKey()));
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

		QualificacaoContribuinte newQualificacaoContribuinte =
			addQualificacaoContribuinte();

		if (clearSession) {
			Session session = _persistence.openSession();

			session.flush();

			session.clear();
		}

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			QualificacaoContribuinte.class, _dynamicQueryClassLoader);

		dynamicQuery.add(
			RestrictionsFactoryUtil.eq(
				"qualificacaoContribuinteId",
				newQualificacaoContribuinte.getQualificacaoContribuinteId()));

		List<QualificacaoContribuinte> result =
			_persistence.findWithDynamicQuery(dynamicQuery);

		_assertOriginalValues(result.get(0));
	}

	private void _assertOriginalValues(
		QualificacaoContribuinte qualificacaoContribuinte) {

		Assert.assertEquals(
			qualificacaoContribuinte.getUuid(),
			ReflectionTestUtil.invoke(
				qualificacaoContribuinte, "getColumnOriginalValue",
				new Class<?>[] {String.class}, "uuid_"));
		Assert.assertEquals(
			Long.valueOf(qualificacaoContribuinte.getGroupId()),
			ReflectionTestUtil.<Long>invoke(
				qualificacaoContribuinte, "getColumnOriginalValue",
				new Class<?>[] {String.class}, "groupId"));
	}

	protected QualificacaoContribuinte addQualificacaoContribuinte()
		throws Exception {

		long pk = RandomTestUtil.nextLong();

		QualificacaoContribuinte qualificacaoContribuinte = _persistence.create(
			pk);

		qualificacaoContribuinte.setUuid(RandomTestUtil.randomString());

		qualificacaoContribuinte.setDadosContribuinteId(
			RandomTestUtil.nextLong());

		qualificacaoContribuinte.setQualificacaoId(RandomTestUtil.nextLong());

		qualificacaoContribuinte.setCreateDate(RandomTestUtil.nextDate());

		qualificacaoContribuinte.setModifiedDate(RandomTestUtil.nextDate());

		qualificacaoContribuinte.setUserId(RandomTestUtil.nextLong());

		qualificacaoContribuinte.setGroupId(RandomTestUtil.nextLong());

		qualificacaoContribuinte.setCompanyId(RandomTestUtil.nextLong());

		qualificacaoContribuinte.setTipoQualificacao(
			RandomTestUtil.randomString());

		_qualificacaoContribuintes.add(
			_persistence.update(qualificacaoContribuinte));

		return qualificacaoContribuinte;
	}

	private List<QualificacaoContribuinte> _qualificacaoContribuintes =
		new ArrayList<QualificacaoContribuinte>();
	private QualificacaoContribuintePersistence _persistence;
	private ClassLoader _dynamicQueryClassLoader;

}
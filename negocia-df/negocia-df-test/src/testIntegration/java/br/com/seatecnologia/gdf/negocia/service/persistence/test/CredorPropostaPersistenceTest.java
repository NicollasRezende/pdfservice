/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.persistence.test;

import br.com.seatecnologia.gdf.negocia.exception.NoSuchCredorPropostaException;
import br.com.seatecnologia.gdf.negocia.model.CredorProposta;
import br.com.seatecnologia.gdf.negocia.service.CredorPropostaLocalServiceUtil;
import br.com.seatecnologia.gdf.negocia.service.persistence.CredorPropostaPersistence;
import br.com.seatecnologia.gdf.negocia.service.persistence.CredorPropostaUtil;

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
public class CredorPropostaPersistenceTest {

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
		_persistence = CredorPropostaUtil.getPersistence();

		Class<?> clazz = _persistence.getClass();

		_dynamicQueryClassLoader = clazz.getClassLoader();
	}

	@After
	public void tearDown() throws Exception {
		Iterator<CredorProposta> iterator = _credorPropostas.iterator();

		while (iterator.hasNext()) {
			_persistence.remove(iterator.next());

			iterator.remove();
		}
	}

	@Test
	public void testCreate() throws Exception {
		long pk = RandomTestUtil.nextLong();

		CredorProposta credorProposta = _persistence.create(pk);

		Assert.assertNotNull(credorProposta);

		Assert.assertEquals(credorProposta.getPrimaryKey(), pk);
	}

	@Test
	public void testRemove() throws Exception {
		CredorProposta newCredorProposta = addCredorProposta();

		_persistence.remove(newCredorProposta);

		CredorProposta existingCredorProposta = _persistence.fetchByPrimaryKey(
			newCredorProposta.getPrimaryKey());

		Assert.assertNull(existingCredorProposta);
	}

	@Test
	public void testUpdateNew() throws Exception {
		addCredorProposta();
	}

	@Test
	public void testUpdateExisting() throws Exception {
		long pk = RandomTestUtil.nextLong();

		CredorProposta newCredorProposta = _persistence.create(pk);

		newCredorProposta.setUuid(RandomTestUtil.randomString());

		newCredorProposta.setPropostaId(RandomTestUtil.nextLong());

		newCredorProposta.setCredorId(RandomTestUtil.nextLong());

		_credorPropostas.add(_persistence.update(newCredorProposta));

		CredorProposta existingCredorProposta = _persistence.findByPrimaryKey(
			newCredorProposta.getPrimaryKey());

		Assert.assertEquals(
			existingCredorProposta.getUuid(), newCredorProposta.getUuid());
		Assert.assertEquals(
			existingCredorProposta.getCredorPropostaId(),
			newCredorProposta.getCredorPropostaId());
		Assert.assertEquals(
			existingCredorProposta.getPropostaId(),
			newCredorProposta.getPropostaId());
		Assert.assertEquals(
			existingCredorProposta.getCredorId(),
			newCredorProposta.getCredorId());
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
		CredorProposta newCredorProposta = addCredorProposta();

		CredorProposta existingCredorProposta = _persistence.findByPrimaryKey(
			newCredorProposta.getPrimaryKey());

		Assert.assertEquals(existingCredorProposta, newCredorProposta);
	}

	@Test(expected = NoSuchCredorPropostaException.class)
	public void testFindByPrimaryKeyMissing() throws Exception {
		long pk = RandomTestUtil.nextLong();

		_persistence.findByPrimaryKey(pk);
	}

	@Test
	public void testFindAll() throws Exception {
		_persistence.findAll(
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, getOrderByComparator());
	}

	protected OrderByComparator<CredorProposta> getOrderByComparator() {
		return OrderByComparatorFactoryUtil.create(
			"GDF_CredorProposta", "uuid", true, "credorPropostaId", true,
			"propostaId", true, "credorId", true);
	}

	@Test
	public void testFetchByPrimaryKeyExisting() throws Exception {
		CredorProposta newCredorProposta = addCredorProposta();

		CredorProposta existingCredorProposta = _persistence.fetchByPrimaryKey(
			newCredorProposta.getPrimaryKey());

		Assert.assertEquals(existingCredorProposta, newCredorProposta);
	}

	@Test
	public void testFetchByPrimaryKeyMissing() throws Exception {
		long pk = RandomTestUtil.nextLong();

		CredorProposta missingCredorProposta = _persistence.fetchByPrimaryKey(
			pk);

		Assert.assertNull(missingCredorProposta);
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereAllPrimaryKeysExist()
		throws Exception {

		CredorProposta newCredorProposta1 = addCredorProposta();
		CredorProposta newCredorProposta2 = addCredorProposta();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newCredorProposta1.getPrimaryKey());
		primaryKeys.add(newCredorProposta2.getPrimaryKey());

		Map<Serializable, CredorProposta> credorPropostas =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(2, credorPropostas.size());
		Assert.assertEquals(
			newCredorProposta1,
			credorPropostas.get(newCredorProposta1.getPrimaryKey()));
		Assert.assertEquals(
			newCredorProposta2,
			credorPropostas.get(newCredorProposta2.getPrimaryKey()));
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereNoPrimaryKeysExist()
		throws Exception {

		long pk1 = RandomTestUtil.nextLong();

		long pk2 = RandomTestUtil.nextLong();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(pk1);
		primaryKeys.add(pk2);

		Map<Serializable, CredorProposta> credorPropostas =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertTrue(credorPropostas.isEmpty());
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereSomePrimaryKeysExist()
		throws Exception {

		CredorProposta newCredorProposta = addCredorProposta();

		long pk = RandomTestUtil.nextLong();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newCredorProposta.getPrimaryKey());
		primaryKeys.add(pk);

		Map<Serializable, CredorProposta> credorPropostas =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(1, credorPropostas.size());
		Assert.assertEquals(
			newCredorProposta,
			credorPropostas.get(newCredorProposta.getPrimaryKey()));
	}

	@Test
	public void testFetchByPrimaryKeysWithNoPrimaryKeys() throws Exception {
		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		Map<Serializable, CredorProposta> credorPropostas =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertTrue(credorPropostas.isEmpty());
	}

	@Test
	public void testFetchByPrimaryKeysWithOnePrimaryKey() throws Exception {
		CredorProposta newCredorProposta = addCredorProposta();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newCredorProposta.getPrimaryKey());

		Map<Serializable, CredorProposta> credorPropostas =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(1, credorPropostas.size());
		Assert.assertEquals(
			newCredorProposta,
			credorPropostas.get(newCredorProposta.getPrimaryKey()));
	}

	@Test
	public void testActionableDynamicQuery() throws Exception {
		final IntegerWrapper count = new IntegerWrapper();

		ActionableDynamicQuery actionableDynamicQuery =
			CredorPropostaLocalServiceUtil.getActionableDynamicQuery();

		actionableDynamicQuery.setPerformActionMethod(
			new ActionableDynamicQuery.PerformActionMethod<CredorProposta>() {

				@Override
				public void performAction(CredorProposta credorProposta) {
					Assert.assertNotNull(credorProposta);

					count.increment();
				}

			});

		actionableDynamicQuery.performActions();

		Assert.assertEquals(count.getValue(), _persistence.countAll());
	}

	@Test
	public void testDynamicQueryByPrimaryKeyExisting() throws Exception {
		CredorProposta newCredorProposta = addCredorProposta();

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			CredorProposta.class, _dynamicQueryClassLoader);

		dynamicQuery.add(
			RestrictionsFactoryUtil.eq(
				"credorPropostaId", newCredorProposta.getCredorPropostaId()));

		List<CredorProposta> result = _persistence.findWithDynamicQuery(
			dynamicQuery);

		Assert.assertEquals(1, result.size());

		CredorProposta existingCredorProposta = result.get(0);

		Assert.assertEquals(existingCredorProposta, newCredorProposta);
	}

	@Test
	public void testDynamicQueryByPrimaryKeyMissing() throws Exception {
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			CredorProposta.class, _dynamicQueryClassLoader);

		dynamicQuery.add(
			RestrictionsFactoryUtil.eq(
				"credorPropostaId", RandomTestUtil.nextLong()));

		List<CredorProposta> result = _persistence.findWithDynamicQuery(
			dynamicQuery);

		Assert.assertEquals(0, result.size());
	}

	@Test
	public void testDynamicQueryByProjectionExisting() throws Exception {
		CredorProposta newCredorProposta = addCredorProposta();

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			CredorProposta.class, _dynamicQueryClassLoader);

		dynamicQuery.setProjection(
			ProjectionFactoryUtil.property("credorPropostaId"));

		Object newCredorPropostaId = newCredorProposta.getCredorPropostaId();

		dynamicQuery.add(
			RestrictionsFactoryUtil.in(
				"credorPropostaId", new Object[] {newCredorPropostaId}));

		List<Object> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(1, result.size());

		Object existingCredorPropostaId = result.get(0);

		Assert.assertEquals(existingCredorPropostaId, newCredorPropostaId);
	}

	@Test
	public void testDynamicQueryByProjectionMissing() throws Exception {
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			CredorProposta.class, _dynamicQueryClassLoader);

		dynamicQuery.setProjection(
			ProjectionFactoryUtil.property("credorPropostaId"));

		dynamicQuery.add(
			RestrictionsFactoryUtil.in(
				"credorPropostaId", new Object[] {RandomTestUtil.nextLong()}));

		List<Object> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(0, result.size());
	}

	protected CredorProposta addCredorProposta() throws Exception {
		long pk = RandomTestUtil.nextLong();

		CredorProposta credorProposta = _persistence.create(pk);

		credorProposta.setUuid(RandomTestUtil.randomString());

		credorProposta.setPropostaId(RandomTestUtil.nextLong());

		credorProposta.setCredorId(RandomTestUtil.nextLong());

		_credorPropostas.add(_persistence.update(credorProposta));

		return credorProposta;
	}

	private List<CredorProposta> _credorPropostas =
		new ArrayList<CredorProposta>();
	private CredorPropostaPersistence _persistence;
	private ClassLoader _dynamicQueryClassLoader;

}
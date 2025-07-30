/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.persistence.test;

import br.com.seatecnologia.gdf.negocia.exception.NoSuchConcessaoDfException;
import br.com.seatecnologia.gdf.negocia.model.ConcessaoDf;
import br.com.seatecnologia.gdf.negocia.service.ConcessaoDfLocalServiceUtil;
import br.com.seatecnologia.gdf.negocia.service.persistence.ConcessaoDfPersistence;
import br.com.seatecnologia.gdf.negocia.service.persistence.ConcessaoDfUtil;

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
public class ConcessaoDfPersistenceTest {

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
		_persistence = ConcessaoDfUtil.getPersistence();

		Class<?> clazz = _persistence.getClass();

		_dynamicQueryClassLoader = clazz.getClassLoader();
	}

	@After
	public void tearDown() throws Exception {
		Iterator<ConcessaoDf> iterator = _concessaoDfs.iterator();

		while (iterator.hasNext()) {
			_persistence.remove(iterator.next());

			iterator.remove();
		}
	}

	@Test
	public void testCreate() throws Exception {
		long pk = RandomTestUtil.nextLong();

		ConcessaoDf concessaoDf = _persistence.create(pk);

		Assert.assertNotNull(concessaoDf);

		Assert.assertEquals(concessaoDf.getPrimaryKey(), pk);
	}

	@Test
	public void testRemove() throws Exception {
		ConcessaoDf newConcessaoDf = addConcessaoDf();

		_persistence.remove(newConcessaoDf);

		ConcessaoDf existingConcessaoDf = _persistence.fetchByPrimaryKey(
			newConcessaoDf.getPrimaryKey());

		Assert.assertNull(existingConcessaoDf);
	}

	@Test
	public void testUpdateNew() throws Exception {
		addConcessaoDf();
	}

	@Test
	public void testUpdateExisting() throws Exception {
		long pk = RandomTestUtil.nextLong();

		ConcessaoDf newConcessaoDf = _persistence.create(pk);

		newConcessaoDf.setUuid(RandomTestUtil.randomString());

		newConcessaoDf.setPropostaId(RandomTestUtil.nextLong());

		newConcessaoDf.setPercentualDescontoJuros(RandomTestUtil.nextDouble());

		newConcessaoDf.setPercentualDescontoPrincipal(
			RandomTestUtil.nextDouble());

		newConcessaoDf.setObservacoes(RandomTestUtil.randomString());

		_concessaoDfs.add(_persistence.update(newConcessaoDf));

		ConcessaoDf existingConcessaoDf = _persistence.findByPrimaryKey(
			newConcessaoDf.getPrimaryKey());

		Assert.assertEquals(
			existingConcessaoDf.getUuid(), newConcessaoDf.getUuid());
		Assert.assertEquals(
			existingConcessaoDf.getConcessaoId(),
			newConcessaoDf.getConcessaoId());
		Assert.assertEquals(
			existingConcessaoDf.getPropostaId(),
			newConcessaoDf.getPropostaId());
		AssertUtils.assertEquals(
			existingConcessaoDf.getPercentualDescontoJuros(),
			newConcessaoDf.getPercentualDescontoJuros());
		AssertUtils.assertEquals(
			existingConcessaoDf.getPercentualDescontoPrincipal(),
			newConcessaoDf.getPercentualDescontoPrincipal());
		Assert.assertEquals(
			existingConcessaoDf.getObservacoes(),
			newConcessaoDf.getObservacoes());
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
		ConcessaoDf newConcessaoDf = addConcessaoDf();

		ConcessaoDf existingConcessaoDf = _persistence.findByPrimaryKey(
			newConcessaoDf.getPrimaryKey());

		Assert.assertEquals(existingConcessaoDf, newConcessaoDf);
	}

	@Test(expected = NoSuchConcessaoDfException.class)
	public void testFindByPrimaryKeyMissing() throws Exception {
		long pk = RandomTestUtil.nextLong();

		_persistence.findByPrimaryKey(pk);
	}

	@Test
	public void testFindAll() throws Exception {
		_persistence.findAll(
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, getOrderByComparator());
	}

	protected OrderByComparator<ConcessaoDf> getOrderByComparator() {
		return OrderByComparatorFactoryUtil.create(
			"GDF_ConcessaoDf", "uuid", true, "concessaoId", true, "propostaId",
			true, "percentualDescontoJuros", true,
			"percentualDescontoPrincipal", true, "observacoes", true);
	}

	@Test
	public void testFetchByPrimaryKeyExisting() throws Exception {
		ConcessaoDf newConcessaoDf = addConcessaoDf();

		ConcessaoDf existingConcessaoDf = _persistence.fetchByPrimaryKey(
			newConcessaoDf.getPrimaryKey());

		Assert.assertEquals(existingConcessaoDf, newConcessaoDf);
	}

	@Test
	public void testFetchByPrimaryKeyMissing() throws Exception {
		long pk = RandomTestUtil.nextLong();

		ConcessaoDf missingConcessaoDf = _persistence.fetchByPrimaryKey(pk);

		Assert.assertNull(missingConcessaoDf);
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereAllPrimaryKeysExist()
		throws Exception {

		ConcessaoDf newConcessaoDf1 = addConcessaoDf();
		ConcessaoDf newConcessaoDf2 = addConcessaoDf();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newConcessaoDf1.getPrimaryKey());
		primaryKeys.add(newConcessaoDf2.getPrimaryKey());

		Map<Serializable, ConcessaoDf> concessaoDfs =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(2, concessaoDfs.size());
		Assert.assertEquals(
			newConcessaoDf1, concessaoDfs.get(newConcessaoDf1.getPrimaryKey()));
		Assert.assertEquals(
			newConcessaoDf2, concessaoDfs.get(newConcessaoDf2.getPrimaryKey()));
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereNoPrimaryKeysExist()
		throws Exception {

		long pk1 = RandomTestUtil.nextLong();

		long pk2 = RandomTestUtil.nextLong();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(pk1);
		primaryKeys.add(pk2);

		Map<Serializable, ConcessaoDf> concessaoDfs =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertTrue(concessaoDfs.isEmpty());
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereSomePrimaryKeysExist()
		throws Exception {

		ConcessaoDf newConcessaoDf = addConcessaoDf();

		long pk = RandomTestUtil.nextLong();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newConcessaoDf.getPrimaryKey());
		primaryKeys.add(pk);

		Map<Serializable, ConcessaoDf> concessaoDfs =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(1, concessaoDfs.size());
		Assert.assertEquals(
			newConcessaoDf, concessaoDfs.get(newConcessaoDf.getPrimaryKey()));
	}

	@Test
	public void testFetchByPrimaryKeysWithNoPrimaryKeys() throws Exception {
		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		Map<Serializable, ConcessaoDf> concessaoDfs =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertTrue(concessaoDfs.isEmpty());
	}

	@Test
	public void testFetchByPrimaryKeysWithOnePrimaryKey() throws Exception {
		ConcessaoDf newConcessaoDf = addConcessaoDf();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newConcessaoDf.getPrimaryKey());

		Map<Serializable, ConcessaoDf> concessaoDfs =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(1, concessaoDfs.size());
		Assert.assertEquals(
			newConcessaoDf, concessaoDfs.get(newConcessaoDf.getPrimaryKey()));
	}

	@Test
	public void testActionableDynamicQuery() throws Exception {
		final IntegerWrapper count = new IntegerWrapper();

		ActionableDynamicQuery actionableDynamicQuery =
			ConcessaoDfLocalServiceUtil.getActionableDynamicQuery();

		actionableDynamicQuery.setPerformActionMethod(
			new ActionableDynamicQuery.PerformActionMethod<ConcessaoDf>() {

				@Override
				public void performAction(ConcessaoDf concessaoDf) {
					Assert.assertNotNull(concessaoDf);

					count.increment();
				}

			});

		actionableDynamicQuery.performActions();

		Assert.assertEquals(count.getValue(), _persistence.countAll());
	}

	@Test
	public void testDynamicQueryByPrimaryKeyExisting() throws Exception {
		ConcessaoDf newConcessaoDf = addConcessaoDf();

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			ConcessaoDf.class, _dynamicQueryClassLoader);

		dynamicQuery.add(
			RestrictionsFactoryUtil.eq(
				"concessaoId", newConcessaoDf.getConcessaoId()));

		List<ConcessaoDf> result = _persistence.findWithDynamicQuery(
			dynamicQuery);

		Assert.assertEquals(1, result.size());

		ConcessaoDf existingConcessaoDf = result.get(0);

		Assert.assertEquals(existingConcessaoDf, newConcessaoDf);
	}

	@Test
	public void testDynamicQueryByPrimaryKeyMissing() throws Exception {
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			ConcessaoDf.class, _dynamicQueryClassLoader);

		dynamicQuery.add(
			RestrictionsFactoryUtil.eq(
				"concessaoId", RandomTestUtil.nextLong()));

		List<ConcessaoDf> result = _persistence.findWithDynamicQuery(
			dynamicQuery);

		Assert.assertEquals(0, result.size());
	}

	@Test
	public void testDynamicQueryByProjectionExisting() throws Exception {
		ConcessaoDf newConcessaoDf = addConcessaoDf();

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			ConcessaoDf.class, _dynamicQueryClassLoader);

		dynamicQuery.setProjection(
			ProjectionFactoryUtil.property("concessaoId"));

		Object newConcessaoId = newConcessaoDf.getConcessaoId();

		dynamicQuery.add(
			RestrictionsFactoryUtil.in(
				"concessaoId", new Object[] {newConcessaoId}));

		List<Object> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(1, result.size());

		Object existingConcessaoId = result.get(0);

		Assert.assertEquals(existingConcessaoId, newConcessaoId);
	}

	@Test
	public void testDynamicQueryByProjectionMissing() throws Exception {
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			ConcessaoDf.class, _dynamicQueryClassLoader);

		dynamicQuery.setProjection(
			ProjectionFactoryUtil.property("concessaoId"));

		dynamicQuery.add(
			RestrictionsFactoryUtil.in(
				"concessaoId", new Object[] {RandomTestUtil.nextLong()}));

		List<Object> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(0, result.size());
	}

	protected ConcessaoDf addConcessaoDf() throws Exception {
		long pk = RandomTestUtil.nextLong();

		ConcessaoDf concessaoDf = _persistence.create(pk);

		concessaoDf.setUuid(RandomTestUtil.randomString());

		concessaoDf.setPropostaId(RandomTestUtil.nextLong());

		concessaoDf.setPercentualDescontoJuros(RandomTestUtil.nextDouble());

		concessaoDf.setPercentualDescontoPrincipal(RandomTestUtil.nextDouble());

		concessaoDf.setObservacoes(RandomTestUtil.randomString());

		_concessaoDfs.add(_persistence.update(concessaoDf));

		return concessaoDf;
	}

	private List<ConcessaoDf> _concessaoDfs = new ArrayList<ConcessaoDf>();
	private ConcessaoDfPersistence _persistence;
	private ClassLoader _dynamicQueryClassLoader;

}
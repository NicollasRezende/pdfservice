/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.persistence.test;

import br.com.seatecnologia.gdf.negocia.exception.NoSuchBensDireitosLaudoException;
import br.com.seatecnologia.gdf.negocia.model.BensDireitosLaudo;
import br.com.seatecnologia.gdf.negocia.service.BensDireitosLaudoLocalServiceUtil;
import br.com.seatecnologia.gdf.negocia.service.persistence.BensDireitosLaudoPersistence;
import br.com.seatecnologia.gdf.negocia.service.persistence.BensDireitosLaudoUtil;

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
public class BensDireitosLaudoPersistenceTest {

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
		_persistence = BensDireitosLaudoUtil.getPersistence();

		Class<?> clazz = _persistence.getClass();

		_dynamicQueryClassLoader = clazz.getClassLoader();
	}

	@After
	public void tearDown() throws Exception {
		Iterator<BensDireitosLaudo> iterator = _bensDireitosLaudos.iterator();

		while (iterator.hasNext()) {
			_persistence.remove(iterator.next());

			iterator.remove();
		}
	}

	@Test
	public void testCreate() throws Exception {
		long pk = RandomTestUtil.nextLong();

		BensDireitosLaudo bensDireitosLaudo = _persistence.create(pk);

		Assert.assertNotNull(bensDireitosLaudo);

		Assert.assertEquals(bensDireitosLaudo.getPrimaryKey(), pk);
	}

	@Test
	public void testRemove() throws Exception {
		BensDireitosLaudo newBensDireitosLaudo = addBensDireitosLaudo();

		_persistence.remove(newBensDireitosLaudo);

		BensDireitosLaudo existingBensDireitosLaudo =
			_persistence.fetchByPrimaryKey(
				newBensDireitosLaudo.getPrimaryKey());

		Assert.assertNull(existingBensDireitosLaudo);
	}

	@Test
	public void testUpdateNew() throws Exception {
		addBensDireitosLaudo();
	}

	@Test
	public void testUpdateExisting() throws Exception {
		long pk = RandomTestUtil.nextLong();

		BensDireitosLaudo newBensDireitosLaudo = _persistence.create(pk);

		newBensDireitosLaudo.setUuid(RandomTestUtil.randomString());

		newBensDireitosLaudo.setBemId(RandomTestUtil.nextLong());

		newBensDireitosLaudo.setLaudoAvaliacao(RandomTestUtil.nextLong());

		_bensDireitosLaudos.add(_persistence.update(newBensDireitosLaudo));

		BensDireitosLaudo existingBensDireitosLaudo =
			_persistence.findByPrimaryKey(newBensDireitosLaudo.getPrimaryKey());

		Assert.assertEquals(
			existingBensDireitosLaudo.getUuid(),
			newBensDireitosLaudo.getUuid());
		Assert.assertEquals(
			existingBensDireitosLaudo.getBensDireitosLaudoId(),
			newBensDireitosLaudo.getBensDireitosLaudoId());
		Assert.assertEquals(
			existingBensDireitosLaudo.getBemId(),
			newBensDireitosLaudo.getBemId());
		Assert.assertEquals(
			existingBensDireitosLaudo.getLaudoAvaliacao(),
			newBensDireitosLaudo.getLaudoAvaliacao());
	}

	@Test
	public void testCountByUuid() throws Exception {
		_persistence.countByUuid("");

		_persistence.countByUuid("null");

		_persistence.countByUuid((String)null);
	}

	@Test
	public void testFindByPrimaryKeyExisting() throws Exception {
		BensDireitosLaudo newBensDireitosLaudo = addBensDireitosLaudo();

		BensDireitosLaudo existingBensDireitosLaudo =
			_persistence.findByPrimaryKey(newBensDireitosLaudo.getPrimaryKey());

		Assert.assertEquals(existingBensDireitosLaudo, newBensDireitosLaudo);
	}

	@Test(expected = NoSuchBensDireitosLaudoException.class)
	public void testFindByPrimaryKeyMissing() throws Exception {
		long pk = RandomTestUtil.nextLong();

		_persistence.findByPrimaryKey(pk);
	}

	@Test
	public void testFindAll() throws Exception {
		_persistence.findAll(
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, getOrderByComparator());
	}

	protected OrderByComparator<BensDireitosLaudo> getOrderByComparator() {
		return OrderByComparatorFactoryUtil.create(
			"GDF_BensDireitosLaudo", "uuid", true, "bensDireitosLaudoId", true,
			"bemId", true, "laudoAvaliacao", true);
	}

	@Test
	public void testFetchByPrimaryKeyExisting() throws Exception {
		BensDireitosLaudo newBensDireitosLaudo = addBensDireitosLaudo();

		BensDireitosLaudo existingBensDireitosLaudo =
			_persistence.fetchByPrimaryKey(
				newBensDireitosLaudo.getPrimaryKey());

		Assert.assertEquals(existingBensDireitosLaudo, newBensDireitosLaudo);
	}

	@Test
	public void testFetchByPrimaryKeyMissing() throws Exception {
		long pk = RandomTestUtil.nextLong();

		BensDireitosLaudo missingBensDireitosLaudo =
			_persistence.fetchByPrimaryKey(pk);

		Assert.assertNull(missingBensDireitosLaudo);
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereAllPrimaryKeysExist()
		throws Exception {

		BensDireitosLaudo newBensDireitosLaudo1 = addBensDireitosLaudo();
		BensDireitosLaudo newBensDireitosLaudo2 = addBensDireitosLaudo();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newBensDireitosLaudo1.getPrimaryKey());
		primaryKeys.add(newBensDireitosLaudo2.getPrimaryKey());

		Map<Serializable, BensDireitosLaudo> bensDireitosLaudos =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(2, bensDireitosLaudos.size());
		Assert.assertEquals(
			newBensDireitosLaudo1,
			bensDireitosLaudos.get(newBensDireitosLaudo1.getPrimaryKey()));
		Assert.assertEquals(
			newBensDireitosLaudo2,
			bensDireitosLaudos.get(newBensDireitosLaudo2.getPrimaryKey()));
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereNoPrimaryKeysExist()
		throws Exception {

		long pk1 = RandomTestUtil.nextLong();

		long pk2 = RandomTestUtil.nextLong();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(pk1);
		primaryKeys.add(pk2);

		Map<Serializable, BensDireitosLaudo> bensDireitosLaudos =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertTrue(bensDireitosLaudos.isEmpty());
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereSomePrimaryKeysExist()
		throws Exception {

		BensDireitosLaudo newBensDireitosLaudo = addBensDireitosLaudo();

		long pk = RandomTestUtil.nextLong();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newBensDireitosLaudo.getPrimaryKey());
		primaryKeys.add(pk);

		Map<Serializable, BensDireitosLaudo> bensDireitosLaudos =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(1, bensDireitosLaudos.size());
		Assert.assertEquals(
			newBensDireitosLaudo,
			bensDireitosLaudos.get(newBensDireitosLaudo.getPrimaryKey()));
	}

	@Test
	public void testFetchByPrimaryKeysWithNoPrimaryKeys() throws Exception {
		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		Map<Serializable, BensDireitosLaudo> bensDireitosLaudos =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertTrue(bensDireitosLaudos.isEmpty());
	}

	@Test
	public void testFetchByPrimaryKeysWithOnePrimaryKey() throws Exception {
		BensDireitosLaudo newBensDireitosLaudo = addBensDireitosLaudo();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newBensDireitosLaudo.getPrimaryKey());

		Map<Serializable, BensDireitosLaudo> bensDireitosLaudos =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(1, bensDireitosLaudos.size());
		Assert.assertEquals(
			newBensDireitosLaudo,
			bensDireitosLaudos.get(newBensDireitosLaudo.getPrimaryKey()));
	}

	@Test
	public void testActionableDynamicQuery() throws Exception {
		final IntegerWrapper count = new IntegerWrapper();

		ActionableDynamicQuery actionableDynamicQuery =
			BensDireitosLaudoLocalServiceUtil.getActionableDynamicQuery();

		actionableDynamicQuery.setPerformActionMethod(
			new ActionableDynamicQuery.PerformActionMethod
				<BensDireitosLaudo>() {

				@Override
				public void performAction(BensDireitosLaudo bensDireitosLaudo) {
					Assert.assertNotNull(bensDireitosLaudo);

					count.increment();
				}

			});

		actionableDynamicQuery.performActions();

		Assert.assertEquals(count.getValue(), _persistence.countAll());
	}

	@Test
	public void testDynamicQueryByPrimaryKeyExisting() throws Exception {
		BensDireitosLaudo newBensDireitosLaudo = addBensDireitosLaudo();

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			BensDireitosLaudo.class, _dynamicQueryClassLoader);

		dynamicQuery.add(
			RestrictionsFactoryUtil.eq(
				"bensDireitosLaudoId",
				newBensDireitosLaudo.getBensDireitosLaudoId()));

		List<BensDireitosLaudo> result = _persistence.findWithDynamicQuery(
			dynamicQuery);

		Assert.assertEquals(1, result.size());

		BensDireitosLaudo existingBensDireitosLaudo = result.get(0);

		Assert.assertEquals(existingBensDireitosLaudo, newBensDireitosLaudo);
	}

	@Test
	public void testDynamicQueryByPrimaryKeyMissing() throws Exception {
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			BensDireitosLaudo.class, _dynamicQueryClassLoader);

		dynamicQuery.add(
			RestrictionsFactoryUtil.eq(
				"bensDireitosLaudoId", RandomTestUtil.nextLong()));

		List<BensDireitosLaudo> result = _persistence.findWithDynamicQuery(
			dynamicQuery);

		Assert.assertEquals(0, result.size());
	}

	@Test
	public void testDynamicQueryByProjectionExisting() throws Exception {
		BensDireitosLaudo newBensDireitosLaudo = addBensDireitosLaudo();

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			BensDireitosLaudo.class, _dynamicQueryClassLoader);

		dynamicQuery.setProjection(
			ProjectionFactoryUtil.property("bensDireitosLaudoId"));

		Object newBensDireitosLaudoId =
			newBensDireitosLaudo.getBensDireitosLaudoId();

		dynamicQuery.add(
			RestrictionsFactoryUtil.in(
				"bensDireitosLaudoId", new Object[] {newBensDireitosLaudoId}));

		List<Object> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(1, result.size());

		Object existingBensDireitosLaudoId = result.get(0);

		Assert.assertEquals(
			existingBensDireitosLaudoId, newBensDireitosLaudoId);
	}

	@Test
	public void testDynamicQueryByProjectionMissing() throws Exception {
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			BensDireitosLaudo.class, _dynamicQueryClassLoader);

		dynamicQuery.setProjection(
			ProjectionFactoryUtil.property("bensDireitosLaudoId"));

		dynamicQuery.add(
			RestrictionsFactoryUtil.in(
				"bensDireitosLaudoId",
				new Object[] {RandomTestUtil.nextLong()}));

		List<Object> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(0, result.size());
	}

	protected BensDireitosLaudo addBensDireitosLaudo() throws Exception {
		long pk = RandomTestUtil.nextLong();

		BensDireitosLaudo bensDireitosLaudo = _persistence.create(pk);

		bensDireitosLaudo.setUuid(RandomTestUtil.randomString());

		bensDireitosLaudo.setBemId(RandomTestUtil.nextLong());

		bensDireitosLaudo.setLaudoAvaliacao(RandomTestUtil.nextLong());

		_bensDireitosLaudos.add(_persistence.update(bensDireitosLaudo));

		return bensDireitosLaudo;
	}

	private List<BensDireitosLaudo> _bensDireitosLaudos =
		new ArrayList<BensDireitosLaudo>();
	private BensDireitosLaudoPersistence _persistence;
	private ClassLoader _dynamicQueryClassLoader;

}
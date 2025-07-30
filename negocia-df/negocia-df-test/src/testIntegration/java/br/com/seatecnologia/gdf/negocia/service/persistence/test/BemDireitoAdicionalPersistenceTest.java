/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.persistence.test;

import br.com.seatecnologia.gdf.negocia.exception.NoSuchBemDireitoAdicionalException;
import br.com.seatecnologia.gdf.negocia.model.BemDireitoAdicional;
import br.com.seatecnologia.gdf.negocia.service.BemDireitoAdicionalLocalServiceUtil;
import br.com.seatecnologia.gdf.negocia.service.persistence.BemDireitoAdicionalPersistence;
import br.com.seatecnologia.gdf.negocia.service.persistence.BemDireitoAdicionalUtil;

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
public class BemDireitoAdicionalPersistenceTest {

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
		_persistence = BemDireitoAdicionalUtil.getPersistence();

		Class<?> clazz = _persistence.getClass();

		_dynamicQueryClassLoader = clazz.getClassLoader();
	}

	@After
	public void tearDown() throws Exception {
		Iterator<BemDireitoAdicional> iterator =
			_bemDireitoAdicionals.iterator();

		while (iterator.hasNext()) {
			_persistence.remove(iterator.next());

			iterator.remove();
		}
	}

	@Test
	public void testCreate() throws Exception {
		long pk = RandomTestUtil.nextLong();

		BemDireitoAdicional bemDireitoAdicional = _persistence.create(pk);

		Assert.assertNotNull(bemDireitoAdicional);

		Assert.assertEquals(bemDireitoAdicional.getPrimaryKey(), pk);
	}

	@Test
	public void testRemove() throws Exception {
		BemDireitoAdicional newBemDireitoAdicional = addBemDireitoAdicional();

		_persistence.remove(newBemDireitoAdicional);

		BemDireitoAdicional existingBemDireitoAdicional =
			_persistence.fetchByPrimaryKey(
				newBemDireitoAdicional.getPrimaryKey());

		Assert.assertNull(existingBemDireitoAdicional);
	}

	@Test
	public void testUpdateNew() throws Exception {
		addBemDireitoAdicional();
	}

	@Test
	public void testUpdateExisting() throws Exception {
		long pk = RandomTestUtil.nextLong();

		BemDireitoAdicional newBemDireitoAdicional = _persistence.create(pk);

		newBemDireitoAdicional.setUuid(RandomTestUtil.randomString());

		newBemDireitoAdicional.setPropostaId(RandomTestUtil.nextLong());

		newBemDireitoAdicional.setDescricao(RandomTestUtil.randomString());

		newBemDireitoAdicional.setLocalizacao(RandomTestUtil.randomString());

		newBemDireitoAdicional.setDestinacao(RandomTestUtil.randomString());

		newBemDireitoAdicional.setLaudoAvaliacao(RandomTestUtil.randomString());

		_bemDireitoAdicionals.add(_persistence.update(newBemDireitoAdicional));

		BemDireitoAdicional existingBemDireitoAdicional =
			_persistence.findByPrimaryKey(
				newBemDireitoAdicional.getPrimaryKey());

		Assert.assertEquals(
			existingBemDireitoAdicional.getUuid(),
			newBemDireitoAdicional.getUuid());
		Assert.assertEquals(
			existingBemDireitoAdicional.getBemId(),
			newBemDireitoAdicional.getBemId());
		Assert.assertEquals(
			existingBemDireitoAdicional.getPropostaId(),
			newBemDireitoAdicional.getPropostaId());
		Assert.assertEquals(
			existingBemDireitoAdicional.getDescricao(),
			newBemDireitoAdicional.getDescricao());
		Assert.assertEquals(
			existingBemDireitoAdicional.getLocalizacao(),
			newBemDireitoAdicional.getLocalizacao());
		Assert.assertEquals(
			existingBemDireitoAdicional.getDestinacao(),
			newBemDireitoAdicional.getDestinacao());
		Assert.assertEquals(
			existingBemDireitoAdicional.getLaudoAvaliacao(),
			newBemDireitoAdicional.getLaudoAvaliacao());
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
		BemDireitoAdicional newBemDireitoAdicional = addBemDireitoAdicional();

		BemDireitoAdicional existingBemDireitoAdicional =
			_persistence.findByPrimaryKey(
				newBemDireitoAdicional.getPrimaryKey());

		Assert.assertEquals(
			existingBemDireitoAdicional, newBemDireitoAdicional);
	}

	@Test(expected = NoSuchBemDireitoAdicionalException.class)
	public void testFindByPrimaryKeyMissing() throws Exception {
		long pk = RandomTestUtil.nextLong();

		_persistence.findByPrimaryKey(pk);
	}

	@Test
	public void testFindAll() throws Exception {
		_persistence.findAll(
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, getOrderByComparator());
	}

	protected OrderByComparator<BemDireitoAdicional> getOrderByComparator() {
		return OrderByComparatorFactoryUtil.create(
			"GDF_BemDireitoAdicional", "uuid", true, "bemId", true,
			"propostaId", true, "descricao", true, "localizacao", true,
			"destinacao", true, "laudoAvaliacao", true);
	}

	@Test
	public void testFetchByPrimaryKeyExisting() throws Exception {
		BemDireitoAdicional newBemDireitoAdicional = addBemDireitoAdicional();

		BemDireitoAdicional existingBemDireitoAdicional =
			_persistence.fetchByPrimaryKey(
				newBemDireitoAdicional.getPrimaryKey());

		Assert.assertEquals(
			existingBemDireitoAdicional, newBemDireitoAdicional);
	}

	@Test
	public void testFetchByPrimaryKeyMissing() throws Exception {
		long pk = RandomTestUtil.nextLong();

		BemDireitoAdicional missingBemDireitoAdicional =
			_persistence.fetchByPrimaryKey(pk);

		Assert.assertNull(missingBemDireitoAdicional);
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereAllPrimaryKeysExist()
		throws Exception {

		BemDireitoAdicional newBemDireitoAdicional1 = addBemDireitoAdicional();
		BemDireitoAdicional newBemDireitoAdicional2 = addBemDireitoAdicional();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newBemDireitoAdicional1.getPrimaryKey());
		primaryKeys.add(newBemDireitoAdicional2.getPrimaryKey());

		Map<Serializable, BemDireitoAdicional> bemDireitoAdicionals =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(2, bemDireitoAdicionals.size());
		Assert.assertEquals(
			newBemDireitoAdicional1,
			bemDireitoAdicionals.get(newBemDireitoAdicional1.getPrimaryKey()));
		Assert.assertEquals(
			newBemDireitoAdicional2,
			bemDireitoAdicionals.get(newBemDireitoAdicional2.getPrimaryKey()));
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereNoPrimaryKeysExist()
		throws Exception {

		long pk1 = RandomTestUtil.nextLong();

		long pk2 = RandomTestUtil.nextLong();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(pk1);
		primaryKeys.add(pk2);

		Map<Serializable, BemDireitoAdicional> bemDireitoAdicionals =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertTrue(bemDireitoAdicionals.isEmpty());
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereSomePrimaryKeysExist()
		throws Exception {

		BemDireitoAdicional newBemDireitoAdicional = addBemDireitoAdicional();

		long pk = RandomTestUtil.nextLong();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newBemDireitoAdicional.getPrimaryKey());
		primaryKeys.add(pk);

		Map<Serializable, BemDireitoAdicional> bemDireitoAdicionals =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(1, bemDireitoAdicionals.size());
		Assert.assertEquals(
			newBemDireitoAdicional,
			bemDireitoAdicionals.get(newBemDireitoAdicional.getPrimaryKey()));
	}

	@Test
	public void testFetchByPrimaryKeysWithNoPrimaryKeys() throws Exception {
		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		Map<Serializable, BemDireitoAdicional> bemDireitoAdicionals =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertTrue(bemDireitoAdicionals.isEmpty());
	}

	@Test
	public void testFetchByPrimaryKeysWithOnePrimaryKey() throws Exception {
		BemDireitoAdicional newBemDireitoAdicional = addBemDireitoAdicional();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newBemDireitoAdicional.getPrimaryKey());

		Map<Serializable, BemDireitoAdicional> bemDireitoAdicionals =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(1, bemDireitoAdicionals.size());
		Assert.assertEquals(
			newBemDireitoAdicional,
			bemDireitoAdicionals.get(newBemDireitoAdicional.getPrimaryKey()));
	}

	@Test
	public void testActionableDynamicQuery() throws Exception {
		final IntegerWrapper count = new IntegerWrapper();

		ActionableDynamicQuery actionableDynamicQuery =
			BemDireitoAdicionalLocalServiceUtil.getActionableDynamicQuery();

		actionableDynamicQuery.setPerformActionMethod(
			new ActionableDynamicQuery.PerformActionMethod
				<BemDireitoAdicional>() {

				@Override
				public void performAction(
					BemDireitoAdicional bemDireitoAdicional) {

					Assert.assertNotNull(bemDireitoAdicional);

					count.increment();
				}

			});

		actionableDynamicQuery.performActions();

		Assert.assertEquals(count.getValue(), _persistence.countAll());
	}

	@Test
	public void testDynamicQueryByPrimaryKeyExisting() throws Exception {
		BemDireitoAdicional newBemDireitoAdicional = addBemDireitoAdicional();

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			BemDireitoAdicional.class, _dynamicQueryClassLoader);

		dynamicQuery.add(
			RestrictionsFactoryUtil.eq(
				"bemId", newBemDireitoAdicional.getBemId()));

		List<BemDireitoAdicional> result = _persistence.findWithDynamicQuery(
			dynamicQuery);

		Assert.assertEquals(1, result.size());

		BemDireitoAdicional existingBemDireitoAdicional = result.get(0);

		Assert.assertEquals(
			existingBemDireitoAdicional, newBemDireitoAdicional);
	}

	@Test
	public void testDynamicQueryByPrimaryKeyMissing() throws Exception {
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			BemDireitoAdicional.class, _dynamicQueryClassLoader);

		dynamicQuery.add(
			RestrictionsFactoryUtil.eq("bemId", RandomTestUtil.nextLong()));

		List<BemDireitoAdicional> result = _persistence.findWithDynamicQuery(
			dynamicQuery);

		Assert.assertEquals(0, result.size());
	}

	@Test
	public void testDynamicQueryByProjectionExisting() throws Exception {
		BemDireitoAdicional newBemDireitoAdicional = addBemDireitoAdicional();

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			BemDireitoAdicional.class, _dynamicQueryClassLoader);

		dynamicQuery.setProjection(ProjectionFactoryUtil.property("bemId"));

		Object newBemId = newBemDireitoAdicional.getBemId();

		dynamicQuery.add(
			RestrictionsFactoryUtil.in("bemId", new Object[] {newBemId}));

		List<Object> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(1, result.size());

		Object existingBemId = result.get(0);

		Assert.assertEquals(existingBemId, newBemId);
	}

	@Test
	public void testDynamicQueryByProjectionMissing() throws Exception {
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			BemDireitoAdicional.class, _dynamicQueryClassLoader);

		dynamicQuery.setProjection(ProjectionFactoryUtil.property("bemId"));

		dynamicQuery.add(
			RestrictionsFactoryUtil.in(
				"bemId", new Object[] {RandomTestUtil.nextLong()}));

		List<Object> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(0, result.size());
	}

	protected BemDireitoAdicional addBemDireitoAdicional() throws Exception {
		long pk = RandomTestUtil.nextLong();

		BemDireitoAdicional bemDireitoAdicional = _persistence.create(pk);

		bemDireitoAdicional.setUuid(RandomTestUtil.randomString());

		bemDireitoAdicional.setPropostaId(RandomTestUtil.nextLong());

		bemDireitoAdicional.setDescricao(RandomTestUtil.randomString());

		bemDireitoAdicional.setLocalizacao(RandomTestUtil.randomString());

		bemDireitoAdicional.setDestinacao(RandomTestUtil.randomString());

		bemDireitoAdicional.setLaudoAvaliacao(RandomTestUtil.randomString());

		_bemDireitoAdicionals.add(_persistence.update(bemDireitoAdicional));

		return bemDireitoAdicional;
	}

	private List<BemDireitoAdicional> _bemDireitoAdicionals =
		new ArrayList<BemDireitoAdicional>();
	private BemDireitoAdicionalPersistence _persistence;
	private ClassLoader _dynamicQueryClassLoader;

}
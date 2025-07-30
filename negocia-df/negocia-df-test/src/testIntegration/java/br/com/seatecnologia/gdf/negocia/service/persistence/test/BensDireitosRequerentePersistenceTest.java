/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.persistence.test;

import br.com.seatecnologia.gdf.negocia.exception.NoSuchBensDireitosRequerenteException;
import br.com.seatecnologia.gdf.negocia.model.BensDireitosRequerente;
import br.com.seatecnologia.gdf.negocia.service.BensDireitosRequerenteLocalServiceUtil;
import br.com.seatecnologia.gdf.negocia.service.persistence.BensDireitosRequerentePersistence;
import br.com.seatecnologia.gdf.negocia.service.persistence.BensDireitosRequerenteUtil;

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
public class BensDireitosRequerentePersistenceTest {

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
		_persistence = BensDireitosRequerenteUtil.getPersistence();

		Class<?> clazz = _persistence.getClass();

		_dynamicQueryClassLoader = clazz.getClassLoader();
	}

	@After
	public void tearDown() throws Exception {
		Iterator<BensDireitosRequerente> iterator =
			_bensDireitosRequerentes.iterator();

		while (iterator.hasNext()) {
			_persistence.remove(iterator.next());

			iterator.remove();
		}
	}

	@Test
	public void testCreate() throws Exception {
		long pk = RandomTestUtil.nextLong();

		BensDireitosRequerente bensDireitosRequerente = _persistence.create(pk);

		Assert.assertNotNull(bensDireitosRequerente);

		Assert.assertEquals(bensDireitosRequerente.getPrimaryKey(), pk);
	}

	@Test
	public void testRemove() throws Exception {
		BensDireitosRequerente newBensDireitosRequerente =
			addBensDireitosRequerente();

		_persistence.remove(newBensDireitosRequerente);

		BensDireitosRequerente existingBensDireitosRequerente =
			_persistence.fetchByPrimaryKey(
				newBensDireitosRequerente.getPrimaryKey());

		Assert.assertNull(existingBensDireitosRequerente);
	}

	@Test
	public void testUpdateNew() throws Exception {
		addBensDireitosRequerente();
	}

	@Test
	public void testUpdateExisting() throws Exception {
		long pk = RandomTestUtil.nextLong();

		BensDireitosRequerente newBensDireitosRequerente = _persistence.create(
			pk);

		newBensDireitosRequerente.setUuid(RandomTestUtil.randomString());

		newBensDireitosRequerente.setPropostaId(RandomTestUtil.nextLong());

		newBensDireitosRequerente.setDescricao(RandomTestUtil.randomString());

		newBensDireitosRequerente.setLocalizacaoDestinacao(
			RandomTestUtil.randomString());

		_bensDireitosRequerentes.add(
			_persistence.update(newBensDireitosRequerente));

		BensDireitosRequerente existingBensDireitosRequerente =
			_persistence.findByPrimaryKey(
				newBensDireitosRequerente.getPrimaryKey());

		Assert.assertEquals(
			existingBensDireitosRequerente.getUuid(),
			newBensDireitosRequerente.getUuid());
		Assert.assertEquals(
			existingBensDireitosRequerente.getBemId(),
			newBensDireitosRequerente.getBemId());
		Assert.assertEquals(
			existingBensDireitosRequerente.getPropostaId(),
			newBensDireitosRequerente.getPropostaId());
		Assert.assertEquals(
			existingBensDireitosRequerente.getDescricao(),
			newBensDireitosRequerente.getDescricao());
		Assert.assertEquals(
			existingBensDireitosRequerente.getLocalizacaoDestinacao(),
			newBensDireitosRequerente.getLocalizacaoDestinacao());
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
		BensDireitosRequerente newBensDireitosRequerente =
			addBensDireitosRequerente();

		BensDireitosRequerente existingBensDireitosRequerente =
			_persistence.findByPrimaryKey(
				newBensDireitosRequerente.getPrimaryKey());

		Assert.assertEquals(
			existingBensDireitosRequerente, newBensDireitosRequerente);
	}

	@Test(expected = NoSuchBensDireitosRequerenteException.class)
	public void testFindByPrimaryKeyMissing() throws Exception {
		long pk = RandomTestUtil.nextLong();

		_persistence.findByPrimaryKey(pk);
	}

	@Test
	public void testFindAll() throws Exception {
		_persistence.findAll(
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, getOrderByComparator());
	}

	protected OrderByComparator<BensDireitosRequerente> getOrderByComparator() {
		return OrderByComparatorFactoryUtil.create(
			"GDF_BensDireitosRequerente", "uuid", true, "bemId", true,
			"propostaId", true, "descricao", true, "localizacaoDestinacao",
			true);
	}

	@Test
	public void testFetchByPrimaryKeyExisting() throws Exception {
		BensDireitosRequerente newBensDireitosRequerente =
			addBensDireitosRequerente();

		BensDireitosRequerente existingBensDireitosRequerente =
			_persistence.fetchByPrimaryKey(
				newBensDireitosRequerente.getPrimaryKey());

		Assert.assertEquals(
			existingBensDireitosRequerente, newBensDireitosRequerente);
	}

	@Test
	public void testFetchByPrimaryKeyMissing() throws Exception {
		long pk = RandomTestUtil.nextLong();

		BensDireitosRequerente missingBensDireitosRequerente =
			_persistence.fetchByPrimaryKey(pk);

		Assert.assertNull(missingBensDireitosRequerente);
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereAllPrimaryKeysExist()
		throws Exception {

		BensDireitosRequerente newBensDireitosRequerente1 =
			addBensDireitosRequerente();
		BensDireitosRequerente newBensDireitosRequerente2 =
			addBensDireitosRequerente();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newBensDireitosRequerente1.getPrimaryKey());
		primaryKeys.add(newBensDireitosRequerente2.getPrimaryKey());

		Map<Serializable, BensDireitosRequerente> bensDireitosRequerentes =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(2, bensDireitosRequerentes.size());
		Assert.assertEquals(
			newBensDireitosRequerente1,
			bensDireitosRequerentes.get(
				newBensDireitosRequerente1.getPrimaryKey()));
		Assert.assertEquals(
			newBensDireitosRequerente2,
			bensDireitosRequerentes.get(
				newBensDireitosRequerente2.getPrimaryKey()));
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereNoPrimaryKeysExist()
		throws Exception {

		long pk1 = RandomTestUtil.nextLong();

		long pk2 = RandomTestUtil.nextLong();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(pk1);
		primaryKeys.add(pk2);

		Map<Serializable, BensDireitosRequerente> bensDireitosRequerentes =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertTrue(bensDireitosRequerentes.isEmpty());
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereSomePrimaryKeysExist()
		throws Exception {

		BensDireitosRequerente newBensDireitosRequerente =
			addBensDireitosRequerente();

		long pk = RandomTestUtil.nextLong();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newBensDireitosRequerente.getPrimaryKey());
		primaryKeys.add(pk);

		Map<Serializable, BensDireitosRequerente> bensDireitosRequerentes =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(1, bensDireitosRequerentes.size());
		Assert.assertEquals(
			newBensDireitosRequerente,
			bensDireitosRequerentes.get(
				newBensDireitosRequerente.getPrimaryKey()));
	}

	@Test
	public void testFetchByPrimaryKeysWithNoPrimaryKeys() throws Exception {
		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		Map<Serializable, BensDireitosRequerente> bensDireitosRequerentes =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertTrue(bensDireitosRequerentes.isEmpty());
	}

	@Test
	public void testFetchByPrimaryKeysWithOnePrimaryKey() throws Exception {
		BensDireitosRequerente newBensDireitosRequerente =
			addBensDireitosRequerente();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newBensDireitosRequerente.getPrimaryKey());

		Map<Serializable, BensDireitosRequerente> bensDireitosRequerentes =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(1, bensDireitosRequerentes.size());
		Assert.assertEquals(
			newBensDireitosRequerente,
			bensDireitosRequerentes.get(
				newBensDireitosRequerente.getPrimaryKey()));
	}

	@Test
	public void testActionableDynamicQuery() throws Exception {
		final IntegerWrapper count = new IntegerWrapper();

		ActionableDynamicQuery actionableDynamicQuery =
			BensDireitosRequerenteLocalServiceUtil.getActionableDynamicQuery();

		actionableDynamicQuery.setPerformActionMethod(
			new ActionableDynamicQuery.PerformActionMethod
				<BensDireitosRequerente>() {

				@Override
				public void performAction(
					BensDireitosRequerente bensDireitosRequerente) {

					Assert.assertNotNull(bensDireitosRequerente);

					count.increment();
				}

			});

		actionableDynamicQuery.performActions();

		Assert.assertEquals(count.getValue(), _persistence.countAll());
	}

	@Test
	public void testDynamicQueryByPrimaryKeyExisting() throws Exception {
		BensDireitosRequerente newBensDireitosRequerente =
			addBensDireitosRequerente();

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			BensDireitosRequerente.class, _dynamicQueryClassLoader);

		dynamicQuery.add(
			RestrictionsFactoryUtil.eq(
				"bemId", newBensDireitosRequerente.getBemId()));

		List<BensDireitosRequerente> result = _persistence.findWithDynamicQuery(
			dynamicQuery);

		Assert.assertEquals(1, result.size());

		BensDireitosRequerente existingBensDireitosRequerente = result.get(0);

		Assert.assertEquals(
			existingBensDireitosRequerente, newBensDireitosRequerente);
	}

	@Test
	public void testDynamicQueryByPrimaryKeyMissing() throws Exception {
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			BensDireitosRequerente.class, _dynamicQueryClassLoader);

		dynamicQuery.add(
			RestrictionsFactoryUtil.eq("bemId", RandomTestUtil.nextLong()));

		List<BensDireitosRequerente> result = _persistence.findWithDynamicQuery(
			dynamicQuery);

		Assert.assertEquals(0, result.size());
	}

	@Test
	public void testDynamicQueryByProjectionExisting() throws Exception {
		BensDireitosRequerente newBensDireitosRequerente =
			addBensDireitosRequerente();

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			BensDireitosRequerente.class, _dynamicQueryClassLoader);

		dynamicQuery.setProjection(ProjectionFactoryUtil.property("bemId"));

		Object newBemId = newBensDireitosRequerente.getBemId();

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
			BensDireitosRequerente.class, _dynamicQueryClassLoader);

		dynamicQuery.setProjection(ProjectionFactoryUtil.property("bemId"));

		dynamicQuery.add(
			RestrictionsFactoryUtil.in(
				"bemId", new Object[] {RandomTestUtil.nextLong()}));

		List<Object> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(0, result.size());
	}

	protected BensDireitosRequerente addBensDireitosRequerente()
		throws Exception {

		long pk = RandomTestUtil.nextLong();

		BensDireitosRequerente bensDireitosRequerente = _persistence.create(pk);

		bensDireitosRequerente.setUuid(RandomTestUtil.randomString());

		bensDireitosRequerente.setPropostaId(RandomTestUtil.nextLong());

		bensDireitosRequerente.setDescricao(RandomTestUtil.randomString());

		bensDireitosRequerente.setLocalizacaoDestinacao(
			RandomTestUtil.randomString());

		_bensDireitosRequerentes.add(
			_persistence.update(bensDireitosRequerente));

		return bensDireitosRequerente;
	}

	private List<BensDireitosRequerente> _bensDireitosRequerentes =
		new ArrayList<BensDireitosRequerente>();
	private BensDireitosRequerentePersistence _persistence;
	private ClassLoader _dynamicQueryClassLoader;

}
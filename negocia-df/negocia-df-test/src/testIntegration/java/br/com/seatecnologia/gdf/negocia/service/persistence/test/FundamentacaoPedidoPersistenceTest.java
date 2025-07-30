/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.persistence.test;

import br.com.seatecnologia.gdf.negocia.exception.NoSuchFundamentacaoPedidoException;
import br.com.seatecnologia.gdf.negocia.model.FundamentacaoPedido;
import br.com.seatecnologia.gdf.negocia.service.FundamentacaoPedidoLocalServiceUtil;
import br.com.seatecnologia.gdf.negocia.service.persistence.FundamentacaoPedidoPersistence;
import br.com.seatecnologia.gdf.negocia.service.persistence.FundamentacaoPedidoUtil;

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
public class FundamentacaoPedidoPersistenceTest {

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
		_persistence = FundamentacaoPedidoUtil.getPersistence();

		Class<?> clazz = _persistence.getClass();

		_dynamicQueryClassLoader = clazz.getClassLoader();
	}

	@After
	public void tearDown() throws Exception {
		Iterator<FundamentacaoPedido> iterator =
			_fundamentacaoPedidos.iterator();

		while (iterator.hasNext()) {
			_persistence.remove(iterator.next());

			iterator.remove();
		}
	}

	@Test
	public void testCreate() throws Exception {
		long pk = RandomTestUtil.nextLong();

		FundamentacaoPedido fundamentacaoPedido = _persistence.create(pk);

		Assert.assertNotNull(fundamentacaoPedido);

		Assert.assertEquals(fundamentacaoPedido.getPrimaryKey(), pk);
	}

	@Test
	public void testRemove() throws Exception {
		FundamentacaoPedido newFundamentacaoPedido = addFundamentacaoPedido();

		_persistence.remove(newFundamentacaoPedido);

		FundamentacaoPedido existingFundamentacaoPedido =
			_persistence.fetchByPrimaryKey(
				newFundamentacaoPedido.getPrimaryKey());

		Assert.assertNull(existingFundamentacaoPedido);
	}

	@Test
	public void testUpdateNew() throws Exception {
		addFundamentacaoPedido();
	}

	@Test
	public void testUpdateExisting() throws Exception {
		long pk = RandomTestUtil.nextLong();

		FundamentacaoPedido newFundamentacaoPedido = _persistence.create(pk);

		newFundamentacaoPedido.setUuid(RandomTestUtil.randomString());

		newFundamentacaoPedido.setPropostaId(RandomTestUtil.nextLong());

		newFundamentacaoPedido.setFundamentacaoPedido(
			RandomTestUtil.randomString());

		_fundamentacaoPedidos.add(_persistence.update(newFundamentacaoPedido));

		FundamentacaoPedido existingFundamentacaoPedido =
			_persistence.findByPrimaryKey(
				newFundamentacaoPedido.getPrimaryKey());

		Assert.assertEquals(
			existingFundamentacaoPedido.getUuid(),
			newFundamentacaoPedido.getUuid());
		Assert.assertEquals(
			existingFundamentacaoPedido.getFundamentacaoId(),
			newFundamentacaoPedido.getFundamentacaoId());
		Assert.assertEquals(
			existingFundamentacaoPedido.getPropostaId(),
			newFundamentacaoPedido.getPropostaId());
		Assert.assertEquals(
			existingFundamentacaoPedido.getFundamentacaoPedido(),
			newFundamentacaoPedido.getFundamentacaoPedido());
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
		FundamentacaoPedido newFundamentacaoPedido = addFundamentacaoPedido();

		FundamentacaoPedido existingFundamentacaoPedido =
			_persistence.findByPrimaryKey(
				newFundamentacaoPedido.getPrimaryKey());

		Assert.assertEquals(
			existingFundamentacaoPedido, newFundamentacaoPedido);
	}

	@Test(expected = NoSuchFundamentacaoPedidoException.class)
	public void testFindByPrimaryKeyMissing() throws Exception {
		long pk = RandomTestUtil.nextLong();

		_persistence.findByPrimaryKey(pk);
	}

	@Test
	public void testFindAll() throws Exception {
		_persistence.findAll(
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, getOrderByComparator());
	}

	protected OrderByComparator<FundamentacaoPedido> getOrderByComparator() {
		return OrderByComparatorFactoryUtil.create(
			"GDF_FundamentacaoPedido", "uuid", true, "fundamentacaoId", true,
			"propostaId", true, "fundamentacaoPedido", true);
	}

	@Test
	public void testFetchByPrimaryKeyExisting() throws Exception {
		FundamentacaoPedido newFundamentacaoPedido = addFundamentacaoPedido();

		FundamentacaoPedido existingFundamentacaoPedido =
			_persistence.fetchByPrimaryKey(
				newFundamentacaoPedido.getPrimaryKey());

		Assert.assertEquals(
			existingFundamentacaoPedido, newFundamentacaoPedido);
	}

	@Test
	public void testFetchByPrimaryKeyMissing() throws Exception {
		long pk = RandomTestUtil.nextLong();

		FundamentacaoPedido missingFundamentacaoPedido =
			_persistence.fetchByPrimaryKey(pk);

		Assert.assertNull(missingFundamentacaoPedido);
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereAllPrimaryKeysExist()
		throws Exception {

		FundamentacaoPedido newFundamentacaoPedido1 = addFundamentacaoPedido();
		FundamentacaoPedido newFundamentacaoPedido2 = addFundamentacaoPedido();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newFundamentacaoPedido1.getPrimaryKey());
		primaryKeys.add(newFundamentacaoPedido2.getPrimaryKey());

		Map<Serializable, FundamentacaoPedido> fundamentacaoPedidos =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(2, fundamentacaoPedidos.size());
		Assert.assertEquals(
			newFundamentacaoPedido1,
			fundamentacaoPedidos.get(newFundamentacaoPedido1.getPrimaryKey()));
		Assert.assertEquals(
			newFundamentacaoPedido2,
			fundamentacaoPedidos.get(newFundamentacaoPedido2.getPrimaryKey()));
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereNoPrimaryKeysExist()
		throws Exception {

		long pk1 = RandomTestUtil.nextLong();

		long pk2 = RandomTestUtil.nextLong();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(pk1);
		primaryKeys.add(pk2);

		Map<Serializable, FundamentacaoPedido> fundamentacaoPedidos =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertTrue(fundamentacaoPedidos.isEmpty());
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereSomePrimaryKeysExist()
		throws Exception {

		FundamentacaoPedido newFundamentacaoPedido = addFundamentacaoPedido();

		long pk = RandomTestUtil.nextLong();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newFundamentacaoPedido.getPrimaryKey());
		primaryKeys.add(pk);

		Map<Serializable, FundamentacaoPedido> fundamentacaoPedidos =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(1, fundamentacaoPedidos.size());
		Assert.assertEquals(
			newFundamentacaoPedido,
			fundamentacaoPedidos.get(newFundamentacaoPedido.getPrimaryKey()));
	}

	@Test
	public void testFetchByPrimaryKeysWithNoPrimaryKeys() throws Exception {
		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		Map<Serializable, FundamentacaoPedido> fundamentacaoPedidos =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertTrue(fundamentacaoPedidos.isEmpty());
	}

	@Test
	public void testFetchByPrimaryKeysWithOnePrimaryKey() throws Exception {
		FundamentacaoPedido newFundamentacaoPedido = addFundamentacaoPedido();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newFundamentacaoPedido.getPrimaryKey());

		Map<Serializable, FundamentacaoPedido> fundamentacaoPedidos =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(1, fundamentacaoPedidos.size());
		Assert.assertEquals(
			newFundamentacaoPedido,
			fundamentacaoPedidos.get(newFundamentacaoPedido.getPrimaryKey()));
	}

	@Test
	public void testActionableDynamicQuery() throws Exception {
		final IntegerWrapper count = new IntegerWrapper();

		ActionableDynamicQuery actionableDynamicQuery =
			FundamentacaoPedidoLocalServiceUtil.getActionableDynamicQuery();

		actionableDynamicQuery.setPerformActionMethod(
			new ActionableDynamicQuery.PerformActionMethod
				<FundamentacaoPedido>() {

				@Override
				public void performAction(
					FundamentacaoPedido fundamentacaoPedido) {

					Assert.assertNotNull(fundamentacaoPedido);

					count.increment();
				}

			});

		actionableDynamicQuery.performActions();

		Assert.assertEquals(count.getValue(), _persistence.countAll());
	}

	@Test
	public void testDynamicQueryByPrimaryKeyExisting() throws Exception {
		FundamentacaoPedido newFundamentacaoPedido = addFundamentacaoPedido();

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			FundamentacaoPedido.class, _dynamicQueryClassLoader);

		dynamicQuery.add(
			RestrictionsFactoryUtil.eq(
				"fundamentacaoId",
				newFundamentacaoPedido.getFundamentacaoId()));

		List<FundamentacaoPedido> result = _persistence.findWithDynamicQuery(
			dynamicQuery);

		Assert.assertEquals(1, result.size());

		FundamentacaoPedido existingFundamentacaoPedido = result.get(0);

		Assert.assertEquals(
			existingFundamentacaoPedido, newFundamentacaoPedido);
	}

	@Test
	public void testDynamicQueryByPrimaryKeyMissing() throws Exception {
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			FundamentacaoPedido.class, _dynamicQueryClassLoader);

		dynamicQuery.add(
			RestrictionsFactoryUtil.eq(
				"fundamentacaoId", RandomTestUtil.nextLong()));

		List<FundamentacaoPedido> result = _persistence.findWithDynamicQuery(
			dynamicQuery);

		Assert.assertEquals(0, result.size());
	}

	@Test
	public void testDynamicQueryByProjectionExisting() throws Exception {
		FundamentacaoPedido newFundamentacaoPedido = addFundamentacaoPedido();

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			FundamentacaoPedido.class, _dynamicQueryClassLoader);

		dynamicQuery.setProjection(
			ProjectionFactoryUtil.property("fundamentacaoId"));

		Object newFundamentacaoId = newFundamentacaoPedido.getFundamentacaoId();

		dynamicQuery.add(
			RestrictionsFactoryUtil.in(
				"fundamentacaoId", new Object[] {newFundamentacaoId}));

		List<Object> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(1, result.size());

		Object existingFundamentacaoId = result.get(0);

		Assert.assertEquals(existingFundamentacaoId, newFundamentacaoId);
	}

	@Test
	public void testDynamicQueryByProjectionMissing() throws Exception {
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			FundamentacaoPedido.class, _dynamicQueryClassLoader);

		dynamicQuery.setProjection(
			ProjectionFactoryUtil.property("fundamentacaoId"));

		dynamicQuery.add(
			RestrictionsFactoryUtil.in(
				"fundamentacaoId", new Object[] {RandomTestUtil.nextLong()}));

		List<Object> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(0, result.size());
	}

	protected FundamentacaoPedido addFundamentacaoPedido() throws Exception {
		long pk = RandomTestUtil.nextLong();

		FundamentacaoPedido fundamentacaoPedido = _persistence.create(pk);

		fundamentacaoPedido.setUuid(RandomTestUtil.randomString());

		fundamentacaoPedido.setPropostaId(RandomTestUtil.nextLong());

		fundamentacaoPedido.setFundamentacaoPedido(
			RandomTestUtil.randomString());

		_fundamentacaoPedidos.add(_persistence.update(fundamentacaoPedido));

		return fundamentacaoPedido;
	}

	private List<FundamentacaoPedido> _fundamentacaoPedidos =
		new ArrayList<FundamentacaoPedido>();
	private FundamentacaoPedidoPersistence _persistence;
	private ClassLoader _dynamicQueryClassLoader;

}
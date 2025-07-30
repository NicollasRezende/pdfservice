/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.persistence.test;

import br.com.seatecnologia.gdf.negocia.exception.NoSuchIdentificacaoDebitosException;
import br.com.seatecnologia.gdf.negocia.model.IdentificacaoDebitos;
import br.com.seatecnologia.gdf.negocia.service.IdentificacaoDebitosLocalServiceUtil;
import br.com.seatecnologia.gdf.negocia.service.persistence.IdentificacaoDebitosPersistence;
import br.com.seatecnologia.gdf.negocia.service.persistence.IdentificacaoDebitosUtil;

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
public class IdentificacaoDebitosPersistenceTest {

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
		_persistence = IdentificacaoDebitosUtil.getPersistence();

		Class<?> clazz = _persistence.getClass();

		_dynamicQueryClassLoader = clazz.getClassLoader();
	}

	@After
	public void tearDown() throws Exception {
		Iterator<IdentificacaoDebitos> iterator =
			_identificacaoDebitoses.iterator();

		while (iterator.hasNext()) {
			_persistence.remove(iterator.next());

			iterator.remove();
		}
	}

	@Test
	public void testCreate() throws Exception {
		long pk = RandomTestUtil.nextLong();

		IdentificacaoDebitos identificacaoDebitos = _persistence.create(pk);

		Assert.assertNotNull(identificacaoDebitos);

		Assert.assertEquals(identificacaoDebitos.getPrimaryKey(), pk);
	}

	@Test
	public void testRemove() throws Exception {
		IdentificacaoDebitos newIdentificacaoDebitos =
			addIdentificacaoDebitos();

		_persistence.remove(newIdentificacaoDebitos);

		IdentificacaoDebitos existingIdentificacaoDebitos =
			_persistence.fetchByPrimaryKey(
				newIdentificacaoDebitos.getPrimaryKey());

		Assert.assertNull(existingIdentificacaoDebitos);
	}

	@Test
	public void testUpdateNew() throws Exception {
		addIdentificacaoDebitos();
	}

	@Test
	public void testUpdateExisting() throws Exception {
		long pk = RandomTestUtil.nextLong();

		IdentificacaoDebitos newIdentificacaoDebitos = _persistence.create(pk);

		newIdentificacaoDebitos.setUuid(RandomTestUtil.randomString());

		newIdentificacaoDebitos.setFundamentacaoId(RandomTestUtil.nextLong());

		newIdentificacaoDebitos.setNatureza(RandomTestUtil.randomString());

		newIdentificacaoDebitos.setSituacao(RandomTestUtil.randomString());

		newIdentificacaoDebitos.setInscricaoDividaAtiva(
			RandomTestUtil.randomString());

		newIdentificacaoDebitos.setGarantidoJudicialmente(
			RandomTestUtil.randomString());

		_identificacaoDebitoses.add(
			_persistence.update(newIdentificacaoDebitos));

		IdentificacaoDebitos existingIdentificacaoDebitos =
			_persistence.findByPrimaryKey(
				newIdentificacaoDebitos.getPrimaryKey());

		Assert.assertEquals(
			existingIdentificacaoDebitos.getUuid(),
			newIdentificacaoDebitos.getUuid());
		Assert.assertEquals(
			existingIdentificacaoDebitos.getIdentificacaoDebitosId(),
			newIdentificacaoDebitos.getIdentificacaoDebitosId());
		Assert.assertEquals(
			existingIdentificacaoDebitos.getFundamentacaoId(),
			newIdentificacaoDebitos.getFundamentacaoId());
		Assert.assertEquals(
			existingIdentificacaoDebitos.getNatureza(),
			newIdentificacaoDebitos.getNatureza());
		Assert.assertEquals(
			existingIdentificacaoDebitos.getSituacao(),
			newIdentificacaoDebitos.getSituacao());
		Assert.assertEquals(
			existingIdentificacaoDebitos.getInscricaoDividaAtiva(),
			newIdentificacaoDebitos.getInscricaoDividaAtiva());
		Assert.assertEquals(
			existingIdentificacaoDebitos.getGarantidoJudicialmente(),
			newIdentificacaoDebitos.getGarantidoJudicialmente());
	}

	@Test
	public void testCountByUuid() throws Exception {
		_persistence.countByUuid("");

		_persistence.countByUuid("null");

		_persistence.countByUuid((String)null);
	}

	@Test
	public void testCountByFundamentacaoId() throws Exception {
		_persistence.countByFundamentacaoId(RandomTestUtil.nextLong());

		_persistence.countByFundamentacaoId(0L);
	}

	@Test
	public void testFindByPrimaryKeyExisting() throws Exception {
		IdentificacaoDebitos newIdentificacaoDebitos =
			addIdentificacaoDebitos();

		IdentificacaoDebitos existingIdentificacaoDebitos =
			_persistence.findByPrimaryKey(
				newIdentificacaoDebitos.getPrimaryKey());

		Assert.assertEquals(
			existingIdentificacaoDebitos, newIdentificacaoDebitos);
	}

	@Test(expected = NoSuchIdentificacaoDebitosException.class)
	public void testFindByPrimaryKeyMissing() throws Exception {
		long pk = RandomTestUtil.nextLong();

		_persistence.findByPrimaryKey(pk);
	}

	@Test
	public void testFindAll() throws Exception {
		_persistence.findAll(
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, getOrderByComparator());
	}

	protected OrderByComparator<IdentificacaoDebitos> getOrderByComparator() {
		return OrderByComparatorFactoryUtil.create(
			"GDF_IdentificacaoDebitos", "uuid", true, "identificacaoDebitosId",
			true, "fundamentacaoId", true, "natureza", true, "situacao", true,
			"inscricaoDividaAtiva", true, "garantidoJudicialmente", true);
	}

	@Test
	public void testFetchByPrimaryKeyExisting() throws Exception {
		IdentificacaoDebitos newIdentificacaoDebitos =
			addIdentificacaoDebitos();

		IdentificacaoDebitos existingIdentificacaoDebitos =
			_persistence.fetchByPrimaryKey(
				newIdentificacaoDebitos.getPrimaryKey());

		Assert.assertEquals(
			existingIdentificacaoDebitos, newIdentificacaoDebitos);
	}

	@Test
	public void testFetchByPrimaryKeyMissing() throws Exception {
		long pk = RandomTestUtil.nextLong();

		IdentificacaoDebitos missingIdentificacaoDebitos =
			_persistence.fetchByPrimaryKey(pk);

		Assert.assertNull(missingIdentificacaoDebitos);
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereAllPrimaryKeysExist()
		throws Exception {

		IdentificacaoDebitos newIdentificacaoDebitos1 =
			addIdentificacaoDebitos();
		IdentificacaoDebitos newIdentificacaoDebitos2 =
			addIdentificacaoDebitos();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newIdentificacaoDebitos1.getPrimaryKey());
		primaryKeys.add(newIdentificacaoDebitos2.getPrimaryKey());

		Map<Serializable, IdentificacaoDebitos> identificacaoDebitoses =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(2, identificacaoDebitoses.size());
		Assert.assertEquals(
			newIdentificacaoDebitos1,
			identificacaoDebitoses.get(
				newIdentificacaoDebitos1.getPrimaryKey()));
		Assert.assertEquals(
			newIdentificacaoDebitos2,
			identificacaoDebitoses.get(
				newIdentificacaoDebitos2.getPrimaryKey()));
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereNoPrimaryKeysExist()
		throws Exception {

		long pk1 = RandomTestUtil.nextLong();

		long pk2 = RandomTestUtil.nextLong();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(pk1);
		primaryKeys.add(pk2);

		Map<Serializable, IdentificacaoDebitos> identificacaoDebitoses =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertTrue(identificacaoDebitoses.isEmpty());
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereSomePrimaryKeysExist()
		throws Exception {

		IdentificacaoDebitos newIdentificacaoDebitos =
			addIdentificacaoDebitos();

		long pk = RandomTestUtil.nextLong();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newIdentificacaoDebitos.getPrimaryKey());
		primaryKeys.add(pk);

		Map<Serializable, IdentificacaoDebitos> identificacaoDebitoses =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(1, identificacaoDebitoses.size());
		Assert.assertEquals(
			newIdentificacaoDebitos,
			identificacaoDebitoses.get(
				newIdentificacaoDebitos.getPrimaryKey()));
	}

	@Test
	public void testFetchByPrimaryKeysWithNoPrimaryKeys() throws Exception {
		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		Map<Serializable, IdentificacaoDebitos> identificacaoDebitoses =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertTrue(identificacaoDebitoses.isEmpty());
	}

	@Test
	public void testFetchByPrimaryKeysWithOnePrimaryKey() throws Exception {
		IdentificacaoDebitos newIdentificacaoDebitos =
			addIdentificacaoDebitos();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newIdentificacaoDebitos.getPrimaryKey());

		Map<Serializable, IdentificacaoDebitos> identificacaoDebitoses =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(1, identificacaoDebitoses.size());
		Assert.assertEquals(
			newIdentificacaoDebitos,
			identificacaoDebitoses.get(
				newIdentificacaoDebitos.getPrimaryKey()));
	}

	@Test
	public void testActionableDynamicQuery() throws Exception {
		final IntegerWrapper count = new IntegerWrapper();

		ActionableDynamicQuery actionableDynamicQuery =
			IdentificacaoDebitosLocalServiceUtil.getActionableDynamicQuery();

		actionableDynamicQuery.setPerformActionMethod(
			new ActionableDynamicQuery.PerformActionMethod
				<IdentificacaoDebitos>() {

				@Override
				public void performAction(
					IdentificacaoDebitos identificacaoDebitos) {

					Assert.assertNotNull(identificacaoDebitos);

					count.increment();
				}

			});

		actionableDynamicQuery.performActions();

		Assert.assertEquals(count.getValue(), _persistence.countAll());
	}

	@Test
	public void testDynamicQueryByPrimaryKeyExisting() throws Exception {
		IdentificacaoDebitos newIdentificacaoDebitos =
			addIdentificacaoDebitos();

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			IdentificacaoDebitos.class, _dynamicQueryClassLoader);

		dynamicQuery.add(
			RestrictionsFactoryUtil.eq(
				"identificacaoDebitosId",
				newIdentificacaoDebitos.getIdentificacaoDebitosId()));

		List<IdentificacaoDebitos> result = _persistence.findWithDynamicQuery(
			dynamicQuery);

		Assert.assertEquals(1, result.size());

		IdentificacaoDebitos existingIdentificacaoDebitos = result.get(0);

		Assert.assertEquals(
			existingIdentificacaoDebitos, newIdentificacaoDebitos);
	}

	@Test
	public void testDynamicQueryByPrimaryKeyMissing() throws Exception {
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			IdentificacaoDebitos.class, _dynamicQueryClassLoader);

		dynamicQuery.add(
			RestrictionsFactoryUtil.eq(
				"identificacaoDebitosId", RandomTestUtil.nextLong()));

		List<IdentificacaoDebitos> result = _persistence.findWithDynamicQuery(
			dynamicQuery);

		Assert.assertEquals(0, result.size());
	}

	@Test
	public void testDynamicQueryByProjectionExisting() throws Exception {
		IdentificacaoDebitos newIdentificacaoDebitos =
			addIdentificacaoDebitos();

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			IdentificacaoDebitos.class, _dynamicQueryClassLoader);

		dynamicQuery.setProjection(
			ProjectionFactoryUtil.property("identificacaoDebitosId"));

		Object newIdentificacaoDebitosId =
			newIdentificacaoDebitos.getIdentificacaoDebitosId();

		dynamicQuery.add(
			RestrictionsFactoryUtil.in(
				"identificacaoDebitosId",
				new Object[] {newIdentificacaoDebitosId}));

		List<Object> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(1, result.size());

		Object existingIdentificacaoDebitosId = result.get(0);

		Assert.assertEquals(
			existingIdentificacaoDebitosId, newIdentificacaoDebitosId);
	}

	@Test
	public void testDynamicQueryByProjectionMissing() throws Exception {
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			IdentificacaoDebitos.class, _dynamicQueryClassLoader);

		dynamicQuery.setProjection(
			ProjectionFactoryUtil.property("identificacaoDebitosId"));

		dynamicQuery.add(
			RestrictionsFactoryUtil.in(
				"identificacaoDebitosId",
				new Object[] {RandomTestUtil.nextLong()}));

		List<Object> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(0, result.size());
	}

	protected IdentificacaoDebitos addIdentificacaoDebitos() throws Exception {
		long pk = RandomTestUtil.nextLong();

		IdentificacaoDebitos identificacaoDebitos = _persistence.create(pk);

		identificacaoDebitos.setUuid(RandomTestUtil.randomString());

		identificacaoDebitos.setFundamentacaoId(RandomTestUtil.nextLong());

		identificacaoDebitos.setNatureza(RandomTestUtil.randomString());

		identificacaoDebitos.setSituacao(RandomTestUtil.randomString());

		identificacaoDebitos.setInscricaoDividaAtiva(
			RandomTestUtil.randomString());

		identificacaoDebitos.setGarantidoJudicialmente(
			RandomTestUtil.randomString());

		_identificacaoDebitoses.add(_persistence.update(identificacaoDebitos));

		return identificacaoDebitos;
	}

	private List<IdentificacaoDebitos> _identificacaoDebitoses =
		new ArrayList<IdentificacaoDebitos>();
	private IdentificacaoDebitosPersistence _persistence;
	private ClassLoader _dynamicQueryClassLoader;

}
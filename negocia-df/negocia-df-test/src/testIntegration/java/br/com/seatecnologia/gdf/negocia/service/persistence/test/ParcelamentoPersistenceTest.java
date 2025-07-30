/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.persistence.test;

import br.com.seatecnologia.gdf.negocia.exception.NoSuchParcelamentoException;
import br.com.seatecnologia.gdf.negocia.model.Parcelamento;
import br.com.seatecnologia.gdf.negocia.service.ParcelamentoLocalServiceUtil;
import br.com.seatecnologia.gdf.negocia.service.persistence.ParcelamentoPersistence;
import br.com.seatecnologia.gdf.negocia.service.persistence.ParcelamentoUtil;

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
public class ParcelamentoPersistenceTest {

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
		_persistence = ParcelamentoUtil.getPersistence();

		Class<?> clazz = _persistence.getClass();

		_dynamicQueryClassLoader = clazz.getClassLoader();
	}

	@After
	public void tearDown() throws Exception {
		Iterator<Parcelamento> iterator = _parcelamentos.iterator();

		while (iterator.hasNext()) {
			_persistence.remove(iterator.next());

			iterator.remove();
		}
	}

	@Test
	public void testCreate() throws Exception {
		long pk = RandomTestUtil.nextLong();

		Parcelamento parcelamento = _persistence.create(pk);

		Assert.assertNotNull(parcelamento);

		Assert.assertEquals(parcelamento.getPrimaryKey(), pk);
	}

	@Test
	public void testRemove() throws Exception {
		Parcelamento newParcelamento = addParcelamento();

		_persistence.remove(newParcelamento);

		Parcelamento existingParcelamento = _persistence.fetchByPrimaryKey(
			newParcelamento.getPrimaryKey());

		Assert.assertNull(existingParcelamento);
	}

	@Test
	public void testUpdateNew() throws Exception {
		addParcelamento();
	}

	@Test
	public void testUpdateExisting() throws Exception {
		long pk = RandomTestUtil.nextLong();

		Parcelamento newParcelamento = _persistence.create(pk);

		newParcelamento.setUuid(RandomTestUtil.randomString());

		newParcelamento.setPropostaId(RandomTestUtil.nextLong());

		newParcelamento.setNumeroParcelas(RandomTestUtil.nextInt());

		newParcelamento.setValorEntrada(RandomTestUtil.nextDouble());

		newParcelamento.setDataPrimeiraParcela(RandomTestUtil.nextDate());

		newParcelamento.setValorPrimeiraParcela(RandomTestUtil.nextDouble());

		_parcelamentos.add(_persistence.update(newParcelamento));

		Parcelamento existingParcelamento = _persistence.findByPrimaryKey(
			newParcelamento.getPrimaryKey());

		Assert.assertEquals(
			existingParcelamento.getUuid(), newParcelamento.getUuid());
		Assert.assertEquals(
			existingParcelamento.getParcelamentoId(),
			newParcelamento.getParcelamentoId());
		Assert.assertEquals(
			existingParcelamento.getPropostaId(),
			newParcelamento.getPropostaId());
		Assert.assertEquals(
			existingParcelamento.getNumeroParcelas(),
			newParcelamento.getNumeroParcelas());
		AssertUtils.assertEquals(
			existingParcelamento.getValorEntrada(),
			newParcelamento.getValorEntrada());
		Assert.assertEquals(
			Time.getShortTimestamp(
				existingParcelamento.getDataPrimeiraParcela()),
			Time.getShortTimestamp(newParcelamento.getDataPrimeiraParcela()));
		AssertUtils.assertEquals(
			existingParcelamento.getValorPrimeiraParcela(),
			newParcelamento.getValorPrimeiraParcela());
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
		Parcelamento newParcelamento = addParcelamento();

		Parcelamento existingParcelamento = _persistence.findByPrimaryKey(
			newParcelamento.getPrimaryKey());

		Assert.assertEquals(existingParcelamento, newParcelamento);
	}

	@Test(expected = NoSuchParcelamentoException.class)
	public void testFindByPrimaryKeyMissing() throws Exception {
		long pk = RandomTestUtil.nextLong();

		_persistence.findByPrimaryKey(pk);
	}

	@Test
	public void testFindAll() throws Exception {
		_persistence.findAll(
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, getOrderByComparator());
	}

	protected OrderByComparator<Parcelamento> getOrderByComparator() {
		return OrderByComparatorFactoryUtil.create(
			"GDF_Parcelamento", "uuid", true, "parcelamentoId", true,
			"propostaId", true, "numeroParcelas", true, "valorEntrada", true,
			"dataPrimeiraParcela", true, "valorPrimeiraParcela", true);
	}

	@Test
	public void testFetchByPrimaryKeyExisting() throws Exception {
		Parcelamento newParcelamento = addParcelamento();

		Parcelamento existingParcelamento = _persistence.fetchByPrimaryKey(
			newParcelamento.getPrimaryKey());

		Assert.assertEquals(existingParcelamento, newParcelamento);
	}

	@Test
	public void testFetchByPrimaryKeyMissing() throws Exception {
		long pk = RandomTestUtil.nextLong();

		Parcelamento missingParcelamento = _persistence.fetchByPrimaryKey(pk);

		Assert.assertNull(missingParcelamento);
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereAllPrimaryKeysExist()
		throws Exception {

		Parcelamento newParcelamento1 = addParcelamento();
		Parcelamento newParcelamento2 = addParcelamento();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newParcelamento1.getPrimaryKey());
		primaryKeys.add(newParcelamento2.getPrimaryKey());

		Map<Serializable, Parcelamento> parcelamentos =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(2, parcelamentos.size());
		Assert.assertEquals(
			newParcelamento1,
			parcelamentos.get(newParcelamento1.getPrimaryKey()));
		Assert.assertEquals(
			newParcelamento2,
			parcelamentos.get(newParcelamento2.getPrimaryKey()));
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereNoPrimaryKeysExist()
		throws Exception {

		long pk1 = RandomTestUtil.nextLong();

		long pk2 = RandomTestUtil.nextLong();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(pk1);
		primaryKeys.add(pk2);

		Map<Serializable, Parcelamento> parcelamentos =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertTrue(parcelamentos.isEmpty());
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereSomePrimaryKeysExist()
		throws Exception {

		Parcelamento newParcelamento = addParcelamento();

		long pk = RandomTestUtil.nextLong();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newParcelamento.getPrimaryKey());
		primaryKeys.add(pk);

		Map<Serializable, Parcelamento> parcelamentos =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(1, parcelamentos.size());
		Assert.assertEquals(
			newParcelamento,
			parcelamentos.get(newParcelamento.getPrimaryKey()));
	}

	@Test
	public void testFetchByPrimaryKeysWithNoPrimaryKeys() throws Exception {
		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		Map<Serializable, Parcelamento> parcelamentos =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertTrue(parcelamentos.isEmpty());
	}

	@Test
	public void testFetchByPrimaryKeysWithOnePrimaryKey() throws Exception {
		Parcelamento newParcelamento = addParcelamento();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newParcelamento.getPrimaryKey());

		Map<Serializable, Parcelamento> parcelamentos =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(1, parcelamentos.size());
		Assert.assertEquals(
			newParcelamento,
			parcelamentos.get(newParcelamento.getPrimaryKey()));
	}

	@Test
	public void testActionableDynamicQuery() throws Exception {
		final IntegerWrapper count = new IntegerWrapper();

		ActionableDynamicQuery actionableDynamicQuery =
			ParcelamentoLocalServiceUtil.getActionableDynamicQuery();

		actionableDynamicQuery.setPerformActionMethod(
			new ActionableDynamicQuery.PerformActionMethod<Parcelamento>() {

				@Override
				public void performAction(Parcelamento parcelamento) {
					Assert.assertNotNull(parcelamento);

					count.increment();
				}

			});

		actionableDynamicQuery.performActions();

		Assert.assertEquals(count.getValue(), _persistence.countAll());
	}

	@Test
	public void testDynamicQueryByPrimaryKeyExisting() throws Exception {
		Parcelamento newParcelamento = addParcelamento();

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			Parcelamento.class, _dynamicQueryClassLoader);

		dynamicQuery.add(
			RestrictionsFactoryUtil.eq(
				"parcelamentoId", newParcelamento.getParcelamentoId()));

		List<Parcelamento> result = _persistence.findWithDynamicQuery(
			dynamicQuery);

		Assert.assertEquals(1, result.size());

		Parcelamento existingParcelamento = result.get(0);

		Assert.assertEquals(existingParcelamento, newParcelamento);
	}

	@Test
	public void testDynamicQueryByPrimaryKeyMissing() throws Exception {
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			Parcelamento.class, _dynamicQueryClassLoader);

		dynamicQuery.add(
			RestrictionsFactoryUtil.eq(
				"parcelamentoId", RandomTestUtil.nextLong()));

		List<Parcelamento> result = _persistence.findWithDynamicQuery(
			dynamicQuery);

		Assert.assertEquals(0, result.size());
	}

	@Test
	public void testDynamicQueryByProjectionExisting() throws Exception {
		Parcelamento newParcelamento = addParcelamento();

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			Parcelamento.class, _dynamicQueryClassLoader);

		dynamicQuery.setProjection(
			ProjectionFactoryUtil.property("parcelamentoId"));

		Object newParcelamentoId = newParcelamento.getParcelamentoId();

		dynamicQuery.add(
			RestrictionsFactoryUtil.in(
				"parcelamentoId", new Object[] {newParcelamentoId}));

		List<Object> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(1, result.size());

		Object existingParcelamentoId = result.get(0);

		Assert.assertEquals(existingParcelamentoId, newParcelamentoId);
	}

	@Test
	public void testDynamicQueryByProjectionMissing() throws Exception {
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			Parcelamento.class, _dynamicQueryClassLoader);

		dynamicQuery.setProjection(
			ProjectionFactoryUtil.property("parcelamentoId"));

		dynamicQuery.add(
			RestrictionsFactoryUtil.in(
				"parcelamentoId", new Object[] {RandomTestUtil.nextLong()}));

		List<Object> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(0, result.size());
	}

	protected Parcelamento addParcelamento() throws Exception {
		long pk = RandomTestUtil.nextLong();

		Parcelamento parcelamento = _persistence.create(pk);

		parcelamento.setUuid(RandomTestUtil.randomString());

		parcelamento.setPropostaId(RandomTestUtil.nextLong());

		parcelamento.setNumeroParcelas(RandomTestUtil.nextInt());

		parcelamento.setValorEntrada(RandomTestUtil.nextDouble());

		parcelamento.setDataPrimeiraParcela(RandomTestUtil.nextDate());

		parcelamento.setValorPrimeiraParcela(RandomTestUtil.nextDouble());

		_parcelamentos.add(_persistence.update(parcelamento));

		return parcelamento;
	}

	private List<Parcelamento> _parcelamentos = new ArrayList<Parcelamento>();
	private ParcelamentoPersistence _persistence;
	private ClassLoader _dynamicQueryClassLoader;

}
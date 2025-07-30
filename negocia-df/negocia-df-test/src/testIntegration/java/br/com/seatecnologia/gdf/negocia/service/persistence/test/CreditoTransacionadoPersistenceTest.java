/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.persistence.test;

import br.com.seatecnologia.gdf.negocia.exception.NoSuchCreditoTransacionadoException;
import br.com.seatecnologia.gdf.negocia.model.CreditoTransacionado;
import br.com.seatecnologia.gdf.negocia.service.CreditoTransacionadoLocalServiceUtil;
import br.com.seatecnologia.gdf.negocia.service.persistence.CreditoTransacionadoPersistence;
import br.com.seatecnologia.gdf.negocia.service.persistence.CreditoTransacionadoUtil;

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
public class CreditoTransacionadoPersistenceTest {

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
		_persistence = CreditoTransacionadoUtil.getPersistence();

		Class<?> clazz = _persistence.getClass();

		_dynamicQueryClassLoader = clazz.getClassLoader();
	}

	@After
	public void tearDown() throws Exception {
		Iterator<CreditoTransacionado> iterator =
			_creditoTransacionados.iterator();

		while (iterator.hasNext()) {
			_persistence.remove(iterator.next());

			iterator.remove();
		}
	}

	@Test
	public void testCreate() throws Exception {
		long pk = RandomTestUtil.nextLong();

		CreditoTransacionado creditoTransacionado = _persistence.create(pk);

		Assert.assertNotNull(creditoTransacionado);

		Assert.assertEquals(creditoTransacionado.getPrimaryKey(), pk);
	}

	@Test
	public void testRemove() throws Exception {
		CreditoTransacionado newCreditoTransacionado =
			addCreditoTransacionado();

		_persistence.remove(newCreditoTransacionado);

		CreditoTransacionado existingCreditoTransacionado =
			_persistence.fetchByPrimaryKey(
				newCreditoTransacionado.getPrimaryKey());

		Assert.assertNull(existingCreditoTransacionado);
	}

	@Test
	public void testUpdateNew() throws Exception {
		addCreditoTransacionado();
	}

	@Test
	public void testUpdateExisting() throws Exception {
		long pk = RandomTestUtil.nextLong();

		CreditoTransacionado newCreditoTransacionado = _persistence.create(pk);

		newCreditoTransacionado.setUuid(RandomTestUtil.randomString());

		newCreditoTransacionado.setPropostaId(RandomTestUtil.nextLong());

		newCreditoTransacionado.setNumeroInscricao(
			RandomTestUtil.randomString());

		newCreditoTransacionado.setCodigoReceita(RandomTestUtil.randomString());

		newCreditoTransacionado.setDataInscricao(RandomTestUtil.nextDate());

		newCreditoTransacionado.setValorAtualizado(RandomTestUtil.nextDouble());

		_creditoTransacionados.add(
			_persistence.update(newCreditoTransacionado));

		CreditoTransacionado existingCreditoTransacionado =
			_persistence.findByPrimaryKey(
				newCreditoTransacionado.getPrimaryKey());

		Assert.assertEquals(
			existingCreditoTransacionado.getUuid(),
			newCreditoTransacionado.getUuid());
		Assert.assertEquals(
			existingCreditoTransacionado.getCreditoId(),
			newCreditoTransacionado.getCreditoId());
		Assert.assertEquals(
			existingCreditoTransacionado.getPropostaId(),
			newCreditoTransacionado.getPropostaId());
		Assert.assertEquals(
			existingCreditoTransacionado.getNumeroInscricao(),
			newCreditoTransacionado.getNumeroInscricao());
		Assert.assertEquals(
			existingCreditoTransacionado.getCodigoReceita(),
			newCreditoTransacionado.getCodigoReceita());
		Assert.assertEquals(
			Time.getShortTimestamp(
				existingCreditoTransacionado.getDataInscricao()),
			Time.getShortTimestamp(newCreditoTransacionado.getDataInscricao()));
		AssertUtils.assertEquals(
			existingCreditoTransacionado.getValorAtualizado(),
			newCreditoTransacionado.getValorAtualizado());
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
		CreditoTransacionado newCreditoTransacionado =
			addCreditoTransacionado();

		CreditoTransacionado existingCreditoTransacionado =
			_persistence.findByPrimaryKey(
				newCreditoTransacionado.getPrimaryKey());

		Assert.assertEquals(
			existingCreditoTransacionado, newCreditoTransacionado);
	}

	@Test(expected = NoSuchCreditoTransacionadoException.class)
	public void testFindByPrimaryKeyMissing() throws Exception {
		long pk = RandomTestUtil.nextLong();

		_persistence.findByPrimaryKey(pk);
	}

	@Test
	public void testFindAll() throws Exception {
		_persistence.findAll(
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, getOrderByComparator());
	}

	protected OrderByComparator<CreditoTransacionado> getOrderByComparator() {
		return OrderByComparatorFactoryUtil.create(
			"GDF_CreditoTransacionado", "uuid", true, "creditoId", true,
			"propostaId", true, "numeroInscricao", true, "codigoReceita", true,
			"dataInscricao", true, "valorAtualizado", true);
	}

	@Test
	public void testFetchByPrimaryKeyExisting() throws Exception {
		CreditoTransacionado newCreditoTransacionado =
			addCreditoTransacionado();

		CreditoTransacionado existingCreditoTransacionado =
			_persistence.fetchByPrimaryKey(
				newCreditoTransacionado.getPrimaryKey());

		Assert.assertEquals(
			existingCreditoTransacionado, newCreditoTransacionado);
	}

	@Test
	public void testFetchByPrimaryKeyMissing() throws Exception {
		long pk = RandomTestUtil.nextLong();

		CreditoTransacionado missingCreditoTransacionado =
			_persistence.fetchByPrimaryKey(pk);

		Assert.assertNull(missingCreditoTransacionado);
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereAllPrimaryKeysExist()
		throws Exception {

		CreditoTransacionado newCreditoTransacionado1 =
			addCreditoTransacionado();
		CreditoTransacionado newCreditoTransacionado2 =
			addCreditoTransacionado();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newCreditoTransacionado1.getPrimaryKey());
		primaryKeys.add(newCreditoTransacionado2.getPrimaryKey());

		Map<Serializable, CreditoTransacionado> creditoTransacionados =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(2, creditoTransacionados.size());
		Assert.assertEquals(
			newCreditoTransacionado1,
			creditoTransacionados.get(
				newCreditoTransacionado1.getPrimaryKey()));
		Assert.assertEquals(
			newCreditoTransacionado2,
			creditoTransacionados.get(
				newCreditoTransacionado2.getPrimaryKey()));
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereNoPrimaryKeysExist()
		throws Exception {

		long pk1 = RandomTestUtil.nextLong();

		long pk2 = RandomTestUtil.nextLong();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(pk1);
		primaryKeys.add(pk2);

		Map<Serializable, CreditoTransacionado> creditoTransacionados =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertTrue(creditoTransacionados.isEmpty());
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereSomePrimaryKeysExist()
		throws Exception {

		CreditoTransacionado newCreditoTransacionado =
			addCreditoTransacionado();

		long pk = RandomTestUtil.nextLong();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newCreditoTransacionado.getPrimaryKey());
		primaryKeys.add(pk);

		Map<Serializable, CreditoTransacionado> creditoTransacionados =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(1, creditoTransacionados.size());
		Assert.assertEquals(
			newCreditoTransacionado,
			creditoTransacionados.get(newCreditoTransacionado.getPrimaryKey()));
	}

	@Test
	public void testFetchByPrimaryKeysWithNoPrimaryKeys() throws Exception {
		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		Map<Serializable, CreditoTransacionado> creditoTransacionados =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertTrue(creditoTransacionados.isEmpty());
	}

	@Test
	public void testFetchByPrimaryKeysWithOnePrimaryKey() throws Exception {
		CreditoTransacionado newCreditoTransacionado =
			addCreditoTransacionado();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newCreditoTransacionado.getPrimaryKey());

		Map<Serializable, CreditoTransacionado> creditoTransacionados =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(1, creditoTransacionados.size());
		Assert.assertEquals(
			newCreditoTransacionado,
			creditoTransacionados.get(newCreditoTransacionado.getPrimaryKey()));
	}

	@Test
	public void testActionableDynamicQuery() throws Exception {
		final IntegerWrapper count = new IntegerWrapper();

		ActionableDynamicQuery actionableDynamicQuery =
			CreditoTransacionadoLocalServiceUtil.getActionableDynamicQuery();

		actionableDynamicQuery.setPerformActionMethod(
			new ActionableDynamicQuery.PerformActionMethod
				<CreditoTransacionado>() {

				@Override
				public void performAction(
					CreditoTransacionado creditoTransacionado) {

					Assert.assertNotNull(creditoTransacionado);

					count.increment();
				}

			});

		actionableDynamicQuery.performActions();

		Assert.assertEquals(count.getValue(), _persistence.countAll());
	}

	@Test
	public void testDynamicQueryByPrimaryKeyExisting() throws Exception {
		CreditoTransacionado newCreditoTransacionado =
			addCreditoTransacionado();

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			CreditoTransacionado.class, _dynamicQueryClassLoader);

		dynamicQuery.add(
			RestrictionsFactoryUtil.eq(
				"creditoId", newCreditoTransacionado.getCreditoId()));

		List<CreditoTransacionado> result = _persistence.findWithDynamicQuery(
			dynamicQuery);

		Assert.assertEquals(1, result.size());

		CreditoTransacionado existingCreditoTransacionado = result.get(0);

		Assert.assertEquals(
			existingCreditoTransacionado, newCreditoTransacionado);
	}

	@Test
	public void testDynamicQueryByPrimaryKeyMissing() throws Exception {
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			CreditoTransacionado.class, _dynamicQueryClassLoader);

		dynamicQuery.add(
			RestrictionsFactoryUtil.eq("creditoId", RandomTestUtil.nextLong()));

		List<CreditoTransacionado> result = _persistence.findWithDynamicQuery(
			dynamicQuery);

		Assert.assertEquals(0, result.size());
	}

	@Test
	public void testDynamicQueryByProjectionExisting() throws Exception {
		CreditoTransacionado newCreditoTransacionado =
			addCreditoTransacionado();

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			CreditoTransacionado.class, _dynamicQueryClassLoader);

		dynamicQuery.setProjection(ProjectionFactoryUtil.property("creditoId"));

		Object newCreditoId = newCreditoTransacionado.getCreditoId();

		dynamicQuery.add(
			RestrictionsFactoryUtil.in(
				"creditoId", new Object[] {newCreditoId}));

		List<Object> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(1, result.size());

		Object existingCreditoId = result.get(0);

		Assert.assertEquals(existingCreditoId, newCreditoId);
	}

	@Test
	public void testDynamicQueryByProjectionMissing() throws Exception {
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			CreditoTransacionado.class, _dynamicQueryClassLoader);

		dynamicQuery.setProjection(ProjectionFactoryUtil.property("creditoId"));

		dynamicQuery.add(
			RestrictionsFactoryUtil.in(
				"creditoId", new Object[] {RandomTestUtil.nextLong()}));

		List<Object> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(0, result.size());
	}

	protected CreditoTransacionado addCreditoTransacionado() throws Exception {
		long pk = RandomTestUtil.nextLong();

		CreditoTransacionado creditoTransacionado = _persistence.create(pk);

		creditoTransacionado.setUuid(RandomTestUtil.randomString());

		creditoTransacionado.setPropostaId(RandomTestUtil.nextLong());

		creditoTransacionado.setNumeroInscricao(RandomTestUtil.randomString());

		creditoTransacionado.setCodigoReceita(RandomTestUtil.randomString());

		creditoTransacionado.setDataInscricao(RandomTestUtil.nextDate());

		creditoTransacionado.setValorAtualizado(RandomTestUtil.nextDouble());

		_creditoTransacionados.add(_persistence.update(creditoTransacionado));

		return creditoTransacionado;
	}

	private List<CreditoTransacionado> _creditoTransacionados =
		new ArrayList<CreditoTransacionado>();
	private CreditoTransacionadoPersistence _persistence;
	private ClassLoader _dynamicQueryClassLoader;

}
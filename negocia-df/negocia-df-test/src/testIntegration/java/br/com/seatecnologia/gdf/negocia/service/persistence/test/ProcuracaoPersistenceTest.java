/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.persistence.test;

import br.com.seatecnologia.gdf.negocia.exception.NoSuchProcuracaoException;
import br.com.seatecnologia.gdf.negocia.model.Procuracao;
import br.com.seatecnologia.gdf.negocia.service.ProcuracaoLocalServiceUtil;
import br.com.seatecnologia.gdf.negocia.service.persistence.ProcuracaoPersistence;
import br.com.seatecnologia.gdf.negocia.service.persistence.ProcuracaoUtil;

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
public class ProcuracaoPersistenceTest {

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
		_persistence = ProcuracaoUtil.getPersistence();

		Class<?> clazz = _persistence.getClass();

		_dynamicQueryClassLoader = clazz.getClassLoader();
	}

	@After
	public void tearDown() throws Exception {
		Iterator<Procuracao> iterator = _procuracaos.iterator();

		while (iterator.hasNext()) {
			_persistence.remove(iterator.next());

			iterator.remove();
		}
	}

	@Test
	public void testCreate() throws Exception {
		long pk = RandomTestUtil.nextLong();

		Procuracao procuracao = _persistence.create(pk);

		Assert.assertNotNull(procuracao);

		Assert.assertEquals(procuracao.getPrimaryKey(), pk);
	}

	@Test
	public void testRemove() throws Exception {
		Procuracao newProcuracao = addProcuracao();

		_persistence.remove(newProcuracao);

		Procuracao existingProcuracao = _persistence.fetchByPrimaryKey(
			newProcuracao.getPrimaryKey());

		Assert.assertNull(existingProcuracao);
	}

	@Test
	public void testUpdateNew() throws Exception {
		addProcuracao();
	}

	@Test
	public void testUpdateExisting() throws Exception {
		long pk = RandomTestUtil.nextLong();

		Procuracao newProcuracao = _persistence.create(pk);

		newProcuracao.setUuid(RandomTestUtil.randomString());

		newProcuracao.setPropostaId(RandomTestUtil.nextLong());

		newProcuracao.setProcuracao(RandomTestUtil.nextLong());

		_procuracaos.add(_persistence.update(newProcuracao));

		Procuracao existingProcuracao = _persistence.findByPrimaryKey(
			newProcuracao.getPrimaryKey());

		Assert.assertEquals(
			existingProcuracao.getUuid(), newProcuracao.getUuid());
		Assert.assertEquals(
			existingProcuracao.getProcuracaoId(),
			newProcuracao.getProcuracaoId());
		Assert.assertEquals(
			existingProcuracao.getPropostaId(), newProcuracao.getPropostaId());
		Assert.assertEquals(
			existingProcuracao.getProcuracao(), newProcuracao.getProcuracao());
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
		Procuracao newProcuracao = addProcuracao();

		Procuracao existingProcuracao = _persistence.findByPrimaryKey(
			newProcuracao.getPrimaryKey());

		Assert.assertEquals(existingProcuracao, newProcuracao);
	}

	@Test(expected = NoSuchProcuracaoException.class)
	public void testFindByPrimaryKeyMissing() throws Exception {
		long pk = RandomTestUtil.nextLong();

		_persistence.findByPrimaryKey(pk);
	}

	@Test
	public void testFindAll() throws Exception {
		_persistence.findAll(
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, getOrderByComparator());
	}

	protected OrderByComparator<Procuracao> getOrderByComparator() {
		return OrderByComparatorFactoryUtil.create(
			"GDF_Procuracao", "uuid", true, "procuracaoId", true, "propostaId",
			true, "procuracao", true);
	}

	@Test
	public void testFetchByPrimaryKeyExisting() throws Exception {
		Procuracao newProcuracao = addProcuracao();

		Procuracao existingProcuracao = _persistence.fetchByPrimaryKey(
			newProcuracao.getPrimaryKey());

		Assert.assertEquals(existingProcuracao, newProcuracao);
	}

	@Test
	public void testFetchByPrimaryKeyMissing() throws Exception {
		long pk = RandomTestUtil.nextLong();

		Procuracao missingProcuracao = _persistence.fetchByPrimaryKey(pk);

		Assert.assertNull(missingProcuracao);
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereAllPrimaryKeysExist()
		throws Exception {

		Procuracao newProcuracao1 = addProcuracao();
		Procuracao newProcuracao2 = addProcuracao();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newProcuracao1.getPrimaryKey());
		primaryKeys.add(newProcuracao2.getPrimaryKey());

		Map<Serializable, Procuracao> procuracaos =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(2, procuracaos.size());
		Assert.assertEquals(
			newProcuracao1, procuracaos.get(newProcuracao1.getPrimaryKey()));
		Assert.assertEquals(
			newProcuracao2, procuracaos.get(newProcuracao2.getPrimaryKey()));
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereNoPrimaryKeysExist()
		throws Exception {

		long pk1 = RandomTestUtil.nextLong();

		long pk2 = RandomTestUtil.nextLong();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(pk1);
		primaryKeys.add(pk2);

		Map<Serializable, Procuracao> procuracaos =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertTrue(procuracaos.isEmpty());
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereSomePrimaryKeysExist()
		throws Exception {

		Procuracao newProcuracao = addProcuracao();

		long pk = RandomTestUtil.nextLong();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newProcuracao.getPrimaryKey());
		primaryKeys.add(pk);

		Map<Serializable, Procuracao> procuracaos =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(1, procuracaos.size());
		Assert.assertEquals(
			newProcuracao, procuracaos.get(newProcuracao.getPrimaryKey()));
	}

	@Test
	public void testFetchByPrimaryKeysWithNoPrimaryKeys() throws Exception {
		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		Map<Serializable, Procuracao> procuracaos =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertTrue(procuracaos.isEmpty());
	}

	@Test
	public void testFetchByPrimaryKeysWithOnePrimaryKey() throws Exception {
		Procuracao newProcuracao = addProcuracao();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newProcuracao.getPrimaryKey());

		Map<Serializable, Procuracao> procuracaos =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(1, procuracaos.size());
		Assert.assertEquals(
			newProcuracao, procuracaos.get(newProcuracao.getPrimaryKey()));
	}

	@Test
	public void testActionableDynamicQuery() throws Exception {
		final IntegerWrapper count = new IntegerWrapper();

		ActionableDynamicQuery actionableDynamicQuery =
			ProcuracaoLocalServiceUtil.getActionableDynamicQuery();

		actionableDynamicQuery.setPerformActionMethod(
			new ActionableDynamicQuery.PerformActionMethod<Procuracao>() {

				@Override
				public void performAction(Procuracao procuracao) {
					Assert.assertNotNull(procuracao);

					count.increment();
				}

			});

		actionableDynamicQuery.performActions();

		Assert.assertEquals(count.getValue(), _persistence.countAll());
	}

	@Test
	public void testDynamicQueryByPrimaryKeyExisting() throws Exception {
		Procuracao newProcuracao = addProcuracao();

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			Procuracao.class, _dynamicQueryClassLoader);

		dynamicQuery.add(
			RestrictionsFactoryUtil.eq(
				"procuracaoId", newProcuracao.getProcuracaoId()));

		List<Procuracao> result = _persistence.findWithDynamicQuery(
			dynamicQuery);

		Assert.assertEquals(1, result.size());

		Procuracao existingProcuracao = result.get(0);

		Assert.assertEquals(existingProcuracao, newProcuracao);
	}

	@Test
	public void testDynamicQueryByPrimaryKeyMissing() throws Exception {
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			Procuracao.class, _dynamicQueryClassLoader);

		dynamicQuery.add(
			RestrictionsFactoryUtil.eq(
				"procuracaoId", RandomTestUtil.nextLong()));

		List<Procuracao> result = _persistence.findWithDynamicQuery(
			dynamicQuery);

		Assert.assertEquals(0, result.size());
	}

	@Test
	public void testDynamicQueryByProjectionExisting() throws Exception {
		Procuracao newProcuracao = addProcuracao();

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			Procuracao.class, _dynamicQueryClassLoader);

		dynamicQuery.setProjection(
			ProjectionFactoryUtil.property("procuracaoId"));

		Object newProcuracaoId = newProcuracao.getProcuracaoId();

		dynamicQuery.add(
			RestrictionsFactoryUtil.in(
				"procuracaoId", new Object[] {newProcuracaoId}));

		List<Object> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(1, result.size());

		Object existingProcuracaoId = result.get(0);

		Assert.assertEquals(existingProcuracaoId, newProcuracaoId);
	}

	@Test
	public void testDynamicQueryByProjectionMissing() throws Exception {
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			Procuracao.class, _dynamicQueryClassLoader);

		dynamicQuery.setProjection(
			ProjectionFactoryUtil.property("procuracaoId"));

		dynamicQuery.add(
			RestrictionsFactoryUtil.in(
				"procuracaoId", new Object[] {RandomTestUtil.nextLong()}));

		List<Object> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(0, result.size());
	}

	protected Procuracao addProcuracao() throws Exception {
		long pk = RandomTestUtil.nextLong();

		Procuracao procuracao = _persistence.create(pk);

		procuracao.setUuid(RandomTestUtil.randomString());

		procuracao.setPropostaId(RandomTestUtil.nextLong());

		procuracao.setProcuracao(RandomTestUtil.nextLong());

		_procuracaos.add(_persistence.update(procuracao));

		return procuracao;
	}

	private List<Procuracao> _procuracaos = new ArrayList<Procuracao>();
	private ProcuracaoPersistence _persistence;
	private ClassLoader _dynamicQueryClassLoader;

}
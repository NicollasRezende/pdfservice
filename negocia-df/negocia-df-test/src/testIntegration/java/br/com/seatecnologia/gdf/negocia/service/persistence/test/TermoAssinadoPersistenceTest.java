/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.persistence.test;

import br.com.seatecnologia.gdf.negocia.exception.NoSuchTermoAssinadoException;
import br.com.seatecnologia.gdf.negocia.model.TermoAssinado;
import br.com.seatecnologia.gdf.negocia.service.TermoAssinadoLocalServiceUtil;
import br.com.seatecnologia.gdf.negocia.service.persistence.TermoAssinadoPersistence;
import br.com.seatecnologia.gdf.negocia.service.persistence.TermoAssinadoUtil;

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
public class TermoAssinadoPersistenceTest {

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
		_persistence = TermoAssinadoUtil.getPersistence();

		Class<?> clazz = _persistence.getClass();

		_dynamicQueryClassLoader = clazz.getClassLoader();
	}

	@After
	public void tearDown() throws Exception {
		Iterator<TermoAssinado> iterator = _termoAssinados.iterator();

		while (iterator.hasNext()) {
			_persistence.remove(iterator.next());

			iterator.remove();
		}
	}

	@Test
	public void testCreate() throws Exception {
		long pk = RandomTestUtil.nextLong();

		TermoAssinado termoAssinado = _persistence.create(pk);

		Assert.assertNotNull(termoAssinado);

		Assert.assertEquals(termoAssinado.getPrimaryKey(), pk);
	}

	@Test
	public void testRemove() throws Exception {
		TermoAssinado newTermoAssinado = addTermoAssinado();

		_persistence.remove(newTermoAssinado);

		TermoAssinado existingTermoAssinado = _persistence.fetchByPrimaryKey(
			newTermoAssinado.getPrimaryKey());

		Assert.assertNull(existingTermoAssinado);
	}

	@Test
	public void testUpdateNew() throws Exception {
		addTermoAssinado();
	}

	@Test
	public void testUpdateExisting() throws Exception {
		long pk = RandomTestUtil.nextLong();

		TermoAssinado newTermoAssinado = _persistence.create(pk);

		newTermoAssinado.setUuid(RandomTestUtil.randomString());

		newTermoAssinado.setPropostaId(RandomTestUtil.nextLong());

		newTermoAssinado.setUrlTermo(RandomTestUtil.randomString());

		newTermoAssinado.setArquivoPdf(RandomTestUtil.randomString());

		newTermoAssinado.setParte(RandomTestUtil.randomString());

		_termoAssinados.add(_persistence.update(newTermoAssinado));

		TermoAssinado existingTermoAssinado = _persistence.findByPrimaryKey(
			newTermoAssinado.getPrimaryKey());

		Assert.assertEquals(
			existingTermoAssinado.getUuid(), newTermoAssinado.getUuid());
		Assert.assertEquals(
			existingTermoAssinado.getTermoId(), newTermoAssinado.getTermoId());
		Assert.assertEquals(
			existingTermoAssinado.getPropostaId(),
			newTermoAssinado.getPropostaId());
		Assert.assertEquals(
			existingTermoAssinado.getUrlTermo(),
			newTermoAssinado.getUrlTermo());
		Assert.assertEquals(
			existingTermoAssinado.getArquivoPdf(),
			newTermoAssinado.getArquivoPdf());
		Assert.assertEquals(
			existingTermoAssinado.getParte(), newTermoAssinado.getParte());
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
		TermoAssinado newTermoAssinado = addTermoAssinado();

		TermoAssinado existingTermoAssinado = _persistence.findByPrimaryKey(
			newTermoAssinado.getPrimaryKey());

		Assert.assertEquals(existingTermoAssinado, newTermoAssinado);
	}

	@Test(expected = NoSuchTermoAssinadoException.class)
	public void testFindByPrimaryKeyMissing() throws Exception {
		long pk = RandomTestUtil.nextLong();

		_persistence.findByPrimaryKey(pk);
	}

	@Test
	public void testFindAll() throws Exception {
		_persistence.findAll(
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, getOrderByComparator());
	}

	protected OrderByComparator<TermoAssinado> getOrderByComparator() {
		return OrderByComparatorFactoryUtil.create(
			"GDF_TermoAssinado", "uuid", true, "termoId", true, "propostaId",
			true, "urlTermo", true, "arquivoPdf", true, "parte", true);
	}

	@Test
	public void testFetchByPrimaryKeyExisting() throws Exception {
		TermoAssinado newTermoAssinado = addTermoAssinado();

		TermoAssinado existingTermoAssinado = _persistence.fetchByPrimaryKey(
			newTermoAssinado.getPrimaryKey());

		Assert.assertEquals(existingTermoAssinado, newTermoAssinado);
	}

	@Test
	public void testFetchByPrimaryKeyMissing() throws Exception {
		long pk = RandomTestUtil.nextLong();

		TermoAssinado missingTermoAssinado = _persistence.fetchByPrimaryKey(pk);

		Assert.assertNull(missingTermoAssinado);
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereAllPrimaryKeysExist()
		throws Exception {

		TermoAssinado newTermoAssinado1 = addTermoAssinado();
		TermoAssinado newTermoAssinado2 = addTermoAssinado();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newTermoAssinado1.getPrimaryKey());
		primaryKeys.add(newTermoAssinado2.getPrimaryKey());

		Map<Serializable, TermoAssinado> termoAssinados =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(2, termoAssinados.size());
		Assert.assertEquals(
			newTermoAssinado1,
			termoAssinados.get(newTermoAssinado1.getPrimaryKey()));
		Assert.assertEquals(
			newTermoAssinado2,
			termoAssinados.get(newTermoAssinado2.getPrimaryKey()));
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereNoPrimaryKeysExist()
		throws Exception {

		long pk1 = RandomTestUtil.nextLong();

		long pk2 = RandomTestUtil.nextLong();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(pk1);
		primaryKeys.add(pk2);

		Map<Serializable, TermoAssinado> termoAssinados =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertTrue(termoAssinados.isEmpty());
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereSomePrimaryKeysExist()
		throws Exception {

		TermoAssinado newTermoAssinado = addTermoAssinado();

		long pk = RandomTestUtil.nextLong();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newTermoAssinado.getPrimaryKey());
		primaryKeys.add(pk);

		Map<Serializable, TermoAssinado> termoAssinados =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(1, termoAssinados.size());
		Assert.assertEquals(
			newTermoAssinado,
			termoAssinados.get(newTermoAssinado.getPrimaryKey()));
	}

	@Test
	public void testFetchByPrimaryKeysWithNoPrimaryKeys() throws Exception {
		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		Map<Serializable, TermoAssinado> termoAssinados =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertTrue(termoAssinados.isEmpty());
	}

	@Test
	public void testFetchByPrimaryKeysWithOnePrimaryKey() throws Exception {
		TermoAssinado newTermoAssinado = addTermoAssinado();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newTermoAssinado.getPrimaryKey());

		Map<Serializable, TermoAssinado> termoAssinados =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(1, termoAssinados.size());
		Assert.assertEquals(
			newTermoAssinado,
			termoAssinados.get(newTermoAssinado.getPrimaryKey()));
	}

	@Test
	public void testActionableDynamicQuery() throws Exception {
		final IntegerWrapper count = new IntegerWrapper();

		ActionableDynamicQuery actionableDynamicQuery =
			TermoAssinadoLocalServiceUtil.getActionableDynamicQuery();

		actionableDynamicQuery.setPerformActionMethod(
			new ActionableDynamicQuery.PerformActionMethod<TermoAssinado>() {

				@Override
				public void performAction(TermoAssinado termoAssinado) {
					Assert.assertNotNull(termoAssinado);

					count.increment();
				}

			});

		actionableDynamicQuery.performActions();

		Assert.assertEquals(count.getValue(), _persistence.countAll());
	}

	@Test
	public void testDynamicQueryByPrimaryKeyExisting() throws Exception {
		TermoAssinado newTermoAssinado = addTermoAssinado();

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			TermoAssinado.class, _dynamicQueryClassLoader);

		dynamicQuery.add(
			RestrictionsFactoryUtil.eq(
				"termoId", newTermoAssinado.getTermoId()));

		List<TermoAssinado> result = _persistence.findWithDynamicQuery(
			dynamicQuery);

		Assert.assertEquals(1, result.size());

		TermoAssinado existingTermoAssinado = result.get(0);

		Assert.assertEquals(existingTermoAssinado, newTermoAssinado);
	}

	@Test
	public void testDynamicQueryByPrimaryKeyMissing() throws Exception {
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			TermoAssinado.class, _dynamicQueryClassLoader);

		dynamicQuery.add(
			RestrictionsFactoryUtil.eq("termoId", RandomTestUtil.nextLong()));

		List<TermoAssinado> result = _persistence.findWithDynamicQuery(
			dynamicQuery);

		Assert.assertEquals(0, result.size());
	}

	@Test
	public void testDynamicQueryByProjectionExisting() throws Exception {
		TermoAssinado newTermoAssinado = addTermoAssinado();

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			TermoAssinado.class, _dynamicQueryClassLoader);

		dynamicQuery.setProjection(ProjectionFactoryUtil.property("termoId"));

		Object newTermoId = newTermoAssinado.getTermoId();

		dynamicQuery.add(
			RestrictionsFactoryUtil.in("termoId", new Object[] {newTermoId}));

		List<Object> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(1, result.size());

		Object existingTermoId = result.get(0);

		Assert.assertEquals(existingTermoId, newTermoId);
	}

	@Test
	public void testDynamicQueryByProjectionMissing() throws Exception {
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			TermoAssinado.class, _dynamicQueryClassLoader);

		dynamicQuery.setProjection(ProjectionFactoryUtil.property("termoId"));

		dynamicQuery.add(
			RestrictionsFactoryUtil.in(
				"termoId", new Object[] {RandomTestUtil.nextLong()}));

		List<Object> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(0, result.size());
	}

	protected TermoAssinado addTermoAssinado() throws Exception {
		long pk = RandomTestUtil.nextLong();

		TermoAssinado termoAssinado = _persistence.create(pk);

		termoAssinado.setUuid(RandomTestUtil.randomString());

		termoAssinado.setPropostaId(RandomTestUtil.nextLong());

		termoAssinado.setUrlTermo(RandomTestUtil.randomString());

		termoAssinado.setArquivoPdf(RandomTestUtil.randomString());

		termoAssinado.setParte(RandomTestUtil.randomString());

		_termoAssinados.add(_persistence.update(termoAssinado));

		return termoAssinado;
	}

	private List<TermoAssinado> _termoAssinados =
		new ArrayList<TermoAssinado>();
	private TermoAssinadoPersistence _persistence;
	private ClassLoader _dynamicQueryClassLoader;

}
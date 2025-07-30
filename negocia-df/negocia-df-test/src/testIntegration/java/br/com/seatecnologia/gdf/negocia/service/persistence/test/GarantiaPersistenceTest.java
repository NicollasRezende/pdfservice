/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.persistence.test;

import br.com.seatecnologia.gdf.negocia.exception.NoSuchGarantiaException;
import br.com.seatecnologia.gdf.negocia.model.Garantia;
import br.com.seatecnologia.gdf.negocia.service.GarantiaLocalServiceUtil;
import br.com.seatecnologia.gdf.negocia.service.persistence.GarantiaPersistence;
import br.com.seatecnologia.gdf.negocia.service.persistence.GarantiaUtil;

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
public class GarantiaPersistenceTest {

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
		_persistence = GarantiaUtil.getPersistence();

		Class<?> clazz = _persistence.getClass();

		_dynamicQueryClassLoader = clazz.getClassLoader();
	}

	@After
	public void tearDown() throws Exception {
		Iterator<Garantia> iterator = _garantias.iterator();

		while (iterator.hasNext()) {
			_persistence.remove(iterator.next());

			iterator.remove();
		}
	}

	@Test
	public void testCreate() throws Exception {
		long pk = RandomTestUtil.nextLong();

		Garantia garantia = _persistence.create(pk);

		Assert.assertNotNull(garantia);

		Assert.assertEquals(garantia.getPrimaryKey(), pk);
	}

	@Test
	public void testRemove() throws Exception {
		Garantia newGarantia = addGarantia();

		_persistence.remove(newGarantia);

		Garantia existingGarantia = _persistence.fetchByPrimaryKey(
			newGarantia.getPrimaryKey());

		Assert.assertNull(existingGarantia);
	}

	@Test
	public void testUpdateNew() throws Exception {
		addGarantia();
	}

	@Test
	public void testUpdateExisting() throws Exception {
		long pk = RandomTestUtil.nextLong();

		Garantia newGarantia = _persistence.create(pk);

		newGarantia.setUuid(RandomTestUtil.randomString());

		newGarantia.setPropostaId(RandomTestUtil.nextLong());

		newGarantia.setTipoGarantia(RandomTestUtil.randomString());

		newGarantia.setTipoDevedor(RandomTestUtil.randomString());

		newGarantia.setOutras(RandomTestUtil.randomString());

		newGarantia.setDescricaoBem(RandomTestUtil.randomString());

		newGarantia.setProprietarioQualificacao(RandomTestUtil.nextLong());

		newGarantia.setValorEstimado(RandomTestUtil.nextDouble());

		newGarantia.setDadosRegistroId(RandomTestUtil.nextLong());

		newGarantia.setLocalizacao(RandomTestUtil.randomString());

		newGarantia.setDeclaracaoAnuencia(RandomTestUtil.randomBoolean());

		newGarantia.setDeclaracao(RandomTestUtil.nextLong());

		_garantias.add(_persistence.update(newGarantia));

		Garantia existingGarantia = _persistence.findByPrimaryKey(
			newGarantia.getPrimaryKey());

		Assert.assertEquals(existingGarantia.getUuid(), newGarantia.getUuid());
		Assert.assertEquals(
			existingGarantia.getGarantiaId(), newGarantia.getGarantiaId());
		Assert.assertEquals(
			existingGarantia.getPropostaId(), newGarantia.getPropostaId());
		Assert.assertEquals(
			existingGarantia.getTipoGarantia(), newGarantia.getTipoGarantia());
		Assert.assertEquals(
			existingGarantia.getTipoDevedor(), newGarantia.getTipoDevedor());
		Assert.assertEquals(
			existingGarantia.getOutras(), newGarantia.getOutras());
		Assert.assertEquals(
			existingGarantia.getDescricaoBem(), newGarantia.getDescricaoBem());
		Assert.assertEquals(
			existingGarantia.getProprietarioQualificacao(),
			newGarantia.getProprietarioQualificacao());
		AssertUtils.assertEquals(
			existingGarantia.getValorEstimado(),
			newGarantia.getValorEstimado());
		Assert.assertEquals(
			existingGarantia.getDadosRegistroId(),
			newGarantia.getDadosRegistroId());
		Assert.assertEquals(
			existingGarantia.getLocalizacao(), newGarantia.getLocalizacao());
		Assert.assertEquals(
			existingGarantia.isDeclaracaoAnuencia(),
			newGarantia.isDeclaracaoAnuencia());
		Assert.assertEquals(
			existingGarantia.getDeclaracao(), newGarantia.getDeclaracao());
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
		Garantia newGarantia = addGarantia();

		Garantia existingGarantia = _persistence.findByPrimaryKey(
			newGarantia.getPrimaryKey());

		Assert.assertEquals(existingGarantia, newGarantia);
	}

	@Test(expected = NoSuchGarantiaException.class)
	public void testFindByPrimaryKeyMissing() throws Exception {
		long pk = RandomTestUtil.nextLong();

		_persistence.findByPrimaryKey(pk);
	}

	@Test
	public void testFindAll() throws Exception {
		_persistence.findAll(
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, getOrderByComparator());
	}

	protected OrderByComparator<Garantia> getOrderByComparator() {
		return OrderByComparatorFactoryUtil.create(
			"GDF_Garantia", "uuid", true, "garantiaId", true, "propostaId",
			true, "tipoGarantia", true, "tipoDevedor", true, "outras", true,
			"descricaoBem", true, "proprietarioQualificacao", true,
			"valorEstimado", true, "dadosRegistroId", true, "localizacao", true,
			"declaracaoAnuencia", true, "declaracao", true);
	}

	@Test
	public void testFetchByPrimaryKeyExisting() throws Exception {
		Garantia newGarantia = addGarantia();

		Garantia existingGarantia = _persistence.fetchByPrimaryKey(
			newGarantia.getPrimaryKey());

		Assert.assertEquals(existingGarantia, newGarantia);
	}

	@Test
	public void testFetchByPrimaryKeyMissing() throws Exception {
		long pk = RandomTestUtil.nextLong();

		Garantia missingGarantia = _persistence.fetchByPrimaryKey(pk);

		Assert.assertNull(missingGarantia);
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereAllPrimaryKeysExist()
		throws Exception {

		Garantia newGarantia1 = addGarantia();
		Garantia newGarantia2 = addGarantia();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newGarantia1.getPrimaryKey());
		primaryKeys.add(newGarantia2.getPrimaryKey());

		Map<Serializable, Garantia> garantias = _persistence.fetchByPrimaryKeys(
			primaryKeys);

		Assert.assertEquals(2, garantias.size());
		Assert.assertEquals(
			newGarantia1, garantias.get(newGarantia1.getPrimaryKey()));
		Assert.assertEquals(
			newGarantia2, garantias.get(newGarantia2.getPrimaryKey()));
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereNoPrimaryKeysExist()
		throws Exception {

		long pk1 = RandomTestUtil.nextLong();

		long pk2 = RandomTestUtil.nextLong();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(pk1);
		primaryKeys.add(pk2);

		Map<Serializable, Garantia> garantias = _persistence.fetchByPrimaryKeys(
			primaryKeys);

		Assert.assertTrue(garantias.isEmpty());
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereSomePrimaryKeysExist()
		throws Exception {

		Garantia newGarantia = addGarantia();

		long pk = RandomTestUtil.nextLong();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newGarantia.getPrimaryKey());
		primaryKeys.add(pk);

		Map<Serializable, Garantia> garantias = _persistence.fetchByPrimaryKeys(
			primaryKeys);

		Assert.assertEquals(1, garantias.size());
		Assert.assertEquals(
			newGarantia, garantias.get(newGarantia.getPrimaryKey()));
	}

	@Test
	public void testFetchByPrimaryKeysWithNoPrimaryKeys() throws Exception {
		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		Map<Serializable, Garantia> garantias = _persistence.fetchByPrimaryKeys(
			primaryKeys);

		Assert.assertTrue(garantias.isEmpty());
	}

	@Test
	public void testFetchByPrimaryKeysWithOnePrimaryKey() throws Exception {
		Garantia newGarantia = addGarantia();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newGarantia.getPrimaryKey());

		Map<Serializable, Garantia> garantias = _persistence.fetchByPrimaryKeys(
			primaryKeys);

		Assert.assertEquals(1, garantias.size());
		Assert.assertEquals(
			newGarantia, garantias.get(newGarantia.getPrimaryKey()));
	}

	@Test
	public void testActionableDynamicQuery() throws Exception {
		final IntegerWrapper count = new IntegerWrapper();

		ActionableDynamicQuery actionableDynamicQuery =
			GarantiaLocalServiceUtil.getActionableDynamicQuery();

		actionableDynamicQuery.setPerformActionMethod(
			new ActionableDynamicQuery.PerformActionMethod<Garantia>() {

				@Override
				public void performAction(Garantia garantia) {
					Assert.assertNotNull(garantia);

					count.increment();
				}

			});

		actionableDynamicQuery.performActions();

		Assert.assertEquals(count.getValue(), _persistence.countAll());
	}

	@Test
	public void testDynamicQueryByPrimaryKeyExisting() throws Exception {
		Garantia newGarantia = addGarantia();

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			Garantia.class, _dynamicQueryClassLoader);

		dynamicQuery.add(
			RestrictionsFactoryUtil.eq(
				"garantiaId", newGarantia.getGarantiaId()));

		List<Garantia> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(1, result.size());

		Garantia existingGarantia = result.get(0);

		Assert.assertEquals(existingGarantia, newGarantia);
	}

	@Test
	public void testDynamicQueryByPrimaryKeyMissing() throws Exception {
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			Garantia.class, _dynamicQueryClassLoader);

		dynamicQuery.add(
			RestrictionsFactoryUtil.eq(
				"garantiaId", RandomTestUtil.nextLong()));

		List<Garantia> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(0, result.size());
	}

	@Test
	public void testDynamicQueryByProjectionExisting() throws Exception {
		Garantia newGarantia = addGarantia();

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			Garantia.class, _dynamicQueryClassLoader);

		dynamicQuery.setProjection(
			ProjectionFactoryUtil.property("garantiaId"));

		Object newGarantiaId = newGarantia.getGarantiaId();

		dynamicQuery.add(
			RestrictionsFactoryUtil.in(
				"garantiaId", new Object[] {newGarantiaId}));

		List<Object> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(1, result.size());

		Object existingGarantiaId = result.get(0);

		Assert.assertEquals(existingGarantiaId, newGarantiaId);
	}

	@Test
	public void testDynamicQueryByProjectionMissing() throws Exception {
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			Garantia.class, _dynamicQueryClassLoader);

		dynamicQuery.setProjection(
			ProjectionFactoryUtil.property("garantiaId"));

		dynamicQuery.add(
			RestrictionsFactoryUtil.in(
				"garantiaId", new Object[] {RandomTestUtil.nextLong()}));

		List<Object> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(0, result.size());
	}

	protected Garantia addGarantia() throws Exception {
		long pk = RandomTestUtil.nextLong();

		Garantia garantia = _persistence.create(pk);

		garantia.setUuid(RandomTestUtil.randomString());

		garantia.setPropostaId(RandomTestUtil.nextLong());

		garantia.setTipoGarantia(RandomTestUtil.randomString());

		garantia.setTipoDevedor(RandomTestUtil.randomString());

		garantia.setOutras(RandomTestUtil.randomString());

		garantia.setDescricaoBem(RandomTestUtil.randomString());

		garantia.setProprietarioQualificacao(RandomTestUtil.nextLong());

		garantia.setValorEstimado(RandomTestUtil.nextDouble());

		garantia.setDadosRegistroId(RandomTestUtil.nextLong());

		garantia.setLocalizacao(RandomTestUtil.randomString());

		garantia.setDeclaracaoAnuencia(RandomTestUtil.randomBoolean());

		garantia.setDeclaracao(RandomTestUtil.nextLong());

		_garantias.add(_persistence.update(garantia));

		return garantia;
	}

	private List<Garantia> _garantias = new ArrayList<Garantia>();
	private GarantiaPersistence _persistence;
	private ClassLoader _dynamicQueryClassLoader;

}
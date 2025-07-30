/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.persistence.test;

import br.com.seatecnologia.gdf.negocia.exception.NoSuchRelacaoCredorException;
import br.com.seatecnologia.gdf.negocia.model.RelacaoCredor;
import br.com.seatecnologia.gdf.negocia.service.RelacaoCredorLocalServiceUtil;
import br.com.seatecnologia.gdf.negocia.service.persistence.RelacaoCredorPersistence;
import br.com.seatecnologia.gdf.negocia.service.persistence.RelacaoCredorUtil;

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
public class RelacaoCredorPersistenceTest {

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
		_persistence = RelacaoCredorUtil.getPersistence();

		Class<?> clazz = _persistence.getClass();

		_dynamicQueryClassLoader = clazz.getClassLoader();
	}

	@After
	public void tearDown() throws Exception {
		Iterator<RelacaoCredor> iterator = _relacaoCredors.iterator();

		while (iterator.hasNext()) {
			_persistence.remove(iterator.next());

			iterator.remove();
		}
	}

	@Test
	public void testCreate() throws Exception {
		long pk = RandomTestUtil.nextLong();

		RelacaoCredor relacaoCredor = _persistence.create(pk);

		Assert.assertNotNull(relacaoCredor);

		Assert.assertEquals(relacaoCredor.getPrimaryKey(), pk);
	}

	@Test
	public void testRemove() throws Exception {
		RelacaoCredor newRelacaoCredor = addRelacaoCredor();

		_persistence.remove(newRelacaoCredor);

		RelacaoCredor existingRelacaoCredor = _persistence.fetchByPrimaryKey(
			newRelacaoCredor.getPrimaryKey());

		Assert.assertNull(existingRelacaoCredor);
	}

	@Test
	public void testUpdateNew() throws Exception {
		addRelacaoCredor();
	}

	@Test
	public void testUpdateExisting() throws Exception {
		long pk = RandomTestUtil.nextLong();

		RelacaoCredor newRelacaoCredor = _persistence.create(pk);

		newRelacaoCredor.setUuid(RandomTestUtil.randomString());

		newRelacaoCredor.setPropostaId(RandomTestUtil.nextLong());

		newRelacaoCredor.setNomeCredor(RandomTestUtil.randomString());

		newRelacaoCredor.setNaturezaCredito(RandomTestUtil.randomString());

		newRelacaoCredor.setClassificacaoCredito(RandomTestUtil.randomString());

		newRelacaoCredor.setValorAtualizado(RandomTestUtil.nextDouble());

		newRelacaoCredor.setReferenciaContabil(RandomTestUtil.randomString());

		_relacaoCredors.add(_persistence.update(newRelacaoCredor));

		RelacaoCredor existingRelacaoCredor = _persistence.findByPrimaryKey(
			newRelacaoCredor.getPrimaryKey());

		Assert.assertEquals(
			existingRelacaoCredor.getUuid(), newRelacaoCredor.getUuid());
		Assert.assertEquals(
			existingRelacaoCredor.getCredorId(),
			newRelacaoCredor.getCredorId());
		Assert.assertEquals(
			existingRelacaoCredor.getPropostaId(),
			newRelacaoCredor.getPropostaId());
		Assert.assertEquals(
			existingRelacaoCredor.getNomeCredor(),
			newRelacaoCredor.getNomeCredor());
		Assert.assertEquals(
			existingRelacaoCredor.getNaturezaCredito(),
			newRelacaoCredor.getNaturezaCredito());
		Assert.assertEquals(
			existingRelacaoCredor.getClassificacaoCredito(),
			newRelacaoCredor.getClassificacaoCredito());
		AssertUtils.assertEquals(
			existingRelacaoCredor.getValorAtualizado(),
			newRelacaoCredor.getValorAtualizado());
		Assert.assertEquals(
			existingRelacaoCredor.getReferenciaContabil(),
			newRelacaoCredor.getReferenciaContabil());
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
		RelacaoCredor newRelacaoCredor = addRelacaoCredor();

		RelacaoCredor existingRelacaoCredor = _persistence.findByPrimaryKey(
			newRelacaoCredor.getPrimaryKey());

		Assert.assertEquals(existingRelacaoCredor, newRelacaoCredor);
	}

	@Test(expected = NoSuchRelacaoCredorException.class)
	public void testFindByPrimaryKeyMissing() throws Exception {
		long pk = RandomTestUtil.nextLong();

		_persistence.findByPrimaryKey(pk);
	}

	@Test
	public void testFindAll() throws Exception {
		_persistence.findAll(
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, getOrderByComparator());
	}

	protected OrderByComparator<RelacaoCredor> getOrderByComparator() {
		return OrderByComparatorFactoryUtil.create(
			"GDF_RelacaoCredor", "uuid", true, "credorId", true, "propostaId",
			true, "nomeCredor", true, "naturezaCredito", true,
			"classificacaoCredito", true, "valorAtualizado", true,
			"referenciaContabil", true);
	}

	@Test
	public void testFetchByPrimaryKeyExisting() throws Exception {
		RelacaoCredor newRelacaoCredor = addRelacaoCredor();

		RelacaoCredor existingRelacaoCredor = _persistence.fetchByPrimaryKey(
			newRelacaoCredor.getPrimaryKey());

		Assert.assertEquals(existingRelacaoCredor, newRelacaoCredor);
	}

	@Test
	public void testFetchByPrimaryKeyMissing() throws Exception {
		long pk = RandomTestUtil.nextLong();

		RelacaoCredor missingRelacaoCredor = _persistence.fetchByPrimaryKey(pk);

		Assert.assertNull(missingRelacaoCredor);
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereAllPrimaryKeysExist()
		throws Exception {

		RelacaoCredor newRelacaoCredor1 = addRelacaoCredor();
		RelacaoCredor newRelacaoCredor2 = addRelacaoCredor();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newRelacaoCredor1.getPrimaryKey());
		primaryKeys.add(newRelacaoCredor2.getPrimaryKey());

		Map<Serializable, RelacaoCredor> relacaoCredors =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(2, relacaoCredors.size());
		Assert.assertEquals(
			newRelacaoCredor1,
			relacaoCredors.get(newRelacaoCredor1.getPrimaryKey()));
		Assert.assertEquals(
			newRelacaoCredor2,
			relacaoCredors.get(newRelacaoCredor2.getPrimaryKey()));
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereNoPrimaryKeysExist()
		throws Exception {

		long pk1 = RandomTestUtil.nextLong();

		long pk2 = RandomTestUtil.nextLong();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(pk1);
		primaryKeys.add(pk2);

		Map<Serializable, RelacaoCredor> relacaoCredors =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertTrue(relacaoCredors.isEmpty());
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereSomePrimaryKeysExist()
		throws Exception {

		RelacaoCredor newRelacaoCredor = addRelacaoCredor();

		long pk = RandomTestUtil.nextLong();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newRelacaoCredor.getPrimaryKey());
		primaryKeys.add(pk);

		Map<Serializable, RelacaoCredor> relacaoCredors =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(1, relacaoCredors.size());
		Assert.assertEquals(
			newRelacaoCredor,
			relacaoCredors.get(newRelacaoCredor.getPrimaryKey()));
	}

	@Test
	public void testFetchByPrimaryKeysWithNoPrimaryKeys() throws Exception {
		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		Map<Serializable, RelacaoCredor> relacaoCredors =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertTrue(relacaoCredors.isEmpty());
	}

	@Test
	public void testFetchByPrimaryKeysWithOnePrimaryKey() throws Exception {
		RelacaoCredor newRelacaoCredor = addRelacaoCredor();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newRelacaoCredor.getPrimaryKey());

		Map<Serializable, RelacaoCredor> relacaoCredors =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(1, relacaoCredors.size());
		Assert.assertEquals(
			newRelacaoCredor,
			relacaoCredors.get(newRelacaoCredor.getPrimaryKey()));
	}

	@Test
	public void testActionableDynamicQuery() throws Exception {
		final IntegerWrapper count = new IntegerWrapper();

		ActionableDynamicQuery actionableDynamicQuery =
			RelacaoCredorLocalServiceUtil.getActionableDynamicQuery();

		actionableDynamicQuery.setPerformActionMethod(
			new ActionableDynamicQuery.PerformActionMethod<RelacaoCredor>() {

				@Override
				public void performAction(RelacaoCredor relacaoCredor) {
					Assert.assertNotNull(relacaoCredor);

					count.increment();
				}

			});

		actionableDynamicQuery.performActions();

		Assert.assertEquals(count.getValue(), _persistence.countAll());
	}

	@Test
	public void testDynamicQueryByPrimaryKeyExisting() throws Exception {
		RelacaoCredor newRelacaoCredor = addRelacaoCredor();

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			RelacaoCredor.class, _dynamicQueryClassLoader);

		dynamicQuery.add(
			RestrictionsFactoryUtil.eq(
				"credorId", newRelacaoCredor.getCredorId()));

		List<RelacaoCredor> result = _persistence.findWithDynamicQuery(
			dynamicQuery);

		Assert.assertEquals(1, result.size());

		RelacaoCredor existingRelacaoCredor = result.get(0);

		Assert.assertEquals(existingRelacaoCredor, newRelacaoCredor);
	}

	@Test
	public void testDynamicQueryByPrimaryKeyMissing() throws Exception {
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			RelacaoCredor.class, _dynamicQueryClassLoader);

		dynamicQuery.add(
			RestrictionsFactoryUtil.eq("credorId", RandomTestUtil.nextLong()));

		List<RelacaoCredor> result = _persistence.findWithDynamicQuery(
			dynamicQuery);

		Assert.assertEquals(0, result.size());
	}

	@Test
	public void testDynamicQueryByProjectionExisting() throws Exception {
		RelacaoCredor newRelacaoCredor = addRelacaoCredor();

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			RelacaoCredor.class, _dynamicQueryClassLoader);

		dynamicQuery.setProjection(ProjectionFactoryUtil.property("credorId"));

		Object newCredorId = newRelacaoCredor.getCredorId();

		dynamicQuery.add(
			RestrictionsFactoryUtil.in("credorId", new Object[] {newCredorId}));

		List<Object> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(1, result.size());

		Object existingCredorId = result.get(0);

		Assert.assertEquals(existingCredorId, newCredorId);
	}

	@Test
	public void testDynamicQueryByProjectionMissing() throws Exception {
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			RelacaoCredor.class, _dynamicQueryClassLoader);

		dynamicQuery.setProjection(ProjectionFactoryUtil.property("credorId"));

		dynamicQuery.add(
			RestrictionsFactoryUtil.in(
				"credorId", new Object[] {RandomTestUtil.nextLong()}));

		List<Object> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(0, result.size());
	}

	protected RelacaoCredor addRelacaoCredor() throws Exception {
		long pk = RandomTestUtil.nextLong();

		RelacaoCredor relacaoCredor = _persistence.create(pk);

		relacaoCredor.setUuid(RandomTestUtil.randomString());

		relacaoCredor.setPropostaId(RandomTestUtil.nextLong());

		relacaoCredor.setNomeCredor(RandomTestUtil.randomString());

		relacaoCredor.setNaturezaCredito(RandomTestUtil.randomString());

		relacaoCredor.setClassificacaoCredito(RandomTestUtil.randomString());

		relacaoCredor.setValorAtualizado(RandomTestUtil.nextDouble());

		relacaoCredor.setReferenciaContabil(RandomTestUtil.randomString());

		_relacaoCredors.add(_persistence.update(relacaoCredor));

		return relacaoCredor;
	}

	private List<RelacaoCredor> _relacaoCredors =
		new ArrayList<RelacaoCredor>();
	private RelacaoCredorPersistence _persistence;
	private ClassLoader _dynamicQueryClassLoader;

}
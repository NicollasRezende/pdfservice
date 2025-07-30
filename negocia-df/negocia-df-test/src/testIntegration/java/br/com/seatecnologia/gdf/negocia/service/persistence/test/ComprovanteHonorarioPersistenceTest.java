/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.persistence.test;

import br.com.seatecnologia.gdf.negocia.exception.NoSuchComprovanteHonorarioException;
import br.com.seatecnologia.gdf.negocia.model.ComprovanteHonorario;
import br.com.seatecnologia.gdf.negocia.service.ComprovanteHonorarioLocalServiceUtil;
import br.com.seatecnologia.gdf.negocia.service.persistence.ComprovanteHonorarioPersistence;
import br.com.seatecnologia.gdf.negocia.service.persistence.ComprovanteHonorarioUtil;

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
public class ComprovanteHonorarioPersistenceTest {

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
		_persistence = ComprovanteHonorarioUtil.getPersistence();

		Class<?> clazz = _persistence.getClass();

		_dynamicQueryClassLoader = clazz.getClassLoader();
	}

	@After
	public void tearDown() throws Exception {
		Iterator<ComprovanteHonorario> iterator =
			_comprovanteHonorarios.iterator();

		while (iterator.hasNext()) {
			_persistence.remove(iterator.next());

			iterator.remove();
		}
	}

	@Test
	public void testCreate() throws Exception {
		long pk = RandomTestUtil.nextLong();

		ComprovanteHonorario comprovanteHonorario = _persistence.create(pk);

		Assert.assertNotNull(comprovanteHonorario);

		Assert.assertEquals(comprovanteHonorario.getPrimaryKey(), pk);
	}

	@Test
	public void testRemove() throws Exception {
		ComprovanteHonorario newComprovanteHonorario =
			addComprovanteHonorario();

		_persistence.remove(newComprovanteHonorario);

		ComprovanteHonorario existingComprovanteHonorario =
			_persistence.fetchByPrimaryKey(
				newComprovanteHonorario.getPrimaryKey());

		Assert.assertNull(existingComprovanteHonorario);
	}

	@Test
	public void testUpdateNew() throws Exception {
		addComprovanteHonorario();
	}

	@Test
	public void testUpdateExisting() throws Exception {
		long pk = RandomTestUtil.nextLong();

		ComprovanteHonorario newComprovanteHonorario = _persistence.create(pk);

		newComprovanteHonorario.setUuid(RandomTestUtil.randomString());

		newComprovanteHonorario.setPropostaId(RandomTestUtil.nextLong());

		newComprovanteHonorario.setValorPago(RandomTestUtil.nextDouble());

		newComprovanteHonorario.setDataPagamento(RandomTestUtil.nextDate());

		newComprovanteHonorario.setFileEntryId(RandomTestUtil.nextLong());

		_comprovanteHonorarios.add(
			_persistence.update(newComprovanteHonorario));

		ComprovanteHonorario existingComprovanteHonorario =
			_persistence.findByPrimaryKey(
				newComprovanteHonorario.getPrimaryKey());

		Assert.assertEquals(
			existingComprovanteHonorario.getUuid(),
			newComprovanteHonorario.getUuid());
		Assert.assertEquals(
			existingComprovanteHonorario.getComprovanteId(),
			newComprovanteHonorario.getComprovanteId());
		Assert.assertEquals(
			existingComprovanteHonorario.getPropostaId(),
			newComprovanteHonorario.getPropostaId());
		AssertUtils.assertEquals(
			existingComprovanteHonorario.getValorPago(),
			newComprovanteHonorario.getValorPago());
		Assert.assertEquals(
			Time.getShortTimestamp(
				existingComprovanteHonorario.getDataPagamento()),
			Time.getShortTimestamp(newComprovanteHonorario.getDataPagamento()));
		Assert.assertEquals(
			existingComprovanteHonorario.getFileEntryId(),
			newComprovanteHonorario.getFileEntryId());
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
		ComprovanteHonorario newComprovanteHonorario =
			addComprovanteHonorario();

		ComprovanteHonorario existingComprovanteHonorario =
			_persistence.findByPrimaryKey(
				newComprovanteHonorario.getPrimaryKey());

		Assert.assertEquals(
			existingComprovanteHonorario, newComprovanteHonorario);
	}

	@Test(expected = NoSuchComprovanteHonorarioException.class)
	public void testFindByPrimaryKeyMissing() throws Exception {
		long pk = RandomTestUtil.nextLong();

		_persistence.findByPrimaryKey(pk);
	}

	@Test
	public void testFindAll() throws Exception {
		_persistence.findAll(
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, getOrderByComparator());
	}

	protected OrderByComparator<ComprovanteHonorario> getOrderByComparator() {
		return OrderByComparatorFactoryUtil.create(
			"GDF_ComprovanteHonorario", "uuid", true, "comprovanteId", true,
			"propostaId", true, "valorPago", true, "dataPagamento", true,
			"fileEntryId", true);
	}

	@Test
	public void testFetchByPrimaryKeyExisting() throws Exception {
		ComprovanteHonorario newComprovanteHonorario =
			addComprovanteHonorario();

		ComprovanteHonorario existingComprovanteHonorario =
			_persistence.fetchByPrimaryKey(
				newComprovanteHonorario.getPrimaryKey());

		Assert.assertEquals(
			existingComprovanteHonorario, newComprovanteHonorario);
	}

	@Test
	public void testFetchByPrimaryKeyMissing() throws Exception {
		long pk = RandomTestUtil.nextLong();

		ComprovanteHonorario missingComprovanteHonorario =
			_persistence.fetchByPrimaryKey(pk);

		Assert.assertNull(missingComprovanteHonorario);
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereAllPrimaryKeysExist()
		throws Exception {

		ComprovanteHonorario newComprovanteHonorario1 =
			addComprovanteHonorario();
		ComprovanteHonorario newComprovanteHonorario2 =
			addComprovanteHonorario();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newComprovanteHonorario1.getPrimaryKey());
		primaryKeys.add(newComprovanteHonorario2.getPrimaryKey());

		Map<Serializable, ComprovanteHonorario> comprovanteHonorarios =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(2, comprovanteHonorarios.size());
		Assert.assertEquals(
			newComprovanteHonorario1,
			comprovanteHonorarios.get(
				newComprovanteHonorario1.getPrimaryKey()));
		Assert.assertEquals(
			newComprovanteHonorario2,
			comprovanteHonorarios.get(
				newComprovanteHonorario2.getPrimaryKey()));
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereNoPrimaryKeysExist()
		throws Exception {

		long pk1 = RandomTestUtil.nextLong();

		long pk2 = RandomTestUtil.nextLong();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(pk1);
		primaryKeys.add(pk2);

		Map<Serializable, ComprovanteHonorario> comprovanteHonorarios =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertTrue(comprovanteHonorarios.isEmpty());
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereSomePrimaryKeysExist()
		throws Exception {

		ComprovanteHonorario newComprovanteHonorario =
			addComprovanteHonorario();

		long pk = RandomTestUtil.nextLong();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newComprovanteHonorario.getPrimaryKey());
		primaryKeys.add(pk);

		Map<Serializable, ComprovanteHonorario> comprovanteHonorarios =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(1, comprovanteHonorarios.size());
		Assert.assertEquals(
			newComprovanteHonorario,
			comprovanteHonorarios.get(newComprovanteHonorario.getPrimaryKey()));
	}

	@Test
	public void testFetchByPrimaryKeysWithNoPrimaryKeys() throws Exception {
		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		Map<Serializable, ComprovanteHonorario> comprovanteHonorarios =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertTrue(comprovanteHonorarios.isEmpty());
	}

	@Test
	public void testFetchByPrimaryKeysWithOnePrimaryKey() throws Exception {
		ComprovanteHonorario newComprovanteHonorario =
			addComprovanteHonorario();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newComprovanteHonorario.getPrimaryKey());

		Map<Serializable, ComprovanteHonorario> comprovanteHonorarios =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(1, comprovanteHonorarios.size());
		Assert.assertEquals(
			newComprovanteHonorario,
			comprovanteHonorarios.get(newComprovanteHonorario.getPrimaryKey()));
	}

	@Test
	public void testActionableDynamicQuery() throws Exception {
		final IntegerWrapper count = new IntegerWrapper();

		ActionableDynamicQuery actionableDynamicQuery =
			ComprovanteHonorarioLocalServiceUtil.getActionableDynamicQuery();

		actionableDynamicQuery.setPerformActionMethod(
			new ActionableDynamicQuery.PerformActionMethod
				<ComprovanteHonorario>() {

				@Override
				public void performAction(
					ComprovanteHonorario comprovanteHonorario) {

					Assert.assertNotNull(comprovanteHonorario);

					count.increment();
				}

			});

		actionableDynamicQuery.performActions();

		Assert.assertEquals(count.getValue(), _persistence.countAll());
	}

	@Test
	public void testDynamicQueryByPrimaryKeyExisting() throws Exception {
		ComprovanteHonorario newComprovanteHonorario =
			addComprovanteHonorario();

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			ComprovanteHonorario.class, _dynamicQueryClassLoader);

		dynamicQuery.add(
			RestrictionsFactoryUtil.eq(
				"comprovanteId", newComprovanteHonorario.getComprovanteId()));

		List<ComprovanteHonorario> result = _persistence.findWithDynamicQuery(
			dynamicQuery);

		Assert.assertEquals(1, result.size());

		ComprovanteHonorario existingComprovanteHonorario = result.get(0);

		Assert.assertEquals(
			existingComprovanteHonorario, newComprovanteHonorario);
	}

	@Test
	public void testDynamicQueryByPrimaryKeyMissing() throws Exception {
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			ComprovanteHonorario.class, _dynamicQueryClassLoader);

		dynamicQuery.add(
			RestrictionsFactoryUtil.eq(
				"comprovanteId", RandomTestUtil.nextLong()));

		List<ComprovanteHonorario> result = _persistence.findWithDynamicQuery(
			dynamicQuery);

		Assert.assertEquals(0, result.size());
	}

	@Test
	public void testDynamicQueryByProjectionExisting() throws Exception {
		ComprovanteHonorario newComprovanteHonorario =
			addComprovanteHonorario();

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			ComprovanteHonorario.class, _dynamicQueryClassLoader);

		dynamicQuery.setProjection(
			ProjectionFactoryUtil.property("comprovanteId"));

		Object newComprovanteId = newComprovanteHonorario.getComprovanteId();

		dynamicQuery.add(
			RestrictionsFactoryUtil.in(
				"comprovanteId", new Object[] {newComprovanteId}));

		List<Object> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(1, result.size());

		Object existingComprovanteId = result.get(0);

		Assert.assertEquals(existingComprovanteId, newComprovanteId);
	}

	@Test
	public void testDynamicQueryByProjectionMissing() throws Exception {
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			ComprovanteHonorario.class, _dynamicQueryClassLoader);

		dynamicQuery.setProjection(
			ProjectionFactoryUtil.property("comprovanteId"));

		dynamicQuery.add(
			RestrictionsFactoryUtil.in(
				"comprovanteId", new Object[] {RandomTestUtil.nextLong()}));

		List<Object> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(0, result.size());
	}

	protected ComprovanteHonorario addComprovanteHonorario() throws Exception {
		long pk = RandomTestUtil.nextLong();

		ComprovanteHonorario comprovanteHonorario = _persistence.create(pk);

		comprovanteHonorario.setUuid(RandomTestUtil.randomString());

		comprovanteHonorario.setPropostaId(RandomTestUtil.nextLong());

		comprovanteHonorario.setValorPago(RandomTestUtil.nextDouble());

		comprovanteHonorario.setDataPagamento(RandomTestUtil.nextDate());

		comprovanteHonorario.setFileEntryId(RandomTestUtil.nextLong());

		_comprovanteHonorarios.add(_persistence.update(comprovanteHonorario));

		return comprovanteHonorario;
	}

	private List<ComprovanteHonorario> _comprovanteHonorarios =
		new ArrayList<ComprovanteHonorario>();
	private ComprovanteHonorarioPersistence _persistence;
	private ClassLoader _dynamicQueryClassLoader;

}
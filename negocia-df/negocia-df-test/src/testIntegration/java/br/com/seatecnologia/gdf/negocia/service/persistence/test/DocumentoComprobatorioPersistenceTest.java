/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.persistence.test;

import br.com.seatecnologia.gdf.negocia.exception.NoSuchDocumentoComprobatorioException;
import br.com.seatecnologia.gdf.negocia.model.DocumentoComprobatorio;
import br.com.seatecnologia.gdf.negocia.service.DocumentoComprobatorioLocalServiceUtil;
import br.com.seatecnologia.gdf.negocia.service.persistence.DocumentoComprobatorioPersistence;
import br.com.seatecnologia.gdf.negocia.service.persistence.DocumentoComprobatorioUtil;

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
public class DocumentoComprobatorioPersistenceTest {

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
		_persistence = DocumentoComprobatorioUtil.getPersistence();

		Class<?> clazz = _persistence.getClass();

		_dynamicQueryClassLoader = clazz.getClassLoader();
	}

	@After
	public void tearDown() throws Exception {
		Iterator<DocumentoComprobatorio> iterator =
			_documentoComprobatorios.iterator();

		while (iterator.hasNext()) {
			_persistence.remove(iterator.next());

			iterator.remove();
		}
	}

	@Test
	public void testCreate() throws Exception {
		long pk = RandomTestUtil.nextLong();

		DocumentoComprobatorio documentoComprobatorio = _persistence.create(pk);

		Assert.assertNotNull(documentoComprobatorio);

		Assert.assertEquals(documentoComprobatorio.getPrimaryKey(), pk);
	}

	@Test
	public void testRemove() throws Exception {
		DocumentoComprobatorio newDocumentoComprobatorio =
			addDocumentoComprobatorio();

		_persistence.remove(newDocumentoComprobatorio);

		DocumentoComprobatorio existingDocumentoComprobatorio =
			_persistence.fetchByPrimaryKey(
				newDocumentoComprobatorio.getPrimaryKey());

		Assert.assertNull(existingDocumentoComprobatorio);
	}

	@Test
	public void testUpdateNew() throws Exception {
		addDocumentoComprobatorio();
	}

	@Test
	public void testUpdateExisting() throws Exception {
		long pk = RandomTestUtil.nextLong();

		DocumentoComprobatorio newDocumentoComprobatorio = _persistence.create(
			pk);

		newDocumentoComprobatorio.setUuid(RandomTestUtil.randomString());

		newDocumentoComprobatorio.setFundamentacaoId(RandomTestUtil.nextLong());

		newDocumentoComprobatorio.setFileEntryId(RandomTestUtil.nextLong());

		_documentoComprobatorios.add(
			_persistence.update(newDocumentoComprobatorio));

		DocumentoComprobatorio existingDocumentoComprobatorio =
			_persistence.findByPrimaryKey(
				newDocumentoComprobatorio.getPrimaryKey());

		Assert.assertEquals(
			existingDocumentoComprobatorio.getUuid(),
			newDocumentoComprobatorio.getUuid());
		Assert.assertEquals(
			existingDocumentoComprobatorio.getDocumentoId(),
			newDocumentoComprobatorio.getDocumentoId());
		Assert.assertEquals(
			existingDocumentoComprobatorio.getFundamentacaoId(),
			newDocumentoComprobatorio.getFundamentacaoId());
		Assert.assertEquals(
			existingDocumentoComprobatorio.getFileEntryId(),
			newDocumentoComprobatorio.getFileEntryId());
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
		DocumentoComprobatorio newDocumentoComprobatorio =
			addDocumentoComprobatorio();

		DocumentoComprobatorio existingDocumentoComprobatorio =
			_persistence.findByPrimaryKey(
				newDocumentoComprobatorio.getPrimaryKey());

		Assert.assertEquals(
			existingDocumentoComprobatorio, newDocumentoComprobatorio);
	}

	@Test(expected = NoSuchDocumentoComprobatorioException.class)
	public void testFindByPrimaryKeyMissing() throws Exception {
		long pk = RandomTestUtil.nextLong();

		_persistence.findByPrimaryKey(pk);
	}

	@Test
	public void testFindAll() throws Exception {
		_persistence.findAll(
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, getOrderByComparator());
	}

	protected OrderByComparator<DocumentoComprobatorio> getOrderByComparator() {
		return OrderByComparatorFactoryUtil.create(
			"GDF_DocumentoComprobatorio", "uuid", true, "documentoId", true,
			"fundamentacaoId", true, "fileEntryId", true);
	}

	@Test
	public void testFetchByPrimaryKeyExisting() throws Exception {
		DocumentoComprobatorio newDocumentoComprobatorio =
			addDocumentoComprobatorio();

		DocumentoComprobatorio existingDocumentoComprobatorio =
			_persistence.fetchByPrimaryKey(
				newDocumentoComprobatorio.getPrimaryKey());

		Assert.assertEquals(
			existingDocumentoComprobatorio, newDocumentoComprobatorio);
	}

	@Test
	public void testFetchByPrimaryKeyMissing() throws Exception {
		long pk = RandomTestUtil.nextLong();

		DocumentoComprobatorio missingDocumentoComprobatorio =
			_persistence.fetchByPrimaryKey(pk);

		Assert.assertNull(missingDocumentoComprobatorio);
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereAllPrimaryKeysExist()
		throws Exception {

		DocumentoComprobatorio newDocumentoComprobatorio1 =
			addDocumentoComprobatorio();
		DocumentoComprobatorio newDocumentoComprobatorio2 =
			addDocumentoComprobatorio();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newDocumentoComprobatorio1.getPrimaryKey());
		primaryKeys.add(newDocumentoComprobatorio2.getPrimaryKey());

		Map<Serializable, DocumentoComprobatorio> documentoComprobatorios =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(2, documentoComprobatorios.size());
		Assert.assertEquals(
			newDocumentoComprobatorio1,
			documentoComprobatorios.get(
				newDocumentoComprobatorio1.getPrimaryKey()));
		Assert.assertEquals(
			newDocumentoComprobatorio2,
			documentoComprobatorios.get(
				newDocumentoComprobatorio2.getPrimaryKey()));
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereNoPrimaryKeysExist()
		throws Exception {

		long pk1 = RandomTestUtil.nextLong();

		long pk2 = RandomTestUtil.nextLong();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(pk1);
		primaryKeys.add(pk2);

		Map<Serializable, DocumentoComprobatorio> documentoComprobatorios =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertTrue(documentoComprobatorios.isEmpty());
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereSomePrimaryKeysExist()
		throws Exception {

		DocumentoComprobatorio newDocumentoComprobatorio =
			addDocumentoComprobatorio();

		long pk = RandomTestUtil.nextLong();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newDocumentoComprobatorio.getPrimaryKey());
		primaryKeys.add(pk);

		Map<Serializable, DocumentoComprobatorio> documentoComprobatorios =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(1, documentoComprobatorios.size());
		Assert.assertEquals(
			newDocumentoComprobatorio,
			documentoComprobatorios.get(
				newDocumentoComprobatorio.getPrimaryKey()));
	}

	@Test
	public void testFetchByPrimaryKeysWithNoPrimaryKeys() throws Exception {
		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		Map<Serializable, DocumentoComprobatorio> documentoComprobatorios =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertTrue(documentoComprobatorios.isEmpty());
	}

	@Test
	public void testFetchByPrimaryKeysWithOnePrimaryKey() throws Exception {
		DocumentoComprobatorio newDocumentoComprobatorio =
			addDocumentoComprobatorio();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newDocumentoComprobatorio.getPrimaryKey());

		Map<Serializable, DocumentoComprobatorio> documentoComprobatorios =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(1, documentoComprobatorios.size());
		Assert.assertEquals(
			newDocumentoComprobatorio,
			documentoComprobatorios.get(
				newDocumentoComprobatorio.getPrimaryKey()));
	}

	@Test
	public void testActionableDynamicQuery() throws Exception {
		final IntegerWrapper count = new IntegerWrapper();

		ActionableDynamicQuery actionableDynamicQuery =
			DocumentoComprobatorioLocalServiceUtil.getActionableDynamicQuery();

		actionableDynamicQuery.setPerformActionMethod(
			new ActionableDynamicQuery.PerformActionMethod
				<DocumentoComprobatorio>() {

				@Override
				public void performAction(
					DocumentoComprobatorio documentoComprobatorio) {

					Assert.assertNotNull(documentoComprobatorio);

					count.increment();
				}

			});

		actionableDynamicQuery.performActions();

		Assert.assertEquals(count.getValue(), _persistence.countAll());
	}

	@Test
	public void testDynamicQueryByPrimaryKeyExisting() throws Exception {
		DocumentoComprobatorio newDocumentoComprobatorio =
			addDocumentoComprobatorio();

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			DocumentoComprobatorio.class, _dynamicQueryClassLoader);

		dynamicQuery.add(
			RestrictionsFactoryUtil.eq(
				"documentoId", newDocumentoComprobatorio.getDocumentoId()));

		List<DocumentoComprobatorio> result = _persistence.findWithDynamicQuery(
			dynamicQuery);

		Assert.assertEquals(1, result.size());

		DocumentoComprobatorio existingDocumentoComprobatorio = result.get(0);

		Assert.assertEquals(
			existingDocumentoComprobatorio, newDocumentoComprobatorio);
	}

	@Test
	public void testDynamicQueryByPrimaryKeyMissing() throws Exception {
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			DocumentoComprobatorio.class, _dynamicQueryClassLoader);

		dynamicQuery.add(
			RestrictionsFactoryUtil.eq(
				"documentoId", RandomTestUtil.nextLong()));

		List<DocumentoComprobatorio> result = _persistence.findWithDynamicQuery(
			dynamicQuery);

		Assert.assertEquals(0, result.size());
	}

	@Test
	public void testDynamicQueryByProjectionExisting() throws Exception {
		DocumentoComprobatorio newDocumentoComprobatorio =
			addDocumentoComprobatorio();

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			DocumentoComprobatorio.class, _dynamicQueryClassLoader);

		dynamicQuery.setProjection(
			ProjectionFactoryUtil.property("documentoId"));

		Object newDocumentoId = newDocumentoComprobatorio.getDocumentoId();

		dynamicQuery.add(
			RestrictionsFactoryUtil.in(
				"documentoId", new Object[] {newDocumentoId}));

		List<Object> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(1, result.size());

		Object existingDocumentoId = result.get(0);

		Assert.assertEquals(existingDocumentoId, newDocumentoId);
	}

	@Test
	public void testDynamicQueryByProjectionMissing() throws Exception {
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			DocumentoComprobatorio.class, _dynamicQueryClassLoader);

		dynamicQuery.setProjection(
			ProjectionFactoryUtil.property("documentoId"));

		dynamicQuery.add(
			RestrictionsFactoryUtil.in(
				"documentoId", new Object[] {RandomTestUtil.nextLong()}));

		List<Object> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(0, result.size());
	}

	protected DocumentoComprobatorio addDocumentoComprobatorio()
		throws Exception {

		long pk = RandomTestUtil.nextLong();

		DocumentoComprobatorio documentoComprobatorio = _persistence.create(pk);

		documentoComprobatorio.setUuid(RandomTestUtil.randomString());

		documentoComprobatorio.setFundamentacaoId(RandomTestUtil.nextLong());

		documentoComprobatorio.setFileEntryId(RandomTestUtil.nextLong());

		_documentoComprobatorios.add(
			_persistence.update(documentoComprobatorio));

		return documentoComprobatorio;
	}

	private List<DocumentoComprobatorio> _documentoComprobatorios =
		new ArrayList<DocumentoComprobatorio>();
	private DocumentoComprobatorioPersistence _persistence;
	private ClassLoader _dynamicQueryClassLoader;

}
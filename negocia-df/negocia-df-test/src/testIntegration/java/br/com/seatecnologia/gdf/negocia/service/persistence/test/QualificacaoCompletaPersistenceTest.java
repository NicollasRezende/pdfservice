/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.persistence.test;

import br.com.seatecnologia.gdf.negocia.exception.NoSuchQualificacaoCompletaException;
import br.com.seatecnologia.gdf.negocia.model.QualificacaoCompleta;
import br.com.seatecnologia.gdf.negocia.service.QualificacaoCompletaLocalServiceUtil;
import br.com.seatecnologia.gdf.negocia.service.persistence.QualificacaoCompletaPersistence;
import br.com.seatecnologia.gdf.negocia.service.persistence.QualificacaoCompletaUtil;

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
public class QualificacaoCompletaPersistenceTest {

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
		_persistence = QualificacaoCompletaUtil.getPersistence();

		Class<?> clazz = _persistence.getClass();

		_dynamicQueryClassLoader = clazz.getClassLoader();
	}

	@After
	public void tearDown() throws Exception {
		Iterator<QualificacaoCompleta> iterator =
			_qualificacaoCompletas.iterator();

		while (iterator.hasNext()) {
			_persistence.remove(iterator.next());

			iterator.remove();
		}
	}

	@Test
	public void testCreate() throws Exception {
		long pk = RandomTestUtil.nextLong();

		QualificacaoCompleta qualificacaoCompleta = _persistence.create(pk);

		Assert.assertNotNull(qualificacaoCompleta);

		Assert.assertEquals(qualificacaoCompleta.getPrimaryKey(), pk);
	}

	@Test
	public void testRemove() throws Exception {
		QualificacaoCompleta newQualificacaoCompleta =
			addQualificacaoCompleta();

		_persistence.remove(newQualificacaoCompleta);

		QualificacaoCompleta existingQualificacaoCompleta =
			_persistence.fetchByPrimaryKey(
				newQualificacaoCompleta.getPrimaryKey());

		Assert.assertNull(existingQualificacaoCompleta);
	}

	@Test
	public void testUpdateNew() throws Exception {
		addQualificacaoCompleta();
	}

	@Test
	public void testUpdateExisting() throws Exception {
		long pk = RandomTestUtil.nextLong();

		QualificacaoCompleta newQualificacaoCompleta = _persistence.create(pk);

		newQualificacaoCompleta.setUuid(RandomTestUtil.randomString());

		newQualificacaoCompleta.setTipoPessoa(RandomTestUtil.randomString());

		newQualificacaoCompleta.setNomeRazaoSocial(
			RandomTestUtil.randomString());

		newQualificacaoCompleta.setNomeFantasia(RandomTestUtil.randomString());

		newQualificacaoCompleta.setRepresentanteLegal(
			RandomTestUtil.randomString());

		newQualificacaoCompleta.setCpfCnpj(RandomTestUtil.randomString());

		newQualificacaoCompleta.setDomicilioFiscal(
			RandomTestUtil.randomString());

		newQualificacaoCompleta.setNumeroCfdf(RandomTestUtil.randomString());

		newQualificacaoCompleta.setEmail(RandomTestUtil.randomString());

		newQualificacaoCompleta.setTelefone(RandomTestUtil.randomString());

		newQualificacaoCompleta.setWhatsapp(RandomTestUtil.randomString());

		newQualificacaoCompleta.setEnderecoPostalId(RandomTestUtil.nextLong());

		_qualificacaoCompletas.add(
			_persistence.update(newQualificacaoCompleta));

		QualificacaoCompleta existingQualificacaoCompleta =
			_persistence.findByPrimaryKey(
				newQualificacaoCompleta.getPrimaryKey());

		Assert.assertEquals(
			existingQualificacaoCompleta.getUuid(),
			newQualificacaoCompleta.getUuid());
		Assert.assertEquals(
			existingQualificacaoCompleta.getQualificacaoId(),
			newQualificacaoCompleta.getQualificacaoId());
		Assert.assertEquals(
			existingQualificacaoCompleta.getTipoPessoa(),
			newQualificacaoCompleta.getTipoPessoa());
		Assert.assertEquals(
			existingQualificacaoCompleta.getNomeRazaoSocial(),
			newQualificacaoCompleta.getNomeRazaoSocial());
		Assert.assertEquals(
			existingQualificacaoCompleta.getNomeFantasia(),
			newQualificacaoCompleta.getNomeFantasia());
		Assert.assertEquals(
			existingQualificacaoCompleta.getRepresentanteLegal(),
			newQualificacaoCompleta.getRepresentanteLegal());
		Assert.assertEquals(
			existingQualificacaoCompleta.getCpfCnpj(),
			newQualificacaoCompleta.getCpfCnpj());
		Assert.assertEquals(
			existingQualificacaoCompleta.getDomicilioFiscal(),
			newQualificacaoCompleta.getDomicilioFiscal());
		Assert.assertEquals(
			existingQualificacaoCompleta.getNumeroCfdf(),
			newQualificacaoCompleta.getNumeroCfdf());
		Assert.assertEquals(
			existingQualificacaoCompleta.getEmail(),
			newQualificacaoCompleta.getEmail());
		Assert.assertEquals(
			existingQualificacaoCompleta.getTelefone(),
			newQualificacaoCompleta.getTelefone());
		Assert.assertEquals(
			existingQualificacaoCompleta.getWhatsapp(),
			newQualificacaoCompleta.getWhatsapp());
		Assert.assertEquals(
			existingQualificacaoCompleta.getEnderecoPostalId(),
			newQualificacaoCompleta.getEnderecoPostalId());
	}

	@Test
	public void testCountByUuid() throws Exception {
		_persistence.countByUuid("");

		_persistence.countByUuid("null");

		_persistence.countByUuid((String)null);
	}

	@Test
	public void testFindByPrimaryKeyExisting() throws Exception {
		QualificacaoCompleta newQualificacaoCompleta =
			addQualificacaoCompleta();

		QualificacaoCompleta existingQualificacaoCompleta =
			_persistence.findByPrimaryKey(
				newQualificacaoCompleta.getPrimaryKey());

		Assert.assertEquals(
			existingQualificacaoCompleta, newQualificacaoCompleta);
	}

	@Test(expected = NoSuchQualificacaoCompletaException.class)
	public void testFindByPrimaryKeyMissing() throws Exception {
		long pk = RandomTestUtil.nextLong();

		_persistence.findByPrimaryKey(pk);
	}

	@Test
	public void testFindAll() throws Exception {
		_persistence.findAll(
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, getOrderByComparator());
	}

	protected OrderByComparator<QualificacaoCompleta> getOrderByComparator() {
		return OrderByComparatorFactoryUtil.create(
			"GDF_QualificacaoCompleta", "uuid", true, "qualificacaoId", true,
			"tipoPessoa", true, "nomeRazaoSocial", true, "nomeFantasia", true,
			"representanteLegal", true, "cpfCnpj", true, "domicilioFiscal",
			true, "numeroCfdf", true, "email", true, "telefone", true,
			"whatsapp", true, "enderecoPostalId", true);
	}

	@Test
	public void testFetchByPrimaryKeyExisting() throws Exception {
		QualificacaoCompleta newQualificacaoCompleta =
			addQualificacaoCompleta();

		QualificacaoCompleta existingQualificacaoCompleta =
			_persistence.fetchByPrimaryKey(
				newQualificacaoCompleta.getPrimaryKey());

		Assert.assertEquals(
			existingQualificacaoCompleta, newQualificacaoCompleta);
	}

	@Test
	public void testFetchByPrimaryKeyMissing() throws Exception {
		long pk = RandomTestUtil.nextLong();

		QualificacaoCompleta missingQualificacaoCompleta =
			_persistence.fetchByPrimaryKey(pk);

		Assert.assertNull(missingQualificacaoCompleta);
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereAllPrimaryKeysExist()
		throws Exception {

		QualificacaoCompleta newQualificacaoCompleta1 =
			addQualificacaoCompleta();
		QualificacaoCompleta newQualificacaoCompleta2 =
			addQualificacaoCompleta();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newQualificacaoCompleta1.getPrimaryKey());
		primaryKeys.add(newQualificacaoCompleta2.getPrimaryKey());

		Map<Serializable, QualificacaoCompleta> qualificacaoCompletas =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(2, qualificacaoCompletas.size());
		Assert.assertEquals(
			newQualificacaoCompleta1,
			qualificacaoCompletas.get(
				newQualificacaoCompleta1.getPrimaryKey()));
		Assert.assertEquals(
			newQualificacaoCompleta2,
			qualificacaoCompletas.get(
				newQualificacaoCompleta2.getPrimaryKey()));
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereNoPrimaryKeysExist()
		throws Exception {

		long pk1 = RandomTestUtil.nextLong();

		long pk2 = RandomTestUtil.nextLong();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(pk1);
		primaryKeys.add(pk2);

		Map<Serializable, QualificacaoCompleta> qualificacaoCompletas =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertTrue(qualificacaoCompletas.isEmpty());
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereSomePrimaryKeysExist()
		throws Exception {

		QualificacaoCompleta newQualificacaoCompleta =
			addQualificacaoCompleta();

		long pk = RandomTestUtil.nextLong();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newQualificacaoCompleta.getPrimaryKey());
		primaryKeys.add(pk);

		Map<Serializable, QualificacaoCompleta> qualificacaoCompletas =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(1, qualificacaoCompletas.size());
		Assert.assertEquals(
			newQualificacaoCompleta,
			qualificacaoCompletas.get(newQualificacaoCompleta.getPrimaryKey()));
	}

	@Test
	public void testFetchByPrimaryKeysWithNoPrimaryKeys() throws Exception {
		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		Map<Serializable, QualificacaoCompleta> qualificacaoCompletas =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertTrue(qualificacaoCompletas.isEmpty());
	}

	@Test
	public void testFetchByPrimaryKeysWithOnePrimaryKey() throws Exception {
		QualificacaoCompleta newQualificacaoCompleta =
			addQualificacaoCompleta();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newQualificacaoCompleta.getPrimaryKey());

		Map<Serializable, QualificacaoCompleta> qualificacaoCompletas =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(1, qualificacaoCompletas.size());
		Assert.assertEquals(
			newQualificacaoCompleta,
			qualificacaoCompletas.get(newQualificacaoCompleta.getPrimaryKey()));
	}

	@Test
	public void testActionableDynamicQuery() throws Exception {
		final IntegerWrapper count = new IntegerWrapper();

		ActionableDynamicQuery actionableDynamicQuery =
			QualificacaoCompletaLocalServiceUtil.getActionableDynamicQuery();

		actionableDynamicQuery.setPerformActionMethod(
			new ActionableDynamicQuery.PerformActionMethod
				<QualificacaoCompleta>() {

				@Override
				public void performAction(
					QualificacaoCompleta qualificacaoCompleta) {

					Assert.assertNotNull(qualificacaoCompleta);

					count.increment();
				}

			});

		actionableDynamicQuery.performActions();

		Assert.assertEquals(count.getValue(), _persistence.countAll());
	}

	@Test
	public void testDynamicQueryByPrimaryKeyExisting() throws Exception {
		QualificacaoCompleta newQualificacaoCompleta =
			addQualificacaoCompleta();

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			QualificacaoCompleta.class, _dynamicQueryClassLoader);

		dynamicQuery.add(
			RestrictionsFactoryUtil.eq(
				"qualificacaoId", newQualificacaoCompleta.getQualificacaoId()));

		List<QualificacaoCompleta> result = _persistence.findWithDynamicQuery(
			dynamicQuery);

		Assert.assertEquals(1, result.size());

		QualificacaoCompleta existingQualificacaoCompleta = result.get(0);

		Assert.assertEquals(
			existingQualificacaoCompleta, newQualificacaoCompleta);
	}

	@Test
	public void testDynamicQueryByPrimaryKeyMissing() throws Exception {
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			QualificacaoCompleta.class, _dynamicQueryClassLoader);

		dynamicQuery.add(
			RestrictionsFactoryUtil.eq(
				"qualificacaoId", RandomTestUtil.nextLong()));

		List<QualificacaoCompleta> result = _persistence.findWithDynamicQuery(
			dynamicQuery);

		Assert.assertEquals(0, result.size());
	}

	@Test
	public void testDynamicQueryByProjectionExisting() throws Exception {
		QualificacaoCompleta newQualificacaoCompleta =
			addQualificacaoCompleta();

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			QualificacaoCompleta.class, _dynamicQueryClassLoader);

		dynamicQuery.setProjection(
			ProjectionFactoryUtil.property("qualificacaoId"));

		Object newQualificacaoId = newQualificacaoCompleta.getQualificacaoId();

		dynamicQuery.add(
			RestrictionsFactoryUtil.in(
				"qualificacaoId", new Object[] {newQualificacaoId}));

		List<Object> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(1, result.size());

		Object existingQualificacaoId = result.get(0);

		Assert.assertEquals(existingQualificacaoId, newQualificacaoId);
	}

	@Test
	public void testDynamicQueryByProjectionMissing() throws Exception {
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			QualificacaoCompleta.class, _dynamicQueryClassLoader);

		dynamicQuery.setProjection(
			ProjectionFactoryUtil.property("qualificacaoId"));

		dynamicQuery.add(
			RestrictionsFactoryUtil.in(
				"qualificacaoId", new Object[] {RandomTestUtil.nextLong()}));

		List<Object> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(0, result.size());
	}

	protected QualificacaoCompleta addQualificacaoCompleta() throws Exception {
		long pk = RandomTestUtil.nextLong();

		QualificacaoCompleta qualificacaoCompleta = _persistence.create(pk);

		qualificacaoCompleta.setUuid(RandomTestUtil.randomString());

		qualificacaoCompleta.setTipoPessoa(RandomTestUtil.randomString());

		qualificacaoCompleta.setNomeRazaoSocial(RandomTestUtil.randomString());

		qualificacaoCompleta.setNomeFantasia(RandomTestUtil.randomString());

		qualificacaoCompleta.setRepresentanteLegal(
			RandomTestUtil.randomString());

		qualificacaoCompleta.setCpfCnpj(RandomTestUtil.randomString());

		qualificacaoCompleta.setDomicilioFiscal(RandomTestUtil.randomString());

		qualificacaoCompleta.setNumeroCfdf(RandomTestUtil.randomString());

		qualificacaoCompleta.setEmail(RandomTestUtil.randomString());

		qualificacaoCompleta.setTelefone(RandomTestUtil.randomString());

		qualificacaoCompleta.setWhatsapp(RandomTestUtil.randomString());

		qualificacaoCompleta.setEnderecoPostalId(RandomTestUtil.nextLong());

		_qualificacaoCompletas.add(_persistence.update(qualificacaoCompleta));

		return qualificacaoCompleta;
	}

	private List<QualificacaoCompleta> _qualificacaoCompletas =
		new ArrayList<QualificacaoCompleta>();
	private QualificacaoCompletaPersistence _persistence;
	private ClassLoader _dynamicQueryClassLoader;

}
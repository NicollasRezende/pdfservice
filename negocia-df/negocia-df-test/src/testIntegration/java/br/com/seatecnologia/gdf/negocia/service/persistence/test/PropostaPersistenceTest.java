/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.persistence.test;

import br.com.seatecnologia.gdf.negocia.exception.NoSuchPropostaException;
import br.com.seatecnologia.gdf.negocia.model.Proposta;
import br.com.seatecnologia.gdf.negocia.service.PropostaLocalServiceUtil;
import br.com.seatecnologia.gdf.negocia.service.persistence.PropostaPersistence;
import br.com.seatecnologia.gdf.negocia.service.persistence.PropostaUtil;

import com.liferay.arquillian.extension.junit.bridge.junit.Arquillian;
import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.ProjectionFactoryUtil;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.test.ReflectionTestUtil;
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
public class PropostaPersistenceTest {

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
		_persistence = PropostaUtil.getPersistence();

		Class<?> clazz = _persistence.getClass();

		_dynamicQueryClassLoader = clazz.getClassLoader();
	}

	@After
	public void tearDown() throws Exception {
		Iterator<Proposta> iterator = _propostas.iterator();

		while (iterator.hasNext()) {
			_persistence.remove(iterator.next());

			iterator.remove();
		}
	}

	@Test
	public void testCreate() throws Exception {
		long pk = RandomTestUtil.nextLong();

		Proposta proposta = _persistence.create(pk);

		Assert.assertNotNull(proposta);

		Assert.assertEquals(proposta.getPrimaryKey(), pk);
	}

	@Test
	public void testRemove() throws Exception {
		Proposta newProposta = addProposta();

		_persistence.remove(newProposta);

		Proposta existingProposta = _persistence.fetchByPrimaryKey(
			newProposta.getPrimaryKey());

		Assert.assertNull(existingProposta);
	}

	@Test
	public void testUpdateNew() throws Exception {
		addProposta();
	}

	@Test
	public void testUpdateExisting() throws Exception {
		long pk = RandomTestUtil.nextLong();

		Proposta newProposta = _persistence.create(pk);

		newProposta.setUuid(RandomTestUtil.randomString());

		newProposta.setGroupId(RandomTestUtil.nextLong());

		newProposta.setCompanyId(RandomTestUtil.nextLong());

		newProposta.setUserId(RandomTestUtil.nextLong());

		newProposta.setUserName(RandomTestUtil.randomString());

		newProposta.setCreateDate(RandomTestUtil.nextDate());

		newProposta.setModifiedDate(RandomTestUtil.nextDate());

		newProposta.setTipoProposta(RandomTestUtil.randomString());

		newProposta.setEditalId(RandomTestUtil.nextLong());

		newProposta.setQualificacaoId(RandomTestUtil.nextLong());

		newProposta.setAdministradorJudicialId(RandomTestUtil.nextLong());

		newProposta.setAdvogadoId(RandomTestUtil.nextLong());

		newProposta.setFundamentacaoPedidoId(RandomTestUtil.nextLong());

		newProposta.setProcuracao(RandomTestUtil.nextLong());

		newProposta.setCpfCnpj(RandomTestUtil.randomString());

		newProposta.setStatus(RandomTestUtil.randomString());

		newProposta.setNumeroProtocoloSei(RandomTestUtil.randomString());

		newProposta.setProtocolo(RandomTestUtil.randomString());

		newProposta.setDocumentosCompletosURL(RandomTestUtil.randomString());

		newProposta.setPropostaPaiId(RandomTestUtil.nextLong());

		_propostas.add(_persistence.update(newProposta));

		Proposta existingProposta = _persistence.findByPrimaryKey(
			newProposta.getPrimaryKey());

		Assert.assertEquals(existingProposta.getUuid(), newProposta.getUuid());
		Assert.assertEquals(
			existingProposta.getPropostaId(), newProposta.getPropostaId());
		Assert.assertEquals(
			existingProposta.getGroupId(), newProposta.getGroupId());
		Assert.assertEquals(
			existingProposta.getCompanyId(), newProposta.getCompanyId());
		Assert.assertEquals(
			existingProposta.getUserId(), newProposta.getUserId());
		Assert.assertEquals(
			existingProposta.getUserName(), newProposta.getUserName());
		Assert.assertEquals(
			Time.getShortTimestamp(existingProposta.getCreateDate()),
			Time.getShortTimestamp(newProposta.getCreateDate()));
		Assert.assertEquals(
			Time.getShortTimestamp(existingProposta.getModifiedDate()),
			Time.getShortTimestamp(newProposta.getModifiedDate()));
		Assert.assertEquals(
			existingProposta.getTipoProposta(), newProposta.getTipoProposta());
		Assert.assertEquals(
			existingProposta.getEditalId(), newProposta.getEditalId());
		Assert.assertEquals(
			existingProposta.getQualificacaoId(),
			newProposta.getQualificacaoId());
		Assert.assertEquals(
			existingProposta.getAdministradorJudicialId(),
			newProposta.getAdministradorJudicialId());
		Assert.assertEquals(
			existingProposta.getAdvogadoId(), newProposta.getAdvogadoId());
		Assert.assertEquals(
			existingProposta.getFundamentacaoPedidoId(),
			newProposta.getFundamentacaoPedidoId());
		Assert.assertEquals(
			existingProposta.getProcuracao(), newProposta.getProcuracao());
		Assert.assertEquals(
			existingProposta.getCpfCnpj(), newProposta.getCpfCnpj());
		Assert.assertEquals(
			existingProposta.getStatus(), newProposta.getStatus());
		Assert.assertEquals(
			existingProposta.getNumeroProtocoloSei(),
			newProposta.getNumeroProtocoloSei());
		Assert.assertEquals(
			existingProposta.getProtocolo(), newProposta.getProtocolo());
		Assert.assertEquals(
			existingProposta.getDocumentosCompletosURL(),
			newProposta.getDocumentosCompletosURL());
		Assert.assertEquals(
			existingProposta.getPropostaPaiId(),
			newProposta.getPropostaPaiId());
	}

	@Test
	public void testCountByUuid() throws Exception {
		_persistence.countByUuid("");

		_persistence.countByUuid("null");

		_persistence.countByUuid((String)null);
	}

	@Test
	public void testCountByUUID_G() throws Exception {
		_persistence.countByUUID_G("", RandomTestUtil.nextLong());

		_persistence.countByUUID_G("null", 0L);

		_persistence.countByUUID_G((String)null, 0L);
	}

	@Test
	public void testCountByUuid_C() throws Exception {
		_persistence.countByUuid_C("", RandomTestUtil.nextLong());

		_persistence.countByUuid_C("null", 0L);

		_persistence.countByUuid_C((String)null, 0L);
	}

	@Test
	public void testCountByCpfCnpj() throws Exception {
		_persistence.countByCpfCnpj("");

		_persistence.countByCpfCnpj("null");

		_persistence.countByCpfCnpj((String)null);
	}

	@Test
	public void testFindByPrimaryKeyExisting() throws Exception {
		Proposta newProposta = addProposta();

		Proposta existingProposta = _persistence.findByPrimaryKey(
			newProposta.getPrimaryKey());

		Assert.assertEquals(existingProposta, newProposta);
	}

	@Test(expected = NoSuchPropostaException.class)
	public void testFindByPrimaryKeyMissing() throws Exception {
		long pk = RandomTestUtil.nextLong();

		_persistence.findByPrimaryKey(pk);
	}

	@Test
	public void testFindAll() throws Exception {
		_persistence.findAll(
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, getOrderByComparator());
	}

	protected OrderByComparator<Proposta> getOrderByComparator() {
		return OrderByComparatorFactoryUtil.create(
			"GDF_Proposta", "uuid", true, "propostaId", true, "groupId", true,
			"companyId", true, "userId", true, "userName", true, "createDate",
			true, "modifiedDate", true, "tipoProposta", true, "editalId", true,
			"qualificacaoId", true, "administradorJudicialId", true,
			"advogadoId", true, "fundamentacaoPedidoId", true, "procuracao",
			true, "cpfCnpj", true, "status", true, "numeroProtocoloSei", true,
			"protocolo", true, "documentosCompletosURL", true, "propostaPaiId",
			true);
	}

	@Test
	public void testFetchByPrimaryKeyExisting() throws Exception {
		Proposta newProposta = addProposta();

		Proposta existingProposta = _persistence.fetchByPrimaryKey(
			newProposta.getPrimaryKey());

		Assert.assertEquals(existingProposta, newProposta);
	}

	@Test
	public void testFetchByPrimaryKeyMissing() throws Exception {
		long pk = RandomTestUtil.nextLong();

		Proposta missingProposta = _persistence.fetchByPrimaryKey(pk);

		Assert.assertNull(missingProposta);
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereAllPrimaryKeysExist()
		throws Exception {

		Proposta newProposta1 = addProposta();
		Proposta newProposta2 = addProposta();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newProposta1.getPrimaryKey());
		primaryKeys.add(newProposta2.getPrimaryKey());

		Map<Serializable, Proposta> propostas = _persistence.fetchByPrimaryKeys(
			primaryKeys);

		Assert.assertEquals(2, propostas.size());
		Assert.assertEquals(
			newProposta1, propostas.get(newProposta1.getPrimaryKey()));
		Assert.assertEquals(
			newProposta2, propostas.get(newProposta2.getPrimaryKey()));
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereNoPrimaryKeysExist()
		throws Exception {

		long pk1 = RandomTestUtil.nextLong();

		long pk2 = RandomTestUtil.nextLong();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(pk1);
		primaryKeys.add(pk2);

		Map<Serializable, Proposta> propostas = _persistence.fetchByPrimaryKeys(
			primaryKeys);

		Assert.assertTrue(propostas.isEmpty());
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereSomePrimaryKeysExist()
		throws Exception {

		Proposta newProposta = addProposta();

		long pk = RandomTestUtil.nextLong();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newProposta.getPrimaryKey());
		primaryKeys.add(pk);

		Map<Serializable, Proposta> propostas = _persistence.fetchByPrimaryKeys(
			primaryKeys);

		Assert.assertEquals(1, propostas.size());
		Assert.assertEquals(
			newProposta, propostas.get(newProposta.getPrimaryKey()));
	}

	@Test
	public void testFetchByPrimaryKeysWithNoPrimaryKeys() throws Exception {
		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		Map<Serializable, Proposta> propostas = _persistence.fetchByPrimaryKeys(
			primaryKeys);

		Assert.assertTrue(propostas.isEmpty());
	}

	@Test
	public void testFetchByPrimaryKeysWithOnePrimaryKey() throws Exception {
		Proposta newProposta = addProposta();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newProposta.getPrimaryKey());

		Map<Serializable, Proposta> propostas = _persistence.fetchByPrimaryKeys(
			primaryKeys);

		Assert.assertEquals(1, propostas.size());
		Assert.assertEquals(
			newProposta, propostas.get(newProposta.getPrimaryKey()));
	}

	@Test
	public void testActionableDynamicQuery() throws Exception {
		final IntegerWrapper count = new IntegerWrapper();

		ActionableDynamicQuery actionableDynamicQuery =
			PropostaLocalServiceUtil.getActionableDynamicQuery();

		actionableDynamicQuery.setPerformActionMethod(
			new ActionableDynamicQuery.PerformActionMethod<Proposta>() {

				@Override
				public void performAction(Proposta proposta) {
					Assert.assertNotNull(proposta);

					count.increment();
				}

			});

		actionableDynamicQuery.performActions();

		Assert.assertEquals(count.getValue(), _persistence.countAll());
	}

	@Test
	public void testDynamicQueryByPrimaryKeyExisting() throws Exception {
		Proposta newProposta = addProposta();

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			Proposta.class, _dynamicQueryClassLoader);

		dynamicQuery.add(
			RestrictionsFactoryUtil.eq(
				"propostaId", newProposta.getPropostaId()));

		List<Proposta> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(1, result.size());

		Proposta existingProposta = result.get(0);

		Assert.assertEquals(existingProposta, newProposta);
	}

	@Test
	public void testDynamicQueryByPrimaryKeyMissing() throws Exception {
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			Proposta.class, _dynamicQueryClassLoader);

		dynamicQuery.add(
			RestrictionsFactoryUtil.eq(
				"propostaId", RandomTestUtil.nextLong()));

		List<Proposta> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(0, result.size());
	}

	@Test
	public void testDynamicQueryByProjectionExisting() throws Exception {
		Proposta newProposta = addProposta();

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			Proposta.class, _dynamicQueryClassLoader);

		dynamicQuery.setProjection(
			ProjectionFactoryUtil.property("propostaId"));

		Object newPropostaId = newProposta.getPropostaId();

		dynamicQuery.add(
			RestrictionsFactoryUtil.in(
				"propostaId", new Object[] {newPropostaId}));

		List<Object> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(1, result.size());

		Object existingPropostaId = result.get(0);

		Assert.assertEquals(existingPropostaId, newPropostaId);
	}

	@Test
	public void testDynamicQueryByProjectionMissing() throws Exception {
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			Proposta.class, _dynamicQueryClassLoader);

		dynamicQuery.setProjection(
			ProjectionFactoryUtil.property("propostaId"));

		dynamicQuery.add(
			RestrictionsFactoryUtil.in(
				"propostaId", new Object[] {RandomTestUtil.nextLong()}));

		List<Object> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(0, result.size());
	}

	@Test
	public void testResetOriginalValues() throws Exception {
		Proposta newProposta = addProposta();

		_persistence.clearCache();

		_assertOriginalValues(
			_persistence.findByPrimaryKey(newProposta.getPrimaryKey()));
	}

	@Test
	public void testResetOriginalValuesWithDynamicQueryLoadFromDatabase()
		throws Exception {

		_testResetOriginalValuesWithDynamicQuery(true);
	}

	@Test
	public void testResetOriginalValuesWithDynamicQueryLoadFromSession()
		throws Exception {

		_testResetOriginalValuesWithDynamicQuery(false);
	}

	private void _testResetOriginalValuesWithDynamicQuery(boolean clearSession)
		throws Exception {

		Proposta newProposta = addProposta();

		if (clearSession) {
			Session session = _persistence.openSession();

			session.flush();

			session.clear();
		}

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			Proposta.class, _dynamicQueryClassLoader);

		dynamicQuery.add(
			RestrictionsFactoryUtil.eq(
				"propostaId", newProposta.getPropostaId()));

		List<Proposta> result = _persistence.findWithDynamicQuery(dynamicQuery);

		_assertOriginalValues(result.get(0));
	}

	private void _assertOriginalValues(Proposta proposta) {
		Assert.assertEquals(
			proposta.getUuid(),
			ReflectionTestUtil.invoke(
				proposta, "getColumnOriginalValue",
				new Class<?>[] {String.class}, "uuid_"));
		Assert.assertEquals(
			Long.valueOf(proposta.getGroupId()),
			ReflectionTestUtil.<Long>invoke(
				proposta, "getColumnOriginalValue",
				new Class<?>[] {String.class}, "groupId"));
	}

	protected Proposta addProposta() throws Exception {
		long pk = RandomTestUtil.nextLong();

		Proposta proposta = _persistence.create(pk);

		proposta.setUuid(RandomTestUtil.randomString());

		proposta.setGroupId(RandomTestUtil.nextLong());

		proposta.setCompanyId(RandomTestUtil.nextLong());

		proposta.setUserId(RandomTestUtil.nextLong());

		proposta.setUserName(RandomTestUtil.randomString());

		proposta.setCreateDate(RandomTestUtil.nextDate());

		proposta.setModifiedDate(RandomTestUtil.nextDate());

		proposta.setTipoProposta(RandomTestUtil.randomString());

		proposta.setEditalId(RandomTestUtil.nextLong());

		proposta.setQualificacaoId(RandomTestUtil.nextLong());

		proposta.setAdministradorJudicialId(RandomTestUtil.nextLong());

		proposta.setAdvogadoId(RandomTestUtil.nextLong());

		proposta.setFundamentacaoPedidoId(RandomTestUtil.nextLong());

		proposta.setProcuracao(RandomTestUtil.nextLong());

		proposta.setCpfCnpj(RandomTestUtil.randomString());

		proposta.setStatus(RandomTestUtil.randomString());

		proposta.setNumeroProtocoloSei(RandomTestUtil.randomString());

		proposta.setProtocolo(RandomTestUtil.randomString());

		proposta.setDocumentosCompletosURL(RandomTestUtil.randomString());

		proposta.setPropostaPaiId(RandomTestUtil.nextLong());

		_propostas.add(_persistence.update(proposta));

		return proposta;
	}

	private List<Proposta> _propostas = new ArrayList<Proposta>();
	private PropostaPersistence _persistence;
	private ClassLoader _dynamicQueryClassLoader;

}
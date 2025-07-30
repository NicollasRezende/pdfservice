/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.persistence.test;

import br.com.seatecnologia.gdf.negocia.exception.NoSuchDeclaracaoException;
import br.com.seatecnologia.gdf.negocia.model.Declaracao;
import br.com.seatecnologia.gdf.negocia.service.DeclaracaoLocalServiceUtil;
import br.com.seatecnologia.gdf.negocia.service.persistence.DeclaracaoPersistence;
import br.com.seatecnologia.gdf.negocia.service.persistence.DeclaracaoUtil;

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
public class DeclaracaoPersistenceTest {

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
		_persistence = DeclaracaoUtil.getPersistence();

		Class<?> clazz = _persistence.getClass();

		_dynamicQueryClassLoader = clazz.getClassLoader();
	}

	@After
	public void tearDown() throws Exception {
		Iterator<Declaracao> iterator = _declaracaos.iterator();

		while (iterator.hasNext()) {
			_persistence.remove(iterator.next());

			iterator.remove();
		}
	}

	@Test
	public void testCreate() throws Exception {
		long pk = RandomTestUtil.nextLong();

		Declaracao declaracao = _persistence.create(pk);

		Assert.assertNotNull(declaracao);

		Assert.assertEquals(declaracao.getPrimaryKey(), pk);
	}

	@Test
	public void testRemove() throws Exception {
		Declaracao newDeclaracao = addDeclaracao();

		_persistence.remove(newDeclaracao);

		Declaracao existingDeclaracao = _persistence.fetchByPrimaryKey(
			newDeclaracao.getPrimaryKey());

		Assert.assertNull(existingDeclaracao);
	}

	@Test
	public void testUpdateNew() throws Exception {
		addDeclaracao();
	}

	@Test
	public void testUpdateExisting() throws Exception {
		long pk = RandomTestUtil.nextLong();

		Declaracao newDeclaracao = _persistence.create(pk);

		newDeclaracao.setUuid(RandomTestUtil.randomString());

		newDeclaracao.setPropostaId(RandomTestUtil.nextLong());

		newDeclaracao.setCumpreCompromissos(RandomTestUtil.randomBoolean());

		newDeclaracao.setNaoAlienacaoBensSemComunicacao(
			RandomTestUtil.randomBoolean());

		newDeclaracao.setReconheceGrupoOuSucessao(
			RandomTestUtil.randomBoolean());

		newDeclaracao.setCompromissoConfidencialidade(
			RandomTestUtil.randomBoolean());

		newDeclaracao.setCienciaProcesso(RandomTestUtil.randomBoolean());

		newDeclaracao.setAbusoTransacao(RandomTestUtil.randomBoolean());

		newDeclaracao.setImpugnacaoRecursos(RandomTestUtil.randomBoolean());

		newDeclaracao.setRenunciaRecursos(RandomTestUtil.randomBoolean());

		newDeclaracao.setPeticionamentoProcessos(
			RandomTestUtil.randomBoolean());

		newDeclaracao.setPrestacaoInformacoes(RandomTestUtil.randomBoolean());

		newDeclaracao.setOmissaoInformacoes(RandomTestUtil.randomBoolean());

		newDeclaracao.setManutencaoGarantias(RandomTestUtil.randomBoolean());

		_declaracaos.add(_persistence.update(newDeclaracao));

		Declaracao existingDeclaracao = _persistence.findByPrimaryKey(
			newDeclaracao.getPrimaryKey());

		Assert.assertEquals(
			existingDeclaracao.getUuid(), newDeclaracao.getUuid());
		Assert.assertEquals(
			existingDeclaracao.getDeclaracaoId(),
			newDeclaracao.getDeclaracaoId());
		Assert.assertEquals(
			existingDeclaracao.getPropostaId(), newDeclaracao.getPropostaId());
		Assert.assertEquals(
			existingDeclaracao.isCumpreCompromissos(),
			newDeclaracao.isCumpreCompromissos());
		Assert.assertEquals(
			existingDeclaracao.isNaoAlienacaoBensSemComunicacao(),
			newDeclaracao.isNaoAlienacaoBensSemComunicacao());
		Assert.assertEquals(
			existingDeclaracao.isReconheceGrupoOuSucessao(),
			newDeclaracao.isReconheceGrupoOuSucessao());
		Assert.assertEquals(
			existingDeclaracao.isCompromissoConfidencialidade(),
			newDeclaracao.isCompromissoConfidencialidade());
		Assert.assertEquals(
			existingDeclaracao.isCienciaProcesso(),
			newDeclaracao.isCienciaProcesso());
		Assert.assertEquals(
			existingDeclaracao.isAbusoTransacao(),
			newDeclaracao.isAbusoTransacao());
		Assert.assertEquals(
			existingDeclaracao.isImpugnacaoRecursos(),
			newDeclaracao.isImpugnacaoRecursos());
		Assert.assertEquals(
			existingDeclaracao.isRenunciaRecursos(),
			newDeclaracao.isRenunciaRecursos());
		Assert.assertEquals(
			existingDeclaracao.isPeticionamentoProcessos(),
			newDeclaracao.isPeticionamentoProcessos());
		Assert.assertEquals(
			existingDeclaracao.isPrestacaoInformacoes(),
			newDeclaracao.isPrestacaoInformacoes());
		Assert.assertEquals(
			existingDeclaracao.isOmissaoInformacoes(),
			newDeclaracao.isOmissaoInformacoes());
		Assert.assertEquals(
			existingDeclaracao.isManutencaoGarantias(),
			newDeclaracao.isManutencaoGarantias());
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
		Declaracao newDeclaracao = addDeclaracao();

		Declaracao existingDeclaracao = _persistence.findByPrimaryKey(
			newDeclaracao.getPrimaryKey());

		Assert.assertEquals(existingDeclaracao, newDeclaracao);
	}

	@Test(expected = NoSuchDeclaracaoException.class)
	public void testFindByPrimaryKeyMissing() throws Exception {
		long pk = RandomTestUtil.nextLong();

		_persistence.findByPrimaryKey(pk);
	}

	@Test
	public void testFindAll() throws Exception {
		_persistence.findAll(
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, getOrderByComparator());
	}

	protected OrderByComparator<Declaracao> getOrderByComparator() {
		return OrderByComparatorFactoryUtil.create(
			"GDF_Declaracao", "uuid", true, "declaracaoId", true, "propostaId",
			true, "cumpreCompromissos", true, "naoAlienacaoBensSemComunicacao",
			true, "reconheceGrupoOuSucessao", true,
			"compromissoConfidencialidade", true, "cienciaProcesso", true,
			"abusoTransacao", true, "impugnacaoRecursos", true,
			"renunciaRecursos", true, "peticionamentoProcessos", true,
			"prestacaoInformacoes", true, "omissaoInformacoes", true,
			"manutencaoGarantias", true);
	}

	@Test
	public void testFetchByPrimaryKeyExisting() throws Exception {
		Declaracao newDeclaracao = addDeclaracao();

		Declaracao existingDeclaracao = _persistence.fetchByPrimaryKey(
			newDeclaracao.getPrimaryKey());

		Assert.assertEquals(existingDeclaracao, newDeclaracao);
	}

	@Test
	public void testFetchByPrimaryKeyMissing() throws Exception {
		long pk = RandomTestUtil.nextLong();

		Declaracao missingDeclaracao = _persistence.fetchByPrimaryKey(pk);

		Assert.assertNull(missingDeclaracao);
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereAllPrimaryKeysExist()
		throws Exception {

		Declaracao newDeclaracao1 = addDeclaracao();
		Declaracao newDeclaracao2 = addDeclaracao();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newDeclaracao1.getPrimaryKey());
		primaryKeys.add(newDeclaracao2.getPrimaryKey());

		Map<Serializable, Declaracao> declaracaos =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(2, declaracaos.size());
		Assert.assertEquals(
			newDeclaracao1, declaracaos.get(newDeclaracao1.getPrimaryKey()));
		Assert.assertEquals(
			newDeclaracao2, declaracaos.get(newDeclaracao2.getPrimaryKey()));
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereNoPrimaryKeysExist()
		throws Exception {

		long pk1 = RandomTestUtil.nextLong();

		long pk2 = RandomTestUtil.nextLong();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(pk1);
		primaryKeys.add(pk2);

		Map<Serializable, Declaracao> declaracaos =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertTrue(declaracaos.isEmpty());
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereSomePrimaryKeysExist()
		throws Exception {

		Declaracao newDeclaracao = addDeclaracao();

		long pk = RandomTestUtil.nextLong();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newDeclaracao.getPrimaryKey());
		primaryKeys.add(pk);

		Map<Serializable, Declaracao> declaracaos =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(1, declaracaos.size());
		Assert.assertEquals(
			newDeclaracao, declaracaos.get(newDeclaracao.getPrimaryKey()));
	}

	@Test
	public void testFetchByPrimaryKeysWithNoPrimaryKeys() throws Exception {
		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		Map<Serializable, Declaracao> declaracaos =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertTrue(declaracaos.isEmpty());
	}

	@Test
	public void testFetchByPrimaryKeysWithOnePrimaryKey() throws Exception {
		Declaracao newDeclaracao = addDeclaracao();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newDeclaracao.getPrimaryKey());

		Map<Serializable, Declaracao> declaracaos =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(1, declaracaos.size());
		Assert.assertEquals(
			newDeclaracao, declaracaos.get(newDeclaracao.getPrimaryKey()));
	}

	@Test
	public void testActionableDynamicQuery() throws Exception {
		final IntegerWrapper count = new IntegerWrapper();

		ActionableDynamicQuery actionableDynamicQuery =
			DeclaracaoLocalServiceUtil.getActionableDynamicQuery();

		actionableDynamicQuery.setPerformActionMethod(
			new ActionableDynamicQuery.PerformActionMethod<Declaracao>() {

				@Override
				public void performAction(Declaracao declaracao) {
					Assert.assertNotNull(declaracao);

					count.increment();
				}

			});

		actionableDynamicQuery.performActions();

		Assert.assertEquals(count.getValue(), _persistence.countAll());
	}

	@Test
	public void testDynamicQueryByPrimaryKeyExisting() throws Exception {
		Declaracao newDeclaracao = addDeclaracao();

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			Declaracao.class, _dynamicQueryClassLoader);

		dynamicQuery.add(
			RestrictionsFactoryUtil.eq(
				"declaracaoId", newDeclaracao.getDeclaracaoId()));

		List<Declaracao> result = _persistence.findWithDynamicQuery(
			dynamicQuery);

		Assert.assertEquals(1, result.size());

		Declaracao existingDeclaracao = result.get(0);

		Assert.assertEquals(existingDeclaracao, newDeclaracao);
	}

	@Test
	public void testDynamicQueryByPrimaryKeyMissing() throws Exception {
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			Declaracao.class, _dynamicQueryClassLoader);

		dynamicQuery.add(
			RestrictionsFactoryUtil.eq(
				"declaracaoId", RandomTestUtil.nextLong()));

		List<Declaracao> result = _persistence.findWithDynamicQuery(
			dynamicQuery);

		Assert.assertEquals(0, result.size());
	}

	@Test
	public void testDynamicQueryByProjectionExisting() throws Exception {
		Declaracao newDeclaracao = addDeclaracao();

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			Declaracao.class, _dynamicQueryClassLoader);

		dynamicQuery.setProjection(
			ProjectionFactoryUtil.property("declaracaoId"));

		Object newDeclaracaoId = newDeclaracao.getDeclaracaoId();

		dynamicQuery.add(
			RestrictionsFactoryUtil.in(
				"declaracaoId", new Object[] {newDeclaracaoId}));

		List<Object> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(1, result.size());

		Object existingDeclaracaoId = result.get(0);

		Assert.assertEquals(existingDeclaracaoId, newDeclaracaoId);
	}

	@Test
	public void testDynamicQueryByProjectionMissing() throws Exception {
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			Declaracao.class, _dynamicQueryClassLoader);

		dynamicQuery.setProjection(
			ProjectionFactoryUtil.property("declaracaoId"));

		dynamicQuery.add(
			RestrictionsFactoryUtil.in(
				"declaracaoId", new Object[] {RandomTestUtil.nextLong()}));

		List<Object> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(0, result.size());
	}

	@Test
	public void testResetOriginalValues() throws Exception {
		Declaracao newDeclaracao = addDeclaracao();

		_persistence.clearCache();

		_assertOriginalValues(
			_persistence.findByPrimaryKey(newDeclaracao.getPrimaryKey()));
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

		Declaracao newDeclaracao = addDeclaracao();

		if (clearSession) {
			Session session = _persistence.openSession();

			session.flush();

			session.clear();
		}

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			Declaracao.class, _dynamicQueryClassLoader);

		dynamicQuery.add(
			RestrictionsFactoryUtil.eq(
				"declaracaoId", newDeclaracao.getDeclaracaoId()));

		List<Declaracao> result = _persistence.findWithDynamicQuery(
			dynamicQuery);

		_assertOriginalValues(result.get(0));
	}

	private void _assertOriginalValues(Declaracao declaracao) {
		Assert.assertEquals(
			Long.valueOf(declaracao.getPropostaId()),
			ReflectionTestUtil.<Long>invoke(
				declaracao, "getColumnOriginalValue",
				new Class<?>[] {String.class}, "propostaId"));
	}

	protected Declaracao addDeclaracao() throws Exception {
		long pk = RandomTestUtil.nextLong();

		Declaracao declaracao = _persistence.create(pk);

		declaracao.setUuid(RandomTestUtil.randomString());

		declaracao.setPropostaId(RandomTestUtil.nextLong());

		declaracao.setCumpreCompromissos(RandomTestUtil.randomBoolean());

		declaracao.setNaoAlienacaoBensSemComunicacao(
			RandomTestUtil.randomBoolean());

		declaracao.setReconheceGrupoOuSucessao(RandomTestUtil.randomBoolean());

		declaracao.setCompromissoConfidencialidade(
			RandomTestUtil.randomBoolean());

		declaracao.setCienciaProcesso(RandomTestUtil.randomBoolean());

		declaracao.setAbusoTransacao(RandomTestUtil.randomBoolean());

		declaracao.setImpugnacaoRecursos(RandomTestUtil.randomBoolean());

		declaracao.setRenunciaRecursos(RandomTestUtil.randomBoolean());

		declaracao.setPeticionamentoProcessos(RandomTestUtil.randomBoolean());

		declaracao.setPrestacaoInformacoes(RandomTestUtil.randomBoolean());

		declaracao.setOmissaoInformacoes(RandomTestUtil.randomBoolean());

		declaracao.setManutencaoGarantias(RandomTestUtil.randomBoolean());

		_declaracaos.add(_persistence.update(declaracao));

		return declaracao;
	}

	private List<Declaracao> _declaracaos = new ArrayList<Declaracao>();
	private DeclaracaoPersistence _persistence;
	private ClassLoader _dynamicQueryClassLoader;

}
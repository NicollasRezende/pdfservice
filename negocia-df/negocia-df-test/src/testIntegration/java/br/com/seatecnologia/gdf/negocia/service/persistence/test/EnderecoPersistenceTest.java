/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.persistence.test;

import br.com.seatecnologia.gdf.negocia.exception.NoSuchEnderecoException;
import br.com.seatecnologia.gdf.negocia.model.Endereco;
import br.com.seatecnologia.gdf.negocia.service.EnderecoLocalServiceUtil;
import br.com.seatecnologia.gdf.negocia.service.persistence.EnderecoPersistence;
import br.com.seatecnologia.gdf.negocia.service.persistence.EnderecoUtil;

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
public class EnderecoPersistenceTest {

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
		_persistence = EnderecoUtil.getPersistence();

		Class<?> clazz = _persistence.getClass();

		_dynamicQueryClassLoader = clazz.getClassLoader();
	}

	@After
	public void tearDown() throws Exception {
		Iterator<Endereco> iterator = _enderecos.iterator();

		while (iterator.hasNext()) {
			_persistence.remove(iterator.next());

			iterator.remove();
		}
	}

	@Test
	public void testCreate() throws Exception {
		long pk = RandomTestUtil.nextLong();

		Endereco endereco = _persistence.create(pk);

		Assert.assertNotNull(endereco);

		Assert.assertEquals(endereco.getPrimaryKey(), pk);
	}

	@Test
	public void testRemove() throws Exception {
		Endereco newEndereco = addEndereco();

		_persistence.remove(newEndereco);

		Endereco existingEndereco = _persistence.fetchByPrimaryKey(
			newEndereco.getPrimaryKey());

		Assert.assertNull(existingEndereco);
	}

	@Test
	public void testUpdateNew() throws Exception {
		addEndereco();
	}

	@Test
	public void testUpdateExisting() throws Exception {
		long pk = RandomTestUtil.nextLong();

		Endereco newEndereco = _persistence.create(pk);

		newEndereco.setUuid(RandomTestUtil.randomString());

		newEndereco.setCep(RandomTestUtil.randomString());

		newEndereco.setEndereco(RandomTestUtil.randomString());

		newEndereco.setNumero(RandomTestUtil.randomString());

		newEndereco.setEstado(RandomTestUtil.randomString());

		newEndereco.setMunicipio(RandomTestUtil.randomString());

		newEndereco.setBairro(RandomTestUtil.randomString());

		newEndereco.setComplemento(RandomTestUtil.randomString());

		_enderecos.add(_persistence.update(newEndereco));

		Endereco existingEndereco = _persistence.findByPrimaryKey(
			newEndereco.getPrimaryKey());

		Assert.assertEquals(existingEndereco.getUuid(), newEndereco.getUuid());
		Assert.assertEquals(
			existingEndereco.getEnderecoId(), newEndereco.getEnderecoId());
		Assert.assertEquals(existingEndereco.getCep(), newEndereco.getCep());
		Assert.assertEquals(
			existingEndereco.getEndereco(), newEndereco.getEndereco());
		Assert.assertEquals(
			existingEndereco.getNumero(), newEndereco.getNumero());
		Assert.assertEquals(
			existingEndereco.getEstado(), newEndereco.getEstado());
		Assert.assertEquals(
			existingEndereco.getMunicipio(), newEndereco.getMunicipio());
		Assert.assertEquals(
			existingEndereco.getBairro(), newEndereco.getBairro());
		Assert.assertEquals(
			existingEndereco.getComplemento(), newEndereco.getComplemento());
	}

	@Test
	public void testCountByUuid() throws Exception {
		_persistence.countByUuid("");

		_persistence.countByUuid("null");

		_persistence.countByUuid((String)null);
	}

	@Test
	public void testFindByPrimaryKeyExisting() throws Exception {
		Endereco newEndereco = addEndereco();

		Endereco existingEndereco = _persistence.findByPrimaryKey(
			newEndereco.getPrimaryKey());

		Assert.assertEquals(existingEndereco, newEndereco);
	}

	@Test(expected = NoSuchEnderecoException.class)
	public void testFindByPrimaryKeyMissing() throws Exception {
		long pk = RandomTestUtil.nextLong();

		_persistence.findByPrimaryKey(pk);
	}

	@Test
	public void testFindAll() throws Exception {
		_persistence.findAll(
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, getOrderByComparator());
	}

	protected OrderByComparator<Endereco> getOrderByComparator() {
		return OrderByComparatorFactoryUtil.create(
			"GDF_Endereco", "uuid", true, "enderecoId", true, "cep", true,
			"endereco", true, "numero", true, "estado", true, "municipio", true,
			"bairro", true, "complemento", true);
	}

	@Test
	public void testFetchByPrimaryKeyExisting() throws Exception {
		Endereco newEndereco = addEndereco();

		Endereco existingEndereco = _persistence.fetchByPrimaryKey(
			newEndereco.getPrimaryKey());

		Assert.assertEquals(existingEndereco, newEndereco);
	}

	@Test
	public void testFetchByPrimaryKeyMissing() throws Exception {
		long pk = RandomTestUtil.nextLong();

		Endereco missingEndereco = _persistence.fetchByPrimaryKey(pk);

		Assert.assertNull(missingEndereco);
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereAllPrimaryKeysExist()
		throws Exception {

		Endereco newEndereco1 = addEndereco();
		Endereco newEndereco2 = addEndereco();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newEndereco1.getPrimaryKey());
		primaryKeys.add(newEndereco2.getPrimaryKey());

		Map<Serializable, Endereco> enderecos = _persistence.fetchByPrimaryKeys(
			primaryKeys);

		Assert.assertEquals(2, enderecos.size());
		Assert.assertEquals(
			newEndereco1, enderecos.get(newEndereco1.getPrimaryKey()));
		Assert.assertEquals(
			newEndereco2, enderecos.get(newEndereco2.getPrimaryKey()));
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereNoPrimaryKeysExist()
		throws Exception {

		long pk1 = RandomTestUtil.nextLong();

		long pk2 = RandomTestUtil.nextLong();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(pk1);
		primaryKeys.add(pk2);

		Map<Serializable, Endereco> enderecos = _persistence.fetchByPrimaryKeys(
			primaryKeys);

		Assert.assertTrue(enderecos.isEmpty());
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereSomePrimaryKeysExist()
		throws Exception {

		Endereco newEndereco = addEndereco();

		long pk = RandomTestUtil.nextLong();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newEndereco.getPrimaryKey());
		primaryKeys.add(pk);

		Map<Serializable, Endereco> enderecos = _persistence.fetchByPrimaryKeys(
			primaryKeys);

		Assert.assertEquals(1, enderecos.size());
		Assert.assertEquals(
			newEndereco, enderecos.get(newEndereco.getPrimaryKey()));
	}

	@Test
	public void testFetchByPrimaryKeysWithNoPrimaryKeys() throws Exception {
		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		Map<Serializable, Endereco> enderecos = _persistence.fetchByPrimaryKeys(
			primaryKeys);

		Assert.assertTrue(enderecos.isEmpty());
	}

	@Test
	public void testFetchByPrimaryKeysWithOnePrimaryKey() throws Exception {
		Endereco newEndereco = addEndereco();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newEndereco.getPrimaryKey());

		Map<Serializable, Endereco> enderecos = _persistence.fetchByPrimaryKeys(
			primaryKeys);

		Assert.assertEquals(1, enderecos.size());
		Assert.assertEquals(
			newEndereco, enderecos.get(newEndereco.getPrimaryKey()));
	}

	@Test
	public void testActionableDynamicQuery() throws Exception {
		final IntegerWrapper count = new IntegerWrapper();

		ActionableDynamicQuery actionableDynamicQuery =
			EnderecoLocalServiceUtil.getActionableDynamicQuery();

		actionableDynamicQuery.setPerformActionMethod(
			new ActionableDynamicQuery.PerformActionMethod<Endereco>() {

				@Override
				public void performAction(Endereco endereco) {
					Assert.assertNotNull(endereco);

					count.increment();
				}

			});

		actionableDynamicQuery.performActions();

		Assert.assertEquals(count.getValue(), _persistence.countAll());
	}

	@Test
	public void testDynamicQueryByPrimaryKeyExisting() throws Exception {
		Endereco newEndereco = addEndereco();

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			Endereco.class, _dynamicQueryClassLoader);

		dynamicQuery.add(
			RestrictionsFactoryUtil.eq(
				"enderecoId", newEndereco.getEnderecoId()));

		List<Endereco> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(1, result.size());

		Endereco existingEndereco = result.get(0);

		Assert.assertEquals(existingEndereco, newEndereco);
	}

	@Test
	public void testDynamicQueryByPrimaryKeyMissing() throws Exception {
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			Endereco.class, _dynamicQueryClassLoader);

		dynamicQuery.add(
			RestrictionsFactoryUtil.eq(
				"enderecoId", RandomTestUtil.nextLong()));

		List<Endereco> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(0, result.size());
	}

	@Test
	public void testDynamicQueryByProjectionExisting() throws Exception {
		Endereco newEndereco = addEndereco();

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			Endereco.class, _dynamicQueryClassLoader);

		dynamicQuery.setProjection(
			ProjectionFactoryUtil.property("enderecoId"));

		Object newEnderecoId = newEndereco.getEnderecoId();

		dynamicQuery.add(
			RestrictionsFactoryUtil.in(
				"enderecoId", new Object[] {newEnderecoId}));

		List<Object> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(1, result.size());

		Object existingEnderecoId = result.get(0);

		Assert.assertEquals(existingEnderecoId, newEnderecoId);
	}

	@Test
	public void testDynamicQueryByProjectionMissing() throws Exception {
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			Endereco.class, _dynamicQueryClassLoader);

		dynamicQuery.setProjection(
			ProjectionFactoryUtil.property("enderecoId"));

		dynamicQuery.add(
			RestrictionsFactoryUtil.in(
				"enderecoId", new Object[] {RandomTestUtil.nextLong()}));

		List<Object> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(0, result.size());
	}

	protected Endereco addEndereco() throws Exception {
		long pk = RandomTestUtil.nextLong();

		Endereco endereco = _persistence.create(pk);

		endereco.setUuid(RandomTestUtil.randomString());

		endereco.setCep(RandomTestUtil.randomString());

		endereco.setEndereco(RandomTestUtil.randomString());

		endereco.setNumero(RandomTestUtil.randomString());

		endereco.setEstado(RandomTestUtil.randomString());

		endereco.setMunicipio(RandomTestUtil.randomString());

		endereco.setBairro(RandomTestUtil.randomString());

		endereco.setComplemento(RandomTestUtil.randomString());

		_enderecos.add(_persistence.update(endereco));

		return endereco;
	}

	private List<Endereco> _enderecos = new ArrayList<Endereco>();
	private EnderecoPersistence _persistence;
	private ClassLoader _dynamicQueryClassLoader;

}
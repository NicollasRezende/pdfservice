package br.com.seatecnologia.gdf.negocia.headless.resource.v1_0.test;

import br.com.seatecnologia.gdf.negocia.headless.client.dto.v1_0.EditalEntity;
import br.com.seatecnologia.gdf.negocia.headless.client.dto.v1_0.MetadadosFormulario;
import br.com.seatecnologia.gdf.negocia.headless.client.http.HttpInvoker;
import br.com.seatecnologia.gdf.negocia.headless.client.pagination.Page;
import br.com.seatecnologia.gdf.negocia.headless.client.resource.v1_0.EditalEntityResource;
import br.com.seatecnologia.gdf.negocia.headless.client.serdes.v1_0.EditalEntitySerDes;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.util.ISO8601DateFormat;

import com.liferay.petra.reflect.ReflectionUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.json.JSONUtil;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.CompanyLocalServiceUtil;
import com.liferay.portal.kernel.test.util.GroupTestUtil;
import com.liferay.portal.kernel.test.util.RandomTestUtil;
import com.liferay.portal.kernel.test.util.UserTestUtil;
import com.liferay.portal.kernel.util.ArrayUtil;
import com.liferay.portal.kernel.util.FastDateFormatFactoryUtil;
import com.liferay.portal.kernel.util.LocaleUtil;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Time;
import com.liferay.portal.odata.entity.EntityField;
import com.liferay.portal.odata.entity.EntityModel;
import com.liferay.portal.test.rule.Inject;
import com.liferay.portal.test.rule.LiferayIntegrationTestRule;
import com.liferay.portal.util.PropsValues;
import com.liferay.portal.vulcan.resource.EntityModelResource;
import com.liferay.portal.vulcan.util.TransformUtil;

import java.lang.reflect.Method;

import java.text.Format;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import javax.annotation.Generated;

import javax.ws.rs.core.MultivaluedHashMap;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;

/**
 * @author sabrina
 * @generated
 */
@Generated("")
public abstract class BaseEditalEntityResourceTestCase {

	@ClassRule
	@Rule
	public static final LiferayIntegrationTestRule liferayIntegrationTestRule =
		new LiferayIntegrationTestRule();

	@BeforeClass
	public static void setUpClass() throws Exception {
		_format = FastDateFormatFactoryUtil.getSimpleDateFormat(
			"yyyy-MM-dd'T'HH:mm:ss'Z'");
	}

	@Before
	public void setUp() throws Exception {
		irrelevantGroup = GroupTestUtil.addGroup();
		testGroup = GroupTestUtil.addGroup();

		testCompany = CompanyLocalServiceUtil.getCompany(
			testGroup.getCompanyId());

		_editalEntityResource.setContextCompany(testCompany);

		_testCompanyAdminUser = UserTestUtil.getAdminUser(
			testCompany.getCompanyId());

		editalEntityResource = EditalEntityResource.builder(
		).authentication(
			_testCompanyAdminUser.getEmailAddress(),
			PropsValues.DEFAULT_ADMIN_PASSWORD
		).endpoint(
			testCompany.getVirtualHostname(), 8080, "http"
		).locale(
			LocaleUtil.getDefault()
		).build();
	}

	@After
	public void tearDown() throws Exception {
		GroupTestUtil.deleteGroup(irrelevantGroup);
		GroupTestUtil.deleteGroup(testGroup);
	}

	@Test
	public void testClientSerDesToDTO() throws Exception {
		ObjectMapper objectMapper = getClientSerDesObjectMapper();

		EditalEntity editalEntity1 = randomEditalEntity();

		String json = objectMapper.writeValueAsString(editalEntity1);

		EditalEntity editalEntity2 = EditalEntitySerDes.toDTO(json);

		Assert.assertTrue(equals(editalEntity1, editalEntity2));
	}

	@Test
	public void testClientSerDesToJSON() throws Exception {
		ObjectMapper objectMapper = getClientSerDesObjectMapper();

		EditalEntity editalEntity = randomEditalEntity();

		String json1 = objectMapper.writeValueAsString(editalEntity);
		String json2 = EditalEntitySerDes.toJSON(editalEntity);

		Assert.assertEquals(
			objectMapper.readTree(json1), objectMapper.readTree(json2));
	}

	protected ObjectMapper getClientSerDesObjectMapper() {
		return new ObjectMapper() {
			{
				configure(MapperFeature.SORT_PROPERTIES_ALPHABETICALLY, true);
				configure(
					SerializationFeature.WRITE_ENUMS_USING_TO_STRING, true);
				enable(SerializationFeature.INDENT_OUTPUT);
				setDateFormat(new ISO8601DateFormat());
				setSerializationInclusion(JsonInclude.Include.NON_EMPTY);
				setSerializationInclusion(JsonInclude.Include.NON_NULL);
				setVisibility(
					PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);
				setVisibility(
					PropertyAccessor.GETTER, JsonAutoDetect.Visibility.NONE);
			}
		};
	}

	@Test
	public void testEscapeRegexInStringFields() throws Exception {
		String regex = "^[0-9]+(\\.[0-9]{1,2})\"?";

		EditalEntity editalEntity = randomEditalEntity();

		editalEntity.setDescricao(regex);
		editalEntity.setTitulo(regex);
		editalEntity.setUrlArquivo(regex);

		String json = EditalEntitySerDes.toJSON(editalEntity);

		Assert.assertFalse(json.contains(regex));

		editalEntity = EditalEntitySerDes.toDTO(json);

		Assert.assertEquals(regex, editalEntity.getDescricao());
		Assert.assertEquals(regex, editalEntity.getTitulo());
		Assert.assertEquals(regex, editalEntity.getUrlArquivo());
	}

	@Test
	public void testGetMetadados() throws Exception {
		EditalEntity postEditalEntity = testGetEditalEntity_addEditalEntity();

		MetadadosFormulario postMetadadosFormulario =
			testGetMetadados_addMetadadosFormulario(
				postEditalEntity.getId(), randomMetadadosFormulario());

		MetadadosFormulario getMetadadosFormulario =
			editalEntityResource.getMetadados(postEditalEntity.getId());

		assertEquals(postMetadadosFormulario, getMetadadosFormulario);
		assertValid(getMetadadosFormulario);
	}

	protected MetadadosFormulario testGetMetadados_addMetadadosFormulario(
			long editalEntityId, MetadadosFormulario metadadosFormulario)
		throws Exception {

		throw new UnsupportedOperationException(
			"This method needs to be implemented");
	}

	protected void assertContains(
		EditalEntity editalEntity, List<EditalEntity> editalEntities) {

		boolean contains = false;

		for (EditalEntity item : editalEntities) {
			if (equals(editalEntity, item)) {
				contains = true;

				break;
			}
		}

		Assert.assertTrue(
			editalEntities + " does not contain " + editalEntity, contains);
	}

	protected void assertHttpResponseStatusCode(
		int expectedHttpResponseStatusCode,
		HttpInvoker.HttpResponse actualHttpResponse) {

		Assert.assertEquals(
			expectedHttpResponseStatusCode, actualHttpResponse.getStatusCode());
	}

	protected void assertEquals(
		EditalEntity editalEntity1, EditalEntity editalEntity2) {

		Assert.assertTrue(
			editalEntity1 + " does not equal " + editalEntity2,
			equals(editalEntity1, editalEntity2));
	}

	protected void assertEquals(
		List<EditalEntity> editalEntities1,
		List<EditalEntity> editalEntities2) {

		Assert.assertEquals(editalEntities1.size(), editalEntities2.size());

		for (int i = 0; i < editalEntities1.size(); i++) {
			EditalEntity editalEntity1 = editalEntities1.get(i);
			EditalEntity editalEntity2 = editalEntities2.get(i);

			assertEquals(editalEntity1, editalEntity2);
		}
	}

	protected void assertEquals(
		MetadadosFormulario metadadosFormulario1,
		MetadadosFormulario metadadosFormulario2) {

		Assert.assertTrue(
			metadadosFormulario1 + " does not equal " + metadadosFormulario2,
			equals(metadadosFormulario1, metadadosFormulario2));
	}

	protected void assertEqualsIgnoringOrder(
		List<EditalEntity> editalEntities1,
		List<EditalEntity> editalEntities2) {

		Assert.assertEquals(editalEntities1.size(), editalEntities2.size());

		for (EditalEntity editalEntity1 : editalEntities1) {
			boolean contains = false;

			for (EditalEntity editalEntity2 : editalEntities2) {
				if (equals(editalEntity1, editalEntity2)) {
					contains = true;

					break;
				}
			}

			Assert.assertTrue(
				editalEntities2 + " does not contain " + editalEntity1,
				contains);
		}
	}

	protected void assertValid(EditalEntity editalEntity) throws Exception {
		boolean valid = true;

		for (String additionalAssertFieldName :
				getAdditionalAssertFieldNames()) {

			if (Objects.equals("dataFim", additionalAssertFieldName)) {
				if (editalEntity.getDataFim() == null) {
					valid = false;
				}

				continue;
			}

			if (Objects.equals("dataInicio", additionalAssertFieldName)) {
				if (editalEntity.getDataInicio() == null) {
					valid = false;
				}

				continue;
			}

			if (Objects.equals("descricao", additionalAssertFieldName)) {
				if (editalEntity.getDescricao() == null) {
					valid = false;
				}

				continue;
			}

			if (Objects.equals("editalId", additionalAssertFieldName)) {
				if (editalEntity.getEditalId() == null) {
					valid = false;
				}

				continue;
			}

			if (Objects.equals("titulo", additionalAssertFieldName)) {
				if (editalEntity.getTitulo() == null) {
					valid = false;
				}

				continue;
			}

			if (Objects.equals("urlArquivo", additionalAssertFieldName)) {
				if (editalEntity.getUrlArquivo() == null) {
					valid = false;
				}

				continue;
			}

			throw new IllegalArgumentException(
				"Invalid additional assert field name " +
					additionalAssertFieldName);
		}

		Assert.assertTrue(valid);
	}

	protected void assertValid(Page<EditalEntity> page) {
		assertValid(page, Collections.emptyMap());
	}

	protected void assertValid(
		Page<EditalEntity> page,
		Map<String, Map<String, String>> expectedActions) {

		boolean valid = false;

		java.util.Collection<EditalEntity> editalEntities = page.getItems();

		int size = editalEntities.size();

		if ((page.getLastPage() > 0) && (page.getPage() > 0) &&
			(page.getPageSize() > 0) && (page.getTotalCount() > 0) &&
			(size > 0)) {

			valid = true;
		}

		Assert.assertTrue(valid);

		assertValid(page.getActions(), expectedActions);
	}

	protected void assertValid(
		Map<String, Map<String, String>> actions1,
		Map<String, Map<String, String>> actions2) {

		for (String key : actions2.keySet()) {
			Map action = actions1.get(key);

			Assert.assertNotNull(key + " does not contain an action", action);

			Map<String, String> expectedAction = actions2.get(key);

			Assert.assertEquals(
				expectedAction.get("method"), action.get("method"));
			Assert.assertEquals(expectedAction.get("href"), action.get("href"));
		}
	}

	protected void assertValid(MetadadosFormulario metadadosFormulario) {
		boolean valid = true;

		for (String additionalAssertFieldName :
				getAdditionalMetadadosFormularioAssertFieldNames()) {

			if (Objects.equals("dlFolderId", additionalAssertFieldName)) {
				if (metadadosFormulario.getDlFolderId() == null) {
					valid = false;
				}

				continue;
			}

			if (Objects.equals("editalEntities", additionalAssertFieldName)) {
				if (metadadosFormulario.getEditalEntities() == null) {
					valid = false;
				}

				continue;
			}

			throw new IllegalArgumentException(
				"Invalid additional assert field name " +
					additionalAssertFieldName);
		}

		Assert.assertTrue(valid);
	}

	protected String[] getAdditionalAssertFieldNames() {
		return new String[0];
	}

	protected String[] getAdditionalMetadadosFormularioAssertFieldNames() {
		return new String[0];
	}

	protected List<GraphQLField> getGraphQLFields() throws Exception {
		List<GraphQLField> graphQLFields = new ArrayList<>();

		for (java.lang.reflect.Field field :
				getDeclaredFields(
					br.com.seatecnologia.gdf.negocia.headless.dto.v1_0.
						EditalEntity.class)) {

			if (!ArrayUtil.contains(
					getAdditionalAssertFieldNames(), field.getName())) {

				continue;
			}

			graphQLFields.addAll(getGraphQLFields(field));
		}

		return graphQLFields;
	}

	protected List<GraphQLField> getGraphQLFields(
			java.lang.reflect.Field... fields)
		throws Exception {

		List<GraphQLField> graphQLFields = new ArrayList<>();

		for (java.lang.reflect.Field field : fields) {
			com.liferay.portal.vulcan.graphql.annotation.GraphQLField
				vulcanGraphQLField = field.getAnnotation(
					com.liferay.portal.vulcan.graphql.annotation.GraphQLField.
						class);

			if (vulcanGraphQLField != null) {
				Class<?> clazz = field.getType();

				if (clazz.isArray()) {
					clazz = clazz.getComponentType();
				}

				List<GraphQLField> childrenGraphQLFields = getGraphQLFields(
					getDeclaredFields(clazz));

				graphQLFields.add(
					new GraphQLField(field.getName(), childrenGraphQLFields));
			}
		}

		return graphQLFields;
	}

	protected String[] getIgnoredEntityFieldNames() {
		return new String[0];
	}

	protected boolean equals(
		EditalEntity editalEntity1, EditalEntity editalEntity2) {

		if (editalEntity1 == editalEntity2) {
			return true;
		}

		for (String additionalAssertFieldName :
				getAdditionalAssertFieldNames()) {

			if (Objects.equals("dataFim", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						editalEntity1.getDataFim(),
						editalEntity2.getDataFim())) {

					return false;
				}

				continue;
			}

			if (Objects.equals("dataInicio", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						editalEntity1.getDataInicio(),
						editalEntity2.getDataInicio())) {

					return false;
				}

				continue;
			}

			if (Objects.equals("descricao", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						editalEntity1.getDescricao(),
						editalEntity2.getDescricao())) {

					return false;
				}

				continue;
			}

			if (Objects.equals("editalId", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						editalEntity1.getEditalId(),
						editalEntity2.getEditalId())) {

					return false;
				}

				continue;
			}

			if (Objects.equals("titulo", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						editalEntity1.getTitulo(), editalEntity2.getTitulo())) {

					return false;
				}

				continue;
			}

			if (Objects.equals("urlArquivo", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						editalEntity1.getUrlArquivo(),
						editalEntity2.getUrlArquivo())) {

					return false;
				}

				continue;
			}

			throw new IllegalArgumentException(
				"Invalid additional assert field name " +
					additionalAssertFieldName);
		}

		return true;
	}

	protected boolean equals(
		Map<String, Object> map1, Map<String, Object> map2) {

		if (Objects.equals(map1.keySet(), map2.keySet())) {
			for (Map.Entry<String, Object> entry : map1.entrySet()) {
				if (entry.getValue() instanceof Map) {
					if (!equals(
							(Map)entry.getValue(),
							(Map)map2.get(entry.getKey()))) {

						return false;
					}
				}
				else if (!Objects.deepEquals(
							entry.getValue(), map2.get(entry.getKey()))) {

					return false;
				}
			}

			return true;
		}

		return false;
	}

	protected boolean equals(
		MetadadosFormulario metadadosFormulario1,
		MetadadosFormulario metadadosFormulario2) {

		if (metadadosFormulario1 == metadadosFormulario2) {
			return true;
		}

		for (String additionalAssertFieldName :
				getAdditionalMetadadosFormularioAssertFieldNames()) {

			if (Objects.equals("dlFolderId", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						metadadosFormulario1.getDlFolderId(),
						metadadosFormulario2.getDlFolderId())) {

					return false;
				}

				continue;
			}

			if (Objects.equals("editalEntities", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						metadadosFormulario1.getEditalEntities(),
						metadadosFormulario2.getEditalEntities())) {

					return false;
				}

				continue;
			}

			throw new IllegalArgumentException(
				"Invalid additional assert field name " +
					additionalAssertFieldName);
		}

		return true;
	}

	protected java.lang.reflect.Field[] getDeclaredFields(Class clazz)
		throws Exception {

		if (clazz.getClassLoader() == null) {
			return new java.lang.reflect.Field[0];
		}

		return TransformUtil.transform(
			ReflectionUtil.getDeclaredFields(clazz),
			field -> {
				if (field.isSynthetic()) {
					return null;
				}

				return field;
			},
			java.lang.reflect.Field.class);
	}

	protected java.util.Collection<EntityField> getEntityFields()
		throws Exception {

		if (!(_editalEntityResource instanceof EntityModelResource)) {
			throw new UnsupportedOperationException(
				"Resource is not an instance of EntityModelResource");
		}

		EntityModelResource entityModelResource =
			(EntityModelResource)_editalEntityResource;

		EntityModel entityModel = entityModelResource.getEntityModel(
			new MultivaluedHashMap());

		if (entityModel == null) {
			return Collections.emptyList();
		}

		Map<String, EntityField> entityFieldsMap =
			entityModel.getEntityFieldsMap();

		return entityFieldsMap.values();
	}

	protected List<EntityField> getEntityFields(EntityField.Type type)
		throws Exception {

		return TransformUtil.transform(
			getEntityFields(),
			entityField -> {
				if (!Objects.equals(entityField.getType(), type) ||
					ArrayUtil.contains(
						getIgnoredEntityFieldNames(), entityField.getName())) {

					return null;
				}

				return entityField;
			});
	}

	protected String getFilterString(
		EntityField entityField, String operator, EditalEntity editalEntity) {

		StringBundler sb = new StringBundler();

		String entityFieldName = entityField.getName();

		sb.append(entityFieldName);

		sb.append(" ");
		sb.append(operator);
		sb.append(" ");

		if (entityFieldName.equals("dataFim")) {
			if (operator.equals("between")) {
				Date date = editalEntity.getDataFim();

				sb = new StringBundler();

				sb.append("(");
				sb.append(entityFieldName);
				sb.append(" gt ");
				sb.append(_format.format(date.getTime() - (2 * Time.SECOND)));
				sb.append(" and ");
				sb.append(entityFieldName);
				sb.append(" lt ");
				sb.append(_format.format(date.getTime() + (2 * Time.SECOND)));
				sb.append(")");
			}
			else {
				sb.append(entityFieldName);

				sb.append(" ");
				sb.append(operator);
				sb.append(" ");

				sb.append(_format.format(editalEntity.getDataFim()));
			}

			return sb.toString();
		}

		if (entityFieldName.equals("dataInicio")) {
			if (operator.equals("between")) {
				Date date = editalEntity.getDataInicio();

				sb = new StringBundler();

				sb.append("(");
				sb.append(entityFieldName);
				sb.append(" gt ");
				sb.append(_format.format(date.getTime() - (2 * Time.SECOND)));
				sb.append(" and ");
				sb.append(entityFieldName);
				sb.append(" lt ");
				sb.append(_format.format(date.getTime() + (2 * Time.SECOND)));
				sb.append(")");
			}
			else {
				sb.append(entityFieldName);

				sb.append(" ");
				sb.append(operator);
				sb.append(" ");

				sb.append(_format.format(editalEntity.getDataInicio()));
			}

			return sb.toString();
		}

		if (entityFieldName.equals("descricao")) {
			Object object = editalEntity.getDescricao();

			String value = String.valueOf(object);

			if (operator.equals("contains")) {
				sb = new StringBundler();

				sb.append("contains(");
				sb.append(entityFieldName);
				sb.append(",'");

				if ((object != null) && (value.length() > 2)) {
					sb.append(value.substring(1, value.length() - 1));
				}
				else {
					sb.append(value);
				}

				sb.append("')");
			}
			else if (operator.equals("startswith")) {
				sb = new StringBundler();

				sb.append("startswith(");
				sb.append(entityFieldName);
				sb.append(",'");

				if ((object != null) && (value.length() > 1)) {
					sb.append(value.substring(0, value.length() - 1));
				}
				else {
					sb.append(value);
				}

				sb.append("')");
			}
			else {
				sb.append("'");
				sb.append(value);
				sb.append("'");
			}

			return sb.toString();
		}

		if (entityFieldName.equals("editalId")) {
			throw new IllegalArgumentException(
				"Invalid entity field " + entityFieldName);
		}

		if (entityFieldName.equals("titulo")) {
			Object object = editalEntity.getTitulo();

			String value = String.valueOf(object);

			if (operator.equals("contains")) {
				sb = new StringBundler();

				sb.append("contains(");
				sb.append(entityFieldName);
				sb.append(",'");

				if ((object != null) && (value.length() > 2)) {
					sb.append(value.substring(1, value.length() - 1));
				}
				else {
					sb.append(value);
				}

				sb.append("')");
			}
			else if (operator.equals("startswith")) {
				sb = new StringBundler();

				sb.append("startswith(");
				sb.append(entityFieldName);
				sb.append(",'");

				if ((object != null) && (value.length() > 1)) {
					sb.append(value.substring(0, value.length() - 1));
				}
				else {
					sb.append(value);
				}

				sb.append("')");
			}
			else {
				sb.append("'");
				sb.append(value);
				sb.append("'");
			}

			return sb.toString();
		}

		if (entityFieldName.equals("urlArquivo")) {
			Object object = editalEntity.getUrlArquivo();

			String value = String.valueOf(object);

			if (operator.equals("contains")) {
				sb = new StringBundler();

				sb.append("contains(");
				sb.append(entityFieldName);
				sb.append(",'");

				if ((object != null) && (value.length() > 2)) {
					sb.append(value.substring(1, value.length() - 1));
				}
				else {
					sb.append(value);
				}

				sb.append("')");
			}
			else if (operator.equals("startswith")) {
				sb = new StringBundler();

				sb.append("startswith(");
				sb.append(entityFieldName);
				sb.append(",'");

				if ((object != null) && (value.length() > 1)) {
					sb.append(value.substring(0, value.length() - 1));
				}
				else {
					sb.append(value);
				}

				sb.append("')");
			}
			else {
				sb.append("'");
				sb.append(value);
				sb.append("'");
			}

			return sb.toString();
		}

		throw new IllegalArgumentException(
			"Invalid entity field " + entityFieldName);
	}

	protected String invoke(String query) throws Exception {
		HttpInvoker httpInvoker = HttpInvoker.newHttpInvoker();

		httpInvoker.body(
			JSONUtil.put(
				"query", query
			).toString(),
			"application/json");
		httpInvoker.httpMethod(HttpInvoker.HttpMethod.POST);
		httpInvoker.path("http://localhost:8080/o/graphql");
		httpInvoker.userNameAndPassword(
			"test@liferay.com:" + PropsValues.DEFAULT_ADMIN_PASSWORD);

		HttpInvoker.HttpResponse httpResponse = httpInvoker.invoke();

		return httpResponse.getContent();
	}

	protected JSONObject invokeGraphQLMutation(GraphQLField graphQLField)
		throws Exception {

		GraphQLField mutationGraphQLField = new GraphQLField(
			"mutation", graphQLField);

		return JSONFactoryUtil.createJSONObject(
			invoke(mutationGraphQLField.toString()));
	}

	protected JSONObject invokeGraphQLQuery(GraphQLField graphQLField)
		throws Exception {

		GraphQLField queryGraphQLField = new GraphQLField(
			"query", graphQLField);

		return JSONFactoryUtil.createJSONObject(
			invoke(queryGraphQLField.toString()));
	}

	protected EditalEntity randomEditalEntity() throws Exception {
		return new EditalEntity() {
			{
				dataFim = RandomTestUtil.nextDate();
				dataInicio = RandomTestUtil.nextDate();
				descricao = StringUtil.toLowerCase(
					RandomTestUtil.randomString());
				editalId = RandomTestUtil.randomLong();
				titulo = StringUtil.toLowerCase(RandomTestUtil.randomString());
				urlArquivo = StringUtil.toLowerCase(
					RandomTestUtil.randomString());
			}
		};
	}

	protected EditalEntity randomIrrelevantEditalEntity() throws Exception {
		EditalEntity randomIrrelevantEditalEntity = randomEditalEntity();

		return randomIrrelevantEditalEntity;
	}

	protected EditalEntity randomPatchEditalEntity() throws Exception {
		return randomEditalEntity();
	}

	protected MetadadosFormulario randomMetadadosFormulario() throws Exception {
		return new MetadadosFormulario() {
			{
				dlFolderId = RandomTestUtil.randomLong();
			}
		};
	}

	protected EditalEntityResource editalEntityResource;
	protected com.liferay.portal.kernel.model.Group irrelevantGroup;
	protected com.liferay.portal.kernel.model.Company testCompany;
	protected com.liferay.portal.kernel.model.Group testGroup;

	protected static class BeanTestUtil {

		public static void copyProperties(Object source, Object target)
			throws Exception {

			Class<?> sourceClass = source.getClass();

			Class<?> targetClass = target.getClass();

			for (java.lang.reflect.Field field :
					_getAllDeclaredFields(sourceClass)) {

				if (field.isSynthetic()) {
					continue;
				}

				Method getMethod = _getMethod(
					sourceClass, field.getName(), "get");

				try {
					Method setMethod = _getMethod(
						targetClass, field.getName(), "set",
						getMethod.getReturnType());

					setMethod.invoke(target, getMethod.invoke(source));
				}
				catch (Exception e) {
					continue;
				}
			}
		}

		public static boolean hasProperty(Object bean, String name) {
			Method setMethod = _getMethod(
				bean.getClass(), "set" + StringUtil.upperCaseFirstLetter(name));

			if (setMethod != null) {
				return true;
			}

			return false;
		}

		public static void setProperty(Object bean, String name, Object value)
			throws Exception {

			Class<?> clazz = bean.getClass();

			Method setMethod = _getMethod(
				clazz, "set" + StringUtil.upperCaseFirstLetter(name));

			if (setMethod == null) {
				throw new NoSuchMethodException();
			}

			Class<?>[] parameterTypes = setMethod.getParameterTypes();

			setMethod.invoke(bean, _translateValue(parameterTypes[0], value));
		}

		private static List<java.lang.reflect.Field> _getAllDeclaredFields(
			Class<?> clazz) {

			List<java.lang.reflect.Field> fields = new ArrayList<>();

			while ((clazz != null) && (clazz != Object.class)) {
				for (java.lang.reflect.Field field :
						clazz.getDeclaredFields()) {

					fields.add(field);
				}

				clazz = clazz.getSuperclass();
			}

			return fields;
		}

		private static Method _getMethod(Class<?> clazz, String name) {
			for (Method method : clazz.getMethods()) {
				if (name.equals(method.getName()) &&
					(method.getParameterCount() == 1) &&
					_parameterTypes.contains(method.getParameterTypes()[0])) {

					return method;
				}
			}

			return null;
		}

		private static Method _getMethod(
				Class<?> clazz, String fieldName, String prefix,
				Class<?>... parameterTypes)
			throws Exception {

			return clazz.getMethod(
				prefix + StringUtil.upperCaseFirstLetter(fieldName),
				parameterTypes);
		}

		private static Object _translateValue(
			Class<?> parameterType, Object value) {

			if ((value instanceof Integer) &&
				parameterType.equals(Long.class)) {

				Integer intValue = (Integer)value;

				return intValue.longValue();
			}

			return value;
		}

		private static final Set<Class<?>> _parameterTypes = new HashSet<>(
			Arrays.asList(
				Boolean.class, Date.class, Double.class, Integer.class,
				Long.class, Map.class, String.class));

	}

	protected class GraphQLField {

		public GraphQLField(String key, GraphQLField... graphQLFields) {
			this(key, new HashMap<>(), graphQLFields);
		}

		public GraphQLField(String key, List<GraphQLField> graphQLFields) {
			this(key, new HashMap<>(), graphQLFields);
		}

		public GraphQLField(
			String key, Map<String, Object> parameterMap,
			GraphQLField... graphQLFields) {

			_key = key;
			_parameterMap = parameterMap;
			_graphQLFields = Arrays.asList(graphQLFields);
		}

		public GraphQLField(
			String key, Map<String, Object> parameterMap,
			List<GraphQLField> graphQLFields) {

			_key = key;
			_parameterMap = parameterMap;
			_graphQLFields = graphQLFields;
		}

		@Override
		public String toString() {
			StringBuilder sb = new StringBuilder(_key);

			if (!_parameterMap.isEmpty()) {
				sb.append("(");

				for (Map.Entry<String, Object> entry :
						_parameterMap.entrySet()) {

					sb.append(entry.getKey());
					sb.append(": ");
					sb.append(entry.getValue());
					sb.append(", ");
				}

				sb.setLength(sb.length() - 2);

				sb.append(")");
			}

			if (!_graphQLFields.isEmpty()) {
				sb.append("{");

				for (GraphQLField graphQLField : _graphQLFields) {
					sb.append(graphQLField.toString());
					sb.append(", ");
				}

				sb.setLength(sb.length() - 2);

				sb.append("}");
			}

			return sb.toString();
		}

		private final List<GraphQLField> _graphQLFields;
		private final String _key;
		private final Map<String, Object> _parameterMap;

	}

	private static final com.liferay.portal.kernel.log.Log _log =
		LogFactoryUtil.getLog(BaseEditalEntityResourceTestCase.class);

	private static Format _format;

	private com.liferay.portal.kernel.model.User _testCompanyAdminUser;

	@Inject
	private
		br.com.seatecnologia.gdf.negocia.headless.resource.v1_0.
			EditalEntityResource _editalEntityResource;

}
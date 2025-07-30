package br.com.seatecnologia.gdf.negocia.headless.resource.v1_0.test;

import br.com.seatecnologia.gdf.negocia.headless.client.dto.v1_0.PropostaEntity;
import br.com.seatecnologia.gdf.negocia.headless.client.http.HttpInvoker;
import br.com.seatecnologia.gdf.negocia.headless.client.pagination.Page;
import br.com.seatecnologia.gdf.negocia.headless.client.resource.v1_0.PropostaEntityResource;
import br.com.seatecnologia.gdf.negocia.headless.client.serdes.v1_0.PropostaEntitySerDes;

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
public abstract class BasePropostaEntityResourceTestCase {

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

		_propostaEntityResource.setContextCompany(testCompany);

		_testCompanyAdminUser = UserTestUtil.getAdminUser(
			testCompany.getCompanyId());

		propostaEntityResource = PropostaEntityResource.builder(
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

		PropostaEntity propostaEntity1 = randomPropostaEntity();

		String json = objectMapper.writeValueAsString(propostaEntity1);

		PropostaEntity propostaEntity2 = PropostaEntitySerDes.toDTO(json);

		Assert.assertTrue(equals(propostaEntity1, propostaEntity2));
	}

	@Test
	public void testClientSerDesToJSON() throws Exception {
		ObjectMapper objectMapper = getClientSerDesObjectMapper();

		PropostaEntity propostaEntity = randomPropostaEntity();

		String json1 = objectMapper.writeValueAsString(propostaEntity);
		String json2 = PropostaEntitySerDes.toJSON(propostaEntity);

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

		PropostaEntity propostaEntity = randomPropostaEntity();

		propostaEntity.setCreateUser(regex);
		propostaEntity.setNumeroProtocoloSEI(regex);
		propostaEntity.setProtocolo(regex);
		propostaEntity.setStatus(regex);
		propostaEntity.setTipoProposta(regex);
		propostaEntity.setZipUrl(regex);

		String json = PropostaEntitySerDes.toJSON(propostaEntity);

		Assert.assertFalse(json.contains(regex));

		propostaEntity = PropostaEntitySerDes.toDTO(json);

		Assert.assertEquals(regex, propostaEntity.getCreateUser());
		Assert.assertEquals(regex, propostaEntity.getNumeroProtocoloSEI());
		Assert.assertEquals(regex, propostaEntity.getProtocolo());
		Assert.assertEquals(regex, propostaEntity.getStatus());
		Assert.assertEquals(regex, propostaEntity.getTipoProposta());
		Assert.assertEquals(regex, propostaEntity.getZipUrl());
	}

	@Test
	public void testGetProposta() throws Exception {
		Assert.assertTrue(false);
	}

	@Test
	public void testGraphQLGetProposta() throws Exception {
		Assert.assertTrue(true);
	}

	@Test
	public void testGraphQLGetPropostaNotFound() throws Exception {
		Assert.assertTrue(true);
	}

	@Test
	public void testGetPropostasPage() throws Exception {
		Assert.assertTrue(false);
	}

	@Test
	public void testPostProposta() throws Exception {
		PropostaEntity randomPropostaEntity = randomPropostaEntity();

		PropostaEntity postPropostaEntity = testPostProposta_addPropostaEntity(
			randomPropostaEntity);

		assertEquals(randomPropostaEntity, postPropostaEntity);
		assertValid(postPropostaEntity);
	}

	protected PropostaEntity testPostProposta_addPropostaEntity(
			PropostaEntity propostaEntity)
		throws Exception {

		throw new UnsupportedOperationException(
			"This method needs to be implemented");
	}

	protected void assertContains(
		PropostaEntity propostaEntity, List<PropostaEntity> propostaEntities) {

		boolean contains = false;

		for (PropostaEntity item : propostaEntities) {
			if (equals(propostaEntity, item)) {
				contains = true;

				break;
			}
		}

		Assert.assertTrue(
			propostaEntities + " does not contain " + propostaEntity, contains);
	}

	protected void assertHttpResponseStatusCode(
		int expectedHttpResponseStatusCode,
		HttpInvoker.HttpResponse actualHttpResponse) {

		Assert.assertEquals(
			expectedHttpResponseStatusCode, actualHttpResponse.getStatusCode());
	}

	protected void assertEquals(
		PropostaEntity propostaEntity1, PropostaEntity propostaEntity2) {

		Assert.assertTrue(
			propostaEntity1 + " does not equal " + propostaEntity2,
			equals(propostaEntity1, propostaEntity2));
	}

	protected void assertEquals(
		List<PropostaEntity> propostaEntities1,
		List<PropostaEntity> propostaEntities2) {

		Assert.assertEquals(propostaEntities1.size(), propostaEntities2.size());

		for (int i = 0; i < propostaEntities1.size(); i++) {
			PropostaEntity propostaEntity1 = propostaEntities1.get(i);
			PropostaEntity propostaEntity2 = propostaEntities2.get(i);

			assertEquals(propostaEntity1, propostaEntity2);
		}
	}

	protected void assertEqualsIgnoringOrder(
		List<PropostaEntity> propostaEntities1,
		List<PropostaEntity> propostaEntities2) {

		Assert.assertEquals(propostaEntities1.size(), propostaEntities2.size());

		for (PropostaEntity propostaEntity1 : propostaEntities1) {
			boolean contains = false;

			for (PropostaEntity propostaEntity2 : propostaEntities2) {
				if (equals(propostaEntity1, propostaEntity2)) {
					contains = true;

					break;
				}
			}

			Assert.assertTrue(
				propostaEntities2 + " does not contain " + propostaEntity1,
				contains);
		}
	}

	protected void assertValid(PropostaEntity propostaEntity) throws Exception {
		boolean valid = true;

		for (String additionalAssertFieldName :
				getAdditionalAssertFieldNames()) {

			if (Objects.equals(
					"acoesJudiciaisEntities", additionalAssertFieldName)) {

				if (propostaEntity.getAcoesJudiciaisEntities() == null) {
					valid = false;
				}

				continue;
			}

			if (Objects.equals(
					"administradorJudicial", additionalAssertFieldName)) {

				if (propostaEntity.getAdministradorJudicial() == null) {
					valid = false;
				}

				continue;
			}

			if (Objects.equals("advogado", additionalAssertFieldName)) {
				if (propostaEntity.getAdvogado() == null) {
					valid = false;
				}

				continue;
			}

			if (Objects.equals(
					"bensDireitosRequerenteEntities",
					additionalAssertFieldName)) {

				if (propostaEntity.getBensDireitosRequerenteEntities() ==
						null) {

					valid = false;
				}

				continue;
			}

			if (Objects.equals("createDate", additionalAssertFieldName)) {
				if (propostaEntity.getCreateDate() == null) {
					valid = false;
				}

				continue;
			}

			if (Objects.equals("createUser", additionalAssertFieldName)) {
				if (propostaEntity.getCreateUser() == null) {
					valid = false;
				}

				continue;
			}

			if (Objects.equals(
					"dadosContribuinte", additionalAssertFieldName)) {

				if (propostaEntity.getDadosContribuinte() == null) {
					valid = false;
				}

				continue;
			}

			if (Objects.equals("declaracao", additionalAssertFieldName)) {
				if (propostaEntity.getDeclaracao() == null) {
					valid = false;
				}

				continue;
			}

			if (Objects.equals(
					"demonstracoesContabeisEntities",
					additionalAssertFieldName)) {

				if (propostaEntity.getDemonstracoesContabeisEntities() ==
						null) {

					valid = false;
				}

				continue;
			}

			if (Objects.equals("editalId", additionalAssertFieldName)) {
				if (propostaEntity.getEditalId() == null) {
					valid = false;
				}

				continue;
			}

			if (Objects.equals(
					"fundamentacaoPedido", additionalAssertFieldName)) {

				if (propostaEntity.getFundamentacaoPedido() == null) {
					valid = false;
				}

				continue;
			}

			if (Objects.equals("garantiaEntity", additionalAssertFieldName)) {
				if (propostaEntity.getGarantiaEntity() == null) {
					valid = false;
				}

				continue;
			}

			if (Objects.equals("modifiedDate", additionalAssertFieldName)) {
				if (propostaEntity.getModifiedDate() == null) {
					valid = false;
				}

				continue;
			}

			if (Objects.equals(
					"numeroProtocoloSEI", additionalAssertFieldName)) {

				if (propostaEntity.getNumeroProtocoloSEI() == null) {
					valid = false;
				}

				continue;
			}

			if (Objects.equals("procuracao", additionalAssertFieldName)) {
				if (propostaEntity.getProcuracao() == null) {
					valid = false;
				}

				continue;
			}

			if (Objects.equals("propostaId", additionalAssertFieldName)) {
				if (propostaEntity.getPropostaId() == null) {
					valid = false;
				}

				continue;
			}

			if (Objects.equals("propostaPaiId", additionalAssertFieldName)) {
				if (propostaEntity.getPropostaPaiId() == null) {
					valid = false;
				}

				continue;
			}

			if (Objects.equals("protocolo", additionalAssertFieldName)) {
				if (propostaEntity.getProtocolo() == null) {
					valid = false;
				}

				continue;
			}

			if (Objects.equals(
					"relacaoCredoresEntities", additionalAssertFieldName)) {

				if (propostaEntity.getRelacaoCredoresEntities() == null) {
					valid = false;
				}

				continue;
			}

			if (Objects.equals("status", additionalAssertFieldName)) {
				if (propostaEntity.getStatus() == null) {
					valid = false;
				}

				continue;
			}

			if (Objects.equals("tipoProposta", additionalAssertFieldName)) {
				if (propostaEntity.getTipoProposta() == null) {
					valid = false;
				}

				continue;
			}

			if (Objects.equals("zipUrl", additionalAssertFieldName)) {
				if (propostaEntity.getZipUrl() == null) {
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

	protected void assertValid(Page<PropostaEntity> page) {
		assertValid(page, Collections.emptyMap());
	}

	protected void assertValid(
		Page<PropostaEntity> page,
		Map<String, Map<String, String>> expectedActions) {

		boolean valid = false;

		java.util.Collection<PropostaEntity> propostaEntities = page.getItems();

		int size = propostaEntities.size();

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

	protected String[] getAdditionalAssertFieldNames() {
		return new String[0];
	}

	protected List<GraphQLField> getGraphQLFields() throws Exception {
		List<GraphQLField> graphQLFields = new ArrayList<>();

		for (java.lang.reflect.Field field :
				getDeclaredFields(
					br.com.seatecnologia.gdf.negocia.headless.dto.v1_0.
						PropostaEntity.class)) {

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
		PropostaEntity propostaEntity1, PropostaEntity propostaEntity2) {

		if (propostaEntity1 == propostaEntity2) {
			return true;
		}

		for (String additionalAssertFieldName :
				getAdditionalAssertFieldNames()) {

			if (Objects.equals(
					"acoesJudiciaisEntities", additionalAssertFieldName)) {

				if (!Objects.deepEquals(
						propostaEntity1.getAcoesJudiciaisEntities(),
						propostaEntity2.getAcoesJudiciaisEntities())) {

					return false;
				}

				continue;
			}

			if (Objects.equals(
					"administradorJudicial", additionalAssertFieldName)) {

				if (!Objects.deepEquals(
						propostaEntity1.getAdministradorJudicial(),
						propostaEntity2.getAdministradorJudicial())) {

					return false;
				}

				continue;
			}

			if (Objects.equals("advogado", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						propostaEntity1.getAdvogado(),
						propostaEntity2.getAdvogado())) {

					return false;
				}

				continue;
			}

			if (Objects.equals(
					"bensDireitosRequerenteEntities",
					additionalAssertFieldName)) {

				if (!Objects.deepEquals(
						propostaEntity1.getBensDireitosRequerenteEntities(),
						propostaEntity2.getBensDireitosRequerenteEntities())) {

					return false;
				}

				continue;
			}

			if (Objects.equals("createDate", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						propostaEntity1.getCreateDate(),
						propostaEntity2.getCreateDate())) {

					return false;
				}

				continue;
			}

			if (Objects.equals("createUser", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						propostaEntity1.getCreateUser(),
						propostaEntity2.getCreateUser())) {

					return false;
				}

				continue;
			}

			if (Objects.equals(
					"dadosContribuinte", additionalAssertFieldName)) {

				if (!Objects.deepEquals(
						propostaEntity1.getDadosContribuinte(),
						propostaEntity2.getDadosContribuinte())) {

					return false;
				}

				continue;
			}

			if (Objects.equals("declaracao", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						propostaEntity1.getDeclaracao(),
						propostaEntity2.getDeclaracao())) {

					return false;
				}

				continue;
			}

			if (Objects.equals(
					"demonstracoesContabeisEntities",
					additionalAssertFieldName)) {

				if (!Objects.deepEquals(
						propostaEntity1.getDemonstracoesContabeisEntities(),
						propostaEntity2.getDemonstracoesContabeisEntities())) {

					return false;
				}

				continue;
			}

			if (Objects.equals("editalId", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						propostaEntity1.getEditalId(),
						propostaEntity2.getEditalId())) {

					return false;
				}

				continue;
			}

			if (Objects.equals(
					"fundamentacaoPedido", additionalAssertFieldName)) {

				if (!Objects.deepEquals(
						propostaEntity1.getFundamentacaoPedido(),
						propostaEntity2.getFundamentacaoPedido())) {

					return false;
				}

				continue;
			}

			if (Objects.equals("garantiaEntity", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						propostaEntity1.getGarantiaEntity(),
						propostaEntity2.getGarantiaEntity())) {

					return false;
				}

				continue;
			}

			if (Objects.equals("modifiedDate", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						propostaEntity1.getModifiedDate(),
						propostaEntity2.getModifiedDate())) {

					return false;
				}

				continue;
			}

			if (Objects.equals(
					"numeroProtocoloSEI", additionalAssertFieldName)) {

				if (!Objects.deepEquals(
						propostaEntity1.getNumeroProtocoloSEI(),
						propostaEntity2.getNumeroProtocoloSEI())) {

					return false;
				}

				continue;
			}

			if (Objects.equals("procuracao", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						propostaEntity1.getProcuracao(),
						propostaEntity2.getProcuracao())) {

					return false;
				}

				continue;
			}

			if (Objects.equals("propostaId", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						propostaEntity1.getPropostaId(),
						propostaEntity2.getPropostaId())) {

					return false;
				}

				continue;
			}

			if (Objects.equals("propostaPaiId", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						propostaEntity1.getPropostaPaiId(),
						propostaEntity2.getPropostaPaiId())) {

					return false;
				}

				continue;
			}

			if (Objects.equals("protocolo", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						propostaEntity1.getProtocolo(),
						propostaEntity2.getProtocolo())) {

					return false;
				}

				continue;
			}

			if (Objects.equals(
					"relacaoCredoresEntities", additionalAssertFieldName)) {

				if (!Objects.deepEquals(
						propostaEntity1.getRelacaoCredoresEntities(),
						propostaEntity2.getRelacaoCredoresEntities())) {

					return false;
				}

				continue;
			}

			if (Objects.equals("status", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						propostaEntity1.getStatus(),
						propostaEntity2.getStatus())) {

					return false;
				}

				continue;
			}

			if (Objects.equals("tipoProposta", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						propostaEntity1.getTipoProposta(),
						propostaEntity2.getTipoProposta())) {

					return false;
				}

				continue;
			}

			if (Objects.equals("zipUrl", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						propostaEntity1.getZipUrl(),
						propostaEntity2.getZipUrl())) {

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

		if (!(_propostaEntityResource instanceof EntityModelResource)) {
			throw new UnsupportedOperationException(
				"Resource is not an instance of EntityModelResource");
		}

		EntityModelResource entityModelResource =
			(EntityModelResource)_propostaEntityResource;

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
		EntityField entityField, String operator,
		PropostaEntity propostaEntity) {

		StringBundler sb = new StringBundler();

		String entityFieldName = entityField.getName();

		sb.append(entityFieldName);

		sb.append(" ");
		sb.append(operator);
		sb.append(" ");

		if (entityFieldName.equals("acoesJudiciaisEntities")) {
			throw new IllegalArgumentException(
				"Invalid entity field " + entityFieldName);
		}

		if (entityFieldName.equals("administradorJudicial")) {
			throw new IllegalArgumentException(
				"Invalid entity field " + entityFieldName);
		}

		if (entityFieldName.equals("advogado")) {
			throw new IllegalArgumentException(
				"Invalid entity field " + entityFieldName);
		}

		if (entityFieldName.equals("bensDireitosRequerenteEntities")) {
			throw new IllegalArgumentException(
				"Invalid entity field " + entityFieldName);
		}

		if (entityFieldName.equals("createDate")) {
			if (operator.equals("between")) {
				Date date = propostaEntity.getCreateDate();

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

				sb.append(_format.format(propostaEntity.getCreateDate()));
			}

			return sb.toString();
		}

		if (entityFieldName.equals("createUser")) {
			Object object = propostaEntity.getCreateUser();

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

		if (entityFieldName.equals("dadosContribuinte")) {
			throw new IllegalArgumentException(
				"Invalid entity field " + entityFieldName);
		}

		if (entityFieldName.equals("declaracao")) {
			throw new IllegalArgumentException(
				"Invalid entity field " + entityFieldName);
		}

		if (entityFieldName.equals("demonstracoesContabeisEntities")) {
			throw new IllegalArgumentException(
				"Invalid entity field " + entityFieldName);
		}

		if (entityFieldName.equals("editalId")) {
			throw new IllegalArgumentException(
				"Invalid entity field " + entityFieldName);
		}

		if (entityFieldName.equals("fundamentacaoPedido")) {
			throw new IllegalArgumentException(
				"Invalid entity field " + entityFieldName);
		}

		if (entityFieldName.equals("garantiaEntity")) {
			throw new IllegalArgumentException(
				"Invalid entity field " + entityFieldName);
		}

		if (entityFieldName.equals("modifiedDate")) {
			if (operator.equals("between")) {
				Date date = propostaEntity.getModifiedDate();

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

				sb.append(_format.format(propostaEntity.getModifiedDate()));
			}

			return sb.toString();
		}

		if (entityFieldName.equals("numeroProtocoloSEI")) {
			Object object = propostaEntity.getNumeroProtocoloSEI();

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

		if (entityFieldName.equals("procuracao")) {
			throw new IllegalArgumentException(
				"Invalid entity field " + entityFieldName);
		}

		if (entityFieldName.equals("propostaId")) {
			throw new IllegalArgumentException(
				"Invalid entity field " + entityFieldName);
		}

		if (entityFieldName.equals("propostaPaiId")) {
			throw new IllegalArgumentException(
				"Invalid entity field " + entityFieldName);
		}

		if (entityFieldName.equals("protocolo")) {
			Object object = propostaEntity.getProtocolo();

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

		if (entityFieldName.equals("relacaoCredoresEntities")) {
			throw new IllegalArgumentException(
				"Invalid entity field " + entityFieldName);
		}

		if (entityFieldName.equals("status")) {
			Object object = propostaEntity.getStatus();

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

		if (entityFieldName.equals("tipoProposta")) {
			Object object = propostaEntity.getTipoProposta();

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

		if (entityFieldName.equals("zipUrl")) {
			Object object = propostaEntity.getZipUrl();

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

	protected PropostaEntity randomPropostaEntity() throws Exception {
		return new PropostaEntity() {
			{
				createDate = RandomTestUtil.nextDate();
				createUser = StringUtil.toLowerCase(
					RandomTestUtil.randomString());
				editalId = RandomTestUtil.randomLong();
				modifiedDate = RandomTestUtil.nextDate();
				numeroProtocoloSEI = StringUtil.toLowerCase(
					RandomTestUtil.randomString());
				propostaId = RandomTestUtil.randomLong();
				propostaPaiId = RandomTestUtil.randomLong();
				protocolo = StringUtil.toLowerCase(
					RandomTestUtil.randomString());
				status = StringUtil.toLowerCase(RandomTestUtil.randomString());
				tipoProposta = StringUtil.toLowerCase(
					RandomTestUtil.randomString());
				zipUrl = StringUtil.toLowerCase(RandomTestUtil.randomString());
			}
		};
	}

	protected PropostaEntity randomIrrelevantPropostaEntity() throws Exception {
		PropostaEntity randomIrrelevantPropostaEntity = randomPropostaEntity();

		return randomIrrelevantPropostaEntity;
	}

	protected PropostaEntity randomPatchPropostaEntity() throws Exception {
		return randomPropostaEntity();
	}

	protected PropostaEntityResource propostaEntityResource;
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
		LogFactoryUtil.getLog(BasePropostaEntityResourceTestCase.class);

	private static Format _format;

	private com.liferay.portal.kernel.model.User _testCompanyAdminUser;

	@Inject
	private br.com.seatecnologia.gdf.negocia.headless.resource.v1_0.
		PropostaEntityResource _propostaEntityResource;

}
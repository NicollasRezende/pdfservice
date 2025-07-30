package br.com.seatecnologia.gdf.negocia.headless.internal.graphql.query.v1_0;

import br.com.seatecnologia.gdf.negocia.headless.dto.v1_0.EditalEntity;
import br.com.seatecnologia.gdf.negocia.headless.dto.v1_0.MetadadosFormulario;
import br.com.seatecnologia.gdf.negocia.headless.dto.v1_0.PropostaEntity;
import br.com.seatecnologia.gdf.negocia.headless.dto.v1_0.PropostaZipEntity;
import br.com.seatecnologia.gdf.negocia.headless.dto.v1_0.UsuarioInfo;
import br.com.seatecnologia.gdf.negocia.headless.resource.v1_0.EditalEntityResource;
import br.com.seatecnologia.gdf.negocia.headless.resource.v1_0.PropostaEntityResource;
import br.com.seatecnologia.gdf.negocia.headless.resource.v1_0.PropostaZipEntityResource;
import br.com.seatecnologia.gdf.negocia.headless.resource.v1_0.UsuarioInfoResource;

import com.liferay.petra.function.UnsafeConsumer;
import com.liferay.petra.function.UnsafeFunction;
import com.liferay.portal.kernel.service.GroupLocalService;
import com.liferay.portal.kernel.service.RoleLocalService;
import com.liferay.portal.vulcan.accept.language.AcceptLanguage;
import com.liferay.portal.vulcan.graphql.annotation.GraphQLField;
import com.liferay.portal.vulcan.graphql.annotation.GraphQLName;
import com.liferay.portal.vulcan.graphql.annotation.GraphQLTypeExtension;
import com.liferay.portal.vulcan.pagination.Page;
import com.liferay.portal.vulcan.pagination.Pagination;

import java.util.Map;
import java.util.function.BiFunction;

import javax.annotation.Generated;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.ws.rs.core.UriInfo;

import org.osgi.service.component.ComponentServiceObjects;

/**
 * @author sabrina
 * @generated
 */
@Generated("")
public class Query {

	public static void setEditalEntityResourceComponentServiceObjects(
		ComponentServiceObjects<EditalEntityResource>
			editalEntityResourceComponentServiceObjects) {

		_editalEntityResourceComponentServiceObjects =
			editalEntityResourceComponentServiceObjects;
	}

	public static void setPropostaEntityResourceComponentServiceObjects(
		ComponentServiceObjects<PropostaEntityResource>
			propostaEntityResourceComponentServiceObjects) {

		_propostaEntityResourceComponentServiceObjects =
			propostaEntityResourceComponentServiceObjects;
	}

	public static void setPropostaZipEntityResourceComponentServiceObjects(
		ComponentServiceObjects<PropostaZipEntityResource>
			propostaZipEntityResourceComponentServiceObjects) {

		_propostaZipEntityResourceComponentServiceObjects =
			propostaZipEntityResourceComponentServiceObjects;
	}

	public static void setUsuarioInfoResourceComponentServiceObjects(
		ComponentServiceObjects<UsuarioInfoResource>
			usuarioInfoResourceComponentServiceObjects) {

		_usuarioInfoResourceComponentServiceObjects =
			usuarioInfoResourceComponentServiceObjects;
	}

	/**
	 * Invoke this method with the command line:
	 *
	 * curl -H 'Content-Type: text/plain; charset=utf-8' -X 'POST' 'http://localhost:8080/o/graphql' -d $'{"query": "query {metadados{editalEntities, dlFolderId}}"}' -u 'test@liferay.com:test'
	 */
	@GraphQLField
	public MetadadosFormulario metadados() throws Exception {
		return _applyComponentServiceObjects(
			_editalEntityResourceComponentServiceObjects,
			this::_populateResourceContext,
			editalEntityResource -> editalEntityResource.getMetadados());
	}

	/**
	 * Invoke this method with the command line:
	 *
	 * curl -H 'Content-Type: text/plain; charset=utf-8' -X 'POST' 'http://localhost:8080/o/graphql' -d $'{"query": "query {proposta(propostaId: ___){propostaId, createDate, modifiedDate, createUser, zipUrl, fundamentacaoPedido, declaracao, protocolo, numeroProtocoloSEI, editalId, tipoProposta, propostaPaiId, status, dadosContribuinte, administradorJudicial, advogado, procuracao, garantiaEntity, acoesJudiciaisEntities, demonstracoesContabeisEntities, relacaoCredoresEntities, bensDireitosRequerenteEntities}}"}' -u 'test@liferay.com:test'
	 */
	@GraphQLField
	public PropostaEntity proposta(@GraphQLName("propostaId") Long propostaId)
		throws Exception {

		return _applyComponentServiceObjects(
			_propostaEntityResourceComponentServiceObjects,
			this::_populateResourceContext,
			propostaEntityResource -> propostaEntityResource.getProposta(
				propostaId));
	}

	/**
	 * Invoke this method with the command line:
	 *
	 * curl -H 'Content-Type: text/plain; charset=utf-8' -X 'POST' 'http://localhost:8080/o/graphql' -d $'{"query": "query {propostasPage(filter: ___, page: ___, pageSize: ___, sorts: ___){}}"}' -u 'test@liferay.com:test'
	 */
	@GraphQLField
	public Object propostasPage(
			@GraphQLName("filter") String filterString,
			@GraphQLName("pageSize") int pageSize,
			@GraphQLName("page") int page,
			@GraphQLName("sort") String sortsString)
		throws Exception {

		return _applyComponentServiceObjects(
			_propostaEntityResourceComponentServiceObjects,
			this::_populateResourceContext,
			propostaEntityResource -> propostaEntityResource.getPropostasPage(
				_filterBiFunction.apply(propostaEntityResource, filterString),
				Pagination.of(page, pageSize),
				_sortsBiFunction.apply(propostaEntityResource, sortsString)));
	}

	/**
	 * Invoke this method with the command line:
	 *
	 * curl -H 'Content-Type: text/plain; charset=utf-8' -X 'POST' 'http://localhost:8080/o/graphql' -d $'{"query": "query {propostaZip(propostaId: ___){urlZip, propostaId, statusProposta}}"}' -u 'test@liferay.com:test'
	 */
	@GraphQLField
	public PropostaZipEntity propostaZip(
			@GraphQLName("propostaId") Long propostaId)
		throws Exception {

		return _applyComponentServiceObjects(
			_propostaZipEntityResourceComponentServiceObjects,
			this::_populateResourceContext,
			propostaZipEntityResource ->
				propostaZipEntityResource.getPropostaZip(propostaId));
	}

	/**
	 * Invoke this method with the command line:
	 *
	 * curl -H 'Content-Type: text/plain; charset=utf-8' -X 'POST' 'http://localhost:8080/o/graphql' -d $'{"query": "query {usuarioInfo{tipoLogin, cpfcnpj}}"}' -u 'test@liferay.com:test'
	 */
	@GraphQLField
	public UsuarioInfo usuarioInfo() throws Exception {
		return _applyComponentServiceObjects(
			_usuarioInfoResourceComponentServiceObjects,
			this::_populateResourceContext,
			usuarioInfoResource -> usuarioInfoResource.getUsuarioInfo());
	}

	@GraphQLTypeExtension(PropostaZipEntity.class)
	public class GetPropostaTypeExtension {

		public GetPropostaTypeExtension(PropostaZipEntity propostaZipEntity) {
			_propostaZipEntity = propostaZipEntity;
		}

		@GraphQLField
		public PropostaEntity proposta() throws Exception {
			return _applyComponentServiceObjects(
				_propostaEntityResourceComponentServiceObjects,
				Query.this::_populateResourceContext,
				propostaEntityResource -> propostaEntityResource.getProposta(
					_propostaZipEntity.getPropostaId()));
		}

		private PropostaZipEntity _propostaZipEntity;

	}

	@GraphQLTypeExtension(PropostaEntity.class)
	public class GetPropostaZipTypeExtension {

		public GetPropostaZipTypeExtension(PropostaEntity propostaEntity) {
			_propostaEntity = propostaEntity;
		}

		@GraphQLField
		public PropostaZipEntity propostaZip() throws Exception {
			return _applyComponentServiceObjects(
				_propostaZipEntityResourceComponentServiceObjects,
				Query.this::_populateResourceContext,
				propostaZipEntityResource ->
					propostaZipEntityResource.getPropostaZip(
						_propostaEntity.getPropostaId()));
		}

		private PropostaEntity _propostaEntity;

	}

	@GraphQLName("EditalEntityPage")
	public class EditalEntityPage {

		public EditalEntityPage(Page editalEntityPage) {
			actions = editalEntityPage.getActions();

			items = editalEntityPage.getItems();
			lastPage = editalEntityPage.getLastPage();
			page = editalEntityPage.getPage();
			pageSize = editalEntityPage.getPageSize();
			totalCount = editalEntityPage.getTotalCount();
		}

		@GraphQLField
		protected Map<String, Map<String, String>> actions;

		@GraphQLField
		protected java.util.Collection<EditalEntity> items;

		@GraphQLField
		protected long lastPage;

		@GraphQLField
		protected long page;

		@GraphQLField
		protected long pageSize;

		@GraphQLField
		protected long totalCount;

	}

	@GraphQLName("PropostaEntityPage")
	public class PropostaEntityPage {

		public PropostaEntityPage(Page propostaEntityPage) {
			actions = propostaEntityPage.getActions();

			items = propostaEntityPage.getItems();
			lastPage = propostaEntityPage.getLastPage();
			page = propostaEntityPage.getPage();
			pageSize = propostaEntityPage.getPageSize();
			totalCount = propostaEntityPage.getTotalCount();
		}

		@GraphQLField
		protected Map<String, Map<String, String>> actions;

		@GraphQLField
		protected java.util.Collection<PropostaEntity> items;

		@GraphQLField
		protected long lastPage;

		@GraphQLField
		protected long page;

		@GraphQLField
		protected long pageSize;

		@GraphQLField
		protected long totalCount;

	}

	@GraphQLName("PropostaZipEntityPage")
	public class PropostaZipEntityPage {

		public PropostaZipEntityPage(Page propostaZipEntityPage) {
			actions = propostaZipEntityPage.getActions();

			items = propostaZipEntityPage.getItems();
			lastPage = propostaZipEntityPage.getLastPage();
			page = propostaZipEntityPage.getPage();
			pageSize = propostaZipEntityPage.getPageSize();
			totalCount = propostaZipEntityPage.getTotalCount();
		}

		@GraphQLField
		protected Map<String, Map<String, String>> actions;

		@GraphQLField
		protected java.util.Collection<PropostaZipEntity> items;

		@GraphQLField
		protected long lastPage;

		@GraphQLField
		protected long page;

		@GraphQLField
		protected long pageSize;

		@GraphQLField
		protected long totalCount;

	}

	@GraphQLName("UsuarioInfoPage")
	public class UsuarioInfoPage {

		public UsuarioInfoPage(Page usuarioInfoPage) {
			actions = usuarioInfoPage.getActions();

			items = usuarioInfoPage.getItems();
			lastPage = usuarioInfoPage.getLastPage();
			page = usuarioInfoPage.getPage();
			pageSize = usuarioInfoPage.getPageSize();
			totalCount = usuarioInfoPage.getTotalCount();
		}

		@GraphQLField
		protected Map<String, Map<String, String>> actions;

		@GraphQLField
		protected java.util.Collection<UsuarioInfo> items;

		@GraphQLField
		protected long lastPage;

		@GraphQLField
		protected long page;

		@GraphQLField
		protected long pageSize;

		@GraphQLField
		protected long totalCount;

	}

	private <T, R, E1 extends Throwable, E2 extends Throwable> R
			_applyComponentServiceObjects(
				ComponentServiceObjects<T> componentServiceObjects,
				UnsafeConsumer<T, E1> unsafeConsumer,
				UnsafeFunction<T, R, E2> unsafeFunction)
		throws E1, E2 {

		T resource = componentServiceObjects.getService();

		try {
			unsafeConsumer.accept(resource);

			return unsafeFunction.apply(resource);
		}
		finally {
			componentServiceObjects.ungetService(resource);
		}
	}

	private void _populateResourceContext(
			EditalEntityResource editalEntityResource)
		throws Exception {

		editalEntityResource.setContextAcceptLanguage(_acceptLanguage);
		editalEntityResource.setContextCompany(_company);
		editalEntityResource.setContextHttpServletRequest(_httpServletRequest);
		editalEntityResource.setContextHttpServletResponse(
			_httpServletResponse);
		editalEntityResource.setContextUriInfo(_uriInfo);
		editalEntityResource.setContextUser(_user);
		editalEntityResource.setGroupLocalService(_groupLocalService);
		editalEntityResource.setRoleLocalService(_roleLocalService);
	}

	private void _populateResourceContext(
			PropostaEntityResource propostaEntityResource)
		throws Exception {

		propostaEntityResource.setContextAcceptLanguage(_acceptLanguage);
		propostaEntityResource.setContextCompany(_company);
		propostaEntityResource.setContextHttpServletRequest(
			_httpServletRequest);
		propostaEntityResource.setContextHttpServletResponse(
			_httpServletResponse);
		propostaEntityResource.setContextUriInfo(_uriInfo);
		propostaEntityResource.setContextUser(_user);
		propostaEntityResource.setGroupLocalService(_groupLocalService);
		propostaEntityResource.setRoleLocalService(_roleLocalService);
	}

	private void _populateResourceContext(
			PropostaZipEntityResource propostaZipEntityResource)
		throws Exception {

		propostaZipEntityResource.setContextAcceptLanguage(_acceptLanguage);
		propostaZipEntityResource.setContextCompany(_company);
		propostaZipEntityResource.setContextHttpServletRequest(
			_httpServletRequest);
		propostaZipEntityResource.setContextHttpServletResponse(
			_httpServletResponse);
		propostaZipEntityResource.setContextUriInfo(_uriInfo);
		propostaZipEntityResource.setContextUser(_user);
		propostaZipEntityResource.setGroupLocalService(_groupLocalService);
		propostaZipEntityResource.setRoleLocalService(_roleLocalService);
	}

	private void _populateResourceContext(
			UsuarioInfoResource usuarioInfoResource)
		throws Exception {

		usuarioInfoResource.setContextAcceptLanguage(_acceptLanguage);
		usuarioInfoResource.setContextCompany(_company);
		usuarioInfoResource.setContextHttpServletRequest(_httpServletRequest);
		usuarioInfoResource.setContextHttpServletResponse(_httpServletResponse);
		usuarioInfoResource.setContextUriInfo(_uriInfo);
		usuarioInfoResource.setContextUser(_user);
		usuarioInfoResource.setGroupLocalService(_groupLocalService);
		usuarioInfoResource.setRoleLocalService(_roleLocalService);
	}

	private static ComponentServiceObjects<EditalEntityResource>
		_editalEntityResourceComponentServiceObjects;
	private static ComponentServiceObjects<PropostaEntityResource>
		_propostaEntityResourceComponentServiceObjects;
	private static ComponentServiceObjects<PropostaZipEntityResource>
		_propostaZipEntityResourceComponentServiceObjects;
	private static ComponentServiceObjects<UsuarioInfoResource>
		_usuarioInfoResourceComponentServiceObjects;

	private AcceptLanguage _acceptLanguage;
	private com.liferay.portal.kernel.model.Company _company;
	private BiFunction
		<Object, String, com.liferay.portal.kernel.search.filter.Filter>
			_filterBiFunction;
	private GroupLocalService _groupLocalService;
	private HttpServletRequest _httpServletRequest;
	private HttpServletResponse _httpServletResponse;
	private RoleLocalService _roleLocalService;
	private BiFunction<Object, String, com.liferay.portal.kernel.search.Sort[]>
		_sortsBiFunction;
	private UriInfo _uriInfo;
	private com.liferay.portal.kernel.model.User _user;

}
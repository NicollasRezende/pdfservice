package br.com.seatecnologia.gdf.negocia.headless.internal.graphql.servlet.v1_0;

import br.com.seatecnologia.gdf.negocia.headless.internal.graphql.mutation.v1_0.Mutation;
import br.com.seatecnologia.gdf.negocia.headless.internal.graphql.query.v1_0.Query;
import br.com.seatecnologia.gdf.negocia.headless.internal.resource.v1_0.EditalEntityResourceImpl;
import br.com.seatecnologia.gdf.negocia.headless.internal.resource.v1_0.PropostaEntityResourceImpl;
import br.com.seatecnologia.gdf.negocia.headless.internal.resource.v1_0.PropostaZipEntityResourceImpl;
import br.com.seatecnologia.gdf.negocia.headless.internal.resource.v1_0.UsuarioInfoResourceImpl;
import br.com.seatecnologia.gdf.negocia.headless.resource.v1_0.EditalEntityResource;
import br.com.seatecnologia.gdf.negocia.headless.resource.v1_0.PropostaEntityResource;
import br.com.seatecnologia.gdf.negocia.headless.resource.v1_0.PropostaZipEntityResource;
import br.com.seatecnologia.gdf.negocia.headless.resource.v1_0.UsuarioInfoResource;

import com.liferay.portal.kernel.util.ObjectValuePair;
import com.liferay.portal.vulcan.graphql.servlet.ServletData;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Generated;

import org.osgi.framework.BundleContext;
import org.osgi.service.component.ComponentServiceObjects;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceScope;

/**
 * @author sabrina
 * @generated
 */
@Component(service = ServletData.class)
@Generated("")
public class ServletDataImpl implements ServletData {

	@Activate
	public void activate(BundleContext bundleContext) {
		Mutation.setPropostaEntityResourceComponentServiceObjects(
			_propostaEntityResourceComponentServiceObjects);

		Query.setEditalEntityResourceComponentServiceObjects(
			_editalEntityResourceComponentServiceObjects);
		Query.setPropostaEntityResourceComponentServiceObjects(
			_propostaEntityResourceComponentServiceObjects);
		Query.setPropostaZipEntityResourceComponentServiceObjects(
			_propostaZipEntityResourceComponentServiceObjects);
		Query.setUsuarioInfoResourceComponentServiceObjects(
			_usuarioInfoResourceComponentServiceObjects);
	}

	public String getApplicationName() {
		return "NegociaDfHeadless";
	}

	@Override
	public Mutation getMutation() {
		return new Mutation();
	}

	@Override
	public String getPath() {
		return "/negocia-df-headless-graphql/v1_0";
	}

	@Override
	public Query getQuery() {
		return new Query();
	}

	public ObjectValuePair<Class<?>, String> getResourceMethodObjectValuePair(
		String methodName, boolean mutation) {

		if (mutation) {
			return _resourceMethodObjectValuePairs.get(
				"mutation#" + methodName);
		}

		return _resourceMethodObjectValuePairs.get("query#" + methodName);
	}

	private static final Map<String, ObjectValuePair<Class<?>, String>>
		_resourceMethodObjectValuePairs =
			new HashMap<String, ObjectValuePair<Class<?>, String>>() {
				{
					put(
						"mutation#createProposta",
						new ObjectValuePair<>(
							PropostaEntityResourceImpl.class, "postProposta"));

					put(
						"query#metadados",
						new ObjectValuePair<>(
							EditalEntityResourceImpl.class, "getMetadados"));
					put(
						"query#proposta",
						new ObjectValuePair<>(
							PropostaEntityResourceImpl.class, "getProposta"));
					put(
						"query#propostasPage",
						new ObjectValuePair<>(
							PropostaEntityResourceImpl.class,
							"getPropostasPage"));
					put(
						"query#propostaZip",
						new ObjectValuePair<>(
							PropostaZipEntityResourceImpl.class,
							"getPropostaZip"));
					put(
						"query#usuarioInfo",
						new ObjectValuePair<>(
							UsuarioInfoResourceImpl.class, "getUsuarioInfo"));

					put(
						"query#PropostaZipEntity.proposta",
						new ObjectValuePair<>(
							PropostaEntityResourceImpl.class, "getProposta"));
					put(
						"query#PropostaEntity.propostaZip",
						new ObjectValuePair<>(
							PropostaZipEntityResourceImpl.class,
							"getPropostaZip"));
				}
			};

	@Reference(scope = ReferenceScope.PROTOTYPE_REQUIRED)
	private ComponentServiceObjects<PropostaEntityResource>
		_propostaEntityResourceComponentServiceObjects;

	@Reference(scope = ReferenceScope.PROTOTYPE_REQUIRED)
	private ComponentServiceObjects<EditalEntityResource>
		_editalEntityResourceComponentServiceObjects;

	@Reference(scope = ReferenceScope.PROTOTYPE_REQUIRED)
	private ComponentServiceObjects<PropostaZipEntityResource>
		_propostaZipEntityResourceComponentServiceObjects;

	@Reference(scope = ReferenceScope.PROTOTYPE_REQUIRED)
	private ComponentServiceObjects<UsuarioInfoResource>
		_usuarioInfoResourceComponentServiceObjects;

}
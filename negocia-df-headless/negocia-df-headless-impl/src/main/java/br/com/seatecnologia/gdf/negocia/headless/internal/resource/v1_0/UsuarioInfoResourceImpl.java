package br.com.seatecnologia.gdf.negocia.headless.internal.resource.v1_0;

import br.com.seatecnologia.gdf.negocia.headless.dto.v1_0.UsuarioInfo;
import br.com.seatecnologia.gdf.negocia.headless.resource.v1_0.UsuarioInfoResource;

import br.com.seatecnologia.gdf.negocia.context.GovBrAuthContext;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ServiceScope;

import javax.ws.rs.BadRequestException;
import javax.ws.rs.NotAllowedException;

/**
 * @author sabrina
 */
@Component(
	properties = "OSGI-INF/liferay/rest/v1_0/usuario-info.properties",
	scope = ServiceScope.PROTOTYPE, service = UsuarioInfoResource.class
)
public class UsuarioInfoResourceImpl extends BaseUsuarioInfoResourceImpl {
	@Override
	public UsuarioInfo getUsuarioInfo() throws NotAllowedException {
		UsuarioInfo usuarioInfo = new UsuarioInfo();
		String cpfcnpjResolvido = _govBrAuthContext.getCpfCnpj(contextUser);

		if(cpfcnpjResolvido == null) {
			throw new BadRequestException("Usuário não logado ou com o campo personalizado não preenchido.");
		}

		String tipoLogin = cpfcnpjResolvido.length() == 11 ? "cpf" : "cnpj";

		usuarioInfo.setCpfcnpj(cpfcnpjResolvido);
		usuarioInfo.setTipoLogin(tipoLogin);

		return usuarioInfo;
	}


	@Reference
	GovBrAuthContext _govBrAuthContext;
}
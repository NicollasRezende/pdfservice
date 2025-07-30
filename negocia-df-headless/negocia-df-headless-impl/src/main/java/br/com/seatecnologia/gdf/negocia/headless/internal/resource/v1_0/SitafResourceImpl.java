package br.com.seatecnologia.gdf.negocia.headless.internal.resource.v1_0;

import br.com.seatecnologia.gdf.negocia.headless.dto.v1_0.DebitoSitafEntityDTO;
import br.com.seatecnologia.gdf.negocia.headless.dto.v1_0.IdentificadorCreditoEntityDTO;
import br.com.seatecnologia.gdf.negocia.headless.resource.v1_0.SitafResource;

import br.com.seatecnologia.gdf.negocia.sitaf.integration.model.DebitoSitaf;
import br.com.seatecnologia.gdf.negocia.sitaf.integration.service.SitafService;
import br.com.seatecnologia.gdf.negocia.context.GovBrAuthContext;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ServiceScope;

import javax.ws.rs.BadRequestException;

/**
 * @author bruno
 */
@Component(
	properties = "OSGI-INF/liferay/rest/v1_0/sitaf.properties",
	scope = ServiceScope.PROTOTYPE, service = SitafResource.class
)
public class SitafResourceImpl extends BaseSitafResourceImpl {
	@Override
	public DebitoSitafEntityDTO getDebito() {
		String cpfCnpj = _govBrAuthContext.getCpfCnpj(contextUser);
		if (cpfCnpj == null) {
			throw  new BadRequestException("Usuario sem CPF/CNPJ configurado");
		}
		return _convertToDebitoDTO(_sitafService.consultarDebitos(cpfCnpj));
	}

	private DebitoSitafEntityDTO _convertToDebitoDTO(DebitoSitaf debito) {

		DebitoSitafEntityDTO debitoDTO = new DebitoSitafEntityDTO();
		IdentificadorCreditoEntityDTO identificadorCreditoDTO = new IdentificadorCreditoEntityDTO();


		identificadorCreditoDTO.setNumeroDaGuia(debito.getIdentificadorCredito().getNumeroDaGuia());
		identificadorCreditoDTO.setRenavam(debito.getIdentificadorCredito().getRenavam());
		identificadorCreditoDTO.setNumeroDivida(debito.getIdentificadorCredito().getNumeroDivida());

		debitoDTO.setEstadoDebito(debito.getEstadoCredito().getDescricao());
		debitoDTO.setTipoDebito(debito.getTipoCredito().getDescricao());
		debitoDTO.setIdentificadorCredito(identificadorCreditoDTO);

		debitoDTO.setCodigoReceita(debito.getCodigoReceita());
		debitoDTO.setAnoExercicio(debito.getAnoExercicio());

		debitoDTO.setCodigoOrgaoGerador(debito.getCodigoOrgaoGerador());
		debitoDTO.setCodigoRatingDivida(debito.getCodigoRatingDivida().getCodigo());
		debitoDTO.setCodigoSituacaoDebito(debito.getCodigoSituacaoDebito().getCodigo());
		debitoDTO.setCodigoSituacaoDebito(debito.getCodigoSituacaoDebito().getCodigo());
		debitoDTO.setObservacao(debito.getObservacao());

		return debitoDTO;
	}

	@Reference
	private GovBrAuthContext _govBrAuthContext;
	@Reference
	private SitafService _sitafService;
}
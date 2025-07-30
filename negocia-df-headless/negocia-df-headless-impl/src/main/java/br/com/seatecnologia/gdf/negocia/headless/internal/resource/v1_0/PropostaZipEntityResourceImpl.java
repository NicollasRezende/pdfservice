package br.com.seatecnologia.gdf.negocia.headless.internal.resource.v1_0;

import br.com.seatecnologia.gdf.negocia.headless.dto.v1_0.PropostaEntity;
import br.com.seatecnologia.gdf.negocia.headless.dto.v1_0.PropostaZipEntity;
import br.com.seatecnologia.gdf.negocia.headless.resource.v1_0.PropostaZipEntityResource;

import br.com.seatecnologia.gdf.negocia.model.Proposta;
import br.com.seatecnologia.gdf.negocia.service.PropostaLocalService;
import br.com.seatecnologia.gdf.negocia.service.PropostaService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ServiceScope;

import javax.ws.rs.BadRequestException;
import javax.ws.rs.InternalServerErrorException;
import javax.ws.rs.PathParam;

/**
 * @author sabrina
 */
@Component(
	properties = "OSGI-INF/liferay/rest/v1_0/proposta-zip-entity.properties",
	scope = ServiceScope.PROTOTYPE, service = PropostaZipEntityResource.class
)
public class PropostaZipEntityResourceImpl

	extends BasePropostaZipEntityResourceImpl {

	@Override
	public PropostaZipEntity getPropostaZip(Long propostaId) throws Exception {
		try {
			Proposta proposta = _propostaService.getPropostaZip(propostaId);
			ServiceContext serviceContext = ServiceContextFactory.getInstance(PropostaZipEntity.class.getName(), contextHttpServletRequest);

			Proposta propostaAtualizada = _propostaLocalService.createPropostaCompleteZip(proposta.getPropostaId(), serviceContext);
			return toPropostaZipEntity(propostaAtualizada);

		} catch (PortalException p) {
			String msg = "Proposta não encontrada com o id" + propostaId + "Erro:" + p.getMessage();
			_log.error(msg, p);
			throw new BadRequestException(msg);
		} catch (Exception e) {
			String msg = "Erro ao gerar zip da proposta com o id " + propostaId + ": " + e.getMessage();
			_log.error(msg, e);
			throw new InternalServerErrorException(msg);
		}


    }

	private PropostaZipEntity toPropostaZipEntity(Proposta proposta) {
		PropostaZipEntity propostaZipEntity = new PropostaZipEntity();
		propostaZipEntity.setPropostaId(proposta.getPropostaId());
		propostaZipEntity.setUrlZip(proposta.getDocumentosCompletosURL());
		propostaZipEntity.setStatusProposta(proposta.getStatus());

		return propostaZipEntity;

	}

	private static final Log _log = LogFactoryUtil.getLog(PropostaZipEntityResource.class);

	@Reference
	private PropostaService _propostaService;

	@Reference
	private PropostaLocalService _propostaLocalService;


}
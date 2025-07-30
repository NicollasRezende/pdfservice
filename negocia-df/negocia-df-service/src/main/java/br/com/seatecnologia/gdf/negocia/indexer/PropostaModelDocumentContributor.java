package br.com.seatecnologia.gdf.negocia.indexer;


import br.com.seatecnologia.gdf.negocia.model.DadosContribuinte;
import br.com.seatecnologia.gdf.negocia.model.Proposta;
import br.com.seatecnologia.gdf.negocia.model.QualificacaoCompleta;
import br.com.seatecnologia.gdf.negocia.service.DadosContribuinteLocalService;
import br.com.seatecnologia.gdf.negocia.service.DadosContribuinteService;
import br.com.seatecnologia.gdf.negocia.service.QualificacaoCompletaLocalService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.search.Document;
import com.liferay.portal.kernel.search.DocumentHelper;
import com.liferay.portal.kernel.search.Field;
import com.liferay.portal.search.spi.model.index.contributor.ModelDocumentContributor;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(
        immediate = true,
        property = "indexer.class.name=br.com.seatecnologia.gdf.negocia.model.Proposta",
        service = ModelDocumentContributor.class
)
public class PropostaModelDocumentContributor
        implements ModelDocumentContributor<Proposta> {

    @Override
    public void contribute(Document document, Proposta proposta) {
        if (proposta == null) {
            return;
        }
        QualificacaoCompleta qualificacaoCompleta;
        try {
           qualificacaoCompleta = qualificacaoCompletaLocalService.getQualificacaoCompleta(proposta.getQualificacaoId());
        } catch (Exception exception) {
            return;
        }

        document.addDateSortable(Field.CREATE_DATE, proposta.getCreateDate());
        document.addDateSortable(Field.MODIFIED_DATE, proposta.getModifiedDate());
        document.addDate(Field.CREATE_DATE, proposta.getCreateDate());
        document.addDate(Field.MODIFIED_DATE, proposta.getModifiedDate());
        document.addKeyword(Field.USER_ID, proposta.getUserId());
        document.addKeyword(Field.GROUP_ID, proposta.getGroupId());
        document.addKeyword(Field.COMPANY_ID, proposta.getCompanyId());
        document.addKeyword(Field.ENTRY_CLASS_PK, proposta.getPropostaId());
        document.addKeyword("propostaId", proposta.getPropostaId());
        document.addText("status", proposta.getStatus());
        document.addKeyword("tipoProposta", proposta.getTipoProposta());
        document.addKeyword("numeroProtocoloSei", proposta.getNumeroProtocoloSei());
        document.addKeyword("protocolo", proposta.getProtocolo());
        document.addKeyword("editalId", proposta.getEditalId());
        document.addKeyword("administradorJudicialId", proposta.getAdministradorJudicialId());
        document.addKeyword("advogadoId", proposta.getAdvogadoId());
        document.addKeyword("fundamentacaoPedidoId", proposta.getFundamentacaoPedidoId());
        document.addKeyword("propostaPaiId", proposta.getPropostaPaiId());
        if(qualificacaoCompleta != null) {
            document.addKeyword("cpfCnpj", qualificacaoCompleta.getCpfCnpj());
        }
        document.addKeyword("documentosCompletosURL", proposta.getDocumentosCompletosURL());

    }

    @Reference
    private QualificacaoCompletaLocalService qualificacaoCompletaLocalService;
}


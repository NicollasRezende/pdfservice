package br.com.seatecnologia.gdf.negocia.headless.internal.dto.v1_0.converter;

import br.com.seatecnologia.gdf.negocia.headless.dto.v1_0.DadosContribuinteEntity;
import br.com.seatecnologia.gdf.negocia.headless.dto.v1_0.QualificacaoCompletaEntity;
import br.com.seatecnologia.gdf.negocia.model.DadosContribuinte;
import br.com.seatecnologia.gdf.negocia.model.QualificacaoCompleta;
import br.com.seatecnologia.gdf.negocia.service.QualificacaoCompletaLocalService;
import com.liferay.portal.vulcan.dto.converter.DTOConverter;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(
        property = "dto.class.name=br.com.seatecnologia.gdf.negocia.headless.dto.v1_0.DadosContribuinteEntity",
        service = DTOConverter.class
)
public class DadosContribuinteDTOConverter implements DTOConverter<DadosContribuinte, DadosContribuinteEntity> {
    @Override
    public String getContentType() {
        return DadosContribuinteEntity.class.getSimpleName();
    }

    @Override
    public DadosContribuinteEntity toDTO(DadosContribuinte dadosContribuinte) {
        DadosContribuinteEntity dto = new DadosContribuinteEntity();
//        dto.setDadosContribuinteId(dadosContribuinte.getDadosContribuinteId());
        //dto.setPessoaJuridicaEntities(); TODO: Implementar lógica para definir a lista de PessoaJuridicaEntities

        long qualificacaoCompletaId = dadosContribuinte.getQualificacaoId();

        if (qualificacaoCompletaId > 0) {
            try {
                QualificacaoCompleta qualificacaoCompleta = qualificacaoCompletaLocalService.getQualificacaoCompleta(qualificacaoCompletaId);
                dto.setQualificacao(qualificacaoCompletaDTOConverter.toDTO(qualificacaoCompleta));
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

        return dto;
    }

    @Reference
    private QualificacaoCompletaLocalService qualificacaoCompletaLocalService;

    @Reference(target = "(dto.class.name=br.com.seatecnologia.gdf.negocia.headless.dto.v1_0.QualificacaoCompletaEntity)")
    private DTOConverter<QualificacaoCompleta, QualificacaoCompletaEntity> qualificacaoCompletaDTOConverter;
}

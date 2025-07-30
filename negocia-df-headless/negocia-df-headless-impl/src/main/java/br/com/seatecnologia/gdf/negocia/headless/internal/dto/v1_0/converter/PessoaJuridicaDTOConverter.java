package br.com.seatecnologia.gdf.negocia.headless.internal.dto.v1_0.converter;

import br.com.seatecnologia.gdf.negocia.headless.dto.v1_0.PessoaJuridicaEntity;
import br.com.seatecnologia.gdf.negocia.headless.dto.v1_0.QualificacaoCompletaEntity;
import br.com.seatecnologia.gdf.negocia.model.QualificacaoCompleta;
import com.liferay.portal.vulcan.dto.converter.DTOConverter;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(
        property = "dto.class.name=br.com.seatecnologia.gdf.negocia.headless.dto.v1_0.PessoaJuridicaEntity",
        service = DTOConverter.class
)
public class PessoaJuridicaDTOConverter implements DTOConverter<QualificacaoCompleta, PessoaJuridicaEntity> {
    @Override
    public String getContentType() {
        return PessoaJuridicaEntity.class.getSimpleName();
    }

    @Override
    public PessoaJuridicaEntity toDTO(QualificacaoCompleta qualificacaoCompleta) {
        PessoaJuridicaEntity dto = new PessoaJuridicaEntity();
        dto.setTipoPessoaJuridica("Pessoa Jurídica"); // TODO: Implementar lógica para definir o tipo de pessoa jurídica

        try {
            dto.setQualificacao(qualificacaoCompletaDTOConverter.toDTO(qualificacaoCompleta));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return dto;
    }

    @Reference(target = "(dto.class.name=br.com.seatecnologia.gdf.negocia.headless.dto.v1_0.QualificacaoCompletaEntity)")
    private DTOConverter<QualificacaoCompleta, QualificacaoCompletaEntity> qualificacaoCompletaDTOConverter;
}

package br.com.seatecnologia.gdf.negocia.headless.internal.dto.v1_0.converter;

import br.com.seatecnologia.gdf.negocia.headless.dto.v1_0.EnderecoEntity;
import br.com.seatecnologia.gdf.negocia.headless.dto.v1_0.QualificacaoCompletaEntity;
import br.com.seatecnologia.gdf.negocia.model.Endereco;
import br.com.seatecnologia.gdf.negocia.model.QualificacaoCompleta;
import br.com.seatecnologia.gdf.negocia.service.EnderecoLocalService;
import com.liferay.portal.vulcan.dto.converter.DTOConverter;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(
        property = "dto.class.name=br.com.seatecnologia.gdf.negocia.headless.dto.v1_0.QualificacaoCompletaEntity",
        service = DTOConverter.class
)
public class ClassificacaoCompletaDTOConverter implements DTOConverter<QualificacaoCompleta, QualificacaoCompletaEntity> {
    @Override
    public String getContentType() {
        return QualificacaoCompletaEntity.class.getSimpleName();
    }

    @Override
    public QualificacaoCompletaEntity toDTO(QualificacaoCompleta qualificacaoCompleta) {
        QualificacaoCompletaEntity dto = new QualificacaoCompletaEntity();
        dto.setQualificacaoId(qualificacaoCompleta.getQualificacaoId());
        dto.setTipoPessoa(qualificacaoCompleta.getTipoPessoa());
        dto.setNomeRazaoSocial(qualificacaoCompleta.getNomeRazaoSocial());
        dto.setNomeFantasia(qualificacaoCompleta.getNomeFantasia());
        dto.setRepresentanteLegal(qualificacaoCompleta.getRepresentanteLegal());
        dto.setCpfCnpj(qualificacaoCompleta.getCpfCnpj());
        dto.setNumeroCfdf(qualificacaoCompleta.getNumeroCfdf());
        dto.setEmail(qualificacaoCompleta.getEmail());
        dto.setTelefone(qualificacaoCompleta.getTelefone());
        dto.setWhatsapp(qualificacaoCompleta.getWhatsapp());

        long enderecoId = qualificacaoCompleta.getEnderecoPostalId();

        if (enderecoId > 0) {
            try {
                Endereco endereco = enderecoLocalService.getEndereco(enderecoId);
                dto.setEnderecoPostal(enderecoDTOConverter.toDTO(endereco));
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

        return dto;
    }

    @Reference
    private EnderecoLocalService enderecoLocalService;

    @Reference(target = "(dto.class.name=br.com.seatecnologia.gdf.negocia.headless.dto.v1_0.EnderecoEntity)")
    private DTOConverter<Endereco, EnderecoEntity> enderecoDTOConverter;
}

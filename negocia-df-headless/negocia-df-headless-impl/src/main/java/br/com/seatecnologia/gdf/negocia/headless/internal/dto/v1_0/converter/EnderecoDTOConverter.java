package br.com.seatecnologia.gdf.negocia.headless.internal.dto.v1_0.converter;

import br.com.seatecnologia.gdf.negocia.headless.dto.v1_0.EnderecoEntity;
import br.com.seatecnologia.gdf.negocia.model.Endereco;
import com.liferay.portal.vulcan.dto.converter.DTOConverter;
import org.osgi.service.component.annotations.Component;

@Component(
        property = "dto.class.name=br.com.seatecnologia.gdf.negocia.headless.dto.v1_0.EnderecoEntity",
        service = DTOConverter.class
)
public class EnderecoDTOConverter implements DTOConverter<Endereco, EnderecoEntity> {

    @Override
    public String getContentType() {
        return EnderecoEntity.class.getSimpleName();
    }

    @Override
    public EnderecoEntity toDTO(Endereco endereco) {
        EnderecoEntity dto = new EnderecoEntity();
        dto.setNumero(endereco.getNumero());
        dto.setBairro(endereco.getBairro());
        dto.setEstado(endereco.getEstado());
        dto.setCep(endereco.getCep());
        dto.setEndereco(endereco.getEndereco());
        dto.setMunicipio(endereco.getMunicipio());
        return dto;
    }
}

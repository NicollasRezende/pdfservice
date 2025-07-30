package br.com.seatecnologia.gdf.negocia.headless.internal.dto.v1_0.converter;

import br.com.seatecnologia.gdf.negocia.headless.dto.v1_0.EditalEntity;
import br.com.seatecnologia.gdf.negocia.model.Edital;
import com.liferay.portal.vulcan.dto.converter.DTOConverter;
import com.liferay.portal.vulcan.dto.converter.DTOConverterContext;
import org.osgi.service.component.annotations.Component;

@Component(
        property = "dto.class.name=br.com.seatecnologia.gdf.negocia.headless.dto.v1_0.EditalEntity",
        service = DTOConverter.class
)
public class EditalDTOConverter implements DTOConverter<Edital, EditalEntity> {

    @Override
    public String getContentType() {
        return EditalEntity.class.getSimpleName();
    }

    @Override
    public EditalEntity toDTO(Edital edital) {
        EditalEntity dto = new EditalEntity();
        dto.setEditalId(edital.getEditalId());
        dto.setTitulo(edital.getTitulo());
        dto.setDescricao(edital.getDescricao());
        dto.setUrlArquivo(edital.getArquivoURL());
        dto.setDataInicio(edital.getDataInicio());
        dto.setDataFim(edital.getDataFim());
        return dto;
    }
}
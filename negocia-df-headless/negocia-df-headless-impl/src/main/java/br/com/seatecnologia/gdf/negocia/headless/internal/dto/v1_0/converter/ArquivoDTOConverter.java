package br.com.seatecnologia.gdf.negocia.headless.internal.dto.v1_0.converter;

import br.com.seatecnologia.gdf.negocia.headless.dto.v1_0.ArquivosEntity;
import com.liferay.document.library.kernel.model.DLFileEntry;
import com.liferay.portal.vulcan.dto.converter.DTOConverter;
import org.osgi.service.component.annotations.Component;

@Component(
        property = "dto.class.name=br.com.seatecnologia.gdf.negocia.headless.dto.v1_0.ArquivoEntity",
        service = DTOConverter.class
)
public class ArquivoDTOConverter implements DTOConverter<DLFileEntry, ArquivosEntity>{
    @Override
    public String getContentType() {
        return ArquivosEntity.class.getSimpleName();
    }

    @Override
    public ArquivosEntity toDTO(DLFileEntry arquivo) {
        ArquivosEntity dto = new ArquivosEntity();
        dto.setFileEntryId(arquivo.getFileEntryId());
        return dto;
    }
}

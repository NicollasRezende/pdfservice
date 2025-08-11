package br.com.seatecnologia.gdf.edital.admin.web.internal.mapper;

import br.com.seatecnologia.gdf.negocia.internal.request.EditalSituacaoRequest;
import org.osgi.service.component.annotations.Component;

public class EditalSituacaoRequestMapper {

    public EditalSituacaoRequest toRequest() {
        return new EditalSituacaoRequest();
    }
}

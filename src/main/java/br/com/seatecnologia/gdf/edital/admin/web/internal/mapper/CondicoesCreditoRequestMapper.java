package br.com.seatecnologia.gdf.edital.admin.web.internal.mapper;

import br.com.seatecnologia.gdf.negocia.internal.request.CondicoesCreditoRequest;
import org.osgi.service.component.annotations.Component;


public class CondicoesCreditoRequestMapper {

    public CondicoesCreditoRequest toRequest(long classificacaoCreditoId) {
        return new CondicoesCreditoRequest(classificacaoCreditoId);
    }
}

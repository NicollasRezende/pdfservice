package br.com.seatecnologia.gdf.edital.admin.web.internal.mapper;

import br.com.seatecnologia.gdf.negocia.internal.request.EditalReceitaRequest;
import org.osgi.service.component.annotations.Component;


public class EditalReceitaRequestMapper {

    public EditalReceitaRequest toRequest(Long receitaId) {
        return new EditalReceitaRequest(receitaId);
    }
}

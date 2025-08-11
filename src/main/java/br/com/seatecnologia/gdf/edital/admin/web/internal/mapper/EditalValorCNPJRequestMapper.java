package br.com.seatecnologia.gdf.edital.admin.web.internal.mapper;

import br.com.seatecnologia.gdf.negocia.internal.request.EditalValorCNPJRequest;
import org.osgi.service.component.annotations.Component;

import java.util.ArrayList;
import java.util.List;

public class EditalValorCNPJRequestMapper {

    public List<EditalValorCNPJRequest> toRequest(String[] valorMinimoCNPJ) {

        List<EditalValorCNPJRequest> editalValorCNPJRequestList = new ArrayList<>();

        for (int i = 0; i < valorMinimoCNPJ.length; i++) {
            EditalValorCNPJRequest editalValorCNPJRequest = new EditalValorCNPJRequest();
            editalValorCNPJRequest.setValorMinimoCNPJ(valorMinimoCNPJ[i]);
            editalValorCNPJRequestList.add(editalValorCNPJRequest);
        }

        return editalValorCNPJRequestList;

    }
}

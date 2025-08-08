package br.com.seatecnologia.gdf.edital.admin.web.internal.mapper;

import br.com.seatecnologia.gdf.negocia.internal.request.CondicoesCreditoRequest;
import br.com.seatecnologia.gdf.negocia.internal.request.CondicoesNegociacaoRequest;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONObject;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import java.util.ArrayList;
import java.util.List;

@Component(service = CondicoesNegociacaoRequestMapper.class)
public class CondicoesNegociacaoRequestMapper {

    public CondicoesNegociacaoRequest toRequest(JSONObject condicoesNegociacaoJson) {
        CondicoesNegociacaoRequest condicoesNegociacaoRequest = new CondicoesNegociacaoRequest();
        condicoesNegociacaoRequest.setQuantidadeParcelas(condicoesNegociacaoJson.getInt("quantidadeParcelas"));
        condicoesNegociacaoRequest.setPorcentagemDesconto(condicoesNegociacaoJson.getDouble("porcentagemDesconto"));
        condicoesNegociacaoRequest.setAplicado(condicoesNegociacaoJson.getString("aplicado"));
        condicoesNegociacaoRequest.setClassificacaoCredito(condicoesNegociacaoJson.getDouble("classificacaoCredito"));

        JSONArray condicoesCreditoArray = condicoesNegociacaoJson.getJSONArray("classificacaoCredito");
        List<CondicoesCreditoRequest> condicoesCreditoRequestList = new ArrayList<>();
        for (int i = 0; i < condicoesCreditoArray.length(); i++) {
            condicoesCreditoRequestList.add(_condicoesCreditoRequestMapper.toRequest(0L));
        }
        condicoesNegociacaoRequest.setCondicoesCredito(condicoesCreditoRequestList);
        return condicoesNegociacaoRequest;
    }

    @Reference
    private CondicoesCreditoRequestMapper _condicoesCreditoRequestMapper;
}

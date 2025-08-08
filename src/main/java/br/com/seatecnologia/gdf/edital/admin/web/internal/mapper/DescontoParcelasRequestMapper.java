package br.com.seatecnologia.gdf.edital.admin.web.internal.mapper;

import br.com.seatecnologia.gdf.negocia.internal.request.CondicoesNegociacaoRequest;
import br.com.seatecnologia.gdf.negocia.internal.request.DescontosParcelasRequest;
import br.com.seatecnologia.gdf.negocia.internal.request.EnvolvidosTransacaoRequest;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONObject;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Component(service = DescontoParcelasRequestMapper.class)
public class DescontoParcelasRequestMapper {

    public List<DescontosParcelasRequest> toRequest(JSONArray descontosArray) {
        List<DescontosParcelasRequest> descontosParcelasRequestList = new ArrayList<>();

        for (int i = 0; i < descontosArray.length(); i++) {
            JSONObject desconto = descontosArray.getJSONObject(i);
            String tipoCredito = desconto.getString("tipoCredito");
            String empresaRegime = desconto.getString("empresaRegime");
            String pequenoValorAplicavel = desconto.getString("pequenoValorAplicavel");
            double pequenoValor = desconto.getDouble("pequenoValor");

            DescontosParcelasRequest descontosParcelasRequest = new DescontosParcelasRequest();
            descontosParcelasRequest.setTipoCredito(tipoCredito);
            descontosParcelasRequest.setRegimeFalencia(empresaRegime);
            descontosParcelasRequest.setPequenoValorAplicavel(pequenoValorAplicavel);
            descontosParcelasRequest.setPequenoValor(pequenoValor);

            JSONArray transacaoEnvolveArray = desconto.getJSONArray("transacaoEnvolve");
            List<EnvolvidosTransacaoRequest> transacaoEnvolve = new ArrayList<>();
            for (int j = 0; j < transacaoEnvolveArray.length(); j++) {
                transacaoEnvolve.add(_envolvidosTransacaoRequestMapper.toRequest(transacaoEnvolveArray.get(j).toString()));
            }

            JSONArray condicoesNegociacaoArray = desconto.getJSONArray("parcelas");
            List<CondicoesNegociacaoRequest> condicoesNegociacao = new ArrayList<>();
            for (int j = 0; j < condicoesNegociacaoArray.length(); j++) {
                JSONObject condicaoNegociacao = condicoesNegociacaoArray.getJSONObject(j);
                condicoesNegociacao.add(_condicoesNegociacaoRequestMapper.toRequest(condicaoNegociacao));
            }
            descontosParcelasRequest.setCondicoesNegociacao(condicoesNegociacao);
            descontosParcelasRequest.setEnvolvidosTransacao(transacaoEnvolve);
            descontosParcelasRequestList.add(descontosParcelasRequest);
        }

        return descontosParcelasRequestList;
    }

    @Reference
    private EnvolvidosTransacaoRequestMapper _envolvidosTransacaoRequestMapper;

    @Reference
    private CondicoesNegociacaoRequestMapper _condicoesNegociacaoRequestMapper;
}

package br.com.seatecnologia.gdf.edital.admin.web.internal.mapper;

import br.com.seatecnologia.gdf.negocia.internal.request.EnvolvidosTransacaoRequest;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONObject;
import org.osgi.service.component.annotations.Component;

import java.util.ArrayList;
import java.util.List;

@Component(service = EnvolvidosTransacaoRequestMapper.class)
public class EnvolvidosTransacaoRequestMapper {

    public EnvolvidosTransacaoRequest toRequest(String envolvido) {
        EnvolvidosTransacaoRequest envolvidosTransacaoRequest = new EnvolvidosTransacaoRequest();
        envolvidosTransacaoRequest.setEnvolvido(envolvido);
        return envolvidosTransacaoRequest;
    }
}

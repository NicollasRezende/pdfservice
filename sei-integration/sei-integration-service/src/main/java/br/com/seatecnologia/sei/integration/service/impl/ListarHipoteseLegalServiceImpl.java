package br.com.seatecnologia.sei.integration.service.impl;

import br.com.seatecnologia.sei.integration.api.service.BaseSeiService;
import br.com.seatecnologia.sei.integration.api.service.ListarHipoteseLegalService;
import br.com.seatecnologia.sei.integration.api.service.ws.HipoteseLegal;
import com.liferay.portal.aop.AopService;
import org.osgi.service.component.annotations.Component;

@Component(immediate = true, service = ListarHipoteseLegalService.class)
public class ListarHipoteseLegalServiceImpl extends BaseSeiService implements ListarHipoteseLegalService, AopService {

    @Override
    public HipoteseLegal[] listarHipoteseLegal() {
        try {
            return sei().listarHipotesesLegais(
                    siglaSistema(),
                    identificacaoServico(),
                    idUnidade(),
                    null
            );
        } catch (Exception e) {
            log().error("[SEI] Erro ao listar hipóteses legais: " + e.getMessage(), e);
            return null;
        }
    }
}


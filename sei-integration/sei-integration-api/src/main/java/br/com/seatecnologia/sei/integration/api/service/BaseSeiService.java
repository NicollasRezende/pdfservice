package br.com.seatecnologia.sei.integration.api.service;

import br.com.seatecnologia.sei.integration.api.service.factory.SeiClientHolder;
import br.com.seatecnologia.sei.integration.api.service.ws.SeiPortType;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

public abstract class BaseSeiService {

    protected SeiPortType sei() {
        return SeiClientHolder.get().getClient();
    }

    protected String siglaSistema() {
        return SeiClientHolder.get().getSiglaSistema();
    }

    protected String identificacaoServico() {
        return SeiClientHolder.get().getIdentificacaoServico();
    }

    protected String idUnidade() {
        return SeiClientHolder.get().getIdUnidade();
    }

    protected Log log() {
        return LogFactoryUtil.getLog(this.getClass());
    }
}
package br.com.seatecnologia.sei.integration.api.service.factory;

import br.com.seatecnologia.sei.integration.api.service.ws.SeiPortType;

public interface SeiClientFactory {
    SeiPortType getClient();
    String getSiglaSistema();
    String getIdentificacaoServico();
    String getIdUnidade();
}
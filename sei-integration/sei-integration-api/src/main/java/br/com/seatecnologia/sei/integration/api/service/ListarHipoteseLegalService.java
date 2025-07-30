package br.com.seatecnologia.sei.integration.api.service;

import br.com.seatecnologia.sei.integration.api.service.ws.HipoteseLegal;

public interface ListarHipoteseLegalService {

    /**
     * Lista as hipóteses legais disponíveis no SEI.
     *
     * @return um array de objetos HipoteseLegal representando as hipóteses legais disponíveis.
     */
    HipoteseLegal[] listarHipoteseLegal();
}

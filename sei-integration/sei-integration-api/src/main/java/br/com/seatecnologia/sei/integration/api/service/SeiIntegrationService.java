package br.com.seatecnologia.sei.integration.api.service;

import aQute.bnd.annotation.ProviderType;

/**
 * @author lucas
 */

@ProviderType
public interface SeiIntegrationService {
    String pingSEI(String usuario, String senha);
}
package br.com.seatecnologia.sei.integration.api.service.factory;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(service = SeiClientHolder.class, immediate = true)
public class SeiClientHolder {

    private static SeiClientFactory _seiClientFactory;

    public static SeiClientFactory get() {
        return _seiClientFactory;
    }

    @Reference(unbind = "-")
    public void setSeiClientFactory(SeiClientFactory seiClientFactory) {
        _seiClientFactory = seiClientFactory;
    }
}
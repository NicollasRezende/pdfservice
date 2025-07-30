package br.com.seatecnologia.sei.integration.service.factory;

import br.com.seatecnologia.sei.integration.api.service.factory.SeiClientFactory;
import br.com.seatecnologia.sei.integration.api.service.ws.SeiPortType;
import br.com.seatecnologia.sei.integration.api.service.ws.SeiServiceLocator;
import br.com.seatecnologia.sei.integration.service.internal.configuration.SeiWSConfiguration;
import br.com.seatecnologia.sei.integration.service.internal.constants.SeiWSConstants;
import com.liferay.portal.configuration.metatype.bnd.util.ConfigurableUtil;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Modified;

import java.util.Map;

@Component(
        configurationPid = SeiWSConstants.PID_SEI_WS,
        immediate = true,
        service = SeiClientFactory.class
)
public class SeiClientFactoryImpl implements SeiClientFactory {

    private volatile SeiWSConfiguration _seiWSConfiguration;

    private SeiPortType _seiPort;

    @Activate
    @Modified
    protected void activate(Map<String, Object> properties) {
        _seiWSConfiguration = ConfigurableUtil.createConfigurable(
                SeiWSConfiguration.class, properties);

        try {
            SeiServiceLocator locator = new SeiServiceLocator();
            locator.setSeiPortServiceEndpointAddress(_seiWSConfiguration.endpoint());

            _seiPort = locator.getSeiPortService();
        } catch (Exception e) {
            throw new RuntimeException("Erro ao inicializar conexão com o SEI: " + e.getMessage(), e);
        }
    }

    public SeiPortType getClient() {
        return _seiPort;
    }

    public String getSiglaSistema() {
        return _seiWSConfiguration.siglaSistema();
    }

    public String getIdentificacaoServico() {
        return _seiWSConfiguration.identificacaoServico();
    }

    public String getIdUnidade() {
        return _seiWSConfiguration.idUnidade();
    }
}

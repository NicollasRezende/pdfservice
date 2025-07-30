package br.com.seatecnologia.sei.integration.service.validator;

import br.com.seatecnologia.sei.integration.api.service.ArquivoService;
import br.com.seatecnologia.sei.integration.api.service.ws.ArquivoExtensao;
import br.com.seatecnologia.sei.integration.service.internal.configuration.SeiWSDocumentConfiguration;
import com.liferay.portal.configuration.metatype.bnd.util.ConfigurableUtil;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Modified;
import org.osgi.service.component.annotations.Reference;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Component(
        immediate = true,
        configurationPid = "br.com.seatecnologia.sei.integration.configuration.DocumentoConfiguration",
        service = DocumentoConfigurationValidator.class
)
public class DocumentoConfigurationValidator {

    @Activate
    @Modified
    protected void activate(Map<String, Object> properties) {
        _seiWSDocumentConfiguration = ConfigurableUtil.createConfigurable(SeiWSDocumentConfiguration.class, properties);
    }

    public long getTamanhoMaximoBytes() {
        return (long) _seiWSDocumentConfiguration.tamanhoMaximoArquivoDocumento() * 1024 * 1024;
    }

    public int getQuantidadeMaximaDocumentos() {
        return _seiWSDocumentConfiguration.numeroMaximoDocumentos();
    }

    private volatile SeiWSDocumentConfiguration _seiWSDocumentConfiguration;
}

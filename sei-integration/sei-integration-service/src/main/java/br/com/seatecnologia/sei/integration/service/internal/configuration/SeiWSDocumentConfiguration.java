package br.com.seatecnologia.sei.integration.service.internal.configuration;

import aQute.bnd.annotation.metatype.Meta;
import br.com.seatecnologia.sei.integration.service.internal.constants.SeiWSConstants;
import com.liferay.portal.configuration.metatype.annotations.ExtendedObjectClassDefinition;

@ExtendedObjectClassDefinition(
        category = SeiWSConstants.SEI_CATEGORY_KEY,
        scope = ExtendedObjectClassDefinition.Scope.SYSTEM
)
@Meta.OCD(
        id = SeiWSConstants.PID_SEI_WS_DOCUMENT,
        name = SeiWSConstants.SEI_CONFIGURATION_DOCUMENT
)
public interface SeiWSDocumentConfiguration {
    @Meta.AD(deflt = "10", required = false, description = "Numero maximo de documentos que podem ser enviados: default = 10")
    int numeroMaximoDocumentos();

    @Meta.AD(deflt = "10", required = false, description = "Tamanho maximo do arquivo em MB: default = 10")
    int tamanhoMaximoArquivoDocumento();
}

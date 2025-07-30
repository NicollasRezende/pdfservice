package br.com.seatecnologia.sei.integration.service.internal.configuration;

import aQute.bnd.annotation.metatype.Meta;
import br.com.seatecnologia.sei.integration.service.internal.constants.SeiWSConstants;
import com.liferay.portal.configuration.metatype.annotations.ExtendedObjectClassDefinition;

@ExtendedObjectClassDefinition(
        category = SeiWSConstants.SEI_CATEGORY_KEY,
        scope = ExtendedObjectClassDefinition.Scope.SYSTEM
)
@Meta.OCD(
        id = SeiWSConstants.PID_SEI_WS,
        name = SeiWSConstants.SEI_CONFIGURATION
)
public interface SeiWSConfiguration {

    @Meta.AD(deflt = "NG", required = false, description = "Sigla do sistema SEI: default > NG")
    String siglaSistema();

    @Meta.AD(deflt = "CHAVE_SERVICO", required = false, description = "Chave do serviço SEI: default > CHAVE_SERVICO")
    String identificacaoServico();

    @Meta.AD(deflt = "110000000", required = false)
    String idUnidade();

    @Meta.AD(deflt = "https://laboratorio-sei4.sei.df.gov.br/sei/ws/SeiWS.php", required = false, description = "URL do serviço SEI: default > https://laboratorio-sei4.sei.df.gov.br/sei/ws/SeiWS.php")
    String endpoint();
}
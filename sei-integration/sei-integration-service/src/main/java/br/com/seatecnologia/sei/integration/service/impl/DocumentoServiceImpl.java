package br.com.seatecnologia.sei.integration.service.impl;


import br.com.seatecnologia.sei.integration.api.service.ArquivoService;
import br.com.seatecnologia.sei.integration.api.service.BaseSeiService;
import br.com.seatecnologia.sei.integration.api.service.DocumentoService;
import br.com.seatecnologia.sei.integration.api.service.enums.NivelAcesso;
import br.com.seatecnologia.sei.integration.api.service.enums.TipoDocumento;
import br.com.seatecnologia.sei.integration.api.service.model.builder.DocumentoBuilder;
import br.com.seatecnologia.sei.integration.api.service.ws.*;
import br.com.seatecnologia.sei.integration.service.validator.DocumentoConfigurationValidator;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Implementação do serviço de documentos do SEI.
 */
@Component(
        immediate = true,
        service = DocumentoService.class
)
public class DocumentoServiceImpl extends BaseSeiService implements DocumentoService {

    /**
     * {@inheritDoc}
     */
    @Override
    public RetornoInclusaoDocumento incluirDocumento(
            TipoDocumento tipo,
            String idProcedimento,
            String protocoloProcedimento,
            String idSerie,
            String numero,
            String nomeArvore,
            String dinValor,
            String data,
            String descricao,
            String idTipoConferencia,
            String sinArquivamento,
            Remetente remetente,
            Interessado[] interessados,
            Destinatario[] destinatarios,
            String observacao,
            String nomeArquivo,
            NivelAcesso nivelAcesso,
            String idHipoteseLegal,
            String conteudo,
            SecaoDocumento[] conteudoSecoes,
            byte[] conteudoMTOM,
            String idArquivo,
            Campo[] campos,
            String sinBloqueado,
            String idItemEtapa
    ) {
        if (tipo == null) {
            throw new IllegalArgumentException("Tipo do documento é obrigatório.");
        }

        _arquivoService.validarExtensaoPermitida(nomeArquivo);

        if (conteudo != null) {
            long estimatedBytes = Math.round(conteudo.length() * 3.0 / 4.0); // estimativa base64
            if (estimatedBytes > _documentoConfigurationValidator.getTamanhoMaximoBytes()) {
                throw new IllegalArgumentException("Tamanho do conteúdo excede o limite permitido.");
            }
        }

        if (conteudoMTOM != null) {
            if (conteudoMTOM.length > _documentoConfigurationValidator.getTamanhoMaximoBytes()) {
                throw new IllegalArgumentException("Tamanho do conteúdo MTOM excede o limite permitido.");
            }
        }

        Documento documento = DocumentoBuilder
                .builder(tipo)
                .idProcedimento(idProcedimento)
                .protocoloProcedimento(protocoloProcedimento)
                .idSerie(idSerie)
                .numero(numero)
                .nomeArvore(nomeArvore)
                .dinValor(dinValor)
                .data(data)
                .descricao(descricao)
                .idTipoConferencia(idTipoConferencia)
                .sinArquivamento(sinArquivamento)
                .remetente(remetente)
                .interessados(interessados)
                .destinatarios(destinatarios)
                .observacao(observacao)
                .nomeArquivo(nomeArquivo)
                .nivelAcesso(nivelAcesso)
                .idHipoteseLegal(idHipoteseLegal)
                .conteudo(conteudo)
                .conteudoSecoes(conteudoSecoes)
                .conteudoMTOM(conteudoMTOM)
                .idArquivo(idArquivo)
                .campos(campos)
                .sinBloqueado(sinBloqueado)
                .idItemEtapa(idItemEtapa)
                .build();

        try {
            return sei().incluirDocumento(
                    siglaSistema(),
                    identificacaoServico(),
                    idUnidade(),
                    documento
            );
        } catch (Exception e) {
            throw new RuntimeException("Erro ao incluir documento no SEI", e);
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RetornoConsultaDocumento consultarDocumento(
            String protocoloDocumento,
            String sinRetornarAndamentoGeracao,
            String sinRetornarAssinaturas,
            String sinRetornarPublicacao,
            String sinRetornarCampos,
            String sinRetornarBlocos
    ) {
        try {
            return sei().consultarDocumento(
                    siglaSistema(),
                    identificacaoServico(),
                    idUnidade(),
                    protocoloDocumento,
                    sinRetornarAndamentoGeracao,
                    sinRetornarAssinaturas,
                    sinRetornarPublicacao,
                    sinRetornarCampos,
                    sinRetornarBlocos
            );
        } catch (Exception e) {
            throw new RuntimeException("Erro ao consultar documento no SEI", e);
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String excluirDocumento(String idDocumento) {
        try {
            return sei().excluirDocumento(
                    siglaSistema(),
                    identificacaoServico(),
                    idUnidade(),
                    idDocumento
            );
        } catch (Exception e) {
            throw new RuntimeException("Erro ao excluir documento no SEI", e);
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String incluirDocumentoBloco(String idBloco, String protocoloDocumento, String anotacao) {
        try {

            return sei().incluirDocumentoBloco(
                    siglaSistema(),
                    identificacaoServico(),
                    idUnidade(),
                    idBloco,
                    protocoloDocumento,
                    anotacao
            );
        } catch (Exception e) {
            throw new RuntimeException("Erro ao incluir documento no bloco no SEI", e);
        }
    }

    @Override
    public Serie[] listarSeries(String idTipoProcedimento) {
        try {
            return sei().listarSeries(
                    siglaSistema(),
                    identificacaoServico(),
                    idUnidade(),
                    idTipoProcedimento
            );
        } catch (Exception e) {
            log().error("[SEI] Erro ao listar séries: " + e.getMessage(), e);
            return null;
        }
    }

    @Reference
    private DocumentoConfigurationValidator _documentoConfigurationValidator;

    @Reference
    private ArquivoService _arquivoService;
}





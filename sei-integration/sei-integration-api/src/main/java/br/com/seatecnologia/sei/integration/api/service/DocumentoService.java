package br.com.seatecnologia.sei.integration.api.service;

import br.com.seatecnologia.sei.integration.api.service.enums.NivelAcesso;
import br.com.seatecnologia.sei.integration.api.service.enums.TipoDocumento;
import br.com.seatecnologia.sei.integration.api.service.ws.*;

/**
 * Serviço para operações com documentos no SEI.
 */
public interface DocumentoService {

    /**
     * Inclui um novo documento no SEI.
     *
     * @param tipo Tipo do documento (GERADO ou RECEBIDO).
     * @param idProcedimento ID do procedimento pai. Opcional se protocolo for informado.
     * @param protocoloProcedimento Protocolo do procedimento pai. Opcional se ID for informado.
     * @param idSerie ID do tipo de documento (obrigatório).
     * @param numero Número do documento. Para GERADO pode ser null (SEI numera), para RECEBIDO é obrigatório.
     * @param nomeArvore Nome complementar para exibição na árvore de documentos.
     * @param dinValor Valor monetário (formato brasileiro ou americano).
     * @param data Data do documento. Obrigatório para documentos RECEBIDOS.
     * @param descricao Descrição do documento. Obrigatório para documentos GERADOS.
     * @param idTipoConferencia ID do tipo de conferência (somente para documentos RECEBIDOS).
     * @param sinArquivamento Indica se o documento deve ser arquivado automaticamente (\"S\" ou \"N\").
     * @param remetente Remetente do documento (obrigatório para RECEBIDOS).
     * @param interessados Lista de interessados (pode ser vazio).
     * @param destinatarios Lista de destinatários (pode ser vazio).
     * @param observacao Observação da unidade (opcional).
     * @param nomeArquivo Nome do arquivo. Obrigatório para documentos RECEBIDOS.
     * @param nivelAcesso Nível de acesso: 0 (público), 1 (restrito), 2 (sigiloso).
     * @param idHipoteseLegal ID da hipótese legal associada (opcional).
     * @param conteudo Conteúdo em Base64 (obrigatório se conteudoMTOM não for enviado).
     * @param conteudoSecoes Conteúdo das seções (somente para documentos GERADOS).
     * @param conteudoMTOM Conteúdo binário MTOM (obrigatório se conteudo não for enviado).
     * @param idArquivo ID do arquivo SEI (retornado por adicionarArquivo).
     * @param campos Campos adicionais do formulário (estrutura Campo).
     * @param sinBloqueado Indica se o documento será bloqueado no SEI (\"S\" ou \"N\").
     * @param idItemEtapa ID do item do plano de trabalho (opcional).
     * @return Um objeto RetornoInclusaoDocumento contendo informações do documento criado.
     */
    RetornoInclusaoDocumento incluirDocumento(
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
    );



    /**
     * Consulta um documento no SEI.
     *
     * @param protocoloDocumento O número do documento (ex: 0003934).
     * @param sinRetornarAndamentoGeracao Sinalizador para retornar o andamento da geração ("S" ou "N").
     * @param sinRetornarAssinaturas Sinalizador para retornar as assinaturas ("S" ou "N").
     * @param sinRetornarPublicacao Sinalizador para retornar dados de publicação ("S" ou "N").
     * @param sinRetornarCampos Sinalizador para retornar campos de formulário ("S" ou "N").
     * @param sinRetornarBlocos Sinalizador para retornar blocos que contenham o documento ("S" ou "N").
     * @return Um objeto RetornoConsultaDocumento com os dados solicitados.
     *
     * Observação: documentos sigilosos não são retornados. Cada campo sinalizador implica em custo de processamento adicional — use apenas os necessários.
     */
    RetornoConsultaDocumento consultarDocumento(
            String protocoloDocumento,
            String sinRetornarAndamentoGeracao,
            String sinRetornarAssinaturas,
            String sinRetornarPublicacao,
            String sinRetornarCampos,
            String sinRetornarBlocos
    );

    /**
     * Exclui um documento do SEI.
     *
     * @param idDocumento O protocolo do documento a ser excluído.
     * @return Uma string indicando o sucesso da operação.
     */
    String excluirDocumento(String idDocumento);

    /**
     * Inclui um documento em um bloco no SEI.
     *
     * @param idBloco O ID do bloco no qual o documento será incluído.
     * @param protocoloDocumento O protocolo do documento a ser incluído.
     * @param anotacao Anotação opcional associada à inclusão do documento no bloco.
     * @return Uma string indicando o resultado da operação.
     */
    String incluirDocumentoBloco(String idBloco, String protocoloDocumento, String anotacao);

    /**
     * Lista as séries disponíveis no SEI para uma unidade e tipo de procedimento.
     *
     * @param idTipoProcedimento Identificador do tipo de procedimento.
     * @return Array de séries disponíveis.
     */
    Serie[] listarSeries(String idTipoProcedimento);
}


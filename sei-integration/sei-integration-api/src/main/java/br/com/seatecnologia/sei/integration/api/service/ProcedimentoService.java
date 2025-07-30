package br.com.seatecnologia.sei.integration.api.service;

import br.com.seatecnologia.sei.integration.api.service.enums.Sinalizador;
import br.com.seatecnologia.sei.integration.api.service.ws.*;

public interface ProcedimentoService {
    /*
    * Gera um procedimento no SEI.
    * @param procedimento O objeto Procedimento contendo os detalhes do procedimento a ser gerado.
    * @param documentos Um array de objetos Documento contendo os documentos associados ao procedimento.
     */
    RetornoGeracaoProcedimento gerarProcedimento(Procedimento procedimento,
                                                 Documento[] documentos,
                                                 String[] procedimentosRelacionados,
                                                 String[] unidadesEnvio,
                                                 String sinManterAbertoUnidade,
                                                 String sinEnviarEmailNotificacao,
                                                 String dataRetornoProgramado,
                                                 String diasRetornoProgramado,
                                                 String sinDiasUteisRetornoProgramado,
                                                 String idMarcador,
                                                 String textoMarcador,
                                                 String dataControlePrazo,
                                                 String diasControlePrazo,
                                                 String sinDiasUteisControlePrazo);

    /**
     * Consulta um procedimento no SEI com controle detalhado sobre os dados retornados.
     *
     * @param protocoloProcedimento Protocolo do procedimento.
     * @param retornarAssuntos Indica se deve retornar os assuntos do procedimento.
     * @param retornarInteressados Indica se deve retornar os interessados.
     * @param retornarObservacoes Indica se deve retornar observações.
     * @param retornarAndamentoGeracao Indica se deve retornar os andamentos de geração.
     * @param retornarAndamentoConclusao Indica se deve retornar os andamentos de conclusão.
     * @param retornarUltimoAndamento Indica se deve retornar apenas o último andamento.
     * @param retornarUnidadesProcedimentoAberto Indica se deve retornar unidades com o procedimento aberto.
     * @param retornarRelacionados Indica se deve retornar procedimentos relacionados.
     * @param retornarAnexados Indica se deve retornar procedimentos anexados.
     * @return Os dados do procedimento consultado.
     */
    RetornoConsultaProcedimento consultarProcedimento(
            String protocoloProcedimento,
            Sinalizador retornarAssuntos,
            Sinalizador retornarInteressados,
            Sinalizador retornarObservacoes,
            Sinalizador retornarAndamentoGeracao,
            Sinalizador retornarAndamentoConclusao,
            Sinalizador retornarUltimoAndamento,
            Sinalizador retornarUnidadesProcedimentoAberto,
            Sinalizador retornarRelacionados,
            Sinalizador retornarAnexados
    );


    /**
     * Consulta um procedimento individual no SEI.
     *
     * @param idOrgaoProcedimento O ID do órgão do procedimento.
     * @param idTipoProcedimento O ID do tipo de procedimento.
     * @param idOrgaoUsuario O ID do órgão do usuário.
     * @param siglaUsuario A sigla do usuário.
     * @return Um objeto ProcedimentoResumido contendo os detalhes do procedimento consultado.
     */
    ProcedimentoResumido consultarProcedimentoIndividual(String idOrgaoProcedimento, String idTipoProcedimento, String idOrgaoUsuario, String siglaUsuario);

    /**
     * Exclui um procedimento no SEI.
     *
     * @param protocoloProcedimento O protocolo do procedimento a ser excluído.
     * @return Uma mensagem de confirmação ou erro da exclusão do procedimento.
     */
    String excluirProcesso(String protocoloProcedimento);

    /**
     * Reabre um procedimento no SEI.
     *
     * @param protocoloProcedimento O protocolo do procedimento a ser reaberto.
     * @return Uma mensagem de confirmação ou erro da reabertura do procedimento.
     */
    String reabrirProcesso(String protocoloProcedimento);

    /**
     * Conclui um procedimento no SEI.
     *
     * @param protocoloProcedimento O protocolo do procedimento a ser concluído.
     * @return Uma mensagem de confirmação ou erro da conclusão do procedimento.
     */
    String concluirProcesso(String protocoloProcedimento);

    /**
     * Envia um procedimento para unidades de destino no SEI.
     *
     * @param protocoloProcedimento O protocolo do procedimento a ser enviado.
     * @param unidadesDestino Um array de strings representando as unidades de destino.
     * @return Uma mensagem de confirmação ou erro do envio do procedimento.
     */
    String enviarProcesso(String protocoloProcedimento, String[] unidadesDestino);

    /**
     * Atribui um procedimento a um usuário no SEI.
     *
     * @param protocoloProcedimento O protocolo do procedimento a ser atribuído.
     * @param idUsuario O ID do usuário ao qual o procedimento será atribuído.
     * @param sinReabrir Sinalizador para indicar se o procedimento deve ser reaberto (S/N).
     * @return Uma mensagem de confirmação ou erro da atribuição do procedimento.
     */
    String atribuirProcesso(String protocoloProcedimento, String idUsuario, String sinReabrir);

    /**
     * Lista os tipos de prioridade disponíveis para o usuário na unidade atual.
     *
     * @return Lista de {@link TipoPrioridade} disponíveis no SEI.
     */
    br.com.seatecnologia.sei.integration.api.service.ws.TipoPrioridade[] listarTiposPrioridade();

    /**
     * Lista os tipos de procedimento disponíveis para uma unidade e série específica.
     *
     * @param idUnidade Identificador da unidade no SEI.
     * @param idSerie Identificador da série documental.
     * @param sinIndividual Sinalizador "S" ou "N" indicando se a lista deve conter apenas procedimentos individuais.
     * @return Lista de {@link TipoProcedimento} disponíveis no SEI.
     */
    br.com.seatecnologia.sei.integration.api.service.ws.TipoProcedimento[] listarTiposProcedimento(String idUnidade, String idSerie, String sinIndividual);

}

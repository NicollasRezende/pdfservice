package br.com.seatecnologia.sei.integration.service.impl;

import br.com.seatecnologia.sei.integration.api.service.ArquivoService;
import br.com.seatecnologia.sei.integration.api.service.BaseSeiService;
import br.com.seatecnologia.sei.integration.api.service.ProcedimentoService;
import br.com.seatecnologia.sei.integration.api.service.enums.Sinalizador;
import br.com.seatecnologia.sei.integration.api.service.ws.*;
import br.com.seatecnologia.sei.integration.service.validator.DocumentoConfigurationValidator;
import com.liferay.portal.aop.AopService;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import java.util.Arrays;
import java.util.stream.Collectors;

@Component(
        immediate = true,
        service = ProcedimentoService.class
)
public class ProcedimentoServiceImpl extends BaseSeiService implements ProcedimentoService, AopService {

    @Override
    public RetornoGeracaoProcedimento gerarProcedimento(
            Procedimento procedimento,
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
            String sinDiasUteisControlePrazo
    ) {

        if (documentos != null) {
            if (documentos.length > _documentoConfigurationValidator.getQuantidadeMaximaDocumentos()) {
                throw new IllegalArgumentException("Número de documentos excede o limite configurado.");
            }

            _arquivoService.validarExtensoesPermitidas(documentos);
        }

        try {
            return sei().gerarProcedimento(
                    siglaSistema(),
                    identificacaoServico(),
                    idUnidade(),
                    procedimento,
                    documentos,
                    procedimentosRelacionados,
                    unidadesEnvio,
                    sinManterAbertoUnidade,
                    sinEnviarEmailNotificacao,
                    dataRetornoProgramado,
                    diasRetornoProgramado,
                    sinDiasUteisRetornoProgramado,
                    idMarcador,
                    textoMarcador,
                    dataControlePrazo,
                    diasControlePrazo,
                    sinDiasUteisControlePrazo
            );
        } catch (Exception e) {
            log().error("[SEI] Erro ao gerar procedimento: " + e.getMessage(), e);
            return null;
        }
    }

    @Override
    public RetornoConsultaProcedimento consultarProcedimento(
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
    ) {
        try {
            return sei().consultarProcedimento(
                    siglaSistema(),
                    identificacaoServico(),
                    idUnidade(),
                    protocoloProcedimento,
                    retornarAssuntos.getValor(),
                    retornarInteressados.getValor(),
                    retornarObservacoes.getValor(),
                    retornarAndamentoGeracao.getValor(),
                    retornarAndamentoConclusao.getValor(),
                    retornarUltimoAndamento.getValor(),
                    retornarUnidadesProcedimentoAberto.getValor(),
                    retornarRelacionados.getValor(),
                    retornarAnexados.getValor()
            );
        } catch (Exception e) {
            log().error("[SEI] Erro ao buscar procedimento: " + e.getMessage(), e);
            return null;
        }
    }



    @Override
    public ProcedimentoResumido consultarProcedimentoIndividual(String idOrgaoProcedimento, String idTipoProcedimento, String idOrgaoUsuario, String siglaUsuario) {
        throw new UnsupportedOperationException("consultarProcedimentoIndividual ainda não implementado");
    }

    @Override
    public String excluirProcesso(String protocoloProcedimento) {
        throw new UnsupportedOperationException("excluirProcesso ainda não implementado");
    }

    @Override
    public String reabrirProcesso(String protocoloProcedimento) {
        throw new UnsupportedOperationException("reabrirProcesso ainda não implementado");
    }

    @Override
    public String concluirProcesso(String protocoloProcedimento) {
        throw new UnsupportedOperationException("concluirProcesso ainda não implementado");
    }

    @Override
    public String enviarProcesso(String protocoloProcedimento, String[] unidadesDestino) {
        throw new UnsupportedOperationException("enviarProcesso ainda não implementado");
    }

    @Override
    public String atribuirProcesso(String protocoloProcedimento, String idUsuario, String sinReabrir) {
        throw new UnsupportedOperationException("atribuirProcesso ainda não implementado");
    }

    @Override
    public TipoPrioridade[] listarTiposPrioridade() {
        try {
            return sei().listarTiposPrioridade(
                    siglaSistema(),
                    identificacaoServico(),
                    idUnidade()
            );
        } catch (Exception e) {
            log().error("[SEI] Erro ao listar tipos de prioridade: " + e.getMessage(), e);
            return null;
        }
    }

    @Override
    public TipoProcedimento[] listarTiposProcedimento(String idUnidade, String idSerie, String sinIndividual) {
        try {
            return sei().listarTiposProcedimento(
                    siglaSistema(),
                    identificacaoServico(),
                    idUnidade,
                    idSerie,
                    sinIndividual
            );
        } catch (Exception e) {
            log().error("[SEI] Erro ao listar tipos de procedimentos: " + e.getMessage(), e);
            return null;
        }
    }

    @Reference
    private DocumentoConfigurationValidator _documentoConfigurationValidator;

    @Reference
    private ArquivoService _arquivoService;
}


package br.com.seatecnologia.sei.integration.api.service.model.builder;

import br.com.seatecnologia.sei.integration.api.service.enums.NivelAcesso;
import br.com.seatecnologia.sei.integration.api.service.ws.Assunto;
import br.com.seatecnologia.sei.integration.api.service.ws.Interessado;
import br.com.seatecnologia.sei.integration.api.service.ws.Procedimento;

/**
 * Builder para construção segura da entidade Procedimento do SEI.
 * Realiza validações obrigatórias de acordo com a documentação v4.1.
 */
public class ProcedimentoBuilder {

    private final Procedimento procedimento;

    private ProcedimentoBuilder() {
        this.procedimento = new Procedimento();
    }

    public static ProcedimentoBuilder builder() {
        return new ProcedimentoBuilder();
    }

    public ProcedimentoBuilder idTipoProcedimento(String idTipoProcedimento) {
        procedimento.setIdTipoProcedimento(idTipoProcedimento);
        return this;
    }

    public ProcedimentoBuilder nivelAcesso(NivelAcesso nivelAcesso) {
        if (nivelAcesso != null) {
            procedimento.setNivelAcesso(String.valueOf(nivelAcesso.getValor()));
        }
        return this;
    }

    public ProcedimentoBuilder especificacao(String especificacao) {
        procedimento.setEspecificacao(especificacao);
        return this;
    }

    public ProcedimentoBuilder assuntos(Assunto[] assuntos) {
        procedimento.setAssuntos(assuntos);
        return this;
    }

    public ProcedimentoBuilder interessados(Interessado[] interessados) {
        procedimento.setInteressados(interessados);
        return this;
    }

    public Procedimento build() {
        if (procedimento.getIdTipoProcedimento() == null || procedimento.getIdTipoProcedimento().isBlank()) {
            throw new IllegalArgumentException("idTipoProcedimento é obrigatório.");
        }
        /* @TODO verificar na api porque da erro se enviar o nivel de acesso.
            no teste feito o nivel de acesso gera erro, pela documentacao se enviar NULL ele infere pelo tipo de procedimento.
        if (procedimento.getNivelAcesso() == null || procedimento.getNivelAcesso().isBlank()) {
            throw new IllegalArgumentException("nivelAcesso é obrigatório.");
        }
        */

        if (procedimento.getAssuntos() == null) {
            throw new IllegalArgumentException("assuntos é obrigatório e não pode ser null. Use array vazio se não houver.");
        }

        if (procedimento.getInteressados() == null) {
            procedimento.setInteressados(new Interessado[0]); // previne erro de serialização
        }

        return procedimento;
    }
}

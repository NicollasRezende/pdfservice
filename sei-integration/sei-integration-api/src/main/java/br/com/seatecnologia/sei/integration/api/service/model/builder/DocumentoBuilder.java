package br.com.seatecnologia.sei.integration.api.service.model.builder;

import br.com.seatecnologia.sei.integration.api.service.enums.NivelAcesso;
import br.com.seatecnologia.sei.integration.api.service.enums.TipoDocumento;
import br.com.seatecnologia.sei.integration.api.service.ws.*;

public class DocumentoBuilder {
    private final Documento documento;
    private final TipoDocumento tipo;

    private DocumentoBuilder(TipoDocumento tipo) {
        this.tipo = tipo;
        this.documento = new Documento();
        this.documento.setTipo(tipo.getCodigo());
    }

    public static DocumentoBuilder builder(TipoDocumento tipo) {
        return new DocumentoBuilder(tipo);
    }

    public DocumentoBuilder idProcedimento(String value) { documento.setIdProcedimento(value); return this; }
    public DocumentoBuilder protocoloProcedimento(String value) { documento.setProtocoloProcedimento(value); return this; }
    public DocumentoBuilder idSerie(String value) { documento.setIdSerie(value); return this; }
    public DocumentoBuilder numero(String value) { documento.setNumero(value); return this; }
    public DocumentoBuilder nomeArvore(String value) { documento.setNomeArvore(value); return this; }
    public DocumentoBuilder dinValor(String value) { documento.setDinValor(value); return this; }
    public DocumentoBuilder data(String value) { documento.setData(value); return this; }
    public DocumentoBuilder descricao(String value) { documento.setDescricao(value); return this; }
    public DocumentoBuilder idTipoConferencia(String value) { documento.setIdTipoConferencia(value); return this; }
    public DocumentoBuilder sinArquivamento(String value) { documento.setSinArquivamento(value); return this; }
    public DocumentoBuilder remetente(Remetente value) { documento.setRemetente(value); return this; }
    public DocumentoBuilder interessados(Interessado[] value) { documento.setInteressados(value); return this; }
    public DocumentoBuilder destinatarios(Destinatario[] value) { documento.setDestinatarios(value); return this; }
    public DocumentoBuilder observacao(String value) { documento.setObservacao(value); return this; }
    public DocumentoBuilder nomeArquivo(String value) { documento.setNomeArquivo(value); return this; }
    public DocumentoBuilder nivelAcesso(NivelAcesso value) {
        if (value != null) documento.setNivelAcesso(String.valueOf(value.getValor()));
        return this;
    }
    public DocumentoBuilder idHipoteseLegal(String value) { documento.setIdHipoteseLegal(value); return this; }
    public DocumentoBuilder conteudo(String value) { documento.setConteudo(value); return this; }
    public DocumentoBuilder conteudoSecoes(SecaoDocumento[] value) { documento.setConteudoSecoes(value); return this; }
    public DocumentoBuilder conteudoMTOM(byte[] value) { documento.setConteudoMTOM(value); return this; }
    public DocumentoBuilder idArquivo(String value) { documento.setIdArquivo(value); return this; }
    public DocumentoBuilder campos(Campo[] value) { documento.setCampos(value); return this; }
    public DocumentoBuilder sinBloqueado(String value) { documento.setSinBloqueado(value); return this; }
    public DocumentoBuilder idItemEtapa(String value) { documento.setIdItemEtapa(value); return this; }

    public Documento build() {
        if (tipo == TipoDocumento.GERADO) {
            if (documento.getDescricao() == null || documento.getDescricao().isBlank()) {
                throw new IllegalArgumentException("Descrição é obrigatória para documentos gerados.");
            }
            if ((documento.getConteudo() == null || documento.getConteudo().isBlank()) && documento.getConteudoMTOM() == null) {
                throw new IllegalArgumentException("Conteúdo ou ConteúdoMTOM é obrigatório para documentos gerados.");
            }
            if (documento.getConteudo() != null && documento.getConteudoMTOM() != null) {
                throw new IllegalArgumentException("Apenas um dos campos Conteúdo ou ConteúdoMTOM deve ser preenchido.");
            }
            documento.setNumero(null);
            documento.setData(null);
            documento.setRemetente(null);
            documento.setNomeArquivo(null);
        } else if (tipo == TipoDocumento.RECEBIDO) {
            if (documento.getRemetente() == null) {
                throw new IllegalArgumentException("Remetente é obrigatório para documentos recebidos.");
            }
            if (documento.getData() == null || documento.getData().isBlank()) {
                throw new IllegalArgumentException("Data é obrigatória para documentos recebidos.");
            }
            if (documento.getNomeArquivo() == null || documento.getNomeArquivo().isBlank()) {
                throw new IllegalArgumentException("Nome do arquivo é obrigatório para documentos recebidos.");
            }
            if (documento.getNumero() == null || documento.getNumero().isBlank()) {
                throw new IllegalArgumentException("Número é obrigatório para documentos recebidos.");
            }
            boolean hasConteudo = documento.getConteudo() != null && !documento.getConteudo().isBlank();
            boolean hasMTOM = documento.getConteudoMTOM() != null;
            boolean hasIdArquivo = documento.getIdArquivo() != null && !documento.getIdArquivo().isBlank();

            if (!hasConteudo && !hasMTOM && !hasIdArquivo) {
                throw new IllegalArgumentException("Conteúdo, ConteúdoMTOM ou IdArquivo é obrigatório para documentos recebidos.");
            }
            if (documento.getConteudo() != null && documento.getConteudoMTOM() != null) {
                throw new IllegalArgumentException("Apenas um dos campos Conteúdo ou ConteúdoMTOM deve ser preenchido.");
            }
            documento.setDescricao(null);
        } else {
            throw new IllegalArgumentException("Tipo de documento inválido: " + tipo);
        }

        return documento;
    }
}

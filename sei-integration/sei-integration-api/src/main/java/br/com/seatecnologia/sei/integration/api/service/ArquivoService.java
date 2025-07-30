package br.com.seatecnologia.sei.integration.api.service;


import br.com.seatecnologia.sei.integration.api.service.ws.ArquivoExtensao;
import br.com.seatecnologia.sei.integration.api.service.ws.Documento;

/**
 * Serviço para manipulação de arquivos no SEI.
 */
public interface ArquivoService {

    /**
     * Adiciona um novo arquivo ao repositório do SEI.
     *
     * @param nome O nome do arquivo (ex: documento.pdf).
     * @param tamanho O tamanho do arquivo em bytes.
     * @param hash O hash MD5 do conteúdo do arquivo, codificado em base64.
     * @param conteudo O conteúdo do arquivo codificado em base64.
     * @return O ID do arquivo no repositório do SEI.
     */
    String adicionarArquivo(String nome, String tamanho, String hash, String conteudo);

    /**
     * Adiciona conteúdo em um arquivo existente no SEI.
     *
     * @param idArquivo O ID do arquivo já existente no SEI.
     * @param conteudo O conteúdo adicional a ser adicionado, em base64.
     * @return Uma string indicando o sucesso da operação.
     */
    String adicionarConteudoArquivo(String idArquivo, String conteudo);

    /**
     * Lista as extensões de arquivo permitidas no SEI.
     *
     * @param idArquivoExtensao Identificador específico da extensão (opcional). Se null, retorna todas.
     * @return Lista de extensões permitidas cadastradas no SEI.
     */
    ArquivoExtensao[] listarExtensoesPermitidas(String idArquivoExtensao);

    void validarExtensaoPermitida(String extensao) throws IllegalArgumentException;

    void validarExtensoesPermitidas(Documento[] documentos);
}

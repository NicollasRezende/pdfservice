package br.com.seatecnologia.sei.integration.service.impl;


import br.com.seatecnologia.sei.integration.api.service.ArquivoService;
import br.com.seatecnologia.sei.integration.api.service.BaseSeiService;
import br.com.seatecnologia.sei.integration.api.service.ws.ArquivoExtensao;
import br.com.seatecnologia.sei.integration.api.service.ws.Documento;
import br.com.seatecnologia.sei.integration.service.validator.DocumentoConfigurationValidator;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Implementação do serviço de arquivos do SEI.
 */
@Component(
        immediate = true,
        service = ArquivoService.class
)
public class ArquivoServiceImpl extends BaseSeiService implements ArquivoService {

    /**
     * {@inheritDoc}
     */
    @Override
    public String adicionarArquivo(String nome, String tamanho, String hash, String conteudo) {
        if (isNullOrEmpty(nome)) {
            throw new IllegalArgumentException("Nome do arquivo não pode ser vazio.");
        }

        validarExtensaoPermitida(nome);

        if (!isNumeric(tamanho)) {
            throw new IllegalArgumentException("Tamanho do arquivo deve ser numérico (em bytes).");
        }

        if (isNullOrEmpty(hash) || isBase64(hash)) {
            throw new IllegalArgumentException("Hash deve estar em base64.");
        }

        if (isNullOrEmpty(conteudo) || isBase64(conteudo)) {
            throw new IllegalArgumentException("Conteúdo deve estar em base64.");
        }

        if (conteudo.length() * 3L / 4L > _documentoConfigurationValidator.getTamanhoMaximoBytes()) {
            throw new IllegalArgumentException("Tamanho do arquivo excede o limite configurado.");
        }

        try {
            return sei().adicionarArquivo(
                    siglaSistema(),
                    identificacaoServico(),
                    idUnidade(),
                    nome,
                    tamanho,
                    hash,
                    conteudo
            );
        } catch (Exception e) {
            throw new RuntimeException("Erro ao adicionar arquivo ao SEI", e);
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String adicionarConteudoArquivo(String idArquivo, String conteudo) {
        if (isNullOrEmpty(idArquivo)) {
            throw new IllegalArgumentException("ID do arquivo não pode ser vazio.");
        }

        if (isNullOrEmpty(conteudo) || isBase64(conteudo)) {
            throw new IllegalArgumentException("Conteúdo deve estar em base64.");
        }

        try {
            return sei().adicionarConteudoArquivo(
                    siglaSistema(),
                    identificacaoServico(),
                    idUnidade(),
                    idArquivo,
                    conteudo
            );
        } catch (Exception e) {
            throw new RuntimeException("Erro ao adicionar conteúdo ao arquivo no SEI", e);
        }
    }

    @Override
    public ArquivoExtensao[] listarExtensoesPermitidas(String idArquivoExtensao) {
        try {
            return sei().listarExtensoesPermitidas(
                    siglaSistema(),
                    identificacaoServico(),
                    idUnidade(),
                    idArquivoExtensao
            );
        } catch (Exception e) {
            log().error("[SEI] Erro ao listar extensões permitidas: " + e.getMessage(), e);
            return null;
        }
    }


    // Utils

    private boolean isNullOrEmpty(String value) {
        return value == null || value.trim().isEmpty();
    }

    private boolean isNumeric(String value) {
        try {
            Long.parseLong(value);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private boolean isBase64(String value) {
        try {
            Base64.getDecoder().decode(value);
            return false;
        } catch (IllegalArgumentException e) {
            return true;
        }
    }

    public void validarExtensoesPermitidas(Documento[] documentos) {
        for (Documento doc : documentos) {
            String nome = doc.getNomeArquivo();
            if (nome != null && !nome.isBlank()) {
                validarExtensaoPermitida(nome);
            }
        }
    }

    public void validarExtensaoPermitida(String nomeArquivo) throws IllegalArgumentException {
        String extensao = nomeArquivo.contains(".")
                ? nomeArquivo.substring(nomeArquivo.lastIndexOf('.') + 1).toLowerCase()
                : "";

        List<String> extensoesPermitidas = Arrays.stream(listarExtensoesPermitidas(null))
                .map(ArquivoExtensao::getExtensao)
                .map(String::toLowerCase)
                .collect(Collectors.toList());

        if(!extensao.isEmpty()){
            if (!extensoesPermitidas.contains(extensao)) {
                throw new IllegalArgumentException("Extensão de arquivo não permitida: " + extensao);
            }
        }
    }

    @Reference
    private DocumentoConfigurationValidator _documentoConfigurationValidator;
}

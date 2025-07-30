package br.com.seatecnologia.sei.integration.service.internal.command;


import br.com.seatecnologia.sei.integration.api.service.ArquivoService;
import br.com.seatecnologia.sei.integration.api.service.DocumentoService;
import br.com.seatecnologia.sei.integration.api.service.ListarHipoteseLegalService;
import br.com.seatecnologia.sei.integration.api.service.ProcedimentoService;
import br.com.seatecnologia.sei.integration.api.service.enums.TipoDocumento;
import br.com.seatecnologia.sei.integration.api.service.model.builder.DocumentoBuilder;
import br.com.seatecnologia.sei.integration.api.service.model.builder.ProcedimentoBuilder;
import br.com.seatecnologia.sei.integration.api.service.ws.*;
import com.liferay.document.library.kernel.service.DLAppLocalService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.repository.model.FileEntry;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;

@Component(
        immediate = true,
        property = {
                "osgi.command.scope=blade",
                "osgi.command.function=testListarHipoteseLegal",
                "osgi.command.function=testListarTiposProcedimento",
                "osgi.command.function=testListarTiposPrioridade",
                "osgi.command.function=criarProcedimentoCompleto",
                "osgi.command.function=testListarTipoArquivosPermitidos",
                "osgi.command.function=testListarSeries"
        },
        service = Object.class
)
public class SeiGogoCommand {

    public void testListarHipoteseLegal() {
        _log.debug("[SeiGogoCommand] > testListarHipoteseLegal: INICIADO");

        try {
            _log.info("Chamando listarHipoteseLegal...");

            HipoteseLegal[] lista = _listarHipoteseLegalService.listarHipoteseLegal();

            if (lista == null || lista.length == 0) {
                _log.warn("Nenhuma hipótese legal retornada.");
                return;
            }

            for (HipoteseLegal hl : lista) {
                _log.info("📄 ID: " + hl.getIdHipoteseLegal() + " | Nome: " + hl.getNome());
            }

        } catch (Exception e) {
            _log.error("[SeiGogoCommand] > testListarHipoteseLegal: ERRO ao chamar listarHipoteseLegal", e);
        } finally {
            _log.debug("[SeiGogoCommand] > testListarHipoteseLegal: FINALIZADO");
        }
    }

    public void testListarTiposProcedimento() {
        _log.debug("[SeiGogoCommand] > ListarTiposProcedimento: INICIADO");
        try {
            _log.info("Chamando ListarTiposProcedimento...");
            TipoProcedimento[] tipos = _procedimentoService.listarTiposProcedimento(null, null, null);

            if (tipos == null || tipos.length == 0) {
                _log.info("[SeiGogoCommand] > ListarTiposProcedimento: Nenhum resultado encontrado");
            } else {
                for (TipoProcedimento tipo : tipos) {
                    _log.info("ID: " + tipo.getIdTipoProcedimento() + " | Nome: " + tipo.getNome());
                }
            }
        } catch (Exception e) {
            _log.error("[SeiGogoCommand] > ListarTiposProcedimento: ERRO ao chamar ListarTiposProcedimento", e);
            System.out.println("Erro ao chamar ListarTiposProcedimento: " + e.getMessage());
        } finally {
            _log.debug("[SeiGogoCommand] > ListarTiposProcedimento: FINALIZADO");
            System.out.println("Listagem de tipos de procedimento finalizada.");
        }
    }

    public void testListarTiposPrioridade() {
        _log.debug("[SeiGogoCommand] > testListarTiposPrioridade: INICIADO");
        try {
            _log.info("Chamando testListarTiposPrioridade...");
            List<String> resultado = Arrays.stream(_procedimentoService.listarTiposPrioridade())
                    .map(TipoPrioridade::getNome)
                    .toList();

            _log.info("[SeiGogoCommand] > testListarTiposPrioridade: RESULTADO: " + resultado.stream().map(String::valueOf)
                    .reduce((a, b) -> a + ", " + b).orElse("Nenhum resultado encontrado"));
        } catch (Exception e) {
            _log.error("[SeiGogoCommand] > testListarTiposPrioridade: ERRO ao chamar testListarTiposPrioridade", e);
            System.out.println("Erro ao chamar testListarTiposPrioridade: " + e.getMessage());
        } finally {
            _log.debug("[SeiGogoCommand] > testListarTiposPrioridade: FINALIZADO");
            System.out.println("Listagem de tipos de testListarTiposPrioridade finalizada.");
        }
    }

    public void testListarTipoArquivosPermitidos() {
        _log.debug("[SeiGogoCommand] > ListarTipoArquivosPermitidos: INICIADO");
        try {
            _log.info("Chamando ListarTipoArquivosPermitidos...");
            List<String> resultado = Arrays.stream(_arquivoService.listarExtensoesPermitidas(null))
                    .map(ArquivoExtensao::getExtensao)
                    .toList();

            _log.info("[SeiGogoCommand] > ListarTipoArquivosPermitidos: RESULTADO: " + resultado.stream().map(String::valueOf)
                    .reduce((a, b) -> a + ", " + b).orElse("Nenhum resultado encontrado"));
        } catch (Exception e) {
            _log.error("[SeiGogoCommand] > ListarTipoArquivosPermitidos: ERRO ao chamar ListarTipoArquivosPermitidos", e);
            System.out.println("Erro ao chamar ListarTipoArquivosPermitidos: " + e.getMessage());
        } finally {
            _log.debug("[SeiGogoCommand] > ListarTipoArquivosPermitidos: FINALIZADO");
            System.out.println("Listagem ListarTipoArquivosPermitidos finalizada.");
        }
    }

    public void testListarSeries(String idTipoProcedimento) {
        _log.info("Listando séries...");
        Serie[] series = _documentoService.listarSeries(idTipoProcedimento);
        if (series != null) {
            for (Serie s : series) {
                _log.info("ID: " + s.getIdSerie() + " | Nome: " + s.getNome());
            }
        } else {
            _log.warn("Nenhuma série encontrada.");
        }
    }


    public void criarProcedimentoCompleto(long fileEntryId) {
        _log.info("[SEI] Iniciando criacao de procedimento completo com arquivo ID: " + fileEntryId);

        try {
            FileEntry fileEntry = _dlAppLocalService.getFileEntry(fileEntryId);
            ArquivoInfo arquivoInfo = processarArquivo(fileEntry);

            // pra criar o documeto recebido não é necessário o idArquivo,
            // pois o documento é criado com o conteúdo base64 diretamente.
            /*String idArquivo = _arquivoService.adicionarArquivo(
                    fileEntry.getFileName(),
                    arquivoInfo.tamanho(),
                    arquivoInfo.hash(),
                    arquivoInfo.base64()
            );*/

            Documento documento = criarDocumentoRecebido(fileEntry.getFileName(), arquivoInfo.base64);
            Procedimento procedimento = criarProcedimentoPadrao();

            RetornoGeracaoProcedimento retorno = _procedimentoService.gerarProcedimento(
                    procedimento,
                    new Documento[]{documento},
                    null,
                    null,
                    "N",
                    "N",
                    null,
                    null,
                    "N",
                    null,
                    null,
                    null,
                    null,
                    "N"
            );

            _log.info("[SEI] Procedimento criado com sucesso! Protocolo: " + retorno.getIdProcedimento());

        } catch (Exception e) {
            _log.error("[SEI] Erro ao criar procedimento completo: " + e.getMessage(), e);
        }
    }

    private Documento criarDocumentoRecebido(String fileName, String base64) {
        Remetente remetente = new Remetente();
        remetente.setNome("Remetente Teste");

        return DocumentoBuilder
                .builder(TipoDocumento.RECEBIDO)
                .idSerie("466")
                .numero("DOC-TESTE-" + System.currentTimeMillis())
                .nomeArquivo(fileName)
                .conteudo(base64)
                .data(LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")))
                .descricao(null)
                .nivelAcesso(null)
                .idHipoteseLegal("23")
                .remetente(remetente)
                .interessados(new Interessado[]{new Interessado()})
                .build();
    }

    private Procedimento criarProcedimentoPadrao() {
        return ProcedimentoBuilder.builder()
                .idTipoProcedimento("100000783")
                .nivelAcesso(null)
                .especificacao("Criado via Gogo Teste")
                .assuntos(new Assunto[]{criarAssuntoPadrao()})
                .interessados(new Interessado[]{new Interessado()})
                .build();
    }

    private Assunto criarAssuntoPadrao() {
        Assunto assunto = new Assunto();
        assunto.setCodigoEstruturado("10.00.00.00");
        assunto.setDescricao("Atividade-Fim");
        return assunto;
    }

    private ArquivoInfo processarArquivo(FileEntry fileEntry) throws IOException, NoSuchAlgorithmException, PortalException {
        try (InputStream inputStream = fileEntry.getContentStream()) {
            byte[] buffer = inputStream.readAllBytes();
            String base64 = Base64.getEncoder().encodeToString(buffer);
            String tamanho = String.valueOf(buffer.length);

            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] digest = md.digest(buffer);
            StringBuilder sb = new StringBuilder();
            for (byte b : digest) {
                sb.append(String.format("%02x", b));
            }
            String hash = sb.toString();

            return new ArquivoInfo(base64, tamanho, hash);
        }
    }

    private record ArquivoInfo(String base64, String tamanho, String hash) {}

    @Reference
    private ListarHipoteseLegalService _listarHipoteseLegalService;

    @Reference
    private ProcedimentoService _procedimentoService;

    @Reference
    private ArquivoService _arquivoService;

    @Reference
    private DocumentoService _documentoService;

    @Reference
    private DLAppLocalService _dlAppLocalService;

    Log _log = LogFactoryUtil.getLog(SeiGogoCommand.class);
}


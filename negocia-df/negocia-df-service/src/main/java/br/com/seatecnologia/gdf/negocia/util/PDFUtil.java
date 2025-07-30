package br.com.seatecnologia.gdf.negocia.util;

import br.com.seatecnologia.gdf.negocia.model.*;
import com.liferay.document.library.kernel.service.DLAppLocalServiceUtil;
import com.liferay.document.library.util.DLURLHelperUtil;
import com.liferay.document.library.kernel.exception.NoSuchFileEntryException;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.repository.model.FileEntry;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.document.library.kernel.model.DLVersionNumberIncrease;

import org.osgi.service.component.annotations.Component;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;

import java.text.SimpleDateFormat;
import java.util.*;


import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.xml.bind.DatatypeConverter;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;

@Component(service = PDFUtil.class)
public class PDFUtil {

    private static final Log _log = LogFactoryUtil.getLog(PDFUtil.class);
    private static final ClientBuilder clientBuilder = ClientBuilder.newBuilder();

    public static FileEntry createZipToDL(long propostaId, byte[] zipBytes, String fileName,
                                          long userId, long groupId, long folderId, ServiceContext serviceContext) throws Exception {
        
        String mimeType = "application/zip";
        
        try {
            FileEntry existingFileEntry = DLAppLocalServiceUtil.getFileEntry(groupId, folderId, fileName);
            
            return DLAppLocalServiceUtil.updateFileEntry(
                    userId, existingFileEntry.getFileEntryId(), fileName, mimeType,
                    existingFileEntry.getTitle(), fileName, "", "",
                    DLVersionNumberIncrease.MINOR, zipBytes, null, null, null, serviceContext);
                    
        } catch (NoSuchFileEntryException e) {
            return DLAppLocalServiceUtil.addFileEntry(
                    "", userId, groupId, folderId, fileName,
                    mimeType, fileName, fileName, "", "",
                    zipBytes, null, null, null, serviceContext);
        }
    }

    public static String makePropostaFormHtml(Proposta proposta,
                                               QualificacaoCompleta qualificacao, Endereco enderecoQualificacao, Advogado advogado,
                                               List<CredorProposta> credores, List<Garantia> garantias,
                                               FundamentacaoPedido fundamentacoes, List<DemaisPartes> demaisPartes,
                                               AdministradorJudicial administradorJudicial, List<AcaoJudicial> acoesJudiciais,
                                               List<RelacaoCredor> relacaoCredores, List<BensDireitosRequerente> bensRequerentes,
                                               Declaracao declaracao, List<IdentificacaoDebitos> identificacaoDebitos,
                                               Map<String, List<String>> demonstracoesCotabeis, List<String> documentosComprobatorios,
                                               List<Endereco> enderecos, Map<Garantia, Map<QualificacaoCompleta, Endereco>> garantiasList, User user) {

        ClassLoaderTemplateResolver resolver = new ClassLoaderTemplateResolver();
        resolver.setPrefix("templates/");
        resolver.setSuffix(".html");
        resolver.setTemplateMode("HTML");
        resolver.setCharacterEncoding("UTF-8");

        TemplateEngine templateEngine = new TemplateEngine();
        templateEngine.setTemplateResolver(resolver);

        Context context = replacePropostaValues(proposta, qualificacao, enderecoQualificacao, advogado,
                credores, garantias, fundamentacoes, demaisPartes, administradorJudicial,
                acoesJudiciais, relacaoCredores, bensRequerentes, declaracao, identificacaoDebitos,
                demonstracoesCotabeis, documentosComprobatorios, enderecos, garantiasList, user);

        return templateEngine.process("proposta", context);
    }

    private static Context replacePropostaValues(Proposta proposta,
                                                 QualificacaoCompleta qualificacao, Endereco enderecoQualificacao, Advogado advogado,
                                                 List<CredorProposta> credores, List<Garantia> garantias,
                                                 FundamentacaoPedido fundamentacoes, List<DemaisPartes> demaisPartes,
                                                 AdministradorJudicial administradorJudicial, List<AcaoJudicial> acoesJudiciais,
                                                 List<RelacaoCredor> relacaoCredores, List<BensDireitosRequerente> bensRequerentes,
                                                 Declaracao declaracao, List<IdentificacaoDebitos> identificacaoDebitos,
                                                 Map<String, List<String>> demonstracoesCotabeis, List<String> documentosComprobatorios,
                                                 List<Endereco> enderecos, Map<Garantia, Map<QualificacaoCompleta, Endereco>> garantiasList, User user) {

        Context context = new Context();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdfHora = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        context.setVariable("usuarioLogado", qualificacao.getNomeRazaoSocial());
        context.setVariable("cpfCnpjLogado", qualificacao.getCpfCnpj());
        context.setVariable("dataEnvio", proposta.getCreateDate());
        context.setVariable("tipoPreenchimento", qualificacao.getTipoPessoa());

        if (qualificacao != null) {
            Map<String, Object> dadosPessoa = new HashMap<>();
            dadosPessoa.put("nomeRazaoSocial", qualificacao.getNomeRazaoSocial());
            dadosPessoa.put("nomeFantasia", Validator.isNotNull(qualificacao.getNomeFantasia()) ? qualificacao.getNomeFantasia() : "-");
            dadosPessoa.put("representanteLegal", Validator.isNotNull(qualificacao.getRepresentanteLegal()) ? qualificacao.getRepresentanteLegal() : "-");
            dadosPessoa.put("cpfCnpj", qualificacao.getCpfCnpj());
            dadosPessoa.put("numeroCfDf", qualificacao.getNumeroCfdf());
            dadosPessoa.put("domicilioFiscal", Validator.isNotNull(qualificacao.getDomicilioFiscal()) ? qualificacao.getDomicilioFiscal() : "-");
            dadosPessoa.put("email", qualificacao.getEmail());
            dadosPessoa.put("telefone", qualificacao.getTelefone());
            dadosPessoa.put("whatsapp", qualificacao.getWhatsapp());

            if (qualificacao.getEnderecoPostalId() > 0 && enderecos != null) {
                for (Endereco endereco : enderecos) {
                    if (endereco.getEnderecoId() == qualificacao.getEnderecoPostalId()) {
                        dadosPessoa.put("cep", endereco.getCep());
                        dadosPessoa.put("endereco", endereco.getEndereco());
                        dadosPessoa.put("numero", String.valueOf(endereco.getNumero()));
                        dadosPessoa.put("complemento", Validator.isNotNull(endereco.getComplemento()) ? endereco.getComplemento() : "-");
                        dadosPessoa.put("estado", endereco.getEstado());
                        dadosPessoa.put("municipio", endereco.getMunicipio());
                        dadosPessoa.put("bairro", endereco.getBairro());
                        break;
                    }
                }
            }
            context.setVariable("dadosPessoa", dadosPessoa);
        }

        // Participantes pessoa jurídica
        List<Map<String, Object>> participantesPJ = new ArrayList<>();
        if (demaisPartes != null) {
            for (DemaisPartes parte : demaisPartes) {
                Map<String, Object> participante = new HashMap<>();
                participante.put("tipoParticipacao", Validator.isNotNull(parte.getTipoParte()) ? parte.getTipoParte() : "-");

                QualificacaoCompleta qualificacaoParticipante = null;
                try {
                    qualificacaoParticipante = br.com.seatecnologia.gdf.negocia.service.QualificacaoCompletaLocalServiceUtil
                            .getQualificacaoCompleta(parte.getQualificacaoId());
                } catch (Exception e) {
                    _log.warn("Não foi possível buscar qualificação do participante: " + e.getMessage());
                }

                if (qualificacaoParticipante != null) {
                    participante.put("nomeRazaoSocial", qualificacaoParticipante.getNomeRazaoSocial());
                    participante.put("nomeFantasia", Validator.isNotNull(qualificacaoParticipante.getNomeFantasia()) ? qualificacaoParticipante.getNomeFantasia() : "-");
                    participante.put("representanteLegal", Validator.isNotNull(qualificacaoParticipante.getRepresentanteLegal()) ? qualificacaoParticipante.getRepresentanteLegal() : "-");
                    participante.put("cpfCnpj", qualificacaoParticipante.getCpfCnpj());
                    participante.put("numeroCfDf", Validator.isNotNull(qualificacaoParticipante.getNumeroCfdf()) ? qualificacaoParticipante.getNumeroCfdf() : "-");
                    participante.put("domicilioFiscal", Validator.isNotNull(qualificacaoParticipante.getDomicilioFiscal()) ? qualificacaoParticipante.getDomicilioFiscal() : "-");
                    participante.put("email", qualificacaoParticipante.getEmail());
                    participante.put("telefone", qualificacaoParticipante.getTelefone());
                    participante.put("whatsapp", qualificacaoParticipante.getWhatsapp());

                    if (qualificacaoParticipante.getEnderecoPostalId() > 0 && enderecos != null) {
                        for (Endereco endereco : enderecos) {
                            if (endereco.getEnderecoId() == qualificacaoParticipante.getEnderecoPostalId()) {
                                participante.put("cep", endereco.getCep());
                                participante.put("endereco", endereco.getEndereco());
                                participante.put("numero", String.valueOf(endereco.getNumero()));
                                participante.put("complemento", Validator.isNotNull(endereco.getComplemento()) ? endereco.getComplemento() : "-");
                                participante.put("estado", endereco.getEstado());
                                participante.put("municipio", endereco.getMunicipio());
                                participante.put("bairro", endereco.getBairro());
                                break;
                            }
                        }
                    } else {
                        participante.put("cep", "-");
                        participante.put("endereco", "-");
                        participante.put("numero", "-");
                        participante.put("complemento", "-");
                        participante.put("estado", "-");
                        participante.put("municipio", "-");
                        participante.put("bairro", "-");
                    }
                } else {
                    participante.put("nomeRazaoSocial", "-");
                    participante.put("nomeFantasia", "-");
                    participante.put("representanteLegal", "-");
                    participante.put("cpfCnpj", "-");
                    participante.put("numeroCfDf", "-");
                    participante.put("domicilioFiscal", "-");
                    participante.put("cep", "-");
                    participante.put("endereco", "-");
                    participante.put("numero", "-");
                    participante.put("complemento", "-");
                    participante.put("estado", "-");
                    participante.put("municipio", "-");
                    participante.put("bairro", "-");
                    participante.put("email", "-");
                    participante.put("telefone", "-");
                    participante.put("whatsapp", "-");
                }

                participantesPJ.add(participante);
            }
        }
        context.setVariable("participantesPessoaJuridica", participantesPJ);

        if (administradorJudicial != null) {
            Map<String, Object> adminJudicial = new HashMap<>();
            adminJudicial.put("empresaEmRegime", Validator.isNotNull(administradorJudicial.getRegimeFalencia()) ? (administradorJudicial.getRegimeFalencia() ? "Sim" : "Não") : "-");
            adminJudicial.put("tipoRecuperacao", Validator.isNotNull(administradorJudicial.getRecuperacao()) ?  administradorJudicial.getRecuperacao() : "-");
            adminJudicial.put("numeroProcesso", Validator.isNotNull(administradorJudicial.getNumeroProcesso()) ? administradorJudicial.getNumeroProcesso() : "-");
            adminJudicial.put("anexoRecuperacao", "");

            QualificacaoCompleta qualificacaoAdmin = null;
            try {
                qualificacaoAdmin = br.com.seatecnologia.gdf.negocia.service.QualificacaoCompletaLocalServiceUtil
                        .getQualificacaoCompleta(administradorJudicial.getQualificacaoId());
            } catch (Exception e) {
                _log.warn("Não foi possível buscar qualificação do administrador judicial: " + e.getMessage());
            }

            if (qualificacaoAdmin != null) {
                adminJudicial.put("tipoPessoa", qualificacaoAdmin.getTipoPessoa());
                adminJudicial.put("nomeRazaoSocial", qualificacaoAdmin.getNomeRazaoSocial());
                adminJudicial.put("nomeFantasia", Validator.isNotNull(qualificacaoAdmin.getNomeFantasia()) ? qualificacaoAdmin.getNomeFantasia() : "-");
                adminJudicial.put("representanteLegal", Validator.isNotNull(qualificacaoAdmin.getRepresentanteLegal()) ? qualificacaoAdmin.getRepresentanteLegal() : "-");
                adminJudicial.put("cpfCnpj", qualificacaoAdmin.getCpfCnpj());
                adminJudicial.put("numeroCfDf", Validator.isNotNull(qualificacaoAdmin.getNumeroCfdf()) ? qualificacaoAdmin.getNumeroCfdf() : "-");
                adminJudicial.put("domicilioFiscal", Validator.isNotNull(qualificacaoAdmin.getDomicilioFiscal()) ? qualificacaoAdmin.getDomicilioFiscal() : "-");
                adminJudicial.put("email", qualificacaoAdmin.getEmail());
                adminJudicial.put("telefone", qualificacaoAdmin.getTelefone());
                adminJudicial.put("whatsapp", qualificacaoAdmin.getWhatsapp());

                if (qualificacaoAdmin.getEnderecoPostalId() > 0 && enderecos != null) {
                    for (Endereco endereco : enderecos) {
                        if (endereco.getEnderecoId() == qualificacaoAdmin.getEnderecoPostalId()) {
                            adminJudicial.put("cep", endereco.getCep());
                            adminJudicial.put("endereco", endereco.getEndereco());
                            adminJudicial.put("numero", String.valueOf(endereco.getNumero()));
                            adminJudicial.put("complemento", Validator.isNotNull(endereco.getComplemento()) ? endereco.getComplemento() : "-");
                            adminJudicial.put("estado", endereco.getEstado());
                            adminJudicial.put("municipio", endereco.getMunicipio());
                            adminJudicial.put("bairro", endereco.getBairro());
                            break;
                        }
                    }
                } else {
                    adminJudicial.put("cep", "-");
                    adminJudicial.put("endereco", "-");
                    adminJudicial.put("numero", "-");
                    adminJudicial.put("complemento", "-");
                    adminJudicial.put("estado", "-");
                    adminJudicial.put("municipio", "-");
                    adminJudicial.put("bairro", "-");
                }
            } else {
                adminJudicial.put("tipoPessoa", "-");
                adminJudicial.put("nomeRazaoSocial", "-");
                adminJudicial.put("nomeFantasia", "-");
                adminJudicial.put("representanteLegal", "-");
                adminJudicial.put("cpfCnpj", "-");
                adminJudicial.put("numeroCfDf", "-");
                adminJudicial.put("domicilioFiscal", "-");
                adminJudicial.put("cep", "-");
                adminJudicial.put("endereco", "-");
                adminJudicial.put("numero", "-");
                adminJudicial.put("complemento", "-");
                adminJudicial.put("estado", "-");
                adminJudicial.put("municipio", "-");
                adminJudicial.put("bairro", "-");
                adminJudicial.put("email", "-");
                adminJudicial.put("telefone", "-");
                adminJudicial.put("whatsapp", "-");
            }
            context.setVariable("administradorJudicial", adminJudicial);
        }

        // Advogado
        if (advogado != null) {
            Map<String, Object> advogadoData = new HashMap<>();
            advogadoData.put("numeroOab", advogado.getNumeroOab());
            advogadoData.put("seccional", advogado.getSeccional());
            advogadoData.put("anexoOab", "");

            QualificacaoCompleta qualificacaoAdvogado = null;
            try {
                qualificacaoAdvogado = br.com.seatecnologia.gdf.negocia.service.QualificacaoCompletaLocalServiceUtil
                        .getQualificacaoCompleta(advogado.getQualificacaoId());
            } catch (Exception e) {
                _log.warn("Não foi possível buscar qualificação do advogado: " + e.getMessage());
            }

            if (qualificacaoAdvogado != null) {
                advogadoData.put("nome", qualificacaoAdvogado.getNomeRazaoSocial());
                advogadoData.put("cpf", qualificacaoAdvogado.getCpfCnpj());
                advogadoData.put("email", qualificacaoAdvogado.getEmail());
                advogadoData.put("telefone", qualificacaoAdvogado.getTelefone());
                advogadoData.put("whatsapp", qualificacaoAdvogado.getWhatsapp());

                if (qualificacaoAdvogado.getEnderecoPostalId() > 0 && enderecos != null) {
                    for (Endereco endereco : enderecos) {
                        if (endereco.getEnderecoId() == qualificacaoAdvogado.getEnderecoPostalId()) {
                            advogadoData.put("cep", endereco.getCep());
                            advogadoData.put("endereco", endereco.getEndereco());
                            advogadoData.put("numero", String.valueOf(endereco.getNumero()));
                            advogadoData.put("complemento", Validator.isNotNull(endereco.getComplemento()) ? endereco.getComplemento() : "");
                            advogadoData.put("estado", endereco.getEstado());
                            advogadoData.put("municipio", endereco.getMunicipio());
                            advogadoData.put("bairro", endereco.getBairro());
                            break;
                        }
                    }
                } else {
                    advogadoData.put("cep", "");
                    advogadoData.put("endereco", "");
                    advogadoData.put("numero", "");
                    advogadoData.put("complemento", "");
                    advogadoData.put("estado", "");
                    advogadoData.put("municipio", "");
                    advogadoData.put("bairro", "");
                }
            } else {
                advogadoData.put("nome", "");
                advogadoData.put("cpf", "");
                advogadoData.put("cep", "");
                advogadoData.put("endereco", "");
                advogadoData.put("numero", "");
                advogadoData.put("complemento", "");
                advogadoData.put("estado", "");
                advogadoData.put("municipio", "");
                advogadoData.put("bairro", "");
                advogadoData.put("email", "");
                advogadoData.put("telefone", "");
                advogadoData.put("whatsapp", "");
            }

            context.setVariable("advogado", advogadoData);
        }

        context.setVariable("anexoProcuracao", "");

        List<Map<String, Object>> debitosData = new ArrayList<>();
        if (identificacaoDebitos != null) {
            for (IdentificacaoDebitos debito : identificacaoDebitos) {
                Map<String, Object> debitoMap = new HashMap<>();
                debitoMap.put("inscricaoDividaAtiva", debito.getInscricaoDividaAtiva());
                debitoMap.put("natureza", debito.getNatureza());
                debitoMap.put("situacao", debito.getSituacao());
                debitoMap.put("garantidoJudicialmente", debito.getGarantidoJudicialmente());
                debitoMap.put("fundamentacao", fundamentacoes != null ? fundamentacoes.getFundamentacaoPedido() : "");
                debitoMap.put("anexoComprobatorio", "");
                debitosData.add(debitoMap);
            }
        }
        context.setVariable("debitos", debitosData);

        context.setVariable("tipoDevedor", "");

        List<Map<String, Object>> garantiasData = new ArrayList<>();
        if (garantiasList != null) {
            for (Map.Entry<Garantia, Map<QualificacaoCompleta, Endereco>> entry : garantiasList.entrySet()) {
                Garantia garantia = entry.getKey();
                Map<QualificacaoCompleta, Endereco> proprietarioData = entry.getValue();
                Map<String, Object> garantiaMap = new HashMap<>();
                garantiaMap.put("tipo", garantia.getTipoGarantia());
                garantiaMap.put("outras", garantia.getOutras());
                garantiaMap.put("descricaoBem", garantia.getDescricaoBem());
                garantiaMap.put("valorEstimado", String.format("R$ %.2f", garantia.getValorEstimado()));
                garantiaMap.put("localizacao", garantia.getLocalizacao());

                Map<String, Object> proprietario = new HashMap<>();

                // Usar dados pré-processados do proprietário
                if (!proprietarioData.isEmpty()) {
                    Map.Entry<QualificacaoCompleta, Endereco> proprietarioEntry = proprietarioData.entrySet().iterator().next();
                    QualificacaoCompleta qualificacaoProprietario = proprietarioEntry.getKey();
                    Endereco enderecoProprietario = proprietarioEntry.getValue();

                    proprietario.put("tipoPessoa", qualificacaoProprietario.getTipoPessoa());
                    proprietario.put("nomeRazaoSocial", qualificacaoProprietario.getNomeRazaoSocial());
                    proprietario.put("nomeFantasia", Validator.isNotNull(qualificacaoProprietario.getNomeFantasia()) ? qualificacaoProprietario.getNomeFantasia() : "-");
                    proprietario.put("representanteLegal", Validator.isNotNull(qualificacaoProprietario.getRepresentanteLegal()) ? qualificacaoProprietario.getRepresentanteLegal() : "-");
                    proprietario.put("cpfCnpj", qualificacaoProprietario.getCpfCnpj());
                    proprietario.put("numeroCfDf", Validator.isNotNull(qualificacaoProprietario.getNumeroCfdf()) ? qualificacaoProprietario.getNumeroCfdf() : "-");
                    proprietario.put("domicilioFiscal", Validator.isNotNull(qualificacaoProprietario.getDomicilioFiscal()) ? qualificacaoProprietario.getDomicilioFiscal() : "-");
                    proprietario.put("email", qualificacaoProprietario.getEmail());
                    proprietario.put("telefone", qualificacaoProprietario.getTelefone());
                    proprietario.put("whatsapp", qualificacaoProprietario.getWhatsapp());

                    if (enderecoProprietario != null) {
                        proprietario.put("cep", enderecoProprietario.getCep());
                        proprietario.put("endereco", enderecoProprietario.getEndereco());
                        proprietario.put("numero", String.valueOf(enderecoProprietario.getNumero()));
                        proprietario.put("complemento", Validator.isNotNull(enderecoProprietario.getComplemento()) ? enderecoProprietario.getComplemento() : "-");
                        proprietario.put("estado", enderecoProprietario.getEstado());
                        proprietario.put("municipio", enderecoProprietario.getMunicipio());
                        proprietario.put("bairro", enderecoProprietario.getBairro());
                    } else {
                        proprietario.put("cep", "-");
                        proprietario.put("endereco", "-");
                        proprietario.put("numero", "-");
                        proprietario.put("complemento", "-");
                        proprietario.put("estado", "-");
                        proprietario.put("municipio", "-");
                        proprietario.put("bairro", "-");
                    }
                } else {
                    proprietario.put("tipoPessoa", "-");
                    proprietario.put("nomeRazaoSocial", "-");
                    proprietario.put("nomeFantasia", "-");
                    proprietario.put("representanteLegal", "-");
                    proprietario.put("cpfCnpj", "-");
                    proprietario.put("numeroCfDf", "-");
                    proprietario.put("domicilioFiscal", "-");
                    proprietario.put("cep", "-");
                    proprietario.put("endereco", "-");
                    proprietario.put("numero", "-");
                    proprietario.put("complemento", "-");
                    proprietario.put("estado", "-");
                    proprietario.put("municipio", "-");
                    proprietario.put("bairro", "-");
                    proprietario.put("email", "-");
                    proprietario.put("telefone", "-");
                    proprietario.put("whatsapp", "-");
                }
                garantiaMap.put("proprietario", proprietario);

                Map<String, Object> registro = new HashMap<>();

                if (garantia.getDadosRegistroId() > 0) {
                    DadosRegistro dadosRegistro = null;
                    try {
                        dadosRegistro = br.com.seatecnologia.gdf.negocia.service.DadosRegistroLocalServiceUtil
                                .getDadosRegistro(garantia.getDadosRegistroId());
                    } catch (Exception e) {
                        _log.warn("Não foi possível buscar dados de registro da garantia: " + e.getMessage());
                    }

                    if (dadosRegistro != null) {
                        registro.put("matriculaImovel", Validator.isNotNull(dadosRegistro.getMatriculaImovel()) ? dadosRegistro.getMatriculaImovel() : "-");
                        registro.put("cartorio", Validator.isNotNull(dadosRegistro.getCartorioRegistro()) ? dadosRegistro.getCartorioRegistro() : "-");
                        registro.put("renavam", Validator.isNotNull(dadosRegistro.getRenavam()) ? dadosRegistro.getRenavam() : "-");
                        registro.put("outros", Validator.isNotNull(dadosRegistro.getLocalizacao()) ? dadosRegistro.getLocalizacao() : "-");
                    } else {
                        registro.put("matriculaImovel", "-");
                        registro.put("cartorio", "-");
                        registro.put("renavam", "-");
                        registro.put("outros", "-");
                    }
                } else {
                    registro.put("matriculaImovel", "-");
                    registro.put("cartorio", "-");
                    registro.put("renavam", "-");
                    registro.put("outros", "-");
                }
                garantiaMap.put("registro", registro);

                Map<String, Object> anuencia = new HashMap<>();
                anuencia.put("declaracaoAnuencia", garantia.getDeclaracaoAnuencia());
                anuencia.put("anexoDeclaracao", "");
                garantiaMap.put("anuencia", anuencia);

                garantiasData.add(garantiaMap);
            }
        }
        context.setVariable("garantias", garantiasData);

        if (declaracao != null) {
            Map<String, Object> declaracoes = new HashMap<>();
            declaracoes.put("cumprimentoCompromissosLegais", declaracao.getCumpreCompromissos());
            declaracoes.put("naoAlienacaoBens", declaracao.getNaoAlienacaoBensSemComunicacao());
            declaracoes.put("reconhecimentoGrupoEconomico", declaracao.getReconheceGrupoOuSucessao());
            declaracoes.put("compromissoConfidencialidade", declaracao.getCompromissoConfidencialidade());
            declaracoes.put("cienciaProcessoEletronico", declaracao.getCienciaProcesso());
            declaracoes.put("vedacaoUsoAbusivo", declaracao.getAbusoTransacao());
            declaracoes.put("proibicaoInterposicao", declaracao.getAbusoTransacao());
            declaracoes.put("desistenciaImpugnacoes", declaracao.getImpugnacaoRecursos());
            declaracoes.put("renunciaAcoesJudiciais", declaracao.getRenunciaRecursos());
            declaracoes.put("peticionamentoProcessos", declaracao.getPeticionamentoProcessos());
            declaracoes.put("prestacaoInformacoes", declaracao.getPrestacaoInformacoes());
            declaracoes.put("vedacaoOmissaoInformacoes", declaracao.getOmissaoInformacoes());
            declaracoes.put("manutencaoGarantias", declaracao.getManutencaoGarantias());
            context.setVariable("declaracoes", declaracoes);
        }

        List<Map<String, Object>> acoesJudiciaisData = new ArrayList<>();
        if (acoesJudiciais != null) {
            for (AcaoJudicial acao : acoesJudiciais) {
                Map<String, Object> acaoMap = new HashMap<>();
                acaoMap.put("numeroProcesso", acao.getNumeroProcesso());
                acaoMap.put("orgaoTribunal", acao.getOrgaoTribunal());
                acaoMap.put("unidadeJudiciaria", acao.getUnidadeVara());
                acaoMap.put("parteAutora", acao.getParteAutora());
                acaoMap.put("parteRe", acao.getParteRe());
                acaoMap.put("observacoes", acao.getObservacoes());
                acoesJudiciaisData.add(acaoMap);
            }
        }
        context.setVariable("acoesJudiciais", acoesJudiciaisData);

        Map<String, Object> documentacaoAdicional = new HashMap<>();
        documentacaoAdicional.put("balancoPatrimonial", "");
        documentacaoAdicional.put("demonstracoesResultados", new ArrayList<String>());
        documentacaoAdicional.put("relatoriosGerenciais", "");
        documentacaoAdicional.put("descricaoSociedades", "");
        documentacaoAdicional.put("outrosDocumentosContabeis", "");
        context.setVariable("documentacaoAdicional", documentacaoAdicional);



        List<Map<String, Object>> credoresData = new ArrayList<>();
        if (relacaoCredores != null) {
            for (RelacaoCredor credor : relacaoCredores) {
                Map<String, Object> credorMap = new HashMap<>();
                credorMap.put("nome", credor.getNomeCredor());
                credorMap.put("naturezaCredito", credor.getNaturezaCredito());
                credorMap.put("classificacaoCredito", credor.getClassificacaoCredito());
                credorMap.put("valor", String.format("R$ %.2f", credor.getValorAtualizado()));
                credorMap.put("referenciaContabil", credor.getReferenciaContabil());
                credoresData.add(credorMap);
            }
        }
        context.setVariable("credores", credoresData);

        List<Map<String, Object>> bensRequerenteData = new ArrayList<>();
        if (bensRequerentes != null) {
            for (BensDireitosRequerente bem : bensRequerentes) {
                Map<String, Object> bemMap = new HashMap<>();
                bemMap.put("descricao", bem.getDescricao());
                bemMap.put("localizacaoDestinacao", bem.getLocalizacaoDestinacao());
                bemMap.put("laudoAvaliacao", "");
                bensRequerenteData.add(bemMap);
            }
        }
        context.setVariable("bensRequerente", bensRequerenteData);

        List<Map<String, Object>> documentosComprobatoriosData = new ArrayList<>();
        if (documentosComprobatorios != null) {
            for (String nomeDocumento : documentosComprobatorios) {
                Map<String, Object> docMap = new HashMap<>();
                docMap.put("tipoDocumento", "Documento Comprobatório");
                docMap.put("nomeArquivo", nomeDocumento);
                documentosComprobatoriosData.add(docMap);
            }
        }
        context.setVariable("documentosComprobatorios", documentosComprobatoriosData);

        return context;
    }

    public static byte[] transformHtmlInPDF(String html, String url) {
        try {
            JSONArray requestBody = JSONFactoryUtil.createJSONArray();
            JSONObject requestObject = JSONFactoryUtil.createJSONObject();
            requestObject.put("html", html);
            requestObject.put("processId", 0);
            requestBody.put(requestObject);

            Response pdfResponse = null;
            try {
                pdfResponse = sendRequestToPDFService(requestBody, url);
            } catch (Exception e) {
                _log.error("Erro ao chamar serviço de PDF: " + e.getMessage(), e);
                throw new RuntimeException("Erro ao gerar PDF", e);
            }

            if (pdfResponse != null && pdfResponse.getStatus() == 200) {
                JSONObject pdfArray = JSONFactoryUtil.createJSONObject(pdfResponse.readEntity(String.class));
                String pdfContent = pdfArray.getString(String.valueOf(0));
                return DatatypeConverter.parseBase64Binary(pdfContent);
            } else {
                _log.error("Erro ao obter PDF do serviço: " + (pdfResponse != null ? pdfResponse.getStatus() : "null"));
                throw new RuntimeException("Erro ao gerar PDF, resposta: " +
                        (pdfResponse != null ? pdfResponse.readEntity(String.class) : "null"));
            }
        } catch (PortalException e) {
            _log.error(e.getMessage(), e);
            throw new RuntimeException("Erro ao processar PDF", e);
        }
    }

    private static Response sendRequestToPDFService(JSONArray requestBody, String url) {
        WebTarget target = clientBuilder.build()
                .register(JacksonJsonProvider.class)
                .target(url);

        Invocation.Builder builder = target.request(MediaType.APPLICATION_JSON);
        return builder.post(Entity.entity(requestBody.toJSONString(), MediaType.APPLICATION_JSON));
    }

    public static byte[] createZipWithAttachments(byte[] pdfBytes, String pdfFileName,
                                                  List<FileEntry> attachments) throws IOException, PortalException {

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try (ZipOutputStream zos = new ZipOutputStream(baos)) {
            ZipEntry pdfEntry = new ZipEntry(pdfFileName);
            zos.putNextEntry(pdfEntry);
            zos.write(pdfBytes);
            zos.closeEntry();

            Set<String> usedNames = new HashSet<>();
            for (FileEntry attachment : attachments) {
                String fileName = attachment.getFileName();
                String uniqueFileName = getUniqueFileName(usedNames, fileName, attachment.getFileEntryId());
                usedNames.add(uniqueFileName);
                
                ZipEntry attachmentEntry = new ZipEntry("anexos/" + uniqueFileName);
                zos.putNextEntry(attachmentEntry);
                zos.write(attachment.getContentStream().readAllBytes());
                zos.closeEntry();
            }
        }

        return baos.toByteArray();
    }

    private static String getUniqueFileName(Set<String> usedNames, String originalFileName, long fileEntryId) {
        if (!usedNames.contains(originalFileName)) {
            return originalFileName;
        }

        String nameWithoutExtension;
        String extension;
        int lastDotIndex = originalFileName.lastIndexOf('.');
        if (lastDotIndex > 0) {
            nameWithoutExtension = originalFileName.substring(0, lastDotIndex);
            extension = originalFileName.substring(lastDotIndex);
        } else {
            nameWithoutExtension = originalFileName;
            extension = "";
        }

        String candidateName = fileEntryId + "_" + nameWithoutExtension + extension;
        return candidateName;
    }


}
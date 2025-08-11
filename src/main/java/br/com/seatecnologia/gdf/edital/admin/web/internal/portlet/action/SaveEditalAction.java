package br.com.seatecnologia.gdf.edital.admin.web.internal.portlet.action;

import br.com.seatecnologia.gdf.edital.admin.web.internal.constants.EditalAdminWebPortletKeys;
import br.com.seatecnologia.gdf.edital.admin.web.internal.mapper.*;
import br.com.seatecnologia.gdf.negocia.configuration.NegociaDFConfiguration;
import br.com.seatecnologia.gdf.negocia.internal.request.EditalRequest;
import br.com.seatecnologia.gdf.negocia.model.Edital;
import br.com.seatecnologia.gdf.negocia.service.EditalLocalService;
import com.liferay.document.library.kernel.model.DLFolder;
import com.liferay.document.library.kernel.model.DLVersionNumberIncrease;
import com.liferay.document.library.kernel.service.DLAppLocalService;
import com.liferay.document.library.kernel.service.DLAppService;
import com.liferay.document.library.kernel.service.DLFolderLocalService;
import com.liferay.portal.configuration.metatype.bnd.util.ConfigurableUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.repository.model.FileEntry;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.upload.UploadPortletRequest;
import com.liferay.portal.kernel.util.*;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Modified;
import org.osgi.service.component.annotations.Reference;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import java.io.InputStream;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import static br.com.seatecnologia.gdf.negocia.constants.NegociaDFConfigurationConstants.CONFIGURATION_PID;

@Component(
        immediate = true,
        property = {
                "javax.portlet.name=" + EditalAdminWebPortletKeys.EDITALADMINWEB,
                "mvc.command.name=saveEdital"
        },
        service = MVCActionCommand.class,
        configurationPid = CONFIGURATION_PID
)
public class SaveEditalAction implements MVCActionCommand {

    @Override
    public boolean processAction(ActionRequest actionRequest, ActionResponse actionResponse) {

        try {
            UploadPortletRequest uploadPortletRequest = _portal.getUploadPortletRequest(actionRequest);

            // Campos existentes
            long editalId = ParamUtil.getLong(uploadPortletRequest, "editalId");
            String title = ParamUtil.getString(uploadPortletRequest, "titulo");
            String description = ParamUtil.getString(uploadPortletRequest, "descricao");
            String dataInicioStr = ParamUtil.getString(uploadPortletRequest, "dataInicio");
            String dataFimStr = ParamUtil.getString(uploadPortletRequest, "dataFim");

            Date dataInicio = DateUtil.parseDate(dataInicioStr, LocaleUtil.BRAZIL);
            Date dataFim = DateUtil.parseDate(dataFimStr, LocaleUtil.BRAZIL);

            Calendar dataFimCalendar = Calendar.getInstance(LocaleUtil.BRAZIL);
            dataFimCalendar.setTime(dataFim);
            dataFimCalendar.set(Calendar.HOUR_OF_DAY, 23);
            dataFimCalendar.set(Calendar.MINUTE, 59);
            dataFimCalendar.set(Calendar.SECOND, 59);
            dataFim = dataFimCalendar.getTime();

            String fileName = uploadPortletRequest.getFileName("arquivo");
            InputStream inputStream = uploadPortletRequest.getFileAsStream("arquivo");
            long size = uploadPortletRequest.getSize("arquivo");

            // Debug - lista todos os parâmetros recebidos
            _log.debug("=== TODOS OS PARÂMETROS RECEBIDOS ===");
            Map<String, String[]> parameterMap = uploadPortletRequest.getParameterMap();
            for (Map.Entry<String, String[]> entry : parameterMap.entrySet()) {
                _log.debug("Parâmetro: " + entry.getKey() + " = " + Arrays.toString(entry.getValue()));
            }
            _log.debug("=== FIM DOS PARÂMETROS ===");

            // NOVOS CAMPOS - IDENTIFICAÇÃO BÁSICA
            int numeroEdital = ParamUtil.getInteger(uploadPortletRequest, "numeroEdital");
            int anoEdital = ParamUtil.getInteger(uploadPortletRequest, "anoEdital");
            long numeroSEI = ParamUtil.getLong(uploadPortletRequest, "numeroSEI");
            long prefixoParcelamentoSITAF = ParamUtil.getLong(uploadPortletRequest, "prefixoParcelamentoSITAF");
            boolean criarProcessoAutomatico = ParamUtil.getBoolean(uploadPortletRequest, "criarProcessoAutomatico");

            // NOVOS CAMPOS - VIGÊNCIA
            String dataPublicacaoStr = ParamUtil.getString(uploadPortletRequest, "dataPublicacao");
            Date dataPublicacao = null;
            if (Validator.isNotNull(dataPublicacaoStr)) {
                dataPublicacao = DateUtil.parseDate(dataPublicacaoStr, LocaleUtil.BRAZIL);
            }

            // NOVOS CAMPOS - ESCOPO
            String[] receitas = ParamUtil.getStringValues(uploadPortletRequest, "receitas");
            String[] situacoes = ParamUtil.getStringValues(uploadPortletRequest, "situacoes");
            String judicializada = ParamUtil.getString(uploadPortletRequest, "judicializada");

            // Valores monetários - recebidos diretamente como números
            double valorMinimoElegivelCPF = ParamUtil.getDouble(uploadPortletRequest, "valorMinimoElegivelCPF");
            double valorMinimoElegivelCNPJ = ParamUtil.getDouble(uploadPortletRequest, "valorMinimoElegivelCNPJ");
            double valorMinimoParcelaCPF = ParamUtil.getDouble(uploadPortletRequest, "valorMinimoParcelaCPF");
            double valorMinimoParcelaCNPJ = ParamUtil.getDouble(uploadPortletRequest, "valorMinimoParcelaCNPJ");

            String[] especificarValorMinimoCNPJ = ParamUtil.getStringValues(uploadPortletRequest, "especificarValorMinimoCNPJ");
            double entradaMinima = ParamUtil.getDouble(uploadPortletRequest, "entradaMinima");

            String aplicavelPara = ParamUtil.getString(uploadPortletRequest, "aplicavelPara");
            String[] parcelamentoDias = ParamUtil.getStringValues(uploadPortletRequest, "parcelamentoDias");

            // NOVOS CAMPOS - DESCONTOS E PARCELAS
            boolean aplicaDesconto = ParamUtil.getBoolean(uploadPortletRequest, "aplicaDesconto");
            String descontosDataJson = ParamUtil.getString(uploadPortletRequest, "descontosData");

            // NOVOS CAMPOS - TERMO GERADO AUTOMATICAMENTE
            String requerimento = ParamUtil.getString(uploadPortletRequest, "requerimento");

            // Debug - imprime os valores recebidos
            _log.debug("=== DADOS RECEBIDOS DO FORMULÁRIO ===");
            _log.debug("editalId: " + editalId);
            _log.debug("titulo: " + title);
            _log.debug("descricao: " + description);
            _log.debug("numeroEdital: " + numeroEdital);
            _log.debug("anoEdital: " + anoEdital);
            _log.debug("numeroSEI: " + numeroSEI);
            _log.debug("prefixoParcelamentoSITAF: " + prefixoParcelamentoSITAF);
            _log.debug("criarProcessoAutomatico: " + criarProcessoAutomatico);
            _log.debug("dataInicio: " + dataInicio);
            _log.debug("dataFim: " + dataFim);
            _log.debug("dataPublicacao: " + dataPublicacao);
            _log.debug("arquivo: " + fileName + " (size: " + size + ")");

            _log.debug("--- ESCOPO ---");
            _log.debug("receitas: " + Arrays.toString(receitas));
            _log.debug("situacoes: " + Arrays.toString(situacoes));
            _log.debug("judicializada: " + judicializada);
            _log.debug("valorMinimoElegivelCPF: " + valorMinimoElegivelCPF);
            _log.debug("valorMinimoElegivelCNPJ: " + valorMinimoElegivelCNPJ);
            _log.debug("especificarValorMinimoCNPJ: " + Arrays.toString(especificarValorMinimoCNPJ));
            _log.debug("entradaMinima: " + entradaMinima);
            _log.debug("valorMinimoParcelaCPF: " + valorMinimoParcelaCPF);
            _log.debug("valorMinimoParcelaCNPJ: " + valorMinimoParcelaCNPJ);
            _log.debug("aplicavelPara: " + aplicavelPara);
            _log.debug("parcelamentoDias: " + Arrays.toString(parcelamentoDias));

            _log.debug("--- DESCONTOS ---");
            _log.debug("aplicaDesconto: " + aplicaDesconto);
            _log.debug("descontosData JSON: " + descontosDataJson);

            _log.debug("--- TERMO ---");
            _log.debug("requerimento: " + requerimento);

            // Converter para BigDecimal para armazenar no banco
            BigDecimal valorMinimoElegivelCPFDecimal = valorMinimoElegivelCPF > 0 ?
                    BigDecimal.valueOf(valorMinimoElegivelCPF) : null;
            BigDecimal valorMinimoElegivelCNPJDecimal = valorMinimoElegivelCNPJ > 0 ?
                    BigDecimal.valueOf(valorMinimoElegivelCNPJ) : null;
            BigDecimal valorMinimoParcelaCPFDecimal = valorMinimoParcelaCPF > 0 ?
                    BigDecimal.valueOf(valorMinimoParcelaCPF) : null;
            BigDecimal valorMinimoParcelaCNPJDecimal = valorMinimoParcelaCNPJ > 0 ?
                    BigDecimal.valueOf(valorMinimoParcelaCNPJ) : null;

            _log.debug("Valores convertidos para BigDecimal:");
            _log.debug("valorMinimoElegivelCPF: " + valorMinimoElegivelCPFDecimal);
            _log.debug("valorMinimoElegivelCNPJ: " + valorMinimoElegivelCNPJDecimal);
            _log.debug("valorMinimoParcelaCPF: " + valorMinimoParcelaCPFDecimal);
            _log.debug("valorMinimoParcelaCNPJ: " + valorMinimoParcelaCNPJDecimal);

            // Processar valores mínimos por tipo de CNPJ
            Map<String, BigDecimal> valoresMinimosPorTipoCNPJ = new HashMap<>();
            if (especificarValorMinimoCNPJ != null && especificarValorMinimoCNPJ.length > 0) {
                _log.debug("Processando valores mínimos por tipo de CNPJ...");

                for (String tipoCNPJ : especificarValorMinimoCNPJ) {
                    String paramName = "valorMinimo_" + tipoCNPJ;
                    double valor = ParamUtil.getDouble(uploadPortletRequest, paramName);

                    if (valor > 0) {
                        valoresMinimosPorTipoCNPJ.put(tipoCNPJ, BigDecimal.valueOf(valor));
                        _log.debug("Valor mínimo para " + tipoCNPJ + ": " + valor);
                    }
                }
            }

            // Processar JSON de descontos se aplicável
            if (aplicaDesconto && Validator.isNotNull(descontosDataJson)) {
                try {
                    _log.debug("JSON de descontos recebido: " + descontosDataJson);

                    // Parse do JSON usando JSONFactoryUtil do Liferay
                    JSONArray descontosArray = JSONFactoryUtil.createJSONArray(descontosDataJson);

                    _log.debug("Total de configurações de desconto: " + descontosArray.length());

                    // Iterar sobre cada configuração de desconto
                    for (int i = 0; i < descontosArray.length(); i++) {
                        JSONObject desconto = descontosArray.getJSONObject(i);

                        _log.debug("=== DESCONTO " + (i + 1) + " ===");

                        // Tipo de crédito (string)
                        String tipoCredito = desconto.getString("tipoCredito");
                        _log.debug("Tipo de crédito: " + tipoCredito);

                        // Empresa em regime especial
                        String empresaRegime = desconto.getString("empresaRegime");
                        _log.debug("Empresa em regime especial: " + empresaRegime);

                        // Pequeno valor aplicável
                        String pequenoValorAplicavel = desconto.getString("pequenoValorAplicavel");
                        _log.debug("Pequeno valor aplicável: " + pequenoValorAplicavel);

                        // Pequeno valor (número direto)
                        double pequenoValor = desconto.getDouble("pequenoValor");
                        BigDecimal pequenoValorDecimal = pequenoValor > 0 ?
                                BigDecimal.valueOf(pequenoValor) : null;

                        if (pequenoValorDecimal != null) {
                            _log.debug("Pequeno valor: " + pequenoValorDecimal);
                        }

                        // Transação envolve (array)
                        JSONArray transacaoEnvolveArray = desconto.getJSONArray("transacaoEnvolve");
                        String[] transacaoEnvolve = new String[transacaoEnvolveArray.length()];
                        for (int j = 0; j < transacaoEnvolveArray.length(); j++) {
                            transacaoEnvolve[j] = transacaoEnvolveArray.getString(j);
                        }
                        _log.debug("Transação envolve: " + Arrays.toString(transacaoEnvolve));

                        // Processar parcelas
                        JSONArray parcelasArray = desconto.getJSONArray("parcelas");
                        _log.debug("Número de configurações de parcelas: " + parcelasArray.length());

                        for (int j = 0; j < parcelasArray.length(); j++) {
                            JSONObject parcela = parcelasArray.getJSONObject(j);

                            _log.debug("  --- Parcela " + (j + 1) + " ---");

                            // Quantidade de parcelas
                            int quantidadeParcelas = parcela.getInt("quantidadeParcelas");
                            _log.debug("  Quantidade de parcelas: " + quantidadeParcelas);

                            // Porcentagem de desconto
                            double porcentagemDesconto = parcela.getDouble("porcentagemDesconto");
                            _log.debug("  Porcentagem de desconto: " + porcentagemDesconto + "%");

                            // Sobre o que é aplicado (string)
                            String sobreOQueAplicado = parcela.getString("sobreOQueAplicado");
                            _log.debug("  Aplicado sobre: " + sobreOQueAplicado);

                            // Classificação de crédito (array)
                            JSONArray classificacaoCreditoArray = parcela.getJSONArray("classificacaoCredito");
                            String[] classificacaoCredito = new String[classificacaoCreditoArray.length()];
                            for (int k = 0; k < classificacaoCreditoArray.length(); k++) {
                                classificacaoCredito[k] = classificacaoCreditoArray.getString(k);
                            }
                            _log.debug("  Classificação de crédito (Rating): " + Arrays.toString(classificacaoCredito));
                        }
                    }

                } catch (Exception e) {
                    _log.error("Erro ao processar JSON de descontos", e);
                }
            }

            long fileEntryId;

            if (editalId > 0) {
                Edital edital = _editalLocalService.getEdital(editalId);
                fileEntryId = edital.getArquivoEdital();

                if (Validator.isNotNull(fileName) && size > 0) {
                    FileEntry existingFileEntry = _dlAppService.getFileEntry(fileEntryId);

                    byte[] fileBytes = FileUtil.getBytes(inputStream);

                    FileEntry updatedFile = _dlAppService.updateFileEntry(
                            existingFileEntry.getFileEntryId(),
                            fileName,
                            MimeTypesUtil.getContentType(fileName),
                            title,
                            null,
                            description,
                            null,
                            DLVersionNumberIncrease.MAJOR,
                            fileBytes,
                            null,
                            null,
                            null,
                            new ServiceContext());

                    fileEntryId = updatedFile.getFileEntryId();
                }

                // TODO: Atualizar com os novos campos quando o método estiver disponível
//                _editalLocalService.updateEdital(
//                    editalId, title, description, fileEntryId, dataInicio, dataFim,
//                    numeroEdital, anoEdital, numeroSEI, prefixoParcelamentoSITAF,
//                    criarProcessoAutomatico, dataPublicacao, receitas, situacoes,
//                    judicializada, valorMinimoElegivelCPFDecimal, valorMinimoElegivelCNPJDecimal,
//                    especificarValorMinimoCNPJ, valoresMinimosPorTipoCNPJ, entradaMinima,
//                    valorMinimoParcelaCPFDecimal, valorMinimoParcelaCNPJDecimal,
//                    aplicavelPara, parcelamentoDias, aplicaDesconto, descontosDataJson,
//                    requerimento);

            } else {

                EditalValorCNPJRequestMapper editalValorCNPJRequestMapper = new EditalValorCNPJRequestMapper();
                ParcelamentoRequerenteRequestMapper parcelamentoRequerenteRequestMapper = new ParcelamentoRequerenteRequestMapper();
                DescontoParcelasRequestMapper descontoParcelasRequestMapper = new DescontoParcelasRequestMapper();
                ArquivoRequestMapper arquivoRequestMapper = new ArquivoRequestMapper();

                EditalRequest editalRequest = new EditalRequestMapper(
                        _dlFolderLocalService,
                        _dlAppService,
                        editalValorCNPJRequestMapper,
                        parcelamentoRequerenteRequestMapper,
                        descontoParcelasRequestMapper,
                        arquivoRequestMapper,
                        editalAdminWebConfiguration).toRequest(uploadPortletRequest);

                _editalLocalService.addEdital(editalRequest);

            }
            return true;
        } catch (Exception e) {
            _log.error("Error saving edital", e);
            return false;
        }
    }


    @Activate
    @Modified
    protected void activate(Map<String, Object> properties) {
        editalAdminWebConfiguration = ConfigurableUtil.createConfigurable(
                NegociaDFConfiguration.class, properties);
    }

    private volatile NegociaDFConfiguration editalAdminWebConfiguration;

    @Reference
    private EditalLocalService _editalLocalService;

    @Reference
    private Portal _portal;

    @Reference
    private DLAppService _dlAppService;

    @Reference
    private DLFolderLocalService _dlFolderLocalService;

    private final static Log _log = LogFactoryUtil.getLog(SaveEditalAction.class);
}
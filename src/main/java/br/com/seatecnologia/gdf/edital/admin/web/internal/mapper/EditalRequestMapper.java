package br.com.seatecnologia.gdf.edital.admin.web.internal.mapper;

import br.com.seatecnologia.gdf.negocia.configuration.NegociaDFConfiguration;
import br.com.seatecnologia.gdf.negocia.internal.request.ArquivoRequest;
import br.com.seatecnologia.gdf.negocia.internal.request.EditalRequest;
import br.com.seatecnologia.gdf.negocia.internal.request.ReceitaRequest;
import com.liferay.document.library.kernel.model.DLFolder;
import com.liferay.document.library.kernel.service.DLAppService;
import com.liferay.document.library.kernel.service.DLFolderLocalService;
import com.liferay.portal.configuration.metatype.bnd.util.ConfigurableUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.repository.model.FileEntry;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.upload.UploadPortletRequest;
import com.liferay.portal.kernel.util.DateUtil;
import com.liferay.portal.kernel.util.LocaleUtil;
import com.liferay.portal.kernel.util.MimeTypesUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Modified;
import org.osgi.service.component.annotations.Reference;

import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static br.com.seatecnologia.gdf.negocia.constants.NegociaDFConfigurationConstants.CONFIGURATION_PID;

@Component(service = EditalRequestMapper.class,
        configurationPid = CONFIGURATION_PID)
public class EditalRequestMapper {

    public EditalRequest toRequest(UploadPortletRequest uploadPortletRequest) {

        if (Validator.isNull(uploadPortletRequest)) {
            return null;
        }

        String title = ParamUtil.getString(uploadPortletRequest, "title");
        String description = ParamUtil.getString(uploadPortletRequest, "description");
        String[] especificarValorMinimoCNPJ = ParamUtil.getStringValues(uploadPortletRequest, "especificarValorMinimoCNPJ");
        String[] receitas = ParamUtil.getStringValues(uploadPortletRequest, "receitas");
        String[] situacoes = ParamUtil.getStringValues(uploadPortletRequest, "situacoes");
        boolean aplicaDesconto = ParamUtil.getBoolean(uploadPortletRequest, "aplicaDesconto");
        String[] parcelamentoDias = ParamUtil.getStringValues(uploadPortletRequest, "parcelamentoDias");
        String dataInicioStr = ParamUtil.getString(uploadPortletRequest, "dataInicio");
        String dataFimStr = ParamUtil.getString(uploadPortletRequest, "dataFim");
        String dataPublicacaoStr = ParamUtil.getString(uploadPortletRequest, "dataPublicacao");


        String fileNameEdital = uploadPortletRequest.getFileName("arquivo");
        String fileNameAssinaturaGestor = uploadPortletRequest.getFileName("assinaturaGestor");
        String fileNameAssinaturaSecretaria = uploadPortletRequest.getFileName("assinaturaSecretaria");
        InputStream inputStreamEdital = null;
        InputStream inputStreamAssinaturaGestor = null;
        InputStream inputStreamAssinaturaSecretaria = null;
        try {
            inputStreamEdital = uploadPortletRequest.getFileAsStream("arquivo");
            inputStreamAssinaturaGestor = uploadPortletRequest.getFileAsStream("assinaturaGestor");
            inputStreamAssinaturaSecretaria = uploadPortletRequest.getFileAsStream("assinaturaSecretaria");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        long sizeEdital = uploadPortletRequest.getSize("arquivo");
        long sizeAssinaturaGestor = uploadPortletRequest.getSize("assinaturaGestor");
        long sizeAssinaturaSecretaria = uploadPortletRequest.getSize("assinaturaSecretaria");


        EditalRequest editalRequest = new EditalRequest();
        editalRequest.setTitulo(title);
        editalRequest.setDescricao(description);
        editalRequest.setNumero(ParamUtil.getInteger(uploadPortletRequest, "numeroEdital"));
        editalRequest.setNumeroSei(ParamUtil.getLong(uploadPortletRequest, "numeroSEI"));
        editalRequest.setAno(ParamUtil.getInteger(uploadPortletRequest, "anoEdital"));
        editalRequest.setPrefixoSitaf(ParamUtil.getLong(uploadPortletRequest, "prefixoParcelamentoSITAF"));
        editalRequest.setProcessoAutomaticoSEI(ParamUtil.getBoolean(uploadPortletRequest, "criarProcessoAutomatico"));
        editalRequest.setDataInicio(processDate(dataInicioStr));
        editalRequest.setDataFim(processDate(dataFimStr));
        editalRequest.setDataPublicacao(processDate(dataPublicacaoStr));
        editalRequest.setTipo(ParamUtil.getString(uploadPortletRequest, "tipos"));
        editalRequest.setJudicializada(ParamUtil.getString(uploadPortletRequest, "judicializada"));
        editalRequest.setValorMinimoElegivelCPF(ParamUtil.getDouble(uploadPortletRequest, "valorMinimoElegivelCPF"));
        editalRequest.setValorMinimoElegivelCNPJ(ParamUtil.getDouble(uploadPortletRequest, "valorMinimoElegivelCNPJ"));
        //editalRequest.setAplicavelCpfCnpj(aplicavelPara);
        editalRequest.setEntradaMinima(ParamUtil.getDouble(uploadPortletRequest, "entradaMinima"));
        editalRequest.setValorMinimoParcelaCPF(ParamUtil.getDouble(uploadPortletRequest, "valorMinimoParcelaCPF"));
        editalRequest.setValorMinimoElegivelCPF(ParamUtil.getDouble(uploadPortletRequest, "valorMinimoParcelaCNPJ"));
        editalRequest.setDescontoDividaElegivel(ParamUtil.getBoolean(uploadPortletRequest, "aplicaDesconto"));
        editalRequest.setRequerimento(ParamUtil.getString(uploadPortletRequest, "requerimento"));

        ArquivoRequest arquivoRequestEdital = _arquivoRequestMapper.toRequest(fileNameEdital, inputStreamEdital, sizeEdital, "edital");
        ArquivoRequest arquivoRequestAssinaturaGestor = _arquivoRequestMapper.toRequest(fileNameAssinaturaGestor, inputStreamAssinaturaGestor, sizeAssinaturaGestor, "assinaturaGestor");
        ArquivoRequest arquivoRequestAssinaturaSecretaria = _arquivoRequestMapper.toRequest(fileNameAssinaturaSecretaria, inputStreamAssinaturaSecretaria, sizeAssinaturaSecretaria, "assinaturaSecretaria");

        editalRequest.setArquivoEdital(arquivoRequestEdital);
        editalRequest.setArquivoAssinaturaGestor(arquivoRequestAssinaturaGestor);
        editalRequest.setArquivoAssinaturaSecretaria(arquivoRequestAssinaturaSecretaria);

        editalRequest.setParcelamentoRequerente(_parcelamentoRequerenteRequestMapper.toRequest(parcelamentoDias));

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
            editalRequest.setEditalValorCNPJ(_editalValorCNPJRequestMapper.toRequest(especificarValorMinimoCNPJ));
        }

        String descontosDataJson = ParamUtil.getString(uploadPortletRequest, "descontosData");

        if (aplicaDesconto && Validator.isNotNull(descontosDataJson)) {
            try {
                JSONArray descontosArray = JSONFactoryUtil.createJSONArray(descontosDataJson);
                editalRequest.setDescontosParcelas(_descontoParcelasRequestMapper.toRequest(descontosArray));

            } catch (Exception e) {
                _log.error("Erro ao processar JSON de descontos", e);
            }
        }

        return editalRequest;
    }

    private Date processDate(String data) {
        try {
            return DateUtil.parseDate(data, LocaleUtil.BRAZIL);
        } catch (ParseException e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }

    private long createEditalFileEntry(String fileName, InputStream inputStream, long size, String title, String description) {
        DLFolder folder = null;
        try {
            folder = _dlFolderLocalService.getDLFolder(editalAdminWebConfiguration.documentFolderId());
        } catch (PortalException e) {
            throw new RuntimeException(e);
        }

        FileEntry file = null;
        try {
            file = _dlAppService.addFileEntry(
                    null, folder.getRepositoryId(), editalAdminWebConfiguration.documentFolderId(), fileName,
                    MimeTypesUtil.getContentType(fileName), title, null, description, null,
                    inputStream, size, new Date(),
                    null, null, new ServiceContext());
        } catch (PortalException e) {
            throw new RuntimeException(e);
        }

        return file.getFileEntryId();
    }

    @Activate
    @Modified
    protected void activate(Map<String, Object> properties) {
        editalAdminWebConfiguration = ConfigurableUtil.createConfigurable(
                NegociaDFConfiguration.class, properties);
    }

    @Reference
    private DLFolderLocalService _dlFolderLocalService;

    @Reference
    private DLAppService _dlAppService;

    @Reference
    private EditalValorCNPJRequestMapper _editalValorCNPJRequestMapper;

    @Reference
    private ParcelamentoRequerenteRequestMapper _parcelamentoRequerenteRequestMapper;

    @Reference
    private DescontoParcelasRequestMapper _descontoParcelasRequestMapper;

    @Reference
    private ArquivoRequestMapper _arquivoRequestMapper;

    private volatile NegociaDFConfiguration editalAdminWebConfiguration;

    private final Log _log = LogFactoryUtil.getLog(EditalRequestMapper.class);

}

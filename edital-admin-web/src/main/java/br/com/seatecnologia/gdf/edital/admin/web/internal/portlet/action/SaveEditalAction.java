package br.com.seatecnologia.gdf.edital.admin.web.internal.portlet.action;

import br.com.seatecnologia.gdf.edital.admin.web.internal.constants.EditalAdminWebPortletKeys;
import br.com.seatecnologia.gdf.negocia.configuration.NegociaDFConfiguration;
import br.com.seatecnologia.gdf.negocia.model.Edital;
import br.com.seatecnologia.gdf.negocia.service.EditalLocalService;
import com.liferay.document.library.kernel.model.DLFolder;
import com.liferay.document.library.kernel.model.DLVersionNumberIncrease;
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
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Modified;
import org.osgi.service.component.annotations.Reference;

import java.io.InputStream;
import java.util.Calendar;
import java.util.Date;
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
    public boolean processAction(
            javax.portlet.ActionRequest actionRequest,
            javax.portlet.ActionResponse actionResponse) {

        try {
            UploadPortletRequest uploadPortletRequest =
                    _portal.getUploadPortletRequest(actionRequest);

            long editalId = ParamUtil.getLong(uploadPortletRequest, "editalId");
            String title = ParamUtil.getString(uploadPortletRequest, "titulo");
            String description = ParamUtil.getString(uploadPortletRequest, "descricao");
            String dataInicioStr = ParamUtil.getString(uploadPortletRequest, "dataInicio");
            String dataFimStr = ParamUtil.getString(uploadPortletRequest, "dataFim");

            // Capturar o novo campo requerimento
            String requerimento = ParamUtil.getString(uploadPortletRequest, "requerimento");

            // Log para verificar se o valor está sendo recebido
            _log.info("Requerimento recebido: " + requerimento);

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

                // TODO: Quando o método updateEdital for descomentado, adicionar o parâmetro requerimento
                // _editalLocalService.updateEdital(
                //     editalId, title, description, fileEntryId, dataInicio, dataFim, requerimento);

            } else {
                DLFolder folder = _dlFolderLocalService.getDLFolder(editalAdminWebConfiguration.documentFolderId());

                FileEntry file = _dlAppService.addFileEntry(
                        null, folder.getRepositoryId(), editalAdminWebConfiguration.documentFolderId(), fileName,
                        MimeTypesUtil.getContentType(fileName), title, null, description, null,
                        inputStream, size, new Date(),
                        null, null, new ServiceContext());

                fileEntryId = file.getFileEntryId();

                // TODO: Quando o método addEdital for descomentado, adicionar o parâmetro requerimento
                // _editalLocalService.addEdital(
                //     title, description, fileEntryId, dataInicio, dataFim, requerimento);
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

    @Reference
    private EditalLocalService _editalLocalService;

    @Reference
    private Portal _portal;

    @Reference
    private DLAppService _dlAppService;

    @Reference
    private DLFolderLocalService _dlFolderLocalService;

    private volatile NegociaDFConfiguration editalAdminWebConfiguration;

    private final static Log _log = LogFactoryUtil.getLog(SaveEditalAction.class);
}
package br.com.seatecnologia.gdf.negocia.headless.internal.resource.v1_0;

import br.com.seatecnologia.gdf.negocia.configuration.NegociaDFConfiguration;
import br.com.seatecnologia.gdf.negocia.headless.dto.v1_0.EditalEntity;
import br.com.seatecnologia.gdf.negocia.headless.dto.v1_0.MetadadosFormulario;
import br.com.seatecnologia.gdf.negocia.headless.resource.v1_0.EditalEntityResource;

import br.com.seatecnologia.gdf.negocia.model.Edital;
import br.com.seatecnologia.gdf.negocia.service.EditalLocalService;
import com.liferay.document.library.kernel.model.DLFolderConstants;
import com.liferay.document.library.kernel.service.DLAppLocalService;
import com.liferay.petra.string.StringPool;
import com.liferay.portal.configuration.metatype.bnd.util.ConfigurableUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.repository.model.Folder;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import org.osgi.service.component.annotations.*;

import java.util.List;
import java.util.Map;

import static br.com.seatecnologia.gdf.negocia.constants.NegociaDFConfigurationConstants.CONFIGURATION_PID;

/**
 * @author sabrina
 */
@Component(
	properties = "OSGI-INF/liferay/rest/v1_0/edital-entity.properties",
	scope = ServiceScope.PROTOTYPE, service = EditalEntityResource.class,
	configurationPid = CONFIGURATION_PID
)
public class EditalEntityResourceImpl extends BaseEditalEntityResourceImpl {
	@Override
	public MetadadosFormulario getMetadados() throws Exception {
		MetadadosFormulario metadadosFormulario = new MetadadosFormulario();
		List<Edital> editais = _editalLocalService.getEditals(-1, -1);

        metadadosFormulario.setEditalEntities(editais.stream()
            .map(edital -> new EditalEntity() {
                {
                    setEditalId(edital.getEditalId());
                    setTitulo(edital.getTitulo());
                    setDescricao(edital.getDescricao());
                    setDataInicio(edital.getDataInicio());
                    setDataFim(edital.getDataFim());
                    setUrlArquivo(edital.getArquivoURL());
                }
            }).toArray(EditalEntity[]::new));

		metadadosFormulario.setDlFolderId(getContextUserDocumentsFolderId());

		return metadadosFormulario;
	}

	private long getContextUserDocumentsFolderId() throws PortalException {
		ServiceContext serviceContext = ServiceContextFactory.getInstance(contextHttpServletRequest);
		long userId = serviceContext.getUserId();
		long groupId = contextUser.getGroupId();

		long parentFolderId = DLFolderConstants.DEFAULT_PARENT_FOLDER_ID;
		Folder dlfolder = getDocumentFolder(userId, groupId, parentFolderId, "Solicitações", serviceContext);
		return getDocumentFolder(userId, groupId, dlfolder.getFolderId(), String.valueOf(userId), serviceContext).getFolderId();
	}


	private Folder getDocumentFolder(long userId, long groupId, long parentFolderid, String folderName, ServiceContext serviceContext)
		throws PortalException {
		Folder childFolder;

		try{
			childFolder = _dlAppLocalService.getFolder(groupId, parentFolderid, folderName);
		} catch (PortalException e) {
			childFolder = _dlAppLocalService.addFolder(StringPool.BLANK, userId, groupId, parentFolderid, folderName, StringPool.BLANK, serviceContext);


		}

		return childFolder;
	}

	@Activate
	@Modified
	protected void activate(Map<String, Object> properties) {
		negociaDFConfiguration = ConfigurableUtil.createConfigurable(
			NegociaDFConfiguration.class, properties);
	}

	private NegociaDFConfiguration negociaDFConfiguration;

	@Reference
	private DLAppLocalService _dlAppLocalService;

	@Reference
	private EditalLocalService _editalLocalService;


}
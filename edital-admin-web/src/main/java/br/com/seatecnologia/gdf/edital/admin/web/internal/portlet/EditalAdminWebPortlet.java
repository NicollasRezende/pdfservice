package br.com.seatecnologia.gdf.edital.admin.web.internal.portlet;

import br.com.seatecnologia.gdf.edital.admin.web.internal.constants.EditalAdminWebPortletKeys;

import br.com.seatecnologia.gdf.negocia.configuration.NegociaDFConfiguration;
import br.com.seatecnologia.gdf.negocia.model.Edital;
import br.com.seatecnologia.gdf.negocia.service.EditalLocalService;
import com.liferay.portal.configuration.metatype.bnd.util.ConfigurableUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Modified;
import org.osgi.service.component.annotations.Reference;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import static br.com.seatecnologia.gdf.negocia.constants.NegociaDFConfigurationConstants.CONFIGURATION_PID;

/**
 * @author albino
 */
@Component(
	property = {
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"javax.portlet.display-name=EditalAdminWeb",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",

		"com.liferay.portlet.display-category=category.hidden",
		"com.liferay.portlet.instanceable=false",
		"com.liferay.portlet.system=true",

		"panel.app.order:Integer=100",
		"panel.category.key=control_panel",

		"javax.portlet.name=" + EditalAdminWebPortletKeys.EDITALADMINWEB,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class,
	configurationPid = CONFIGURATION_PID
)
public class EditalAdminWebPortlet extends MVCPortlet {
	@Reference
	private EditalLocalService _editalLocalService;

	@Override
	public void doView(RenderRequest renderRequest, RenderResponse renderResponse) throws IOException, PortletException {

		List<Edital> editais = _editalLocalService.getEditals(-1,-1);

		renderRequest.setAttribute("editais", editais);
		renderRequest.setAttribute("documentFolder", negociaDFConfiguration.documentFolderId());

		super.doView(renderRequest, renderResponse);
	}


	@Activate
	@Modified
	protected void activate(Map<String, Object> properties) {
		negociaDFConfiguration = ConfigurableUtil.createConfigurable(
			NegociaDFConfiguration.class, properties);
	}

	private NegociaDFConfiguration negociaDFConfiguration;
}
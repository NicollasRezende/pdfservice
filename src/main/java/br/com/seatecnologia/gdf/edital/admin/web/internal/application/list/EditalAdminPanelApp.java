package br.com.seatecnologia.gdf.edital.admin.web.internal.application.list;

import com.liferay.application.list.BasePanelApp;
import com.liferay.application.list.PanelApp;
import com.liferay.application.list.constants.PanelCategoryKeys;
import com.liferay.portal.kernel.model.Portlet;
import br.com.seatecnologia.gdf.edital.admin.web.internal.constants.EditalAdminWebPortletKeys;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import static com.liferay.portal.kernel.service.PortletLocalServiceUtil.getPortletById;

    @Component(
        immediate = true,
        property = {
            "panel.app.order:Integer=100",
            "panel.category.key=" + PanelCategoryKeys.CONTROL_PANEL
        },
        service = PanelApp.class
)
public class EditalAdminPanelApp extends BasePanelApp {

    @Override
    public Portlet getPortlet() {
        return _portlet;
    }

    @Override
    public String getPortletId() {
        return EditalAdminWebPortletKeys.EDITALADMINWEB;
    }

    @Reference(
        target = "(javax.portlet.name=" + EditalAdminWebPortletKeys.EDITALADMINWEB + ")"
    )
    private Portlet _portlet;

}
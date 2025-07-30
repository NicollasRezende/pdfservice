package br.com.seatecnologia.gdf.negocia.service.permission.internal;

import br.com.seatecnologia.gdf.negocia.constants.NegociaDFConstants;
import com.liferay.exportimport.kernel.staging.permission.StagingPermission;
import com.liferay.portal.kernel.security.permission.resource.PortletResourcePermission;
import com.liferay.portal.kernel.security.permission.resource.PortletResourcePermissionFactory;
import com.liferay.portal.kernel.security.permission.resource.StagedPortletPermissionLogic;
import com.liferay.portal.kernel.util.HashMapDictionary;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

import java.util.Dictionary;

@Component(immediate = true)
public class PropostaPortletResourcePermissionRegistrar {
    @Activate
    protected void activate(BundleContext bundleContext) {
        Dictionary<String, Object> properties = new HashMapDictionary<>();
        properties.put("resource.name", NegociaDFConstants.RESOURCE_NAME);

        _serviceRegistration = bundleContext.registerService(
            PortletResourcePermission.class,
            PortletResourcePermissionFactory.create(
                NegociaDFConstants.RESOURCE_NAME,
                new StagedPortletPermissionLogic(
                    _stagingPermission, NegociaDFConstants.PORTLET_NAME)),
            properties);
    }

    @Deactivate
    protected void deactivate() {
        _serviceRegistration.unregister();
    }

    private ServiceRegistration<PortletResourcePermission> _serviceRegistration;

    @Reference
    private StagingPermission _stagingPermission;
}

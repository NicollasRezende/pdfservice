package br.com.seatecnologia.gdf.negocia.service.permission.internal;

import br.com.seatecnologia.gdf.negocia.constants.NegociaDFConstants;
import br.com.seatecnologia.gdf.negocia.model.Proposta;
import br.com.seatecnologia.gdf.negocia.service.PropostaLocalService;
import com.liferay.exportimport.kernel.staging.permission.StagingPermission;
import com.liferay.portal.kernel.security.permission.resource.ModelResourcePermission;
import com.liferay.portal.kernel.security.permission.resource.ModelResourcePermissionFactory;
import com.liferay.portal.kernel.security.permission.resource.PortletResourcePermission;
import com.liferay.portal.kernel.security.permission.resource.StagedModelPermissionLogic;
import com.liferay.portal.kernel.service.GroupLocalService;
import com.liferay.portal.kernel.util.HashMapDictionary;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

import java.util.Dictionary;

@Component(immediate = true)
public class PropostaModelResourcePermissionRegistrar {

    @Activate
    protected void activate(BundleContext bundleContext) {
        Dictionary<String, Object> properties = new HashMapDictionary<>();
        properties.put("model.class.name", Proposta.class.getName());

        _serviceRegistration = bundleContext.registerService(
            (Class<ModelResourcePermission<Proposta>>)(Class<?>) ModelResourcePermission.class,
            ModelResourcePermissionFactory.create(
                Proposta.class, Proposta::getPropostaId,
                _propostaLocalService::getProposta, _portletResourcePermission,
                (modelResourcePermission, consumer) -> {
                    consumer.accept(
                        new StagedModelPermissionLogic<>(
                            _stagingPermission, NegociaDFConstants.PORTLET_NAME,
                            Proposta::getPropostaId));
                }),
            properties);
    }

    @Deactivate
    protected void deactivate() {
        _serviceRegistration.unregister();
    }

    @Reference
    private PropostaLocalService _propostaLocalService;

    @Reference
    private GroupLocalService _groupLocalService;

    @Reference(
        target = "(resource.name=" + NegociaDFConstants.RESOURCE_NAME + ")")
    private PortletResourcePermission _portletResourcePermission;

    private ServiceRegistration<ModelResourcePermission<Proposta>> _serviceRegistration;

    @Reference
    private StagingPermission _stagingPermission;
}

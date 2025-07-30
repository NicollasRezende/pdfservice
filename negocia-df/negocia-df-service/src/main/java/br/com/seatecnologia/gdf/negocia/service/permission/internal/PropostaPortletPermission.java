package br.com.seatecnologia.gdf.negocia.service.permission.internal;

import br.com.seatecnologia.gdf.negocia.constants.NegociaDFConstants;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.security.auth.PrincipalException;
import com.liferay.portal.kernel.security.permission.PermissionChecker;
import com.liferay.portal.kernel.security.permission.resource.PortletResourcePermission;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(immediate=true)
public class PropostaPortletPermission {

    public static void check(
        PermissionChecker permissionChecker, long groupId, String actionId) throws PortalException {
        if(!contains(permissionChecker, groupId, actionId)) {
            throw new PrincipalException("User " + permissionChecker.getUserId()
                + " doesn't have the permission on resource " + NegociaDFConstants.RESOURCE_NAME
                + "#" + actionId);
        }
    }

    public static boolean contains(PermissionChecker permissionChecker, long groupId, String actionId) {
        return _portletResourcePermission.contains(permissionChecker, groupId, actionId);
    }

    @Reference(
        target="(resource.name=" + NegociaDFConstants.RESOURCE_NAME + ")",
        unbind="-")
    protected void setPortletResourcePermission(PortletResourcePermission portletResourcePermission) {
        _portletResourcePermission = portletResourcePermission;
    }

    private static PortletResourcePermission _portletResourcePermission;
}
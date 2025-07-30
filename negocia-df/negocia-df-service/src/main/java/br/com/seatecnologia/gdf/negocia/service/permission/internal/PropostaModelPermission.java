package br.com.seatecnologia.gdf.negocia.service.permission.internal;

import br.com.seatecnologia.gdf.negocia.constants.NegociaDFConstants;
import br.com.seatecnologia.gdf.negocia.model.Proposta;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.security.auth.PrincipalException;
import com.liferay.portal.kernel.security.permission.PermissionChecker;
import com.liferay.portal.kernel.security.permission.resource.ModelResourcePermission;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(immediate = true)
public class PropostaModelPermission<E> {
    public static void check(
        PermissionChecker permissionChecker, Proposta proposta, String actionId)
        throws PortalException {
        check(permissionChecker, proposta.getPropostaId(), actionId);
    }

    public static void check(
        PermissionChecker permissionChecker, long propostaId, String actionId) throws PortalException {
        if (!contains(permissionChecker, propostaId, actionId)) {
            throw new PrincipalException("User " + permissionChecker.getUserId()
                + " doesn't have permission on resource " + NegociaDFConstants.MODEL_NAME
                + " with id " + propostaId);
        }
    }

    public static boolean contains(
        PermissionChecker permissionChecker, Proposta proposta, String actionId)
        throws PortalException {
        return _propostaModelResourcePermission.contains(permissionChecker, proposta, actionId);
    }

    public static boolean contains(
        PermissionChecker permissionChecker, long propostaId, String actionId) throws PortalException {
        return _propostaModelResourcePermission.contains(permissionChecker, propostaId, actionId);
    }

    @Reference(
        target = "(model.class.name=" + NegociaDFConstants.MODEL_NAME + ")",
        unbind = "-")
    protected void setEntryModelPermission(ModelResourcePermission<Proposta> modelResourcePermission) {
        _propostaModelResourcePermission = modelResourcePermission;
    }

    private static ModelResourcePermission<Proposta> _propostaModelResourcePermission;
}

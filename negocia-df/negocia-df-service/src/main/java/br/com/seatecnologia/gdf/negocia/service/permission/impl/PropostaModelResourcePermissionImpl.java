package br.com.seatecnologia.gdf.negocia.service.permission.impl;

import br.com.seatecnologia.gdf.negocia.constants.NegociaDFConstants;
import br.com.seatecnologia.gdf.negocia.context.GovBrAuthContext;
import br.com.seatecnologia.gdf.negocia.model.Proposta;
import br.com.seatecnologia.gdf.negocia.service.PropostaLocalService;
import br.com.seatecnologia.gdf.negocia.service.permission.PropostaModelResourcePermission;
import com.liferay.portal.kernel.exception.NoSuchResourcePermissionException;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.security.permission.PermissionChecker;
import com.liferay.portal.kernel.security.permission.resource.ModelResourcePermission;
import com.liferay.portal.kernel.security.permission.resource.PortletResourcePermission;
import com.liferay.portal.kernel.service.ResourcePermissionLocalService;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import static com.liferay.portal.kernel.model.ResourceConstants.SCOPE_COMPANY;

@Component (
    immediate = true,
    service = PropostaModelResourcePermission.class
)
public class PropostaModelResourcePermissionImpl implements PropostaModelResourcePermission {
    @Override
    public void check(PermissionChecker permissionChecker, long propostaId, String actionId) throws PortalException {
        if(!contains(permissionChecker, propostaId, actionId)) {
            throw new NoSuchResourcePermissionException("User " + permissionChecker.getUser().getUserId()
                + " doesn't have permission to view Proposta with id " + propostaId);
        }
    }

    @Override
    public void check(PermissionChecker permissionChecker, Proposta proposta, String actionId) throws PortalException {
        check(permissionChecker, proposta.getPropostaId(), actionId);
    }

    @Override
    public boolean contains(PermissionChecker permissionChecker, long propostaId, String actionId) throws PortalException {
        if(hasCompanyPermission(permissionChecker, actionId)) {
            return true;
        }

        boolean hasPermission = _modelResourcePermission.contains(permissionChecker, propostaId, actionId);

        if(!hasPermission) {
            return false;
        }

        return belongsToUser(permissionChecker, propostaId);
    }

    @Override
    public boolean contains(PermissionChecker permissionChecker, Proposta proposta, String actionId) throws PortalException {
        return contains(permissionChecker, proposta.getPropostaId(), actionId);
    }

    @Override
    public String getModelName() {
        return Proposta.class.getName();
    }

    @Override
    public PortletResourcePermission getPortletResourcePermission() {
        return null;
    }

    public boolean belongsToUser(PermissionChecker permissionChecker, long propostaId) throws PortalException {
        User user = permissionChecker.getUser();
        Proposta proposta = _propostaLocalService.getProposta(propostaId);
        String cpfCnpj = _govBrAuthContext.getCpfCnpj(user);
        return proposta.getCpfCnpj().equals(cpfCnpj);
    }


    public boolean hasCompanyPermission(PermissionChecker permissionChecker, String actionId) throws PortalException {
        return _resourcePermissionLocalService.hasResourcePermission(
            permissionChecker.getCompanyId(),
            Proposta.class.getName(),
            SCOPE_COMPANY,
            String.valueOf(permissionChecker.getCompanyId()),
            permissionChecker.getUser().getRoleIds(),
            actionId
        );
    }

    @Reference(
        target = "(model.class.name=" + NegociaDFConstants.MODEL_NAME + ")"
    )
    private ModelResourcePermission<Proposta> _modelResourcePermission;

    @Reference
    private PropostaLocalService _propostaLocalService;

    @Reference
    private ResourcePermissionLocalService _resourcePermissionLocalService;

    @Reference
    private GovBrAuthContext _govBrAuthContext;

}

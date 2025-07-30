package br.com.seatecnologia.gdf.negocia.service.permission;

import br.com.seatecnologia.gdf.negocia.model.Proposta;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.security.permission.PermissionChecker;
import com.liferay.portal.kernel.security.permission.resource.ModelResourcePermission;

public interface PropostaModelResourcePermission  extends ModelResourcePermission<Proposta>  {
    boolean hasCompanyPermission(PermissionChecker permissionChecker, String actionId) throws PortalException;
    boolean belongsToUser(PermissionChecker permissionChecker, long propostaId) throws PortalException;
}

package br.com.seatecnologia.gdf.negocia.context;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.User;

public interface GovBrAuthContext {
    public void setAuthContext(User user, String cpfCnpj) throws PortalException;
    public String getCpfCnpj(User user);
}

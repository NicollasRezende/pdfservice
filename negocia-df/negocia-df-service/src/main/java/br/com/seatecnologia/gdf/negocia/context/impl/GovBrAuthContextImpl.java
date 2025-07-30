package br.com.seatecnologia.gdf.negocia.context.impl;

import br.com.seatecnologia.gdf.negocia.constants.NegociaDFConstants;
import br.com.seatecnologia.gdf.negocia.context.GovBrAuthContext;
import com.liferay.expando.kernel.model.ExpandoColumn;
import com.liferay.expando.kernel.model.ExpandoTable;
import com.liferay.expando.kernel.model.ExpandoValue;
import com.liferay.expando.kernel.service.*;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.User;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import static com.liferay.expando.kernel.model.ExpandoTableConstants.DEFAULT_TABLE_NAME;

@Component(
    immediate = true
)
public class GovBrAuthContextImpl implements GovBrAuthContext {

    public void setAuthContext(User user, String cpfCnpj) throws PortalException {

        ExpandoValue cpfCnpjValue = getAuthExpandoValue(user);

        if( cpfCnpjValue == null ) {
            cpfCnpjValue = _expandoValueLocalService.addValue(
                user.getCompanyId(), User.class.getName(), DEFAULT_TABLE_NAME,
                NegociaDFConstants.CPF_CNPJ_CUSTOM_FIELD_NAME, user.getUserId(), cpfCnpj);

        }

        cpfCnpjValue.setData(cpfCnpj);
        _expandoValueLocalService.updateExpandoValue(cpfCnpjValue);
    }

    public String getCpfCnpj(User user){
        try {
            ExpandoValue cpfCnpjValue = getAuthExpandoValue(user);

            return cpfCnpjValue != null ? cpfCnpjValue.getData() : null;

        } catch (PortalException e) {
            _log.error("Error retrieving CPF/CNPJ for user: " + user.getUserId(), e);
            return null;
        }
    }

    private ExpandoValue getAuthExpandoValue(User user) throws PortalException {
        ExpandoTable userCustomFields = _expandoTableLocalService.getTable(
            user.getCompanyId(), User.class.getName(), DEFAULT_TABLE_NAME);

        ExpandoColumn cpfCnpjColumn = _expandoColumnLocalService.getColumn(
            userCustomFields.getTableId(), NegociaDFConstants.CPF_CNPJ_CUSTOM_FIELD_NAME);

        return _expandoValueLocalService.getValue(
            userCustomFields.getTableId(), cpfCnpjColumn.getColumnId(), user.getUserId());
    }

    @Reference
    private ExpandoTableLocalService _expandoTableLocalService;

    @Reference
    private ExpandoColumnLocalService _expandoColumnLocalService;

    @Reference
    private ExpandoValueLocalService _expandoValueLocalService;

    private static final org.slf4j.Logger _log = org.slf4j.LoggerFactory.getLogger(GovBrAuthContext.class);
}

package br.com.seatecnologia.gdf.negocia.upgrade.v6_0_0;
import br.com.seatecnologia.gdf.negocia.upgrade.BaseUpgradeStep;
import br.com.seatecnologia.gdf.negocia.upgrade.v3_0_0.AddColumnToAdvogadoModel;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

public class AddUserNameToProposta extends BaseUpgradeStep {

    private final Log _log = LogFactoryUtil.getLog(AddUserNameToProposta.class);

    @Override
    protected void doUpgrade() throws Exception {

        if (hasTable("GDF_Proposta")) {
            if(!hasColumn("GDF_Proposta", "userName")){
                alterTableAddColumn(
                    "GDF_Proposta",
                    "userName",
                    "VARCHAR(75) NULL"
                );
                _log.info("Coluna userName adicionada à tabela GDF_Proposta com sucesso.");
            }
        }
    }

}

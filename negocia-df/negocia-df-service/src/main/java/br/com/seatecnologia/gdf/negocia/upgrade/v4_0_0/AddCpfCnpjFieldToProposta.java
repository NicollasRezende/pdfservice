package br.com.seatecnologia.gdf.negocia.upgrade.v4_0_0;

import br.com.seatecnologia.gdf.negocia.upgrade.BaseUpgradeStep;
import br.com.seatecnologia.gdf.negocia.upgrade.v3_0_0.AddColumnToAdvogadoModel;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

public class AddCpfCnpjFieldToProposta extends BaseUpgradeStep {

    private final Log _log = LogFactoryUtil.getLog(AddColumnToAdvogadoModel.class);

    @Override
    protected void doUpgrade() throws Exception {

        if (hasTable("GDF_Proposta")) {
            if(!hasColumn("GDF_Proposta", "cpfCnpj")){
                alterTableAddColumn("GDF_Proposta", "cpfCnpj", "VARCHAR(75)");
                _log.info("GDF_Proposta atualizada, coluna cpfCnpj do tipo STRING foi adicionada.");
            }
        }
    }

}

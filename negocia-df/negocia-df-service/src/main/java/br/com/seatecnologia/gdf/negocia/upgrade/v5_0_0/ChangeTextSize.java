package br.com.seatecnologia.gdf.negocia.upgrade.v5_0_0;

import br.com.seatecnologia.gdf.negocia.upgrade.BaseUpgradeStep;
import br.com.seatecnologia.gdf.negocia.upgrade.v3_0_0.AddColumnToAdvogadoModel;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

public class ChangeTextSize extends BaseUpgradeStep {

    private final Log _log = LogFactoryUtil.getLog(AddColumnToAdvogadoModel.class);

    @Override
    protected void doUpgrade() throws Exception {

        if (hasTable("GDF_Garantia")) {
            if(hasColumn("GDF_Garantia", "localizacao")){
                alterColumnType("GDF_Garantia", "localizacao", "VARCHAR(1000)");
                _log.info("GDF_Garantia atualizada, coluna localizacao do tipo STRING foi alterada para VARCHAR(1000).");
            }
        }
    }

}

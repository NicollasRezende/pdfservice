package br.com.seatecnologia.gdf.negocia.upgrade.v7_0_0;

import br.com.seatecnologia.gdf.negocia.upgrade.BaseUpgradeStep;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

public class ChangeColumnNumeroTableEndereco extends BaseUpgradeStep {
    private final Log _log = LogFactoryUtil.getLog(ChangeColumnNumeroTableEndereco.class);

    @Override
    protected void doUpgrade() throws Exception {

        if (hasTable("GDF_Endereco")) {
            if(hasColumn("GDF_Endereco", "numero")){
                alterColumnType("GDF_Endereco", "numero", "VARCHAR(100)");
                _log.info("GDF_Endereco atualizada, coluna numero do tipo Long foi alterada para VARCHAR(100).");
            }
        }
    }
}

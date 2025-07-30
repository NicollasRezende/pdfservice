package br.com.seatecnologia.gdf.negocia.upgrade.v9_0_0;

import br.com.seatecnologia.gdf.negocia.upgrade.BaseUpgradeStep;

public class AddTipoDocumentoToDemonstracaoContabil extends BaseUpgradeStep {
    @Override
    protected void doUpgrade() throws Exception {
        if (hasTable("GDF_DemonstracaoContabil")) {
            if (!hasColumn("GDF_DemonstracaoContabil", "tipoDocumento")) {
                alterTableAddColumn("GDF_DemonstracaoContabil", "tipoDocumento", "integer");
            }
        }
    }
}

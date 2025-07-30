package br.com.seatecnologia.gdf.negocia.upgrade.v8_0_3;

import br.com.seatecnologia.gdf.negocia.upgrade.BaseUpgradeStep;

public class ChangeFundamentacaoPedidoColumnSize extends BaseUpgradeStep {
    @Override
    protected void doUpgrade() throws Exception {
        if (hasTable("GDF_FundamentacaoPedido")) {
            if (hasColumn("GDF_FundamentacaoPedido", "fundamentacaoPedido")) {
                alterColumnType("GDF_FundamentacaoPedido", "fundamentacaoPedido", "VARCHAR(10000)");
            }
        }
    }
}

package br.com.seatecnologia.gdf.negocia.upgrade.v2_0_0;

import com.liferay.portal.kernel.upgrade.UpgradeProcess;

public class AddingDocumentosCompletosURLFieldInProposta extends UpgradeProcess {

    @Override
    protected void doUpgrade() throws Exception {
        // Upgrade para a entidade Proposta
        if (hasTable("GDF_Proposta")) {
            if (!hasColumn("GDF_Proposta", "documentosCompletosURL")) {
                alterTableAddColumn("GDF_Proposta", "documentosCompletosURL", "VARCHAR(500)");
            }
        }

        if (hasTable("GDF_AcaoJudicial")) {
            if (!hasColumn("GDF_AcaoJudicial", "propostaId")) {
                alterTableAddColumn("GDF_AcaoJudicial", "propostaId", "BIGINT");
            }
        }

        if (hasTable("GDF_FundamentacaoPedido")) {
            if (hasColumn("GDF_FundamentacaoPedido", "fundamentacaoPedido")) {
                alterColumnType("GDF_FundamentacaoPedido", "fundamentacaoPedido", "TEXT");
            }
        }
    }
}
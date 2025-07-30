package br.com.seatecnologia.gdf.negocia.upgrade.v8_0_2;

import br.com.seatecnologia.gdf.negocia.upgrade.BaseUpgradeStep;

public class ChangeOtherColunsTextSize extends BaseUpgradeStep {
    @Override
    protected void doUpgrade() throws Exception {
        if (hasTable("GDF_QualificacaoCompleta")) {
            alterColumnType("GDF_QualificacaoCompleta", "tipoPessoa", "VARCHAR(255)");
            alterColumnType("GDF_QualificacaoCompleta", "nomeRazaoSocial", "VARCHAR(1000)");
            alterColumnType("GDF_QualificacaoCompleta", "nomeFantasia", "VARCHAR(1000)");
            alterColumnType("GDF_QualificacaoCompleta", "representanteLegal", "VARCHAR(1000)");
            alterColumnType("GDF_QualificacaoCompleta", "cpfCnpj", "VARCHAR(255)");
            alterColumnType("GDF_QualificacaoCompleta", "domicilioFiscal", "VARCHAR(255)");
            alterColumnType("GDF_QualificacaoCompleta", "numeroCfdf", "VARCHAR(255)");
            alterColumnType("GDF_QualificacaoCompleta", "email", "VARCHAR(1000)");
            alterColumnType("GDF_QualificacaoCompleta", "telefone", "VARCHAR(255)");
            alterColumnType("GDF_QualificacaoCompleta", "whatsapp", "VARCHAR(255)");
        }

        if (hasTable("GDF_RelacaoCredor")) {
            alterColumnType("GDF_RelacaoCredor", "nomeCredor", "VARCHAR(1000)");
            alterColumnType("GDF_RelacaoCredor", "naturezaCredito", "VARCHAR(255)");
            alterColumnType("GDF_RelacaoCredor", "classificacaoCredito", "VARCHAR(255)");
            alterColumnType("GDF_RelacaoCredor", "referenciaContabil", "VARCHAR(1000)");
        }

        if (hasTable("GDF_TermoAssinado")) {
            alterColumnType("GDF_TermoAssinado", "urlTermo", "VARCHAR(255)");
            alterColumnType("GDF_TermoAssinado", "arquivoPdf", "VARCHAR(500)");
            alterColumnType("GDF_TermoAssinado", "parte", "VARCHAR(255)");
        }

        if (hasTable("GDF_IdentificacaoDebitos")) {
            alterColumnType("GDF_IdentificacaoDebitos", "inscricaoDividaAtiva", "VARCHAR(255)");
            alterColumnType("GDF_IdentificacaoDebitos", "natureza", "VARCHAR(255)");
            alterColumnType("GDF_IdentificacaoDebitos", "situacao", "VARCHAR(255)");
            alterColumnType("GDF_IdentificacaoDebitos", "garantidoJudicialmente", "VARCHAR(255)");
        }
    }
}

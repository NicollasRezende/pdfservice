package br.com.seatecnologia.gdf.negocia.upgrade.v3_0_0;

import br.com.seatecnologia.gdf.negocia.upgrade.BaseUpgradeStep;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

public class AddColumnToAdvogadoModel extends BaseUpgradeStep {

    private final Log _log = LogFactoryUtil.getLog(AddColumnToAdvogadoModel.class);

    @Override
    protected void doUpgrade() throws Exception {

        if (hasTable("GDF_Advogado")) {
            if(!hasColumn("GDF_Advogado", "carteirinhaOAB")){
                alterTableAddColumn("GDF_Advogado", "carteirinhaOAB", "LONG");
                _log.info("GDF_Advogado atualizada, coluna carteirinhaOAB do tipo LONG foi adicionada.");
            }
        }

        if (hasTable("GDF_Declaracao")) {
            if(!hasColumn("GDF_Declaracao", "abusoTransacao")){
                alterTableAddColumn("GDF_Declaracao", "abusoTransacao", "BOOLEAN");
            }

            if(!hasColumn("GDF_Declaracao", "impugnacaoRecursos")){
                alterTableAddColumn("GDF_Declaracao", "impugnacaoRecursos", "BOOLEAN");
            }

            if(!hasColumn("GDF_Declaracao", "renunciaRecursos")){
                alterTableAddColumn("GDF_Declaracao", "renunciaRecursos", "BOOLEAN");
            }

            if(!hasColumn("GDF_Declaracao", "peticionamentoProcessos")){
                alterTableAddColumn("GDF_Declaracao", "peticionamentoProcessos", "BOOLEAN");
            }

            if(!hasColumn("GDF_Declaracao", "prestacaoInformacoes")){
                alterTableAddColumn("GDF_Declaracao", "prestacaoInformacoes", "BOOLEAN");
            }

            if(!hasColumn("GDF_Declaracao", "omissaoInformacoes")){
                alterTableAddColumn("GDF_Declaracao", "omissaoInformacoes", "BOOLEAN");
            }

            if(!hasColumn("GDF_Declaracao", "manutencaoGarantias")){
                alterTableAddColumn("GDF_Declaracao", "manutencaoGarantias", "BOOLEAN");
            }
        }

        if (hasTable("GDF_DemonstracaoDocumentos")) {
            if (hasColumnType("GDF_DemonstracaoDocumentos", "tipoDocumento", "STRING")) {
                alterColumnType("GDF_DemonstracaoDocumentos", "tipoDocumento", "INTEGER");
            }
        }
    }

}

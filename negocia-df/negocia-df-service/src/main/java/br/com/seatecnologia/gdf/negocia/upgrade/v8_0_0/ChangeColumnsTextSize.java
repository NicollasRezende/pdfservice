package br.com.seatecnologia.gdf.negocia.upgrade.v8_0_0;

import br.com.seatecnologia.gdf.negocia.upgrade.BaseUpgradeStep;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

public class ChangeColumnsTextSize extends BaseUpgradeStep {
    private final Log _log = LogFactoryUtil.getLog(ChangeColumnsTextSize.class);

    @Override
    protected void doUpgrade() throws Exception {

        if (hasTable("GDF_AcaoJudicial")) {
            if (!hasColumn("GDF_AcaoJudicial", "orgaoTribunal")) {
                alterTableAddColumn("GDF_AcaoJudicial", "orgaoTribunal", "VARCHAR(255)");
            }
            if (!hasColumn("GDF_AcaoJudicial", "numeroProcesso")) {
                alterTableAddColumn("GDF_AcaoJudicial", "numeroProcesso", "VARCHAR(255)");
            }
            if (!hasColumn("GDF_AcaoJudicial", "unidadeVara")) {
                alterTableAddColumn("GDF_AcaoJudicial", "unidadeVara", "VARCHAR(255)");
            }
            if (!hasColumn("GDF_AcaoJudicial", "parteAutora")) {
                alterTableAddColumn("GDF_AcaoJudicial", "parteAutora", "VARCHAR(255)");
            }
            if (!hasColumn("GDF_AcaoJudicial", "parteRe")) {
                alterTableAddColumn("GDF_AcaoJudicial", "parteRe", "VARCHAR(255)");
            }
        }

        if (hasTable("GDF_AdministradorJudicial")) {
            if (!hasColumn("GDF_AdministradorJudicial", "recuperacao")) {
                alterTableAddColumn("GDF_AdministradorJudicial", "recuperacao", "VARCHAR(255)");
            }
            if (!hasColumn("GDF_AdministradorJudicial", "numeroProcesso")) {
                alterTableAddColumn("GDF_AdministradorJudicial", "numeroProcesso", "VARCHAR(255)");
            }
        }

        if (hasTable("GDF_Advogado")) {
            if (!hasColumn("GDF_Advogado", "numeroOab")) {
                alterTableAddColumn("GDF_Advogado", "numeroOab", "VARCHAR(255)");
            }
            if (!hasColumn("GDF_Advogado", "seccional")) {
                alterTableAddColumn("GDF_Advogado", "seccional", "VARCHAR(255)");
            }
        }

        if (hasTable("GDF_ConcessaoDf")) {
            if (!hasColumn("GDF_ConcessaoDf", "observacoes")) {
                alterTableAddColumn("GDF_ConcessaoDf", "observacoes", "VARCHAR(255)");
            }
        }

        if (hasTable("GDF_CreditoTransacionado")) {
            if (!hasColumn("GDF_CreditoTransacionado", "numeroInscricao")) {
                alterTableAddColumn("GDF_CreditoTransacionado", "numeroInscricao", "VARCHAR(255)");
            }
            if (!hasColumn("GDF_CreditoTransacionado", "codigoReceita")) {
                alterTableAddColumn("GDF_CreditoTransacionado", "codigoReceita", "VARCHAR(255)");
            }
        }

        if (hasTable("GDF_DadosRegistro")) {
            if (!hasColumn("GDF_DadosRegistro", "matriculaImovel")) {
                alterTableAddColumn("GDF_DadosRegistro", "matriculaImovel", "VARCHAR(255)");
            }
            if (!hasColumn("GDF_DadosRegistro", "cartorioRegistro")) {
                alterTableAddColumn("GDF_DadosRegistro", "cartorioRegistro", "VARCHAR(255)");
            }
            if (!hasColumn("GDF_DadosRegistro", "renavam")) {
                alterTableAddColumn("GDF_DadosRegistro", "renavam", "VARCHAR(255)");
            }
            if (!hasColumn("GDF_DadosRegistro", "localizacao")) {
                alterTableAddColumn("GDF_DadosRegistro", "localizacao", "VARCHAR(1000)");
            }
        }

        if (hasTable("GDF_DemaisPartes")) {
            if (!hasColumn("GDF_DemaisPartes", "tipoParte")) {
                alterTableAddColumn("GDF_DemaisPartes", "tipoParte", "VARCHAR(255)");
            }
        }

        if (hasTable("GDF_Encargo")) {
            if (!hasColumn("GDF_Encargo", "descricaoEncargos")) {
                alterTableAddColumn("GDF_Encargo", "descricaoEncargos", "VARCHAR(255)");
            }
        }

        if (hasTable("GDF_Endereco")) {
            if (!hasColumn("GDF_Endereco", "cep")) {
                alterTableAddColumn("GDF_Endereco", "cep", "VARCHAR(255)");
            }
            if (!hasColumn("GDF_Endereco", "endereco")) {
                alterTableAddColumn("GDF_Endereco", "endereco", "VARCHAR(255)");
            }
            if (!hasColumn("GDF_Endereco", "estado")) {
                alterTableAddColumn("GDF_Endereco", "estado", "VARCHAR(255)");
            }
            if (!hasColumn("GDF_Endereco", "municipio")) {
                alterTableAddColumn("GDF_Endereco", "municipio", "VARCHAR(255)");
            }
            if (!hasColumn("GDF_Endereco", "bairro")) {
                alterTableAddColumn("GDF_Endereco", "bairro", "VARCHAR(255)");
            }
            if (!hasColumn("GDF_Endereco", "complemento")) {
                alterTableAddColumn("GDF_Endereco", "complemento", "VARCHAR(255)");
            }
        }

        if (hasTable("GDF_Garantia")) {
            if (!hasColumn("GDF_Garantia", "tipoGarantia")) {
                alterTableAddColumn("GDF_Garantia", "tipoGarantia", "VARCHAR(255)");
            }
            if (!hasColumn("GDF_Garantia", "tipoDevedor")) {
                alterTableAddColumn("GDF_Garantia", "tipoDevedor", "VARCHAR(255)");
            }
            if (!hasColumn("GDF_Garantia", "outras")) {
                alterTableAddColumn("GDF_Garantia", "outras", "VARCHAR(255)");
            }
            if (!hasColumn("GDF_Garantia", "descricaoBem")) {
                alterTableAddColumn("GDF_Garantia", "descricaoBem", "VARCHAR(255)");
            }
        }

        if (hasTable("GDF_Proposta")) {
            if (!hasColumn("GDF_Proposta", "tipoProposta")) {
                alterTableAddColumn("GDF_Proposta", "tipoProposta", "VARCHAR(255)");
            }
            if (!hasColumn("GDF_Proposta", "cpfCnpj")) {
                alterTableAddColumn("GDF_Proposta", "cpfCnpj", "VARCHAR(255)");
            }
            if (!hasColumn("GDF_Proposta", "status")) {
                alterTableAddColumn("GDF_Proposta", "status", "VARCHAR(255)");
            }
            if (!hasColumn("GDF_Proposta", "numeroProtocoloSei")) {
                alterTableAddColumn("GDF_Proposta", "numeroProtocoloSei", "VARCHAR(255)");
            }
            if (!hasColumn("GDF_Proposta", "protocolo")) {
                alterTableAddColumn("GDF_Proposta", "protocolo", "VARCHAR(255)");
            }
        }
    }
}

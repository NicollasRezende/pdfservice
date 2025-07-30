package br.com.seatecnologia.gdf.negocia.upgrade.v8_0_1;

import br.com.seatecnologia.gdf.negocia.upgrade.BaseUpgradeStep;

public class ChangeAllColunsTextSize extends BaseUpgradeStep {
    @Override
    protected void doUpgrade() throws Exception {
        if (hasTable("GDF_AcaoJudicial")) {
            if (hasColumn("GDF_AcaoJudicial", "orgaoTribunal")) {
                alterColumnType("GDF_AcaoJudicial", "orgaoTribunal", "VARCHAR(255)");
            }
            if (hasColumn("GDF_AcaoJudicial", "numeroProcesso")) {
                alterColumnType("GDF_AcaoJudicial", "numeroProcesso", "VARCHAR(255)");
            }
            if (hasColumn("GDF_AcaoJudicial", "unidadeVara")) {
                alterColumnType("GDF_AcaoJudicial", "unidadeVara", "VARCHAR(255)");
            }
            if (hasColumn("GDF_AcaoJudicial", "parteAutora")) {
                alterColumnType("GDF_AcaoJudicial", "parteAutora", "VARCHAR(255)");
            }
            if (hasColumn("GDF_AcaoJudicial", "parteRe")) {
                alterColumnType("GDF_AcaoJudicial", "parteRe", "VARCHAR(255)");
            }
        }

        if (hasTable("GDF_AdministradorJudicial")) {
            if (hasColumn("GDF_AdministradorJudicial", "recuperacao")) {
                alterColumnType("GDF_AdministradorJudicial", "recuperacao", "VARCHAR(255)");
            }
            if (hasColumn("GDF_AdministradorJudicial", "numeroProcesso")) {
                alterColumnType("GDF_AdministradorJudicial", "numeroProcesso", "VARCHAR(255)");
            }
        }

        if (hasTable("GDF_Advogado")) {
            if (hasColumn("GDF_Advogado", "numeroOab")) {
                alterColumnType("GDF_Advogado", "numeroOab", "VARCHAR(255)");
            }
            if (hasColumn("GDF_Advogado", "seccional")) {
                alterColumnType("GDF_Advogado", "seccional", "VARCHAR(255)");
            }
        }

        if (hasTable("GDF_ConcessaoDf")) {
            if (hasColumn("GDF_ConcessaoDf", "observacoes")) {
                alterColumnType("GDF_ConcessaoDf", "observacoes", "VARCHAR(255)");
            }
        }

        if (hasTable("GDF_CreditoTransacionado")) {
            if (hasColumn("GDF_CreditoTransacionado", "numeroInscricao")) {
                alterColumnType("GDF_CreditoTransacionado", "numeroInscricao", "VARCHAR(255)");
            }
            if (hasColumn("GDF_CreditoTransacionado", "codigoReceita")) {
                alterColumnType("GDF_CreditoTransacionado", "codigoReceita", "VARCHAR(255)");
            }
        }

        if (hasTable("GDF_DadosRegistro")) {
            if (hasColumn("GDF_DadosRegistro", "matriculaImovel")) {
                alterColumnType("GDF_DadosRegistro", "matriculaImovel", "VARCHAR(255)");
            }
            if (hasColumn("GDF_DadosRegistro", "cartorioRegistro")) {
                alterColumnType("GDF_DadosRegistro", "cartorioRegistro", "VARCHAR(255)");
            }
            if (hasColumn("GDF_DadosRegistro", "renavam")) {
                alterColumnType("GDF_DadosRegistro", "renavam", "VARCHAR(255)");
            }
            if (hasColumn("GDF_DadosRegistro", "localizacao")) {
                alterColumnType("GDF_DadosRegistro", "localizacao", "VARCHAR(255)");
            }
        }

        if (hasTable("GDF_DemaisPartes")) {
            if (hasColumn("GDF_DemaisPartes", "tipoParte")) {
                alterColumnType("GDF_DemaisPartes", "tipoParte", "VARCHAR(255)");
            }
        }

        if (hasTable("GDF_Encargo")) {
            if (hasColumn("GDF_Encargo", "descricaoEncargos")) {
                alterColumnType("GDF_Encargo", "descricaoEncargos", "VARCHAR(255)");
            }
        }

        if (hasTable("GDF_Endereco")) {
            if (hasColumn("GDF_Endereco", "cep")) {
                alterColumnType("GDF_Endereco", "cep", "VARCHAR(255)");
            }
            if (hasColumn("GDF_Endereco", "endereco")) {
                alterColumnType("GDF_Endereco", "endereco", "VARCHAR(255)");
            }
            if (hasColumn("GDF_Endereco", "estado")) {
                alterColumnType("GDF_Endereco", "estado", "VARCHAR(255)");
            }
            if (hasColumn("GDF_Endereco", "municipio")) {
                alterColumnType("GDF_Endereco", "municipio", "VARCHAR(255)");
            }
            if (hasColumn("GDF_Endereco", "bairro")) {
                alterColumnType("GDF_Endereco", "bairro", "VARCHAR(255)");
            }
            if (hasColumn("GDF_Endereco", "complemento")) {
                alterColumnType("GDF_Endereco", "complemento", "VARCHAR(255)");
            }
        }

        if (hasTable("GDF_Garantia")) {
            if (hasColumn("GDF_Garantia", "tipoGarantia")) {
                alterColumnType("GDF_Garantia", "tipoGarantia", "VARCHAR(255)");
            }
            if (hasColumn("GDF_Garantia", "tipoDevedor")) {
                alterColumnType("GDF_Garantia", "tipoDevedor", "VARCHAR(255)");
            }
            if (hasColumn("GDF_Garantia", "outras")) {
                alterColumnType("GDF_Garantia", "outras", "VARCHAR(255)");
            }
            if (hasColumn("GDF_Garantia", "descricaoBem")) {
                alterColumnType("GDF_Garantia", "descricaoBem", "VARCHAR(255)");
            }
            if (hasColumn("GDF_Garantia", "localizacao")) {
                alterColumnType("GDF_Garantia", "localizacao", "VARCHAR(255)");
            }
        }

        if (hasTable("GDF_Proposta")) {
            if (hasColumn("GDF_Proposta", "tipoProposta")) {
                alterColumnType("GDF_Proposta", "tipoProposta", "VARCHAR(255)");
            }
            if (hasColumn("GDF_Proposta", "cpfCnpj")) {
                alterColumnType("GDF_Proposta", "cpfCnpj", "VARCHAR(255)");
            }
            if (hasColumn("GDF_Proposta", "status")) {
                alterColumnType("GDF_Proposta", "status", "VARCHAR(255)");
            }
            if (hasColumn("GDF_Proposta", "numeroProtocoloSei")) {
                alterColumnType("GDF_Proposta", "numeroProtocoloSei", "VARCHAR(255)");
            }
            if (hasColumn("GDF_Proposta", "protocolo")) {
                alterColumnType("GDF_Proposta", "protocolo", "VARCHAR(255)");
            }
        }
    }
}

package br.com.seatecnologia.gdf.negocia.enums;

import javax.ws.rs.BadRequestException;

public enum DemonstracaoDocumentosEnum {

    BALANCO_PATRIMONIAL(1),
    DEMONSTRACOES_RESULTADOS(2),
    RELATORIOS_GERENCIAIS(3),
    DESCRICAO_GRUPO(4),
    OUTROS_CONTABEIS(5);

    private int value;

    DemonstracaoDocumentosEnum(int value) {
        this.value = value;
    }

    public static String demonstracaoDocumentosEnumToString(int value) {
        switch (value) {
            case 1:
                return "Balanco Patrimonial";
            case 2:
                return "Demonstrações de Resultados";
            case 3:
                return "Relatórios Gerenciais";
            case 4:
                return "Descrição do Grupo";
            case 5:
                return "Outros Contábeis";
            default:
                break;
        }

        throw new BadRequestException("Demonstração Documentos Enum inválido");
    }

    public int getDemonstracaoDocumentosEnum() {
        return value;
    }

}

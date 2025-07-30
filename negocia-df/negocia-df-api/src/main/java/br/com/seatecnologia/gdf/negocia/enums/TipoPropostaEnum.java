package br.com.seatecnologia.gdf.negocia.enums;

public enum TipoPropostaEnum {
    PROPOSTA_INDIVIDUAL("Individual"),
    PROPOSTA_EDITAL("Edital");

    private String label;

    private TipoPropostaEnum(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    public static TipoPropostaEnum fromLabel(String label) {
        for (TipoPropostaEnum tipoPropostaEnum : TipoPropostaEnum.values()) {
            if (tipoPropostaEnum.label.equals(label)) {
                return tipoPropostaEnum;
            }
        }
        return null;
    }
}

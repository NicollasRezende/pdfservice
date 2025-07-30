package br.com.seatecnologia.gdf.negocia.headless.internal.enums;

public enum PropostaType {
    INDIVIDUAL("individual"),
    EDITAL("edital");

    private final String value;

    PropostaType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static PropostaType fromValue(String value) {
        for (PropostaType type : values()) {
            if (type.value.equalsIgnoreCase(value)) {
                return type;
            }
        }
        throw new IllegalArgumentException("Tipo inválido: " + value);
    }
}
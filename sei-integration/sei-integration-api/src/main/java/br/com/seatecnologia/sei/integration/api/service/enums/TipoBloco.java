package br.com.seatecnologia.sei.integration.api.service.enums;

public enum TipoBloco {
    ASSINATURA("A"),
    REUNIAO("R"),
    INTERNO("I");

    private final String codigo;

    TipoBloco(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public static TipoBloco fromCodigo(String codigo) {
        for (TipoBloco tipo : values()) {
            if (tipo.codigo.equalsIgnoreCase(codigo)) {
                return tipo;
            }
        }
        throw new IllegalArgumentException("Código inválido para TipoBloco: " + codigo);
    }
}
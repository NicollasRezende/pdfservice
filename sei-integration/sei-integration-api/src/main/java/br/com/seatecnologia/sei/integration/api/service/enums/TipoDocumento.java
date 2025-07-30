package br.com.seatecnologia.sei.integration.api.service.enums;

public enum TipoDocumento {
    GERADO("G"),      // Documento gerado no SEI
    RECEBIDO("R");    // Documento recebido (externo)

    private final String codigo;

    TipoDocumento(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public static TipoDocumento fromCodigo(String codigo) {
        for (TipoDocumento tipo : values()) {
            if (tipo.codigo.equalsIgnoreCase(codigo)) {
                return tipo;
            }
        }
        throw new IllegalArgumentException("Código inválido para TipoDocumento: " + codigo);
    }
}

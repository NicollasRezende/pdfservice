package br.com.seatecnologia.sei.integration.api.service.enums;

public enum EstadoBloco {
    ABERTO("A"),
    DISPONIBILIZADO("D"),
    RECEBIDO("B"),
    RETORNADO("R"),
    CONCLUIDO("C");

    private final String codigo;

    EstadoBloco(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public static EstadoBloco fromCodigo(String codigo) {
        for (EstadoBloco estado : values()) {
            if (estado.codigo.equalsIgnoreCase(codigo)) {
                return estado;
            }
        }
        throw new IllegalArgumentException("Código inválido para EstadoBloco: " + codigo);
    }
}

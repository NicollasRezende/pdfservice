package br.com.seatecnologia.sei.integration.api.service.enums;

public enum NivelAcesso {
    PUBLICO(0),
    RESTRITO(1),
    SIGILOSO(2);

    private final int valor;

    NivelAcesso(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    public static NivelAcesso fromValor(int valor) {
        for (NivelAcesso nivel : values()) {
            if (nivel.valor == valor) {
                return nivel;
            }
        }
        throw new IllegalArgumentException("Valor inválido para NivelAcesso: " + valor);
    }
}
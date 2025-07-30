package br.com.seatecnologia.sei.integration.api.service.enums;

public enum Sinalizador {
    SIM("S"),
    NAO("N");

    private final String valor;

    Sinalizador(String valor) {
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }
}

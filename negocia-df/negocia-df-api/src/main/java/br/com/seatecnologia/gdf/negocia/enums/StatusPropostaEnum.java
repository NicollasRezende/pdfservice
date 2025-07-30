package br.com.seatecnologia.gdf.negocia.enums;

public enum StatusPropostaEnum {
    PENDENTE_SEI("Processo pendente no SEI"),
    EM_TRAMITE("Em trâmite"),
    AGUARDANDO_HONORARIOS("Aguardando Honorários"),
    HONORARIOS_ENVIADOS("Honorários Enviados"),
    AGUARDANDO_ASSINATURA_GESTOR("Aguardando Assinatura Gestor"),
    AGUARDANDO_ASSINATURA_REQUERENTE("Aguardando Assinatura Requerente"),
    ASSINADO_POR_TODAS_AS_PARTES("Assinado por Todas as Partes"),
    FINALIZADA("Finalizada"),
    INDEFERIDA("Indeferida");

    private final String label;

    StatusPropostaEnum(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    public static StatusPropostaEnum fromLabel(String label) {
        for (StatusPropostaEnum status : StatusPropostaEnum.values()) {
            if (status.label.equalsIgnoreCase(label)) {
                return status;
            }
        }
        return null;
    }
}
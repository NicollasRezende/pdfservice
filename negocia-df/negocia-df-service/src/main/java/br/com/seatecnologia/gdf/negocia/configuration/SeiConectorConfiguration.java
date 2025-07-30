package br.com.seatecnologia.gdf.negocia.configuration;
import aQute.bnd.annotation.metatype.Meta;

@Meta.OCD(
        id = "br.com.seatecnologia.gdf.negocia.configuration.SeiConectorConfiguration",
        localization = "content/Language", name = "Sei-Conector-Configuration"
)
public interface SeiConectorConfiguration {

    @Meta.AD(deflt = "automatico", name = "protocolo", required = false)
    public String protocolo();

    @Meta.AD(deflt = "gdf", name = "tipoProcesso", required = false)
    public String tipoProcesso();

    @Meta.AD(deflt = "0", name = "nivelAcesso", required = false)
    public String nivelAcesso();

    @Meta.AD(deflt = "", name = "hipoteseLegal", required = false)
    public String hipoteseLegal();

    @Meta.AD(deflt = "", name = "tipoPrioridade", required = false)
    public String tipoPrioridade();

}

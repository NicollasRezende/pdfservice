package br.com.seatecnologia.gdf.negocia.configuration;
import aQute.bnd.annotation.metatype.Meta;

@Meta.OCD(
        id = "br.com.seatecnologia.gdf.negocia.configuration.ZipConfiguration",
        localization = "content/Language", name = "zip-service-configuration"
)
public interface ZipConfiguration {

    @Meta.AD(deflt = "http://html-to-pdf.seatecnologia.com.br/pdf", name = "url", required = false)
    public String pdfServiceUrl();
}

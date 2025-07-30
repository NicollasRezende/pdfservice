package br.com.seatecnologia.gdf.negocia.configuration;

import aQute.bnd.annotation.metatype.Meta;
import com.liferay.portal.configuration.metatype.annotations.ExtendedObjectClassDefinition;

import static br.com.seatecnologia.gdf.negocia.constants.NegociaDFConfigurationConstants.CONFIGURATION_PID;

@ExtendedObjectClassDefinition(category = "negocia-df")
@Meta.OCD(
    id = CONFIGURATION_PID,
    localization = "content/Language",
    name = "edital-admin-web-configuration-name"
)
public interface NegociaDFConfiguration {

    @Meta.AD(
        deflt = "0",
        name = "ID do escopo onde os documentos dos usuários serão persistidos",
        description = "Identificador do escopo onde os documentos dos usuários serão armazenados.",
        required = false
    )
    public long documentsGroupId();


    @Meta.AD(
        deflt = "0",
        name = "ID da pasta do de editais",
        description = "Identificador da pasta DL onde os arquivos dos editais serão armazenados.",
        required = false
    )
    public long documentFolderId();

}
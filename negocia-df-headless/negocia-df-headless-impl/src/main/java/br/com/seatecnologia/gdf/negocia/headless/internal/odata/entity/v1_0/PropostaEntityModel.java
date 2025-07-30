package br.com.seatecnologia.gdf.negocia.headless.internal.odata.entity.v1_0;

import com.liferay.portal.kernel.search.Field;
import com.liferay.portal.odata.entity.DateTimeEntityField;
import com.liferay.portal.odata.entity.EntityField;
import com.liferay.portal.odata.entity.EntityField.Type;
import com.liferay.portal.odata.entity.EntityModel;
import com.liferay.portal.odata.entity.StringEntityField;

import java.util.HashMap;
import java.util.Map;

/**
 * OData EntityModel para PropostaEntity
 * 
 * Permite filtrar usando campos como:
 * - ?filter=propostaId eq 103
 * - ?filter=cpfCnpj eq '12345678900'
 * - ?filter=status eq 'Aguardando Análise'
 */
public class PropostaEntityModel implements EntityModel {

    public PropostaEntityModel() {
        _entityFieldsMap = EntityModel.toEntityFieldsMap(
                new DateTimeEntityField(
                        "createDate",
                        locale -> Field.getSortableFieldName(Field.CREATE_DATE),
                        locale -> Field.CREATE_DATE),
                new DateTimeEntityField(
                        "modifiedDate",
                        locale -> Field.getSortableFieldName(Field.MODIFIED_DATE),
                        locale -> Field.MODIFIED_DATE),
                new StringEntityField(
                        "cpfCnpj",
                        locale -> Field.getSortableFieldName("cpfCnpj"),
                        locale -> "cpfCnpj"),
                new StringEntityField(
                        "tipoProposta",
                        locale -> Field.getSortableFieldName("tipoProposta"),
                        locale -> "tipoProposta")
        );

    }

    @Override
    public Map<String, EntityField> getEntityFieldsMap() {
        return _entityFieldsMap;
    }

    @Override
    public String getName() {
        return _NAME;
    }

    private static final String _NAME = "PropostaEntityModel";

    private final Map<String, EntityField> _entityFieldsMap;

}
package br.com.seatecnologia.gdf.negocia.headless.client.serdes.v1_0;

import br.com.seatecnologia.gdf.negocia.headless.client.dto.v1_0.GarantiaDetalhadaEntity;
import br.com.seatecnologia.gdf.negocia.headless.client.dto.v1_0.GarantiaEntity;
import br.com.seatecnologia.gdf.negocia.headless.client.json.BaseJSONParser;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;

import javax.annotation.Generated;

/**
 * @author sabrina
 * @generated
 */
@Generated("")
public class GarantiaEntitySerDes {

	public static GarantiaEntity toDTO(String json) {
		GarantiaEntityJSONParser garantiaEntityJSONParser =
			new GarantiaEntityJSONParser();

		return garantiaEntityJSONParser.parseToDTO(json);
	}

	public static GarantiaEntity[] toDTOs(String json) {
		GarantiaEntityJSONParser garantiaEntityJSONParser =
			new GarantiaEntityJSONParser();

		return garantiaEntityJSONParser.parseToDTOs(json);
	}

	public static String toJSON(GarantiaEntity garantiaEntity) {
		if (garantiaEntity == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		if (garantiaEntity.getGarantiaDetalhadaEntities() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"garantiaDetalhadaEntities\": ");

			sb.append("[");

			for (int i = 0;
				 i < garantiaEntity.getGarantiaDetalhadaEntities().length;
				 i++) {

				sb.append(
					String.valueOf(
						garantiaEntity.getGarantiaDetalhadaEntities()[i]));

				if ((i + 1) <
						garantiaEntity.getGarantiaDetalhadaEntities().length) {

					sb.append(", ");
				}
			}

			sb.append("]");
		}

		if (garantiaEntity.getTipoDevedor() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"tipoDevedor\": ");

			sb.append("\"");

			sb.append(_escape(garantiaEntity.getTipoDevedor()));

			sb.append("\"");
		}

		sb.append("}");

		return sb.toString();
	}

	public static Map<String, Object> toMap(String json) {
		GarantiaEntityJSONParser garantiaEntityJSONParser =
			new GarantiaEntityJSONParser();

		return garantiaEntityJSONParser.parseToMap(json);
	}

	public static Map<String, String> toMap(GarantiaEntity garantiaEntity) {
		if (garantiaEntity == null) {
			return null;
		}

		Map<String, String> map = new TreeMap<>();

		if (garantiaEntity.getGarantiaDetalhadaEntities() == null) {
			map.put("garantiaDetalhadaEntities", null);
		}
		else {
			map.put(
				"garantiaDetalhadaEntities",
				String.valueOf(garantiaEntity.getGarantiaDetalhadaEntities()));
		}

		if (garantiaEntity.getTipoDevedor() == null) {
			map.put("tipoDevedor", null);
		}
		else {
			map.put(
				"tipoDevedor", String.valueOf(garantiaEntity.getTipoDevedor()));
		}

		return map;
	}

	public static class GarantiaEntityJSONParser
		extends BaseJSONParser<GarantiaEntity> {

		@Override
		protected GarantiaEntity createDTO() {
			return new GarantiaEntity();
		}

		@Override
		protected GarantiaEntity[] createDTOArray(int size) {
			return new GarantiaEntity[size];
		}

		@Override
		protected boolean parseMaps(String jsonParserFieldName) {
			if (Objects.equals(
					jsonParserFieldName, "garantiaDetalhadaEntities")) {

				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "tipoDevedor")) {
				return false;
			}

			return false;
		}

		@Override
		protected void setField(
			GarantiaEntity garantiaEntity, String jsonParserFieldName,
			Object jsonParserFieldValue) {

			if (Objects.equals(
					jsonParserFieldName, "garantiaDetalhadaEntities")) {

				if (jsonParserFieldValue != null) {
					Object[] jsonParserFieldValues =
						(Object[])jsonParserFieldValue;

					GarantiaDetalhadaEntity[] garantiaDetalhadaEntitiesArray =
						new GarantiaDetalhadaEntity
							[jsonParserFieldValues.length];

					for (int i = 0; i < garantiaDetalhadaEntitiesArray.length;
						 i++) {

						garantiaDetalhadaEntitiesArray[i] =
							GarantiaDetalhadaEntitySerDes.toDTO(
								(String)jsonParserFieldValues[i]);
					}

					garantiaEntity.setGarantiaDetalhadaEntities(
						garantiaDetalhadaEntitiesArray);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "tipoDevedor")) {
				if (jsonParserFieldValue != null) {
					garantiaEntity.setTipoDevedor((String)jsonParserFieldValue);
				}
			}
		}

	}

	private static String _escape(Object object) {
		String string = String.valueOf(object);

		for (String[] strings : BaseJSONParser.JSON_ESCAPE_STRINGS) {
			string = string.replace(strings[0], strings[1]);
		}

		return string;
	}

	private static String _toJSON(Map<String, ?> map) {
		StringBuilder sb = new StringBuilder("{");

		@SuppressWarnings("unchecked")
		Set set = map.entrySet();

		@SuppressWarnings("unchecked")
		Iterator<Map.Entry<String, ?>> iterator = set.iterator();

		while (iterator.hasNext()) {
			Map.Entry<String, ?> entry = iterator.next();

			sb.append("\"");
			sb.append(entry.getKey());
			sb.append("\": ");

			Object value = entry.getValue();

			sb.append(_toJSON(value));

			if (iterator.hasNext()) {
				sb.append(", ");
			}
		}

		sb.append("}");

		return sb.toString();
	}

	private static String _toJSON(Object value) {
		if (value == null) {
			return "null";
		}

		if (value instanceof Map) {
			return _toJSON((Map)value);
		}

		Class<?> clazz = value.getClass();

		if (clazz.isArray()) {
			StringBuilder sb = new StringBuilder("[");

			Object[] values = (Object[])value;

			for (int i = 0; i < values.length; i++) {
				sb.append(_toJSON(values[i]));

				if ((i + 1) < values.length) {
					sb.append(", ");
				}
			}

			sb.append("]");

			return sb.toString();
		}

		if (value instanceof String) {
			return "\"" + _escape(value) + "\"";
		}

		return String.valueOf(value);
	}

}
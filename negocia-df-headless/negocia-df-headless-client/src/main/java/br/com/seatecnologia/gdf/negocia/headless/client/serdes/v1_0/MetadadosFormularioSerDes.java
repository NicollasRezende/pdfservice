package br.com.seatecnologia.gdf.negocia.headless.client.serdes.v1_0;

import br.com.seatecnologia.gdf.negocia.headless.client.dto.v1_0.EditalEntity;
import br.com.seatecnologia.gdf.negocia.headless.client.dto.v1_0.MetadadosFormulario;
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
public class MetadadosFormularioSerDes {

	public static MetadadosFormulario toDTO(String json) {
		MetadadosFormularioJSONParser metadadosFormularioJSONParser =
			new MetadadosFormularioJSONParser();

		return metadadosFormularioJSONParser.parseToDTO(json);
	}

	public static MetadadosFormulario[] toDTOs(String json) {
		MetadadosFormularioJSONParser metadadosFormularioJSONParser =
			new MetadadosFormularioJSONParser();

		return metadadosFormularioJSONParser.parseToDTOs(json);
	}

	public static String toJSON(MetadadosFormulario metadadosFormulario) {
		if (metadadosFormulario == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		if (metadadosFormulario.getDlFolderId() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"dlFolderId\": ");

			sb.append(metadadosFormulario.getDlFolderId());
		}

		if (metadadosFormulario.getEditalEntities() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"editalEntities\": ");

			sb.append("[");

			for (int i = 0; i < metadadosFormulario.getEditalEntities().length;
				 i++) {

				sb.append(
					String.valueOf(metadadosFormulario.getEditalEntities()[i]));

				if ((i + 1) < metadadosFormulario.getEditalEntities().length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		sb.append("}");

		return sb.toString();
	}

	public static Map<String, Object> toMap(String json) {
		MetadadosFormularioJSONParser metadadosFormularioJSONParser =
			new MetadadosFormularioJSONParser();

		return metadadosFormularioJSONParser.parseToMap(json);
	}

	public static Map<String, String> toMap(
		MetadadosFormulario metadadosFormulario) {

		if (metadadosFormulario == null) {
			return null;
		}

		Map<String, String> map = new TreeMap<>();

		if (metadadosFormulario.getDlFolderId() == null) {
			map.put("dlFolderId", null);
		}
		else {
			map.put(
				"dlFolderId",
				String.valueOf(metadadosFormulario.getDlFolderId()));
		}

		if (metadadosFormulario.getEditalEntities() == null) {
			map.put("editalEntities", null);
		}
		else {
			map.put(
				"editalEntities",
				String.valueOf(metadadosFormulario.getEditalEntities()));
		}

		return map;
	}

	public static class MetadadosFormularioJSONParser
		extends BaseJSONParser<MetadadosFormulario> {

		@Override
		protected MetadadosFormulario createDTO() {
			return new MetadadosFormulario();
		}

		@Override
		protected MetadadosFormulario[] createDTOArray(int size) {
			return new MetadadosFormulario[size];
		}

		@Override
		protected boolean parseMaps(String jsonParserFieldName) {
			if (Objects.equals(jsonParserFieldName, "dlFolderId")) {
				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "editalEntities")) {
				return false;
			}

			return false;
		}

		@Override
		protected void setField(
			MetadadosFormulario metadadosFormulario, String jsonParserFieldName,
			Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "dlFolderId")) {
				if (jsonParserFieldValue != null) {
					metadadosFormulario.setDlFolderId(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "editalEntities")) {
				if (jsonParserFieldValue != null) {
					Object[] jsonParserFieldValues =
						(Object[])jsonParserFieldValue;

					EditalEntity[] editalEntitiesArray =
						new EditalEntity[jsonParserFieldValues.length];

					for (int i = 0; i < editalEntitiesArray.length; i++) {
						editalEntitiesArray[i] = EditalEntitySerDes.toDTO(
							(String)jsonParserFieldValues[i]);
					}

					metadadosFormulario.setEditalEntities(editalEntitiesArray);
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
package br.com.seatecnologia.gdf.negocia.headless.client.serdes.v1_0;

import br.com.seatecnologia.gdf.negocia.headless.client.dto.v1_0.ArquivosEntity;
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
public class ArquivosEntitySerDes {

	public static ArquivosEntity toDTO(String json) {
		ArquivosEntityJSONParser arquivosEntityJSONParser =
			new ArquivosEntityJSONParser();

		return arquivosEntityJSONParser.parseToDTO(json);
	}

	public static ArquivosEntity[] toDTOs(String json) {
		ArquivosEntityJSONParser arquivosEntityJSONParser =
			new ArquivosEntityJSONParser();

		return arquivosEntityJSONParser.parseToDTOs(json);
	}

	public static String toJSON(ArquivosEntity arquivosEntity) {
		if (arquivosEntity == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		if (arquivosEntity.getFileEntryId() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"fileEntryId\": ");

			sb.append(arquivosEntity.getFileEntryId());
		}

		if (arquivosEntity.getFileName() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"fileName\": ");

			sb.append("\"");

			sb.append(_escape(arquivosEntity.getFileName()));

			sb.append("\"");
		}

		if (arquivosEntity.getUrl() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"url\": ");

			sb.append("\"");

			sb.append(_escape(arquivosEntity.getUrl()));

			sb.append("\"");
		}

		sb.append("}");

		return sb.toString();
	}

	public static Map<String, Object> toMap(String json) {
		ArquivosEntityJSONParser arquivosEntityJSONParser =
			new ArquivosEntityJSONParser();

		return arquivosEntityJSONParser.parseToMap(json);
	}

	public static Map<String, String> toMap(ArquivosEntity arquivosEntity) {
		if (arquivosEntity == null) {
			return null;
		}

		Map<String, String> map = new TreeMap<>();

		if (arquivosEntity.getFileEntryId() == null) {
			map.put("fileEntryId", null);
		}
		else {
			map.put(
				"fileEntryId", String.valueOf(arquivosEntity.getFileEntryId()));
		}

		if (arquivosEntity.getFileName() == null) {
			map.put("fileName", null);
		}
		else {
			map.put("fileName", String.valueOf(arquivosEntity.getFileName()));
		}

		if (arquivosEntity.getUrl() == null) {
			map.put("url", null);
		}
		else {
			map.put("url", String.valueOf(arquivosEntity.getUrl()));
		}

		return map;
	}

	public static class ArquivosEntityJSONParser
		extends BaseJSONParser<ArquivosEntity> {

		@Override
		protected ArquivosEntity createDTO() {
			return new ArquivosEntity();
		}

		@Override
		protected ArquivosEntity[] createDTOArray(int size) {
			return new ArquivosEntity[size];
		}

		@Override
		protected boolean parseMaps(String jsonParserFieldName) {
			if (Objects.equals(jsonParserFieldName, "fileEntryId")) {
				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "fileName")) {
				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "url")) {
				return false;
			}

			return false;
		}

		@Override
		protected void setField(
			ArquivosEntity arquivosEntity, String jsonParserFieldName,
			Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "fileEntryId")) {
				if (jsonParserFieldValue != null) {
					arquivosEntity.setFileEntryId(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "fileName")) {
				if (jsonParserFieldValue != null) {
					arquivosEntity.setFileName((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "url")) {
				if (jsonParserFieldValue != null) {
					arquivosEntity.setUrl((String)jsonParserFieldValue);
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
package br.com.seatecnologia.gdf.negocia.headless.client.serdes.v1_0;

import br.com.seatecnologia.gdf.negocia.headless.client.dto.v1_0.LaudoAvaliacaoEntity;
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
public class LaudoAvaliacaoEntitySerDes {

	public static LaudoAvaliacaoEntity toDTO(String json) {
		LaudoAvaliacaoEntityJSONParser laudoAvaliacaoEntityJSONParser =
			new LaudoAvaliacaoEntityJSONParser();

		return laudoAvaliacaoEntityJSONParser.parseToDTO(json);
	}

	public static LaudoAvaliacaoEntity[] toDTOs(String json) {
		LaudoAvaliacaoEntityJSONParser laudoAvaliacaoEntityJSONParser =
			new LaudoAvaliacaoEntityJSONParser();

		return laudoAvaliacaoEntityJSONParser.parseToDTOs(json);
	}

	public static String toJSON(LaudoAvaliacaoEntity laudoAvaliacaoEntity) {
		if (laudoAvaliacaoEntity == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		if (laudoAvaliacaoEntity.getFileEntryId() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"fileEntryId\": ");

			sb.append(laudoAvaliacaoEntity.getFileEntryId());
		}

		if (laudoAvaliacaoEntity.getLaudoId() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"laudoId\": ");

			sb.append(laudoAvaliacaoEntity.getLaudoId());
		}

		sb.append("}");

		return sb.toString();
	}

	public static Map<String, Object> toMap(String json) {
		LaudoAvaliacaoEntityJSONParser laudoAvaliacaoEntityJSONParser =
			new LaudoAvaliacaoEntityJSONParser();

		return laudoAvaliacaoEntityJSONParser.parseToMap(json);
	}

	public static Map<String, String> toMap(
		LaudoAvaliacaoEntity laudoAvaliacaoEntity) {

		if (laudoAvaliacaoEntity == null) {
			return null;
		}

		Map<String, String> map = new TreeMap<>();

		if (laudoAvaliacaoEntity.getFileEntryId() == null) {
			map.put("fileEntryId", null);
		}
		else {
			map.put(
				"fileEntryId",
				String.valueOf(laudoAvaliacaoEntity.getFileEntryId()));
		}

		if (laudoAvaliacaoEntity.getLaudoId() == null) {
			map.put("laudoId", null);
		}
		else {
			map.put(
				"laudoId", String.valueOf(laudoAvaliacaoEntity.getLaudoId()));
		}

		return map;
	}

	public static class LaudoAvaliacaoEntityJSONParser
		extends BaseJSONParser<LaudoAvaliacaoEntity> {

		@Override
		protected LaudoAvaliacaoEntity createDTO() {
			return new LaudoAvaliacaoEntity();
		}

		@Override
		protected LaudoAvaliacaoEntity[] createDTOArray(int size) {
			return new LaudoAvaliacaoEntity[size];
		}

		@Override
		protected boolean parseMaps(String jsonParserFieldName) {
			if (Objects.equals(jsonParserFieldName, "fileEntryId")) {
				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "laudoId")) {
				return false;
			}

			return false;
		}

		@Override
		protected void setField(
			LaudoAvaliacaoEntity laudoAvaliacaoEntity,
			String jsonParserFieldName, Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "fileEntryId")) {
				if (jsonParserFieldValue != null) {
					laudoAvaliacaoEntity.setFileEntryId(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "laudoId")) {
				if (jsonParserFieldValue != null) {
					laudoAvaliacaoEntity.setLaudoId(
						Long.valueOf((String)jsonParserFieldValue));
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
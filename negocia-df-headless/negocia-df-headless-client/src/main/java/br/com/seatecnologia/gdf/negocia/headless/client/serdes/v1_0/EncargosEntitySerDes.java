package br.com.seatecnologia.gdf.negocia.headless.client.serdes.v1_0;

import br.com.seatecnologia.gdf.negocia.headless.client.dto.v1_0.EncargosEntity;
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
public class EncargosEntitySerDes {

	public static EncargosEntity toDTO(String json) {
		EncargosEntityJSONParser encargosEntityJSONParser =
			new EncargosEntityJSONParser();

		return encargosEntityJSONParser.parseToDTO(json);
	}

	public static EncargosEntity[] toDTOs(String json) {
		EncargosEntityJSONParser encargosEntityJSONParser =
			new EncargosEntityJSONParser();

		return encargosEntityJSONParser.parseToDTOs(json);
	}

	public static String toJSON(EncargosEntity encargosEntity) {
		if (encargosEntity == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		if (encargosEntity.getDescricaoEncargos() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"descricaoEncargos\": ");

			sb.append("\"");

			sb.append(_escape(encargosEntity.getDescricaoEncargos()));

			sb.append("\"");
		}

		if (encargosEntity.getEncargoId() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"encargoId\": ");

			sb.append(encargosEntity.getEncargoId());
		}

		if (encargosEntity.getPropostaId() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"propostaId\": ");

			sb.append(encargosEntity.getPropostaId());
		}

		if (encargosEntity.getValorEncargos() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"valorEncargos\": ");

			sb.append(encargosEntity.getValorEncargos());
		}

		sb.append("}");

		return sb.toString();
	}

	public static Map<String, Object> toMap(String json) {
		EncargosEntityJSONParser encargosEntityJSONParser =
			new EncargosEntityJSONParser();

		return encargosEntityJSONParser.parseToMap(json);
	}

	public static Map<String, String> toMap(EncargosEntity encargosEntity) {
		if (encargosEntity == null) {
			return null;
		}

		Map<String, String> map = new TreeMap<>();

		if (encargosEntity.getDescricaoEncargos() == null) {
			map.put("descricaoEncargos", null);
		}
		else {
			map.put(
				"descricaoEncargos",
				String.valueOf(encargosEntity.getDescricaoEncargos()));
		}

		if (encargosEntity.getEncargoId() == null) {
			map.put("encargoId", null);
		}
		else {
			map.put("encargoId", String.valueOf(encargosEntity.getEncargoId()));
		}

		if (encargosEntity.getPropostaId() == null) {
			map.put("propostaId", null);
		}
		else {
			map.put(
				"propostaId", String.valueOf(encargosEntity.getPropostaId()));
		}

		if (encargosEntity.getValorEncargos() == null) {
			map.put("valorEncargos", null);
		}
		else {
			map.put(
				"valorEncargos",
				String.valueOf(encargosEntity.getValorEncargos()));
		}

		return map;
	}

	public static class EncargosEntityJSONParser
		extends BaseJSONParser<EncargosEntity> {

		@Override
		protected EncargosEntity createDTO() {
			return new EncargosEntity();
		}

		@Override
		protected EncargosEntity[] createDTOArray(int size) {
			return new EncargosEntity[size];
		}

		@Override
		protected boolean parseMaps(String jsonParserFieldName) {
			if (Objects.equals(jsonParserFieldName, "descricaoEncargos")) {
				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "encargoId")) {
				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "propostaId")) {
				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "valorEncargos")) {
				return false;
			}

			return false;
		}

		@Override
		protected void setField(
			EncargosEntity encargosEntity, String jsonParserFieldName,
			Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "descricaoEncargos")) {
				if (jsonParserFieldValue != null) {
					encargosEntity.setDescricaoEncargos(
						(String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "encargoId")) {
				if (jsonParserFieldValue != null) {
					encargosEntity.setEncargoId(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "propostaId")) {
				if (jsonParserFieldValue != null) {
					encargosEntity.setPropostaId(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "valorEncargos")) {
				if (jsonParserFieldValue != null) {
					encargosEntity.setValorEncargos(
						Double.valueOf((String)jsonParserFieldValue));
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
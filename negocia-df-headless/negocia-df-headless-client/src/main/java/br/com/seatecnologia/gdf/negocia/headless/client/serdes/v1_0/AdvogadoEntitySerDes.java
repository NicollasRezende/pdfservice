package br.com.seatecnologia.gdf.negocia.headless.client.serdes.v1_0;

import br.com.seatecnologia.gdf.negocia.headless.client.dto.v1_0.AdvogadoEntity;
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
public class AdvogadoEntitySerDes {

	public static AdvogadoEntity toDTO(String json) {
		AdvogadoEntityJSONParser advogadoEntityJSONParser =
			new AdvogadoEntityJSONParser();

		return advogadoEntityJSONParser.parseToDTO(json);
	}

	public static AdvogadoEntity[] toDTOs(String json) {
		AdvogadoEntityJSONParser advogadoEntityJSONParser =
			new AdvogadoEntityJSONParser();

		return advogadoEntityJSONParser.parseToDTOs(json);
	}

	public static String toJSON(AdvogadoEntity advogadoEntity) {
		if (advogadoEntity == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		if (advogadoEntity.getAdvogadoId() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"advogadoId\": ");

			sb.append(advogadoEntity.getAdvogadoId());
		}

		if (advogadoEntity.getCarteirinhaOAB() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"carteirinhaOAB\": ");

			sb.append(String.valueOf(advogadoEntity.getCarteirinhaOAB()));
		}

		if (advogadoEntity.getNumeroOab() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"numeroOab\": ");

			sb.append("\"");

			sb.append(_escape(advogadoEntity.getNumeroOab()));

			sb.append("\"");
		}

		if (advogadoEntity.getQualificacao() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"qualificacao\": ");

			sb.append(String.valueOf(advogadoEntity.getQualificacao()));
		}

		if (advogadoEntity.getSeccional() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"seccional\": ");

			sb.append("\"");

			sb.append(_escape(advogadoEntity.getSeccional()));

			sb.append("\"");
		}

		sb.append("}");

		return sb.toString();
	}

	public static Map<String, Object> toMap(String json) {
		AdvogadoEntityJSONParser advogadoEntityJSONParser =
			new AdvogadoEntityJSONParser();

		return advogadoEntityJSONParser.parseToMap(json);
	}

	public static Map<String, String> toMap(AdvogadoEntity advogadoEntity) {
		if (advogadoEntity == null) {
			return null;
		}

		Map<String, String> map = new TreeMap<>();

		if (advogadoEntity.getAdvogadoId() == null) {
			map.put("advogadoId", null);
		}
		else {
			map.put(
				"advogadoId", String.valueOf(advogadoEntity.getAdvogadoId()));
		}

		if (advogadoEntity.getCarteirinhaOAB() == null) {
			map.put("carteirinhaOAB", null);
		}
		else {
			map.put(
				"carteirinhaOAB",
				String.valueOf(advogadoEntity.getCarteirinhaOAB()));
		}

		if (advogadoEntity.getNumeroOab() == null) {
			map.put("numeroOab", null);
		}
		else {
			map.put("numeroOab", String.valueOf(advogadoEntity.getNumeroOab()));
		}

		if (advogadoEntity.getQualificacao() == null) {
			map.put("qualificacao", null);
		}
		else {
			map.put(
				"qualificacao",
				String.valueOf(advogadoEntity.getQualificacao()));
		}

		if (advogadoEntity.getSeccional() == null) {
			map.put("seccional", null);
		}
		else {
			map.put("seccional", String.valueOf(advogadoEntity.getSeccional()));
		}

		return map;
	}

	public static class AdvogadoEntityJSONParser
		extends BaseJSONParser<AdvogadoEntity> {

		@Override
		protected AdvogadoEntity createDTO() {
			return new AdvogadoEntity();
		}

		@Override
		protected AdvogadoEntity[] createDTOArray(int size) {
			return new AdvogadoEntity[size];
		}

		@Override
		protected boolean parseMaps(String jsonParserFieldName) {
			if (Objects.equals(jsonParserFieldName, "advogadoId")) {
				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "carteirinhaOAB")) {
				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "numeroOab")) {
				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "qualificacao")) {
				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "seccional")) {
				return false;
			}

			return false;
		}

		@Override
		protected void setField(
			AdvogadoEntity advogadoEntity, String jsonParserFieldName,
			Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "advogadoId")) {
				if (jsonParserFieldValue != null) {
					advogadoEntity.setAdvogadoId(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "carteirinhaOAB")) {
				if (jsonParserFieldValue != null) {
					advogadoEntity.setCarteirinhaOAB(
						ArquivosEntitySerDes.toDTO(
							(String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "numeroOab")) {
				if (jsonParserFieldValue != null) {
					advogadoEntity.setNumeroOab((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "qualificacao")) {
				if (jsonParserFieldValue != null) {
					advogadoEntity.setQualificacao(
						QualificacaoCompletaEntitySerDes.toDTO(
							(String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "seccional")) {
				if (jsonParserFieldValue != null) {
					advogadoEntity.setSeccional((String)jsonParserFieldValue);
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
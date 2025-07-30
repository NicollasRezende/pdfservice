package br.com.seatecnologia.gdf.negocia.headless.client.serdes.v1_0;

import br.com.seatecnologia.gdf.negocia.headless.client.dto.v1_0.TermosAssinadoEntity;
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
public class TermosAssinadoEntitySerDes {

	public static TermosAssinadoEntity toDTO(String json) {
		TermosAssinadoEntityJSONParser termosAssinadoEntityJSONParser =
			new TermosAssinadoEntityJSONParser();

		return termosAssinadoEntityJSONParser.parseToDTO(json);
	}

	public static TermosAssinadoEntity[] toDTOs(String json) {
		TermosAssinadoEntityJSONParser termosAssinadoEntityJSONParser =
			new TermosAssinadoEntityJSONParser();

		return termosAssinadoEntityJSONParser.parseToDTOs(json);
	}

	public static String toJSON(TermosAssinadoEntity termosAssinadoEntity) {
		if (termosAssinadoEntity == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		if (termosAssinadoEntity.getArquivoPdf() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"arquivoPdf\": ");

			sb.append(String.valueOf(termosAssinadoEntity.getArquivoPdf()));
		}

		if (termosAssinadoEntity.getParte() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"parte\": ");

			sb.append("\"");

			sb.append(_escape(termosAssinadoEntity.getParte()));

			sb.append("\"");
		}

		if (termosAssinadoEntity.getPropostaId() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"propostaId\": ");

			sb.append(termosAssinadoEntity.getPropostaId());
		}

		if (termosAssinadoEntity.getTermosAssinadoId() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"termosAssinadoId\": ");

			sb.append(termosAssinadoEntity.getTermosAssinadoId());
		}

		if (termosAssinadoEntity.getUrlTermo() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"urlTermo\": ");

			sb.append("\"");

			sb.append(_escape(termosAssinadoEntity.getUrlTermo()));

			sb.append("\"");
		}

		sb.append("}");

		return sb.toString();
	}

	public static Map<String, Object> toMap(String json) {
		TermosAssinadoEntityJSONParser termosAssinadoEntityJSONParser =
			new TermosAssinadoEntityJSONParser();

		return termosAssinadoEntityJSONParser.parseToMap(json);
	}

	public static Map<String, String> toMap(
		TermosAssinadoEntity termosAssinadoEntity) {

		if (termosAssinadoEntity == null) {
			return null;
		}

		Map<String, String> map = new TreeMap<>();

		if (termosAssinadoEntity.getArquivoPdf() == null) {
			map.put("arquivoPdf", null);
		}
		else {
			map.put(
				"arquivoPdf",
				String.valueOf(termosAssinadoEntity.getArquivoPdf()));
		}

		if (termosAssinadoEntity.getParte() == null) {
			map.put("parte", null);
		}
		else {
			map.put("parte", String.valueOf(termosAssinadoEntity.getParte()));
		}

		if (termosAssinadoEntity.getPropostaId() == null) {
			map.put("propostaId", null);
		}
		else {
			map.put(
				"propostaId",
				String.valueOf(termosAssinadoEntity.getPropostaId()));
		}

		if (termosAssinadoEntity.getTermosAssinadoId() == null) {
			map.put("termosAssinadoId", null);
		}
		else {
			map.put(
				"termosAssinadoId",
				String.valueOf(termosAssinadoEntity.getTermosAssinadoId()));
		}

		if (termosAssinadoEntity.getUrlTermo() == null) {
			map.put("urlTermo", null);
		}
		else {
			map.put(
				"urlTermo", String.valueOf(termosAssinadoEntity.getUrlTermo()));
		}

		return map;
	}

	public static class TermosAssinadoEntityJSONParser
		extends BaseJSONParser<TermosAssinadoEntity> {

		@Override
		protected TermosAssinadoEntity createDTO() {
			return new TermosAssinadoEntity();
		}

		@Override
		protected TermosAssinadoEntity[] createDTOArray(int size) {
			return new TermosAssinadoEntity[size];
		}

		@Override
		protected boolean parseMaps(String jsonParserFieldName) {
			if (Objects.equals(jsonParserFieldName, "arquivoPdf")) {
				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "parte")) {
				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "propostaId")) {
				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "termosAssinadoId")) {
				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "urlTermo")) {
				return false;
			}

			return false;
		}

		@Override
		protected void setField(
			TermosAssinadoEntity termosAssinadoEntity,
			String jsonParserFieldName, Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "arquivoPdf")) {
				if (jsonParserFieldValue != null) {
					termosAssinadoEntity.setArquivoPdf(
						ArquivosEntitySerDes.toDTO(
							(String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "parte")) {
				if (jsonParserFieldValue != null) {
					termosAssinadoEntity.setParte((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "propostaId")) {
				if (jsonParserFieldValue != null) {
					termosAssinadoEntity.setPropostaId(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "termosAssinadoId")) {
				if (jsonParserFieldValue != null) {
					termosAssinadoEntity.setTermosAssinadoId(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "urlTermo")) {
				if (jsonParserFieldValue != null) {
					termosAssinadoEntity.setUrlTermo(
						(String)jsonParserFieldValue);
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
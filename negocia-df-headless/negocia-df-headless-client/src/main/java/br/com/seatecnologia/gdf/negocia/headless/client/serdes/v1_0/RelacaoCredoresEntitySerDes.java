package br.com.seatecnologia.gdf.negocia.headless.client.serdes.v1_0;

import br.com.seatecnologia.gdf.negocia.headless.client.dto.v1_0.RelacaoCredoresEntity;
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
public class RelacaoCredoresEntitySerDes {

	public static RelacaoCredoresEntity toDTO(String json) {
		RelacaoCredoresEntityJSONParser relacaoCredoresEntityJSONParser =
			new RelacaoCredoresEntityJSONParser();

		return relacaoCredoresEntityJSONParser.parseToDTO(json);
	}

	public static RelacaoCredoresEntity[] toDTOs(String json) {
		RelacaoCredoresEntityJSONParser relacaoCredoresEntityJSONParser =
			new RelacaoCredoresEntityJSONParser();

		return relacaoCredoresEntityJSONParser.parseToDTOs(json);
	}

	public static String toJSON(RelacaoCredoresEntity relacaoCredoresEntity) {
		if (relacaoCredoresEntity == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		if (relacaoCredoresEntity.getClassificacaoCredito() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"classificacaoCredito\": ");

			sb.append("\"");

			sb.append(_escape(relacaoCredoresEntity.getClassificacaoCredito()));

			sb.append("\"");
		}

		if (relacaoCredoresEntity.getCredorId() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"credorId\": ");

			sb.append(relacaoCredoresEntity.getCredorId());
		}

		if (relacaoCredoresEntity.getNaturezaCredito() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"naturezaCredito\": ");

			sb.append("\"");

			sb.append(_escape(relacaoCredoresEntity.getNaturezaCredito()));

			sb.append("\"");
		}

		if (relacaoCredoresEntity.getNomeCredor() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"nomeCredor\": ");

			sb.append("\"");

			sb.append(_escape(relacaoCredoresEntity.getNomeCredor()));

			sb.append("\"");
		}

		if (relacaoCredoresEntity.getPropostaId() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"propostaId\": ");

			sb.append(relacaoCredoresEntity.getPropostaId());
		}

		if (relacaoCredoresEntity.getReferenciaRegistro() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"referenciaRegistro\": ");

			sb.append("\"");

			sb.append(_escape(relacaoCredoresEntity.getReferenciaRegistro()));

			sb.append("\"");
		}

		if (relacaoCredoresEntity.getValorCredito() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"valorCredito\": ");

			sb.append(relacaoCredoresEntity.getValorCredito());
		}

		sb.append("}");

		return sb.toString();
	}

	public static Map<String, Object> toMap(String json) {
		RelacaoCredoresEntityJSONParser relacaoCredoresEntityJSONParser =
			new RelacaoCredoresEntityJSONParser();

		return relacaoCredoresEntityJSONParser.parseToMap(json);
	}

	public static Map<String, String> toMap(
		RelacaoCredoresEntity relacaoCredoresEntity) {

		if (relacaoCredoresEntity == null) {
			return null;
		}

		Map<String, String> map = new TreeMap<>();

		if (relacaoCredoresEntity.getClassificacaoCredito() == null) {
			map.put("classificacaoCredito", null);
		}
		else {
			map.put(
				"classificacaoCredito",
				String.valueOf(
					relacaoCredoresEntity.getClassificacaoCredito()));
		}

		if (relacaoCredoresEntity.getCredorId() == null) {
			map.put("credorId", null);
		}
		else {
			map.put(
				"credorId",
				String.valueOf(relacaoCredoresEntity.getCredorId()));
		}

		if (relacaoCredoresEntity.getNaturezaCredito() == null) {
			map.put("naturezaCredito", null);
		}
		else {
			map.put(
				"naturezaCredito",
				String.valueOf(relacaoCredoresEntity.getNaturezaCredito()));
		}

		if (relacaoCredoresEntity.getNomeCredor() == null) {
			map.put("nomeCredor", null);
		}
		else {
			map.put(
				"nomeCredor",
				String.valueOf(relacaoCredoresEntity.getNomeCredor()));
		}

		if (relacaoCredoresEntity.getPropostaId() == null) {
			map.put("propostaId", null);
		}
		else {
			map.put(
				"propostaId",
				String.valueOf(relacaoCredoresEntity.getPropostaId()));
		}

		if (relacaoCredoresEntity.getReferenciaRegistro() == null) {
			map.put("referenciaRegistro", null);
		}
		else {
			map.put(
				"referenciaRegistro",
				String.valueOf(relacaoCredoresEntity.getReferenciaRegistro()));
		}

		if (relacaoCredoresEntity.getValorCredito() == null) {
			map.put("valorCredito", null);
		}
		else {
			map.put(
				"valorCredito",
				String.valueOf(relacaoCredoresEntity.getValorCredito()));
		}

		return map;
	}

	public static class RelacaoCredoresEntityJSONParser
		extends BaseJSONParser<RelacaoCredoresEntity> {

		@Override
		protected RelacaoCredoresEntity createDTO() {
			return new RelacaoCredoresEntity();
		}

		@Override
		protected RelacaoCredoresEntity[] createDTOArray(int size) {
			return new RelacaoCredoresEntity[size];
		}

		@Override
		protected boolean parseMaps(String jsonParserFieldName) {
			if (Objects.equals(jsonParserFieldName, "classificacaoCredito")) {
				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "credorId")) {
				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "naturezaCredito")) {
				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "nomeCredor")) {
				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "propostaId")) {
				return false;
			}
			else if (Objects.equals(
						jsonParserFieldName, "referenciaRegistro")) {

				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "valorCredito")) {
				return false;
			}

			return false;
		}

		@Override
		protected void setField(
			RelacaoCredoresEntity relacaoCredoresEntity,
			String jsonParserFieldName, Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "classificacaoCredito")) {
				if (jsonParserFieldValue != null) {
					relacaoCredoresEntity.setClassificacaoCredito(
						(String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "credorId")) {
				if (jsonParserFieldValue != null) {
					relacaoCredoresEntity.setCredorId(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "naturezaCredito")) {
				if (jsonParserFieldValue != null) {
					relacaoCredoresEntity.setNaturezaCredito(
						(String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "nomeCredor")) {
				if (jsonParserFieldValue != null) {
					relacaoCredoresEntity.setNomeCredor(
						(String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "propostaId")) {
				if (jsonParserFieldValue != null) {
					relacaoCredoresEntity.setPropostaId(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(
						jsonParserFieldName, "referenciaRegistro")) {

				if (jsonParserFieldValue != null) {
					relacaoCredoresEntity.setReferenciaRegistro(
						(String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "valorCredito")) {
				if (jsonParserFieldValue != null) {
					relacaoCredoresEntity.setValorCredito(
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
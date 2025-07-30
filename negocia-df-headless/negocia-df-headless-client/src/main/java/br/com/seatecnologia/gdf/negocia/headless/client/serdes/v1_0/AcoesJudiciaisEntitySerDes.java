package br.com.seatecnologia.gdf.negocia.headless.client.serdes.v1_0;

import br.com.seatecnologia.gdf.negocia.headless.client.dto.v1_0.AcoesJudiciaisEntity;
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
public class AcoesJudiciaisEntitySerDes {

	public static AcoesJudiciaisEntity toDTO(String json) {
		AcoesJudiciaisEntityJSONParser acoesJudiciaisEntityJSONParser =
			new AcoesJudiciaisEntityJSONParser();

		return acoesJudiciaisEntityJSONParser.parseToDTO(json);
	}

	public static AcoesJudiciaisEntity[] toDTOs(String json) {
		AcoesJudiciaisEntityJSONParser acoesJudiciaisEntityJSONParser =
			new AcoesJudiciaisEntityJSONParser();

		return acoesJudiciaisEntityJSONParser.parseToDTOs(json);
	}

	public static String toJSON(AcoesJudiciaisEntity acoesJudiciaisEntity) {
		if (acoesJudiciaisEntity == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		if (acoesJudiciaisEntity.getAcaoId() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"acaoId\": ");

			sb.append(acoesJudiciaisEntity.getAcaoId());
		}

		if (acoesJudiciaisEntity.getNumeroProcesso() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"numeroProcesso\": ");

			sb.append("\"");

			sb.append(_escape(acoesJudiciaisEntity.getNumeroProcesso()));

			sb.append("\"");
		}

		if (acoesJudiciaisEntity.getObservacoes() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"observacoes\": ");

			sb.append("\"");

			sb.append(_escape(acoesJudiciaisEntity.getObservacoes()));

			sb.append("\"");
		}

		if (acoesJudiciaisEntity.getOrgaoTribunal() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"orgaoTribunal\": ");

			sb.append("\"");

			sb.append(_escape(acoesJudiciaisEntity.getOrgaoTribunal()));

			sb.append("\"");
		}

		if (acoesJudiciaisEntity.getParteAutora() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"parteAutora\": ");

			sb.append("\"");

			sb.append(_escape(acoesJudiciaisEntity.getParteAutora()));

			sb.append("\"");
		}

		if (acoesJudiciaisEntity.getParteRe() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"parteRe\": ");

			sb.append("\"");

			sb.append(_escape(acoesJudiciaisEntity.getParteRe()));

			sb.append("\"");
		}

		if (acoesJudiciaisEntity.getPropostaId() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"propostaId\": ");

			sb.append(acoesJudiciaisEntity.getPropostaId());
		}

		if (acoesJudiciaisEntity.getUnidadeVara() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"unidadeVara\": ");

			sb.append("\"");

			sb.append(_escape(acoesJudiciaisEntity.getUnidadeVara()));

			sb.append("\"");
		}

		sb.append("}");

		return sb.toString();
	}

	public static Map<String, Object> toMap(String json) {
		AcoesJudiciaisEntityJSONParser acoesJudiciaisEntityJSONParser =
			new AcoesJudiciaisEntityJSONParser();

		return acoesJudiciaisEntityJSONParser.parseToMap(json);
	}

	public static Map<String, String> toMap(
		AcoesJudiciaisEntity acoesJudiciaisEntity) {

		if (acoesJudiciaisEntity == null) {
			return null;
		}

		Map<String, String> map = new TreeMap<>();

		if (acoesJudiciaisEntity.getAcaoId() == null) {
			map.put("acaoId", null);
		}
		else {
			map.put("acaoId", String.valueOf(acoesJudiciaisEntity.getAcaoId()));
		}

		if (acoesJudiciaisEntity.getNumeroProcesso() == null) {
			map.put("numeroProcesso", null);
		}
		else {
			map.put(
				"numeroProcesso",
				String.valueOf(acoesJudiciaisEntity.getNumeroProcesso()));
		}

		if (acoesJudiciaisEntity.getObservacoes() == null) {
			map.put("observacoes", null);
		}
		else {
			map.put(
				"observacoes",
				String.valueOf(acoesJudiciaisEntity.getObservacoes()));
		}

		if (acoesJudiciaisEntity.getOrgaoTribunal() == null) {
			map.put("orgaoTribunal", null);
		}
		else {
			map.put(
				"orgaoTribunal",
				String.valueOf(acoesJudiciaisEntity.getOrgaoTribunal()));
		}

		if (acoesJudiciaisEntity.getParteAutora() == null) {
			map.put("parteAutora", null);
		}
		else {
			map.put(
				"parteAutora",
				String.valueOf(acoesJudiciaisEntity.getParteAutora()));
		}

		if (acoesJudiciaisEntity.getParteRe() == null) {
			map.put("parteRe", null);
		}
		else {
			map.put(
				"parteRe", String.valueOf(acoesJudiciaisEntity.getParteRe()));
		}

		if (acoesJudiciaisEntity.getPropostaId() == null) {
			map.put("propostaId", null);
		}
		else {
			map.put(
				"propostaId",
				String.valueOf(acoesJudiciaisEntity.getPropostaId()));
		}

		if (acoesJudiciaisEntity.getUnidadeVara() == null) {
			map.put("unidadeVara", null);
		}
		else {
			map.put(
				"unidadeVara",
				String.valueOf(acoesJudiciaisEntity.getUnidadeVara()));
		}

		return map;
	}

	public static class AcoesJudiciaisEntityJSONParser
		extends BaseJSONParser<AcoesJudiciaisEntity> {

		@Override
		protected AcoesJudiciaisEntity createDTO() {
			return new AcoesJudiciaisEntity();
		}

		@Override
		protected AcoesJudiciaisEntity[] createDTOArray(int size) {
			return new AcoesJudiciaisEntity[size];
		}

		@Override
		protected boolean parseMaps(String jsonParserFieldName) {
			if (Objects.equals(jsonParserFieldName, "acaoId")) {
				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "numeroProcesso")) {
				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "observacoes")) {
				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "orgaoTribunal")) {
				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "parteAutora")) {
				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "parteRe")) {
				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "propostaId")) {
				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "unidadeVara")) {
				return false;
			}

			return false;
		}

		@Override
		protected void setField(
			AcoesJudiciaisEntity acoesJudiciaisEntity,
			String jsonParserFieldName, Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "acaoId")) {
				if (jsonParserFieldValue != null) {
					acoesJudiciaisEntity.setAcaoId(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "numeroProcesso")) {
				if (jsonParserFieldValue != null) {
					acoesJudiciaisEntity.setNumeroProcesso(
						(String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "observacoes")) {
				if (jsonParserFieldValue != null) {
					acoesJudiciaisEntity.setObservacoes(
						(String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "orgaoTribunal")) {
				if (jsonParserFieldValue != null) {
					acoesJudiciaisEntity.setOrgaoTribunal(
						(String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "parteAutora")) {
				if (jsonParserFieldValue != null) {
					acoesJudiciaisEntity.setParteAutora(
						(String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "parteRe")) {
				if (jsonParserFieldValue != null) {
					acoesJudiciaisEntity.setParteRe(
						(String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "propostaId")) {
				if (jsonParserFieldValue != null) {
					acoesJudiciaisEntity.setPropostaId(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "unidadeVara")) {
				if (jsonParserFieldValue != null) {
					acoesJudiciaisEntity.setUnidadeVara(
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
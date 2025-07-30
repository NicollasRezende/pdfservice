package br.com.seatecnologia.gdf.negocia.headless.client.serdes.v1_0;

import br.com.seatecnologia.gdf.negocia.headless.client.dto.v1_0.ConcessoesDfEntity;
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
public class ConcessoesDfEntitySerDes {

	public static ConcessoesDfEntity toDTO(String json) {
		ConcessoesDfEntityJSONParser concessoesDfEntityJSONParser =
			new ConcessoesDfEntityJSONParser();

		return concessoesDfEntityJSONParser.parseToDTO(json);
	}

	public static ConcessoesDfEntity[] toDTOs(String json) {
		ConcessoesDfEntityJSONParser concessoesDfEntityJSONParser =
			new ConcessoesDfEntityJSONParser();

		return concessoesDfEntityJSONParser.parseToDTOs(json);
	}

	public static String toJSON(ConcessoesDfEntity concessoesDfEntity) {
		if (concessoesDfEntity == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		if (concessoesDfEntity.getConcessaoId() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"concessaoId\": ");

			sb.append(concessoesDfEntity.getConcessaoId());
		}

		if (concessoesDfEntity.getObservacoes() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"observacoes\": ");

			sb.append("\"");

			sb.append(_escape(concessoesDfEntity.getObservacoes()));

			sb.append("\"");
		}

		if (concessoesDfEntity.getPercentualDescontoJuros() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"percentualDescontoJuros\": ");

			sb.append(concessoesDfEntity.getPercentualDescontoJuros());
		}

		if (concessoesDfEntity.getPercentualDescontoPrincipal() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"percentualDescontoPrincipal\": ");

			sb.append(concessoesDfEntity.getPercentualDescontoPrincipal());
		}

		if (concessoesDfEntity.getPropostaId() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"propostaId\": ");

			sb.append(concessoesDfEntity.getPropostaId());
		}

		sb.append("}");

		return sb.toString();
	}

	public static Map<String, Object> toMap(String json) {
		ConcessoesDfEntityJSONParser concessoesDfEntityJSONParser =
			new ConcessoesDfEntityJSONParser();

		return concessoesDfEntityJSONParser.parseToMap(json);
	}

	public static Map<String, String> toMap(
		ConcessoesDfEntity concessoesDfEntity) {

		if (concessoesDfEntity == null) {
			return null;
		}

		Map<String, String> map = new TreeMap<>();

		if (concessoesDfEntity.getConcessaoId() == null) {
			map.put("concessaoId", null);
		}
		else {
			map.put(
				"concessaoId",
				String.valueOf(concessoesDfEntity.getConcessaoId()));
		}

		if (concessoesDfEntity.getObservacoes() == null) {
			map.put("observacoes", null);
		}
		else {
			map.put(
				"observacoes",
				String.valueOf(concessoesDfEntity.getObservacoes()));
		}

		if (concessoesDfEntity.getPercentualDescontoJuros() == null) {
			map.put("percentualDescontoJuros", null);
		}
		else {
			map.put(
				"percentualDescontoJuros",
				String.valueOf(
					concessoesDfEntity.getPercentualDescontoJuros()));
		}

		if (concessoesDfEntity.getPercentualDescontoPrincipal() == null) {
			map.put("percentualDescontoPrincipal", null);
		}
		else {
			map.put(
				"percentualDescontoPrincipal",
				String.valueOf(
					concessoesDfEntity.getPercentualDescontoPrincipal()));
		}

		if (concessoesDfEntity.getPropostaId() == null) {
			map.put("propostaId", null);
		}
		else {
			map.put(
				"propostaId",
				String.valueOf(concessoesDfEntity.getPropostaId()));
		}

		return map;
	}

	public static class ConcessoesDfEntityJSONParser
		extends BaseJSONParser<ConcessoesDfEntity> {

		@Override
		protected ConcessoesDfEntity createDTO() {
			return new ConcessoesDfEntity();
		}

		@Override
		protected ConcessoesDfEntity[] createDTOArray(int size) {
			return new ConcessoesDfEntity[size];
		}

		@Override
		protected boolean parseMaps(String jsonParserFieldName) {
			if (Objects.equals(jsonParserFieldName, "concessaoId")) {
				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "observacoes")) {
				return false;
			}
			else if (Objects.equals(
						jsonParserFieldName, "percentualDescontoJuros")) {

				return false;
			}
			else if (Objects.equals(
						jsonParserFieldName, "percentualDescontoPrincipal")) {

				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "propostaId")) {
				return false;
			}

			return false;
		}

		@Override
		protected void setField(
			ConcessoesDfEntity concessoesDfEntity, String jsonParserFieldName,
			Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "concessaoId")) {
				if (jsonParserFieldValue != null) {
					concessoesDfEntity.setConcessaoId(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "observacoes")) {
				if (jsonParserFieldValue != null) {
					concessoesDfEntity.setObservacoes(
						(String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(
						jsonParserFieldName, "percentualDescontoJuros")) {

				if (jsonParserFieldValue != null) {
					concessoesDfEntity.setPercentualDescontoJuros(
						Double.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(
						jsonParserFieldName, "percentualDescontoPrincipal")) {

				if (jsonParserFieldValue != null) {
					concessoesDfEntity.setPercentualDescontoPrincipal(
						Double.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "propostaId")) {
				if (jsonParserFieldValue != null) {
					concessoesDfEntity.setPropostaId(
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
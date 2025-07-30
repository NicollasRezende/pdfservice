package br.com.seatecnologia.gdf.negocia.headless.client.serdes.v1_0;

import br.com.seatecnologia.gdf.negocia.headless.client.dto.v1_0.CreditosTransacionadosEntity;
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
public class CreditosTransacionadosEntitySerDes {

	public static CreditosTransacionadosEntity toDTO(String json) {
		CreditosTransacionadosEntityJSONParser
			creditosTransacionadosEntityJSONParser =
				new CreditosTransacionadosEntityJSONParser();

		return creditosTransacionadosEntityJSONParser.parseToDTO(json);
	}

	public static CreditosTransacionadosEntity[] toDTOs(String json) {
		CreditosTransacionadosEntityJSONParser
			creditosTransacionadosEntityJSONParser =
				new CreditosTransacionadosEntityJSONParser();

		return creditosTransacionadosEntityJSONParser.parseToDTOs(json);
	}

	public static String toJSON(
		CreditosTransacionadosEntity creditosTransacionadosEntity) {

		if (creditosTransacionadosEntity == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		if (creditosTransacionadosEntity.getCreditoId() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"creditoId\": ");

			sb.append(creditosTransacionadosEntity.getCreditoId());
		}

		if (creditosTransacionadosEntity.getObservacoes() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"observacoes\": ");

			sb.append("\"");

			sb.append(_escape(creditosTransacionadosEntity.getObservacoes()));

			sb.append("\"");
		}

		if (creditosTransacionadosEntity.getPercentualDescontoJuros() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"percentualDescontoJuros\": ");

			sb.append(
				creditosTransacionadosEntity.getPercentualDescontoJuros());
		}

		if (creditosTransacionadosEntity.getPercentualDescontoPrincipal() !=
				null) {

			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"percentualDescontoPrincipal\": ");

			sb.append(
				creditosTransacionadosEntity.getPercentualDescontoPrincipal());
		}

		if (creditosTransacionadosEntity.getPropostaId() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"propostaId\": ");

			sb.append(creditosTransacionadosEntity.getPropostaId());
		}

		sb.append("}");

		return sb.toString();
	}

	public static Map<String, Object> toMap(String json) {
		CreditosTransacionadosEntityJSONParser
			creditosTransacionadosEntityJSONParser =
				new CreditosTransacionadosEntityJSONParser();

		return creditosTransacionadosEntityJSONParser.parseToMap(json);
	}

	public static Map<String, String> toMap(
		CreditosTransacionadosEntity creditosTransacionadosEntity) {

		if (creditosTransacionadosEntity == null) {
			return null;
		}

		Map<String, String> map = new TreeMap<>();

		if (creditosTransacionadosEntity.getCreditoId() == null) {
			map.put("creditoId", null);
		}
		else {
			map.put(
				"creditoId",
				String.valueOf(creditosTransacionadosEntity.getCreditoId()));
		}

		if (creditosTransacionadosEntity.getObservacoes() == null) {
			map.put("observacoes", null);
		}
		else {
			map.put(
				"observacoes",
				String.valueOf(creditosTransacionadosEntity.getObservacoes()));
		}

		if (creditosTransacionadosEntity.getPercentualDescontoJuros() == null) {
			map.put("percentualDescontoJuros", null);
		}
		else {
			map.put(
				"percentualDescontoJuros",
				String.valueOf(
					creditosTransacionadosEntity.getPercentualDescontoJuros()));
		}

		if (creditosTransacionadosEntity.getPercentualDescontoPrincipal() ==
				null) {

			map.put("percentualDescontoPrincipal", null);
		}
		else {
			map.put(
				"percentualDescontoPrincipal",
				String.valueOf(
					creditosTransacionadosEntity.
						getPercentualDescontoPrincipal()));
		}

		if (creditosTransacionadosEntity.getPropostaId() == null) {
			map.put("propostaId", null);
		}
		else {
			map.put(
				"propostaId",
				String.valueOf(creditosTransacionadosEntity.getPropostaId()));
		}

		return map;
	}

	public static class CreditosTransacionadosEntityJSONParser
		extends BaseJSONParser<CreditosTransacionadosEntity> {

		@Override
		protected CreditosTransacionadosEntity createDTO() {
			return new CreditosTransacionadosEntity();
		}

		@Override
		protected CreditosTransacionadosEntity[] createDTOArray(int size) {
			return new CreditosTransacionadosEntity[size];
		}

		@Override
		protected boolean parseMaps(String jsonParserFieldName) {
			if (Objects.equals(jsonParserFieldName, "creditoId")) {
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
			CreditosTransacionadosEntity creditosTransacionadosEntity,
			String jsonParserFieldName, Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "creditoId")) {
				if (jsonParserFieldValue != null) {
					creditosTransacionadosEntity.setCreditoId(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "observacoes")) {
				if (jsonParserFieldValue != null) {
					creditosTransacionadosEntity.setObservacoes(
						(String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(
						jsonParserFieldName, "percentualDescontoJuros")) {

				if (jsonParserFieldValue != null) {
					creditosTransacionadosEntity.setPercentualDescontoJuros(
						Double.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(
						jsonParserFieldName, "percentualDescontoPrincipal")) {

				if (jsonParserFieldValue != null) {
					creditosTransacionadosEntity.setPercentualDescontoPrincipal(
						Double.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "propostaId")) {
				if (jsonParserFieldValue != null) {
					creditosTransacionadosEntity.setPropostaId(
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
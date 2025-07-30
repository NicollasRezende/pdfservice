package br.com.seatecnologia.gdf.negocia.headless.client.serdes.v1_0;

import br.com.seatecnologia.gdf.negocia.headless.client.dto.v1_0.IdentificacaoDebitosEntity;
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
public class IdentificacaoDebitosEntitySerDes {

	public static IdentificacaoDebitosEntity toDTO(String json) {
		IdentificacaoDebitosEntityJSONParser
			identificacaoDebitosEntityJSONParser =
				new IdentificacaoDebitosEntityJSONParser();

		return identificacaoDebitosEntityJSONParser.parseToDTO(json);
	}

	public static IdentificacaoDebitosEntity[] toDTOs(String json) {
		IdentificacaoDebitosEntityJSONParser
			identificacaoDebitosEntityJSONParser =
				new IdentificacaoDebitosEntityJSONParser();

		return identificacaoDebitosEntityJSONParser.parseToDTOs(json);
	}

	public static String toJSON(
		IdentificacaoDebitosEntity identificacaoDebitosEntity) {

		if (identificacaoDebitosEntity == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		if (identificacaoDebitosEntity.getGarantidoJudicialmente() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"garantidoJudicialmente\": ");

			sb.append("\"");

			sb.append(
				_escape(
					identificacaoDebitosEntity.getGarantidoJudicialmente()));

			sb.append("\"");
		}

		if (identificacaoDebitosEntity.getInscricaoDividaAtiva() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"inscricaoDividaAtiva\": ");

			sb.append("\"");

			sb.append(
				_escape(identificacaoDebitosEntity.getInscricaoDividaAtiva()));

			sb.append("\"");
		}

		if (identificacaoDebitosEntity.getNatureza() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"natureza\": ");

			sb.append("\"");

			sb.append(_escape(identificacaoDebitosEntity.getNatureza()));

			sb.append("\"");
		}

		if (identificacaoDebitosEntity.getSituacao() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"situacao\": ");

			sb.append("\"");

			sb.append(_escape(identificacaoDebitosEntity.getSituacao()));

			sb.append("\"");
		}

		sb.append("}");

		return sb.toString();
	}

	public static Map<String, Object> toMap(String json) {
		IdentificacaoDebitosEntityJSONParser
			identificacaoDebitosEntityJSONParser =
				new IdentificacaoDebitosEntityJSONParser();

		return identificacaoDebitosEntityJSONParser.parseToMap(json);
	}

	public static Map<String, String> toMap(
		IdentificacaoDebitosEntity identificacaoDebitosEntity) {

		if (identificacaoDebitosEntity == null) {
			return null;
		}

		Map<String, String> map = new TreeMap<>();

		if (identificacaoDebitosEntity.getGarantidoJudicialmente() == null) {
			map.put("garantidoJudicialmente", null);
		}
		else {
			map.put(
				"garantidoJudicialmente",
				String.valueOf(
					identificacaoDebitosEntity.getGarantidoJudicialmente()));
		}

		if (identificacaoDebitosEntity.getInscricaoDividaAtiva() == null) {
			map.put("inscricaoDividaAtiva", null);
		}
		else {
			map.put(
				"inscricaoDividaAtiva",
				String.valueOf(
					identificacaoDebitosEntity.getInscricaoDividaAtiva()));
		}

		if (identificacaoDebitosEntity.getNatureza() == null) {
			map.put("natureza", null);
		}
		else {
			map.put(
				"natureza",
				String.valueOf(identificacaoDebitosEntity.getNatureza()));
		}

		if (identificacaoDebitosEntity.getSituacao() == null) {
			map.put("situacao", null);
		}
		else {
			map.put(
				"situacao",
				String.valueOf(identificacaoDebitosEntity.getSituacao()));
		}

		return map;
	}

	public static class IdentificacaoDebitosEntityJSONParser
		extends BaseJSONParser<IdentificacaoDebitosEntity> {

		@Override
		protected IdentificacaoDebitosEntity createDTO() {
			return new IdentificacaoDebitosEntity();
		}

		@Override
		protected IdentificacaoDebitosEntity[] createDTOArray(int size) {
			return new IdentificacaoDebitosEntity[size];
		}

		@Override
		protected boolean parseMaps(String jsonParserFieldName) {
			if (Objects.equals(jsonParserFieldName, "garantidoJudicialmente")) {
				return false;
			}
			else if (Objects.equals(
						jsonParserFieldName, "inscricaoDividaAtiva")) {

				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "natureza")) {
				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "situacao")) {
				return false;
			}

			return false;
		}

		@Override
		protected void setField(
			IdentificacaoDebitosEntity identificacaoDebitosEntity,
			String jsonParserFieldName, Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "garantidoJudicialmente")) {
				if (jsonParserFieldValue != null) {
					identificacaoDebitosEntity.setGarantidoJudicialmente(
						(String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(
						jsonParserFieldName, "inscricaoDividaAtiva")) {

				if (jsonParserFieldValue != null) {
					identificacaoDebitosEntity.setInscricaoDividaAtiva(
						(String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "natureza")) {
				if (jsonParserFieldValue != null) {
					identificacaoDebitosEntity.setNatureza(
						(String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "situacao")) {
				if (jsonParserFieldValue != null) {
					identificacaoDebitosEntity.setSituacao(
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
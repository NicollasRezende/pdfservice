package br.com.seatecnologia.gdf.negocia.headless.client.serdes.v1_0;

import br.com.seatecnologia.gdf.negocia.headless.client.dto.v1_0.ParcelamentoEntity;
import br.com.seatecnologia.gdf.negocia.headless.client.json.BaseJSONParser;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

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
public class ParcelamentoEntitySerDes {

	public static ParcelamentoEntity toDTO(String json) {
		ParcelamentoEntityJSONParser parcelamentoEntityJSONParser =
			new ParcelamentoEntityJSONParser();

		return parcelamentoEntityJSONParser.parseToDTO(json);
	}

	public static ParcelamentoEntity[] toDTOs(String json) {
		ParcelamentoEntityJSONParser parcelamentoEntityJSONParser =
			new ParcelamentoEntityJSONParser();

		return parcelamentoEntityJSONParser.parseToDTOs(json);
	}

	public static String toJSON(ParcelamentoEntity parcelamentoEntity) {
		if (parcelamentoEntity == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		DateFormat liferayToJSONDateFormat = new SimpleDateFormat(
			"yyyy-MM-dd'T'HH:mm:ssXX");

		if (parcelamentoEntity.getDataPrimeiraParcela() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"dataPrimeiraParcela\": ");

			sb.append("\"");

			sb.append(
				liferayToJSONDateFormat.format(
					parcelamentoEntity.getDataPrimeiraParcela()));

			sb.append("\"");
		}

		if (parcelamentoEntity.getNumeroParcelas() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"numeroParcelas\": ");

			sb.append(parcelamentoEntity.getNumeroParcelas());
		}

		if (parcelamentoEntity.getParcelamentoId() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"parcelamentoId\": ");

			sb.append(parcelamentoEntity.getParcelamentoId());
		}

		if (parcelamentoEntity.getPropostaId() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"propostaId\": ");

			sb.append(parcelamentoEntity.getPropostaId());
		}

		if (parcelamentoEntity.getValorEntrada() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"valorEntrada\": ");

			sb.append(parcelamentoEntity.getValorEntrada());
		}

		if (parcelamentoEntity.getValorPrimeiraParcela() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"valorPrimeiraParcela\": ");

			sb.append(parcelamentoEntity.getValorPrimeiraParcela());
		}

		sb.append("}");

		return sb.toString();
	}

	public static Map<String, Object> toMap(String json) {
		ParcelamentoEntityJSONParser parcelamentoEntityJSONParser =
			new ParcelamentoEntityJSONParser();

		return parcelamentoEntityJSONParser.parseToMap(json);
	}

	public static Map<String, String> toMap(
		ParcelamentoEntity parcelamentoEntity) {

		if (parcelamentoEntity == null) {
			return null;
		}

		Map<String, String> map = new TreeMap<>();

		DateFormat liferayToJSONDateFormat = new SimpleDateFormat(
			"yyyy-MM-dd'T'HH:mm:ssXX");

		if (parcelamentoEntity.getDataPrimeiraParcela() == null) {
			map.put("dataPrimeiraParcela", null);
		}
		else {
			map.put(
				"dataPrimeiraParcela",
				liferayToJSONDateFormat.format(
					parcelamentoEntity.getDataPrimeiraParcela()));
		}

		if (parcelamentoEntity.getNumeroParcelas() == null) {
			map.put("numeroParcelas", null);
		}
		else {
			map.put(
				"numeroParcelas",
				String.valueOf(parcelamentoEntity.getNumeroParcelas()));
		}

		if (parcelamentoEntity.getParcelamentoId() == null) {
			map.put("parcelamentoId", null);
		}
		else {
			map.put(
				"parcelamentoId",
				String.valueOf(parcelamentoEntity.getParcelamentoId()));
		}

		if (parcelamentoEntity.getPropostaId() == null) {
			map.put("propostaId", null);
		}
		else {
			map.put(
				"propostaId",
				String.valueOf(parcelamentoEntity.getPropostaId()));
		}

		if (parcelamentoEntity.getValorEntrada() == null) {
			map.put("valorEntrada", null);
		}
		else {
			map.put(
				"valorEntrada",
				String.valueOf(parcelamentoEntity.getValorEntrada()));
		}

		if (parcelamentoEntity.getValorPrimeiraParcela() == null) {
			map.put("valorPrimeiraParcela", null);
		}
		else {
			map.put(
				"valorPrimeiraParcela",
				String.valueOf(parcelamentoEntity.getValorPrimeiraParcela()));
		}

		return map;
	}

	public static class ParcelamentoEntityJSONParser
		extends BaseJSONParser<ParcelamentoEntity> {

		@Override
		protected ParcelamentoEntity createDTO() {
			return new ParcelamentoEntity();
		}

		@Override
		protected ParcelamentoEntity[] createDTOArray(int size) {
			return new ParcelamentoEntity[size];
		}

		@Override
		protected boolean parseMaps(String jsonParserFieldName) {
			if (Objects.equals(jsonParserFieldName, "dataPrimeiraParcela")) {
				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "numeroParcelas")) {
				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "parcelamentoId")) {
				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "propostaId")) {
				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "valorEntrada")) {
				return false;
			}
			else if (Objects.equals(
						jsonParserFieldName, "valorPrimeiraParcela")) {

				return false;
			}

			return false;
		}

		@Override
		protected void setField(
			ParcelamentoEntity parcelamentoEntity, String jsonParserFieldName,
			Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "dataPrimeiraParcela")) {
				if (jsonParserFieldValue != null) {
					parcelamentoEntity.setDataPrimeiraParcela(
						toDate((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "numeroParcelas")) {
				if (jsonParserFieldValue != null) {
					parcelamentoEntity.setNumeroParcelas(
						Integer.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "parcelamentoId")) {
				if (jsonParserFieldValue != null) {
					parcelamentoEntity.setParcelamentoId(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "propostaId")) {
				if (jsonParserFieldValue != null) {
					parcelamentoEntity.setPropostaId(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "valorEntrada")) {
				if (jsonParserFieldValue != null) {
					parcelamentoEntity.setValorEntrada(
						Double.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(
						jsonParserFieldName, "valorPrimeiraParcela")) {

				if (jsonParserFieldValue != null) {
					parcelamentoEntity.setValorPrimeiraParcela(
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
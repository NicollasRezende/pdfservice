package br.com.seatecnologia.gdf.negocia.headless.client.serdes.v1_0;

import br.com.seatecnologia.gdf.negocia.headless.client.dto.v1_0.ComprovanteHonorariosEntity;
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
public class ComprovanteHonorariosEntitySerDes {

	public static ComprovanteHonorariosEntity toDTO(String json) {
		ComprovanteHonorariosEntityJSONParser
			comprovanteHonorariosEntityJSONParser =
				new ComprovanteHonorariosEntityJSONParser();

		return comprovanteHonorariosEntityJSONParser.parseToDTO(json);
	}

	public static ComprovanteHonorariosEntity[] toDTOs(String json) {
		ComprovanteHonorariosEntityJSONParser
			comprovanteHonorariosEntityJSONParser =
				new ComprovanteHonorariosEntityJSONParser();

		return comprovanteHonorariosEntityJSONParser.parseToDTOs(json);
	}

	public static String toJSON(
		ComprovanteHonorariosEntity comprovanteHonorariosEntity) {

		if (comprovanteHonorariosEntity == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		DateFormat liferayToJSONDateFormat = new SimpleDateFormat(
			"yyyy-MM-dd'T'HH:mm:ssXX");

		if (comprovanteHonorariosEntity.getComprovanteId() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"comprovanteId\": ");

			sb.append(comprovanteHonorariosEntity.getComprovanteId());
		}

		if (comprovanteHonorariosEntity.getDataPagamento() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"dataPagamento\": ");

			sb.append("\"");

			sb.append(
				liferayToJSONDateFormat.format(
					comprovanteHonorariosEntity.getDataPagamento()));

			sb.append("\"");
		}

		if (comprovanteHonorariosEntity.getFileEntryId() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"fileEntryId\": ");

			sb.append(comprovanteHonorariosEntity.getFileEntryId());
		}

		if (comprovanteHonorariosEntity.getPropostaId() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"propostaId\": ");

			sb.append(comprovanteHonorariosEntity.getPropostaId());
		}

		if (comprovanteHonorariosEntity.getValorPago() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"valorPago\": ");

			sb.append(comprovanteHonorariosEntity.getValorPago());
		}

		sb.append("}");

		return sb.toString();
	}

	public static Map<String, Object> toMap(String json) {
		ComprovanteHonorariosEntityJSONParser
			comprovanteHonorariosEntityJSONParser =
				new ComprovanteHonorariosEntityJSONParser();

		return comprovanteHonorariosEntityJSONParser.parseToMap(json);
	}

	public static Map<String, String> toMap(
		ComprovanteHonorariosEntity comprovanteHonorariosEntity) {

		if (comprovanteHonorariosEntity == null) {
			return null;
		}

		Map<String, String> map = new TreeMap<>();

		DateFormat liferayToJSONDateFormat = new SimpleDateFormat(
			"yyyy-MM-dd'T'HH:mm:ssXX");

		if (comprovanteHonorariosEntity.getComprovanteId() == null) {
			map.put("comprovanteId", null);
		}
		else {
			map.put(
				"comprovanteId",
				String.valueOf(comprovanteHonorariosEntity.getComprovanteId()));
		}

		if (comprovanteHonorariosEntity.getDataPagamento() == null) {
			map.put("dataPagamento", null);
		}
		else {
			map.put(
				"dataPagamento",
				liferayToJSONDateFormat.format(
					comprovanteHonorariosEntity.getDataPagamento()));
		}

		if (comprovanteHonorariosEntity.getFileEntryId() == null) {
			map.put("fileEntryId", null);
		}
		else {
			map.put(
				"fileEntryId",
				String.valueOf(comprovanteHonorariosEntity.getFileEntryId()));
		}

		if (comprovanteHonorariosEntity.getPropostaId() == null) {
			map.put("propostaId", null);
		}
		else {
			map.put(
				"propostaId",
				String.valueOf(comprovanteHonorariosEntity.getPropostaId()));
		}

		if (comprovanteHonorariosEntity.getValorPago() == null) {
			map.put("valorPago", null);
		}
		else {
			map.put(
				"valorPago",
				String.valueOf(comprovanteHonorariosEntity.getValorPago()));
		}

		return map;
	}

	public static class ComprovanteHonorariosEntityJSONParser
		extends BaseJSONParser<ComprovanteHonorariosEntity> {

		@Override
		protected ComprovanteHonorariosEntity createDTO() {
			return new ComprovanteHonorariosEntity();
		}

		@Override
		protected ComprovanteHonorariosEntity[] createDTOArray(int size) {
			return new ComprovanteHonorariosEntity[size];
		}

		@Override
		protected boolean parseMaps(String jsonParserFieldName) {
			if (Objects.equals(jsonParserFieldName, "comprovanteId")) {
				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "dataPagamento")) {
				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "fileEntryId")) {
				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "propostaId")) {
				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "valorPago")) {
				return false;
			}

			return false;
		}

		@Override
		protected void setField(
			ComprovanteHonorariosEntity comprovanteHonorariosEntity,
			String jsonParserFieldName, Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "comprovanteId")) {
				if (jsonParserFieldValue != null) {
					comprovanteHonorariosEntity.setComprovanteId(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "dataPagamento")) {
				if (jsonParserFieldValue != null) {
					comprovanteHonorariosEntity.setDataPagamento(
						toDate((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "fileEntryId")) {
				if (jsonParserFieldValue != null) {
					comprovanteHonorariosEntity.setFileEntryId(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "propostaId")) {
				if (jsonParserFieldValue != null) {
					comprovanteHonorariosEntity.setPropostaId(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "valorPago")) {
				if (jsonParserFieldValue != null) {
					comprovanteHonorariosEntity.setValorPago(
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
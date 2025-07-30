package br.com.seatecnologia.gdf.negocia.headless.client.serdes.v1_0;

import br.com.seatecnologia.gdf.negocia.headless.client.dto.v1_0.IdentificadorCreditoEntityDTO;
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
public class IdentificadorCreditoEntityDTOSerDes {

	public static IdentificadorCreditoEntityDTO toDTO(String json) {
		IdentificadorCreditoEntityDTOJSONParser
			identificadorCreditoEntityDTOJSONParser =
				new IdentificadorCreditoEntityDTOJSONParser();

		return identificadorCreditoEntityDTOJSONParser.parseToDTO(json);
	}

	public static IdentificadorCreditoEntityDTO[] toDTOs(String json) {
		IdentificadorCreditoEntityDTOJSONParser
			identificadorCreditoEntityDTOJSONParser =
				new IdentificadorCreditoEntityDTOJSONParser();

		return identificadorCreditoEntityDTOJSONParser.parseToDTOs(json);
	}

	public static String toJSON(
		IdentificadorCreditoEntityDTO identificadorCreditoEntityDTO) {

		if (identificadorCreditoEntityDTO == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		if (identificadorCreditoEntityDTO.getNumeroDaGuia() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"numeroDaGuia\": ");

			sb.append("\"");

			sb.append(_escape(identificadorCreditoEntityDTO.getNumeroDaGuia()));

			sb.append("\"");
		}

		if (identificadorCreditoEntityDTO.getNumeroDivida() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"numeroDivida\": ");

			sb.append("\"");

			sb.append(_escape(identificadorCreditoEntityDTO.getNumeroDivida()));

			sb.append("\"");
		}

		if (identificadorCreditoEntityDTO.getRenavam() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"renavam\": ");

			sb.append("\"");

			sb.append(_escape(identificadorCreditoEntityDTO.getRenavam()));

			sb.append("\"");
		}

		sb.append("}");

		return sb.toString();
	}

	public static Map<String, Object> toMap(String json) {
		IdentificadorCreditoEntityDTOJSONParser
			identificadorCreditoEntityDTOJSONParser =
				new IdentificadorCreditoEntityDTOJSONParser();

		return identificadorCreditoEntityDTOJSONParser.parseToMap(json);
	}

	public static Map<String, String> toMap(
		IdentificadorCreditoEntityDTO identificadorCreditoEntityDTO) {

		if (identificadorCreditoEntityDTO == null) {
			return null;
		}

		Map<String, String> map = new TreeMap<>();

		if (identificadorCreditoEntityDTO.getNumeroDaGuia() == null) {
			map.put("numeroDaGuia", null);
		}
		else {
			map.put(
				"numeroDaGuia",
				String.valueOf(
					identificadorCreditoEntityDTO.getNumeroDaGuia()));
		}

		if (identificadorCreditoEntityDTO.getNumeroDivida() == null) {
			map.put("numeroDivida", null);
		}
		else {
			map.put(
				"numeroDivida",
				String.valueOf(
					identificadorCreditoEntityDTO.getNumeroDivida()));
		}

		if (identificadorCreditoEntityDTO.getRenavam() == null) {
			map.put("renavam", null);
		}
		else {
			map.put(
				"renavam",
				String.valueOf(identificadorCreditoEntityDTO.getRenavam()));
		}

		return map;
	}

	public static class IdentificadorCreditoEntityDTOJSONParser
		extends BaseJSONParser<IdentificadorCreditoEntityDTO> {

		@Override
		protected IdentificadorCreditoEntityDTO createDTO() {
			return new IdentificadorCreditoEntityDTO();
		}

		@Override
		protected IdentificadorCreditoEntityDTO[] createDTOArray(int size) {
			return new IdentificadorCreditoEntityDTO[size];
		}

		@Override
		protected boolean parseMaps(String jsonParserFieldName) {
			if (Objects.equals(jsonParserFieldName, "numeroDaGuia")) {
				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "numeroDivida")) {
				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "renavam")) {
				return false;
			}

			return false;
		}

		@Override
		protected void setField(
			IdentificadorCreditoEntityDTO identificadorCreditoEntityDTO,
			String jsonParserFieldName, Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "numeroDaGuia")) {
				if (jsonParserFieldValue != null) {
					identificadorCreditoEntityDTO.setNumeroDaGuia(
						(String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "numeroDivida")) {
				if (jsonParserFieldValue != null) {
					identificadorCreditoEntityDTO.setNumeroDivida(
						(String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "renavam")) {
				if (jsonParserFieldValue != null) {
					identificadorCreditoEntityDTO.setRenavam(
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
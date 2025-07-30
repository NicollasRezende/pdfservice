package br.com.seatecnologia.gdf.negocia.headless.client.serdes.v1_0;

import br.com.seatecnologia.gdf.negocia.headless.client.dto.v1_0.DocumentoDadosRegistro;
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
public class DocumentoDadosRegistroSerDes {

	public static DocumentoDadosRegistro toDTO(String json) {
		DocumentoDadosRegistroJSONParser documentoDadosRegistroJSONParser =
			new DocumentoDadosRegistroJSONParser();

		return documentoDadosRegistroJSONParser.parseToDTO(json);
	}

	public static DocumentoDadosRegistro[] toDTOs(String json) {
		DocumentoDadosRegistroJSONParser documentoDadosRegistroJSONParser =
			new DocumentoDadosRegistroJSONParser();

		return documentoDadosRegistroJSONParser.parseToDTOs(json);
	}

	public static String toJSON(DocumentoDadosRegistro documentoDadosRegistro) {
		if (documentoDadosRegistro == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		if (documentoDadosRegistro.getDocumentoId() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"documentoId\": ");

			sb.append(documentoDadosRegistro.getDocumentoId());
		}

		sb.append("}");

		return sb.toString();
	}

	public static Map<String, Object> toMap(String json) {
		DocumentoDadosRegistroJSONParser documentoDadosRegistroJSONParser =
			new DocumentoDadosRegistroJSONParser();

		return documentoDadosRegistroJSONParser.parseToMap(json);
	}

	public static Map<String, String> toMap(
		DocumentoDadosRegistro documentoDadosRegistro) {

		if (documentoDadosRegistro == null) {
			return null;
		}

		Map<String, String> map = new TreeMap<>();

		if (documentoDadosRegistro.getDocumentoId() == null) {
			map.put("documentoId", null);
		}
		else {
			map.put(
				"documentoId",
				String.valueOf(documentoDadosRegistro.getDocumentoId()));
		}

		return map;
	}

	public static class DocumentoDadosRegistroJSONParser
		extends BaseJSONParser<DocumentoDadosRegistro> {

		@Override
		protected DocumentoDadosRegistro createDTO() {
			return new DocumentoDadosRegistro();
		}

		@Override
		protected DocumentoDadosRegistro[] createDTOArray(int size) {
			return new DocumentoDadosRegistro[size];
		}

		@Override
		protected boolean parseMaps(String jsonParserFieldName) {
			if (Objects.equals(jsonParserFieldName, "documentoId")) {
				return false;
			}

			return false;
		}

		@Override
		protected void setField(
			DocumentoDadosRegistro documentoDadosRegistro,
			String jsonParserFieldName, Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "documentoId")) {
				if (jsonParserFieldValue != null) {
					documentoDadosRegistro.setDocumentoId(
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
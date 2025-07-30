package br.com.seatecnologia.gdf.negocia.headless.client.serdes.v1_0;

import br.com.seatecnologia.gdf.negocia.headless.client.dto.v1_0.UsuarioInfo;
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
public class UsuarioInfoSerDes {

	public static UsuarioInfo toDTO(String json) {
		UsuarioInfoJSONParser usuarioInfoJSONParser =
			new UsuarioInfoJSONParser();

		return usuarioInfoJSONParser.parseToDTO(json);
	}

	public static UsuarioInfo[] toDTOs(String json) {
		UsuarioInfoJSONParser usuarioInfoJSONParser =
			new UsuarioInfoJSONParser();

		return usuarioInfoJSONParser.parseToDTOs(json);
	}

	public static String toJSON(UsuarioInfo usuarioInfo) {
		if (usuarioInfo == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		if (usuarioInfo.getCpfcnpj() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"cpfcnpj\": ");

			sb.append("\"");

			sb.append(_escape(usuarioInfo.getCpfcnpj()));

			sb.append("\"");
		}

		if (usuarioInfo.getTipoLogin() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"tipoLogin\": ");

			sb.append("\"");

			sb.append(_escape(usuarioInfo.getTipoLogin()));

			sb.append("\"");
		}

		sb.append("}");

		return sb.toString();
	}

	public static Map<String, Object> toMap(String json) {
		UsuarioInfoJSONParser usuarioInfoJSONParser =
			new UsuarioInfoJSONParser();

		return usuarioInfoJSONParser.parseToMap(json);
	}

	public static Map<String, String> toMap(UsuarioInfo usuarioInfo) {
		if (usuarioInfo == null) {
			return null;
		}

		Map<String, String> map = new TreeMap<>();

		if (usuarioInfo.getCpfcnpj() == null) {
			map.put("cpfcnpj", null);
		}
		else {
			map.put("cpfcnpj", String.valueOf(usuarioInfo.getCpfcnpj()));
		}

		if (usuarioInfo.getTipoLogin() == null) {
			map.put("tipoLogin", null);
		}
		else {
			map.put("tipoLogin", String.valueOf(usuarioInfo.getTipoLogin()));
		}

		return map;
	}

	public static class UsuarioInfoJSONParser
		extends BaseJSONParser<UsuarioInfo> {

		@Override
		protected UsuarioInfo createDTO() {
			return new UsuarioInfo();
		}

		@Override
		protected UsuarioInfo[] createDTOArray(int size) {
			return new UsuarioInfo[size];
		}

		@Override
		protected boolean parseMaps(String jsonParserFieldName) {
			if (Objects.equals(jsonParserFieldName, "cpfcnpj")) {
				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "tipoLogin")) {
				return false;
			}

			return false;
		}

		@Override
		protected void setField(
			UsuarioInfo usuarioInfo, String jsonParserFieldName,
			Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "cpfcnpj")) {
				if (jsonParserFieldValue != null) {
					usuarioInfo.setCpfcnpj((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "tipoLogin")) {
				if (jsonParserFieldValue != null) {
					usuarioInfo.setTipoLogin((String)jsonParserFieldValue);
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
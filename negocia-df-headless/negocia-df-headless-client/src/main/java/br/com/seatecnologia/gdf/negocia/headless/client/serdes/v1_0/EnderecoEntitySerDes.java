package br.com.seatecnologia.gdf.negocia.headless.client.serdes.v1_0;

import br.com.seatecnologia.gdf.negocia.headless.client.dto.v1_0.EnderecoEntity;
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
public class EnderecoEntitySerDes {

	public static EnderecoEntity toDTO(String json) {
		EnderecoEntityJSONParser enderecoEntityJSONParser =
			new EnderecoEntityJSONParser();

		return enderecoEntityJSONParser.parseToDTO(json);
	}

	public static EnderecoEntity[] toDTOs(String json) {
		EnderecoEntityJSONParser enderecoEntityJSONParser =
			new EnderecoEntityJSONParser();

		return enderecoEntityJSONParser.parseToDTOs(json);
	}

	public static String toJSON(EnderecoEntity enderecoEntity) {
		if (enderecoEntity == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		if (enderecoEntity.getBairro() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"bairro\": ");

			sb.append("\"");

			sb.append(_escape(enderecoEntity.getBairro()));

			sb.append("\"");
		}

		if (enderecoEntity.getCep() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"cep\": ");

			sb.append("\"");

			sb.append(_escape(enderecoEntity.getCep()));

			sb.append("\"");
		}

		if (enderecoEntity.getComplemento() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"complemento\": ");

			sb.append("\"");

			sb.append(_escape(enderecoEntity.getComplemento()));

			sb.append("\"");
		}

		if (enderecoEntity.getEndereco() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"endereco\": ");

			sb.append("\"");

			sb.append(_escape(enderecoEntity.getEndereco()));

			sb.append("\"");
		}

		if (enderecoEntity.getEstado() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"estado\": ");

			sb.append("\"");

			sb.append(_escape(enderecoEntity.getEstado()));

			sb.append("\"");
		}

		if (enderecoEntity.getMunicipio() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"municipio\": ");

			sb.append("\"");

			sb.append(_escape(enderecoEntity.getMunicipio()));

			sb.append("\"");
		}

		if (enderecoEntity.getNumero() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"numero\": ");

			sb.append("\"");

			sb.append(_escape(enderecoEntity.getNumero()));

			sb.append("\"");
		}

		sb.append("}");

		return sb.toString();
	}

	public static Map<String, Object> toMap(String json) {
		EnderecoEntityJSONParser enderecoEntityJSONParser =
			new EnderecoEntityJSONParser();

		return enderecoEntityJSONParser.parseToMap(json);
	}

	public static Map<String, String> toMap(EnderecoEntity enderecoEntity) {
		if (enderecoEntity == null) {
			return null;
		}

		Map<String, String> map = new TreeMap<>();

		if (enderecoEntity.getBairro() == null) {
			map.put("bairro", null);
		}
		else {
			map.put("bairro", String.valueOf(enderecoEntity.getBairro()));
		}

		if (enderecoEntity.getCep() == null) {
			map.put("cep", null);
		}
		else {
			map.put("cep", String.valueOf(enderecoEntity.getCep()));
		}

		if (enderecoEntity.getComplemento() == null) {
			map.put("complemento", null);
		}
		else {
			map.put(
				"complemento", String.valueOf(enderecoEntity.getComplemento()));
		}

		if (enderecoEntity.getEndereco() == null) {
			map.put("endereco", null);
		}
		else {
			map.put("endereco", String.valueOf(enderecoEntity.getEndereco()));
		}

		if (enderecoEntity.getEstado() == null) {
			map.put("estado", null);
		}
		else {
			map.put("estado", String.valueOf(enderecoEntity.getEstado()));
		}

		if (enderecoEntity.getMunicipio() == null) {
			map.put("municipio", null);
		}
		else {
			map.put("municipio", String.valueOf(enderecoEntity.getMunicipio()));
		}

		if (enderecoEntity.getNumero() == null) {
			map.put("numero", null);
		}
		else {
			map.put("numero", String.valueOf(enderecoEntity.getNumero()));
		}

		return map;
	}

	public static class EnderecoEntityJSONParser
		extends BaseJSONParser<EnderecoEntity> {

		@Override
		protected EnderecoEntity createDTO() {
			return new EnderecoEntity();
		}

		@Override
		protected EnderecoEntity[] createDTOArray(int size) {
			return new EnderecoEntity[size];
		}

		@Override
		protected boolean parseMaps(String jsonParserFieldName) {
			if (Objects.equals(jsonParserFieldName, "bairro")) {
				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "cep")) {
				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "complemento")) {
				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "endereco")) {
				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "estado")) {
				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "municipio")) {
				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "numero")) {
				return false;
			}

			return false;
		}

		@Override
		protected void setField(
			EnderecoEntity enderecoEntity, String jsonParserFieldName,
			Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "bairro")) {
				if (jsonParserFieldValue != null) {
					enderecoEntity.setBairro((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "cep")) {
				if (jsonParserFieldValue != null) {
					enderecoEntity.setCep((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "complemento")) {
				if (jsonParserFieldValue != null) {
					enderecoEntity.setComplemento((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "endereco")) {
				if (jsonParserFieldValue != null) {
					enderecoEntity.setEndereco((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "estado")) {
				if (jsonParserFieldValue != null) {
					enderecoEntity.setEstado((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "municipio")) {
				if (jsonParserFieldValue != null) {
					enderecoEntity.setMunicipio((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "numero")) {
				if (jsonParserFieldValue != null) {
					enderecoEntity.setNumero((String)jsonParserFieldValue);
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
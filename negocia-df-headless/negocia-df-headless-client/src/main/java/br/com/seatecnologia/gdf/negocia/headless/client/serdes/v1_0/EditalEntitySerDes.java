package br.com.seatecnologia.gdf.negocia.headless.client.serdes.v1_0;

import br.com.seatecnologia.gdf.negocia.headless.client.dto.v1_0.EditalEntity;
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
public class EditalEntitySerDes {

	public static EditalEntity toDTO(String json) {
		EditalEntityJSONParser editalEntityJSONParser =
			new EditalEntityJSONParser();

		return editalEntityJSONParser.parseToDTO(json);
	}

	public static EditalEntity[] toDTOs(String json) {
		EditalEntityJSONParser editalEntityJSONParser =
			new EditalEntityJSONParser();

		return editalEntityJSONParser.parseToDTOs(json);
	}

	public static String toJSON(EditalEntity editalEntity) {
		if (editalEntity == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		DateFormat liferayToJSONDateFormat = new SimpleDateFormat(
			"yyyy-MM-dd'T'HH:mm:ssXX");

		if (editalEntity.getDataFim() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"dataFim\": ");

			sb.append("\"");

			sb.append(
				liferayToJSONDateFormat.format(editalEntity.getDataFim()));

			sb.append("\"");
		}

		if (editalEntity.getDataInicio() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"dataInicio\": ");

			sb.append("\"");

			sb.append(
				liferayToJSONDateFormat.format(editalEntity.getDataInicio()));

			sb.append("\"");
		}

		if (editalEntity.getDescricao() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"descricao\": ");

			sb.append("\"");

			sb.append(_escape(editalEntity.getDescricao()));

			sb.append("\"");
		}

		if (editalEntity.getEditalId() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"editalId\": ");

			sb.append(editalEntity.getEditalId());
		}

		if (editalEntity.getTitulo() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"titulo\": ");

			sb.append("\"");

			sb.append(_escape(editalEntity.getTitulo()));

			sb.append("\"");
		}

		if (editalEntity.getUrlArquivo() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"urlArquivo\": ");

			sb.append("\"");

			sb.append(_escape(editalEntity.getUrlArquivo()));

			sb.append("\"");
		}

		sb.append("}");

		return sb.toString();
	}

	public static Map<String, Object> toMap(String json) {
		EditalEntityJSONParser editalEntityJSONParser =
			new EditalEntityJSONParser();

		return editalEntityJSONParser.parseToMap(json);
	}

	public static Map<String, String> toMap(EditalEntity editalEntity) {
		if (editalEntity == null) {
			return null;
		}

		Map<String, String> map = new TreeMap<>();

		DateFormat liferayToJSONDateFormat = new SimpleDateFormat(
			"yyyy-MM-dd'T'HH:mm:ssXX");

		if (editalEntity.getDataFim() == null) {
			map.put("dataFim", null);
		}
		else {
			map.put(
				"dataFim",
				liferayToJSONDateFormat.format(editalEntity.getDataFim()));
		}

		if (editalEntity.getDataInicio() == null) {
			map.put("dataInicio", null);
		}
		else {
			map.put(
				"dataInicio",
				liferayToJSONDateFormat.format(editalEntity.getDataInicio()));
		}

		if (editalEntity.getDescricao() == null) {
			map.put("descricao", null);
		}
		else {
			map.put("descricao", String.valueOf(editalEntity.getDescricao()));
		}

		if (editalEntity.getEditalId() == null) {
			map.put("editalId", null);
		}
		else {
			map.put("editalId", String.valueOf(editalEntity.getEditalId()));
		}

		if (editalEntity.getTitulo() == null) {
			map.put("titulo", null);
		}
		else {
			map.put("titulo", String.valueOf(editalEntity.getTitulo()));
		}

		if (editalEntity.getUrlArquivo() == null) {
			map.put("urlArquivo", null);
		}
		else {
			map.put("urlArquivo", String.valueOf(editalEntity.getUrlArquivo()));
		}

		return map;
	}

	public static class EditalEntityJSONParser
		extends BaseJSONParser<EditalEntity> {

		@Override
		protected EditalEntity createDTO() {
			return new EditalEntity();
		}

		@Override
		protected EditalEntity[] createDTOArray(int size) {
			return new EditalEntity[size];
		}

		@Override
		protected boolean parseMaps(String jsonParserFieldName) {
			if (Objects.equals(jsonParserFieldName, "dataFim")) {
				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "dataInicio")) {
				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "descricao")) {
				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "editalId")) {
				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "titulo")) {
				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "urlArquivo")) {
				return false;
			}

			return false;
		}

		@Override
		protected void setField(
			EditalEntity editalEntity, String jsonParserFieldName,
			Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "dataFim")) {
				if (jsonParserFieldValue != null) {
					editalEntity.setDataFim(
						toDate((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "dataInicio")) {
				if (jsonParserFieldValue != null) {
					editalEntity.setDataInicio(
						toDate((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "descricao")) {
				if (jsonParserFieldValue != null) {
					editalEntity.setDescricao((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "editalId")) {
				if (jsonParserFieldValue != null) {
					editalEntity.setEditalId(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "titulo")) {
				if (jsonParserFieldValue != null) {
					editalEntity.setTitulo((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "urlArquivo")) {
				if (jsonParserFieldValue != null) {
					editalEntity.setUrlArquivo((String)jsonParserFieldValue);
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
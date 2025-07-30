package br.com.seatecnologia.gdf.negocia.headless.client.serdes.v1_0;

import br.com.seatecnologia.gdf.negocia.headless.client.dto.v1_0.PropostaEntityList;
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
public class PropostaEntityListSerDes {

	public static PropostaEntityList toDTO(String json) {
		PropostaEntityListJSONParser propostaEntityListJSONParser =
			new PropostaEntityListJSONParser();

		return propostaEntityListJSONParser.parseToDTO(json);
	}

	public static PropostaEntityList[] toDTOs(String json) {
		PropostaEntityListJSONParser propostaEntityListJSONParser =
			new PropostaEntityListJSONParser();

		return propostaEntityListJSONParser.parseToDTOs(json);
	}

	public static String toJSON(PropostaEntityList propostaEntityList) {
		if (propostaEntityList == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		DateFormat liferayToJSONDateFormat = new SimpleDateFormat(
			"yyyy-MM-dd'T'HH:mm:ssXX");

		if (propostaEntityList.getCpfCnpj() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"cpfCnpj\": ");

			sb.append("\"");

			sb.append(_escape(propostaEntityList.getCpfCnpj()));

			sb.append("\"");
		}

		if (propostaEntityList.getCreateDate() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"createDate\": ");

			sb.append("\"");

			sb.append(
				liferayToJSONDateFormat.format(
					propostaEntityList.getCreateDate()));

			sb.append("\"");
		}

		if (propostaEntityList.getDocumentosPropostaUrl() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"documentosPropostaUrl\": ");

			sb.append("\"");

			sb.append(_escape(propostaEntityList.getDocumentosPropostaUrl()));

			sb.append("\"");
		}

		if (propostaEntityList.getEditalUrl() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"editalUrl\": ");

			sb.append("\"");

			sb.append(_escape(propostaEntityList.getEditalUrl()));

			sb.append("\"");
		}

		if (propostaEntityList.getModifiedDate() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"modifiedDate\": ");

			sb.append("\"");

			sb.append(
				liferayToJSONDateFormat.format(
					propostaEntityList.getModifiedDate()));

			sb.append("\"");
		}

		if (propostaEntityList.getNumeroProtocoloSEI() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"numeroProtocoloSEI\": ");

			sb.append("\"");

			sb.append(_escape(propostaEntityList.getNumeroProtocoloSEI()));

			sb.append("\"");
		}

		if (propostaEntityList.getPropostaId() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"propostaId\": ");

			sb.append(propostaEntityList.getPropostaId());
		}

		if (propostaEntityList.getProtocolo() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"protocolo\": ");

			sb.append("\"");

			sb.append(_escape(propostaEntityList.getProtocolo()));

			sb.append("\"");
		}

		if (propostaEntityList.getStatus() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"status\": ");

			sb.append("\"");

			sb.append(_escape(propostaEntityList.getStatus()));

			sb.append("\"");
		}

		if (propostaEntityList.getTipoProposta() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"tipoProposta\": ");

			sb.append("\"");

			sb.append(_escape(propostaEntityList.getTipoProposta()));

			sb.append("\"");
		}

		sb.append("}");

		return sb.toString();
	}

	public static Map<String, Object> toMap(String json) {
		PropostaEntityListJSONParser propostaEntityListJSONParser =
			new PropostaEntityListJSONParser();

		return propostaEntityListJSONParser.parseToMap(json);
	}

	public static Map<String, String> toMap(
		PropostaEntityList propostaEntityList) {

		if (propostaEntityList == null) {
			return null;
		}

		Map<String, String> map = new TreeMap<>();

		DateFormat liferayToJSONDateFormat = new SimpleDateFormat(
			"yyyy-MM-dd'T'HH:mm:ssXX");

		if (propostaEntityList.getCpfCnpj() == null) {
			map.put("cpfCnpj", null);
		}
		else {
			map.put("cpfCnpj", String.valueOf(propostaEntityList.getCpfCnpj()));
		}

		if (propostaEntityList.getCreateDate() == null) {
			map.put("createDate", null);
		}
		else {
			map.put(
				"createDate",
				liferayToJSONDateFormat.format(
					propostaEntityList.getCreateDate()));
		}

		if (propostaEntityList.getDocumentosPropostaUrl() == null) {
			map.put("documentosPropostaUrl", null);
		}
		else {
			map.put(
				"documentosPropostaUrl",
				String.valueOf(propostaEntityList.getDocumentosPropostaUrl()));
		}

		if (propostaEntityList.getEditalUrl() == null) {
			map.put("editalUrl", null);
		}
		else {
			map.put(
				"editalUrl", String.valueOf(propostaEntityList.getEditalUrl()));
		}

		if (propostaEntityList.getModifiedDate() == null) {
			map.put("modifiedDate", null);
		}
		else {
			map.put(
				"modifiedDate",
				liferayToJSONDateFormat.format(
					propostaEntityList.getModifiedDate()));
		}

		if (propostaEntityList.getNumeroProtocoloSEI() == null) {
			map.put("numeroProtocoloSEI", null);
		}
		else {
			map.put(
				"numeroProtocoloSEI",
				String.valueOf(propostaEntityList.getNumeroProtocoloSEI()));
		}

		if (propostaEntityList.getPropostaId() == null) {
			map.put("propostaId", null);
		}
		else {
			map.put(
				"propostaId",
				String.valueOf(propostaEntityList.getPropostaId()));
		}

		if (propostaEntityList.getProtocolo() == null) {
			map.put("protocolo", null);
		}
		else {
			map.put(
				"protocolo", String.valueOf(propostaEntityList.getProtocolo()));
		}

		if (propostaEntityList.getStatus() == null) {
			map.put("status", null);
		}
		else {
			map.put("status", String.valueOf(propostaEntityList.getStatus()));
		}

		if (propostaEntityList.getTipoProposta() == null) {
			map.put("tipoProposta", null);
		}
		else {
			map.put(
				"tipoProposta",
				String.valueOf(propostaEntityList.getTipoProposta()));
		}

		return map;
	}

	public static class PropostaEntityListJSONParser
		extends BaseJSONParser<PropostaEntityList> {

		@Override
		protected PropostaEntityList createDTO() {
			return new PropostaEntityList();
		}

		@Override
		protected PropostaEntityList[] createDTOArray(int size) {
			return new PropostaEntityList[size];
		}

		@Override
		protected boolean parseMaps(String jsonParserFieldName) {
			if (Objects.equals(jsonParserFieldName, "cpfCnpj")) {
				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "createDate")) {
				return false;
			}
			else if (Objects.equals(
						jsonParserFieldName, "documentosPropostaUrl")) {

				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "editalUrl")) {
				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "modifiedDate")) {
				return false;
			}
			else if (Objects.equals(
						jsonParserFieldName, "numeroProtocoloSEI")) {

				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "propostaId")) {
				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "protocolo")) {
				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "status")) {
				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "tipoProposta")) {
				return false;
			}

			return false;
		}

		@Override
		protected void setField(
			PropostaEntityList propostaEntityList, String jsonParserFieldName,
			Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "cpfCnpj")) {
				if (jsonParserFieldValue != null) {
					propostaEntityList.setCpfCnpj((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "createDate")) {
				if (jsonParserFieldValue != null) {
					propostaEntityList.setCreateDate(
						toDate((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(
						jsonParserFieldName, "documentosPropostaUrl")) {

				if (jsonParserFieldValue != null) {
					propostaEntityList.setDocumentosPropostaUrl(
						(String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "editalUrl")) {
				if (jsonParserFieldValue != null) {
					propostaEntityList.setEditalUrl(
						(String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "modifiedDate")) {
				if (jsonParserFieldValue != null) {
					propostaEntityList.setModifiedDate(
						toDate((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(
						jsonParserFieldName, "numeroProtocoloSEI")) {

				if (jsonParserFieldValue != null) {
					propostaEntityList.setNumeroProtocoloSEI(
						(String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "propostaId")) {
				if (jsonParserFieldValue != null) {
					propostaEntityList.setPropostaId(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "protocolo")) {
				if (jsonParserFieldValue != null) {
					propostaEntityList.setProtocolo(
						(String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "status")) {
				if (jsonParserFieldValue != null) {
					propostaEntityList.setStatus((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "tipoProposta")) {
				if (jsonParserFieldValue != null) {
					propostaEntityList.setTipoProposta(
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
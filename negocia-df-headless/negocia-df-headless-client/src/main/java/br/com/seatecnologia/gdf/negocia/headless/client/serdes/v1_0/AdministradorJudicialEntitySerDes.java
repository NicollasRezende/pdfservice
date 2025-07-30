package br.com.seatecnologia.gdf.negocia.headless.client.serdes.v1_0;

import br.com.seatecnologia.gdf.negocia.headless.client.dto.v1_0.AdministradorJudicialEntity;
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
public class AdministradorJudicialEntitySerDes {

	public static AdministradorJudicialEntity toDTO(String json) {
		AdministradorJudicialEntityJSONParser
			administradorJudicialEntityJSONParser =
				new AdministradorJudicialEntityJSONParser();

		return administradorJudicialEntityJSONParser.parseToDTO(json);
	}

	public static AdministradorJudicialEntity[] toDTOs(String json) {
		AdministradorJudicialEntityJSONParser
			administradorJudicialEntityJSONParser =
				new AdministradorJudicialEntityJSONParser();

		return administradorJudicialEntityJSONParser.parseToDTOs(json);
	}

	public static String toJSON(
		AdministradorJudicialEntity administradorJudicialEntity) {

		if (administradorJudicialEntity == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		if (administradorJudicialEntity.getAnexoRecuperacao() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"anexoRecuperacao\": ");

			sb.append(
				String.valueOf(
					administradorJudicialEntity.getAnexoRecuperacao()));
		}

		if (administradorJudicialEntity.getNumeroProcesso() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"numeroProcesso\": ");

			sb.append("\"");

			sb.append(_escape(administradorJudicialEntity.getNumeroProcesso()));

			sb.append("\"");
		}

		if (administradorJudicialEntity.getQualificacao() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"qualificacao\": ");

			sb.append(
				String.valueOf(administradorJudicialEntity.getQualificacao()));
		}

		if (administradorJudicialEntity.getRecuperacao() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"recuperacao\": ");

			sb.append("\"");

			sb.append(_escape(administradorJudicialEntity.getRecuperacao()));

			sb.append("\"");
		}

		if (administradorJudicialEntity.getRegimeFalencia() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"regimeFalencia\": ");

			sb.append(administradorJudicialEntity.getRegimeFalencia());
		}

		sb.append("}");

		return sb.toString();
	}

	public static Map<String, Object> toMap(String json) {
		AdministradorJudicialEntityJSONParser
			administradorJudicialEntityJSONParser =
				new AdministradorJudicialEntityJSONParser();

		return administradorJudicialEntityJSONParser.parseToMap(json);
	}

	public static Map<String, String> toMap(
		AdministradorJudicialEntity administradorJudicialEntity) {

		if (administradorJudicialEntity == null) {
			return null;
		}

		Map<String, String> map = new TreeMap<>();

		if (administradorJudicialEntity.getAnexoRecuperacao() == null) {
			map.put("anexoRecuperacao", null);
		}
		else {
			map.put(
				"anexoRecuperacao",
				String.valueOf(
					administradorJudicialEntity.getAnexoRecuperacao()));
		}

		if (administradorJudicialEntity.getNumeroProcesso() == null) {
			map.put("numeroProcesso", null);
		}
		else {
			map.put(
				"numeroProcesso",
				String.valueOf(
					administradorJudicialEntity.getNumeroProcesso()));
		}

		if (administradorJudicialEntity.getQualificacao() == null) {
			map.put("qualificacao", null);
		}
		else {
			map.put(
				"qualificacao",
				String.valueOf(administradorJudicialEntity.getQualificacao()));
		}

		if (administradorJudicialEntity.getRecuperacao() == null) {
			map.put("recuperacao", null);
		}
		else {
			map.put(
				"recuperacao",
				String.valueOf(administradorJudicialEntity.getRecuperacao()));
		}

		if (administradorJudicialEntity.getRegimeFalencia() == null) {
			map.put("regimeFalencia", null);
		}
		else {
			map.put(
				"regimeFalencia",
				String.valueOf(
					administradorJudicialEntity.getRegimeFalencia()));
		}

		return map;
	}

	public static class AdministradorJudicialEntityJSONParser
		extends BaseJSONParser<AdministradorJudicialEntity> {

		@Override
		protected AdministradorJudicialEntity createDTO() {
			return new AdministradorJudicialEntity();
		}

		@Override
		protected AdministradorJudicialEntity[] createDTOArray(int size) {
			return new AdministradorJudicialEntity[size];
		}

		@Override
		protected boolean parseMaps(String jsonParserFieldName) {
			if (Objects.equals(jsonParserFieldName, "anexoRecuperacao")) {
				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "numeroProcesso")) {
				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "qualificacao")) {
				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "recuperacao")) {
				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "regimeFalencia")) {
				return false;
			}

			return false;
		}

		@Override
		protected void setField(
			AdministradorJudicialEntity administradorJudicialEntity,
			String jsonParserFieldName, Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "anexoRecuperacao")) {
				if (jsonParserFieldValue != null) {
					administradorJudicialEntity.setAnexoRecuperacao(
						ArquivosEntitySerDes.toDTO(
							(String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "numeroProcesso")) {
				if (jsonParserFieldValue != null) {
					administradorJudicialEntity.setNumeroProcesso(
						(String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "qualificacao")) {
				if (jsonParserFieldValue != null) {
					administradorJudicialEntity.setQualificacao(
						QualificacaoCompletaEntitySerDes.toDTO(
							(String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "recuperacao")) {
				if (jsonParserFieldValue != null) {
					administradorJudicialEntity.setRecuperacao(
						(String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "regimeFalencia")) {
				if (jsonParserFieldValue != null) {
					administradorJudicialEntity.setRegimeFalencia(
						(Boolean)jsonParserFieldValue);
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
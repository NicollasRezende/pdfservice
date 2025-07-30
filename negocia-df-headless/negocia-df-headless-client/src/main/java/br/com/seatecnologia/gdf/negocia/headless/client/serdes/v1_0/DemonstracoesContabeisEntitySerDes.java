package br.com.seatecnologia.gdf.negocia.headless.client.serdes.v1_0;

import br.com.seatecnologia.gdf.negocia.headless.client.dto.v1_0.DemonstracoesContabeisEntity;
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
public class DemonstracoesContabeisEntitySerDes {

	public static DemonstracoesContabeisEntity toDTO(String json) {
		DemonstracoesContabeisEntityJSONParser
			demonstracoesContabeisEntityJSONParser =
				new DemonstracoesContabeisEntityJSONParser();

		return demonstracoesContabeisEntityJSONParser.parseToDTO(json);
	}

	public static DemonstracoesContabeisEntity[] toDTOs(String json) {
		DemonstracoesContabeisEntityJSONParser
			demonstracoesContabeisEntityJSONParser =
				new DemonstracoesContabeisEntityJSONParser();

		return demonstracoesContabeisEntityJSONParser.parseToDTOs(json);
	}

	public static String toJSON(
		DemonstracoesContabeisEntity demonstracoesContabeisEntity) {

		if (demonstracoesContabeisEntity == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		if (demonstracoesContabeisEntity.getDemonstracaoId() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"demonstracaoId\": ");

			sb.append(demonstracoesContabeisEntity.getDemonstracaoId());
		}

		if (demonstracoesContabeisEntity.getFileEntryId() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"fileEntryId\": ");

			sb.append(demonstracoesContabeisEntity.getFileEntryId());
		}

		if (demonstracoesContabeisEntity.getPropostaId() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"propostaId\": ");

			sb.append(demonstracoesContabeisEntity.getPropostaId());
		}

		if (demonstracoesContabeisEntity.getTipoDemonstracao() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"tipoDemonstracao\": ");

			sb.append("\"");

			sb.append(
				_escape(demonstracoesContabeisEntity.getTipoDemonstracao()));

			sb.append("\"");
		}

		sb.append("}");

		return sb.toString();
	}

	public static Map<String, Object> toMap(String json) {
		DemonstracoesContabeisEntityJSONParser
			demonstracoesContabeisEntityJSONParser =
				new DemonstracoesContabeisEntityJSONParser();

		return demonstracoesContabeisEntityJSONParser.parseToMap(json);
	}

	public static Map<String, String> toMap(
		DemonstracoesContabeisEntity demonstracoesContabeisEntity) {

		if (demonstracoesContabeisEntity == null) {
			return null;
		}

		Map<String, String> map = new TreeMap<>();

		if (demonstracoesContabeisEntity.getDemonstracaoId() == null) {
			map.put("demonstracaoId", null);
		}
		else {
			map.put(
				"demonstracaoId",
				String.valueOf(
					demonstracoesContabeisEntity.getDemonstracaoId()));
		}

		if (demonstracoesContabeisEntity.getFileEntryId() == null) {
			map.put("fileEntryId", null);
		}
		else {
			map.put(
				"fileEntryId",
				String.valueOf(demonstracoesContabeisEntity.getFileEntryId()));
		}

		if (demonstracoesContabeisEntity.getPropostaId() == null) {
			map.put("propostaId", null);
		}
		else {
			map.put(
				"propostaId",
				String.valueOf(demonstracoesContabeisEntity.getPropostaId()));
		}

		if (demonstracoesContabeisEntity.getTipoDemonstracao() == null) {
			map.put("tipoDemonstracao", null);
		}
		else {
			map.put(
				"tipoDemonstracao",
				String.valueOf(
					demonstracoesContabeisEntity.getTipoDemonstracao()));
		}

		return map;
	}

	public static class DemonstracoesContabeisEntityJSONParser
		extends BaseJSONParser<DemonstracoesContabeisEntity> {

		@Override
		protected DemonstracoesContabeisEntity createDTO() {
			return new DemonstracoesContabeisEntity();
		}

		@Override
		protected DemonstracoesContabeisEntity[] createDTOArray(int size) {
			return new DemonstracoesContabeisEntity[size];
		}

		@Override
		protected boolean parseMaps(String jsonParserFieldName) {
			if (Objects.equals(jsonParserFieldName, "demonstracaoId")) {
				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "fileEntryId")) {
				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "propostaId")) {
				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "tipoDemonstracao")) {
				return false;
			}

			return false;
		}

		@Override
		protected void setField(
			DemonstracoesContabeisEntity demonstracoesContabeisEntity,
			String jsonParserFieldName, Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "demonstracaoId")) {
				if (jsonParserFieldValue != null) {
					demonstracoesContabeisEntity.setDemonstracaoId(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "fileEntryId")) {
				if (jsonParserFieldValue != null) {
					demonstracoesContabeisEntity.setFileEntryId(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "propostaId")) {
				if (jsonParserFieldValue != null) {
					demonstracoesContabeisEntity.setPropostaId(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "tipoDemonstracao")) {
				if (jsonParserFieldValue != null) {
					demonstracoesContabeisEntity.setTipoDemonstracao(
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
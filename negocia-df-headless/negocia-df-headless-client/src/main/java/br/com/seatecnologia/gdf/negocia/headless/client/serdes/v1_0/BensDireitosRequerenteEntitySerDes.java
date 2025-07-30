package br.com.seatecnologia.gdf.negocia.headless.client.serdes.v1_0;

import br.com.seatecnologia.gdf.negocia.headless.client.dto.v1_0.BensDireitosRequerenteEntity;
import br.com.seatecnologia.gdf.negocia.headless.client.dto.v1_0.LaudoAvaliacaoEntity;
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
public class BensDireitosRequerenteEntitySerDes {

	public static BensDireitosRequerenteEntity toDTO(String json) {
		BensDireitosRequerenteEntityJSONParser
			bensDireitosRequerenteEntityJSONParser =
				new BensDireitosRequerenteEntityJSONParser();

		return bensDireitosRequerenteEntityJSONParser.parseToDTO(json);
	}

	public static BensDireitosRequerenteEntity[] toDTOs(String json) {
		BensDireitosRequerenteEntityJSONParser
			bensDireitosRequerenteEntityJSONParser =
				new BensDireitosRequerenteEntityJSONParser();

		return bensDireitosRequerenteEntityJSONParser.parseToDTOs(json);
	}

	public static String toJSON(
		BensDireitosRequerenteEntity bensDireitosRequerenteEntity) {

		if (bensDireitosRequerenteEntity == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		if (bensDireitosRequerenteEntity.getBemId() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"bemId\": ");

			sb.append(bensDireitosRequerenteEntity.getBemId());
		}

		if (bensDireitosRequerenteEntity.getDescricao() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"descricao\": ");

			sb.append("\"");

			sb.append(_escape(bensDireitosRequerenteEntity.getDescricao()));

			sb.append("\"");
		}

		if (bensDireitosRequerenteEntity.getLaudoAvaliacaoEntities() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"laudoAvaliacaoEntities\": ");

			sb.append("[");

			for (int i = 0;
				 i < bensDireitosRequerenteEntity.
					 getLaudoAvaliacaoEntities().length;
				 i++) {

				sb.append(
					String.valueOf(
						bensDireitosRequerenteEntity.getLaudoAvaliacaoEntities()
							[i]));

				if ((i + 1) < bensDireitosRequerenteEntity.
						getLaudoAvaliacaoEntities().length) {

					sb.append(", ");
				}
			}

			sb.append("]");
		}

		if (bensDireitosRequerenteEntity.getLocalizacao() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"localizacao\": ");

			sb.append("\"");

			sb.append(_escape(bensDireitosRequerenteEntity.getLocalizacao()));

			sb.append("\"");
		}

		if (bensDireitosRequerenteEntity.getPropostaId() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"propostaId\": ");

			sb.append(bensDireitosRequerenteEntity.getPropostaId());
		}

		sb.append("}");

		return sb.toString();
	}

	public static Map<String, Object> toMap(String json) {
		BensDireitosRequerenteEntityJSONParser
			bensDireitosRequerenteEntityJSONParser =
				new BensDireitosRequerenteEntityJSONParser();

		return bensDireitosRequerenteEntityJSONParser.parseToMap(json);
	}

	public static Map<String, String> toMap(
		BensDireitosRequerenteEntity bensDireitosRequerenteEntity) {

		if (bensDireitosRequerenteEntity == null) {
			return null;
		}

		Map<String, String> map = new TreeMap<>();

		if (bensDireitosRequerenteEntity.getBemId() == null) {
			map.put("bemId", null);
		}
		else {
			map.put(
				"bemId",
				String.valueOf(bensDireitosRequerenteEntity.getBemId()));
		}

		if (bensDireitosRequerenteEntity.getDescricao() == null) {
			map.put("descricao", null);
		}
		else {
			map.put(
				"descricao",
				String.valueOf(bensDireitosRequerenteEntity.getDescricao()));
		}

		if (bensDireitosRequerenteEntity.getLaudoAvaliacaoEntities() == null) {
			map.put("laudoAvaliacaoEntities", null);
		}
		else {
			map.put(
				"laudoAvaliacaoEntities",
				String.valueOf(
					bensDireitosRequerenteEntity.getLaudoAvaliacaoEntities()));
		}

		if (bensDireitosRequerenteEntity.getLocalizacao() == null) {
			map.put("localizacao", null);
		}
		else {
			map.put(
				"localizacao",
				String.valueOf(bensDireitosRequerenteEntity.getLocalizacao()));
		}

		if (bensDireitosRequerenteEntity.getPropostaId() == null) {
			map.put("propostaId", null);
		}
		else {
			map.put(
				"propostaId",
				String.valueOf(bensDireitosRequerenteEntity.getPropostaId()));
		}

		return map;
	}

	public static class BensDireitosRequerenteEntityJSONParser
		extends BaseJSONParser<BensDireitosRequerenteEntity> {

		@Override
		protected BensDireitosRequerenteEntity createDTO() {
			return new BensDireitosRequerenteEntity();
		}

		@Override
		protected BensDireitosRequerenteEntity[] createDTOArray(int size) {
			return new BensDireitosRequerenteEntity[size];
		}

		@Override
		protected boolean parseMaps(String jsonParserFieldName) {
			if (Objects.equals(jsonParserFieldName, "bemId")) {
				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "descricao")) {
				return false;
			}
			else if (Objects.equals(
						jsonParserFieldName, "laudoAvaliacaoEntities")) {

				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "localizacao")) {
				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "propostaId")) {
				return false;
			}

			return false;
		}

		@Override
		protected void setField(
			BensDireitosRequerenteEntity bensDireitosRequerenteEntity,
			String jsonParserFieldName, Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "bemId")) {
				if (jsonParserFieldValue != null) {
					bensDireitosRequerenteEntity.setBemId(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "descricao")) {
				if (jsonParserFieldValue != null) {
					bensDireitosRequerenteEntity.setDescricao(
						(String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(
						jsonParserFieldName, "laudoAvaliacaoEntities")) {

				if (jsonParserFieldValue != null) {
					Object[] jsonParserFieldValues =
						(Object[])jsonParserFieldValue;

					LaudoAvaliacaoEntity[] laudoAvaliacaoEntitiesArray =
						new LaudoAvaliacaoEntity[jsonParserFieldValues.length];

					for (int i = 0; i < laudoAvaliacaoEntitiesArray.length;
						 i++) {

						laudoAvaliacaoEntitiesArray[i] =
							LaudoAvaliacaoEntitySerDes.toDTO(
								(String)jsonParserFieldValues[i]);
					}

					bensDireitosRequerenteEntity.setLaudoAvaliacaoEntities(
						laudoAvaliacaoEntitiesArray);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "localizacao")) {
				if (jsonParserFieldValue != null) {
					bensDireitosRequerenteEntity.setLocalizacao(
						(String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "propostaId")) {
				if (jsonParserFieldValue != null) {
					bensDireitosRequerenteEntity.setPropostaId(
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
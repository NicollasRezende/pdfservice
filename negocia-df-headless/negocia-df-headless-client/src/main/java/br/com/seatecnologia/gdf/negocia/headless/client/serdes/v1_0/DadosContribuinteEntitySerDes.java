package br.com.seatecnologia.gdf.negocia.headless.client.serdes.v1_0;

import br.com.seatecnologia.gdf.negocia.headless.client.dto.v1_0.DadosContribuinteEntity;
import br.com.seatecnologia.gdf.negocia.headless.client.dto.v1_0.PessoaJuridicaEntity;
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
public class DadosContribuinteEntitySerDes {

	public static DadosContribuinteEntity toDTO(String json) {
		DadosContribuinteEntityJSONParser dadosContribuinteEntityJSONParser =
			new DadosContribuinteEntityJSONParser();

		return dadosContribuinteEntityJSONParser.parseToDTO(json);
	}

	public static DadosContribuinteEntity[] toDTOs(String json) {
		DadosContribuinteEntityJSONParser dadosContribuinteEntityJSONParser =
			new DadosContribuinteEntityJSONParser();

		return dadosContribuinteEntityJSONParser.parseToDTOs(json);
	}

	public static String toJSON(
		DadosContribuinteEntity dadosContribuinteEntity) {

		if (dadosContribuinteEntity == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		if (dadosContribuinteEntity.getPessoaJuridicaEntities() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"pessoaJuridicaEntities\": ");

			sb.append("[");

			for (int i = 0;
				 i < dadosContribuinteEntity.getPessoaJuridicaEntities().length;
				 i++) {

				sb.append(
					String.valueOf(
						dadosContribuinteEntity.getPessoaJuridicaEntities()
							[i]));

				if ((i + 1) < dadosContribuinteEntity.
						getPessoaJuridicaEntities().length) {

					sb.append(", ");
				}
			}

			sb.append("]");
		}

		if (dadosContribuinteEntity.getQualificacao() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"qualificacao\": ");

			sb.append(
				String.valueOf(dadosContribuinteEntity.getQualificacao()));
		}

		sb.append("}");

		return sb.toString();
	}

	public static Map<String, Object> toMap(String json) {
		DadosContribuinteEntityJSONParser dadosContribuinteEntityJSONParser =
			new DadosContribuinteEntityJSONParser();

		return dadosContribuinteEntityJSONParser.parseToMap(json);
	}

	public static Map<String, String> toMap(
		DadosContribuinteEntity dadosContribuinteEntity) {

		if (dadosContribuinteEntity == null) {
			return null;
		}

		Map<String, String> map = new TreeMap<>();

		if (dadosContribuinteEntity.getPessoaJuridicaEntities() == null) {
			map.put("pessoaJuridicaEntities", null);
		}
		else {
			map.put(
				"pessoaJuridicaEntities",
				String.valueOf(
					dadosContribuinteEntity.getPessoaJuridicaEntities()));
		}

		if (dadosContribuinteEntity.getQualificacao() == null) {
			map.put("qualificacao", null);
		}
		else {
			map.put(
				"qualificacao",
				String.valueOf(dadosContribuinteEntity.getQualificacao()));
		}

		return map;
	}

	public static class DadosContribuinteEntityJSONParser
		extends BaseJSONParser<DadosContribuinteEntity> {

		@Override
		protected DadosContribuinteEntity createDTO() {
			return new DadosContribuinteEntity();
		}

		@Override
		protected DadosContribuinteEntity[] createDTOArray(int size) {
			return new DadosContribuinteEntity[size];
		}

		@Override
		protected boolean parseMaps(String jsonParserFieldName) {
			if (Objects.equals(jsonParserFieldName, "pessoaJuridicaEntities")) {
				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "qualificacao")) {
				return false;
			}

			return false;
		}

		@Override
		protected void setField(
			DadosContribuinteEntity dadosContribuinteEntity,
			String jsonParserFieldName, Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "pessoaJuridicaEntities")) {
				if (jsonParserFieldValue != null) {
					Object[] jsonParserFieldValues =
						(Object[])jsonParserFieldValue;

					PessoaJuridicaEntity[] pessoaJuridicaEntitiesArray =
						new PessoaJuridicaEntity[jsonParserFieldValues.length];

					for (int i = 0; i < pessoaJuridicaEntitiesArray.length;
						 i++) {

						pessoaJuridicaEntitiesArray[i] =
							PessoaJuridicaEntitySerDes.toDTO(
								(String)jsonParserFieldValues[i]);
					}

					dadosContribuinteEntity.setPessoaJuridicaEntities(
						pessoaJuridicaEntitiesArray);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "qualificacao")) {
				if (jsonParserFieldValue != null) {
					dadosContribuinteEntity.setQualificacao(
						QualificacaoCompletaEntitySerDes.toDTO(
							(String)jsonParserFieldValue));
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
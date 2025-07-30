package br.com.seatecnologia.gdf.negocia.headless.client.serdes.v1_0;

import br.com.seatecnologia.gdf.negocia.headless.client.dto.v1_0.ArquivosEntity;
import br.com.seatecnologia.gdf.negocia.headless.client.dto.v1_0.DemonstracoesContabeisEntities;
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
public class DemonstracoesContabeisEntitiesSerDes {

	public static DemonstracoesContabeisEntities toDTO(String json) {
		DemonstracoesContabeisEntitiesJSONParser
			demonstracoesContabeisEntitiesJSONParser =
				new DemonstracoesContabeisEntitiesJSONParser();

		return demonstracoesContabeisEntitiesJSONParser.parseToDTO(json);
	}

	public static DemonstracoesContabeisEntities[] toDTOs(String json) {
		DemonstracoesContabeisEntitiesJSONParser
			demonstracoesContabeisEntitiesJSONParser =
				new DemonstracoesContabeisEntitiesJSONParser();

		return demonstracoesContabeisEntitiesJSONParser.parseToDTOs(json);
	}

	public static String toJSON(
		DemonstracoesContabeisEntities demonstracoesContabeisEntities) {

		if (demonstracoesContabeisEntities == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		if (demonstracoesContabeisEntities.getBalancoPatrimonial() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"balancoPatrimonial\": ");

			sb.append(
				String.valueOf(
					demonstracoesContabeisEntities.getBalancoPatrimonial()));
		}

		if (demonstracoesContabeisEntities.getDemonstracoesResultados() !=
				null) {

			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"demonstracoesResultados\": ");

			sb.append("[");

			for (int i = 0;
				 i < demonstracoesContabeisEntities.
					 getDemonstracoesResultados().length;
				 i++) {

				sb.append(
					String.valueOf(
						demonstracoesContabeisEntities.
							getDemonstracoesResultados()[i]));

				if ((i + 1) < demonstracoesContabeisEntities.
						getDemonstracoesResultados().length) {

					sb.append(", ");
				}
			}

			sb.append("]");
		}

		if (demonstracoesContabeisEntities.getDescricaoGrupo() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"descricaoGrupo\": ");

			sb.append(
				String.valueOf(
					demonstracoesContabeisEntities.getDescricaoGrupo()));
		}

		if (demonstracoesContabeisEntities.getOutrosContabeis() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"outrosContabeis\": ");

			sb.append("[");

			for (int i = 0;
				 i < demonstracoesContabeisEntities.getOutrosContabeis().length;
				 i++) {

				sb.append(
					String.valueOf(
						demonstracoesContabeisEntities.getOutrosContabeis()
							[i]));

				if ((i + 1) < demonstracoesContabeisEntities.
						getOutrosContabeis().length) {

					sb.append(", ");
				}
			}

			sb.append("]");
		}

		if (demonstracoesContabeisEntities.getRelatoriosGerenciais() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"relatoriosGerenciais\": ");

			sb.append("[");

			for (int i = 0;
				 i < demonstracoesContabeisEntities.
					 getRelatoriosGerenciais().length;
				 i++) {

				sb.append(
					String.valueOf(
						demonstracoesContabeisEntities.getRelatoriosGerenciais()
							[i]));

				if ((i + 1) < demonstracoesContabeisEntities.
						getRelatoriosGerenciais().length) {

					sb.append(", ");
				}
			}

			sb.append("]");
		}

		sb.append("}");

		return sb.toString();
	}

	public static Map<String, Object> toMap(String json) {
		DemonstracoesContabeisEntitiesJSONParser
			demonstracoesContabeisEntitiesJSONParser =
				new DemonstracoesContabeisEntitiesJSONParser();

		return demonstracoesContabeisEntitiesJSONParser.parseToMap(json);
	}

	public static Map<String, String> toMap(
		DemonstracoesContabeisEntities demonstracoesContabeisEntities) {

		if (demonstracoesContabeisEntities == null) {
			return null;
		}

		Map<String, String> map = new TreeMap<>();

		if (demonstracoesContabeisEntities.getBalancoPatrimonial() == null) {
			map.put("balancoPatrimonial", null);
		}
		else {
			map.put(
				"balancoPatrimonial",
				String.valueOf(
					demonstracoesContabeisEntities.getBalancoPatrimonial()));
		}

		if (demonstracoesContabeisEntities.getDemonstracoesResultados() ==
				null) {

			map.put("demonstracoesResultados", null);
		}
		else {
			map.put(
				"demonstracoesResultados",
				String.valueOf(
					demonstracoesContabeisEntities.
						getDemonstracoesResultados()));
		}

		if (demonstracoesContabeisEntities.getDescricaoGrupo() == null) {
			map.put("descricaoGrupo", null);
		}
		else {
			map.put(
				"descricaoGrupo",
				String.valueOf(
					demonstracoesContabeisEntities.getDescricaoGrupo()));
		}

		if (demonstracoesContabeisEntities.getOutrosContabeis() == null) {
			map.put("outrosContabeis", null);
		}
		else {
			map.put(
				"outrosContabeis",
				String.valueOf(
					demonstracoesContabeisEntities.getOutrosContabeis()));
		}

		if (demonstracoesContabeisEntities.getRelatoriosGerenciais() == null) {
			map.put("relatoriosGerenciais", null);
		}
		else {
			map.put(
				"relatoriosGerenciais",
				String.valueOf(
					demonstracoesContabeisEntities.getRelatoriosGerenciais()));
		}

		return map;
	}

	public static class DemonstracoesContabeisEntitiesJSONParser
		extends BaseJSONParser<DemonstracoesContabeisEntities> {

		@Override
		protected DemonstracoesContabeisEntities createDTO() {
			return new DemonstracoesContabeisEntities();
		}

		@Override
		protected DemonstracoesContabeisEntities[] createDTOArray(int size) {
			return new DemonstracoesContabeisEntities[size];
		}

		@Override
		protected boolean parseMaps(String jsonParserFieldName) {
			if (Objects.equals(jsonParserFieldName, "balancoPatrimonial")) {
				return false;
			}
			else if (Objects.equals(
						jsonParserFieldName, "demonstracoesResultados")) {

				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "descricaoGrupo")) {
				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "outrosContabeis")) {
				return false;
			}
			else if (Objects.equals(
						jsonParserFieldName, "relatoriosGerenciais")) {

				return false;
			}

			return false;
		}

		@Override
		protected void setField(
			DemonstracoesContabeisEntities demonstracoesContabeisEntities,
			String jsonParserFieldName, Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "balancoPatrimonial")) {
				if (jsonParserFieldValue != null) {
					demonstracoesContabeisEntities.setBalancoPatrimonial(
						ArquivosEntitySerDes.toDTO(
							(String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(
						jsonParserFieldName, "demonstracoesResultados")) {

				if (jsonParserFieldValue != null) {
					Object[] jsonParserFieldValues =
						(Object[])jsonParserFieldValue;

					ArquivosEntity[] demonstracoesResultadosArray =
						new ArquivosEntity[jsonParserFieldValues.length];

					for (int i = 0; i < demonstracoesResultadosArray.length;
						 i++) {

						demonstracoesResultadosArray[i] =
							ArquivosEntitySerDes.toDTO(
								(String)jsonParserFieldValues[i]);
					}

					demonstracoesContabeisEntities.setDemonstracoesResultados(
						demonstracoesResultadosArray);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "descricaoGrupo")) {
				if (jsonParserFieldValue != null) {
					demonstracoesContabeisEntities.setDescricaoGrupo(
						ArquivosEntitySerDes.toDTO(
							(String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "outrosContabeis")) {
				if (jsonParserFieldValue != null) {
					Object[] jsonParserFieldValues =
						(Object[])jsonParserFieldValue;

					ArquivosEntity[] outrosContabeisArray =
						new ArquivosEntity[jsonParserFieldValues.length];

					for (int i = 0; i < outrosContabeisArray.length; i++) {
						outrosContabeisArray[i] = ArquivosEntitySerDes.toDTO(
							(String)jsonParserFieldValues[i]);
					}

					demonstracoesContabeisEntities.setOutrosContabeis(
						outrosContabeisArray);
				}
			}
			else if (Objects.equals(
						jsonParserFieldName, "relatoriosGerenciais")) {

				if (jsonParserFieldValue != null) {
					Object[] jsonParserFieldValues =
						(Object[])jsonParserFieldValue;

					ArquivosEntity[] relatoriosGerenciaisArray =
						new ArquivosEntity[jsonParserFieldValues.length];

					for (int i = 0; i < relatoriosGerenciaisArray.length; i++) {
						relatoriosGerenciaisArray[i] =
							ArquivosEntitySerDes.toDTO(
								(String)jsonParserFieldValues[i]);
					}

					demonstracoesContabeisEntities.setRelatoriosGerenciais(
						relatoriosGerenciaisArray);
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
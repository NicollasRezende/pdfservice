package br.com.seatecnologia.gdf.negocia.headless.client.serdes.v1_0;

import br.com.seatecnologia.gdf.negocia.headless.client.dto.v1_0.ArquivosEntity;
import br.com.seatecnologia.gdf.negocia.headless.client.dto.v1_0.DadosRegistro;
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
public class DadosRegistroSerDes {

	public static DadosRegistro toDTO(String json) {
		DadosRegistroJSONParser dadosRegistroJSONParser =
			new DadosRegistroJSONParser();

		return dadosRegistroJSONParser.parseToDTO(json);
	}

	public static DadosRegistro[] toDTOs(String json) {
		DadosRegistroJSONParser dadosRegistroJSONParser =
			new DadosRegistroJSONParser();

		return dadosRegistroJSONParser.parseToDTOs(json);
	}

	public static String toJSON(DadosRegistro dadosRegistro) {
		if (dadosRegistro == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		if (dadosRegistro.getCartorioRegistro() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"cartorioRegistro\": ");

			sb.append("\"");

			sb.append(_escape(dadosRegistro.getCartorioRegistro()));

			sb.append("\"");
		}

		if (dadosRegistro.getMatriculaImovel() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"matriculaImovel\": ");

			sb.append("\"");

			sb.append(_escape(dadosRegistro.getMatriculaImovel()));

			sb.append("\"");
		}

		if (dadosRegistro.getOutrosDocumento() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"outrosDocumento\": ");

			sb.append("[");

			for (int i = 0; i < dadosRegistro.getOutrosDocumento().length;
				 i++) {

				sb.append(
					String.valueOf(dadosRegistro.getOutrosDocumento()[i]));

				if ((i + 1) < dadosRegistro.getOutrosDocumento().length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		if (dadosRegistro.getRenavam() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"renavam\": ");

			sb.append("\"");

			sb.append(_escape(dadosRegistro.getRenavam()));

			sb.append("\"");
		}

		sb.append("}");

		return sb.toString();
	}

	public static Map<String, Object> toMap(String json) {
		DadosRegistroJSONParser dadosRegistroJSONParser =
			new DadosRegistroJSONParser();

		return dadosRegistroJSONParser.parseToMap(json);
	}

	public static Map<String, String> toMap(DadosRegistro dadosRegistro) {
		if (dadosRegistro == null) {
			return null;
		}

		Map<String, String> map = new TreeMap<>();

		if (dadosRegistro.getCartorioRegistro() == null) {
			map.put("cartorioRegistro", null);
		}
		else {
			map.put(
				"cartorioRegistro",
				String.valueOf(dadosRegistro.getCartorioRegistro()));
		}

		if (dadosRegistro.getMatriculaImovel() == null) {
			map.put("matriculaImovel", null);
		}
		else {
			map.put(
				"matriculaImovel",
				String.valueOf(dadosRegistro.getMatriculaImovel()));
		}

		if (dadosRegistro.getOutrosDocumento() == null) {
			map.put("outrosDocumento", null);
		}
		else {
			map.put(
				"outrosDocumento",
				String.valueOf(dadosRegistro.getOutrosDocumento()));
		}

		if (dadosRegistro.getRenavam() == null) {
			map.put("renavam", null);
		}
		else {
			map.put("renavam", String.valueOf(dadosRegistro.getRenavam()));
		}

		return map;
	}

	public static class DadosRegistroJSONParser
		extends BaseJSONParser<DadosRegistro> {

		@Override
		protected DadosRegistro createDTO() {
			return new DadosRegistro();
		}

		@Override
		protected DadosRegistro[] createDTOArray(int size) {
			return new DadosRegistro[size];
		}

		@Override
		protected boolean parseMaps(String jsonParserFieldName) {
			if (Objects.equals(jsonParserFieldName, "cartorioRegistro")) {
				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "matriculaImovel")) {
				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "outrosDocumento")) {
				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "renavam")) {
				return false;
			}

			return false;
		}

		@Override
		protected void setField(
			DadosRegistro dadosRegistro, String jsonParserFieldName,
			Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "cartorioRegistro")) {
				if (jsonParserFieldValue != null) {
					dadosRegistro.setCartorioRegistro(
						(String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "matriculaImovel")) {
				if (jsonParserFieldValue != null) {
					dadosRegistro.setMatriculaImovel(
						(String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "outrosDocumento")) {
				if (jsonParserFieldValue != null) {
					Object[] jsonParserFieldValues =
						(Object[])jsonParserFieldValue;

					ArquivosEntity[] outrosDocumentoArray =
						new ArquivosEntity[jsonParserFieldValues.length];

					for (int i = 0; i < outrosDocumentoArray.length; i++) {
						outrosDocumentoArray[i] = ArquivosEntitySerDes.toDTO(
							(String)jsonParserFieldValues[i]);
					}

					dadosRegistro.setOutrosDocumento(outrosDocumentoArray);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "renavam")) {
				if (jsonParserFieldValue != null) {
					dadosRegistro.setRenavam((String)jsonParserFieldValue);
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
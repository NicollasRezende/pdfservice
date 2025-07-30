package br.com.seatecnologia.gdf.negocia.headless.client.serdes.v1_0;

import br.com.seatecnologia.gdf.negocia.headless.client.dto.v1_0.GarantiaDetalhadaEntity;
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
public class GarantiaDetalhadaEntitySerDes {

	public static GarantiaDetalhadaEntity toDTO(String json) {
		GarantiaDetalhadaEntityJSONParser garantiaDetalhadaEntityJSONParser =
			new GarantiaDetalhadaEntityJSONParser();

		return garantiaDetalhadaEntityJSONParser.parseToDTO(json);
	}

	public static GarantiaDetalhadaEntity[] toDTOs(String json) {
		GarantiaDetalhadaEntityJSONParser garantiaDetalhadaEntityJSONParser =
			new GarantiaDetalhadaEntityJSONParser();

		return garantiaDetalhadaEntityJSONParser.parseToDTOs(json);
	}

	public static String toJSON(
		GarantiaDetalhadaEntity garantiaDetalhadaEntity) {

		if (garantiaDetalhadaEntity == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		if (garantiaDetalhadaEntity.getDadosRegistro() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"dadosRegistro\": ");

			sb.append(
				String.valueOf(garantiaDetalhadaEntity.getDadosRegistro()));
		}

		if (garantiaDetalhadaEntity.getDeclaracao() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"declaracao\": ");

			sb.append(String.valueOf(garantiaDetalhadaEntity.getDeclaracao()));
		}

		if (garantiaDetalhadaEntity.getDeclaracaoAnuencia() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"declaracaoAnuencia\": ");

			sb.append(garantiaDetalhadaEntity.getDeclaracaoAnuencia());
		}

		if (garantiaDetalhadaEntity.getDescricaoBem() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"descricaoBem\": ");

			sb.append("\"");

			sb.append(_escape(garantiaDetalhadaEntity.getDescricaoBem()));

			sb.append("\"");
		}

		if (garantiaDetalhadaEntity.getGarantiaId() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"garantiaId\": ");

			sb.append(garantiaDetalhadaEntity.getGarantiaId());
		}

		if (garantiaDetalhadaEntity.getLocalizacao() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"localizacao\": ");

			sb.append("\"");

			sb.append(_escape(garantiaDetalhadaEntity.getLocalizacao()));

			sb.append("\"");
		}

		if (garantiaDetalhadaEntity.getOutrasGarantias() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"outrasGarantias\": ");

			sb.append("\"");

			sb.append(_escape(garantiaDetalhadaEntity.getOutrasGarantias()));

			sb.append("\"");
		}

		if (garantiaDetalhadaEntity.getPropostaId() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"propostaId\": ");

			sb.append(garantiaDetalhadaEntity.getPropostaId());
		}

		if (garantiaDetalhadaEntity.getProprietario() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"proprietario\": ");

			sb.append(
				String.valueOf(garantiaDetalhadaEntity.getProprietario()));
		}

		if (garantiaDetalhadaEntity.getTipoDevedor() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"tipoDevedor\": ");

			sb.append("\"");

			sb.append(_escape(garantiaDetalhadaEntity.getTipoDevedor()));

			sb.append("\"");
		}

		if (garantiaDetalhadaEntity.getTipoGarantia() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"tipoGarantia\": ");

			sb.append("\"");

			sb.append(_escape(garantiaDetalhadaEntity.getTipoGarantia()));

			sb.append("\"");
		}

		if (garantiaDetalhadaEntity.getValorEstimado() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"valorEstimado\": ");

			sb.append(garantiaDetalhadaEntity.getValorEstimado());
		}

		sb.append("}");

		return sb.toString();
	}

	public static Map<String, Object> toMap(String json) {
		GarantiaDetalhadaEntityJSONParser garantiaDetalhadaEntityJSONParser =
			new GarantiaDetalhadaEntityJSONParser();

		return garantiaDetalhadaEntityJSONParser.parseToMap(json);
	}

	public static Map<String, String> toMap(
		GarantiaDetalhadaEntity garantiaDetalhadaEntity) {

		if (garantiaDetalhadaEntity == null) {
			return null;
		}

		Map<String, String> map = new TreeMap<>();

		if (garantiaDetalhadaEntity.getDadosRegistro() == null) {
			map.put("dadosRegistro", null);
		}
		else {
			map.put(
				"dadosRegistro",
				String.valueOf(garantiaDetalhadaEntity.getDadosRegistro()));
		}

		if (garantiaDetalhadaEntity.getDeclaracao() == null) {
			map.put("declaracao", null);
		}
		else {
			map.put(
				"declaracao",
				String.valueOf(garantiaDetalhadaEntity.getDeclaracao()));
		}

		if (garantiaDetalhadaEntity.getDeclaracaoAnuencia() == null) {
			map.put("declaracaoAnuencia", null);
		}
		else {
			map.put(
				"declaracaoAnuencia",
				String.valueOf(
					garantiaDetalhadaEntity.getDeclaracaoAnuencia()));
		}

		if (garantiaDetalhadaEntity.getDescricaoBem() == null) {
			map.put("descricaoBem", null);
		}
		else {
			map.put(
				"descricaoBem",
				String.valueOf(garantiaDetalhadaEntity.getDescricaoBem()));
		}

		if (garantiaDetalhadaEntity.getGarantiaId() == null) {
			map.put("garantiaId", null);
		}
		else {
			map.put(
				"garantiaId",
				String.valueOf(garantiaDetalhadaEntity.getGarantiaId()));
		}

		if (garantiaDetalhadaEntity.getLocalizacao() == null) {
			map.put("localizacao", null);
		}
		else {
			map.put(
				"localizacao",
				String.valueOf(garantiaDetalhadaEntity.getLocalizacao()));
		}

		if (garantiaDetalhadaEntity.getOutrasGarantias() == null) {
			map.put("outrasGarantias", null);
		}
		else {
			map.put(
				"outrasGarantias",
				String.valueOf(garantiaDetalhadaEntity.getOutrasGarantias()));
		}

		if (garantiaDetalhadaEntity.getPropostaId() == null) {
			map.put("propostaId", null);
		}
		else {
			map.put(
				"propostaId",
				String.valueOf(garantiaDetalhadaEntity.getPropostaId()));
		}

		if (garantiaDetalhadaEntity.getProprietario() == null) {
			map.put("proprietario", null);
		}
		else {
			map.put(
				"proprietario",
				String.valueOf(garantiaDetalhadaEntity.getProprietario()));
		}

		if (garantiaDetalhadaEntity.getTipoDevedor() == null) {
			map.put("tipoDevedor", null);
		}
		else {
			map.put(
				"tipoDevedor",
				String.valueOf(garantiaDetalhadaEntity.getTipoDevedor()));
		}

		if (garantiaDetalhadaEntity.getTipoGarantia() == null) {
			map.put("tipoGarantia", null);
		}
		else {
			map.put(
				"tipoGarantia",
				String.valueOf(garantiaDetalhadaEntity.getTipoGarantia()));
		}

		if (garantiaDetalhadaEntity.getValorEstimado() == null) {
			map.put("valorEstimado", null);
		}
		else {
			map.put(
				"valorEstimado",
				String.valueOf(garantiaDetalhadaEntity.getValorEstimado()));
		}

		return map;
	}

	public static class GarantiaDetalhadaEntityJSONParser
		extends BaseJSONParser<GarantiaDetalhadaEntity> {

		@Override
		protected GarantiaDetalhadaEntity createDTO() {
			return new GarantiaDetalhadaEntity();
		}

		@Override
		protected GarantiaDetalhadaEntity[] createDTOArray(int size) {
			return new GarantiaDetalhadaEntity[size];
		}

		@Override
		protected boolean parseMaps(String jsonParserFieldName) {
			if (Objects.equals(jsonParserFieldName, "dadosRegistro")) {
				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "declaracao")) {
				return false;
			}
			else if (Objects.equals(
						jsonParserFieldName, "declaracaoAnuencia")) {

				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "descricaoBem")) {
				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "garantiaId")) {
				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "localizacao")) {
				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "outrasGarantias")) {
				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "propostaId")) {
				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "proprietario")) {
				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "tipoDevedor")) {
				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "tipoGarantia")) {
				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "valorEstimado")) {
				return false;
			}

			return false;
		}

		@Override
		protected void setField(
			GarantiaDetalhadaEntity garantiaDetalhadaEntity,
			String jsonParserFieldName, Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "dadosRegistro")) {
				if (jsonParserFieldValue != null) {
					garantiaDetalhadaEntity.setDadosRegistro(
						DadosRegistroSerDes.toDTO(
							(String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "declaracao")) {
				if (jsonParserFieldValue != null) {
					garantiaDetalhadaEntity.setDeclaracao(
						ArquivosEntitySerDes.toDTO(
							(String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(
						jsonParserFieldName, "declaracaoAnuencia")) {

				if (jsonParserFieldValue != null) {
					garantiaDetalhadaEntity.setDeclaracaoAnuencia(
						(Boolean)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "descricaoBem")) {
				if (jsonParserFieldValue != null) {
					garantiaDetalhadaEntity.setDescricaoBem(
						(String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "garantiaId")) {
				if (jsonParserFieldValue != null) {
					garantiaDetalhadaEntity.setGarantiaId(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "localizacao")) {
				if (jsonParserFieldValue != null) {
					garantiaDetalhadaEntity.setLocalizacao(
						(String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "outrasGarantias")) {
				if (jsonParserFieldValue != null) {
					garantiaDetalhadaEntity.setOutrasGarantias(
						(String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "propostaId")) {
				if (jsonParserFieldValue != null) {
					garantiaDetalhadaEntity.setPropostaId(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "proprietario")) {
				if (jsonParserFieldValue != null) {
					garantiaDetalhadaEntity.setProprietario(
						QualificacaoCompletaEntitySerDes.toDTO(
							(String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "tipoDevedor")) {
				if (jsonParserFieldValue != null) {
					garantiaDetalhadaEntity.setTipoDevedor(
						(String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "tipoGarantia")) {
				if (jsonParserFieldValue != null) {
					garantiaDetalhadaEntity.setTipoGarantia(
						(String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "valorEstimado")) {
				if (jsonParserFieldValue != null) {
					garantiaDetalhadaEntity.setValorEstimado(
						Double.valueOf((String)jsonParserFieldValue));
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
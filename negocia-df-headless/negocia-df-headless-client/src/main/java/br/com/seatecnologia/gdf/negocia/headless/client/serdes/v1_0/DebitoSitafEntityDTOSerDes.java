package br.com.seatecnologia.gdf.negocia.headless.client.serdes.v1_0;

import br.com.seatecnologia.gdf.negocia.headless.client.dto.v1_0.DebitoSitafEntityDTO;
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
public class DebitoSitafEntityDTOSerDes {

	public static DebitoSitafEntityDTO toDTO(String json) {
		DebitoSitafEntityDTOJSONParser debitoSitafEntityDTOJSONParser =
			new DebitoSitafEntityDTOJSONParser();

		return debitoSitafEntityDTOJSONParser.parseToDTO(json);
	}

	public static DebitoSitafEntityDTO[] toDTOs(String json) {
		DebitoSitafEntityDTOJSONParser debitoSitafEntityDTOJSONParser =
			new DebitoSitafEntityDTOJSONParser();

		return debitoSitafEntityDTOJSONParser.parseToDTOs(json);
	}

	public static String toJSON(DebitoSitafEntityDTO debitoSitafEntityDTO) {
		if (debitoSitafEntityDTO == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		if (debitoSitafEntityDTO.getTipoDebito() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"TipoDebito\": ");

			sb.append("\"");

			sb.append(_escape(debitoSitafEntityDTO.getTipoDebito()));

			sb.append("\"");
		}

		if (debitoSitafEntityDTO.getAnoExercicio() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"anoExercicio\": ");

			sb.append(debitoSitafEntityDTO.getAnoExercicio());
		}

		if (debitoSitafEntityDTO.getCodigoOrgaoGerador() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"codigoOrgaoGerador\": ");

			sb.append("\"");

			sb.append(_escape(debitoSitafEntityDTO.getCodigoOrgaoGerador()));

			sb.append("\"");
		}

		if (debitoSitafEntityDTO.getCodigoRatingDivida() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"codigoRatingDivida\": ");

			sb.append("\"");

			sb.append(_escape(debitoSitafEntityDTO.getCodigoRatingDivida()));

			sb.append("\"");
		}

		if (debitoSitafEntityDTO.getCodigoReceita() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"codigoReceita\": ");

			sb.append("\"");

			sb.append(_escape(debitoSitafEntityDTO.getCodigoReceita()));

			sb.append("\"");
		}

		if (debitoSitafEntityDTO.getCodigoSituacaoDebito() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"codigoSituacaoDebito\": ");

			sb.append("\"");

			sb.append(_escape(debitoSitafEntityDTO.getCodigoSituacaoDebito()));

			sb.append("\"");
		}

		if (debitoSitafEntityDTO.getDescricaoReceita() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"descricaoReceita\": ");

			sb.append("\"");

			sb.append(_escape(debitoSitafEntityDTO.getDescricaoReceita()));

			sb.append("\"");
		}

		if (debitoSitafEntityDTO.getEstadoDebito() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"estadoDebito\": ");

			sb.append("\"");

			sb.append(_escape(debitoSitafEntityDTO.getEstadoDebito()));

			sb.append("\"");
		}

		if (debitoSitafEntityDTO.getIdentificadorCredito() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"identificadorCredito\": ");

			sb.append(
				String.valueOf(debitoSitafEntityDTO.getIdentificadorCredito()));
		}

		if (debitoSitafEntityDTO.getJudicializado() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"judicializado\": ");

			sb.append("\"");

			sb.append(_escape(debitoSitafEntityDTO.getJudicializado()));

			sb.append("\"");
		}

		if (debitoSitafEntityDTO.getObservacao() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"observacao\": ");

			sb.append("\"");

			sb.append(_escape(debitoSitafEntityDTO.getObservacao()));

			sb.append("\"");
		}

		if (debitoSitafEntityDTO.getValorJuros() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"valorJuros\": ");

			sb.append(debitoSitafEntityDTO.getValorJuros());
		}

		if (debitoSitafEntityDTO.getValorMulta() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"valorMulta\": ");

			sb.append(debitoSitafEntityDTO.getValorMulta());
		}

		if (debitoSitafEntityDTO.getValorOutros() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"valorOutros\": ");

			sb.append(debitoSitafEntityDTO.getValorOutros());
		}

		if (debitoSitafEntityDTO.getValorPrincipal() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"valorPrincipal\": ");

			sb.append(debitoSitafEntityDTO.getValorPrincipal());
		}

		sb.append("}");

		return sb.toString();
	}

	public static Map<String, Object> toMap(String json) {
		DebitoSitafEntityDTOJSONParser debitoSitafEntityDTOJSONParser =
			new DebitoSitafEntityDTOJSONParser();

		return debitoSitafEntityDTOJSONParser.parseToMap(json);
	}

	public static Map<String, String> toMap(
		DebitoSitafEntityDTO debitoSitafEntityDTO) {

		if (debitoSitafEntityDTO == null) {
			return null;
		}

		Map<String, String> map = new TreeMap<>();

		if (debitoSitafEntityDTO.getTipoDebito() == null) {
			map.put("TipoDebito", null);
		}
		else {
			map.put(
				"TipoDebito",
				String.valueOf(debitoSitafEntityDTO.getTipoDebito()));
		}

		if (debitoSitafEntityDTO.getAnoExercicio() == null) {
			map.put("anoExercicio", null);
		}
		else {
			map.put(
				"anoExercicio",
				String.valueOf(debitoSitafEntityDTO.getAnoExercicio()));
		}

		if (debitoSitafEntityDTO.getCodigoOrgaoGerador() == null) {
			map.put("codigoOrgaoGerador", null);
		}
		else {
			map.put(
				"codigoOrgaoGerador",
				String.valueOf(debitoSitafEntityDTO.getCodigoOrgaoGerador()));
		}

		if (debitoSitafEntityDTO.getCodigoRatingDivida() == null) {
			map.put("codigoRatingDivida", null);
		}
		else {
			map.put(
				"codigoRatingDivida",
				String.valueOf(debitoSitafEntityDTO.getCodigoRatingDivida()));
		}

		if (debitoSitafEntityDTO.getCodigoReceita() == null) {
			map.put("codigoReceita", null);
		}
		else {
			map.put(
				"codigoReceita",
				String.valueOf(debitoSitafEntityDTO.getCodigoReceita()));
		}

		if (debitoSitafEntityDTO.getCodigoSituacaoDebito() == null) {
			map.put("codigoSituacaoDebito", null);
		}
		else {
			map.put(
				"codigoSituacaoDebito",
				String.valueOf(debitoSitafEntityDTO.getCodigoSituacaoDebito()));
		}

		if (debitoSitafEntityDTO.getDescricaoReceita() == null) {
			map.put("descricaoReceita", null);
		}
		else {
			map.put(
				"descricaoReceita",
				String.valueOf(debitoSitafEntityDTO.getDescricaoReceita()));
		}

		if (debitoSitafEntityDTO.getEstadoDebito() == null) {
			map.put("estadoDebito", null);
		}
		else {
			map.put(
				"estadoDebito",
				String.valueOf(debitoSitafEntityDTO.getEstadoDebito()));
		}

		if (debitoSitafEntityDTO.getIdentificadorCredito() == null) {
			map.put("identificadorCredito", null);
		}
		else {
			map.put(
				"identificadorCredito",
				String.valueOf(debitoSitafEntityDTO.getIdentificadorCredito()));
		}

		if (debitoSitafEntityDTO.getJudicializado() == null) {
			map.put("judicializado", null);
		}
		else {
			map.put(
				"judicializado",
				String.valueOf(debitoSitafEntityDTO.getJudicializado()));
		}

		if (debitoSitafEntityDTO.getObservacao() == null) {
			map.put("observacao", null);
		}
		else {
			map.put(
				"observacao",
				String.valueOf(debitoSitafEntityDTO.getObservacao()));
		}

		if (debitoSitafEntityDTO.getValorJuros() == null) {
			map.put("valorJuros", null);
		}
		else {
			map.put(
				"valorJuros",
				String.valueOf(debitoSitafEntityDTO.getValorJuros()));
		}

		if (debitoSitafEntityDTO.getValorMulta() == null) {
			map.put("valorMulta", null);
		}
		else {
			map.put(
				"valorMulta",
				String.valueOf(debitoSitafEntityDTO.getValorMulta()));
		}

		if (debitoSitafEntityDTO.getValorOutros() == null) {
			map.put("valorOutros", null);
		}
		else {
			map.put(
				"valorOutros",
				String.valueOf(debitoSitafEntityDTO.getValorOutros()));
		}

		if (debitoSitafEntityDTO.getValorPrincipal() == null) {
			map.put("valorPrincipal", null);
		}
		else {
			map.put(
				"valorPrincipal",
				String.valueOf(debitoSitafEntityDTO.getValorPrincipal()));
		}

		return map;
	}

	public static class DebitoSitafEntityDTOJSONParser
		extends BaseJSONParser<DebitoSitafEntityDTO> {

		@Override
		protected DebitoSitafEntityDTO createDTO() {
			return new DebitoSitafEntityDTO();
		}

		@Override
		protected DebitoSitafEntityDTO[] createDTOArray(int size) {
			return new DebitoSitafEntityDTO[size];
		}

		@Override
		protected boolean parseMaps(String jsonParserFieldName) {
			if (Objects.equals(jsonParserFieldName, "TipoDebito")) {
				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "anoExercicio")) {
				return false;
			}
			else if (Objects.equals(
						jsonParserFieldName, "codigoOrgaoGerador")) {

				return false;
			}
			else if (Objects.equals(
						jsonParserFieldName, "codigoRatingDivida")) {

				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "codigoReceita")) {
				return false;
			}
			else if (Objects.equals(
						jsonParserFieldName, "codigoSituacaoDebito")) {

				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "descricaoReceita")) {
				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "estadoDebito")) {
				return false;
			}
			else if (Objects.equals(
						jsonParserFieldName, "identificadorCredito")) {

				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "judicializado")) {
				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "observacao")) {
				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "valorJuros")) {
				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "valorMulta")) {
				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "valorOutros")) {
				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "valorPrincipal")) {
				return false;
			}

			return false;
		}

		@Override
		protected void setField(
			DebitoSitafEntityDTO debitoSitafEntityDTO,
			String jsonParserFieldName, Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "TipoDebito")) {
				if (jsonParserFieldValue != null) {
					debitoSitafEntityDTO.setTipoDebito(
						(String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "anoExercicio")) {
				if (jsonParserFieldValue != null) {
					debitoSitafEntityDTO.setAnoExercicio(
						Integer.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(
						jsonParserFieldName, "codigoOrgaoGerador")) {

				if (jsonParserFieldValue != null) {
					debitoSitafEntityDTO.setCodigoOrgaoGerador(
						(String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(
						jsonParserFieldName, "codigoRatingDivida")) {

				if (jsonParserFieldValue != null) {
					debitoSitafEntityDTO.setCodigoRatingDivida(
						(String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "codigoReceita")) {
				if (jsonParserFieldValue != null) {
					debitoSitafEntityDTO.setCodigoReceita(
						(String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(
						jsonParserFieldName, "codigoSituacaoDebito")) {

				if (jsonParserFieldValue != null) {
					debitoSitafEntityDTO.setCodigoSituacaoDebito(
						(String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "descricaoReceita")) {
				if (jsonParserFieldValue != null) {
					debitoSitafEntityDTO.setDescricaoReceita(
						(String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "estadoDebito")) {
				if (jsonParserFieldValue != null) {
					debitoSitafEntityDTO.setEstadoDebito(
						(String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(
						jsonParserFieldName, "identificadorCredito")) {

				if (jsonParserFieldValue != null) {
					debitoSitafEntityDTO.setIdentificadorCredito(
						IdentificadorCreditoEntityDTOSerDes.toDTO(
							(String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "judicializado")) {
				if (jsonParserFieldValue != null) {
					debitoSitafEntityDTO.setJudicializado(
						(String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "observacao")) {
				if (jsonParserFieldValue != null) {
					debitoSitafEntityDTO.setObservacao(
						(String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "valorJuros")) {
				if (jsonParserFieldValue != null) {
					debitoSitafEntityDTO.setValorJuros(
						Double.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "valorMulta")) {
				if (jsonParserFieldValue != null) {
					debitoSitafEntityDTO.setValorMulta(
						Double.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "valorOutros")) {
				if (jsonParserFieldValue != null) {
					debitoSitafEntityDTO.setValorOutros(
						Double.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "valorPrincipal")) {
				if (jsonParserFieldValue != null) {
					debitoSitafEntityDTO.setValorPrincipal(
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
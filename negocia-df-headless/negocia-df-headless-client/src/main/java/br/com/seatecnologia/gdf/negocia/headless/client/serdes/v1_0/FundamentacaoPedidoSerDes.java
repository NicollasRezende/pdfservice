package br.com.seatecnologia.gdf.negocia.headless.client.serdes.v1_0;

import br.com.seatecnologia.gdf.negocia.headless.client.dto.v1_0.ArquivosEntity;
import br.com.seatecnologia.gdf.negocia.headless.client.dto.v1_0.FundamentacaoPedido;
import br.com.seatecnologia.gdf.negocia.headless.client.dto.v1_0.IdentificacaoDebitosEntity;
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
public class FundamentacaoPedidoSerDes {

	public static FundamentacaoPedido toDTO(String json) {
		FundamentacaoPedidoJSONParser fundamentacaoPedidoJSONParser =
			new FundamentacaoPedidoJSONParser();

		return fundamentacaoPedidoJSONParser.parseToDTO(json);
	}

	public static FundamentacaoPedido[] toDTOs(String json) {
		FundamentacaoPedidoJSONParser fundamentacaoPedidoJSONParser =
			new FundamentacaoPedidoJSONParser();

		return fundamentacaoPedidoJSONParser.parseToDTOs(json);
	}

	public static String toJSON(FundamentacaoPedido fundamentacaoPedido) {
		if (fundamentacaoPedido == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		if (fundamentacaoPedido.getDocumentacaoComprobatoria() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"documentacaoComprobatoria\": ");

			sb.append("[");

			for (int i = 0;
				 i < fundamentacaoPedido.getDocumentacaoComprobatoria().length;
				 i++) {

				sb.append(
					String.valueOf(
						fundamentacaoPedido.getDocumentacaoComprobatoria()[i]));

				if ((i + 1) <
						fundamentacaoPedido.
							getDocumentacaoComprobatoria().length) {

					sb.append(", ");
				}
			}

			sb.append("]");
		}

		if (fundamentacaoPedido.getFundamentacao() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"fundamentacao\": ");

			sb.append("\"");

			sb.append(_escape(fundamentacaoPedido.getFundamentacao()));

			sb.append("\"");
		}

		if (fundamentacaoPedido.getIdentificacaoDebitos() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"identificacaoDebitos\": ");

			sb.append("[");

			for (int i = 0;
				 i < fundamentacaoPedido.getIdentificacaoDebitos().length;
				 i++) {

				sb.append(
					String.valueOf(
						fundamentacaoPedido.getIdentificacaoDebitos()[i]));

				if ((i + 1) <
						fundamentacaoPedido.getIdentificacaoDebitos().length) {

					sb.append(", ");
				}
			}

			sb.append("]");
		}

		sb.append("}");

		return sb.toString();
	}

	public static Map<String, Object> toMap(String json) {
		FundamentacaoPedidoJSONParser fundamentacaoPedidoJSONParser =
			new FundamentacaoPedidoJSONParser();

		return fundamentacaoPedidoJSONParser.parseToMap(json);
	}

	public static Map<String, String> toMap(
		FundamentacaoPedido fundamentacaoPedido) {

		if (fundamentacaoPedido == null) {
			return null;
		}

		Map<String, String> map = new TreeMap<>();

		if (fundamentacaoPedido.getDocumentacaoComprobatoria() == null) {
			map.put("documentacaoComprobatoria", null);
		}
		else {
			map.put(
				"documentacaoComprobatoria",
				String.valueOf(
					fundamentacaoPedido.getDocumentacaoComprobatoria()));
		}

		if (fundamentacaoPedido.getFundamentacao() == null) {
			map.put("fundamentacao", null);
		}
		else {
			map.put(
				"fundamentacao",
				String.valueOf(fundamentacaoPedido.getFundamentacao()));
		}

		if (fundamentacaoPedido.getIdentificacaoDebitos() == null) {
			map.put("identificacaoDebitos", null);
		}
		else {
			map.put(
				"identificacaoDebitos",
				String.valueOf(fundamentacaoPedido.getIdentificacaoDebitos()));
		}

		return map;
	}

	public static class FundamentacaoPedidoJSONParser
		extends BaseJSONParser<FundamentacaoPedido> {

		@Override
		protected FundamentacaoPedido createDTO() {
			return new FundamentacaoPedido();
		}

		@Override
		protected FundamentacaoPedido[] createDTOArray(int size) {
			return new FundamentacaoPedido[size];
		}

		@Override
		protected boolean parseMaps(String jsonParserFieldName) {
			if (Objects.equals(
					jsonParserFieldName, "documentacaoComprobatoria")) {

				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "fundamentacao")) {
				return false;
			}
			else if (Objects.equals(
						jsonParserFieldName, "identificacaoDebitos")) {

				return false;
			}

			return false;
		}

		@Override
		protected void setField(
			FundamentacaoPedido fundamentacaoPedido, String jsonParserFieldName,
			Object jsonParserFieldValue) {

			if (Objects.equals(
					jsonParserFieldName, "documentacaoComprobatoria")) {

				if (jsonParserFieldValue != null) {
					Object[] jsonParserFieldValues =
						(Object[])jsonParserFieldValue;

					ArquivosEntity[] documentacaoComprobatoriaArray =
						new ArquivosEntity[jsonParserFieldValues.length];

					for (int i = 0; i < documentacaoComprobatoriaArray.length;
						 i++) {

						documentacaoComprobatoriaArray[i] =
							ArquivosEntitySerDes.toDTO(
								(String)jsonParserFieldValues[i]);
					}

					fundamentacaoPedido.setDocumentacaoComprobatoria(
						documentacaoComprobatoriaArray);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "fundamentacao")) {
				if (jsonParserFieldValue != null) {
					fundamentacaoPedido.setFundamentacao(
						(String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(
						jsonParserFieldName, "identificacaoDebitos")) {

				if (jsonParserFieldValue != null) {
					Object[] jsonParserFieldValues =
						(Object[])jsonParserFieldValue;

					IdentificacaoDebitosEntity[] identificacaoDebitosArray =
						new IdentificacaoDebitosEntity
							[jsonParserFieldValues.length];

					for (int i = 0; i < identificacaoDebitosArray.length; i++) {
						identificacaoDebitosArray[i] =
							IdentificacaoDebitosEntitySerDes.toDTO(
								(String)jsonParserFieldValues[i]);
					}

					fundamentacaoPedido.setIdentificacaoDebitos(
						identificacaoDebitosArray);
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
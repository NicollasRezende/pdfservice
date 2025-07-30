package br.com.seatecnologia.gdf.negocia.headless.client.serdes.v1_0;

import br.com.seatecnologia.gdf.negocia.headless.client.dto.v1_0.QualificacaoCompletaEntity;
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
public class QualificacaoCompletaEntitySerDes {

	public static QualificacaoCompletaEntity toDTO(String json) {
		QualificacaoCompletaEntityJSONParser
			qualificacaoCompletaEntityJSONParser =
				new QualificacaoCompletaEntityJSONParser();

		return qualificacaoCompletaEntityJSONParser.parseToDTO(json);
	}

	public static QualificacaoCompletaEntity[] toDTOs(String json) {
		QualificacaoCompletaEntityJSONParser
			qualificacaoCompletaEntityJSONParser =
				new QualificacaoCompletaEntityJSONParser();

		return qualificacaoCompletaEntityJSONParser.parseToDTOs(json);
	}

	public static String toJSON(
		QualificacaoCompletaEntity qualificacaoCompletaEntity) {

		if (qualificacaoCompletaEntity == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		if (qualificacaoCompletaEntity.getCpfCnpj() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"cpfCnpj\": ");

			sb.append("\"");

			sb.append(_escape(qualificacaoCompletaEntity.getCpfCnpj()));

			sb.append("\"");
		}

		if (qualificacaoCompletaEntity.getDomicilioFiscal() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"domicilioFiscal\": ");

			sb.append("\"");

			sb.append(_escape(qualificacaoCompletaEntity.getDomicilioFiscal()));

			sb.append("\"");
		}

		if (qualificacaoCompletaEntity.getEmail() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"email\": ");

			sb.append("\"");

			sb.append(_escape(qualificacaoCompletaEntity.getEmail()));

			sb.append("\"");
		}

		if (qualificacaoCompletaEntity.getEnderecoPostal() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"enderecoPostal\": ");

			sb.append(
				String.valueOf(qualificacaoCompletaEntity.getEnderecoPostal()));
		}

		if (qualificacaoCompletaEntity.getNomeFantasia() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"nomeFantasia\": ");

			sb.append("\"");

			sb.append(_escape(qualificacaoCompletaEntity.getNomeFantasia()));

			sb.append("\"");
		}

		if (qualificacaoCompletaEntity.getNomeRazaoSocial() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"nomeRazaoSocial\": ");

			sb.append("\"");

			sb.append(_escape(qualificacaoCompletaEntity.getNomeRazaoSocial()));

			sb.append("\"");
		}

		if (qualificacaoCompletaEntity.getNumeroCfdf() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"numeroCfdf\": ");

			sb.append("\"");

			sb.append(_escape(qualificacaoCompletaEntity.getNumeroCfdf()));

			sb.append("\"");
		}

		if (qualificacaoCompletaEntity.getQualificacaoId() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"qualificacaoId\": ");

			sb.append(qualificacaoCompletaEntity.getQualificacaoId());
		}

		if (qualificacaoCompletaEntity.getRepresentanteLegal() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"representanteLegal\": ");

			sb.append("\"");

			sb.append(
				_escape(qualificacaoCompletaEntity.getRepresentanteLegal()));

			sb.append("\"");
		}

		if (qualificacaoCompletaEntity.getTelefone() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"telefone\": ");

			sb.append("\"");

			sb.append(_escape(qualificacaoCompletaEntity.getTelefone()));

			sb.append("\"");
		}

		if (qualificacaoCompletaEntity.getTipoPessoa() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"tipoPessoa\": ");

			sb.append("\"");

			sb.append(_escape(qualificacaoCompletaEntity.getTipoPessoa()));

			sb.append("\"");
		}

		if (qualificacaoCompletaEntity.getWhatsapp() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"whatsapp\": ");

			sb.append("\"");

			sb.append(_escape(qualificacaoCompletaEntity.getWhatsapp()));

			sb.append("\"");
		}

		sb.append("}");

		return sb.toString();
	}

	public static Map<String, Object> toMap(String json) {
		QualificacaoCompletaEntityJSONParser
			qualificacaoCompletaEntityJSONParser =
				new QualificacaoCompletaEntityJSONParser();

		return qualificacaoCompletaEntityJSONParser.parseToMap(json);
	}

	public static Map<String, String> toMap(
		QualificacaoCompletaEntity qualificacaoCompletaEntity) {

		if (qualificacaoCompletaEntity == null) {
			return null;
		}

		Map<String, String> map = new TreeMap<>();

		if (qualificacaoCompletaEntity.getCpfCnpj() == null) {
			map.put("cpfCnpj", null);
		}
		else {
			map.put(
				"cpfCnpj",
				String.valueOf(qualificacaoCompletaEntity.getCpfCnpj()));
		}

		if (qualificacaoCompletaEntity.getDomicilioFiscal() == null) {
			map.put("domicilioFiscal", null);
		}
		else {
			map.put(
				"domicilioFiscal",
				String.valueOf(
					qualificacaoCompletaEntity.getDomicilioFiscal()));
		}

		if (qualificacaoCompletaEntity.getEmail() == null) {
			map.put("email", null);
		}
		else {
			map.put(
				"email", String.valueOf(qualificacaoCompletaEntity.getEmail()));
		}

		if (qualificacaoCompletaEntity.getEnderecoPostal() == null) {
			map.put("enderecoPostal", null);
		}
		else {
			map.put(
				"enderecoPostal",
				String.valueOf(qualificacaoCompletaEntity.getEnderecoPostal()));
		}

		if (qualificacaoCompletaEntity.getNomeFantasia() == null) {
			map.put("nomeFantasia", null);
		}
		else {
			map.put(
				"nomeFantasia",
				String.valueOf(qualificacaoCompletaEntity.getNomeFantasia()));
		}

		if (qualificacaoCompletaEntity.getNomeRazaoSocial() == null) {
			map.put("nomeRazaoSocial", null);
		}
		else {
			map.put(
				"nomeRazaoSocial",
				String.valueOf(
					qualificacaoCompletaEntity.getNomeRazaoSocial()));
		}

		if (qualificacaoCompletaEntity.getNumeroCfdf() == null) {
			map.put("numeroCfdf", null);
		}
		else {
			map.put(
				"numeroCfdf",
				String.valueOf(qualificacaoCompletaEntity.getNumeroCfdf()));
		}

		if (qualificacaoCompletaEntity.getQualificacaoId() == null) {
			map.put("qualificacaoId", null);
		}
		else {
			map.put(
				"qualificacaoId",
				String.valueOf(qualificacaoCompletaEntity.getQualificacaoId()));
		}

		if (qualificacaoCompletaEntity.getRepresentanteLegal() == null) {
			map.put("representanteLegal", null);
		}
		else {
			map.put(
				"representanteLegal",
				String.valueOf(
					qualificacaoCompletaEntity.getRepresentanteLegal()));
		}

		if (qualificacaoCompletaEntity.getTelefone() == null) {
			map.put("telefone", null);
		}
		else {
			map.put(
				"telefone",
				String.valueOf(qualificacaoCompletaEntity.getTelefone()));
		}

		if (qualificacaoCompletaEntity.getTipoPessoa() == null) {
			map.put("tipoPessoa", null);
		}
		else {
			map.put(
				"tipoPessoa",
				String.valueOf(qualificacaoCompletaEntity.getTipoPessoa()));
		}

		if (qualificacaoCompletaEntity.getWhatsapp() == null) {
			map.put("whatsapp", null);
		}
		else {
			map.put(
				"whatsapp",
				String.valueOf(qualificacaoCompletaEntity.getWhatsapp()));
		}

		return map;
	}

	public static class QualificacaoCompletaEntityJSONParser
		extends BaseJSONParser<QualificacaoCompletaEntity> {

		@Override
		protected QualificacaoCompletaEntity createDTO() {
			return new QualificacaoCompletaEntity();
		}

		@Override
		protected QualificacaoCompletaEntity[] createDTOArray(int size) {
			return new QualificacaoCompletaEntity[size];
		}

		@Override
		protected boolean parseMaps(String jsonParserFieldName) {
			if (Objects.equals(jsonParserFieldName, "cpfCnpj")) {
				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "domicilioFiscal")) {
				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "email")) {
				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "enderecoPostal")) {
				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "nomeFantasia")) {
				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "nomeRazaoSocial")) {
				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "numeroCfdf")) {
				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "qualificacaoId")) {
				return false;
			}
			else if (Objects.equals(
						jsonParserFieldName, "representanteLegal")) {

				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "telefone")) {
				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "tipoPessoa")) {
				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "whatsapp")) {
				return false;
			}

			return false;
		}

		@Override
		protected void setField(
			QualificacaoCompletaEntity qualificacaoCompletaEntity,
			String jsonParserFieldName, Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "cpfCnpj")) {
				if (jsonParserFieldValue != null) {
					qualificacaoCompletaEntity.setCpfCnpj(
						(String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "domicilioFiscal")) {
				if (jsonParserFieldValue != null) {
					qualificacaoCompletaEntity.setDomicilioFiscal(
						(String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "email")) {
				if (jsonParserFieldValue != null) {
					qualificacaoCompletaEntity.setEmail(
						(String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "enderecoPostal")) {
				if (jsonParserFieldValue != null) {
					qualificacaoCompletaEntity.setEnderecoPostal(
						EnderecoEntitySerDes.toDTO(
							(String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "nomeFantasia")) {
				if (jsonParserFieldValue != null) {
					qualificacaoCompletaEntity.setNomeFantasia(
						(String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "nomeRazaoSocial")) {
				if (jsonParserFieldValue != null) {
					qualificacaoCompletaEntity.setNomeRazaoSocial(
						(String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "numeroCfdf")) {
				if (jsonParserFieldValue != null) {
					qualificacaoCompletaEntity.setNumeroCfdf(
						(String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "qualificacaoId")) {
				if (jsonParserFieldValue != null) {
					qualificacaoCompletaEntity.setQualificacaoId(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(
						jsonParserFieldName, "representanteLegal")) {

				if (jsonParserFieldValue != null) {
					qualificacaoCompletaEntity.setRepresentanteLegal(
						(String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "telefone")) {
				if (jsonParserFieldValue != null) {
					qualificacaoCompletaEntity.setTelefone(
						(String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "tipoPessoa")) {
				if (jsonParserFieldValue != null) {
					qualificacaoCompletaEntity.setTipoPessoa(
						(String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "whatsapp")) {
				if (jsonParserFieldValue != null) {
					qualificacaoCompletaEntity.setWhatsapp(
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
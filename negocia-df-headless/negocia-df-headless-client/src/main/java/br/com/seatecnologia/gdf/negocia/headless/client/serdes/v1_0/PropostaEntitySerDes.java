package br.com.seatecnologia.gdf.negocia.headless.client.serdes.v1_0;

import br.com.seatecnologia.gdf.negocia.headless.client.dto.v1_0.AcoesJudiciaisEntity;
import br.com.seatecnologia.gdf.negocia.headless.client.dto.v1_0.PropostaEntity;
import br.com.seatecnologia.gdf.negocia.headless.client.dto.v1_0.RelacaoCredoresEntity;
import br.com.seatecnologia.gdf.negocia.headless.client.json.BaseJSONParser;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

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
public class PropostaEntitySerDes {

	public static PropostaEntity toDTO(String json) {
		PropostaEntityJSONParser propostaEntityJSONParser =
			new PropostaEntityJSONParser();

		return propostaEntityJSONParser.parseToDTO(json);
	}

	public static PropostaEntity[] toDTOs(String json) {
		PropostaEntityJSONParser propostaEntityJSONParser =
			new PropostaEntityJSONParser();

		return propostaEntityJSONParser.parseToDTOs(json);
	}

	public static String toJSON(PropostaEntity propostaEntity) {
		if (propostaEntity == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		DateFormat liferayToJSONDateFormat = new SimpleDateFormat(
			"yyyy-MM-dd'T'HH:mm:ssXX");

		if (propostaEntity.getAcoesJudiciaisEntities() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"acoesJudiciaisEntities\": ");

			sb.append("[");

			for (int i = 0;
				 i < propostaEntity.getAcoesJudiciaisEntities().length; i++) {

				sb.append(
					String.valueOf(
						propostaEntity.getAcoesJudiciaisEntities()[i]));

				if ((i + 1) <
						propostaEntity.getAcoesJudiciaisEntities().length) {

					sb.append(", ");
				}
			}

			sb.append("]");
		}

		if (propostaEntity.getAdministradorJudicial() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"administradorJudicial\": ");

			sb.append(
				String.valueOf(propostaEntity.getAdministradorJudicial()));
		}

		if (propostaEntity.getAdvogado() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"advogado\": ");

			sb.append(String.valueOf(propostaEntity.getAdvogado()));
		}

		if (propostaEntity.getBensDireitosRequerenteEntities() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"bensDireitosRequerenteEntities\": ");

			sb.append(
				String.valueOf(
					propostaEntity.getBensDireitosRequerenteEntities()));
		}

		if (propostaEntity.getCreateDate() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"createDate\": ");

			sb.append("\"");

			sb.append(
				liferayToJSONDateFormat.format(propostaEntity.getCreateDate()));

			sb.append("\"");
		}

		if (propostaEntity.getCreateUser() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"createUser\": ");

			sb.append("\"");

			sb.append(_escape(propostaEntity.getCreateUser()));

			sb.append("\"");
		}

		if (propostaEntity.getDadosContribuinte() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"dadosContribuinte\": ");

			sb.append(String.valueOf(propostaEntity.getDadosContribuinte()));
		}

		if (propostaEntity.getDeclaracao() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"declaracao\": ");

			sb.append(String.valueOf(propostaEntity.getDeclaracao()));
		}

		if (propostaEntity.getDemonstracoesContabeisEntities() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"demonstracoesContabeisEntities\": ");

			sb.append(
				String.valueOf(
					propostaEntity.getDemonstracoesContabeisEntities()));
		}

		if (propostaEntity.getEditalId() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"editalId\": ");

			sb.append(propostaEntity.getEditalId());
		}

		if (propostaEntity.getFundamentacaoPedido() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"fundamentacaoPedido\": ");

			sb.append(String.valueOf(propostaEntity.getFundamentacaoPedido()));
		}

		if (propostaEntity.getGarantiaEntity() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"garantiaEntity\": ");

			sb.append(String.valueOf(propostaEntity.getGarantiaEntity()));
		}

		if (propostaEntity.getModifiedDate() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"modifiedDate\": ");

			sb.append("\"");

			sb.append(
				liferayToJSONDateFormat.format(
					propostaEntity.getModifiedDate()));

			sb.append("\"");
		}

		if (propostaEntity.getNumeroProtocoloSEI() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"numeroProtocoloSEI\": ");

			sb.append("\"");

			sb.append(_escape(propostaEntity.getNumeroProtocoloSEI()));

			sb.append("\"");
		}

		if (propostaEntity.getProcuracao() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"procuracao\": ");

			sb.append(String.valueOf(propostaEntity.getProcuracao()));
		}

		if (propostaEntity.getPropostaId() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"propostaId\": ");

			sb.append(propostaEntity.getPropostaId());
		}

		if (propostaEntity.getPropostaPaiId() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"propostaPaiId\": ");

			sb.append(propostaEntity.getPropostaPaiId());
		}

		if (propostaEntity.getProtocolo() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"protocolo\": ");

			sb.append("\"");

			sb.append(_escape(propostaEntity.getProtocolo()));

			sb.append("\"");
		}

		if (propostaEntity.getRelacaoCredoresEntities() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"relacaoCredoresEntities\": ");

			sb.append("[");

			for (int i = 0;
				 i < propostaEntity.getRelacaoCredoresEntities().length; i++) {

				sb.append(
					String.valueOf(
						propostaEntity.getRelacaoCredoresEntities()[i]));

				if ((i + 1) <
						propostaEntity.getRelacaoCredoresEntities().length) {

					sb.append(", ");
				}
			}

			sb.append("]");
		}

		if (propostaEntity.getStatus() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"status\": ");

			sb.append("\"");

			sb.append(_escape(propostaEntity.getStatus()));

			sb.append("\"");
		}

		if (propostaEntity.getTipoProposta() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"tipoProposta\": ");

			sb.append("\"");

			sb.append(_escape(propostaEntity.getTipoProposta()));

			sb.append("\"");
		}

		if (propostaEntity.getZipUrl() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"zipUrl\": ");

			sb.append("\"");

			sb.append(_escape(propostaEntity.getZipUrl()));

			sb.append("\"");
		}

		sb.append("}");

		return sb.toString();
	}

	public static Map<String, Object> toMap(String json) {
		PropostaEntityJSONParser propostaEntityJSONParser =
			new PropostaEntityJSONParser();

		return propostaEntityJSONParser.parseToMap(json);
	}

	public static Map<String, String> toMap(PropostaEntity propostaEntity) {
		if (propostaEntity == null) {
			return null;
		}

		Map<String, String> map = new TreeMap<>();

		DateFormat liferayToJSONDateFormat = new SimpleDateFormat(
			"yyyy-MM-dd'T'HH:mm:ssXX");

		if (propostaEntity.getAcoesJudiciaisEntities() == null) {
			map.put("acoesJudiciaisEntities", null);
		}
		else {
			map.put(
				"acoesJudiciaisEntities",
				String.valueOf(propostaEntity.getAcoesJudiciaisEntities()));
		}

		if (propostaEntity.getAdministradorJudicial() == null) {
			map.put("administradorJudicial", null);
		}
		else {
			map.put(
				"administradorJudicial",
				String.valueOf(propostaEntity.getAdministradorJudicial()));
		}

		if (propostaEntity.getAdvogado() == null) {
			map.put("advogado", null);
		}
		else {
			map.put("advogado", String.valueOf(propostaEntity.getAdvogado()));
		}

		if (propostaEntity.getBensDireitosRequerenteEntities() == null) {
			map.put("bensDireitosRequerenteEntities", null);
		}
		else {
			map.put(
				"bensDireitosRequerenteEntities",
				String.valueOf(
					propostaEntity.getBensDireitosRequerenteEntities()));
		}

		if (propostaEntity.getCreateDate() == null) {
			map.put("createDate", null);
		}
		else {
			map.put(
				"createDate",
				liferayToJSONDateFormat.format(propostaEntity.getCreateDate()));
		}

		if (propostaEntity.getCreateUser() == null) {
			map.put("createUser", null);
		}
		else {
			map.put(
				"createUser", String.valueOf(propostaEntity.getCreateUser()));
		}

		if (propostaEntity.getDadosContribuinte() == null) {
			map.put("dadosContribuinte", null);
		}
		else {
			map.put(
				"dadosContribuinte",
				String.valueOf(propostaEntity.getDadosContribuinte()));
		}

		if (propostaEntity.getDeclaracao() == null) {
			map.put("declaracao", null);
		}
		else {
			map.put(
				"declaracao", String.valueOf(propostaEntity.getDeclaracao()));
		}

		if (propostaEntity.getDemonstracoesContabeisEntities() == null) {
			map.put("demonstracoesContabeisEntities", null);
		}
		else {
			map.put(
				"demonstracoesContabeisEntities",
				String.valueOf(
					propostaEntity.getDemonstracoesContabeisEntities()));
		}

		if (propostaEntity.getEditalId() == null) {
			map.put("editalId", null);
		}
		else {
			map.put("editalId", String.valueOf(propostaEntity.getEditalId()));
		}

		if (propostaEntity.getFundamentacaoPedido() == null) {
			map.put("fundamentacaoPedido", null);
		}
		else {
			map.put(
				"fundamentacaoPedido",
				String.valueOf(propostaEntity.getFundamentacaoPedido()));
		}

		if (propostaEntity.getGarantiaEntity() == null) {
			map.put("garantiaEntity", null);
		}
		else {
			map.put(
				"garantiaEntity",
				String.valueOf(propostaEntity.getGarantiaEntity()));
		}

		if (propostaEntity.getModifiedDate() == null) {
			map.put("modifiedDate", null);
		}
		else {
			map.put(
				"modifiedDate",
				liferayToJSONDateFormat.format(
					propostaEntity.getModifiedDate()));
		}

		if (propostaEntity.getNumeroProtocoloSEI() == null) {
			map.put("numeroProtocoloSEI", null);
		}
		else {
			map.put(
				"numeroProtocoloSEI",
				String.valueOf(propostaEntity.getNumeroProtocoloSEI()));
		}

		if (propostaEntity.getProcuracao() == null) {
			map.put("procuracao", null);
		}
		else {
			map.put(
				"procuracao", String.valueOf(propostaEntity.getProcuracao()));
		}

		if (propostaEntity.getPropostaId() == null) {
			map.put("propostaId", null);
		}
		else {
			map.put(
				"propostaId", String.valueOf(propostaEntity.getPropostaId()));
		}

		if (propostaEntity.getPropostaPaiId() == null) {
			map.put("propostaPaiId", null);
		}
		else {
			map.put(
				"propostaPaiId",
				String.valueOf(propostaEntity.getPropostaPaiId()));
		}

		if (propostaEntity.getProtocolo() == null) {
			map.put("protocolo", null);
		}
		else {
			map.put("protocolo", String.valueOf(propostaEntity.getProtocolo()));
		}

		if (propostaEntity.getRelacaoCredoresEntities() == null) {
			map.put("relacaoCredoresEntities", null);
		}
		else {
			map.put(
				"relacaoCredoresEntities",
				String.valueOf(propostaEntity.getRelacaoCredoresEntities()));
		}

		if (propostaEntity.getStatus() == null) {
			map.put("status", null);
		}
		else {
			map.put("status", String.valueOf(propostaEntity.getStatus()));
		}

		if (propostaEntity.getTipoProposta() == null) {
			map.put("tipoProposta", null);
		}
		else {
			map.put(
				"tipoProposta",
				String.valueOf(propostaEntity.getTipoProposta()));
		}

		if (propostaEntity.getZipUrl() == null) {
			map.put("zipUrl", null);
		}
		else {
			map.put("zipUrl", String.valueOf(propostaEntity.getZipUrl()));
		}

		return map;
	}

	public static class PropostaEntityJSONParser
		extends BaseJSONParser<PropostaEntity> {

		@Override
		protected PropostaEntity createDTO() {
			return new PropostaEntity();
		}

		@Override
		protected PropostaEntity[] createDTOArray(int size) {
			return new PropostaEntity[size];
		}

		@Override
		protected boolean parseMaps(String jsonParserFieldName) {
			if (Objects.equals(jsonParserFieldName, "acoesJudiciaisEntities")) {
				return false;
			}
			else if (Objects.equals(
						jsonParserFieldName, "administradorJudicial")) {

				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "advogado")) {
				return false;
			}
			else if (Objects.equals(
						jsonParserFieldName,
						"bensDireitosRequerenteEntities")) {

				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "createDate")) {
				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "createUser")) {
				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "dadosContribuinte")) {
				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "declaracao")) {
				return false;
			}
			else if (Objects.equals(
						jsonParserFieldName,
						"demonstracoesContabeisEntities")) {

				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "editalId")) {
				return false;
			}
			else if (Objects.equals(
						jsonParserFieldName, "fundamentacaoPedido")) {

				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "garantiaEntity")) {
				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "modifiedDate")) {
				return false;
			}
			else if (Objects.equals(
						jsonParserFieldName, "numeroProtocoloSEI")) {

				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "procuracao")) {
				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "propostaId")) {
				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "propostaPaiId")) {
				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "protocolo")) {
				return false;
			}
			else if (Objects.equals(
						jsonParserFieldName, "relacaoCredoresEntities")) {

				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "status")) {
				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "tipoProposta")) {
				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "zipUrl")) {
				return false;
			}

			return false;
		}

		@Override
		protected void setField(
			PropostaEntity propostaEntity, String jsonParserFieldName,
			Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "acoesJudiciaisEntities")) {
				if (jsonParserFieldValue != null) {
					Object[] jsonParserFieldValues =
						(Object[])jsonParserFieldValue;

					AcoesJudiciaisEntity[] acoesJudiciaisEntitiesArray =
						new AcoesJudiciaisEntity[jsonParserFieldValues.length];

					for (int i = 0; i < acoesJudiciaisEntitiesArray.length;
						 i++) {

						acoesJudiciaisEntitiesArray[i] =
							AcoesJudiciaisEntitySerDes.toDTO(
								(String)jsonParserFieldValues[i]);
					}

					propostaEntity.setAcoesJudiciaisEntities(
						acoesJudiciaisEntitiesArray);
				}
			}
			else if (Objects.equals(
						jsonParserFieldName, "administradorJudicial")) {

				if (jsonParserFieldValue != null) {
					propostaEntity.setAdministradorJudicial(
						AdministradorJudicialEntitySerDes.toDTO(
							(String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "advogado")) {
				if (jsonParserFieldValue != null) {
					propostaEntity.setAdvogado(
						AdvogadoEntitySerDes.toDTO(
							(String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(
						jsonParserFieldName,
						"bensDireitosRequerenteEntities")) {

				if (jsonParserFieldValue != null) {
					propostaEntity.setBensDireitosRequerenteEntities(
						BensDireitosRequerenteEntitySerDes.toDTO(
							(String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "createDate")) {
				if (jsonParserFieldValue != null) {
					propostaEntity.setCreateDate(
						toDate((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "createUser")) {
				if (jsonParserFieldValue != null) {
					propostaEntity.setCreateUser((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "dadosContribuinte")) {
				if (jsonParserFieldValue != null) {
					propostaEntity.setDadosContribuinte(
						DadosContribuinteEntitySerDes.toDTO(
							(String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "declaracao")) {
				if (jsonParserFieldValue != null) {
					propostaEntity.setDeclaracao(
						DeclaracaoSerDes.toDTO((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(
						jsonParserFieldName,
						"demonstracoesContabeisEntities")) {

				if (jsonParserFieldValue != null) {
					propostaEntity.setDemonstracoesContabeisEntities(
						DemonstracoesContabeisEntitiesSerDes.toDTO(
							(String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "editalId")) {
				if (jsonParserFieldValue != null) {
					propostaEntity.setEditalId(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(
						jsonParserFieldName, "fundamentacaoPedido")) {

				if (jsonParserFieldValue != null) {
					propostaEntity.setFundamentacaoPedido(
						FundamentacaoPedidoSerDes.toDTO(
							(String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "garantiaEntity")) {
				if (jsonParserFieldValue != null) {
					propostaEntity.setGarantiaEntity(
						GarantiaEntitySerDes.toDTO(
							(String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "modifiedDate")) {
				if (jsonParserFieldValue != null) {
					propostaEntity.setModifiedDate(
						toDate((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(
						jsonParserFieldName, "numeroProtocoloSEI")) {

				if (jsonParserFieldValue != null) {
					propostaEntity.setNumeroProtocoloSEI(
						(String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "procuracao")) {
				if (jsonParserFieldValue != null) {
					propostaEntity.setProcuracao(
						ArquivosEntitySerDes.toDTO(
							(String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "propostaId")) {
				if (jsonParserFieldValue != null) {
					propostaEntity.setPropostaId(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "propostaPaiId")) {
				if (jsonParserFieldValue != null) {
					propostaEntity.setPropostaPaiId(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "protocolo")) {
				if (jsonParserFieldValue != null) {
					propostaEntity.setProtocolo((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(
						jsonParserFieldName, "relacaoCredoresEntities")) {

				if (jsonParserFieldValue != null) {
					Object[] jsonParserFieldValues =
						(Object[])jsonParserFieldValue;

					RelacaoCredoresEntity[] relacaoCredoresEntitiesArray =
						new RelacaoCredoresEntity[jsonParserFieldValues.length];

					for (int i = 0; i < relacaoCredoresEntitiesArray.length;
						 i++) {

						relacaoCredoresEntitiesArray[i] =
							RelacaoCredoresEntitySerDes.toDTO(
								(String)jsonParserFieldValues[i]);
					}

					propostaEntity.setRelacaoCredoresEntities(
						relacaoCredoresEntitiesArray);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "status")) {
				if (jsonParserFieldValue != null) {
					propostaEntity.setStatus((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "tipoProposta")) {
				if (jsonParserFieldValue != null) {
					propostaEntity.setTipoProposta(
						(String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "zipUrl")) {
				if (jsonParserFieldValue != null) {
					propostaEntity.setZipUrl((String)jsonParserFieldValue);
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
package br.com.seatecnologia.gdf.negocia.headless.client.serdes.v1_0;

import br.com.seatecnologia.gdf.negocia.headless.client.dto.v1_0.Declaracao;
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
public class DeclaracaoSerDes {

	public static Declaracao toDTO(String json) {
		DeclaracaoJSONParser declaracaoJSONParser = new DeclaracaoJSONParser();

		return declaracaoJSONParser.parseToDTO(json);
	}

	public static Declaracao[] toDTOs(String json) {
		DeclaracaoJSONParser declaracaoJSONParser = new DeclaracaoJSONParser();

		return declaracaoJSONParser.parseToDTOs(json);
	}

	public static String toJSON(Declaracao declaracao) {
		if (declaracao == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		if (declaracao.getAbusoTransacao() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"abusoTransacao\": ");

			sb.append(declaracao.getAbusoTransacao());
		}

		if (declaracao.getCienciaProcesso() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"cienciaProcesso\": ");

			sb.append(declaracao.getCienciaProcesso());
		}

		if (declaracao.getCompromissoConfidencialidade() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"compromissoConfidencialidade\": ");

			sb.append(declaracao.getCompromissoConfidencialidade());
		}

		if (declaracao.getCumpreCompromissos() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"cumpreCompromissos\": ");

			sb.append(declaracao.getCumpreCompromissos());
		}

		if (declaracao.getImpugnacaoRecursos() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"impugnacaoRecursos\": ");

			sb.append(declaracao.getImpugnacaoRecursos());
		}

		if (declaracao.getManutencaoGarantias() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"manutencaoGarantias\": ");

			sb.append(declaracao.getManutencaoGarantias());
		}

		if (declaracao.getNaoAlienacaoBensSemComunicacao() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"naoAlienacaoBensSemComunicacao\": ");

			sb.append(declaracao.getNaoAlienacaoBensSemComunicacao());
		}

		if (declaracao.getOmissaoInformacoes() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"omissaoInformacoes\": ");

			sb.append(declaracao.getOmissaoInformacoes());
		}

		if (declaracao.getPeticionamentoProcessos() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"peticionamentoProcessos\": ");

			sb.append(declaracao.getPeticionamentoProcessos());
		}

		if (declaracao.getPrestacaoInformacoes() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"prestacaoInformacoes\": ");

			sb.append(declaracao.getPrestacaoInformacoes());
		}

		if (declaracao.getProibicaoInterposicao() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"proibicaoInterposicao\": ");

			sb.append(declaracao.getProibicaoInterposicao());
		}

		if (declaracao.getReconheceGrupoOuSucessao() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"reconheceGrupoOuSucessao\": ");

			sb.append(declaracao.getReconheceGrupoOuSucessao());
		}

		if (declaracao.getRenunciaRecursos() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"renunciaRecursos\": ");

			sb.append(declaracao.getRenunciaRecursos());
		}

		sb.append("}");

		return sb.toString();
	}

	public static Map<String, Object> toMap(String json) {
		DeclaracaoJSONParser declaracaoJSONParser = new DeclaracaoJSONParser();

		return declaracaoJSONParser.parseToMap(json);
	}

	public static Map<String, String> toMap(Declaracao declaracao) {
		if (declaracao == null) {
			return null;
		}

		Map<String, String> map = new TreeMap<>();

		if (declaracao.getAbusoTransacao() == null) {
			map.put("abusoTransacao", null);
		}
		else {
			map.put(
				"abusoTransacao",
				String.valueOf(declaracao.getAbusoTransacao()));
		}

		if (declaracao.getCienciaProcesso() == null) {
			map.put("cienciaProcesso", null);
		}
		else {
			map.put(
				"cienciaProcesso",
				String.valueOf(declaracao.getCienciaProcesso()));
		}

		if (declaracao.getCompromissoConfidencialidade() == null) {
			map.put("compromissoConfidencialidade", null);
		}
		else {
			map.put(
				"compromissoConfidencialidade",
				String.valueOf(declaracao.getCompromissoConfidencialidade()));
		}

		if (declaracao.getCumpreCompromissos() == null) {
			map.put("cumpreCompromissos", null);
		}
		else {
			map.put(
				"cumpreCompromissos",
				String.valueOf(declaracao.getCumpreCompromissos()));
		}

		if (declaracao.getImpugnacaoRecursos() == null) {
			map.put("impugnacaoRecursos", null);
		}
		else {
			map.put(
				"impugnacaoRecursos",
				String.valueOf(declaracao.getImpugnacaoRecursos()));
		}

		if (declaracao.getManutencaoGarantias() == null) {
			map.put("manutencaoGarantias", null);
		}
		else {
			map.put(
				"manutencaoGarantias",
				String.valueOf(declaracao.getManutencaoGarantias()));
		}

		if (declaracao.getNaoAlienacaoBensSemComunicacao() == null) {
			map.put("naoAlienacaoBensSemComunicacao", null);
		}
		else {
			map.put(
				"naoAlienacaoBensSemComunicacao",
				String.valueOf(declaracao.getNaoAlienacaoBensSemComunicacao()));
		}

		if (declaracao.getOmissaoInformacoes() == null) {
			map.put("omissaoInformacoes", null);
		}
		else {
			map.put(
				"omissaoInformacoes",
				String.valueOf(declaracao.getOmissaoInformacoes()));
		}

		if (declaracao.getPeticionamentoProcessos() == null) {
			map.put("peticionamentoProcessos", null);
		}
		else {
			map.put(
				"peticionamentoProcessos",
				String.valueOf(declaracao.getPeticionamentoProcessos()));
		}

		if (declaracao.getPrestacaoInformacoes() == null) {
			map.put("prestacaoInformacoes", null);
		}
		else {
			map.put(
				"prestacaoInformacoes",
				String.valueOf(declaracao.getPrestacaoInformacoes()));
		}

		if (declaracao.getProibicaoInterposicao() == null) {
			map.put("proibicaoInterposicao", null);
		}
		else {
			map.put(
				"proibicaoInterposicao",
				String.valueOf(declaracao.getProibicaoInterposicao()));
		}

		if (declaracao.getReconheceGrupoOuSucessao() == null) {
			map.put("reconheceGrupoOuSucessao", null);
		}
		else {
			map.put(
				"reconheceGrupoOuSucessao",
				String.valueOf(declaracao.getReconheceGrupoOuSucessao()));
		}

		if (declaracao.getRenunciaRecursos() == null) {
			map.put("renunciaRecursos", null);
		}
		else {
			map.put(
				"renunciaRecursos",
				String.valueOf(declaracao.getRenunciaRecursos()));
		}

		return map;
	}

	public static class DeclaracaoJSONParser
		extends BaseJSONParser<Declaracao> {

		@Override
		protected Declaracao createDTO() {
			return new Declaracao();
		}

		@Override
		protected Declaracao[] createDTOArray(int size) {
			return new Declaracao[size];
		}

		@Override
		protected boolean parseMaps(String jsonParserFieldName) {
			if (Objects.equals(jsonParserFieldName, "abusoTransacao")) {
				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "cienciaProcesso")) {
				return false;
			}
			else if (Objects.equals(
						jsonParserFieldName, "compromissoConfidencialidade")) {

				return false;
			}
			else if (Objects.equals(
						jsonParserFieldName, "cumpreCompromissos")) {

				return false;
			}
			else if (Objects.equals(
						jsonParserFieldName, "impugnacaoRecursos")) {

				return false;
			}
			else if (Objects.equals(
						jsonParserFieldName, "manutencaoGarantias")) {

				return false;
			}
			else if (Objects.equals(
						jsonParserFieldName,
						"naoAlienacaoBensSemComunicacao")) {

				return false;
			}
			else if (Objects.equals(
						jsonParserFieldName, "omissaoInformacoes")) {

				return false;
			}
			else if (Objects.equals(
						jsonParserFieldName, "peticionamentoProcessos")) {

				return false;
			}
			else if (Objects.equals(
						jsonParserFieldName, "prestacaoInformacoes")) {

				return false;
			}
			else if (Objects.equals(
						jsonParserFieldName, "proibicaoInterposicao")) {

				return false;
			}
			else if (Objects.equals(
						jsonParserFieldName, "reconheceGrupoOuSucessao")) {

				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "renunciaRecursos")) {
				return false;
			}

			return false;
		}

		@Override
		protected void setField(
			Declaracao declaracao, String jsonParserFieldName,
			Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "abusoTransacao")) {
				if (jsonParserFieldValue != null) {
					declaracao.setAbusoTransacao((Boolean)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "cienciaProcesso")) {
				if (jsonParserFieldValue != null) {
					declaracao.setCienciaProcesso(
						(Boolean)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(
						jsonParserFieldName, "compromissoConfidencialidade")) {

				if (jsonParserFieldValue != null) {
					declaracao.setCompromissoConfidencialidade(
						(Boolean)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(
						jsonParserFieldName, "cumpreCompromissos")) {

				if (jsonParserFieldValue != null) {
					declaracao.setCumpreCompromissos(
						(Boolean)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(
						jsonParserFieldName, "impugnacaoRecursos")) {

				if (jsonParserFieldValue != null) {
					declaracao.setImpugnacaoRecursos(
						(Boolean)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(
						jsonParserFieldName, "manutencaoGarantias")) {

				if (jsonParserFieldValue != null) {
					declaracao.setManutencaoGarantias(
						(Boolean)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(
						jsonParserFieldName,
						"naoAlienacaoBensSemComunicacao")) {

				if (jsonParserFieldValue != null) {
					declaracao.setNaoAlienacaoBensSemComunicacao(
						(Boolean)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(
						jsonParserFieldName, "omissaoInformacoes")) {

				if (jsonParserFieldValue != null) {
					declaracao.setOmissaoInformacoes(
						(Boolean)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(
						jsonParserFieldName, "peticionamentoProcessos")) {

				if (jsonParserFieldValue != null) {
					declaracao.setPeticionamentoProcessos(
						(Boolean)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(
						jsonParserFieldName, "prestacaoInformacoes")) {

				if (jsonParserFieldValue != null) {
					declaracao.setPrestacaoInformacoes(
						(Boolean)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(
						jsonParserFieldName, "proibicaoInterposicao")) {

				if (jsonParserFieldValue != null) {
					declaracao.setProibicaoInterposicao(
						(Boolean)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(
						jsonParserFieldName, "reconheceGrupoOuSucessao")) {

				if (jsonParserFieldValue != null) {
					declaracao.setReconheceGrupoOuSucessao(
						(Boolean)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "renunciaRecursos")) {
				if (jsonParserFieldValue != null) {
					declaracao.setRenunciaRecursos(
						(Boolean)jsonParserFieldValue);
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
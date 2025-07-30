package br.com.seatecnologia.gdf.negocia.headless.dto.v1_0;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import com.liferay.petra.function.UnsafeSupplier;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.vulcan.graphql.annotation.GraphQLField;
import com.liferay.portal.vulcan.graphql.annotation.GraphQLName;
import com.liferay.portal.vulcan.util.ObjectMapperUtil;

import java.io.Serializable;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.function.Supplier;

import javax.annotation.Generated;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author sabrina
 * @generated
 */
@Generated("")
@GraphQLName("Declaracao")
@JsonFilter("Liferay.Vulcan")
@XmlRootElement(name = "Declaracao")
public class Declaracao implements Serializable {

	public static Declaracao toDTO(String json) {
		return ObjectMapperUtil.readValue(Declaracao.class, json);
	}

	public static Declaracao unsafeToDTO(String json) {
		return ObjectMapperUtil.unsafeReadValue(Declaracao.class, json);
	}

	@io.swagger.v3.oas.annotations.media.Schema
	public Boolean getAbusoTransacao() {
		if (_abusoTransacaoSupplier != null) {
			abusoTransacao = _abusoTransacaoSupplier.get();

			_abusoTransacaoSupplier = null;
		}

		return abusoTransacao;
	}

	public void setAbusoTransacao(Boolean abusoTransacao) {
		this.abusoTransacao = abusoTransacao;

		_abusoTransacaoSupplier = null;
	}

	@JsonIgnore
	public void setAbusoTransacao(
		UnsafeSupplier<Boolean, Exception> abusoTransacaoUnsafeSupplier) {

		_abusoTransacaoSupplier = () -> {
			try {
				return abusoTransacaoUnsafeSupplier.get();
			}
			catch (RuntimeException runtimeException) {
				throw runtimeException;
			}
			catch (Exception exception) {
				throw new RuntimeException(exception);
			}
		};
	}

	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Boolean abusoTransacao;

	@JsonIgnore
	private Supplier<Boolean> _abusoTransacaoSupplier;

	@io.swagger.v3.oas.annotations.media.Schema
	public Boolean getCienciaProcesso() {
		if (_cienciaProcessoSupplier != null) {
			cienciaProcesso = _cienciaProcessoSupplier.get();

			_cienciaProcessoSupplier = null;
		}

		return cienciaProcesso;
	}

	public void setCienciaProcesso(Boolean cienciaProcesso) {
		this.cienciaProcesso = cienciaProcesso;

		_cienciaProcessoSupplier = null;
	}

	@JsonIgnore
	public void setCienciaProcesso(
		UnsafeSupplier<Boolean, Exception> cienciaProcessoUnsafeSupplier) {

		_cienciaProcessoSupplier = () -> {
			try {
				return cienciaProcessoUnsafeSupplier.get();
			}
			catch (RuntimeException runtimeException) {
				throw runtimeException;
			}
			catch (Exception exception) {
				throw new RuntimeException(exception);
			}
		};
	}

	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Boolean cienciaProcesso;

	@JsonIgnore
	private Supplier<Boolean> _cienciaProcessoSupplier;

	@io.swagger.v3.oas.annotations.media.Schema
	public Boolean getCompromissoConfidencialidade() {
		if (_compromissoConfidencialidadeSupplier != null) {
			compromissoConfidencialidade =
				_compromissoConfidencialidadeSupplier.get();

			_compromissoConfidencialidadeSupplier = null;
		}

		return compromissoConfidencialidade;
	}

	public void setCompromissoConfidencialidade(
		Boolean compromissoConfidencialidade) {

		this.compromissoConfidencialidade = compromissoConfidencialidade;

		_compromissoConfidencialidadeSupplier = null;
	}

	@JsonIgnore
	public void setCompromissoConfidencialidade(
		UnsafeSupplier<Boolean, Exception>
			compromissoConfidencialidadeUnsafeSupplier) {

		_compromissoConfidencialidadeSupplier = () -> {
			try {
				return compromissoConfidencialidadeUnsafeSupplier.get();
			}
			catch (RuntimeException runtimeException) {
				throw runtimeException;
			}
			catch (Exception exception) {
				throw new RuntimeException(exception);
			}
		};
	}

	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Boolean compromissoConfidencialidade;

	@JsonIgnore
	private Supplier<Boolean> _compromissoConfidencialidadeSupplier;

	@io.swagger.v3.oas.annotations.media.Schema
	public Boolean getCumpreCompromissos() {
		if (_cumpreCompromissosSupplier != null) {
			cumpreCompromissos = _cumpreCompromissosSupplier.get();

			_cumpreCompromissosSupplier = null;
		}

		return cumpreCompromissos;
	}

	public void setCumpreCompromissos(Boolean cumpreCompromissos) {
		this.cumpreCompromissos = cumpreCompromissos;

		_cumpreCompromissosSupplier = null;
	}

	@JsonIgnore
	public void setCumpreCompromissos(
		UnsafeSupplier<Boolean, Exception> cumpreCompromissosUnsafeSupplier) {

		_cumpreCompromissosSupplier = () -> {
			try {
				return cumpreCompromissosUnsafeSupplier.get();
			}
			catch (RuntimeException runtimeException) {
				throw runtimeException;
			}
			catch (Exception exception) {
				throw new RuntimeException(exception);
			}
		};
	}

	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Boolean cumpreCompromissos;

	@JsonIgnore
	private Supplier<Boolean> _cumpreCompromissosSupplier;

	@io.swagger.v3.oas.annotations.media.Schema
	public Boolean getImpugnacaoRecursos() {
		if (_impugnacaoRecursosSupplier != null) {
			impugnacaoRecursos = _impugnacaoRecursosSupplier.get();

			_impugnacaoRecursosSupplier = null;
		}

		return impugnacaoRecursos;
	}

	public void setImpugnacaoRecursos(Boolean impugnacaoRecursos) {
		this.impugnacaoRecursos = impugnacaoRecursos;

		_impugnacaoRecursosSupplier = null;
	}

	@JsonIgnore
	public void setImpugnacaoRecursos(
		UnsafeSupplier<Boolean, Exception> impugnacaoRecursosUnsafeSupplier) {

		_impugnacaoRecursosSupplier = () -> {
			try {
				return impugnacaoRecursosUnsafeSupplier.get();
			}
			catch (RuntimeException runtimeException) {
				throw runtimeException;
			}
			catch (Exception exception) {
				throw new RuntimeException(exception);
			}
		};
	}

	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Boolean impugnacaoRecursos;

	@JsonIgnore
	private Supplier<Boolean> _impugnacaoRecursosSupplier;

	@io.swagger.v3.oas.annotations.media.Schema
	public Boolean getManutencaoGarantias() {
		if (_manutencaoGarantiasSupplier != null) {
			manutencaoGarantias = _manutencaoGarantiasSupplier.get();

			_manutencaoGarantiasSupplier = null;
		}

		return manutencaoGarantias;
	}

	public void setManutencaoGarantias(Boolean manutencaoGarantias) {
		this.manutencaoGarantias = manutencaoGarantias;

		_manutencaoGarantiasSupplier = null;
	}

	@JsonIgnore
	public void setManutencaoGarantias(
		UnsafeSupplier<Boolean, Exception> manutencaoGarantiasUnsafeSupplier) {

		_manutencaoGarantiasSupplier = () -> {
			try {
				return manutencaoGarantiasUnsafeSupplier.get();
			}
			catch (RuntimeException runtimeException) {
				throw runtimeException;
			}
			catch (Exception exception) {
				throw new RuntimeException(exception);
			}
		};
	}

	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Boolean manutencaoGarantias;

	@JsonIgnore
	private Supplier<Boolean> _manutencaoGarantiasSupplier;

	@io.swagger.v3.oas.annotations.media.Schema
	public Boolean getNaoAlienacaoBensSemComunicacao() {
		if (_naoAlienacaoBensSemComunicacaoSupplier != null) {
			naoAlienacaoBensSemComunicacao =
				_naoAlienacaoBensSemComunicacaoSupplier.get();

			_naoAlienacaoBensSemComunicacaoSupplier = null;
		}

		return naoAlienacaoBensSemComunicacao;
	}

	public void setNaoAlienacaoBensSemComunicacao(
		Boolean naoAlienacaoBensSemComunicacao) {

		this.naoAlienacaoBensSemComunicacao = naoAlienacaoBensSemComunicacao;

		_naoAlienacaoBensSemComunicacaoSupplier = null;
	}

	@JsonIgnore
	public void setNaoAlienacaoBensSemComunicacao(
		UnsafeSupplier<Boolean, Exception>
			naoAlienacaoBensSemComunicacaoUnsafeSupplier) {

		_naoAlienacaoBensSemComunicacaoSupplier = () -> {
			try {
				return naoAlienacaoBensSemComunicacaoUnsafeSupplier.get();
			}
			catch (RuntimeException runtimeException) {
				throw runtimeException;
			}
			catch (Exception exception) {
				throw new RuntimeException(exception);
			}
		};
	}

	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Boolean naoAlienacaoBensSemComunicacao;

	@JsonIgnore
	private Supplier<Boolean> _naoAlienacaoBensSemComunicacaoSupplier;

	@io.swagger.v3.oas.annotations.media.Schema
	public Boolean getOmissaoInformacoes() {
		if (_omissaoInformacoesSupplier != null) {
			omissaoInformacoes = _omissaoInformacoesSupplier.get();

			_omissaoInformacoesSupplier = null;
		}

		return omissaoInformacoes;
	}

	public void setOmissaoInformacoes(Boolean omissaoInformacoes) {
		this.omissaoInformacoes = omissaoInformacoes;

		_omissaoInformacoesSupplier = null;
	}

	@JsonIgnore
	public void setOmissaoInformacoes(
		UnsafeSupplier<Boolean, Exception> omissaoInformacoesUnsafeSupplier) {

		_omissaoInformacoesSupplier = () -> {
			try {
				return omissaoInformacoesUnsafeSupplier.get();
			}
			catch (RuntimeException runtimeException) {
				throw runtimeException;
			}
			catch (Exception exception) {
				throw new RuntimeException(exception);
			}
		};
	}

	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Boolean omissaoInformacoes;

	@JsonIgnore
	private Supplier<Boolean> _omissaoInformacoesSupplier;

	@io.swagger.v3.oas.annotations.media.Schema
	public Boolean getPeticionamentoProcessos() {
		if (_peticionamentoProcessosSupplier != null) {
			peticionamentoProcessos = _peticionamentoProcessosSupplier.get();

			_peticionamentoProcessosSupplier = null;
		}

		return peticionamentoProcessos;
	}

	public void setPeticionamentoProcessos(Boolean peticionamentoProcessos) {
		this.peticionamentoProcessos = peticionamentoProcessos;

		_peticionamentoProcessosSupplier = null;
	}

	@JsonIgnore
	public void setPeticionamentoProcessos(
		UnsafeSupplier<Boolean, Exception>
			peticionamentoProcessosUnsafeSupplier) {

		_peticionamentoProcessosSupplier = () -> {
			try {
				return peticionamentoProcessosUnsafeSupplier.get();
			}
			catch (RuntimeException runtimeException) {
				throw runtimeException;
			}
			catch (Exception exception) {
				throw new RuntimeException(exception);
			}
		};
	}

	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Boolean peticionamentoProcessos;

	@JsonIgnore
	private Supplier<Boolean> _peticionamentoProcessosSupplier;

	@io.swagger.v3.oas.annotations.media.Schema
	public Boolean getPrestacaoInformacoes() {
		if (_prestacaoInformacoesSupplier != null) {
			prestacaoInformacoes = _prestacaoInformacoesSupplier.get();

			_prestacaoInformacoesSupplier = null;
		}

		return prestacaoInformacoes;
	}

	public void setPrestacaoInformacoes(Boolean prestacaoInformacoes) {
		this.prestacaoInformacoes = prestacaoInformacoes;

		_prestacaoInformacoesSupplier = null;
	}

	@JsonIgnore
	public void setPrestacaoInformacoes(
		UnsafeSupplier<Boolean, Exception> prestacaoInformacoesUnsafeSupplier) {

		_prestacaoInformacoesSupplier = () -> {
			try {
				return prestacaoInformacoesUnsafeSupplier.get();
			}
			catch (RuntimeException runtimeException) {
				throw runtimeException;
			}
			catch (Exception exception) {
				throw new RuntimeException(exception);
			}
		};
	}

	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Boolean prestacaoInformacoes;

	@JsonIgnore
	private Supplier<Boolean> _prestacaoInformacoesSupplier;

	@io.swagger.v3.oas.annotations.media.Schema
	public Boolean getProibicaoInterposicao() {
		if (_proibicaoInterposicaoSupplier != null) {
			proibicaoInterposicao = _proibicaoInterposicaoSupplier.get();

			_proibicaoInterposicaoSupplier = null;
		}

		return proibicaoInterposicao;
	}

	public void setProibicaoInterposicao(Boolean proibicaoInterposicao) {
		this.proibicaoInterposicao = proibicaoInterposicao;

		_proibicaoInterposicaoSupplier = null;
	}

	@JsonIgnore
	public void setProibicaoInterposicao(
		UnsafeSupplier<Boolean, Exception>
			proibicaoInterposicaoUnsafeSupplier) {

		_proibicaoInterposicaoSupplier = () -> {
			try {
				return proibicaoInterposicaoUnsafeSupplier.get();
			}
			catch (RuntimeException runtimeException) {
				throw runtimeException;
			}
			catch (Exception exception) {
				throw new RuntimeException(exception);
			}
		};
	}

	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Boolean proibicaoInterposicao;

	@JsonIgnore
	private Supplier<Boolean> _proibicaoInterposicaoSupplier;

	@io.swagger.v3.oas.annotations.media.Schema
	public Boolean getReconheceGrupoOuSucessao() {
		if (_reconheceGrupoOuSucessaoSupplier != null) {
			reconheceGrupoOuSucessao = _reconheceGrupoOuSucessaoSupplier.get();

			_reconheceGrupoOuSucessaoSupplier = null;
		}

		return reconheceGrupoOuSucessao;
	}

	public void setReconheceGrupoOuSucessao(Boolean reconheceGrupoOuSucessao) {
		this.reconheceGrupoOuSucessao = reconheceGrupoOuSucessao;

		_reconheceGrupoOuSucessaoSupplier = null;
	}

	@JsonIgnore
	public void setReconheceGrupoOuSucessao(
		UnsafeSupplier<Boolean, Exception>
			reconheceGrupoOuSucessaoUnsafeSupplier) {

		_reconheceGrupoOuSucessaoSupplier = () -> {
			try {
				return reconheceGrupoOuSucessaoUnsafeSupplier.get();
			}
			catch (RuntimeException runtimeException) {
				throw runtimeException;
			}
			catch (Exception exception) {
				throw new RuntimeException(exception);
			}
		};
	}

	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Boolean reconheceGrupoOuSucessao;

	@JsonIgnore
	private Supplier<Boolean> _reconheceGrupoOuSucessaoSupplier;

	@io.swagger.v3.oas.annotations.media.Schema
	public Boolean getRenunciaRecursos() {
		if (_renunciaRecursosSupplier != null) {
			renunciaRecursos = _renunciaRecursosSupplier.get();

			_renunciaRecursosSupplier = null;
		}

		return renunciaRecursos;
	}

	public void setRenunciaRecursos(Boolean renunciaRecursos) {
		this.renunciaRecursos = renunciaRecursos;

		_renunciaRecursosSupplier = null;
	}

	@JsonIgnore
	public void setRenunciaRecursos(
		UnsafeSupplier<Boolean, Exception> renunciaRecursosUnsafeSupplier) {

		_renunciaRecursosSupplier = () -> {
			try {
				return renunciaRecursosUnsafeSupplier.get();
			}
			catch (RuntimeException runtimeException) {
				throw runtimeException;
			}
			catch (Exception exception) {
				throw new RuntimeException(exception);
			}
		};
	}

	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Boolean renunciaRecursos;

	@JsonIgnore
	private Supplier<Boolean> _renunciaRecursosSupplier;

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof Declaracao)) {
			return false;
		}

		Declaracao declaracao = (Declaracao)object;

		return Objects.equals(toString(), declaracao.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		StringBundler sb = new StringBundler();

		sb.append("{");

		Boolean abusoTransacao = getAbusoTransacao();

		if (abusoTransacao != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"abusoTransacao\": ");

			sb.append(abusoTransacao);
		}

		Boolean cienciaProcesso = getCienciaProcesso();

		if (cienciaProcesso != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"cienciaProcesso\": ");

			sb.append(cienciaProcesso);
		}

		Boolean compromissoConfidencialidade =
			getCompromissoConfidencialidade();

		if (compromissoConfidencialidade != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"compromissoConfidencialidade\": ");

			sb.append(compromissoConfidencialidade);
		}

		Boolean cumpreCompromissos = getCumpreCompromissos();

		if (cumpreCompromissos != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"cumpreCompromissos\": ");

			sb.append(cumpreCompromissos);
		}

		Boolean impugnacaoRecursos = getImpugnacaoRecursos();

		if (impugnacaoRecursos != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"impugnacaoRecursos\": ");

			sb.append(impugnacaoRecursos);
		}

		Boolean manutencaoGarantias = getManutencaoGarantias();

		if (manutencaoGarantias != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"manutencaoGarantias\": ");

			sb.append(manutencaoGarantias);
		}

		Boolean naoAlienacaoBensSemComunicacao =
			getNaoAlienacaoBensSemComunicacao();

		if (naoAlienacaoBensSemComunicacao != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"naoAlienacaoBensSemComunicacao\": ");

			sb.append(naoAlienacaoBensSemComunicacao);
		}

		Boolean omissaoInformacoes = getOmissaoInformacoes();

		if (omissaoInformacoes != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"omissaoInformacoes\": ");

			sb.append(omissaoInformacoes);
		}

		Boolean peticionamentoProcessos = getPeticionamentoProcessos();

		if (peticionamentoProcessos != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"peticionamentoProcessos\": ");

			sb.append(peticionamentoProcessos);
		}

		Boolean prestacaoInformacoes = getPrestacaoInformacoes();

		if (prestacaoInformacoes != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"prestacaoInformacoes\": ");

			sb.append(prestacaoInformacoes);
		}

		Boolean proibicaoInterposicao = getProibicaoInterposicao();

		if (proibicaoInterposicao != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"proibicaoInterposicao\": ");

			sb.append(proibicaoInterposicao);
		}

		Boolean reconheceGrupoOuSucessao = getReconheceGrupoOuSucessao();

		if (reconheceGrupoOuSucessao != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"reconheceGrupoOuSucessao\": ");

			sb.append(reconheceGrupoOuSucessao);
		}

		Boolean renunciaRecursos = getRenunciaRecursos();

		if (renunciaRecursos != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"renunciaRecursos\": ");

			sb.append(renunciaRecursos);
		}

		sb.append("}");

		return sb.toString();
	}

	@io.swagger.v3.oas.annotations.media.Schema(
		accessMode = io.swagger.v3.oas.annotations.media.Schema.AccessMode.READ_ONLY,
		defaultValue = "br.com.seatecnologia.gdf.negocia.headless.dto.v1_0.Declaracao",
		name = "x-class-name"
	)
	public String xClassName;

	private static String _escape(Object object) {
		return StringUtil.replace(
			String.valueOf(object), _JSON_ESCAPE_STRINGS[0],
			_JSON_ESCAPE_STRINGS[1]);
	}

	private static boolean _isArray(Object value) {
		if (value == null) {
			return false;
		}

		Class<?> clazz = value.getClass();

		return clazz.isArray();
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
			sb.append(_escape(entry.getKey()));
			sb.append("\": ");

			Object value = entry.getValue();

			if (_isArray(value)) {
				sb.append("[");

				Object[] valueArray = (Object[])value;

				for (int i = 0; i < valueArray.length; i++) {
					if (valueArray[i] instanceof Map) {
						sb.append(_toJSON((Map<String, ?>)valueArray[i]));
					}
					else if (valueArray[i] instanceof String) {
						sb.append("\"");
						sb.append(valueArray[i]);
						sb.append("\"");
					}
					else {
						sb.append(valueArray[i]);
					}

					if ((i + 1) < valueArray.length) {
						sb.append(", ");
					}
				}

				sb.append("]");
			}
			else if (value instanceof Map) {
				sb.append(_toJSON((Map<String, ?>)value));
			}
			else if (value instanceof String) {
				sb.append("\"");
				sb.append(_escape(value));
				sb.append("\"");
			}
			else {
				sb.append(value);
			}

			if (iterator.hasNext()) {
				sb.append(", ");
			}
		}

		sb.append("}");

		return sb.toString();
	}

	private static final String[][] _JSON_ESCAPE_STRINGS = {
		{"\\", "\"", "\b", "\f", "\n", "\r", "\t"},
		{"\\\\", "\\\"", "\\b", "\\f", "\\n", "\\r", "\\t"}
	};

	private Map<String, Serializable> _extendedProperties;

}
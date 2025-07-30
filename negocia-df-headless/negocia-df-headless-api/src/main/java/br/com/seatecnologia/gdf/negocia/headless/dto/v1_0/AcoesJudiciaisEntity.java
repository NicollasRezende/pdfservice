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
@GraphQLName("AcoesJudiciaisEntity")
@JsonFilter("Liferay.Vulcan")
@XmlRootElement(name = "AcoesJudiciaisEntity")
public class AcoesJudiciaisEntity implements Serializable {

	public static AcoesJudiciaisEntity toDTO(String json) {
		return ObjectMapperUtil.readValue(AcoesJudiciaisEntity.class, json);
	}

	public static AcoesJudiciaisEntity unsafeToDTO(String json) {
		return ObjectMapperUtil.unsafeReadValue(
			AcoesJudiciaisEntity.class, json);
	}

	@io.swagger.v3.oas.annotations.media.Schema
	public Long getAcaoId() {
		if (_acaoIdSupplier != null) {
			acaoId = _acaoIdSupplier.get();

			_acaoIdSupplier = null;
		}

		return acaoId;
	}

	public void setAcaoId(Long acaoId) {
		this.acaoId = acaoId;

		_acaoIdSupplier = null;
	}

	@JsonIgnore
	public void setAcaoId(
		UnsafeSupplier<Long, Exception> acaoIdUnsafeSupplier) {

		_acaoIdSupplier = () -> {
			try {
				return acaoIdUnsafeSupplier.get();
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
	protected Long acaoId;

	@JsonIgnore
	private Supplier<Long> _acaoIdSupplier;

	@io.swagger.v3.oas.annotations.media.Schema
	public String getNumeroProcesso() {
		if (_numeroProcessoSupplier != null) {
			numeroProcesso = _numeroProcessoSupplier.get();

			_numeroProcessoSupplier = null;
		}

		return numeroProcesso;
	}

	public void setNumeroProcesso(String numeroProcesso) {
		this.numeroProcesso = numeroProcesso;

		_numeroProcessoSupplier = null;
	}

	@JsonIgnore
	public void setNumeroProcesso(
		UnsafeSupplier<String, Exception> numeroProcessoUnsafeSupplier) {

		_numeroProcessoSupplier = () -> {
			try {
				return numeroProcessoUnsafeSupplier.get();
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
	protected String numeroProcesso;

	@JsonIgnore
	private Supplier<String> _numeroProcessoSupplier;

	@io.swagger.v3.oas.annotations.media.Schema
	public String getObservacoes() {
		if (_observacoesSupplier != null) {
			observacoes = _observacoesSupplier.get();

			_observacoesSupplier = null;
		}

		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;

		_observacoesSupplier = null;
	}

	@JsonIgnore
	public void setObservacoes(
		UnsafeSupplier<String, Exception> observacoesUnsafeSupplier) {

		_observacoesSupplier = () -> {
			try {
				return observacoesUnsafeSupplier.get();
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
	protected String observacoes;

	@JsonIgnore
	private Supplier<String> _observacoesSupplier;

	@io.swagger.v3.oas.annotations.media.Schema
	public String getOrgaoTribunal() {
		if (_orgaoTribunalSupplier != null) {
			orgaoTribunal = _orgaoTribunalSupplier.get();

			_orgaoTribunalSupplier = null;
		}

		return orgaoTribunal;
	}

	public void setOrgaoTribunal(String orgaoTribunal) {
		this.orgaoTribunal = orgaoTribunal;

		_orgaoTribunalSupplier = null;
	}

	@JsonIgnore
	public void setOrgaoTribunal(
		UnsafeSupplier<String, Exception> orgaoTribunalUnsafeSupplier) {

		_orgaoTribunalSupplier = () -> {
			try {
				return orgaoTribunalUnsafeSupplier.get();
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
	protected String orgaoTribunal;

	@JsonIgnore
	private Supplier<String> _orgaoTribunalSupplier;

	@io.swagger.v3.oas.annotations.media.Schema
	public String getParteAutora() {
		if (_parteAutoraSupplier != null) {
			parteAutora = _parteAutoraSupplier.get();

			_parteAutoraSupplier = null;
		}

		return parteAutora;
	}

	public void setParteAutora(String parteAutora) {
		this.parteAutora = parteAutora;

		_parteAutoraSupplier = null;
	}

	@JsonIgnore
	public void setParteAutora(
		UnsafeSupplier<String, Exception> parteAutoraUnsafeSupplier) {

		_parteAutoraSupplier = () -> {
			try {
				return parteAutoraUnsafeSupplier.get();
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
	protected String parteAutora;

	@JsonIgnore
	private Supplier<String> _parteAutoraSupplier;

	@io.swagger.v3.oas.annotations.media.Schema
	public String getParteRe() {
		if (_parteReSupplier != null) {
			parteRe = _parteReSupplier.get();

			_parteReSupplier = null;
		}

		return parteRe;
	}

	public void setParteRe(String parteRe) {
		this.parteRe = parteRe;

		_parteReSupplier = null;
	}

	@JsonIgnore
	public void setParteRe(
		UnsafeSupplier<String, Exception> parteReUnsafeSupplier) {

		_parteReSupplier = () -> {
			try {
				return parteReUnsafeSupplier.get();
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
	protected String parteRe;

	@JsonIgnore
	private Supplier<String> _parteReSupplier;

	@io.swagger.v3.oas.annotations.media.Schema
	public Long getPropostaId() {
		if (_propostaIdSupplier != null) {
			propostaId = _propostaIdSupplier.get();

			_propostaIdSupplier = null;
		}

		return propostaId;
	}

	public void setPropostaId(Long propostaId) {
		this.propostaId = propostaId;

		_propostaIdSupplier = null;
	}

	@JsonIgnore
	public void setPropostaId(
		UnsafeSupplier<Long, Exception> propostaIdUnsafeSupplier) {

		_propostaIdSupplier = () -> {
			try {
				return propostaIdUnsafeSupplier.get();
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
	protected Long propostaId;

	@JsonIgnore
	private Supplier<Long> _propostaIdSupplier;

	@io.swagger.v3.oas.annotations.media.Schema
	public String getUnidadeVara() {
		if (_unidadeVaraSupplier != null) {
			unidadeVara = _unidadeVaraSupplier.get();

			_unidadeVaraSupplier = null;
		}

		return unidadeVara;
	}

	public void setUnidadeVara(String unidadeVara) {
		this.unidadeVara = unidadeVara;

		_unidadeVaraSupplier = null;
	}

	@JsonIgnore
	public void setUnidadeVara(
		UnsafeSupplier<String, Exception> unidadeVaraUnsafeSupplier) {

		_unidadeVaraSupplier = () -> {
			try {
				return unidadeVaraUnsafeSupplier.get();
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
	protected String unidadeVara;

	@JsonIgnore
	private Supplier<String> _unidadeVaraSupplier;

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof AcoesJudiciaisEntity)) {
			return false;
		}

		AcoesJudiciaisEntity acoesJudiciaisEntity =
			(AcoesJudiciaisEntity)object;

		return Objects.equals(toString(), acoesJudiciaisEntity.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		StringBundler sb = new StringBundler();

		sb.append("{");

		Long acaoId = getAcaoId();

		if (acaoId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"acaoId\": ");

			sb.append(acaoId);
		}

		String numeroProcesso = getNumeroProcesso();

		if (numeroProcesso != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"numeroProcesso\": ");

			sb.append("\"");

			sb.append(_escape(numeroProcesso));

			sb.append("\"");
		}

		String observacoes = getObservacoes();

		if (observacoes != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"observacoes\": ");

			sb.append("\"");

			sb.append(_escape(observacoes));

			sb.append("\"");
		}

		String orgaoTribunal = getOrgaoTribunal();

		if (orgaoTribunal != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"orgaoTribunal\": ");

			sb.append("\"");

			sb.append(_escape(orgaoTribunal));

			sb.append("\"");
		}

		String parteAutora = getParteAutora();

		if (parteAutora != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"parteAutora\": ");

			sb.append("\"");

			sb.append(_escape(parteAutora));

			sb.append("\"");
		}

		String parteRe = getParteRe();

		if (parteRe != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"parteRe\": ");

			sb.append("\"");

			sb.append(_escape(parteRe));

			sb.append("\"");
		}

		Long propostaId = getPropostaId();

		if (propostaId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"propostaId\": ");

			sb.append(propostaId);
		}

		String unidadeVara = getUnidadeVara();

		if (unidadeVara != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"unidadeVara\": ");

			sb.append("\"");

			sb.append(_escape(unidadeVara));

			sb.append("\"");
		}

		sb.append("}");

		return sb.toString();
	}

	@io.swagger.v3.oas.annotations.media.Schema(
		accessMode = io.swagger.v3.oas.annotations.media.Schema.AccessMode.READ_ONLY,
		defaultValue = "br.com.seatecnologia.gdf.negocia.headless.dto.v1_0.AcoesJudiciaisEntity",
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
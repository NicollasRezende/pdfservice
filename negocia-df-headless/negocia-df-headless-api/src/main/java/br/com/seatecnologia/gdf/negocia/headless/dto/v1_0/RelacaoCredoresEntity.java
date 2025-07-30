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
@GraphQLName("RelacaoCredoresEntity")
@JsonFilter("Liferay.Vulcan")
@XmlRootElement(name = "RelacaoCredoresEntity")
public class RelacaoCredoresEntity implements Serializable {

	public static RelacaoCredoresEntity toDTO(String json) {
		return ObjectMapperUtil.readValue(RelacaoCredoresEntity.class, json);
	}

	public static RelacaoCredoresEntity unsafeToDTO(String json) {
		return ObjectMapperUtil.unsafeReadValue(
			RelacaoCredoresEntity.class, json);
	}

	@io.swagger.v3.oas.annotations.media.Schema
	public String getClassificacaoCredito() {
		if (_classificacaoCreditoSupplier != null) {
			classificacaoCredito = _classificacaoCreditoSupplier.get();

			_classificacaoCreditoSupplier = null;
		}

		return classificacaoCredito;
	}

	public void setClassificacaoCredito(String classificacaoCredito) {
		this.classificacaoCredito = classificacaoCredito;

		_classificacaoCreditoSupplier = null;
	}

	@JsonIgnore
	public void setClassificacaoCredito(
		UnsafeSupplier<String, Exception> classificacaoCreditoUnsafeSupplier) {

		_classificacaoCreditoSupplier = () -> {
			try {
				return classificacaoCreditoUnsafeSupplier.get();
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
	protected String classificacaoCredito;

	@JsonIgnore
	private Supplier<String> _classificacaoCreditoSupplier;

	@io.swagger.v3.oas.annotations.media.Schema
	public Long getCredorId() {
		if (_credorIdSupplier != null) {
			credorId = _credorIdSupplier.get();

			_credorIdSupplier = null;
		}

		return credorId;
	}

	public void setCredorId(Long credorId) {
		this.credorId = credorId;

		_credorIdSupplier = null;
	}

	@JsonIgnore
	public void setCredorId(
		UnsafeSupplier<Long, Exception> credorIdUnsafeSupplier) {

		_credorIdSupplier = () -> {
			try {
				return credorIdUnsafeSupplier.get();
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
	protected Long credorId;

	@JsonIgnore
	private Supplier<Long> _credorIdSupplier;

	@io.swagger.v3.oas.annotations.media.Schema
	public String getNaturezaCredito() {
		if (_naturezaCreditoSupplier != null) {
			naturezaCredito = _naturezaCreditoSupplier.get();

			_naturezaCreditoSupplier = null;
		}

		return naturezaCredito;
	}

	public void setNaturezaCredito(String naturezaCredito) {
		this.naturezaCredito = naturezaCredito;

		_naturezaCreditoSupplier = null;
	}

	@JsonIgnore
	public void setNaturezaCredito(
		UnsafeSupplier<String, Exception> naturezaCreditoUnsafeSupplier) {

		_naturezaCreditoSupplier = () -> {
			try {
				return naturezaCreditoUnsafeSupplier.get();
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
	protected String naturezaCredito;

	@JsonIgnore
	private Supplier<String> _naturezaCreditoSupplier;

	@io.swagger.v3.oas.annotations.media.Schema
	public String getNomeCredor() {
		if (_nomeCredorSupplier != null) {
			nomeCredor = _nomeCredorSupplier.get();

			_nomeCredorSupplier = null;
		}

		return nomeCredor;
	}

	public void setNomeCredor(String nomeCredor) {
		this.nomeCredor = nomeCredor;

		_nomeCredorSupplier = null;
	}

	@JsonIgnore
	public void setNomeCredor(
		UnsafeSupplier<String, Exception> nomeCredorUnsafeSupplier) {

		_nomeCredorSupplier = () -> {
			try {
				return nomeCredorUnsafeSupplier.get();
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
	protected String nomeCredor;

	@JsonIgnore
	private Supplier<String> _nomeCredorSupplier;

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
	public String getReferenciaRegistro() {
		if (_referenciaRegistroSupplier != null) {
			referenciaRegistro = _referenciaRegistroSupplier.get();

			_referenciaRegistroSupplier = null;
		}

		return referenciaRegistro;
	}

	public void setReferenciaRegistro(String referenciaRegistro) {
		this.referenciaRegistro = referenciaRegistro;

		_referenciaRegistroSupplier = null;
	}

	@JsonIgnore
	public void setReferenciaRegistro(
		UnsafeSupplier<String, Exception> referenciaRegistroUnsafeSupplier) {

		_referenciaRegistroSupplier = () -> {
			try {
				return referenciaRegistroUnsafeSupplier.get();
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
	protected String referenciaRegistro;

	@JsonIgnore
	private Supplier<String> _referenciaRegistroSupplier;

	@io.swagger.v3.oas.annotations.media.Schema
	public Double getValorCredito() {
		if (_valorCreditoSupplier != null) {
			valorCredito = _valorCreditoSupplier.get();

			_valorCreditoSupplier = null;
		}

		return valorCredito;
	}

	public void setValorCredito(Double valorCredito) {
		this.valorCredito = valorCredito;

		_valorCreditoSupplier = null;
	}

	@JsonIgnore
	public void setValorCredito(
		UnsafeSupplier<Double, Exception> valorCreditoUnsafeSupplier) {

		_valorCreditoSupplier = () -> {
			try {
				return valorCreditoUnsafeSupplier.get();
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
	protected Double valorCredito;

	@JsonIgnore
	private Supplier<Double> _valorCreditoSupplier;

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof RelacaoCredoresEntity)) {
			return false;
		}

		RelacaoCredoresEntity relacaoCredoresEntity =
			(RelacaoCredoresEntity)object;

		return Objects.equals(toString(), relacaoCredoresEntity.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		StringBundler sb = new StringBundler();

		sb.append("{");

		String classificacaoCredito = getClassificacaoCredito();

		if (classificacaoCredito != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"classificacaoCredito\": ");

			sb.append("\"");

			sb.append(_escape(classificacaoCredito));

			sb.append("\"");
		}

		Long credorId = getCredorId();

		if (credorId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"credorId\": ");

			sb.append(credorId);
		}

		String naturezaCredito = getNaturezaCredito();

		if (naturezaCredito != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"naturezaCredito\": ");

			sb.append("\"");

			sb.append(_escape(naturezaCredito));

			sb.append("\"");
		}

		String nomeCredor = getNomeCredor();

		if (nomeCredor != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"nomeCredor\": ");

			sb.append("\"");

			sb.append(_escape(nomeCredor));

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

		String referenciaRegistro = getReferenciaRegistro();

		if (referenciaRegistro != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"referenciaRegistro\": ");

			sb.append("\"");

			sb.append(_escape(referenciaRegistro));

			sb.append("\"");
		}

		Double valorCredito = getValorCredito();

		if (valorCredito != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"valorCredito\": ");

			sb.append(valorCredito);
		}

		sb.append("}");

		return sb.toString();
	}

	@io.swagger.v3.oas.annotations.media.Schema(
		accessMode = io.swagger.v3.oas.annotations.media.Schema.AccessMode.READ_ONLY,
		defaultValue = "br.com.seatecnologia.gdf.negocia.headless.dto.v1_0.RelacaoCredoresEntity",
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
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
@GraphQLName("CreditosTransacionadosEntity")
@JsonFilter("Liferay.Vulcan")
@XmlRootElement(name = "CreditosTransacionadosEntity")
public class CreditosTransacionadosEntity implements Serializable {

	public static CreditosTransacionadosEntity toDTO(String json) {
		return ObjectMapperUtil.readValue(
			CreditosTransacionadosEntity.class, json);
	}

	public static CreditosTransacionadosEntity unsafeToDTO(String json) {
		return ObjectMapperUtil.unsafeReadValue(
			CreditosTransacionadosEntity.class, json);
	}

	@io.swagger.v3.oas.annotations.media.Schema
	public Long getCreditoId() {
		if (_creditoIdSupplier != null) {
			creditoId = _creditoIdSupplier.get();

			_creditoIdSupplier = null;
		}

		return creditoId;
	}

	public void setCreditoId(Long creditoId) {
		this.creditoId = creditoId;

		_creditoIdSupplier = null;
	}

	@JsonIgnore
	public void setCreditoId(
		UnsafeSupplier<Long, Exception> creditoIdUnsafeSupplier) {

		_creditoIdSupplier = () -> {
			try {
				return creditoIdUnsafeSupplier.get();
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
	protected Long creditoId;

	@JsonIgnore
	private Supplier<Long> _creditoIdSupplier;

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
	public Double getPercentualDescontoJuros() {
		if (_percentualDescontoJurosSupplier != null) {
			percentualDescontoJuros = _percentualDescontoJurosSupplier.get();

			_percentualDescontoJurosSupplier = null;
		}

		return percentualDescontoJuros;
	}

	public void setPercentualDescontoJuros(Double percentualDescontoJuros) {
		this.percentualDescontoJuros = percentualDescontoJuros;

		_percentualDescontoJurosSupplier = null;
	}

	@JsonIgnore
	public void setPercentualDescontoJuros(
		UnsafeSupplier<Double, Exception>
			percentualDescontoJurosUnsafeSupplier) {

		_percentualDescontoJurosSupplier = () -> {
			try {
				return percentualDescontoJurosUnsafeSupplier.get();
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
	protected Double percentualDescontoJuros;

	@JsonIgnore
	private Supplier<Double> _percentualDescontoJurosSupplier;

	@io.swagger.v3.oas.annotations.media.Schema
	public Double getPercentualDescontoPrincipal() {
		if (_percentualDescontoPrincipalSupplier != null) {
			percentualDescontoPrincipal =
				_percentualDescontoPrincipalSupplier.get();

			_percentualDescontoPrincipalSupplier = null;
		}

		return percentualDescontoPrincipal;
	}

	public void setPercentualDescontoPrincipal(
		Double percentualDescontoPrincipal) {

		this.percentualDescontoPrincipal = percentualDescontoPrincipal;

		_percentualDescontoPrincipalSupplier = null;
	}

	@JsonIgnore
	public void setPercentualDescontoPrincipal(
		UnsafeSupplier<Double, Exception>
			percentualDescontoPrincipalUnsafeSupplier) {

		_percentualDescontoPrincipalSupplier = () -> {
			try {
				return percentualDescontoPrincipalUnsafeSupplier.get();
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
	protected Double percentualDescontoPrincipal;

	@JsonIgnore
	private Supplier<Double> _percentualDescontoPrincipalSupplier;

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

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof CreditosTransacionadosEntity)) {
			return false;
		}

		CreditosTransacionadosEntity creditosTransacionadosEntity =
			(CreditosTransacionadosEntity)object;

		return Objects.equals(
			toString(), creditosTransacionadosEntity.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		StringBundler sb = new StringBundler();

		sb.append("{");

		Long creditoId = getCreditoId();

		if (creditoId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"creditoId\": ");

			sb.append(creditoId);
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

		Double percentualDescontoJuros = getPercentualDescontoJuros();

		if (percentualDescontoJuros != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"percentualDescontoJuros\": ");

			sb.append(percentualDescontoJuros);
		}

		Double percentualDescontoPrincipal = getPercentualDescontoPrincipal();

		if (percentualDescontoPrincipal != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"percentualDescontoPrincipal\": ");

			sb.append(percentualDescontoPrincipal);
		}

		Long propostaId = getPropostaId();

		if (propostaId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"propostaId\": ");

			sb.append(propostaId);
		}

		sb.append("}");

		return sb.toString();
	}

	@io.swagger.v3.oas.annotations.media.Schema(
		accessMode = io.swagger.v3.oas.annotations.media.Schema.AccessMode.READ_ONLY,
		defaultValue = "br.com.seatecnologia.gdf.negocia.headless.dto.v1_0.CreditosTransacionadosEntity",
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
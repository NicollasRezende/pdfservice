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

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import java.util.Date;
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
@GraphQLName("ParcelamentoEntity")
@JsonFilter("Liferay.Vulcan")
@XmlRootElement(name = "ParcelamentoEntity")
public class ParcelamentoEntity implements Serializable {

	public static ParcelamentoEntity toDTO(String json) {
		return ObjectMapperUtil.readValue(ParcelamentoEntity.class, json);
	}

	public static ParcelamentoEntity unsafeToDTO(String json) {
		return ObjectMapperUtil.unsafeReadValue(ParcelamentoEntity.class, json);
	}

	@io.swagger.v3.oas.annotations.media.Schema
	public Date getDataPrimeiraParcela() {
		if (_dataPrimeiraParcelaSupplier != null) {
			dataPrimeiraParcela = _dataPrimeiraParcelaSupplier.get();

			_dataPrimeiraParcelaSupplier = null;
		}

		return dataPrimeiraParcela;
	}

	public void setDataPrimeiraParcela(Date dataPrimeiraParcela) {
		this.dataPrimeiraParcela = dataPrimeiraParcela;

		_dataPrimeiraParcelaSupplier = null;
	}

	@JsonIgnore
	public void setDataPrimeiraParcela(
		UnsafeSupplier<Date, Exception> dataPrimeiraParcelaUnsafeSupplier) {

		_dataPrimeiraParcelaSupplier = () -> {
			try {
				return dataPrimeiraParcelaUnsafeSupplier.get();
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
	protected Date dataPrimeiraParcela;

	@JsonIgnore
	private Supplier<Date> _dataPrimeiraParcelaSupplier;

	@io.swagger.v3.oas.annotations.media.Schema
	public Integer getNumeroParcelas() {
		if (_numeroParcelasSupplier != null) {
			numeroParcelas = _numeroParcelasSupplier.get();

			_numeroParcelasSupplier = null;
		}

		return numeroParcelas;
	}

	public void setNumeroParcelas(Integer numeroParcelas) {
		this.numeroParcelas = numeroParcelas;

		_numeroParcelasSupplier = null;
	}

	@JsonIgnore
	public void setNumeroParcelas(
		UnsafeSupplier<Integer, Exception> numeroParcelasUnsafeSupplier) {

		_numeroParcelasSupplier = () -> {
			try {
				return numeroParcelasUnsafeSupplier.get();
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
	protected Integer numeroParcelas;

	@JsonIgnore
	private Supplier<Integer> _numeroParcelasSupplier;

	@io.swagger.v3.oas.annotations.media.Schema
	public Long getParcelamentoId() {
		if (_parcelamentoIdSupplier != null) {
			parcelamentoId = _parcelamentoIdSupplier.get();

			_parcelamentoIdSupplier = null;
		}

		return parcelamentoId;
	}

	public void setParcelamentoId(Long parcelamentoId) {
		this.parcelamentoId = parcelamentoId;

		_parcelamentoIdSupplier = null;
	}

	@JsonIgnore
	public void setParcelamentoId(
		UnsafeSupplier<Long, Exception> parcelamentoIdUnsafeSupplier) {

		_parcelamentoIdSupplier = () -> {
			try {
				return parcelamentoIdUnsafeSupplier.get();
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
	protected Long parcelamentoId;

	@JsonIgnore
	private Supplier<Long> _parcelamentoIdSupplier;

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
	public Double getValorEntrada() {
		if (_valorEntradaSupplier != null) {
			valorEntrada = _valorEntradaSupplier.get();

			_valorEntradaSupplier = null;
		}

		return valorEntrada;
	}

	public void setValorEntrada(Double valorEntrada) {
		this.valorEntrada = valorEntrada;

		_valorEntradaSupplier = null;
	}

	@JsonIgnore
	public void setValorEntrada(
		UnsafeSupplier<Double, Exception> valorEntradaUnsafeSupplier) {

		_valorEntradaSupplier = () -> {
			try {
				return valorEntradaUnsafeSupplier.get();
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
	protected Double valorEntrada;

	@JsonIgnore
	private Supplier<Double> _valorEntradaSupplier;

	@io.swagger.v3.oas.annotations.media.Schema
	public Double getValorPrimeiraParcela() {
		if (_valorPrimeiraParcelaSupplier != null) {
			valorPrimeiraParcela = _valorPrimeiraParcelaSupplier.get();

			_valorPrimeiraParcelaSupplier = null;
		}

		return valorPrimeiraParcela;
	}

	public void setValorPrimeiraParcela(Double valorPrimeiraParcela) {
		this.valorPrimeiraParcela = valorPrimeiraParcela;

		_valorPrimeiraParcelaSupplier = null;
	}

	@JsonIgnore
	public void setValorPrimeiraParcela(
		UnsafeSupplier<Double, Exception> valorPrimeiraParcelaUnsafeSupplier) {

		_valorPrimeiraParcelaSupplier = () -> {
			try {
				return valorPrimeiraParcelaUnsafeSupplier.get();
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
	protected Double valorPrimeiraParcela;

	@JsonIgnore
	private Supplier<Double> _valorPrimeiraParcelaSupplier;

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof ParcelamentoEntity)) {
			return false;
		}

		ParcelamentoEntity parcelamentoEntity = (ParcelamentoEntity)object;

		return Objects.equals(toString(), parcelamentoEntity.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		StringBundler sb = new StringBundler();

		sb.append("{");

		DateFormat liferayToJSONDateFormat = new SimpleDateFormat(
			"yyyy-MM-dd'T'HH:mm:ss'Z'");

		Date dataPrimeiraParcela = getDataPrimeiraParcela();

		if (dataPrimeiraParcela != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"dataPrimeiraParcela\": ");

			sb.append("\"");

			sb.append(liferayToJSONDateFormat.format(dataPrimeiraParcela));

			sb.append("\"");
		}

		Integer numeroParcelas = getNumeroParcelas();

		if (numeroParcelas != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"numeroParcelas\": ");

			sb.append(numeroParcelas);
		}

		Long parcelamentoId = getParcelamentoId();

		if (parcelamentoId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"parcelamentoId\": ");

			sb.append(parcelamentoId);
		}

		Long propostaId = getPropostaId();

		if (propostaId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"propostaId\": ");

			sb.append(propostaId);
		}

		Double valorEntrada = getValorEntrada();

		if (valorEntrada != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"valorEntrada\": ");

			sb.append(valorEntrada);
		}

		Double valorPrimeiraParcela = getValorPrimeiraParcela();

		if (valorPrimeiraParcela != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"valorPrimeiraParcela\": ");

			sb.append(valorPrimeiraParcela);
		}

		sb.append("}");

		return sb.toString();
	}

	@io.swagger.v3.oas.annotations.media.Schema(
		accessMode = io.swagger.v3.oas.annotations.media.Schema.AccessMode.READ_ONLY,
		defaultValue = "br.com.seatecnologia.gdf.negocia.headless.dto.v1_0.ParcelamentoEntity",
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
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
@GraphQLName("ComprovanteHonorariosEntity")
@JsonFilter("Liferay.Vulcan")
@XmlRootElement(name = "ComprovanteHonorariosEntity")
public class ComprovanteHonorariosEntity implements Serializable {

	public static ComprovanteHonorariosEntity toDTO(String json) {
		return ObjectMapperUtil.readValue(
			ComprovanteHonorariosEntity.class, json);
	}

	public static ComprovanteHonorariosEntity unsafeToDTO(String json) {
		return ObjectMapperUtil.unsafeReadValue(
			ComprovanteHonorariosEntity.class, json);
	}

	@io.swagger.v3.oas.annotations.media.Schema
	public Long getComprovanteId() {
		if (_comprovanteIdSupplier != null) {
			comprovanteId = _comprovanteIdSupplier.get();

			_comprovanteIdSupplier = null;
		}

		return comprovanteId;
	}

	public void setComprovanteId(Long comprovanteId) {
		this.comprovanteId = comprovanteId;

		_comprovanteIdSupplier = null;
	}

	@JsonIgnore
	public void setComprovanteId(
		UnsafeSupplier<Long, Exception> comprovanteIdUnsafeSupplier) {

		_comprovanteIdSupplier = () -> {
			try {
				return comprovanteIdUnsafeSupplier.get();
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
	protected Long comprovanteId;

	@JsonIgnore
	private Supplier<Long> _comprovanteIdSupplier;

	@io.swagger.v3.oas.annotations.media.Schema
	public Date getDataPagamento() {
		if (_dataPagamentoSupplier != null) {
			dataPagamento = _dataPagamentoSupplier.get();

			_dataPagamentoSupplier = null;
		}

		return dataPagamento;
	}

	public void setDataPagamento(Date dataPagamento) {
		this.dataPagamento = dataPagamento;

		_dataPagamentoSupplier = null;
	}

	@JsonIgnore
	public void setDataPagamento(
		UnsafeSupplier<Date, Exception> dataPagamentoUnsafeSupplier) {

		_dataPagamentoSupplier = () -> {
			try {
				return dataPagamentoUnsafeSupplier.get();
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
	protected Date dataPagamento;

	@JsonIgnore
	private Supplier<Date> _dataPagamentoSupplier;

	@io.swagger.v3.oas.annotations.media.Schema
	public Long getFileEntryId() {
		if (_fileEntryIdSupplier != null) {
			fileEntryId = _fileEntryIdSupplier.get();

			_fileEntryIdSupplier = null;
		}

		return fileEntryId;
	}

	public void setFileEntryId(Long fileEntryId) {
		this.fileEntryId = fileEntryId;

		_fileEntryIdSupplier = null;
	}

	@JsonIgnore
	public void setFileEntryId(
		UnsafeSupplier<Long, Exception> fileEntryIdUnsafeSupplier) {

		_fileEntryIdSupplier = () -> {
			try {
				return fileEntryIdUnsafeSupplier.get();
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
	protected Long fileEntryId;

	@JsonIgnore
	private Supplier<Long> _fileEntryIdSupplier;

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
	public Double getValorPago() {
		if (_valorPagoSupplier != null) {
			valorPago = _valorPagoSupplier.get();

			_valorPagoSupplier = null;
		}

		return valorPago;
	}

	public void setValorPago(Double valorPago) {
		this.valorPago = valorPago;

		_valorPagoSupplier = null;
	}

	@JsonIgnore
	public void setValorPago(
		UnsafeSupplier<Double, Exception> valorPagoUnsafeSupplier) {

		_valorPagoSupplier = () -> {
			try {
				return valorPagoUnsafeSupplier.get();
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
	protected Double valorPago;

	@JsonIgnore
	private Supplier<Double> _valorPagoSupplier;

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof ComprovanteHonorariosEntity)) {
			return false;
		}

		ComprovanteHonorariosEntity comprovanteHonorariosEntity =
			(ComprovanteHonorariosEntity)object;

		return Objects.equals(
			toString(), comprovanteHonorariosEntity.toString());
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

		Long comprovanteId = getComprovanteId();

		if (comprovanteId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"comprovanteId\": ");

			sb.append(comprovanteId);
		}

		Date dataPagamento = getDataPagamento();

		if (dataPagamento != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"dataPagamento\": ");

			sb.append("\"");

			sb.append(liferayToJSONDateFormat.format(dataPagamento));

			sb.append("\"");
		}

		Long fileEntryId = getFileEntryId();

		if (fileEntryId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"fileEntryId\": ");

			sb.append(fileEntryId);
		}

		Long propostaId = getPropostaId();

		if (propostaId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"propostaId\": ");

			sb.append(propostaId);
		}

		Double valorPago = getValorPago();

		if (valorPago != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"valorPago\": ");

			sb.append(valorPago);
		}

		sb.append("}");

		return sb.toString();
	}

	@io.swagger.v3.oas.annotations.media.Schema(
		accessMode = io.swagger.v3.oas.annotations.media.Schema.AccessMode.READ_ONLY,
		defaultValue = "br.com.seatecnologia.gdf.negocia.headless.dto.v1_0.ComprovanteHonorariosEntity",
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
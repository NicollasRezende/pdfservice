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
@GraphQLName("IdentificadorCreditoEntityDTO")
@JsonFilter("Liferay.Vulcan")
@XmlRootElement(name = "IdentificadorCreditoEntityDTO")
public class IdentificadorCreditoEntityDTO implements Serializable {

	public static IdentificadorCreditoEntityDTO toDTO(String json) {
		return ObjectMapperUtil.readValue(
			IdentificadorCreditoEntityDTO.class, json);
	}

	public static IdentificadorCreditoEntityDTO unsafeToDTO(String json) {
		return ObjectMapperUtil.unsafeReadValue(
			IdentificadorCreditoEntityDTO.class, json);
	}

	@io.swagger.v3.oas.annotations.media.Schema
	public String getNumeroDaGuia() {
		if (_numeroDaGuiaSupplier != null) {
			numeroDaGuia = _numeroDaGuiaSupplier.get();

			_numeroDaGuiaSupplier = null;
		}

		return numeroDaGuia;
	}

	public void setNumeroDaGuia(String numeroDaGuia) {
		this.numeroDaGuia = numeroDaGuia;

		_numeroDaGuiaSupplier = null;
	}

	@JsonIgnore
	public void setNumeroDaGuia(
		UnsafeSupplier<String, Exception> numeroDaGuiaUnsafeSupplier) {

		_numeroDaGuiaSupplier = () -> {
			try {
				return numeroDaGuiaUnsafeSupplier.get();
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
	protected String numeroDaGuia;

	@JsonIgnore
	private Supplier<String> _numeroDaGuiaSupplier;

	@io.swagger.v3.oas.annotations.media.Schema
	public String getNumeroDivida() {
		if (_numeroDividaSupplier != null) {
			numeroDivida = _numeroDividaSupplier.get();

			_numeroDividaSupplier = null;
		}

		return numeroDivida;
	}

	public void setNumeroDivida(String numeroDivida) {
		this.numeroDivida = numeroDivida;

		_numeroDividaSupplier = null;
	}

	@JsonIgnore
	public void setNumeroDivida(
		UnsafeSupplier<String, Exception> numeroDividaUnsafeSupplier) {

		_numeroDividaSupplier = () -> {
			try {
				return numeroDividaUnsafeSupplier.get();
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
	protected String numeroDivida;

	@JsonIgnore
	private Supplier<String> _numeroDividaSupplier;

	@io.swagger.v3.oas.annotations.media.Schema
	public String getRenavam() {
		if (_renavamSupplier != null) {
			renavam = _renavamSupplier.get();

			_renavamSupplier = null;
		}

		return renavam;
	}

	public void setRenavam(String renavam) {
		this.renavam = renavam;

		_renavamSupplier = null;
	}

	@JsonIgnore
	public void setRenavam(
		UnsafeSupplier<String, Exception> renavamUnsafeSupplier) {

		_renavamSupplier = () -> {
			try {
				return renavamUnsafeSupplier.get();
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
	protected String renavam;

	@JsonIgnore
	private Supplier<String> _renavamSupplier;

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof IdentificadorCreditoEntityDTO)) {
			return false;
		}

		IdentificadorCreditoEntityDTO identificadorCreditoEntityDTO =
			(IdentificadorCreditoEntityDTO)object;

		return Objects.equals(
			toString(), identificadorCreditoEntityDTO.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		StringBundler sb = new StringBundler();

		sb.append("{");

		String numeroDaGuia = getNumeroDaGuia();

		if (numeroDaGuia != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"numeroDaGuia\": ");

			sb.append("\"");

			sb.append(_escape(numeroDaGuia));

			sb.append("\"");
		}

		String numeroDivida = getNumeroDivida();

		if (numeroDivida != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"numeroDivida\": ");

			sb.append("\"");

			sb.append(_escape(numeroDivida));

			sb.append("\"");
		}

		String renavam = getRenavam();

		if (renavam != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"renavam\": ");

			sb.append("\"");

			sb.append(_escape(renavam));

			sb.append("\"");
		}

		sb.append("}");

		return sb.toString();
	}

	@io.swagger.v3.oas.annotations.media.Schema(
		accessMode = io.swagger.v3.oas.annotations.media.Schema.AccessMode.READ_ONLY,
		defaultValue = "br.com.seatecnologia.gdf.negocia.headless.dto.v1_0.IdentificadorCreditoEntityDTO",
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
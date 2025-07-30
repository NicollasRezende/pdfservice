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
@GraphQLName("UsuarioInfo")
@JsonFilter("Liferay.Vulcan")
@XmlRootElement(name = "UsuarioInfo")
public class UsuarioInfo implements Serializable {

	public static UsuarioInfo toDTO(String json) {
		return ObjectMapperUtil.readValue(UsuarioInfo.class, json);
	}

	public static UsuarioInfo unsafeToDTO(String json) {
		return ObjectMapperUtil.unsafeReadValue(UsuarioInfo.class, json);
	}

	@io.swagger.v3.oas.annotations.media.Schema
	public String getCpfcnpj() {
		if (_cpfcnpjSupplier != null) {
			cpfcnpj = _cpfcnpjSupplier.get();

			_cpfcnpjSupplier = null;
		}

		return cpfcnpj;
	}

	public void setCpfcnpj(String cpfcnpj) {
		this.cpfcnpj = cpfcnpj;

		_cpfcnpjSupplier = null;
	}

	@JsonIgnore
	public void setCpfcnpj(
		UnsafeSupplier<String, Exception> cpfcnpjUnsafeSupplier) {

		_cpfcnpjSupplier = () -> {
			try {
				return cpfcnpjUnsafeSupplier.get();
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
	protected String cpfcnpj;

	@JsonIgnore
	private Supplier<String> _cpfcnpjSupplier;

	@io.swagger.v3.oas.annotations.media.Schema
	public String getTipoLogin() {
		if (_tipoLoginSupplier != null) {
			tipoLogin = _tipoLoginSupplier.get();

			_tipoLoginSupplier = null;
		}

		return tipoLogin;
	}

	public void setTipoLogin(String tipoLogin) {
		this.tipoLogin = tipoLogin;

		_tipoLoginSupplier = null;
	}

	@JsonIgnore
	public void setTipoLogin(
		UnsafeSupplier<String, Exception> tipoLoginUnsafeSupplier) {

		_tipoLoginSupplier = () -> {
			try {
				return tipoLoginUnsafeSupplier.get();
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
	protected String tipoLogin;

	@JsonIgnore
	private Supplier<String> _tipoLoginSupplier;

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof UsuarioInfo)) {
			return false;
		}

		UsuarioInfo usuarioInfo = (UsuarioInfo)object;

		return Objects.equals(toString(), usuarioInfo.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		StringBundler sb = new StringBundler();

		sb.append("{");

		String cpfcnpj = getCpfcnpj();

		if (cpfcnpj != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"cpfcnpj\": ");

			sb.append("\"");

			sb.append(_escape(cpfcnpj));

			sb.append("\"");
		}

		String tipoLogin = getTipoLogin();

		if (tipoLogin != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"tipoLogin\": ");

			sb.append("\"");

			sb.append(_escape(tipoLogin));

			sb.append("\"");
		}

		sb.append("}");

		return sb.toString();
	}

	@io.swagger.v3.oas.annotations.media.Schema(
		accessMode = io.swagger.v3.oas.annotations.media.Schema.AccessMode.READ_ONLY,
		defaultValue = "br.com.seatecnologia.gdf.negocia.headless.dto.v1_0.UsuarioInfo",
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
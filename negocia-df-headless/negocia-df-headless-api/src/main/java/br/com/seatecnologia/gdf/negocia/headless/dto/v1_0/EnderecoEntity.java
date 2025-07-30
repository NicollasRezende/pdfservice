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
@GraphQLName("EnderecoEntity")
@JsonFilter("Liferay.Vulcan")
@XmlRootElement(name = "EnderecoEntity")
public class EnderecoEntity implements Serializable {

	public static EnderecoEntity toDTO(String json) {
		return ObjectMapperUtil.readValue(EnderecoEntity.class, json);
	}

	public static EnderecoEntity unsafeToDTO(String json) {
		return ObjectMapperUtil.unsafeReadValue(EnderecoEntity.class, json);
	}

	@io.swagger.v3.oas.annotations.media.Schema
	public String getBairro() {
		if (_bairroSupplier != null) {
			bairro = _bairroSupplier.get();

			_bairroSupplier = null;
		}

		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;

		_bairroSupplier = null;
	}

	@JsonIgnore
	public void setBairro(
		UnsafeSupplier<String, Exception> bairroUnsafeSupplier) {

		_bairroSupplier = () -> {
			try {
				return bairroUnsafeSupplier.get();
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
	protected String bairro;

	@JsonIgnore
	private Supplier<String> _bairroSupplier;

	@io.swagger.v3.oas.annotations.media.Schema
	public String getCep() {
		if (_cepSupplier != null) {
			cep = _cepSupplier.get();

			_cepSupplier = null;
		}

		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;

		_cepSupplier = null;
	}

	@JsonIgnore
	public void setCep(UnsafeSupplier<String, Exception> cepUnsafeSupplier) {
		_cepSupplier = () -> {
			try {
				return cepUnsafeSupplier.get();
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
	protected String cep;

	@JsonIgnore
	private Supplier<String> _cepSupplier;

	@io.swagger.v3.oas.annotations.media.Schema
	public String getComplemento() {
		if (_complementoSupplier != null) {
			complemento = _complementoSupplier.get();

			_complementoSupplier = null;
		}

		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;

		_complementoSupplier = null;
	}

	@JsonIgnore
	public void setComplemento(
		UnsafeSupplier<String, Exception> complementoUnsafeSupplier) {

		_complementoSupplier = () -> {
			try {
				return complementoUnsafeSupplier.get();
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
	protected String complemento;

	@JsonIgnore
	private Supplier<String> _complementoSupplier;

	@io.swagger.v3.oas.annotations.media.Schema
	public String getEndereco() {
		if (_enderecoSupplier != null) {
			endereco = _enderecoSupplier.get();

			_enderecoSupplier = null;
		}

		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;

		_enderecoSupplier = null;
	}

	@JsonIgnore
	public void setEndereco(
		UnsafeSupplier<String, Exception> enderecoUnsafeSupplier) {

		_enderecoSupplier = () -> {
			try {
				return enderecoUnsafeSupplier.get();
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
	protected String endereco;

	@JsonIgnore
	private Supplier<String> _enderecoSupplier;

	@io.swagger.v3.oas.annotations.media.Schema
	public String getEstado() {
		if (_estadoSupplier != null) {
			estado = _estadoSupplier.get();

			_estadoSupplier = null;
		}

		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;

		_estadoSupplier = null;
	}

	@JsonIgnore
	public void setEstado(
		UnsafeSupplier<String, Exception> estadoUnsafeSupplier) {

		_estadoSupplier = () -> {
			try {
				return estadoUnsafeSupplier.get();
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
	protected String estado;

	@JsonIgnore
	private Supplier<String> _estadoSupplier;

	@io.swagger.v3.oas.annotations.media.Schema
	public String getMunicipio() {
		if (_municipioSupplier != null) {
			municipio = _municipioSupplier.get();

			_municipioSupplier = null;
		}

		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;

		_municipioSupplier = null;
	}

	@JsonIgnore
	public void setMunicipio(
		UnsafeSupplier<String, Exception> municipioUnsafeSupplier) {

		_municipioSupplier = () -> {
			try {
				return municipioUnsafeSupplier.get();
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
	protected String municipio;

	@JsonIgnore
	private Supplier<String> _municipioSupplier;

	@io.swagger.v3.oas.annotations.media.Schema
	public String getNumero() {
		if (_numeroSupplier != null) {
			numero = _numeroSupplier.get();

			_numeroSupplier = null;
		}

		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;

		_numeroSupplier = null;
	}

	@JsonIgnore
	public void setNumero(
		UnsafeSupplier<String, Exception> numeroUnsafeSupplier) {

		_numeroSupplier = () -> {
			try {
				return numeroUnsafeSupplier.get();
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
	protected String numero;

	@JsonIgnore
	private Supplier<String> _numeroSupplier;

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof EnderecoEntity)) {
			return false;
		}

		EnderecoEntity enderecoEntity = (EnderecoEntity)object;

		return Objects.equals(toString(), enderecoEntity.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		StringBundler sb = new StringBundler();

		sb.append("{");

		String bairro = getBairro();

		if (bairro != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"bairro\": ");

			sb.append("\"");

			sb.append(_escape(bairro));

			sb.append("\"");
		}

		String cep = getCep();

		if (cep != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"cep\": ");

			sb.append("\"");

			sb.append(_escape(cep));

			sb.append("\"");
		}

		String complemento = getComplemento();

		if (complemento != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"complemento\": ");

			sb.append("\"");

			sb.append(_escape(complemento));

			sb.append("\"");
		}

		String endereco = getEndereco();

		if (endereco != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"endereco\": ");

			sb.append("\"");

			sb.append(_escape(endereco));

			sb.append("\"");
		}

		String estado = getEstado();

		if (estado != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"estado\": ");

			sb.append("\"");

			sb.append(_escape(estado));

			sb.append("\"");
		}

		String municipio = getMunicipio();

		if (municipio != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"municipio\": ");

			sb.append("\"");

			sb.append(_escape(municipio));

			sb.append("\"");
		}

		String numero = getNumero();

		if (numero != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"numero\": ");

			sb.append("\"");

			sb.append(_escape(numero));

			sb.append("\"");
		}

		sb.append("}");

		return sb.toString();
	}

	@io.swagger.v3.oas.annotations.media.Schema(
		accessMode = io.swagger.v3.oas.annotations.media.Schema.AccessMode.READ_ONLY,
		defaultValue = "br.com.seatecnologia.gdf.negocia.headless.dto.v1_0.EnderecoEntity",
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
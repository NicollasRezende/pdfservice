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

import javax.validation.Valid;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author sabrina
 * @generated
 */
@Generated("")
@GraphQLName("DadosRegistro")
@JsonFilter("Liferay.Vulcan")
@XmlRootElement(name = "DadosRegistro")
public class DadosRegistro implements Serializable {

	public static DadosRegistro toDTO(String json) {
		return ObjectMapperUtil.readValue(DadosRegistro.class, json);
	}

	public static DadosRegistro unsafeToDTO(String json) {
		return ObjectMapperUtil.unsafeReadValue(DadosRegistro.class, json);
	}

	@io.swagger.v3.oas.annotations.media.Schema
	public String getCartorioRegistro() {
		if (_cartorioRegistroSupplier != null) {
			cartorioRegistro = _cartorioRegistroSupplier.get();

			_cartorioRegistroSupplier = null;
		}

		return cartorioRegistro;
	}

	public void setCartorioRegistro(String cartorioRegistro) {
		this.cartorioRegistro = cartorioRegistro;

		_cartorioRegistroSupplier = null;
	}

	@JsonIgnore
	public void setCartorioRegistro(
		UnsafeSupplier<String, Exception> cartorioRegistroUnsafeSupplier) {

		_cartorioRegistroSupplier = () -> {
			try {
				return cartorioRegistroUnsafeSupplier.get();
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
	protected String cartorioRegistro;

	@JsonIgnore
	private Supplier<String> _cartorioRegistroSupplier;

	@io.swagger.v3.oas.annotations.media.Schema
	public String getMatriculaImovel() {
		if (_matriculaImovelSupplier != null) {
			matriculaImovel = _matriculaImovelSupplier.get();

			_matriculaImovelSupplier = null;
		}

		return matriculaImovel;
	}

	public void setMatriculaImovel(String matriculaImovel) {
		this.matriculaImovel = matriculaImovel;

		_matriculaImovelSupplier = null;
	}

	@JsonIgnore
	public void setMatriculaImovel(
		UnsafeSupplier<String, Exception> matriculaImovelUnsafeSupplier) {

		_matriculaImovelSupplier = () -> {
			try {
				return matriculaImovelUnsafeSupplier.get();
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
	protected String matriculaImovel;

	@JsonIgnore
	private Supplier<String> _matriculaImovelSupplier;

	@io.swagger.v3.oas.annotations.media.Schema
	@Valid
	public ArquivosEntity[] getOutrosDocumento() {
		if (_outrosDocumentoSupplier != null) {
			outrosDocumento = _outrosDocumentoSupplier.get();

			_outrosDocumentoSupplier = null;
		}

		return outrosDocumento;
	}

	public void setOutrosDocumento(ArquivosEntity[] outrosDocumento) {
		this.outrosDocumento = outrosDocumento;

		_outrosDocumentoSupplier = null;
	}

	@JsonIgnore
	public void setOutrosDocumento(
		UnsafeSupplier<ArquivosEntity[], Exception>
			outrosDocumentoUnsafeSupplier) {

		_outrosDocumentoSupplier = () -> {
			try {
				return outrosDocumentoUnsafeSupplier.get();
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
	protected ArquivosEntity[] outrosDocumento;

	@JsonIgnore
	private Supplier<ArquivosEntity[]> _outrosDocumentoSupplier;

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

		if (!(object instanceof DadosRegistro)) {
			return false;
		}

		DadosRegistro dadosRegistro = (DadosRegistro)object;

		return Objects.equals(toString(), dadosRegistro.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		StringBundler sb = new StringBundler();

		sb.append("{");

		String cartorioRegistro = getCartorioRegistro();

		if (cartorioRegistro != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"cartorioRegistro\": ");

			sb.append("\"");

			sb.append(_escape(cartorioRegistro));

			sb.append("\"");
		}

		String matriculaImovel = getMatriculaImovel();

		if (matriculaImovel != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"matriculaImovel\": ");

			sb.append("\"");

			sb.append(_escape(matriculaImovel));

			sb.append("\"");
		}

		ArquivosEntity[] outrosDocumento = getOutrosDocumento();

		if (outrosDocumento != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"outrosDocumento\": ");

			sb.append("[");

			for (int i = 0; i < outrosDocumento.length; i++) {
				sb.append(String.valueOf(outrosDocumento[i]));

				if ((i + 1) < outrosDocumento.length) {
					sb.append(", ");
				}
			}

			sb.append("]");
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
		defaultValue = "br.com.seatecnologia.gdf.negocia.headless.dto.v1_0.DadosRegistro",
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
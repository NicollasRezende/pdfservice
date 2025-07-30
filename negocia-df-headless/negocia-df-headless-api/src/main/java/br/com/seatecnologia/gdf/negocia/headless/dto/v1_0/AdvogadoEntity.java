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
@GraphQLName("AdvogadoEntity")
@JsonFilter("Liferay.Vulcan")
@XmlRootElement(name = "AdvogadoEntity")
public class AdvogadoEntity implements Serializable {

	public static AdvogadoEntity toDTO(String json) {
		return ObjectMapperUtil.readValue(AdvogadoEntity.class, json);
	}

	public static AdvogadoEntity unsafeToDTO(String json) {
		return ObjectMapperUtil.unsafeReadValue(AdvogadoEntity.class, json);
	}

	@io.swagger.v3.oas.annotations.media.Schema
	public Long getAdvogadoId() {
		if (_advogadoIdSupplier != null) {
			advogadoId = _advogadoIdSupplier.get();

			_advogadoIdSupplier = null;
		}

		return advogadoId;
	}

	public void setAdvogadoId(Long advogadoId) {
		this.advogadoId = advogadoId;

		_advogadoIdSupplier = null;
	}

	@JsonIgnore
	public void setAdvogadoId(
		UnsafeSupplier<Long, Exception> advogadoIdUnsafeSupplier) {

		_advogadoIdSupplier = () -> {
			try {
				return advogadoIdUnsafeSupplier.get();
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
	protected Long advogadoId;

	@JsonIgnore
	private Supplier<Long> _advogadoIdSupplier;

	@io.swagger.v3.oas.annotations.media.Schema
	@Valid
	public ArquivosEntity getCarteirinhaOAB() {
		if (_carteirinhaOABSupplier != null) {
			carteirinhaOAB = _carteirinhaOABSupplier.get();

			_carteirinhaOABSupplier = null;
		}

		return carteirinhaOAB;
	}

	public void setCarteirinhaOAB(ArquivosEntity carteirinhaOAB) {
		this.carteirinhaOAB = carteirinhaOAB;

		_carteirinhaOABSupplier = null;
	}

	@JsonIgnore
	public void setCarteirinhaOAB(
		UnsafeSupplier<ArquivosEntity, Exception>
			carteirinhaOABUnsafeSupplier) {

		_carteirinhaOABSupplier = () -> {
			try {
				return carteirinhaOABUnsafeSupplier.get();
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
	protected ArquivosEntity carteirinhaOAB;

	@JsonIgnore
	private Supplier<ArquivosEntity> _carteirinhaOABSupplier;

	@io.swagger.v3.oas.annotations.media.Schema
	public String getNumeroOab() {
		if (_numeroOabSupplier != null) {
			numeroOab = _numeroOabSupplier.get();

			_numeroOabSupplier = null;
		}

		return numeroOab;
	}

	public void setNumeroOab(String numeroOab) {
		this.numeroOab = numeroOab;

		_numeroOabSupplier = null;
	}

	@JsonIgnore
	public void setNumeroOab(
		UnsafeSupplier<String, Exception> numeroOabUnsafeSupplier) {

		_numeroOabSupplier = () -> {
			try {
				return numeroOabUnsafeSupplier.get();
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
	protected String numeroOab;

	@JsonIgnore
	private Supplier<String> _numeroOabSupplier;

	@io.swagger.v3.oas.annotations.media.Schema
	@Valid
	public QualificacaoCompletaEntity getQualificacao() {
		if (_qualificacaoSupplier != null) {
			qualificacao = _qualificacaoSupplier.get();

			_qualificacaoSupplier = null;
		}

		return qualificacao;
	}

	public void setQualificacao(QualificacaoCompletaEntity qualificacao) {
		this.qualificacao = qualificacao;

		_qualificacaoSupplier = null;
	}

	@JsonIgnore
	public void setQualificacao(
		UnsafeSupplier<QualificacaoCompletaEntity, Exception>
			qualificacaoUnsafeSupplier) {

		_qualificacaoSupplier = () -> {
			try {
				return qualificacaoUnsafeSupplier.get();
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
	protected QualificacaoCompletaEntity qualificacao;

	@JsonIgnore
	private Supplier<QualificacaoCompletaEntity> _qualificacaoSupplier;

	@io.swagger.v3.oas.annotations.media.Schema
	public String getSeccional() {
		if (_seccionalSupplier != null) {
			seccional = _seccionalSupplier.get();

			_seccionalSupplier = null;
		}

		return seccional;
	}

	public void setSeccional(String seccional) {
		this.seccional = seccional;

		_seccionalSupplier = null;
	}

	@JsonIgnore
	public void setSeccional(
		UnsafeSupplier<String, Exception> seccionalUnsafeSupplier) {

		_seccionalSupplier = () -> {
			try {
				return seccionalUnsafeSupplier.get();
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
	protected String seccional;

	@JsonIgnore
	private Supplier<String> _seccionalSupplier;

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof AdvogadoEntity)) {
			return false;
		}

		AdvogadoEntity advogadoEntity = (AdvogadoEntity)object;

		return Objects.equals(toString(), advogadoEntity.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		StringBundler sb = new StringBundler();

		sb.append("{");

		Long advogadoId = getAdvogadoId();

		if (advogadoId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"advogadoId\": ");

			sb.append(advogadoId);
		}

		ArquivosEntity carteirinhaOAB = getCarteirinhaOAB();

		if (carteirinhaOAB != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"carteirinhaOAB\": ");

			sb.append(String.valueOf(carteirinhaOAB));
		}

		String numeroOab = getNumeroOab();

		if (numeroOab != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"numeroOab\": ");

			sb.append("\"");

			sb.append(_escape(numeroOab));

			sb.append("\"");
		}

		QualificacaoCompletaEntity qualificacao = getQualificacao();

		if (qualificacao != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"qualificacao\": ");

			sb.append(String.valueOf(qualificacao));
		}

		String seccional = getSeccional();

		if (seccional != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"seccional\": ");

			sb.append("\"");

			sb.append(_escape(seccional));

			sb.append("\"");
		}

		sb.append("}");

		return sb.toString();
	}

	@io.swagger.v3.oas.annotations.media.Schema(
		accessMode = io.swagger.v3.oas.annotations.media.Schema.AccessMode.READ_ONLY,
		defaultValue = "br.com.seatecnologia.gdf.negocia.headless.dto.v1_0.AdvogadoEntity",
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
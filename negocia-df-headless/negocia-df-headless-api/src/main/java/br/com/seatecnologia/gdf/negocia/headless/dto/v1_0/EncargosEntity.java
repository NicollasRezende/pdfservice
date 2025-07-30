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
@GraphQLName("EncargosEntity")
@JsonFilter("Liferay.Vulcan")
@XmlRootElement(name = "EncargosEntity")
public class EncargosEntity implements Serializable {

	public static EncargosEntity toDTO(String json) {
		return ObjectMapperUtil.readValue(EncargosEntity.class, json);
	}

	public static EncargosEntity unsafeToDTO(String json) {
		return ObjectMapperUtil.unsafeReadValue(EncargosEntity.class, json);
	}

	@io.swagger.v3.oas.annotations.media.Schema
	public String getDescricaoEncargos() {
		if (_descricaoEncargosSupplier != null) {
			descricaoEncargos = _descricaoEncargosSupplier.get();

			_descricaoEncargosSupplier = null;
		}

		return descricaoEncargos;
	}

	public void setDescricaoEncargos(String descricaoEncargos) {
		this.descricaoEncargos = descricaoEncargos;

		_descricaoEncargosSupplier = null;
	}

	@JsonIgnore
	public void setDescricaoEncargos(
		UnsafeSupplier<String, Exception> descricaoEncargosUnsafeSupplier) {

		_descricaoEncargosSupplier = () -> {
			try {
				return descricaoEncargosUnsafeSupplier.get();
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
	protected String descricaoEncargos;

	@JsonIgnore
	private Supplier<String> _descricaoEncargosSupplier;

	@io.swagger.v3.oas.annotations.media.Schema
	public Long getEncargoId() {
		if (_encargoIdSupplier != null) {
			encargoId = _encargoIdSupplier.get();

			_encargoIdSupplier = null;
		}

		return encargoId;
	}

	public void setEncargoId(Long encargoId) {
		this.encargoId = encargoId;

		_encargoIdSupplier = null;
	}

	@JsonIgnore
	public void setEncargoId(
		UnsafeSupplier<Long, Exception> encargoIdUnsafeSupplier) {

		_encargoIdSupplier = () -> {
			try {
				return encargoIdUnsafeSupplier.get();
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
	protected Long encargoId;

	@JsonIgnore
	private Supplier<Long> _encargoIdSupplier;

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
	public Double getValorEncargos() {
		if (_valorEncargosSupplier != null) {
			valorEncargos = _valorEncargosSupplier.get();

			_valorEncargosSupplier = null;
		}

		return valorEncargos;
	}

	public void setValorEncargos(Double valorEncargos) {
		this.valorEncargos = valorEncargos;

		_valorEncargosSupplier = null;
	}

	@JsonIgnore
	public void setValorEncargos(
		UnsafeSupplier<Double, Exception> valorEncargosUnsafeSupplier) {

		_valorEncargosSupplier = () -> {
			try {
				return valorEncargosUnsafeSupplier.get();
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
	protected Double valorEncargos;

	@JsonIgnore
	private Supplier<Double> _valorEncargosSupplier;

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof EncargosEntity)) {
			return false;
		}

		EncargosEntity encargosEntity = (EncargosEntity)object;

		return Objects.equals(toString(), encargosEntity.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		StringBundler sb = new StringBundler();

		sb.append("{");

		String descricaoEncargos = getDescricaoEncargos();

		if (descricaoEncargos != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"descricaoEncargos\": ");

			sb.append("\"");

			sb.append(_escape(descricaoEncargos));

			sb.append("\"");
		}

		Long encargoId = getEncargoId();

		if (encargoId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"encargoId\": ");

			sb.append(encargoId);
		}

		Long propostaId = getPropostaId();

		if (propostaId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"propostaId\": ");

			sb.append(propostaId);
		}

		Double valorEncargos = getValorEncargos();

		if (valorEncargos != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"valorEncargos\": ");

			sb.append(valorEncargos);
		}

		sb.append("}");

		return sb.toString();
	}

	@io.swagger.v3.oas.annotations.media.Schema(
		accessMode = io.swagger.v3.oas.annotations.media.Schema.AccessMode.READ_ONLY,
		defaultValue = "br.com.seatecnologia.gdf.negocia.headless.dto.v1_0.EncargosEntity",
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
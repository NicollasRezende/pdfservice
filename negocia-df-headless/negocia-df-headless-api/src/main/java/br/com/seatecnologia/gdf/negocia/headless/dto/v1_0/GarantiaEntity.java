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
@GraphQLName("GarantiaEntity")
@JsonFilter("Liferay.Vulcan")
@XmlRootElement(name = "GarantiaEntity")
public class GarantiaEntity implements Serializable {

	public static GarantiaEntity toDTO(String json) {
		return ObjectMapperUtil.readValue(GarantiaEntity.class, json);
	}

	public static GarantiaEntity unsafeToDTO(String json) {
		return ObjectMapperUtil.unsafeReadValue(GarantiaEntity.class, json);
	}

	@io.swagger.v3.oas.annotations.media.Schema
	@Valid
	public GarantiaDetalhadaEntity[] getGarantiaDetalhadaEntities() {
		if (_garantiaDetalhadaEntitiesSupplier != null) {
			garantiaDetalhadaEntities =
				_garantiaDetalhadaEntitiesSupplier.get();

			_garantiaDetalhadaEntitiesSupplier = null;
		}

		return garantiaDetalhadaEntities;
	}

	public void setGarantiaDetalhadaEntities(
		GarantiaDetalhadaEntity[] garantiaDetalhadaEntities) {

		this.garantiaDetalhadaEntities = garantiaDetalhadaEntities;

		_garantiaDetalhadaEntitiesSupplier = null;
	}

	@JsonIgnore
	public void setGarantiaDetalhadaEntities(
		UnsafeSupplier<GarantiaDetalhadaEntity[], Exception>
			garantiaDetalhadaEntitiesUnsafeSupplier) {

		_garantiaDetalhadaEntitiesSupplier = () -> {
			try {
				return garantiaDetalhadaEntitiesUnsafeSupplier.get();
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
	protected GarantiaDetalhadaEntity[] garantiaDetalhadaEntities;

	@JsonIgnore
	private Supplier<GarantiaDetalhadaEntity[]>
		_garantiaDetalhadaEntitiesSupplier;

	@io.swagger.v3.oas.annotations.media.Schema
	public String getTipoDevedor() {
		if (_tipoDevedorSupplier != null) {
			tipoDevedor = _tipoDevedorSupplier.get();

			_tipoDevedorSupplier = null;
		}

		return tipoDevedor;
	}

	public void setTipoDevedor(String tipoDevedor) {
		this.tipoDevedor = tipoDevedor;

		_tipoDevedorSupplier = null;
	}

	@JsonIgnore
	public void setTipoDevedor(
		UnsafeSupplier<String, Exception> tipoDevedorUnsafeSupplier) {

		_tipoDevedorSupplier = () -> {
			try {
				return tipoDevedorUnsafeSupplier.get();
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
	protected String tipoDevedor;

	@JsonIgnore
	private Supplier<String> _tipoDevedorSupplier;

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof GarantiaEntity)) {
			return false;
		}

		GarantiaEntity garantiaEntity = (GarantiaEntity)object;

		return Objects.equals(toString(), garantiaEntity.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		StringBundler sb = new StringBundler();

		sb.append("{");

		GarantiaDetalhadaEntity[] garantiaDetalhadaEntities =
			getGarantiaDetalhadaEntities();

		if (garantiaDetalhadaEntities != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"garantiaDetalhadaEntities\": ");

			sb.append("[");

			for (int i = 0; i < garantiaDetalhadaEntities.length; i++) {
				sb.append(String.valueOf(garantiaDetalhadaEntities[i]));

				if ((i + 1) < garantiaDetalhadaEntities.length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		String tipoDevedor = getTipoDevedor();

		if (tipoDevedor != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"tipoDevedor\": ");

			sb.append("\"");

			sb.append(_escape(tipoDevedor));

			sb.append("\"");
		}

		sb.append("}");

		return sb.toString();
	}

	@io.swagger.v3.oas.annotations.media.Schema(
		accessMode = io.swagger.v3.oas.annotations.media.Schema.AccessMode.READ_ONLY,
		defaultValue = "br.com.seatecnologia.gdf.negocia.headless.dto.v1_0.GarantiaEntity",
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
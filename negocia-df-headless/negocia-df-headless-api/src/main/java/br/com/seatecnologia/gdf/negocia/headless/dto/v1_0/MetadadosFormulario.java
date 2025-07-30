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
@GraphQLName("MetadadosFormulario")
@JsonFilter("Liferay.Vulcan")
@XmlRootElement(name = "MetadadosFormulario")
public class MetadadosFormulario implements Serializable {

	public static MetadadosFormulario toDTO(String json) {
		return ObjectMapperUtil.readValue(MetadadosFormulario.class, json);
	}

	public static MetadadosFormulario unsafeToDTO(String json) {
		return ObjectMapperUtil.unsafeReadValue(
			MetadadosFormulario.class, json);
	}

	@io.swagger.v3.oas.annotations.media.Schema
	public Long getDlFolderId() {
		if (_dlFolderIdSupplier != null) {
			dlFolderId = _dlFolderIdSupplier.get();

			_dlFolderIdSupplier = null;
		}

		return dlFolderId;
	}

	public void setDlFolderId(Long dlFolderId) {
		this.dlFolderId = dlFolderId;

		_dlFolderIdSupplier = null;
	}

	@JsonIgnore
	public void setDlFolderId(
		UnsafeSupplier<Long, Exception> dlFolderIdUnsafeSupplier) {

		_dlFolderIdSupplier = () -> {
			try {
				return dlFolderIdUnsafeSupplier.get();
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
	protected Long dlFolderId;

	@JsonIgnore
	private Supplier<Long> _dlFolderIdSupplier;

	@io.swagger.v3.oas.annotations.media.Schema
	@Valid
	public EditalEntity[] getEditalEntities() {
		if (_editalEntitiesSupplier != null) {
			editalEntities = _editalEntitiesSupplier.get();

			_editalEntitiesSupplier = null;
		}

		return editalEntities;
	}

	public void setEditalEntities(EditalEntity[] editalEntities) {
		this.editalEntities = editalEntities;

		_editalEntitiesSupplier = null;
	}

	@JsonIgnore
	public void setEditalEntities(
		UnsafeSupplier<EditalEntity[], Exception>
			editalEntitiesUnsafeSupplier) {

		_editalEntitiesSupplier = () -> {
			try {
				return editalEntitiesUnsafeSupplier.get();
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
	protected EditalEntity[] editalEntities;

	@JsonIgnore
	private Supplier<EditalEntity[]> _editalEntitiesSupplier;

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof MetadadosFormulario)) {
			return false;
		}

		MetadadosFormulario metadadosFormulario = (MetadadosFormulario)object;

		return Objects.equals(toString(), metadadosFormulario.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		StringBundler sb = new StringBundler();

		sb.append("{");

		Long dlFolderId = getDlFolderId();

		if (dlFolderId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"dlFolderId\": ");

			sb.append(dlFolderId);
		}

		EditalEntity[] editalEntities = getEditalEntities();

		if (editalEntities != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"editalEntities\": ");

			sb.append("[");

			for (int i = 0; i < editalEntities.length; i++) {
				sb.append(String.valueOf(editalEntities[i]));

				if ((i + 1) < editalEntities.length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		sb.append("}");

		return sb.toString();
	}

	@io.swagger.v3.oas.annotations.media.Schema(
		accessMode = io.swagger.v3.oas.annotations.media.Schema.AccessMode.READ_ONLY,
		defaultValue = "br.com.seatecnologia.gdf.negocia.headless.dto.v1_0.MetadadosFormulario",
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
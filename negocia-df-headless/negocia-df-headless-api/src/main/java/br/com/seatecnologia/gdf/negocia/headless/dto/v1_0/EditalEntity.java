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
@GraphQLName("EditalEntity")
@JsonFilter("Liferay.Vulcan")
@XmlRootElement(name = "EditalEntity")
public class EditalEntity implements Serializable {

	public static EditalEntity toDTO(String json) {
		return ObjectMapperUtil.readValue(EditalEntity.class, json);
	}

	public static EditalEntity unsafeToDTO(String json) {
		return ObjectMapperUtil.unsafeReadValue(EditalEntity.class, json);
	}

	@io.swagger.v3.oas.annotations.media.Schema
	public Date getDataFim() {
		if (_dataFimSupplier != null) {
			dataFim = _dataFimSupplier.get();

			_dataFimSupplier = null;
		}

		return dataFim;
	}

	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;

		_dataFimSupplier = null;
	}

	@JsonIgnore
	public void setDataFim(
		UnsafeSupplier<Date, Exception> dataFimUnsafeSupplier) {

		_dataFimSupplier = () -> {
			try {
				return dataFimUnsafeSupplier.get();
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
	protected Date dataFim;

	@JsonIgnore
	private Supplier<Date> _dataFimSupplier;

	@io.swagger.v3.oas.annotations.media.Schema
	public Date getDataInicio() {
		if (_dataInicioSupplier != null) {
			dataInicio = _dataInicioSupplier.get();

			_dataInicioSupplier = null;
		}

		return dataInicio;
	}

	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;

		_dataInicioSupplier = null;
	}

	@JsonIgnore
	public void setDataInicio(
		UnsafeSupplier<Date, Exception> dataInicioUnsafeSupplier) {

		_dataInicioSupplier = () -> {
			try {
				return dataInicioUnsafeSupplier.get();
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
	protected Date dataInicio;

	@JsonIgnore
	private Supplier<Date> _dataInicioSupplier;

	@io.swagger.v3.oas.annotations.media.Schema
	public String getDescricao() {
		if (_descricaoSupplier != null) {
			descricao = _descricaoSupplier.get();

			_descricaoSupplier = null;
		}

		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;

		_descricaoSupplier = null;
	}

	@JsonIgnore
	public void setDescricao(
		UnsafeSupplier<String, Exception> descricaoUnsafeSupplier) {

		_descricaoSupplier = () -> {
			try {
				return descricaoUnsafeSupplier.get();
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
	protected String descricao;

	@JsonIgnore
	private Supplier<String> _descricaoSupplier;

	@io.swagger.v3.oas.annotations.media.Schema
	public Long getEditalId() {
		if (_editalIdSupplier != null) {
			editalId = _editalIdSupplier.get();

			_editalIdSupplier = null;
		}

		return editalId;
	}

	public void setEditalId(Long editalId) {
		this.editalId = editalId;

		_editalIdSupplier = null;
	}

	@JsonIgnore
	public void setEditalId(
		UnsafeSupplier<Long, Exception> editalIdUnsafeSupplier) {

		_editalIdSupplier = () -> {
			try {
				return editalIdUnsafeSupplier.get();
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
	protected Long editalId;

	@JsonIgnore
	private Supplier<Long> _editalIdSupplier;

	@io.swagger.v3.oas.annotations.media.Schema
	public String getTitulo() {
		if (_tituloSupplier != null) {
			titulo = _tituloSupplier.get();

			_tituloSupplier = null;
		}

		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;

		_tituloSupplier = null;
	}

	@JsonIgnore
	public void setTitulo(
		UnsafeSupplier<String, Exception> tituloUnsafeSupplier) {

		_tituloSupplier = () -> {
			try {
				return tituloUnsafeSupplier.get();
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
	protected String titulo;

	@JsonIgnore
	private Supplier<String> _tituloSupplier;

	@io.swagger.v3.oas.annotations.media.Schema
	public String getUrlArquivo() {
		if (_urlArquivoSupplier != null) {
			urlArquivo = _urlArquivoSupplier.get();

			_urlArquivoSupplier = null;
		}

		return urlArquivo;
	}

	public void setUrlArquivo(String urlArquivo) {
		this.urlArquivo = urlArquivo;

		_urlArquivoSupplier = null;
	}

	@JsonIgnore
	public void setUrlArquivo(
		UnsafeSupplier<String, Exception> urlArquivoUnsafeSupplier) {

		_urlArquivoSupplier = () -> {
			try {
				return urlArquivoUnsafeSupplier.get();
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
	protected String urlArquivo;

	@JsonIgnore
	private Supplier<String> _urlArquivoSupplier;

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof EditalEntity)) {
			return false;
		}

		EditalEntity editalEntity = (EditalEntity)object;

		return Objects.equals(toString(), editalEntity.toString());
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

		Date dataFim = getDataFim();

		if (dataFim != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"dataFim\": ");

			sb.append("\"");

			sb.append(liferayToJSONDateFormat.format(dataFim));

			sb.append("\"");
		}

		Date dataInicio = getDataInicio();

		if (dataInicio != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"dataInicio\": ");

			sb.append("\"");

			sb.append(liferayToJSONDateFormat.format(dataInicio));

			sb.append("\"");
		}

		String descricao = getDescricao();

		if (descricao != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"descricao\": ");

			sb.append("\"");

			sb.append(_escape(descricao));

			sb.append("\"");
		}

		Long editalId = getEditalId();

		if (editalId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"editalId\": ");

			sb.append(editalId);
		}

		String titulo = getTitulo();

		if (titulo != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"titulo\": ");

			sb.append("\"");

			sb.append(_escape(titulo));

			sb.append("\"");
		}

		String urlArquivo = getUrlArquivo();

		if (urlArquivo != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"urlArquivo\": ");

			sb.append("\"");

			sb.append(_escape(urlArquivo));

			sb.append("\"");
		}

		sb.append("}");

		return sb.toString();
	}

	@io.swagger.v3.oas.annotations.media.Schema(
		accessMode = io.swagger.v3.oas.annotations.media.Schema.AccessMode.READ_ONLY,
		defaultValue = "br.com.seatecnologia.gdf.negocia.headless.dto.v1_0.EditalEntity",
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
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
@GraphQLName("TermosAssinadoEntity")
@JsonFilter("Liferay.Vulcan")
@XmlRootElement(name = "TermosAssinadoEntity")
public class TermosAssinadoEntity implements Serializable {

	public static TermosAssinadoEntity toDTO(String json) {
		return ObjectMapperUtil.readValue(TermosAssinadoEntity.class, json);
	}

	public static TermosAssinadoEntity unsafeToDTO(String json) {
		return ObjectMapperUtil.unsafeReadValue(
			TermosAssinadoEntity.class, json);
	}

	@io.swagger.v3.oas.annotations.media.Schema
	@Valid
	public ArquivosEntity getArquivoPdf() {
		if (_arquivoPdfSupplier != null) {
			arquivoPdf = _arquivoPdfSupplier.get();

			_arquivoPdfSupplier = null;
		}

		return arquivoPdf;
	}

	public void setArquivoPdf(ArquivosEntity arquivoPdf) {
		this.arquivoPdf = arquivoPdf;

		_arquivoPdfSupplier = null;
	}

	@JsonIgnore
	public void setArquivoPdf(
		UnsafeSupplier<ArquivosEntity, Exception> arquivoPdfUnsafeSupplier) {

		_arquivoPdfSupplier = () -> {
			try {
				return arquivoPdfUnsafeSupplier.get();
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
	protected ArquivosEntity arquivoPdf;

	@JsonIgnore
	private Supplier<ArquivosEntity> _arquivoPdfSupplier;

	@io.swagger.v3.oas.annotations.media.Schema
	public String getParte() {
		if (_parteSupplier != null) {
			parte = _parteSupplier.get();

			_parteSupplier = null;
		}

		return parte;
	}

	public void setParte(String parte) {
		this.parte = parte;

		_parteSupplier = null;
	}

	@JsonIgnore
	public void setParte(
		UnsafeSupplier<String, Exception> parteUnsafeSupplier) {

		_parteSupplier = () -> {
			try {
				return parteUnsafeSupplier.get();
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
	protected String parte;

	@JsonIgnore
	private Supplier<String> _parteSupplier;

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
	public Long getTermosAssinadoId() {
		if (_termosAssinadoIdSupplier != null) {
			termosAssinadoId = _termosAssinadoIdSupplier.get();

			_termosAssinadoIdSupplier = null;
		}

		return termosAssinadoId;
	}

	public void setTermosAssinadoId(Long termosAssinadoId) {
		this.termosAssinadoId = termosAssinadoId;

		_termosAssinadoIdSupplier = null;
	}

	@JsonIgnore
	public void setTermosAssinadoId(
		UnsafeSupplier<Long, Exception> termosAssinadoIdUnsafeSupplier) {

		_termosAssinadoIdSupplier = () -> {
			try {
				return termosAssinadoIdUnsafeSupplier.get();
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
	protected Long termosAssinadoId;

	@JsonIgnore
	private Supplier<Long> _termosAssinadoIdSupplier;

	@io.swagger.v3.oas.annotations.media.Schema
	public String getUrlTermo() {
		if (_urlTermoSupplier != null) {
			urlTermo = _urlTermoSupplier.get();

			_urlTermoSupplier = null;
		}

		return urlTermo;
	}

	public void setUrlTermo(String urlTermo) {
		this.urlTermo = urlTermo;

		_urlTermoSupplier = null;
	}

	@JsonIgnore
	public void setUrlTermo(
		UnsafeSupplier<String, Exception> urlTermoUnsafeSupplier) {

		_urlTermoSupplier = () -> {
			try {
				return urlTermoUnsafeSupplier.get();
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
	protected String urlTermo;

	@JsonIgnore
	private Supplier<String> _urlTermoSupplier;

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof TermosAssinadoEntity)) {
			return false;
		}

		TermosAssinadoEntity termosAssinadoEntity =
			(TermosAssinadoEntity)object;

		return Objects.equals(toString(), termosAssinadoEntity.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		StringBundler sb = new StringBundler();

		sb.append("{");

		ArquivosEntity arquivoPdf = getArquivoPdf();

		if (arquivoPdf != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"arquivoPdf\": ");

			sb.append(String.valueOf(arquivoPdf));
		}

		String parte = getParte();

		if (parte != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"parte\": ");

			sb.append("\"");

			sb.append(_escape(parte));

			sb.append("\"");
		}

		Long propostaId = getPropostaId();

		if (propostaId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"propostaId\": ");

			sb.append(propostaId);
		}

		Long termosAssinadoId = getTermosAssinadoId();

		if (termosAssinadoId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"termosAssinadoId\": ");

			sb.append(termosAssinadoId);
		}

		String urlTermo = getUrlTermo();

		if (urlTermo != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"urlTermo\": ");

			sb.append("\"");

			sb.append(_escape(urlTermo));

			sb.append("\"");
		}

		sb.append("}");

		return sb.toString();
	}

	@io.swagger.v3.oas.annotations.media.Schema(
		accessMode = io.swagger.v3.oas.annotations.media.Schema.AccessMode.READ_ONLY,
		defaultValue = "br.com.seatecnologia.gdf.negocia.headless.dto.v1_0.TermosAssinadoEntity",
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
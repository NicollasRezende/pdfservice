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
@GraphQLName("PropostaEntityList")
@JsonFilter("Liferay.Vulcan")
@XmlRootElement(name = "PropostaEntityList")
public class PropostaEntityList implements Serializable {

	public static PropostaEntityList toDTO(String json) {
		return ObjectMapperUtil.readValue(PropostaEntityList.class, json);
	}

	public static PropostaEntityList unsafeToDTO(String json) {
		return ObjectMapperUtil.unsafeReadValue(PropostaEntityList.class, json);
	}

	@io.swagger.v3.oas.annotations.media.Schema
	public String getCpfCnpj() {
		if (_cpfCnpjSupplier != null) {
			cpfCnpj = _cpfCnpjSupplier.get();

			_cpfCnpjSupplier = null;
		}

		return cpfCnpj;
	}

	public void setCpfCnpj(String cpfCnpj) {
		this.cpfCnpj = cpfCnpj;

		_cpfCnpjSupplier = null;
	}

	@JsonIgnore
	public void setCpfCnpj(
		UnsafeSupplier<String, Exception> cpfCnpjUnsafeSupplier) {

		_cpfCnpjSupplier = () -> {
			try {
				return cpfCnpjUnsafeSupplier.get();
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
	protected String cpfCnpj;

	@JsonIgnore
	private Supplier<String> _cpfCnpjSupplier;

	@io.swagger.v3.oas.annotations.media.Schema
	public Date getCreateDate() {
		if (_createDateSupplier != null) {
			createDate = _createDateSupplier.get();

			_createDateSupplier = null;
		}

		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;

		_createDateSupplier = null;
	}

	@JsonIgnore
	public void setCreateDate(
		UnsafeSupplier<Date, Exception> createDateUnsafeSupplier) {

		_createDateSupplier = () -> {
			try {
				return createDateUnsafeSupplier.get();
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
	protected Date createDate;

	@JsonIgnore
	private Supplier<Date> _createDateSupplier;

	@io.swagger.v3.oas.annotations.media.Schema
	public String getDocumentosPropostaUrl() {
		if (_documentosPropostaUrlSupplier != null) {
			documentosPropostaUrl = _documentosPropostaUrlSupplier.get();

			_documentosPropostaUrlSupplier = null;
		}

		return documentosPropostaUrl;
	}

	public void setDocumentosPropostaUrl(String documentosPropostaUrl) {
		this.documentosPropostaUrl = documentosPropostaUrl;

		_documentosPropostaUrlSupplier = null;
	}

	@JsonIgnore
	public void setDocumentosPropostaUrl(
		UnsafeSupplier<String, Exception> documentosPropostaUrlUnsafeSupplier) {

		_documentosPropostaUrlSupplier = () -> {
			try {
				return documentosPropostaUrlUnsafeSupplier.get();
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
	protected String documentosPropostaUrl;

	@JsonIgnore
	private Supplier<String> _documentosPropostaUrlSupplier;

	@io.swagger.v3.oas.annotations.media.Schema
	public String getEditalUrl() {
		if (_editalUrlSupplier != null) {
			editalUrl = _editalUrlSupplier.get();

			_editalUrlSupplier = null;
		}

		return editalUrl;
	}

	public void setEditalUrl(String editalUrl) {
		this.editalUrl = editalUrl;

		_editalUrlSupplier = null;
	}

	@JsonIgnore
	public void setEditalUrl(
		UnsafeSupplier<String, Exception> editalUrlUnsafeSupplier) {

		_editalUrlSupplier = () -> {
			try {
				return editalUrlUnsafeSupplier.get();
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
	protected String editalUrl;

	@JsonIgnore
	private Supplier<String> _editalUrlSupplier;

	@io.swagger.v3.oas.annotations.media.Schema
	public Date getModifiedDate() {
		if (_modifiedDateSupplier != null) {
			modifiedDate = _modifiedDateSupplier.get();

			_modifiedDateSupplier = null;
		}

		return modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;

		_modifiedDateSupplier = null;
	}

	@JsonIgnore
	public void setModifiedDate(
		UnsafeSupplier<Date, Exception> modifiedDateUnsafeSupplier) {

		_modifiedDateSupplier = () -> {
			try {
				return modifiedDateUnsafeSupplier.get();
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
	protected Date modifiedDate;

	@JsonIgnore
	private Supplier<Date> _modifiedDateSupplier;

	@io.swagger.v3.oas.annotations.media.Schema
	public String getNumeroProtocoloSEI() {
		if (_numeroProtocoloSEISupplier != null) {
			numeroProtocoloSEI = _numeroProtocoloSEISupplier.get();

			_numeroProtocoloSEISupplier = null;
		}

		return numeroProtocoloSEI;
	}

	public void setNumeroProtocoloSEI(String numeroProtocoloSEI) {
		this.numeroProtocoloSEI = numeroProtocoloSEI;

		_numeroProtocoloSEISupplier = null;
	}

	@JsonIgnore
	public void setNumeroProtocoloSEI(
		UnsafeSupplier<String, Exception> numeroProtocoloSEIUnsafeSupplier) {

		_numeroProtocoloSEISupplier = () -> {
			try {
				return numeroProtocoloSEIUnsafeSupplier.get();
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
	protected String numeroProtocoloSEI;

	@JsonIgnore
	private Supplier<String> _numeroProtocoloSEISupplier;

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
	public String getProtocolo() {
		if (_protocoloSupplier != null) {
			protocolo = _protocoloSupplier.get();

			_protocoloSupplier = null;
		}

		return protocolo;
	}

	public void setProtocolo(String protocolo) {
		this.protocolo = protocolo;

		_protocoloSupplier = null;
	}

	@JsonIgnore
	public void setProtocolo(
		UnsafeSupplier<String, Exception> protocoloUnsafeSupplier) {

		_protocoloSupplier = () -> {
			try {
				return protocoloUnsafeSupplier.get();
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
	protected String protocolo;

	@JsonIgnore
	private Supplier<String> _protocoloSupplier;

	@io.swagger.v3.oas.annotations.media.Schema
	public String getStatus() {
		if (_statusSupplier != null) {
			status = _statusSupplier.get();

			_statusSupplier = null;
		}

		return status;
	}

	public void setStatus(String status) {
		this.status = status;

		_statusSupplier = null;
	}

	@JsonIgnore
	public void setStatus(
		UnsafeSupplier<String, Exception> statusUnsafeSupplier) {

		_statusSupplier = () -> {
			try {
				return statusUnsafeSupplier.get();
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
	protected String status;

	@JsonIgnore
	private Supplier<String> _statusSupplier;

	@io.swagger.v3.oas.annotations.media.Schema
	public String getTipoProposta() {
		if (_tipoPropostaSupplier != null) {
			tipoProposta = _tipoPropostaSupplier.get();

			_tipoPropostaSupplier = null;
		}

		return tipoProposta;
	}

	public void setTipoProposta(String tipoProposta) {
		this.tipoProposta = tipoProposta;

		_tipoPropostaSupplier = null;
	}

	@JsonIgnore
	public void setTipoProposta(
		UnsafeSupplier<String, Exception> tipoPropostaUnsafeSupplier) {

		_tipoPropostaSupplier = () -> {
			try {
				return tipoPropostaUnsafeSupplier.get();
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
	protected String tipoProposta;

	@JsonIgnore
	private Supplier<String> _tipoPropostaSupplier;

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof PropostaEntityList)) {
			return false;
		}

		PropostaEntityList propostaEntityList = (PropostaEntityList)object;

		return Objects.equals(toString(), propostaEntityList.toString());
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

		String cpfCnpj = getCpfCnpj();

		if (cpfCnpj != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"cpfCnpj\": ");

			sb.append("\"");

			sb.append(_escape(cpfCnpj));

			sb.append("\"");
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"createDate\": ");

			sb.append("\"");

			sb.append(liferayToJSONDateFormat.format(createDate));

			sb.append("\"");
		}

		String documentosPropostaUrl = getDocumentosPropostaUrl();

		if (documentosPropostaUrl != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"documentosPropostaUrl\": ");

			sb.append("\"");

			sb.append(_escape(documentosPropostaUrl));

			sb.append("\"");
		}

		String editalUrl = getEditalUrl();

		if (editalUrl != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"editalUrl\": ");

			sb.append("\"");

			sb.append(_escape(editalUrl));

			sb.append("\"");
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"modifiedDate\": ");

			sb.append("\"");

			sb.append(liferayToJSONDateFormat.format(modifiedDate));

			sb.append("\"");
		}

		String numeroProtocoloSEI = getNumeroProtocoloSEI();

		if (numeroProtocoloSEI != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"numeroProtocoloSEI\": ");

			sb.append("\"");

			sb.append(_escape(numeroProtocoloSEI));

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

		String protocolo = getProtocolo();

		if (protocolo != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"protocolo\": ");

			sb.append("\"");

			sb.append(_escape(protocolo));

			sb.append("\"");
		}

		String status = getStatus();

		if (status != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"status\": ");

			sb.append("\"");

			sb.append(_escape(status));

			sb.append("\"");
		}

		String tipoProposta = getTipoProposta();

		if (tipoProposta != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"tipoProposta\": ");

			sb.append("\"");

			sb.append(_escape(tipoProposta));

			sb.append("\"");
		}

		sb.append("}");

		return sb.toString();
	}

	@io.swagger.v3.oas.annotations.media.Schema(
		accessMode = io.swagger.v3.oas.annotations.media.Schema.AccessMode.READ_ONLY,
		defaultValue = "br.com.seatecnologia.gdf.negocia.headless.dto.v1_0.PropostaEntityList",
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
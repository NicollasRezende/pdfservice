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
@GraphQLName("DemonstracoesContabeisEntity")
@JsonFilter("Liferay.Vulcan")
@XmlRootElement(name = "DemonstracoesContabeisEntity")
public class DemonstracoesContabeisEntity implements Serializable {

	public static DemonstracoesContabeisEntity toDTO(String json) {
		return ObjectMapperUtil.readValue(
			DemonstracoesContabeisEntity.class, json);
	}

	public static DemonstracoesContabeisEntity unsafeToDTO(String json) {
		return ObjectMapperUtil.unsafeReadValue(
			DemonstracoesContabeisEntity.class, json);
	}

	@io.swagger.v3.oas.annotations.media.Schema
	public Long getDemonstracaoId() {
		if (_demonstracaoIdSupplier != null) {
			demonstracaoId = _demonstracaoIdSupplier.get();

			_demonstracaoIdSupplier = null;
		}

		return demonstracaoId;
	}

	public void setDemonstracaoId(Long demonstracaoId) {
		this.demonstracaoId = demonstracaoId;

		_demonstracaoIdSupplier = null;
	}

	@JsonIgnore
	public void setDemonstracaoId(
		UnsafeSupplier<Long, Exception> demonstracaoIdUnsafeSupplier) {

		_demonstracaoIdSupplier = () -> {
			try {
				return demonstracaoIdUnsafeSupplier.get();
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
	protected Long demonstracaoId;

	@JsonIgnore
	private Supplier<Long> _demonstracaoIdSupplier;

	@io.swagger.v3.oas.annotations.media.Schema
	public Long getFileEntryId() {
		if (_fileEntryIdSupplier != null) {
			fileEntryId = _fileEntryIdSupplier.get();

			_fileEntryIdSupplier = null;
		}

		return fileEntryId;
	}

	public void setFileEntryId(Long fileEntryId) {
		this.fileEntryId = fileEntryId;

		_fileEntryIdSupplier = null;
	}

	@JsonIgnore
	public void setFileEntryId(
		UnsafeSupplier<Long, Exception> fileEntryIdUnsafeSupplier) {

		_fileEntryIdSupplier = () -> {
			try {
				return fileEntryIdUnsafeSupplier.get();
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
	protected Long fileEntryId;

	@JsonIgnore
	private Supplier<Long> _fileEntryIdSupplier;

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
	public String getTipoDemonstracao() {
		if (_tipoDemonstracaoSupplier != null) {
			tipoDemonstracao = _tipoDemonstracaoSupplier.get();

			_tipoDemonstracaoSupplier = null;
		}

		return tipoDemonstracao;
	}

	public void setTipoDemonstracao(String tipoDemonstracao) {
		this.tipoDemonstracao = tipoDemonstracao;

		_tipoDemonstracaoSupplier = null;
	}

	@JsonIgnore
	public void setTipoDemonstracao(
		UnsafeSupplier<String, Exception> tipoDemonstracaoUnsafeSupplier) {

		_tipoDemonstracaoSupplier = () -> {
			try {
				return tipoDemonstracaoUnsafeSupplier.get();
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
	protected String tipoDemonstracao;

	@JsonIgnore
	private Supplier<String> _tipoDemonstracaoSupplier;

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof DemonstracoesContabeisEntity)) {
			return false;
		}

		DemonstracoesContabeisEntity demonstracoesContabeisEntity =
			(DemonstracoesContabeisEntity)object;

		return Objects.equals(
			toString(), demonstracoesContabeisEntity.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		StringBundler sb = new StringBundler();

		sb.append("{");

		Long demonstracaoId = getDemonstracaoId();

		if (demonstracaoId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"demonstracaoId\": ");

			sb.append(demonstracaoId);
		}

		Long fileEntryId = getFileEntryId();

		if (fileEntryId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"fileEntryId\": ");

			sb.append(fileEntryId);
		}

		Long propostaId = getPropostaId();

		if (propostaId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"propostaId\": ");

			sb.append(propostaId);
		}

		String tipoDemonstracao = getTipoDemonstracao();

		if (tipoDemonstracao != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"tipoDemonstracao\": ");

			sb.append("\"");

			sb.append(_escape(tipoDemonstracao));

			sb.append("\"");
		}

		sb.append("}");

		return sb.toString();
	}

	@io.swagger.v3.oas.annotations.media.Schema(
		accessMode = io.swagger.v3.oas.annotations.media.Schema.AccessMode.READ_ONLY,
		defaultValue = "br.com.seatecnologia.gdf.negocia.headless.dto.v1_0.DemonstracoesContabeisEntity",
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
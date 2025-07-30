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
@GraphQLName("AdministradorJudicialEntity")
@JsonFilter("Liferay.Vulcan")
@XmlRootElement(name = "AdministradorJudicialEntity")
public class AdministradorJudicialEntity implements Serializable {

	public static AdministradorJudicialEntity toDTO(String json) {
		return ObjectMapperUtil.readValue(
			AdministradorJudicialEntity.class, json);
	}

	public static AdministradorJudicialEntity unsafeToDTO(String json) {
		return ObjectMapperUtil.unsafeReadValue(
			AdministradorJudicialEntity.class, json);
	}

	@io.swagger.v3.oas.annotations.media.Schema
	@Valid
	public ArquivosEntity getAnexoRecuperacao() {
		if (_anexoRecuperacaoSupplier != null) {
			anexoRecuperacao = _anexoRecuperacaoSupplier.get();

			_anexoRecuperacaoSupplier = null;
		}

		return anexoRecuperacao;
	}

	public void setAnexoRecuperacao(ArquivosEntity anexoRecuperacao) {
		this.anexoRecuperacao = anexoRecuperacao;

		_anexoRecuperacaoSupplier = null;
	}

	@JsonIgnore
	public void setAnexoRecuperacao(
		UnsafeSupplier<ArquivosEntity, Exception>
			anexoRecuperacaoUnsafeSupplier) {

		_anexoRecuperacaoSupplier = () -> {
			try {
				return anexoRecuperacaoUnsafeSupplier.get();
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
	protected ArquivosEntity anexoRecuperacao;

	@JsonIgnore
	private Supplier<ArquivosEntity> _anexoRecuperacaoSupplier;

	@io.swagger.v3.oas.annotations.media.Schema
	public String getNumeroProcesso() {
		if (_numeroProcessoSupplier != null) {
			numeroProcesso = _numeroProcessoSupplier.get();

			_numeroProcessoSupplier = null;
		}

		return numeroProcesso;
	}

	public void setNumeroProcesso(String numeroProcesso) {
		this.numeroProcesso = numeroProcesso;

		_numeroProcessoSupplier = null;
	}

	@JsonIgnore
	public void setNumeroProcesso(
		UnsafeSupplier<String, Exception> numeroProcessoUnsafeSupplier) {

		_numeroProcessoSupplier = () -> {
			try {
				return numeroProcessoUnsafeSupplier.get();
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
	protected String numeroProcesso;

	@JsonIgnore
	private Supplier<String> _numeroProcessoSupplier;

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
	public String getRecuperacao() {
		if (_recuperacaoSupplier != null) {
			recuperacao = _recuperacaoSupplier.get();

			_recuperacaoSupplier = null;
		}

		return recuperacao;
	}

	public void setRecuperacao(String recuperacao) {
		this.recuperacao = recuperacao;

		_recuperacaoSupplier = null;
	}

	@JsonIgnore
	public void setRecuperacao(
		UnsafeSupplier<String, Exception> recuperacaoUnsafeSupplier) {

		_recuperacaoSupplier = () -> {
			try {
				return recuperacaoUnsafeSupplier.get();
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
	protected String recuperacao;

	@JsonIgnore
	private Supplier<String> _recuperacaoSupplier;

	@io.swagger.v3.oas.annotations.media.Schema
	public Boolean getRegimeFalencia() {
		if (_regimeFalenciaSupplier != null) {
			regimeFalencia = _regimeFalenciaSupplier.get();

			_regimeFalenciaSupplier = null;
		}

		return regimeFalencia;
	}

	public void setRegimeFalencia(Boolean regimeFalencia) {
		this.regimeFalencia = regimeFalencia;

		_regimeFalenciaSupplier = null;
	}

	@JsonIgnore
	public void setRegimeFalencia(
		UnsafeSupplier<Boolean, Exception> regimeFalenciaUnsafeSupplier) {

		_regimeFalenciaSupplier = () -> {
			try {
				return regimeFalenciaUnsafeSupplier.get();
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
	protected Boolean regimeFalencia;

	@JsonIgnore
	private Supplier<Boolean> _regimeFalenciaSupplier;

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof AdministradorJudicialEntity)) {
			return false;
		}

		AdministradorJudicialEntity administradorJudicialEntity =
			(AdministradorJudicialEntity)object;

		return Objects.equals(
			toString(), administradorJudicialEntity.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		StringBundler sb = new StringBundler();

		sb.append("{");

		ArquivosEntity anexoRecuperacao = getAnexoRecuperacao();

		if (anexoRecuperacao != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"anexoRecuperacao\": ");

			sb.append(String.valueOf(anexoRecuperacao));
		}

		String numeroProcesso = getNumeroProcesso();

		if (numeroProcesso != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"numeroProcesso\": ");

			sb.append("\"");

			sb.append(_escape(numeroProcesso));

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

		String recuperacao = getRecuperacao();

		if (recuperacao != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"recuperacao\": ");

			sb.append("\"");

			sb.append(_escape(recuperacao));

			sb.append("\"");
		}

		Boolean regimeFalencia = getRegimeFalencia();

		if (regimeFalencia != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"regimeFalencia\": ");

			sb.append(regimeFalencia);
		}

		sb.append("}");

		return sb.toString();
	}

	@io.swagger.v3.oas.annotations.media.Schema(
		accessMode = io.swagger.v3.oas.annotations.media.Schema.AccessMode.READ_ONLY,
		defaultValue = "br.com.seatecnologia.gdf.negocia.headless.dto.v1_0.AdministradorJudicialEntity",
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
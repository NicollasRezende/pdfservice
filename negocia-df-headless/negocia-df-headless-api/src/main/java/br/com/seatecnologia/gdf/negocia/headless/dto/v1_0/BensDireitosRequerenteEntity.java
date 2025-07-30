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
@GraphQLName("BensDireitosRequerenteEntity")
@JsonFilter("Liferay.Vulcan")
@XmlRootElement(name = "BensDireitosRequerenteEntity")
public class BensDireitosRequerenteEntity implements Serializable {

	public static BensDireitosRequerenteEntity toDTO(String json) {
		return ObjectMapperUtil.readValue(
			BensDireitosRequerenteEntity.class, json);
	}

	public static BensDireitosRequerenteEntity unsafeToDTO(String json) {
		return ObjectMapperUtil.unsafeReadValue(
			BensDireitosRequerenteEntity.class, json);
	}

	@io.swagger.v3.oas.annotations.media.Schema
	public Long getBemId() {
		if (_bemIdSupplier != null) {
			bemId = _bemIdSupplier.get();

			_bemIdSupplier = null;
		}

		return bemId;
	}

	public void setBemId(Long bemId) {
		this.bemId = bemId;

		_bemIdSupplier = null;
	}

	@JsonIgnore
	public void setBemId(UnsafeSupplier<Long, Exception> bemIdUnsafeSupplier) {
		_bemIdSupplier = () -> {
			try {
				return bemIdUnsafeSupplier.get();
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
	protected Long bemId;

	@JsonIgnore
	private Supplier<Long> _bemIdSupplier;

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
	@Valid
	public LaudoAvaliacaoEntity[] getLaudoAvaliacaoEntities() {
		if (_laudoAvaliacaoEntitiesSupplier != null) {
			laudoAvaliacaoEntities = _laudoAvaliacaoEntitiesSupplier.get();

			_laudoAvaliacaoEntitiesSupplier = null;
		}

		return laudoAvaliacaoEntities;
	}

	public void setLaudoAvaliacaoEntities(
		LaudoAvaliacaoEntity[] laudoAvaliacaoEntities) {

		this.laudoAvaliacaoEntities = laudoAvaliacaoEntities;

		_laudoAvaliacaoEntitiesSupplier = null;
	}

	@JsonIgnore
	public void setLaudoAvaliacaoEntities(
		UnsafeSupplier<LaudoAvaliacaoEntity[], Exception>
			laudoAvaliacaoEntitiesUnsafeSupplier) {

		_laudoAvaliacaoEntitiesSupplier = () -> {
			try {
				return laudoAvaliacaoEntitiesUnsafeSupplier.get();
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
	protected LaudoAvaliacaoEntity[] laudoAvaliacaoEntities;

	@JsonIgnore
	private Supplier<LaudoAvaliacaoEntity[]> _laudoAvaliacaoEntitiesSupplier;

	@io.swagger.v3.oas.annotations.media.Schema
	public String getLocalizacao() {
		if (_localizacaoSupplier != null) {
			localizacao = _localizacaoSupplier.get();

			_localizacaoSupplier = null;
		}

		return localizacao;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;

		_localizacaoSupplier = null;
	}

	@JsonIgnore
	public void setLocalizacao(
		UnsafeSupplier<String, Exception> localizacaoUnsafeSupplier) {

		_localizacaoSupplier = () -> {
			try {
				return localizacaoUnsafeSupplier.get();
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
	protected String localizacao;

	@JsonIgnore
	private Supplier<String> _localizacaoSupplier;

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

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof BensDireitosRequerenteEntity)) {
			return false;
		}

		BensDireitosRequerenteEntity bensDireitosRequerenteEntity =
			(BensDireitosRequerenteEntity)object;

		return Objects.equals(
			toString(), bensDireitosRequerenteEntity.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		StringBundler sb = new StringBundler();

		sb.append("{");

		Long bemId = getBemId();

		if (bemId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"bemId\": ");

			sb.append(bemId);
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

		LaudoAvaliacaoEntity[] laudoAvaliacaoEntities =
			getLaudoAvaliacaoEntities();

		if (laudoAvaliacaoEntities != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"laudoAvaliacaoEntities\": ");

			sb.append("[");

			for (int i = 0; i < laudoAvaliacaoEntities.length; i++) {
				sb.append(String.valueOf(laudoAvaliacaoEntities[i]));

				if ((i + 1) < laudoAvaliacaoEntities.length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		String localizacao = getLocalizacao();

		if (localizacao != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"localizacao\": ");

			sb.append("\"");

			sb.append(_escape(localizacao));

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

		sb.append("}");

		return sb.toString();
	}

	@io.swagger.v3.oas.annotations.media.Schema(
		accessMode = io.swagger.v3.oas.annotations.media.Schema.AccessMode.READ_ONLY,
		defaultValue = "br.com.seatecnologia.gdf.negocia.headless.dto.v1_0.BensDireitosRequerenteEntity",
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
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
@GraphQLName("GarantiaDetalhadaEntity")
@JsonFilter("Liferay.Vulcan")
@XmlRootElement(name = "GarantiaDetalhadaEntity")
public class GarantiaDetalhadaEntity implements Serializable {

	public static GarantiaDetalhadaEntity toDTO(String json) {
		return ObjectMapperUtil.readValue(GarantiaDetalhadaEntity.class, json);
	}

	public static GarantiaDetalhadaEntity unsafeToDTO(String json) {
		return ObjectMapperUtil.unsafeReadValue(
			GarantiaDetalhadaEntity.class, json);
	}

	@io.swagger.v3.oas.annotations.media.Schema
	@Valid
	public DadosRegistro getDadosRegistro() {
		if (_dadosRegistroSupplier != null) {
			dadosRegistro = _dadosRegistroSupplier.get();

			_dadosRegistroSupplier = null;
		}

		return dadosRegistro;
	}

	public void setDadosRegistro(DadosRegistro dadosRegistro) {
		this.dadosRegistro = dadosRegistro;

		_dadosRegistroSupplier = null;
	}

	@JsonIgnore
	public void setDadosRegistro(
		UnsafeSupplier<DadosRegistro, Exception> dadosRegistroUnsafeSupplier) {

		_dadosRegistroSupplier = () -> {
			try {
				return dadosRegistroUnsafeSupplier.get();
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
	protected DadosRegistro dadosRegistro;

	@JsonIgnore
	private Supplier<DadosRegistro> _dadosRegistroSupplier;

	@io.swagger.v3.oas.annotations.media.Schema
	@Valid
	public ArquivosEntity getDeclaracao() {
		if (_declaracaoSupplier != null) {
			declaracao = _declaracaoSupplier.get();

			_declaracaoSupplier = null;
		}

		return declaracao;
	}

	public void setDeclaracao(ArquivosEntity declaracao) {
		this.declaracao = declaracao;

		_declaracaoSupplier = null;
	}

	@JsonIgnore
	public void setDeclaracao(
		UnsafeSupplier<ArquivosEntity, Exception> declaracaoUnsafeSupplier) {

		_declaracaoSupplier = () -> {
			try {
				return declaracaoUnsafeSupplier.get();
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
	protected ArquivosEntity declaracao;

	@JsonIgnore
	private Supplier<ArquivosEntity> _declaracaoSupplier;

	@io.swagger.v3.oas.annotations.media.Schema
	public Boolean getDeclaracaoAnuencia() {
		if (_declaracaoAnuenciaSupplier != null) {
			declaracaoAnuencia = _declaracaoAnuenciaSupplier.get();

			_declaracaoAnuenciaSupplier = null;
		}

		return declaracaoAnuencia;
	}

	public void setDeclaracaoAnuencia(Boolean declaracaoAnuencia) {
		this.declaracaoAnuencia = declaracaoAnuencia;

		_declaracaoAnuenciaSupplier = null;
	}

	@JsonIgnore
	public void setDeclaracaoAnuencia(
		UnsafeSupplier<Boolean, Exception> declaracaoAnuenciaUnsafeSupplier) {

		_declaracaoAnuenciaSupplier = () -> {
			try {
				return declaracaoAnuenciaUnsafeSupplier.get();
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
	protected Boolean declaracaoAnuencia;

	@JsonIgnore
	private Supplier<Boolean> _declaracaoAnuenciaSupplier;

	@io.swagger.v3.oas.annotations.media.Schema
	public String getDescricaoBem() {
		if (_descricaoBemSupplier != null) {
			descricaoBem = _descricaoBemSupplier.get();

			_descricaoBemSupplier = null;
		}

		return descricaoBem;
	}

	public void setDescricaoBem(String descricaoBem) {
		this.descricaoBem = descricaoBem;

		_descricaoBemSupplier = null;
	}

	@JsonIgnore
	public void setDescricaoBem(
		UnsafeSupplier<String, Exception> descricaoBemUnsafeSupplier) {

		_descricaoBemSupplier = () -> {
			try {
				return descricaoBemUnsafeSupplier.get();
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
	protected String descricaoBem;

	@JsonIgnore
	private Supplier<String> _descricaoBemSupplier;

	@io.swagger.v3.oas.annotations.media.Schema
	public Long getGarantiaId() {
		if (_garantiaIdSupplier != null) {
			garantiaId = _garantiaIdSupplier.get();

			_garantiaIdSupplier = null;
		}

		return garantiaId;
	}

	public void setGarantiaId(Long garantiaId) {
		this.garantiaId = garantiaId;

		_garantiaIdSupplier = null;
	}

	@JsonIgnore
	public void setGarantiaId(
		UnsafeSupplier<Long, Exception> garantiaIdUnsafeSupplier) {

		_garantiaIdSupplier = () -> {
			try {
				return garantiaIdUnsafeSupplier.get();
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
	protected Long garantiaId;

	@JsonIgnore
	private Supplier<Long> _garantiaIdSupplier;

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
	public String getOutrasGarantias() {
		if (_outrasGarantiasSupplier != null) {
			outrasGarantias = _outrasGarantiasSupplier.get();

			_outrasGarantiasSupplier = null;
		}

		return outrasGarantias;
	}

	public void setOutrasGarantias(String outrasGarantias) {
		this.outrasGarantias = outrasGarantias;

		_outrasGarantiasSupplier = null;
	}

	@JsonIgnore
	public void setOutrasGarantias(
		UnsafeSupplier<String, Exception> outrasGarantiasUnsafeSupplier) {

		_outrasGarantiasSupplier = () -> {
			try {
				return outrasGarantiasUnsafeSupplier.get();
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
	protected String outrasGarantias;

	@JsonIgnore
	private Supplier<String> _outrasGarantiasSupplier;

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
	@Valid
	public QualificacaoCompletaEntity getProprietario() {
		if (_proprietarioSupplier != null) {
			proprietario = _proprietarioSupplier.get();

			_proprietarioSupplier = null;
		}

		return proprietario;
	}

	public void setProprietario(QualificacaoCompletaEntity proprietario) {
		this.proprietario = proprietario;

		_proprietarioSupplier = null;
	}

	@JsonIgnore
	public void setProprietario(
		UnsafeSupplier<QualificacaoCompletaEntity, Exception>
			proprietarioUnsafeSupplier) {

		_proprietarioSupplier = () -> {
			try {
				return proprietarioUnsafeSupplier.get();
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
	protected QualificacaoCompletaEntity proprietario;

	@JsonIgnore
	private Supplier<QualificacaoCompletaEntity> _proprietarioSupplier;

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

	@io.swagger.v3.oas.annotations.media.Schema
	public String getTipoGarantia() {
		if (_tipoGarantiaSupplier != null) {
			tipoGarantia = _tipoGarantiaSupplier.get();

			_tipoGarantiaSupplier = null;
		}

		return tipoGarantia;
	}

	public void setTipoGarantia(String tipoGarantia) {
		this.tipoGarantia = tipoGarantia;

		_tipoGarantiaSupplier = null;
	}

	@JsonIgnore
	public void setTipoGarantia(
		UnsafeSupplier<String, Exception> tipoGarantiaUnsafeSupplier) {

		_tipoGarantiaSupplier = () -> {
			try {
				return tipoGarantiaUnsafeSupplier.get();
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
	protected String tipoGarantia;

	@JsonIgnore
	private Supplier<String> _tipoGarantiaSupplier;

	@io.swagger.v3.oas.annotations.media.Schema
	public Double getValorEstimado() {
		if (_valorEstimadoSupplier != null) {
			valorEstimado = _valorEstimadoSupplier.get();

			_valorEstimadoSupplier = null;
		}

		return valorEstimado;
	}

	public void setValorEstimado(Double valorEstimado) {
		this.valorEstimado = valorEstimado;

		_valorEstimadoSupplier = null;
	}

	@JsonIgnore
	public void setValorEstimado(
		UnsafeSupplier<Double, Exception> valorEstimadoUnsafeSupplier) {

		_valorEstimadoSupplier = () -> {
			try {
				return valorEstimadoUnsafeSupplier.get();
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
	protected Double valorEstimado;

	@JsonIgnore
	private Supplier<Double> _valorEstimadoSupplier;

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof GarantiaDetalhadaEntity)) {
			return false;
		}

		GarantiaDetalhadaEntity garantiaDetalhadaEntity =
			(GarantiaDetalhadaEntity)object;

		return Objects.equals(toString(), garantiaDetalhadaEntity.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		StringBundler sb = new StringBundler();

		sb.append("{");

		DadosRegistro dadosRegistro = getDadosRegistro();

		if (dadosRegistro != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"dadosRegistro\": ");

			sb.append(String.valueOf(dadosRegistro));
		}

		ArquivosEntity declaracao = getDeclaracao();

		if (declaracao != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"declaracao\": ");

			sb.append(String.valueOf(declaracao));
		}

		Boolean declaracaoAnuencia = getDeclaracaoAnuencia();

		if (declaracaoAnuencia != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"declaracaoAnuencia\": ");

			sb.append(declaracaoAnuencia);
		}

		String descricaoBem = getDescricaoBem();

		if (descricaoBem != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"descricaoBem\": ");

			sb.append("\"");

			sb.append(_escape(descricaoBem));

			sb.append("\"");
		}

		Long garantiaId = getGarantiaId();

		if (garantiaId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"garantiaId\": ");

			sb.append(garantiaId);
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

		String outrasGarantias = getOutrasGarantias();

		if (outrasGarantias != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"outrasGarantias\": ");

			sb.append("\"");

			sb.append(_escape(outrasGarantias));

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

		QualificacaoCompletaEntity proprietario = getProprietario();

		if (proprietario != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"proprietario\": ");

			sb.append(String.valueOf(proprietario));
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

		String tipoGarantia = getTipoGarantia();

		if (tipoGarantia != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"tipoGarantia\": ");

			sb.append("\"");

			sb.append(_escape(tipoGarantia));

			sb.append("\"");
		}

		Double valorEstimado = getValorEstimado();

		if (valorEstimado != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"valorEstimado\": ");

			sb.append(valorEstimado);
		}

		sb.append("}");

		return sb.toString();
	}

	@io.swagger.v3.oas.annotations.media.Schema(
		accessMode = io.swagger.v3.oas.annotations.media.Schema.AccessMode.READ_ONLY,
		defaultValue = "br.com.seatecnologia.gdf.negocia.headless.dto.v1_0.GarantiaDetalhadaEntity",
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
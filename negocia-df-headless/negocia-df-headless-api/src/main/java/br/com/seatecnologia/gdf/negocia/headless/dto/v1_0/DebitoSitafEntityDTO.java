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
@GraphQLName("DebitoSitafEntityDTO")
@JsonFilter("Liferay.Vulcan")
@XmlRootElement(name = "DebitoSitafEntityDTO")
public class DebitoSitafEntityDTO implements Serializable {

	public static DebitoSitafEntityDTO toDTO(String json) {
		return ObjectMapperUtil.readValue(DebitoSitafEntityDTO.class, json);
	}

	public static DebitoSitafEntityDTO unsafeToDTO(String json) {
		return ObjectMapperUtil.unsafeReadValue(
			DebitoSitafEntityDTO.class, json);
	}

	@io.swagger.v3.oas.annotations.media.Schema
	public String getTipoDebito() {
		if (_TipoDebitoSupplier != null) {
			TipoDebito = _TipoDebitoSupplier.get();

			_TipoDebitoSupplier = null;
		}

		return TipoDebito;
	}

	public void setTipoDebito(String TipoDebito) {
		this.TipoDebito = TipoDebito;

		_TipoDebitoSupplier = null;
	}

	@JsonIgnore
	public void setTipoDebito(
		UnsafeSupplier<String, Exception> TipoDebitoUnsafeSupplier) {

		_TipoDebitoSupplier = () -> {
			try {
				return TipoDebitoUnsafeSupplier.get();
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
	protected String TipoDebito;

	@JsonIgnore
	private Supplier<String> _TipoDebitoSupplier;

	@io.swagger.v3.oas.annotations.media.Schema
	public Integer getAnoExercicio() {
		if (_anoExercicioSupplier != null) {
			anoExercicio = _anoExercicioSupplier.get();

			_anoExercicioSupplier = null;
		}

		return anoExercicio;
	}

	public void setAnoExercicio(Integer anoExercicio) {
		this.anoExercicio = anoExercicio;

		_anoExercicioSupplier = null;
	}

	@JsonIgnore
	public void setAnoExercicio(
		UnsafeSupplier<Integer, Exception> anoExercicioUnsafeSupplier) {

		_anoExercicioSupplier = () -> {
			try {
				return anoExercicioUnsafeSupplier.get();
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
	protected Integer anoExercicio;

	@JsonIgnore
	private Supplier<Integer> _anoExercicioSupplier;

	@io.swagger.v3.oas.annotations.media.Schema
	public String getCodigoOrgaoGerador() {
		if (_codigoOrgaoGeradorSupplier != null) {
			codigoOrgaoGerador = _codigoOrgaoGeradorSupplier.get();

			_codigoOrgaoGeradorSupplier = null;
		}

		return codigoOrgaoGerador;
	}

	public void setCodigoOrgaoGerador(String codigoOrgaoGerador) {
		this.codigoOrgaoGerador = codigoOrgaoGerador;

		_codigoOrgaoGeradorSupplier = null;
	}

	@JsonIgnore
	public void setCodigoOrgaoGerador(
		UnsafeSupplier<String, Exception> codigoOrgaoGeradorUnsafeSupplier) {

		_codigoOrgaoGeradorSupplier = () -> {
			try {
				return codigoOrgaoGeradorUnsafeSupplier.get();
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
	protected String codigoOrgaoGerador;

	@JsonIgnore
	private Supplier<String> _codigoOrgaoGeradorSupplier;

	@io.swagger.v3.oas.annotations.media.Schema
	public String getCodigoRatingDivida() {
		if (_codigoRatingDividaSupplier != null) {
			codigoRatingDivida = _codigoRatingDividaSupplier.get();

			_codigoRatingDividaSupplier = null;
		}

		return codigoRatingDivida;
	}

	public void setCodigoRatingDivida(String codigoRatingDivida) {
		this.codigoRatingDivida = codigoRatingDivida;

		_codigoRatingDividaSupplier = null;
	}

	@JsonIgnore
	public void setCodigoRatingDivida(
		UnsafeSupplier<String, Exception> codigoRatingDividaUnsafeSupplier) {

		_codigoRatingDividaSupplier = () -> {
			try {
				return codigoRatingDividaUnsafeSupplier.get();
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
	protected String codigoRatingDivida;

	@JsonIgnore
	private Supplier<String> _codigoRatingDividaSupplier;

	@io.swagger.v3.oas.annotations.media.Schema
	public String getCodigoReceita() {
		if (_codigoReceitaSupplier != null) {
			codigoReceita = _codigoReceitaSupplier.get();

			_codigoReceitaSupplier = null;
		}

		return codigoReceita;
	}

	public void setCodigoReceita(String codigoReceita) {
		this.codigoReceita = codigoReceita;

		_codigoReceitaSupplier = null;
	}

	@JsonIgnore
	public void setCodigoReceita(
		UnsafeSupplier<String, Exception> codigoReceitaUnsafeSupplier) {

		_codigoReceitaSupplier = () -> {
			try {
				return codigoReceitaUnsafeSupplier.get();
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
	protected String codigoReceita;

	@JsonIgnore
	private Supplier<String> _codigoReceitaSupplier;

	@io.swagger.v3.oas.annotations.media.Schema
	public String getCodigoSituacaoDebito() {
		if (_codigoSituacaoDebitoSupplier != null) {
			codigoSituacaoDebito = _codigoSituacaoDebitoSupplier.get();

			_codigoSituacaoDebitoSupplier = null;
		}

		return codigoSituacaoDebito;
	}

	public void setCodigoSituacaoDebito(String codigoSituacaoDebito) {
		this.codigoSituacaoDebito = codigoSituacaoDebito;

		_codigoSituacaoDebitoSupplier = null;
	}

	@JsonIgnore
	public void setCodigoSituacaoDebito(
		UnsafeSupplier<String, Exception> codigoSituacaoDebitoUnsafeSupplier) {

		_codigoSituacaoDebitoSupplier = () -> {
			try {
				return codigoSituacaoDebitoUnsafeSupplier.get();
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
	protected String codigoSituacaoDebito;

	@JsonIgnore
	private Supplier<String> _codigoSituacaoDebitoSupplier;

	@io.swagger.v3.oas.annotations.media.Schema
	public String getDescricaoReceita() {
		if (_descricaoReceitaSupplier != null) {
			descricaoReceita = _descricaoReceitaSupplier.get();

			_descricaoReceitaSupplier = null;
		}

		return descricaoReceita;
	}

	public void setDescricaoReceita(String descricaoReceita) {
		this.descricaoReceita = descricaoReceita;

		_descricaoReceitaSupplier = null;
	}

	@JsonIgnore
	public void setDescricaoReceita(
		UnsafeSupplier<String, Exception> descricaoReceitaUnsafeSupplier) {

		_descricaoReceitaSupplier = () -> {
			try {
				return descricaoReceitaUnsafeSupplier.get();
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
	protected String descricaoReceita;

	@JsonIgnore
	private Supplier<String> _descricaoReceitaSupplier;

	@io.swagger.v3.oas.annotations.media.Schema
	public String getEstadoDebito() {
		if (_estadoDebitoSupplier != null) {
			estadoDebito = _estadoDebitoSupplier.get();

			_estadoDebitoSupplier = null;
		}

		return estadoDebito;
	}

	public void setEstadoDebito(String estadoDebito) {
		this.estadoDebito = estadoDebito;

		_estadoDebitoSupplier = null;
	}

	@JsonIgnore
	public void setEstadoDebito(
		UnsafeSupplier<String, Exception> estadoDebitoUnsafeSupplier) {

		_estadoDebitoSupplier = () -> {
			try {
				return estadoDebitoUnsafeSupplier.get();
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
	protected String estadoDebito;

	@JsonIgnore
	private Supplier<String> _estadoDebitoSupplier;

	@io.swagger.v3.oas.annotations.media.Schema
	@Valid
	public IdentificadorCreditoEntityDTO getIdentificadorCredito() {
		if (_identificadorCreditoSupplier != null) {
			identificadorCredito = _identificadorCreditoSupplier.get();

			_identificadorCreditoSupplier = null;
		}

		return identificadorCredito;
	}

	public void setIdentificadorCredito(
		IdentificadorCreditoEntityDTO identificadorCredito) {

		this.identificadorCredito = identificadorCredito;

		_identificadorCreditoSupplier = null;
	}

	@JsonIgnore
	public void setIdentificadorCredito(
		UnsafeSupplier<IdentificadorCreditoEntityDTO, Exception>
			identificadorCreditoUnsafeSupplier) {

		_identificadorCreditoSupplier = () -> {
			try {
				return identificadorCreditoUnsafeSupplier.get();
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
	protected IdentificadorCreditoEntityDTO identificadorCredito;

	@JsonIgnore
	private Supplier<IdentificadorCreditoEntityDTO>
		_identificadorCreditoSupplier;

	@io.swagger.v3.oas.annotations.media.Schema
	public String getJudicializado() {
		if (_judicializadoSupplier != null) {
			judicializado = _judicializadoSupplier.get();

			_judicializadoSupplier = null;
		}

		return judicializado;
	}

	public void setJudicializado(String judicializado) {
		this.judicializado = judicializado;

		_judicializadoSupplier = null;
	}

	@JsonIgnore
	public void setJudicializado(
		UnsafeSupplier<String, Exception> judicializadoUnsafeSupplier) {

		_judicializadoSupplier = () -> {
			try {
				return judicializadoUnsafeSupplier.get();
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
	protected String judicializado;

	@JsonIgnore
	private Supplier<String> _judicializadoSupplier;

	@io.swagger.v3.oas.annotations.media.Schema
	public String getObservacao() {
		if (_observacaoSupplier != null) {
			observacao = _observacaoSupplier.get();

			_observacaoSupplier = null;
		}

		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;

		_observacaoSupplier = null;
	}

	@JsonIgnore
	public void setObservacao(
		UnsafeSupplier<String, Exception> observacaoUnsafeSupplier) {

		_observacaoSupplier = () -> {
			try {
				return observacaoUnsafeSupplier.get();
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
	protected String observacao;

	@JsonIgnore
	private Supplier<String> _observacaoSupplier;

	@io.swagger.v3.oas.annotations.media.Schema
	public Double getValorJuros() {
		if (_valorJurosSupplier != null) {
			valorJuros = _valorJurosSupplier.get();

			_valorJurosSupplier = null;
		}

		return valorJuros;
	}

	public void setValorJuros(Double valorJuros) {
		this.valorJuros = valorJuros;

		_valorJurosSupplier = null;
	}

	@JsonIgnore
	public void setValorJuros(
		UnsafeSupplier<Double, Exception> valorJurosUnsafeSupplier) {

		_valorJurosSupplier = () -> {
			try {
				return valorJurosUnsafeSupplier.get();
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
	protected Double valorJuros;

	@JsonIgnore
	private Supplier<Double> _valorJurosSupplier;

	@io.swagger.v3.oas.annotations.media.Schema
	public Double getValorMulta() {
		if (_valorMultaSupplier != null) {
			valorMulta = _valorMultaSupplier.get();

			_valorMultaSupplier = null;
		}

		return valorMulta;
	}

	public void setValorMulta(Double valorMulta) {
		this.valorMulta = valorMulta;

		_valorMultaSupplier = null;
	}

	@JsonIgnore
	public void setValorMulta(
		UnsafeSupplier<Double, Exception> valorMultaUnsafeSupplier) {

		_valorMultaSupplier = () -> {
			try {
				return valorMultaUnsafeSupplier.get();
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
	protected Double valorMulta;

	@JsonIgnore
	private Supplier<Double> _valorMultaSupplier;

	@io.swagger.v3.oas.annotations.media.Schema
	public Double getValorOutros() {
		if (_valorOutrosSupplier != null) {
			valorOutros = _valorOutrosSupplier.get();

			_valorOutrosSupplier = null;
		}

		return valorOutros;
	}

	public void setValorOutros(Double valorOutros) {
		this.valorOutros = valorOutros;

		_valorOutrosSupplier = null;
	}

	@JsonIgnore
	public void setValorOutros(
		UnsafeSupplier<Double, Exception> valorOutrosUnsafeSupplier) {

		_valorOutrosSupplier = () -> {
			try {
				return valorOutrosUnsafeSupplier.get();
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
	protected Double valorOutros;

	@JsonIgnore
	private Supplier<Double> _valorOutrosSupplier;

	@io.swagger.v3.oas.annotations.media.Schema
	public Double getValorPrincipal() {
		if (_valorPrincipalSupplier != null) {
			valorPrincipal = _valorPrincipalSupplier.get();

			_valorPrincipalSupplier = null;
		}

		return valorPrincipal;
	}

	public void setValorPrincipal(Double valorPrincipal) {
		this.valorPrincipal = valorPrincipal;

		_valorPrincipalSupplier = null;
	}

	@JsonIgnore
	public void setValorPrincipal(
		UnsafeSupplier<Double, Exception> valorPrincipalUnsafeSupplier) {

		_valorPrincipalSupplier = () -> {
			try {
				return valorPrincipalUnsafeSupplier.get();
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
	protected Double valorPrincipal;

	@JsonIgnore
	private Supplier<Double> _valorPrincipalSupplier;

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof DebitoSitafEntityDTO)) {
			return false;
		}

		DebitoSitafEntityDTO debitoSitafEntityDTO =
			(DebitoSitafEntityDTO)object;

		return Objects.equals(toString(), debitoSitafEntityDTO.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		StringBundler sb = new StringBundler();

		sb.append("{");

		String TipoDebito = getTipoDebito();

		if (TipoDebito != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"TipoDebito\": ");

			sb.append("\"");

			sb.append(_escape(TipoDebito));

			sb.append("\"");
		}

		Integer anoExercicio = getAnoExercicio();

		if (anoExercicio != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"anoExercicio\": ");

			sb.append(anoExercicio);
		}

		String codigoOrgaoGerador = getCodigoOrgaoGerador();

		if (codigoOrgaoGerador != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"codigoOrgaoGerador\": ");

			sb.append("\"");

			sb.append(_escape(codigoOrgaoGerador));

			sb.append("\"");
		}

		String codigoRatingDivida = getCodigoRatingDivida();

		if (codigoRatingDivida != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"codigoRatingDivida\": ");

			sb.append("\"");

			sb.append(_escape(codigoRatingDivida));

			sb.append("\"");
		}

		String codigoReceita = getCodigoReceita();

		if (codigoReceita != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"codigoReceita\": ");

			sb.append("\"");

			sb.append(_escape(codigoReceita));

			sb.append("\"");
		}

		String codigoSituacaoDebito = getCodigoSituacaoDebito();

		if (codigoSituacaoDebito != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"codigoSituacaoDebito\": ");

			sb.append("\"");

			sb.append(_escape(codigoSituacaoDebito));

			sb.append("\"");
		}

		String descricaoReceita = getDescricaoReceita();

		if (descricaoReceita != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"descricaoReceita\": ");

			sb.append("\"");

			sb.append(_escape(descricaoReceita));

			sb.append("\"");
		}

		String estadoDebito = getEstadoDebito();

		if (estadoDebito != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"estadoDebito\": ");

			sb.append("\"");

			sb.append(_escape(estadoDebito));

			sb.append("\"");
		}

		IdentificadorCreditoEntityDTO identificadorCredito =
			getIdentificadorCredito();

		if (identificadorCredito != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"identificadorCredito\": ");

			sb.append(String.valueOf(identificadorCredito));
		}

		String judicializado = getJudicializado();

		if (judicializado != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"judicializado\": ");

			sb.append("\"");

			sb.append(_escape(judicializado));

			sb.append("\"");
		}

		String observacao = getObservacao();

		if (observacao != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"observacao\": ");

			sb.append("\"");

			sb.append(_escape(observacao));

			sb.append("\"");
		}

		Double valorJuros = getValorJuros();

		if (valorJuros != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"valorJuros\": ");

			sb.append(valorJuros);
		}

		Double valorMulta = getValorMulta();

		if (valorMulta != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"valorMulta\": ");

			sb.append(valorMulta);
		}

		Double valorOutros = getValorOutros();

		if (valorOutros != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"valorOutros\": ");

			sb.append(valorOutros);
		}

		Double valorPrincipal = getValorPrincipal();

		if (valorPrincipal != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"valorPrincipal\": ");

			sb.append(valorPrincipal);
		}

		sb.append("}");

		return sb.toString();
	}

	@io.swagger.v3.oas.annotations.media.Schema(
		accessMode = io.swagger.v3.oas.annotations.media.Schema.AccessMode.READ_ONLY,
		defaultValue = "br.com.seatecnologia.gdf.negocia.headless.dto.v1_0.DebitoSitafEntityDTO",
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
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
@GraphQLName("IdentificacaoDebitosEntity")
@JsonFilter("Liferay.Vulcan")
@XmlRootElement(name = "IdentificacaoDebitosEntity")
public class IdentificacaoDebitosEntity implements Serializable {

	public static IdentificacaoDebitosEntity toDTO(String json) {
		return ObjectMapperUtil.readValue(
			IdentificacaoDebitosEntity.class, json);
	}

	public static IdentificacaoDebitosEntity unsafeToDTO(String json) {
		return ObjectMapperUtil.unsafeReadValue(
			IdentificacaoDebitosEntity.class, json);
	}

	@io.swagger.v3.oas.annotations.media.Schema
	public String getGarantidoJudicialmente() {
		if (_garantidoJudicialmenteSupplier != null) {
			garantidoJudicialmente = _garantidoJudicialmenteSupplier.get();

			_garantidoJudicialmenteSupplier = null;
		}

		return garantidoJudicialmente;
	}

	public void setGarantidoJudicialmente(String garantidoJudicialmente) {
		this.garantidoJudicialmente = garantidoJudicialmente;

		_garantidoJudicialmenteSupplier = null;
	}

	@JsonIgnore
	public void setGarantidoJudicialmente(
		UnsafeSupplier<String, Exception>
			garantidoJudicialmenteUnsafeSupplier) {

		_garantidoJudicialmenteSupplier = () -> {
			try {
				return garantidoJudicialmenteUnsafeSupplier.get();
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
	protected String garantidoJudicialmente;

	@JsonIgnore
	private Supplier<String> _garantidoJudicialmenteSupplier;

	@io.swagger.v3.oas.annotations.media.Schema
	public String getInscricaoDividaAtiva() {
		if (_inscricaoDividaAtivaSupplier != null) {
			inscricaoDividaAtiva = _inscricaoDividaAtivaSupplier.get();

			_inscricaoDividaAtivaSupplier = null;
		}

		return inscricaoDividaAtiva;
	}

	public void setInscricaoDividaAtiva(String inscricaoDividaAtiva) {
		this.inscricaoDividaAtiva = inscricaoDividaAtiva;

		_inscricaoDividaAtivaSupplier = null;
	}

	@JsonIgnore
	public void setInscricaoDividaAtiva(
		UnsafeSupplier<String, Exception> inscricaoDividaAtivaUnsafeSupplier) {

		_inscricaoDividaAtivaSupplier = () -> {
			try {
				return inscricaoDividaAtivaUnsafeSupplier.get();
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
	protected String inscricaoDividaAtiva;

	@JsonIgnore
	private Supplier<String> _inscricaoDividaAtivaSupplier;

	@io.swagger.v3.oas.annotations.media.Schema
	public String getNatureza() {
		if (_naturezaSupplier != null) {
			natureza = _naturezaSupplier.get();

			_naturezaSupplier = null;
		}

		return natureza;
	}

	public void setNatureza(String natureza) {
		this.natureza = natureza;

		_naturezaSupplier = null;
	}

	@JsonIgnore
	public void setNatureza(
		UnsafeSupplier<String, Exception> naturezaUnsafeSupplier) {

		_naturezaSupplier = () -> {
			try {
				return naturezaUnsafeSupplier.get();
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
	protected String natureza;

	@JsonIgnore
	private Supplier<String> _naturezaSupplier;

	@io.swagger.v3.oas.annotations.media.Schema
	public String getSituacao() {
		if (_situacaoSupplier != null) {
			situacao = _situacaoSupplier.get();

			_situacaoSupplier = null;
		}

		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;

		_situacaoSupplier = null;
	}

	@JsonIgnore
	public void setSituacao(
		UnsafeSupplier<String, Exception> situacaoUnsafeSupplier) {

		_situacaoSupplier = () -> {
			try {
				return situacaoUnsafeSupplier.get();
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
	protected String situacao;

	@JsonIgnore
	private Supplier<String> _situacaoSupplier;

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof IdentificacaoDebitosEntity)) {
			return false;
		}

		IdentificacaoDebitosEntity identificacaoDebitosEntity =
			(IdentificacaoDebitosEntity)object;

		return Objects.equals(
			toString(), identificacaoDebitosEntity.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		StringBundler sb = new StringBundler();

		sb.append("{");

		String garantidoJudicialmente = getGarantidoJudicialmente();

		if (garantidoJudicialmente != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"garantidoJudicialmente\": ");

			sb.append("\"");

			sb.append(_escape(garantidoJudicialmente));

			sb.append("\"");
		}

		String inscricaoDividaAtiva = getInscricaoDividaAtiva();

		if (inscricaoDividaAtiva != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"inscricaoDividaAtiva\": ");

			sb.append("\"");

			sb.append(_escape(inscricaoDividaAtiva));

			sb.append("\"");
		}

		String natureza = getNatureza();

		if (natureza != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"natureza\": ");

			sb.append("\"");

			sb.append(_escape(natureza));

			sb.append("\"");
		}

		String situacao = getSituacao();

		if (situacao != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"situacao\": ");

			sb.append("\"");

			sb.append(_escape(situacao));

			sb.append("\"");
		}

		sb.append("}");

		return sb.toString();
	}

	@io.swagger.v3.oas.annotations.media.Schema(
		accessMode = io.swagger.v3.oas.annotations.media.Schema.AccessMode.READ_ONLY,
		defaultValue = "br.com.seatecnologia.gdf.negocia.headless.dto.v1_0.IdentificacaoDebitosEntity",
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
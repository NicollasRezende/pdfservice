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
@GraphQLName("FundamentacaoPedido")
@JsonFilter("Liferay.Vulcan")
@XmlRootElement(name = "FundamentacaoPedido")
public class FundamentacaoPedido implements Serializable {

	public static FundamentacaoPedido toDTO(String json) {
		return ObjectMapperUtil.readValue(FundamentacaoPedido.class, json);
	}

	public static FundamentacaoPedido unsafeToDTO(String json) {
		return ObjectMapperUtil.unsafeReadValue(
			FundamentacaoPedido.class, json);
	}

	@io.swagger.v3.oas.annotations.media.Schema
	@Valid
	public ArquivosEntity[] getDocumentacaoComprobatoria() {
		if (_documentacaoComprobatoriaSupplier != null) {
			documentacaoComprobatoria =
				_documentacaoComprobatoriaSupplier.get();

			_documentacaoComprobatoriaSupplier = null;
		}

		return documentacaoComprobatoria;
	}

	public void setDocumentacaoComprobatoria(
		ArquivosEntity[] documentacaoComprobatoria) {

		this.documentacaoComprobatoria = documentacaoComprobatoria;

		_documentacaoComprobatoriaSupplier = null;
	}

	@JsonIgnore
	public void setDocumentacaoComprobatoria(
		UnsafeSupplier<ArquivosEntity[], Exception>
			documentacaoComprobatoriaUnsafeSupplier) {

		_documentacaoComprobatoriaSupplier = () -> {
			try {
				return documentacaoComprobatoriaUnsafeSupplier.get();
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
	protected ArquivosEntity[] documentacaoComprobatoria;

	@JsonIgnore
	private Supplier<ArquivosEntity[]> _documentacaoComprobatoriaSupplier;

	@io.swagger.v3.oas.annotations.media.Schema
	public String getFundamentacao() {
		if (_fundamentacaoSupplier != null) {
			fundamentacao = _fundamentacaoSupplier.get();

			_fundamentacaoSupplier = null;
		}

		return fundamentacao;
	}

	public void setFundamentacao(String fundamentacao) {
		this.fundamentacao = fundamentacao;

		_fundamentacaoSupplier = null;
	}

	@JsonIgnore
	public void setFundamentacao(
		UnsafeSupplier<String, Exception> fundamentacaoUnsafeSupplier) {

		_fundamentacaoSupplier = () -> {
			try {
				return fundamentacaoUnsafeSupplier.get();
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
	protected String fundamentacao;

	@JsonIgnore
	private Supplier<String> _fundamentacaoSupplier;

	@io.swagger.v3.oas.annotations.media.Schema
	@Valid
	public IdentificacaoDebitosEntity[] getIdentificacaoDebitos() {
		if (_identificacaoDebitosSupplier != null) {
			identificacaoDebitos = _identificacaoDebitosSupplier.get();

			_identificacaoDebitosSupplier = null;
		}

		return identificacaoDebitos;
	}

	public void setIdentificacaoDebitos(
		IdentificacaoDebitosEntity[] identificacaoDebitos) {

		this.identificacaoDebitos = identificacaoDebitos;

		_identificacaoDebitosSupplier = null;
	}

	@JsonIgnore
	public void setIdentificacaoDebitos(
		UnsafeSupplier<IdentificacaoDebitosEntity[], Exception>
			identificacaoDebitosUnsafeSupplier) {

		_identificacaoDebitosSupplier = () -> {
			try {
				return identificacaoDebitosUnsafeSupplier.get();
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
	protected IdentificacaoDebitosEntity[] identificacaoDebitos;

	@JsonIgnore
	private Supplier<IdentificacaoDebitosEntity[]>
		_identificacaoDebitosSupplier;

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof FundamentacaoPedido)) {
			return false;
		}

		FundamentacaoPedido fundamentacaoPedido = (FundamentacaoPedido)object;

		return Objects.equals(toString(), fundamentacaoPedido.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		StringBundler sb = new StringBundler();

		sb.append("{");

		ArquivosEntity[] documentacaoComprobatoria =
			getDocumentacaoComprobatoria();

		if (documentacaoComprobatoria != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"documentacaoComprobatoria\": ");

			sb.append("[");

			for (int i = 0; i < documentacaoComprobatoria.length; i++) {
				sb.append(String.valueOf(documentacaoComprobatoria[i]));

				if ((i + 1) < documentacaoComprobatoria.length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		String fundamentacao = getFundamentacao();

		if (fundamentacao != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"fundamentacao\": ");

			sb.append("\"");

			sb.append(_escape(fundamentacao));

			sb.append("\"");
		}

		IdentificacaoDebitosEntity[] identificacaoDebitos =
			getIdentificacaoDebitos();

		if (identificacaoDebitos != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"identificacaoDebitos\": ");

			sb.append("[");

			for (int i = 0; i < identificacaoDebitos.length; i++) {
				sb.append(String.valueOf(identificacaoDebitos[i]));

				if ((i + 1) < identificacaoDebitos.length) {
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
		defaultValue = "br.com.seatecnologia.gdf.negocia.headless.dto.v1_0.FundamentacaoPedido",
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
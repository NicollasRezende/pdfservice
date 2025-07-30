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
@GraphQLName("DemonstracoesContabeisEntities")
@JsonFilter("Liferay.Vulcan")
@XmlRootElement(name = "DemonstracoesContabeisEntities")
public class DemonstracoesContabeisEntities implements Serializable {

	public static DemonstracoesContabeisEntities toDTO(String json) {
		return ObjectMapperUtil.readValue(
			DemonstracoesContabeisEntities.class, json);
	}

	public static DemonstracoesContabeisEntities unsafeToDTO(String json) {
		return ObjectMapperUtil.unsafeReadValue(
			DemonstracoesContabeisEntities.class, json);
	}

	@io.swagger.v3.oas.annotations.media.Schema
	@Valid
	public ArquivosEntity getBalancoPatrimonial() {
		if (_balancoPatrimonialSupplier != null) {
			balancoPatrimonial = _balancoPatrimonialSupplier.get();

			_balancoPatrimonialSupplier = null;
		}

		return balancoPatrimonial;
	}

	public void setBalancoPatrimonial(ArquivosEntity balancoPatrimonial) {
		this.balancoPatrimonial = balancoPatrimonial;

		_balancoPatrimonialSupplier = null;
	}

	@JsonIgnore
	public void setBalancoPatrimonial(
		UnsafeSupplier<ArquivosEntity, Exception>
			balancoPatrimonialUnsafeSupplier) {

		_balancoPatrimonialSupplier = () -> {
			try {
				return balancoPatrimonialUnsafeSupplier.get();
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
	protected ArquivosEntity balancoPatrimonial;

	@JsonIgnore
	private Supplier<ArquivosEntity> _balancoPatrimonialSupplier;

	@io.swagger.v3.oas.annotations.media.Schema
	@Valid
	public ArquivosEntity[] getDemonstracoesResultados() {
		if (_demonstracoesResultadosSupplier != null) {
			demonstracoesResultados = _demonstracoesResultadosSupplier.get();

			_demonstracoesResultadosSupplier = null;
		}

		return demonstracoesResultados;
	}

	public void setDemonstracoesResultados(
		ArquivosEntity[] demonstracoesResultados) {

		this.demonstracoesResultados = demonstracoesResultados;

		_demonstracoesResultadosSupplier = null;
	}

	@JsonIgnore
	public void setDemonstracoesResultados(
		UnsafeSupplier<ArquivosEntity[], Exception>
			demonstracoesResultadosUnsafeSupplier) {

		_demonstracoesResultadosSupplier = () -> {
			try {
				return demonstracoesResultadosUnsafeSupplier.get();
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
	protected ArquivosEntity[] demonstracoesResultados;

	@JsonIgnore
	private Supplier<ArquivosEntity[]> _demonstracoesResultadosSupplier;

	@io.swagger.v3.oas.annotations.media.Schema
	@Valid
	public ArquivosEntity getDescricaoGrupo() {
		if (_descricaoGrupoSupplier != null) {
			descricaoGrupo = _descricaoGrupoSupplier.get();

			_descricaoGrupoSupplier = null;
		}

		return descricaoGrupo;
	}

	public void setDescricaoGrupo(ArquivosEntity descricaoGrupo) {
		this.descricaoGrupo = descricaoGrupo;

		_descricaoGrupoSupplier = null;
	}

	@JsonIgnore
	public void setDescricaoGrupo(
		UnsafeSupplier<ArquivosEntity, Exception>
			descricaoGrupoUnsafeSupplier) {

		_descricaoGrupoSupplier = () -> {
			try {
				return descricaoGrupoUnsafeSupplier.get();
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
	protected ArquivosEntity descricaoGrupo;

	@JsonIgnore
	private Supplier<ArquivosEntity> _descricaoGrupoSupplier;

	@io.swagger.v3.oas.annotations.media.Schema
	@Valid
	public ArquivosEntity[] getOutrosContabeis() {
		if (_outrosContabeisSupplier != null) {
			outrosContabeis = _outrosContabeisSupplier.get();

			_outrosContabeisSupplier = null;
		}

		return outrosContabeis;
	}

	public void setOutrosContabeis(ArquivosEntity[] outrosContabeis) {
		this.outrosContabeis = outrosContabeis;

		_outrosContabeisSupplier = null;
	}

	@JsonIgnore
	public void setOutrosContabeis(
		UnsafeSupplier<ArquivosEntity[], Exception>
			outrosContabeisUnsafeSupplier) {

		_outrosContabeisSupplier = () -> {
			try {
				return outrosContabeisUnsafeSupplier.get();
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
	protected ArquivosEntity[] outrosContabeis;

	@JsonIgnore
	private Supplier<ArquivosEntity[]> _outrosContabeisSupplier;

	@io.swagger.v3.oas.annotations.media.Schema
	@Valid
	public ArquivosEntity[] getRelatoriosGerenciais() {
		if (_relatoriosGerenciaisSupplier != null) {
			relatoriosGerenciais = _relatoriosGerenciaisSupplier.get();

			_relatoriosGerenciaisSupplier = null;
		}

		return relatoriosGerenciais;
	}

	public void setRelatoriosGerenciais(ArquivosEntity[] relatoriosGerenciais) {
		this.relatoriosGerenciais = relatoriosGerenciais;

		_relatoriosGerenciaisSupplier = null;
	}

	@JsonIgnore
	public void setRelatoriosGerenciais(
		UnsafeSupplier<ArquivosEntity[], Exception>
			relatoriosGerenciaisUnsafeSupplier) {

		_relatoriosGerenciaisSupplier = () -> {
			try {
				return relatoriosGerenciaisUnsafeSupplier.get();
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
	protected ArquivosEntity[] relatoriosGerenciais;

	@JsonIgnore
	private Supplier<ArquivosEntity[]> _relatoriosGerenciaisSupplier;

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof DemonstracoesContabeisEntities)) {
			return false;
		}

		DemonstracoesContabeisEntities demonstracoesContabeisEntities =
			(DemonstracoesContabeisEntities)object;

		return Objects.equals(
			toString(), demonstracoesContabeisEntities.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		StringBundler sb = new StringBundler();

		sb.append("{");

		ArquivosEntity balancoPatrimonial = getBalancoPatrimonial();

		if (balancoPatrimonial != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"balancoPatrimonial\": ");

			sb.append(String.valueOf(balancoPatrimonial));
		}

		ArquivosEntity[] demonstracoesResultados = getDemonstracoesResultados();

		if (demonstracoesResultados != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"demonstracoesResultados\": ");

			sb.append("[");

			for (int i = 0; i < demonstracoesResultados.length; i++) {
				sb.append(String.valueOf(demonstracoesResultados[i]));

				if ((i + 1) < demonstracoesResultados.length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		ArquivosEntity descricaoGrupo = getDescricaoGrupo();

		if (descricaoGrupo != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"descricaoGrupo\": ");

			sb.append(String.valueOf(descricaoGrupo));
		}

		ArquivosEntity[] outrosContabeis = getOutrosContabeis();

		if (outrosContabeis != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"outrosContabeis\": ");

			sb.append("[");

			for (int i = 0; i < outrosContabeis.length; i++) {
				sb.append(String.valueOf(outrosContabeis[i]));

				if ((i + 1) < outrosContabeis.length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		ArquivosEntity[] relatoriosGerenciais = getRelatoriosGerenciais();

		if (relatoriosGerenciais != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"relatoriosGerenciais\": ");

			sb.append("[");

			for (int i = 0; i < relatoriosGerenciais.length; i++) {
				sb.append(String.valueOf(relatoriosGerenciais[i]));

				if ((i + 1) < relatoriosGerenciais.length) {
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
		defaultValue = "br.com.seatecnologia.gdf.negocia.headless.dto.v1_0.DemonstracoesContabeisEntities",
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
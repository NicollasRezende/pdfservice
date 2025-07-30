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
@GraphQLName("QualificacaoCompletaEntity")
@JsonFilter("Liferay.Vulcan")
@XmlRootElement(name = "QualificacaoCompletaEntity")
public class QualificacaoCompletaEntity implements Serializable {

	public static QualificacaoCompletaEntity toDTO(String json) {
		return ObjectMapperUtil.readValue(
			QualificacaoCompletaEntity.class, json);
	}

	public static QualificacaoCompletaEntity unsafeToDTO(String json) {
		return ObjectMapperUtil.unsafeReadValue(
			QualificacaoCompletaEntity.class, json);
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
	public String getDomicilioFiscal() {
		if (_domicilioFiscalSupplier != null) {
			domicilioFiscal = _domicilioFiscalSupplier.get();

			_domicilioFiscalSupplier = null;
		}

		return domicilioFiscal;
	}

	public void setDomicilioFiscal(String domicilioFiscal) {
		this.domicilioFiscal = domicilioFiscal;

		_domicilioFiscalSupplier = null;
	}

	@JsonIgnore
	public void setDomicilioFiscal(
		UnsafeSupplier<String, Exception> domicilioFiscalUnsafeSupplier) {

		_domicilioFiscalSupplier = () -> {
			try {
				return domicilioFiscalUnsafeSupplier.get();
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
	protected String domicilioFiscal;

	@JsonIgnore
	private Supplier<String> _domicilioFiscalSupplier;

	@io.swagger.v3.oas.annotations.media.Schema
	public String getEmail() {
		if (_emailSupplier != null) {
			email = _emailSupplier.get();

			_emailSupplier = null;
		}

		return email;
	}

	public void setEmail(String email) {
		this.email = email;

		_emailSupplier = null;
	}

	@JsonIgnore
	public void setEmail(
		UnsafeSupplier<String, Exception> emailUnsafeSupplier) {

		_emailSupplier = () -> {
			try {
				return emailUnsafeSupplier.get();
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
	protected String email;

	@JsonIgnore
	private Supplier<String> _emailSupplier;

	@io.swagger.v3.oas.annotations.media.Schema
	@Valid
	public EnderecoEntity getEnderecoPostal() {
		if (_enderecoPostalSupplier != null) {
			enderecoPostal = _enderecoPostalSupplier.get();

			_enderecoPostalSupplier = null;
		}

		return enderecoPostal;
	}

	public void setEnderecoPostal(EnderecoEntity enderecoPostal) {
		this.enderecoPostal = enderecoPostal;

		_enderecoPostalSupplier = null;
	}

	@JsonIgnore
	public void setEnderecoPostal(
		UnsafeSupplier<EnderecoEntity, Exception>
			enderecoPostalUnsafeSupplier) {

		_enderecoPostalSupplier = () -> {
			try {
				return enderecoPostalUnsafeSupplier.get();
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
	protected EnderecoEntity enderecoPostal;

	@JsonIgnore
	private Supplier<EnderecoEntity> _enderecoPostalSupplier;

	@io.swagger.v3.oas.annotations.media.Schema
	public String getNomeFantasia() {
		if (_nomeFantasiaSupplier != null) {
			nomeFantasia = _nomeFantasiaSupplier.get();

			_nomeFantasiaSupplier = null;
		}

		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;

		_nomeFantasiaSupplier = null;
	}

	@JsonIgnore
	public void setNomeFantasia(
		UnsafeSupplier<String, Exception> nomeFantasiaUnsafeSupplier) {

		_nomeFantasiaSupplier = () -> {
			try {
				return nomeFantasiaUnsafeSupplier.get();
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
	protected String nomeFantasia;

	@JsonIgnore
	private Supplier<String> _nomeFantasiaSupplier;

	@io.swagger.v3.oas.annotations.media.Schema
	public String getNomeRazaoSocial() {
		if (_nomeRazaoSocialSupplier != null) {
			nomeRazaoSocial = _nomeRazaoSocialSupplier.get();

			_nomeRazaoSocialSupplier = null;
		}

		return nomeRazaoSocial;
	}

	public void setNomeRazaoSocial(String nomeRazaoSocial) {
		this.nomeRazaoSocial = nomeRazaoSocial;

		_nomeRazaoSocialSupplier = null;
	}

	@JsonIgnore
	public void setNomeRazaoSocial(
		UnsafeSupplier<String, Exception> nomeRazaoSocialUnsafeSupplier) {

		_nomeRazaoSocialSupplier = () -> {
			try {
				return nomeRazaoSocialUnsafeSupplier.get();
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
	protected String nomeRazaoSocial;

	@JsonIgnore
	private Supplier<String> _nomeRazaoSocialSupplier;

	@io.swagger.v3.oas.annotations.media.Schema
	public String getNumeroCfdf() {
		if (_numeroCfdfSupplier != null) {
			numeroCfdf = _numeroCfdfSupplier.get();

			_numeroCfdfSupplier = null;
		}

		return numeroCfdf;
	}

	public void setNumeroCfdf(String numeroCfdf) {
		this.numeroCfdf = numeroCfdf;

		_numeroCfdfSupplier = null;
	}

	@JsonIgnore
	public void setNumeroCfdf(
		UnsafeSupplier<String, Exception> numeroCfdfUnsafeSupplier) {

		_numeroCfdfSupplier = () -> {
			try {
				return numeroCfdfUnsafeSupplier.get();
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
	protected String numeroCfdf;

	@JsonIgnore
	private Supplier<String> _numeroCfdfSupplier;

	@io.swagger.v3.oas.annotations.media.Schema
	public Long getQualificacaoId() {
		if (_qualificacaoIdSupplier != null) {
			qualificacaoId = _qualificacaoIdSupplier.get();

			_qualificacaoIdSupplier = null;
		}

		return qualificacaoId;
	}

	public void setQualificacaoId(Long qualificacaoId) {
		this.qualificacaoId = qualificacaoId;

		_qualificacaoIdSupplier = null;
	}

	@JsonIgnore
	public void setQualificacaoId(
		UnsafeSupplier<Long, Exception> qualificacaoIdUnsafeSupplier) {

		_qualificacaoIdSupplier = () -> {
			try {
				return qualificacaoIdUnsafeSupplier.get();
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
	protected Long qualificacaoId;

	@JsonIgnore
	private Supplier<Long> _qualificacaoIdSupplier;

	@io.swagger.v3.oas.annotations.media.Schema
	public String getRepresentanteLegal() {
		if (_representanteLegalSupplier != null) {
			representanteLegal = _representanteLegalSupplier.get();

			_representanteLegalSupplier = null;
		}

		return representanteLegal;
	}

	public void setRepresentanteLegal(String representanteLegal) {
		this.representanteLegal = representanteLegal;

		_representanteLegalSupplier = null;
	}

	@JsonIgnore
	public void setRepresentanteLegal(
		UnsafeSupplier<String, Exception> representanteLegalUnsafeSupplier) {

		_representanteLegalSupplier = () -> {
			try {
				return representanteLegalUnsafeSupplier.get();
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
	protected String representanteLegal;

	@JsonIgnore
	private Supplier<String> _representanteLegalSupplier;

	@io.swagger.v3.oas.annotations.media.Schema
	public String getTelefone() {
		if (_telefoneSupplier != null) {
			telefone = _telefoneSupplier.get();

			_telefoneSupplier = null;
		}

		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;

		_telefoneSupplier = null;
	}

	@JsonIgnore
	public void setTelefone(
		UnsafeSupplier<String, Exception> telefoneUnsafeSupplier) {

		_telefoneSupplier = () -> {
			try {
				return telefoneUnsafeSupplier.get();
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
	protected String telefone;

	@JsonIgnore
	private Supplier<String> _telefoneSupplier;

	@io.swagger.v3.oas.annotations.media.Schema
	public String getTipoPessoa() {
		if (_tipoPessoaSupplier != null) {
			tipoPessoa = _tipoPessoaSupplier.get();

			_tipoPessoaSupplier = null;
		}

		return tipoPessoa;
	}

	public void setTipoPessoa(String tipoPessoa) {
		this.tipoPessoa = tipoPessoa;

		_tipoPessoaSupplier = null;
	}

	@JsonIgnore
	public void setTipoPessoa(
		UnsafeSupplier<String, Exception> tipoPessoaUnsafeSupplier) {

		_tipoPessoaSupplier = () -> {
			try {
				return tipoPessoaUnsafeSupplier.get();
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
	protected String tipoPessoa;

	@JsonIgnore
	private Supplier<String> _tipoPessoaSupplier;

	@io.swagger.v3.oas.annotations.media.Schema
	public String getWhatsapp() {
		if (_whatsappSupplier != null) {
			whatsapp = _whatsappSupplier.get();

			_whatsappSupplier = null;
		}

		return whatsapp;
	}

	public void setWhatsapp(String whatsapp) {
		this.whatsapp = whatsapp;

		_whatsappSupplier = null;
	}

	@JsonIgnore
	public void setWhatsapp(
		UnsafeSupplier<String, Exception> whatsappUnsafeSupplier) {

		_whatsappSupplier = () -> {
			try {
				return whatsappUnsafeSupplier.get();
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
	protected String whatsapp;

	@JsonIgnore
	private Supplier<String> _whatsappSupplier;

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof QualificacaoCompletaEntity)) {
			return false;
		}

		QualificacaoCompletaEntity qualificacaoCompletaEntity =
			(QualificacaoCompletaEntity)object;

		return Objects.equals(
			toString(), qualificacaoCompletaEntity.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		StringBundler sb = new StringBundler();

		sb.append("{");

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

		String domicilioFiscal = getDomicilioFiscal();

		if (domicilioFiscal != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"domicilioFiscal\": ");

			sb.append("\"");

			sb.append(_escape(domicilioFiscal));

			sb.append("\"");
		}

		String email = getEmail();

		if (email != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"email\": ");

			sb.append("\"");

			sb.append(_escape(email));

			sb.append("\"");
		}

		EnderecoEntity enderecoPostal = getEnderecoPostal();

		if (enderecoPostal != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"enderecoPostal\": ");

			sb.append(String.valueOf(enderecoPostal));
		}

		String nomeFantasia = getNomeFantasia();

		if (nomeFantasia != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"nomeFantasia\": ");

			sb.append("\"");

			sb.append(_escape(nomeFantasia));

			sb.append("\"");
		}

		String nomeRazaoSocial = getNomeRazaoSocial();

		if (nomeRazaoSocial != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"nomeRazaoSocial\": ");

			sb.append("\"");

			sb.append(_escape(nomeRazaoSocial));

			sb.append("\"");
		}

		String numeroCfdf = getNumeroCfdf();

		if (numeroCfdf != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"numeroCfdf\": ");

			sb.append("\"");

			sb.append(_escape(numeroCfdf));

			sb.append("\"");
		}

		Long qualificacaoId = getQualificacaoId();

		if (qualificacaoId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"qualificacaoId\": ");

			sb.append(qualificacaoId);
		}

		String representanteLegal = getRepresentanteLegal();

		if (representanteLegal != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"representanteLegal\": ");

			sb.append("\"");

			sb.append(_escape(representanteLegal));

			sb.append("\"");
		}

		String telefone = getTelefone();

		if (telefone != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"telefone\": ");

			sb.append("\"");

			sb.append(_escape(telefone));

			sb.append("\"");
		}

		String tipoPessoa = getTipoPessoa();

		if (tipoPessoa != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"tipoPessoa\": ");

			sb.append("\"");

			sb.append(_escape(tipoPessoa));

			sb.append("\"");
		}

		String whatsapp = getWhatsapp();

		if (whatsapp != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"whatsapp\": ");

			sb.append("\"");

			sb.append(_escape(whatsapp));

			sb.append("\"");
		}

		sb.append("}");

		return sb.toString();
	}

	@io.swagger.v3.oas.annotations.media.Schema(
		accessMode = io.swagger.v3.oas.annotations.media.Schema.AccessMode.READ_ONLY,
		defaultValue = "br.com.seatecnologia.gdf.negocia.headless.dto.v1_0.QualificacaoCompletaEntity",
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
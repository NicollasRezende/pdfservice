package br.com.seatecnologia.gdf.negocia.headless.client.dto.v1_0;

import br.com.seatecnologia.gdf.negocia.headless.client.dto.v1_0.EnderecoEntity;
import br.com.seatecnologia.gdf.negocia.headless.client.function.UnsafeSupplier;
import br.com.seatecnologia.gdf.negocia.headless.client.serdes.v1_0.QualificacaoCompletaEntitySerDes;

import java.io.Serializable;

import java.util.Objects;

import javax.annotation.Generated;

/**
 * @author sabrina
 * @generated
 */
@Generated("")
public class QualificacaoCompletaEntity implements Cloneable, Serializable {

	public static QualificacaoCompletaEntity toDTO(String json) {
		return QualificacaoCompletaEntitySerDes.toDTO(json);
	}

	public String getCpfCnpj() {
		return cpfCnpj;
	}

	public void setCpfCnpj(String cpfCnpj) {
		this.cpfCnpj = cpfCnpj;
	}

	public void setCpfCnpj(
		UnsafeSupplier<String, Exception> cpfCnpjUnsafeSupplier) {

		try {
			cpfCnpj = cpfCnpjUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String cpfCnpj;

	public String getDomicilioFiscal() {
		return domicilioFiscal;
	}

	public void setDomicilioFiscal(String domicilioFiscal) {
		this.domicilioFiscal = domicilioFiscal;
	}

	public void setDomicilioFiscal(
		UnsafeSupplier<String, Exception> domicilioFiscalUnsafeSupplier) {

		try {
			domicilioFiscal = domicilioFiscalUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String domicilioFiscal;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setEmail(
		UnsafeSupplier<String, Exception> emailUnsafeSupplier) {

		try {
			email = emailUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String email;

	public EnderecoEntity getEnderecoPostal() {
		return enderecoPostal;
	}

	public void setEnderecoPostal(EnderecoEntity enderecoPostal) {
		this.enderecoPostal = enderecoPostal;
	}

	public void setEnderecoPostal(
		UnsafeSupplier<EnderecoEntity, Exception>
			enderecoPostalUnsafeSupplier) {

		try {
			enderecoPostal = enderecoPostalUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected EnderecoEntity enderecoPostal;

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	public void setNomeFantasia(
		UnsafeSupplier<String, Exception> nomeFantasiaUnsafeSupplier) {

		try {
			nomeFantasia = nomeFantasiaUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String nomeFantasia;

	public String getNomeRazaoSocial() {
		return nomeRazaoSocial;
	}

	public void setNomeRazaoSocial(String nomeRazaoSocial) {
		this.nomeRazaoSocial = nomeRazaoSocial;
	}

	public void setNomeRazaoSocial(
		UnsafeSupplier<String, Exception> nomeRazaoSocialUnsafeSupplier) {

		try {
			nomeRazaoSocial = nomeRazaoSocialUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String nomeRazaoSocial;

	public String getNumeroCfdf() {
		return numeroCfdf;
	}

	public void setNumeroCfdf(String numeroCfdf) {
		this.numeroCfdf = numeroCfdf;
	}

	public void setNumeroCfdf(
		UnsafeSupplier<String, Exception> numeroCfdfUnsafeSupplier) {

		try {
			numeroCfdf = numeroCfdfUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String numeroCfdf;

	public Long getQualificacaoId() {
		return qualificacaoId;
	}

	public void setQualificacaoId(Long qualificacaoId) {
		this.qualificacaoId = qualificacaoId;
	}

	public void setQualificacaoId(
		UnsafeSupplier<Long, Exception> qualificacaoIdUnsafeSupplier) {

		try {
			qualificacaoId = qualificacaoIdUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Long qualificacaoId;

	public String getRepresentanteLegal() {
		return representanteLegal;
	}

	public void setRepresentanteLegal(String representanteLegal) {
		this.representanteLegal = representanteLegal;
	}

	public void setRepresentanteLegal(
		UnsafeSupplier<String, Exception> representanteLegalUnsafeSupplier) {

		try {
			representanteLegal = representanteLegalUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String representanteLegal;

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public void setTelefone(
		UnsafeSupplier<String, Exception> telefoneUnsafeSupplier) {

		try {
			telefone = telefoneUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String telefone;

	public String getTipoPessoa() {
		return tipoPessoa;
	}

	public void setTipoPessoa(String tipoPessoa) {
		this.tipoPessoa = tipoPessoa;
	}

	public void setTipoPessoa(
		UnsafeSupplier<String, Exception> tipoPessoaUnsafeSupplier) {

		try {
			tipoPessoa = tipoPessoaUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String tipoPessoa;

	public String getWhatsapp() {
		return whatsapp;
	}

	public void setWhatsapp(String whatsapp) {
		this.whatsapp = whatsapp;
	}

	public void setWhatsapp(
		UnsafeSupplier<String, Exception> whatsappUnsafeSupplier) {

		try {
			whatsapp = whatsappUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String whatsapp;

	@Override
	public QualificacaoCompletaEntity clone()
		throws CloneNotSupportedException {

		return (QualificacaoCompletaEntity)super.clone();
	}

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
		return QualificacaoCompletaEntitySerDes.toJSON(this);
	}

}
/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link QualificacaoCompleta}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see QualificacaoCompleta
 * @generated
 */
public class QualificacaoCompletaWrapper
	extends BaseModelWrapper<QualificacaoCompleta>
	implements ModelWrapper<QualificacaoCompleta>, QualificacaoCompleta {

	public QualificacaoCompletaWrapper(
		QualificacaoCompleta qualificacaoCompleta) {

		super(qualificacaoCompleta);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("qualificacaoId", getQualificacaoId());
		attributes.put("tipoPessoa", getTipoPessoa());
		attributes.put("nomeRazaoSocial", getNomeRazaoSocial());
		attributes.put("nomeFantasia", getNomeFantasia());
		attributes.put("representanteLegal", getRepresentanteLegal());
		attributes.put("cpfCnpj", getCpfCnpj());
		attributes.put("domicilioFiscal", getDomicilioFiscal());
		attributes.put("numeroCfdf", getNumeroCfdf());
		attributes.put("email", getEmail());
		attributes.put("telefone", getTelefone());
		attributes.put("whatsapp", getWhatsapp());
		attributes.put("enderecoPostalId", getEnderecoPostalId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long qualificacaoId = (Long)attributes.get("qualificacaoId");

		if (qualificacaoId != null) {
			setQualificacaoId(qualificacaoId);
		}

		String tipoPessoa = (String)attributes.get("tipoPessoa");

		if (tipoPessoa != null) {
			setTipoPessoa(tipoPessoa);
		}

		String nomeRazaoSocial = (String)attributes.get("nomeRazaoSocial");

		if (nomeRazaoSocial != null) {
			setNomeRazaoSocial(nomeRazaoSocial);
		}

		String nomeFantasia = (String)attributes.get("nomeFantasia");

		if (nomeFantasia != null) {
			setNomeFantasia(nomeFantasia);
		}

		String representanteLegal = (String)attributes.get(
			"representanteLegal");

		if (representanteLegal != null) {
			setRepresentanteLegal(representanteLegal);
		}

		String cpfCnpj = (String)attributes.get("cpfCnpj");

		if (cpfCnpj != null) {
			setCpfCnpj(cpfCnpj);
		}

		String domicilioFiscal = (String)attributes.get("domicilioFiscal");

		if (domicilioFiscal != null) {
			setDomicilioFiscal(domicilioFiscal);
		}

		String numeroCfdf = (String)attributes.get("numeroCfdf");

		if (numeroCfdf != null) {
			setNumeroCfdf(numeroCfdf);
		}

		String email = (String)attributes.get("email");

		if (email != null) {
			setEmail(email);
		}

		String telefone = (String)attributes.get("telefone");

		if (telefone != null) {
			setTelefone(telefone);
		}

		String whatsapp = (String)attributes.get("whatsapp");

		if (whatsapp != null) {
			setWhatsapp(whatsapp);
		}

		Long enderecoPostalId = (Long)attributes.get("enderecoPostalId");

		if (enderecoPostalId != null) {
			setEnderecoPostalId(enderecoPostalId);
		}
	}

	@Override
	public QualificacaoCompleta cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the cpf cnpj of this qualificacao completa.
	 *
	 * @return the cpf cnpj of this qualificacao completa
	 */
	@Override
	public String getCpfCnpj() {
		return model.getCpfCnpj();
	}

	/**
	 * Returns the domicilio fiscal of this qualificacao completa.
	 *
	 * @return the domicilio fiscal of this qualificacao completa
	 */
	@Override
	public String getDomicilioFiscal() {
		return model.getDomicilioFiscal();
	}

	/**
	 * Returns the email of this qualificacao completa.
	 *
	 * @return the email of this qualificacao completa
	 */
	@Override
	public String getEmail() {
		return model.getEmail();
	}

	/**
	 * Returns the endereco postal ID of this qualificacao completa.
	 *
	 * @return the endereco postal ID of this qualificacao completa
	 */
	@Override
	public long getEnderecoPostalId() {
		return model.getEnderecoPostalId();
	}

	/**
	 * Returns the nome fantasia of this qualificacao completa.
	 *
	 * @return the nome fantasia of this qualificacao completa
	 */
	@Override
	public String getNomeFantasia() {
		return model.getNomeFantasia();
	}

	/**
	 * Returns the nome razao social of this qualificacao completa.
	 *
	 * @return the nome razao social of this qualificacao completa
	 */
	@Override
	public String getNomeRazaoSocial() {
		return model.getNomeRazaoSocial();
	}

	/**
	 * Returns the numero cfdf of this qualificacao completa.
	 *
	 * @return the numero cfdf of this qualificacao completa
	 */
	@Override
	public String getNumeroCfdf() {
		return model.getNumeroCfdf();
	}

	/**
	 * Returns the primary key of this qualificacao completa.
	 *
	 * @return the primary key of this qualificacao completa
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the qualificacao ID of this qualificacao completa.
	 *
	 * @return the qualificacao ID of this qualificacao completa
	 */
	@Override
	public long getQualificacaoId() {
		return model.getQualificacaoId();
	}

	/**
	 * Returns the representante legal of this qualificacao completa.
	 *
	 * @return the representante legal of this qualificacao completa
	 */
	@Override
	public String getRepresentanteLegal() {
		return model.getRepresentanteLegal();
	}

	/**
	 * Returns the telefone of this qualificacao completa.
	 *
	 * @return the telefone of this qualificacao completa
	 */
	@Override
	public String getTelefone() {
		return model.getTelefone();
	}

	/**
	 * Returns the tipo pessoa of this qualificacao completa.
	 *
	 * @return the tipo pessoa of this qualificacao completa
	 */
	@Override
	public String getTipoPessoa() {
		return model.getTipoPessoa();
	}

	/**
	 * Returns the uuid of this qualificacao completa.
	 *
	 * @return the uuid of this qualificacao completa
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	/**
	 * Returns the whatsapp of this qualificacao completa.
	 *
	 * @return the whatsapp of this qualificacao completa
	 */
	@Override
	public String getWhatsapp() {
		return model.getWhatsapp();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the cpf cnpj of this qualificacao completa.
	 *
	 * @param cpfCnpj the cpf cnpj of this qualificacao completa
	 */
	@Override
	public void setCpfCnpj(String cpfCnpj) {
		model.setCpfCnpj(cpfCnpj);
	}

	/**
	 * Sets the domicilio fiscal of this qualificacao completa.
	 *
	 * @param domicilioFiscal the domicilio fiscal of this qualificacao completa
	 */
	@Override
	public void setDomicilioFiscal(String domicilioFiscal) {
		model.setDomicilioFiscal(domicilioFiscal);
	}

	/**
	 * Sets the email of this qualificacao completa.
	 *
	 * @param email the email of this qualificacao completa
	 */
	@Override
	public void setEmail(String email) {
		model.setEmail(email);
	}

	/**
	 * Sets the endereco postal ID of this qualificacao completa.
	 *
	 * @param enderecoPostalId the endereco postal ID of this qualificacao completa
	 */
	@Override
	public void setEnderecoPostalId(long enderecoPostalId) {
		model.setEnderecoPostalId(enderecoPostalId);
	}

	/**
	 * Sets the nome fantasia of this qualificacao completa.
	 *
	 * @param nomeFantasia the nome fantasia of this qualificacao completa
	 */
	@Override
	public void setNomeFantasia(String nomeFantasia) {
		model.setNomeFantasia(nomeFantasia);
	}

	/**
	 * Sets the nome razao social of this qualificacao completa.
	 *
	 * @param nomeRazaoSocial the nome razao social of this qualificacao completa
	 */
	@Override
	public void setNomeRazaoSocial(String nomeRazaoSocial) {
		model.setNomeRazaoSocial(nomeRazaoSocial);
	}

	/**
	 * Sets the numero cfdf of this qualificacao completa.
	 *
	 * @param numeroCfdf the numero cfdf of this qualificacao completa
	 */
	@Override
	public void setNumeroCfdf(String numeroCfdf) {
		model.setNumeroCfdf(numeroCfdf);
	}

	/**
	 * Sets the primary key of this qualificacao completa.
	 *
	 * @param primaryKey the primary key of this qualificacao completa
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the qualificacao ID of this qualificacao completa.
	 *
	 * @param qualificacaoId the qualificacao ID of this qualificacao completa
	 */
	@Override
	public void setQualificacaoId(long qualificacaoId) {
		model.setQualificacaoId(qualificacaoId);
	}

	/**
	 * Sets the representante legal of this qualificacao completa.
	 *
	 * @param representanteLegal the representante legal of this qualificacao completa
	 */
	@Override
	public void setRepresentanteLegal(String representanteLegal) {
		model.setRepresentanteLegal(representanteLegal);
	}

	/**
	 * Sets the telefone of this qualificacao completa.
	 *
	 * @param telefone the telefone of this qualificacao completa
	 */
	@Override
	public void setTelefone(String telefone) {
		model.setTelefone(telefone);
	}

	/**
	 * Sets the tipo pessoa of this qualificacao completa.
	 *
	 * @param tipoPessoa the tipo pessoa of this qualificacao completa
	 */
	@Override
	public void setTipoPessoa(String tipoPessoa) {
		model.setTipoPessoa(tipoPessoa);
	}

	/**
	 * Sets the uuid of this qualificacao completa.
	 *
	 * @param uuid the uuid of this qualificacao completa
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	/**
	 * Sets the whatsapp of this qualificacao completa.
	 *
	 * @param whatsapp the whatsapp of this qualificacao completa
	 */
	@Override
	public void setWhatsapp(String whatsapp) {
		model.setWhatsapp(whatsapp);
	}

	@Override
	public String toXmlString() {
		return model.toXmlString();
	}

	@Override
	protected QualificacaoCompletaWrapper wrap(
		QualificacaoCompleta qualificacaoCompleta) {

		return new QualificacaoCompletaWrapper(qualificacaoCompleta);
	}

}
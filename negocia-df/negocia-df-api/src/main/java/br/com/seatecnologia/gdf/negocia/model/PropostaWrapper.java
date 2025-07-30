/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.model;

import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Proposta}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Proposta
 * @generated
 */
public class PropostaWrapper
	extends BaseModelWrapper<Proposta>
	implements ModelWrapper<Proposta>, Proposta {

	public PropostaWrapper(Proposta proposta) {
		super(proposta);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("propostaId", getPropostaId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("tipoProposta", getTipoProposta());
		attributes.put("editalId", getEditalId());
		attributes.put("qualificacaoId", getQualificacaoId());
		attributes.put("administradorJudicialId", getAdministradorJudicialId());
		attributes.put("advogadoId", getAdvogadoId());
		attributes.put("fundamentacaoPedidoId", getFundamentacaoPedidoId());
		attributes.put("procuracao", getProcuracao());
		attributes.put("cpfCnpj", getCpfCnpj());
		attributes.put("status", getStatus());
		attributes.put("numeroProtocoloSei", getNumeroProtocoloSei());
		attributes.put("protocolo", getProtocolo());
		attributes.put("documentosCompletosURL", getDocumentosCompletosURL());
		attributes.put("propostaPaiId", getPropostaPaiId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long propostaId = (Long)attributes.get("propostaId");

		if (propostaId != null) {
			setPropostaId(propostaId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String tipoProposta = (String)attributes.get("tipoProposta");

		if (tipoProposta != null) {
			setTipoProposta(tipoProposta);
		}

		Long editalId = (Long)attributes.get("editalId");

		if (editalId != null) {
			setEditalId(editalId);
		}

		Long qualificacaoId = (Long)attributes.get("qualificacaoId");

		if (qualificacaoId != null) {
			setQualificacaoId(qualificacaoId);
		}

		Long administradorJudicialId = (Long)attributes.get(
			"administradorJudicialId");

		if (administradorJudicialId != null) {
			setAdministradorJudicialId(administradorJudicialId);
		}

		Long advogadoId = (Long)attributes.get("advogadoId");

		if (advogadoId != null) {
			setAdvogadoId(advogadoId);
		}

		Long fundamentacaoPedidoId = (Long)attributes.get(
			"fundamentacaoPedidoId");

		if (fundamentacaoPedidoId != null) {
			setFundamentacaoPedidoId(fundamentacaoPedidoId);
		}

		Long procuracao = (Long)attributes.get("procuracao");

		if (procuracao != null) {
			setProcuracao(procuracao);
		}

		String cpfCnpj = (String)attributes.get("cpfCnpj");

		if (cpfCnpj != null) {
			setCpfCnpj(cpfCnpj);
		}

		String status = (String)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		String numeroProtocoloSei = (String)attributes.get(
			"numeroProtocoloSei");

		if (numeroProtocoloSei != null) {
			setNumeroProtocoloSei(numeroProtocoloSei);
		}

		String protocolo = (String)attributes.get("protocolo");

		if (protocolo != null) {
			setProtocolo(protocolo);
		}

		String documentosCompletosURL = (String)attributes.get(
			"documentosCompletosURL");

		if (documentosCompletosURL != null) {
			setDocumentosCompletosURL(documentosCompletosURL);
		}

		Long propostaPaiId = (Long)attributes.get("propostaPaiId");

		if (propostaPaiId != null) {
			setPropostaPaiId(propostaPaiId);
		}
	}

	@Override
	public Proposta cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the administrador judicial ID of this proposta.
	 *
	 * @return the administrador judicial ID of this proposta
	 */
	@Override
	public long getAdministradorJudicialId() {
		return model.getAdministradorJudicialId();
	}

	/**
	 * Returns the advogado ID of this proposta.
	 *
	 * @return the advogado ID of this proposta
	 */
	@Override
	public long getAdvogadoId() {
		return model.getAdvogadoId();
	}

	/**
	 * Returns the company ID of this proposta.
	 *
	 * @return the company ID of this proposta
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the cpf cnpj of this proposta.
	 *
	 * @return the cpf cnpj of this proposta
	 */
	@Override
	public String getCpfCnpj() {
		return model.getCpfCnpj();
	}

	/**
	 * Returns the create date of this proposta.
	 *
	 * @return the create date of this proposta
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the documentos completos url of this proposta.
	 *
	 * @return the documentos completos url of this proposta
	 */
	@Override
	public String getDocumentosCompletosURL() {
		return model.getDocumentosCompletosURL();
	}

	/**
	 * Returns the edital ID of this proposta.
	 *
	 * @return the edital ID of this proposta
	 */
	@Override
	public long getEditalId() {
		return model.getEditalId();
	}

	/**
	 * Returns the fundamentacao pedido ID of this proposta.
	 *
	 * @return the fundamentacao pedido ID of this proposta
	 */
	@Override
	public long getFundamentacaoPedidoId() {
		return model.getFundamentacaoPedidoId();
	}

	/**
	 * Returns the group ID of this proposta.
	 *
	 * @return the group ID of this proposta
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this proposta.
	 *
	 * @return the modified date of this proposta
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the numero protocolo sei of this proposta.
	 *
	 * @return the numero protocolo sei of this proposta
	 */
	@Override
	public String getNumeroProtocoloSei() {
		return model.getNumeroProtocoloSei();
	}

	/**
	 * Returns the primary key of this proposta.
	 *
	 * @return the primary key of this proposta
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the procuracao of this proposta.
	 *
	 * @return the procuracao of this proposta
	 */
	@Override
	public long getProcuracao() {
		return model.getProcuracao();
	}

	/**
	 * Returns the proposta ID of this proposta.
	 *
	 * @return the proposta ID of this proposta
	 */
	@Override
	public long getPropostaId() {
		return model.getPropostaId();
	}

	/**
	 * Returns the proposta pai ID of this proposta.
	 *
	 * @return the proposta pai ID of this proposta
	 */
	@Override
	public long getPropostaPaiId() {
		return model.getPropostaPaiId();
	}

	/**
	 * Returns the protocolo of this proposta.
	 *
	 * @return the protocolo of this proposta
	 */
	@Override
	public String getProtocolo() {
		return model.getProtocolo();
	}

	/**
	 * Returns the qualificacao ID of this proposta.
	 *
	 * @return the qualificacao ID of this proposta
	 */
	@Override
	public long getQualificacaoId() {
		return model.getQualificacaoId();
	}

	/**
	 * Returns the status of this proposta.
	 *
	 * @return the status of this proposta
	 */
	@Override
	public String getStatus() {
		return model.getStatus();
	}

	/**
	 * Returns the tipo proposta of this proposta.
	 *
	 * @return the tipo proposta of this proposta
	 */
	@Override
	public String getTipoProposta() {
		return model.getTipoProposta();
	}

	/**
	 * Returns the user ID of this proposta.
	 *
	 * @return the user ID of this proposta
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this proposta.
	 *
	 * @return the user name of this proposta
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this proposta.
	 *
	 * @return the user uuid of this proposta
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this proposta.
	 *
	 * @return the uuid of this proposta
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the administrador judicial ID of this proposta.
	 *
	 * @param administradorJudicialId the administrador judicial ID of this proposta
	 */
	@Override
	public void setAdministradorJudicialId(long administradorJudicialId) {
		model.setAdministradorJudicialId(administradorJudicialId);
	}

	/**
	 * Sets the advogado ID of this proposta.
	 *
	 * @param advogadoId the advogado ID of this proposta
	 */
	@Override
	public void setAdvogadoId(long advogadoId) {
		model.setAdvogadoId(advogadoId);
	}

	/**
	 * Sets the company ID of this proposta.
	 *
	 * @param companyId the company ID of this proposta
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the cpf cnpj of this proposta.
	 *
	 * @param cpfCnpj the cpf cnpj of this proposta
	 */
	@Override
	public void setCpfCnpj(String cpfCnpj) {
		model.setCpfCnpj(cpfCnpj);
	}

	/**
	 * Sets the create date of this proposta.
	 *
	 * @param createDate the create date of this proposta
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the documentos completos url of this proposta.
	 *
	 * @param documentosCompletosURL the documentos completos url of this proposta
	 */
	@Override
	public void setDocumentosCompletosURL(String documentosCompletosURL) {
		model.setDocumentosCompletosURL(documentosCompletosURL);
	}

	/**
	 * Sets the edital ID of this proposta.
	 *
	 * @param editalId the edital ID of this proposta
	 */
	@Override
	public void setEditalId(long editalId) {
		model.setEditalId(editalId);
	}

	/**
	 * Sets the fundamentacao pedido ID of this proposta.
	 *
	 * @param fundamentacaoPedidoId the fundamentacao pedido ID of this proposta
	 */
	@Override
	public void setFundamentacaoPedidoId(long fundamentacaoPedidoId) {
		model.setFundamentacaoPedidoId(fundamentacaoPedidoId);
	}

	/**
	 * Sets the group ID of this proposta.
	 *
	 * @param groupId the group ID of this proposta
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this proposta.
	 *
	 * @param modifiedDate the modified date of this proposta
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the numero protocolo sei of this proposta.
	 *
	 * @param numeroProtocoloSei the numero protocolo sei of this proposta
	 */
	@Override
	public void setNumeroProtocoloSei(String numeroProtocoloSei) {
		model.setNumeroProtocoloSei(numeroProtocoloSei);
	}

	/**
	 * Sets the primary key of this proposta.
	 *
	 * @param primaryKey the primary key of this proposta
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the procuracao of this proposta.
	 *
	 * @param procuracao the procuracao of this proposta
	 */
	@Override
	public void setProcuracao(long procuracao) {
		model.setProcuracao(procuracao);
	}

	/**
	 * Sets the proposta ID of this proposta.
	 *
	 * @param propostaId the proposta ID of this proposta
	 */
	@Override
	public void setPropostaId(long propostaId) {
		model.setPropostaId(propostaId);
	}

	/**
	 * Sets the proposta pai ID of this proposta.
	 *
	 * @param propostaPaiId the proposta pai ID of this proposta
	 */
	@Override
	public void setPropostaPaiId(long propostaPaiId) {
		model.setPropostaPaiId(propostaPaiId);
	}

	/**
	 * Sets the protocolo of this proposta.
	 *
	 * @param protocolo the protocolo of this proposta
	 */
	@Override
	public void setProtocolo(String protocolo) {
		model.setProtocolo(protocolo);
	}

	/**
	 * Sets the qualificacao ID of this proposta.
	 *
	 * @param qualificacaoId the qualificacao ID of this proposta
	 */
	@Override
	public void setQualificacaoId(long qualificacaoId) {
		model.setQualificacaoId(qualificacaoId);
	}

	/**
	 * Sets the status of this proposta.
	 *
	 * @param status the status of this proposta
	 */
	@Override
	public void setStatus(String status) {
		model.setStatus(status);
	}

	/**
	 * Sets the tipo proposta of this proposta.
	 *
	 * @param tipoProposta the tipo proposta of this proposta
	 */
	@Override
	public void setTipoProposta(String tipoProposta) {
		model.setTipoProposta(tipoProposta);
	}

	/**
	 * Sets the user ID of this proposta.
	 *
	 * @param userId the user ID of this proposta
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this proposta.
	 *
	 * @param userName the user name of this proposta
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this proposta.
	 *
	 * @param userUuid the user uuid of this proposta
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this proposta.
	 *
	 * @param uuid the uuid of this proposta
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	@Override
	public String toXmlString() {
		return model.toXmlString();
	}

	@Override
	public StagedModelType getStagedModelType() {
		return model.getStagedModelType();
	}

	@Override
	protected PropostaWrapper wrap(Proposta proposta) {
		return new PropostaWrapper(proposta);
	}

}
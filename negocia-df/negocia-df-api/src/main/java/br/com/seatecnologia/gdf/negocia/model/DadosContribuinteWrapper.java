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
 * This class is a wrapper for {@link DadosContribuinte}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see DadosContribuinte
 * @generated
 */
public class DadosContribuinteWrapper
	extends BaseModelWrapper<DadosContribuinte>
	implements DadosContribuinte, ModelWrapper<DadosContribuinte> {

	public DadosContribuinteWrapper(DadosContribuinte dadosContribuinte) {
		super(dadosContribuinte);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("dadosContribuinteId", getDadosContribuinteId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("userId", getUserId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("qualificacaoId", getQualificacaoId());
		attributes.put("propostaId", getPropostaId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long dadosContribuinteId = (Long)attributes.get("dadosContribuinteId");

		if (dadosContribuinteId != null) {
			setDadosContribuinteId(dadosContribuinteId);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long qualificacaoId = (Long)attributes.get("qualificacaoId");

		if (qualificacaoId != null) {
			setQualificacaoId(qualificacaoId);
		}

		Long propostaId = (Long)attributes.get("propostaId");

		if (propostaId != null) {
			setPropostaId(propostaId);
		}
	}

	@Override
	public DadosContribuinte cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this dados contribuinte.
	 *
	 * @return the company ID of this dados contribuinte
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this dados contribuinte.
	 *
	 * @return the create date of this dados contribuinte
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the dados contribuinte ID of this dados contribuinte.
	 *
	 * @return the dados contribuinte ID of this dados contribuinte
	 */
	@Override
	public long getDadosContribuinteId() {
		return model.getDadosContribuinteId();
	}

	/**
	 * Returns the group ID of this dados contribuinte.
	 *
	 * @return the group ID of this dados contribuinte
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this dados contribuinte.
	 *
	 * @return the modified date of this dados contribuinte
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this dados contribuinte.
	 *
	 * @return the primary key of this dados contribuinte
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the proposta ID of this dados contribuinte.
	 *
	 * @return the proposta ID of this dados contribuinte
	 */
	@Override
	public long getPropostaId() {
		return model.getPropostaId();
	}

	/**
	 * Returns the qualificacao ID of this dados contribuinte.
	 *
	 * @return the qualificacao ID of this dados contribuinte
	 */
	@Override
	public long getQualificacaoId() {
		return model.getQualificacaoId();
	}

	/**
	 * Returns the user ID of this dados contribuinte.
	 *
	 * @return the user ID of this dados contribuinte
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user uuid of this dados contribuinte.
	 *
	 * @return the user uuid of this dados contribuinte
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this dados contribuinte.
	 *
	 * @return the uuid of this dados contribuinte
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
	 * Sets the company ID of this dados contribuinte.
	 *
	 * @param companyId the company ID of this dados contribuinte
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this dados contribuinte.
	 *
	 * @param createDate the create date of this dados contribuinte
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the dados contribuinte ID of this dados contribuinte.
	 *
	 * @param dadosContribuinteId the dados contribuinte ID of this dados contribuinte
	 */
	@Override
	public void setDadosContribuinteId(long dadosContribuinteId) {
		model.setDadosContribuinteId(dadosContribuinteId);
	}

	/**
	 * Sets the group ID of this dados contribuinte.
	 *
	 * @param groupId the group ID of this dados contribuinte
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this dados contribuinte.
	 *
	 * @param modifiedDate the modified date of this dados contribuinte
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this dados contribuinte.
	 *
	 * @param primaryKey the primary key of this dados contribuinte
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the proposta ID of this dados contribuinte.
	 *
	 * @param propostaId the proposta ID of this dados contribuinte
	 */
	@Override
	public void setPropostaId(long propostaId) {
		model.setPropostaId(propostaId);
	}

	/**
	 * Sets the qualificacao ID of this dados contribuinte.
	 *
	 * @param qualificacaoId the qualificacao ID of this dados contribuinte
	 */
	@Override
	public void setQualificacaoId(long qualificacaoId) {
		model.setQualificacaoId(qualificacaoId);
	}

	/**
	 * Sets the user ID of this dados contribuinte.
	 *
	 * @param userId the user ID of this dados contribuinte
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user uuid of this dados contribuinte.
	 *
	 * @param userUuid the user uuid of this dados contribuinte
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this dados contribuinte.
	 *
	 * @param uuid the uuid of this dados contribuinte
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
	protected DadosContribuinteWrapper wrap(
		DadosContribuinte dadosContribuinte) {

		return new DadosContribuinteWrapper(dadosContribuinte);
	}

}
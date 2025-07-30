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
 * This class is a wrapper for {@link AcaoJudicialProposta}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AcaoJudicialProposta
 * @generated
 */
public class AcaoJudicialPropostaWrapper
	extends BaseModelWrapper<AcaoJudicialProposta>
	implements AcaoJudicialProposta, ModelWrapper<AcaoJudicialProposta> {

	public AcaoJudicialPropostaWrapper(
		AcaoJudicialProposta acaoJudicialProposta) {

		super(acaoJudicialProposta);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("acaoPropostaId", getAcaoPropostaId());
		attributes.put("propostaId", getPropostaId());
		attributes.put("acaoId", getAcaoId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long acaoPropostaId = (Long)attributes.get("acaoPropostaId");

		if (acaoPropostaId != null) {
			setAcaoPropostaId(acaoPropostaId);
		}

		Long propostaId = (Long)attributes.get("propostaId");

		if (propostaId != null) {
			setPropostaId(propostaId);
		}

		Long acaoId = (Long)attributes.get("acaoId");

		if (acaoId != null) {
			setAcaoId(acaoId);
		}
	}

	@Override
	public AcaoJudicialProposta cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the acao ID of this acao judicial proposta.
	 *
	 * @return the acao ID of this acao judicial proposta
	 */
	@Override
	public long getAcaoId() {
		return model.getAcaoId();
	}

	/**
	 * Returns the acao proposta ID of this acao judicial proposta.
	 *
	 * @return the acao proposta ID of this acao judicial proposta
	 */
	@Override
	public long getAcaoPropostaId() {
		return model.getAcaoPropostaId();
	}

	/**
	 * Returns the primary key of this acao judicial proposta.
	 *
	 * @return the primary key of this acao judicial proposta
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the proposta ID of this acao judicial proposta.
	 *
	 * @return the proposta ID of this acao judicial proposta
	 */
	@Override
	public long getPropostaId() {
		return model.getPropostaId();
	}

	/**
	 * Returns the uuid of this acao judicial proposta.
	 *
	 * @return the uuid of this acao judicial proposta
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
	 * Sets the acao ID of this acao judicial proposta.
	 *
	 * @param acaoId the acao ID of this acao judicial proposta
	 */
	@Override
	public void setAcaoId(long acaoId) {
		model.setAcaoId(acaoId);
	}

	/**
	 * Sets the acao proposta ID of this acao judicial proposta.
	 *
	 * @param acaoPropostaId the acao proposta ID of this acao judicial proposta
	 */
	@Override
	public void setAcaoPropostaId(long acaoPropostaId) {
		model.setAcaoPropostaId(acaoPropostaId);
	}

	/**
	 * Sets the primary key of this acao judicial proposta.
	 *
	 * @param primaryKey the primary key of this acao judicial proposta
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the proposta ID of this acao judicial proposta.
	 *
	 * @param propostaId the proposta ID of this acao judicial proposta
	 */
	@Override
	public void setPropostaId(long propostaId) {
		model.setPropostaId(propostaId);
	}

	/**
	 * Sets the uuid of this acao judicial proposta.
	 *
	 * @param uuid the uuid of this acao judicial proposta
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
	protected AcaoJudicialPropostaWrapper wrap(
		AcaoJudicialProposta acaoJudicialProposta) {

		return new AcaoJudicialPropostaWrapper(acaoJudicialProposta);
	}

}
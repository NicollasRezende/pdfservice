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
 * This class is a wrapper for {@link CredorProposta}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CredorProposta
 * @generated
 */
public class CredorPropostaWrapper
	extends BaseModelWrapper<CredorProposta>
	implements CredorProposta, ModelWrapper<CredorProposta> {

	public CredorPropostaWrapper(CredorProposta credorProposta) {
		super(credorProposta);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("credorPropostaId", getCredorPropostaId());
		attributes.put("propostaId", getPropostaId());
		attributes.put("credorId", getCredorId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long credorPropostaId = (Long)attributes.get("credorPropostaId");

		if (credorPropostaId != null) {
			setCredorPropostaId(credorPropostaId);
		}

		Long propostaId = (Long)attributes.get("propostaId");

		if (propostaId != null) {
			setPropostaId(propostaId);
		}

		Long credorId = (Long)attributes.get("credorId");

		if (credorId != null) {
			setCredorId(credorId);
		}
	}

	@Override
	public CredorProposta cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the credor ID of this credor proposta.
	 *
	 * @return the credor ID of this credor proposta
	 */
	@Override
	public long getCredorId() {
		return model.getCredorId();
	}

	/**
	 * Returns the credor proposta ID of this credor proposta.
	 *
	 * @return the credor proposta ID of this credor proposta
	 */
	@Override
	public long getCredorPropostaId() {
		return model.getCredorPropostaId();
	}

	/**
	 * Returns the primary key of this credor proposta.
	 *
	 * @return the primary key of this credor proposta
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the proposta ID of this credor proposta.
	 *
	 * @return the proposta ID of this credor proposta
	 */
	@Override
	public long getPropostaId() {
		return model.getPropostaId();
	}

	/**
	 * Returns the uuid of this credor proposta.
	 *
	 * @return the uuid of this credor proposta
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
	 * Sets the credor ID of this credor proposta.
	 *
	 * @param credorId the credor ID of this credor proposta
	 */
	@Override
	public void setCredorId(long credorId) {
		model.setCredorId(credorId);
	}

	/**
	 * Sets the credor proposta ID of this credor proposta.
	 *
	 * @param credorPropostaId the credor proposta ID of this credor proposta
	 */
	@Override
	public void setCredorPropostaId(long credorPropostaId) {
		model.setCredorPropostaId(credorPropostaId);
	}

	/**
	 * Sets the primary key of this credor proposta.
	 *
	 * @param primaryKey the primary key of this credor proposta
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the proposta ID of this credor proposta.
	 *
	 * @param propostaId the proposta ID of this credor proposta
	 */
	@Override
	public void setPropostaId(long propostaId) {
		model.setPropostaId(propostaId);
	}

	/**
	 * Sets the uuid of this credor proposta.
	 *
	 * @param uuid the uuid of this credor proposta
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
	protected CredorPropostaWrapper wrap(CredorProposta credorProposta) {
		return new CredorPropostaWrapper(credorProposta);
	}

}
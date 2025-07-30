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
 * This class is a wrapper for {@link GarantiaProposta}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see GarantiaProposta
 * @generated
 */
public class GarantiaPropostaWrapper
	extends BaseModelWrapper<GarantiaProposta>
	implements GarantiaProposta, ModelWrapper<GarantiaProposta> {

	public GarantiaPropostaWrapper(GarantiaProposta garantiaProposta) {
		super(garantiaProposta);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("garantiaPropostaId", getGarantiaPropostaId());
		attributes.put("propostaId", getPropostaId());
		attributes.put("garantiaId", getGarantiaId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long garantiaPropostaId = (Long)attributes.get("garantiaPropostaId");

		if (garantiaPropostaId != null) {
			setGarantiaPropostaId(garantiaPropostaId);
		}

		Long propostaId = (Long)attributes.get("propostaId");

		if (propostaId != null) {
			setPropostaId(propostaId);
		}

		Long garantiaId = (Long)attributes.get("garantiaId");

		if (garantiaId != null) {
			setGarantiaId(garantiaId);
		}
	}

	@Override
	public GarantiaProposta cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the garantia ID of this garantia proposta.
	 *
	 * @return the garantia ID of this garantia proposta
	 */
	@Override
	public long getGarantiaId() {
		return model.getGarantiaId();
	}

	/**
	 * Returns the garantia proposta ID of this garantia proposta.
	 *
	 * @return the garantia proposta ID of this garantia proposta
	 */
	@Override
	public long getGarantiaPropostaId() {
		return model.getGarantiaPropostaId();
	}

	/**
	 * Returns the primary key of this garantia proposta.
	 *
	 * @return the primary key of this garantia proposta
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the proposta ID of this garantia proposta.
	 *
	 * @return the proposta ID of this garantia proposta
	 */
	@Override
	public long getPropostaId() {
		return model.getPropostaId();
	}

	/**
	 * Returns the uuid of this garantia proposta.
	 *
	 * @return the uuid of this garantia proposta
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
	 * Sets the garantia ID of this garantia proposta.
	 *
	 * @param garantiaId the garantia ID of this garantia proposta
	 */
	@Override
	public void setGarantiaId(long garantiaId) {
		model.setGarantiaId(garantiaId);
	}

	/**
	 * Sets the garantia proposta ID of this garantia proposta.
	 *
	 * @param garantiaPropostaId the garantia proposta ID of this garantia proposta
	 */
	@Override
	public void setGarantiaPropostaId(long garantiaPropostaId) {
		model.setGarantiaPropostaId(garantiaPropostaId);
	}

	/**
	 * Sets the primary key of this garantia proposta.
	 *
	 * @param primaryKey the primary key of this garantia proposta
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the proposta ID of this garantia proposta.
	 *
	 * @param propostaId the proposta ID of this garantia proposta
	 */
	@Override
	public void setPropostaId(long propostaId) {
		model.setPropostaId(propostaId);
	}

	/**
	 * Sets the uuid of this garantia proposta.
	 *
	 * @param uuid the uuid of this garantia proposta
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
	protected GarantiaPropostaWrapper wrap(GarantiaProposta garantiaProposta) {
		return new GarantiaPropostaWrapper(garantiaProposta);
	}

}
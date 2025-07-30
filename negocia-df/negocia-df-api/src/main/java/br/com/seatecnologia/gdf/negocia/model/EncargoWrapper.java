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
 * This class is a wrapper for {@link Encargo}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Encargo
 * @generated
 */
public class EncargoWrapper
	extends BaseModelWrapper<Encargo>
	implements Encargo, ModelWrapper<Encargo> {

	public EncargoWrapper(Encargo encargo) {
		super(encargo);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("encargoId", getEncargoId());
		attributes.put("propostaId", getPropostaId());
		attributes.put("valorEncargos", getValorEncargos());
		attributes.put("descricaoEncargos", getDescricaoEncargos());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long encargoId = (Long)attributes.get("encargoId");

		if (encargoId != null) {
			setEncargoId(encargoId);
		}

		Long propostaId = (Long)attributes.get("propostaId");

		if (propostaId != null) {
			setPropostaId(propostaId);
		}

		Double valorEncargos = (Double)attributes.get("valorEncargos");

		if (valorEncargos != null) {
			setValorEncargos(valorEncargos);
		}

		String descricaoEncargos = (String)attributes.get("descricaoEncargos");

		if (descricaoEncargos != null) {
			setDescricaoEncargos(descricaoEncargos);
		}
	}

	@Override
	public Encargo cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the descricao encargos of this encargo.
	 *
	 * @return the descricao encargos of this encargo
	 */
	@Override
	public String getDescricaoEncargos() {
		return model.getDescricaoEncargos();
	}

	/**
	 * Returns the encargo ID of this encargo.
	 *
	 * @return the encargo ID of this encargo
	 */
	@Override
	public long getEncargoId() {
		return model.getEncargoId();
	}

	/**
	 * Returns the primary key of this encargo.
	 *
	 * @return the primary key of this encargo
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the proposta ID of this encargo.
	 *
	 * @return the proposta ID of this encargo
	 */
	@Override
	public long getPropostaId() {
		return model.getPropostaId();
	}

	/**
	 * Returns the uuid of this encargo.
	 *
	 * @return the uuid of this encargo
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	/**
	 * Returns the valor encargos of this encargo.
	 *
	 * @return the valor encargos of this encargo
	 */
	@Override
	public double getValorEncargos() {
		return model.getValorEncargos();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the descricao encargos of this encargo.
	 *
	 * @param descricaoEncargos the descricao encargos of this encargo
	 */
	@Override
	public void setDescricaoEncargos(String descricaoEncargos) {
		model.setDescricaoEncargos(descricaoEncargos);
	}

	/**
	 * Sets the encargo ID of this encargo.
	 *
	 * @param encargoId the encargo ID of this encargo
	 */
	@Override
	public void setEncargoId(long encargoId) {
		model.setEncargoId(encargoId);
	}

	/**
	 * Sets the primary key of this encargo.
	 *
	 * @param primaryKey the primary key of this encargo
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the proposta ID of this encargo.
	 *
	 * @param propostaId the proposta ID of this encargo
	 */
	@Override
	public void setPropostaId(long propostaId) {
		model.setPropostaId(propostaId);
	}

	/**
	 * Sets the uuid of this encargo.
	 *
	 * @param uuid the uuid of this encargo
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	/**
	 * Sets the valor encargos of this encargo.
	 *
	 * @param valorEncargos the valor encargos of this encargo
	 */
	@Override
	public void setValorEncargos(double valorEncargos) {
		model.setValorEncargos(valorEncargos);
	}

	@Override
	public String toXmlString() {
		return model.toXmlString();
	}

	@Override
	protected EncargoWrapper wrap(Encargo encargo) {
		return new EncargoWrapper(encargo);
	}

}
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
 * This class is a wrapper for {@link DemaisPartes}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see DemaisPartes
 * @generated
 */
public class DemaisPartesWrapper
	extends BaseModelWrapper<DemaisPartes>
	implements DemaisPartes, ModelWrapper<DemaisPartes> {

	public DemaisPartesWrapper(DemaisPartes demaisPartes) {
		super(demaisPartes);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("demaisPartesId", getDemaisPartesId());
		attributes.put("qualificacaoId", getQualificacaoId());
		attributes.put("propostaId", getPropostaId());
		attributes.put("tipoParte", getTipoParte());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long demaisPartesId = (Long)attributes.get("demaisPartesId");

		if (demaisPartesId != null) {
			setDemaisPartesId(demaisPartesId);
		}

		Long qualificacaoId = (Long)attributes.get("qualificacaoId");

		if (qualificacaoId != null) {
			setQualificacaoId(qualificacaoId);
		}

		Long propostaId = (Long)attributes.get("propostaId");

		if (propostaId != null) {
			setPropostaId(propostaId);
		}

		String tipoParte = (String)attributes.get("tipoParte");

		if (tipoParte != null) {
			setTipoParte(tipoParte);
		}
	}

	@Override
	public DemaisPartes cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the demais partes ID of this demais partes.
	 *
	 * @return the demais partes ID of this demais partes
	 */
	@Override
	public long getDemaisPartesId() {
		return model.getDemaisPartesId();
	}

	/**
	 * Returns the primary key of this demais partes.
	 *
	 * @return the primary key of this demais partes
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the proposta ID of this demais partes.
	 *
	 * @return the proposta ID of this demais partes
	 */
	@Override
	public long getPropostaId() {
		return model.getPropostaId();
	}

	/**
	 * Returns the qualificacao ID of this demais partes.
	 *
	 * @return the qualificacao ID of this demais partes
	 */
	@Override
	public long getQualificacaoId() {
		return model.getQualificacaoId();
	}

	/**
	 * Returns the tipo parte of this demais partes.
	 *
	 * @return the tipo parte of this demais partes
	 */
	@Override
	public String getTipoParte() {
		return model.getTipoParte();
	}

	/**
	 * Returns the uuid of this demais partes.
	 *
	 * @return the uuid of this demais partes
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
	 * Sets the demais partes ID of this demais partes.
	 *
	 * @param demaisPartesId the demais partes ID of this demais partes
	 */
	@Override
	public void setDemaisPartesId(long demaisPartesId) {
		model.setDemaisPartesId(demaisPartesId);
	}

	/**
	 * Sets the primary key of this demais partes.
	 *
	 * @param primaryKey the primary key of this demais partes
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the proposta ID of this demais partes.
	 *
	 * @param propostaId the proposta ID of this demais partes
	 */
	@Override
	public void setPropostaId(long propostaId) {
		model.setPropostaId(propostaId);
	}

	/**
	 * Sets the qualificacao ID of this demais partes.
	 *
	 * @param qualificacaoId the qualificacao ID of this demais partes
	 */
	@Override
	public void setQualificacaoId(long qualificacaoId) {
		model.setQualificacaoId(qualificacaoId);
	}

	/**
	 * Sets the tipo parte of this demais partes.
	 *
	 * @param tipoParte the tipo parte of this demais partes
	 */
	@Override
	public void setTipoParte(String tipoParte) {
		model.setTipoParte(tipoParte);
	}

	/**
	 * Sets the uuid of this demais partes.
	 *
	 * @param uuid the uuid of this demais partes
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
	protected DemaisPartesWrapper wrap(DemaisPartes demaisPartes) {
		return new DemaisPartesWrapper(demaisPartes);
	}

}
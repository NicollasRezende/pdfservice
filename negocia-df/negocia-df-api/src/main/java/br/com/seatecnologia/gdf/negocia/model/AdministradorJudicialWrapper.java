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
 * This class is a wrapper for {@link AdministradorJudicial}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AdministradorJudicial
 * @generated
 */
public class AdministradorJudicialWrapper
	extends BaseModelWrapper<AdministradorJudicial>
	implements AdministradorJudicial, ModelWrapper<AdministradorJudicial> {

	public AdministradorJudicialWrapper(
		AdministradorJudicial administradorJudicial) {

		super(administradorJudicial);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("administradorJudicialId", getAdministradorJudicialId());
		attributes.put("qualificacaoId", getQualificacaoId());
		attributes.put("regimeFalencia", isRegimeFalencia());
		attributes.put("recuperacao", getRecuperacao());
		attributes.put("numeroProcesso", getNumeroProcesso());
		attributes.put("anexoRecuperacao", getAnexoRecuperacao());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long administradorJudicialId = (Long)attributes.get(
			"administradorJudicialId");

		if (administradorJudicialId != null) {
			setAdministradorJudicialId(administradorJudicialId);
		}

		Long qualificacaoId = (Long)attributes.get("qualificacaoId");

		if (qualificacaoId != null) {
			setQualificacaoId(qualificacaoId);
		}

		Boolean regimeFalencia = (Boolean)attributes.get("regimeFalencia");

		if (regimeFalencia != null) {
			setRegimeFalencia(regimeFalencia);
		}

		String recuperacao = (String)attributes.get("recuperacao");

		if (recuperacao != null) {
			setRecuperacao(recuperacao);
		}

		String numeroProcesso = (String)attributes.get("numeroProcesso");

		if (numeroProcesso != null) {
			setNumeroProcesso(numeroProcesso);
		}

		Long anexoRecuperacao = (Long)attributes.get("anexoRecuperacao");

		if (anexoRecuperacao != null) {
			setAnexoRecuperacao(anexoRecuperacao);
		}
	}

	@Override
	public AdministradorJudicial cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the administrador judicial ID of this administrador judicial.
	 *
	 * @return the administrador judicial ID of this administrador judicial
	 */
	@Override
	public long getAdministradorJudicialId() {
		return model.getAdministradorJudicialId();
	}

	/**
	 * Returns the anexo recuperacao of this administrador judicial.
	 *
	 * @return the anexo recuperacao of this administrador judicial
	 */
	@Override
	public long getAnexoRecuperacao() {
		return model.getAnexoRecuperacao();
	}

	/**
	 * Returns the numero processo of this administrador judicial.
	 *
	 * @return the numero processo of this administrador judicial
	 */
	@Override
	public String getNumeroProcesso() {
		return model.getNumeroProcesso();
	}

	/**
	 * Returns the primary key of this administrador judicial.
	 *
	 * @return the primary key of this administrador judicial
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the qualificacao ID of this administrador judicial.
	 *
	 * @return the qualificacao ID of this administrador judicial
	 */
	@Override
	public long getQualificacaoId() {
		return model.getQualificacaoId();
	}

	/**
	 * Returns the recuperacao of this administrador judicial.
	 *
	 * @return the recuperacao of this administrador judicial
	 */
	@Override
	public String getRecuperacao() {
		return model.getRecuperacao();
	}

	/**
	 * Returns the regime falencia of this administrador judicial.
	 *
	 * @return the regime falencia of this administrador judicial
	 */
	@Override
	public boolean getRegimeFalencia() {
		return model.getRegimeFalencia();
	}

	/**
	 * Returns the uuid of this administrador judicial.
	 *
	 * @return the uuid of this administrador judicial
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	/**
	 * Returns <code>true</code> if this administrador judicial is regime falencia.
	 *
	 * @return <code>true</code> if this administrador judicial is regime falencia; <code>false</code> otherwise
	 */
	@Override
	public boolean isRegimeFalencia() {
		return model.isRegimeFalencia();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the administrador judicial ID of this administrador judicial.
	 *
	 * @param administradorJudicialId the administrador judicial ID of this administrador judicial
	 */
	@Override
	public void setAdministradorJudicialId(long administradorJudicialId) {
		model.setAdministradorJudicialId(administradorJudicialId);
	}

	/**
	 * Sets the anexo recuperacao of this administrador judicial.
	 *
	 * @param anexoRecuperacao the anexo recuperacao of this administrador judicial
	 */
	@Override
	public void setAnexoRecuperacao(long anexoRecuperacao) {
		model.setAnexoRecuperacao(anexoRecuperacao);
	}

	/**
	 * Sets the numero processo of this administrador judicial.
	 *
	 * @param numeroProcesso the numero processo of this administrador judicial
	 */
	@Override
	public void setNumeroProcesso(String numeroProcesso) {
		model.setNumeroProcesso(numeroProcesso);
	}

	/**
	 * Sets the primary key of this administrador judicial.
	 *
	 * @param primaryKey the primary key of this administrador judicial
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the qualificacao ID of this administrador judicial.
	 *
	 * @param qualificacaoId the qualificacao ID of this administrador judicial
	 */
	@Override
	public void setQualificacaoId(long qualificacaoId) {
		model.setQualificacaoId(qualificacaoId);
	}

	/**
	 * Sets the recuperacao of this administrador judicial.
	 *
	 * @param recuperacao the recuperacao of this administrador judicial
	 */
	@Override
	public void setRecuperacao(String recuperacao) {
		model.setRecuperacao(recuperacao);
	}

	/**
	 * Sets whether this administrador judicial is regime falencia.
	 *
	 * @param regimeFalencia the regime falencia of this administrador judicial
	 */
	@Override
	public void setRegimeFalencia(boolean regimeFalencia) {
		model.setRegimeFalencia(regimeFalencia);
	}

	/**
	 * Sets the uuid of this administrador judicial.
	 *
	 * @param uuid the uuid of this administrador judicial
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
	protected AdministradorJudicialWrapper wrap(
		AdministradorJudicial administradorJudicial) {

		return new AdministradorJudicialWrapper(administradorJudicial);
	}

}
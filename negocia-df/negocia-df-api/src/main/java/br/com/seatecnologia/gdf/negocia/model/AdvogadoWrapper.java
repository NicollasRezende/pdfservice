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
 * This class is a wrapper for {@link Advogado}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Advogado
 * @generated
 */
public class AdvogadoWrapper
	extends BaseModelWrapper<Advogado>
	implements Advogado, ModelWrapper<Advogado> {

	public AdvogadoWrapper(Advogado advogado) {
		super(advogado);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("advogadoId", getAdvogadoId());
		attributes.put("qualificacaoId", getQualificacaoId());
		attributes.put("numeroOab", getNumeroOab());
		attributes.put("seccional", getSeccional());
		attributes.put("carteirinhaOAB", getCarteirinhaOAB());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long advogadoId = (Long)attributes.get("advogadoId");

		if (advogadoId != null) {
			setAdvogadoId(advogadoId);
		}

		Long qualificacaoId = (Long)attributes.get("qualificacaoId");

		if (qualificacaoId != null) {
			setQualificacaoId(qualificacaoId);
		}

		String numeroOab = (String)attributes.get("numeroOab");

		if (numeroOab != null) {
			setNumeroOab(numeroOab);
		}

		String seccional = (String)attributes.get("seccional");

		if (seccional != null) {
			setSeccional(seccional);
		}

		Long carteirinhaOAB = (Long)attributes.get("carteirinhaOAB");

		if (carteirinhaOAB != null) {
			setCarteirinhaOAB(carteirinhaOAB);
		}
	}

	@Override
	public Advogado cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the advogado ID of this advogado.
	 *
	 * @return the advogado ID of this advogado
	 */
	@Override
	public long getAdvogadoId() {
		return model.getAdvogadoId();
	}

	/**
	 * Returns the carteirinha oab of this advogado.
	 *
	 * @return the carteirinha oab of this advogado
	 */
	@Override
	public long getCarteirinhaOAB() {
		return model.getCarteirinhaOAB();
	}

	/**
	 * Returns the numero oab of this advogado.
	 *
	 * @return the numero oab of this advogado
	 */
	@Override
	public String getNumeroOab() {
		return model.getNumeroOab();
	}

	/**
	 * Returns the primary key of this advogado.
	 *
	 * @return the primary key of this advogado
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the qualificacao ID of this advogado.
	 *
	 * @return the qualificacao ID of this advogado
	 */
	@Override
	public long getQualificacaoId() {
		return model.getQualificacaoId();
	}

	/**
	 * Returns the seccional of this advogado.
	 *
	 * @return the seccional of this advogado
	 */
	@Override
	public String getSeccional() {
		return model.getSeccional();
	}

	/**
	 * Returns the uuid of this advogado.
	 *
	 * @return the uuid of this advogado
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
	 * Sets the advogado ID of this advogado.
	 *
	 * @param advogadoId the advogado ID of this advogado
	 */
	@Override
	public void setAdvogadoId(long advogadoId) {
		model.setAdvogadoId(advogadoId);
	}

	/**
	 * Sets the carteirinha oab of this advogado.
	 *
	 * @param carteirinhaOAB the carteirinha oab of this advogado
	 */
	@Override
	public void setCarteirinhaOAB(long carteirinhaOAB) {
		model.setCarteirinhaOAB(carteirinhaOAB);
	}

	/**
	 * Sets the numero oab of this advogado.
	 *
	 * @param numeroOab the numero oab of this advogado
	 */
	@Override
	public void setNumeroOab(String numeroOab) {
		model.setNumeroOab(numeroOab);
	}

	/**
	 * Sets the primary key of this advogado.
	 *
	 * @param primaryKey the primary key of this advogado
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the qualificacao ID of this advogado.
	 *
	 * @param qualificacaoId the qualificacao ID of this advogado
	 */
	@Override
	public void setQualificacaoId(long qualificacaoId) {
		model.setQualificacaoId(qualificacaoId);
	}

	/**
	 * Sets the seccional of this advogado.
	 *
	 * @param seccional the seccional of this advogado
	 */
	@Override
	public void setSeccional(String seccional) {
		model.setSeccional(seccional);
	}

	/**
	 * Sets the uuid of this advogado.
	 *
	 * @param uuid the uuid of this advogado
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
	protected AdvogadoWrapper wrap(Advogado advogado) {
		return new AdvogadoWrapper(advogado);
	}

}
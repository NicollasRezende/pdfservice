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
 * This class is a wrapper for {@link BensDireitosLaudo}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see BensDireitosLaudo
 * @generated
 */
public class BensDireitosLaudoWrapper
	extends BaseModelWrapper<BensDireitosLaudo>
	implements BensDireitosLaudo, ModelWrapper<BensDireitosLaudo> {

	public BensDireitosLaudoWrapper(BensDireitosLaudo bensDireitosLaudo) {
		super(bensDireitosLaudo);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("bensDireitosLaudoId", getBensDireitosLaudoId());
		attributes.put("bemId", getBemId());
		attributes.put("laudoAvaliacao", getLaudoAvaliacao());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long bensDireitosLaudoId = (Long)attributes.get("bensDireitosLaudoId");

		if (bensDireitosLaudoId != null) {
			setBensDireitosLaudoId(bensDireitosLaudoId);
		}

		Long bemId = (Long)attributes.get("bemId");

		if (bemId != null) {
			setBemId(bemId);
		}

		Long laudoAvaliacao = (Long)attributes.get("laudoAvaliacao");

		if (laudoAvaliacao != null) {
			setLaudoAvaliacao(laudoAvaliacao);
		}
	}

	@Override
	public BensDireitosLaudo cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the bem ID of this bens direitos laudo.
	 *
	 * @return the bem ID of this bens direitos laudo
	 */
	@Override
	public long getBemId() {
		return model.getBemId();
	}

	/**
	 * Returns the bens direitos laudo ID of this bens direitos laudo.
	 *
	 * @return the bens direitos laudo ID of this bens direitos laudo
	 */
	@Override
	public long getBensDireitosLaudoId() {
		return model.getBensDireitosLaudoId();
	}

	/**
	 * Returns the laudo avaliacao of this bens direitos laudo.
	 *
	 * @return the laudo avaliacao of this bens direitos laudo
	 */
	@Override
	public long getLaudoAvaliacao() {
		return model.getLaudoAvaliacao();
	}

	/**
	 * Returns the primary key of this bens direitos laudo.
	 *
	 * @return the primary key of this bens direitos laudo
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the uuid of this bens direitos laudo.
	 *
	 * @return the uuid of this bens direitos laudo
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
	 * Sets the bem ID of this bens direitos laudo.
	 *
	 * @param bemId the bem ID of this bens direitos laudo
	 */
	@Override
	public void setBemId(long bemId) {
		model.setBemId(bemId);
	}

	/**
	 * Sets the bens direitos laudo ID of this bens direitos laudo.
	 *
	 * @param bensDireitosLaudoId the bens direitos laudo ID of this bens direitos laudo
	 */
	@Override
	public void setBensDireitosLaudoId(long bensDireitosLaudoId) {
		model.setBensDireitosLaudoId(bensDireitosLaudoId);
	}

	/**
	 * Sets the laudo avaliacao of this bens direitos laudo.
	 *
	 * @param laudoAvaliacao the laudo avaliacao of this bens direitos laudo
	 */
	@Override
	public void setLaudoAvaliacao(long laudoAvaliacao) {
		model.setLaudoAvaliacao(laudoAvaliacao);
	}

	/**
	 * Sets the primary key of this bens direitos laudo.
	 *
	 * @param primaryKey the primary key of this bens direitos laudo
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the uuid of this bens direitos laudo.
	 *
	 * @param uuid the uuid of this bens direitos laudo
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
	protected BensDireitosLaudoWrapper wrap(
		BensDireitosLaudo bensDireitosLaudo) {

		return new BensDireitosLaudoWrapper(bensDireitosLaudo);
	}

}
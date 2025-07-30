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
 * This class is a wrapper for {@link AnexosOutros}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AnexosOutros
 * @generated
 */
public class AnexosOutrosWrapper
	extends BaseModelWrapper<AnexosOutros>
	implements AnexosOutros, ModelWrapper<AnexosOutros> {

	public AnexosOutrosWrapper(AnexosOutros anexosOutros) {
		super(anexosOutros);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("anexosOutrosId", getAnexosOutrosId());
		attributes.put("dadosRegistroId", getDadosRegistroId());
		attributes.put("outrosAnexo", getOutrosAnexo());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long anexosOutrosId = (Long)attributes.get("anexosOutrosId");

		if (anexosOutrosId != null) {
			setAnexosOutrosId(anexosOutrosId);
		}

		Long dadosRegistroId = (Long)attributes.get("dadosRegistroId");

		if (dadosRegistroId != null) {
			setDadosRegistroId(dadosRegistroId);
		}

		Long outrosAnexo = (Long)attributes.get("outrosAnexo");

		if (outrosAnexo != null) {
			setOutrosAnexo(outrosAnexo);
		}
	}

	@Override
	public AnexosOutros cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the anexos outros ID of this anexos outros.
	 *
	 * @return the anexos outros ID of this anexos outros
	 */
	@Override
	public long getAnexosOutrosId() {
		return model.getAnexosOutrosId();
	}

	/**
	 * Returns the dados registro ID of this anexos outros.
	 *
	 * @return the dados registro ID of this anexos outros
	 */
	@Override
	public long getDadosRegistroId() {
		return model.getDadosRegistroId();
	}

	/**
	 * Returns the outros anexo of this anexos outros.
	 *
	 * @return the outros anexo of this anexos outros
	 */
	@Override
	public long getOutrosAnexo() {
		return model.getOutrosAnexo();
	}

	/**
	 * Returns the primary key of this anexos outros.
	 *
	 * @return the primary key of this anexos outros
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the uuid of this anexos outros.
	 *
	 * @return the uuid of this anexos outros
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
	 * Sets the anexos outros ID of this anexos outros.
	 *
	 * @param anexosOutrosId the anexos outros ID of this anexos outros
	 */
	@Override
	public void setAnexosOutrosId(long anexosOutrosId) {
		model.setAnexosOutrosId(anexosOutrosId);
	}

	/**
	 * Sets the dados registro ID of this anexos outros.
	 *
	 * @param dadosRegistroId the dados registro ID of this anexos outros
	 */
	@Override
	public void setDadosRegistroId(long dadosRegistroId) {
		model.setDadosRegistroId(dadosRegistroId);
	}

	/**
	 * Sets the outros anexo of this anexos outros.
	 *
	 * @param outrosAnexo the outros anexo of this anexos outros
	 */
	@Override
	public void setOutrosAnexo(long outrosAnexo) {
		model.setOutrosAnexo(outrosAnexo);
	}

	/**
	 * Sets the primary key of this anexos outros.
	 *
	 * @param primaryKey the primary key of this anexos outros
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the uuid of this anexos outros.
	 *
	 * @param uuid the uuid of this anexos outros
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
	protected AnexosOutrosWrapper wrap(AnexosOutros anexosOutros) {
		return new AnexosOutrosWrapper(anexosOutros);
	}

}
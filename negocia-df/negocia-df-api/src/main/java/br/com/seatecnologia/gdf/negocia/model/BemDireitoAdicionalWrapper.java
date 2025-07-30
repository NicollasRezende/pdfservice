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
 * This class is a wrapper for {@link BemDireitoAdicional}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see BemDireitoAdicional
 * @generated
 */
public class BemDireitoAdicionalWrapper
	extends BaseModelWrapper<BemDireitoAdicional>
	implements BemDireitoAdicional, ModelWrapper<BemDireitoAdicional> {

	public BemDireitoAdicionalWrapper(BemDireitoAdicional bemDireitoAdicional) {
		super(bemDireitoAdicional);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("bemId", getBemId());
		attributes.put("propostaId", getPropostaId());
		attributes.put("descricao", getDescricao());
		attributes.put("localizacao", getLocalizacao());
		attributes.put("destinacao", getDestinacao());
		attributes.put("laudoAvaliacao", getLaudoAvaliacao());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long bemId = (Long)attributes.get("bemId");

		if (bemId != null) {
			setBemId(bemId);
		}

		Long propostaId = (Long)attributes.get("propostaId");

		if (propostaId != null) {
			setPropostaId(propostaId);
		}

		String descricao = (String)attributes.get("descricao");

		if (descricao != null) {
			setDescricao(descricao);
		}

		String localizacao = (String)attributes.get("localizacao");

		if (localizacao != null) {
			setLocalizacao(localizacao);
		}

		String destinacao = (String)attributes.get("destinacao");

		if (destinacao != null) {
			setDestinacao(destinacao);
		}

		String laudoAvaliacao = (String)attributes.get("laudoAvaliacao");

		if (laudoAvaliacao != null) {
			setLaudoAvaliacao(laudoAvaliacao);
		}
	}

	@Override
	public BemDireitoAdicional cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the bem ID of this bem direito adicional.
	 *
	 * @return the bem ID of this bem direito adicional
	 */
	@Override
	public long getBemId() {
		return model.getBemId();
	}

	/**
	 * Returns the descricao of this bem direito adicional.
	 *
	 * @return the descricao of this bem direito adicional
	 */
	@Override
	public String getDescricao() {
		return model.getDescricao();
	}

	/**
	 * Returns the destinacao of this bem direito adicional.
	 *
	 * @return the destinacao of this bem direito adicional
	 */
	@Override
	public String getDestinacao() {
		return model.getDestinacao();
	}

	/**
	 * Returns the laudo avaliacao of this bem direito adicional.
	 *
	 * @return the laudo avaliacao of this bem direito adicional
	 */
	@Override
	public String getLaudoAvaliacao() {
		return model.getLaudoAvaliacao();
	}

	/**
	 * Returns the localizacao of this bem direito adicional.
	 *
	 * @return the localizacao of this bem direito adicional
	 */
	@Override
	public String getLocalizacao() {
		return model.getLocalizacao();
	}

	/**
	 * Returns the primary key of this bem direito adicional.
	 *
	 * @return the primary key of this bem direito adicional
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the proposta ID of this bem direito adicional.
	 *
	 * @return the proposta ID of this bem direito adicional
	 */
	@Override
	public long getPropostaId() {
		return model.getPropostaId();
	}

	/**
	 * Returns the uuid of this bem direito adicional.
	 *
	 * @return the uuid of this bem direito adicional
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
	 * Sets the bem ID of this bem direito adicional.
	 *
	 * @param bemId the bem ID of this bem direito adicional
	 */
	@Override
	public void setBemId(long bemId) {
		model.setBemId(bemId);
	}

	/**
	 * Sets the descricao of this bem direito adicional.
	 *
	 * @param descricao the descricao of this bem direito adicional
	 */
	@Override
	public void setDescricao(String descricao) {
		model.setDescricao(descricao);
	}

	/**
	 * Sets the destinacao of this bem direito adicional.
	 *
	 * @param destinacao the destinacao of this bem direito adicional
	 */
	@Override
	public void setDestinacao(String destinacao) {
		model.setDestinacao(destinacao);
	}

	/**
	 * Sets the laudo avaliacao of this bem direito adicional.
	 *
	 * @param laudoAvaliacao the laudo avaliacao of this bem direito adicional
	 */
	@Override
	public void setLaudoAvaliacao(String laudoAvaliacao) {
		model.setLaudoAvaliacao(laudoAvaliacao);
	}

	/**
	 * Sets the localizacao of this bem direito adicional.
	 *
	 * @param localizacao the localizacao of this bem direito adicional
	 */
	@Override
	public void setLocalizacao(String localizacao) {
		model.setLocalizacao(localizacao);
	}

	/**
	 * Sets the primary key of this bem direito adicional.
	 *
	 * @param primaryKey the primary key of this bem direito adicional
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the proposta ID of this bem direito adicional.
	 *
	 * @param propostaId the proposta ID of this bem direito adicional
	 */
	@Override
	public void setPropostaId(long propostaId) {
		model.setPropostaId(propostaId);
	}

	/**
	 * Sets the uuid of this bem direito adicional.
	 *
	 * @param uuid the uuid of this bem direito adicional
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
	protected BemDireitoAdicionalWrapper wrap(
		BemDireitoAdicional bemDireitoAdicional) {

		return new BemDireitoAdicionalWrapper(bemDireitoAdicional);
	}

}
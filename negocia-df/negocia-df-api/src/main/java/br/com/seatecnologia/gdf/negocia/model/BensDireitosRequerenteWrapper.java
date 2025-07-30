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
 * This class is a wrapper for {@link BensDireitosRequerente}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see BensDireitosRequerente
 * @generated
 */
public class BensDireitosRequerenteWrapper
	extends BaseModelWrapper<BensDireitosRequerente>
	implements BensDireitosRequerente, ModelWrapper<BensDireitosRequerente> {

	public BensDireitosRequerenteWrapper(
		BensDireitosRequerente bensDireitosRequerente) {

		super(bensDireitosRequerente);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("bemId", getBemId());
		attributes.put("propostaId", getPropostaId());
		attributes.put("descricao", getDescricao());
		attributes.put("localizacaoDestinacao", getLocalizacaoDestinacao());

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

		String localizacaoDestinacao = (String)attributes.get(
			"localizacaoDestinacao");

		if (localizacaoDestinacao != null) {
			setLocalizacaoDestinacao(localizacaoDestinacao);
		}
	}

	@Override
	public BensDireitosRequerente cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the bem ID of this bens direitos requerente.
	 *
	 * @return the bem ID of this bens direitos requerente
	 */
	@Override
	public long getBemId() {
		return model.getBemId();
	}

	/**
	 * Returns the descricao of this bens direitos requerente.
	 *
	 * @return the descricao of this bens direitos requerente
	 */
	@Override
	public String getDescricao() {
		return model.getDescricao();
	}

	/**
	 * Returns the localizacao destinacao of this bens direitos requerente.
	 *
	 * @return the localizacao destinacao of this bens direitos requerente
	 */
	@Override
	public String getLocalizacaoDestinacao() {
		return model.getLocalizacaoDestinacao();
	}

	/**
	 * Returns the primary key of this bens direitos requerente.
	 *
	 * @return the primary key of this bens direitos requerente
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the proposta ID of this bens direitos requerente.
	 *
	 * @return the proposta ID of this bens direitos requerente
	 */
	@Override
	public long getPropostaId() {
		return model.getPropostaId();
	}

	/**
	 * Returns the uuid of this bens direitos requerente.
	 *
	 * @return the uuid of this bens direitos requerente
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
	 * Sets the bem ID of this bens direitos requerente.
	 *
	 * @param bemId the bem ID of this bens direitos requerente
	 */
	@Override
	public void setBemId(long bemId) {
		model.setBemId(bemId);
	}

	/**
	 * Sets the descricao of this bens direitos requerente.
	 *
	 * @param descricao the descricao of this bens direitos requerente
	 */
	@Override
	public void setDescricao(String descricao) {
		model.setDescricao(descricao);
	}

	/**
	 * Sets the localizacao destinacao of this bens direitos requerente.
	 *
	 * @param localizacaoDestinacao the localizacao destinacao of this bens direitos requerente
	 */
	@Override
	public void setLocalizacaoDestinacao(String localizacaoDestinacao) {
		model.setLocalizacaoDestinacao(localizacaoDestinacao);
	}

	/**
	 * Sets the primary key of this bens direitos requerente.
	 *
	 * @param primaryKey the primary key of this bens direitos requerente
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the proposta ID of this bens direitos requerente.
	 *
	 * @param propostaId the proposta ID of this bens direitos requerente
	 */
	@Override
	public void setPropostaId(long propostaId) {
		model.setPropostaId(propostaId);
	}

	/**
	 * Sets the uuid of this bens direitos requerente.
	 *
	 * @param uuid the uuid of this bens direitos requerente
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
	protected BensDireitosRequerenteWrapper wrap(
		BensDireitosRequerente bensDireitosRequerente) {

		return new BensDireitosRequerenteWrapper(bensDireitosRequerente);
	}

}
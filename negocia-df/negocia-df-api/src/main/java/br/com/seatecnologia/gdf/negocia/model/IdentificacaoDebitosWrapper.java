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
 * This class is a wrapper for {@link IdentificacaoDebitos}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see IdentificacaoDebitos
 * @generated
 */
public class IdentificacaoDebitosWrapper
	extends BaseModelWrapper<IdentificacaoDebitos>
	implements IdentificacaoDebitos, ModelWrapper<IdentificacaoDebitos> {

	public IdentificacaoDebitosWrapper(
		IdentificacaoDebitos identificacaoDebitos) {

		super(identificacaoDebitos);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("identificacaoDebitosId", getIdentificacaoDebitosId());
		attributes.put("fundamentacaoId", getFundamentacaoId());
		attributes.put("natureza", getNatureza());
		attributes.put("situacao", getSituacao());
		attributes.put("inscricaoDividaAtiva", getInscricaoDividaAtiva());
		attributes.put("garantidoJudicialmente", getGarantidoJudicialmente());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long identificacaoDebitosId = (Long)attributes.get(
			"identificacaoDebitosId");

		if (identificacaoDebitosId != null) {
			setIdentificacaoDebitosId(identificacaoDebitosId);
		}

		Long fundamentacaoId = (Long)attributes.get("fundamentacaoId");

		if (fundamentacaoId != null) {
			setFundamentacaoId(fundamentacaoId);
		}

		String natureza = (String)attributes.get("natureza");

		if (natureza != null) {
			setNatureza(natureza);
		}

		String situacao = (String)attributes.get("situacao");

		if (situacao != null) {
			setSituacao(situacao);
		}

		String inscricaoDividaAtiva = (String)attributes.get(
			"inscricaoDividaAtiva");

		if (inscricaoDividaAtiva != null) {
			setInscricaoDividaAtiva(inscricaoDividaAtiva);
		}

		String garantidoJudicialmente = (String)attributes.get(
			"garantidoJudicialmente");

		if (garantidoJudicialmente != null) {
			setGarantidoJudicialmente(garantidoJudicialmente);
		}
	}

	@Override
	public IdentificacaoDebitos cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the fundamentacao ID of this identificacao debitos.
	 *
	 * @return the fundamentacao ID of this identificacao debitos
	 */
	@Override
	public long getFundamentacaoId() {
		return model.getFundamentacaoId();
	}

	/**
	 * Returns the garantido judicialmente of this identificacao debitos.
	 *
	 * @return the garantido judicialmente of this identificacao debitos
	 */
	@Override
	public String getGarantidoJudicialmente() {
		return model.getGarantidoJudicialmente();
	}

	/**
	 * Returns the identificacao debitos ID of this identificacao debitos.
	 *
	 * @return the identificacao debitos ID of this identificacao debitos
	 */
	@Override
	public long getIdentificacaoDebitosId() {
		return model.getIdentificacaoDebitosId();
	}

	/**
	 * Returns the inscricao divida ativa of this identificacao debitos.
	 *
	 * @return the inscricao divida ativa of this identificacao debitos
	 */
	@Override
	public String getInscricaoDividaAtiva() {
		return model.getInscricaoDividaAtiva();
	}

	/**
	 * Returns the natureza of this identificacao debitos.
	 *
	 * @return the natureza of this identificacao debitos
	 */
	@Override
	public String getNatureza() {
		return model.getNatureza();
	}

	/**
	 * Returns the primary key of this identificacao debitos.
	 *
	 * @return the primary key of this identificacao debitos
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the situacao of this identificacao debitos.
	 *
	 * @return the situacao of this identificacao debitos
	 */
	@Override
	public String getSituacao() {
		return model.getSituacao();
	}

	/**
	 * Returns the uuid of this identificacao debitos.
	 *
	 * @return the uuid of this identificacao debitos
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
	 * Sets the fundamentacao ID of this identificacao debitos.
	 *
	 * @param fundamentacaoId the fundamentacao ID of this identificacao debitos
	 */
	@Override
	public void setFundamentacaoId(long fundamentacaoId) {
		model.setFundamentacaoId(fundamentacaoId);
	}

	/**
	 * Sets the garantido judicialmente of this identificacao debitos.
	 *
	 * @param garantidoJudicialmente the garantido judicialmente of this identificacao debitos
	 */
	@Override
	public void setGarantidoJudicialmente(String garantidoJudicialmente) {
		model.setGarantidoJudicialmente(garantidoJudicialmente);
	}

	/**
	 * Sets the identificacao debitos ID of this identificacao debitos.
	 *
	 * @param identificacaoDebitosId the identificacao debitos ID of this identificacao debitos
	 */
	@Override
	public void setIdentificacaoDebitosId(long identificacaoDebitosId) {
		model.setIdentificacaoDebitosId(identificacaoDebitosId);
	}

	/**
	 * Sets the inscricao divida ativa of this identificacao debitos.
	 *
	 * @param inscricaoDividaAtiva the inscricao divida ativa of this identificacao debitos
	 */
	@Override
	public void setInscricaoDividaAtiva(String inscricaoDividaAtiva) {
		model.setInscricaoDividaAtiva(inscricaoDividaAtiva);
	}

	/**
	 * Sets the natureza of this identificacao debitos.
	 *
	 * @param natureza the natureza of this identificacao debitos
	 */
	@Override
	public void setNatureza(String natureza) {
		model.setNatureza(natureza);
	}

	/**
	 * Sets the primary key of this identificacao debitos.
	 *
	 * @param primaryKey the primary key of this identificacao debitos
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the situacao of this identificacao debitos.
	 *
	 * @param situacao the situacao of this identificacao debitos
	 */
	@Override
	public void setSituacao(String situacao) {
		model.setSituacao(situacao);
	}

	/**
	 * Sets the uuid of this identificacao debitos.
	 *
	 * @param uuid the uuid of this identificacao debitos
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
	protected IdentificacaoDebitosWrapper wrap(
		IdentificacaoDebitos identificacaoDebitos) {

		return new IdentificacaoDebitosWrapper(identificacaoDebitos);
	}

}
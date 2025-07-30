/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link CreditoTransacionado}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CreditoTransacionado
 * @generated
 */
public class CreditoTransacionadoWrapper
	extends BaseModelWrapper<CreditoTransacionado>
	implements CreditoTransacionado, ModelWrapper<CreditoTransacionado> {

	public CreditoTransacionadoWrapper(
		CreditoTransacionado creditoTransacionado) {

		super(creditoTransacionado);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("creditoId", getCreditoId());
		attributes.put("propostaId", getPropostaId());
		attributes.put("numeroInscricao", getNumeroInscricao());
		attributes.put("codigoReceita", getCodigoReceita());
		attributes.put("dataInscricao", getDataInscricao());
		attributes.put("valorAtualizado", getValorAtualizado());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long creditoId = (Long)attributes.get("creditoId");

		if (creditoId != null) {
			setCreditoId(creditoId);
		}

		Long propostaId = (Long)attributes.get("propostaId");

		if (propostaId != null) {
			setPropostaId(propostaId);
		}

		String numeroInscricao = (String)attributes.get("numeroInscricao");

		if (numeroInscricao != null) {
			setNumeroInscricao(numeroInscricao);
		}

		String codigoReceita = (String)attributes.get("codigoReceita");

		if (codigoReceita != null) {
			setCodigoReceita(codigoReceita);
		}

		Date dataInscricao = (Date)attributes.get("dataInscricao");

		if (dataInscricao != null) {
			setDataInscricao(dataInscricao);
		}

		Double valorAtualizado = (Double)attributes.get("valorAtualizado");

		if (valorAtualizado != null) {
			setValorAtualizado(valorAtualizado);
		}
	}

	@Override
	public CreditoTransacionado cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the codigo receita of this credito transacionado.
	 *
	 * @return the codigo receita of this credito transacionado
	 */
	@Override
	public String getCodigoReceita() {
		return model.getCodigoReceita();
	}

	/**
	 * Returns the credito ID of this credito transacionado.
	 *
	 * @return the credito ID of this credito transacionado
	 */
	@Override
	public long getCreditoId() {
		return model.getCreditoId();
	}

	/**
	 * Returns the data inscricao of this credito transacionado.
	 *
	 * @return the data inscricao of this credito transacionado
	 */
	@Override
	public Date getDataInscricao() {
		return model.getDataInscricao();
	}

	/**
	 * Returns the numero inscricao of this credito transacionado.
	 *
	 * @return the numero inscricao of this credito transacionado
	 */
	@Override
	public String getNumeroInscricao() {
		return model.getNumeroInscricao();
	}

	/**
	 * Returns the primary key of this credito transacionado.
	 *
	 * @return the primary key of this credito transacionado
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the proposta ID of this credito transacionado.
	 *
	 * @return the proposta ID of this credito transacionado
	 */
	@Override
	public long getPropostaId() {
		return model.getPropostaId();
	}

	/**
	 * Returns the uuid of this credito transacionado.
	 *
	 * @return the uuid of this credito transacionado
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	/**
	 * Returns the valor atualizado of this credito transacionado.
	 *
	 * @return the valor atualizado of this credito transacionado
	 */
	@Override
	public double getValorAtualizado() {
		return model.getValorAtualizado();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the codigo receita of this credito transacionado.
	 *
	 * @param codigoReceita the codigo receita of this credito transacionado
	 */
	@Override
	public void setCodigoReceita(String codigoReceita) {
		model.setCodigoReceita(codigoReceita);
	}

	/**
	 * Sets the credito ID of this credito transacionado.
	 *
	 * @param creditoId the credito ID of this credito transacionado
	 */
	@Override
	public void setCreditoId(long creditoId) {
		model.setCreditoId(creditoId);
	}

	/**
	 * Sets the data inscricao of this credito transacionado.
	 *
	 * @param dataInscricao the data inscricao of this credito transacionado
	 */
	@Override
	public void setDataInscricao(Date dataInscricao) {
		model.setDataInscricao(dataInscricao);
	}

	/**
	 * Sets the numero inscricao of this credito transacionado.
	 *
	 * @param numeroInscricao the numero inscricao of this credito transacionado
	 */
	@Override
	public void setNumeroInscricao(String numeroInscricao) {
		model.setNumeroInscricao(numeroInscricao);
	}

	/**
	 * Sets the primary key of this credito transacionado.
	 *
	 * @param primaryKey the primary key of this credito transacionado
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the proposta ID of this credito transacionado.
	 *
	 * @param propostaId the proposta ID of this credito transacionado
	 */
	@Override
	public void setPropostaId(long propostaId) {
		model.setPropostaId(propostaId);
	}

	/**
	 * Sets the uuid of this credito transacionado.
	 *
	 * @param uuid the uuid of this credito transacionado
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	/**
	 * Sets the valor atualizado of this credito transacionado.
	 *
	 * @param valorAtualizado the valor atualizado of this credito transacionado
	 */
	@Override
	public void setValorAtualizado(double valorAtualizado) {
		model.setValorAtualizado(valorAtualizado);
	}

	@Override
	public String toXmlString() {
		return model.toXmlString();
	}

	@Override
	protected CreditoTransacionadoWrapper wrap(
		CreditoTransacionado creditoTransacionado) {

		return new CreditoTransacionadoWrapper(creditoTransacionado);
	}

}
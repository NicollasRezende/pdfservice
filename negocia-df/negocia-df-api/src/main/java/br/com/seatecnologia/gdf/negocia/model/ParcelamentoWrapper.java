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
 * This class is a wrapper for {@link Parcelamento}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Parcelamento
 * @generated
 */
public class ParcelamentoWrapper
	extends BaseModelWrapper<Parcelamento>
	implements ModelWrapper<Parcelamento>, Parcelamento {

	public ParcelamentoWrapper(Parcelamento parcelamento) {
		super(parcelamento);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("parcelamentoId", getParcelamentoId());
		attributes.put("propostaId", getPropostaId());
		attributes.put("numeroParcelas", getNumeroParcelas());
		attributes.put("valorEntrada", getValorEntrada());
		attributes.put("dataPrimeiraParcela", getDataPrimeiraParcela());
		attributes.put("valorPrimeiraParcela", getValorPrimeiraParcela());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long parcelamentoId = (Long)attributes.get("parcelamentoId");

		if (parcelamentoId != null) {
			setParcelamentoId(parcelamentoId);
		}

		Long propostaId = (Long)attributes.get("propostaId");

		if (propostaId != null) {
			setPropostaId(propostaId);
		}

		Integer numeroParcelas = (Integer)attributes.get("numeroParcelas");

		if (numeroParcelas != null) {
			setNumeroParcelas(numeroParcelas);
		}

		Double valorEntrada = (Double)attributes.get("valorEntrada");

		if (valorEntrada != null) {
			setValorEntrada(valorEntrada);
		}

		Date dataPrimeiraParcela = (Date)attributes.get("dataPrimeiraParcela");

		if (dataPrimeiraParcela != null) {
			setDataPrimeiraParcela(dataPrimeiraParcela);
		}

		Double valorPrimeiraParcela = (Double)attributes.get(
			"valorPrimeiraParcela");

		if (valorPrimeiraParcela != null) {
			setValorPrimeiraParcela(valorPrimeiraParcela);
		}
	}

	@Override
	public Parcelamento cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the data primeira parcela of this parcelamento.
	 *
	 * @return the data primeira parcela of this parcelamento
	 */
	@Override
	public Date getDataPrimeiraParcela() {
		return model.getDataPrimeiraParcela();
	}

	/**
	 * Returns the numero parcelas of this parcelamento.
	 *
	 * @return the numero parcelas of this parcelamento
	 */
	@Override
	public int getNumeroParcelas() {
		return model.getNumeroParcelas();
	}

	/**
	 * Returns the parcelamento ID of this parcelamento.
	 *
	 * @return the parcelamento ID of this parcelamento
	 */
	@Override
	public long getParcelamentoId() {
		return model.getParcelamentoId();
	}

	/**
	 * Returns the primary key of this parcelamento.
	 *
	 * @return the primary key of this parcelamento
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the proposta ID of this parcelamento.
	 *
	 * @return the proposta ID of this parcelamento
	 */
	@Override
	public long getPropostaId() {
		return model.getPropostaId();
	}

	/**
	 * Returns the uuid of this parcelamento.
	 *
	 * @return the uuid of this parcelamento
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	/**
	 * Returns the valor entrada of this parcelamento.
	 *
	 * @return the valor entrada of this parcelamento
	 */
	@Override
	public double getValorEntrada() {
		return model.getValorEntrada();
	}

	/**
	 * Returns the valor primeira parcela of this parcelamento.
	 *
	 * @return the valor primeira parcela of this parcelamento
	 */
	@Override
	public double getValorPrimeiraParcela() {
		return model.getValorPrimeiraParcela();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the data primeira parcela of this parcelamento.
	 *
	 * @param dataPrimeiraParcela the data primeira parcela of this parcelamento
	 */
	@Override
	public void setDataPrimeiraParcela(Date dataPrimeiraParcela) {
		model.setDataPrimeiraParcela(dataPrimeiraParcela);
	}

	/**
	 * Sets the numero parcelas of this parcelamento.
	 *
	 * @param numeroParcelas the numero parcelas of this parcelamento
	 */
	@Override
	public void setNumeroParcelas(int numeroParcelas) {
		model.setNumeroParcelas(numeroParcelas);
	}

	/**
	 * Sets the parcelamento ID of this parcelamento.
	 *
	 * @param parcelamentoId the parcelamento ID of this parcelamento
	 */
	@Override
	public void setParcelamentoId(long parcelamentoId) {
		model.setParcelamentoId(parcelamentoId);
	}

	/**
	 * Sets the primary key of this parcelamento.
	 *
	 * @param primaryKey the primary key of this parcelamento
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the proposta ID of this parcelamento.
	 *
	 * @param propostaId the proposta ID of this parcelamento
	 */
	@Override
	public void setPropostaId(long propostaId) {
		model.setPropostaId(propostaId);
	}

	/**
	 * Sets the uuid of this parcelamento.
	 *
	 * @param uuid the uuid of this parcelamento
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	/**
	 * Sets the valor entrada of this parcelamento.
	 *
	 * @param valorEntrada the valor entrada of this parcelamento
	 */
	@Override
	public void setValorEntrada(double valorEntrada) {
		model.setValorEntrada(valorEntrada);
	}

	/**
	 * Sets the valor primeira parcela of this parcelamento.
	 *
	 * @param valorPrimeiraParcela the valor primeira parcela of this parcelamento
	 */
	@Override
	public void setValorPrimeiraParcela(double valorPrimeiraParcela) {
		model.setValorPrimeiraParcela(valorPrimeiraParcela);
	}

	@Override
	public String toXmlString() {
		return model.toXmlString();
	}

	@Override
	protected ParcelamentoWrapper wrap(Parcelamento parcelamento) {
		return new ParcelamentoWrapper(parcelamento);
	}

}
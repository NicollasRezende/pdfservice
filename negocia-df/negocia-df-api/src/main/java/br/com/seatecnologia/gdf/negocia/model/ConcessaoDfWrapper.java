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
 * This class is a wrapper for {@link ConcessaoDf}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ConcessaoDf
 * @generated
 */
public class ConcessaoDfWrapper
	extends BaseModelWrapper<ConcessaoDf>
	implements ConcessaoDf, ModelWrapper<ConcessaoDf> {

	public ConcessaoDfWrapper(ConcessaoDf concessaoDf) {
		super(concessaoDf);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("concessaoId", getConcessaoId());
		attributes.put("propostaId", getPropostaId());
		attributes.put("percentualDescontoJuros", getPercentualDescontoJuros());
		attributes.put(
			"percentualDescontoPrincipal", getPercentualDescontoPrincipal());
		attributes.put("observacoes", getObservacoes());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long concessaoId = (Long)attributes.get("concessaoId");

		if (concessaoId != null) {
			setConcessaoId(concessaoId);
		}

		Long propostaId = (Long)attributes.get("propostaId");

		if (propostaId != null) {
			setPropostaId(propostaId);
		}

		Double percentualDescontoJuros = (Double)attributes.get(
			"percentualDescontoJuros");

		if (percentualDescontoJuros != null) {
			setPercentualDescontoJuros(percentualDescontoJuros);
		}

		Double percentualDescontoPrincipal = (Double)attributes.get(
			"percentualDescontoPrincipal");

		if (percentualDescontoPrincipal != null) {
			setPercentualDescontoPrincipal(percentualDescontoPrincipal);
		}

		String observacoes = (String)attributes.get("observacoes");

		if (observacoes != null) {
			setObservacoes(observacoes);
		}
	}

	@Override
	public ConcessaoDf cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the concessao ID of this concessao df.
	 *
	 * @return the concessao ID of this concessao df
	 */
	@Override
	public long getConcessaoId() {
		return model.getConcessaoId();
	}

	/**
	 * Returns the observacoes of this concessao df.
	 *
	 * @return the observacoes of this concessao df
	 */
	@Override
	public String getObservacoes() {
		return model.getObservacoes();
	}

	/**
	 * Returns the percentual desconto juros of this concessao df.
	 *
	 * @return the percentual desconto juros of this concessao df
	 */
	@Override
	public double getPercentualDescontoJuros() {
		return model.getPercentualDescontoJuros();
	}

	/**
	 * Returns the percentual desconto principal of this concessao df.
	 *
	 * @return the percentual desconto principal of this concessao df
	 */
	@Override
	public double getPercentualDescontoPrincipal() {
		return model.getPercentualDescontoPrincipal();
	}

	/**
	 * Returns the primary key of this concessao df.
	 *
	 * @return the primary key of this concessao df
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the proposta ID of this concessao df.
	 *
	 * @return the proposta ID of this concessao df
	 */
	@Override
	public long getPropostaId() {
		return model.getPropostaId();
	}

	/**
	 * Returns the uuid of this concessao df.
	 *
	 * @return the uuid of this concessao df
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
	 * Sets the concessao ID of this concessao df.
	 *
	 * @param concessaoId the concessao ID of this concessao df
	 */
	@Override
	public void setConcessaoId(long concessaoId) {
		model.setConcessaoId(concessaoId);
	}

	/**
	 * Sets the observacoes of this concessao df.
	 *
	 * @param observacoes the observacoes of this concessao df
	 */
	@Override
	public void setObservacoes(String observacoes) {
		model.setObservacoes(observacoes);
	}

	/**
	 * Sets the percentual desconto juros of this concessao df.
	 *
	 * @param percentualDescontoJuros the percentual desconto juros of this concessao df
	 */
	@Override
	public void setPercentualDescontoJuros(double percentualDescontoJuros) {
		model.setPercentualDescontoJuros(percentualDescontoJuros);
	}

	/**
	 * Sets the percentual desconto principal of this concessao df.
	 *
	 * @param percentualDescontoPrincipal the percentual desconto principal of this concessao df
	 */
	@Override
	public void setPercentualDescontoPrincipal(
		double percentualDescontoPrincipal) {

		model.setPercentualDescontoPrincipal(percentualDescontoPrincipal);
	}

	/**
	 * Sets the primary key of this concessao df.
	 *
	 * @param primaryKey the primary key of this concessao df
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the proposta ID of this concessao df.
	 *
	 * @param propostaId the proposta ID of this concessao df
	 */
	@Override
	public void setPropostaId(long propostaId) {
		model.setPropostaId(propostaId);
	}

	/**
	 * Sets the uuid of this concessao df.
	 *
	 * @param uuid the uuid of this concessao df
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
	protected ConcessaoDfWrapper wrap(ConcessaoDf concessaoDf) {
		return new ConcessaoDfWrapper(concessaoDf);
	}

}
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
 * This class is a wrapper for {@link Procuracao}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Procuracao
 * @generated
 */
public class ProcuracaoWrapper
	extends BaseModelWrapper<Procuracao>
	implements ModelWrapper<Procuracao>, Procuracao {

	public ProcuracaoWrapper(Procuracao procuracao) {
		super(procuracao);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("procuracaoId", getProcuracaoId());
		attributes.put("propostaId", getPropostaId());
		attributes.put("procuracao", getProcuracao());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long procuracaoId = (Long)attributes.get("procuracaoId");

		if (procuracaoId != null) {
			setProcuracaoId(procuracaoId);
		}

		Long propostaId = (Long)attributes.get("propostaId");

		if (propostaId != null) {
			setPropostaId(propostaId);
		}

		Long procuracao = (Long)attributes.get("procuracao");

		if (procuracao != null) {
			setProcuracao(procuracao);
		}
	}

	@Override
	public Procuracao cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the primary key of this procuracao.
	 *
	 * @return the primary key of this procuracao
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the procuracao of this procuracao.
	 *
	 * @return the procuracao of this procuracao
	 */
	@Override
	public long getProcuracao() {
		return model.getProcuracao();
	}

	/**
	 * Returns the procuracao ID of this procuracao.
	 *
	 * @return the procuracao ID of this procuracao
	 */
	@Override
	public long getProcuracaoId() {
		return model.getProcuracaoId();
	}

	/**
	 * Returns the proposta ID of this procuracao.
	 *
	 * @return the proposta ID of this procuracao
	 */
	@Override
	public long getPropostaId() {
		return model.getPropostaId();
	}

	/**
	 * Returns the uuid of this procuracao.
	 *
	 * @return the uuid of this procuracao
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
	 * Sets the primary key of this procuracao.
	 *
	 * @param primaryKey the primary key of this procuracao
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the procuracao of this procuracao.
	 *
	 * @param procuracao the procuracao of this procuracao
	 */
	@Override
	public void setProcuracao(long procuracao) {
		model.setProcuracao(procuracao);
	}

	/**
	 * Sets the procuracao ID of this procuracao.
	 *
	 * @param procuracaoId the procuracao ID of this procuracao
	 */
	@Override
	public void setProcuracaoId(long procuracaoId) {
		model.setProcuracaoId(procuracaoId);
	}

	/**
	 * Sets the proposta ID of this procuracao.
	 *
	 * @param propostaId the proposta ID of this procuracao
	 */
	@Override
	public void setPropostaId(long propostaId) {
		model.setPropostaId(propostaId);
	}

	/**
	 * Sets the uuid of this procuracao.
	 *
	 * @param uuid the uuid of this procuracao
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
	protected ProcuracaoWrapper wrap(Procuracao procuracao) {
		return new ProcuracaoWrapper(procuracao);
	}

}
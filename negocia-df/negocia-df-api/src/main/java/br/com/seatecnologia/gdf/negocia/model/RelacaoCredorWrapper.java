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
 * This class is a wrapper for {@link RelacaoCredor}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see RelacaoCredor
 * @generated
 */
public class RelacaoCredorWrapper
	extends BaseModelWrapper<RelacaoCredor>
	implements ModelWrapper<RelacaoCredor>, RelacaoCredor {

	public RelacaoCredorWrapper(RelacaoCredor relacaoCredor) {
		super(relacaoCredor);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("credorId", getCredorId());
		attributes.put("propostaId", getPropostaId());
		attributes.put("nomeCredor", getNomeCredor());
		attributes.put("naturezaCredito", getNaturezaCredito());
		attributes.put("classificacaoCredito", getClassificacaoCredito());
		attributes.put("valorAtualizado", getValorAtualizado());
		attributes.put("referenciaContabil", getReferenciaContabil());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long credorId = (Long)attributes.get("credorId");

		if (credorId != null) {
			setCredorId(credorId);
		}

		Long propostaId = (Long)attributes.get("propostaId");

		if (propostaId != null) {
			setPropostaId(propostaId);
		}

		String nomeCredor = (String)attributes.get("nomeCredor");

		if (nomeCredor != null) {
			setNomeCredor(nomeCredor);
		}

		String naturezaCredito = (String)attributes.get("naturezaCredito");

		if (naturezaCredito != null) {
			setNaturezaCredito(naturezaCredito);
		}

		String classificacaoCredito = (String)attributes.get(
			"classificacaoCredito");

		if (classificacaoCredito != null) {
			setClassificacaoCredito(classificacaoCredito);
		}

		Double valorAtualizado = (Double)attributes.get("valorAtualizado");

		if (valorAtualizado != null) {
			setValorAtualizado(valorAtualizado);
		}

		String referenciaContabil = (String)attributes.get(
			"referenciaContabil");

		if (referenciaContabil != null) {
			setReferenciaContabil(referenciaContabil);
		}
	}

	@Override
	public RelacaoCredor cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the classificacao credito of this relacao credor.
	 *
	 * @return the classificacao credito of this relacao credor
	 */
	@Override
	public String getClassificacaoCredito() {
		return model.getClassificacaoCredito();
	}

	/**
	 * Returns the credor ID of this relacao credor.
	 *
	 * @return the credor ID of this relacao credor
	 */
	@Override
	public long getCredorId() {
		return model.getCredorId();
	}

	/**
	 * Returns the natureza credito of this relacao credor.
	 *
	 * @return the natureza credito of this relacao credor
	 */
	@Override
	public String getNaturezaCredito() {
		return model.getNaturezaCredito();
	}

	/**
	 * Returns the nome credor of this relacao credor.
	 *
	 * @return the nome credor of this relacao credor
	 */
	@Override
	public String getNomeCredor() {
		return model.getNomeCredor();
	}

	/**
	 * Returns the primary key of this relacao credor.
	 *
	 * @return the primary key of this relacao credor
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the proposta ID of this relacao credor.
	 *
	 * @return the proposta ID of this relacao credor
	 */
	@Override
	public long getPropostaId() {
		return model.getPropostaId();
	}

	/**
	 * Returns the referencia contabil of this relacao credor.
	 *
	 * @return the referencia contabil of this relacao credor
	 */
	@Override
	public String getReferenciaContabil() {
		return model.getReferenciaContabil();
	}

	/**
	 * Returns the uuid of this relacao credor.
	 *
	 * @return the uuid of this relacao credor
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	/**
	 * Returns the valor atualizado of this relacao credor.
	 *
	 * @return the valor atualizado of this relacao credor
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
	 * Sets the classificacao credito of this relacao credor.
	 *
	 * @param classificacaoCredito the classificacao credito of this relacao credor
	 */
	@Override
	public void setClassificacaoCredito(String classificacaoCredito) {
		model.setClassificacaoCredito(classificacaoCredito);
	}

	/**
	 * Sets the credor ID of this relacao credor.
	 *
	 * @param credorId the credor ID of this relacao credor
	 */
	@Override
	public void setCredorId(long credorId) {
		model.setCredorId(credorId);
	}

	/**
	 * Sets the natureza credito of this relacao credor.
	 *
	 * @param naturezaCredito the natureza credito of this relacao credor
	 */
	@Override
	public void setNaturezaCredito(String naturezaCredito) {
		model.setNaturezaCredito(naturezaCredito);
	}

	/**
	 * Sets the nome credor of this relacao credor.
	 *
	 * @param nomeCredor the nome credor of this relacao credor
	 */
	@Override
	public void setNomeCredor(String nomeCredor) {
		model.setNomeCredor(nomeCredor);
	}

	/**
	 * Sets the primary key of this relacao credor.
	 *
	 * @param primaryKey the primary key of this relacao credor
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the proposta ID of this relacao credor.
	 *
	 * @param propostaId the proposta ID of this relacao credor
	 */
	@Override
	public void setPropostaId(long propostaId) {
		model.setPropostaId(propostaId);
	}

	/**
	 * Sets the referencia contabil of this relacao credor.
	 *
	 * @param referenciaContabil the referencia contabil of this relacao credor
	 */
	@Override
	public void setReferenciaContabil(String referenciaContabil) {
		model.setReferenciaContabil(referenciaContabil);
	}

	/**
	 * Sets the uuid of this relacao credor.
	 *
	 * @param uuid the uuid of this relacao credor
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	/**
	 * Sets the valor atualizado of this relacao credor.
	 *
	 * @param valorAtualizado the valor atualizado of this relacao credor
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
	protected RelacaoCredorWrapper wrap(RelacaoCredor relacaoCredor) {
		return new RelacaoCredorWrapper(relacaoCredor);
	}

}
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
 * This class is a wrapper for {@link AcaoJudicial}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AcaoJudicial
 * @generated
 */
public class AcaoJudicialWrapper
	extends BaseModelWrapper<AcaoJudicial>
	implements AcaoJudicial, ModelWrapper<AcaoJudicial> {

	public AcaoJudicialWrapper(AcaoJudicial acaoJudicial) {
		super(acaoJudicial);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("acaoId", getAcaoId());
		attributes.put("orgaoTribunal", getOrgaoTribunal());
		attributes.put("numeroProcesso", getNumeroProcesso());
		attributes.put("unidadeVara", getUnidadeVara());
		attributes.put("parteAutora", getParteAutora());
		attributes.put("parteRe", getParteRe());
		attributes.put("observacoes", getObservacoes());
		attributes.put("propostaId", getPropostaId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long acaoId = (Long)attributes.get("acaoId");

		if (acaoId != null) {
			setAcaoId(acaoId);
		}

		String orgaoTribunal = (String)attributes.get("orgaoTribunal");

		if (orgaoTribunal != null) {
			setOrgaoTribunal(orgaoTribunal);
		}

		String numeroProcesso = (String)attributes.get("numeroProcesso");

		if (numeroProcesso != null) {
			setNumeroProcesso(numeroProcesso);
		}

		String unidadeVara = (String)attributes.get("unidadeVara");

		if (unidadeVara != null) {
			setUnidadeVara(unidadeVara);
		}

		String parteAutora = (String)attributes.get("parteAutora");

		if (parteAutora != null) {
			setParteAutora(parteAutora);
		}

		String parteRe = (String)attributes.get("parteRe");

		if (parteRe != null) {
			setParteRe(parteRe);
		}

		String observacoes = (String)attributes.get("observacoes");

		if (observacoes != null) {
			setObservacoes(observacoes);
		}

		Long propostaId = (Long)attributes.get("propostaId");

		if (propostaId != null) {
			setPropostaId(propostaId);
		}
	}

	@Override
	public AcaoJudicial cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the acao ID of this acao judicial.
	 *
	 * @return the acao ID of this acao judicial
	 */
	@Override
	public long getAcaoId() {
		return model.getAcaoId();
	}

	/**
	 * Returns the numero processo of this acao judicial.
	 *
	 * @return the numero processo of this acao judicial
	 */
	@Override
	public String getNumeroProcesso() {
		return model.getNumeroProcesso();
	}

	/**
	 * Returns the observacoes of this acao judicial.
	 *
	 * @return the observacoes of this acao judicial
	 */
	@Override
	public String getObservacoes() {
		return model.getObservacoes();
	}

	/**
	 * Returns the orgao tribunal of this acao judicial.
	 *
	 * @return the orgao tribunal of this acao judicial
	 */
	@Override
	public String getOrgaoTribunal() {
		return model.getOrgaoTribunal();
	}

	/**
	 * Returns the parte autora of this acao judicial.
	 *
	 * @return the parte autora of this acao judicial
	 */
	@Override
	public String getParteAutora() {
		return model.getParteAutora();
	}

	/**
	 * Returns the parte re of this acao judicial.
	 *
	 * @return the parte re of this acao judicial
	 */
	@Override
	public String getParteRe() {
		return model.getParteRe();
	}

	/**
	 * Returns the primary key of this acao judicial.
	 *
	 * @return the primary key of this acao judicial
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the proposta ID of this acao judicial.
	 *
	 * @return the proposta ID of this acao judicial
	 */
	@Override
	public long getPropostaId() {
		return model.getPropostaId();
	}

	/**
	 * Returns the unidade vara of this acao judicial.
	 *
	 * @return the unidade vara of this acao judicial
	 */
	@Override
	public String getUnidadeVara() {
		return model.getUnidadeVara();
	}

	/**
	 * Returns the uuid of this acao judicial.
	 *
	 * @return the uuid of this acao judicial
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
	 * Sets the acao ID of this acao judicial.
	 *
	 * @param acaoId the acao ID of this acao judicial
	 */
	@Override
	public void setAcaoId(long acaoId) {
		model.setAcaoId(acaoId);
	}

	/**
	 * Sets the numero processo of this acao judicial.
	 *
	 * @param numeroProcesso the numero processo of this acao judicial
	 */
	@Override
	public void setNumeroProcesso(String numeroProcesso) {
		model.setNumeroProcesso(numeroProcesso);
	}

	/**
	 * Sets the observacoes of this acao judicial.
	 *
	 * @param observacoes the observacoes of this acao judicial
	 */
	@Override
	public void setObservacoes(String observacoes) {
		model.setObservacoes(observacoes);
	}

	/**
	 * Sets the orgao tribunal of this acao judicial.
	 *
	 * @param orgaoTribunal the orgao tribunal of this acao judicial
	 */
	@Override
	public void setOrgaoTribunal(String orgaoTribunal) {
		model.setOrgaoTribunal(orgaoTribunal);
	}

	/**
	 * Sets the parte autora of this acao judicial.
	 *
	 * @param parteAutora the parte autora of this acao judicial
	 */
	@Override
	public void setParteAutora(String parteAutora) {
		model.setParteAutora(parteAutora);
	}

	/**
	 * Sets the parte re of this acao judicial.
	 *
	 * @param parteRe the parte re of this acao judicial
	 */
	@Override
	public void setParteRe(String parteRe) {
		model.setParteRe(parteRe);
	}

	/**
	 * Sets the primary key of this acao judicial.
	 *
	 * @param primaryKey the primary key of this acao judicial
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the proposta ID of this acao judicial.
	 *
	 * @param propostaId the proposta ID of this acao judicial
	 */
	@Override
	public void setPropostaId(long propostaId) {
		model.setPropostaId(propostaId);
	}

	/**
	 * Sets the unidade vara of this acao judicial.
	 *
	 * @param unidadeVara the unidade vara of this acao judicial
	 */
	@Override
	public void setUnidadeVara(String unidadeVara) {
		model.setUnidadeVara(unidadeVara);
	}

	/**
	 * Sets the uuid of this acao judicial.
	 *
	 * @param uuid the uuid of this acao judicial
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
	protected AcaoJudicialWrapper wrap(AcaoJudicial acaoJudicial) {
		return new AcaoJudicialWrapper(acaoJudicial);
	}

}
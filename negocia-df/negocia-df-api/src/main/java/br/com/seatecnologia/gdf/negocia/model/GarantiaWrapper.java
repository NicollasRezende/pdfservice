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
 * This class is a wrapper for {@link Garantia}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Garantia
 * @generated
 */
public class GarantiaWrapper
	extends BaseModelWrapper<Garantia>
	implements Garantia, ModelWrapper<Garantia> {

	public GarantiaWrapper(Garantia garantia) {
		super(garantia);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("garantiaId", getGarantiaId());
		attributes.put("propostaId", getPropostaId());
		attributes.put("tipoGarantia", getTipoGarantia());
		attributes.put("tipoDevedor", getTipoDevedor());
		attributes.put("outras", getOutras());
		attributes.put("descricaoBem", getDescricaoBem());
		attributes.put(
			"proprietarioQualificacao", getProprietarioQualificacao());
		attributes.put("valorEstimado", getValorEstimado());
		attributes.put("dadosRegistroId", getDadosRegistroId());
		attributes.put("localizacao", getLocalizacao());
		attributes.put("declaracaoAnuencia", isDeclaracaoAnuencia());
		attributes.put("declaracao", getDeclaracao());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long garantiaId = (Long)attributes.get("garantiaId");

		if (garantiaId != null) {
			setGarantiaId(garantiaId);
		}

		Long propostaId = (Long)attributes.get("propostaId");

		if (propostaId != null) {
			setPropostaId(propostaId);
		}

		String tipoGarantia = (String)attributes.get("tipoGarantia");

		if (tipoGarantia != null) {
			setTipoGarantia(tipoGarantia);
		}

		String tipoDevedor = (String)attributes.get("tipoDevedor");

		if (tipoDevedor != null) {
			setTipoDevedor(tipoDevedor);
		}

		String outras = (String)attributes.get("outras");

		if (outras != null) {
			setOutras(outras);
		}

		String descricaoBem = (String)attributes.get("descricaoBem");

		if (descricaoBem != null) {
			setDescricaoBem(descricaoBem);
		}

		Long proprietarioQualificacao = (Long)attributes.get(
			"proprietarioQualificacao");

		if (proprietarioQualificacao != null) {
			setProprietarioQualificacao(proprietarioQualificacao);
		}

		Double valorEstimado = (Double)attributes.get("valorEstimado");

		if (valorEstimado != null) {
			setValorEstimado(valorEstimado);
		}

		Long dadosRegistroId = (Long)attributes.get("dadosRegistroId");

		if (dadosRegistroId != null) {
			setDadosRegistroId(dadosRegistroId);
		}

		String localizacao = (String)attributes.get("localizacao");

		if (localizacao != null) {
			setLocalizacao(localizacao);
		}

		Boolean declaracaoAnuencia = (Boolean)attributes.get(
			"declaracaoAnuencia");

		if (declaracaoAnuencia != null) {
			setDeclaracaoAnuencia(declaracaoAnuencia);
		}

		Long declaracao = (Long)attributes.get("declaracao");

		if (declaracao != null) {
			setDeclaracao(declaracao);
		}
	}

	@Override
	public Garantia cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the dados registro ID of this garantia.
	 *
	 * @return the dados registro ID of this garantia
	 */
	@Override
	public long getDadosRegistroId() {
		return model.getDadosRegistroId();
	}

	/**
	 * Returns the declaracao of this garantia.
	 *
	 * @return the declaracao of this garantia
	 */
	@Override
	public long getDeclaracao() {
		return model.getDeclaracao();
	}

	/**
	 * Returns the declaracao anuencia of this garantia.
	 *
	 * @return the declaracao anuencia of this garantia
	 */
	@Override
	public boolean getDeclaracaoAnuencia() {
		return model.getDeclaracaoAnuencia();
	}

	/**
	 * Returns the descricao bem of this garantia.
	 *
	 * @return the descricao bem of this garantia
	 */
	@Override
	public String getDescricaoBem() {
		return model.getDescricaoBem();
	}

	/**
	 * Returns the garantia ID of this garantia.
	 *
	 * @return the garantia ID of this garantia
	 */
	@Override
	public long getGarantiaId() {
		return model.getGarantiaId();
	}

	/**
	 * Returns the localizacao of this garantia.
	 *
	 * @return the localizacao of this garantia
	 */
	@Override
	public String getLocalizacao() {
		return model.getLocalizacao();
	}

	/**
	 * Returns the outras of this garantia.
	 *
	 * @return the outras of this garantia
	 */
	@Override
	public String getOutras() {
		return model.getOutras();
	}

	/**
	 * Returns the primary key of this garantia.
	 *
	 * @return the primary key of this garantia
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the proposta ID of this garantia.
	 *
	 * @return the proposta ID of this garantia
	 */
	@Override
	public long getPropostaId() {
		return model.getPropostaId();
	}

	/**
	 * Returns the proprietario qualificacao of this garantia.
	 *
	 * @return the proprietario qualificacao of this garantia
	 */
	@Override
	public long getProprietarioQualificacao() {
		return model.getProprietarioQualificacao();
	}

	/**
	 * Returns the tipo devedor of this garantia.
	 *
	 * @return the tipo devedor of this garantia
	 */
	@Override
	public String getTipoDevedor() {
		return model.getTipoDevedor();
	}

	/**
	 * Returns the tipo garantia of this garantia.
	 *
	 * @return the tipo garantia of this garantia
	 */
	@Override
	public String getTipoGarantia() {
		return model.getTipoGarantia();
	}

	/**
	 * Returns the uuid of this garantia.
	 *
	 * @return the uuid of this garantia
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	/**
	 * Returns the valor estimado of this garantia.
	 *
	 * @return the valor estimado of this garantia
	 */
	@Override
	public double getValorEstimado() {
		return model.getValorEstimado();
	}

	/**
	 * Returns <code>true</code> if this garantia is declaracao anuencia.
	 *
	 * @return <code>true</code> if this garantia is declaracao anuencia; <code>false</code> otherwise
	 */
	@Override
	public boolean isDeclaracaoAnuencia() {
		return model.isDeclaracaoAnuencia();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the dados registro ID of this garantia.
	 *
	 * @param dadosRegistroId the dados registro ID of this garantia
	 */
	@Override
	public void setDadosRegistroId(long dadosRegistroId) {
		model.setDadosRegistroId(dadosRegistroId);
	}

	/**
	 * Sets the declaracao of this garantia.
	 *
	 * @param declaracao the declaracao of this garantia
	 */
	@Override
	public void setDeclaracao(long declaracao) {
		model.setDeclaracao(declaracao);
	}

	/**
	 * Sets whether this garantia is declaracao anuencia.
	 *
	 * @param declaracaoAnuencia the declaracao anuencia of this garantia
	 */
	@Override
	public void setDeclaracaoAnuencia(boolean declaracaoAnuencia) {
		model.setDeclaracaoAnuencia(declaracaoAnuencia);
	}

	/**
	 * Sets the descricao bem of this garantia.
	 *
	 * @param descricaoBem the descricao bem of this garantia
	 */
	@Override
	public void setDescricaoBem(String descricaoBem) {
		model.setDescricaoBem(descricaoBem);
	}

	/**
	 * Sets the garantia ID of this garantia.
	 *
	 * @param garantiaId the garantia ID of this garantia
	 */
	@Override
	public void setGarantiaId(long garantiaId) {
		model.setGarantiaId(garantiaId);
	}

	/**
	 * Sets the localizacao of this garantia.
	 *
	 * @param localizacao the localizacao of this garantia
	 */
	@Override
	public void setLocalizacao(String localizacao) {
		model.setLocalizacao(localizacao);
	}

	/**
	 * Sets the outras of this garantia.
	 *
	 * @param outras the outras of this garantia
	 */
	@Override
	public void setOutras(String outras) {
		model.setOutras(outras);
	}

	/**
	 * Sets the primary key of this garantia.
	 *
	 * @param primaryKey the primary key of this garantia
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the proposta ID of this garantia.
	 *
	 * @param propostaId the proposta ID of this garantia
	 */
	@Override
	public void setPropostaId(long propostaId) {
		model.setPropostaId(propostaId);
	}

	/**
	 * Sets the proprietario qualificacao of this garantia.
	 *
	 * @param proprietarioQualificacao the proprietario qualificacao of this garantia
	 */
	@Override
	public void setProprietarioQualificacao(long proprietarioQualificacao) {
		model.setProprietarioQualificacao(proprietarioQualificacao);
	}

	/**
	 * Sets the tipo devedor of this garantia.
	 *
	 * @param tipoDevedor the tipo devedor of this garantia
	 */
	@Override
	public void setTipoDevedor(String tipoDevedor) {
		model.setTipoDevedor(tipoDevedor);
	}

	/**
	 * Sets the tipo garantia of this garantia.
	 *
	 * @param tipoGarantia the tipo garantia of this garantia
	 */
	@Override
	public void setTipoGarantia(String tipoGarantia) {
		model.setTipoGarantia(tipoGarantia);
	}

	/**
	 * Sets the uuid of this garantia.
	 *
	 * @param uuid the uuid of this garantia
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	/**
	 * Sets the valor estimado of this garantia.
	 *
	 * @param valorEstimado the valor estimado of this garantia
	 */
	@Override
	public void setValorEstimado(double valorEstimado) {
		model.setValorEstimado(valorEstimado);
	}

	@Override
	public String toXmlString() {
		return model.toXmlString();
	}

	@Override
	protected GarantiaWrapper wrap(Garantia garantia) {
		return new GarantiaWrapper(garantia);
	}

}
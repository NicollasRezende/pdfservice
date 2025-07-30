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
 * This class is a wrapper for {@link Declaracao}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Declaracao
 * @generated
 */
public class DeclaracaoWrapper
	extends BaseModelWrapper<Declaracao>
	implements Declaracao, ModelWrapper<Declaracao> {

	public DeclaracaoWrapper(Declaracao declaracao) {
		super(declaracao);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("declaracaoId", getDeclaracaoId());
		attributes.put("propostaId", getPropostaId());
		attributes.put("cumpreCompromissos", isCumpreCompromissos());
		attributes.put(
			"naoAlienacaoBensSemComunicacao",
			isNaoAlienacaoBensSemComunicacao());
		attributes.put(
			"reconheceGrupoOuSucessao", isReconheceGrupoOuSucessao());
		attributes.put(
			"compromissoConfidencialidade", isCompromissoConfidencialidade());
		attributes.put("cienciaProcesso", isCienciaProcesso());
		attributes.put("abusoTransacao", isAbusoTransacao());
		attributes.put("impugnacaoRecursos", isImpugnacaoRecursos());
		attributes.put("renunciaRecursos", isRenunciaRecursos());
		attributes.put("peticionamentoProcessos", isPeticionamentoProcessos());
		attributes.put("prestacaoInformacoes", isPrestacaoInformacoes());
		attributes.put("omissaoInformacoes", isOmissaoInformacoes());
		attributes.put("manutencaoGarantias", isManutencaoGarantias());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long declaracaoId = (Long)attributes.get("declaracaoId");

		if (declaracaoId != null) {
			setDeclaracaoId(declaracaoId);
		}

		Long propostaId = (Long)attributes.get("propostaId");

		if (propostaId != null) {
			setPropostaId(propostaId);
		}

		Boolean cumpreCompromissos = (Boolean)attributes.get(
			"cumpreCompromissos");

		if (cumpreCompromissos != null) {
			setCumpreCompromissos(cumpreCompromissos);
		}

		Boolean naoAlienacaoBensSemComunicacao = (Boolean)attributes.get(
			"naoAlienacaoBensSemComunicacao");

		if (naoAlienacaoBensSemComunicacao != null) {
			setNaoAlienacaoBensSemComunicacao(naoAlienacaoBensSemComunicacao);
		}

		Boolean reconheceGrupoOuSucessao = (Boolean)attributes.get(
			"reconheceGrupoOuSucessao");

		if (reconheceGrupoOuSucessao != null) {
			setReconheceGrupoOuSucessao(reconheceGrupoOuSucessao);
		}

		Boolean compromissoConfidencialidade = (Boolean)attributes.get(
			"compromissoConfidencialidade");

		if (compromissoConfidencialidade != null) {
			setCompromissoConfidencialidade(compromissoConfidencialidade);
		}

		Boolean cienciaProcesso = (Boolean)attributes.get("cienciaProcesso");

		if (cienciaProcesso != null) {
			setCienciaProcesso(cienciaProcesso);
		}

		Boolean abusoTransacao = (Boolean)attributes.get("abusoTransacao");

		if (abusoTransacao != null) {
			setAbusoTransacao(abusoTransacao);
		}

		Boolean impugnacaoRecursos = (Boolean)attributes.get(
			"impugnacaoRecursos");

		if (impugnacaoRecursos != null) {
			setImpugnacaoRecursos(impugnacaoRecursos);
		}

		Boolean renunciaRecursos = (Boolean)attributes.get("renunciaRecursos");

		if (renunciaRecursos != null) {
			setRenunciaRecursos(renunciaRecursos);
		}

		Boolean peticionamentoProcessos = (Boolean)attributes.get(
			"peticionamentoProcessos");

		if (peticionamentoProcessos != null) {
			setPeticionamentoProcessos(peticionamentoProcessos);
		}

		Boolean prestacaoInformacoes = (Boolean)attributes.get(
			"prestacaoInformacoes");

		if (prestacaoInformacoes != null) {
			setPrestacaoInformacoes(prestacaoInformacoes);
		}

		Boolean omissaoInformacoes = (Boolean)attributes.get(
			"omissaoInformacoes");

		if (omissaoInformacoes != null) {
			setOmissaoInformacoes(omissaoInformacoes);
		}

		Boolean manutencaoGarantias = (Boolean)attributes.get(
			"manutencaoGarantias");

		if (manutencaoGarantias != null) {
			setManutencaoGarantias(manutencaoGarantias);
		}
	}

	@Override
	public Declaracao cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the abuso transacao of this declaracao.
	 *
	 * @return the abuso transacao of this declaracao
	 */
	@Override
	public boolean getAbusoTransacao() {
		return model.getAbusoTransacao();
	}

	/**
	 * Returns the ciencia processo of this declaracao.
	 *
	 * @return the ciencia processo of this declaracao
	 */
	@Override
	public boolean getCienciaProcesso() {
		return model.getCienciaProcesso();
	}

	/**
	 * Returns the compromisso confidencialidade of this declaracao.
	 *
	 * @return the compromisso confidencialidade of this declaracao
	 */
	@Override
	public boolean getCompromissoConfidencialidade() {
		return model.getCompromissoConfidencialidade();
	}

	/**
	 * Returns the cumpre compromissos of this declaracao.
	 *
	 * @return the cumpre compromissos of this declaracao
	 */
	@Override
	public boolean getCumpreCompromissos() {
		return model.getCumpreCompromissos();
	}

	/**
	 * Returns the declaracao ID of this declaracao.
	 *
	 * @return the declaracao ID of this declaracao
	 */
	@Override
	public long getDeclaracaoId() {
		return model.getDeclaracaoId();
	}

	/**
	 * Returns the impugnacao recursos of this declaracao.
	 *
	 * @return the impugnacao recursos of this declaracao
	 */
	@Override
	public boolean getImpugnacaoRecursos() {
		return model.getImpugnacaoRecursos();
	}

	/**
	 * Returns the manutencao garantias of this declaracao.
	 *
	 * @return the manutencao garantias of this declaracao
	 */
	@Override
	public boolean getManutencaoGarantias() {
		return model.getManutencaoGarantias();
	}

	/**
	 * Returns the nao alienacao bens sem comunicacao of this declaracao.
	 *
	 * @return the nao alienacao bens sem comunicacao of this declaracao
	 */
	@Override
	public boolean getNaoAlienacaoBensSemComunicacao() {
		return model.getNaoAlienacaoBensSemComunicacao();
	}

	/**
	 * Returns the omissao informacoes of this declaracao.
	 *
	 * @return the omissao informacoes of this declaracao
	 */
	@Override
	public boolean getOmissaoInformacoes() {
		return model.getOmissaoInformacoes();
	}

	/**
	 * Returns the peticionamento processos of this declaracao.
	 *
	 * @return the peticionamento processos of this declaracao
	 */
	@Override
	public boolean getPeticionamentoProcessos() {
		return model.getPeticionamentoProcessos();
	}

	/**
	 * Returns the prestacao informacoes of this declaracao.
	 *
	 * @return the prestacao informacoes of this declaracao
	 */
	@Override
	public boolean getPrestacaoInformacoes() {
		return model.getPrestacaoInformacoes();
	}

	/**
	 * Returns the primary key of this declaracao.
	 *
	 * @return the primary key of this declaracao
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the proposta ID of this declaracao.
	 *
	 * @return the proposta ID of this declaracao
	 */
	@Override
	public long getPropostaId() {
		return model.getPropostaId();
	}

	/**
	 * Returns the reconhece grupo ou sucessao of this declaracao.
	 *
	 * @return the reconhece grupo ou sucessao of this declaracao
	 */
	@Override
	public boolean getReconheceGrupoOuSucessao() {
		return model.getReconheceGrupoOuSucessao();
	}

	/**
	 * Returns the renuncia recursos of this declaracao.
	 *
	 * @return the renuncia recursos of this declaracao
	 */
	@Override
	public boolean getRenunciaRecursos() {
		return model.getRenunciaRecursos();
	}

	/**
	 * Returns the uuid of this declaracao.
	 *
	 * @return the uuid of this declaracao
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	/**
	 * Returns <code>true</code> if this declaracao is abuso transacao.
	 *
	 * @return <code>true</code> if this declaracao is abuso transacao; <code>false</code> otherwise
	 */
	@Override
	public boolean isAbusoTransacao() {
		return model.isAbusoTransacao();
	}

	/**
	 * Returns <code>true</code> if this declaracao is ciencia processo.
	 *
	 * @return <code>true</code> if this declaracao is ciencia processo; <code>false</code> otherwise
	 */
	@Override
	public boolean isCienciaProcesso() {
		return model.isCienciaProcesso();
	}

	/**
	 * Returns <code>true</code> if this declaracao is compromisso confidencialidade.
	 *
	 * @return <code>true</code> if this declaracao is compromisso confidencialidade; <code>false</code> otherwise
	 */
	@Override
	public boolean isCompromissoConfidencialidade() {
		return model.isCompromissoConfidencialidade();
	}

	/**
	 * Returns <code>true</code> if this declaracao is cumpre compromissos.
	 *
	 * @return <code>true</code> if this declaracao is cumpre compromissos; <code>false</code> otherwise
	 */
	@Override
	public boolean isCumpreCompromissos() {
		return model.isCumpreCompromissos();
	}

	/**
	 * Returns <code>true</code> if this declaracao is impugnacao recursos.
	 *
	 * @return <code>true</code> if this declaracao is impugnacao recursos; <code>false</code> otherwise
	 */
	@Override
	public boolean isImpugnacaoRecursos() {
		return model.isImpugnacaoRecursos();
	}

	/**
	 * Returns <code>true</code> if this declaracao is manutencao garantias.
	 *
	 * @return <code>true</code> if this declaracao is manutencao garantias; <code>false</code> otherwise
	 */
	@Override
	public boolean isManutencaoGarantias() {
		return model.isManutencaoGarantias();
	}

	/**
	 * Returns <code>true</code> if this declaracao is nao alienacao bens sem comunicacao.
	 *
	 * @return <code>true</code> if this declaracao is nao alienacao bens sem comunicacao; <code>false</code> otherwise
	 */
	@Override
	public boolean isNaoAlienacaoBensSemComunicacao() {
		return model.isNaoAlienacaoBensSemComunicacao();
	}

	/**
	 * Returns <code>true</code> if this declaracao is omissao informacoes.
	 *
	 * @return <code>true</code> if this declaracao is omissao informacoes; <code>false</code> otherwise
	 */
	@Override
	public boolean isOmissaoInformacoes() {
		return model.isOmissaoInformacoes();
	}

	/**
	 * Returns <code>true</code> if this declaracao is peticionamento processos.
	 *
	 * @return <code>true</code> if this declaracao is peticionamento processos; <code>false</code> otherwise
	 */
	@Override
	public boolean isPeticionamentoProcessos() {
		return model.isPeticionamentoProcessos();
	}

	/**
	 * Returns <code>true</code> if this declaracao is prestacao informacoes.
	 *
	 * @return <code>true</code> if this declaracao is prestacao informacoes; <code>false</code> otherwise
	 */
	@Override
	public boolean isPrestacaoInformacoes() {
		return model.isPrestacaoInformacoes();
	}

	/**
	 * Returns <code>true</code> if this declaracao is reconhece grupo ou sucessao.
	 *
	 * @return <code>true</code> if this declaracao is reconhece grupo ou sucessao; <code>false</code> otherwise
	 */
	@Override
	public boolean isReconheceGrupoOuSucessao() {
		return model.isReconheceGrupoOuSucessao();
	}

	/**
	 * Returns <code>true</code> if this declaracao is renuncia recursos.
	 *
	 * @return <code>true</code> if this declaracao is renuncia recursos; <code>false</code> otherwise
	 */
	@Override
	public boolean isRenunciaRecursos() {
		return model.isRenunciaRecursos();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets whether this declaracao is abuso transacao.
	 *
	 * @param abusoTransacao the abuso transacao of this declaracao
	 */
	@Override
	public void setAbusoTransacao(boolean abusoTransacao) {
		model.setAbusoTransacao(abusoTransacao);
	}

	/**
	 * Sets whether this declaracao is ciencia processo.
	 *
	 * @param cienciaProcesso the ciencia processo of this declaracao
	 */
	@Override
	public void setCienciaProcesso(boolean cienciaProcesso) {
		model.setCienciaProcesso(cienciaProcesso);
	}

	/**
	 * Sets whether this declaracao is compromisso confidencialidade.
	 *
	 * @param compromissoConfidencialidade the compromisso confidencialidade of this declaracao
	 */
	@Override
	public void setCompromissoConfidencialidade(
		boolean compromissoConfidencialidade) {

		model.setCompromissoConfidencialidade(compromissoConfidencialidade);
	}

	/**
	 * Sets whether this declaracao is cumpre compromissos.
	 *
	 * @param cumpreCompromissos the cumpre compromissos of this declaracao
	 */
	@Override
	public void setCumpreCompromissos(boolean cumpreCompromissos) {
		model.setCumpreCompromissos(cumpreCompromissos);
	}

	/**
	 * Sets the declaracao ID of this declaracao.
	 *
	 * @param declaracaoId the declaracao ID of this declaracao
	 */
	@Override
	public void setDeclaracaoId(long declaracaoId) {
		model.setDeclaracaoId(declaracaoId);
	}

	/**
	 * Sets whether this declaracao is impugnacao recursos.
	 *
	 * @param impugnacaoRecursos the impugnacao recursos of this declaracao
	 */
	@Override
	public void setImpugnacaoRecursos(boolean impugnacaoRecursos) {
		model.setImpugnacaoRecursos(impugnacaoRecursos);
	}

	/**
	 * Sets whether this declaracao is manutencao garantias.
	 *
	 * @param manutencaoGarantias the manutencao garantias of this declaracao
	 */
	@Override
	public void setManutencaoGarantias(boolean manutencaoGarantias) {
		model.setManutencaoGarantias(manutencaoGarantias);
	}

	/**
	 * Sets whether this declaracao is nao alienacao bens sem comunicacao.
	 *
	 * @param naoAlienacaoBensSemComunicacao the nao alienacao bens sem comunicacao of this declaracao
	 */
	@Override
	public void setNaoAlienacaoBensSemComunicacao(
		boolean naoAlienacaoBensSemComunicacao) {

		model.setNaoAlienacaoBensSemComunicacao(naoAlienacaoBensSemComunicacao);
	}

	/**
	 * Sets whether this declaracao is omissao informacoes.
	 *
	 * @param omissaoInformacoes the omissao informacoes of this declaracao
	 */
	@Override
	public void setOmissaoInformacoes(boolean omissaoInformacoes) {
		model.setOmissaoInformacoes(omissaoInformacoes);
	}

	/**
	 * Sets whether this declaracao is peticionamento processos.
	 *
	 * @param peticionamentoProcessos the peticionamento processos of this declaracao
	 */
	@Override
	public void setPeticionamentoProcessos(boolean peticionamentoProcessos) {
		model.setPeticionamentoProcessos(peticionamentoProcessos);
	}

	/**
	 * Sets whether this declaracao is prestacao informacoes.
	 *
	 * @param prestacaoInformacoes the prestacao informacoes of this declaracao
	 */
	@Override
	public void setPrestacaoInformacoes(boolean prestacaoInformacoes) {
		model.setPrestacaoInformacoes(prestacaoInformacoes);
	}

	/**
	 * Sets the primary key of this declaracao.
	 *
	 * @param primaryKey the primary key of this declaracao
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the proposta ID of this declaracao.
	 *
	 * @param propostaId the proposta ID of this declaracao
	 */
	@Override
	public void setPropostaId(long propostaId) {
		model.setPropostaId(propostaId);
	}

	/**
	 * Sets whether this declaracao is reconhece grupo ou sucessao.
	 *
	 * @param reconheceGrupoOuSucessao the reconhece grupo ou sucessao of this declaracao
	 */
	@Override
	public void setReconheceGrupoOuSucessao(boolean reconheceGrupoOuSucessao) {
		model.setReconheceGrupoOuSucessao(reconheceGrupoOuSucessao);
	}

	/**
	 * Sets whether this declaracao is renuncia recursos.
	 *
	 * @param renunciaRecursos the renuncia recursos of this declaracao
	 */
	@Override
	public void setRenunciaRecursos(boolean renunciaRecursos) {
		model.setRenunciaRecursos(renunciaRecursos);
	}

	/**
	 * Sets the uuid of this declaracao.
	 *
	 * @param uuid the uuid of this declaracao
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
	protected DeclaracaoWrapper wrap(Declaracao declaracao) {
		return new DeclaracaoWrapper(declaracao);
	}

}
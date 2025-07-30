/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link DeclaracaoService}.
 *
 * @author Brian Wing Shun Chan
 * @see DeclaracaoService
 * @generated
 */
public class DeclaracaoServiceWrapper
	implements DeclaracaoService, ServiceWrapper<DeclaracaoService> {

	public DeclaracaoServiceWrapper() {
		this(null);
	}

	public DeclaracaoServiceWrapper(DeclaracaoService declaracaoService) {
		_declaracaoService = declaracaoService;
	}

	@Override
	public br.com.seatecnologia.gdf.negocia.model.Declaracao addDeclaracao(
		com.liferay.portal.kernel.service.ServiceContext serviceContext,
		long propostaId, boolean cumpreCompromissos,
		boolean naoAlienacaoBensSemComunicacao,
		boolean reconheceGrupoOuSucessao, boolean compromissoConfidencialidade,
		boolean cienciaProcesso, boolean abusoTransacao,
		boolean impugnacaoRecursos, boolean renunciaRecursos,
		boolean peticionamentoProcessos, boolean prestacaoInformacoes,
		boolean omissaoInformacoes, boolean manutencaoGarantias) {

		return _declaracaoService.addDeclaracao(
			serviceContext, propostaId, cumpreCompromissos,
			naoAlienacaoBensSemComunicacao, reconheceGrupoOuSucessao,
			compromissoConfidencialidade, cienciaProcesso, abusoTransacao,
			impugnacaoRecursos, renunciaRecursos, peticionamentoProcessos,
			prestacaoInformacoes, omissaoInformacoes, manutencaoGarantias);
	}

	@Override
	public br.com.seatecnologia.gdf.negocia.model.Declaracao findByPropostaId(
		long propostaId) {

		return _declaracaoService.findByPropostaId(propostaId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _declaracaoService.getOSGiServiceIdentifier();
	}

	@Override
	public DeclaracaoService getWrappedService() {
		return _declaracaoService;
	}

	@Override
	public void setWrappedService(DeclaracaoService declaracaoService) {
		_declaracaoService = declaracaoService;
	}

	private DeclaracaoService _declaracaoService;

}
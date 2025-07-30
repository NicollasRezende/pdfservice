/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service;

import br.com.seatecnologia.gdf.negocia.model.Declaracao;

import com.liferay.portal.kernel.module.service.Snapshot;

/**
 * Provides the remote service utility for Declaracao. This utility wraps
 * <code>br.com.seatecnologia.gdf.negocia.service.impl.DeclaracaoServiceImpl</code> and is an
 * access point for service operations in application layer code running on a
 * remote server. Methods of this service are expected to have security checks
 * based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see DeclaracaoService
 * @generated
 */
public class DeclaracaoServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>br.com.seatecnologia.gdf.negocia.service.impl.DeclaracaoServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static Declaracao addDeclaracao(
		com.liferay.portal.kernel.service.ServiceContext serviceContext,
		long propostaId, boolean cumpreCompromissos,
		boolean naoAlienacaoBensSemComunicacao,
		boolean reconheceGrupoOuSucessao, boolean compromissoConfidencialidade,
		boolean cienciaProcesso, boolean abusoTransacao,
		boolean impugnacaoRecursos, boolean renunciaRecursos,
		boolean peticionamentoProcessos, boolean prestacaoInformacoes,
		boolean omissaoInformacoes, boolean manutencaoGarantias) {

		return getService().addDeclaracao(
			serviceContext, propostaId, cumpreCompromissos,
			naoAlienacaoBensSemComunicacao, reconheceGrupoOuSucessao,
			compromissoConfidencialidade, cienciaProcesso, abusoTransacao,
			impugnacaoRecursos, renunciaRecursos, peticionamentoProcessos,
			prestacaoInformacoes, omissaoInformacoes, manutencaoGarantias);
	}

	public static Declaracao findByPropostaId(long propostaId) {
		return getService().findByPropostaId(propostaId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static DeclaracaoService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<DeclaracaoService> _serviceSnapshot =
		new Snapshot<>(DeclaracaoServiceUtil.class, DeclaracaoService.class);

}
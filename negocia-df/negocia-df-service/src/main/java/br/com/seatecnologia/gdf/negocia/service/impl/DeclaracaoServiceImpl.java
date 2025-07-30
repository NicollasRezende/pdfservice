/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.impl;

import br.com.seatecnologia.gdf.negocia.model.Declaracao;
import br.com.seatecnologia.gdf.negocia.service.DeclaracaoLocalService;
import br.com.seatecnologia.gdf.negocia.service.base.DeclaracaoServiceBaseImpl;

import com.liferay.portal.aop.AopService;

import com.liferay.portal.kernel.service.ServiceContext;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = {
		"json.web.service.context.name=gdf",
		"json.web.service.context.path=Declaracao"
	},
	service = AopService.class
)
public class DeclaracaoServiceImpl extends DeclaracaoServiceBaseImpl {
	@Override
	public Declaracao addDeclaracao(ServiceContext serviceContext, long propostaId, boolean cumpreCompromissos, boolean naoAlienacaoBensSemComunicacao,
									boolean reconheceGrupoOuSucessao, boolean compromissoConfidencialidade,
									boolean cienciaProcesso, boolean abusoTransacao, boolean impugnacaoRecursos,
									boolean renunciaRecursos, boolean peticionamentoProcessos, boolean prestacaoInformacoes,
									boolean omissaoInformacoes, boolean manutencaoGarantias) {

		return _declaracaoLocalService.addDeclaracao(serviceContext, propostaId, cumpreCompromissos, naoAlienacaoBensSemComunicacao,
				reconheceGrupoOuSucessao, compromissoConfidencialidade, cienciaProcesso,
				abusoTransacao, impugnacaoRecursos, renunciaRecursos, peticionamentoProcessos, prestacaoInformacoes,
				omissaoInformacoes, manutencaoGarantias);
	}

	public Declaracao findByPropostaId(long propostaId) {
		return _declaracaoLocalService.getDeclaracaoByPropostaId(propostaId);
	}

	@Reference
	private DeclaracaoLocalService _declaracaoLocalService;
}
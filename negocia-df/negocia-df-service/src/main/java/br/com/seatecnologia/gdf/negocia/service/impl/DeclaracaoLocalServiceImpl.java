/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.impl;

import br.com.seatecnologia.gdf.negocia.exception.NoSuchDeclaracaoException;
import br.com.seatecnologia.gdf.negocia.model.Declaracao;
import br.com.seatecnologia.gdf.negocia.service.base.DeclaracaoLocalServiceBaseImpl;

import com.liferay.portal.aop.AopService;

import com.liferay.portal.kernel.service.ServiceContext;
import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=br.com.seatecnologia.gdf.negocia.model.Declaracao",
	service = AopService.class
)
public class DeclaracaoLocalServiceImpl extends DeclaracaoLocalServiceBaseImpl {

	@Override
	public Declaracao addDeclaracao(ServiceContext serviceContext, long propostaId, boolean cumpreCompromissos, boolean naoAlienacaoBensSemComunicacao,
									boolean reconheceGrupoOuSucessao, boolean compromissoConfidencialidade,
									boolean cienciaProcesso, boolean abusoTransacao, boolean impugnacaoRecursos,
									boolean renunciaRecursos, boolean peticionamentoProcessos, boolean prestacaoInformacoes,
									boolean omissaoInformacoes, boolean manutencaoGarantias) {

		long declaracaoId = counterLocalService.increment(Declaracao.class.getName());

		Declaracao declaracao = super.createDeclaracao(declaracaoId);

		declaracao.setPropostaId(propostaId);
		declaracao.setCumpreCompromissos(cumpreCompromissos);
		declaracao.setNaoAlienacaoBensSemComunicacao(naoAlienacaoBensSemComunicacao);
		declaracao.setReconheceGrupoOuSucessao(reconheceGrupoOuSucessao);
		declaracao.setCompromissoConfidencialidade(compromissoConfidencialidade);
		declaracao.setCienciaProcesso(cienciaProcesso);
		declaracao.setAbusoTransacao(abusoTransacao);
		declaracao.setImpugnacaoRecursos(impugnacaoRecursos);
		declaracao.setRenunciaRecursos(renunciaRecursos);
		declaracao.setPeticionamentoProcessos(peticionamentoProcessos);
		declaracao.setPrestacaoInformacoes(prestacaoInformacoes);
		declaracao.setOmissaoInformacoes(omissaoInformacoes);
		declaracao.setManutencaoGarantias(manutencaoGarantias);

		return super.addDeclaracao(declaracao);
	}

	@Override
	public Declaracao getDeclaracaoByPropostaId(long propostaId) {
		return declaracaoPersistence.fetchByPropostaId(propostaId);
	}

}
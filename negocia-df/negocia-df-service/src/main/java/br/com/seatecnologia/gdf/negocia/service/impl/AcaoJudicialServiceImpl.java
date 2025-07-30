/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.impl;

import br.com.seatecnologia.gdf.negocia.model.AcaoJudicial;
import br.com.seatecnologia.gdf.negocia.service.base.AcaoJudicialServiceBaseImpl;

import com.liferay.portal.aop.AopService;

import com.liferay.portal.kernel.service.ServiceContext;
import org.osgi.service.component.annotations.Component;

import java.util.List;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = {
		"json.web.service.context.name=gdf",
		"json.web.service.context.path=AcaoJudicial"
	},
	service = AopService.class
)
public class AcaoJudicialServiceImpl extends AcaoJudicialServiceBaseImpl {

	@Override
	public AcaoJudicial addAcaoJudicial(ServiceContext serviceContext, String orgaoTribunal, String numeroProcesso, String unidadeVara,
										String parteAutora, String parteRe, String observacoes, long propostaId) {

		return acaoJudicialLocalService.addAcaoJudicial(serviceContext, orgaoTribunal, numeroProcesso, unidadeVara,
				parteAutora, parteRe, observacoes, propostaId);

	}

	@Override
	public AcaoJudicial updateAcaoJudicial(long acaoId,
										   long propostaId,
										   String numeroProcesso,
										   String varaLocal) {

		return acaoJudicialLocalService.updateAcaoJudicial(acaoId,
														  propostaId,
														  numeroProcesso,
														  varaLocal);

	}

	@Override
	public List<AcaoJudicial> getAcaoJudicials(int start, int end) {
		return acaoJudicialLocalService.getAcaoJudicials(start, end);
	}

	public List<AcaoJudicial> findByPropostaId(long propostaId) {
		return acaoJudicialLocalService.findByPropostaId(propostaId);
	}
}
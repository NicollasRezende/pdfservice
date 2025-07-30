/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.impl;

import br.com.seatecnologia.gdf.negocia.model.ConcessaoDf;
import br.com.seatecnologia.gdf.negocia.service.base.ConcessaoDfLocalServiceBaseImpl;

import com.liferay.portal.aop.AopService;

import com.liferay.portal.kernel.exception.PortalException;
import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=br.com.seatecnologia.gdf.negocia.model.ConcessaoDf",
	service = AopService.class
)
public class ConcessaoDfLocalServiceImpl
	extends ConcessaoDfLocalServiceBaseImpl {

	@Override
	public ConcessaoDf addConcessaoDf(long concessaoId,
									  long propostaId,
									  double percentualDescontoJuros,
									  double percentualDescontoPrincipal,
									  String observacoes) {

		ConcessaoDf concessaoDf = createConcessaoDf(concessaoId);

		concessaoDf.setPropostaId(propostaId);
		concessaoDf.setPercentualDescontoJuros(percentualDescontoJuros);
		concessaoDf.setPercentualDescontoPrincipal(percentualDescontoPrincipal);
		concessaoDf.setObservacoes(observacoes);

		return concessaoDfPersistence.update(concessaoDf);
	}

	@Override
	public ConcessaoDf updateConcessaoDf(long concessaoId,
										  long propostaId,
										  double percentualDescontoJuros,
										  double percentualDescontoPrincipal,
										  String observacoes) throws PortalException {

		ConcessaoDf concessaoDf = getConcessaoDf(concessaoId);

		concessaoDf.setPropostaId(propostaId);
		concessaoDf.setPercentualDescontoJuros(percentualDescontoJuros);
		concessaoDf.setPercentualDescontoPrincipal(percentualDescontoPrincipal);
		concessaoDf.setObservacoes(observacoes);

		return concessaoDfPersistence.update(concessaoDf);
	}
}
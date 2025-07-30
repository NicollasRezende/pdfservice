/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.impl;

import br.com.seatecnologia.gdf.negocia.model.ConcessaoDf;
import br.com.seatecnologia.gdf.negocia.service.base.ConcessaoDfServiceBaseImpl;

import com.liferay.portal.aop.AopService;

import com.liferay.portal.kernel.exception.PortalException;
import org.osgi.service.component.annotations.Component;

import java.util.List;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = {
		"json.web.service.context.name=gdf",
		"json.web.service.context.path=ConcessaoDf"
	},
	service = AopService.class
)
public class ConcessaoDfServiceImpl extends ConcessaoDfServiceBaseImpl {

	@Override
	public ConcessaoDf addConcessaoDf (long concessaoId,
									   long propostaId,
									   double percentualDescontoJuros,
									   double percentualDescontoPrincipal,
									   String observacoes) {
		return concessaoDfLocalService.addConcessaoDf(concessaoId,
				propostaId, percentualDescontoJuros,
				percentualDescontoPrincipal, observacoes);
	}

	@Override
	public ConcessaoDf updateConcessaoDf (long concessaoId,
										  long propostaId,
										  double percentualDescontoJuros,
										  double percentualDescontoPrincipal,
										  String observacoes) throws PortalException {
		return concessaoDfLocalService.updateConcessaoDf(concessaoId,
				propostaId, percentualDescontoJuros,
				percentualDescontoPrincipal, observacoes);
	}

	@Override
	public List<ConcessaoDf> getConcessaoDfs(int start, int end) {
		return concessaoDfLocalService.getConcessaoDfs(start, end);
	}

}
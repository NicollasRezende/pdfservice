/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.impl;

import br.com.seatecnologia.gdf.negocia.model.DadosContribuinte;
import br.com.seatecnologia.gdf.negocia.service.base.DadosContribuinteServiceBaseImpl;

import com.liferay.portal.aop.AopService;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.service.ServiceContext;
import org.osgi.service.component.annotations.Component;

import java.util.List;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = {
		"json.web.service.context.name=gdf",
		"json.web.service.context.path=DadosContribuinte"
	},
	service = AopService.class
)
public class DadosContribuinteServiceImpl
	extends DadosContribuinteServiceBaseImpl {

	@Override
	public DadosContribuinte addDadosContribuinte (ServiceContext serviceContext, long qualificacaoId, long propostaId) {

		return dadosContribuinteLocalService.addDadosContribuinte(serviceContext, qualificacaoId, propostaId);
	}

	@Override
	public DadosContribuinte updateDadosContribuinte (long dadosContribuinteId,
												   ServiceContext serviceContext,
												   long qualificacaoId,
												   long socios,
												   long controladores,
												   long administradores,
												   long gestores,
												   long empresasGrupo) throws PortalException {

		return dadosContribuinteLocalService.updateDadosContribuinte(
			dadosContribuinteId, serviceContext, qualificacaoId, socios,
			controladores, administradores, gestores, empresasGrupo);
	}

	@Override
	public List<DadosContribuinte> getDadosContribuintes(int start, int end) {
		return dadosContribuinteLocalService.getDadosContribuintes(start, end);
	}
}
/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.impl;

import br.com.seatecnologia.gdf.negocia.model.DadosContribuinte;
import br.com.seatecnologia.gdf.negocia.service.base.DadosContribuinteLocalServiceBaseImpl;

import com.liferay.portal.aop.AopService;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.service.ServiceContext;
import org.osgi.service.component.annotations.Component;

import java.util.Date;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=br.com.seatecnologia.gdf.negocia.model.DadosContribuinte",
	service = AopService.class
)
public class DadosContribuinteLocalServiceImpl
	extends DadosContribuinteLocalServiceBaseImpl {

	@Override
	public DadosContribuinte addDadosContribuinte (ServiceContext serviceContext, long qualificacaoId, long propostaId) {

		long dadosContribuinteId = counterLocalService.increment(DadosContribuinte.class.getName());

		DadosContribuinte dadosContribuinte = super.createDadosContribuinte(dadosContribuinteId);

		dadosContribuinte.setCreateDate(new Date());
		dadosContribuinte.setModifiedDate(new Date());
		dadosContribuinte.setUserId(serviceContext.getUserId());
		dadosContribuinte.setGroupId(serviceContext.getScopeGroupId());
		dadosContribuinte.setCompanyId(serviceContext.getCompanyId());
		dadosContribuinte.setQualificacaoId(qualificacaoId);
		dadosContribuinte.setPropostaId(propostaId);

		return super.addDadosContribuinte(dadosContribuinte);
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
		DadosContribuinte dadosContribuinte = getDadosContribuinte(dadosContribuinteId);

		dadosContribuinte.setModifiedDate(new Date());
		dadosContribuinte.setUserId(serviceContext.getUserId());
		dadosContribuinte.setGroupId(serviceContext.getScopeGroupId());
		dadosContribuinte.setCompanyId(serviceContext.getCompanyId());
		dadosContribuinte.setQualificacaoId(qualificacaoId);

		return dadosContribuintePersistence.update(dadosContribuinte);
	}
}
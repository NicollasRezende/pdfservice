/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.impl;

import br.com.seatecnologia.gdf.negocia.model.DemonstracaoContabil;
import br.com.seatecnologia.gdf.negocia.service.base.DemonstracaoContabilServiceBaseImpl;

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
		"json.web.service.context.path=DemonstracaoContabil"
	},
	service = AopService.class
)
public class DemonstracaoContabilServiceImpl
	extends DemonstracaoContabilServiceBaseImpl {

	@Override
	public DemonstracaoContabil addDemonstracaoContabil(ServiceContext serviceContext, long propostaId,
														long fileEntryId, int tipoDocumento) {
		return demonstracaoContabilLocalService.addDemonstracaoContabil(serviceContext, propostaId, fileEntryId, tipoDocumento);
	}

	@Override
	public DemonstracaoContabil updateDemonstracaoContabil(long demonstracaoId,
														   long propostaId,
														   String tipoDemonstracao,
														   long fileEntryId) throws PortalException {
		return demonstracaoContabilLocalService.updateDemonstracaoContabil(
			demonstracaoId, propostaId, tipoDemonstracao, fileEntryId);
	}

	@Override
	public List<DemonstracaoContabil> getDemonstracaoContabils(int start, int end) {
		return demonstracaoContabilLocalService.getDemonstracaoContabils(start, end);
	}

}
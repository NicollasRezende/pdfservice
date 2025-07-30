/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.impl;

import br.com.seatecnologia.gdf.negocia.model.Encargo;
import br.com.seatecnologia.gdf.negocia.service.base.EncargoServiceBaseImpl;

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
		"json.web.service.context.path=Encargo"
	},
	service = AopService.class
)
public class EncargoServiceImpl extends EncargoServiceBaseImpl {

	@Override
	public Encargo addEncargo (long encargoId, long propostaId,
							   double valorEncargos, String descricaoEncargos) {

		return encargoLocalService.addEncargo(encargoId, propostaId,
											  valorEncargos, descricaoEncargos);
	}

	@Override
	public Encargo updateEncargo (long encargoId, long propostaId,
								   double valorEncargos, String descricaoEncargos) throws PortalException {

		return encargoLocalService.updateEncargo(encargoId, propostaId,
												 valorEncargos, descricaoEncargos);
	}

	@Override
	public List<Encargo> getEncargos(int start, int end) {
		return encargoLocalService.getEncargos(start, end);
	}

}
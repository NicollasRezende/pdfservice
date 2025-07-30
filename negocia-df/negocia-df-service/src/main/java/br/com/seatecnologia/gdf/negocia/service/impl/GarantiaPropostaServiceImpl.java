/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.impl;

import br.com.seatecnologia.gdf.negocia.model.GarantiaProposta;
import br.com.seatecnologia.gdf.negocia.service.GarantiaPropostaLocalService;
import br.com.seatecnologia.gdf.negocia.service.base.GarantiaPropostaServiceBaseImpl;

import com.liferay.portal.aop.AopService;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = {
		"json.web.service.context.name=gdf",
		"json.web.service.context.path=GarantiaProposta"
	},
	service = AopService.class
)
public class GarantiaPropostaServiceImpl
	extends GarantiaPropostaServiceBaseImpl {

	@Override
	public GarantiaProposta addGarantiaProposta (long garantiaId, long propostaId) {
		return _garantiaPropostaLocalService.addGarantiaProposta(garantiaId, propostaId);
	}

	@Reference
	private GarantiaPropostaLocalService _garantiaPropostaLocalService;
}
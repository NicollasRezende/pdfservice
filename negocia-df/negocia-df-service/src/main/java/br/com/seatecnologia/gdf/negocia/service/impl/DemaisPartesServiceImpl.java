/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.impl;

import br.com.seatecnologia.gdf.negocia.model.DemaisPartes;
import br.com.seatecnologia.gdf.negocia.service.DemaisPartesLocalService;
import br.com.seatecnologia.gdf.negocia.service.base.DemaisPartesServiceBaseImpl;

import com.liferay.portal.aop.AopService;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = {
		"json.web.service.context.name=gdf",
		"json.web.service.context.path=DemaisPartes"
	},
	service = AopService.class
)
public class DemaisPartesServiceImpl extends DemaisPartesServiceBaseImpl {

	@Override
	public DemaisPartes addDemaisPartes(long qualificacaoId, long propostaId, String tipoParte) {
		return _demaisPartesLocalService.addDemaisPartes(qualificacaoId, propostaId, tipoParte);
	}

	@Reference
	private DemaisPartesLocalService _demaisPartesLocalService;

}
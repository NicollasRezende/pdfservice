/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.impl;

import br.com.seatecnologia.gdf.negocia.model.CredorProposta;
import br.com.seatecnologia.gdf.negocia.service.CredorPropostaLocalService;
import br.com.seatecnologia.gdf.negocia.service.base.CredorPropostaServiceBaseImpl;

import com.liferay.portal.aop.AopService;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = {
		"json.web.service.context.name=gdf",
		"json.web.service.context.path=CredorProposta"
	},
	service = AopService.class
)
public class CredorPropostaServiceImpl extends CredorPropostaServiceBaseImpl {
	@Override
	public CredorProposta addCredorProposta(long credorId, long propostaId) {
		return _credorPropostaLocalService.addCredorProposta(credorId, propostaId);
	}

	@Reference
	private CredorPropostaLocalService _credorPropostaLocalService;
}
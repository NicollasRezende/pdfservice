/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.impl;

import br.com.seatecnologia.gdf.negocia.model.BensDireitosRequerente;
import br.com.seatecnologia.gdf.negocia.service.BensDireitosRequerenteLocalService;
import br.com.seatecnologia.gdf.negocia.service.base.BensDireitosRequerenteServiceBaseImpl;

import com.liferay.portal.aop.AopService;

import com.liferay.portal.kernel.service.ServiceContext;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = {
		"json.web.service.context.name=gdf",
		"json.web.service.context.path=BensDireitosRequerente"
	},
	service = AopService.class
)
public class BensDireitosRequerenteServiceImpl
	extends BensDireitosRequerenteServiceBaseImpl {

	@Override
	public BensDireitosRequerente addBensDireitosRequerente (ServiceContext serviceContext, long propostaId, String descricao, String localizacaoDestinacao) {

		return _bensDireitosRequerenteLocalService.addBensDireitosRequerente(serviceContext, propostaId, descricao, localizacaoDestinacao);
	}

	@Reference
	private BensDireitosRequerenteLocalService _bensDireitosRequerenteLocalService;
}
/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.impl;

import br.com.seatecnologia.gdf.negocia.model.DadosRegistro;
import br.com.seatecnologia.gdf.negocia.service.DadosRegistroLocalService;
import br.com.seatecnologia.gdf.negocia.service.base.DadosRegistroServiceBaseImpl;

import com.liferay.portal.aop.AopService;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = {
		"json.web.service.context.name=gdf",
		"json.web.service.context.path=DadosRegistro"
	},
	service = AopService.class
)
public class DadosRegistroServiceImpl extends DadosRegistroServiceBaseImpl {

	@Override
	public DadosRegistro addDadosRegistro(String matriculaImovel, String cartorioRegistro,
										  String renavam) {
		return _dadosRegistroLocalService.addDadosRegistro(matriculaImovel, cartorioRegistro, renavam);
	}

	@Reference
	private DadosRegistroLocalService _dadosRegistroLocalService;
}
/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.impl;

import br.com.seatecnologia.gdf.negocia.model.AnexosOutros;
import br.com.seatecnologia.gdf.negocia.service.AnexosOutrosLocalService;
import br.com.seatecnologia.gdf.negocia.service.base.AnexosOutrosServiceBaseImpl;

import com.liferay.portal.aop.AopService;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = {
		"json.web.service.context.name=gdf",
		"json.web.service.context.path=AnexosOutros"
	},
	service = AopService.class
)
public class AnexosOutrosServiceImpl extends AnexosOutrosServiceBaseImpl {

	@Override
	public AnexosOutros addAnexoOutros(long dadosRegistroId, long outrosAnexo) {

		return anexosOutroLocalService.addAnexosOutros(dadosRegistroId, outrosAnexo);
	}

	@Reference
	private AnexosOutrosLocalService anexosOutroLocalService;
}
/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.impl;

import br.com.seatecnologia.gdf.negocia.model.BensDireitosLaudo;
import br.com.seatecnologia.gdf.negocia.service.base.BensDireitosLaudoLocalServiceBaseImpl;

import com.liferay.portal.aop.AopService;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=br.com.seatecnologia.gdf.negocia.model.BensDireitosLaudo",
	service = AopService.class
)
public class BensDireitosLaudoLocalServiceImpl
	extends BensDireitosLaudoLocalServiceBaseImpl {

	@Override
	public BensDireitosLaudo addBensDireitosLaudo(long bemId, long laudoAvaliacao) {

		long bensDireitosLaudoId = counterLocalService.increment(BensDireitosLaudo.class.getName());

		BensDireitosLaudo bensDireitosLaudo = super.createBensDireitosLaudo(bensDireitosLaudoId);

		bensDireitosLaudo.setBemId(bemId);
		bensDireitosLaudo.setLaudoAvaliacao(laudoAvaliacao);

		return super.addBensDireitosLaudo(bensDireitosLaudo);
	}

}
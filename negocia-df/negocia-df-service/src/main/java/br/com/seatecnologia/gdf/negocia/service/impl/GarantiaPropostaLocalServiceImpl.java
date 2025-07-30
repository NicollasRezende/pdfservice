/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.impl;

import br.com.seatecnologia.gdf.negocia.model.GarantiaProposta;
import br.com.seatecnologia.gdf.negocia.service.base.GarantiaPropostaLocalServiceBaseImpl;

import com.liferay.portal.aop.AopService;

import org.osgi.service.component.annotations.Component;

import java.util.List;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=br.com.seatecnologia.gdf.negocia.model.GarantiaProposta",
	service = AopService.class
)
public class GarantiaPropostaLocalServiceImpl
	extends GarantiaPropostaLocalServiceBaseImpl {

	@Override
	public GarantiaProposta addGarantiaProposta (long garantiaId, long propostaId) {
		long garantiaPropostaId = counterLocalService.increment(GarantiaProposta.class.getName());

		GarantiaProposta garantiaProposta = super.createGarantiaProposta(garantiaPropostaId);
		garantiaProposta.setGarantiaId(garantiaId);
		garantiaProposta.setPropostaId(propostaId);

		return super.addGarantiaProposta(garantiaProposta);
	}
}
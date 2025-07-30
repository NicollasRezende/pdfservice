/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.impl;

import br.com.seatecnologia.gdf.negocia.model.Parcelamento;
import br.com.seatecnologia.gdf.negocia.service.base.ParcelamentoServiceBaseImpl;

import com.liferay.portal.aop.AopService;

import com.liferay.portal.kernel.exception.PortalException;
import org.osgi.service.component.annotations.Component;

import java.util.Date;
import java.util.List;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = {
		"json.web.service.context.name=gdf",
		"json.web.service.context.path=Parcelamento"
	},
	service = AopService.class
)
public class ParcelamentoServiceImpl extends ParcelamentoServiceBaseImpl {

	@Override
	public Parcelamento addParcelamento(long parcelamentoId, long idProposta,
										int numeroParcelas, double valorEntrada,
										Date dataPrimeiraParcela,
										double valorPrimeiraParcela) {
		return parcelamentoLocalService.addParcelamento(parcelamentoId, idProposta,
														numeroParcelas, valorEntrada,
														dataPrimeiraParcela,
														valorPrimeiraParcela);
	}

	@Override
	public Parcelamento updateParcelamento(long parcelamentoId, long idProposta,
										   int numeroParcelas, double valorEntrada,
										   Date dataPrimeiraParcela,
										   double valorPrimeiraParcela) throws PortalException {
		return parcelamentoLocalService.updateParcelamento(parcelamentoId, idProposta,
														   numeroParcelas, valorEntrada,
														   dataPrimeiraParcela,
														   valorPrimeiraParcela);
	}

	@Override
	public List<Parcelamento> getParcelamentos(int start, int end) {
		return parcelamentoLocalService.getParcelamentos(start, end);
	}

}
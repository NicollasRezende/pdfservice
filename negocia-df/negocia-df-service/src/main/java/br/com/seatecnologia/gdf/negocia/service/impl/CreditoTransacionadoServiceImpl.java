/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.impl;

import br.com.seatecnologia.gdf.negocia.model.CreditoTransacionado;
import br.com.seatecnologia.gdf.negocia.service.base.CreditoTransacionadoServiceBaseImpl;

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
		"json.web.service.context.path=CreditoTransacionado"
	},
	service = AopService.class
)
public class CreditoTransacionadoServiceImpl
	extends CreditoTransacionadoServiceBaseImpl {

	@Override
	public CreditoTransacionado addCreditoTransacionado(
			long creditoId, long propostaId,
			String numeroInscricao, String codigoReceita,
			Date dataInscricao, double valorAtualizado) {

		return creditoTransacionadoLocalService.addCreditoTransacionado(
				creditoId, propostaId,
				numeroInscricao, codigoReceita,
				dataInscricao, valorAtualizado);
	}

	@Override
	public CreditoTransacionado updateCreditoTransacionado(
			long creditoId, long propostaId,
			String numeroInscricao, String codigoReceita,
			Date dataInscricao, double valorAtualizado) throws PortalException {

		return creditoTransacionadoLocalService.updateCreditoTransacionado(
				creditoId, propostaId,
				numeroInscricao, codigoReceita,
				dataInscricao, valorAtualizado);
	}

	@Override
	public List<CreditoTransacionado> getCreditoTransacionados(int start, int end) {
		return creditoTransacionadoLocalService.getCreditoTransacionados(start, end);
	}
}
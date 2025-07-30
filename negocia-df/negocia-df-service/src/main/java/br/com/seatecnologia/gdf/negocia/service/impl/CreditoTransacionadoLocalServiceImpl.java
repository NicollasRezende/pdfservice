/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.impl;

import br.com.seatecnologia.gdf.negocia.model.CreditoTransacionado;
import br.com.seatecnologia.gdf.negocia.service.base.CreditoTransacionadoLocalServiceBaseImpl;

import com.liferay.portal.aop.AopService;

import com.liferay.portal.kernel.exception.PortalException;
import org.osgi.service.component.annotations.Component;

import java.util.Date;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=br.com.seatecnologia.gdf.negocia.model.CreditoTransacionado",
	service = AopService.class
)
public class CreditoTransacionadoLocalServiceImpl
	extends CreditoTransacionadoLocalServiceBaseImpl {

	@Override
	public CreditoTransacionado addCreditoTransacionado (
			long creditoId, long propostaId,
			String numeroInscricao, String codigoReceita,
			Date dataInscricao, double valorAtualizado
	) {
		CreditoTransacionado creditoTransacionado = createCreditoTransacionado(creditoId);

		creditoTransacionado.setPropostaId(propostaId);
		creditoTransacionado.setNumeroInscricao(numeroInscricao);
		creditoTransacionado.setCodigoReceita(codigoReceita);
		creditoTransacionado.setDataInscricao(dataInscricao);
		creditoTransacionado.setValorAtualizado(valorAtualizado);

		return creditoTransacionadoPersistence.update(creditoTransacionado);
	}

	@Override
	public CreditoTransacionado updateCreditoTransacionado (
			long creditoId, long propostaId,
			String numeroInscricao, String codigoReceita,
			Date dataInscricao, double valorAtualizado
	) throws PortalException {
		CreditoTransacionado creditoTransacionado = getCreditoTransacionado(creditoId);

		creditoTransacionado.setPropostaId(propostaId);
		creditoTransacionado.setNumeroInscricao(numeroInscricao);
		creditoTransacionado.setCodigoReceita(codigoReceita);
		creditoTransacionado.setDataInscricao(dataInscricao);
		creditoTransacionado.setValorAtualizado(valorAtualizado);

		return creditoTransacionadoPersistence.update(creditoTransacionado);
	}
}
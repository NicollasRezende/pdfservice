/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.impl;

import br.com.seatecnologia.gdf.negocia.model.Parcelamento;
import br.com.seatecnologia.gdf.negocia.service.base.ParcelamentoLocalServiceBaseImpl;

import com.liferay.portal.aop.AopService;

import com.liferay.portal.kernel.exception.PortalException;
import org.osgi.service.component.annotations.Component;

import java.util.Date;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=br.com.seatecnologia.gdf.negocia.model.Parcelamento",
	service = AopService.class
)
public class ParcelamentoLocalServiceImpl
	extends ParcelamentoLocalServiceBaseImpl {

	@Override
	public Parcelamento addParcelamento(long parcelamentoId,
										long propostaId,
										int numeroParcelas,
										double valorEntrada,
										Date dataPrimeiraParcela,
										double valorPrimeiraParcela) {

		Parcelamento parcelamento = createParcelamento(parcelamentoId);

		parcelamento.setPropostaId(propostaId);
		parcelamento.setNumeroParcelas(numeroParcelas);
		parcelamento.setValorEntrada(valorEntrada);
		parcelamento.setDataPrimeiraParcela(dataPrimeiraParcela);
		parcelamento.setValorPrimeiraParcela(valorPrimeiraParcela);

		return parcelamentoPersistence.update(parcelamento);
	}

	@Override
	public Parcelamento updateParcelamento(long parcelamentoId,
										   long propostaId,
										   int numeroParcelas,
										   double valorEntrada,
										   Date dataPrimeiraParcela,
										   double valorPrimeiraParcela) throws PortalException {

		Parcelamento parcelamento = getParcelamento(parcelamentoId);

		parcelamento.setPropostaId(propostaId);
		parcelamento.setNumeroParcelas(numeroParcelas);
		parcelamento.setValorEntrada(valorEntrada);
		parcelamento.setDataPrimeiraParcela(dataPrimeiraParcela);
		parcelamento.setValorPrimeiraParcela(valorPrimeiraParcela);

		return parcelamentoPersistence.update(parcelamento);
	}

}
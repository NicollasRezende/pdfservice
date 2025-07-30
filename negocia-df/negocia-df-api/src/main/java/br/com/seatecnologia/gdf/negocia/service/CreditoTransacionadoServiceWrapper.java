/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link CreditoTransacionadoService}.
 *
 * @author Brian Wing Shun Chan
 * @see CreditoTransacionadoService
 * @generated
 */
public class CreditoTransacionadoServiceWrapper
	implements CreditoTransacionadoService,
			   ServiceWrapper<CreditoTransacionadoService> {

	public CreditoTransacionadoServiceWrapper() {
		this(null);
	}

	public CreditoTransacionadoServiceWrapper(
		CreditoTransacionadoService creditoTransacionadoService) {

		_creditoTransacionadoService = creditoTransacionadoService;
	}

	@Override
	public br.com.seatecnologia.gdf.negocia.model.CreditoTransacionado
		addCreditoTransacionado(
			long creditoId, long propostaId, String numeroInscricao,
			String codigoReceita, java.util.Date dataInscricao,
			double valorAtualizado) {

		return _creditoTransacionadoService.addCreditoTransacionado(
			creditoId, propostaId, numeroInscricao, codigoReceita,
			dataInscricao, valorAtualizado);
	}

	@Override
	public java.util.List
		<br.com.seatecnologia.gdf.negocia.model.CreditoTransacionado>
			getCreditoTransacionados(int start, int end) {

		return _creditoTransacionadoService.getCreditoTransacionados(
			start, end);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _creditoTransacionadoService.getOSGiServiceIdentifier();
	}

	@Override
	public br.com.seatecnologia.gdf.negocia.model.CreditoTransacionado
			updateCreditoTransacionado(
				long creditoId, long propostaId, String numeroInscricao,
				String codigoReceita, java.util.Date dataInscricao,
				double valorAtualizado)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _creditoTransacionadoService.updateCreditoTransacionado(
			creditoId, propostaId, numeroInscricao, codigoReceita,
			dataInscricao, valorAtualizado);
	}

	@Override
	public CreditoTransacionadoService getWrappedService() {
		return _creditoTransacionadoService;
	}

	@Override
	public void setWrappedService(
		CreditoTransacionadoService creditoTransacionadoService) {

		_creditoTransacionadoService = creditoTransacionadoService;
	}

	private CreditoTransacionadoService _creditoTransacionadoService;

}
/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link ParcelamentoService}.
 *
 * @author Brian Wing Shun Chan
 * @see ParcelamentoService
 * @generated
 */
public class ParcelamentoServiceWrapper
	implements ParcelamentoService, ServiceWrapper<ParcelamentoService> {

	public ParcelamentoServiceWrapper() {
		this(null);
	}

	public ParcelamentoServiceWrapper(ParcelamentoService parcelamentoService) {
		_parcelamentoService = parcelamentoService;
	}

	@Override
	public br.com.seatecnologia.gdf.negocia.model.Parcelamento addParcelamento(
		long parcelamentoId, long idProposta, int numeroParcelas,
		double valorEntrada, java.util.Date dataPrimeiraParcela,
		double valorPrimeiraParcela) {

		return _parcelamentoService.addParcelamento(
			parcelamentoId, idProposta, numeroParcelas, valorEntrada,
			dataPrimeiraParcela, valorPrimeiraParcela);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _parcelamentoService.getOSGiServiceIdentifier();
	}

	@Override
	public java.util.List<br.com.seatecnologia.gdf.negocia.model.Parcelamento>
		getParcelamentos(int start, int end) {

		return _parcelamentoService.getParcelamentos(start, end);
	}

	@Override
	public br.com.seatecnologia.gdf.negocia.model.Parcelamento
			updateParcelamento(
				long parcelamentoId, long idProposta, int numeroParcelas,
				double valorEntrada, java.util.Date dataPrimeiraParcela,
				double valorPrimeiraParcela)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _parcelamentoService.updateParcelamento(
			parcelamentoId, idProposta, numeroParcelas, valorEntrada,
			dataPrimeiraParcela, valorPrimeiraParcela);
	}

	@Override
	public ParcelamentoService getWrappedService() {
		return _parcelamentoService;
	}

	@Override
	public void setWrappedService(ParcelamentoService parcelamentoService) {
		_parcelamentoService = parcelamentoService;
	}

	private ParcelamentoService _parcelamentoService;

}
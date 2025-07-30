/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link ComprovanteHonorarioService}.
 *
 * @author Brian Wing Shun Chan
 * @see ComprovanteHonorarioService
 * @generated
 */
public class ComprovanteHonorarioServiceWrapper
	implements ComprovanteHonorarioService,
			   ServiceWrapper<ComprovanteHonorarioService> {

	public ComprovanteHonorarioServiceWrapper() {
		this(null);
	}

	public ComprovanteHonorarioServiceWrapper(
		ComprovanteHonorarioService comprovanteHonorarioService) {

		_comprovanteHonorarioService = comprovanteHonorarioService;
	}

	@Override
	public br.com.seatecnologia.gdf.negocia.model.ComprovanteHonorario
		addComprovanteHonorario(
			long comprovanteId, long propostaId, double valorPago,
			java.util.Date dataPagamento, long fileEntryId) {

		return _comprovanteHonorarioService.addComprovanteHonorario(
			comprovanteId, propostaId, valorPago, dataPagamento, fileEntryId);
	}

	@Override
	public java.util.List
		<br.com.seatecnologia.gdf.negocia.model.ComprovanteHonorario>
			getComprovanteHonorarios(int start, int end) {

		return _comprovanteHonorarioService.getComprovanteHonorarios(
			start, end);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _comprovanteHonorarioService.getOSGiServiceIdentifier();
	}

	@Override
	public br.com.seatecnologia.gdf.negocia.model.ComprovanteHonorario
			updateComprovanteHonorario(
				long comprovanteId, long propostaId, double valorPago,
				java.util.Date dataPagamento, long fileEntryId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _comprovanteHonorarioService.updateComprovanteHonorario(
			comprovanteId, propostaId, valorPago, dataPagamento, fileEntryId);
	}

	@Override
	public ComprovanteHonorarioService getWrappedService() {
		return _comprovanteHonorarioService;
	}

	@Override
	public void setWrappedService(
		ComprovanteHonorarioService comprovanteHonorarioService) {

		_comprovanteHonorarioService = comprovanteHonorarioService;
	}

	private ComprovanteHonorarioService _comprovanteHonorarioService;

}
/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link GarantiaPropostaService}.
 *
 * @author Brian Wing Shun Chan
 * @see GarantiaPropostaService
 * @generated
 */
public class GarantiaPropostaServiceWrapper
	implements GarantiaPropostaService,
			   ServiceWrapper<GarantiaPropostaService> {

	public GarantiaPropostaServiceWrapper() {
		this(null);
	}

	public GarantiaPropostaServiceWrapper(
		GarantiaPropostaService garantiaPropostaService) {

		_garantiaPropostaService = garantiaPropostaService;
	}

	@Override
	public br.com.seatecnologia.gdf.negocia.model.GarantiaProposta
		addGarantiaProposta(long garantiaId, long propostaId) {

		return _garantiaPropostaService.addGarantiaProposta(
			garantiaId, propostaId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _garantiaPropostaService.getOSGiServiceIdentifier();
	}

	@Override
	public GarantiaPropostaService getWrappedService() {
		return _garantiaPropostaService;
	}

	@Override
	public void setWrappedService(
		GarantiaPropostaService garantiaPropostaService) {

		_garantiaPropostaService = garantiaPropostaService;
	}

	private GarantiaPropostaService _garantiaPropostaService;

}
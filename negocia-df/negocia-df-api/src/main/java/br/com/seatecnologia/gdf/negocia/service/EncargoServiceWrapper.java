/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link EncargoService}.
 *
 * @author Brian Wing Shun Chan
 * @see EncargoService
 * @generated
 */
public class EncargoServiceWrapper
	implements EncargoService, ServiceWrapper<EncargoService> {

	public EncargoServiceWrapper() {
		this(null);
	}

	public EncargoServiceWrapper(EncargoService encargoService) {
		_encargoService = encargoService;
	}

	@Override
	public br.com.seatecnologia.gdf.negocia.model.Encargo addEncargo(
		long encargoId, long propostaId, double valorEncargos,
		String descricaoEncargos) {

		return _encargoService.addEncargo(
			encargoId, propostaId, valorEncargos, descricaoEncargos);
	}

	@Override
	public java.util.List<br.com.seatecnologia.gdf.negocia.model.Encargo>
		getEncargos(int start, int end) {

		return _encargoService.getEncargos(start, end);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _encargoService.getOSGiServiceIdentifier();
	}

	@Override
	public br.com.seatecnologia.gdf.negocia.model.Encargo updateEncargo(
			long encargoId, long propostaId, double valorEncargos,
			String descricaoEncargos)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _encargoService.updateEncargo(
			encargoId, propostaId, valorEncargos, descricaoEncargos);
	}

	@Override
	public EncargoService getWrappedService() {
		return _encargoService;
	}

	@Override
	public void setWrappedService(EncargoService encargoService) {
		_encargoService = encargoService;
	}

	private EncargoService _encargoService;

}
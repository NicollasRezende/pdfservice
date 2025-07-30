/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link DemaisPartesService}.
 *
 * @author Brian Wing Shun Chan
 * @see DemaisPartesService
 * @generated
 */
public class DemaisPartesServiceWrapper
	implements DemaisPartesService, ServiceWrapper<DemaisPartesService> {

	public DemaisPartesServiceWrapper() {
		this(null);
	}

	public DemaisPartesServiceWrapper(DemaisPartesService demaisPartesService) {
		_demaisPartesService = demaisPartesService;
	}

	@Override
	public br.com.seatecnologia.gdf.negocia.model.DemaisPartes addDemaisPartes(
		long qualificacaoId, long propostaId, String tipoParte) {

		return _demaisPartesService.addDemaisPartes(
			qualificacaoId, propostaId, tipoParte);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _demaisPartesService.getOSGiServiceIdentifier();
	}

	@Override
	public DemaisPartesService getWrappedService() {
		return _demaisPartesService;
	}

	@Override
	public void setWrappedService(DemaisPartesService demaisPartesService) {
		_demaisPartesService = demaisPartesService;
	}

	private DemaisPartesService _demaisPartesService;

}
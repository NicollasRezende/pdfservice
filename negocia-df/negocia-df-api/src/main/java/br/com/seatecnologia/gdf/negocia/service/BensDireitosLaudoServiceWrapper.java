/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link BensDireitosLaudoService}.
 *
 * @author Brian Wing Shun Chan
 * @see BensDireitosLaudoService
 * @generated
 */
public class BensDireitosLaudoServiceWrapper
	implements BensDireitosLaudoService,
			   ServiceWrapper<BensDireitosLaudoService> {

	public BensDireitosLaudoServiceWrapper() {
		this(null);
	}

	public BensDireitosLaudoServiceWrapper(
		BensDireitosLaudoService bensDireitosLaudoService) {

		_bensDireitosLaudoService = bensDireitosLaudoService;
	}

	@Override
	public br.com.seatecnologia.gdf.negocia.model.BensDireitosLaudo
		addBensDireitosLaudo(long bemId, long laudoAvaliacao) {

		return _bensDireitosLaudoService.addBensDireitosLaudo(
			bemId, laudoAvaliacao);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _bensDireitosLaudoService.getOSGiServiceIdentifier();
	}

	@Override
	public BensDireitosLaudoService getWrappedService() {
		return _bensDireitosLaudoService;
	}

	@Override
	public void setWrappedService(
		BensDireitosLaudoService bensDireitosLaudoService) {

		_bensDireitosLaudoService = bensDireitosLaudoService;
	}

	private BensDireitosLaudoService _bensDireitosLaudoService;

}
/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link ProcuracaoService}.
 *
 * @author Brian Wing Shun Chan
 * @see ProcuracaoService
 * @generated
 */
public class ProcuracaoServiceWrapper
	implements ProcuracaoService, ServiceWrapper<ProcuracaoService> {

	public ProcuracaoServiceWrapper() {
		this(null);
	}

	public ProcuracaoServiceWrapper(ProcuracaoService procuracaoService) {
		_procuracaoService = procuracaoService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _procuracaoService.getOSGiServiceIdentifier();
	}

	@Override
	public ProcuracaoService getWrappedService() {
		return _procuracaoService;
	}

	@Override
	public void setWrappedService(ProcuracaoService procuracaoService) {
		_procuracaoService = procuracaoService;
	}

	private ProcuracaoService _procuracaoService;

}
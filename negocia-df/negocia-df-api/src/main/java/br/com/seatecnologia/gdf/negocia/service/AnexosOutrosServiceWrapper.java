/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AnexosOutrosService}.
 *
 * @author Brian Wing Shun Chan
 * @see AnexosOutrosService
 * @generated
 */
public class AnexosOutrosServiceWrapper
	implements AnexosOutrosService, ServiceWrapper<AnexosOutrosService> {

	public AnexosOutrosServiceWrapper() {
		this(null);
	}

	public AnexosOutrosServiceWrapper(AnexosOutrosService anexosOutrosService) {
		_anexosOutrosService = anexosOutrosService;
	}

	@Override
	public br.com.seatecnologia.gdf.negocia.model.AnexosOutros addAnexoOutros(
		long dadosRegistroId, long outrosAnexo) {

		return _anexosOutrosService.addAnexoOutros(
			dadosRegistroId, outrosAnexo);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _anexosOutrosService.getOSGiServiceIdentifier();
	}

	@Override
	public AnexosOutrosService getWrappedService() {
		return _anexosOutrosService;
	}

	@Override
	public void setWrappedService(AnexosOutrosService anexosOutrosService) {
		_anexosOutrosService = anexosOutrosService;
	}

	private AnexosOutrosService _anexosOutrosService;

}
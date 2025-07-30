/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link EditalService}.
 *
 * @author Brian Wing Shun Chan
 * @see EditalService
 * @generated
 */
public class EditalServiceWrapper
	implements EditalService, ServiceWrapper<EditalService> {

	public EditalServiceWrapper() {
		this(null);
	}

	public EditalServiceWrapper(EditalService editalService) {
		_editalService = editalService;
	}

	@Override
	public java.util.List<br.com.seatecnologia.gdf.negocia.model.Edital>
		getEditais() {

		return _editalService.getEditais();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _editalService.getOSGiServiceIdentifier();
	}

	@Override
	public EditalService getWrappedService() {
		return _editalService;
	}

	@Override
	public void setWrappedService(EditalService editalService) {
		_editalService = editalService;
	}

	private EditalService _editalService;

}
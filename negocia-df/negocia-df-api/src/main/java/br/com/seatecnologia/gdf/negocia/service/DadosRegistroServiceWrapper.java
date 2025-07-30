/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link DadosRegistroService}.
 *
 * @author Brian Wing Shun Chan
 * @see DadosRegistroService
 * @generated
 */
public class DadosRegistroServiceWrapper
	implements DadosRegistroService, ServiceWrapper<DadosRegistroService> {

	public DadosRegistroServiceWrapper() {
		this(null);
	}

	public DadosRegistroServiceWrapper(
		DadosRegistroService dadosRegistroService) {

		_dadosRegistroService = dadosRegistroService;
	}

	@Override
	public br.com.seatecnologia.gdf.negocia.model.DadosRegistro
		addDadosRegistro(
			String matriculaImovel, String cartorioRegistro, String renavam) {

		return _dadosRegistroService.addDadosRegistro(
			matriculaImovel, cartorioRegistro, renavam);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _dadosRegistroService.getOSGiServiceIdentifier();
	}

	@Override
	public DadosRegistroService getWrappedService() {
		return _dadosRegistroService;
	}

	@Override
	public void setWrappedService(DadosRegistroService dadosRegistroService) {
		_dadosRegistroService = dadosRegistroService;
	}

	private DadosRegistroService _dadosRegistroService;

}
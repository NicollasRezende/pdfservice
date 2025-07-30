/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link BensDireitosRequerenteService}.
 *
 * @author Brian Wing Shun Chan
 * @see BensDireitosRequerenteService
 * @generated
 */
public class BensDireitosRequerenteServiceWrapper
	implements BensDireitosRequerenteService,
			   ServiceWrapper<BensDireitosRequerenteService> {

	public BensDireitosRequerenteServiceWrapper() {
		this(null);
	}

	public BensDireitosRequerenteServiceWrapper(
		BensDireitosRequerenteService bensDireitosRequerenteService) {

		_bensDireitosRequerenteService = bensDireitosRequerenteService;
	}

	@Override
	public br.com.seatecnologia.gdf.negocia.model.BensDireitosRequerente
		addBensDireitosRequerente(
			com.liferay.portal.kernel.service.ServiceContext serviceContext,
			long propostaId, String descricao, String localizacaoDestinacao) {

		return _bensDireitosRequerenteService.addBensDireitosRequerente(
			serviceContext, propostaId, descricao, localizacaoDestinacao);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _bensDireitosRequerenteService.getOSGiServiceIdentifier();
	}

	@Override
	public BensDireitosRequerenteService getWrappedService() {
		return _bensDireitosRequerenteService;
	}

	@Override
	public void setWrappedService(
		BensDireitosRequerenteService bensDireitosRequerenteService) {

		_bensDireitosRequerenteService = bensDireitosRequerenteService;
	}

	private BensDireitosRequerenteService _bensDireitosRequerenteService;

}
/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link DadosContribuinteService}.
 *
 * @author Brian Wing Shun Chan
 * @see DadosContribuinteService
 * @generated
 */
public class DadosContribuinteServiceWrapper
	implements DadosContribuinteService,
			   ServiceWrapper<DadosContribuinteService> {

	public DadosContribuinteServiceWrapper() {
		this(null);
	}

	public DadosContribuinteServiceWrapper(
		DadosContribuinteService dadosContribuinteService) {

		_dadosContribuinteService = dadosContribuinteService;
	}

	@Override
	public br.com.seatecnologia.gdf.negocia.model.DadosContribuinte
		addDadosContribuinte(
			com.liferay.portal.kernel.service.ServiceContext serviceContext,
			long qualificacaoId, long propostaId) {

		return _dadosContribuinteService.addDadosContribuinte(
			serviceContext, qualificacaoId, propostaId);
	}

	@Override
	public java.util.List
		<br.com.seatecnologia.gdf.negocia.model.DadosContribuinte>
			getDadosContribuintes(int start, int end) {

		return _dadosContribuinteService.getDadosContribuintes(start, end);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _dadosContribuinteService.getOSGiServiceIdentifier();
	}

	@Override
	public br.com.seatecnologia.gdf.negocia.model.DadosContribuinte
			updateDadosContribuinte(
				long dadosContribuinteId,
				com.liferay.portal.kernel.service.ServiceContext serviceContext,
				long qualificacaoId, long socios, long controladores,
				long administradores, long gestores, long empresasGrupo)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _dadosContribuinteService.updateDadosContribuinte(
			dadosContribuinteId, serviceContext, qualificacaoId, socios,
			controladores, administradores, gestores, empresasGrupo);
	}

	@Override
	public DadosContribuinteService getWrappedService() {
		return _dadosContribuinteService;
	}

	@Override
	public void setWrappedService(
		DadosContribuinteService dadosContribuinteService) {

		_dadosContribuinteService = dadosContribuinteService;
	}

	private DadosContribuinteService _dadosContribuinteService;

}
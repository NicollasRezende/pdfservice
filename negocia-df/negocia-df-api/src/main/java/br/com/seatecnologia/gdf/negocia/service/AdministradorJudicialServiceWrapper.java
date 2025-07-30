/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AdministradorJudicialService}.
 *
 * @author Brian Wing Shun Chan
 * @see AdministradorJudicialService
 * @generated
 */
public class AdministradorJudicialServiceWrapper
	implements AdministradorJudicialService,
			   ServiceWrapper<AdministradorJudicialService> {

	public AdministradorJudicialServiceWrapper() {
		this(null);
	}

	public AdministradorJudicialServiceWrapper(
		AdministradorJudicialService administradorJudicialService) {

		_administradorJudicialService = administradorJudicialService;
	}

	@Override
	public br.com.seatecnologia.gdf.negocia.model.AdministradorJudicial
		addAdministradorJudicial(
			com.liferay.portal.kernel.service.ServiceContext serviceContext,
			long qualificacaoId, boolean regimeFalencia, String recuperacao,
			String numeroProcesso, long anexoRecuperacao) {

		return _administradorJudicialService.addAdministradorJudicial(
			serviceContext, qualificacaoId, regimeFalencia, recuperacao,
			numeroProcesso, anexoRecuperacao);
	}

	@Override
	public java.util.List
		<br.com.seatecnologia.gdf.negocia.model.AdministradorJudicial>
			getAdministradorJudicials(int start, int end) {

		return _administradorJudicialService.getAdministradorJudicials(
			start, end);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _administradorJudicialService.getOSGiServiceIdentifier();
	}

	@Override
	public br.com.seatecnologia.gdf.negocia.model.AdministradorJudicial
			updateAdministradorJudicial(
				long administradorJudicialId,
				com.liferay.portal.kernel.service.ServiceContext serviceContext,
				long qualificacaoId, String tipoRegime, String numeroProcesso,
				String anexoAjuste)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _administradorJudicialService.updateAdministradorJudicial(
			administradorJudicialId, serviceContext, qualificacaoId, tipoRegime,
			numeroProcesso, anexoAjuste);
	}

	@Override
	public AdministradorJudicialService getWrappedService() {
		return _administradorJudicialService;
	}

	@Override
	public void setWrappedService(
		AdministradorJudicialService administradorJudicialService) {

		_administradorJudicialService = administradorJudicialService;
	}

	private AdministradorJudicialService _administradorJudicialService;

}
/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link DemonstracaoContabilService}.
 *
 * @author Brian Wing Shun Chan
 * @see DemonstracaoContabilService
 * @generated
 */
public class DemonstracaoContabilServiceWrapper
	implements DemonstracaoContabilService,
			   ServiceWrapper<DemonstracaoContabilService> {

	public DemonstracaoContabilServiceWrapper() {
		this(null);
	}

	public DemonstracaoContabilServiceWrapper(
		DemonstracaoContabilService demonstracaoContabilService) {

		_demonstracaoContabilService = demonstracaoContabilService;
	}

	@Override
	public br.com.seatecnologia.gdf.negocia.model.DemonstracaoContabil
		addDemonstracaoContabil(
			com.liferay.portal.kernel.service.ServiceContext serviceContext,
			long propostaId, long fileEntryId, int tipoDocumento) {

		return _demonstracaoContabilService.addDemonstracaoContabil(
			serviceContext, propostaId, fileEntryId, tipoDocumento);
	}

	@Override
	public java.util.List
		<br.com.seatecnologia.gdf.negocia.model.DemonstracaoContabil>
			getDemonstracaoContabils(int start, int end) {

		return _demonstracaoContabilService.getDemonstracaoContabils(
			start, end);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _demonstracaoContabilService.getOSGiServiceIdentifier();
	}

	@Override
	public br.com.seatecnologia.gdf.negocia.model.DemonstracaoContabil
			updateDemonstracaoContabil(
				long demonstracaoId, long propostaId, String tipoDemonstracao,
				long fileEntryId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _demonstracaoContabilService.updateDemonstracaoContabil(
			demonstracaoId, propostaId, tipoDemonstracao, fileEntryId);
	}

	@Override
	public DemonstracaoContabilService getWrappedService() {
		return _demonstracaoContabilService;
	}

	@Override
	public void setWrappedService(
		DemonstracaoContabilService demonstracaoContabilService) {

		_demonstracaoContabilService = demonstracaoContabilService;
	}

	private DemonstracaoContabilService _demonstracaoContabilService;

}
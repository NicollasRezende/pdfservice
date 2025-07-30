/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link DemonstracaoDocumentosService}.
 *
 * @author Brian Wing Shun Chan
 * @see DemonstracaoDocumentosService
 * @generated
 */
public class DemonstracaoDocumentosServiceWrapper
	implements DemonstracaoDocumentosService,
			   ServiceWrapper<DemonstracaoDocumentosService> {

	public DemonstracaoDocumentosServiceWrapper() {
		this(null);
	}

	public DemonstracaoDocumentosServiceWrapper(
		DemonstracaoDocumentosService demonstracaoDocumentosService) {

		_demonstracaoDocumentosService = demonstracaoDocumentosService;
	}

	@Override
	public br.com.seatecnologia.gdf.negocia.model.DemonstracaoDocumentos
		addDemonstracaoDocumentos(
			long demonstracaoId, int tipoDocumento, long fileEntryId) {

		return _demonstracaoDocumentosService.addDemonstracaoDocumentos(
			demonstracaoId, tipoDocumento, fileEntryId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _demonstracaoDocumentosService.getOSGiServiceIdentifier();
	}

	@Override
	public DemonstracaoDocumentosService getWrappedService() {
		return _demonstracaoDocumentosService;
	}

	@Override
	public void setWrappedService(
		DemonstracaoDocumentosService demonstracaoDocumentosService) {

		_demonstracaoDocumentosService = demonstracaoDocumentosService;
	}

	private DemonstracaoDocumentosService _demonstracaoDocumentosService;

}
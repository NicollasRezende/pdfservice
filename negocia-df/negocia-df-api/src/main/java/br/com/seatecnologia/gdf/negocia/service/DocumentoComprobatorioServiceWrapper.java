/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link DocumentoComprobatorioService}.
 *
 * @author Brian Wing Shun Chan
 * @see DocumentoComprobatorioService
 * @generated
 */
public class DocumentoComprobatorioServiceWrapper
	implements DocumentoComprobatorioService,
			   ServiceWrapper<DocumentoComprobatorioService> {

	public DocumentoComprobatorioServiceWrapper() {
		this(null);
	}

	public DocumentoComprobatorioServiceWrapper(
		DocumentoComprobatorioService documentoComprobatorioService) {

		_documentoComprobatorioService = documentoComprobatorioService;
	}

	@Override
	public br.com.seatecnologia.gdf.negocia.model.DocumentoComprobatorio
		addDocumentoComprobatorio(long fileEntryId, long fundamentacaoId) {

		return _documentoComprobatorioService.addDocumentoComprobatorio(
			fileEntryId, fundamentacaoId);
	}

	@Override
	public java.util.List
		<br.com.seatecnologia.gdf.negocia.model.DocumentoComprobatorio>
			getDocumentoComprobatorios(int start, int end) {

		return _documentoComprobatorioService.getDocumentoComprobatorios(
			start, end);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _documentoComprobatorioService.getOSGiServiceIdentifier();
	}

	@Override
	public br.com.seatecnologia.gdf.negocia.model.DocumentoComprobatorio
			updateDocumentoComprobatorio(
				long documentoId, long propostaId, String tipoDocumento,
				long fileEntryId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _documentoComprobatorioService.updateDocumentoComprobatorio(
			documentoId, propostaId, tipoDocumento, fileEntryId);
	}

	@Override
	public DocumentoComprobatorioService getWrappedService() {
		return _documentoComprobatorioService;
	}

	@Override
	public void setWrappedService(
		DocumentoComprobatorioService documentoComprobatorioService) {

		_documentoComprobatorioService = documentoComprobatorioService;
	}

	private DocumentoComprobatorioService _documentoComprobatorioService;

}
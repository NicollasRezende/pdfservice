/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service;

import br.com.seatecnologia.gdf.negocia.model.DocumentoComprobatorio;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.module.service.Snapshot;

import java.util.List;

/**
 * Provides the remote service utility for DocumentoComprobatorio. This utility wraps
 * <code>br.com.seatecnologia.gdf.negocia.service.impl.DocumentoComprobatorioServiceImpl</code> and is an
 * access point for service operations in application layer code running on a
 * remote server. Methods of this service are expected to have security checks
 * based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see DocumentoComprobatorioService
 * @generated
 */
public class DocumentoComprobatorioServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>br.com.seatecnologia.gdf.negocia.service.impl.DocumentoComprobatorioServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static DocumentoComprobatorio addDocumentoComprobatorio(
		long fileEntryId, long fundamentacaoId) {

		return getService().addDocumentoComprobatorio(
			fileEntryId, fundamentacaoId);
	}

	public static List<DocumentoComprobatorio> getDocumentoComprobatorios(
		int start, int end) {

		return getService().getDocumentoComprobatorios(start, end);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static DocumentoComprobatorio updateDocumentoComprobatorio(
			long documentoId, long propostaId, String tipoDocumento,
			long fileEntryId)
		throws PortalException {

		return getService().updateDocumentoComprobatorio(
			documentoId, propostaId, tipoDocumento, fileEntryId);
	}

	public static DocumentoComprobatorioService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<DocumentoComprobatorioService>
		_serviceSnapshot = new Snapshot<>(
			DocumentoComprobatorioServiceUtil.class,
			DocumentoComprobatorioService.class);

}
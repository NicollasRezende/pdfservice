/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.impl;

import br.com.seatecnologia.gdf.negocia.model.DocumentoComprobatorio;
import br.com.seatecnologia.gdf.negocia.service.base.DocumentoComprobatorioServiceBaseImpl;

import com.liferay.portal.aop.AopService;

import com.liferay.portal.kernel.exception.PortalException;
import org.osgi.service.component.annotations.Component;

import java.util.List;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = {
		"json.web.service.context.name=gdf",
		"json.web.service.context.path=DocumentoComprobatorio"
	},
	service = AopService.class
)
public class DocumentoComprobatorioServiceImpl
	extends DocumentoComprobatorioServiceBaseImpl {

	@Override
	public DocumentoComprobatorio addDocumentoComprobatorio(long fileEntryId,
															long fundamentacaoId) {
		return documentoComprobatorioLocalService.addDocumentoComprobatorio(
			fileEntryId, fundamentacaoId);
	}

	@Override
	public DocumentoComprobatorio updateDocumentoComprobatorio(long documentoId,
															   long propostaId,
															   String tipoDocumento,
															   long fileEntryId) throws PortalException {
		return documentoComprobatorioLocalService.updateDocumentoComprobatorio(
			documentoId, propostaId, tipoDocumento, fileEntryId);
	}

	@Override
	public List<DocumentoComprobatorio> getDocumentoComprobatorios(int start, int end) {
		return documentoComprobatorioLocalService.getDocumentoComprobatorios(start, end);
	}

}
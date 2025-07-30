/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.impl;

import br.com.seatecnologia.gdf.negocia.model.DocumentoComprobatorio;
import br.com.seatecnologia.gdf.negocia.service.base.DocumentoComprobatorioLocalServiceBaseImpl;

import com.liferay.document.library.kernel.exception.NoSuchFileEntryException;
import com.liferay.portal.aop.AopService;

import com.liferay.portal.kernel.exception.PortalException;
import org.osgi.service.component.annotations.Component;
import java.util.List;

import java.util.List;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=br.com.seatecnologia.gdf.negocia.model.DocumentoComprobatorio",
	service = AopService.class
)
public class DocumentoComprobatorioLocalServiceImpl
	extends DocumentoComprobatorioLocalServiceBaseImpl {

	@Override
	public DocumentoComprobatorio addDocumentoComprobatorio(long fileEntryId,
															long fundamentacaoId) {

		long documentoComprobatorioId = counterLocalService.increment(DocumentoComprobatorio.class.getName());

		DocumentoComprobatorio documentoComprobatorio = super.createDocumentoComprobatorio(documentoComprobatorioId);

		documentoComprobatorio.setFileEntryId(fileEntryId);
		documentoComprobatorio.setFundamentacaoId(fundamentacaoId);

		return super.addDocumentoComprobatorio(documentoComprobatorio);
	}

	@Override
	public DocumentoComprobatorio updateDocumentoComprobatorio(long documentoId,
															  long propostaId,
															  String tipoDocumento,
															  long fileEntryId) throws PortalException {

		DocumentoComprobatorio documentoComprobatorio = getDocumentoComprobatorio(documentoId);

		documentoComprobatorio.setFileEntryId(fileEntryId);

		return documentoComprobatorioPersistence.update(documentoComprobatorio);
	}

	@Override
	public List<DocumentoComprobatorio> getDocumentosComprobatoriosByFundamentacaoId(long fundamentacaoId) {
		return documentoComprobatorioPersistence.findByFundamentacaoId(fundamentacaoId);
	}

}
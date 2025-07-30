/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.impl;

import br.com.seatecnologia.gdf.negocia.model.ComprovanteHonorario;
import br.com.seatecnologia.gdf.negocia.service.base.ComprovanteHonorarioServiceBaseImpl;

import com.liferay.portal.aop.AopService;

import com.liferay.portal.kernel.exception.PortalException;
import org.osgi.service.component.annotations.Component;

import java.util.Date;
import java.util.List;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = {
		"json.web.service.context.name=gdf",
		"json.web.service.context.path=ComprovanteHonorario"
	},
	service = AopService.class
)
public class ComprovanteHonorarioServiceImpl
	extends ComprovanteHonorarioServiceBaseImpl {

	@Override
	public ComprovanteHonorario addComprovanteHonorario(
			long comprovanteId, long propostaId,
			double valorPago, Date dataPagamento,
			long fileEntryId
	) {
		return comprovanteHonorarioLocalService.addComprovanteHonorario(
			comprovanteId, propostaId, valorPago, dataPagamento,
			fileEntryId);
	}

	@Override
	public ComprovanteHonorario updateComprovanteHonorario(
			long comprovanteId, long propostaId,
			double valorPago, Date dataPagamento,
			long fileEntryId
	) throws PortalException {
		return comprovanteHonorarioLocalService.updateComprovanteHonorario(
			comprovanteId, propostaId, valorPago, dataPagamento,
			fileEntryId);
	}

	@Override
	public List<ComprovanteHonorario> getComprovanteHonorarios(int start, int end) {
		return comprovanteHonorarioLocalService.getComprovanteHonorarios(start, end);
	}
}
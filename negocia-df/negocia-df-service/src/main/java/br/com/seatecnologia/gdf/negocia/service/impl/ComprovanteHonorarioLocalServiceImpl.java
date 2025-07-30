/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.impl;

import br.com.seatecnologia.gdf.negocia.model.ComprovanteHonorario;
import br.com.seatecnologia.gdf.negocia.service.base.ComprovanteHonorarioLocalServiceBaseImpl;

import com.liferay.portal.aop.AopService;

import com.liferay.portal.kernel.exception.PortalException;
import org.osgi.service.component.annotations.Component;

import java.util.Date;
import java.util.List;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=br.com.seatecnologia.gdf.negocia.model.ComprovanteHonorario",
	service = AopService.class
)
public class ComprovanteHonorarioLocalServiceImpl
	extends ComprovanteHonorarioLocalServiceBaseImpl {

	@Override
	public ComprovanteHonorario addComprovanteHonorario(
			long comprovanteId, long propostaId,
			double valorPago, Date dataPagamento,
			long fileEntryId) {

		ComprovanteHonorario comprovanteHonorario = createComprovanteHonorario(comprovanteId);
		comprovanteHonorario.setPropostaId(propostaId);
		comprovanteHonorario.setValorPago(valorPago);
		comprovanteHonorario.setDataPagamento(dataPagamento);
		comprovanteHonorario.setFileEntryId(fileEntryId);

		return comprovanteHonorarioPersistence.update(comprovanteHonorario);
	}

	@Override
	public ComprovanteHonorario updateComprovanteHonorario(
			long comprovanteId, long propostaId,
			double valorPago, Date dataPagamento,
			long fileEntryId) throws PortalException {

		ComprovanteHonorario comprovanteHonorario = getComprovanteHonorario(comprovanteId);
		comprovanteHonorario.setPropostaId(propostaId);
		comprovanteHonorario.setValorPago(valorPago);
		comprovanteHonorario.setDataPagamento(dataPagamento);
		comprovanteHonorario.setFileEntryId(fileEntryId);

		return comprovanteHonorarioPersistence.update(comprovanteHonorario);
	}

	@Override
	public List<ComprovanteHonorario> getComprovanteHonorarioByPropostaId(long propostaId) {
		return comprovanteHonorarioPersistence.findByPropostaId(propostaId);
	}

}
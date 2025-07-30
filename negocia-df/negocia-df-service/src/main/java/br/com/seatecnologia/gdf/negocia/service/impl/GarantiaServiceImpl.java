/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.impl;

import br.com.seatecnologia.gdf.negocia.model.Garantia;
import br.com.seatecnologia.gdf.negocia.service.base.GarantiaServiceBaseImpl;

import com.liferay.portal.aop.AopService;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.service.ServiceContext;
import org.osgi.service.component.annotations.Component;

import java.util.List;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = {
		"json.web.service.context.name=gdf",
		"json.web.service.context.path=Garantia"
	},
	service = AopService.class
)
public class GarantiaServiceImpl extends GarantiaServiceBaseImpl {

	@Override
	public Garantia addGarantia(ServiceContext serviceContext, String tipoGarantia, String tipoDevedor, String outras, long proprietarioQualificacaoId,
								double valorEstimado, long dadosRegistroId, String localizacao,
								boolean declaracaoAnuencia, long declaracao, String descricaoBem, long propostaId) {

		return garantiaLocalService.addGarantia(serviceContext, tipoGarantia, tipoDevedor, outras,proprietarioQualificacaoId,
												valorEstimado, dadosRegistroId, localizacao, declaracaoAnuencia, declaracao, descricaoBem, propostaId);
	}

	@Override
	public Garantia updateGarantia(long garantiaId, long propostaId,
								String tipoGarantia, String descricaoBem,
								String proprietario, double valorEstimado,
								String dadosRegistro, String localizacao,
								boolean anuenciaTerceiro, long documentoAnuencia) throws PortalException {
		return garantiaLocalService.updateGarantia(garantiaId, propostaId,
				tipoGarantia, descricaoBem, proprietario, valorEstimado,
				dadosRegistro, localizacao, anuenciaTerceiro, documentoAnuencia);
	}

	@Override
	public List<Garantia> getGarantias(int start, int end) {
		return garantiaLocalService.getGarantias(start, end);
	}

}
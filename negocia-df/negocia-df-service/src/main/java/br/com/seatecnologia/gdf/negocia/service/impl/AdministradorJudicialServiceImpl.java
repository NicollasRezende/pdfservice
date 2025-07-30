/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.impl;

import br.com.seatecnologia.gdf.negocia.model.AdministradorJudicial;
import br.com.seatecnologia.gdf.negocia.service.base.AdministradorJudicialServiceBaseImpl;

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
		"json.web.service.context.path=AdministradorJudicial"
	},
	service = AopService.class
)
public class AdministradorJudicialServiceImpl
	extends AdministradorJudicialServiceBaseImpl {

	@Override
	public AdministradorJudicial addAdministradorJudicial(ServiceContext serviceContext, long qualificacaoId, boolean regimeFalencia,
														  String recuperacao,String numeroProcesso, long anexoRecuperacao) {
		return administradorJudicialLocalService.addAdministradorJudicial(serviceContext, qualificacaoId, regimeFalencia,
				recuperacao, numeroProcesso, anexoRecuperacao);
	}

	@Override
	public AdministradorJudicial updateAdministradorJudicial(long administradorJudicialId, ServiceContext serviceContext,
															 long qualificacaoId, String tipoRegime, String numeroProcesso,
															 String anexoAjuste) throws PortalException {
		return administradorJudicialLocalService.updateAdministradorJudicial(
			administradorJudicialId, serviceContext, qualificacaoId, tipoRegime,
			numeroProcesso, anexoAjuste);
	}

	@Override
	public List<AdministradorJudicial> getAdministradorJudicials (int start, int end) {
		return administradorJudicialLocalService.getAdministradorJudicials(start, end);
	}

}
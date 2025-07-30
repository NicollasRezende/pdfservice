/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.impl;

import br.com.seatecnologia.gdf.negocia.model.AdministradorJudicial;
import br.com.seatecnologia.gdf.negocia.service.base.AdministradorJudicialLocalServiceBaseImpl;

import com.liferay.portal.aop.AopService;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.service.ServiceContext;
import org.osgi.service.component.annotations.Component;

import java.util.Date;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=br.com.seatecnologia.gdf.negocia.model.AdministradorJudicial",
	service = AopService.class
)
public class AdministradorJudicialLocalServiceImpl
	extends AdministradorJudicialLocalServiceBaseImpl {

	@Override
	public AdministradorJudicial addAdministradorJudicial(ServiceContext serviceContext, long qualificacaoId, boolean regimeFalencia,
														  String recuperacao,String numeroProcesso, long anexoRecuperacao) {

		long administradorJudicialId = counterLocalService.increment(AdministradorJudicial.class.getName());

		AdministradorJudicial administradorJudicial =
			super.createAdministradorJudicial(administradorJudicialId);

		administradorJudicial.setQualificacaoId(qualificacaoId);
		administradorJudicial.setRegimeFalencia(regimeFalencia);
		administradorJudicial.setRecuperacao(recuperacao);
		administradorJudicial.setAnexoRecuperacao(anexoRecuperacao);
		administradorJudicial.setNumeroProcesso(numeroProcesso);

		return super.addAdministradorJudicial(administradorJudicial);
	}

	@Override
	public AdministradorJudicial updateAdministradorJudicial(long administradorJudicialId, ServiceContext serviceContext,
															 long qualificacaoId, String tipoRegime, String numeroProcesso,
															 String anexoAjuste) throws PortalException {

		AdministradorJudicial administradorJudicial = getAdministradorJudicial(
			administradorJudicialId);

		administradorJudicial.setQualificacaoId(qualificacaoId);
		administradorJudicial.setNumeroProcesso(numeroProcesso);

		return administradorJudicialPersistence.update(administradorJudicial);
	}

}
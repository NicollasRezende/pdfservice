/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.impl;

import br.com.seatecnologia.gdf.negocia.model.DemonstracaoContabil;
import br.com.seatecnologia.gdf.negocia.service.base.DemonstracaoContabilLocalServiceBaseImpl;

import com.liferay.portal.aop.AopService;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.service.ServiceContext;
import org.osgi.service.component.annotations.Component;

import java.util.List;
import java.util.Date;
import java.util.List;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=br.com.seatecnologia.gdf.negocia.model.DemonstracaoContabil",
	service = AopService.class
)
public class DemonstracaoContabilLocalServiceImpl
	extends DemonstracaoContabilLocalServiceBaseImpl {

	@Override
	public DemonstracaoContabil addDemonstracaoContabil(ServiceContext serviceContext, long propostaId,
														long fileEntryId, int tipoDocumento)
		{

		long demonstracaoId = counterLocalService.increment(DemonstracaoContabil.class.getName());

		DemonstracaoContabil demonstracaoContabil = super.createDemonstracaoContabil(demonstracaoId);

		demonstracaoContabil.setPropostaId(propostaId);
		demonstracaoContabil.setTipoDocumento(tipoDocumento);
		demonstracaoContabil.setFileEntryId(fileEntryId);

		return super.addDemonstracaoContabil(demonstracaoContabil);
	}

	@Override
	public DemonstracaoContabil updateDemonstracaoContabil(long demonstracaoId,
														  long propostaId,
														  String tipoDemonstracao,
														  long fileEntryId) throws PortalException {
		DemonstracaoContabil demonstracaoContabil = getDemonstracaoContabil(demonstracaoId);
		demonstracaoContabil.setPropostaId(propostaId);

		return demonstracaoContabil;
	}

	@Override
	public List<DemonstracaoContabil> getDemonstracoesContabilByPropostaId(long propostaId) {
		return demonstracaoContabilPersistence.findByPropostaId(propostaId);
	}
}
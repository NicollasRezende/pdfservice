/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.impl;

import br.com.seatecnologia.gdf.negocia.model.DemaisPartes;
import br.com.seatecnologia.gdf.negocia.service.base.DemaisPartesLocalServiceBaseImpl;

import com.liferay.portal.aop.AopService;

import org.osgi.service.component.annotations.Component;
import java.util.List;

import java.util.List;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=br.com.seatecnologia.gdf.negocia.model.DemaisPartes",
	service = AopService.class
)
public class DemaisPartesLocalServiceImpl
	extends DemaisPartesLocalServiceBaseImpl {

	@Override
	public DemaisPartes addDemaisPartes(long qualificacaoId, long propostaId, String tipoParte) {
		long demaisPartesId = counterLocalService.increment(DemaisPartes.class.getName());

		DemaisPartes demaisPartes = super.createDemaisPartes(demaisPartesId);

		demaisPartes.setQualificacaoId(qualificacaoId);
		demaisPartes.setPropostaId(propostaId);
		demaisPartes.setTipoParte(tipoParte);

		return super.addDemaisPartes(demaisPartes);
	}

	@Override
	public List<DemaisPartes> getDemaisPartesByPropostaId(long propostaId) {
		return demaisPartesPersistence.findByPropostaId(propostaId);
	}

}
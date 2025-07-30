/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.impl;

import br.com.seatecnologia.gdf.negocia.model.Encargo;
import br.com.seatecnologia.gdf.negocia.service.base.EncargoLocalServiceBaseImpl;

import com.liferay.portal.aop.AopService;

import com.liferay.portal.kernel.exception.PortalException;
import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=br.com.seatecnologia.gdf.negocia.model.Encargo",
	service = AopService.class
)
public class EncargoLocalServiceImpl extends EncargoLocalServiceBaseImpl {

	@Override
	public Encargo addEncargo (long encargoId, long propostaId,
							   double valorEncargos, String descricaoEncargos) {
		Encargo encargo = createEncargo (encargoId);

		encargo.setPropostaId (propostaId);
		encargo.setValorEncargos (valorEncargos);
		encargo.setDescricaoEncargos (descricaoEncargos);

		return encargoPersistence.update (encargo);
	}

	@Override
	public Encargo updateEncargo (long encargoId, long propostaId,
								   double valorEncargos, String descricaoEncargos) throws PortalException {

		Encargo encargo = getEncargo (encargoId);

		encargo.setPropostaId (propostaId);
		encargo.setValorEncargos (valorEncargos);
		encargo.setDescricaoEncargos (descricaoEncargos);

		return encargoPersistence.update(encargo);
	}

}
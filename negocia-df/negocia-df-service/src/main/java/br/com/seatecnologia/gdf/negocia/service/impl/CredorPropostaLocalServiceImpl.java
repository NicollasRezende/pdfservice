/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.impl;

import br.com.seatecnologia.gdf.negocia.model.CredorProposta;
import br.com.seatecnologia.gdf.negocia.service.base.CredorPropostaLocalServiceBaseImpl;

import com.liferay.portal.aop.AopService;

import org.osgi.service.component.annotations.Component;
import java.util.List;

import java.util.List;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=br.com.seatecnologia.gdf.negocia.model.CredorProposta",
	service = AopService.class
)
public class CredorPropostaLocalServiceImpl
	extends CredorPropostaLocalServiceBaseImpl {

	@Override
	public CredorProposta addCredorProposta(long credorId, long propostaId) {
		long credorPropostaId = counterLocalService.increment(CredorProposta.class.getName());

		CredorProposta credorProposta = super.createCredorProposta(credorPropostaId);

		credorProposta.setCredorId(credorId);
		credorProposta.setPropostaId(propostaId);

		return super.addCredorProposta(credorProposta);
	}

	@Override
	public List<CredorProposta> getCredoresPropostaByPropostaId(long propostaId) {
		return credorPropostaPersistence.findByPropostaId(propostaId);
	}

}
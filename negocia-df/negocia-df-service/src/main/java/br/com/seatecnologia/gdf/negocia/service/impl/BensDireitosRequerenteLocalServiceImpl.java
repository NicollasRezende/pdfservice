/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.impl;

import br.com.seatecnologia.gdf.negocia.model.BensDireitosRequerente;
import br.com.seatecnologia.gdf.negocia.service.base.BensDireitosRequerenteLocalServiceBaseImpl;

import com.liferay.portal.aop.AopService;

import com.liferay.portal.kernel.service.ServiceContext;
import org.osgi.service.component.annotations.Component;
import java.util.List;
import java.util.Date;
import java.util.List;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=br.com.seatecnologia.gdf.negocia.model.BensDireitosRequerente",
	service = AopService.class
)
public class BensDireitosRequerenteLocalServiceImpl
	extends BensDireitosRequerenteLocalServiceBaseImpl {

	@Override
	public BensDireitosRequerente addBensDireitosRequerente(ServiceContext serviceContext, long propostaId, String descricao, String localizacaoDestinacao) {

		long bensDireitosRequerenteId = counterLocalService.increment(BensDireitosRequerente.class.getName());
		BensDireitosRequerente bensDireitosRequerente = super.createBensDireitosRequerente(bensDireitosRequerenteId);

		bensDireitosRequerente.setPropostaId(propostaId);
		bensDireitosRequerente.setDescricao(descricao);
		bensDireitosRequerente.setLocalizacaoDestinacao(localizacaoDestinacao);

		return super.addBensDireitosRequerente(bensDireitosRequerente);

	}

	@Override
	public List<BensDireitosRequerente> getBensDireitosRequerentesByPropostaId(long propostaId) {
		return bensDireitosRequerentePersistence.findByPropostaId(propostaId);
	}

}
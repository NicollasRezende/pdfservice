/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.impl;

import br.com.seatecnologia.gdf.negocia.model.BemDireitoAdicional;
import br.com.seatecnologia.gdf.negocia.service.base.BemDireitoAdicionalLocalServiceBaseImpl;

import com.liferay.portal.aop.AopService;

import com.liferay.portal.kernel.exception.PortalException;
import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=br.com.seatecnologia.gdf.negocia.model.BemDireitoAdicional",
	service = AopService.class
)
public class BemDireitoAdicionalLocalServiceImpl
	extends BemDireitoAdicionalLocalServiceBaseImpl {

	@Override
	public BemDireitoAdicional addBemDireitoAdicional(
			long bemId, long propostaId,
			String descricao, String localizacao,
			String destinacao, String laudoAvaliacao
	) {

		BemDireitoAdicional bemDireitoAdicional = bemDireitoAdicionalPersistence.create(bemId);

		bemDireitoAdicional.setPropostaId(propostaId);
		bemDireitoAdicional.setDescricao(descricao);
		bemDireitoAdicional.setLocalizacao(localizacao);
		bemDireitoAdicional.setDestinacao(destinacao);
		bemDireitoAdicional.setLaudoAvaliacao(laudoAvaliacao);

		return bemDireitoAdicionalPersistence.update(bemDireitoAdicional);
	}

	@Override
	public BemDireitoAdicional updateBemDireitoAdicional(
			long bemId, long propostaId,
			String descricao, String localizacao,
			String destinacao, String laudoAvaliacao
	) throws PortalException {

		BemDireitoAdicional bemDireitoAdicional = getBemDireitoAdicional(bemId);

		bemDireitoAdicional.setPropostaId(propostaId);
		bemDireitoAdicional.setDescricao(descricao);
		bemDireitoAdicional.setLocalizacao(localizacao);
		bemDireitoAdicional.setDestinacao(destinacao);
		bemDireitoAdicional.setLaudoAvaliacao(laudoAvaliacao);

		return bemDireitoAdicionalPersistence.update(bemDireitoAdicional);
	}
}
/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.impl;

import br.com.seatecnologia.gdf.negocia.model.BemDireitoAdicional;
import br.com.seatecnologia.gdf.negocia.service.base.BemDireitoAdicionalServiceBaseImpl;

import com.liferay.portal.aop.AopService;

import com.liferay.portal.kernel.exception.PortalException;
import org.osgi.service.component.annotations.Component;

import java.util.List;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = {
		"json.web.service.context.name=gdf",
		"json.web.service.context.path=BemDireitoAdicional"
	},
	service = AopService.class
)
public class BemDireitoAdicionalServiceImpl
	extends BemDireitoAdicionalServiceBaseImpl {

	@Override
	public BemDireitoAdicional addBemDireitoAdicional(
		long bemId, long propostaId,
		String descricao, String localizacao,
		String destinacao, String laudoAvaliacao
	) {

		return bemDireitoAdicionalLocalService.addBemDireitoAdicional(
			bemId, propostaId, descricao, localizacao, destinacao,
			laudoAvaliacao);
	}

	@Override
	public BemDireitoAdicional updateBemDireitoAdicional(
		long bemId, long propostaId,
		String descricao, String localizacao,
		String destinacao, String laudoAvaliacao
	) throws PortalException {

		return bemDireitoAdicionalLocalService.updateBemDireitoAdicional(
			bemId, propostaId, descricao, localizacao, destinacao,
			laudoAvaliacao);
	}

	@Override
	public List<BemDireitoAdicional> getBemDireitoAdicionals(int start, int end) {
		return bemDireitoAdicionalLocalService.getBemDireitoAdicionals(start, end);
	}
}
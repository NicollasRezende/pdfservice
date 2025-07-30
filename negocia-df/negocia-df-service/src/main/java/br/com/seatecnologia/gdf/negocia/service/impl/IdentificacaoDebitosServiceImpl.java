/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.impl;

import br.com.seatecnologia.gdf.negocia.model.IdentificacaoDebitos;
import br.com.seatecnologia.gdf.negocia.service.IdentificacaoDebitosLocalService;
import br.com.seatecnologia.gdf.negocia.service.base.IdentificacaoDebitosServiceBaseImpl;

import com.liferay.portal.aop.AopService;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = {
		"json.web.service.context.name=gdf",
		"json.web.service.context.path=IdentificacaoDebitos"
	},
	service = AopService.class
)
public class IdentificacaoDebitosServiceImpl
	extends IdentificacaoDebitosServiceBaseImpl {

	@Override
	public IdentificacaoDebitos addIdentificacaoDebitos(long fundamentacaoId, String natureza, String situacao, String inscricaoDividaAtiva, String garantidoJudicialmente) {
		return _identificacaoDebitosLocalService.addIdentificacaoDebitos(fundamentacaoId, natureza, situacao, inscricaoDividaAtiva, garantidoJudicialmente);
	}

	@Reference
	private IdentificacaoDebitosLocalService _identificacaoDebitosLocalService;
}
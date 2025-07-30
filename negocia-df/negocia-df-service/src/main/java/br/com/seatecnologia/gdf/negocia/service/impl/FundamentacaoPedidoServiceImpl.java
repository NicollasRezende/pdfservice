/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.impl;

import br.com.seatecnologia.gdf.negocia.model.FundamentacaoPedido;
import br.com.seatecnologia.gdf.negocia.service.FundamentacaoPedidoLocalService;
import br.com.seatecnologia.gdf.negocia.service.base.FundamentacaoPedidoServiceBaseImpl;

import com.liferay.portal.aop.AopService;

import com.liferay.portal.kernel.service.ServiceContext;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = {
		"json.web.service.context.name=gdf",
		"json.web.service.context.path=FundamentacaoPedido"
	},
	service = AopService.class
)
public class FundamentacaoPedidoServiceImpl
	extends FundamentacaoPedidoServiceBaseImpl {

	@Override
	public FundamentacaoPedido addFundamentacaoPedido(ServiceContext serviceContext, String fundamentacaoPedido, long propostaId) {
		return fundamentacaoPedidoLocalService1.addFundamentacaoPedido(serviceContext, fundamentacaoPedido, propostaId);
	}

	@Reference
	private FundamentacaoPedidoLocalService fundamentacaoPedidoLocalService1;
}
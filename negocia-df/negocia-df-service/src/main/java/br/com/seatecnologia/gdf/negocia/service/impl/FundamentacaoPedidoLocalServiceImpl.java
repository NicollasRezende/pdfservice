/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.impl;

import br.com.seatecnologia.gdf.negocia.model.FundamentacaoPedido;
import br.com.seatecnologia.gdf.negocia.service.base.FundamentacaoPedidoLocalServiceBaseImpl;

import com.liferay.portal.aop.AopService;

import com.liferay.portal.kernel.service.ServiceContext;
import org.osgi.service.component.annotations.Component;

import java.util.List;
/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=br.com.seatecnologia.gdf.negocia.model.FundamentacaoPedido",
	service = AopService.class
)
public class FundamentacaoPedidoLocalServiceImpl
	extends FundamentacaoPedidoLocalServiceBaseImpl {

	@Override
	public FundamentacaoPedido addFundamentacaoPedido(ServiceContext serviceContext, String fundamentacaoPedido, long propostaId) {

		long fundamentacaoId = counterLocalService.increment(FundamentacaoPedido.class.getName());

		FundamentacaoPedido fundamentacaoPedidoCreated = super.createFundamentacaoPedido(fundamentacaoId);
		fundamentacaoPedidoCreated.setFundamentacaoPedido(fundamentacaoPedido);
		fundamentacaoPedidoCreated.setPropostaId(propostaId);
		return super.addFundamentacaoPedido(fundamentacaoPedidoCreated);
	}

	@Override
	public List<FundamentacaoPedido> getFundamentacoesPedidoByPropostaId(long propostaId) {
		return fundamentacaoPedidoPersistence.findByPropostaId(propostaId);
	}
}
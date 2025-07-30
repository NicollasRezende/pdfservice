/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link FundamentacaoPedidoService}.
 *
 * @author Brian Wing Shun Chan
 * @see FundamentacaoPedidoService
 * @generated
 */
public class FundamentacaoPedidoServiceWrapper
	implements FundamentacaoPedidoService,
			   ServiceWrapper<FundamentacaoPedidoService> {

	public FundamentacaoPedidoServiceWrapper() {
		this(null);
	}

	public FundamentacaoPedidoServiceWrapper(
		FundamentacaoPedidoService fundamentacaoPedidoService) {

		_fundamentacaoPedidoService = fundamentacaoPedidoService;
	}

	@Override
	public br.com.seatecnologia.gdf.negocia.model.FundamentacaoPedido
		addFundamentacaoPedido(
			com.liferay.portal.kernel.service.ServiceContext serviceContext,
			String fundamentacaoPedido, long propostaId) {

		return _fundamentacaoPedidoService.addFundamentacaoPedido(
			serviceContext, fundamentacaoPedido, propostaId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _fundamentacaoPedidoService.getOSGiServiceIdentifier();
	}

	@Override
	public FundamentacaoPedidoService getWrappedService() {
		return _fundamentacaoPedidoService;
	}

	@Override
	public void setWrappedService(
		FundamentacaoPedidoService fundamentacaoPedidoService) {

		_fundamentacaoPedidoService = fundamentacaoPedidoService;
	}

	private FundamentacaoPedidoService _fundamentacaoPedidoService;

}
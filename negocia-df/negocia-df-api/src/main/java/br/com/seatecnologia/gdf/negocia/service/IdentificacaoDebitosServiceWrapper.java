/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link IdentificacaoDebitosService}.
 *
 * @author Brian Wing Shun Chan
 * @see IdentificacaoDebitosService
 * @generated
 */
public class IdentificacaoDebitosServiceWrapper
	implements IdentificacaoDebitosService,
			   ServiceWrapper<IdentificacaoDebitosService> {

	public IdentificacaoDebitosServiceWrapper() {
		this(null);
	}

	public IdentificacaoDebitosServiceWrapper(
		IdentificacaoDebitosService identificacaoDebitosService) {

		_identificacaoDebitosService = identificacaoDebitosService;
	}

	@Override
	public br.com.seatecnologia.gdf.negocia.model.IdentificacaoDebitos
		addIdentificacaoDebitos(
			long fundamentacaoId, String natureza, String situacao,
			String inscricaoDividaAtiva, String garantidoJudicialmente) {

		return _identificacaoDebitosService.addIdentificacaoDebitos(
			fundamentacaoId, natureza, situacao, inscricaoDividaAtiva,
			garantidoJudicialmente);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _identificacaoDebitosService.getOSGiServiceIdentifier();
	}

	@Override
	public IdentificacaoDebitosService getWrappedService() {
		return _identificacaoDebitosService;
	}

	@Override
	public void setWrappedService(
		IdentificacaoDebitosService identificacaoDebitosService) {

		_identificacaoDebitosService = identificacaoDebitosService;
	}

	private IdentificacaoDebitosService _identificacaoDebitosService;

}
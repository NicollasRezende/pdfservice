/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link BemDireitoAdicionalService}.
 *
 * @author Brian Wing Shun Chan
 * @see BemDireitoAdicionalService
 * @generated
 */
public class BemDireitoAdicionalServiceWrapper
	implements BemDireitoAdicionalService,
			   ServiceWrapper<BemDireitoAdicionalService> {

	public BemDireitoAdicionalServiceWrapper() {
		this(null);
	}

	public BemDireitoAdicionalServiceWrapper(
		BemDireitoAdicionalService bemDireitoAdicionalService) {

		_bemDireitoAdicionalService = bemDireitoAdicionalService;
	}

	@Override
	public br.com.seatecnologia.gdf.negocia.model.BemDireitoAdicional
		addBemDireitoAdicional(
			long bemId, long propostaId, String descricao, String localizacao,
			String destinacao, String laudoAvaliacao) {

		return _bemDireitoAdicionalService.addBemDireitoAdicional(
			bemId, propostaId, descricao, localizacao, destinacao,
			laudoAvaliacao);
	}

	@Override
	public java.util.List
		<br.com.seatecnologia.gdf.negocia.model.BemDireitoAdicional>
			getBemDireitoAdicionals(int start, int end) {

		return _bemDireitoAdicionalService.getBemDireitoAdicionals(start, end);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _bemDireitoAdicionalService.getOSGiServiceIdentifier();
	}

	@Override
	public br.com.seatecnologia.gdf.negocia.model.BemDireitoAdicional
			updateBemDireitoAdicional(
				long bemId, long propostaId, String descricao,
				String localizacao, String destinacao, String laudoAvaliacao)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _bemDireitoAdicionalService.updateBemDireitoAdicional(
			bemId, propostaId, descricao, localizacao, destinacao,
			laudoAvaliacao);
	}

	@Override
	public BemDireitoAdicionalService getWrappedService() {
		return _bemDireitoAdicionalService;
	}

	@Override
	public void setWrappedService(
		BemDireitoAdicionalService bemDireitoAdicionalService) {

		_bemDireitoAdicionalService = bemDireitoAdicionalService;
	}

	private BemDireitoAdicionalService _bemDireitoAdicionalService;

}
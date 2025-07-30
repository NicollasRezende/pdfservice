/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link ConcessaoDfService}.
 *
 * @author Brian Wing Shun Chan
 * @see ConcessaoDfService
 * @generated
 */
public class ConcessaoDfServiceWrapper
	implements ConcessaoDfService, ServiceWrapper<ConcessaoDfService> {

	public ConcessaoDfServiceWrapper() {
		this(null);
	}

	public ConcessaoDfServiceWrapper(ConcessaoDfService concessaoDfService) {
		_concessaoDfService = concessaoDfService;
	}

	@Override
	public br.com.seatecnologia.gdf.negocia.model.ConcessaoDf addConcessaoDf(
		long concessaoId, long propostaId, double percentualDescontoJuros,
		double percentualDescontoPrincipal, String observacoes) {

		return _concessaoDfService.addConcessaoDf(
			concessaoId, propostaId, percentualDescontoJuros,
			percentualDescontoPrincipal, observacoes);
	}

	@Override
	public java.util.List<br.com.seatecnologia.gdf.negocia.model.ConcessaoDf>
		getConcessaoDfs(int start, int end) {

		return _concessaoDfService.getConcessaoDfs(start, end);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _concessaoDfService.getOSGiServiceIdentifier();
	}

	@Override
	public br.com.seatecnologia.gdf.negocia.model.ConcessaoDf updateConcessaoDf(
			long concessaoId, long propostaId, double percentualDescontoJuros,
			double percentualDescontoPrincipal, String observacoes)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _concessaoDfService.updateConcessaoDf(
			concessaoId, propostaId, percentualDescontoJuros,
			percentualDescontoPrincipal, observacoes);
	}

	@Override
	public ConcessaoDfService getWrappedService() {
		return _concessaoDfService;
	}

	@Override
	public void setWrappedService(ConcessaoDfService concessaoDfService) {
		_concessaoDfService = concessaoDfService;
	}

	private ConcessaoDfService _concessaoDfService;

}
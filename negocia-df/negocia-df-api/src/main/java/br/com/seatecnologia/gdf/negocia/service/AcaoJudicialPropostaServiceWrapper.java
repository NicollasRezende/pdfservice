/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AcaoJudicialPropostaService}.
 *
 * @author Brian Wing Shun Chan
 * @see AcaoJudicialPropostaService
 * @generated
 */
public class AcaoJudicialPropostaServiceWrapper
	implements AcaoJudicialPropostaService,
			   ServiceWrapper<AcaoJudicialPropostaService> {

	public AcaoJudicialPropostaServiceWrapper() {
		this(null);
	}

	public AcaoJudicialPropostaServiceWrapper(
		AcaoJudicialPropostaService acaoJudicialPropostaService) {

		_acaoJudicialPropostaService = acaoJudicialPropostaService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _acaoJudicialPropostaService.getOSGiServiceIdentifier();
	}

	@Override
	public AcaoJudicialPropostaService getWrappedService() {
		return _acaoJudicialPropostaService;
	}

	@Override
	public void setWrappedService(
		AcaoJudicialPropostaService acaoJudicialPropostaService) {

		_acaoJudicialPropostaService = acaoJudicialPropostaService;
	}

	private AcaoJudicialPropostaService _acaoJudicialPropostaService;

}
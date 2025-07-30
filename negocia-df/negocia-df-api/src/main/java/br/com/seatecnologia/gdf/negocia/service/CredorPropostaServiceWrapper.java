/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link CredorPropostaService}.
 *
 * @author Brian Wing Shun Chan
 * @see CredorPropostaService
 * @generated
 */
public class CredorPropostaServiceWrapper
	implements CredorPropostaService, ServiceWrapper<CredorPropostaService> {

	public CredorPropostaServiceWrapper() {
		this(null);
	}

	public CredorPropostaServiceWrapper(
		CredorPropostaService credorPropostaService) {

		_credorPropostaService = credorPropostaService;
	}

	@Override
	public br.com.seatecnologia.gdf.negocia.model.CredorProposta
		addCredorProposta(long credorId, long propostaId) {

		return _credorPropostaService.addCredorProposta(credorId, propostaId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _credorPropostaService.getOSGiServiceIdentifier();
	}

	@Override
	public CredorPropostaService getWrappedService() {
		return _credorPropostaService;
	}

	@Override
	public void setWrappedService(CredorPropostaService credorPropostaService) {
		_credorPropostaService = credorPropostaService;
	}

	private CredorPropostaService _credorPropostaService;

}
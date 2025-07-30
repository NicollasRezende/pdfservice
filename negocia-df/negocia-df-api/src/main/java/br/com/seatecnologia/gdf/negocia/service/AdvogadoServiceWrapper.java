/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AdvogadoService}.
 *
 * @author Brian Wing Shun Chan
 * @see AdvogadoService
 * @generated
 */
public class AdvogadoServiceWrapper
	implements AdvogadoService, ServiceWrapper<AdvogadoService> {

	public AdvogadoServiceWrapper() {
		this(null);
	}

	public AdvogadoServiceWrapper(AdvogadoService advogadoService) {
		_advogadoService = advogadoService;
	}

	@Override
	public br.com.seatecnologia.gdf.negocia.model.Advogado addAdvogado(
		com.liferay.portal.kernel.service.ServiceContext serviceContext,
		long qualificacaoId, String numeroOab, String seccional,
		long carteirinhaOAB) {

		return _advogadoService.addAdvogado(
			serviceContext, qualificacaoId, numeroOab, seccional,
			carteirinhaOAB);
	}

	@Override
	public java.util.List<br.com.seatecnologia.gdf.negocia.model.Advogado>
		getAdvogados(int start, int end) {

		return _advogadoService.getAdvogados(start, end);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _advogadoService.getOSGiServiceIdentifier();
	}

	@Override
	public br.com.seatecnologia.gdf.negocia.model.Advogado updateAdvogado(
			long advogadoId,
			com.liferay.portal.kernel.service.ServiceContext serviceContext,
			long qualificacaoId, String numeroOab, String ufOab)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _advogadoService.updateAdvogado(
			advogadoId, serviceContext, qualificacaoId, numeroOab, ufOab);
	}

	@Override
	public AdvogadoService getWrappedService() {
		return _advogadoService;
	}

	@Override
	public void setWrappedService(AdvogadoService advogadoService) {
		_advogadoService = advogadoService;
	}

	private AdvogadoService _advogadoService;

}
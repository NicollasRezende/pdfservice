/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link TermoAssinadoService}.
 *
 * @author Brian Wing Shun Chan
 * @see TermoAssinadoService
 * @generated
 */
public class TermoAssinadoServiceWrapper
	implements ServiceWrapper<TermoAssinadoService>, TermoAssinadoService {

	public TermoAssinadoServiceWrapper() {
		this(null);
	}

	public TermoAssinadoServiceWrapper(
		TermoAssinadoService termoAssinadoService) {

		_termoAssinadoService = termoAssinadoService;
	}

	@Override
	public br.com.seatecnologia.gdf.negocia.model.TermoAssinado
		addTermoAssinado(
			Long termoId, long propostaId, String urlTermo, String arquivoPdf,
			String parte) {

		return _termoAssinadoService.addTermoAssinado(
			termoId, propostaId, urlTermo, arquivoPdf, parte);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _termoAssinadoService.getOSGiServiceIdentifier();
	}

	@Override
	public java.util.List<br.com.seatecnologia.gdf.negocia.model.TermoAssinado>
		getTermoAssinados(int start, int end) {

		return _termoAssinadoService.getTermoAssinados(start, end);
	}

	@Override
	public br.com.seatecnologia.gdf.negocia.model.TermoAssinado
			updateTermoAssinado(
				Long termoId, long propostaId, String urlTermo,
				String arquivoPdf, String parte)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _termoAssinadoService.updateTermoAssinado(
			termoId, propostaId, urlTermo, arquivoPdf, parte);
	}

	@Override
	public TermoAssinadoService getWrappedService() {
		return _termoAssinadoService;
	}

	@Override
	public void setWrappedService(TermoAssinadoService termoAssinadoService) {
		_termoAssinadoService = termoAssinadoService;
	}

	private TermoAssinadoService _termoAssinadoService;

}
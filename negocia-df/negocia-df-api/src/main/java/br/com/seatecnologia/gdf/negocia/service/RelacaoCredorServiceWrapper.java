/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link RelacaoCredorService}.
 *
 * @author Brian Wing Shun Chan
 * @see RelacaoCredorService
 * @generated
 */
public class RelacaoCredorServiceWrapper
	implements RelacaoCredorService, ServiceWrapper<RelacaoCredorService> {

	public RelacaoCredorServiceWrapper() {
		this(null);
	}

	public RelacaoCredorServiceWrapper(
		RelacaoCredorService relacaoCredorService) {

		_relacaoCredorService = relacaoCredorService;
	}

	@Override
	public br.com.seatecnologia.gdf.negocia.model.RelacaoCredor
		addRelacaoCredor(
			com.liferay.portal.kernel.service.ServiceContext serviceContext,
			long propostaId, String nomeCredor, String naturezaCredito,
			String classificacaoCredito, double valorAtualizado,
			String referenciaContabil) {

		return _relacaoCredorService.addRelacaoCredor(
			serviceContext, propostaId, nomeCredor, naturezaCredito,
			classificacaoCredito, valorAtualizado, referenciaContabil);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _relacaoCredorService.getOSGiServiceIdentifier();
	}

	@Override
	public java.util.List<br.com.seatecnologia.gdf.negocia.model.RelacaoCredor>
		getRelacaoCredor(int start, int end) {

		return _relacaoCredorService.getRelacaoCredor(start, end);
	}

	@Override
	public br.com.seatecnologia.gdf.negocia.model.RelacaoCredor
		updateRelacaoCredor(
			long credorId, long propostaId, String nomeCredor,
			String naturezaCredito, String classificacaoCredito,
			double valorAtualizado, String referenciaRegistro) {

		return _relacaoCredorService.updateRelacaoCredor(
			credorId, propostaId, nomeCredor, naturezaCredito,
			classificacaoCredito, valorAtualizado, referenciaRegistro);
	}

	@Override
	public RelacaoCredorService getWrappedService() {
		return _relacaoCredorService;
	}

	@Override
	public void setWrappedService(RelacaoCredorService relacaoCredorService) {
		_relacaoCredorService = relacaoCredorService;
	}

	private RelacaoCredorService _relacaoCredorService;

}
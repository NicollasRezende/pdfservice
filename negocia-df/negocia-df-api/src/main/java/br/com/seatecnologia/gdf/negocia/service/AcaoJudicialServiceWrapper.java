/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AcaoJudicialService}.
 *
 * @author Brian Wing Shun Chan
 * @see AcaoJudicialService
 * @generated
 */
public class AcaoJudicialServiceWrapper
	implements AcaoJudicialService, ServiceWrapper<AcaoJudicialService> {

	public AcaoJudicialServiceWrapper() {
		this(null);
	}

	public AcaoJudicialServiceWrapper(AcaoJudicialService acaoJudicialService) {
		_acaoJudicialService = acaoJudicialService;
	}

	@Override
	public br.com.seatecnologia.gdf.negocia.model.AcaoJudicial addAcaoJudicial(
		com.liferay.portal.kernel.service.ServiceContext serviceContext,
		String orgaoTribunal, String numeroProcesso, String unidadeVara,
		String parteAutora, String parteRe, String observacoes,
		long propostaId) {

		return _acaoJudicialService.addAcaoJudicial(
			serviceContext, orgaoTribunal, numeroProcesso, unidadeVara,
			parteAutora, parteRe, observacoes, propostaId);
	}

	@Override
	public java.util.List<br.com.seatecnologia.gdf.negocia.model.AcaoJudicial>
		findByPropostaId(long propostaId) {

		return _acaoJudicialService.findByPropostaId(propostaId);
	}

	@Override
	public java.util.List<br.com.seatecnologia.gdf.negocia.model.AcaoJudicial>
		getAcaoJudicials(int start, int end) {

		return _acaoJudicialService.getAcaoJudicials(start, end);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _acaoJudicialService.getOSGiServiceIdentifier();
	}

	@Override
	public br.com.seatecnologia.gdf.negocia.model.AcaoJudicial
		updateAcaoJudicial(
			long acaoId, long propostaId, String numeroProcesso,
			String varaLocal) {

		return _acaoJudicialService.updateAcaoJudicial(
			acaoId, propostaId, numeroProcesso, varaLocal);
	}

	@Override
	public AcaoJudicialService getWrappedService() {
		return _acaoJudicialService;
	}

	@Override
	public void setWrappedService(AcaoJudicialService acaoJudicialService) {
		_acaoJudicialService = acaoJudicialService;
	}

	private AcaoJudicialService _acaoJudicialService;

}
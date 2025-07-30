/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link GarantiaService}.
 *
 * @author Brian Wing Shun Chan
 * @see GarantiaService
 * @generated
 */
public class GarantiaServiceWrapper
	implements GarantiaService, ServiceWrapper<GarantiaService> {

	public GarantiaServiceWrapper() {
		this(null);
	}

	public GarantiaServiceWrapper(GarantiaService garantiaService) {
		_garantiaService = garantiaService;
	}

	@Override
	public br.com.seatecnologia.gdf.negocia.model.Garantia addGarantia(
		com.liferay.portal.kernel.service.ServiceContext serviceContext,
		String tipoGarantia, String tipoDevedor, String outras,
		long proprietarioQualificacaoId, double valorEstimado,
		long dadosRegistroId, String localizacao, boolean declaracaoAnuencia,
		long declaracao, String descricaoBem, long propostaId) {

		return _garantiaService.addGarantia(
			serviceContext, tipoGarantia, tipoDevedor, outras,
			proprietarioQualificacaoId, valorEstimado, dadosRegistroId,
			localizacao, declaracaoAnuencia, declaracao, descricaoBem,
			propostaId);
	}

	@Override
	public java.util.List<br.com.seatecnologia.gdf.negocia.model.Garantia>
		getGarantias(int start, int end) {

		return _garantiaService.getGarantias(start, end);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _garantiaService.getOSGiServiceIdentifier();
	}

	@Override
	public br.com.seatecnologia.gdf.negocia.model.Garantia updateGarantia(
			long garantiaId, long propostaId, String tipoGarantia,
			String descricaoBem, String proprietario, double valorEstimado,
			String dadosRegistro, String localizacao, boolean anuenciaTerceiro,
			long documentoAnuencia)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _garantiaService.updateGarantia(
			garantiaId, propostaId, tipoGarantia, descricaoBem, proprietario,
			valorEstimado, dadosRegistro, localizacao, anuenciaTerceiro,
			documentoAnuencia);
	}

	@Override
	public GarantiaService getWrappedService() {
		return _garantiaService;
	}

	@Override
	public void setWrappedService(GarantiaService garantiaService) {
		_garantiaService = garantiaService;
	}

	private GarantiaService _garantiaService;

}
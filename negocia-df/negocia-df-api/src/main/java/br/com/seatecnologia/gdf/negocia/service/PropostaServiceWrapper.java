/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link PropostaService}.
 *
 * @author Brian Wing Shun Chan
 * @see PropostaService
 * @generated
 */
public class PropostaServiceWrapper
	implements PropostaService, ServiceWrapper<PropostaService> {

	public PropostaServiceWrapper() {
		this(null);
	}

	public PropostaServiceWrapper(PropostaService propostaService) {
		_propostaService = propostaService;
	}

	@Override
	public br.com.seatecnologia.gdf.negocia.model.Proposta addProposta(
			com.liferay.portal.kernel.service.ServiceContext serviceContext,
			long editalId, String tipoProposta, String numeroProtocoloSei,
			long propostaPaiId, long procuracao, String cpfCnpj)
		throws br.com.seatecnologia.gdf.negocia.exception.
			BusinessLogicValidationException,
			   com.liferay.portal.kernel.exception.PortalException {

		return _propostaService.addProposta(
			serviceContext, editalId, tipoProposta, numeroProtocoloSei,
			propostaPaiId, procuracao, cpfCnpj);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _propostaService.getOSGiServiceIdentifier();
	}

	@Override
	public br.com.seatecnologia.gdf.negocia.model.Proposta getProposta(
			long propostaId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _propostaService.getProposta(propostaId);
	}

	@Override
	public java.util.List<br.com.seatecnologia.gdf.negocia.model.Proposta>
		getPropostas(int start, int end) {

		return _propostaService.getPropostas(start, end);
	}

	@Override
	public br.com.seatecnologia.gdf.negocia.model.Proposta getPropostaZip(
			long propostaId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _propostaService.getPropostaZip(propostaId);
	}

	@Override
	public br.com.seatecnologia.gdf.negocia.model.Proposta updateProposta(
			long propostaId,
			com.liferay.portal.kernel.service.ServiceContext serviceContext,
			long dadosContribuinteId, long administradorJudicialId,
			long advogadoId, String fundamentacaoPedido,
			boolean cumpreCompromissos, boolean naoAlienacaoBensSemComunicacao,
			boolean reconheceGrupoOuSucessao, String status,
			String numeroProtocoloSei, String documentosCompletosURL,
			long propostaPaiId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _propostaService.updateProposta(
			propostaId, serviceContext, dadosContribuinteId,
			administradorJudicialId, advogadoId, fundamentacaoPedido,
			cumpreCompromissos, naoAlienacaoBensSemComunicacao,
			reconheceGrupoOuSucessao, status, numeroProtocoloSei,
			documentosCompletosURL, propostaPaiId);
	}

	@Override
	public br.com.seatecnologia.gdf.negocia.model.Proposta updateProposta(
		br.com.seatecnologia.gdf.negocia.model.Proposta proposta) {

		return _propostaService.updateProposta(proposta);
	}

	@Override
	public PropostaService getWrappedService() {
		return _propostaService;
	}

	@Override
	public void setWrappedService(PropostaService propostaService) {
		_propostaService = propostaService;
	}

	private PropostaService _propostaService;

}
/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service;

import br.com.seatecnologia.gdf.negocia.model.Proposta;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.module.service.Snapshot;

import java.util.List;

/**
 * Provides the remote service utility for Proposta. This utility wraps
 * <code>br.com.seatecnologia.gdf.negocia.service.impl.PropostaServiceImpl</code> and is an
 * access point for service operations in application layer code running on a
 * remote server. Methods of this service are expected to have security checks
 * based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see PropostaService
 * @generated
 */
public class PropostaServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>br.com.seatecnologia.gdf.negocia.service.impl.PropostaServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static Proposta addProposta(
			com.liferay.portal.kernel.service.ServiceContext serviceContext,
			long editalId, String tipoProposta, String numeroProtocoloSei,
			long propostaPaiId, long procuracao, String cpfCnpj)
		throws br.com.seatecnologia.gdf.negocia.exception.
			BusinessLogicValidationException,
			   PortalException {

		return getService().addProposta(
			serviceContext, editalId, tipoProposta, numeroProtocoloSei,
			propostaPaiId, procuracao, cpfCnpj);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static Proposta getProposta(long propostaId) throws PortalException {
		return getService().getProposta(propostaId);
	}

	public static List<Proposta> getPropostas(int start, int end) {
		return getService().getPropostas(start, end);
	}

	public static Proposta getPropostaZip(long propostaId)
		throws PortalException {

		return getService().getPropostaZip(propostaId);
	}

	public static Proposta updateProposta(
			long propostaId,
			com.liferay.portal.kernel.service.ServiceContext serviceContext,
			long dadosContribuinteId, long administradorJudicialId,
			long advogadoId, String fundamentacaoPedido,
			boolean cumpreCompromissos, boolean naoAlienacaoBensSemComunicacao,
			boolean reconheceGrupoOuSucessao, String status,
			String numeroProtocoloSei, String documentosCompletosURL,
			long propostaPaiId)
		throws PortalException {

		return getService().updateProposta(
			propostaId, serviceContext, dadosContribuinteId,
			administradorJudicialId, advogadoId, fundamentacaoPedido,
			cumpreCompromissos, naoAlienacaoBensSemComunicacao,
			reconheceGrupoOuSucessao, status, numeroProtocoloSei,
			documentosCompletosURL, propostaPaiId);
	}

	public static Proposta updateProposta(Proposta proposta) {
		return getService().updateProposta(proposta);
	}

	public static PropostaService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<PropostaService> _serviceSnapshot =
		new Snapshot<>(PropostaServiceUtil.class, PropostaService.class);

}
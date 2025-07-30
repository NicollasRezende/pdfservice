/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.impl;

import br.com.seatecnologia.gdf.negocia.constants.NegociaPropostaActionKeys;
import br.com.seatecnologia.gdf.negocia.exception.BusinessLogicValidationException;
import br.com.seatecnologia.gdf.negocia.model.Proposta;
import br.com.seatecnologia.gdf.negocia.service.base.PropostaServiceBaseImpl;

import br.com.seatecnologia.gdf.negocia.service.permission.PropostaModelResourcePermission;
import com.liferay.portal.aop.AopService;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.security.permission.ActionKeys;
import com.liferay.portal.kernel.service.ServiceContext;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import java.util.List;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = {
		"json.web.service.context.name=gdf",
		"json.web.service.context.path=Proposta"
	},
	service = AopService.class
)
public class PropostaServiceImpl extends PropostaServiceBaseImpl {

	@Override
	@Indexable(type = IndexableType.REINDEX)
	public Proposta addProposta(ServiceContext serviceContext, long editalId, String tipoProposta,
								String numeroProtocoloSei, long propostaPaiId, long procuracao, String cpfCnpj) throws PortalException, BusinessLogicValidationException {
		return propostaLocalService.addProposta(serviceContext, editalId, tipoProposta,
				numeroProtocoloSei, propostaPaiId, procuracao, cpfCnpj);
	}

	@Override
	public Proposta updateProposta(long propostaId, ServiceContext serviceContext,
								   long dadosContribuinteId, long administradorJudicialId,
								   long advogadoId, String fundamentacaoPedido,
								   boolean cumpreCompromissos,
								   boolean naoAlienacaoBensSemComunicacao,
								   boolean reconheceGrupoOuSucessao,
								   String status, String numeroProtocoloSei, String documentosCompletosURL,
								   long propostaPaiId) throws PortalException {
		return propostaLocalService.updateProposta(propostaId, serviceContext,
			dadosContribuinteId, administradorJudicialId, advogadoId,
			fundamentacaoPedido, cumpreCompromissos,
			naoAlienacaoBensSemComunicacao, reconheceGrupoOuSucessao, status,
			numeroProtocoloSei, documentosCompletosURL, propostaPaiId);
	}


	@Override
	public Proposta getProposta(long propostaId) throws PortalException {
		_propostaResourcePermission.check(getPermissionChecker(), propostaId, ActionKeys.VIEW);

		return propostaLocalService.getProposta(propostaId);
	}

	@Override
	public Proposta getPropostaZip(long propostaId) throws PortalException {
		_propostaResourcePermission.check(getPermissionChecker(), propostaId, NegociaPropostaActionKeys.REVIEW);

		return propostaLocalService.getProposta(propostaId);
	}

	@Reference
	private PropostaModelResourcePermission _propostaResourcePermission;

	@Override
	public Proposta updateProposta(Proposta proposta) {
		return propostaLocalService.updateProposta(proposta);
	}

	@Override
	public List<Proposta> getPropostas(int start, int end) {
		return propostaLocalService.getPropostas(start, end);
	}
}
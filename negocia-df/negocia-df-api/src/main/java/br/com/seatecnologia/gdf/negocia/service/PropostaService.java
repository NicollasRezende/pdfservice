/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service;

import br.com.seatecnologia.gdf.negocia.exception.BusinessLogicValidationException;
import br.com.seatecnologia.gdf.negocia.model.Proposta;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.jsonwebservice.JSONWebService;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.security.access.control.AccessControlled;
import com.liferay.portal.kernel.service.BaseService;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;

import java.util.List;

import org.osgi.annotation.versioning.ProviderType;

/**
 * Provides the remote service interface for Proposta. Methods of this
 * service are expected to have security checks based on the propagated JAAS
 * credentials because this service can be accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see PropostaServiceUtil
 * @generated
 */
@AccessControlled
@JSONWebService
@ProviderType
@Transactional(
	isolation = Isolation.PORTAL,
	rollbackFor = {PortalException.class, SystemException.class}
)
public interface PropostaService extends BaseService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add custom service methods to <code>br.com.seatecnologia.gdf.negocia.service.impl.PropostaServiceImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface. Consume the proposta remote service via injection or a <code>org.osgi.util.tracker.ServiceTracker</code>. Use {@link PropostaServiceUtil} if injection and service tracking are not available.
	 */
	@Indexable(type = IndexableType.REINDEX)
	public Proposta addProposta(
			ServiceContext serviceContext, long editalId, String tipoProposta,
			String numeroProtocoloSei, long propostaPaiId, long procuracao,
			String cpfCnpj)
		throws BusinessLogicValidationException, PortalException;

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public String getOSGiServiceIdentifier();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Proposta getProposta(long propostaId) throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Proposta> getPropostas(int start, int end);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Proposta getPropostaZip(long propostaId) throws PortalException;

	public Proposta updateProposta(
			long propostaId, ServiceContext serviceContext,
			long dadosContribuinteId, long administradorJudicialId,
			long advogadoId, String fundamentacaoPedido,
			boolean cumpreCompromissos, boolean naoAlienacaoBensSemComunicacao,
			boolean reconheceGrupoOuSucessao, String status,
			String numeroProtocoloSei, String documentosCompletosURL,
			long propostaPaiId)
		throws PortalException;

	public Proposta updateProposta(Proposta proposta);

}
/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service;

import br.com.seatecnologia.gdf.negocia.model.DadosContribuinte;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.jsonwebservice.JSONWebService;
import com.liferay.portal.kernel.security.access.control.AccessControlled;
import com.liferay.portal.kernel.service.BaseService;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;

import java.util.List;

import org.osgi.annotation.versioning.ProviderType;

/**
 * Provides the remote service interface for DadosContribuinte. Methods of this
 * service are expected to have security checks based on the propagated JAAS
 * credentials because this service can be accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see DadosContribuinteServiceUtil
 * @generated
 */
@AccessControlled
@JSONWebService
@ProviderType
@Transactional(
	isolation = Isolation.PORTAL,
	rollbackFor = {PortalException.class, SystemException.class}
)
public interface DadosContribuinteService extends BaseService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add custom service methods to <code>br.com.seatecnologia.gdf.negocia.service.impl.DadosContribuinteServiceImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface. Consume the dados contribuinte remote service via injection or a <code>org.osgi.util.tracker.ServiceTracker</code>. Use {@link DadosContribuinteServiceUtil} if injection and service tracking are not available.
	 */
	public DadosContribuinte addDadosContribuinte(
		ServiceContext serviceContext, long qualificacaoId, long propostaId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<DadosContribuinte> getDadosContribuintes(int start, int end);

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public String getOSGiServiceIdentifier();

	public DadosContribuinte updateDadosContribuinte(
			long dadosContribuinteId, ServiceContext serviceContext,
			long qualificacaoId, long socios, long controladores,
			long administradores, long gestores, long empresasGrupo)
		throws PortalException;

}
/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service;

import br.com.seatecnologia.gdf.negocia.model.AdministradorJudicial;

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
 * Provides the remote service interface for AdministradorJudicial. Methods of this
 * service are expected to have security checks based on the propagated JAAS
 * credentials because this service can be accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see AdministradorJudicialServiceUtil
 * @generated
 */
@AccessControlled
@JSONWebService
@ProviderType
@Transactional(
	isolation = Isolation.PORTAL,
	rollbackFor = {PortalException.class, SystemException.class}
)
public interface AdministradorJudicialService extends BaseService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add custom service methods to <code>br.com.seatecnologia.gdf.negocia.service.impl.AdministradorJudicialServiceImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface. Consume the administrador judicial remote service via injection or a <code>org.osgi.util.tracker.ServiceTracker</code>. Use {@link AdministradorJudicialServiceUtil} if injection and service tracking are not available.
	 */
	public AdministradorJudicial addAdministradorJudicial(
		ServiceContext serviceContext, long qualificacaoId,
		boolean regimeFalencia, String recuperacao, String numeroProcesso,
		long anexoRecuperacao);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<AdministradorJudicial> getAdministradorJudicials(
		int start, int end);

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public String getOSGiServiceIdentifier();

	public AdministradorJudicial updateAdministradorJudicial(
			long administradorJudicialId, ServiceContext serviceContext,
			long qualificacaoId, String tipoRegime, String numeroProcesso,
			String anexoAjuste)
		throws PortalException;

}
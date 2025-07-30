/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service;

import br.com.seatecnologia.gdf.negocia.model.ComprovanteHonorario;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.jsonwebservice.JSONWebService;
import com.liferay.portal.kernel.security.access.control.AccessControlled;
import com.liferay.portal.kernel.service.BaseService;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;

import java.util.Date;
import java.util.List;

import org.osgi.annotation.versioning.ProviderType;

/**
 * Provides the remote service interface for ComprovanteHonorario. Methods of this
 * service are expected to have security checks based on the propagated JAAS
 * credentials because this service can be accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see ComprovanteHonorarioServiceUtil
 * @generated
 */
@AccessControlled
@JSONWebService
@ProviderType
@Transactional(
	isolation = Isolation.PORTAL,
	rollbackFor = {PortalException.class, SystemException.class}
)
public interface ComprovanteHonorarioService extends BaseService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add custom service methods to <code>br.com.seatecnologia.gdf.negocia.service.impl.ComprovanteHonorarioServiceImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface. Consume the comprovante honorario remote service via injection or a <code>org.osgi.util.tracker.ServiceTracker</code>. Use {@link ComprovanteHonorarioServiceUtil} if injection and service tracking are not available.
	 */
	public ComprovanteHonorario addComprovanteHonorario(
		long comprovanteId, long propostaId, double valorPago,
		Date dataPagamento, long fileEntryId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<ComprovanteHonorario> getComprovanteHonorarios(
		int start, int end);

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public String getOSGiServiceIdentifier();

	public ComprovanteHonorario updateComprovanteHonorario(
			long comprovanteId, long propostaId, double valorPago,
			Date dataPagamento, long fileEntryId)
		throws PortalException;

}
/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service;

import br.com.seatecnologia.gdf.negocia.model.AdministradorJudicial;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.module.service.Snapshot;

import java.util.List;

/**
 * Provides the remote service utility for AdministradorJudicial. This utility wraps
 * <code>br.com.seatecnologia.gdf.negocia.service.impl.AdministradorJudicialServiceImpl</code> and is an
 * access point for service operations in application layer code running on a
 * remote server. Methods of this service are expected to have security checks
 * based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see AdministradorJudicialService
 * @generated
 */
public class AdministradorJudicialServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>br.com.seatecnologia.gdf.negocia.service.impl.AdministradorJudicialServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static AdministradorJudicial addAdministradorJudicial(
		com.liferay.portal.kernel.service.ServiceContext serviceContext,
		long qualificacaoId, boolean regimeFalencia, String recuperacao,
		String numeroProcesso, long anexoRecuperacao) {

		return getService().addAdministradorJudicial(
			serviceContext, qualificacaoId, regimeFalencia, recuperacao,
			numeroProcesso, anexoRecuperacao);
	}

	public static List<AdministradorJudicial> getAdministradorJudicials(
		int start, int end) {

		return getService().getAdministradorJudicials(start, end);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static AdministradorJudicial updateAdministradorJudicial(
			long administradorJudicialId,
			com.liferay.portal.kernel.service.ServiceContext serviceContext,
			long qualificacaoId, String tipoRegime, String numeroProcesso,
			String anexoAjuste)
		throws PortalException {

		return getService().updateAdministradorJudicial(
			administradorJudicialId, serviceContext, qualificacaoId, tipoRegime,
			numeroProcesso, anexoAjuste);
	}

	public static AdministradorJudicialService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<AdministradorJudicialService>
		_serviceSnapshot = new Snapshot<>(
			AdministradorJudicialServiceUtil.class,
			AdministradorJudicialService.class);

}
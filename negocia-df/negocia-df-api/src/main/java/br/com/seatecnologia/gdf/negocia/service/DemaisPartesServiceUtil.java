/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service;

import br.com.seatecnologia.gdf.negocia.model.DemaisPartes;

import com.liferay.portal.kernel.module.service.Snapshot;

/**
 * Provides the remote service utility for DemaisPartes. This utility wraps
 * <code>br.com.seatecnologia.gdf.negocia.service.impl.DemaisPartesServiceImpl</code> and is an
 * access point for service operations in application layer code running on a
 * remote server. Methods of this service are expected to have security checks
 * based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see DemaisPartesService
 * @generated
 */
public class DemaisPartesServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>br.com.seatecnologia.gdf.negocia.service.impl.DemaisPartesServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static DemaisPartes addDemaisPartes(
		long qualificacaoId, long propostaId, String tipoParte) {

		return getService().addDemaisPartes(
			qualificacaoId, propostaId, tipoParte);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static DemaisPartesService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<DemaisPartesService> _serviceSnapshot =
		new Snapshot<>(
			DemaisPartesServiceUtil.class, DemaisPartesService.class);

}
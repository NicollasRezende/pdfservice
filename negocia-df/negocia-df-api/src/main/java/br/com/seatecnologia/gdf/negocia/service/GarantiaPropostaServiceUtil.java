/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service;

import br.com.seatecnologia.gdf.negocia.model.GarantiaProposta;

import com.liferay.portal.kernel.module.service.Snapshot;

/**
 * Provides the remote service utility for GarantiaProposta. This utility wraps
 * <code>br.com.seatecnologia.gdf.negocia.service.impl.GarantiaPropostaServiceImpl</code> and is an
 * access point for service operations in application layer code running on a
 * remote server. Methods of this service are expected to have security checks
 * based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see GarantiaPropostaService
 * @generated
 */
public class GarantiaPropostaServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>br.com.seatecnologia.gdf.negocia.service.impl.GarantiaPropostaServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static GarantiaProposta addGarantiaProposta(
		long garantiaId, long propostaId) {

		return getService().addGarantiaProposta(garantiaId, propostaId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static GarantiaPropostaService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<GarantiaPropostaService> _serviceSnapshot =
		new Snapshot<>(
			GarantiaPropostaServiceUtil.class, GarantiaPropostaService.class);

}
/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service;

import br.com.seatecnologia.gdf.negocia.model.Encargo;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.module.service.Snapshot;

import java.util.List;

/**
 * Provides the remote service utility for Encargo. This utility wraps
 * <code>br.com.seatecnologia.gdf.negocia.service.impl.EncargoServiceImpl</code> and is an
 * access point for service operations in application layer code running on a
 * remote server. Methods of this service are expected to have security checks
 * based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see EncargoService
 * @generated
 */
public class EncargoServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>br.com.seatecnologia.gdf.negocia.service.impl.EncargoServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static Encargo addEncargo(
		long encargoId, long propostaId, double valorEncargos,
		String descricaoEncargos) {

		return getService().addEncargo(
			encargoId, propostaId, valorEncargos, descricaoEncargos);
	}

	public static List<Encargo> getEncargos(int start, int end) {
		return getService().getEncargos(start, end);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static Encargo updateEncargo(
			long encargoId, long propostaId, double valorEncargos,
			String descricaoEncargos)
		throws PortalException {

		return getService().updateEncargo(
			encargoId, propostaId, valorEncargos, descricaoEncargos);
	}

	public static EncargoService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<EncargoService> _serviceSnapshot =
		new Snapshot<>(EncargoServiceUtil.class, EncargoService.class);

}
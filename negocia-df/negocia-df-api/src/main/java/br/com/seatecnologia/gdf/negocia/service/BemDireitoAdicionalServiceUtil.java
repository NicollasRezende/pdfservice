/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service;

import br.com.seatecnologia.gdf.negocia.model.BemDireitoAdicional;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.module.service.Snapshot;

import java.util.List;

/**
 * Provides the remote service utility for BemDireitoAdicional. This utility wraps
 * <code>br.com.seatecnologia.gdf.negocia.service.impl.BemDireitoAdicionalServiceImpl</code> and is an
 * access point for service operations in application layer code running on a
 * remote server. Methods of this service are expected to have security checks
 * based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see BemDireitoAdicionalService
 * @generated
 */
public class BemDireitoAdicionalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>br.com.seatecnologia.gdf.negocia.service.impl.BemDireitoAdicionalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static BemDireitoAdicional addBemDireitoAdicional(
		long bemId, long propostaId, String descricao, String localizacao,
		String destinacao, String laudoAvaliacao) {

		return getService().addBemDireitoAdicional(
			bemId, propostaId, descricao, localizacao, destinacao,
			laudoAvaliacao);
	}

	public static List<BemDireitoAdicional> getBemDireitoAdicionals(
		int start, int end) {

		return getService().getBemDireitoAdicionals(start, end);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static BemDireitoAdicional updateBemDireitoAdicional(
			long bemId, long propostaId, String descricao, String localizacao,
			String destinacao, String laudoAvaliacao)
		throws PortalException {

		return getService().updateBemDireitoAdicional(
			bemId, propostaId, descricao, localizacao, destinacao,
			laudoAvaliacao);
	}

	public static BemDireitoAdicionalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<BemDireitoAdicionalService> _serviceSnapshot =
		new Snapshot<>(
			BemDireitoAdicionalServiceUtil.class,
			BemDireitoAdicionalService.class);

}
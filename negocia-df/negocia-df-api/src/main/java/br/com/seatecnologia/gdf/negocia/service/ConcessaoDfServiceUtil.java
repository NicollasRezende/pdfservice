/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service;

import br.com.seatecnologia.gdf.negocia.model.ConcessaoDf;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.module.service.Snapshot;

import java.util.List;

/**
 * Provides the remote service utility for ConcessaoDf. This utility wraps
 * <code>br.com.seatecnologia.gdf.negocia.service.impl.ConcessaoDfServiceImpl</code> and is an
 * access point for service operations in application layer code running on a
 * remote server. Methods of this service are expected to have security checks
 * based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see ConcessaoDfService
 * @generated
 */
public class ConcessaoDfServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>br.com.seatecnologia.gdf.negocia.service.impl.ConcessaoDfServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static ConcessaoDf addConcessaoDf(
		long concessaoId, long propostaId, double percentualDescontoJuros,
		double percentualDescontoPrincipal, String observacoes) {

		return getService().addConcessaoDf(
			concessaoId, propostaId, percentualDescontoJuros,
			percentualDescontoPrincipal, observacoes);
	}

	public static List<ConcessaoDf> getConcessaoDfs(int start, int end) {
		return getService().getConcessaoDfs(start, end);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static ConcessaoDf updateConcessaoDf(
			long concessaoId, long propostaId, double percentualDescontoJuros,
			double percentualDescontoPrincipal, String observacoes)
		throws PortalException {

		return getService().updateConcessaoDf(
			concessaoId, propostaId, percentualDescontoJuros,
			percentualDescontoPrincipal, observacoes);
	}

	public static ConcessaoDfService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<ConcessaoDfService> _serviceSnapshot =
		new Snapshot<>(ConcessaoDfServiceUtil.class, ConcessaoDfService.class);

}
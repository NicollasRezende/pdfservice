/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service;

import br.com.seatecnologia.gdf.negocia.model.RelacaoCredor;

import com.liferay.portal.kernel.module.service.Snapshot;

import java.util.List;

/**
 * Provides the remote service utility for RelacaoCredor. This utility wraps
 * <code>br.com.seatecnologia.gdf.negocia.service.impl.RelacaoCredorServiceImpl</code> and is an
 * access point for service operations in application layer code running on a
 * remote server. Methods of this service are expected to have security checks
 * based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see RelacaoCredorService
 * @generated
 */
public class RelacaoCredorServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>br.com.seatecnologia.gdf.negocia.service.impl.RelacaoCredorServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static RelacaoCredor addRelacaoCredor(
		com.liferay.portal.kernel.service.ServiceContext serviceContext,
		long propostaId, String nomeCredor, String naturezaCredito,
		String classificacaoCredito, double valorAtualizado,
		String referenciaContabil) {

		return getService().addRelacaoCredor(
			serviceContext, propostaId, nomeCredor, naturezaCredito,
			classificacaoCredito, valorAtualizado, referenciaContabil);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static List<RelacaoCredor> getRelacaoCredor(int start, int end) {
		return getService().getRelacaoCredor(start, end);
	}

	public static RelacaoCredor updateRelacaoCredor(
		long credorId, long propostaId, String nomeCredor,
		String naturezaCredito, String classificacaoCredito,
		double valorAtualizado, String referenciaRegistro) {

		return getService().updateRelacaoCredor(
			credorId, propostaId, nomeCredor, naturezaCredito,
			classificacaoCredito, valorAtualizado, referenciaRegistro);
	}

	public static RelacaoCredorService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<RelacaoCredorService> _serviceSnapshot =
		new Snapshot<>(
			RelacaoCredorServiceUtil.class, RelacaoCredorService.class);

}
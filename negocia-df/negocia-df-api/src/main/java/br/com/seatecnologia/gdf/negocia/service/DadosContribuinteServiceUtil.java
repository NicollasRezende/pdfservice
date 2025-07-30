/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service;

import br.com.seatecnologia.gdf.negocia.model.DadosContribuinte;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.module.service.Snapshot;

import java.util.List;

/**
 * Provides the remote service utility for DadosContribuinte. This utility wraps
 * <code>br.com.seatecnologia.gdf.negocia.service.impl.DadosContribuinteServiceImpl</code> and is an
 * access point for service operations in application layer code running on a
 * remote server. Methods of this service are expected to have security checks
 * based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see DadosContribuinteService
 * @generated
 */
public class DadosContribuinteServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>br.com.seatecnologia.gdf.negocia.service.impl.DadosContribuinteServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static DadosContribuinte addDadosContribuinte(
		com.liferay.portal.kernel.service.ServiceContext serviceContext,
		long qualificacaoId, long propostaId) {

		return getService().addDadosContribuinte(
			serviceContext, qualificacaoId, propostaId);
	}

	public static List<DadosContribuinte> getDadosContribuintes(
		int start, int end) {

		return getService().getDadosContribuintes(start, end);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static DadosContribuinte updateDadosContribuinte(
			long dadosContribuinteId,
			com.liferay.portal.kernel.service.ServiceContext serviceContext,
			long qualificacaoId, long socios, long controladores,
			long administradores, long gestores, long empresasGrupo)
		throws PortalException {

		return getService().updateDadosContribuinte(
			dadosContribuinteId, serviceContext, qualificacaoId, socios,
			controladores, administradores, gestores, empresasGrupo);
	}

	public static DadosContribuinteService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<DadosContribuinteService> _serviceSnapshot =
		new Snapshot<>(
			DadosContribuinteServiceUtil.class, DadosContribuinteService.class);

}
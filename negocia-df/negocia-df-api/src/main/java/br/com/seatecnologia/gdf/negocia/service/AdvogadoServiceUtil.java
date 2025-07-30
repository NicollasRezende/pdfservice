/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service;

import br.com.seatecnologia.gdf.negocia.model.Advogado;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.module.service.Snapshot;

import java.util.List;

/**
 * Provides the remote service utility for Advogado. This utility wraps
 * <code>br.com.seatecnologia.gdf.negocia.service.impl.AdvogadoServiceImpl</code> and is an
 * access point for service operations in application layer code running on a
 * remote server. Methods of this service are expected to have security checks
 * based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see AdvogadoService
 * @generated
 */
public class AdvogadoServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>br.com.seatecnologia.gdf.negocia.service.impl.AdvogadoServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static Advogado addAdvogado(
		com.liferay.portal.kernel.service.ServiceContext serviceContext,
		long qualificacaoId, String numeroOab, String seccional,
		long carteirinhaOAB) {

		return getService().addAdvogado(
			serviceContext, qualificacaoId, numeroOab, seccional,
			carteirinhaOAB);
	}

	public static List<Advogado> getAdvogados(int start, int end) {
		return getService().getAdvogados(start, end);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static Advogado updateAdvogado(
			long advogadoId,
			com.liferay.portal.kernel.service.ServiceContext serviceContext,
			long qualificacaoId, String numeroOab, String ufOab)
		throws PortalException {

		return getService().updateAdvogado(
			advogadoId, serviceContext, qualificacaoId, numeroOab, ufOab);
	}

	public static AdvogadoService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<AdvogadoService> _serviceSnapshot =
		new Snapshot<>(AdvogadoServiceUtil.class, AdvogadoService.class);

}
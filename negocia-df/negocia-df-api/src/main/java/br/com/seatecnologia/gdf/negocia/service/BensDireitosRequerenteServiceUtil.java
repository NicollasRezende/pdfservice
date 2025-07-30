/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service;

import br.com.seatecnologia.gdf.negocia.model.BensDireitosRequerente;

import com.liferay.portal.kernel.module.service.Snapshot;

/**
 * Provides the remote service utility for BensDireitosRequerente. This utility wraps
 * <code>br.com.seatecnologia.gdf.negocia.service.impl.BensDireitosRequerenteServiceImpl</code> and is an
 * access point for service operations in application layer code running on a
 * remote server. Methods of this service are expected to have security checks
 * based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see BensDireitosRequerenteService
 * @generated
 */
public class BensDireitosRequerenteServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>br.com.seatecnologia.gdf.negocia.service.impl.BensDireitosRequerenteServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static BensDireitosRequerente addBensDireitosRequerente(
		com.liferay.portal.kernel.service.ServiceContext serviceContext,
		long propostaId, String descricao, String localizacaoDestinacao) {

		return getService().addBensDireitosRequerente(
			serviceContext, propostaId, descricao, localizacaoDestinacao);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static BensDireitosRequerenteService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<BensDireitosRequerenteService>
		_serviceSnapshot = new Snapshot<>(
			BensDireitosRequerenteServiceUtil.class,
			BensDireitosRequerenteService.class);

}
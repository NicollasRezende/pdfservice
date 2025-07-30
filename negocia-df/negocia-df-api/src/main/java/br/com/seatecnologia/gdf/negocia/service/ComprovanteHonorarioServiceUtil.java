/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service;

import br.com.seatecnologia.gdf.negocia.model.ComprovanteHonorario;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.module.service.Snapshot;

import java.util.List;

/**
 * Provides the remote service utility for ComprovanteHonorario. This utility wraps
 * <code>br.com.seatecnologia.gdf.negocia.service.impl.ComprovanteHonorarioServiceImpl</code> and is an
 * access point for service operations in application layer code running on a
 * remote server. Methods of this service are expected to have security checks
 * based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see ComprovanteHonorarioService
 * @generated
 */
public class ComprovanteHonorarioServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>br.com.seatecnologia.gdf.negocia.service.impl.ComprovanteHonorarioServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static ComprovanteHonorario addComprovanteHonorario(
		long comprovanteId, long propostaId, double valorPago,
		java.util.Date dataPagamento, long fileEntryId) {

		return getService().addComprovanteHonorario(
			comprovanteId, propostaId, valorPago, dataPagamento, fileEntryId);
	}

	public static List<ComprovanteHonorario> getComprovanteHonorarios(
		int start, int end) {

		return getService().getComprovanteHonorarios(start, end);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static ComprovanteHonorario updateComprovanteHonorario(
			long comprovanteId, long propostaId, double valorPago,
			java.util.Date dataPagamento, long fileEntryId)
		throws PortalException {

		return getService().updateComprovanteHonorario(
			comprovanteId, propostaId, valorPago, dataPagamento, fileEntryId);
	}

	public static ComprovanteHonorarioService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<ComprovanteHonorarioService>
		_serviceSnapshot = new Snapshot<>(
			ComprovanteHonorarioServiceUtil.class,
			ComprovanteHonorarioService.class);

}
/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service;

import br.com.seatecnologia.gdf.negocia.model.Parcelamento;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.module.service.Snapshot;

import java.util.List;

/**
 * Provides the remote service utility for Parcelamento. This utility wraps
 * <code>br.com.seatecnologia.gdf.negocia.service.impl.ParcelamentoServiceImpl</code> and is an
 * access point for service operations in application layer code running on a
 * remote server. Methods of this service are expected to have security checks
 * based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see ParcelamentoService
 * @generated
 */
public class ParcelamentoServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>br.com.seatecnologia.gdf.negocia.service.impl.ParcelamentoServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static Parcelamento addParcelamento(
		long parcelamentoId, long idProposta, int numeroParcelas,
		double valorEntrada, java.util.Date dataPrimeiraParcela,
		double valorPrimeiraParcela) {

		return getService().addParcelamento(
			parcelamentoId, idProposta, numeroParcelas, valorEntrada,
			dataPrimeiraParcela, valorPrimeiraParcela);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static List<Parcelamento> getParcelamentos(int start, int end) {
		return getService().getParcelamentos(start, end);
	}

	public static Parcelamento updateParcelamento(
			long parcelamentoId, long idProposta, int numeroParcelas,
			double valorEntrada, java.util.Date dataPrimeiraParcela,
			double valorPrimeiraParcela)
		throws PortalException {

		return getService().updateParcelamento(
			parcelamentoId, idProposta, numeroParcelas, valorEntrada,
			dataPrimeiraParcela, valorPrimeiraParcela);
	}

	public static ParcelamentoService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<ParcelamentoService> _serviceSnapshot =
		new Snapshot<>(
			ParcelamentoServiceUtil.class, ParcelamentoService.class);

}
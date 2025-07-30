/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service;

import br.com.seatecnologia.gdf.negocia.model.CreditoTransacionado;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.module.service.Snapshot;

import java.util.List;

/**
 * Provides the remote service utility for CreditoTransacionado. This utility wraps
 * <code>br.com.seatecnologia.gdf.negocia.service.impl.CreditoTransacionadoServiceImpl</code> and is an
 * access point for service operations in application layer code running on a
 * remote server. Methods of this service are expected to have security checks
 * based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see CreditoTransacionadoService
 * @generated
 */
public class CreditoTransacionadoServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>br.com.seatecnologia.gdf.negocia.service.impl.CreditoTransacionadoServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static CreditoTransacionado addCreditoTransacionado(
		long creditoId, long propostaId, String numeroInscricao,
		String codigoReceita, java.util.Date dataInscricao,
		double valorAtualizado) {

		return getService().addCreditoTransacionado(
			creditoId, propostaId, numeroInscricao, codigoReceita,
			dataInscricao, valorAtualizado);
	}

	public static List<CreditoTransacionado> getCreditoTransacionados(
		int start, int end) {

		return getService().getCreditoTransacionados(start, end);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static CreditoTransacionado updateCreditoTransacionado(
			long creditoId, long propostaId, String numeroInscricao,
			String codigoReceita, java.util.Date dataInscricao,
			double valorAtualizado)
		throws PortalException {

		return getService().updateCreditoTransacionado(
			creditoId, propostaId, numeroInscricao, codigoReceita,
			dataInscricao, valorAtualizado);
	}

	public static CreditoTransacionadoService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<CreditoTransacionadoService>
		_serviceSnapshot = new Snapshot<>(
			CreditoTransacionadoServiceUtil.class,
			CreditoTransacionadoService.class);

}
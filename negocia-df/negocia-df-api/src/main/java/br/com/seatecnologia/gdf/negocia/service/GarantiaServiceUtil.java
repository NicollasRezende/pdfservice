/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service;

import br.com.seatecnologia.gdf.negocia.model.Garantia;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.module.service.Snapshot;

import java.util.List;

/**
 * Provides the remote service utility for Garantia. This utility wraps
 * <code>br.com.seatecnologia.gdf.negocia.service.impl.GarantiaServiceImpl</code> and is an
 * access point for service operations in application layer code running on a
 * remote server. Methods of this service are expected to have security checks
 * based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see GarantiaService
 * @generated
 */
public class GarantiaServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>br.com.seatecnologia.gdf.negocia.service.impl.GarantiaServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static Garantia addGarantia(
		com.liferay.portal.kernel.service.ServiceContext serviceContext,
		String tipoGarantia, String tipoDevedor, String outras,
		long proprietarioQualificacaoId, double valorEstimado,
		long dadosRegistroId, String localizacao, boolean declaracaoAnuencia,
		long declaracao, String descricaoBem, long propostaId) {

		return getService().addGarantia(
			serviceContext, tipoGarantia, tipoDevedor, outras,
			proprietarioQualificacaoId, valorEstimado, dadosRegistroId,
			localizacao, declaracaoAnuencia, declaracao, descricaoBem,
			propostaId);
	}

	public static List<Garantia> getGarantias(int start, int end) {
		return getService().getGarantias(start, end);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static Garantia updateGarantia(
			long garantiaId, long propostaId, String tipoGarantia,
			String descricaoBem, String proprietario, double valorEstimado,
			String dadosRegistro, String localizacao, boolean anuenciaTerceiro,
			long documentoAnuencia)
		throws PortalException {

		return getService().updateGarantia(
			garantiaId, propostaId, tipoGarantia, descricaoBem, proprietario,
			valorEstimado, dadosRegistro, localizacao, anuenciaTerceiro,
			documentoAnuencia);
	}

	public static GarantiaService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<GarantiaService> _serviceSnapshot =
		new Snapshot<>(GarantiaServiceUtil.class, GarantiaService.class);

}
/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service;

import br.com.seatecnologia.gdf.negocia.model.AcaoJudicial;

import com.liferay.portal.kernel.module.service.Snapshot;

import java.util.List;

/**
 * Provides the remote service utility for AcaoJudicial. This utility wraps
 * <code>br.com.seatecnologia.gdf.negocia.service.impl.AcaoJudicialServiceImpl</code> and is an
 * access point for service operations in application layer code running on a
 * remote server. Methods of this service are expected to have security checks
 * based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see AcaoJudicialService
 * @generated
 */
public class AcaoJudicialServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>br.com.seatecnologia.gdf.negocia.service.impl.AcaoJudicialServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static AcaoJudicial addAcaoJudicial(
		com.liferay.portal.kernel.service.ServiceContext serviceContext,
		String orgaoTribunal, String numeroProcesso, String unidadeVara,
		String parteAutora, String parteRe, String observacoes,
		long propostaId) {

		return getService().addAcaoJudicial(
			serviceContext, orgaoTribunal, numeroProcesso, unidadeVara,
			parteAutora, parteRe, observacoes, propostaId);
	}

	public static List<AcaoJudicial> findByPropostaId(long propostaId) {
		return getService().findByPropostaId(propostaId);
	}

	public static List<AcaoJudicial> getAcaoJudicials(int start, int end) {
		return getService().getAcaoJudicials(start, end);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static AcaoJudicial updateAcaoJudicial(
		long acaoId, long propostaId, String numeroProcesso, String varaLocal) {

		return getService().updateAcaoJudicial(
			acaoId, propostaId, numeroProcesso, varaLocal);
	}

	public static AcaoJudicialService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<AcaoJudicialService> _serviceSnapshot =
		new Snapshot<>(
			AcaoJudicialServiceUtil.class, AcaoJudicialService.class);

}
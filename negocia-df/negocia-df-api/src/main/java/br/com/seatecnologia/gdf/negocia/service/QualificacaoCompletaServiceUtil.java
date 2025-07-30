/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service;

import br.com.seatecnologia.gdf.negocia.model.QualificacaoCompleta;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.module.service.Snapshot;

import java.util.List;

/**
 * Provides the remote service utility for QualificacaoCompleta. This utility wraps
 * <code>br.com.seatecnologia.gdf.negocia.service.impl.QualificacaoCompletaServiceImpl</code> and is an
 * access point for service operations in application layer code running on a
 * remote server. Methods of this service are expected to have security checks
 * based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see QualificacaoCompletaService
 * @generated
 */
public class QualificacaoCompletaServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>br.com.seatecnologia.gdf.negocia.service.impl.QualificacaoCompletaServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static QualificacaoCompleta addQualificacaoCompleta(
		com.liferay.portal.kernel.service.ServiceContext serviceContext,
		String tipoPessoa, String nomeRazaoSocial, String nomeFantasia,
		String representanteLegal, String cpfCnpj, String numeroCfdf,
		String email, String telefone, String whatsapp, long enderecoPostalId,
		String domicilioFiscal) {

		return getService().addQualificacaoCompleta(
			serviceContext, tipoPessoa, nomeRazaoSocial, nomeFantasia,
			representanteLegal, cpfCnpj, numeroCfdf, email, telefone, whatsapp,
			enderecoPostalId, domicilioFiscal);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static List<QualificacaoCompleta> getQualificacaoCompletas(
		int start, int end) {

		return getService().getQualificacaoCompletas(start, end);
	}

	public static QualificacaoCompleta updateQualificacaoCompleta(
			long qualificacaoId,
			com.liferay.portal.kernel.service.ServiceContext serviceContext,
			String tipoPessoa, String nomeRazaoSocial, String nomeFantasia,
			String representanteLegal, String cpfCnpj, String numeroCfdf,
			String email, String telefone, String whatsapp,
			long enderecoPostalId, String domicilioFiscal)
		throws PortalException {

		return getService().updateQualificacaoCompleta(
			qualificacaoId, serviceContext, tipoPessoa, nomeRazaoSocial,
			nomeFantasia, representanteLegal, cpfCnpj, numeroCfdf, email,
			telefone, whatsapp, enderecoPostalId, domicilioFiscal);
	}

	public static QualificacaoCompletaService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<QualificacaoCompletaService>
		_serviceSnapshot = new Snapshot<>(
			QualificacaoCompletaServiceUtil.class,
			QualificacaoCompletaService.class);

}
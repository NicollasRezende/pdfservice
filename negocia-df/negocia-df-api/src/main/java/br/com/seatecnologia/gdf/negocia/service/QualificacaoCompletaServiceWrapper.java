/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link QualificacaoCompletaService}.
 *
 * @author Brian Wing Shun Chan
 * @see QualificacaoCompletaService
 * @generated
 */
public class QualificacaoCompletaServiceWrapper
	implements QualificacaoCompletaService,
			   ServiceWrapper<QualificacaoCompletaService> {

	public QualificacaoCompletaServiceWrapper() {
		this(null);
	}

	public QualificacaoCompletaServiceWrapper(
		QualificacaoCompletaService qualificacaoCompletaService) {

		_qualificacaoCompletaService = qualificacaoCompletaService;
	}

	@Override
	public br.com.seatecnologia.gdf.negocia.model.QualificacaoCompleta
		addQualificacaoCompleta(
			com.liferay.portal.kernel.service.ServiceContext serviceContext,
			String tipoPessoa, String nomeRazaoSocial, String nomeFantasia,
			String representanteLegal, String cpfCnpj, String numeroCfdf,
			String email, String telefone, String whatsapp,
			long enderecoPostalId, String domicilioFiscal) {

		return _qualificacaoCompletaService.addQualificacaoCompleta(
			serviceContext, tipoPessoa, nomeRazaoSocial, nomeFantasia,
			representanteLegal, cpfCnpj, numeroCfdf, email, telefone, whatsapp,
			enderecoPostalId, domicilioFiscal);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _qualificacaoCompletaService.getOSGiServiceIdentifier();
	}

	@Override
	public java.util.List
		<br.com.seatecnologia.gdf.negocia.model.QualificacaoCompleta>
			getQualificacaoCompletas(int start, int end) {

		return _qualificacaoCompletaService.getQualificacaoCompletas(
			start, end);
	}

	@Override
	public br.com.seatecnologia.gdf.negocia.model.QualificacaoCompleta
			updateQualificacaoCompleta(
				long qualificacaoId,
				com.liferay.portal.kernel.service.ServiceContext serviceContext,
				String tipoPessoa, String nomeRazaoSocial, String nomeFantasia,
				String representanteLegal, String cpfCnpj, String numeroCfdf,
				String email, String telefone, String whatsapp,
				long enderecoPostalId, String domicilioFiscal)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _qualificacaoCompletaService.updateQualificacaoCompleta(
			qualificacaoId, serviceContext, tipoPessoa, nomeRazaoSocial,
			nomeFantasia, representanteLegal, cpfCnpj, numeroCfdf, email,
			telefone, whatsapp, enderecoPostalId, domicilioFiscal);
	}

	@Override
	public QualificacaoCompletaService getWrappedService() {
		return _qualificacaoCompletaService;
	}

	@Override
	public void setWrappedService(
		QualificacaoCompletaService qualificacaoCompletaService) {

		_qualificacaoCompletaService = qualificacaoCompletaService;
	}

	private QualificacaoCompletaService _qualificacaoCompletaService;

}
/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.impl;

import br.com.seatecnologia.gdf.negocia.model.QualificacaoCompleta;
import br.com.seatecnologia.gdf.negocia.service.base.QualificacaoCompletaServiceBaseImpl;

import com.liferay.portal.aop.AopService;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.service.ServiceContext;
import org.osgi.service.component.annotations.Component;

import java.util.List;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = {
		"json.web.service.context.name=gdf",
		"json.web.service.context.path=QualificacaoCompleta"
	},
	service = AopService.class
)
public class QualificacaoCompletaServiceImpl
	extends QualificacaoCompletaServiceBaseImpl {

	@Override
	public QualificacaoCompleta addQualificacaoCompleta(ServiceContext serviceContext, String tipoPessoa,
			String nomeRazaoSocial, String nomeFantasia, String representanteLegal, String cpfCnpj, String numeroCfdf, String email,
			String telefone, String whatsapp, long enderecoPostalId, String domicilioFiscal) {

		return qualificacaoCompletaLocalService.addQualificacaoCompleta(serviceContext, tipoPessoa, nomeRazaoSocial,
				nomeFantasia, representanteLegal, cpfCnpj, numeroCfdf, email,
			telefone, whatsapp, enderecoPostalId, domicilioFiscal);
	}

	@Override
	public QualificacaoCompleta updateQualificacaoCompleta(
			long qualificacaoId,
			ServiceContext serviceContext,
			String tipoPessoa,
			String nomeRazaoSocial,
			String nomeFantasia,
			String representanteLegal,
			String cpfCnpj,
			String numeroCfdf,
			String email,
			String telefone,
			String whatsapp,
			long enderecoPostalId,
			String domicilioFiscal) throws PortalException {
		return qualificacaoCompletaLocalService.updateQualificacaoCompleta(
			qualificacaoId, serviceContext, tipoPessoa, nomeRazaoSocial,
			nomeFantasia, representanteLegal, cpfCnpj, numeroCfdf, email,
			telefone, whatsapp, enderecoPostalId);
	}

	@Override
	public List<QualificacaoCompleta> getQualificacaoCompletas(int start, int end) {
		return qualificacaoCompletaLocalService.getQualificacaoCompletas(start, end);
	}

}
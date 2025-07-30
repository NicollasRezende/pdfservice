/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.impl;

import br.com.seatecnologia.gdf.negocia.model.QualificacaoCompleta;
import br.com.seatecnologia.gdf.negocia.service.base.QualificacaoCompletaLocalServiceBaseImpl;

import com.liferay.portal.aop.AopService;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.service.ServiceContext;
import org.osgi.service.component.annotations.Component;

import javax.ws.rs.BadRequestException;
import java.util.Date;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=br.com.seatecnologia.gdf.negocia.model.QualificacaoCompleta",
	service = AopService.class
)
public class QualificacaoCompletaLocalServiceImpl
	extends QualificacaoCompletaLocalServiceBaseImpl {

	@Override
	public QualificacaoCompleta addQualificacaoCompleta(ServiceContext serviceContext, String tipoPessoa,
												String nomeRazaoSocial, String nomeFantasia, String representanteLegal,
												String cpfCnpj, String numeroCfdf, String email, String telefone,
												String whatsapp, long enderecoPostalId, String domicilioFiscal) {

		if (nomeRazaoSocial == null) {
			throw new BadRequestException("Nome ou Razão Social não pode ser nulo");
		}

		if (representanteLegal == null) {
			throw new BadRequestException("Representante Legal não pode ser nulo");
		}

		if (cpfCnpj == null) {
			throw new BadRequestException("CPF/CNPJ não pode ser nulo");
		}

		if (email == null) {
			throw new BadRequestException("Email não pode ser nulo");
		}

		if (telefone == null) {
			throw new BadRequestException("Telefone não pode ser nulo");
		}

		long qualificacaoId = counterLocalService.increment(QualificacaoCompleta.class.getName());

		QualificacaoCompleta qualificacaoCompleta = super.createQualificacaoCompleta(qualificacaoId);

		qualificacaoCompleta.setTipoPessoa(tipoPessoa);
		qualificacaoCompleta.setNomeRazaoSocial(nomeRazaoSocial);
		qualificacaoCompleta.setNomeFantasia(nomeFantasia);
		qualificacaoCompleta.setRepresentanteLegal(representanteLegal);
		qualificacaoCompleta.setCpfCnpj(cpfCnpj);
		qualificacaoCompleta.setNumeroCfdf(numeroCfdf);
		qualificacaoCompleta.setEmail(email);
		qualificacaoCompleta.setTelefone(telefone);
		qualificacaoCompleta.setWhatsapp(whatsapp);
		qualificacaoCompleta.setEnderecoPostalId(enderecoPostalId);
		qualificacaoCompleta.setDomicilioFiscal(domicilioFiscal);
		return qualificacaoCompletaPersistence.update(qualificacaoCompleta);

	}

	@Override
	public QualificacaoCompleta updateQualificacaoCompleta(
												long qualificacaoId,				ServiceContext serviceContext,
												String tipoPessoa,
												String nomeRazaoSocial,
												String nomeFantasia,
												String representanteLegal,
												String cpfCnpj,
												String numeroCddf,
												String email,
												String telefone,
												String whatsapp,
												long enderecoPostalId) throws PortalException {

		QualificacaoCompleta qualificacaoCompleta = getQualificacaoCompleta(qualificacaoId);

		qualificacaoCompleta.setTipoPessoa(tipoPessoa);
		qualificacaoCompleta.setNomeRazaoSocial(nomeRazaoSocial);
		qualificacaoCompleta.setNomeFantasia(nomeFantasia);
		qualificacaoCompleta.setRepresentanteLegal(representanteLegal);
		qualificacaoCompleta.setCpfCnpj(cpfCnpj);
		qualificacaoCompleta.setEmail(email);
		qualificacaoCompleta.setNumeroCfdf(numeroCddf);
		qualificacaoCompleta.setTelefone(telefone);
		qualificacaoCompleta.setWhatsapp(whatsapp);
		qualificacaoCompleta.setEnderecoPostalId(enderecoPostalId);

		return qualificacaoCompletaPersistence.update(qualificacaoCompleta);

	}

}
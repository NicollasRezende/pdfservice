/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.impl;

import br.com.seatecnologia.gdf.negocia.model.Endereco;
import br.com.seatecnologia.gdf.negocia.service.base.EnderecoLocalServiceBaseImpl;

import com.liferay.portal.aop.AopService;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.service.ServiceContext;
import org.osgi.service.component.annotations.Component;

import javax.ws.rs.BadRequestException;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=br.com.seatecnologia.gdf.negocia.model.Endereco",
	service = AopService.class
)
public class EnderecoLocalServiceImpl extends EnderecoLocalServiceBaseImpl {

	@Override
	public Endereco addEndereco(String cep, String endereco,
								String numero, String estado, String municipio, String bairro, String complemento) {

//		if (endereco == null) {
//			throw new BadRequestException("Endereço não pode ser nulo");
//		}
//
//		if (cep == null) {
//			throw new BadRequestException("CEP não pode ser nulo");
//		}
//
//		if (numero == 0) {
//			throw new BadRequestException("Número não pode ser nulo");
//		}
//
//		if (estado == null) {
//			throw new BadRequestException("Estado não pode ser nulo");
//		}
//
//		if (municipio == null) {
//			throw new BadRequestException("Município não pode ser nulo");
//		}
//
//		if (bairro == null) {
//			throw new BadRequestException("Bairro não pode ser nulo");
//		}

		long enderecoId = counterLocalService.increment(Endereco.class.getName());

		Endereco enderecoPostal = super.createEndereco(enderecoId);

		enderecoPostal.setCep(cep);
		enderecoPostal.setBairro(bairro);
		enderecoPostal.setNumero(numero);
		enderecoPostal.setEstado(estado);
		enderecoPostal.setMunicipio(municipio);
		enderecoPostal.setEndereco(endereco);
		enderecoPostal.setComplemento(complemento);

		return super.addEndereco(enderecoPostal);
	}

	@Override
	public Endereco updateEndereco(long enderecoId, ServiceContext sc,
			String cep, String logradouro, String complemento, String bairro,
			String localidade, String uf) throws PortalException {

		Endereco endereco = getEndereco(enderecoId);

		endereco.setCep(cep);
		endereco.setBairro(bairro);
		return enderecoPersistence.update(endereco);
	}
}
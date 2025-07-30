/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.impl;

import br.com.seatecnologia.gdf.negocia.model.Endereco;
import br.com.seatecnologia.gdf.negocia.service.base.EnderecoServiceBaseImpl;

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
		"json.web.service.context.path=Endereco"
	},
	service = AopService.class
)
public class EnderecoServiceImpl extends EnderecoServiceBaseImpl {

	@Override
	public Endereco addEndereco(String cep, String endereco, String numero,
								String estado, String municipio, String bairro, String complemento) {

		return enderecoLocalService.addEndereco(cep, endereco, numero, estado, municipio, bairro, complemento);
	}

	@Override
	public Endereco getEndereco(long enderecoId) throws PortalException {
		return enderecoLocalService.getEndereco(enderecoId);
	}

	@Override
	public List<Endereco> getEnderecos(int start, int end) {
		return enderecoLocalService.getEnderecos(start, end);
	}
}
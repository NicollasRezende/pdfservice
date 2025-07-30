/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link EnderecoService}.
 *
 * @author Brian Wing Shun Chan
 * @see EnderecoService
 * @generated
 */
public class EnderecoServiceWrapper
	implements EnderecoService, ServiceWrapper<EnderecoService> {

	public EnderecoServiceWrapper() {
		this(null);
	}

	public EnderecoServiceWrapper(EnderecoService enderecoService) {
		_enderecoService = enderecoService;
	}

	@Override
	public br.com.seatecnologia.gdf.negocia.model.Endereco addEndereco(
		String cep, String endereco, String numero, String estado,
		String municipio, String bairro, String complemento) {

		return _enderecoService.addEndereco(
			cep, endereco, numero, estado, municipio, bairro, complemento);
	}

	@Override
	public br.com.seatecnologia.gdf.negocia.model.Endereco getEndereco(
			long enderecoId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _enderecoService.getEndereco(enderecoId);
	}

	@Override
	public java.util.List<br.com.seatecnologia.gdf.negocia.model.Endereco>
		getEnderecos(int start, int end) {

		return _enderecoService.getEnderecos(start, end);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _enderecoService.getOSGiServiceIdentifier();
	}

	@Override
	public EnderecoService getWrappedService() {
		return _enderecoService;
	}

	@Override
	public void setWrappedService(EnderecoService enderecoService) {
		_enderecoService = enderecoService;
	}

	private EnderecoService _enderecoService;

}
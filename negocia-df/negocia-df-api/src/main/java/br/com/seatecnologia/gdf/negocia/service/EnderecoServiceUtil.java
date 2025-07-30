/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service;

import br.com.seatecnologia.gdf.negocia.model.Endereco;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.module.service.Snapshot;

import java.util.List;

/**
 * Provides the remote service utility for Endereco. This utility wraps
 * <code>br.com.seatecnologia.gdf.negocia.service.impl.EnderecoServiceImpl</code> and is an
 * access point for service operations in application layer code running on a
 * remote server. Methods of this service are expected to have security checks
 * based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see EnderecoService
 * @generated
 */
public class EnderecoServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>br.com.seatecnologia.gdf.negocia.service.impl.EnderecoServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static Endereco addEndereco(
		String cep, String endereco, String numero, String estado,
		String municipio, String bairro, String complemento) {

		return getService().addEndereco(
			cep, endereco, numero, estado, municipio, bairro, complemento);
	}

	public static Endereco getEndereco(long enderecoId) throws PortalException {
		return getService().getEndereco(enderecoId);
	}

	public static List<Endereco> getEnderecos(int start, int end) {
		return getService().getEnderecos(start, end);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static EnderecoService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<EnderecoService> _serviceSnapshot =
		new Snapshot<>(EnderecoServiceUtil.class, EnderecoService.class);

}
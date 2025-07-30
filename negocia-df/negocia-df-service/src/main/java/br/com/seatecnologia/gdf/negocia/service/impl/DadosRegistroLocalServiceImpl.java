/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.impl;

import br.com.seatecnologia.gdf.negocia.exception.NoSuchDadosRegistroException;
import br.com.seatecnologia.gdf.negocia.model.DadosRegistro;
import br.com.seatecnologia.gdf.negocia.service.base.DadosRegistroLocalServiceBaseImpl;

import com.liferay.portal.aop.AopService;

import org.osgi.service.component.annotations.Component;

import java.util.List;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=br.com.seatecnologia.gdf.negocia.model.DadosRegistro",
	service = AopService.class
)
public class DadosRegistroLocalServiceImpl
	extends DadosRegistroLocalServiceBaseImpl {

	@Override
	public DadosRegistro addDadosRegistro(String matriculaImovel, String cartorioRegistro,
										  String renavam) {
		long dadosRegistroId = counterLocalService.increment(DadosRegistro.class.getName());

		DadosRegistro dadosRegistro = super.createDadosRegistro(dadosRegistroId);

		dadosRegistro.setMatriculaImovel(matriculaImovel);
		dadosRegistro.setCartorioRegistro(cartorioRegistro);
		dadosRegistro.setRenavam(renavam);

		return super.addDadosRegistro(dadosRegistro);
	}

	public DadosRegistro getDadosRegistroByGarantiaId(long garantiaId) throws NoSuchDadosRegistroException {
		return dadosRegistroPersistence.findByGarantiaId(garantiaId);
	}

}
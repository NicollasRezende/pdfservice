/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.impl;

import br.com.seatecnologia.gdf.negocia.model.AnexosOutros;
import br.com.seatecnologia.gdf.negocia.service.base.AnexosOutrosLocalServiceBaseImpl;

import com.liferay.portal.aop.AopService;

import org.osgi.service.component.annotations.Component;

import java.util.List;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=br.com.seatecnologia.gdf.negocia.model.AnexosOutros",
	service = AopService.class
)
public class AnexosOutrosLocalServiceImpl
	extends AnexosOutrosLocalServiceBaseImpl {
	@Override
	public AnexosOutros addAnexosOutros(long dadosRegistroId, long outrosAnexo) {

		long anexosOutrosId = counterLocalService.increment(AnexosOutros.class.getName());

		AnexosOutros anexosOutros = super.createAnexosOutros(anexosOutrosId);
		anexosOutros.setDadosRegistroId(dadosRegistroId);
		anexosOutros.setOutrosAnexo(outrosAnexo);
		return super.addAnexosOutros(anexosOutros);
	}

	public List<AnexosOutros> getAnexosOutrosByDadosRegistroId(long dadosRegistroId) {
		return anexosOutrosPersistence.findByDadosRegistroId(dadosRegistroId);
	}
}
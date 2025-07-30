/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.impl;

import br.com.seatecnologia.gdf.negocia.model.Advogado;
import br.com.seatecnologia.gdf.negocia.service.base.AdvogadoLocalServiceBaseImpl;

import com.liferay.portal.aop.AopService;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.service.ServiceContext;
import org.osgi.service.component.annotations.Component;

import java.util.Date;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=br.com.seatecnologia.gdf.negocia.model.Advogado",
	service = AopService.class
)
public class AdvogadoLocalServiceImpl extends AdvogadoLocalServiceBaseImpl {

	@Override
	public Advogado addAdvogado(ServiceContext serviceContext, long qualificacaoId,
								String numeroOab, String seccional, long carteirinhaOAB) {

		long advogadoId = counterLocalService.increment(Advogado.class.getName());
		Advogado advogado = super.createAdvogado(advogadoId);

		advogado.setQualificacaoId(qualificacaoId);
		advogado.setNumeroOab(numeroOab);
		advogado.setSeccional(seccional);
		advogado.setCarteirinhaOAB(carteirinhaOAB);

		return super.addAdvogado(advogado);

	}

	@Override
	public Advogado updateAdvogado(long advogadoId,
								   ServiceContext serviceContext,
								   long qualificacaoId, String numeroOab,
								   String ufOab) throws PortalException {

		Advogado advogado = getAdvogado(advogadoId);

		advogado.setQualificacaoId(qualificacaoId);
		advogado.setNumeroOab(numeroOab);

		return advogadoPersistence.update(advogado);
	}

}
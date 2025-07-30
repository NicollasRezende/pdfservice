/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.impl;

import br.com.seatecnologia.gdf.negocia.model.Advogado;
import br.com.seatecnologia.gdf.negocia.service.base.AdvogadoServiceBaseImpl;

import com.liferay.portal.aop.AopService;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.service.ServiceContext;
import org.osgi.service.component.annotations.Component;

import java.util.Date;
import java.util.List;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = {
		"json.web.service.context.name=gdf",
		"json.web.service.context.path=Advogado"
	},
	service = AopService.class
)
public class AdvogadoServiceImpl extends AdvogadoServiceBaseImpl {

	@Override
	public Advogado addAdvogado(ServiceContext serviceContext, long qualificacaoId,
								String numeroOab, String seccional, long carteirinhaOAB) {
		return advogadoLocalService.addAdvogado(serviceContext, qualificacaoId, numeroOab, seccional, carteirinhaOAB);
	}

	@Override
	public Advogado updateAdvogado(long advogadoId, ServiceContext serviceContext,
								   long qualificacaoId, String numeroOab, String ufOab) throws PortalException {

		return advogadoLocalService.updateAdvogado(advogadoId, serviceContext,
												   qualificacaoId, numeroOab, ufOab);
	}

	@Override
	public List<Advogado> getAdvogados (int start, int end) {
		return advogadoLocalService.getAdvogados(start, end);
	}

}
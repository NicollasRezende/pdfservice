/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.impl;

import br.com.seatecnologia.gdf.negocia.model.TermoAssinado;
import br.com.seatecnologia.gdf.negocia.service.base.TermoAssinadoServiceBaseImpl;

import com.liferay.portal.aop.AopService;

import com.liferay.portal.kernel.exception.PortalException;
import org.osgi.service.component.annotations.Component;

import java.util.List;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = {
		"json.web.service.context.name=gdf",
		"json.web.service.context.path=TermoAssinado"
	},
	service = AopService.class
)
public class TermoAssinadoServiceImpl extends TermoAssinadoServiceBaseImpl {

	@Override
	public TermoAssinado addTermoAssinado(Long termoId, long propostaId,
										  String urlTermo, String arquivoPdf,
										  String parte) {

		return termoAssinadoLocalService.addTermoAssinado(termoId, propostaId,
														  urlTermo, arquivoPdf,
														  parte);

	}

	@Override
	public TermoAssinado updateTermoAssinado(Long termoId, long propostaId,
											 String urlTermo, String arquivoPdf,
											 String parte) throws PortalException {

		return termoAssinadoLocalService.updateTermoAssinado(termoId, propostaId,
															urlTermo, arquivoPdf,
															parte);

	}

	@Override
	public List<TermoAssinado> getTermoAssinados(int start, int end) {

		return termoAssinadoLocalService.getTermoAssinados(start, end);

	}


}
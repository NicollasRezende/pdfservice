/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.impl;

import br.com.seatecnologia.gdf.negocia.model.TermoAssinado;
import br.com.seatecnologia.gdf.negocia.service.base.TermoAssinadoLocalServiceBaseImpl;

import com.liferay.portal.aop.AopService;

import com.liferay.portal.kernel.exception.PortalException;
import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=br.com.seatecnologia.gdf.negocia.model.TermoAssinado",
	service = AopService.class
)
public class TermoAssinadoLocalServiceImpl
	extends TermoAssinadoLocalServiceBaseImpl {

	@Override
	public TermoAssinado addTermoAssinado(long termoId, long propostaId,
										  String urlTermo, String arquivoPdf,
										  String parte) {

		TermoAssinado termoAssinado = createTermoAssinado(termoId);

		termoAssinado.setPropostaId(propostaId);
		termoAssinado.setUrlTermo(urlTermo);
		termoAssinado.setArquivoPdf(arquivoPdf);
		termoAssinado.setParte(parte);

		return termoAssinadoPersistence.update(termoAssinado);
	}

	@Override
	public TermoAssinado updateTermoAssinado(long termoId, long propostaId,
											 String urlTermo, String arquivoPdf,
											 String parte) throws PortalException {

		TermoAssinado termoAssinado = getTermoAssinado(termoId);

		termoAssinado.setPropostaId(propostaId);
		termoAssinado.setUrlTermo(urlTermo);
		termoAssinado.setArquivoPdf(arquivoPdf);
		termoAssinado.setParte(parte);

		return termoAssinadoPersistence.update(termoAssinado);
	}

}
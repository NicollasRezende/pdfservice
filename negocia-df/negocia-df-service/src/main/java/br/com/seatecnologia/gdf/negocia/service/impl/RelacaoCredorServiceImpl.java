/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.impl;

import br.com.seatecnologia.gdf.negocia.model.RelacaoCredor;
import br.com.seatecnologia.gdf.negocia.service.base.RelacaoCredorServiceBaseImpl;

import com.liferay.portal.aop.AopService;

import com.liferay.portal.kernel.service.ServiceContext;
import org.osgi.service.component.annotations.Component;

import java.util.List;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = {
		"json.web.service.context.name=gdf",
		"json.web.service.context.path=RelacaoCredor"
	},
	service = AopService.class
)
public class RelacaoCredorServiceImpl extends RelacaoCredorServiceBaseImpl {

	@Override
	public RelacaoCredor addRelacaoCredor(ServiceContext serviceContext, long propostaId,
										  String nomeCredor,
										  String naturezaCredito,
										  String classificacaoCredito,
										  double valorAtualizado,
										  String referenciaContabil) {

		return relacaoCredorLocalService.addRelacaoCredor(
			serviceContext, propostaId, nomeCredor, naturezaCredito,
			classificacaoCredito, valorAtualizado, referenciaContabil);
	}

	@Override
	public RelacaoCredor updateRelacaoCredor(long credorId, long propostaId,
											  String nomeCredor,
											  String naturezaCredito,
											  String classificacaoCredito,
											  double valorAtualizado,
											  String referenciaRegistro) {

		return relacaoCredorLocalService.updateRelacaoCredor(
			credorId, propostaId, nomeCredor, naturezaCredito,
			classificacaoCredito, valorAtualizado, referenciaRegistro);
	}

	@Override
	public List<RelacaoCredor> getRelacaoCredor(int start, int end) {

		return relacaoCredorLocalService.getRelacaoCredors(start, end);
	}

}
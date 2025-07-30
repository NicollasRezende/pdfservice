/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.impl;

import br.com.seatecnologia.gdf.negocia.model.RelacaoCredor;
import br.com.seatecnologia.gdf.negocia.service.base.RelacaoCredorLocalServiceBaseImpl;

import com.liferay.portal.aop.AopService;

import com.liferay.portal.kernel.service.ServiceContext;
import org.osgi.service.component.annotations.Component;

import java.util.List;
import java.util.Date;
import java.util.List;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=br.com.seatecnologia.gdf.negocia.model.RelacaoCredor",
	service = AopService.class
)
public class RelacaoCredorLocalServiceImpl
	extends RelacaoCredorLocalServiceBaseImpl {

	@Override
	public RelacaoCredor addRelacaoCredor(ServiceContext serviceContext, long propostaId,
										  String nomeCredor,
										  String naturezaCredito,
										  String classificacaoCredito,
										  double valorAtualizado,
										  String referenciaContabil) {

		long credorId = counterLocalService.increment(RelacaoCredor.class.getName());

		RelacaoCredor relacaoCredor = super.createRelacaoCredor(credorId);

		relacaoCredor.setPropostaId(propostaId);
		relacaoCredor.setNomeCredor(nomeCredor);
		relacaoCredor.setNaturezaCredito(naturezaCredito);
		relacaoCredor.setClassificacaoCredito(classificacaoCredito);
		relacaoCredor.setValorAtualizado(valorAtualizado);
		relacaoCredor.setReferenciaContabil(referenciaContabil);

		return relacaoCredorPersistence.update(relacaoCredor);

	}

	@Override
	public RelacaoCredor updateRelacaoCredor(long credorId, long propostaId,
											  String nomeCredor,
											  String naturezaCredito,
											  String classificacaoCredito,
											  double valorAtualizado,
											  String referenciaRegistro) {

		RelacaoCredor relacaoCredor = fetchRelacaoCredor(credorId);
		relacaoCredor.setPropostaId(propostaId);
		relacaoCredor.setNomeCredor(nomeCredor);
		relacaoCredor.setNaturezaCredito(naturezaCredito);
		relacaoCredor.setClassificacaoCredito(classificacaoCredito);
		relacaoCredor.setValorAtualizado(valorAtualizado);

		return relacaoCredorPersistence.update(relacaoCredor);

	}

	@Override
	public List<RelacaoCredor> getRelacoesCredorByPropostaId(long propostaId) {
		return relacaoCredorPersistence.findByPropostaId(propostaId);
	}
}
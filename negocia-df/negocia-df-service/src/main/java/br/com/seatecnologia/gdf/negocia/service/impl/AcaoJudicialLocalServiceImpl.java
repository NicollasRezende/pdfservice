/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.impl;

import br.com.seatecnologia.gdf.negocia.exception.NoSuchAcaoJudicialException;
import br.com.seatecnologia.gdf.negocia.model.AcaoJudicial;
import br.com.seatecnologia.gdf.negocia.service.base.AcaoJudicialLocalServiceBaseImpl;

import com.liferay.portal.aop.AopService;

import com.liferay.portal.kernel.service.ServiceContext;
import org.osgi.service.component.annotations.Component;

import java.util.Date;
import java.util.List;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=br.com.seatecnologia.gdf.negocia.model.AcaoJudicial",
	service = AopService.class
)
public class AcaoJudicialLocalServiceImpl
	extends AcaoJudicialLocalServiceBaseImpl {

	@Override
	public AcaoJudicial addAcaoJudicial(ServiceContext serviceContext, String orgaoTribunal, String numeroProcesso, String unidadeVara,
										String parteAutora, String parteRe, String observacoes, long propostaId) {

		long acaoId = counterLocalService.increment(AcaoJudicial.class.getName());

		AcaoJudicial acaoJudicial = acaoJudicialPersistence.create(acaoId);

		acaoJudicial.setOrgaoTribunal(orgaoTribunal);
		acaoJudicial.setNumeroProcesso(numeroProcesso);
		acaoJudicial.setUnidadeVara(unidadeVara);
		acaoJudicial.setParteAutora(parteAutora);
		acaoJudicial.setParteRe(parteRe);
		acaoJudicial.setObservacoes(observacoes);
		acaoJudicial.setPropostaId(propostaId);

		return super.addAcaoJudicial(acaoJudicial);

	}

	@Override
	public AcaoJudicial updateAcaoJudicial(long acaoId,
										   long propostaId,
										   String numeroProcesso,
										   String varaLocal) {

		AcaoJudicial acaoJudicial = acaoJudicialPersistence.fetchByPrimaryKey(acaoId);

		acaoJudicial.setNumeroProcesso(numeroProcesso);

		return acaoJudicialPersistence.update(acaoJudicial);

	}

	public List<AcaoJudicial> findByPropostaId(long propostaId) {
        return acaoJudicialPersistence.findByPropostaId(propostaId);
    }

}
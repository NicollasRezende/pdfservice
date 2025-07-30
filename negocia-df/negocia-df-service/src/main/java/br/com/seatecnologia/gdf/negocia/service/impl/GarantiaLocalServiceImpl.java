/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.impl;

import br.com.seatecnologia.gdf.negocia.model.Garantia;
import br.com.seatecnologia.gdf.negocia.service.base.GarantiaLocalServiceBaseImpl;

import com.liferay.portal.aop.AopService;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.service.ServiceContext;
import org.osgi.service.component.annotations.Component;
import java.util.List;

import java.util.Date;
import java.util.List;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=br.com.seatecnologia.gdf.negocia.model.Garantia",
	service = AopService.class
)
public class GarantiaLocalServiceImpl extends GarantiaLocalServiceBaseImpl {

	@Override
	public Garantia addGarantia (ServiceContext serviceContext, String tipoGarantia, String tipoDevedor, String outras, long proprietarioQualificacaoId,
								 double valorEstimado, long dadosRegistroId, String localizacao,
								 boolean declaracaoAnuencia, long declaracao,String descricaoBem, long propostaId) {

		long garantiaId = counterLocalService.increment(Garantia.class.getName());

		Garantia garantia = super.createGarantia(garantiaId);

		garantia.setTipoGarantia(tipoGarantia);
		garantia.setTipoDevedor(tipoDevedor);
		garantia.setOutras(outras);
		garantia.setProprietarioQualificacao(proprietarioQualificacaoId);
		garantia.setValorEstimado(valorEstimado);
		garantia.setDadosRegistroId(dadosRegistroId);
		garantia.setLocalizacao(localizacao);
		garantia.setDeclaracaoAnuencia(declaracaoAnuencia);
		garantia.setDeclaracao(declaracao);
		garantia.setDescricaoBem(descricaoBem);
		garantia.setPropostaId(propostaId);

		return super.addGarantia(garantia);

	}

	@Override
	public Garantia updateGarantia (long garantiaId, long propostaId, String tipoGarantia, String descricaoBem,
									String proprietario, double valorEstimado, String dadosRegistro, String localizacao,
									boolean anuenciaTerceiro, long documentoAnuencia) throws PortalException {

		Garantia garantia = getGarantia(garantiaId);

		garantia.setPropostaId(propostaId);
		garantia.setTipoGarantia(tipoGarantia);
		garantia.setDescricaoBem(descricaoBem);
		garantia.setValorEstimado(valorEstimado);
		garantia.setLocalizacao(localizacao);

		return garantiaPersistence.update(garantia);
	}

	@Override
	public List<Garantia> getGarantiasByPropostaId(long propostaId) {
		return garantiaPersistence.findByPropostaId(propostaId);
	}
}
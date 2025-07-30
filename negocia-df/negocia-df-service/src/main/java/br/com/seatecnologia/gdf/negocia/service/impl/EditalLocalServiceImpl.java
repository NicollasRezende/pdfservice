/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.impl;

import br.com.seatecnologia.gdf.negocia.model.Edital;
import br.com.seatecnologia.gdf.negocia.service.base.EditalLocalServiceBaseImpl;

import com.liferay.portal.aop.AopService;

import com.liferay.portal.kernel.exception.PortalException;
import org.osgi.service.component.annotations.Component;

import java.util.Date;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=br.com.seatecnologia.gdf.negocia.model.Edital",
	service = AopService.class
)
public class EditalLocalServiceImpl extends EditalLocalServiceBaseImpl {
	@Override
	public Edital addEdital(String titulo, String descricao, long arquivo, Date dataInicio, Date dataFim) {
		long editalId = counterLocalService.increment(Edital.class.getName());
		Edital edital = super.createEdital(editalId);

		edital.setTitulo(titulo);
		edital.setDescricao(descricao);
		edital.setArquivo(arquivo);
		edital.setDataInicio(dataInicio);
		edital.setDataFim(dataFim);
		return super.addEdital(edital);
	}

	@Override
	public Edital updateEdital(long editalId, String titulo, String descricao, long arquivo, Date dataInicio, Date dataFim) throws PortalException {
		Edital edital = super.getEdital(editalId);

		edital.setTitulo(titulo);
		edital.setDescricao(descricao);
		edital.setArquivo(arquivo);
		edital.setDataInicio(dataInicio);
		edital.setDataFim(dataFim);

		return super.updateEdital(edital);
	}
}
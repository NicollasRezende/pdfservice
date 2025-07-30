/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.impl;

import br.com.seatecnologia.gdf.negocia.model.IdentificacaoDebitos;
import br.com.seatecnologia.gdf.negocia.service.base.IdentificacaoDebitosLocalServiceBaseImpl;

import com.liferay.portal.aop.AopService;

import org.osgi.service.component.annotations.Component;
import java.util.List;

import java.util.List;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=br.com.seatecnologia.gdf.negocia.model.IdentificacaoDebitos",
	service = AopService.class
)
public class IdentificacaoDebitosLocalServiceImpl
	extends IdentificacaoDebitosLocalServiceBaseImpl {

	@Override
	public IdentificacaoDebitos addIdentificacaoDebitos(long fundamentacaoId, String natureza, String situacao, String inscricaoDividaAtiva, String garantidoJudicialmente) {
		long identificacaoDebitosId = counterLocalService.increment(IdentificacaoDebitos.class.getName());

		IdentificacaoDebitos identificacaoDebitos = super.createIdentificacaoDebitos(identificacaoDebitosId);
		identificacaoDebitos.setFundamentacaoId(fundamentacaoId);
		identificacaoDebitos.setNatureza(natureza);
		identificacaoDebitos.setSituacao(situacao);
		identificacaoDebitos.setInscricaoDividaAtiva(inscricaoDividaAtiva);
		identificacaoDebitos.setGarantidoJudicialmente(garantidoJudicialmente);

		return super.addIdentificacaoDebitos(identificacaoDebitos);
	}

	@Override
	public List<IdentificacaoDebitos> getIdentificacaoDebitosByFundamentacaoId(long fundamentacaoId) {
		return identificacaoDebitosPersistence.findByFundamentacaoId(fundamentacaoId);
	}

}
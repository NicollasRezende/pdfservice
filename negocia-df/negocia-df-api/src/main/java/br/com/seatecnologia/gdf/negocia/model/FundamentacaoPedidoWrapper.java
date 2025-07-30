/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link FundamentacaoPedido}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FundamentacaoPedido
 * @generated
 */
public class FundamentacaoPedidoWrapper
	extends BaseModelWrapper<FundamentacaoPedido>
	implements FundamentacaoPedido, ModelWrapper<FundamentacaoPedido> {

	public FundamentacaoPedidoWrapper(FundamentacaoPedido fundamentacaoPedido) {
		super(fundamentacaoPedido);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("fundamentacaoId", getFundamentacaoId());
		attributes.put("propostaId", getPropostaId());
		attributes.put("fundamentacaoPedido", getFundamentacaoPedido());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long fundamentacaoId = (Long)attributes.get("fundamentacaoId");

		if (fundamentacaoId != null) {
			setFundamentacaoId(fundamentacaoId);
		}

		Long propostaId = (Long)attributes.get("propostaId");

		if (propostaId != null) {
			setPropostaId(propostaId);
		}

		String fundamentacaoPedido = (String)attributes.get(
			"fundamentacaoPedido");

		if (fundamentacaoPedido != null) {
			setFundamentacaoPedido(fundamentacaoPedido);
		}
	}

	@Override
	public FundamentacaoPedido cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the fundamentacao ID of this fundamentacao pedido.
	 *
	 * @return the fundamentacao ID of this fundamentacao pedido
	 */
	@Override
	public long getFundamentacaoId() {
		return model.getFundamentacaoId();
	}

	/**
	 * Returns the fundamentacao pedido of this fundamentacao pedido.
	 *
	 * @return the fundamentacao pedido of this fundamentacao pedido
	 */
	@Override
	public String getFundamentacaoPedido() {
		return model.getFundamentacaoPedido();
	}

	/**
	 * Returns the primary key of this fundamentacao pedido.
	 *
	 * @return the primary key of this fundamentacao pedido
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the proposta ID of this fundamentacao pedido.
	 *
	 * @return the proposta ID of this fundamentacao pedido
	 */
	@Override
	public long getPropostaId() {
		return model.getPropostaId();
	}

	/**
	 * Returns the uuid of this fundamentacao pedido.
	 *
	 * @return the uuid of this fundamentacao pedido
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the fundamentacao ID of this fundamentacao pedido.
	 *
	 * @param fundamentacaoId the fundamentacao ID of this fundamentacao pedido
	 */
	@Override
	public void setFundamentacaoId(long fundamentacaoId) {
		model.setFundamentacaoId(fundamentacaoId);
	}

	/**
	 * Sets the fundamentacao pedido of this fundamentacao pedido.
	 *
	 * @param fundamentacaoPedido the fundamentacao pedido of this fundamentacao pedido
	 */
	@Override
	public void setFundamentacaoPedido(String fundamentacaoPedido) {
		model.setFundamentacaoPedido(fundamentacaoPedido);
	}

	/**
	 * Sets the primary key of this fundamentacao pedido.
	 *
	 * @param primaryKey the primary key of this fundamentacao pedido
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the proposta ID of this fundamentacao pedido.
	 *
	 * @param propostaId the proposta ID of this fundamentacao pedido
	 */
	@Override
	public void setPropostaId(long propostaId) {
		model.setPropostaId(propostaId);
	}

	/**
	 * Sets the uuid of this fundamentacao pedido.
	 *
	 * @param uuid the uuid of this fundamentacao pedido
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	@Override
	public String toXmlString() {
		return model.toXmlString();
	}

	@Override
	protected FundamentacaoPedidoWrapper wrap(
		FundamentacaoPedido fundamentacaoPedido) {

		return new FundamentacaoPedidoWrapper(fundamentacaoPedido);
	}

}
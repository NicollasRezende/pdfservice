/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.model.impl;

import br.com.seatecnologia.gdf.negocia.model.FundamentacaoPedido;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing FundamentacaoPedido in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class FundamentacaoPedidoCacheModel
	implements CacheModel<FundamentacaoPedido>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof FundamentacaoPedidoCacheModel)) {
			return false;
		}

		FundamentacaoPedidoCacheModel fundamentacaoPedidoCacheModel =
			(FundamentacaoPedidoCacheModel)object;

		if (fundamentacaoId == fundamentacaoPedidoCacheModel.fundamentacaoId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, fundamentacaoId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", fundamentacaoId=");
		sb.append(fundamentacaoId);
		sb.append(", propostaId=");
		sb.append(propostaId);
		sb.append(", fundamentacaoPedido=");
		sb.append(fundamentacaoPedido);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public FundamentacaoPedido toEntityModel() {
		FundamentacaoPedidoImpl fundamentacaoPedidoImpl =
			new FundamentacaoPedidoImpl();

		if (uuid == null) {
			fundamentacaoPedidoImpl.setUuid("");
		}
		else {
			fundamentacaoPedidoImpl.setUuid(uuid);
		}

		fundamentacaoPedidoImpl.setFundamentacaoId(fundamentacaoId);
		fundamentacaoPedidoImpl.setPropostaId(propostaId);

		if (fundamentacaoPedido == null) {
			fundamentacaoPedidoImpl.setFundamentacaoPedido("");
		}
		else {
			fundamentacaoPedidoImpl.setFundamentacaoPedido(fundamentacaoPedido);
		}

		fundamentacaoPedidoImpl.resetOriginalValues();

		return fundamentacaoPedidoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		fundamentacaoId = objectInput.readLong();

		propostaId = objectInput.readLong();
		fundamentacaoPedido = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(fundamentacaoId);

		objectOutput.writeLong(propostaId);

		if (fundamentacaoPedido == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(fundamentacaoPedido);
		}
	}

	public String uuid;
	public long fundamentacaoId;
	public long propostaId;
	public String fundamentacaoPedido;

}
/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.model.impl;

import br.com.seatecnologia.gdf.negocia.model.BensDireitosRequerente;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing BensDireitosRequerente in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class BensDireitosRequerenteCacheModel
	implements CacheModel<BensDireitosRequerente>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof BensDireitosRequerenteCacheModel)) {
			return false;
		}

		BensDireitosRequerenteCacheModel bensDireitosRequerenteCacheModel =
			(BensDireitosRequerenteCacheModel)object;

		if (bemId == bensDireitosRequerenteCacheModel.bemId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, bemId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", bemId=");
		sb.append(bemId);
		sb.append(", propostaId=");
		sb.append(propostaId);
		sb.append(", descricao=");
		sb.append(descricao);
		sb.append(", localizacaoDestinacao=");
		sb.append(localizacaoDestinacao);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public BensDireitosRequerente toEntityModel() {
		BensDireitosRequerenteImpl bensDireitosRequerenteImpl =
			new BensDireitosRequerenteImpl();

		if (uuid == null) {
			bensDireitosRequerenteImpl.setUuid("");
		}
		else {
			bensDireitosRequerenteImpl.setUuid(uuid);
		}

		bensDireitosRequerenteImpl.setBemId(bemId);
		bensDireitosRequerenteImpl.setPropostaId(propostaId);

		if (descricao == null) {
			bensDireitosRequerenteImpl.setDescricao("");
		}
		else {
			bensDireitosRequerenteImpl.setDescricao(descricao);
		}

		if (localizacaoDestinacao == null) {
			bensDireitosRequerenteImpl.setLocalizacaoDestinacao("");
		}
		else {
			bensDireitosRequerenteImpl.setLocalizacaoDestinacao(
				localizacaoDestinacao);
		}

		bensDireitosRequerenteImpl.resetOriginalValues();

		return bensDireitosRequerenteImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		bemId = objectInput.readLong();

		propostaId = objectInput.readLong();
		descricao = objectInput.readUTF();
		localizacaoDestinacao = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(bemId);

		objectOutput.writeLong(propostaId);

		if (descricao == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(descricao);
		}

		if (localizacaoDestinacao == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(localizacaoDestinacao);
		}
	}

	public String uuid;
	public long bemId;
	public long propostaId;
	public String descricao;
	public String localizacaoDestinacao;

}
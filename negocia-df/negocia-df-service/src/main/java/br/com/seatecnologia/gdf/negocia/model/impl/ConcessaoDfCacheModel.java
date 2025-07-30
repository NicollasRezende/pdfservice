/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.model.impl;

import br.com.seatecnologia.gdf.negocia.model.ConcessaoDf;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing ConcessaoDf in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class ConcessaoDfCacheModel
	implements CacheModel<ConcessaoDf>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof ConcessaoDfCacheModel)) {
			return false;
		}

		ConcessaoDfCacheModel concessaoDfCacheModel =
			(ConcessaoDfCacheModel)object;

		if (concessaoId == concessaoDfCacheModel.concessaoId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, concessaoId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(13);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", concessaoId=");
		sb.append(concessaoId);
		sb.append(", propostaId=");
		sb.append(propostaId);
		sb.append(", percentualDescontoJuros=");
		sb.append(percentualDescontoJuros);
		sb.append(", percentualDescontoPrincipal=");
		sb.append(percentualDescontoPrincipal);
		sb.append(", observacoes=");
		sb.append(observacoes);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public ConcessaoDf toEntityModel() {
		ConcessaoDfImpl concessaoDfImpl = new ConcessaoDfImpl();

		if (uuid == null) {
			concessaoDfImpl.setUuid("");
		}
		else {
			concessaoDfImpl.setUuid(uuid);
		}

		concessaoDfImpl.setConcessaoId(concessaoId);
		concessaoDfImpl.setPropostaId(propostaId);
		concessaoDfImpl.setPercentualDescontoJuros(percentualDescontoJuros);
		concessaoDfImpl.setPercentualDescontoPrincipal(
			percentualDescontoPrincipal);

		if (observacoes == null) {
			concessaoDfImpl.setObservacoes("");
		}
		else {
			concessaoDfImpl.setObservacoes(observacoes);
		}

		concessaoDfImpl.resetOriginalValues();

		return concessaoDfImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		concessaoId = objectInput.readLong();

		propostaId = objectInput.readLong();

		percentualDescontoJuros = objectInput.readDouble();

		percentualDescontoPrincipal = objectInput.readDouble();
		observacoes = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(concessaoId);

		objectOutput.writeLong(propostaId);

		objectOutput.writeDouble(percentualDescontoJuros);

		objectOutput.writeDouble(percentualDescontoPrincipal);

		if (observacoes == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(observacoes);
		}
	}

	public String uuid;
	public long concessaoId;
	public long propostaId;
	public double percentualDescontoJuros;
	public double percentualDescontoPrincipal;
	public String observacoes;

}
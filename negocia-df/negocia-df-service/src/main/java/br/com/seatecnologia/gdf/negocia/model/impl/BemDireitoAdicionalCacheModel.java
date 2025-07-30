/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.model.impl;

import br.com.seatecnologia.gdf.negocia.model.BemDireitoAdicional;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing BemDireitoAdicional in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class BemDireitoAdicionalCacheModel
	implements CacheModel<BemDireitoAdicional>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof BemDireitoAdicionalCacheModel)) {
			return false;
		}

		BemDireitoAdicionalCacheModel bemDireitoAdicionalCacheModel =
			(BemDireitoAdicionalCacheModel)object;

		if (bemId == bemDireitoAdicionalCacheModel.bemId) {
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
		StringBundler sb = new StringBundler(15);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", bemId=");
		sb.append(bemId);
		sb.append(", propostaId=");
		sb.append(propostaId);
		sb.append(", descricao=");
		sb.append(descricao);
		sb.append(", localizacao=");
		sb.append(localizacao);
		sb.append(", destinacao=");
		sb.append(destinacao);
		sb.append(", laudoAvaliacao=");
		sb.append(laudoAvaliacao);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public BemDireitoAdicional toEntityModel() {
		BemDireitoAdicionalImpl bemDireitoAdicionalImpl =
			new BemDireitoAdicionalImpl();

		if (uuid == null) {
			bemDireitoAdicionalImpl.setUuid("");
		}
		else {
			bemDireitoAdicionalImpl.setUuid(uuid);
		}

		bemDireitoAdicionalImpl.setBemId(bemId);
		bemDireitoAdicionalImpl.setPropostaId(propostaId);

		if (descricao == null) {
			bemDireitoAdicionalImpl.setDescricao("");
		}
		else {
			bemDireitoAdicionalImpl.setDescricao(descricao);
		}

		if (localizacao == null) {
			bemDireitoAdicionalImpl.setLocalizacao("");
		}
		else {
			bemDireitoAdicionalImpl.setLocalizacao(localizacao);
		}

		if (destinacao == null) {
			bemDireitoAdicionalImpl.setDestinacao("");
		}
		else {
			bemDireitoAdicionalImpl.setDestinacao(destinacao);
		}

		if (laudoAvaliacao == null) {
			bemDireitoAdicionalImpl.setLaudoAvaliacao("");
		}
		else {
			bemDireitoAdicionalImpl.setLaudoAvaliacao(laudoAvaliacao);
		}

		bemDireitoAdicionalImpl.resetOriginalValues();

		return bemDireitoAdicionalImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		bemId = objectInput.readLong();

		propostaId = objectInput.readLong();
		descricao = objectInput.readUTF();
		localizacao = objectInput.readUTF();
		destinacao = objectInput.readUTF();
		laudoAvaliacao = objectInput.readUTF();
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

		if (localizacao == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(localizacao);
		}

		if (destinacao == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(destinacao);
		}

		if (laudoAvaliacao == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(laudoAvaliacao);
		}
	}

	public String uuid;
	public long bemId;
	public long propostaId;
	public String descricao;
	public String localizacao;
	public String destinacao;
	public String laudoAvaliacao;

}
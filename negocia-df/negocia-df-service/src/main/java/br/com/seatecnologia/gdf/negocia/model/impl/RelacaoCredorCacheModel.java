/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.model.impl;

import br.com.seatecnologia.gdf.negocia.model.RelacaoCredor;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing RelacaoCredor in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class RelacaoCredorCacheModel
	implements CacheModel<RelacaoCredor>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof RelacaoCredorCacheModel)) {
			return false;
		}

		RelacaoCredorCacheModel relacaoCredorCacheModel =
			(RelacaoCredorCacheModel)object;

		if (credorId == relacaoCredorCacheModel.credorId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, credorId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(17);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", credorId=");
		sb.append(credorId);
		sb.append(", propostaId=");
		sb.append(propostaId);
		sb.append(", nomeCredor=");
		sb.append(nomeCredor);
		sb.append(", naturezaCredito=");
		sb.append(naturezaCredito);
		sb.append(", classificacaoCredito=");
		sb.append(classificacaoCredito);
		sb.append(", valorAtualizado=");
		sb.append(valorAtualizado);
		sb.append(", referenciaContabil=");
		sb.append(referenciaContabil);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public RelacaoCredor toEntityModel() {
		RelacaoCredorImpl relacaoCredorImpl = new RelacaoCredorImpl();

		if (uuid == null) {
			relacaoCredorImpl.setUuid("");
		}
		else {
			relacaoCredorImpl.setUuid(uuid);
		}

		relacaoCredorImpl.setCredorId(credorId);
		relacaoCredorImpl.setPropostaId(propostaId);

		if (nomeCredor == null) {
			relacaoCredorImpl.setNomeCredor("");
		}
		else {
			relacaoCredorImpl.setNomeCredor(nomeCredor);
		}

		if (naturezaCredito == null) {
			relacaoCredorImpl.setNaturezaCredito("");
		}
		else {
			relacaoCredorImpl.setNaturezaCredito(naturezaCredito);
		}

		if (classificacaoCredito == null) {
			relacaoCredorImpl.setClassificacaoCredito("");
		}
		else {
			relacaoCredorImpl.setClassificacaoCredito(classificacaoCredito);
		}

		relacaoCredorImpl.setValorAtualizado(valorAtualizado);

		if (referenciaContabil == null) {
			relacaoCredorImpl.setReferenciaContabil("");
		}
		else {
			relacaoCredorImpl.setReferenciaContabil(referenciaContabil);
		}

		relacaoCredorImpl.resetOriginalValues();

		return relacaoCredorImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		credorId = objectInput.readLong();

		propostaId = objectInput.readLong();
		nomeCredor = objectInput.readUTF();
		naturezaCredito = objectInput.readUTF();
		classificacaoCredito = objectInput.readUTF();

		valorAtualizado = objectInput.readDouble();
		referenciaContabil = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(credorId);

		objectOutput.writeLong(propostaId);

		if (nomeCredor == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(nomeCredor);
		}

		if (naturezaCredito == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(naturezaCredito);
		}

		if (classificacaoCredito == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(classificacaoCredito);
		}

		objectOutput.writeDouble(valorAtualizado);

		if (referenciaContabil == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(referenciaContabil);
		}
	}

	public String uuid;
	public long credorId;
	public long propostaId;
	public String nomeCredor;
	public String naturezaCredito;
	public String classificacaoCredito;
	public double valorAtualizado;
	public String referenciaContabil;

}
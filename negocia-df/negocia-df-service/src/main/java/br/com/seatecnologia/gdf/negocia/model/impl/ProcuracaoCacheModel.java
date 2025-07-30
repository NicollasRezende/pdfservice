/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.model.impl;

import br.com.seatecnologia.gdf.negocia.model.Procuracao;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Procuracao in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class ProcuracaoCacheModel
	implements CacheModel<Procuracao>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof ProcuracaoCacheModel)) {
			return false;
		}

		ProcuracaoCacheModel procuracaoCacheModel =
			(ProcuracaoCacheModel)object;

		if (procuracaoId == procuracaoCacheModel.procuracaoId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, procuracaoId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", procuracaoId=");
		sb.append(procuracaoId);
		sb.append(", propostaId=");
		sb.append(propostaId);
		sb.append(", procuracao=");
		sb.append(procuracao);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Procuracao toEntityModel() {
		ProcuracaoImpl procuracaoImpl = new ProcuracaoImpl();

		if (uuid == null) {
			procuracaoImpl.setUuid("");
		}
		else {
			procuracaoImpl.setUuid(uuid);
		}

		procuracaoImpl.setProcuracaoId(procuracaoId);
		procuracaoImpl.setPropostaId(propostaId);
		procuracaoImpl.setProcuracao(procuracao);

		procuracaoImpl.resetOriginalValues();

		return procuracaoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		procuracaoId = objectInput.readLong();

		propostaId = objectInput.readLong();

		procuracao = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(procuracaoId);

		objectOutput.writeLong(propostaId);

		objectOutput.writeLong(procuracao);
	}

	public String uuid;
	public long procuracaoId;
	public long propostaId;
	public long procuracao;

}
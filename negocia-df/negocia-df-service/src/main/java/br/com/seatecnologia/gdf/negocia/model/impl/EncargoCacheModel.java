/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.model.impl;

import br.com.seatecnologia.gdf.negocia.model.Encargo;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Encargo in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class EncargoCacheModel implements CacheModel<Encargo>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof EncargoCacheModel)) {
			return false;
		}

		EncargoCacheModel encargoCacheModel = (EncargoCacheModel)object;

		if (encargoId == encargoCacheModel.encargoId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, encargoId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", encargoId=");
		sb.append(encargoId);
		sb.append(", propostaId=");
		sb.append(propostaId);
		sb.append(", valorEncargos=");
		sb.append(valorEncargos);
		sb.append(", descricaoEncargos=");
		sb.append(descricaoEncargos);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Encargo toEntityModel() {
		EncargoImpl encargoImpl = new EncargoImpl();

		if (uuid == null) {
			encargoImpl.setUuid("");
		}
		else {
			encargoImpl.setUuid(uuid);
		}

		encargoImpl.setEncargoId(encargoId);
		encargoImpl.setPropostaId(propostaId);
		encargoImpl.setValorEncargos(valorEncargos);

		if (descricaoEncargos == null) {
			encargoImpl.setDescricaoEncargos("");
		}
		else {
			encargoImpl.setDescricaoEncargos(descricaoEncargos);
		}

		encargoImpl.resetOriginalValues();

		return encargoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		encargoId = objectInput.readLong();

		propostaId = objectInput.readLong();

		valorEncargos = objectInput.readDouble();
		descricaoEncargos = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(encargoId);

		objectOutput.writeLong(propostaId);

		objectOutput.writeDouble(valorEncargos);

		if (descricaoEncargos == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(descricaoEncargos);
		}
	}

	public String uuid;
	public long encargoId;
	public long propostaId;
	public double valorEncargos;
	public String descricaoEncargos;

}
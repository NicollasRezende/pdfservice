/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.model.impl;

import br.com.seatecnologia.gdf.negocia.model.AnexosOutros;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing AnexosOutros in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class AnexosOutrosCacheModel
	implements CacheModel<AnexosOutros>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof AnexosOutrosCacheModel)) {
			return false;
		}

		AnexosOutrosCacheModel anexosOutrosCacheModel =
			(AnexosOutrosCacheModel)object;

		if (anexosOutrosId == anexosOutrosCacheModel.anexosOutrosId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, anexosOutrosId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", anexosOutrosId=");
		sb.append(anexosOutrosId);
		sb.append(", dadosRegistroId=");
		sb.append(dadosRegistroId);
		sb.append(", outrosAnexo=");
		sb.append(outrosAnexo);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public AnexosOutros toEntityModel() {
		AnexosOutrosImpl anexosOutrosImpl = new AnexosOutrosImpl();

		if (uuid == null) {
			anexosOutrosImpl.setUuid("");
		}
		else {
			anexosOutrosImpl.setUuid(uuid);
		}

		anexosOutrosImpl.setAnexosOutrosId(anexosOutrosId);
		anexosOutrosImpl.setDadosRegistroId(dadosRegistroId);
		anexosOutrosImpl.setOutrosAnexo(outrosAnexo);

		anexosOutrosImpl.resetOriginalValues();

		return anexosOutrosImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		anexosOutrosId = objectInput.readLong();

		dadosRegistroId = objectInput.readLong();

		outrosAnexo = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(anexosOutrosId);

		objectOutput.writeLong(dadosRegistroId);

		objectOutput.writeLong(outrosAnexo);
	}

	public String uuid;
	public long anexosOutrosId;
	public long dadosRegistroId;
	public long outrosAnexo;

}
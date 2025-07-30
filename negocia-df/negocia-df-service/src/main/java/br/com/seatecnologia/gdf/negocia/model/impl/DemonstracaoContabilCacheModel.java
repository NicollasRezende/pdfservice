/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.model.impl;

import br.com.seatecnologia.gdf.negocia.model.DemonstracaoContabil;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing DemonstracaoContabil in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class DemonstracaoContabilCacheModel
	implements CacheModel<DemonstracaoContabil>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof DemonstracaoContabilCacheModel)) {
			return false;
		}

		DemonstracaoContabilCacheModel demonstracaoContabilCacheModel =
			(DemonstracaoContabilCacheModel)object;

		if (demonstracaoId == demonstracaoContabilCacheModel.demonstracaoId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, demonstracaoId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", demonstracaoId=");
		sb.append(demonstracaoId);
		sb.append(", propostaId=");
		sb.append(propostaId);
		sb.append(", fileEntryId=");
		sb.append(fileEntryId);
		sb.append(", tipoDocumento=");
		sb.append(tipoDocumento);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public DemonstracaoContabil toEntityModel() {
		DemonstracaoContabilImpl demonstracaoContabilImpl =
			new DemonstracaoContabilImpl();

		if (uuid == null) {
			demonstracaoContabilImpl.setUuid("");
		}
		else {
			demonstracaoContabilImpl.setUuid(uuid);
		}

		demonstracaoContabilImpl.setDemonstracaoId(demonstracaoId);
		demonstracaoContabilImpl.setPropostaId(propostaId);
		demonstracaoContabilImpl.setFileEntryId(fileEntryId);
		demonstracaoContabilImpl.setTipoDocumento(tipoDocumento);

		demonstracaoContabilImpl.resetOriginalValues();

		return demonstracaoContabilImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		demonstracaoId = objectInput.readLong();

		propostaId = objectInput.readLong();

		fileEntryId = objectInput.readLong();

		tipoDocumento = objectInput.readInt();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(demonstracaoId);

		objectOutput.writeLong(propostaId);

		objectOutput.writeLong(fileEntryId);

		objectOutput.writeInt(tipoDocumento);
	}

	public String uuid;
	public long demonstracaoId;
	public long propostaId;
	public long fileEntryId;
	public int tipoDocumento;

}
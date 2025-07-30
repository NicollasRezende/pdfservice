/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.model.impl;

import br.com.seatecnologia.gdf.negocia.model.CredorProposta;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing CredorProposta in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class CredorPropostaCacheModel
	implements CacheModel<CredorProposta>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof CredorPropostaCacheModel)) {
			return false;
		}

		CredorPropostaCacheModel credorPropostaCacheModel =
			(CredorPropostaCacheModel)object;

		if (credorPropostaId == credorPropostaCacheModel.credorPropostaId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, credorPropostaId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", credorPropostaId=");
		sb.append(credorPropostaId);
		sb.append(", propostaId=");
		sb.append(propostaId);
		sb.append(", credorId=");
		sb.append(credorId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public CredorProposta toEntityModel() {
		CredorPropostaImpl credorPropostaImpl = new CredorPropostaImpl();

		if (uuid == null) {
			credorPropostaImpl.setUuid("");
		}
		else {
			credorPropostaImpl.setUuid(uuid);
		}

		credorPropostaImpl.setCredorPropostaId(credorPropostaId);
		credorPropostaImpl.setPropostaId(propostaId);
		credorPropostaImpl.setCredorId(credorId);

		credorPropostaImpl.resetOriginalValues();

		return credorPropostaImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		credorPropostaId = objectInput.readLong();

		propostaId = objectInput.readLong();

		credorId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(credorPropostaId);

		objectOutput.writeLong(propostaId);

		objectOutput.writeLong(credorId);
	}

	public String uuid;
	public long credorPropostaId;
	public long propostaId;
	public long credorId;

}
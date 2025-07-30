/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.model.impl;

import br.com.seatecnologia.gdf.negocia.model.AcaoJudicialProposta;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing AcaoJudicialProposta in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class AcaoJudicialPropostaCacheModel
	implements CacheModel<AcaoJudicialProposta>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof AcaoJudicialPropostaCacheModel)) {
			return false;
		}

		AcaoJudicialPropostaCacheModel acaoJudicialPropostaCacheModel =
			(AcaoJudicialPropostaCacheModel)object;

		if (acaoPropostaId == acaoJudicialPropostaCacheModel.acaoPropostaId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, acaoPropostaId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", acaoPropostaId=");
		sb.append(acaoPropostaId);
		sb.append(", propostaId=");
		sb.append(propostaId);
		sb.append(", acaoId=");
		sb.append(acaoId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public AcaoJudicialProposta toEntityModel() {
		AcaoJudicialPropostaImpl acaoJudicialPropostaImpl =
			new AcaoJudicialPropostaImpl();

		if (uuid == null) {
			acaoJudicialPropostaImpl.setUuid("");
		}
		else {
			acaoJudicialPropostaImpl.setUuid(uuid);
		}

		acaoJudicialPropostaImpl.setAcaoPropostaId(acaoPropostaId);
		acaoJudicialPropostaImpl.setPropostaId(propostaId);
		acaoJudicialPropostaImpl.setAcaoId(acaoId);

		acaoJudicialPropostaImpl.resetOriginalValues();

		return acaoJudicialPropostaImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		acaoPropostaId = objectInput.readLong();

		propostaId = objectInput.readLong();

		acaoId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(acaoPropostaId);

		objectOutput.writeLong(propostaId);

		objectOutput.writeLong(acaoId);
	}

	public String uuid;
	public long acaoPropostaId;
	public long propostaId;
	public long acaoId;

}
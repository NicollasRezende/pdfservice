/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.model.impl;

import br.com.seatecnologia.gdf.negocia.model.GarantiaProposta;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing GarantiaProposta in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class GarantiaPropostaCacheModel
	implements CacheModel<GarantiaProposta>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof GarantiaPropostaCacheModel)) {
			return false;
		}

		GarantiaPropostaCacheModel garantiaPropostaCacheModel =
			(GarantiaPropostaCacheModel)object;

		if (garantiaPropostaId ==
				garantiaPropostaCacheModel.garantiaPropostaId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, garantiaPropostaId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", garantiaPropostaId=");
		sb.append(garantiaPropostaId);
		sb.append(", propostaId=");
		sb.append(propostaId);
		sb.append(", garantiaId=");
		sb.append(garantiaId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public GarantiaProposta toEntityModel() {
		GarantiaPropostaImpl garantiaPropostaImpl = new GarantiaPropostaImpl();

		if (uuid == null) {
			garantiaPropostaImpl.setUuid("");
		}
		else {
			garantiaPropostaImpl.setUuid(uuid);
		}

		garantiaPropostaImpl.setGarantiaPropostaId(garantiaPropostaId);
		garantiaPropostaImpl.setPropostaId(propostaId);
		garantiaPropostaImpl.setGarantiaId(garantiaId);

		garantiaPropostaImpl.resetOriginalValues();

		return garantiaPropostaImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		garantiaPropostaId = objectInput.readLong();

		propostaId = objectInput.readLong();

		garantiaId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(garantiaPropostaId);

		objectOutput.writeLong(propostaId);

		objectOutput.writeLong(garantiaId);
	}

	public String uuid;
	public long garantiaPropostaId;
	public long propostaId;
	public long garantiaId;

}
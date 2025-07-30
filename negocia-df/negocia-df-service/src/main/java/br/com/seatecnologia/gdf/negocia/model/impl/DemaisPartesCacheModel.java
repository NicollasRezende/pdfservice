/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.model.impl;

import br.com.seatecnologia.gdf.negocia.model.DemaisPartes;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing DemaisPartes in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class DemaisPartesCacheModel
	implements CacheModel<DemaisPartes>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof DemaisPartesCacheModel)) {
			return false;
		}

		DemaisPartesCacheModel demaisPartesCacheModel =
			(DemaisPartesCacheModel)object;

		if (demaisPartesId == demaisPartesCacheModel.demaisPartesId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, demaisPartesId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", demaisPartesId=");
		sb.append(demaisPartesId);
		sb.append(", qualificacaoId=");
		sb.append(qualificacaoId);
		sb.append(", propostaId=");
		sb.append(propostaId);
		sb.append(", tipoParte=");
		sb.append(tipoParte);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public DemaisPartes toEntityModel() {
		DemaisPartesImpl demaisPartesImpl = new DemaisPartesImpl();

		if (uuid == null) {
			demaisPartesImpl.setUuid("");
		}
		else {
			demaisPartesImpl.setUuid(uuid);
		}

		demaisPartesImpl.setDemaisPartesId(demaisPartesId);
		demaisPartesImpl.setQualificacaoId(qualificacaoId);
		demaisPartesImpl.setPropostaId(propostaId);

		if (tipoParte == null) {
			demaisPartesImpl.setTipoParte("");
		}
		else {
			demaisPartesImpl.setTipoParte(tipoParte);
		}

		demaisPartesImpl.resetOriginalValues();

		return demaisPartesImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		demaisPartesId = objectInput.readLong();

		qualificacaoId = objectInput.readLong();

		propostaId = objectInput.readLong();
		tipoParte = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(demaisPartesId);

		objectOutput.writeLong(qualificacaoId);

		objectOutput.writeLong(propostaId);

		if (tipoParte == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(tipoParte);
		}
	}

	public String uuid;
	public long demaisPartesId;
	public long qualificacaoId;
	public long propostaId;
	public String tipoParte;

}
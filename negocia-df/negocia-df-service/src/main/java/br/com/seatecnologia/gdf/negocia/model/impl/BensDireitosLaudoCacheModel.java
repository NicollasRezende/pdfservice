/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.model.impl;

import br.com.seatecnologia.gdf.negocia.model.BensDireitosLaudo;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing BensDireitosLaudo in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class BensDireitosLaudoCacheModel
	implements CacheModel<BensDireitosLaudo>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof BensDireitosLaudoCacheModel)) {
			return false;
		}

		BensDireitosLaudoCacheModel bensDireitosLaudoCacheModel =
			(BensDireitosLaudoCacheModel)object;

		if (bensDireitosLaudoId ==
				bensDireitosLaudoCacheModel.bensDireitosLaudoId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, bensDireitosLaudoId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", bensDireitosLaudoId=");
		sb.append(bensDireitosLaudoId);
		sb.append(", bemId=");
		sb.append(bemId);
		sb.append(", laudoAvaliacao=");
		sb.append(laudoAvaliacao);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public BensDireitosLaudo toEntityModel() {
		BensDireitosLaudoImpl bensDireitosLaudoImpl =
			new BensDireitosLaudoImpl();

		if (uuid == null) {
			bensDireitosLaudoImpl.setUuid("");
		}
		else {
			bensDireitosLaudoImpl.setUuid(uuid);
		}

		bensDireitosLaudoImpl.setBensDireitosLaudoId(bensDireitosLaudoId);
		bensDireitosLaudoImpl.setBemId(bemId);
		bensDireitosLaudoImpl.setLaudoAvaliacao(laudoAvaliacao);

		bensDireitosLaudoImpl.resetOriginalValues();

		return bensDireitosLaudoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		bensDireitosLaudoId = objectInput.readLong();

		bemId = objectInput.readLong();

		laudoAvaliacao = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(bensDireitosLaudoId);

		objectOutput.writeLong(bemId);

		objectOutput.writeLong(laudoAvaliacao);
	}

	public String uuid;
	public long bensDireitosLaudoId;
	public long bemId;
	public long laudoAvaliacao;

}
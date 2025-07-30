/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.model.impl;

import br.com.seatecnologia.gdf.negocia.model.DemonstracaoDocumentos;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing DemonstracaoDocumentos in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class DemonstracaoDocumentosCacheModel
	implements CacheModel<DemonstracaoDocumentos>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof DemonstracaoDocumentosCacheModel)) {
			return false;
		}

		DemonstracaoDocumentosCacheModel demonstracaoDocumentosCacheModel =
			(DemonstracaoDocumentosCacheModel)object;

		if (demonstracaoDocumentosId ==
				demonstracaoDocumentosCacheModel.demonstracaoDocumentosId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, demonstracaoDocumentosId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", demonstracaoDocumentosId=");
		sb.append(demonstracaoDocumentosId);
		sb.append(", demonstracaoId=");
		sb.append(demonstracaoId);
		sb.append(", tipoDocumento=");
		sb.append(tipoDocumento);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public DemonstracaoDocumentos toEntityModel() {
		DemonstracaoDocumentosImpl demonstracaoDocumentosImpl =
			new DemonstracaoDocumentosImpl();

		if (uuid == null) {
			demonstracaoDocumentosImpl.setUuid("");
		}
		else {
			demonstracaoDocumentosImpl.setUuid(uuid);
		}

		demonstracaoDocumentosImpl.setDemonstracaoDocumentosId(
			demonstracaoDocumentosId);
		demonstracaoDocumentosImpl.setDemonstracaoId(demonstracaoId);
		demonstracaoDocumentosImpl.setTipoDocumento(tipoDocumento);

		demonstracaoDocumentosImpl.resetOriginalValues();

		return demonstracaoDocumentosImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		demonstracaoDocumentosId = objectInput.readLong();

		demonstracaoId = objectInput.readLong();

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

		objectOutput.writeLong(demonstracaoDocumentosId);

		objectOutput.writeLong(demonstracaoId);

		objectOutput.writeInt(tipoDocumento);
	}

	public String uuid;
	public long demonstracaoDocumentosId;
	public long demonstracaoId;
	public int tipoDocumento;

}
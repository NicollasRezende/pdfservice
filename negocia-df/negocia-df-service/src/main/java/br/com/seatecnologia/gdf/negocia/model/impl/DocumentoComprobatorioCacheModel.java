/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.model.impl;

import br.com.seatecnologia.gdf.negocia.model.DocumentoComprobatorio;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing DocumentoComprobatorio in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class DocumentoComprobatorioCacheModel
	implements CacheModel<DocumentoComprobatorio>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof DocumentoComprobatorioCacheModel)) {
			return false;
		}

		DocumentoComprobatorioCacheModel documentoComprobatorioCacheModel =
			(DocumentoComprobatorioCacheModel)object;

		if (documentoId == documentoComprobatorioCacheModel.documentoId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, documentoId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", documentoId=");
		sb.append(documentoId);
		sb.append(", fundamentacaoId=");
		sb.append(fundamentacaoId);
		sb.append(", fileEntryId=");
		sb.append(fileEntryId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public DocumentoComprobatorio toEntityModel() {
		DocumentoComprobatorioImpl documentoComprobatorioImpl =
			new DocumentoComprobatorioImpl();

		if (uuid == null) {
			documentoComprobatorioImpl.setUuid("");
		}
		else {
			documentoComprobatorioImpl.setUuid(uuid);
		}

		documentoComprobatorioImpl.setDocumentoId(documentoId);
		documentoComprobatorioImpl.setFundamentacaoId(fundamentacaoId);
		documentoComprobatorioImpl.setFileEntryId(fileEntryId);

		documentoComprobatorioImpl.resetOriginalValues();

		return documentoComprobatorioImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		documentoId = objectInput.readLong();

		fundamentacaoId = objectInput.readLong();

		fileEntryId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(documentoId);

		objectOutput.writeLong(fundamentacaoId);

		objectOutput.writeLong(fileEntryId);
	}

	public String uuid;
	public long documentoId;
	public long fundamentacaoId;
	public long fileEntryId;

}
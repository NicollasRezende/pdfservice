/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.model.impl;

import br.com.seatecnologia.gdf.negocia.model.TermoAssinado;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing TermoAssinado in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class TermoAssinadoCacheModel
	implements CacheModel<TermoAssinado>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof TermoAssinadoCacheModel)) {
			return false;
		}

		TermoAssinadoCacheModel termoAssinadoCacheModel =
			(TermoAssinadoCacheModel)object;

		if (termoId == termoAssinadoCacheModel.termoId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, termoId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(13);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", termoId=");
		sb.append(termoId);
		sb.append(", propostaId=");
		sb.append(propostaId);
		sb.append(", urlTermo=");
		sb.append(urlTermo);
		sb.append(", arquivoPdf=");
		sb.append(arquivoPdf);
		sb.append(", parte=");
		sb.append(parte);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public TermoAssinado toEntityModel() {
		TermoAssinadoImpl termoAssinadoImpl = new TermoAssinadoImpl();

		if (uuid == null) {
			termoAssinadoImpl.setUuid("");
		}
		else {
			termoAssinadoImpl.setUuid(uuid);
		}

		termoAssinadoImpl.setTermoId(termoId);
		termoAssinadoImpl.setPropostaId(propostaId);

		if (urlTermo == null) {
			termoAssinadoImpl.setUrlTermo("");
		}
		else {
			termoAssinadoImpl.setUrlTermo(urlTermo);
		}

		if (arquivoPdf == null) {
			termoAssinadoImpl.setArquivoPdf("");
		}
		else {
			termoAssinadoImpl.setArquivoPdf(arquivoPdf);
		}

		if (parte == null) {
			termoAssinadoImpl.setParte("");
		}
		else {
			termoAssinadoImpl.setParte(parte);
		}

		termoAssinadoImpl.resetOriginalValues();

		return termoAssinadoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		termoId = objectInput.readLong();

		propostaId = objectInput.readLong();
		urlTermo = objectInput.readUTF();
		arquivoPdf = objectInput.readUTF();
		parte = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(termoId);

		objectOutput.writeLong(propostaId);

		if (urlTermo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(urlTermo);
		}

		if (arquivoPdf == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(arquivoPdf);
		}

		if (parte == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(parte);
		}
	}

	public String uuid;
	public long termoId;
	public long propostaId;
	public String urlTermo;
	public String arquivoPdf;
	public String parte;

}
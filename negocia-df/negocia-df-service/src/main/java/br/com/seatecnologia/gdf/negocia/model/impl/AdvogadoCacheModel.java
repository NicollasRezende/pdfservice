/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.model.impl;

import br.com.seatecnologia.gdf.negocia.model.Advogado;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Advogado in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class AdvogadoCacheModel
	implements CacheModel<Advogado>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof AdvogadoCacheModel)) {
			return false;
		}

		AdvogadoCacheModel advogadoCacheModel = (AdvogadoCacheModel)object;

		if (advogadoId == advogadoCacheModel.advogadoId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, advogadoId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(13);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", advogadoId=");
		sb.append(advogadoId);
		sb.append(", qualificacaoId=");
		sb.append(qualificacaoId);
		sb.append(", numeroOab=");
		sb.append(numeroOab);
		sb.append(", seccional=");
		sb.append(seccional);
		sb.append(", carteirinhaOAB=");
		sb.append(carteirinhaOAB);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Advogado toEntityModel() {
		AdvogadoImpl advogadoImpl = new AdvogadoImpl();

		if (uuid == null) {
			advogadoImpl.setUuid("");
		}
		else {
			advogadoImpl.setUuid(uuid);
		}

		advogadoImpl.setAdvogadoId(advogadoId);
		advogadoImpl.setQualificacaoId(qualificacaoId);

		if (numeroOab == null) {
			advogadoImpl.setNumeroOab("");
		}
		else {
			advogadoImpl.setNumeroOab(numeroOab);
		}

		if (seccional == null) {
			advogadoImpl.setSeccional("");
		}
		else {
			advogadoImpl.setSeccional(seccional);
		}

		advogadoImpl.setCarteirinhaOAB(carteirinhaOAB);

		advogadoImpl.resetOriginalValues();

		return advogadoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		advogadoId = objectInput.readLong();

		qualificacaoId = objectInput.readLong();
		numeroOab = objectInput.readUTF();
		seccional = objectInput.readUTF();

		carteirinhaOAB = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(advogadoId);

		objectOutput.writeLong(qualificacaoId);

		if (numeroOab == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(numeroOab);
		}

		if (seccional == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(seccional);
		}

		objectOutput.writeLong(carteirinhaOAB);
	}

	public String uuid;
	public long advogadoId;
	public long qualificacaoId;
	public String numeroOab;
	public String seccional;
	public long carteirinhaOAB;

}
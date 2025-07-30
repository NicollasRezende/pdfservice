/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.model.impl;

import br.com.seatecnologia.gdf.negocia.model.AdministradorJudicial;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing AdministradorJudicial in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class AdministradorJudicialCacheModel
	implements CacheModel<AdministradorJudicial>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof AdministradorJudicialCacheModel)) {
			return false;
		}

		AdministradorJudicialCacheModel administradorJudicialCacheModel =
			(AdministradorJudicialCacheModel)object;

		if (administradorJudicialId ==
				administradorJudicialCacheModel.administradorJudicialId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, administradorJudicialId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", administradorJudicialId=");
		sb.append(administradorJudicialId);
		sb.append(", qualificacaoId=");
		sb.append(qualificacaoId);
		sb.append(", regimeFalencia=");
		sb.append(regimeFalencia);
		sb.append(", recuperacao=");
		sb.append(recuperacao);
		sb.append(", numeroProcesso=");
		sb.append(numeroProcesso);
		sb.append(", anexoRecuperacao=");
		sb.append(anexoRecuperacao);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public AdministradorJudicial toEntityModel() {
		AdministradorJudicialImpl administradorJudicialImpl =
			new AdministradorJudicialImpl();

		if (uuid == null) {
			administradorJudicialImpl.setUuid("");
		}
		else {
			administradorJudicialImpl.setUuid(uuid);
		}

		administradorJudicialImpl.setAdministradorJudicialId(
			administradorJudicialId);
		administradorJudicialImpl.setQualificacaoId(qualificacaoId);
		administradorJudicialImpl.setRegimeFalencia(regimeFalencia);

		if (recuperacao == null) {
			administradorJudicialImpl.setRecuperacao("");
		}
		else {
			administradorJudicialImpl.setRecuperacao(recuperacao);
		}

		if (numeroProcesso == null) {
			administradorJudicialImpl.setNumeroProcesso("");
		}
		else {
			administradorJudicialImpl.setNumeroProcesso(numeroProcesso);
		}

		administradorJudicialImpl.setAnexoRecuperacao(anexoRecuperacao);

		administradorJudicialImpl.resetOriginalValues();

		return administradorJudicialImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		administradorJudicialId = objectInput.readLong();

		qualificacaoId = objectInput.readLong();

		regimeFalencia = objectInput.readBoolean();
		recuperacao = objectInput.readUTF();
		numeroProcesso = objectInput.readUTF();

		anexoRecuperacao = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(administradorJudicialId);

		objectOutput.writeLong(qualificacaoId);

		objectOutput.writeBoolean(regimeFalencia);

		if (recuperacao == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(recuperacao);
		}

		if (numeroProcesso == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(numeroProcesso);
		}

		objectOutput.writeLong(anexoRecuperacao);
	}

	public String uuid;
	public long administradorJudicialId;
	public long qualificacaoId;
	public boolean regimeFalencia;
	public String recuperacao;
	public String numeroProcesso;
	public long anexoRecuperacao;

}
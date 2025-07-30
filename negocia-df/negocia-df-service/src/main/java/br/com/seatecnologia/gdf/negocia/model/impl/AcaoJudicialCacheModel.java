/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.model.impl;

import br.com.seatecnologia.gdf.negocia.model.AcaoJudicial;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing AcaoJudicial in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class AcaoJudicialCacheModel
	implements CacheModel<AcaoJudicial>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof AcaoJudicialCacheModel)) {
			return false;
		}

		AcaoJudicialCacheModel acaoJudicialCacheModel =
			(AcaoJudicialCacheModel)object;

		if (acaoId == acaoJudicialCacheModel.acaoId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, acaoId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", acaoId=");
		sb.append(acaoId);
		sb.append(", orgaoTribunal=");
		sb.append(orgaoTribunal);
		sb.append(", numeroProcesso=");
		sb.append(numeroProcesso);
		sb.append(", unidadeVara=");
		sb.append(unidadeVara);
		sb.append(", parteAutora=");
		sb.append(parteAutora);
		sb.append(", parteRe=");
		sb.append(parteRe);
		sb.append(", observacoes=");
		sb.append(observacoes);
		sb.append(", propostaId=");
		sb.append(propostaId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public AcaoJudicial toEntityModel() {
		AcaoJudicialImpl acaoJudicialImpl = new AcaoJudicialImpl();

		if (uuid == null) {
			acaoJudicialImpl.setUuid("");
		}
		else {
			acaoJudicialImpl.setUuid(uuid);
		}

		acaoJudicialImpl.setAcaoId(acaoId);

		if (orgaoTribunal == null) {
			acaoJudicialImpl.setOrgaoTribunal("");
		}
		else {
			acaoJudicialImpl.setOrgaoTribunal(orgaoTribunal);
		}

		if (numeroProcesso == null) {
			acaoJudicialImpl.setNumeroProcesso("");
		}
		else {
			acaoJudicialImpl.setNumeroProcesso(numeroProcesso);
		}

		if (unidadeVara == null) {
			acaoJudicialImpl.setUnidadeVara("");
		}
		else {
			acaoJudicialImpl.setUnidadeVara(unidadeVara);
		}

		if (parteAutora == null) {
			acaoJudicialImpl.setParteAutora("");
		}
		else {
			acaoJudicialImpl.setParteAutora(parteAutora);
		}

		if (parteRe == null) {
			acaoJudicialImpl.setParteRe("");
		}
		else {
			acaoJudicialImpl.setParteRe(parteRe);
		}

		if (observacoes == null) {
			acaoJudicialImpl.setObservacoes("");
		}
		else {
			acaoJudicialImpl.setObservacoes(observacoes);
		}

		acaoJudicialImpl.setPropostaId(propostaId);

		acaoJudicialImpl.resetOriginalValues();

		return acaoJudicialImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		acaoId = objectInput.readLong();
		orgaoTribunal = objectInput.readUTF();
		numeroProcesso = objectInput.readUTF();
		unidadeVara = objectInput.readUTF();
		parteAutora = objectInput.readUTF();
		parteRe = objectInput.readUTF();
		observacoes = objectInput.readUTF();

		propostaId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(acaoId);

		if (orgaoTribunal == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(orgaoTribunal);
		}

		if (numeroProcesso == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(numeroProcesso);
		}

		if (unidadeVara == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(unidadeVara);
		}

		if (parteAutora == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(parteAutora);
		}

		if (parteRe == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(parteRe);
		}

		if (observacoes == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(observacoes);
		}

		objectOutput.writeLong(propostaId);
	}

	public String uuid;
	public long acaoId;
	public String orgaoTribunal;
	public String numeroProcesso;
	public String unidadeVara;
	public String parteAutora;
	public String parteRe;
	public String observacoes;
	public long propostaId;

}
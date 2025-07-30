/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.model.impl;

import br.com.seatecnologia.gdf.negocia.model.DadosContribuinte;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing DadosContribuinte in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class DadosContribuinteCacheModel
	implements CacheModel<DadosContribuinte>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof DadosContribuinteCacheModel)) {
			return false;
		}

		DadosContribuinteCacheModel dadosContribuinteCacheModel =
			(DadosContribuinteCacheModel)object;

		if (dadosContribuinteId ==
				dadosContribuinteCacheModel.dadosContribuinteId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, dadosContribuinteId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", dadosContribuinteId=");
		sb.append(dadosContribuinteId);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", qualificacaoId=");
		sb.append(qualificacaoId);
		sb.append(", propostaId=");
		sb.append(propostaId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public DadosContribuinte toEntityModel() {
		DadosContribuinteImpl dadosContribuinteImpl =
			new DadosContribuinteImpl();

		if (uuid == null) {
			dadosContribuinteImpl.setUuid("");
		}
		else {
			dadosContribuinteImpl.setUuid(uuid);
		}

		dadosContribuinteImpl.setDadosContribuinteId(dadosContribuinteId);

		if (createDate == Long.MIN_VALUE) {
			dadosContribuinteImpl.setCreateDate(null);
		}
		else {
			dadosContribuinteImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			dadosContribuinteImpl.setModifiedDate(null);
		}
		else {
			dadosContribuinteImpl.setModifiedDate(new Date(modifiedDate));
		}

		dadosContribuinteImpl.setUserId(userId);
		dadosContribuinteImpl.setGroupId(groupId);
		dadosContribuinteImpl.setCompanyId(companyId);
		dadosContribuinteImpl.setQualificacaoId(qualificacaoId);
		dadosContribuinteImpl.setPropostaId(propostaId);

		dadosContribuinteImpl.resetOriginalValues();

		return dadosContribuinteImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		dadosContribuinteId = objectInput.readLong();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();

		userId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		qualificacaoId = objectInput.readLong();

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

		objectOutput.writeLong(dadosContribuinteId);
		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		objectOutput.writeLong(userId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(qualificacaoId);

		objectOutput.writeLong(propostaId);
	}

	public String uuid;
	public long dadosContribuinteId;
	public long createDate;
	public long modifiedDate;
	public long userId;
	public long groupId;
	public long companyId;
	public long qualificacaoId;
	public long propostaId;

}
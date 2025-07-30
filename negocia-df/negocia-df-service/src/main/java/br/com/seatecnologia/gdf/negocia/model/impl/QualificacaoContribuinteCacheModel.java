/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.model.impl;

import br.com.seatecnologia.gdf.negocia.model.QualificacaoContribuinte;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing QualificacaoContribuinte in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class QualificacaoContribuinteCacheModel
	implements CacheModel<QualificacaoContribuinte>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof QualificacaoContribuinteCacheModel)) {
			return false;
		}

		QualificacaoContribuinteCacheModel qualificacaoContribuinteCacheModel =
			(QualificacaoContribuinteCacheModel)object;

		if (qualificacaoContribuinteId ==
				qualificacaoContribuinteCacheModel.qualificacaoContribuinteId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, qualificacaoContribuinteId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", qualificacaoContribuinteId=");
		sb.append(qualificacaoContribuinteId);
		sb.append(", dadosContribuinteId=");
		sb.append(dadosContribuinteId);
		sb.append(", qualificacaoId=");
		sb.append(qualificacaoId);
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
		sb.append(", tipoQualificacao=");
		sb.append(tipoQualificacao);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public QualificacaoContribuinte toEntityModel() {
		QualificacaoContribuinteImpl qualificacaoContribuinteImpl =
			new QualificacaoContribuinteImpl();

		if (uuid == null) {
			qualificacaoContribuinteImpl.setUuid("");
		}
		else {
			qualificacaoContribuinteImpl.setUuid(uuid);
		}

		qualificacaoContribuinteImpl.setQualificacaoContribuinteId(
			qualificacaoContribuinteId);
		qualificacaoContribuinteImpl.setDadosContribuinteId(
			dadosContribuinteId);
		qualificacaoContribuinteImpl.setQualificacaoId(qualificacaoId);

		if (createDate == Long.MIN_VALUE) {
			qualificacaoContribuinteImpl.setCreateDate(null);
		}
		else {
			qualificacaoContribuinteImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			qualificacaoContribuinteImpl.setModifiedDate(null);
		}
		else {
			qualificacaoContribuinteImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		qualificacaoContribuinteImpl.setUserId(userId);
		qualificacaoContribuinteImpl.setGroupId(groupId);
		qualificacaoContribuinteImpl.setCompanyId(companyId);

		if (tipoQualificacao == null) {
			qualificacaoContribuinteImpl.setTipoQualificacao("");
		}
		else {
			qualificacaoContribuinteImpl.setTipoQualificacao(tipoQualificacao);
		}

		qualificacaoContribuinteImpl.resetOriginalValues();

		return qualificacaoContribuinteImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		qualificacaoContribuinteId = objectInput.readLong();

		dadosContribuinteId = objectInput.readLong();

		qualificacaoId = objectInput.readLong();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();

		userId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();
		tipoQualificacao = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(qualificacaoContribuinteId);

		objectOutput.writeLong(dadosContribuinteId);

		objectOutput.writeLong(qualificacaoId);
		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		objectOutput.writeLong(userId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		if (tipoQualificacao == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(tipoQualificacao);
		}
	}

	public String uuid;
	public long qualificacaoContribuinteId;
	public long dadosContribuinteId;
	public long qualificacaoId;
	public long createDate;
	public long modifiedDate;
	public long userId;
	public long groupId;
	public long companyId;
	public String tipoQualificacao;

}
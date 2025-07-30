/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.model.impl;

import br.com.seatecnologia.gdf.negocia.model.Edital;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Edital in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class EditalCacheModel implements CacheModel<Edital>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof EditalCacheModel)) {
			return false;
		}

		EditalCacheModel editalCacheModel = (EditalCacheModel)object;

		if (editalId == editalCacheModel.editalId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, editalId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", editalId=");
		sb.append(editalId);
		sb.append(", titulo=");
		sb.append(titulo);
		sb.append(", descricao=");
		sb.append(descricao);
		sb.append(", arquivo=");
		sb.append(arquivo);
		sb.append(", dataInicio=");
		sb.append(dataInicio);
		sb.append(", dataFim=");
		sb.append(dataFim);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Edital toEntityModel() {
		EditalImpl editalImpl = new EditalImpl();

		if (uuid == null) {
			editalImpl.setUuid("");
		}
		else {
			editalImpl.setUuid(uuid);
		}

		editalImpl.setEditalId(editalId);

		if (titulo == null) {
			editalImpl.setTitulo("");
		}
		else {
			editalImpl.setTitulo(titulo);
		}

		if (descricao == null) {
			editalImpl.setDescricao("");
		}
		else {
			editalImpl.setDescricao(descricao);
		}

		editalImpl.setArquivo(arquivo);

		if (dataInicio == Long.MIN_VALUE) {
			editalImpl.setDataInicio(null);
		}
		else {
			editalImpl.setDataInicio(new Date(dataInicio));
		}

		if (dataFim == Long.MIN_VALUE) {
			editalImpl.setDataFim(null);
		}
		else {
			editalImpl.setDataFim(new Date(dataFim));
		}

		editalImpl.resetOriginalValues();

		return editalImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		editalId = objectInput.readLong();
		titulo = objectInput.readUTF();
		descricao = objectInput.readUTF();

		arquivo = objectInput.readLong();
		dataInicio = objectInput.readLong();
		dataFim = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(editalId);

		if (titulo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(titulo);
		}

		if (descricao == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(descricao);
		}

		objectOutput.writeLong(arquivo);
		objectOutput.writeLong(dataInicio);
		objectOutput.writeLong(dataFim);
	}

	public String uuid;
	public long editalId;
	public String titulo;
	public String descricao;
	public long arquivo;
	public long dataInicio;
	public long dataFim;

}
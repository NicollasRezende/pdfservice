/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.model.impl;

import br.com.seatecnologia.gdf.negocia.model.ComprovanteHonorario;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing ComprovanteHonorario in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class ComprovanteHonorarioCacheModel
	implements CacheModel<ComprovanteHonorario>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof ComprovanteHonorarioCacheModel)) {
			return false;
		}

		ComprovanteHonorarioCacheModel comprovanteHonorarioCacheModel =
			(ComprovanteHonorarioCacheModel)object;

		if (comprovanteId == comprovanteHonorarioCacheModel.comprovanteId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, comprovanteId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(13);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", comprovanteId=");
		sb.append(comprovanteId);
		sb.append(", propostaId=");
		sb.append(propostaId);
		sb.append(", valorPago=");
		sb.append(valorPago);
		sb.append(", dataPagamento=");
		sb.append(dataPagamento);
		sb.append(", fileEntryId=");
		sb.append(fileEntryId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public ComprovanteHonorario toEntityModel() {
		ComprovanteHonorarioImpl comprovanteHonorarioImpl =
			new ComprovanteHonorarioImpl();

		if (uuid == null) {
			comprovanteHonorarioImpl.setUuid("");
		}
		else {
			comprovanteHonorarioImpl.setUuid(uuid);
		}

		comprovanteHonorarioImpl.setComprovanteId(comprovanteId);
		comprovanteHonorarioImpl.setPropostaId(propostaId);
		comprovanteHonorarioImpl.setValorPago(valorPago);

		if (dataPagamento == Long.MIN_VALUE) {
			comprovanteHonorarioImpl.setDataPagamento(null);
		}
		else {
			comprovanteHonorarioImpl.setDataPagamento(new Date(dataPagamento));
		}

		comprovanteHonorarioImpl.setFileEntryId(fileEntryId);

		comprovanteHonorarioImpl.resetOriginalValues();

		return comprovanteHonorarioImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		comprovanteId = objectInput.readLong();

		propostaId = objectInput.readLong();

		valorPago = objectInput.readDouble();
		dataPagamento = objectInput.readLong();

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

		objectOutput.writeLong(comprovanteId);

		objectOutput.writeLong(propostaId);

		objectOutput.writeDouble(valorPago);
		objectOutput.writeLong(dataPagamento);

		objectOutput.writeLong(fileEntryId);
	}

	public String uuid;
	public long comprovanteId;
	public long propostaId;
	public double valorPago;
	public long dataPagamento;
	public long fileEntryId;

}
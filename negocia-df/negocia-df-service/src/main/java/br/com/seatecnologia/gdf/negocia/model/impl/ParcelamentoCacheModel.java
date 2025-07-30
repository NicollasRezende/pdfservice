/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.model.impl;

import br.com.seatecnologia.gdf.negocia.model.Parcelamento;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Parcelamento in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class ParcelamentoCacheModel
	implements CacheModel<Parcelamento>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof ParcelamentoCacheModel)) {
			return false;
		}

		ParcelamentoCacheModel parcelamentoCacheModel =
			(ParcelamentoCacheModel)object;

		if (parcelamentoId == parcelamentoCacheModel.parcelamentoId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, parcelamentoId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", parcelamentoId=");
		sb.append(parcelamentoId);
		sb.append(", propostaId=");
		sb.append(propostaId);
		sb.append(", numeroParcelas=");
		sb.append(numeroParcelas);
		sb.append(", valorEntrada=");
		sb.append(valorEntrada);
		sb.append(", dataPrimeiraParcela=");
		sb.append(dataPrimeiraParcela);
		sb.append(", valorPrimeiraParcela=");
		sb.append(valorPrimeiraParcela);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Parcelamento toEntityModel() {
		ParcelamentoImpl parcelamentoImpl = new ParcelamentoImpl();

		if (uuid == null) {
			parcelamentoImpl.setUuid("");
		}
		else {
			parcelamentoImpl.setUuid(uuid);
		}

		parcelamentoImpl.setParcelamentoId(parcelamentoId);
		parcelamentoImpl.setPropostaId(propostaId);
		parcelamentoImpl.setNumeroParcelas(numeroParcelas);
		parcelamentoImpl.setValorEntrada(valorEntrada);

		if (dataPrimeiraParcela == Long.MIN_VALUE) {
			parcelamentoImpl.setDataPrimeiraParcela(null);
		}
		else {
			parcelamentoImpl.setDataPrimeiraParcela(
				new Date(dataPrimeiraParcela));
		}

		parcelamentoImpl.setValorPrimeiraParcela(valorPrimeiraParcela);

		parcelamentoImpl.resetOriginalValues();

		return parcelamentoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		parcelamentoId = objectInput.readLong();

		propostaId = objectInput.readLong();

		numeroParcelas = objectInput.readInt();

		valorEntrada = objectInput.readDouble();
		dataPrimeiraParcela = objectInput.readLong();

		valorPrimeiraParcela = objectInput.readDouble();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(parcelamentoId);

		objectOutput.writeLong(propostaId);

		objectOutput.writeInt(numeroParcelas);

		objectOutput.writeDouble(valorEntrada);
		objectOutput.writeLong(dataPrimeiraParcela);

		objectOutput.writeDouble(valorPrimeiraParcela);
	}

	public String uuid;
	public long parcelamentoId;
	public long propostaId;
	public int numeroParcelas;
	public double valorEntrada;
	public long dataPrimeiraParcela;
	public double valorPrimeiraParcela;

}
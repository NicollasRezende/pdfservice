/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.model.impl;

import br.com.seatecnologia.gdf.negocia.model.CreditoTransacionado;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing CreditoTransacionado in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class CreditoTransacionadoCacheModel
	implements CacheModel<CreditoTransacionado>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof CreditoTransacionadoCacheModel)) {
			return false;
		}

		CreditoTransacionadoCacheModel creditoTransacionadoCacheModel =
			(CreditoTransacionadoCacheModel)object;

		if (creditoId == creditoTransacionadoCacheModel.creditoId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, creditoId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", creditoId=");
		sb.append(creditoId);
		sb.append(", propostaId=");
		sb.append(propostaId);
		sb.append(", numeroInscricao=");
		sb.append(numeroInscricao);
		sb.append(", codigoReceita=");
		sb.append(codigoReceita);
		sb.append(", dataInscricao=");
		sb.append(dataInscricao);
		sb.append(", valorAtualizado=");
		sb.append(valorAtualizado);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public CreditoTransacionado toEntityModel() {
		CreditoTransacionadoImpl creditoTransacionadoImpl =
			new CreditoTransacionadoImpl();

		if (uuid == null) {
			creditoTransacionadoImpl.setUuid("");
		}
		else {
			creditoTransacionadoImpl.setUuid(uuid);
		}

		creditoTransacionadoImpl.setCreditoId(creditoId);
		creditoTransacionadoImpl.setPropostaId(propostaId);

		if (numeroInscricao == null) {
			creditoTransacionadoImpl.setNumeroInscricao("");
		}
		else {
			creditoTransacionadoImpl.setNumeroInscricao(numeroInscricao);
		}

		if (codigoReceita == null) {
			creditoTransacionadoImpl.setCodigoReceita("");
		}
		else {
			creditoTransacionadoImpl.setCodigoReceita(codigoReceita);
		}

		if (dataInscricao == Long.MIN_VALUE) {
			creditoTransacionadoImpl.setDataInscricao(null);
		}
		else {
			creditoTransacionadoImpl.setDataInscricao(new Date(dataInscricao));
		}

		creditoTransacionadoImpl.setValorAtualizado(valorAtualizado);

		creditoTransacionadoImpl.resetOriginalValues();

		return creditoTransacionadoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		creditoId = objectInput.readLong();

		propostaId = objectInput.readLong();
		numeroInscricao = objectInput.readUTF();
		codigoReceita = objectInput.readUTF();
		dataInscricao = objectInput.readLong();

		valorAtualizado = objectInput.readDouble();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(creditoId);

		objectOutput.writeLong(propostaId);

		if (numeroInscricao == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(numeroInscricao);
		}

		if (codigoReceita == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(codigoReceita);
		}

		objectOutput.writeLong(dataInscricao);

		objectOutput.writeDouble(valorAtualizado);
	}

	public String uuid;
	public long creditoId;
	public long propostaId;
	public String numeroInscricao;
	public String codigoReceita;
	public long dataInscricao;
	public double valorAtualizado;

}
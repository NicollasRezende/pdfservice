/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.model.impl;

import br.com.seatecnologia.gdf.negocia.model.DadosRegistro;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing DadosRegistro in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class DadosRegistroCacheModel
	implements CacheModel<DadosRegistro>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof DadosRegistroCacheModel)) {
			return false;
		}

		DadosRegistroCacheModel dadosRegistroCacheModel =
			(DadosRegistroCacheModel)object;

		if (dadosRegistroId == dadosRegistroCacheModel.dadosRegistroId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, dadosRegistroId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", dadosRegistroId=");
		sb.append(dadosRegistroId);
		sb.append(", garantiaId=");
		sb.append(garantiaId);
		sb.append(", matriculaImovel=");
		sb.append(matriculaImovel);
		sb.append(", cartorioRegistro=");
		sb.append(cartorioRegistro);
		sb.append(", renavam=");
		sb.append(renavam);
		sb.append(", localizacao=");
		sb.append(localizacao);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public DadosRegistro toEntityModel() {
		DadosRegistroImpl dadosRegistroImpl = new DadosRegistroImpl();

		if (uuid == null) {
			dadosRegistroImpl.setUuid("");
		}
		else {
			dadosRegistroImpl.setUuid(uuid);
		}

		dadosRegistroImpl.setDadosRegistroId(dadosRegistroId);
		dadosRegistroImpl.setGarantiaId(garantiaId);

		if (matriculaImovel == null) {
			dadosRegistroImpl.setMatriculaImovel("");
		}
		else {
			dadosRegistroImpl.setMatriculaImovel(matriculaImovel);
		}

		if (cartorioRegistro == null) {
			dadosRegistroImpl.setCartorioRegistro("");
		}
		else {
			dadosRegistroImpl.setCartorioRegistro(cartorioRegistro);
		}

		if (renavam == null) {
			dadosRegistroImpl.setRenavam("");
		}
		else {
			dadosRegistroImpl.setRenavam(renavam);
		}

		if (localizacao == null) {
			dadosRegistroImpl.setLocalizacao("");
		}
		else {
			dadosRegistroImpl.setLocalizacao(localizacao);
		}

		dadosRegistroImpl.resetOriginalValues();

		return dadosRegistroImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		dadosRegistroId = objectInput.readLong();

		garantiaId = objectInput.readLong();
		matriculaImovel = objectInput.readUTF();
		cartorioRegistro = objectInput.readUTF();
		renavam = objectInput.readUTF();
		localizacao = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(dadosRegistroId);

		objectOutput.writeLong(garantiaId);

		if (matriculaImovel == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(matriculaImovel);
		}

		if (cartorioRegistro == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(cartorioRegistro);
		}

		if (renavam == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(renavam);
		}

		if (localizacao == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(localizacao);
		}
	}

	public String uuid;
	public long dadosRegistroId;
	public long garantiaId;
	public String matriculaImovel;
	public String cartorioRegistro;
	public String renavam;
	public String localizacao;

}
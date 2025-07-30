/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.model.impl;

import br.com.seatecnologia.gdf.negocia.model.Endereco;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Endereco in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class EnderecoCacheModel
	implements CacheModel<Endereco>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof EnderecoCacheModel)) {
			return false;
		}

		EnderecoCacheModel enderecoCacheModel = (EnderecoCacheModel)object;

		if (enderecoId == enderecoCacheModel.enderecoId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, enderecoId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", enderecoId=");
		sb.append(enderecoId);
		sb.append(", cep=");
		sb.append(cep);
		sb.append(", endereco=");
		sb.append(endereco);
		sb.append(", numero=");
		sb.append(numero);
		sb.append(", estado=");
		sb.append(estado);
		sb.append(", municipio=");
		sb.append(municipio);
		sb.append(", bairro=");
		sb.append(bairro);
		sb.append(", complemento=");
		sb.append(complemento);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Endereco toEntityModel() {
		EnderecoImpl enderecoImpl = new EnderecoImpl();

		if (uuid == null) {
			enderecoImpl.setUuid("");
		}
		else {
			enderecoImpl.setUuid(uuid);
		}

		enderecoImpl.setEnderecoId(enderecoId);

		if (cep == null) {
			enderecoImpl.setCep("");
		}
		else {
			enderecoImpl.setCep(cep);
		}

		if (endereco == null) {
			enderecoImpl.setEndereco("");
		}
		else {
			enderecoImpl.setEndereco(endereco);
		}

		if (numero == null) {
			enderecoImpl.setNumero("");
		}
		else {
			enderecoImpl.setNumero(numero);
		}

		if (estado == null) {
			enderecoImpl.setEstado("");
		}
		else {
			enderecoImpl.setEstado(estado);
		}

		if (municipio == null) {
			enderecoImpl.setMunicipio("");
		}
		else {
			enderecoImpl.setMunicipio(municipio);
		}

		if (bairro == null) {
			enderecoImpl.setBairro("");
		}
		else {
			enderecoImpl.setBairro(bairro);
		}

		if (complemento == null) {
			enderecoImpl.setComplemento("");
		}
		else {
			enderecoImpl.setComplemento(complemento);
		}

		enderecoImpl.resetOriginalValues();

		return enderecoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		enderecoId = objectInput.readLong();
		cep = objectInput.readUTF();
		endereco = objectInput.readUTF();
		numero = objectInput.readUTF();
		estado = objectInput.readUTF();
		municipio = objectInput.readUTF();
		bairro = objectInput.readUTF();
		complemento = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(enderecoId);

		if (cep == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(cep);
		}

		if (endereco == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(endereco);
		}

		if (numero == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(numero);
		}

		if (estado == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(estado);
		}

		if (municipio == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(municipio);
		}

		if (bairro == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(bairro);
		}

		if (complemento == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(complemento);
		}
	}

	public String uuid;
	public long enderecoId;
	public String cep;
	public String endereco;
	public String numero;
	public String estado;
	public String municipio;
	public String bairro;
	public String complemento;

}
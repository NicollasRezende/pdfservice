/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.model.impl;

import br.com.seatecnologia.gdf.negocia.model.IdentificacaoDebitos;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing IdentificacaoDebitos in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class IdentificacaoDebitosCacheModel
	implements CacheModel<IdentificacaoDebitos>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof IdentificacaoDebitosCacheModel)) {
			return false;
		}

		IdentificacaoDebitosCacheModel identificacaoDebitosCacheModel =
			(IdentificacaoDebitosCacheModel)object;

		if (identificacaoDebitosId ==
				identificacaoDebitosCacheModel.identificacaoDebitosId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, identificacaoDebitosId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", identificacaoDebitosId=");
		sb.append(identificacaoDebitosId);
		sb.append(", fundamentacaoId=");
		sb.append(fundamentacaoId);
		sb.append(", natureza=");
		sb.append(natureza);
		sb.append(", situacao=");
		sb.append(situacao);
		sb.append(", inscricaoDividaAtiva=");
		sb.append(inscricaoDividaAtiva);
		sb.append(", garantidoJudicialmente=");
		sb.append(garantidoJudicialmente);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public IdentificacaoDebitos toEntityModel() {
		IdentificacaoDebitosImpl identificacaoDebitosImpl =
			new IdentificacaoDebitosImpl();

		if (uuid == null) {
			identificacaoDebitosImpl.setUuid("");
		}
		else {
			identificacaoDebitosImpl.setUuid(uuid);
		}

		identificacaoDebitosImpl.setIdentificacaoDebitosId(
			identificacaoDebitosId);
		identificacaoDebitosImpl.setFundamentacaoId(fundamentacaoId);

		if (natureza == null) {
			identificacaoDebitosImpl.setNatureza("");
		}
		else {
			identificacaoDebitosImpl.setNatureza(natureza);
		}

		if (situacao == null) {
			identificacaoDebitosImpl.setSituacao("");
		}
		else {
			identificacaoDebitosImpl.setSituacao(situacao);
		}

		if (inscricaoDividaAtiva == null) {
			identificacaoDebitosImpl.setInscricaoDividaAtiva("");
		}
		else {
			identificacaoDebitosImpl.setInscricaoDividaAtiva(
				inscricaoDividaAtiva);
		}

		if (garantidoJudicialmente == null) {
			identificacaoDebitosImpl.setGarantidoJudicialmente("");
		}
		else {
			identificacaoDebitosImpl.setGarantidoJudicialmente(
				garantidoJudicialmente);
		}

		identificacaoDebitosImpl.resetOriginalValues();

		return identificacaoDebitosImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		identificacaoDebitosId = objectInput.readLong();

		fundamentacaoId = objectInput.readLong();
		natureza = objectInput.readUTF();
		situacao = objectInput.readUTF();
		inscricaoDividaAtiva = objectInput.readUTF();
		garantidoJudicialmente = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(identificacaoDebitosId);

		objectOutput.writeLong(fundamentacaoId);

		if (natureza == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(natureza);
		}

		if (situacao == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(situacao);
		}

		if (inscricaoDividaAtiva == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(inscricaoDividaAtiva);
		}

		if (garantidoJudicialmente == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(garantidoJudicialmente);
		}
	}

	public String uuid;
	public long identificacaoDebitosId;
	public long fundamentacaoId;
	public String natureza;
	public String situacao;
	public String inscricaoDividaAtiva;
	public String garantidoJudicialmente;

}
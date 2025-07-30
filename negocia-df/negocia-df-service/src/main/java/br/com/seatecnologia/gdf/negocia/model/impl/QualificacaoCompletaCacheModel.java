/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.model.impl;

import br.com.seatecnologia.gdf.negocia.model.QualificacaoCompleta;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing QualificacaoCompleta in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class QualificacaoCompletaCacheModel
	implements CacheModel<QualificacaoCompleta>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof QualificacaoCompletaCacheModel)) {
			return false;
		}

		QualificacaoCompletaCacheModel qualificacaoCompletaCacheModel =
			(QualificacaoCompletaCacheModel)object;

		if (qualificacaoId == qualificacaoCompletaCacheModel.qualificacaoId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, qualificacaoId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", qualificacaoId=");
		sb.append(qualificacaoId);
		sb.append(", tipoPessoa=");
		sb.append(tipoPessoa);
		sb.append(", nomeRazaoSocial=");
		sb.append(nomeRazaoSocial);
		sb.append(", nomeFantasia=");
		sb.append(nomeFantasia);
		sb.append(", representanteLegal=");
		sb.append(representanteLegal);
		sb.append(", cpfCnpj=");
		sb.append(cpfCnpj);
		sb.append(", domicilioFiscal=");
		sb.append(domicilioFiscal);
		sb.append(", numeroCfdf=");
		sb.append(numeroCfdf);
		sb.append(", email=");
		sb.append(email);
		sb.append(", telefone=");
		sb.append(telefone);
		sb.append(", whatsapp=");
		sb.append(whatsapp);
		sb.append(", enderecoPostalId=");
		sb.append(enderecoPostalId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public QualificacaoCompleta toEntityModel() {
		QualificacaoCompletaImpl qualificacaoCompletaImpl =
			new QualificacaoCompletaImpl();

		if (uuid == null) {
			qualificacaoCompletaImpl.setUuid("");
		}
		else {
			qualificacaoCompletaImpl.setUuid(uuid);
		}

		qualificacaoCompletaImpl.setQualificacaoId(qualificacaoId);

		if (tipoPessoa == null) {
			qualificacaoCompletaImpl.setTipoPessoa("");
		}
		else {
			qualificacaoCompletaImpl.setTipoPessoa(tipoPessoa);
		}

		if (nomeRazaoSocial == null) {
			qualificacaoCompletaImpl.setNomeRazaoSocial("");
		}
		else {
			qualificacaoCompletaImpl.setNomeRazaoSocial(nomeRazaoSocial);
		}

		if (nomeFantasia == null) {
			qualificacaoCompletaImpl.setNomeFantasia("");
		}
		else {
			qualificacaoCompletaImpl.setNomeFantasia(nomeFantasia);
		}

		if (representanteLegal == null) {
			qualificacaoCompletaImpl.setRepresentanteLegal("");
		}
		else {
			qualificacaoCompletaImpl.setRepresentanteLegal(representanteLegal);
		}

		if (cpfCnpj == null) {
			qualificacaoCompletaImpl.setCpfCnpj("");
		}
		else {
			qualificacaoCompletaImpl.setCpfCnpj(cpfCnpj);
		}

		if (domicilioFiscal == null) {
			qualificacaoCompletaImpl.setDomicilioFiscal("");
		}
		else {
			qualificacaoCompletaImpl.setDomicilioFiscal(domicilioFiscal);
		}

		if (numeroCfdf == null) {
			qualificacaoCompletaImpl.setNumeroCfdf("");
		}
		else {
			qualificacaoCompletaImpl.setNumeroCfdf(numeroCfdf);
		}

		if (email == null) {
			qualificacaoCompletaImpl.setEmail("");
		}
		else {
			qualificacaoCompletaImpl.setEmail(email);
		}

		if (telefone == null) {
			qualificacaoCompletaImpl.setTelefone("");
		}
		else {
			qualificacaoCompletaImpl.setTelefone(telefone);
		}

		if (whatsapp == null) {
			qualificacaoCompletaImpl.setWhatsapp("");
		}
		else {
			qualificacaoCompletaImpl.setWhatsapp(whatsapp);
		}

		qualificacaoCompletaImpl.setEnderecoPostalId(enderecoPostalId);

		qualificacaoCompletaImpl.resetOriginalValues();

		return qualificacaoCompletaImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		qualificacaoId = objectInput.readLong();
		tipoPessoa = objectInput.readUTF();
		nomeRazaoSocial = objectInput.readUTF();
		nomeFantasia = objectInput.readUTF();
		representanteLegal = objectInput.readUTF();
		cpfCnpj = objectInput.readUTF();
		domicilioFiscal = objectInput.readUTF();
		numeroCfdf = objectInput.readUTF();
		email = objectInput.readUTF();
		telefone = objectInput.readUTF();
		whatsapp = objectInput.readUTF();

		enderecoPostalId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(qualificacaoId);

		if (tipoPessoa == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(tipoPessoa);
		}

		if (nomeRazaoSocial == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(nomeRazaoSocial);
		}

		if (nomeFantasia == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(nomeFantasia);
		}

		if (representanteLegal == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(representanteLegal);
		}

		if (cpfCnpj == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(cpfCnpj);
		}

		if (domicilioFiscal == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(domicilioFiscal);
		}

		if (numeroCfdf == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(numeroCfdf);
		}

		if (email == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(email);
		}

		if (telefone == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(telefone);
		}

		if (whatsapp == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(whatsapp);
		}

		objectOutput.writeLong(enderecoPostalId);
	}

	public String uuid;
	public long qualificacaoId;
	public String tipoPessoa;
	public String nomeRazaoSocial;
	public String nomeFantasia;
	public String representanteLegal;
	public String cpfCnpj;
	public String domicilioFiscal;
	public String numeroCfdf;
	public String email;
	public String telefone;
	public String whatsapp;
	public long enderecoPostalId;

}
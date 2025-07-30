/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.model.impl;

import br.com.seatecnologia.gdf.negocia.model.Proposta;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Proposta in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class PropostaCacheModel
	implements CacheModel<Proposta>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof PropostaCacheModel)) {
			return false;
		}

		PropostaCacheModel propostaCacheModel = (PropostaCacheModel)object;

		if (propostaId == propostaCacheModel.propostaId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, propostaId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(43);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", propostaId=");
		sb.append(propostaId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", tipoProposta=");
		sb.append(tipoProposta);
		sb.append(", editalId=");
		sb.append(editalId);
		sb.append(", qualificacaoId=");
		sb.append(qualificacaoId);
		sb.append(", administradorJudicialId=");
		sb.append(administradorJudicialId);
		sb.append(", advogadoId=");
		sb.append(advogadoId);
		sb.append(", fundamentacaoPedidoId=");
		sb.append(fundamentacaoPedidoId);
		sb.append(", procuracao=");
		sb.append(procuracao);
		sb.append(", cpfCnpj=");
		sb.append(cpfCnpj);
		sb.append(", status=");
		sb.append(status);
		sb.append(", numeroProtocoloSei=");
		sb.append(numeroProtocoloSei);
		sb.append(", protocolo=");
		sb.append(protocolo);
		sb.append(", documentosCompletosURL=");
		sb.append(documentosCompletosURL);
		sb.append(", propostaPaiId=");
		sb.append(propostaPaiId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Proposta toEntityModel() {
		PropostaImpl propostaImpl = new PropostaImpl();

		if (uuid == null) {
			propostaImpl.setUuid("");
		}
		else {
			propostaImpl.setUuid(uuid);
		}

		propostaImpl.setPropostaId(propostaId);
		propostaImpl.setGroupId(groupId);
		propostaImpl.setCompanyId(companyId);
		propostaImpl.setUserId(userId);

		if (userName == null) {
			propostaImpl.setUserName("");
		}
		else {
			propostaImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			propostaImpl.setCreateDate(null);
		}
		else {
			propostaImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			propostaImpl.setModifiedDate(null);
		}
		else {
			propostaImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (tipoProposta == null) {
			propostaImpl.setTipoProposta("");
		}
		else {
			propostaImpl.setTipoProposta(tipoProposta);
		}

		propostaImpl.setEditalId(editalId);
		propostaImpl.setQualificacaoId(qualificacaoId);
		propostaImpl.setAdministradorJudicialId(administradorJudicialId);
		propostaImpl.setAdvogadoId(advogadoId);
		propostaImpl.setFundamentacaoPedidoId(fundamentacaoPedidoId);
		propostaImpl.setProcuracao(procuracao);

		if (cpfCnpj == null) {
			propostaImpl.setCpfCnpj("");
		}
		else {
			propostaImpl.setCpfCnpj(cpfCnpj);
		}

		if (status == null) {
			propostaImpl.setStatus("");
		}
		else {
			propostaImpl.setStatus(status);
		}

		if (numeroProtocoloSei == null) {
			propostaImpl.setNumeroProtocoloSei("");
		}
		else {
			propostaImpl.setNumeroProtocoloSei(numeroProtocoloSei);
		}

		if (protocolo == null) {
			propostaImpl.setProtocolo("");
		}
		else {
			propostaImpl.setProtocolo(protocolo);
		}

		if (documentosCompletosURL == null) {
			propostaImpl.setDocumentosCompletosURL("");
		}
		else {
			propostaImpl.setDocumentosCompletosURL(documentosCompletosURL);
		}

		propostaImpl.setPropostaPaiId(propostaPaiId);

		propostaImpl.resetOriginalValues();

		return propostaImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		propostaId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		tipoProposta = objectInput.readUTF();

		editalId = objectInput.readLong();

		qualificacaoId = objectInput.readLong();

		administradorJudicialId = objectInput.readLong();

		advogadoId = objectInput.readLong();

		fundamentacaoPedidoId = objectInput.readLong();

		procuracao = objectInput.readLong();
		cpfCnpj = objectInput.readUTF();
		status = objectInput.readUTF();
		numeroProtocoloSei = objectInput.readUTF();
		protocolo = objectInput.readUTF();
		documentosCompletosURL = objectInput.readUTF();

		propostaPaiId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(propostaId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (tipoProposta == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(tipoProposta);
		}

		objectOutput.writeLong(editalId);

		objectOutput.writeLong(qualificacaoId);

		objectOutput.writeLong(administradorJudicialId);

		objectOutput.writeLong(advogadoId);

		objectOutput.writeLong(fundamentacaoPedidoId);

		objectOutput.writeLong(procuracao);

		if (cpfCnpj == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(cpfCnpj);
		}

		if (status == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(status);
		}

		if (numeroProtocoloSei == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(numeroProtocoloSei);
		}

		if (protocolo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(protocolo);
		}

		if (documentosCompletosURL == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(documentosCompletosURL);
		}

		objectOutput.writeLong(propostaPaiId);
	}

	public String uuid;
	public long propostaId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String tipoProposta;
	public long editalId;
	public long qualificacaoId;
	public long administradorJudicialId;
	public long advogadoId;
	public long fundamentacaoPedidoId;
	public long procuracao;
	public String cpfCnpj;
	public String status;
	public String numeroProtocoloSei;
	public String protocolo;
	public String documentosCompletosURL;
	public long propostaPaiId;

}
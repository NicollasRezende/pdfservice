/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.model.impl;

import br.com.seatecnologia.gdf.negocia.model.Garantia;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Garantia in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class GarantiaCacheModel
	implements CacheModel<Garantia>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof GarantiaCacheModel)) {
			return false;
		}

		GarantiaCacheModel garantiaCacheModel = (GarantiaCacheModel)object;

		if (garantiaId == garantiaCacheModel.garantiaId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, garantiaId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", garantiaId=");
		sb.append(garantiaId);
		sb.append(", propostaId=");
		sb.append(propostaId);
		sb.append(", tipoGarantia=");
		sb.append(tipoGarantia);
		sb.append(", tipoDevedor=");
		sb.append(tipoDevedor);
		sb.append(", outras=");
		sb.append(outras);
		sb.append(", descricaoBem=");
		sb.append(descricaoBem);
		sb.append(", proprietarioQualificacao=");
		sb.append(proprietarioQualificacao);
		sb.append(", valorEstimado=");
		sb.append(valorEstimado);
		sb.append(", dadosRegistroId=");
		sb.append(dadosRegistroId);
		sb.append(", localizacao=");
		sb.append(localizacao);
		sb.append(", declaracaoAnuencia=");
		sb.append(declaracaoAnuencia);
		sb.append(", declaracao=");
		sb.append(declaracao);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Garantia toEntityModel() {
		GarantiaImpl garantiaImpl = new GarantiaImpl();

		if (uuid == null) {
			garantiaImpl.setUuid("");
		}
		else {
			garantiaImpl.setUuid(uuid);
		}

		garantiaImpl.setGarantiaId(garantiaId);
		garantiaImpl.setPropostaId(propostaId);

		if (tipoGarantia == null) {
			garantiaImpl.setTipoGarantia("");
		}
		else {
			garantiaImpl.setTipoGarantia(tipoGarantia);
		}

		if (tipoDevedor == null) {
			garantiaImpl.setTipoDevedor("");
		}
		else {
			garantiaImpl.setTipoDevedor(tipoDevedor);
		}

		if (outras == null) {
			garantiaImpl.setOutras("");
		}
		else {
			garantiaImpl.setOutras(outras);
		}

		if (descricaoBem == null) {
			garantiaImpl.setDescricaoBem("");
		}
		else {
			garantiaImpl.setDescricaoBem(descricaoBem);
		}

		garantiaImpl.setProprietarioQualificacao(proprietarioQualificacao);
		garantiaImpl.setValorEstimado(valorEstimado);
		garantiaImpl.setDadosRegistroId(dadosRegistroId);

		if (localizacao == null) {
			garantiaImpl.setLocalizacao("");
		}
		else {
			garantiaImpl.setLocalizacao(localizacao);
		}

		garantiaImpl.setDeclaracaoAnuencia(declaracaoAnuencia);
		garantiaImpl.setDeclaracao(declaracao);

		garantiaImpl.resetOriginalValues();

		return garantiaImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		garantiaId = objectInput.readLong();

		propostaId = objectInput.readLong();
		tipoGarantia = objectInput.readUTF();
		tipoDevedor = objectInput.readUTF();
		outras = objectInput.readUTF();
		descricaoBem = objectInput.readUTF();

		proprietarioQualificacao = objectInput.readLong();

		valorEstimado = objectInput.readDouble();

		dadosRegistroId = objectInput.readLong();
		localizacao = objectInput.readUTF();

		declaracaoAnuencia = objectInput.readBoolean();

		declaracao = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(garantiaId);

		objectOutput.writeLong(propostaId);

		if (tipoGarantia == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(tipoGarantia);
		}

		if (tipoDevedor == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(tipoDevedor);
		}

		if (outras == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(outras);
		}

		if (descricaoBem == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(descricaoBem);
		}

		objectOutput.writeLong(proprietarioQualificacao);

		objectOutput.writeDouble(valorEstimado);

		objectOutput.writeLong(dadosRegistroId);

		if (localizacao == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(localizacao);
		}

		objectOutput.writeBoolean(declaracaoAnuencia);

		objectOutput.writeLong(declaracao);
	}

	public String uuid;
	public long garantiaId;
	public long propostaId;
	public String tipoGarantia;
	public String tipoDevedor;
	public String outras;
	public String descricaoBem;
	public long proprietarioQualificacao;
	public double valorEstimado;
	public long dadosRegistroId;
	public String localizacao;
	public boolean declaracaoAnuencia;
	public long declaracao;

}
/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.model.impl;

import br.com.seatecnologia.gdf.negocia.model.Declaracao;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Declaracao in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class DeclaracaoCacheModel
	implements CacheModel<Declaracao>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof DeclaracaoCacheModel)) {
			return false;
		}

		DeclaracaoCacheModel declaracaoCacheModel =
			(DeclaracaoCacheModel)object;

		if (declaracaoId == declaracaoCacheModel.declaracaoId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, declaracaoId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", declaracaoId=");
		sb.append(declaracaoId);
		sb.append(", propostaId=");
		sb.append(propostaId);
		sb.append(", cumpreCompromissos=");
		sb.append(cumpreCompromissos);
		sb.append(", naoAlienacaoBensSemComunicacao=");
		sb.append(naoAlienacaoBensSemComunicacao);
		sb.append(", reconheceGrupoOuSucessao=");
		sb.append(reconheceGrupoOuSucessao);
		sb.append(", compromissoConfidencialidade=");
		sb.append(compromissoConfidencialidade);
		sb.append(", cienciaProcesso=");
		sb.append(cienciaProcesso);
		sb.append(", abusoTransacao=");
		sb.append(abusoTransacao);
		sb.append(", impugnacaoRecursos=");
		sb.append(impugnacaoRecursos);
		sb.append(", renunciaRecursos=");
		sb.append(renunciaRecursos);
		sb.append(", peticionamentoProcessos=");
		sb.append(peticionamentoProcessos);
		sb.append(", prestacaoInformacoes=");
		sb.append(prestacaoInformacoes);
		sb.append(", omissaoInformacoes=");
		sb.append(omissaoInformacoes);
		sb.append(", manutencaoGarantias=");
		sb.append(manutencaoGarantias);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Declaracao toEntityModel() {
		DeclaracaoImpl declaracaoImpl = new DeclaracaoImpl();

		if (uuid == null) {
			declaracaoImpl.setUuid("");
		}
		else {
			declaracaoImpl.setUuid(uuid);
		}

		declaracaoImpl.setDeclaracaoId(declaracaoId);
		declaracaoImpl.setPropostaId(propostaId);
		declaracaoImpl.setCumpreCompromissos(cumpreCompromissos);
		declaracaoImpl.setNaoAlienacaoBensSemComunicacao(
			naoAlienacaoBensSemComunicacao);
		declaracaoImpl.setReconheceGrupoOuSucessao(reconheceGrupoOuSucessao);
		declaracaoImpl.setCompromissoConfidencialidade(
			compromissoConfidencialidade);
		declaracaoImpl.setCienciaProcesso(cienciaProcesso);
		declaracaoImpl.setAbusoTransacao(abusoTransacao);
		declaracaoImpl.setImpugnacaoRecursos(impugnacaoRecursos);
		declaracaoImpl.setRenunciaRecursos(renunciaRecursos);
		declaracaoImpl.setPeticionamentoProcessos(peticionamentoProcessos);
		declaracaoImpl.setPrestacaoInformacoes(prestacaoInformacoes);
		declaracaoImpl.setOmissaoInformacoes(omissaoInformacoes);
		declaracaoImpl.setManutencaoGarantias(manutencaoGarantias);

		declaracaoImpl.resetOriginalValues();

		return declaracaoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		declaracaoId = objectInput.readLong();

		propostaId = objectInput.readLong();

		cumpreCompromissos = objectInput.readBoolean();

		naoAlienacaoBensSemComunicacao = objectInput.readBoolean();

		reconheceGrupoOuSucessao = objectInput.readBoolean();

		compromissoConfidencialidade = objectInput.readBoolean();

		cienciaProcesso = objectInput.readBoolean();

		abusoTransacao = objectInput.readBoolean();

		impugnacaoRecursos = objectInput.readBoolean();

		renunciaRecursos = objectInput.readBoolean();

		peticionamentoProcessos = objectInput.readBoolean();

		prestacaoInformacoes = objectInput.readBoolean();

		omissaoInformacoes = objectInput.readBoolean();

		manutencaoGarantias = objectInput.readBoolean();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(declaracaoId);

		objectOutput.writeLong(propostaId);

		objectOutput.writeBoolean(cumpreCompromissos);

		objectOutput.writeBoolean(naoAlienacaoBensSemComunicacao);

		objectOutput.writeBoolean(reconheceGrupoOuSucessao);

		objectOutput.writeBoolean(compromissoConfidencialidade);

		objectOutput.writeBoolean(cienciaProcesso);

		objectOutput.writeBoolean(abusoTransacao);

		objectOutput.writeBoolean(impugnacaoRecursos);

		objectOutput.writeBoolean(renunciaRecursos);

		objectOutput.writeBoolean(peticionamentoProcessos);

		objectOutput.writeBoolean(prestacaoInformacoes);

		objectOutput.writeBoolean(omissaoInformacoes);

		objectOutput.writeBoolean(manutencaoGarantias);
	}

	public String uuid;
	public long declaracaoId;
	public long propostaId;
	public boolean cumpreCompromissos;
	public boolean naoAlienacaoBensSemComunicacao;
	public boolean reconheceGrupoOuSucessao;
	public boolean compromissoConfidencialidade;
	public boolean cienciaProcesso;
	public boolean abusoTransacao;
	public boolean impugnacaoRecursos;
	public boolean renunciaRecursos;
	public boolean peticionamentoProcessos;
	public boolean prestacaoInformacoes;
	public boolean omissaoInformacoes;
	public boolean manutencaoGarantias;

}
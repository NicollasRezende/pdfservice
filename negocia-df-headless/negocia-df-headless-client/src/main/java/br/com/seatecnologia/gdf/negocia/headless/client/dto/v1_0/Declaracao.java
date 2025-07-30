package br.com.seatecnologia.gdf.negocia.headless.client.dto.v1_0;

import br.com.seatecnologia.gdf.negocia.headless.client.function.UnsafeSupplier;
import br.com.seatecnologia.gdf.negocia.headless.client.serdes.v1_0.DeclaracaoSerDes;

import java.io.Serializable;

import java.util.Objects;

import javax.annotation.Generated;

/**
 * @author sabrina
 * @generated
 */
@Generated("")
public class Declaracao implements Cloneable, Serializable {

	public static Declaracao toDTO(String json) {
		return DeclaracaoSerDes.toDTO(json);
	}

	public Boolean getAbusoTransacao() {
		return abusoTransacao;
	}

	public void setAbusoTransacao(Boolean abusoTransacao) {
		this.abusoTransacao = abusoTransacao;
	}

	public void setAbusoTransacao(
		UnsafeSupplier<Boolean, Exception> abusoTransacaoUnsafeSupplier) {

		try {
			abusoTransacao = abusoTransacaoUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Boolean abusoTransacao;

	public Boolean getCienciaProcesso() {
		return cienciaProcesso;
	}

	public void setCienciaProcesso(Boolean cienciaProcesso) {
		this.cienciaProcesso = cienciaProcesso;
	}

	public void setCienciaProcesso(
		UnsafeSupplier<Boolean, Exception> cienciaProcessoUnsafeSupplier) {

		try {
			cienciaProcesso = cienciaProcessoUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Boolean cienciaProcesso;

	public Boolean getCompromissoConfidencialidade() {
		return compromissoConfidencialidade;
	}

	public void setCompromissoConfidencialidade(
		Boolean compromissoConfidencialidade) {

		this.compromissoConfidencialidade = compromissoConfidencialidade;
	}

	public void setCompromissoConfidencialidade(
		UnsafeSupplier<Boolean, Exception>
			compromissoConfidencialidadeUnsafeSupplier) {

		try {
			compromissoConfidencialidade =
				compromissoConfidencialidadeUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Boolean compromissoConfidencialidade;

	public Boolean getCumpreCompromissos() {
		return cumpreCompromissos;
	}

	public void setCumpreCompromissos(Boolean cumpreCompromissos) {
		this.cumpreCompromissos = cumpreCompromissos;
	}

	public void setCumpreCompromissos(
		UnsafeSupplier<Boolean, Exception> cumpreCompromissosUnsafeSupplier) {

		try {
			cumpreCompromissos = cumpreCompromissosUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Boolean cumpreCompromissos;

	public Boolean getImpugnacaoRecursos() {
		return impugnacaoRecursos;
	}

	public void setImpugnacaoRecursos(Boolean impugnacaoRecursos) {
		this.impugnacaoRecursos = impugnacaoRecursos;
	}

	public void setImpugnacaoRecursos(
		UnsafeSupplier<Boolean, Exception> impugnacaoRecursosUnsafeSupplier) {

		try {
			impugnacaoRecursos = impugnacaoRecursosUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Boolean impugnacaoRecursos;

	public Boolean getManutencaoGarantias() {
		return manutencaoGarantias;
	}

	public void setManutencaoGarantias(Boolean manutencaoGarantias) {
		this.manutencaoGarantias = manutencaoGarantias;
	}

	public void setManutencaoGarantias(
		UnsafeSupplier<Boolean, Exception> manutencaoGarantiasUnsafeSupplier) {

		try {
			manutencaoGarantias = manutencaoGarantiasUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Boolean manutencaoGarantias;

	public Boolean getNaoAlienacaoBensSemComunicacao() {
		return naoAlienacaoBensSemComunicacao;
	}

	public void setNaoAlienacaoBensSemComunicacao(
		Boolean naoAlienacaoBensSemComunicacao) {

		this.naoAlienacaoBensSemComunicacao = naoAlienacaoBensSemComunicacao;
	}

	public void setNaoAlienacaoBensSemComunicacao(
		UnsafeSupplier<Boolean, Exception>
			naoAlienacaoBensSemComunicacaoUnsafeSupplier) {

		try {
			naoAlienacaoBensSemComunicacao =
				naoAlienacaoBensSemComunicacaoUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Boolean naoAlienacaoBensSemComunicacao;

	public Boolean getOmissaoInformacoes() {
		return omissaoInformacoes;
	}

	public void setOmissaoInformacoes(Boolean omissaoInformacoes) {
		this.omissaoInformacoes = omissaoInformacoes;
	}

	public void setOmissaoInformacoes(
		UnsafeSupplier<Boolean, Exception> omissaoInformacoesUnsafeSupplier) {

		try {
			omissaoInformacoes = omissaoInformacoesUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Boolean omissaoInformacoes;

	public Boolean getPeticionamentoProcessos() {
		return peticionamentoProcessos;
	}

	public void setPeticionamentoProcessos(Boolean peticionamentoProcessos) {
		this.peticionamentoProcessos = peticionamentoProcessos;
	}

	public void setPeticionamentoProcessos(
		UnsafeSupplier<Boolean, Exception>
			peticionamentoProcessosUnsafeSupplier) {

		try {
			peticionamentoProcessos =
				peticionamentoProcessosUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Boolean peticionamentoProcessos;

	public Boolean getPrestacaoInformacoes() {
		return prestacaoInformacoes;
	}

	public void setPrestacaoInformacoes(Boolean prestacaoInformacoes) {
		this.prestacaoInformacoes = prestacaoInformacoes;
	}

	public void setPrestacaoInformacoes(
		UnsafeSupplier<Boolean, Exception> prestacaoInformacoesUnsafeSupplier) {

		try {
			prestacaoInformacoes = prestacaoInformacoesUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Boolean prestacaoInformacoes;

	public Boolean getProibicaoInterposicao() {
		return proibicaoInterposicao;
	}

	public void setProibicaoInterposicao(Boolean proibicaoInterposicao) {
		this.proibicaoInterposicao = proibicaoInterposicao;
	}

	public void setProibicaoInterposicao(
		UnsafeSupplier<Boolean, Exception>
			proibicaoInterposicaoUnsafeSupplier) {

		try {
			proibicaoInterposicao = proibicaoInterposicaoUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Boolean proibicaoInterposicao;

	public Boolean getReconheceGrupoOuSucessao() {
		return reconheceGrupoOuSucessao;
	}

	public void setReconheceGrupoOuSucessao(Boolean reconheceGrupoOuSucessao) {
		this.reconheceGrupoOuSucessao = reconheceGrupoOuSucessao;
	}

	public void setReconheceGrupoOuSucessao(
		UnsafeSupplier<Boolean, Exception>
			reconheceGrupoOuSucessaoUnsafeSupplier) {

		try {
			reconheceGrupoOuSucessao =
				reconheceGrupoOuSucessaoUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Boolean reconheceGrupoOuSucessao;

	public Boolean getRenunciaRecursos() {
		return renunciaRecursos;
	}

	public void setRenunciaRecursos(Boolean renunciaRecursos) {
		this.renunciaRecursos = renunciaRecursos;
	}

	public void setRenunciaRecursos(
		UnsafeSupplier<Boolean, Exception> renunciaRecursosUnsafeSupplier) {

		try {
			renunciaRecursos = renunciaRecursosUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Boolean renunciaRecursos;

	@Override
	public Declaracao clone() throws CloneNotSupportedException {
		return (Declaracao)super.clone();
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof Declaracao)) {
			return false;
		}

		Declaracao declaracao = (Declaracao)object;

		return Objects.equals(toString(), declaracao.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		return DeclaracaoSerDes.toJSON(this);
	}

}
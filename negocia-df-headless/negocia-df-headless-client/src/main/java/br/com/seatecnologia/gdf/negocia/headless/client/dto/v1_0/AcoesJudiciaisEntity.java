package br.com.seatecnologia.gdf.negocia.headless.client.dto.v1_0;

import br.com.seatecnologia.gdf.negocia.headless.client.function.UnsafeSupplier;
import br.com.seatecnologia.gdf.negocia.headless.client.serdes.v1_0.AcoesJudiciaisEntitySerDes;

import java.io.Serializable;

import java.util.Objects;

import javax.annotation.Generated;

/**
 * @author sabrina
 * @generated
 */
@Generated("")
public class AcoesJudiciaisEntity implements Cloneable, Serializable {

	public static AcoesJudiciaisEntity toDTO(String json) {
		return AcoesJudiciaisEntitySerDes.toDTO(json);
	}

	public Long getAcaoId() {
		return acaoId;
	}

	public void setAcaoId(Long acaoId) {
		this.acaoId = acaoId;
	}

	public void setAcaoId(
		UnsafeSupplier<Long, Exception> acaoIdUnsafeSupplier) {

		try {
			acaoId = acaoIdUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Long acaoId;

	public String getNumeroProcesso() {
		return numeroProcesso;
	}

	public void setNumeroProcesso(String numeroProcesso) {
		this.numeroProcesso = numeroProcesso;
	}

	public void setNumeroProcesso(
		UnsafeSupplier<String, Exception> numeroProcessoUnsafeSupplier) {

		try {
			numeroProcesso = numeroProcessoUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String numeroProcesso;

	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}

	public void setObservacoes(
		UnsafeSupplier<String, Exception> observacoesUnsafeSupplier) {

		try {
			observacoes = observacoesUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String observacoes;

	public String getOrgaoTribunal() {
		return orgaoTribunal;
	}

	public void setOrgaoTribunal(String orgaoTribunal) {
		this.orgaoTribunal = orgaoTribunal;
	}

	public void setOrgaoTribunal(
		UnsafeSupplier<String, Exception> orgaoTribunalUnsafeSupplier) {

		try {
			orgaoTribunal = orgaoTribunalUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String orgaoTribunal;

	public String getParteAutora() {
		return parteAutora;
	}

	public void setParteAutora(String parteAutora) {
		this.parteAutora = parteAutora;
	}

	public void setParteAutora(
		UnsafeSupplier<String, Exception> parteAutoraUnsafeSupplier) {

		try {
			parteAutora = parteAutoraUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String parteAutora;

	public String getParteRe() {
		return parteRe;
	}

	public void setParteRe(String parteRe) {
		this.parteRe = parteRe;
	}

	public void setParteRe(
		UnsafeSupplier<String, Exception> parteReUnsafeSupplier) {

		try {
			parteRe = parteReUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String parteRe;

	public Long getPropostaId() {
		return propostaId;
	}

	public void setPropostaId(Long propostaId) {
		this.propostaId = propostaId;
	}

	public void setPropostaId(
		UnsafeSupplier<Long, Exception> propostaIdUnsafeSupplier) {

		try {
			propostaId = propostaIdUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Long propostaId;

	public String getUnidadeVara() {
		return unidadeVara;
	}

	public void setUnidadeVara(String unidadeVara) {
		this.unidadeVara = unidadeVara;
	}

	public void setUnidadeVara(
		UnsafeSupplier<String, Exception> unidadeVaraUnsafeSupplier) {

		try {
			unidadeVara = unidadeVaraUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String unidadeVara;

	@Override
	public AcoesJudiciaisEntity clone() throws CloneNotSupportedException {
		return (AcoesJudiciaisEntity)super.clone();
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof AcoesJudiciaisEntity)) {
			return false;
		}

		AcoesJudiciaisEntity acoesJudiciaisEntity =
			(AcoesJudiciaisEntity)object;

		return Objects.equals(toString(), acoesJudiciaisEntity.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		return AcoesJudiciaisEntitySerDes.toJSON(this);
	}

}
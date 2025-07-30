package br.com.seatecnologia.gdf.negocia.headless.client.dto.v1_0;

import br.com.seatecnologia.gdf.negocia.headless.client.function.UnsafeSupplier;
import br.com.seatecnologia.gdf.negocia.headless.client.serdes.v1_0.DemonstracoesContabeisEntitySerDes;

import java.io.Serializable;

import java.util.Objects;

import javax.annotation.Generated;

/**
 * @author sabrina
 * @generated
 */
@Generated("")
public class DemonstracoesContabeisEntity implements Cloneable, Serializable {

	public static DemonstracoesContabeisEntity toDTO(String json) {
		return DemonstracoesContabeisEntitySerDes.toDTO(json);
	}

	public Long getDemonstracaoId() {
		return demonstracaoId;
	}

	public void setDemonstracaoId(Long demonstracaoId) {
		this.demonstracaoId = demonstracaoId;
	}

	public void setDemonstracaoId(
		UnsafeSupplier<Long, Exception> demonstracaoIdUnsafeSupplier) {

		try {
			demonstracaoId = demonstracaoIdUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Long demonstracaoId;

	public Long getFileEntryId() {
		return fileEntryId;
	}

	public void setFileEntryId(Long fileEntryId) {
		this.fileEntryId = fileEntryId;
	}

	public void setFileEntryId(
		UnsafeSupplier<Long, Exception> fileEntryIdUnsafeSupplier) {

		try {
			fileEntryId = fileEntryIdUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Long fileEntryId;

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

	public String getTipoDemonstracao() {
		return tipoDemonstracao;
	}

	public void setTipoDemonstracao(String tipoDemonstracao) {
		this.tipoDemonstracao = tipoDemonstracao;
	}

	public void setTipoDemonstracao(
		UnsafeSupplier<String, Exception> tipoDemonstracaoUnsafeSupplier) {

		try {
			tipoDemonstracao = tipoDemonstracaoUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String tipoDemonstracao;

	@Override
	public DemonstracoesContabeisEntity clone()
		throws CloneNotSupportedException {

		return (DemonstracoesContabeisEntity)super.clone();
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof DemonstracoesContabeisEntity)) {
			return false;
		}

		DemonstracoesContabeisEntity demonstracoesContabeisEntity =
			(DemonstracoesContabeisEntity)object;

		return Objects.equals(
			toString(), demonstracoesContabeisEntity.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		return DemonstracoesContabeisEntitySerDes.toJSON(this);
	}

}
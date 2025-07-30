package br.com.seatecnologia.gdf.negocia.headless.client.dto.v1_0;

import br.com.seatecnologia.gdf.negocia.headless.client.dto.v1_0.ArquivosEntity;
import br.com.seatecnologia.gdf.negocia.headless.client.function.UnsafeSupplier;
import br.com.seatecnologia.gdf.negocia.headless.client.serdes.v1_0.DemonstracoesContabeisEntitiesSerDes;

import java.io.Serializable;

import java.util.Objects;

import javax.annotation.Generated;

/**
 * @author sabrina
 * @generated
 */
@Generated("")
public class DemonstracoesContabeisEntities implements Cloneable, Serializable {

	public static DemonstracoesContabeisEntities toDTO(String json) {
		return DemonstracoesContabeisEntitiesSerDes.toDTO(json);
	}

	public ArquivosEntity getBalancoPatrimonial() {
		return balancoPatrimonial;
	}

	public void setBalancoPatrimonial(ArquivosEntity balancoPatrimonial) {
		this.balancoPatrimonial = balancoPatrimonial;
	}

	public void setBalancoPatrimonial(
		UnsafeSupplier<ArquivosEntity, Exception>
			balancoPatrimonialUnsafeSupplier) {

		try {
			balancoPatrimonial = balancoPatrimonialUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected ArquivosEntity balancoPatrimonial;

	public ArquivosEntity[] getDemonstracoesResultados() {
		return demonstracoesResultados;
	}

	public void setDemonstracoesResultados(
		ArquivosEntity[] demonstracoesResultados) {

		this.demonstracoesResultados = demonstracoesResultados;
	}

	public void setDemonstracoesResultados(
		UnsafeSupplier<ArquivosEntity[], Exception>
			demonstracoesResultadosUnsafeSupplier) {

		try {
			demonstracoesResultados =
				demonstracoesResultadosUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected ArquivosEntity[] demonstracoesResultados;

	public ArquivosEntity getDescricaoGrupo() {
		return descricaoGrupo;
	}

	public void setDescricaoGrupo(ArquivosEntity descricaoGrupo) {
		this.descricaoGrupo = descricaoGrupo;
	}

	public void setDescricaoGrupo(
		UnsafeSupplier<ArquivosEntity, Exception>
			descricaoGrupoUnsafeSupplier) {

		try {
			descricaoGrupo = descricaoGrupoUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected ArquivosEntity descricaoGrupo;

	public ArquivosEntity[] getOutrosContabeis() {
		return outrosContabeis;
	}

	public void setOutrosContabeis(ArquivosEntity[] outrosContabeis) {
		this.outrosContabeis = outrosContabeis;
	}

	public void setOutrosContabeis(
		UnsafeSupplier<ArquivosEntity[], Exception>
			outrosContabeisUnsafeSupplier) {

		try {
			outrosContabeis = outrosContabeisUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected ArquivosEntity[] outrosContabeis;

	public ArquivosEntity[] getRelatoriosGerenciais() {
		return relatoriosGerenciais;
	}

	public void setRelatoriosGerenciais(ArquivosEntity[] relatoriosGerenciais) {
		this.relatoriosGerenciais = relatoriosGerenciais;
	}

	public void setRelatoriosGerenciais(
		UnsafeSupplier<ArquivosEntity[], Exception>
			relatoriosGerenciaisUnsafeSupplier) {

		try {
			relatoriosGerenciais = relatoriosGerenciaisUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected ArquivosEntity[] relatoriosGerenciais;

	@Override
	public DemonstracoesContabeisEntities clone()
		throws CloneNotSupportedException {

		return (DemonstracoesContabeisEntities)super.clone();
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof DemonstracoesContabeisEntities)) {
			return false;
		}

		DemonstracoesContabeisEntities demonstracoesContabeisEntities =
			(DemonstracoesContabeisEntities)object;

		return Objects.equals(
			toString(), demonstracoesContabeisEntities.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		return DemonstracoesContabeisEntitiesSerDes.toJSON(this);
	}

}
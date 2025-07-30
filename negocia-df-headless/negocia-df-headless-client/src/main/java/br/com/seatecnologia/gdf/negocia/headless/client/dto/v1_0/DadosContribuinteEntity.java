package br.com.seatecnologia.gdf.negocia.headless.client.dto.v1_0;

import br.com.seatecnologia.gdf.negocia.headless.client.dto.v1_0.PessoaJuridicaEntity;
import br.com.seatecnologia.gdf.negocia.headless.client.dto.v1_0.QualificacaoCompletaEntity;
import br.com.seatecnologia.gdf.negocia.headless.client.function.UnsafeSupplier;
import br.com.seatecnologia.gdf.negocia.headless.client.serdes.v1_0.DadosContribuinteEntitySerDes;

import java.io.Serializable;

import java.util.Objects;

import javax.annotation.Generated;

/**
 * @author sabrina
 * @generated
 */
@Generated("")
public class DadosContribuinteEntity implements Cloneable, Serializable {

	public static DadosContribuinteEntity toDTO(String json) {
		return DadosContribuinteEntitySerDes.toDTO(json);
	}

	public PessoaJuridicaEntity[] getPessoaJuridicaEntities() {
		return pessoaJuridicaEntities;
	}

	public void setPessoaJuridicaEntities(
		PessoaJuridicaEntity[] pessoaJuridicaEntities) {

		this.pessoaJuridicaEntities = pessoaJuridicaEntities;
	}

	public void setPessoaJuridicaEntities(
		UnsafeSupplier<PessoaJuridicaEntity[], Exception>
			pessoaJuridicaEntitiesUnsafeSupplier) {

		try {
			pessoaJuridicaEntities = pessoaJuridicaEntitiesUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected PessoaJuridicaEntity[] pessoaJuridicaEntities;

	public QualificacaoCompletaEntity getQualificacao() {
		return qualificacao;
	}

	public void setQualificacao(QualificacaoCompletaEntity qualificacao) {
		this.qualificacao = qualificacao;
	}

	public void setQualificacao(
		UnsafeSupplier<QualificacaoCompletaEntity, Exception>
			qualificacaoUnsafeSupplier) {

		try {
			qualificacao = qualificacaoUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected QualificacaoCompletaEntity qualificacao;

	@Override
	public DadosContribuinteEntity clone() throws CloneNotSupportedException {
		return (DadosContribuinteEntity)super.clone();
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof DadosContribuinteEntity)) {
			return false;
		}

		DadosContribuinteEntity dadosContribuinteEntity =
			(DadosContribuinteEntity)object;

		return Objects.equals(toString(), dadosContribuinteEntity.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		return DadosContribuinteEntitySerDes.toJSON(this);
	}

}
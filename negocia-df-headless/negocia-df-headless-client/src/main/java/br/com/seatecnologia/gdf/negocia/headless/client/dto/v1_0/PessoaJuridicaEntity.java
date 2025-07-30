package br.com.seatecnologia.gdf.negocia.headless.client.dto.v1_0;

import br.com.seatecnologia.gdf.negocia.headless.client.dto.v1_0.QualificacaoCompletaEntity;
import br.com.seatecnologia.gdf.negocia.headless.client.function.UnsafeSupplier;
import br.com.seatecnologia.gdf.negocia.headless.client.serdes.v1_0.PessoaJuridicaEntitySerDes;

import java.io.Serializable;

import java.util.Objects;

import javax.annotation.Generated;

/**
 * @author sabrina
 * @generated
 */
@Generated("")
public class PessoaJuridicaEntity implements Cloneable, Serializable {

	public static PessoaJuridicaEntity toDTO(String json) {
		return PessoaJuridicaEntitySerDes.toDTO(json);
	}

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

	public String getTipoPessoaJuridica() {
		return tipoPessoaJuridica;
	}

	public void setTipoPessoaJuridica(String tipoPessoaJuridica) {
		this.tipoPessoaJuridica = tipoPessoaJuridica;
	}

	public void setTipoPessoaJuridica(
		UnsafeSupplier<String, Exception> tipoPessoaJuridicaUnsafeSupplier) {

		try {
			tipoPessoaJuridica = tipoPessoaJuridicaUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String tipoPessoaJuridica;

	@Override
	public PessoaJuridicaEntity clone() throws CloneNotSupportedException {
		return (PessoaJuridicaEntity)super.clone();
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof PessoaJuridicaEntity)) {
			return false;
		}

		PessoaJuridicaEntity pessoaJuridicaEntity =
			(PessoaJuridicaEntity)object;

		return Objects.equals(toString(), pessoaJuridicaEntity.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		return PessoaJuridicaEntitySerDes.toJSON(this);
	}

}
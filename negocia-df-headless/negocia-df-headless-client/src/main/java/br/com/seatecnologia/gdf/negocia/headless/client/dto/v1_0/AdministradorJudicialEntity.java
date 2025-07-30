package br.com.seatecnologia.gdf.negocia.headless.client.dto.v1_0;

import br.com.seatecnologia.gdf.negocia.headless.client.dto.v1_0.ArquivosEntity;
import br.com.seatecnologia.gdf.negocia.headless.client.dto.v1_0.QualificacaoCompletaEntity;
import br.com.seatecnologia.gdf.negocia.headless.client.function.UnsafeSupplier;
import br.com.seatecnologia.gdf.negocia.headless.client.serdes.v1_0.AdministradorJudicialEntitySerDes;

import java.io.Serializable;

import java.util.Objects;

import javax.annotation.Generated;

/**
 * @author sabrina
 * @generated
 */
@Generated("")
public class AdministradorJudicialEntity implements Cloneable, Serializable {

	public static AdministradorJudicialEntity toDTO(String json) {
		return AdministradorJudicialEntitySerDes.toDTO(json);
	}

	public ArquivosEntity getAnexoRecuperacao() {
		return anexoRecuperacao;
	}

	public void setAnexoRecuperacao(ArquivosEntity anexoRecuperacao) {
		this.anexoRecuperacao = anexoRecuperacao;
	}

	public void setAnexoRecuperacao(
		UnsafeSupplier<ArquivosEntity, Exception>
			anexoRecuperacaoUnsafeSupplier) {

		try {
			anexoRecuperacao = anexoRecuperacaoUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected ArquivosEntity anexoRecuperacao;

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

	public String getRecuperacao() {
		return recuperacao;
	}

	public void setRecuperacao(String recuperacao) {
		this.recuperacao = recuperacao;
	}

	public void setRecuperacao(
		UnsafeSupplier<String, Exception> recuperacaoUnsafeSupplier) {

		try {
			recuperacao = recuperacaoUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String recuperacao;

	public Boolean getRegimeFalencia() {
		return regimeFalencia;
	}

	public void setRegimeFalencia(Boolean regimeFalencia) {
		this.regimeFalencia = regimeFalencia;
	}

	public void setRegimeFalencia(
		UnsafeSupplier<Boolean, Exception> regimeFalenciaUnsafeSupplier) {

		try {
			regimeFalencia = regimeFalenciaUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Boolean regimeFalencia;

	@Override
	public AdministradorJudicialEntity clone()
		throws CloneNotSupportedException {

		return (AdministradorJudicialEntity)super.clone();
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof AdministradorJudicialEntity)) {
			return false;
		}

		AdministradorJudicialEntity administradorJudicialEntity =
			(AdministradorJudicialEntity)object;

		return Objects.equals(
			toString(), administradorJudicialEntity.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		return AdministradorJudicialEntitySerDes.toJSON(this);
	}

}
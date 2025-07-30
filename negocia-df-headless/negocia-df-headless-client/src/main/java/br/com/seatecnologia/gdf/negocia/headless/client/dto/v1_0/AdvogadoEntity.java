package br.com.seatecnologia.gdf.negocia.headless.client.dto.v1_0;

import br.com.seatecnologia.gdf.negocia.headless.client.dto.v1_0.ArquivosEntity;
import br.com.seatecnologia.gdf.negocia.headless.client.dto.v1_0.QualificacaoCompletaEntity;
import br.com.seatecnologia.gdf.negocia.headless.client.function.UnsafeSupplier;
import br.com.seatecnologia.gdf.negocia.headless.client.serdes.v1_0.AdvogadoEntitySerDes;

import java.io.Serializable;

import java.util.Objects;

import javax.annotation.Generated;

/**
 * @author sabrina
 * @generated
 */
@Generated("")
public class AdvogadoEntity implements Cloneable, Serializable {

	public static AdvogadoEntity toDTO(String json) {
		return AdvogadoEntitySerDes.toDTO(json);
	}

	public Long getAdvogadoId() {
		return advogadoId;
	}

	public void setAdvogadoId(Long advogadoId) {
		this.advogadoId = advogadoId;
	}

	public void setAdvogadoId(
		UnsafeSupplier<Long, Exception> advogadoIdUnsafeSupplier) {

		try {
			advogadoId = advogadoIdUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Long advogadoId;

	public ArquivosEntity getCarteirinhaOAB() {
		return carteirinhaOAB;
	}

	public void setCarteirinhaOAB(ArquivosEntity carteirinhaOAB) {
		this.carteirinhaOAB = carteirinhaOAB;
	}

	public void setCarteirinhaOAB(
		UnsafeSupplier<ArquivosEntity, Exception>
			carteirinhaOABUnsafeSupplier) {

		try {
			carteirinhaOAB = carteirinhaOABUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected ArquivosEntity carteirinhaOAB;

	public String getNumeroOab() {
		return numeroOab;
	}

	public void setNumeroOab(String numeroOab) {
		this.numeroOab = numeroOab;
	}

	public void setNumeroOab(
		UnsafeSupplier<String, Exception> numeroOabUnsafeSupplier) {

		try {
			numeroOab = numeroOabUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String numeroOab;

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

	public String getSeccional() {
		return seccional;
	}

	public void setSeccional(String seccional) {
		this.seccional = seccional;
	}

	public void setSeccional(
		UnsafeSupplier<String, Exception> seccionalUnsafeSupplier) {

		try {
			seccional = seccionalUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String seccional;

	@Override
	public AdvogadoEntity clone() throws CloneNotSupportedException {
		return (AdvogadoEntity)super.clone();
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof AdvogadoEntity)) {
			return false;
		}

		AdvogadoEntity advogadoEntity = (AdvogadoEntity)object;

		return Objects.equals(toString(), advogadoEntity.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		return AdvogadoEntitySerDes.toJSON(this);
	}

}
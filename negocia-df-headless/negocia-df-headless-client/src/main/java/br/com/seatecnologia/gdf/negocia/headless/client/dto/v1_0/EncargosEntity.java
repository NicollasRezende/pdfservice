package br.com.seatecnologia.gdf.negocia.headless.client.dto.v1_0;

import br.com.seatecnologia.gdf.negocia.headless.client.function.UnsafeSupplier;
import br.com.seatecnologia.gdf.negocia.headless.client.serdes.v1_0.EncargosEntitySerDes;

import java.io.Serializable;

import java.util.Objects;

import javax.annotation.Generated;

/**
 * @author sabrina
 * @generated
 */
@Generated("")
public class EncargosEntity implements Cloneable, Serializable {

	public static EncargosEntity toDTO(String json) {
		return EncargosEntitySerDes.toDTO(json);
	}

	public String getDescricaoEncargos() {
		return descricaoEncargos;
	}

	public void setDescricaoEncargos(String descricaoEncargos) {
		this.descricaoEncargos = descricaoEncargos;
	}

	public void setDescricaoEncargos(
		UnsafeSupplier<String, Exception> descricaoEncargosUnsafeSupplier) {

		try {
			descricaoEncargos = descricaoEncargosUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String descricaoEncargos;

	public Long getEncargoId() {
		return encargoId;
	}

	public void setEncargoId(Long encargoId) {
		this.encargoId = encargoId;
	}

	public void setEncargoId(
		UnsafeSupplier<Long, Exception> encargoIdUnsafeSupplier) {

		try {
			encargoId = encargoIdUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Long encargoId;

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

	public Double getValorEncargos() {
		return valorEncargos;
	}

	public void setValorEncargos(Double valorEncargos) {
		this.valorEncargos = valorEncargos;
	}

	public void setValorEncargos(
		UnsafeSupplier<Double, Exception> valorEncargosUnsafeSupplier) {

		try {
			valorEncargos = valorEncargosUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Double valorEncargos;

	@Override
	public EncargosEntity clone() throws CloneNotSupportedException {
		return (EncargosEntity)super.clone();
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof EncargosEntity)) {
			return false;
		}

		EncargosEntity encargosEntity = (EncargosEntity)object;

		return Objects.equals(toString(), encargosEntity.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		return EncargosEntitySerDes.toJSON(this);
	}

}
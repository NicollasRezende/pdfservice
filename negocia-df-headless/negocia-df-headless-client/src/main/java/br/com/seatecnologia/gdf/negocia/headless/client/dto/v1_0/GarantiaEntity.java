package br.com.seatecnologia.gdf.negocia.headless.client.dto.v1_0;

import br.com.seatecnologia.gdf.negocia.headless.client.dto.v1_0.GarantiaDetalhadaEntity;
import br.com.seatecnologia.gdf.negocia.headless.client.function.UnsafeSupplier;
import br.com.seatecnologia.gdf.negocia.headless.client.serdes.v1_0.GarantiaEntitySerDes;

import java.io.Serializable;

import java.util.Objects;

import javax.annotation.Generated;

/**
 * @author sabrina
 * @generated
 */
@Generated("")
public class GarantiaEntity implements Cloneable, Serializable {

	public static GarantiaEntity toDTO(String json) {
		return GarantiaEntitySerDes.toDTO(json);
	}

	public GarantiaDetalhadaEntity[] getGarantiaDetalhadaEntities() {
		return garantiaDetalhadaEntities;
	}

	public void setGarantiaDetalhadaEntities(
		GarantiaDetalhadaEntity[] garantiaDetalhadaEntities) {

		this.garantiaDetalhadaEntities = garantiaDetalhadaEntities;
	}

	public void setGarantiaDetalhadaEntities(
		UnsafeSupplier<GarantiaDetalhadaEntity[], Exception>
			garantiaDetalhadaEntitiesUnsafeSupplier) {

		try {
			garantiaDetalhadaEntities =
				garantiaDetalhadaEntitiesUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected GarantiaDetalhadaEntity[] garantiaDetalhadaEntities;

	public String getTipoDevedor() {
		return tipoDevedor;
	}

	public void setTipoDevedor(String tipoDevedor) {
		this.tipoDevedor = tipoDevedor;
	}

	public void setTipoDevedor(
		UnsafeSupplier<String, Exception> tipoDevedorUnsafeSupplier) {

		try {
			tipoDevedor = tipoDevedorUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String tipoDevedor;

	@Override
	public GarantiaEntity clone() throws CloneNotSupportedException {
		return (GarantiaEntity)super.clone();
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof GarantiaEntity)) {
			return false;
		}

		GarantiaEntity garantiaEntity = (GarantiaEntity)object;

		return Objects.equals(toString(), garantiaEntity.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		return GarantiaEntitySerDes.toJSON(this);
	}

}
package br.com.seatecnologia.gdf.negocia.headless.client.dto.v1_0;

import br.com.seatecnologia.gdf.negocia.headless.client.dto.v1_0.EditalEntity;
import br.com.seatecnologia.gdf.negocia.headless.client.function.UnsafeSupplier;
import br.com.seatecnologia.gdf.negocia.headless.client.serdes.v1_0.MetadadosFormularioSerDes;

import java.io.Serializable;

import java.util.Objects;

import javax.annotation.Generated;

/**
 * @author sabrina
 * @generated
 */
@Generated("")
public class MetadadosFormulario implements Cloneable, Serializable {

	public static MetadadosFormulario toDTO(String json) {
		return MetadadosFormularioSerDes.toDTO(json);
	}

	public Long getDlFolderId() {
		return dlFolderId;
	}

	public void setDlFolderId(Long dlFolderId) {
		this.dlFolderId = dlFolderId;
	}

	public void setDlFolderId(
		UnsafeSupplier<Long, Exception> dlFolderIdUnsafeSupplier) {

		try {
			dlFolderId = dlFolderIdUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Long dlFolderId;

	public EditalEntity[] getEditalEntities() {
		return editalEntities;
	}

	public void setEditalEntities(EditalEntity[] editalEntities) {
		this.editalEntities = editalEntities;
	}

	public void setEditalEntities(
		UnsafeSupplier<EditalEntity[], Exception>
			editalEntitiesUnsafeSupplier) {

		try {
			editalEntities = editalEntitiesUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected EditalEntity[] editalEntities;

	@Override
	public MetadadosFormulario clone() throws CloneNotSupportedException {
		return (MetadadosFormulario)super.clone();
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof MetadadosFormulario)) {
			return false;
		}

		MetadadosFormulario metadadosFormulario = (MetadadosFormulario)object;

		return Objects.equals(toString(), metadadosFormulario.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		return MetadadosFormularioSerDes.toJSON(this);
	}

}
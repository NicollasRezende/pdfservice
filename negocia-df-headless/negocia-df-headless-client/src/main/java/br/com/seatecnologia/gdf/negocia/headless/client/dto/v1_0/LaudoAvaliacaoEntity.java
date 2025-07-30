package br.com.seatecnologia.gdf.negocia.headless.client.dto.v1_0;

import br.com.seatecnologia.gdf.negocia.headless.client.function.UnsafeSupplier;
import br.com.seatecnologia.gdf.negocia.headless.client.serdes.v1_0.LaudoAvaliacaoEntitySerDes;

import java.io.Serializable;

import java.util.Objects;

import javax.annotation.Generated;

/**
 * @author sabrina
 * @generated
 */
@Generated("")
public class LaudoAvaliacaoEntity implements Cloneable, Serializable {

	public static LaudoAvaliacaoEntity toDTO(String json) {
		return LaudoAvaliacaoEntitySerDes.toDTO(json);
	}

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

	public Long getLaudoId() {
		return laudoId;
	}

	public void setLaudoId(Long laudoId) {
		this.laudoId = laudoId;
	}

	public void setLaudoId(
		UnsafeSupplier<Long, Exception> laudoIdUnsafeSupplier) {

		try {
			laudoId = laudoIdUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Long laudoId;

	@Override
	public LaudoAvaliacaoEntity clone() throws CloneNotSupportedException {
		return (LaudoAvaliacaoEntity)super.clone();
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof LaudoAvaliacaoEntity)) {
			return false;
		}

		LaudoAvaliacaoEntity laudoAvaliacaoEntity =
			(LaudoAvaliacaoEntity)object;

		return Objects.equals(toString(), laudoAvaliacaoEntity.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		return LaudoAvaliacaoEntitySerDes.toJSON(this);
	}

}
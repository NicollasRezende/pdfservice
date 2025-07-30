package br.com.seatecnologia.gdf.negocia.headless.client.dto.v1_0;

import br.com.seatecnologia.gdf.negocia.headless.client.function.UnsafeSupplier;
import br.com.seatecnologia.gdf.negocia.headless.client.serdes.v1_0.DocumentoDadosRegistroSerDes;

import java.io.Serializable;

import java.util.Objects;

import javax.annotation.Generated;

/**
 * @author sabrina
 * @generated
 */
@Generated("")
public class DocumentoDadosRegistro implements Cloneable, Serializable {

	public static DocumentoDadosRegistro toDTO(String json) {
		return DocumentoDadosRegistroSerDes.toDTO(json);
	}

	public Long getDocumentoId() {
		return documentoId;
	}

	public void setDocumentoId(Long documentoId) {
		this.documentoId = documentoId;
	}

	public void setDocumentoId(
		UnsafeSupplier<Long, Exception> documentoIdUnsafeSupplier) {

		try {
			documentoId = documentoIdUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Long documentoId;

	@Override
	public DocumentoDadosRegistro clone() throws CloneNotSupportedException {
		return (DocumentoDadosRegistro)super.clone();
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof DocumentoDadosRegistro)) {
			return false;
		}

		DocumentoDadosRegistro documentoDadosRegistro =
			(DocumentoDadosRegistro)object;

		return Objects.equals(toString(), documentoDadosRegistro.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		return DocumentoDadosRegistroSerDes.toJSON(this);
	}

}
package br.com.seatecnologia.gdf.negocia.headless.client.dto.v1_0;

import br.com.seatecnologia.gdf.negocia.headless.client.dto.v1_0.ArquivosEntity;
import br.com.seatecnologia.gdf.negocia.headless.client.function.UnsafeSupplier;
import br.com.seatecnologia.gdf.negocia.headless.client.serdes.v1_0.TermosAssinadoEntitySerDes;

import java.io.Serializable;

import java.util.Objects;

import javax.annotation.Generated;

/**
 * @author sabrina
 * @generated
 */
@Generated("")
public class TermosAssinadoEntity implements Cloneable, Serializable {

	public static TermosAssinadoEntity toDTO(String json) {
		return TermosAssinadoEntitySerDes.toDTO(json);
	}

	public ArquivosEntity getArquivoPdf() {
		return arquivoPdf;
	}

	public void setArquivoPdf(ArquivosEntity arquivoPdf) {
		this.arquivoPdf = arquivoPdf;
	}

	public void setArquivoPdf(
		UnsafeSupplier<ArquivosEntity, Exception> arquivoPdfUnsafeSupplier) {

		try {
			arquivoPdf = arquivoPdfUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected ArquivosEntity arquivoPdf;

	public String getParte() {
		return parte;
	}

	public void setParte(String parte) {
		this.parte = parte;
	}

	public void setParte(
		UnsafeSupplier<String, Exception> parteUnsafeSupplier) {

		try {
			parte = parteUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String parte;

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

	public Long getTermosAssinadoId() {
		return termosAssinadoId;
	}

	public void setTermosAssinadoId(Long termosAssinadoId) {
		this.termosAssinadoId = termosAssinadoId;
	}

	public void setTermosAssinadoId(
		UnsafeSupplier<Long, Exception> termosAssinadoIdUnsafeSupplier) {

		try {
			termosAssinadoId = termosAssinadoIdUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Long termosAssinadoId;

	public String getUrlTermo() {
		return urlTermo;
	}

	public void setUrlTermo(String urlTermo) {
		this.urlTermo = urlTermo;
	}

	public void setUrlTermo(
		UnsafeSupplier<String, Exception> urlTermoUnsafeSupplier) {

		try {
			urlTermo = urlTermoUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String urlTermo;

	@Override
	public TermosAssinadoEntity clone() throws CloneNotSupportedException {
		return (TermosAssinadoEntity)super.clone();
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof TermosAssinadoEntity)) {
			return false;
		}

		TermosAssinadoEntity termosAssinadoEntity =
			(TermosAssinadoEntity)object;

		return Objects.equals(toString(), termosAssinadoEntity.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		return TermosAssinadoEntitySerDes.toJSON(this);
	}

}
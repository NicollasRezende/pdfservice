package br.com.seatecnologia.gdf.negocia.headless.client.dto.v1_0;

import br.com.seatecnologia.gdf.negocia.headless.client.function.UnsafeSupplier;
import br.com.seatecnologia.gdf.negocia.headless.client.serdes.v1_0.PropostaZipEntitySerDes;

import java.io.Serializable;

import java.util.Objects;

import javax.annotation.Generated;

/**
 * @author sabrina
 * @generated
 */
@Generated("")
public class PropostaZipEntity implements Cloneable, Serializable {

	public static PropostaZipEntity toDTO(String json) {
		return PropostaZipEntitySerDes.toDTO(json);
	}

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

	public String getStatusProposta() {
		return statusProposta;
	}

	public void setStatusProposta(String statusProposta) {
		this.statusProposta = statusProposta;
	}

	public void setStatusProposta(
		UnsafeSupplier<String, Exception> statusPropostaUnsafeSupplier) {

		try {
			statusProposta = statusPropostaUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String statusProposta;

	public String getUrlZip() {
		return urlZip;
	}

	public void setUrlZip(String urlZip) {
		this.urlZip = urlZip;
	}

	public void setUrlZip(
		UnsafeSupplier<String, Exception> urlZipUnsafeSupplier) {

		try {
			urlZip = urlZipUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String urlZip;

	@Override
	public PropostaZipEntity clone() throws CloneNotSupportedException {
		return (PropostaZipEntity)super.clone();
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof PropostaZipEntity)) {
			return false;
		}

		PropostaZipEntity propostaZipEntity = (PropostaZipEntity)object;

		return Objects.equals(toString(), propostaZipEntity.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		return PropostaZipEntitySerDes.toJSON(this);
	}

}
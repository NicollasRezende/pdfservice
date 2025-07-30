package br.com.seatecnologia.gdf.negocia.headless.client.dto.v1_0;

import br.com.seatecnologia.gdf.negocia.headless.client.function.UnsafeSupplier;
import br.com.seatecnologia.gdf.negocia.headless.client.serdes.v1_0.PropostaEntityListSerDes;

import java.io.Serializable;

import java.util.Date;
import java.util.Objects;

import javax.annotation.Generated;

/**
 * @author sabrina
 * @generated
 */
@Generated("")
public class PropostaEntityList implements Cloneable, Serializable {

	public static PropostaEntityList toDTO(String json) {
		return PropostaEntityListSerDes.toDTO(json);
	}

	public String getCpfCnpj() {
		return cpfCnpj;
	}

	public void setCpfCnpj(String cpfCnpj) {
		this.cpfCnpj = cpfCnpj;
	}

	public void setCpfCnpj(
		UnsafeSupplier<String, Exception> cpfCnpjUnsafeSupplier) {

		try {
			cpfCnpj = cpfCnpjUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String cpfCnpj;

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public void setCreateDate(
		UnsafeSupplier<Date, Exception> createDateUnsafeSupplier) {

		try {
			createDate = createDateUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Date createDate;

	public String getDocumentosPropostaUrl() {
		return documentosPropostaUrl;
	}

	public void setDocumentosPropostaUrl(String documentosPropostaUrl) {
		this.documentosPropostaUrl = documentosPropostaUrl;
	}

	public void setDocumentosPropostaUrl(
		UnsafeSupplier<String, Exception> documentosPropostaUrlUnsafeSupplier) {

		try {
			documentosPropostaUrl = documentosPropostaUrlUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String documentosPropostaUrl;

	public String getEditalUrl() {
		return editalUrl;
	}

	public void setEditalUrl(String editalUrl) {
		this.editalUrl = editalUrl;
	}

	public void setEditalUrl(
		UnsafeSupplier<String, Exception> editalUrlUnsafeSupplier) {

		try {
			editalUrl = editalUrlUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String editalUrl;

	public Date getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public void setModifiedDate(
		UnsafeSupplier<Date, Exception> modifiedDateUnsafeSupplier) {

		try {
			modifiedDate = modifiedDateUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Date modifiedDate;

	public String getNumeroProtocoloSEI() {
		return numeroProtocoloSEI;
	}

	public void setNumeroProtocoloSEI(String numeroProtocoloSEI) {
		this.numeroProtocoloSEI = numeroProtocoloSEI;
	}

	public void setNumeroProtocoloSEI(
		UnsafeSupplier<String, Exception> numeroProtocoloSEIUnsafeSupplier) {

		try {
			numeroProtocoloSEI = numeroProtocoloSEIUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String numeroProtocoloSEI;

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

	public String getProtocolo() {
		return protocolo;
	}

	public void setProtocolo(String protocolo) {
		this.protocolo = protocolo;
	}

	public void setProtocolo(
		UnsafeSupplier<String, Exception> protocoloUnsafeSupplier) {

		try {
			protocolo = protocoloUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String protocolo;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void setStatus(
		UnsafeSupplier<String, Exception> statusUnsafeSupplier) {

		try {
			status = statusUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String status;

	public String getTipoProposta() {
		return tipoProposta;
	}

	public void setTipoProposta(String tipoProposta) {
		this.tipoProposta = tipoProposta;
	}

	public void setTipoProposta(
		UnsafeSupplier<String, Exception> tipoPropostaUnsafeSupplier) {

		try {
			tipoProposta = tipoPropostaUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String tipoProposta;

	@Override
	public PropostaEntityList clone() throws CloneNotSupportedException {
		return (PropostaEntityList)super.clone();
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof PropostaEntityList)) {
			return false;
		}

		PropostaEntityList propostaEntityList = (PropostaEntityList)object;

		return Objects.equals(toString(), propostaEntityList.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		return PropostaEntityListSerDes.toJSON(this);
	}

}
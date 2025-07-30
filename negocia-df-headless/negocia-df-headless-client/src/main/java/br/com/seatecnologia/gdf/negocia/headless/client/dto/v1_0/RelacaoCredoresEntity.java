package br.com.seatecnologia.gdf.negocia.headless.client.dto.v1_0;

import br.com.seatecnologia.gdf.negocia.headless.client.function.UnsafeSupplier;
import br.com.seatecnologia.gdf.negocia.headless.client.serdes.v1_0.RelacaoCredoresEntitySerDes;

import java.io.Serializable;

import java.util.Objects;

import javax.annotation.Generated;

/**
 * @author sabrina
 * @generated
 */
@Generated("")
public class RelacaoCredoresEntity implements Cloneable, Serializable {

	public static RelacaoCredoresEntity toDTO(String json) {
		return RelacaoCredoresEntitySerDes.toDTO(json);
	}

	public String getClassificacaoCredito() {
		return classificacaoCredito;
	}

	public void setClassificacaoCredito(String classificacaoCredito) {
		this.classificacaoCredito = classificacaoCredito;
	}

	public void setClassificacaoCredito(
		UnsafeSupplier<String, Exception> classificacaoCreditoUnsafeSupplier) {

		try {
			classificacaoCredito = classificacaoCreditoUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String classificacaoCredito;

	public Long getCredorId() {
		return credorId;
	}

	public void setCredorId(Long credorId) {
		this.credorId = credorId;
	}

	public void setCredorId(
		UnsafeSupplier<Long, Exception> credorIdUnsafeSupplier) {

		try {
			credorId = credorIdUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Long credorId;

	public String getNaturezaCredito() {
		return naturezaCredito;
	}

	public void setNaturezaCredito(String naturezaCredito) {
		this.naturezaCredito = naturezaCredito;
	}

	public void setNaturezaCredito(
		UnsafeSupplier<String, Exception> naturezaCreditoUnsafeSupplier) {

		try {
			naturezaCredito = naturezaCreditoUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String naturezaCredito;

	public String getNomeCredor() {
		return nomeCredor;
	}

	public void setNomeCredor(String nomeCredor) {
		this.nomeCredor = nomeCredor;
	}

	public void setNomeCredor(
		UnsafeSupplier<String, Exception> nomeCredorUnsafeSupplier) {

		try {
			nomeCredor = nomeCredorUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String nomeCredor;

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

	public String getReferenciaRegistro() {
		return referenciaRegistro;
	}

	public void setReferenciaRegistro(String referenciaRegistro) {
		this.referenciaRegistro = referenciaRegistro;
	}

	public void setReferenciaRegistro(
		UnsafeSupplier<String, Exception> referenciaRegistroUnsafeSupplier) {

		try {
			referenciaRegistro = referenciaRegistroUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String referenciaRegistro;

	public Double getValorCredito() {
		return valorCredito;
	}

	public void setValorCredito(Double valorCredito) {
		this.valorCredito = valorCredito;
	}

	public void setValorCredito(
		UnsafeSupplier<Double, Exception> valorCreditoUnsafeSupplier) {

		try {
			valorCredito = valorCreditoUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Double valorCredito;

	@Override
	public RelacaoCredoresEntity clone() throws CloneNotSupportedException {
		return (RelacaoCredoresEntity)super.clone();
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof RelacaoCredoresEntity)) {
			return false;
		}

		RelacaoCredoresEntity relacaoCredoresEntity =
			(RelacaoCredoresEntity)object;

		return Objects.equals(toString(), relacaoCredoresEntity.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		return RelacaoCredoresEntitySerDes.toJSON(this);
	}

}
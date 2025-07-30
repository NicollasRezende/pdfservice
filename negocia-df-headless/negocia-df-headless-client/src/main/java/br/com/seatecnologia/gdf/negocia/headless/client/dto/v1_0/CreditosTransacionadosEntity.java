package br.com.seatecnologia.gdf.negocia.headless.client.dto.v1_0;

import br.com.seatecnologia.gdf.negocia.headless.client.function.UnsafeSupplier;
import br.com.seatecnologia.gdf.negocia.headless.client.serdes.v1_0.CreditosTransacionadosEntitySerDes;

import java.io.Serializable;

import java.util.Objects;

import javax.annotation.Generated;

/**
 * @author sabrina
 * @generated
 */
@Generated("")
public class CreditosTransacionadosEntity implements Cloneable, Serializable {

	public static CreditosTransacionadosEntity toDTO(String json) {
		return CreditosTransacionadosEntitySerDes.toDTO(json);
	}

	public Long getCreditoId() {
		return creditoId;
	}

	public void setCreditoId(Long creditoId) {
		this.creditoId = creditoId;
	}

	public void setCreditoId(
		UnsafeSupplier<Long, Exception> creditoIdUnsafeSupplier) {

		try {
			creditoId = creditoIdUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Long creditoId;

	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}

	public void setObservacoes(
		UnsafeSupplier<String, Exception> observacoesUnsafeSupplier) {

		try {
			observacoes = observacoesUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String observacoes;

	public Double getPercentualDescontoJuros() {
		return percentualDescontoJuros;
	}

	public void setPercentualDescontoJuros(Double percentualDescontoJuros) {
		this.percentualDescontoJuros = percentualDescontoJuros;
	}

	public void setPercentualDescontoJuros(
		UnsafeSupplier<Double, Exception>
			percentualDescontoJurosUnsafeSupplier) {

		try {
			percentualDescontoJuros =
				percentualDescontoJurosUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Double percentualDescontoJuros;

	public Double getPercentualDescontoPrincipal() {
		return percentualDescontoPrincipal;
	}

	public void setPercentualDescontoPrincipal(
		Double percentualDescontoPrincipal) {

		this.percentualDescontoPrincipal = percentualDescontoPrincipal;
	}

	public void setPercentualDescontoPrincipal(
		UnsafeSupplier<Double, Exception>
			percentualDescontoPrincipalUnsafeSupplier) {

		try {
			percentualDescontoPrincipal =
				percentualDescontoPrincipalUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Double percentualDescontoPrincipal;

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

	@Override
	public CreditosTransacionadosEntity clone()
		throws CloneNotSupportedException {

		return (CreditosTransacionadosEntity)super.clone();
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof CreditosTransacionadosEntity)) {
			return false;
		}

		CreditosTransacionadosEntity creditosTransacionadosEntity =
			(CreditosTransacionadosEntity)object;

		return Objects.equals(
			toString(), creditosTransacionadosEntity.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		return CreditosTransacionadosEntitySerDes.toJSON(this);
	}

}
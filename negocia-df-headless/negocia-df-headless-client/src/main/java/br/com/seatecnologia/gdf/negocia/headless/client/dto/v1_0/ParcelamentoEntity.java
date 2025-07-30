package br.com.seatecnologia.gdf.negocia.headless.client.dto.v1_0;

import br.com.seatecnologia.gdf.negocia.headless.client.function.UnsafeSupplier;
import br.com.seatecnologia.gdf.negocia.headless.client.serdes.v1_0.ParcelamentoEntitySerDes;

import java.io.Serializable;

import java.util.Date;
import java.util.Objects;

import javax.annotation.Generated;

/**
 * @author sabrina
 * @generated
 */
@Generated("")
public class ParcelamentoEntity implements Cloneable, Serializable {

	public static ParcelamentoEntity toDTO(String json) {
		return ParcelamentoEntitySerDes.toDTO(json);
	}

	public Date getDataPrimeiraParcela() {
		return dataPrimeiraParcela;
	}

	public void setDataPrimeiraParcela(Date dataPrimeiraParcela) {
		this.dataPrimeiraParcela = dataPrimeiraParcela;
	}

	public void setDataPrimeiraParcela(
		UnsafeSupplier<Date, Exception> dataPrimeiraParcelaUnsafeSupplier) {

		try {
			dataPrimeiraParcela = dataPrimeiraParcelaUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Date dataPrimeiraParcela;

	public Integer getNumeroParcelas() {
		return numeroParcelas;
	}

	public void setNumeroParcelas(Integer numeroParcelas) {
		this.numeroParcelas = numeroParcelas;
	}

	public void setNumeroParcelas(
		UnsafeSupplier<Integer, Exception> numeroParcelasUnsafeSupplier) {

		try {
			numeroParcelas = numeroParcelasUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Integer numeroParcelas;

	public Long getParcelamentoId() {
		return parcelamentoId;
	}

	public void setParcelamentoId(Long parcelamentoId) {
		this.parcelamentoId = parcelamentoId;
	}

	public void setParcelamentoId(
		UnsafeSupplier<Long, Exception> parcelamentoIdUnsafeSupplier) {

		try {
			parcelamentoId = parcelamentoIdUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Long parcelamentoId;

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

	public Double getValorEntrada() {
		return valorEntrada;
	}

	public void setValorEntrada(Double valorEntrada) {
		this.valorEntrada = valorEntrada;
	}

	public void setValorEntrada(
		UnsafeSupplier<Double, Exception> valorEntradaUnsafeSupplier) {

		try {
			valorEntrada = valorEntradaUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Double valorEntrada;

	public Double getValorPrimeiraParcela() {
		return valorPrimeiraParcela;
	}

	public void setValorPrimeiraParcela(Double valorPrimeiraParcela) {
		this.valorPrimeiraParcela = valorPrimeiraParcela;
	}

	public void setValorPrimeiraParcela(
		UnsafeSupplier<Double, Exception> valorPrimeiraParcelaUnsafeSupplier) {

		try {
			valorPrimeiraParcela = valorPrimeiraParcelaUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Double valorPrimeiraParcela;

	@Override
	public ParcelamentoEntity clone() throws CloneNotSupportedException {
		return (ParcelamentoEntity)super.clone();
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof ParcelamentoEntity)) {
			return false;
		}

		ParcelamentoEntity parcelamentoEntity = (ParcelamentoEntity)object;

		return Objects.equals(toString(), parcelamentoEntity.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		return ParcelamentoEntitySerDes.toJSON(this);
	}

}
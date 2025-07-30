package br.com.seatecnologia.gdf.negocia.headless.client.dto.v1_0;

import br.com.seatecnologia.gdf.negocia.headless.client.function.UnsafeSupplier;
import br.com.seatecnologia.gdf.negocia.headless.client.serdes.v1_0.ComprovanteHonorariosEntitySerDes;

import java.io.Serializable;

import java.util.Date;
import java.util.Objects;

import javax.annotation.Generated;

/**
 * @author sabrina
 * @generated
 */
@Generated("")
public class ComprovanteHonorariosEntity implements Cloneable, Serializable {

	public static ComprovanteHonorariosEntity toDTO(String json) {
		return ComprovanteHonorariosEntitySerDes.toDTO(json);
	}

	public Long getComprovanteId() {
		return comprovanteId;
	}

	public void setComprovanteId(Long comprovanteId) {
		this.comprovanteId = comprovanteId;
	}

	public void setComprovanteId(
		UnsafeSupplier<Long, Exception> comprovanteIdUnsafeSupplier) {

		try {
			comprovanteId = comprovanteIdUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Long comprovanteId;

	public Date getDataPagamento() {
		return dataPagamento;
	}

	public void setDataPagamento(Date dataPagamento) {
		this.dataPagamento = dataPagamento;
	}

	public void setDataPagamento(
		UnsafeSupplier<Date, Exception> dataPagamentoUnsafeSupplier) {

		try {
			dataPagamento = dataPagamentoUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Date dataPagamento;

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

	public Double getValorPago() {
		return valorPago;
	}

	public void setValorPago(Double valorPago) {
		this.valorPago = valorPago;
	}

	public void setValorPago(
		UnsafeSupplier<Double, Exception> valorPagoUnsafeSupplier) {

		try {
			valorPago = valorPagoUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Double valorPago;

	@Override
	public ComprovanteHonorariosEntity clone()
		throws CloneNotSupportedException {

		return (ComprovanteHonorariosEntity)super.clone();
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof ComprovanteHonorariosEntity)) {
			return false;
		}

		ComprovanteHonorariosEntity comprovanteHonorariosEntity =
			(ComprovanteHonorariosEntity)object;

		return Objects.equals(
			toString(), comprovanteHonorariosEntity.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		return ComprovanteHonorariosEntitySerDes.toJSON(this);
	}

}
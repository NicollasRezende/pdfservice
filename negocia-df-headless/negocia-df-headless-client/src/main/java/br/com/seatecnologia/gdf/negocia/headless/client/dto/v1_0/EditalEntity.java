package br.com.seatecnologia.gdf.negocia.headless.client.dto.v1_0;

import br.com.seatecnologia.gdf.negocia.headless.client.function.UnsafeSupplier;
import br.com.seatecnologia.gdf.negocia.headless.client.serdes.v1_0.EditalEntitySerDes;

import java.io.Serializable;

import java.util.Date;
import java.util.Objects;

import javax.annotation.Generated;

/**
 * @author sabrina
 * @generated
 */
@Generated("")
public class EditalEntity implements Cloneable, Serializable {

	public static EditalEntity toDTO(String json) {
		return EditalEntitySerDes.toDTO(json);
	}

	public Date getDataFim() {
		return dataFim;
	}

	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}

	public void setDataFim(
		UnsafeSupplier<Date, Exception> dataFimUnsafeSupplier) {

		try {
			dataFim = dataFimUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Date dataFim;

	public Date getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	public void setDataInicio(
		UnsafeSupplier<Date, Exception> dataInicioUnsafeSupplier) {

		try {
			dataInicio = dataInicioUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Date dataInicio;

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public void setDescricao(
		UnsafeSupplier<String, Exception> descricaoUnsafeSupplier) {

		try {
			descricao = descricaoUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String descricao;

	public Long getEditalId() {
		return editalId;
	}

	public void setEditalId(Long editalId) {
		this.editalId = editalId;
	}

	public void setEditalId(
		UnsafeSupplier<Long, Exception> editalIdUnsafeSupplier) {

		try {
			editalId = editalIdUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Long editalId;

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setTitulo(
		UnsafeSupplier<String, Exception> tituloUnsafeSupplier) {

		try {
			titulo = tituloUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String titulo;

	public String getUrlArquivo() {
		return urlArquivo;
	}

	public void setUrlArquivo(String urlArquivo) {
		this.urlArquivo = urlArquivo;
	}

	public void setUrlArquivo(
		UnsafeSupplier<String, Exception> urlArquivoUnsafeSupplier) {

		try {
			urlArquivo = urlArquivoUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String urlArquivo;

	@Override
	public EditalEntity clone() throws CloneNotSupportedException {
		return (EditalEntity)super.clone();
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof EditalEntity)) {
			return false;
		}

		EditalEntity editalEntity = (EditalEntity)object;

		return Objects.equals(toString(), editalEntity.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		return EditalEntitySerDes.toJSON(this);
	}

}
package br.com.seatecnologia.gdf.negocia.headless.client.dto.v1_0;

import br.com.seatecnologia.gdf.negocia.headless.client.dto.v1_0.ArquivosEntity;
import br.com.seatecnologia.gdf.negocia.headless.client.dto.v1_0.IdentificacaoDebitosEntity;
import br.com.seatecnologia.gdf.negocia.headless.client.function.UnsafeSupplier;
import br.com.seatecnologia.gdf.negocia.headless.client.serdes.v1_0.FundamentacaoPedidoSerDes;

import java.io.Serializable;

import java.util.Objects;

import javax.annotation.Generated;

/**
 * @author sabrina
 * @generated
 */
@Generated("")
public class FundamentacaoPedido implements Cloneable, Serializable {

	public static FundamentacaoPedido toDTO(String json) {
		return FundamentacaoPedidoSerDes.toDTO(json);
	}

	public ArquivosEntity[] getDocumentacaoComprobatoria() {
		return documentacaoComprobatoria;
	}

	public void setDocumentacaoComprobatoria(
		ArquivosEntity[] documentacaoComprobatoria) {

		this.documentacaoComprobatoria = documentacaoComprobatoria;
	}

	public void setDocumentacaoComprobatoria(
		UnsafeSupplier<ArquivosEntity[], Exception>
			documentacaoComprobatoriaUnsafeSupplier) {

		try {
			documentacaoComprobatoria =
				documentacaoComprobatoriaUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected ArquivosEntity[] documentacaoComprobatoria;

	public String getFundamentacao() {
		return fundamentacao;
	}

	public void setFundamentacao(String fundamentacao) {
		this.fundamentacao = fundamentacao;
	}

	public void setFundamentacao(
		UnsafeSupplier<String, Exception> fundamentacaoUnsafeSupplier) {

		try {
			fundamentacao = fundamentacaoUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String fundamentacao;

	public IdentificacaoDebitosEntity[] getIdentificacaoDebitos() {
		return identificacaoDebitos;
	}

	public void setIdentificacaoDebitos(
		IdentificacaoDebitosEntity[] identificacaoDebitos) {

		this.identificacaoDebitos = identificacaoDebitos;
	}

	public void setIdentificacaoDebitos(
		UnsafeSupplier<IdentificacaoDebitosEntity[], Exception>
			identificacaoDebitosUnsafeSupplier) {

		try {
			identificacaoDebitos = identificacaoDebitosUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected IdentificacaoDebitosEntity[] identificacaoDebitos;

	@Override
	public FundamentacaoPedido clone() throws CloneNotSupportedException {
		return (FundamentacaoPedido)super.clone();
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof FundamentacaoPedido)) {
			return false;
		}

		FundamentacaoPedido fundamentacaoPedido = (FundamentacaoPedido)object;

		return Objects.equals(toString(), fundamentacaoPedido.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		return FundamentacaoPedidoSerDes.toJSON(this);
	}

}
package br.com.seatecnologia.gdf.negocia.headless.client.dto.v1_0;

import br.com.seatecnologia.gdf.negocia.headless.client.function.UnsafeSupplier;
import br.com.seatecnologia.gdf.negocia.headless.client.serdes.v1_0.IdentificacaoDebitosEntitySerDes;

import java.io.Serializable;

import java.util.Objects;

import javax.annotation.Generated;

/**
 * @author sabrina
 * @generated
 */
@Generated("")
public class IdentificacaoDebitosEntity implements Cloneable, Serializable {

	public static IdentificacaoDebitosEntity toDTO(String json) {
		return IdentificacaoDebitosEntitySerDes.toDTO(json);
	}

	public String getGarantidoJudicialmente() {
		return garantidoJudicialmente;
	}

	public void setGarantidoJudicialmente(String garantidoJudicialmente) {
		this.garantidoJudicialmente = garantidoJudicialmente;
	}

	public void setGarantidoJudicialmente(
		UnsafeSupplier<String, Exception>
			garantidoJudicialmenteUnsafeSupplier) {

		try {
			garantidoJudicialmente = garantidoJudicialmenteUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String garantidoJudicialmente;

	public String getInscricaoDividaAtiva() {
		return inscricaoDividaAtiva;
	}

	public void setInscricaoDividaAtiva(String inscricaoDividaAtiva) {
		this.inscricaoDividaAtiva = inscricaoDividaAtiva;
	}

	public void setInscricaoDividaAtiva(
		UnsafeSupplier<String, Exception> inscricaoDividaAtivaUnsafeSupplier) {

		try {
			inscricaoDividaAtiva = inscricaoDividaAtivaUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String inscricaoDividaAtiva;

	public String getNatureza() {
		return natureza;
	}

	public void setNatureza(String natureza) {
		this.natureza = natureza;
	}

	public void setNatureza(
		UnsafeSupplier<String, Exception> naturezaUnsafeSupplier) {

		try {
			natureza = naturezaUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String natureza;

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	public void setSituacao(
		UnsafeSupplier<String, Exception> situacaoUnsafeSupplier) {

		try {
			situacao = situacaoUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String situacao;

	@Override
	public IdentificacaoDebitosEntity clone()
		throws CloneNotSupportedException {

		return (IdentificacaoDebitosEntity)super.clone();
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof IdentificacaoDebitosEntity)) {
			return false;
		}

		IdentificacaoDebitosEntity identificacaoDebitosEntity =
			(IdentificacaoDebitosEntity)object;

		return Objects.equals(
			toString(), identificacaoDebitosEntity.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		return IdentificacaoDebitosEntitySerDes.toJSON(this);
	}

}
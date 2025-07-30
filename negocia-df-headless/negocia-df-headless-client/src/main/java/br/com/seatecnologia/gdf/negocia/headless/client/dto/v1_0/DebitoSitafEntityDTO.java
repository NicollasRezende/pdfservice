package br.com.seatecnologia.gdf.negocia.headless.client.dto.v1_0;

import br.com.seatecnologia.gdf.negocia.headless.client.dto.v1_0.IdentificadorCreditoEntityDTO;
import br.com.seatecnologia.gdf.negocia.headless.client.function.UnsafeSupplier;
import br.com.seatecnologia.gdf.negocia.headless.client.serdes.v1_0.DebitoSitafEntityDTOSerDes;

import java.io.Serializable;

import java.util.Objects;

import javax.annotation.Generated;

/**
 * @author sabrina
 * @generated
 */
@Generated("")
public class DebitoSitafEntityDTO implements Cloneable, Serializable {

	public static DebitoSitafEntityDTO toDTO(String json) {
		return DebitoSitafEntityDTOSerDes.toDTO(json);
	}

	public String getTipoDebito() {
		return TipoDebito;
	}

	public void setTipoDebito(String TipoDebito) {
		this.TipoDebito = TipoDebito;
	}

	public void setTipoDebito(
		UnsafeSupplier<String, Exception> TipoDebitoUnsafeSupplier) {

		try {
			TipoDebito = TipoDebitoUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String TipoDebito;

	public Integer getAnoExercicio() {
		return anoExercicio;
	}

	public void setAnoExercicio(Integer anoExercicio) {
		this.anoExercicio = anoExercicio;
	}

	public void setAnoExercicio(
		UnsafeSupplier<Integer, Exception> anoExercicioUnsafeSupplier) {

		try {
			anoExercicio = anoExercicioUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Integer anoExercicio;

	public String getCodigoOrgaoGerador() {
		return codigoOrgaoGerador;
	}

	public void setCodigoOrgaoGerador(String codigoOrgaoGerador) {
		this.codigoOrgaoGerador = codigoOrgaoGerador;
	}

	public void setCodigoOrgaoGerador(
		UnsafeSupplier<String, Exception> codigoOrgaoGeradorUnsafeSupplier) {

		try {
			codigoOrgaoGerador = codigoOrgaoGeradorUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String codigoOrgaoGerador;

	public String getCodigoRatingDivida() {
		return codigoRatingDivida;
	}

	public void setCodigoRatingDivida(String codigoRatingDivida) {
		this.codigoRatingDivida = codigoRatingDivida;
	}

	public void setCodigoRatingDivida(
		UnsafeSupplier<String, Exception> codigoRatingDividaUnsafeSupplier) {

		try {
			codigoRatingDivida = codigoRatingDividaUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String codigoRatingDivida;

	public String getCodigoReceita() {
		return codigoReceita;
	}

	public void setCodigoReceita(String codigoReceita) {
		this.codigoReceita = codigoReceita;
	}

	public void setCodigoReceita(
		UnsafeSupplier<String, Exception> codigoReceitaUnsafeSupplier) {

		try {
			codigoReceita = codigoReceitaUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String codigoReceita;

	public String getCodigoSituacaoDebito() {
		return codigoSituacaoDebito;
	}

	public void setCodigoSituacaoDebito(String codigoSituacaoDebito) {
		this.codigoSituacaoDebito = codigoSituacaoDebito;
	}

	public void setCodigoSituacaoDebito(
		UnsafeSupplier<String, Exception> codigoSituacaoDebitoUnsafeSupplier) {

		try {
			codigoSituacaoDebito = codigoSituacaoDebitoUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String codigoSituacaoDebito;

	public String getDescricaoReceita() {
		return descricaoReceita;
	}

	public void setDescricaoReceita(String descricaoReceita) {
		this.descricaoReceita = descricaoReceita;
	}

	public void setDescricaoReceita(
		UnsafeSupplier<String, Exception> descricaoReceitaUnsafeSupplier) {

		try {
			descricaoReceita = descricaoReceitaUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String descricaoReceita;

	public String getEstadoDebito() {
		return estadoDebito;
	}

	public void setEstadoDebito(String estadoDebito) {
		this.estadoDebito = estadoDebito;
	}

	public void setEstadoDebito(
		UnsafeSupplier<String, Exception> estadoDebitoUnsafeSupplier) {

		try {
			estadoDebito = estadoDebitoUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String estadoDebito;

	public IdentificadorCreditoEntityDTO getIdentificadorCredito() {
		return identificadorCredito;
	}

	public void setIdentificadorCredito(
		IdentificadorCreditoEntityDTO identificadorCredito) {

		this.identificadorCredito = identificadorCredito;
	}

	public void setIdentificadorCredito(
		UnsafeSupplier<IdentificadorCreditoEntityDTO, Exception>
			identificadorCreditoUnsafeSupplier) {

		try {
			identificadorCredito = identificadorCreditoUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected IdentificadorCreditoEntityDTO identificadorCredito;

	public String getJudicializado() {
		return judicializado;
	}

	public void setJudicializado(String judicializado) {
		this.judicializado = judicializado;
	}

	public void setJudicializado(
		UnsafeSupplier<String, Exception> judicializadoUnsafeSupplier) {

		try {
			judicializado = judicializadoUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String judicializado;

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public void setObservacao(
		UnsafeSupplier<String, Exception> observacaoUnsafeSupplier) {

		try {
			observacao = observacaoUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String observacao;

	public Double getValorJuros() {
		return valorJuros;
	}

	public void setValorJuros(Double valorJuros) {
		this.valorJuros = valorJuros;
	}

	public void setValorJuros(
		UnsafeSupplier<Double, Exception> valorJurosUnsafeSupplier) {

		try {
			valorJuros = valorJurosUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Double valorJuros;

	public Double getValorMulta() {
		return valorMulta;
	}

	public void setValorMulta(Double valorMulta) {
		this.valorMulta = valorMulta;
	}

	public void setValorMulta(
		UnsafeSupplier<Double, Exception> valorMultaUnsafeSupplier) {

		try {
			valorMulta = valorMultaUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Double valorMulta;

	public Double getValorOutros() {
		return valorOutros;
	}

	public void setValorOutros(Double valorOutros) {
		this.valorOutros = valorOutros;
	}

	public void setValorOutros(
		UnsafeSupplier<Double, Exception> valorOutrosUnsafeSupplier) {

		try {
			valorOutros = valorOutrosUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Double valorOutros;

	public Double getValorPrincipal() {
		return valorPrincipal;
	}

	public void setValorPrincipal(Double valorPrincipal) {
		this.valorPrincipal = valorPrincipal;
	}

	public void setValorPrincipal(
		UnsafeSupplier<Double, Exception> valorPrincipalUnsafeSupplier) {

		try {
			valorPrincipal = valorPrincipalUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Double valorPrincipal;

	@Override
	public DebitoSitafEntityDTO clone() throws CloneNotSupportedException {
		return (DebitoSitafEntityDTO)super.clone();
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof DebitoSitafEntityDTO)) {
			return false;
		}

		DebitoSitafEntityDTO debitoSitafEntityDTO =
			(DebitoSitafEntityDTO)object;

		return Objects.equals(toString(), debitoSitafEntityDTO.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		return DebitoSitafEntityDTOSerDes.toJSON(this);
	}

}
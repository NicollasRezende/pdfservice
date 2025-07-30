package br.com.seatecnologia.gdf.negocia.headless.client.dto.v1_0;

import br.com.seatecnologia.gdf.negocia.headless.client.function.UnsafeSupplier;
import br.com.seatecnologia.gdf.negocia.headless.client.serdes.v1_0.IdentificadorCreditoEntityDTOSerDes;

import java.io.Serializable;

import java.util.Objects;

import javax.annotation.Generated;

/**
 * @author sabrina
 * @generated
 */
@Generated("")
public class IdentificadorCreditoEntityDTO implements Cloneable, Serializable {

	public static IdentificadorCreditoEntityDTO toDTO(String json) {
		return IdentificadorCreditoEntityDTOSerDes.toDTO(json);
	}

	public String getNumeroDaGuia() {
		return numeroDaGuia;
	}

	public void setNumeroDaGuia(String numeroDaGuia) {
		this.numeroDaGuia = numeroDaGuia;
	}

	public void setNumeroDaGuia(
		UnsafeSupplier<String, Exception> numeroDaGuiaUnsafeSupplier) {

		try {
			numeroDaGuia = numeroDaGuiaUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String numeroDaGuia;

	public String getNumeroDivida() {
		return numeroDivida;
	}

	public void setNumeroDivida(String numeroDivida) {
		this.numeroDivida = numeroDivida;
	}

	public void setNumeroDivida(
		UnsafeSupplier<String, Exception> numeroDividaUnsafeSupplier) {

		try {
			numeroDivida = numeroDividaUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String numeroDivida;

	public String getRenavam() {
		return renavam;
	}

	public void setRenavam(String renavam) {
		this.renavam = renavam;
	}

	public void setRenavam(
		UnsafeSupplier<String, Exception> renavamUnsafeSupplier) {

		try {
			renavam = renavamUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String renavam;

	@Override
	public IdentificadorCreditoEntityDTO clone()
		throws CloneNotSupportedException {

		return (IdentificadorCreditoEntityDTO)super.clone();
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof IdentificadorCreditoEntityDTO)) {
			return false;
		}

		IdentificadorCreditoEntityDTO identificadorCreditoEntityDTO =
			(IdentificadorCreditoEntityDTO)object;

		return Objects.equals(
			toString(), identificadorCreditoEntityDTO.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		return IdentificadorCreditoEntityDTOSerDes.toJSON(this);
	}

}
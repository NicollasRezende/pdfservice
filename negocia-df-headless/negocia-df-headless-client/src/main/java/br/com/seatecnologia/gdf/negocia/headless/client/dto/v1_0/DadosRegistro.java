package br.com.seatecnologia.gdf.negocia.headless.client.dto.v1_0;

import br.com.seatecnologia.gdf.negocia.headless.client.dto.v1_0.ArquivosEntity;
import br.com.seatecnologia.gdf.negocia.headless.client.function.UnsafeSupplier;
import br.com.seatecnologia.gdf.negocia.headless.client.serdes.v1_0.DadosRegistroSerDes;

import java.io.Serializable;

import java.util.Objects;

import javax.annotation.Generated;

/**
 * @author sabrina
 * @generated
 */
@Generated("")
public class DadosRegistro implements Cloneable, Serializable {

	public static DadosRegistro toDTO(String json) {
		return DadosRegistroSerDes.toDTO(json);
	}

	public String getCartorioRegistro() {
		return cartorioRegistro;
	}

	public void setCartorioRegistro(String cartorioRegistro) {
		this.cartorioRegistro = cartorioRegistro;
	}

	public void setCartorioRegistro(
		UnsafeSupplier<String, Exception> cartorioRegistroUnsafeSupplier) {

		try {
			cartorioRegistro = cartorioRegistroUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String cartorioRegistro;

	public String getMatriculaImovel() {
		return matriculaImovel;
	}

	public void setMatriculaImovel(String matriculaImovel) {
		this.matriculaImovel = matriculaImovel;
	}

	public void setMatriculaImovel(
		UnsafeSupplier<String, Exception> matriculaImovelUnsafeSupplier) {

		try {
			matriculaImovel = matriculaImovelUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String matriculaImovel;

	public ArquivosEntity[] getOutrosDocumento() {
		return outrosDocumento;
	}

	public void setOutrosDocumento(ArquivosEntity[] outrosDocumento) {
		this.outrosDocumento = outrosDocumento;
	}

	public void setOutrosDocumento(
		UnsafeSupplier<ArquivosEntity[], Exception>
			outrosDocumentoUnsafeSupplier) {

		try {
			outrosDocumento = outrosDocumentoUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected ArquivosEntity[] outrosDocumento;

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
	public DadosRegistro clone() throws CloneNotSupportedException {
		return (DadosRegistro)super.clone();
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof DadosRegistro)) {
			return false;
		}

		DadosRegistro dadosRegistro = (DadosRegistro)object;

		return Objects.equals(toString(), dadosRegistro.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		return DadosRegistroSerDes.toJSON(this);
	}

}
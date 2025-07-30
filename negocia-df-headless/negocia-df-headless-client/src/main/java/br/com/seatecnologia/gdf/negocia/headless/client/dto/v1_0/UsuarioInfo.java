package br.com.seatecnologia.gdf.negocia.headless.client.dto.v1_0;

import br.com.seatecnologia.gdf.negocia.headless.client.function.UnsafeSupplier;
import br.com.seatecnologia.gdf.negocia.headless.client.serdes.v1_0.UsuarioInfoSerDes;

import java.io.Serializable;

import java.util.Objects;

import javax.annotation.Generated;

/**
 * @author sabrina
 * @generated
 */
@Generated("")
public class UsuarioInfo implements Cloneable, Serializable {

	public static UsuarioInfo toDTO(String json) {
		return UsuarioInfoSerDes.toDTO(json);
	}

	public String getCpfcnpj() {
		return cpfcnpj;
	}

	public void setCpfcnpj(String cpfcnpj) {
		this.cpfcnpj = cpfcnpj;
	}

	public void setCpfcnpj(
		UnsafeSupplier<String, Exception> cpfcnpjUnsafeSupplier) {

		try {
			cpfcnpj = cpfcnpjUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String cpfcnpj;

	public String getTipoLogin() {
		return tipoLogin;
	}

	public void setTipoLogin(String tipoLogin) {
		this.tipoLogin = tipoLogin;
	}

	public void setTipoLogin(
		UnsafeSupplier<String, Exception> tipoLoginUnsafeSupplier) {

		try {
			tipoLogin = tipoLoginUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String tipoLogin;

	@Override
	public UsuarioInfo clone() throws CloneNotSupportedException {
		return (UsuarioInfo)super.clone();
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof UsuarioInfo)) {
			return false;
		}

		UsuarioInfo usuarioInfo = (UsuarioInfo)object;

		return Objects.equals(toString(), usuarioInfo.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		return UsuarioInfoSerDes.toJSON(this);
	}

}
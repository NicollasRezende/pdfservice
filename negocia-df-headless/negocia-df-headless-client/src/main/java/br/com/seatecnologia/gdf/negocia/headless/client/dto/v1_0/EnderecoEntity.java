package br.com.seatecnologia.gdf.negocia.headless.client.dto.v1_0;

import br.com.seatecnologia.gdf.negocia.headless.client.function.UnsafeSupplier;
import br.com.seatecnologia.gdf.negocia.headless.client.serdes.v1_0.EnderecoEntitySerDes;

import java.io.Serializable;

import java.util.Objects;

import javax.annotation.Generated;

/**
 * @author sabrina
 * @generated
 */
@Generated("")
public class EnderecoEntity implements Cloneable, Serializable {

	public static EnderecoEntity toDTO(String json) {
		return EnderecoEntitySerDes.toDTO(json);
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public void setBairro(
		UnsafeSupplier<String, Exception> bairroUnsafeSupplier) {

		try {
			bairro = bairroUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String bairro;

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public void setCep(UnsafeSupplier<String, Exception> cepUnsafeSupplier) {
		try {
			cep = cepUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String cep;

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public void setComplemento(
		UnsafeSupplier<String, Exception> complementoUnsafeSupplier) {

		try {
			complemento = complementoUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String complemento;

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public void setEndereco(
		UnsafeSupplier<String, Exception> enderecoUnsafeSupplier) {

		try {
			endereco = enderecoUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String endereco;

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public void setEstado(
		UnsafeSupplier<String, Exception> estadoUnsafeSupplier) {

		try {
			estado = estadoUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String estado;

	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	public void setMunicipio(
		UnsafeSupplier<String, Exception> municipioUnsafeSupplier) {

		try {
			municipio = municipioUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String municipio;

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public void setNumero(
		UnsafeSupplier<String, Exception> numeroUnsafeSupplier) {

		try {
			numero = numeroUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String numero;

	@Override
	public EnderecoEntity clone() throws CloneNotSupportedException {
		return (EnderecoEntity)super.clone();
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof EnderecoEntity)) {
			return false;
		}

		EnderecoEntity enderecoEntity = (EnderecoEntity)object;

		return Objects.equals(toString(), enderecoEntity.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		return EnderecoEntitySerDes.toJSON(this);
	}

}
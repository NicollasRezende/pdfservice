package br.com.seatecnologia.gdf.negocia.headless.client.dto.v1_0;

import br.com.seatecnologia.gdf.negocia.headless.client.dto.v1_0.LaudoAvaliacaoEntity;
import br.com.seatecnologia.gdf.negocia.headless.client.function.UnsafeSupplier;
import br.com.seatecnologia.gdf.negocia.headless.client.serdes.v1_0.BensDireitosRequerenteEntitySerDes;

import java.io.Serializable;

import java.util.Objects;

import javax.annotation.Generated;

/**
 * @author sabrina
 * @generated
 */
@Generated("")
public class BensDireitosRequerenteEntity implements Cloneable, Serializable {

	public static BensDireitosRequerenteEntity toDTO(String json) {
		return BensDireitosRequerenteEntitySerDes.toDTO(json);
	}

	public Long getBemId() {
		return bemId;
	}

	public void setBemId(Long bemId) {
		this.bemId = bemId;
	}

	public void setBemId(UnsafeSupplier<Long, Exception> bemIdUnsafeSupplier) {
		try {
			bemId = bemIdUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Long bemId;

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

	public LaudoAvaliacaoEntity[] getLaudoAvaliacaoEntities() {
		return laudoAvaliacaoEntities;
	}

	public void setLaudoAvaliacaoEntities(
		LaudoAvaliacaoEntity[] laudoAvaliacaoEntities) {

		this.laudoAvaliacaoEntities = laudoAvaliacaoEntities;
	}

	public void setLaudoAvaliacaoEntities(
		UnsafeSupplier<LaudoAvaliacaoEntity[], Exception>
			laudoAvaliacaoEntitiesUnsafeSupplier) {

		try {
			laudoAvaliacaoEntities = laudoAvaliacaoEntitiesUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected LaudoAvaliacaoEntity[] laudoAvaliacaoEntities;

	public String getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}

	public void setLocalizacao(
		UnsafeSupplier<String, Exception> localizacaoUnsafeSupplier) {

		try {
			localizacao = localizacaoUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String localizacao;

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

	@Override
	public BensDireitosRequerenteEntity clone()
		throws CloneNotSupportedException {

		return (BensDireitosRequerenteEntity)super.clone();
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof BensDireitosRequerenteEntity)) {
			return false;
		}

		BensDireitosRequerenteEntity bensDireitosRequerenteEntity =
			(BensDireitosRequerenteEntity)object;

		return Objects.equals(
			toString(), bensDireitosRequerenteEntity.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		return BensDireitosRequerenteEntitySerDes.toJSON(this);
	}

}
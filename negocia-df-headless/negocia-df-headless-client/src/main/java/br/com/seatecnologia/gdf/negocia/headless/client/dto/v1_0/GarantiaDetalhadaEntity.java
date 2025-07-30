package br.com.seatecnologia.gdf.negocia.headless.client.dto.v1_0;

import br.com.seatecnologia.gdf.negocia.headless.client.dto.v1_0.ArquivosEntity;
import br.com.seatecnologia.gdf.negocia.headless.client.dto.v1_0.DadosRegistro;
import br.com.seatecnologia.gdf.negocia.headless.client.dto.v1_0.QualificacaoCompletaEntity;
import br.com.seatecnologia.gdf.negocia.headless.client.function.UnsafeSupplier;
import br.com.seatecnologia.gdf.negocia.headless.client.serdes.v1_0.GarantiaDetalhadaEntitySerDes;

import java.io.Serializable;

import java.util.Objects;

import javax.annotation.Generated;

/**
 * @author sabrina
 * @generated
 */
@Generated("")
public class GarantiaDetalhadaEntity implements Cloneable, Serializable {

	public static GarantiaDetalhadaEntity toDTO(String json) {
		return GarantiaDetalhadaEntitySerDes.toDTO(json);
	}

	public DadosRegistro getDadosRegistro() {
		return dadosRegistro;
	}

	public void setDadosRegistro(DadosRegistro dadosRegistro) {
		this.dadosRegistro = dadosRegistro;
	}

	public void setDadosRegistro(
		UnsafeSupplier<DadosRegistro, Exception> dadosRegistroUnsafeSupplier) {

		try {
			dadosRegistro = dadosRegistroUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected DadosRegistro dadosRegistro;

	public ArquivosEntity getDeclaracao() {
		return declaracao;
	}

	public void setDeclaracao(ArquivosEntity declaracao) {
		this.declaracao = declaracao;
	}

	public void setDeclaracao(
		UnsafeSupplier<ArquivosEntity, Exception> declaracaoUnsafeSupplier) {

		try {
			declaracao = declaracaoUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected ArquivosEntity declaracao;

	public Boolean getDeclaracaoAnuencia() {
		return declaracaoAnuencia;
	}

	public void setDeclaracaoAnuencia(Boolean declaracaoAnuencia) {
		this.declaracaoAnuencia = declaracaoAnuencia;
	}

	public void setDeclaracaoAnuencia(
		UnsafeSupplier<Boolean, Exception> declaracaoAnuenciaUnsafeSupplier) {

		try {
			declaracaoAnuencia = declaracaoAnuenciaUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Boolean declaracaoAnuencia;

	public String getDescricaoBem() {
		return descricaoBem;
	}

	public void setDescricaoBem(String descricaoBem) {
		this.descricaoBem = descricaoBem;
	}

	public void setDescricaoBem(
		UnsafeSupplier<String, Exception> descricaoBemUnsafeSupplier) {

		try {
			descricaoBem = descricaoBemUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String descricaoBem;

	public Long getGarantiaId() {
		return garantiaId;
	}

	public void setGarantiaId(Long garantiaId) {
		this.garantiaId = garantiaId;
	}

	public void setGarantiaId(
		UnsafeSupplier<Long, Exception> garantiaIdUnsafeSupplier) {

		try {
			garantiaId = garantiaIdUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Long garantiaId;

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

	public String getOutrasGarantias() {
		return outrasGarantias;
	}

	public void setOutrasGarantias(String outrasGarantias) {
		this.outrasGarantias = outrasGarantias;
	}

	public void setOutrasGarantias(
		UnsafeSupplier<String, Exception> outrasGarantiasUnsafeSupplier) {

		try {
			outrasGarantias = outrasGarantiasUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String outrasGarantias;

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

	public QualificacaoCompletaEntity getProprietario() {
		return proprietario;
	}

	public void setProprietario(QualificacaoCompletaEntity proprietario) {
		this.proprietario = proprietario;
	}

	public void setProprietario(
		UnsafeSupplier<QualificacaoCompletaEntity, Exception>
			proprietarioUnsafeSupplier) {

		try {
			proprietario = proprietarioUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected QualificacaoCompletaEntity proprietario;

	public String getTipoDevedor() {
		return tipoDevedor;
	}

	public void setTipoDevedor(String tipoDevedor) {
		this.tipoDevedor = tipoDevedor;
	}

	public void setTipoDevedor(
		UnsafeSupplier<String, Exception> tipoDevedorUnsafeSupplier) {

		try {
			tipoDevedor = tipoDevedorUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String tipoDevedor;

	public String getTipoGarantia() {
		return tipoGarantia;
	}

	public void setTipoGarantia(String tipoGarantia) {
		this.tipoGarantia = tipoGarantia;
	}

	public void setTipoGarantia(
		UnsafeSupplier<String, Exception> tipoGarantiaUnsafeSupplier) {

		try {
			tipoGarantia = tipoGarantiaUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String tipoGarantia;

	public Double getValorEstimado() {
		return valorEstimado;
	}

	public void setValorEstimado(Double valorEstimado) {
		this.valorEstimado = valorEstimado;
	}

	public void setValorEstimado(
		UnsafeSupplier<Double, Exception> valorEstimadoUnsafeSupplier) {

		try {
			valorEstimado = valorEstimadoUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Double valorEstimado;

	@Override
	public GarantiaDetalhadaEntity clone() throws CloneNotSupportedException {
		return (GarantiaDetalhadaEntity)super.clone();
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof GarantiaDetalhadaEntity)) {
			return false;
		}

		GarantiaDetalhadaEntity garantiaDetalhadaEntity =
			(GarantiaDetalhadaEntity)object;

		return Objects.equals(toString(), garantiaDetalhadaEntity.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		return GarantiaDetalhadaEntitySerDes.toJSON(this);
	}

}
package br.com.seatecnologia.gdf.negocia.headless.client.dto.v1_0;

import br.com.seatecnologia.gdf.negocia.headless.client.dto.v1_0.AcoesJudiciaisEntity;
import br.com.seatecnologia.gdf.negocia.headless.client.dto.v1_0.AdministradorJudicialEntity;
import br.com.seatecnologia.gdf.negocia.headless.client.dto.v1_0.AdvogadoEntity;
import br.com.seatecnologia.gdf.negocia.headless.client.dto.v1_0.ArquivosEntity;
import br.com.seatecnologia.gdf.negocia.headless.client.dto.v1_0.BensDireitosRequerenteEntity;
import br.com.seatecnologia.gdf.negocia.headless.client.dto.v1_0.DadosContribuinteEntity;
import br.com.seatecnologia.gdf.negocia.headless.client.dto.v1_0.Declaracao;
import br.com.seatecnologia.gdf.negocia.headless.client.dto.v1_0.DemonstracoesContabeisEntities;
import br.com.seatecnologia.gdf.negocia.headless.client.dto.v1_0.FundamentacaoPedido;
import br.com.seatecnologia.gdf.negocia.headless.client.dto.v1_0.GarantiaEntity;
import br.com.seatecnologia.gdf.negocia.headless.client.dto.v1_0.RelacaoCredoresEntity;
import br.com.seatecnologia.gdf.negocia.headless.client.function.UnsafeSupplier;
import br.com.seatecnologia.gdf.negocia.headless.client.serdes.v1_0.PropostaEntitySerDes;

import java.io.Serializable;

import java.util.Date;
import java.util.Objects;

import javax.annotation.Generated;

/**
 * @author sabrina
 * @generated
 */
@Generated("")
public class PropostaEntity implements Cloneable, Serializable {

	public static PropostaEntity toDTO(String json) {
		return PropostaEntitySerDes.toDTO(json);
	}

	public AcoesJudiciaisEntity[] getAcoesJudiciaisEntities() {
		return acoesJudiciaisEntities;
	}

	public void setAcoesJudiciaisEntities(
		AcoesJudiciaisEntity[] acoesJudiciaisEntities) {

		this.acoesJudiciaisEntities = acoesJudiciaisEntities;
	}

	public void setAcoesJudiciaisEntities(
		UnsafeSupplier<AcoesJudiciaisEntity[], Exception>
			acoesJudiciaisEntitiesUnsafeSupplier) {

		try {
			acoesJudiciaisEntities = acoesJudiciaisEntitiesUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected AcoesJudiciaisEntity[] acoesJudiciaisEntities;

	public AdministradorJudicialEntity getAdministradorJudicial() {
		return administradorJudicial;
	}

	public void setAdministradorJudicial(
		AdministradorJudicialEntity administradorJudicial) {

		this.administradorJudicial = administradorJudicial;
	}

	public void setAdministradorJudicial(
		UnsafeSupplier<AdministradorJudicialEntity, Exception>
			administradorJudicialUnsafeSupplier) {

		try {
			administradorJudicial = administradorJudicialUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected AdministradorJudicialEntity administradorJudicial;

	public AdvogadoEntity getAdvogado() {
		return advogado;
	}

	public void setAdvogado(AdvogadoEntity advogado) {
		this.advogado = advogado;
	}

	public void setAdvogado(
		UnsafeSupplier<AdvogadoEntity, Exception> advogadoUnsafeSupplier) {

		try {
			advogado = advogadoUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected AdvogadoEntity advogado;

	public BensDireitosRequerenteEntity getBensDireitosRequerenteEntities() {
		return bensDireitosRequerenteEntities;
	}

	public void setBensDireitosRequerenteEntities(
		BensDireitosRequerenteEntity bensDireitosRequerenteEntities) {

		this.bensDireitosRequerenteEntities = bensDireitosRequerenteEntities;
	}

	public void setBensDireitosRequerenteEntities(
		UnsafeSupplier<BensDireitosRequerenteEntity, Exception>
			bensDireitosRequerenteEntitiesUnsafeSupplier) {

		try {
			bensDireitosRequerenteEntities =
				bensDireitosRequerenteEntitiesUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected BensDireitosRequerenteEntity bensDireitosRequerenteEntities;

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public void setCreateDate(
		UnsafeSupplier<Date, Exception> createDateUnsafeSupplier) {

		try {
			createDate = createDateUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Date createDate;

	public String getCreateUser() {
		return createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	public void setCreateUser(
		UnsafeSupplier<String, Exception> createUserUnsafeSupplier) {

		try {
			createUser = createUserUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String createUser;

	public DadosContribuinteEntity getDadosContribuinte() {
		return dadosContribuinte;
	}

	public void setDadosContribuinte(
		DadosContribuinteEntity dadosContribuinte) {

		this.dadosContribuinte = dadosContribuinte;
	}

	public void setDadosContribuinte(
		UnsafeSupplier<DadosContribuinteEntity, Exception>
			dadosContribuinteUnsafeSupplier) {

		try {
			dadosContribuinte = dadosContribuinteUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected DadosContribuinteEntity dadosContribuinte;

	public Declaracao getDeclaracao() {
		return declaracao;
	}

	public void setDeclaracao(Declaracao declaracao) {
		this.declaracao = declaracao;
	}

	public void setDeclaracao(
		UnsafeSupplier<Declaracao, Exception> declaracaoUnsafeSupplier) {

		try {
			declaracao = declaracaoUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Declaracao declaracao;

	public DemonstracoesContabeisEntities getDemonstracoesContabeisEntities() {
		return demonstracoesContabeisEntities;
	}

	public void setDemonstracoesContabeisEntities(
		DemonstracoesContabeisEntities demonstracoesContabeisEntities) {

		this.demonstracoesContabeisEntities = demonstracoesContabeisEntities;
	}

	public void setDemonstracoesContabeisEntities(
		UnsafeSupplier<DemonstracoesContabeisEntities, Exception>
			demonstracoesContabeisEntitiesUnsafeSupplier) {

		try {
			demonstracoesContabeisEntities =
				demonstracoesContabeisEntitiesUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected DemonstracoesContabeisEntities demonstracoesContabeisEntities;

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

	public FundamentacaoPedido getFundamentacaoPedido() {
		return fundamentacaoPedido;
	}

	public void setFundamentacaoPedido(
		FundamentacaoPedido fundamentacaoPedido) {

		this.fundamentacaoPedido = fundamentacaoPedido;
	}

	public void setFundamentacaoPedido(
		UnsafeSupplier<FundamentacaoPedido, Exception>
			fundamentacaoPedidoUnsafeSupplier) {

		try {
			fundamentacaoPedido = fundamentacaoPedidoUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected FundamentacaoPedido fundamentacaoPedido;

	public GarantiaEntity getGarantiaEntity() {
		return garantiaEntity;
	}

	public void setGarantiaEntity(GarantiaEntity garantiaEntity) {
		this.garantiaEntity = garantiaEntity;
	}

	public void setGarantiaEntity(
		UnsafeSupplier<GarantiaEntity, Exception>
			garantiaEntityUnsafeSupplier) {

		try {
			garantiaEntity = garantiaEntityUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected GarantiaEntity garantiaEntity;

	public Date getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public void setModifiedDate(
		UnsafeSupplier<Date, Exception> modifiedDateUnsafeSupplier) {

		try {
			modifiedDate = modifiedDateUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Date modifiedDate;

	public String getNumeroProtocoloSEI() {
		return numeroProtocoloSEI;
	}

	public void setNumeroProtocoloSEI(String numeroProtocoloSEI) {
		this.numeroProtocoloSEI = numeroProtocoloSEI;
	}

	public void setNumeroProtocoloSEI(
		UnsafeSupplier<String, Exception> numeroProtocoloSEIUnsafeSupplier) {

		try {
			numeroProtocoloSEI = numeroProtocoloSEIUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String numeroProtocoloSEI;

	public ArquivosEntity getProcuracao() {
		return procuracao;
	}

	public void setProcuracao(ArquivosEntity procuracao) {
		this.procuracao = procuracao;
	}

	public void setProcuracao(
		UnsafeSupplier<ArquivosEntity, Exception> procuracaoUnsafeSupplier) {

		try {
			procuracao = procuracaoUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected ArquivosEntity procuracao;

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

	public Long getPropostaPaiId() {
		return propostaPaiId;
	}

	public void setPropostaPaiId(Long propostaPaiId) {
		this.propostaPaiId = propostaPaiId;
	}

	public void setPropostaPaiId(
		UnsafeSupplier<Long, Exception> propostaPaiIdUnsafeSupplier) {

		try {
			propostaPaiId = propostaPaiIdUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Long propostaPaiId;

	public String getProtocolo() {
		return protocolo;
	}

	public void setProtocolo(String protocolo) {
		this.protocolo = protocolo;
	}

	public void setProtocolo(
		UnsafeSupplier<String, Exception> protocoloUnsafeSupplier) {

		try {
			protocolo = protocoloUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String protocolo;

	public RelacaoCredoresEntity[] getRelacaoCredoresEntities() {
		return relacaoCredoresEntities;
	}

	public void setRelacaoCredoresEntities(
		RelacaoCredoresEntity[] relacaoCredoresEntities) {

		this.relacaoCredoresEntities = relacaoCredoresEntities;
	}

	public void setRelacaoCredoresEntities(
		UnsafeSupplier<RelacaoCredoresEntity[], Exception>
			relacaoCredoresEntitiesUnsafeSupplier) {

		try {
			relacaoCredoresEntities =
				relacaoCredoresEntitiesUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected RelacaoCredoresEntity[] relacaoCredoresEntities;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void setStatus(
		UnsafeSupplier<String, Exception> statusUnsafeSupplier) {

		try {
			status = statusUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String status;

	public String getTipoProposta() {
		return tipoProposta;
	}

	public void setTipoProposta(String tipoProposta) {
		this.tipoProposta = tipoProposta;
	}

	public void setTipoProposta(
		UnsafeSupplier<String, Exception> tipoPropostaUnsafeSupplier) {

		try {
			tipoProposta = tipoPropostaUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String tipoProposta;

	public String getZipUrl() {
		return zipUrl;
	}

	public void setZipUrl(String zipUrl) {
		this.zipUrl = zipUrl;
	}

	public void setZipUrl(
		UnsafeSupplier<String, Exception> zipUrlUnsafeSupplier) {

		try {
			zipUrl = zipUrlUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String zipUrl;

	@Override
	public PropostaEntity clone() throws CloneNotSupportedException {
		return (PropostaEntity)super.clone();
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof PropostaEntity)) {
			return false;
		}

		PropostaEntity propostaEntity = (PropostaEntity)object;

		return Objects.equals(toString(), propostaEntity.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		return PropostaEntitySerDes.toJSON(this);
	}

}
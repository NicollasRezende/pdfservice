package br.com.seatecnologia.gdf.negocia.headless.dto.v1_0;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import com.liferay.petra.function.UnsafeSupplier;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.vulcan.graphql.annotation.GraphQLField;
import com.liferay.portal.vulcan.graphql.annotation.GraphQLName;
import com.liferay.portal.vulcan.util.ObjectMapperUtil;

import java.io.Serializable;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.function.Supplier;

import javax.annotation.Generated;

import javax.validation.Valid;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author sabrina
 * @generated
 */
@Generated("")
@GraphQLName("PropostaEntity")
@JsonFilter("Liferay.Vulcan")
@XmlRootElement(name = "PropostaEntity")
public class PropostaEntity implements Serializable {

	public static PropostaEntity toDTO(String json) {
		return ObjectMapperUtil.readValue(PropostaEntity.class, json);
	}

	public static PropostaEntity unsafeToDTO(String json) {
		return ObjectMapperUtil.unsafeReadValue(PropostaEntity.class, json);
	}

	@io.swagger.v3.oas.annotations.media.Schema
	@Valid
	public AcoesJudiciaisEntity[] getAcoesJudiciaisEntities() {
		if (_acoesJudiciaisEntitiesSupplier != null) {
			acoesJudiciaisEntities = _acoesJudiciaisEntitiesSupplier.get();

			_acoesJudiciaisEntitiesSupplier = null;
		}

		return acoesJudiciaisEntities;
	}

	public void setAcoesJudiciaisEntities(
		AcoesJudiciaisEntity[] acoesJudiciaisEntities) {

		this.acoesJudiciaisEntities = acoesJudiciaisEntities;

		_acoesJudiciaisEntitiesSupplier = null;
	}

	@JsonIgnore
	public void setAcoesJudiciaisEntities(
		UnsafeSupplier<AcoesJudiciaisEntity[], Exception>
			acoesJudiciaisEntitiesUnsafeSupplier) {

		_acoesJudiciaisEntitiesSupplier = () -> {
			try {
				return acoesJudiciaisEntitiesUnsafeSupplier.get();
			}
			catch (RuntimeException runtimeException) {
				throw runtimeException;
			}
			catch (Exception exception) {
				throw new RuntimeException(exception);
			}
		};
	}

	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected AcoesJudiciaisEntity[] acoesJudiciaisEntities;

	@JsonIgnore
	private Supplier<AcoesJudiciaisEntity[]> _acoesJudiciaisEntitiesSupplier;

	@io.swagger.v3.oas.annotations.media.Schema
	@Valid
	public AdministradorJudicialEntity getAdministradorJudicial() {
		if (_administradorJudicialSupplier != null) {
			administradorJudicial = _administradorJudicialSupplier.get();

			_administradorJudicialSupplier = null;
		}

		return administradorJudicial;
	}

	public void setAdministradorJudicial(
		AdministradorJudicialEntity administradorJudicial) {

		this.administradorJudicial = administradorJudicial;

		_administradorJudicialSupplier = null;
	}

	@JsonIgnore
	public void setAdministradorJudicial(
		UnsafeSupplier<AdministradorJudicialEntity, Exception>
			administradorJudicialUnsafeSupplier) {

		_administradorJudicialSupplier = () -> {
			try {
				return administradorJudicialUnsafeSupplier.get();
			}
			catch (RuntimeException runtimeException) {
				throw runtimeException;
			}
			catch (Exception exception) {
				throw new RuntimeException(exception);
			}
		};
	}

	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected AdministradorJudicialEntity administradorJudicial;

	@JsonIgnore
	private Supplier<AdministradorJudicialEntity>
		_administradorJudicialSupplier;

	@io.swagger.v3.oas.annotations.media.Schema
	@Valid
	public AdvogadoEntity getAdvogado() {
		if (_advogadoSupplier != null) {
			advogado = _advogadoSupplier.get();

			_advogadoSupplier = null;
		}

		return advogado;
	}

	public void setAdvogado(AdvogadoEntity advogado) {
		this.advogado = advogado;

		_advogadoSupplier = null;
	}

	@JsonIgnore
	public void setAdvogado(
		UnsafeSupplier<AdvogadoEntity, Exception> advogadoUnsafeSupplier) {

		_advogadoSupplier = () -> {
			try {
				return advogadoUnsafeSupplier.get();
			}
			catch (RuntimeException runtimeException) {
				throw runtimeException;
			}
			catch (Exception exception) {
				throw new RuntimeException(exception);
			}
		};
	}

	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected AdvogadoEntity advogado;

	@JsonIgnore
	private Supplier<AdvogadoEntity> _advogadoSupplier;

	@io.swagger.v3.oas.annotations.media.Schema
	@Valid
	public BensDireitosRequerenteEntity getBensDireitosRequerenteEntities() {
		if (_bensDireitosRequerenteEntitiesSupplier != null) {
			bensDireitosRequerenteEntities =
				_bensDireitosRequerenteEntitiesSupplier.get();

			_bensDireitosRequerenteEntitiesSupplier = null;
		}

		return bensDireitosRequerenteEntities;
	}

	public void setBensDireitosRequerenteEntities(
		BensDireitosRequerenteEntity bensDireitosRequerenteEntities) {

		this.bensDireitosRequerenteEntities = bensDireitosRequerenteEntities;

		_bensDireitosRequerenteEntitiesSupplier = null;
	}

	@JsonIgnore
	public void setBensDireitosRequerenteEntities(
		UnsafeSupplier<BensDireitosRequerenteEntity, Exception>
			bensDireitosRequerenteEntitiesUnsafeSupplier) {

		_bensDireitosRequerenteEntitiesSupplier = () -> {
			try {
				return bensDireitosRequerenteEntitiesUnsafeSupplier.get();
			}
			catch (RuntimeException runtimeException) {
				throw runtimeException;
			}
			catch (Exception exception) {
				throw new RuntimeException(exception);
			}
		};
	}

	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected BensDireitosRequerenteEntity bensDireitosRequerenteEntities;

	@JsonIgnore
	private Supplier<BensDireitosRequerenteEntity>
		_bensDireitosRequerenteEntitiesSupplier;

	@io.swagger.v3.oas.annotations.media.Schema
	public Date getCreateDate() {
		if (_createDateSupplier != null) {
			createDate = _createDateSupplier.get();

			_createDateSupplier = null;
		}

		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;

		_createDateSupplier = null;
	}

	@JsonIgnore
	public void setCreateDate(
		UnsafeSupplier<Date, Exception> createDateUnsafeSupplier) {

		_createDateSupplier = () -> {
			try {
				return createDateUnsafeSupplier.get();
			}
			catch (RuntimeException runtimeException) {
				throw runtimeException;
			}
			catch (Exception exception) {
				throw new RuntimeException(exception);
			}
		};
	}

	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Date createDate;

	@JsonIgnore
	private Supplier<Date> _createDateSupplier;

	@io.swagger.v3.oas.annotations.media.Schema
	public String getCreateUser() {
		if (_createUserSupplier != null) {
			createUser = _createUserSupplier.get();

			_createUserSupplier = null;
		}

		return createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;

		_createUserSupplier = null;
	}

	@JsonIgnore
	public void setCreateUser(
		UnsafeSupplier<String, Exception> createUserUnsafeSupplier) {

		_createUserSupplier = () -> {
			try {
				return createUserUnsafeSupplier.get();
			}
			catch (RuntimeException runtimeException) {
				throw runtimeException;
			}
			catch (Exception exception) {
				throw new RuntimeException(exception);
			}
		};
	}

	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String createUser;

	@JsonIgnore
	private Supplier<String> _createUserSupplier;

	@io.swagger.v3.oas.annotations.media.Schema
	@Valid
	public DadosContribuinteEntity getDadosContribuinte() {
		if (_dadosContribuinteSupplier != null) {
			dadosContribuinte = _dadosContribuinteSupplier.get();

			_dadosContribuinteSupplier = null;
		}

		return dadosContribuinte;
	}

	public void setDadosContribuinte(
		DadosContribuinteEntity dadosContribuinte) {

		this.dadosContribuinte = dadosContribuinte;

		_dadosContribuinteSupplier = null;
	}

	@JsonIgnore
	public void setDadosContribuinte(
		UnsafeSupplier<DadosContribuinteEntity, Exception>
			dadosContribuinteUnsafeSupplier) {

		_dadosContribuinteSupplier = () -> {
			try {
				return dadosContribuinteUnsafeSupplier.get();
			}
			catch (RuntimeException runtimeException) {
				throw runtimeException;
			}
			catch (Exception exception) {
				throw new RuntimeException(exception);
			}
		};
	}

	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected DadosContribuinteEntity dadosContribuinte;

	@JsonIgnore
	private Supplier<DadosContribuinteEntity> _dadosContribuinteSupplier;

	@io.swagger.v3.oas.annotations.media.Schema
	@Valid
	public Declaracao getDeclaracao() {
		if (_declaracaoSupplier != null) {
			declaracao = _declaracaoSupplier.get();

			_declaracaoSupplier = null;
		}

		return declaracao;
	}

	public void setDeclaracao(Declaracao declaracao) {
		this.declaracao = declaracao;

		_declaracaoSupplier = null;
	}

	@JsonIgnore
	public void setDeclaracao(
		UnsafeSupplier<Declaracao, Exception> declaracaoUnsafeSupplier) {

		_declaracaoSupplier = () -> {
			try {
				return declaracaoUnsafeSupplier.get();
			}
			catch (RuntimeException runtimeException) {
				throw runtimeException;
			}
			catch (Exception exception) {
				throw new RuntimeException(exception);
			}
		};
	}

	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Declaracao declaracao;

	@JsonIgnore
	private Supplier<Declaracao> _declaracaoSupplier;

	@io.swagger.v3.oas.annotations.media.Schema
	@Valid
	public DemonstracoesContabeisEntities getDemonstracoesContabeisEntities() {
		if (_demonstracoesContabeisEntitiesSupplier != null) {
			demonstracoesContabeisEntities =
				_demonstracoesContabeisEntitiesSupplier.get();

			_demonstracoesContabeisEntitiesSupplier = null;
		}

		return demonstracoesContabeisEntities;
	}

	public void setDemonstracoesContabeisEntities(
		DemonstracoesContabeisEntities demonstracoesContabeisEntities) {

		this.demonstracoesContabeisEntities = demonstracoesContabeisEntities;

		_demonstracoesContabeisEntitiesSupplier = null;
	}

	@JsonIgnore
	public void setDemonstracoesContabeisEntities(
		UnsafeSupplier<DemonstracoesContabeisEntities, Exception>
			demonstracoesContabeisEntitiesUnsafeSupplier) {

		_demonstracoesContabeisEntitiesSupplier = () -> {
			try {
				return demonstracoesContabeisEntitiesUnsafeSupplier.get();
			}
			catch (RuntimeException runtimeException) {
				throw runtimeException;
			}
			catch (Exception exception) {
				throw new RuntimeException(exception);
			}
		};
	}

	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected DemonstracoesContabeisEntities demonstracoesContabeisEntities;

	@JsonIgnore
	private Supplier<DemonstracoesContabeisEntities>
		_demonstracoesContabeisEntitiesSupplier;

	@io.swagger.v3.oas.annotations.media.Schema
	public Long getEditalId() {
		if (_editalIdSupplier != null) {
			editalId = _editalIdSupplier.get();

			_editalIdSupplier = null;
		}

		return editalId;
	}

	public void setEditalId(Long editalId) {
		this.editalId = editalId;

		_editalIdSupplier = null;
	}

	@JsonIgnore
	public void setEditalId(
		UnsafeSupplier<Long, Exception> editalIdUnsafeSupplier) {

		_editalIdSupplier = () -> {
			try {
				return editalIdUnsafeSupplier.get();
			}
			catch (RuntimeException runtimeException) {
				throw runtimeException;
			}
			catch (Exception exception) {
				throw new RuntimeException(exception);
			}
		};
	}

	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Long editalId;

	@JsonIgnore
	private Supplier<Long> _editalIdSupplier;

	@io.swagger.v3.oas.annotations.media.Schema
	@Valid
	public FundamentacaoPedido getFundamentacaoPedido() {
		if (_fundamentacaoPedidoSupplier != null) {
			fundamentacaoPedido = _fundamentacaoPedidoSupplier.get();

			_fundamentacaoPedidoSupplier = null;
		}

		return fundamentacaoPedido;
	}

	public void setFundamentacaoPedido(
		FundamentacaoPedido fundamentacaoPedido) {

		this.fundamentacaoPedido = fundamentacaoPedido;

		_fundamentacaoPedidoSupplier = null;
	}

	@JsonIgnore
	public void setFundamentacaoPedido(
		UnsafeSupplier<FundamentacaoPedido, Exception>
			fundamentacaoPedidoUnsafeSupplier) {

		_fundamentacaoPedidoSupplier = () -> {
			try {
				return fundamentacaoPedidoUnsafeSupplier.get();
			}
			catch (RuntimeException runtimeException) {
				throw runtimeException;
			}
			catch (Exception exception) {
				throw new RuntimeException(exception);
			}
		};
	}

	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected FundamentacaoPedido fundamentacaoPedido;

	@JsonIgnore
	private Supplier<FundamentacaoPedido> _fundamentacaoPedidoSupplier;

	@io.swagger.v3.oas.annotations.media.Schema
	@Valid
	public GarantiaEntity getGarantiaEntity() {
		if (_garantiaEntitySupplier != null) {
			garantiaEntity = _garantiaEntitySupplier.get();

			_garantiaEntitySupplier = null;
		}

		return garantiaEntity;
	}

	public void setGarantiaEntity(GarantiaEntity garantiaEntity) {
		this.garantiaEntity = garantiaEntity;

		_garantiaEntitySupplier = null;
	}

	@JsonIgnore
	public void setGarantiaEntity(
		UnsafeSupplier<GarantiaEntity, Exception>
			garantiaEntityUnsafeSupplier) {

		_garantiaEntitySupplier = () -> {
			try {
				return garantiaEntityUnsafeSupplier.get();
			}
			catch (RuntimeException runtimeException) {
				throw runtimeException;
			}
			catch (Exception exception) {
				throw new RuntimeException(exception);
			}
		};
	}

	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected GarantiaEntity garantiaEntity;

	@JsonIgnore
	private Supplier<GarantiaEntity> _garantiaEntitySupplier;

	@io.swagger.v3.oas.annotations.media.Schema
	public Date getModifiedDate() {
		if (_modifiedDateSupplier != null) {
			modifiedDate = _modifiedDateSupplier.get();

			_modifiedDateSupplier = null;
		}

		return modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;

		_modifiedDateSupplier = null;
	}

	@JsonIgnore
	public void setModifiedDate(
		UnsafeSupplier<Date, Exception> modifiedDateUnsafeSupplier) {

		_modifiedDateSupplier = () -> {
			try {
				return modifiedDateUnsafeSupplier.get();
			}
			catch (RuntimeException runtimeException) {
				throw runtimeException;
			}
			catch (Exception exception) {
				throw new RuntimeException(exception);
			}
		};
	}

	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Date modifiedDate;

	@JsonIgnore
	private Supplier<Date> _modifiedDateSupplier;

	@io.swagger.v3.oas.annotations.media.Schema
	public String getNumeroProtocoloSEI() {
		if (_numeroProtocoloSEISupplier != null) {
			numeroProtocoloSEI = _numeroProtocoloSEISupplier.get();

			_numeroProtocoloSEISupplier = null;
		}

		return numeroProtocoloSEI;
	}

	public void setNumeroProtocoloSEI(String numeroProtocoloSEI) {
		this.numeroProtocoloSEI = numeroProtocoloSEI;

		_numeroProtocoloSEISupplier = null;
	}

	@JsonIgnore
	public void setNumeroProtocoloSEI(
		UnsafeSupplier<String, Exception> numeroProtocoloSEIUnsafeSupplier) {

		_numeroProtocoloSEISupplier = () -> {
			try {
				return numeroProtocoloSEIUnsafeSupplier.get();
			}
			catch (RuntimeException runtimeException) {
				throw runtimeException;
			}
			catch (Exception exception) {
				throw new RuntimeException(exception);
			}
		};
	}

	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String numeroProtocoloSEI;

	@JsonIgnore
	private Supplier<String> _numeroProtocoloSEISupplier;

	@io.swagger.v3.oas.annotations.media.Schema
	@Valid
	public ArquivosEntity getProcuracao() {
		if (_procuracaoSupplier != null) {
			procuracao = _procuracaoSupplier.get();

			_procuracaoSupplier = null;
		}

		return procuracao;
	}

	public void setProcuracao(ArquivosEntity procuracao) {
		this.procuracao = procuracao;

		_procuracaoSupplier = null;
	}

	@JsonIgnore
	public void setProcuracao(
		UnsafeSupplier<ArquivosEntity, Exception> procuracaoUnsafeSupplier) {

		_procuracaoSupplier = () -> {
			try {
				return procuracaoUnsafeSupplier.get();
			}
			catch (RuntimeException runtimeException) {
				throw runtimeException;
			}
			catch (Exception exception) {
				throw new RuntimeException(exception);
			}
		};
	}

	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected ArquivosEntity procuracao;

	@JsonIgnore
	private Supplier<ArquivosEntity> _procuracaoSupplier;

	@io.swagger.v3.oas.annotations.media.Schema
	public Long getPropostaId() {
		if (_propostaIdSupplier != null) {
			propostaId = _propostaIdSupplier.get();

			_propostaIdSupplier = null;
		}

		return propostaId;
	}

	public void setPropostaId(Long propostaId) {
		this.propostaId = propostaId;

		_propostaIdSupplier = null;
	}

	@JsonIgnore
	public void setPropostaId(
		UnsafeSupplier<Long, Exception> propostaIdUnsafeSupplier) {

		_propostaIdSupplier = () -> {
			try {
				return propostaIdUnsafeSupplier.get();
			}
			catch (RuntimeException runtimeException) {
				throw runtimeException;
			}
			catch (Exception exception) {
				throw new RuntimeException(exception);
			}
		};
	}

	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Long propostaId;

	@JsonIgnore
	private Supplier<Long> _propostaIdSupplier;

	@io.swagger.v3.oas.annotations.media.Schema
	public Long getPropostaPaiId() {
		if (_propostaPaiIdSupplier != null) {
			propostaPaiId = _propostaPaiIdSupplier.get();

			_propostaPaiIdSupplier = null;
		}

		return propostaPaiId;
	}

	public void setPropostaPaiId(Long propostaPaiId) {
		this.propostaPaiId = propostaPaiId;

		_propostaPaiIdSupplier = null;
	}

	@JsonIgnore
	public void setPropostaPaiId(
		UnsafeSupplier<Long, Exception> propostaPaiIdUnsafeSupplier) {

		_propostaPaiIdSupplier = () -> {
			try {
				return propostaPaiIdUnsafeSupplier.get();
			}
			catch (RuntimeException runtimeException) {
				throw runtimeException;
			}
			catch (Exception exception) {
				throw new RuntimeException(exception);
			}
		};
	}

	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Long propostaPaiId;

	@JsonIgnore
	private Supplier<Long> _propostaPaiIdSupplier;

	@io.swagger.v3.oas.annotations.media.Schema
	public String getProtocolo() {
		if (_protocoloSupplier != null) {
			protocolo = _protocoloSupplier.get();

			_protocoloSupplier = null;
		}

		return protocolo;
	}

	public void setProtocolo(String protocolo) {
		this.protocolo = protocolo;

		_protocoloSupplier = null;
	}

	@JsonIgnore
	public void setProtocolo(
		UnsafeSupplier<String, Exception> protocoloUnsafeSupplier) {

		_protocoloSupplier = () -> {
			try {
				return protocoloUnsafeSupplier.get();
			}
			catch (RuntimeException runtimeException) {
				throw runtimeException;
			}
			catch (Exception exception) {
				throw new RuntimeException(exception);
			}
		};
	}

	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String protocolo;

	@JsonIgnore
	private Supplier<String> _protocoloSupplier;

	@io.swagger.v3.oas.annotations.media.Schema
	@Valid
	public RelacaoCredoresEntity[] getRelacaoCredoresEntities() {
		if (_relacaoCredoresEntitiesSupplier != null) {
			relacaoCredoresEntities = _relacaoCredoresEntitiesSupplier.get();

			_relacaoCredoresEntitiesSupplier = null;
		}

		return relacaoCredoresEntities;
	}

	public void setRelacaoCredoresEntities(
		RelacaoCredoresEntity[] relacaoCredoresEntities) {

		this.relacaoCredoresEntities = relacaoCredoresEntities;

		_relacaoCredoresEntitiesSupplier = null;
	}

	@JsonIgnore
	public void setRelacaoCredoresEntities(
		UnsafeSupplier<RelacaoCredoresEntity[], Exception>
			relacaoCredoresEntitiesUnsafeSupplier) {

		_relacaoCredoresEntitiesSupplier = () -> {
			try {
				return relacaoCredoresEntitiesUnsafeSupplier.get();
			}
			catch (RuntimeException runtimeException) {
				throw runtimeException;
			}
			catch (Exception exception) {
				throw new RuntimeException(exception);
			}
		};
	}

	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected RelacaoCredoresEntity[] relacaoCredoresEntities;

	@JsonIgnore
	private Supplier<RelacaoCredoresEntity[]> _relacaoCredoresEntitiesSupplier;

	@io.swagger.v3.oas.annotations.media.Schema
	public String getStatus() {
		if (_statusSupplier != null) {
			status = _statusSupplier.get();

			_statusSupplier = null;
		}

		return status;
	}

	public void setStatus(String status) {
		this.status = status;

		_statusSupplier = null;
	}

	@JsonIgnore
	public void setStatus(
		UnsafeSupplier<String, Exception> statusUnsafeSupplier) {

		_statusSupplier = () -> {
			try {
				return statusUnsafeSupplier.get();
			}
			catch (RuntimeException runtimeException) {
				throw runtimeException;
			}
			catch (Exception exception) {
				throw new RuntimeException(exception);
			}
		};
	}

	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String status;

	@JsonIgnore
	private Supplier<String> _statusSupplier;

	@io.swagger.v3.oas.annotations.media.Schema
	public String getTipoProposta() {
		if (_tipoPropostaSupplier != null) {
			tipoProposta = _tipoPropostaSupplier.get();

			_tipoPropostaSupplier = null;
		}

		return tipoProposta;
	}

	public void setTipoProposta(String tipoProposta) {
		this.tipoProposta = tipoProposta;

		_tipoPropostaSupplier = null;
	}

	@JsonIgnore
	public void setTipoProposta(
		UnsafeSupplier<String, Exception> tipoPropostaUnsafeSupplier) {

		_tipoPropostaSupplier = () -> {
			try {
				return tipoPropostaUnsafeSupplier.get();
			}
			catch (RuntimeException runtimeException) {
				throw runtimeException;
			}
			catch (Exception exception) {
				throw new RuntimeException(exception);
			}
		};
	}

	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String tipoProposta;

	@JsonIgnore
	private Supplier<String> _tipoPropostaSupplier;

	@io.swagger.v3.oas.annotations.media.Schema
	public String getZipUrl() {
		if (_zipUrlSupplier != null) {
			zipUrl = _zipUrlSupplier.get();

			_zipUrlSupplier = null;
		}

		return zipUrl;
	}

	public void setZipUrl(String zipUrl) {
		this.zipUrl = zipUrl;

		_zipUrlSupplier = null;
	}

	@JsonIgnore
	public void setZipUrl(
		UnsafeSupplier<String, Exception> zipUrlUnsafeSupplier) {

		_zipUrlSupplier = () -> {
			try {
				return zipUrlUnsafeSupplier.get();
			}
			catch (RuntimeException runtimeException) {
				throw runtimeException;
			}
			catch (Exception exception) {
				throw new RuntimeException(exception);
			}
		};
	}

	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String zipUrl;

	@JsonIgnore
	private Supplier<String> _zipUrlSupplier;

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
		StringBundler sb = new StringBundler();

		sb.append("{");

		DateFormat liferayToJSONDateFormat = new SimpleDateFormat(
			"yyyy-MM-dd'T'HH:mm:ss'Z'");

		AcoesJudiciaisEntity[] acoesJudiciaisEntities =
			getAcoesJudiciaisEntities();

		if (acoesJudiciaisEntities != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"acoesJudiciaisEntities\": ");

			sb.append("[");

			for (int i = 0; i < acoesJudiciaisEntities.length; i++) {
				sb.append(String.valueOf(acoesJudiciaisEntities[i]));

				if ((i + 1) < acoesJudiciaisEntities.length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		AdministradorJudicialEntity administradorJudicial =
			getAdministradorJudicial();

		if (administradorJudicial != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"administradorJudicial\": ");

			sb.append(String.valueOf(administradorJudicial));
		}

		AdvogadoEntity advogado = getAdvogado();

		if (advogado != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"advogado\": ");

			sb.append(String.valueOf(advogado));
		}

		BensDireitosRequerenteEntity bensDireitosRequerenteEntities =
			getBensDireitosRequerenteEntities();

		if (bensDireitosRequerenteEntities != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"bensDireitosRequerenteEntities\": ");

			sb.append(String.valueOf(bensDireitosRequerenteEntities));
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"createDate\": ");

			sb.append("\"");

			sb.append(liferayToJSONDateFormat.format(createDate));

			sb.append("\"");
		}

		String createUser = getCreateUser();

		if (createUser != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"createUser\": ");

			sb.append("\"");

			sb.append(_escape(createUser));

			sb.append("\"");
		}

		DadosContribuinteEntity dadosContribuinte = getDadosContribuinte();

		if (dadosContribuinte != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"dadosContribuinte\": ");

			sb.append(String.valueOf(dadosContribuinte));
		}

		Declaracao declaracao = getDeclaracao();

		if (declaracao != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"declaracao\": ");

			sb.append(String.valueOf(declaracao));
		}

		DemonstracoesContabeisEntities demonstracoesContabeisEntities =
			getDemonstracoesContabeisEntities();

		if (demonstracoesContabeisEntities != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"demonstracoesContabeisEntities\": ");

			sb.append(String.valueOf(demonstracoesContabeisEntities));
		}

		Long editalId = getEditalId();

		if (editalId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"editalId\": ");

			sb.append(editalId);
		}

		FundamentacaoPedido fundamentacaoPedido = getFundamentacaoPedido();

		if (fundamentacaoPedido != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"fundamentacaoPedido\": ");

			sb.append(String.valueOf(fundamentacaoPedido));
		}

		GarantiaEntity garantiaEntity = getGarantiaEntity();

		if (garantiaEntity != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"garantiaEntity\": ");

			sb.append(String.valueOf(garantiaEntity));
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"modifiedDate\": ");

			sb.append("\"");

			sb.append(liferayToJSONDateFormat.format(modifiedDate));

			sb.append("\"");
		}

		String numeroProtocoloSEI = getNumeroProtocoloSEI();

		if (numeroProtocoloSEI != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"numeroProtocoloSEI\": ");

			sb.append("\"");

			sb.append(_escape(numeroProtocoloSEI));

			sb.append("\"");
		}

		ArquivosEntity procuracao = getProcuracao();

		if (procuracao != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"procuracao\": ");

			sb.append(String.valueOf(procuracao));
		}

		Long propostaId = getPropostaId();

		if (propostaId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"propostaId\": ");

			sb.append(propostaId);
		}

		Long propostaPaiId = getPropostaPaiId();

		if (propostaPaiId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"propostaPaiId\": ");

			sb.append(propostaPaiId);
		}

		String protocolo = getProtocolo();

		if (protocolo != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"protocolo\": ");

			sb.append("\"");

			sb.append(_escape(protocolo));

			sb.append("\"");
		}

		RelacaoCredoresEntity[] relacaoCredoresEntities =
			getRelacaoCredoresEntities();

		if (relacaoCredoresEntities != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"relacaoCredoresEntities\": ");

			sb.append("[");

			for (int i = 0; i < relacaoCredoresEntities.length; i++) {
				sb.append(String.valueOf(relacaoCredoresEntities[i]));

				if ((i + 1) < relacaoCredoresEntities.length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		String status = getStatus();

		if (status != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"status\": ");

			sb.append("\"");

			sb.append(_escape(status));

			sb.append("\"");
		}

		String tipoProposta = getTipoProposta();

		if (tipoProposta != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"tipoProposta\": ");

			sb.append("\"");

			sb.append(_escape(tipoProposta));

			sb.append("\"");
		}

		String zipUrl = getZipUrl();

		if (zipUrl != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"zipUrl\": ");

			sb.append("\"");

			sb.append(_escape(zipUrl));

			sb.append("\"");
		}

		sb.append("}");

		return sb.toString();
	}

	@io.swagger.v3.oas.annotations.media.Schema(
		accessMode = io.swagger.v3.oas.annotations.media.Schema.AccessMode.READ_ONLY,
		defaultValue = "br.com.seatecnologia.gdf.negocia.headless.dto.v1_0.PropostaEntity",
		name = "x-class-name"
	)
	public String xClassName;

	private static String _escape(Object object) {
		return StringUtil.replace(
			String.valueOf(object), _JSON_ESCAPE_STRINGS[0],
			_JSON_ESCAPE_STRINGS[1]);
	}

	private static boolean _isArray(Object value) {
		if (value == null) {
			return false;
		}

		Class<?> clazz = value.getClass();

		return clazz.isArray();
	}

	private static String _toJSON(Map<String, ?> map) {
		StringBuilder sb = new StringBuilder("{");

		@SuppressWarnings("unchecked")
		Set set = map.entrySet();

		@SuppressWarnings("unchecked")
		Iterator<Map.Entry<String, ?>> iterator = set.iterator();

		while (iterator.hasNext()) {
			Map.Entry<String, ?> entry = iterator.next();

			sb.append("\"");
			sb.append(_escape(entry.getKey()));
			sb.append("\": ");

			Object value = entry.getValue();

			if (_isArray(value)) {
				sb.append("[");

				Object[] valueArray = (Object[])value;

				for (int i = 0; i < valueArray.length; i++) {
					if (valueArray[i] instanceof Map) {
						sb.append(_toJSON((Map<String, ?>)valueArray[i]));
					}
					else if (valueArray[i] instanceof String) {
						sb.append("\"");
						sb.append(valueArray[i]);
						sb.append("\"");
					}
					else {
						sb.append(valueArray[i]);
					}

					if ((i + 1) < valueArray.length) {
						sb.append(", ");
					}
				}

				sb.append("]");
			}
			else if (value instanceof Map) {
				sb.append(_toJSON((Map<String, ?>)value));
			}
			else if (value instanceof String) {
				sb.append("\"");
				sb.append(_escape(value));
				sb.append("\"");
			}
			else {
				sb.append(value);
			}

			if (iterator.hasNext()) {
				sb.append(", ");
			}
		}

		sb.append("}");

		return sb.toString();
	}

	private static final String[][] _JSON_ESCAPE_STRINGS = {
		{"\\", "\"", "\b", "\f", "\n", "\r", "\t"},
		{"\\\\", "\\\"", "\\b", "\\f", "\\n", "\\r", "\\t"}
	};

	private Map<String, Serializable> _extendedProperties;

}
package br.com.seatecnologia.gdf.negocia.headless.internal.resource.v1_0;

import br.com.seatecnologia.gdf.negocia.context.GovBrAuthContext;
import br.com.seatecnologia.gdf.negocia.enums.DemonstracaoDocumentosEnum;
import br.com.seatecnologia.gdf.negocia.enums.TipoPropostaEnum;
import br.com.seatecnologia.gdf.negocia.headless.dto.v1_0.*;
import br.com.seatecnologia.gdf.negocia.headless.internal.enums.PropostaType;
import br.com.seatecnologia.gdf.negocia.headless.resource.v1_0.PropostaEntityResource;
import br.com.seatecnologia.gdf.negocia.headless.internal.odata.entity.v1_0.PropostaEntityModel;
import br.com.seatecnologia.gdf.negocia.model.*;
import br.com.seatecnologia.gdf.negocia.service.*;
import br.com.seatecnologia.gdf.negocia.service.permission.PropostaModelResourcePermission;
import com.liferay.document.library.kernel.service.DLAppService;
import com.liferay.document.library.util.DLURLHelperUtil;
import com.liferay.petra.string.StringPool;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.repository.model.FileEntry;
import com.liferay.portal.kernel.search.QueryConfig;
import com.liferay.portal.kernel.search.Sort;
import com.liferay.portal.kernel.search.filter.BooleanFilter;
import com.liferay.portal.kernel.search.filter.Filter;
import com.liferay.portal.kernel.security.permission.ActionKeys;
import com.liferay.portal.kernel.security.permission.PermissionChecker;
import com.liferay.portal.kernel.security.permission.PermissionCheckerFactoryUtil;
import com.liferay.portal.kernel.service.*;
import com.liferay.portal.kernel.util.GetterUtil;
import br.com.seatecnologia.gdf.negocia.headless.dto.v1_0.AcoesJudiciaisEntity;
import br.com.seatecnologia.gdf.negocia.headless.dto.v1_0.AdministradorJudicialEntity;
import br.com.seatecnologia.gdf.negocia.headless.dto.v1_0.AdvogadoEntity;
import br.com.seatecnologia.gdf.negocia.headless.dto.v1_0.ArquivosEntity;
import br.com.seatecnologia.gdf.negocia.headless.dto.v1_0.BensDireitosRequerenteEntity;
import br.com.seatecnologia.gdf.negocia.headless.dto.v1_0.DadosContribuinteEntity;
import br.com.seatecnologia.gdf.negocia.headless.dto.v1_0.DadosRegistro;
import br.com.seatecnologia.gdf.negocia.headless.dto.v1_0.Declaracao;
import br.com.seatecnologia.gdf.negocia.headless.dto.v1_0.DemonstracoesContabeisEntities;
import br.com.seatecnologia.gdf.negocia.headless.dto.v1_0.EnderecoEntity;
import br.com.seatecnologia.gdf.negocia.headless.dto.v1_0.FundamentacaoPedido;
import br.com.seatecnologia.gdf.negocia.headless.dto.v1_0.GarantiaEntity;
import br.com.seatecnologia.gdf.negocia.headless.dto.v1_0.IdentificacaoDebitosEntity;
import br.com.seatecnologia.gdf.negocia.headless.dto.v1_0.LaudoAvaliacaoEntity;
import br.com.seatecnologia.gdf.negocia.headless.dto.v1_0.PessoaJuridicaEntity;
import br.com.seatecnologia.gdf.negocia.headless.dto.v1_0.PropostaEntity;
import br.com.seatecnologia.gdf.negocia.headless.dto.v1_0.QualificacaoCompletaEntity;
import br.com.seatecnologia.gdf.negocia.headless.dto.v1_0.RelacaoCredoresEntity;

import br.com.seatecnologia.gdf.negocia.model.AcaoJudicial;
import br.com.seatecnologia.gdf.negocia.model.AdministradorJudicial;
import br.com.seatecnologia.gdf.negocia.model.Advogado;
import br.com.seatecnologia.gdf.negocia.model.AnexosOutros;
import br.com.seatecnologia.gdf.negocia.model.BensDireitosLaudo;
import br.com.seatecnologia.gdf.negocia.model.BensDireitosRequerente;
import br.com.seatecnologia.gdf.negocia.model.DemonstracaoContabil;
import br.com.seatecnologia.gdf.negocia.model.DocumentoComprobatorio;
import br.com.seatecnologia.gdf.negocia.model.Endereco;
import br.com.seatecnologia.gdf.negocia.model.Garantia;
import br.com.seatecnologia.gdf.negocia.model.IdentificacaoDebitos;
import br.com.seatecnologia.gdf.negocia.model.Proposta;
import br.com.seatecnologia.gdf.negocia.model.QualificacaoCompleta;
import br.com.seatecnologia.gdf.negocia.model.RelacaoCredor;
import br.com.seatecnologia.gdf.negocia.service.AcaoJudicialService;
import br.com.seatecnologia.gdf.negocia.service.AdministradorJudicialService;
import br.com.seatecnologia.gdf.negocia.service.AdvogadoService;
import br.com.seatecnologia.gdf.negocia.service.AnexosOutrosService;
import br.com.seatecnologia.gdf.negocia.service.BensDireitosLaudoService;
import br.com.seatecnologia.gdf.negocia.service.BensDireitosRequerenteService;
import br.com.seatecnologia.gdf.negocia.service.DadosRegistroLocalService;
import br.com.seatecnologia.gdf.negocia.service.DadosRegistroService;
import br.com.seatecnologia.gdf.negocia.service.DeclaracaoService;
import br.com.seatecnologia.gdf.negocia.service.DemaisPartesService;
import br.com.seatecnologia.gdf.negocia.service.DocumentoComprobatorioService;
import br.com.seatecnologia.gdf.negocia.service.EnderecoLocalService;
import br.com.seatecnologia.gdf.negocia.service.EnderecoService;
import br.com.seatecnologia.gdf.negocia.service.FundamentacaoPedidoLocalService;
import br.com.seatecnologia.gdf.negocia.service.FundamentacaoPedidoService;
import br.com.seatecnologia.gdf.negocia.service.GarantiaPropostaService;
import br.com.seatecnologia.gdf.negocia.service.GarantiaService;
import br.com.seatecnologia.gdf.negocia.service.IdentificacaoDebitosLocalService;
import br.com.seatecnologia.gdf.negocia.service.IdentificacaoDebitosService;
import br.com.seatecnologia.gdf.negocia.service.PropostaService;
import br.com.seatecnologia.gdf.negocia.service.QualificacaoCompletaService;
import br.com.seatecnologia.gdf.negocia.service.RelacaoCredorService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.User;
import com.liferay.document.library.kernel.model.DLFileEntry;
import com.liferay.document.library.kernel.service.DLFileEntryLocalService;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.vulcan.pagination.Pagination;
import com.liferay.portal.vulcan.util.SearchUtil;
import com.liferay.portal.odata.entity.EntityModel;
import com.liferay.portal.vulcan.resource.EntityModelResource;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ServiceScope;

import javax.ws.rs.ClientErrorException;
import javax.ws.rs.core.MultivaluedMap;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @author sabrina
 */
@Component(
	properties = "OSGI-INF/liferay/rest/v1_0/proposta-entity.properties",
	scope = ServiceScope.PROTOTYPE, service = PropostaEntityResource.class
)
public class 	PropostaEntityResourceImpl extends BasePropostaEntityResourceImpl
		implements EntityModelResource {


	@Override
	public PropostaEntity getProposta(Long propostaId) throws Exception {
		Proposta proposta = _propostaService.getProposta(propostaId);

		return _toPropostaEntityComplete(proposta);
	}

	@Override
	public Object getPropostasPage(Filter filter, Pagination pagination, Sort[] sorts)
			throws Exception {
		try {
			return SearchUtil.search(
				Collections.emptyMap(),
				booleanQuery -> {
					PermissionChecker permissionChecker = PermissionCheckerFactoryUtil.create(contextUser);
					boolean hasCompanyViewPermission = _propostaResourcePermission.hasCompanyPermission(permissionChecker, ActionKeys.VIEW);

					if(hasCompanyViewPermission) return;

					String cpfCnpj = _govBrAuthContext.getCpfCnpj(contextUser);
					BooleanFilter booleanFilter = booleanQuery.getPreBooleanFilter();

					if (Validator.isNotNull(cpfCnpj)) {
						booleanFilter.addRequiredTerm("cpfCnpj", cpfCnpj);
					} else {
						throw new ClientErrorException("Usuário não possui CPF/CNPJ válido.", 400);
					}
				},
				filter,
				Proposta.class.getName(),
				null,
				pagination,
				QueryConfig::setSelectedFieldNames,
				searchContext -> {
					searchContext.setCompanyId(contextCompany.getCompanyId());
				},
				sorts,
				document -> {
					String propostaId = GetterUtil.getString(document.get("entryClassPK"));
					if (propostaId.isEmpty()) {
						return null;
					}
					try {
						Proposta proposta = _propostaService.getProposta(Long.parseLong(propostaId));

						return _toPropostaEntity(proposta);
					} catch (Exception e) {
						_log.warn(e.getMessage(), e);
						return null;
					}
				}
			);
		} catch (Exception e){
			_log.error(e.getMessage(), e);
			throw e;
		}
	}

	private PropostaEntityList _toPropostaEntity(Proposta proposta)  {
		PropostaEntityList propostaEntity = new PropostaEntityList();

		propostaEntity.setPropostaId(proposta.getPropostaId());
		propostaEntity.setProtocolo(proposta.getProtocolo());
		propostaEntity.setNumeroProtocoloSEI(proposta.getNumeroProtocoloSei());
		propostaEntity.setCreateDate(proposta.getCreateDate());
		propostaEntity.setTipoProposta(proposta.getTipoProposta());
		propostaEntity.setDocumentosPropostaUrl(proposta.getDocumentosCompletosURL());

		try{
			QualificacaoCompleta qualificacaoCompleta = _qualificacaoCompletaLocalService.getQualificacaoCompleta( proposta.getQualificacaoId());
			propostaEntity.setCpfCnpj(qualificacaoCompleta.getCpfCnpj());
		}catch (Exception ignore){
		}
		propostaEntity.setModifiedDate(proposta.getModifiedDate());


		if (proposta.getStatus() != null) {
			propostaEntity.setStatus(proposta.getStatus());
		}

		try {
			PropostaType propostaType = PropostaType.fromValue(proposta.getTipoProposta());
			if (propostaType.equals(PropostaType.EDITAL)) {
				Edital edital = _editalLocalService.fetchEdital(proposta.getEditalId());
				if (edital != null) {
					propostaEntity.setEditalUrl(edital.getArquivoURL());
				}
			}
		} catch (Exception e) {
			_log.warn("Erro ao buscar dados do edital para proposta " + proposta.getPropostaId(), e);
		}

		return propostaEntity;
	}

	private PropostaEntity 	_toPropostaEntityComplete(Proposta proposta) {
		PropostaEntity propostaEntity = new PropostaEntity();

		propostaEntity.setPropostaId(proposta.getPropostaId());
		propostaEntity.setProtocolo(proposta.getProtocolo());
		propostaEntity.setNumeroProtocoloSEI(proposta.getNumeroProtocoloSei());
		propostaEntity.setPropostaPaiId(proposta.getPropostaPaiId());
		propostaEntity.setTipoProposta(proposta.getTipoProposta());

		if (proposta.getStatus() != null) {
			propostaEntity.setStatus(proposta.getStatus());
		}

		propostaEntity.setCreateDate(proposta.getCreateDate());
		propostaEntity.setModifiedDate(proposta.getModifiedDate());

		try {
			String createUser = getUserName(proposta.getUserId());
			propostaEntity.setCreateUser(createUser);
		} catch (Exception e) {
			_log.warn("Erro ao buscar dados do usuário para proposta " + proposta.getPropostaId(), e);
		}

		try {
			DadosContribuinteEntity dadosContribuinteEntity = new DadosContribuinteEntity();
			QualificacaoCompleta qualificacao = _qualificacaoCompletaLocalService.getQualificacaoCompleta(
								proposta.getQualificacaoId());

			if (qualificacao != null) {
				QualificacaoCompletaEntity qualificacaoEntity = new QualificacaoCompletaEntity();
				qualificacaoEntity.setQualificacaoId(qualificacao.getQualificacaoId());
				qualificacaoEntity.setNomeRazaoSocial(qualificacao.getNomeRazaoSocial());
				qualificacaoEntity.setNomeFantasia(qualificacao.getNomeFantasia());
				qualificacaoEntity.setRepresentanteLegal(qualificacao.getRepresentanteLegal());
				qualificacaoEntity.setCpfCnpj(qualificacao.getCpfCnpj());
				qualificacaoEntity.setDomicilioFiscal(qualificacao.getDomicilioFiscal());
				qualificacaoEntity.setNumeroCfdf(qualificacao.getNumeroCfdf());
				if (qualificacao.getTipoPessoa() != null) {
					qualificacaoEntity.setTipoPessoa(qualificacao.getTipoPessoa());
				}
				qualificacaoEntity.setEmail(qualificacao.getEmail());
				qualificacaoEntity.setTelefone(qualificacao.getTelefone());
				qualificacaoEntity.setWhatsapp(qualificacao.getWhatsapp());

				try {
					Endereco endereco = _enderecoLocalService.getEndereco(qualificacao.getEnderecoPostalId());
					if (endereco != null) {
						EnderecoEntity enderecoEntity = setEnderecoEntity(endereco);
						qualificacaoEntity.setEnderecoPostal(enderecoEntity);
					}
				} catch (Exception e) {
					_log.warn("Erro ao buscar endereço da qualificação " + qualificacao.getQualificacaoId(), e);
				}

				dadosContribuinteEntity.setQualificacao(qualificacaoEntity);
			}

			try {
				List<br.com.seatecnologia.gdf.negocia.model.DemaisPartes> demaisPartes = _demaisPartesLocalService.getDemaisParteses(-1, -1);
				demaisPartes = demaisPartes.stream()
						.filter(dp -> dp.getPropostaId() == proposta.getPropostaId())
						.collect(Collectors.toList());
				List<PessoaJuridicaEntity> pessoaJuridicaEntitiesList = new ArrayList<>();

				for (br.com.seatecnologia.gdf.negocia.model.DemaisPartes parte : demaisPartes) {
					PessoaJuridicaEntity pessoaJuridicaEntity = new PessoaJuridicaEntity();
					pessoaJuridicaEntity.setTipoPessoaJuridica(parte.getTipoParte());

					QualificacaoCompleta qualificacaoPJ = _qualificacaoCompletaLocalService.getQualificacaoCompleta(parte.getQualificacaoId());
					if (qualificacaoPJ != null) {
						Endereco enderecoPJ = _enderecoLocalService.getEndereco(qualificacaoPJ.getEnderecoPostalId());
						EnderecoEntity enderecoEntityPJ = setEnderecoEntity(enderecoPJ);
						QualificacaoCompletaEntity qualificacaoEntityPJ = setQualificacaoCompletaEntity(enderecoEntityPJ, qualificacaoPJ);
						pessoaJuridicaEntity.setQualificacao(qualificacaoEntityPJ);
					}

					pessoaJuridicaEntitiesList.add(pessoaJuridicaEntity);

				}

				if (!pessoaJuridicaEntitiesList.isEmpty()) {
					dadosContribuinteEntity.setPessoaJuridicaEntities(pessoaJuridicaEntitiesList.toArray(new PessoaJuridicaEntity[0]));
				}
			} catch (Exception e) {
				_log.warn("Erro ao buscar pessoas jurídicas para proposta " + proposta.getPropostaId(), e);
			}

			propostaEntity.setDadosContribuinte(dadosContribuinteEntity);
		} catch (Exception e) {
			_log.warn("Erro ao buscar dados do contribuinte para proposta " + proposta.getPropostaId(), e);
		}

		try {
			if (proposta.getEditalId() > 0) {
				propostaEntity.setEditalId(proposta.getEditalId());
			}
		} catch (Exception e) {
			_log.warn("Erro ao definir editalId para proposta " + proposta.getPropostaId(), e);
		}

		try {
			if (proposta.getAdministradorJudicialId() > 0) {
				AdministradorJudicial administradorJudicial = _administradorJudicialLocalService.getAdministradorJudicial(proposta.getAdministradorJudicialId());
				if (administradorJudicial != null) {
					QualificacaoCompleta qualificacaoAdm = _qualificacaoCompletaLocalService.getQualificacaoCompleta(administradorJudicial.getQualificacaoId());
					if (qualificacaoAdm != null) {
						Endereco enderecoAdm = _enderecoLocalService.getEndereco(qualificacaoAdm.getEnderecoPostalId());
						EnderecoEntity enderecoEntityAdm = setEnderecoEntity(enderecoAdm);
						QualificacaoCompletaEntity qualificacaoAdmEntity = setQualificacaoCompletaEntity(enderecoEntityAdm, qualificacaoAdm);
						AdministradorJudicialEntity administradorJudicialEntity = setAdministradorJudicial(qualificacaoAdmEntity, administradorJudicial);

						ArquivosEntity anexoRecuperacaoEntity = getArquivosEntity(administradorJudicial.getAnexoRecuperacao());
						administradorJudicialEntity.setAnexoRecuperacao(anexoRecuperacaoEntity);

						propostaEntity.setAdministradorJudicial(administradorJudicialEntity);
					}
				}
			}
		} catch (Exception e) {
			_log.warn("Erro ao buscar administrador judicial para proposta " + proposta.getPropostaId(), e);
		}

		try {
			if (proposta.getAdvogadoId() > 0) {
				Advogado advogado = _advogadoLocalService.getAdvogado(proposta.getAdvogadoId());
				if (advogado != null) {
					QualificacaoCompleta qualificacaoAdv = _qualificacaoCompletaLocalService.getQualificacaoCompleta(advogado.getQualificacaoId());
					if (qualificacaoAdv != null) {
						Endereco enderecoAdv = _enderecoLocalService.getEndereco(qualificacaoAdv.getEnderecoPostalId());
						EnderecoEntity enderecoEntityAdv = setEnderecoEntity(enderecoAdv);
						QualificacaoCompletaEntity qualificacaoAdvEntity = setQualificacaoCompletaEntity(enderecoEntityAdv, qualificacaoAdv);

						ArquivosEntity carteirinhaOAB = getArquivosEntity(advogado.getCarteirinhaOAB());

						AdvogadoEntity advogadoEntity = setAdvogadoEntity(advogado, qualificacaoAdvEntity, carteirinhaOAB);
						propostaEntity.setAdvogado(advogadoEntity);
					}
				}
			}
		} catch (Exception e) {
			_log.warn("Erro ao buscar advogado para proposta " + proposta.getPropostaId(), e);
		}

		try {
			if (proposta.getProcuracao() > 0) {
				ArquivosEntity procuracaoEntity =getArquivosEntity(proposta.getProcuracao());
				try {
					DLFileEntry fileEntry = _dlFileEntryLocalService.getDLFileEntry(proposta.getProcuracao());
					if (fileEntry != null) {
						procuracaoEntity.setFileName(fileEntry.getFileName());
						procuracaoEntity.setUrl("/documents/" + fileEntry.getGroupId() + "/" + fileEntry.getFolderId() + "/" + fileEntry.getFileName());
					}
				} catch (Exception fileException) {
					_log.warn("Erro ao buscar informações do arquivo de procuração " + proposta.getProcuracao(), fileException);
				}

				propostaEntity.setProcuracao(procuracaoEntity);
			}
		} catch (Exception e) {
			_log.warn("Erro ao buscar procuração para proposta " + proposta.getPropostaId(), e);
		}

		try {
			if (proposta.getFundamentacaoPedidoId() > 0) {
				br.com.seatecnologia.gdf.negocia.model.FundamentacaoPedido fundamentacaoPedido = _fundamentacaoPedidoLocalSerivce.getFundamentacaoPedido(proposta.getFundamentacaoPedidoId());
				if (fundamentacaoPedido != null) {
					FundamentacaoPedido fundamentacaoEntity = new FundamentacaoPedido();
					fundamentacaoEntity.setFundamentacao(fundamentacaoPedido.getFundamentacaoPedido());

					List<DocumentoComprobatorio> documentos = _documentoComprobatorioLocalService.getDocumentoComprobatorios(-1, -1);
					documentos = documentos.stream()
							.filter(doc -> doc.getFundamentacaoId() == fundamentacaoPedido.getFundamentacaoId())
							.collect(Collectors.toList());

					ArquivosEntity[] documentacaoArray = new ArquivosEntity[documentos.size()];
					for (int i = 0; i < documentos.size(); i++) {
						ArquivosEntity arquivoEntity = getArquivosEntity(documentos.get(i).getFileEntryId());
						documentacaoArray[i] = arquivoEntity;
					}
					fundamentacaoEntity.setDocumentacaoComprobatoria(documentacaoArray);

					List<IdentificacaoDebitos> debitos = _identificacaoDebitosLocalService.getIdentificacaoDebitoses(-1, -1);
					debitos = debitos.stream()
							.filter(deb -> deb.getFundamentacaoId() == fundamentacaoPedido.getFundamentacaoId())
							.collect(Collectors.toList());

					IdentificacaoDebitosEntity[] debitosArray = new IdentificacaoDebitosEntity[debitos.size()];
					for (int i = 0; i < debitos.size(); i++) {
						IdentificacaoDebitosEntity debitoEntity = new IdentificacaoDebitosEntity();
						debitoEntity.setInscricaoDividaAtiva(debitos.get(i).getInscricaoDividaAtiva());
						debitoEntity.setNatureza(debitos.get(i).getNatureza());
						debitoEntity.setSituacao(debitos.get(i).getSituacao());
						debitoEntity.setGarantidoJudicialmente(debitos.get(i).getGarantidoJudicialmente());
						debitosArray[i] = debitoEntity;
					}
					fundamentacaoEntity.setIdentificacaoDebitos(debitosArray);

					propostaEntity.setFundamentacaoPedido(fundamentacaoEntity);
				}
			}
		} catch (Exception e) {
			_log.warn("Erro ao buscar fundamentação do pedido para proposta " + proposta.getPropostaId(), e);
		}

		try {
			br.com.seatecnologia.gdf.negocia.model.Declaracao declaracao = _declaracaoLocalService.getDeclaracaoByPropostaId(proposta.getPropostaId());
			if (declaracao != null) {
				Declaracao declaracaoEntity = new Declaracao();
				declaracaoEntity.setCumpreCompromissos(declaracao.getCumpreCompromissos());
				declaracaoEntity.setNaoAlienacaoBensSemComunicacao(declaracao.getNaoAlienacaoBensSemComunicacao());
				declaracaoEntity.setReconheceGrupoOuSucessao(declaracao.getReconheceGrupoOuSucessao());
				declaracaoEntity.setCompromissoConfidencialidade(declaracao.getCompromissoConfidencialidade());
				declaracaoEntity.setCienciaProcesso(declaracao.getCienciaProcesso());
				propostaEntity.setDeclaracao(declaracaoEntity);
			}
		} catch (Exception e) {
			_log.warn("Erro ao buscar declaração para proposta " + proposta.getPropostaId(), e);
		}

		try {
			List<Garantia> garantias = _garantiaLocalSerivce.getGarantias(-1, -1);
			garantias = garantias.stream()
					.filter(gar -> gar.getPropostaId() == proposta.getPropostaId())
					.collect(Collectors.toList());

			GarantiaEntity garantiaEntity = new GarantiaEntity();
			GarantiaDetalhadaEntity[] garantiasArray = new GarantiaDetalhadaEntity[garantias.size()];
			for (int i = 0; i < garantias.size(); i++) {
				Garantia garantia = garantias.get(i);
				GarantiaDetalhadaEntity garantiaDetalhadaEntity = new GarantiaDetalhadaEntity();
				garantiaDetalhadaEntity.setGarantiaId(garantia.getGarantiaId());
				garantiaDetalhadaEntity.setPropostaId(garantia.getPropostaId());
				garantiaDetalhadaEntity.setTipoGarantia(garantia.getTipoGarantia());
				garantiaDetalhadaEntity.setOutrasGarantias(garantia.getOutras());
				garantiaDetalhadaEntity.setDescricaoBem(garantia.getDescricaoBem());
				garantiaDetalhadaEntity.setValorEstimado(garantia.getValorEstimado());
				garantiaDetalhadaEntity.setLocalizacao(garantia.getLocalizacao());
				garantiaDetalhadaEntity.setDeclaracaoAnuencia(garantia.getDeclaracaoAnuencia());
				garantiaDetalhadaEntity.setTipoDevedor(garantia.getTipoDevedor());

				if (garantia.getProprietarioQualificacao() > 0) {
					QualificacaoCompleta proprietario = _qualificacaoCompletaLocalService.getQualificacaoCompleta(garantia.getProprietarioQualificacao());
					if (proprietario != null) {
						Endereco enderecoProprietario = _enderecoLocalService.getEndereco(proprietario.getEnderecoPostalId());
						EnderecoEntity enderecoEntityProprietario = setEnderecoEntity(enderecoProprietario);
						QualificacaoCompletaEntity proprietarioEntity = setQualificacaoCompletaEntity(enderecoEntityProprietario, proprietario);
						garantiaDetalhadaEntity.setProprietario(proprietarioEntity);
					}
				}

				if (garantia.getDadosRegistroId() > 0) {
					br.com.seatecnologia.gdf.negocia.model.DadosRegistro dadosRegistro = _dadosRegitroLocalService.getDadosRegistro(garantia.getDadosRegistroId());
					if (dadosRegistro != null) {
						DadosRegistro dadosRegistroEntity = new DadosRegistro();
						dadosRegistroEntity.setMatriculaImovel(dadosRegistro.getMatriculaImovel());
						dadosRegistroEntity.setCartorioRegistro(dadosRegistro.getCartorioRegistro());
						dadosRegistroEntity.setRenavam(dadosRegistro.getRenavam());

						List<AnexosOutros> anexosOutros = _anexosOutrosLocalService.getAnexosOutroses(-1, -1);
						ArquivosEntity[] outrosDocumentosArray = new ArquivosEntity[anexosOutros.size()];
						for (int j = 0; j < anexosOutros.size(); j++) {
							ArquivosEntity anexoEntity = getArquivosEntity(anexosOutros.get(j).getOutrosAnexo());
							outrosDocumentosArray[j] = anexoEntity;
						}
						dadosRegistroEntity.setOutrosDocumento(outrosDocumentosArray);

						garantiaDetalhadaEntity.setDadosRegistro(dadosRegistroEntity);
					}
				}

				if (garantia.getDeclaracao() > 0) {
					ArquivosEntity declaracaoGarantiaEntity = getArquivosEntity(garantia.getDeclaracao());
					garantiaDetalhadaEntity.setDeclaracao(declaracaoGarantiaEntity);
				}

				garantiasArray[i] = garantiaDetalhadaEntity;
			}
			garantiaEntity.setGarantiaDetalhadaEntities(garantiasArray);
			garantiaEntity.setTipoDevedor(garantiasArray[0].getTipoDevedor());
			propostaEntity.setGarantiaEntity(garantiaEntity);
		} catch (Exception e) {
			_log.warn("Erro ao buscar garantias para proposta " + proposta.getPropostaId(), e);
		}

		try {
			List<AcaoJudicial> acoesJudiciais = _acaoJudicionalLocalService.getAcaoJudicials(-1, -1);
			acoesJudiciais = acoesJudiciais.stream()
					.filter(acao -> acao.getPropostaId() == proposta.getPropostaId())
					.collect(Collectors.toList());

			AcoesJudiciaisEntity[] acoesArray = new AcoesJudiciaisEntity[acoesJudiciais.size()];
			for (int i = 0; i < acoesJudiciais.size(); i++) {
				AcaoJudicial acao = acoesJudiciais.get(i);
				AcoesJudiciaisEntity acaoEntity = new AcoesJudiciaisEntity();
				acaoEntity.setAcaoId(acao.getAcaoId());
				acaoEntity.setPropostaId(proposta.getPropostaId());
				acaoEntity.setNumeroProcesso(acao.getNumeroProcesso());
				acaoEntity.setOrgaoTribunal(acao.getOrgaoTribunal());
				acaoEntity.setUnidadeVara(acao.getUnidadeVara());
				acaoEntity.setParteAutora(acao.getParteAutora());
				acaoEntity.setParteRe(acao.getParteRe());
				acaoEntity.setObservacoes(acao.getObservacoes());
				acoesArray[i] = acaoEntity;
			}
			propostaEntity.setAcoesJudiciaisEntities(acoesArray);
		} catch (Exception e) {
			_log.warn("Erro ao buscar ações judiciais para proposta " + proposta.getPropostaId(), e);
		}

		try {
			List<DemonstracaoContabil> demonstracoes = _demonstracaoContabilLocalService.getDemonstracaoContabils(-1, -1);
			demonstracoes = demonstracoes.stream()
					.filter(dem -> dem.getPropostaId() == proposta.getPropostaId())
					.collect(Collectors.toList());

			DemonstracoesContabeisEntities demonstracoesEntity = new DemonstracoesContabeisEntities();
			List<ArquivosEntity> demonstracoesResultados = new ArrayList<>();
			List<ArquivosEntity> relatoriosGerenciais = new ArrayList<>();
			List<ArquivosEntity> outrosContabeis = new ArrayList<>();

			for (DemonstracaoContabil demonstracao : demonstracoes) {
				ArquivosEntity arquivoEntity = getArquivosEntity(demonstracao.getFileEntryId());

				switch (demonstracao.getTipoDocumento()) {
						case 1:
							demonstracoesEntity.setBalancoPatrimonial(arquivoEntity);
							break;
						case 2:
							demonstracoesResultados.add(arquivoEntity);
							break;
						case 3:
							relatoriosGerenciais.add(arquivoEntity);
							break;
						case 4:
							demonstracoesEntity.setDescricaoGrupo(arquivoEntity);
							break;
						case 5:
							outrosContabeis.add(arquivoEntity);
							break;
					}
				}

			demonstracoesEntity.setDemonstracoesResultados(demonstracoesResultados.toArray(new ArquivosEntity[0]));
			demonstracoesEntity.setRelatoriosGerenciais(relatoriosGerenciais.toArray(new ArquivosEntity[0]));
			demonstracoesEntity.setOutrosContabeis(outrosContabeis.toArray(new ArquivosEntity[0]));

			propostaEntity.setDemonstracoesContabeisEntities(demonstracoesEntity);
		} catch (Exception e) {
			_log.warn("Erro ao buscar demonstrações contábeis para proposta " + proposta.getPropostaId(), e);
		}

		try {
			br.com.seatecnologia.gdf.negocia.model.Declaracao declaracao = _declaracaoLocalService.getDeclaracaoByPropostaId(proposta.getPropostaId());

			if (declaracao != null) {
				Declaracao declaracaoEntity = new Declaracao();
				declaracaoEntity.setCumpreCompromissos(declaracao.isCumpreCompromissos());
				declaracaoEntity.setNaoAlienacaoBensSemComunicacao(declaracao.isNaoAlienacaoBensSemComunicacao());
				declaracaoEntity.setReconheceGrupoOuSucessao(declaracao.isReconheceGrupoOuSucessao());
				declaracaoEntity.setCompromissoConfidencialidade(declaracao.isCompromissoConfidencialidade());
				declaracaoEntity.setCienciaProcesso(declaracao.isCienciaProcesso());
				declaracaoEntity.setAbusoTransacao(declaracao.isAbusoTransacao());
				declaracaoEntity.setImpugnacaoRecursos(declaracao.isImpugnacaoRecursos());
				declaracaoEntity.setRenunciaRecursos(declaracao.isRenunciaRecursos());
				declaracaoEntity.setPeticionamentoProcessos(declaracao.isPeticionamentoProcessos());
				declaracaoEntity.setPrestacaoInformacoes(declaracao.isPrestacaoInformacoes());
				declaracaoEntity.setOmissaoInformacoes(declaracao.isOmissaoInformacoes());
				declaracaoEntity.setManutencaoGarantias(declaracao.isManutencaoGarantias());

				propostaEntity.setDeclaracao(declaracaoEntity);
			}
		} catch (Exception e) {
			_log.warn("Erro ao buscar declaração para proposta " + proposta.getPropostaId(), e);
		}

		try {
			List<RelacaoCredor> credores = _relacaoCredorLocalService.getRelacaoCredors(-1, -1);
			credores = credores.stream()
					.filter(cred -> cred.getPropostaId() == proposta.getPropostaId())
					.collect(Collectors.toList());

			RelacaoCredoresEntity[] credoresArray = new RelacaoCredoresEntity[credores.size()];
			for (int i = 0; i < credores.size(); i++) {
				RelacaoCredor credor = credores.get(i);
				RelacaoCredoresEntity credorEntity = new RelacaoCredoresEntity();
				credorEntity.setCredorId(credor.getCredorId());
				credorEntity.setPropostaId(credor.getPropostaId());
				credorEntity.setNomeCredor(credor.getNomeCredor());
				credorEntity.setNaturezaCredito(credor.getNaturezaCredito());
				credorEntity.setClassificacaoCredito(credor.getClassificacaoCredito());
				credorEntity.setReferenciaRegistro(credor.getReferenciaContabil());
				credorEntity.setValorCredito(credor.getValorAtualizado());
				credoresArray[i] = credorEntity;
			}
			propostaEntity.setRelacaoCredoresEntities(credoresArray);
		} catch (Exception e) {
			_log.warn("Erro ao buscar relação de credores para proposta " + proposta.getPropostaId(), e);
		}

		try {
			List<BensDireitosRequerente> bensRequerente = _bensDireitosRequerenteLocalService.getBensDireitosRequerentes(-1, -1);
			bensRequerente = bensRequerente.stream()
					.filter(bens -> bens.getPropostaId() == proposta.getPropostaId())
					.collect(Collectors.toList());
			if (!bensRequerente.isEmpty()) {
				BensDireitosRequerenteEntity bensEntity = new BensDireitosRequerenteEntity();
				BensDireitosRequerente bem = bensRequerente.get(0);
				bensEntity.setBemId(bem.getBemId());
				bensEntity.setPropostaId(bem.getPropostaId());
				bensEntity.setDescricao(bem.getDescricao());
				bensEntity.setLocalizacao(bem.getLocalizacaoDestinacao());

				List<BensDireitosLaudo> laudos = _bensDireitoLaudoLocalService.getBensDireitosLaudos(-1, -1);
				laudos = laudos.stream()
						.filter(laudo -> laudo.getBemId() == bem.getBemId())
						.collect(Collectors.toList());

				LaudoAvaliacaoEntity[] laudosArray = new LaudoAvaliacaoEntity[laudos.size()];
				for (int i = 0; i < laudos.size(); i++) {
					LaudoAvaliacaoEntity laudoEntity = new LaudoAvaliacaoEntity();
					laudoEntity.setLaudoId((long) i);
					laudoEntity.setFileEntryId(laudos.get(i).getLaudoAvaliacao());
					laudosArray[i] = laudoEntity;
				}
				bensEntity.setLaudoAvaliacaoEntities(laudosArray);

				propostaEntity.setBensDireitosRequerenteEntities(bensEntity);
			}
		} catch (Exception e) {
			_log.warn("Erro ao buscar bens e direitos do requerente para proposta " + proposta.getPropostaId(), e);
		}

			if (proposta.getDocumentosCompletosURL() != null) {
					propostaEntity.setZipUrl(proposta.getDocumentosCompletosURL());
				}

		return propostaEntity;
	}

	private ArquivosEntity getArquivosEntity(long fileEntryId) {
		ArquivosEntity anexoRecuperacaoEntity = new ArquivosEntity();
		if(fileEntryId == 0) {
			return anexoRecuperacaoEntity;
		}
		try {
			FileEntry fileEntry = _dlAppService.getFileEntry(fileEntryId);
			String url = DLURLHelperUtil.getDownloadURL(fileEntry, fileEntry.getFileVersion(), null, StringPool.BLANK);
			anexoRecuperacaoEntity.setFileEntryId(fileEntryId);
			anexoRecuperacaoEntity.setUrl(url);
			anexoRecuperacaoEntity.setFileName(fileEntry.getFileName());
		} catch (Exception ignore){

		}
		return anexoRecuperacaoEntity;
	}


	@Override
	public PropostaEntity postProposta(PropostaEntity propostaEntity) {
		return  makeProposta(propostaEntity);
	}

	@Transactional(rollbackFor = Exception.class)
	private PropostaEntity makeProposta(PropostaEntity propostaEntity) {

		if (Objects.equals(propostaEntity.getTipoProposta(), TipoPropostaEnum.PROPOSTA_EDITAL.getLabel())) {
			if (propostaEntity.getEditalId() == null) {
				throw new ClientErrorException(
						"Edital não informado", javax.ws.rs.core.Response.Status.PRECONDITION_FAILED);
			}
		}

		try {
			ServiceContext serviceContext = ServiceContextFactory.getInstance(PropostaEntity.class.getName(), contextHttpServletRequest);

			DadosContribuinteEntity dadosContribuinteEntity = propostaEntity.getDadosContribuinte();

			String cpfCnpj = _govBrAuthContext.getCpfCnpj(contextUser);

			long procuracaoFileEntryId = 0;

			if(Validator.isNotNull(propostaEntity.getProcuracao()) && Validator.isNotNull(propostaEntity.getProcuracao().getFileEntryId())) {
				procuracaoFileEntryId = propostaEntity.getProcuracao().getFileEntryId();
			}

			propostaEntity.setTipoProposta(PropostaType.fromValue(propostaEntity.getTipoProposta()).getValue());
			Proposta proposta = _propostaService.addProposta(serviceContext, propostaEntity.getEditalId(), propostaEntity.getTipoProposta(),
					propostaEntity.getNumeroProtocoloSEI(), propostaEntity.getEditalId(), procuracaoFileEntryId,
					cpfCnpj);

			PropostaEntity propostaEntityPersistido = new PropostaEntity();
			propostaEntityPersistido.setPropostaId(proposta.getPropostaId());
			propostaEntityPersistido.setEditalId(proposta.getEditalId());
			propostaEntityPersistido.setTipoProposta(proposta.getTipoProposta());

			if (Validator.isNotNull(dadosContribuinteEntity)) {
				QualificacaoCompletaEntity qualificacaoCompletaDadosRequerenteEntity = dadosContribuinteEntity.getQualificacao();
				DadosContribuinteEntity dadosContribuinteEntityPersistido = new DadosContribuinteEntity();
				if (Validator.isNotNull(qualificacaoCompletaDadosRequerenteEntity)) {
					EnderecoEntity enderecoEntity = qualificacaoCompletaDadosRequerenteEntity.getEnderecoPostal();

					Endereco enderecoDadosRequerentePersistido = _enderecoService.addEndereco(
							enderecoEntity.getCep(), enderecoEntity.getEndereco(), enderecoEntity.getNumero(),
							enderecoEntity.getBairro(), enderecoEntity.getEstado(), enderecoEntity.getMunicipio(),
							enderecoEntity.getComplemento());

					EnderecoEntity enderecoEntityPersistido = setEnderecoEntity(enderecoDadosRequerentePersistido);

					QualificacaoCompleta qualificacaoCompletaDadosRequerentePersistido = _qualificacoCompletaService.addQualificacaoCompleta(
							serviceContext,
							qualificacaoCompletaDadosRequerenteEntity.getTipoPessoa(),
							qualificacaoCompletaDadosRequerenteEntity.getNomeRazaoSocial(),
							qualificacaoCompletaDadosRequerenteEntity.getNomeFantasia(),
							qualificacaoCompletaDadosRequerenteEntity.getRepresentanteLegal(),
							qualificacaoCompletaDadosRequerenteEntity.getCpfCnpj(),
							qualificacaoCompletaDadosRequerenteEntity.getNumeroCfdf(),
							qualificacaoCompletaDadosRequerenteEntity.getEmail(),
							qualificacaoCompletaDadosRequerenteEntity.getTelefone(),
							qualificacaoCompletaDadosRequerenteEntity.getWhatsapp(),
							enderecoDadosRequerentePersistido.getEnderecoId(),
							qualificacaoCompletaDadosRequerenteEntity.getDomicilioFiscal());

					QualificacaoCompletaEntity qualificacaoCompletaDadosRequerenteEntityPersistido = setQualificacaoCompletaEntity(enderecoEntityPersistido, qualificacaoCompletaDadosRequerentePersistido);
					dadosContribuinteEntityPersistido.setQualificacao(qualificacaoCompletaDadosRequerenteEntityPersistido);
					proposta.setQualificacaoId(qualificacaoCompletaDadosRequerentePersistido.getQualificacaoId());
					_propostaService.updateProposta(proposta);
				}

				PessoaJuridicaEntity[] pessoaJuridicaEntities = dadosContribuinteEntity.getPessoaJuridicaEntities();
				List<PessoaJuridicaEntity> pessoaJuridicaEntitiesPersistidoList = new ArrayList<>();
				if (Validator.isNotNull(pessoaJuridicaEntities)) {
					for (PessoaJuridicaEntity pessoaJuridicaEntity : pessoaJuridicaEntities) {

						QualificacaoCompletaEntity qualificacaoCompletaPessoaJuridicaEntity = pessoaJuridicaEntity.getQualificacao();
						EnderecoEntity enderecoEntity = qualificacaoCompletaPessoaJuridicaEntity.getEnderecoPostal();

						Endereco enderecoPessoaJuridicaPersistido = _enderecoService.addEndereco(
								enderecoEntity.getCep(), enderecoEntity.getEndereco(), enderecoEntity.getNumero(),
								enderecoEntity.getBairro(), enderecoEntity.getEstado(), enderecoEntity.getMunicipio(),
								enderecoEntity.getComplemento());

						EnderecoEntity enderecoEntityPersistido = setEnderecoEntity(enderecoPessoaJuridicaPersistido);

						QualificacaoCompleta qualificacaoCompletaPessoaJuridicaPersistido = _qualificacoCompletaService.addQualificacaoCompleta(
								serviceContext,
								qualificacaoCompletaPessoaJuridicaEntity.getTipoPessoa(),
								qualificacaoCompletaPessoaJuridicaEntity.getNomeRazaoSocial(),
								qualificacaoCompletaPessoaJuridicaEntity.getNomeFantasia(),
								qualificacaoCompletaPessoaJuridicaEntity.getRepresentanteLegal(),
								qualificacaoCompletaPessoaJuridicaEntity.getCpfCnpj(),
								qualificacaoCompletaPessoaJuridicaEntity.getNumeroCfdf(),
								qualificacaoCompletaPessoaJuridicaEntity.getEmail(),
								qualificacaoCompletaPessoaJuridicaEntity.getTelefone(),
								qualificacaoCompletaPessoaJuridicaEntity.getWhatsapp(),
								enderecoPessoaJuridicaPersistido.getEnderecoId(),
								qualificacaoCompletaDadosRequerenteEntity.getDomicilioFiscal());

						QualificacaoCompletaEntity qualificacaoCompletaPessoaJuridicaEntityPersistido = setQualificacaoCompletaEntity(enderecoEntityPersistido, qualificacaoCompletaPessoaJuridicaPersistido);

						PessoaJuridicaEntity pessoaJuridicaEntityPersistido = new PessoaJuridicaEntity();
						pessoaJuridicaEntityPersistido.setQualificacao(qualificacaoCompletaPessoaJuridicaEntityPersistido);
						pessoaJuridicaEntityPersistido.setTipoPessoaJuridica(pessoaJuridicaEntity.getTipoPessoaJuridica());

						pessoaJuridicaEntitiesPersistidoList.add(pessoaJuridicaEntityPersistido);

						_demaisPartesService.addDemaisPartes(qualificacaoCompletaPessoaJuridicaPersistido.getQualificacaoId(),
								proposta.getPropostaId(), pessoaJuridicaEntity.getTipoPessoaJuridica());
					}
					dadosContribuinteEntityPersistido.setPessoaJuridicaEntities(pessoaJuridicaEntitiesPersistidoList.toArray(new PessoaJuridicaEntity[0]));
				}
				propostaEntityPersistido.setDadosContribuinte(dadosContribuinteEntityPersistido);
			}

			AdministradorJudicialEntity administradorJudicialEntity = propostaEntity.getAdministradorJudicial();

			if (Validator.isNotNull(administradorJudicialEntity)) {

				QualificacaoCompletaEntity qualificacaoJudicialEntity = administradorJudicialEntity.getQualificacao();
				EnderecoEntity enderecoJudicialEntity = administradorJudicialEntity.getQualificacao().getEnderecoPostal();

				if (qualificacaoJudicialEntity != null && enderecoJudicialEntity != null) {

					Endereco enderecoJudicialPersistido = _enderecoService.addEndereco(enderecoJudicialEntity.getCep(),
							enderecoJudicialEntity.getEndereco(), enderecoJudicialEntity.getNumero(), enderecoJudicialEntity.getEstado(),
							enderecoJudicialEntity.getMunicipio(), enderecoJudicialEntity.getBairro(), enderecoJudicialEntity.getComplemento());

					EnderecoEntity enderecoJudicialEntityPersistido = setEnderecoEntity(enderecoJudicialPersistido);

					QualificacaoCompleta qualificacaoJudicialPersistido = _qualificacoCompletaService.addQualificacaoCompleta(serviceContext, qualificacaoJudicialEntity.getTipoPessoa(),
							qualificacaoJudicialEntity.getNomeRazaoSocial(), qualificacaoJudicialEntity.getNomeFantasia(),
							qualificacaoJudicialEntity.getRepresentanteLegal(), qualificacaoJudicialEntity.getCpfCnpj(),
							qualificacaoJudicialEntity.getNumeroCfdf(), qualificacaoJudicialEntity.getEmail(),
							qualificacaoJudicialEntity.getTelefone(), qualificacaoJudicialEntity.getWhatsapp(),
							enderecoJudicialPersistido.getEnderecoId(), qualificacaoJudicialEntity.getDomicilioFiscal());

					QualificacaoCompletaEntity qualificacaoJudicialEntityPersistida = setQualificacaoCompletaEntity(enderecoJudicialEntityPersistido, qualificacaoJudicialPersistido);

					long anexoRecuperacaoId = 0;

					if(Validator.isNotNull(administradorJudicialEntity.getAnexoRecuperacao()) && Validator.isNotNull(administradorJudicialEntity.getAnexoRecuperacao().getFileEntryId())){
						anexoRecuperacaoId = administradorJudicialEntity.getAnexoRecuperacao().getFileEntryId();
					}

					AdministradorJudicial administradorJudicialPersistido = _administradorJudicialService.addAdministradorJudicial(serviceContext,
							qualificacaoJudicialPersistido.getQualificacaoId(), administradorJudicialEntity.getRegimeFalencia(),
							administradorJudicialEntity.getRecuperacao(), administradorJudicialEntity.getNumeroProcesso(),
							anexoRecuperacaoId);

					AdministradorJudicialEntity administradorJudicialPersistidoEntity = setAdministradorJudicial(qualificacaoJudicialEntityPersistida, administradorJudicialPersistido);
					propostaEntityPersistido.setAdministradorJudicial(administradorJudicialPersistidoEntity);
					proposta.setAdministradorJudicialId(administradorJudicialPersistido.getAdministradorJudicialId());
					_propostaService.updateProposta(proposta);
				}
			}

			AdvogadoEntity advogadoEntity = propostaEntity.getAdvogado();

			if (Validator.isNotNull(advogadoEntity)) {
				QualificacaoCompletaEntity qualificacaoAdvogadoEntity = advogadoEntity.getQualificacao();
				EnderecoEntity enderecoAdvogadoEntity = advogadoEntity.getQualificacao().getEnderecoPostal();
				if (qualificacaoAdvogadoEntity != null && enderecoAdvogadoEntity != null) {
					Endereco enderecoAdvogadoPersistido = _enderecoService.addEndereco(enderecoAdvogadoEntity.getCep(),
							enderecoAdvogadoEntity.getEndereco(), enderecoAdvogadoEntity.getNumero(), enderecoAdvogadoEntity.getEstado(),
							enderecoAdvogadoEntity.getMunicipio(), enderecoAdvogadoEntity.getBairro(), enderecoAdvogadoEntity.getComplemento());

					EnderecoEntity enderecoAdvogadoPersistidoEntity = setEnderecoEntity(enderecoAdvogadoPersistido);

					QualificacaoCompleta qualificacaoAdvogadoPersistido = _qualificacoCompletaService.addQualificacaoCompleta(serviceContext, qualificacaoAdvogadoEntity.getTipoPessoa(),
							qualificacaoAdvogadoEntity.getNomeRazaoSocial(), qualificacaoAdvogadoEntity.getNomeFantasia(),
							qualificacaoAdvogadoEntity.getRepresentanteLegal(), qualificacaoAdvogadoEntity.getCpfCnpj(),
							qualificacaoAdvogadoEntity.getNumeroCfdf(), qualificacaoAdvogadoEntity.getEmail(),
							qualificacaoAdvogadoEntity.getTelefone(), qualificacaoAdvogadoEntity.getWhatsapp(),
							enderecoAdvogadoPersistido.getEnderecoId(), qualificacaoAdvogadoEntity.getDomicilioFiscal());

					QualificacaoCompletaEntity qualificacaoAdvogadoPersistidaEntity = setQualificacaoCompletaEntity(enderecoAdvogadoPersistidoEntity, qualificacaoAdvogadoPersistido);
					qualificacaoAdvogadoPersistidaEntity.setEnderecoPostal(enderecoAdvogadoPersistidoEntity);

					Advogado advogadoPersistido = _advogadoService.addAdvogado(serviceContext,
							qualificacaoAdvogadoPersistido.getQualificacaoId(), advogadoEntity.getNumeroOab(), advogadoEntity.getSeccional(), advogadoEntity.getCarteirinhaOAB().getFileEntryId());

					ArquivosEntity carteirinhaOAB = new ArquivosEntity();
					carteirinhaOAB.setFileEntryId(advogadoPersistido.getCarteirinhaOAB());

					AdvogadoEntity advogadoPersistidoEntity = setAdvogadoEntity(advogadoPersistido, qualificacaoAdvogadoPersistidaEntity, carteirinhaOAB);
					propostaEntityPersistido.setAdvogado(advogadoPersistidoEntity);
					proposta.setAdvogadoId(advogadoPersistido.getAdvogadoId());
					_propostaService.updateProposta(proposta);
				}
			}

			AcoesJudiciaisEntity[] acoesJudiciaisEntity = propostaEntity.getAcoesJudiciaisEntities();
			List<AcoesJudiciaisEntity> acoesJudiciaisEntityList = new ArrayList<>();
			for (int i = 0; i < acoesJudiciaisEntity.length; i++) {
				AcaoJudicial acaoJudicial = _acaoJudicialService.addAcaoJudicial(serviceContext, acoesJudiciaisEntity[i].getOrgaoTribunal(),
						acoesJudiciaisEntity[i].getNumeroProcesso(), acoesJudiciaisEntity[i].getUnidadeVara(),
						acoesJudiciaisEntity[i].getParteAutora(), acoesJudiciaisEntity[i].getParteRe(),
						acoesJudiciaisEntity[i].getObservacoes(), proposta.getPropostaId());
				AcoesJudiciaisEntity acoesJudiciaisEntityPersistido = new AcoesJudiciaisEntity();
				acoesJudiciaisEntityPersistido.setAcaoId(acaoJudicial.getAcaoId());
				acoesJudiciaisEntityPersistido.setNumeroProcesso(acaoJudicial.getNumeroProcesso());
				acoesJudiciaisEntityPersistido.setUnidadeVara(acaoJudicial.getUnidadeVara());
				acoesJudiciaisEntityPersistido.setParteAutora(acaoJudicial.getParteAutora());
				acoesJudiciaisEntityPersistido.setParteRe(acaoJudicial.getParteRe());
				acoesJudiciaisEntityPersistido.setObservacoes(acaoJudicial.getObservacoes());
				acoesJudiciaisEntityList.add(acoesJudiciaisEntityPersistido);
			}

			BensDireitosRequerenteEntity bensDireitosRequerenteEntity = propostaEntity.getBensDireitosRequerenteEntities();

			if (Validator.isNotNull(bensDireitosRequerenteEntity)) {
				BensDireitosRequerente bensDireitosRequerente = _bensDireitosRequerenteService.addBensDireitosRequerente(serviceContext,
						proposta.getPropostaId(), bensDireitosRequerenteEntity.getDescricao(), bensDireitosRequerenteEntity.getLocalizacao());
				LaudoAvaliacaoEntity[] laudoAvaliacaoEntity = bensDireitosRequerenteEntity.getLaudoAvaliacaoEntities();
				List<LaudoAvaliacaoEntity> laudoAvaliacaoEntityList = new ArrayList<>();
                for (LaudoAvaliacaoEntity avaliacaoEntity : laudoAvaliacaoEntity) {

					long laudoId = 0;

					if (avaliacaoEntity.getLaudoId() != null) {
						laudoId = avaliacaoEntity.getLaudoId();
					}

					BensDireitosLaudo laudoAvaliacao = _bensDireitosLaudoService.addBensDireitosLaudo(bensDireitosRequerente.getBemId(), laudoId);
                    LaudoAvaliacaoEntity laudoAvaliacaoEntityPersistido = new LaudoAvaliacaoEntity();
                    laudoAvaliacaoEntityPersistido.setLaudoId(laudoAvaliacao.getLaudoAvaliacao());
                    laudoAvaliacaoEntityList.add(laudoAvaliacaoEntityPersistido);
                }
				BensDireitosRequerenteEntity bensDireitosRequerentePersistido = new BensDireitosRequerenteEntity();
				bensDireitosRequerentePersistido.setBemId(bensDireitosRequerente.getBemId());
				bensDireitosRequerentePersistido.setDescricao(bensDireitosRequerente.getDescricao());
				bensDireitosRequerentePersistido.setLocalizacao(bensDireitosRequerente.getLocalizacaoDestinacao());
				bensDireitosRequerentePersistido.setLaudoAvaliacaoEntities(
						laudoAvaliacaoEntityList.toArray(new LaudoAvaliacaoEntity[0])
				);
				propostaEntity.setBensDireitosRequerenteEntities(bensDireitosRequerentePersistido);
			}

			RelacaoCredoresEntity[] relacaoCredoresEntity = propostaEntity.getRelacaoCredoresEntities();
			List<RelacaoCredoresEntity> relacaoCredoresEntityList = new ArrayList<>();
            for (RelacaoCredoresEntity credoresEntity : relacaoCredoresEntity) {
                RelacaoCredor relacaoCredor = _relacaoCredorService.addRelacaoCredor(serviceContext, proposta.getPropostaId(),
                        credoresEntity.getNomeCredor(), credoresEntity.getNaturezaCredito(),
                        credoresEntity.getClassificacaoCredito(), credoresEntity.getValorCredito(),
                        credoresEntity.getReferenciaRegistro());
                RelacaoCredoresEntity relacaoCredoresEntityPersistido = new RelacaoCredoresEntity();
                relacaoCredoresEntityPersistido.setCredorId(relacaoCredor.getCredorId());
                relacaoCredoresEntityPersistido.setNomeCredor(relacaoCredor.getNomeCredor());
                relacaoCredoresEntityPersistido.setNaturezaCredito(relacaoCredor.getNaturezaCredito());
                relacaoCredoresEntityPersistido.setClassificacaoCredito(relacaoCredor.getClassificacaoCredito());
                relacaoCredoresEntityPersistido.setValorCredito(relacaoCredor.getValorAtualizado());
                relacaoCredoresEntityPersistido.setReferenciaRegistro(relacaoCredor.getReferenciaContabil());
                relacaoCredoresEntityList.add(relacaoCredoresEntityPersistido);
            }

			FundamentacaoPedido fundamentacaoPedidoEntity = propostaEntity.getFundamentacaoPedido();

			if (Validator.isNotNull(fundamentacaoPedidoEntity)) {
				br.com.seatecnologia.gdf.negocia.model.FundamentacaoPedido fundamentacaoPedidoPersistido = _fundamentacaoPedidoService.addFundamentacaoPedido(serviceContext,
						fundamentacaoPedidoEntity.getFundamentacao(), proposta.getPropostaId());

				FundamentacaoPedido fundamentacaoPedidoEntityPersistido = new FundamentacaoPedido();
				fundamentacaoPedidoEntityPersistido.setFundamentacao(fundamentacaoPedidoPersistido.getFundamentacaoPedido());

				ArquivosEntity[] documentacaoComprobatoriaEntity = fundamentacaoPedidoEntity.getDocumentacaoComprobatoria();
				List<ArquivosEntity> documentacaoComprobatoriaEntityList = new ArrayList<>();
                for (ArquivosEntity arquivosEntity : documentacaoComprobatoriaEntity) {
                    DocumentoComprobatorio documentacaoComprobatorioPersistido = _documentoComprobatorioService.addDocumentoComprobatorio(
                            arquivosEntity.getFileEntryId(), fundamentacaoPedidoPersistido.getFundamentacaoId());

                    ArquivosEntity documentacaoComprobatoriaEntityPersistido = new ArquivosEntity();
                    documentacaoComprobatoriaEntityPersistido.setFileEntryId(documentacaoComprobatorioPersistido.getFileEntryId());
                    documentacaoComprobatoriaEntityList.add(documentacaoComprobatoriaEntityPersistido);
                }
				IdentificacaoDebitosEntity[] identificacaoDebitosEntity = fundamentacaoPedidoEntity.getIdentificacaoDebitos();
				List<IdentificacaoDebitosEntity> identificacaoDebitosEntityList = new ArrayList<>();
                for (IdentificacaoDebitosEntity debitosEntity : identificacaoDebitosEntity) {
                    IdentificacaoDebitos identificacaoDebitosPersistido = _identificacaoDebitosService.addIdentificacaoDebitos(fundamentacaoPedidoPersistido.getFundamentacaoId(),
                            debitosEntity.getNatureza(), debitosEntity.getSituacao(), debitosEntity.getInscricaoDividaAtiva(),
                            debitosEntity.getGarantidoJudicialmente());
                    IdentificacaoDebitosEntity identificacaoDebitosEntityPersistido = new IdentificacaoDebitosEntity();
                    identificacaoDebitosPersistido.setNatureza(identificacaoDebitosEntityPersistido.getNatureza());
                    identificacaoDebitosPersistido.setSituacao(identificacaoDebitosEntityPersistido.getSituacao());
                    identificacaoDebitosPersistido.setInscricaoDividaAtiva(identificacaoDebitosEntityPersistido.getInscricaoDividaAtiva());
                    identificacaoDebitosPersistido.setGarantidoJudicialmente(identificacaoDebitosEntityPersistido.getGarantidoJudicialmente());
                    identificacaoDebitosEntityList.add(identificacaoDebitosEntityPersistido);
                }

				fundamentacaoPedidoEntityPersistido.setDocumentacaoComprobatoria(documentacaoComprobatoriaEntityList.toArray(new ArquivosEntity[0]));
				fundamentacaoPedidoEntityPersistido.setIdentificacaoDebitos(identificacaoDebitosEntityList.toArray(new IdentificacaoDebitosEntity[0]));
				proposta.setFundamentacaoPedidoId(fundamentacaoPedidoPersistido.getFundamentacaoId());
				_propostaService.updateProposta(proposta);
			}

			Declaracao declaracaoEntity = propostaEntity.getDeclaracao();

			if (Validator.isNotNull(declaracaoEntity)) {
				br.com.seatecnologia.gdf.negocia.model.Declaracao declaracaoPersistido = _declaracaoService.addDeclaracao(serviceContext, proposta.getPropostaId(), declaracaoEntity.getCumpreCompromissos(),
						declaracaoEntity.getNaoAlienacaoBensSemComunicacao(), declaracaoEntity.getReconheceGrupoOuSucessao(),
						declaracaoEntity.getCompromissoConfidencialidade(), declaracaoEntity.getCienciaProcesso(),
						declaracaoEntity.getAbusoTransacao(), declaracaoEntity.getImpugnacaoRecursos(), declaracaoEntity.getRenunciaRecursos(),
						declaracaoEntity.getPeticionamentoProcessos(), declaracaoEntity.getPrestacaoInformacoes(),
						declaracaoEntity.getOmissaoInformacoes(), declaracaoEntity.getManutencaoGarantias());

				Declaracao declaracaoEntityPersistido = new Declaracao();
				declaracaoEntityPersistido.setCumpreCompromissos(declaracaoPersistido.getCumpreCompromissos());
				declaracaoEntityPersistido.setNaoAlienacaoBensSemComunicacao(declaracaoPersistido.getNaoAlienacaoBensSemComunicacao());
				declaracaoEntityPersistido.setReconheceGrupoOuSucessao(declaracaoPersistido.getReconheceGrupoOuSucessao());
				declaracaoEntityPersistido.setCompromissoConfidencialidade(declaracaoPersistido.getCompromissoConfidencialidade());
				declaracaoEntityPersistido.setCienciaProcesso(declaracaoPersistido.getCienciaProcesso());
				declaracaoEntityPersistido.setAbusoTransacao(declaracaoPersistido.getAbusoTransacao());
				declaracaoEntityPersistido.setImpugnacaoRecursos(declaracaoPersistido.getImpugnacaoRecursos());
				declaracaoEntityPersistido.setRenunciaRecursos(declaracaoPersistido.getRenunciaRecursos());
				declaracaoEntityPersistido.setPeticionamentoProcessos(declaracaoPersistido.getPeticionamentoProcessos());
				declaracaoEntityPersistido.setPrestacaoInformacoes(declaracaoPersistido.getPrestacaoInformacoes());
				declaracaoEntityPersistido.setOmissaoInformacoes(declaracaoPersistido.getOmissaoInformacoes());
				declaracaoEntityPersistido.setManutencaoGarantias(declaracaoPersistido.getManutencaoGarantias());

				propostaEntityPersistido.setDeclaracao(declaracaoEntityPersistido);
			}

			GarantiaEntity garantiaEntity = propostaEntity.getGarantiaEntity();
			GarantiaDetalhadaEntity[] garantiaDetalhadaEntitiesArray = garantiaEntity.getGarantiaDetalhadaEntities();
			List<GarantiaDetalhadaEntity> garantiasDetalhadaEntitiesList = new ArrayList<>();
			for (int i = 0; i < garantiaDetalhadaEntitiesArray.length; i++) {
				QualificacaoCompletaEntity qualificacaoProprietarioEntity = garantiaDetalhadaEntitiesArray[i].getProprietario();
				EnderecoEntity enderecoProprietarioEntity = garantiaDetalhadaEntitiesArray[i].getProprietario().getEnderecoPostal();
				if (qualificacaoProprietarioEntity != null && enderecoProprietarioEntity != null) {
					Endereco enderecoProprietarioPersistido = _enderecoService.addEndereco(enderecoProprietarioEntity.getCep(),
							enderecoProprietarioEntity.getEndereco(), enderecoProprietarioEntity.getNumero(), enderecoProprietarioEntity.getEstado(),
							enderecoProprietarioEntity.getMunicipio(), enderecoProprietarioEntity.getBairro(), enderecoProprietarioEntity.getComplemento());

					EnderecoEntity enderecoProprietarioPersistidoEntity = setEnderecoEntity(enderecoProprietarioPersistido);

					QualificacaoCompleta qualificacaoProprietarioPersistido = _qualificacoCompletaService.addQualificacaoCompleta(serviceContext, qualificacaoProprietarioEntity.getTipoPessoa(),
							qualificacaoProprietarioEntity.getNomeRazaoSocial(), qualificacaoProprietarioEntity.getNomeFantasia(),
							qualificacaoProprietarioEntity.getRepresentanteLegal(), qualificacaoProprietarioEntity.getCpfCnpj(),
							qualificacaoProprietarioEntity.getNumeroCfdf(), qualificacaoProprietarioEntity.getEmail(),
							qualificacaoProprietarioEntity.getTelefone(), qualificacaoProprietarioEntity.getWhatsapp(),
							enderecoProprietarioPersistido.getEnderecoId(), qualificacaoProprietarioEntity.getDomicilioFiscal());

					QualificacaoCompletaEntity qualificacaoProprietarioPersistidaEntity = setQualificacaoCompletaEntity(enderecoProprietarioPersistidoEntity, qualificacaoProprietarioPersistido);
					qualificacaoProprietarioPersistidaEntity.setEnderecoPostal(enderecoProprietarioPersistidoEntity);

					DadosRegistro dadosRegistroEntity = garantiaDetalhadaEntitiesArray[i].getDadosRegistro();

					br.com.seatecnologia.gdf.negocia.model.DadosRegistro dadosRegistroPersistido = _dadosRegistroService.addDadosRegistro(
							dadosRegistroEntity.getMatriculaImovel(), dadosRegistroEntity.getCartorioRegistro(), dadosRegistroEntity.getRenavam()
					);

					DadosRegistro dadosRegistroPersistidoEntity = new DadosRegistro();
					dadosRegistroPersistidoEntity.setMatriculaImovel(dadosRegistroPersistido.getMatriculaImovel());
					dadosRegistroPersistidoEntity.setCartorioRegistro(dadosRegistroPersistido.getCartorioRegistro());
					dadosRegistroPersistidoEntity.setRenavam(dadosRegistroPersistido.getRenavam());

					ArquivosEntity[] outrosDocumentoEntity = garantiaDetalhadaEntitiesArray[i].getDadosRegistro().getOutrosDocumento();
					List<ArquivosEntity> outrosDocumentosList = new ArrayList<>();
                    for (ArquivosEntity arquivosEntity : outrosDocumentoEntity) {
                        if (Validator.isNull(arquivosEntity.getFileEntryId())) {
                            continue;
                        }

                        _anexoOutrosService.addAnexoOutros(dadosRegistroPersistido.getDadosRegistroId(), arquivosEntity.getFileEntryId());

                        ArquivosEntity outrosDocumentoPersistido = new ArquivosEntity();
                        outrosDocumentoPersistido.setFileEntryId(arquivosEntity.getFileEntryId());
                        outrosDocumentosList.add(outrosDocumentoPersistido);
                    }

					dadosRegistroPersistidoEntity.setOutrosDocumento(outrosDocumentosList.toArray(new ArquivosEntity[0]));

					long fileEntryId = 0;
					if(Validator.isNotNull(garantiaDetalhadaEntitiesArray[i].getDeclaracao().getFileEntryId())){
						fileEntryId = garantiaDetalhadaEntitiesArray[i].getDeclaracao().getFileEntryId();
					}

					Garantia garantiaPersistido = _garantiaService.addGarantia(serviceContext, garantiaDetalhadaEntitiesArray[i].getTipoGarantia(), garantiaEntity.getTipoDevedor(),
							garantiaDetalhadaEntitiesArray[i].getOutrasGarantias(), qualificacaoProprietarioPersistido.getQualificacaoId(), garantiaDetalhadaEntitiesArray[i].getValorEstimado(),
							dadosRegistroPersistido.getDadosRegistroId(), garantiaDetalhadaEntitiesArray[i].getLocalizacao(), garantiaDetalhadaEntitiesArray[i].getDeclaracaoAnuencia(),
							fileEntryId, garantiaDetalhadaEntitiesArray[i].getDescricaoBem(), proposta.getPropostaId());

					dadosRegistroPersistido.setGarantiaId(garantiaPersistido.getGarantiaId());
					_dadosRegitroLocalService.updateDadosRegistro(dadosRegistroPersistido);

					GarantiaDetalhadaEntity garantiaPersistidoEntity = new GarantiaDetalhadaEntity();
					garantiaPersistidoEntity.setDeclaracao(garantiaDetalhadaEntitiesArray[i].getDeclaracao());
					garantiaPersistidoEntity.setDadosRegistro(dadosRegistroPersistidoEntity);
					garantiaPersistidoEntity.setDescricaoBem(garantiaPersistido.getDescricaoBem());
					garantiaPersistidoEntity.setOutrasGarantias(garantiaDetalhadaEntitiesArray[i].getOutrasGarantias());
					garantiaPersistidoEntity.setLocalizacao(garantiaDetalhadaEntitiesArray[i].getLocalizacao());
					garantiaPersistidoEntity.setDeclaracaoAnuencia(garantiaDetalhadaEntitiesArray[i].getDeclaracaoAnuencia());
					garantiaPersistidoEntity.setTipoGarantia(garantiaDetalhadaEntitiesArray[i].getTipoGarantia());
					garantiaPersistidoEntity.setValorEstimado(garantiaDetalhadaEntitiesArray[i].getValorEstimado());
					garantiaPersistidoEntity.setGarantiaId(garantiaPersistido.getGarantiaId());
					garantiaPersistidoEntity.setProprietario(qualificacaoProprietarioPersistidaEntity);
					garantiaPersistidoEntity.setTipoDevedor(garantiaPersistido.getTipoDevedor());

					garantiasDetalhadaEntitiesList.add(garantiaPersistidoEntity);

					_garantiaPropostaService.addGarantiaProposta(garantiaPersistido.getGarantiaId(), proposta.getPropostaId());

				}
			}

			GarantiaEntity garantiaEntityPersistido = new GarantiaEntity();
			garantiaEntityPersistido.setGarantiaDetalhadaEntities(garantiasDetalhadaEntitiesList.toArray(new GarantiaDetalhadaEntity[0]));

			propostaEntityPersistido.setGarantiaEntity(garantiaEntityPersistido);

			DemonstracoesContabeisEntities demonstracoesContabeisEntities = propostaEntity.getDemonstracoesContabeisEntities();
			if (Validator.isNotNull(demonstracoesContabeisEntities)) {
				ArquivosEntity balancoPatrimonial = demonstracoesContabeisEntities.getBalancoPatrimonial();
				ArquivosEntity[] demonstracoesResultados = demonstracoesContabeisEntities.getDemonstracoesResultados();
				ArquivosEntity[] relatoriosGerenciais = demonstracoesContabeisEntities.getRelatoriosGerenciais();
				ArquivosEntity descricaoGrupo = demonstracoesContabeisEntities.getDescricaoGrupo();
				ArquivosEntity[] outrosContabeis = demonstracoesContabeisEntities.getOutrosContabeis();

				DemonstracoesContabeisEntities demonstracoesContabeisEntityPersistidas = new DemonstracoesContabeisEntities();

				if (Validator.isNotNull(balancoPatrimonial) && Validator.isNotNull(balancoPatrimonial.getFileEntryId())) {
					DemonstracaoContabil balancoPatrimonialPersistido = _demonstracaoContabilLocalService.addDemonstracaoContabil(serviceContext, proposta.getPropostaId(),
							balancoPatrimonial.getFileEntryId(), DemonstracaoDocumentosEnum.BALANCO_PATRIMONIAL.getDemonstracaoDocumentosEnum());

					ArquivosEntity balancoPatrimonialEntityPersistido = new ArquivosEntity();
					balancoPatrimonialPersistido.setFileEntryId(balancoPatrimonialPersistido.getFileEntryId());
					demonstracoesContabeisEntityPersistidas.setBalancoPatrimonial(balancoPatrimonialEntityPersistido);
				}

				if (Validator.isNotNull(demonstracoesResultados)) {
					List<ArquivosEntity> demonstracoesResultadosList = new ArrayList<>();
					for (ArquivosEntity demonstracoesResultado : demonstracoesResultados) {
						if (Validator.isNotNull(demonstracoesResultado.getFileEntryId())) {

							DemonstracaoContabil demonstracoesResultadosPersistido = _demonstracaoContabilLocalService.addDemonstracaoContabil(serviceContext, proposta.getPropostaId(),
									demonstracoesResultado.getFileEntryId(), DemonstracaoDocumentosEnum.DEMONSTRACOES_RESULTADOS.getDemonstracaoDocumentosEnum());

							ArquivosEntity demonstracoesResultadosEntityPersistido = new ArquivosEntity();
							demonstracoesResultadosEntityPersistido.setFileEntryId(demonstracoesResultadosPersistido.getFileEntryId());
							demonstracoesResultadosList.add(demonstracoesResultadosEntityPersistido);
						}
					}
					demonstracoesContabeisEntityPersistidas.setDemonstracoesResultados(demonstracoesResultadosList.toArray(new ArquivosEntity[0]));
				}

				if (Validator.isNotNull(relatoriosGerenciais)) {
					List<ArquivosEntity> relatoriosGerenciaisList = new ArrayList<>();
					for (ArquivosEntity relatoriosGerencial : relatoriosGerenciais) {
						if (Validator.isNotNull(relatoriosGerencial.getFileEntryId())) {

							DemonstracaoContabil relatoriosGerenciaisPersistido = _demonstracaoContabilLocalService.addDemonstracaoContabil(serviceContext, proposta.getPropostaId(),
									relatoriosGerencial.getFileEntryId(), DemonstracaoDocumentosEnum.RELATORIOS_GERENCIAIS.getDemonstracaoDocumentosEnum());

							ArquivosEntity relatoriosGerenciaisEntityPersistido = new ArquivosEntity();
							relatoriosGerenciaisPersistido.setFileEntryId(relatoriosGerenciaisPersistido.getFileEntryId());
							relatoriosGerenciaisList.add(relatoriosGerenciaisEntityPersistido);
						}
					}
					demonstracoesContabeisEntityPersistidas.setRelatoriosGerenciais(relatoriosGerenciaisList.toArray(new ArquivosEntity[0]));
				}

				if (Validator.isNotNull(descricaoGrupo) && Validator.isNotNull(descricaoGrupo.getFileEntryId())) {

					DemonstracaoContabil descricaoGrupoPersistido =  _demonstracaoContabilLocalService.addDemonstracaoContabil(serviceContext, proposta.getPropostaId(),
							descricaoGrupo.getFileEntryId(), DemonstracaoDocumentosEnum.DESCRICAO_GRUPO.getDemonstracaoDocumentosEnum());

					ArquivosEntity descricaoGrupoEntityPersistido = new ArquivosEntity();
					descricaoGrupoPersistido.setFileEntryId(descricaoGrupoPersistido.getFileEntryId());
					demonstracoesContabeisEntityPersistidas.setDescricaoGrupo(descricaoGrupoEntityPersistido);
				}

				if (Validator.isNotNull(outrosContabeis)) {
					List<ArquivosEntity> outrosContabeisList = new ArrayList<>();
					for (ArquivosEntity outroContabil : outrosContabeis) {
						if (Validator.isNotNull(outroContabil.getFileEntryId())) {

							DemonstracaoContabil outrosContabeisPersistido = _demonstracaoContabilLocalService.addDemonstracaoContabil(serviceContext, proposta.getPropostaId(),
									outroContabil.getFileEntryId(), DemonstracaoDocumentosEnum.OUTROS_CONTABEIS.getDemonstracaoDocumentosEnum());

							ArquivosEntity outrosContabeisEntityPersistido = new ArquivosEntity();
							outrosContabeisPersistido.setFileEntryId(outrosContabeisPersistido.getFileEntryId());
							outrosContabeisList.add(outrosContabeisEntityPersistido);
						}
					}
					demonstracoesContabeisEntityPersistidas.setOutrosContabeis(outrosContabeisList.toArray(new ArquivosEntity[0]));
				}
				propostaEntityPersistido.setDemonstracoesContabeisEntities(demonstracoesContabeisEntityPersistidas);
			}

			propostaEntityPersistido.setRelacaoCredoresEntities(relacaoCredoresEntityList.toArray(new RelacaoCredoresEntity[0]));
			propostaEntityPersistido.setAcoesJudiciaisEntities(acoesJudiciaisEntityList.toArray(new AcoesJudiciaisEntity[0]));
			return propostaEntityPersistido;
		} catch (Exception e) {
			_log.error("Erro ao persistir proposta: " + e.getMessage(), e);
			throw new ClientErrorException(e.getMessage(), javax.ws.rs.core.Response.Status.BAD_REQUEST);
		}
	}

	private String getUserName(long userId) {
        User user;
        try {
            user = _userLocalService.getUser(userId);
        } catch (PortalException e) {
            return "";
        }
        return user.getFullName();
	}

	private static AdvogadoEntity setAdvogadoEntity(Advogado advogadoPersistido, QualificacaoCompletaEntity qualificacaoAdvogadoPersistidaEntity,
													ArquivosEntity carteirinhaOAB) {
		AdvogadoEntity advogadoPersistidoEntity = new AdvogadoEntity();
		advogadoPersistidoEntity.setAdvogadoId(advogadoPersistido.getAdvogadoId());
		advogadoPersistidoEntity.setQualificacao(qualificacaoAdvogadoPersistidaEntity);
		advogadoPersistidoEntity.setNumeroOab(advogadoPersistido.getNumeroOab());
		advogadoPersistidoEntity.setSeccional(advogadoPersistido.getSeccional());
		advogadoPersistidoEntity.setCarteirinhaOAB(carteirinhaOAB);
		return advogadoPersistidoEntity;
	}

	private static AdministradorJudicialEntity setAdministradorJudicial(QualificacaoCompletaEntity qualificacaoJudicialEntityPersistida,
																		AdministradorJudicial administradorJudicialPersistido) {
		AdministradorJudicialEntity administradorJudicialPersistidoEntity = new AdministradorJudicialEntity();
		administradorJudicialPersistidoEntity.setQualificacao(qualificacaoJudicialEntityPersistida);
		administradorJudicialPersistidoEntity.setRegimeFalencia(administradorJudicialPersistido.getRegimeFalencia());
		administradorJudicialPersistidoEntity.setRecuperacao(administradorJudicialPersistido.getRecuperacao());
		administradorJudicialPersistidoEntity.setNumeroProcesso(administradorJudicialPersistido.getNumeroProcesso());
		//administradorJudicialPersistidoEntity.setAnexoRecuperacao(administradorJudicialPersistido.getAnexoRecuperacao());
		return administradorJudicialPersistidoEntity;
	}

	private static EnderecoEntity setEnderecoEntity(Endereco enderecoPersistido) {
		EnderecoEntity enderecoEntityPersisted = new EnderecoEntity();
		enderecoEntityPersisted.setCep(enderecoPersistido.getCep());
		enderecoEntityPersisted.setEndereco(enderecoPersistido.getEndereco());
		enderecoEntityPersisted.setNumero(enderecoPersistido.getNumero());
		enderecoEntityPersisted.setEstado(enderecoPersistido.getEstado());
		enderecoEntityPersisted.setMunicipio(enderecoPersistido.getMunicipio());
		enderecoEntityPersisted.setBairro(enderecoPersistido.getBairro());
		enderecoEntityPersisted.setComplemento(enderecoPersistido.getComplemento());
		return enderecoEntityPersisted;
	}

	private static QualificacaoCompletaEntity setQualificacaoCompletaEntity(EnderecoEntity enderecoEntity, QualificacaoCompleta qualificacaoCompleta) {
		QualificacaoCompletaEntity qualificacaoCompletaEntityPersisted = new QualificacaoCompletaEntity();
		qualificacaoCompletaEntityPersisted.setQualificacaoId(qualificacaoCompleta.getQualificacaoId());
		qualificacaoCompletaEntityPersisted.setTipoPessoa(qualificacaoCompleta.getTipoPessoa());
		qualificacaoCompletaEntityPersisted.setNomeRazaoSocial(qualificacaoCompleta.getNomeRazaoSocial());
		qualificacaoCompletaEntityPersisted.setNomeFantasia(qualificacaoCompleta.getNomeFantasia());
		qualificacaoCompletaEntityPersisted.setRepresentanteLegal(qualificacaoCompleta.getRepresentanteLegal());
		qualificacaoCompletaEntityPersisted.setCpfCnpj(qualificacaoCompleta.getCpfCnpj());
		qualificacaoCompletaEntityPersisted.setNumeroCfdf(qualificacaoCompleta.getNumeroCfdf());
		qualificacaoCompletaEntityPersisted.setEmail(qualificacaoCompleta.getEmail());
		qualificacaoCompletaEntityPersisted.setTelefone(qualificacaoCompleta.getTelefone());
		qualificacaoCompletaEntityPersisted.setWhatsapp(qualificacaoCompleta.getWhatsapp());
		qualificacaoCompletaEntityPersisted.setEnderecoPostal(enderecoEntity);
		return qualificacaoCompletaEntityPersisted;
	}

	@Reference
	private PropostaService _propostaService;

	@Reference
	private QualificacaoCompletaService _qualificacoCompletaService;

	@Reference
	private EnderecoService _enderecoService;


	@Reference
	private AdministradorJudicialService _administradorJudicialService;

	@Reference
	private AdvogadoService _advogadoService;

	@Reference
	private GarantiaService _garantiaService;

	@Reference
	private DadosRegistroService _dadosRegistroService;

	@Reference
	private AcaoJudicialService _acaoJudicialService;

	@Reference
	private BensDireitosRequerenteService _bensDireitosRequerenteService;

	@Reference
	private BensDireitosLaudoService _bensDireitosLaudoService;

	@Reference
	private RelacaoCredorService _relacaoCredorService;

	@Reference
	private FundamentacaoPedidoService _fundamentacaoPedidoService;

	@Reference
	private DocumentoComprobatorioService _documentoComprobatorioService;

	@Reference
	private IdentificacaoDebitosService _identificacaoDebitosService;

	@Reference
	private DemonstracaoContabilService _demonstracaoContabilService;

	@Reference
	private QualificacaoCompletaLocalService _qualificacaoCompletaLocalService;

	@Reference
	private EditalLocalService _editalLocalService;

	@Reference
	private EnderecoLocalService _enderecoLocalService;

	@Reference
	private AdministradorJudicialLocalService _administradorJudicialLocalService;

	@Reference
	private AdvogadoLocalService _advogadoLocalService;

	@Override
	public EntityModel getEntityModel(MultivaluedMap<?, ?> multivaluedMap) {
		return new PropostaEntityModel();
	}

	@Reference
	private DeclaracaoService _declaracaoService;

	@Reference
	private AnexosOutrosService _anexoOutrosService;

	@Reference
	private DemaisPartesService _demaisPartesService;

	@Reference
	private UserLocalService _userLocalService;

	@Reference
	private GarantiaPropostaService _garantiaPropostaService;

	@Reference
	private FundamentacaoPedidoLocalService _fundamentacaoPedidoLocalSerivce;

	@Reference
	private DocumentoComprobatorioLocalService _documentoComprobatorioLocalService;

	@Reference
	private IdentificacaoDebitosLocalService _identificacaoDebitosLocalService;

	@Reference
	private DeclaracaoLocalService _declaracaoLocalService;

	@Reference
	private GarantiaLocalService _garantiaLocalSerivce;

	@Reference
	private DadosRegistroLocalService _dadosRegitroLocalService;

	@Reference
	private AnexosOutrosLocalService _anexosOutrosLocalService;

	@Reference
	private AcaoJudicialLocalService _acaoJudicionalLocalService;

	@Reference
	private DemonstracaoContabilLocalService _demonstracaoContabilLocalService;

	@Reference
	private RelacaoCredorLocalService _relacaoCredorLocalService;

	@Reference
	private BensDireitosLaudoLocalService _bensDireitoLaudoLocalService;

	@Reference
	private BensDireitosRequerenteLocalService _bensDireitosRequerenteLocalService;

	@Reference
	private DemaisPartesLocalService _demaisPartesLocalService;

	@Reference
	private DLFileEntryLocalService _dlFileEntryLocalService;
	@Reference
	private DLAppService _dlAppService;

	@Reference
	private GovBrAuthContext _govBrAuthContext;

	@Reference
	private PropostaModelResourcePermission _propostaResourcePermission;


	private static final Log _log = LogFactoryUtil.getLog(PropostaEntityResourceImpl.class);

}

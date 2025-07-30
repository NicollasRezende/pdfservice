/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package br.com.seatecnologia.gdf.negocia.service.impl;

import br.com.seatecnologia.gdf.negocia.configuration.ZipConfiguration;
import br.com.seatecnologia.gdf.negocia.enums.DemonstracaoDocumentosEnum;
import br.com.seatecnologia.gdf.negocia.enums.StatusPropostaEnum;
import br.com.seatecnologia.gdf.negocia.exception.BusinessLogicValidationException;
import br.com.seatecnologia.gdf.negocia.exception.NoSuchPropostaException;
import br.com.seatecnologia.gdf.negocia.model.Proposta;
import br.com.seatecnologia.gdf.negocia.model.*;
import br.com.seatecnologia.gdf.negocia.service.*;
import br.com.seatecnologia.gdf.negocia.service.base.PropostaLocalServiceBaseImpl;
import br.com.seatecnologia.gdf.negocia.util.PDFUtil;

import com.liferay.document.library.kernel.model.DLFileEntry;
import com.liferay.document.library.kernel.service.DLFileEntryLocalService;
import com.liferay.document.library.util.DLURLHelperUtil;
import com.liferay.portal.aop.AopService;
import com.liferay.document.library.kernel.service.DLAppLocalServiceUtil;
import com.liferay.portal.configuration.metatype.bnd.util.ConfigurableUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.repository.model.FileEntry;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Modified;
import org.osgi.service.component.annotations.Reference;

import java.util.*;

import static com.liferay.portal.layoutconfiguration.util.RuntimePageUtil.processTemplate;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=br.com.seatecnologia.gdf.negocia.model.Proposta",
	service = AopService.class, configurationPid = "br.com.seatecnologia.gdf.negocia.configuration.ZipConfiguration"
)
public class PropostaLocalServiceImpl extends PropostaLocalServiceBaseImpl {

	private static final Log _log = LogFactoryUtil.getLog(PropostaLocalServiceImpl.class);

	private String formatarProtocolo(String tipoProposta, long classPK) {
		if (classPK == 0) {
			return "";
		}

		String prefix = tipoProposta.equals("individual") ? "PI" : "PA";

		StringBuilder sb = new StringBuilder();
		sb.append(prefix);
		sb.append(Calendar.getInstance().get(Calendar.YEAR));

		int length = String.valueOf(classPK).length();
		if (length < 6) {
            sb.append("0".repeat(6 - length));
		}

		sb.append(classPK);
		return sb.toString();
	}

	@Override
	@Indexable(type = IndexableType.REINDEX)
	public Proposta addProposta(ServiceContext serviceContext, long editalId,
								String tipoProposta, String numeroProtocoloSei,
								long propostaPaiId, long procuracao, String cpfCnpj) throws PortalException, BusinessLogicValidationException {

		checkOpenPropostas(cpfCnpj);

		long propostaId = counterLocalService.increment(Proposta.class.getName());

		Proposta proposta = super.createProposta(propostaId);

		proposta.setCreateDate(new Date());
		proposta.setModifiedDate(new Date());
		proposta.setUserId(serviceContext.getUserId());
		proposta.setGroupId(serviceContext.getScopeGroupId());
		proposta.setCompanyId(serviceContext.getCompanyId());
		proposta.setNumeroProtocoloSei(numeroProtocoloSei);
		proposta.setTipoProposta(tipoProposta);
		proposta.setStatus(StatusPropostaEnum.PENDENTE_SEI.getLabel());
		proposta.setPropostaPaiId(propostaPaiId);
		proposta.setEditalId(editalId);
		proposta.setProcuracao(procuracao);
		proposta.setProtocolo(formatarProtocolo(tipoProposta, propostaId));
		proposta.setDocumentosCompletosURL("");
		proposta.setCpfCnpj(cpfCnpj);

		resourceLocalService.addResources(serviceContext.getCompanyId(), serviceContext.getScopeGroupId(), serviceContext.getUserId(),
			Proposta.class.getName(), propostaId, false, true, true);

		return super.addProposta(proposta);
	}

	private void checkOpenPropostas(String cpfCnpj) throws BusinessLogicValidationException {
		List<Proposta> proposta = propostaPersistence.findByCpfCnpj(cpfCnpj);
		boolean hasOpenProposta = proposta.stream()
				.anyMatch(p -> !p.getStatus().equals(StatusPropostaEnum.FINALIZADA.getLabel()) &&
					 !p.getStatus().equals(StatusPropostaEnum.INDEFERIDA.getLabel()));
		if (hasOpenProposta) {
			throw new BusinessLogicValidationException("Já existe uma proposta aberta para o CPF/CNPJ: " + cpfCnpj);
		}
	}

	@Override
	@Indexable(type = IndexableType.REINDEX)
	public Proposta updateProposta(long propostaId, ServiceContext serviceContext,
								   long dadosContribuinteId, long administradorJudicialId,
								   long advogadoId, String fundamentacaoPedido,
								   boolean cumpreCompromissos,
								   boolean naoAlienacaoBensSemComunicacao,
								   boolean reconheceGrupoOuSucessao,
								   String status, String numeroProtocoloSei, String documentosCompletosURL,
								   long propostaPaiId) throws PortalException {

		Proposta proposta = getProposta(propostaId);

		proposta.setModifiedDate(new Date());
		proposta.setUserId(serviceContext.getUserId());
		proposta.setGroupId(serviceContext.getScopeGroupId());
		proposta.setCompanyId(serviceContext.getCompanyId());
		proposta.setAdministradorJudicialId(administradorJudicialId);
		proposta.setAdvogadoId(advogadoId);
		proposta.setStatus(status);
		proposta.setNumeroProtocoloSei(numeroProtocoloSei);
		proposta.setPropostaPaiId(propostaPaiId);
		proposta.setDocumentosCompletosURL(documentosCompletosURL);

		// TODO: Verificar se é necessário atualizar as permissões, caso seja, verificar como setar o ModelPermissions corretamente.
		resourceLocalService.updateResources(
			serviceContext.getCompanyId(),
			serviceContext.getScopeGroupId(),
			Proposta.class.getName(), propostaId,
			serviceContext.getModelPermissions()
		);

		return propostaPersistence.update(proposta);
	}

	@Override
	public List<Proposta> findByCpfCnpj(String cpfCnpj) {
		return propostaPersistence.findByCpfCnpj(cpfCnpj);
    }

	public Proposta createPropostaCompleteZip(long propostaId, ServiceContext serviceContext)
			throws Exception {

		User user = userLocalService.getUser(serviceContext.getUserId());

		Proposta proposta = getProposta(propostaId);
		QualificacaoCompleta qualificacaoCompleta = _qualificacaoCompletaLocalService.getQualificacaoCompleta(proposta.getQualificacaoId());
		Endereco enderecoQualificacao = _enderecoLocalService.getEndereco(qualificacaoCompleta.getEnderecoPostalId());

		Advogado advogado = _advogadoLocalService.getAdvogado(proposta.getAdvogadoId());
		QualificacaoCompleta qualificacaoCompletaAdvogado = _qualificacaoCompletaLocalService.getQualificacaoCompleta(advogado.getQualificacaoId());
		Endereco enderecoAdvogado = _enderecoLocalService.getEndereco(qualificacaoCompletaAdvogado.getEnderecoPostalId());

		List<CredorProposta> credores = _credorPropostaLocalService.getCredoresPropostaByPropostaId(proposta.getPropostaId());
		List<Garantia> garantias = _garantiaLocalService.getGarantiasByPropostaId(proposta.getPropostaId());

		Map<Garantia, Map<QualificacaoCompleta, Endereco>> garantiasMap = new HashMap<>();

		for (Garantia garantia : garantias) {

			Map<QualificacaoCompleta, Endereco> proprietarioMap = new HashMap<>();

			if (garantia.getProprietarioQualificacao() > 0) {
				QualificacaoCompleta proprietarioQualificacao = _qualificacaoCompletaLocalService.getQualificacaoCompleta(garantia.getProprietarioQualificacao());
				Endereco enderecoProprietario = _enderecoLocalService.getEndereco(proprietarioQualificacao.getEnderecoPostalId());
				proprietarioMap.put(proprietarioQualificacao, enderecoProprietario);
			}
			garantiasMap.put(garantia, proprietarioMap);
		}

		FundamentacaoPedido fundamentacaoPedido = _fundamentacaoPedidoLocalSerivce.getFundamentacoesPedidoByPropostaId(proposta.getPropostaId()).getFirst();
		List<DemaisPartes> demaisPartes = _demaisPartesLocalService.getDemaisPartesByPropostaId(proposta.getPropostaId());

		AdministradorJudicial administradorJudicial = _administradorJudicialLocalService.getAdministradorJudicial(proposta.getAdministradorJudicialId());
		QualificacaoCompleta qualificacaoCompletaAdministrador = _qualificacaoCompletaLocalService.getQualificacaoCompleta(administradorJudicial.getQualificacaoId());
		Endereco enderecoAdministrador = _enderecoLocalService.getEndereco(qualificacaoCompletaAdministrador.getEnderecoPostalId());

		List<AcaoJudicial> acoesJudiciais = _acaoJudicialLocalService.findByPropostaId(proposta.getPropostaId());
		List<RelacaoCredor> relacaoCredores = _relacaoCredorLocalService.getRelacoesCredorByPropostaId(proposta.getPropostaId());
		List<BensDireitosRequerente> bensRequerente = _bensDireitosRequerenteLocalService.getBensDireitosRequerentesByPropostaId(proposta.getPropostaId());
		Declaracao declaracao = _declaracaoLocalService.getDeclaracaoByPropostaId(proposta.getPropostaId());
		List<IdentificacaoDebitos> identificacaoDebitos = _identificacaoDebitosLocalService.getIdentificacaoDebitosByFundamentacaoId(fundamentacaoPedido.getFundamentacaoId());
		List<DemonstracaoContabil> demonstracaoContabils = _demonstracaoContabilLocalService.getDemonstracoesContabilByPropostaId(propostaId);
		List<DocumentoComprobatorio> documentoComprobatorios = _documentoComprobatorioLocalService.getDocumentosComprobatoriosByFundamentacaoId(fundamentacaoPedido.getFundamentacaoId());
		List<String> documentosComprobatoriosNames = getDocumentosComprobatoriosNames(documentoComprobatorios);

		Map<String, List<String>> demonstracoesContabeisMap = new HashMap<>();

		for (DemonstracaoContabil demonstracao : demonstracaoContabils) {
			if (demonstracao.getFileEntryId() > 0) {
				try {
					DLFileEntry fileEntry = _dlFileEntryLocalService.getFileEntry(demonstracao.getFileEntryId());

					String tipoDocumento = DemonstracaoDocumentosEnum.demonstracaoDocumentosEnumToString(demonstracao.getTipoDocumento());

					demonstracoesContabeisMap.computeIfAbsent(tipoDocumento, k -> new ArrayList<>())
							.add(fileEntry.getName());

				} catch (PortalException e) {
					_log.warn("Demonstracao Contabil não encontrada: " + demonstracao.getFileEntryId());
				}
			}
		}

		String htmlContent = PDFUtil.makePropostaFormHtml(
				proposta,
				qualificacaoCompleta,
				enderecoQualificacao,
				advogado,
				credores,
				garantias,
				fundamentacaoPedido,
				demaisPartes,
				administradorJudicial,
				acoesJudiciais,
				relacaoCredores,
				bensRequerente,
				declaracao,
				identificacaoDebitos,
				demonstracoesContabeisMap,
				documentosComprobatoriosNames,
				Arrays.asList(enderecoQualificacao, enderecoAdvogado, enderecoAdministrador),
				garantiasMap,
				user);

		List<FileEntry> anexos = getPropostaAttachments(proposta);

		byte[] pdfBytes = PDFUtil.transformHtmlInPDF(htmlContent, _zipConfiguration.pdfServiceUrl());

		String pdfFileName = "proposta_" + proposta.getProtocolo() + ".pdf";
		byte[] zipBytes = PDFUtil.createZipWithAttachments(pdfBytes, pdfFileName, anexos);
		String zipFileName = "Proposta_" + proposta.getProtocolo() + "_" + proposta.getPropostaId() + ".zip";

		FileEntry zipEntry = PDFUtil.createZipToDL(proposta.getPropostaId(), zipBytes, zipFileName,
				serviceContext.getUserId(), user.getGroupId(), 0, serviceContext);

		ThemeDisplay themeDisplay = serviceContext.getThemeDisplay();


		String zipUrl = DLURLHelperUtil.getDownloadURL(zipEntry, zipEntry.getFileVersion(), themeDisplay, String.valueOf(serviceContext.getThemeDisplay()));
		proposta.setStatus(StatusPropostaEnum.EM_TRAMITE.getLabel());
		proposta.setDocumentosCompletosURL(zipUrl);
		return super.updateProposta(proposta);
	}

	private List<String> getDocumentosComprobatoriosNames(List<DocumentoComprobatorio> documentosComprobatorios) {
		List<String> documentosNames = new ArrayList<>();
		for (DocumentoComprobatorio documento : documentosComprobatorios) {
			if (documento.getFileEntryId() > 0) {
				try {
					DLFileEntry fileEntry = _dlFileEntryLocalService.getFileEntry(documento.getFileEntryId());
					documentosNames.add(fileEntry.getName());
				} catch (PortalException e) {
					_log.warn("Documento comprobatório não encontrado: " + documento.getFileEntryId());
				}
			}
		}
		return documentosNames;
	}

	/*
	* Anexo da recuperação extrajudicial lista
	* Anexe a carteirinha da OAB unico
	* Anexe a procuração unico
	* Anexe a documentação comprobatória lista
	* Outros (proprietario do bem) lista
	* Anexe a declaração unico
	* Balanço patrimonial lista
	* Demonstrações de resultados lista
	* Relatórios gerenciais de fluxo de caixa e projeções lista
	* Descrição das sociedades do grupo (de fato ou de direito) lista
	* O utros documentos contábeis pertinentes lista
	* */

	private List<FileEntry> getPropostaAttachments(Proposta proposta) {
		List<FileEntry> attachments = new ArrayList<>();

		try {
			if (proposta != null) {
				if (proposta.getProcuracao() > 0) {
					try {
						FileEntry fileEntry = DLAppLocalServiceUtil.getFileEntry(proposta.getProcuracao());
						if (!attachments.contains(fileEntry)) {
							attachments.add(fileEntry);
						}
					} catch (PortalException e) {
						_log.warn("Procuração não encontrada: " + proposta.getProcuracao());
					}
				}

				if (proposta.getAdvogadoId() > 0) {
					try {
						Advogado advogado = _advogadoLocalService.getAdvogado(proposta.getAdvogadoId());
						if (advogado.getCarteirinhaOAB() > 0) {
							try {
								FileEntry fileEntry = DLAppLocalServiceUtil.getFileEntry(advogado.getCarteirinhaOAB());
								if (!attachments.contains(fileEntry)) {
									attachments.add(fileEntry);
								}
							} catch (PortalException e) {
								_log.warn("Carteirinha OAB não encontrada: " + advogado.getCarteirinhaOAB());
							}
						}
					} catch (PortalException e) {
						_log.warn("Advogado não encontrado: " + proposta.getAdvogadoId());
					}
				}

				if (proposta.getAdministradorJudicialId() > 0) {
					try {
						AdministradorJudicial administradorJudicial = _administradorJudicialLocalService.getAdministradorJudicial(proposta.getAdministradorJudicialId());
						if (administradorJudicial.getAnexoRecuperacao() > 0) {
							try {
								FileEntry fileEntry = DLAppLocalServiceUtil.getFileEntry(administradorJudicial.getAnexoRecuperacao());
								if (!attachments.contains(fileEntry)) {
									attachments.add(fileEntry);
								}
							} catch (PortalException e) {
								_log.warn("Anexo de recuperação não encontrado: " + administradorJudicial.getAnexoRecuperacao());
							}
						}
					} catch (PortalException e) {
						_log.warn("Administrador judicial não encontrado: " + proposta.getAdministradorJudicialId());
					}
				}

				List<Garantia> garantias = _garantiaLocalService.getGarantiasByPropostaId(proposta.getPropostaId());
				for (Garantia garantia : garantias) {
					DadosRegistro dadoRegistro = _dadosRegistroLocalService.getDadosRegistroByGarantiaId(garantia.getGarantiaId());
					List<AnexosOutros> anexosOutros = _anexosOutrosLocalService.getAnexosOutrosByDadosRegistroId(dadoRegistro.getDadosRegistroId());
					for (AnexosOutros anexoOutro : anexosOutros) {
						if (anexoOutro.getOutrosAnexo() > 0) {
							try {
								FileEntry fileEntry = DLAppLocalServiceUtil.getFileEntry(anexoOutro.getOutrosAnexo());
								if (!attachments.contains(fileEntry)) {
									attachments.add(fileEntry);
								}
							} catch (PortalException e) {
								_log.warn("Anexo outro não encontrado: " + anexoOutro.getOutrosAnexo());
							}
						}
					}
				}

				for (Garantia garantia : garantias) {
					if (garantia.getDeclaracao() > 0) {
						try {
							FileEntry fileEntry = DLAppLocalServiceUtil.getFileEntry(garantia.getDeclaracao());
							if (!attachments.contains(fileEntry)) {
								attachments.add(fileEntry);
							}
						} catch (PortalException e) {
							_log.warn("Declaração de garantia não encontrada: " + garantia.getDeclaracao());
						}
					}
				}

				if (proposta.getFundamentacaoPedidoId() > 0) {
					FundamentacaoPedido fundamentacaoPedido = _fundamentacaoPedidoLocalSerivce.getFundamentacaoPedido(proposta.getFundamentacaoPedidoId());
					List<DocumentoComprobatorio> documentos = _documentoComprobatorioLocalService.getDocumentosComprobatoriosByFundamentacaoId(fundamentacaoPedido.getFundamentacaoId());
					for (DocumentoComprobatorio doc : documentos) {
						if (doc.getFileEntryId() > 0) {
							try {
								FileEntry fileEntry = DLAppLocalServiceUtil.getFileEntry(doc.getFileEntryId());
								if (!attachments.contains(fileEntry)) {
									attachments.add(fileEntry);
								}
							} catch (PortalException e) {
								_log.warn("Documento comprobatório não encontrado: " + doc.getFileEntryId());
							}
						}
					}
				}

				List<DemonstracaoContabil> demonstracoes = _demonstracaoContabilLocalService.getDemonstracoesContabilByPropostaId(proposta.getPropostaId());
				for (DemonstracaoContabil demonstracao : demonstracoes) {
					if (demonstracao.getFileEntryId() > 0) {
						try {
							FileEntry fileEntry = DLAppLocalServiceUtil.getFileEntry(demonstracao.getFileEntryId());
							if (!attachments.contains(fileEntry)) {
								attachments.add(fileEntry);
							}
						} catch (PortalException e) {
							_log.warn("Demonstracao Contabil não encontrada: " + demonstracao.getFileEntryId());
						}
					}
				}

				List<ComprovanteHonorario> comprovantesHonorarios = _comprovanteHonorarioLocalService.getComprovanteHonorarioByPropostaId(proposta.getPropostaId());
				for (ComprovanteHonorario comprovanteHonorario : comprovantesHonorarios) {
					if (comprovanteHonorario.getFileEntryId() > 0) {
						try {
							FileEntry fileEntry = DLAppLocalServiceUtil.getFileEntry(comprovanteHonorario.getFileEntryId());
							if (!attachments.contains(fileEntry)) {
								attachments.add(fileEntry);
							}
						} catch (PortalException e) {
							_log.warn("Comprovante Honorário não encontrado: " + comprovanteHonorario.getFileEntryId());
						}
					}
				}
			}

		} catch (Exception e) {
			_log.error("Erro ao buscar anexos da proposta: " + proposta.getPropostaId(), e);
		}

		return attachments;
	}

	@Reference
	private EditalLocalService _editalLocalService;

	@Reference
	private QualificacaoCompletaLocalService _qualificacaoCompletaLocalService;

	@Reference
	private AdvogadoLocalService _advogadoLocalService;

	@Reference
	private FundamentacaoPedidoLocalService _fundamentacaoPedidoLocalService;

	@Reference
	private CredorPropostaLocalService _credorPropostaLocalService;

	@Reference
	private GarantiaPropostaLocalService _garantiaPropostaLocalService;

	@Reference
	private DocumentoComprobatorioLocalService _documentoComprobatorioLocalService;

	@Reference
	private FundamentacaoPedidoLocalService _fundamentacaoPedidoLocalSerivce;

	@Reference
	private DemaisPartesLocalService _demaisPartesLocalService;

	@Reference
	private AdministradorJudicialLocalService _administradorJudicialLocalService;

	@Reference
	private AcaoJudicialLocalService _acaoJudicialLocalService;

	@Reference
	private RelacaoCredorLocalService _relacaoCredorLocalService;

	@Reference
	private BensDireitosRequerenteLocalService _bensDireitosRequerenteLocalService;

	@Reference
	private DeclaracaoLocalService _declaracaoLocalService;

	@Reference
	private IdentificacaoDebitosLocalService _identificacaoDebitosLocalService;

	@Reference
	private DemonstracaoContabilLocalService _demonstracaoContabilLocalService;

	@Reference
	private EnderecoLocalService _enderecoLocalService;

	@Reference
	private GarantiaLocalService _garantiaLocalService;

	@Reference
	private DLFileEntryLocalService _dlFileEntryLocalService;

	@Reference
	private ComprovanteHonorarioLocalService _comprovanteHonorarioLocalService;

	@Reference
	private AnexosOutrosLocalService _anexosOutrosLocalService;

	@Reference
	private DadosRegistroLocalService _dadosRegistroLocalService;


	@Activate
	@Modified
	protected void activate(Map<String, Object> properties) {
		try {
			_zipConfiguration = ConfigurableUtil.createConfigurable(
					ZipConfiguration.class, properties);		}
		catch (Exception e) {
			_log.error(e.getMessage());
		}


	}

	private ZipConfiguration _zipConfiguration;


}
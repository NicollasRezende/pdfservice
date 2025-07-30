create table GDF_AcaoJudicial (
	uuid_ VARCHAR(75) null,
	acaoId LONG not null primary key,
	orgaoTribunal VARCHAR(255) null,
	numeroProcesso VARCHAR(255) null,
	unidadeVara VARCHAR(255) null,
	parteAutora VARCHAR(255) null,
	parteRe VARCHAR(255) null,
	observacoes VARCHAR(1000) null,
	propostaId LONG
);

create table GDF_AcaoJudicialProposta (
	uuid_ VARCHAR(75) null,
	acaoPropostaId LONG not null primary key,
	propostaId LONG,
	acaoId LONG
);

create table GDF_AdministradorJudicial (
	uuid_ VARCHAR(75) null,
	administradorJudicialId LONG not null primary key,
	qualificacaoId LONG,
	regimeFalencia BOOLEAN,
	recuperacao VARCHAR(255) null,
	numeroProcesso VARCHAR(255) null,
	anexoRecuperacao LONG
);

create table GDF_Advogado (
	uuid_ VARCHAR(75) null,
	advogadoId LONG not null primary key,
	qualificacaoId LONG,
	numeroOab VARCHAR(255) null,
	seccional VARCHAR(255) null,
	carteirinhaOAB LONG
);

create table GDF_AnexosOutros (
	uuid_ VARCHAR(75) null,
	anexosOutrosId LONG not null primary key,
	dadosRegistroId LONG,
	outrosAnexo LONG
);

create table GDF_BemDireitoAdicional (
	uuid_ VARCHAR(75) null,
	bemId LONG not null primary key,
	propostaId LONG,
	descricao VARCHAR(1000) null,
	localizacao VARCHAR(1000) null,
	destinacao VARCHAR(255) null,
	laudoAvaliacao VARCHAR(255) null
);

create table GDF_BensDireitosLaudo (
	uuid_ VARCHAR(75) null,
	bensDireitosLaudoId LONG not null primary key,
	bemId LONG,
	laudoAvaliacao LONG
);

create table GDF_BensDireitosRequerente (
	uuid_ VARCHAR(75) null,
	bemId LONG not null primary key,
	propostaId LONG,
	descricao VARCHAR(1000) null,
	localizacaoDestinacao VARCHAR(1000) null
);

create table GDF_ComprovanteHonorario (
	uuid_ VARCHAR(75) null,
	comprovanteId LONG not null primary key,
	propostaId LONG,
	valorPago DOUBLE,
	dataPagamento DATE null,
	fileEntryId LONG
);

create table GDF_ConcessaoDf (
	uuid_ VARCHAR(75) null,
	concessaoId LONG not null primary key,
	propostaId LONG,
	percentualDescontoJuros DOUBLE,
	percentualDescontoPrincipal DOUBLE,
	observacoes VARCHAR(255) null
);

create table GDF_CreditoTransacionado (
	uuid_ VARCHAR(75) null,
	creditoId LONG not null primary key,
	propostaId LONG,
	numeroInscricao VARCHAR(255) null,
	codigoReceita VARCHAR(255) null,
	dataInscricao DATE null,
	valorAtualizado DOUBLE
);

create table GDF_CredorProposta (
	uuid_ VARCHAR(75) null,
	credorPropostaId LONG not null primary key,
	propostaId LONG,
	credorId LONG
);

create table GDF_DadosContribuinte (
	uuid_ VARCHAR(75) null,
	dadosContribuinteId LONG not null primary key,
	createDate DATE null,
	modifiedDate DATE null,
	userId LONG,
	groupId LONG,
	companyId LONG,
	qualificacaoId LONG,
	propostaId LONG
);

create table GDF_DadosRegistro (
	uuid_ VARCHAR(75) null,
	dadosRegistroId LONG not null primary key,
	garantiaId LONG,
	matriculaImovel VARCHAR(255) null,
	cartorioRegistro VARCHAR(255) null,
	renavam VARCHAR(255) null,
	localizacao VARCHAR(255) null
);

create table GDF_Declaracao (
	uuid_ VARCHAR(75) null,
	declaracaoId LONG not null primary key,
	propostaId LONG,
	cumpreCompromissos BOOLEAN,
	naoAlienacaoBensSemComunicacao BOOLEAN,
	reconheceGrupoOuSucessao BOOLEAN,
	compromissoConfidencialidade BOOLEAN,
	cienciaProcesso BOOLEAN,
	abusoTransacao BOOLEAN,
	impugnacaoRecursos BOOLEAN,
	renunciaRecursos BOOLEAN,
	peticionamentoProcessos BOOLEAN,
	prestacaoInformacoes BOOLEAN,
	omissaoInformacoes BOOLEAN,
	manutencaoGarantias BOOLEAN
);

create table GDF_DemaisPartes (
	uuid_ VARCHAR(75) null,
	demaisPartesId LONG not null primary key,
	qualificacaoId LONG,
	propostaId LONG,
	tipoParte VARCHAR(255) null
);

create table GDF_DemonstracaoContabil (
	uuid_ VARCHAR(75) null,
	demonstracaoId LONG not null primary key,
	propostaId LONG,
	fileEntryId LONG,
	tipoDocumento INTEGER
);

create table GDF_DemonstracaoDocumentos (
	uuid_ VARCHAR(75) null,
	demonstracaoDocumentosId LONG not null primary key,
	demonstracaoId LONG,
	tipoDocumento INTEGER
);

create table GDF_DocumentoComprobatorio (
	uuid_ VARCHAR(75) null,
	documentoId LONG not null primary key,
	fundamentacaoId LONG,
	fileEntryId LONG
);

create table GDF_Edital (
	uuid_ VARCHAR(75) null,
	editalId LONG not null primary key,
	titulo VARCHAR(255) null,
	descricao VARCHAR(255) null,
	arquivo LONG,
	dataInicio DATE null,
	dataFim DATE null
);

create table GDF_Encargo (
	uuid_ VARCHAR(75) null,
	encargoId LONG not null primary key,
	propostaId LONG,
	valorEncargos DOUBLE,
	descricaoEncargos VARCHAR(255) null
);

create table GDF_Endereco (
	uuid_ VARCHAR(75) null,
	enderecoId LONG not null primary key,
	cep VARCHAR(255) null,
	endereco VARCHAR(255) null,
	numero VARCHAR(75) null,
	estado VARCHAR(255) null,
	municipio VARCHAR(255) null,
	bairro VARCHAR(255) null,
	complemento VARCHAR(255) null
);

create table GDF_FundamentacaoPedido (
	uuid_ VARCHAR(75) null,
	fundamentacaoId LONG not null primary key,
	propostaId LONG,
	fundamentacaoPedido TEXT null
);

create table GDF_Garantia (
	uuid_ VARCHAR(75) null,
	garantiaId LONG not null primary key,
	propostaId LONG,
	tipoGarantia VARCHAR(255) null,
	tipoDevedor VARCHAR(255) null,
	outras VARCHAR(255) null,
	descricaoBem VARCHAR(255) null,
	proprietarioQualificacao LONG,
	valorEstimado DOUBLE,
	dadosRegistroId LONG,
	localizacao VARCHAR(1000) null,
	declaracaoAnuencia BOOLEAN,
	declaracao LONG
);

create table GDF_GarantiaProposta (
	uuid_ VARCHAR(75) null,
	garantiaPropostaId LONG not null primary key,
	propostaId LONG,
	garantiaId LONG
);

create table GDF_IdentificacaoDebitos (
	uuid_ VARCHAR(75) null,
	identificacaoDebitosId LONG not null primary key,
	fundamentacaoId LONG,
	natureza VARCHAR(255) null,
	situacao VARCHAR(255) null,
	inscricaoDividaAtiva VARCHAR(255) null,
	garantidoJudicialmente VARCHAR(255) null
);

create table GDF_Parcelamento (
	uuid_ VARCHAR(75) null,
	parcelamentoId LONG not null primary key,
	propostaId LONG,
	numeroParcelas INTEGER,
	valorEntrada DOUBLE,
	dataPrimeiraParcela DATE null,
	valorPrimeiraParcela DOUBLE
);

create table GDF_Procuracao (
	uuid_ VARCHAR(75) null,
	procuracaoId LONG not null primary key,
	propostaId LONG,
	procuracao LONG
);

create table GDF_Proposta (
	uuid_ VARCHAR(75) null,
	propostaId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	tipoProposta VARCHAR(255) null,
	editalId LONG,
	qualificacaoId LONG,
	administradorJudicialId LONG,
	advogadoId LONG,
	fundamentacaoPedidoId LONG,
	procuracao LONG,
	cpfCnpj VARCHAR(255) null,
	status VARCHAR(255) null,
	numeroProtocoloSei VARCHAR(255) null,
	protocolo VARCHAR(255) null,
	documentosCompletosURL VARCHAR(500) null,
	propostaPaiId LONG
);

create table GDF_QualificacaoCompleta (
	uuid_ VARCHAR(75) null,
	qualificacaoId LONG not null primary key,
	tipoPessoa VARCHAR(255) null,
	nomeRazaoSocial VARCHAR(1000) null,
	nomeFantasia VARCHAR(1000) null,
	representanteLegal VARCHAR(1000) null,
	cpfCnpj VARCHAR(255) null,
	domicilioFiscal VARCHAR(255) null,
	numeroCfdf VARCHAR(255) null,
	email VARCHAR(1000) null,
	telefone VARCHAR(255) null,
	whatsapp VARCHAR(255) null,
	enderecoPostalId LONG
);

create table GDF_QualificacaoContribuinte (
	uuid_ VARCHAR(75) null,
	qualificacaoContribuinteId LONG not null primary key,
	dadosContribuinteId LONG,
	qualificacaoId LONG,
	createDate DATE null,
	modifiedDate DATE null,
	userId LONG,
	groupId LONG,
	companyId LONG,
	tipoQualificacao VARCHAR(75) null
);

create table GDF_RelacaoCredor (
	uuid_ VARCHAR(75) null,
	credorId LONG not null primary key,
	propostaId LONG,
	nomeCredor VARCHAR(1000) null,
	naturezaCredito VARCHAR(255) null,
	classificacaoCredito VARCHAR(255) null,
	valorAtualizado DOUBLE,
	referenciaContabil VARCHAR(1000) null
);

create table GDF_TermoAssinado (
	uuid_ VARCHAR(75) null,
	termoId LONG not null primary key,
	propostaId LONG,
	urlTermo VARCHAR(255) null,
	arquivoPdf VARCHAR(500) null,
	parte VARCHAR(255) null
);
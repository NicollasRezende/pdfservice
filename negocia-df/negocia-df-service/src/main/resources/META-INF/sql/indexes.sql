create index IX_AE9F650 on GDF_AcaoJudicial (propostaId);
create index IX_816CD767 on GDF_AcaoJudicial (uuid_[$COLUMN_LENGTH:75$]);

create index IX_BD0D8DA4 on GDF_AcaoJudicialProposta (propostaId);
create index IX_89D4FB93 on GDF_AcaoJudicialProposta (uuid_[$COLUMN_LENGTH:75$]);

create index IX_331DE106 on GDF_AdministradorJudicial (uuid_[$COLUMN_LENGTH:75$]);

create index IX_DB54BD77 on GDF_Advogado (uuid_[$COLUMN_LENGTH:75$]);

create index IX_7C249961 on GDF_AnexosOutros (dadosRegistroId);
create index IX_A070BB6C on GDF_AnexosOutros (uuid_[$COLUMN_LENGTH:75$]);

create index IX_6CB355C7 on GDF_BemDireitoAdicional (propostaId);
create index IX_7C256990 on GDF_BemDireitoAdicional (uuid_[$COLUMN_LENGTH:75$]);

create index IX_D3FC6588 on GDF_BensDireitosLaudo (uuid_[$COLUMN_LENGTH:75$]);

create index IX_9CDC31AC on GDF_BensDireitosRequerente (propostaId);
create index IX_A0E1F28B on GDF_BensDireitosRequerente (uuid_[$COLUMN_LENGTH:75$]);

create index IX_FA8B42D8 on GDF_ComprovanteHonorario (propostaId);
create index IX_90BFD5DF on GDF_ComprovanteHonorario (uuid_[$COLUMN_LENGTH:75$]);

create index IX_B28BC027 on GDF_ConcessaoDf (propostaId);
create index IX_AC8C0330 on GDF_ConcessaoDf (uuid_[$COLUMN_LENGTH:75$]);

create index IX_871C49F7 on GDF_CreditoTransacionado (propostaId);
create index IX_3A09760 on GDF_CreditoTransacionado (uuid_[$COLUMN_LENGTH:75$]);

create index IX_68B09BC4 on GDF_CredorProposta (propostaId);
create index IX_9DC99973 on GDF_CredorProposta (uuid_[$COLUMN_LENGTH:75$]);

create unique index IX_9E2AC443 on GDF_DadosContribuinte (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_FA02A9C4 on GDF_DadosRegistro (garantiaId);
create index IX_C1DDD206 on GDF_DadosRegistro (uuid_[$COLUMN_LENGTH:75$]);

create index IX_23ABF8EA on GDF_Declaracao (propostaId);
create index IX_4F861C8D on GDF_Declaracao (uuid_[$COLUMN_LENGTH:75$]);

create index IX_7C5AE47F on GDF_DemaisPartes (propostaId);
create index IX_97BD87D8 on GDF_DemaisPartes (uuid_[$COLUMN_LENGTH:75$]);

create index IX_CF0B508B on GDF_DemonstracaoContabil (propostaId);
create index IX_5624C44C on GDF_DemonstracaoContabil (uuid_[$COLUMN_LENGTH:75$]);

create index IX_E3B80356 on GDF_DemonstracaoDocumentos (demonstracaoId);
create index IX_FD0CA063 on GDF_DemonstracaoDocumentos (uuid_[$COLUMN_LENGTH:75$]);

create index IX_76F31EFB on GDF_DocumentoComprobatorio (fundamentacaoId);
create index IX_FDCE151A on GDF_DocumentoComprobatorio (uuid_[$COLUMN_LENGTH:75$]);

create index IX_FFCF25C3 on GDF_Edital (uuid_[$COLUMN_LENGTH:75$]);

create index IX_F26C0586 on GDF_Encargo (propostaId);
create index IX_AE9F9E71 on GDF_Encargo (uuid_[$COLUMN_LENGTH:75$]);

create index IX_931AB1AF on GDF_Endereco (uuid_[$COLUMN_LENGTH:75$]);

create index IX_2BC94D22 on GDF_FundamentacaoPedido (propostaId);
create index IX_7E830555 on GDF_FundamentacaoPedido (uuid_[$COLUMN_LENGTH:75$]);

create index IX_5D405626 on GDF_Garantia (propostaId);
create index IX_FD4369D1 on GDF_Garantia (uuid_[$COLUMN_LENGTH:75$]);

create index IX_3B4F83FD on GDF_GarantiaProposta (uuid_[$COLUMN_LENGTH:75$]);

create index IX_FF71F580 on GDF_IdentificacaoDebitos (fundamentacaoId);
create index IX_1DC95DDF on GDF_IdentificacaoDebitos (uuid_[$COLUMN_LENGTH:75$]);

create index IX_86656A98 on GDF_Parcelamento (propostaId);
create index IX_DB9BD61F on GDF_Parcelamento (uuid_[$COLUMN_LENGTH:75$]);

create index IX_ADCC5102 on GDF_Procuracao (propostaId);
create index IX_CDE51575 on GDF_Procuracao (uuid_[$COLUMN_LENGTH:75$]);

create index IX_B5A70B7E on GDF_Proposta (cpfCnpj[$COLUMN_LENGTH:255$]);
create unique index IX_1A9AD886 on GDF_Proposta (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_AFFD43CD on GDF_QualificacaoCompleta (uuid_[$COLUMN_LENGTH:75$]);

create unique index IX_6D2D3A5A on GDF_QualificacaoContribuinte (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_C1CE3A0D on GDF_RelacaoCredor (propostaId);
create index IX_73B2718A on GDF_RelacaoCredor (uuid_[$COLUMN_LENGTH:75$]);

create index IX_654BE0FC on GDF_TermoAssinado (propostaId);
create index IX_2B95F13B on GDF_TermoAssinado (uuid_[$COLUMN_LENGTH:75$]);
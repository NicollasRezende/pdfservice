# Integração SEI - Módulo Liferay

Este módulo realiza a integração entre o SEI (Sistema Eletrônico de Informações - 4.1.5) e o Liferay GA-129, 
utilizando a tecnologia SOAP via Apache Axis 1.4 (modificado). 

A implementação foi feita manualmente para garantir compatibilidade com o SEIport, respeitando as particularidades da 
estrutura e serialização do serviço.

---

## 📚 Sumário

- [📄 Documentação Oficial](#documentacao-oficial)
- [🧱 Estrutura do Módulo](#estrutura-do-modulo)
- [📦 Instalação](#instalacao)
- [⚙️ Configuração](#configuracao)
- [🚀 Como Usar os Serviços Existentes](#como-usar-os-servicos-existentes)
- [🛠️ Como Implementar um Novo Serviço](#como-implementar-um-novo-servico)
- [🔧 Como o Stub Axis foi Adaptado](#como-o-stub-axis-foi-adaptado)
- [🧠 Considerações Técnicas e Padrões](#consideracoes-tecnicas-e-padroes)

---

## 📄 Documentação Oficial

A documentação oficial dos serviços do SEI está disponível em:

👉 [SEI WebServices v4.1 (PDF)](SEI-WebServices-v4.1.pdf)

## 🧱 Estrutura do Módulo

O projeto é dividido em dois módulos principais:

### `sei-integration-api`

Contém a definição da API pública da integração SEI:

* `api.service`: Interfaces dos serviços expostos.
* `api.service.enums`: Enums como `TipoDocumento`, `NivelAcesso`.
* `api.service.factory`: Fábricas de criação dos serviços.
* `api.service.model.builder`: Builders que encapsulam validações obrigatórias e facilitam a construção de objetos `Documento`, `Procedimento`, etc.
* `api.service.ws`: Classes geradas ou adaptadas manualmente com base no WSDL do SEI.

### `sei-integration-service`

Implementa a lógica dos serviços e comandos:

* `impl`: Implementações das interfaces dos serviços (`DocumentoServiceImpl`, `ProcedimentoServiceImpl`, etc.).
* `factory`: Inicialização do stub SOAP com as configurações.
* `internal.command`: Comandos Gogo Shell para testes manuais no terminal do Liferay.
* `internal.configuration`: Configurações via System Settings (incluindo endpoint, sigla, chave do serviço, etc.).
* `internal.constants`: Constantes reutilizadas nos serviços.
* `validator`: Validações baseadas nas configurações (ex: tamanho e quantidade de documentos).

---

## 📦 Instalação

1. Instale os módulos `sei-integration-api` e `sei-integration-service` no Liferay.

2. Acesse o painel de controle do Liferay: **Control Panel → System Settings → Sei WSConfiguration e SEI WS - Configuração de Documentos **.

3. Configure os parâmetros obrigatórios:
    - Sigla do Sistema (Ex: NG)
    - Identificação do Serviço (Ex: b236d07389bd3bdd046a9ff31aaf662b721...)
    - ID da Unidade (Ex: 110000000)
    - Endpoint do Webservice (Ex: https://laboratorio-sei4.sei.df.gov.br/sei/ws/SeiWS.php)
    - Tamanho Máximo de Arquivo (em MB)
    - Número Máximo de Documentos

---

## ⚙️ Configuração

Exemplo de configurações disponíveis:

| Parâmetro                        | Descrição                                |
|-------------------------------|--------------------------------------------|
| `siglaSistema`                | Sigla registrada no SEI                   |
| `identificacaoServico`        | Identificador único da aplicação          |
| `idUnidade`                   | Código da unidade SEI responsável         |
| `endpoint`                    | URL completa do endpoint SOAP do SEI      |
| `tamanhoMaximoArquivoDocumento` | Limite em MB para o tamanho do arquivo |
| `numeroMaximoDocumentos`     | Quantidade máxima de documentos por processo |

---

## 🚀 Como Usar os Serviços Existentes

Todos os serviços seguem uma assinatura clara, com validações e uso de enums/builders.

### Exemplos de comandos via Gogo Shell

```bash
# Criar procedimento completo com base em um FileEntry já existente
criarProcedimentoCompleto <fileEntryId>

# Listar hipóteses legais disponíveis
testListarHipoteseLegal

# Listar tipos de procedimento
testListarTiposProcedimento

# Listar prioridades
testListarTiposPrioridade

# Listar extensões permitidas para arquivo
testListarTipoArquivosPermitidos

# Listar séries de um tipo de procedimento
testListarSeries <idTipoProcedimento>
```

Esses comandos estão implementados na classe `SeiGogoCommand` e usam os serviços reais configurados.
### Exemplo de Uso em Código Java criarProcedimentoCompleto

```java
public void criarProcedimentoCompleto(long fileEntryId) {
    _log.info("[SEI] Iniciando criacao de procedimento completo com arquivo ID: " + fileEntryId);

    try {
        FileEntry fileEntry = _dlAppLocalService.getFileEntry(fileEntryId);
        ArquivoInfo arquivoInfo = processarArquivo(fileEntry);

        // pra criar o documeto recebido não é necessário o idArquivo,
        // pois o documento é criado com o conteúdo base64 diretamente.
            /*String idArquivo = _arquivoService.adicionarArquivo(
                    fileEntry.getFileName(),
                    arquivoInfo.tamanho(),
                    arquivoInfo.hash(),
                    arquivoInfo.base64()
            );*/

        Documento documento = criarDocumentoRecebido(fileEntry.getFileName(), arquivoInfo.base64);
        Procedimento procedimento = criarProcedimentoPadrao();

        RetornoGeracaoProcedimento retorno = _procedimentoService.gerarProcedimento(
                procedimento,
                new Documento[]{documento},
                null,
                null,
                "N",
                "N",
                null,
                null,
                "N",
                null,
                null,
                null,
                null,
                "N"
        );

        _log.info("[SEI] Procedimento criado com sucesso! Protocolo: " + retorno.getIdProcedimento());

    } catch (Exception e) {
        _log.error("[SEI] Erro ao criar procedimento completo: " + e.getMessage(), e);
    }
}

private Documento criarDocumentoRecebido(String fileName, String base64) {
    Remetente remetente = new Remetente();
    remetente.setNome("Remetente Teste");

    return DocumentoBuilder
            .builder(TipoDocumento.RECEBIDO)
            .idSerie("466") // cada tipo de documento deve ter uma série válida, verificar _documentoService.listarSeries() ou Gogo command testListarSeries
            .numero("DOC-TESTE-" + System.currentTimeMillis())
            .nomeArquivo(fileName)
            .conteudo(base64)
            .data(LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")))
            .descricao(null)
            .nivelAcesso(null)
            .idHipoteseLegal("23")
            .remetente(remetente)
            .interessados(new Interessado[]{new Interessado()})
            .build();
}

private Procedimento criarProcedimentoPadrao() {
    return ProcedimentoBuilder.builder()
            .idTipoProcedimento("100000783")
            .nivelAcesso(null)
            .especificacao("Criado via Gogo Teste")
            .assuntos(new Assunto[]{criarAssuntoPadrao()})
            .interessados(new Interessado[]{new Interessado()})
            .build();
}

private Assunto criarAssuntoPadrao() {
    Assunto assunto = new Assunto();
    assunto.setCodigoEstruturado("10.00.00.00");
    assunto.setDescricao("Atividade-Fim");
    return assunto;
}

private ArquivoInfo processarArquivo(FileEntry fileEntry) throws IOException, NoSuchAlgorithmException, PortalException {
    try (InputStream inputStream = fileEntry.getContentStream()) {
        byte[] buffer = inputStream.readAllBytes();
        String base64 = Base64.getEncoder().encodeToString(buffer);
        String tamanho = String.valueOf(buffer.length);

        MessageDigest md = MessageDigest.getInstance("MD5");
        byte[] digest = md.digest(buffer);
        StringBuilder sb = new StringBuilder();
        for (byte b : digest) {
            sb.append(String.format("%02x", b));
        }
        String hash = sb.toString();

        return new ArquivoInfo(base64, tamanho, hash);
    }
}

private record ArquivoInfo(String base64, String tamanho, String hash) {}

@Reference
private ProcedimentoService _procedimentoService;

@Reference
private ArquivoService _arquivoService;

@Reference
private DocumentoService _documentoService;

@Reference
private DLAppLocalService _dlAppLocalService;


```
---

## 🛠️ Como Implementar um Novo Serviço

### Contexto

Devido à incompatibilidade do WSDL do SEI com ferramentas modernas como CXF ou wsimport, optamos por uma abordagem **manual com Axis 1.4**, utilizando um stub modificado (`axis-patched`).

### Etapas

1. **Criar o método manualmente** no `SeiBindingStub`. Exemplo:

```java
public TipoPrioridade[] listarTiposPrioridade(String siglaSistema, String identificacaoServico, String idUnidade) throws RemoteException {
    if (super.cachedEndpoint == null) {
        throw new NoEndPointException();
    }

    Call call = createCall();
    call.setOperationName(new QName("Sei", "listarTiposPrioridade"));
    call.setUseSOAPAction(true);
    call.setSOAPActionURI("SeiAction");
    call.setSOAPVersion(SOAPConstants.SOAP11_CONSTANTS);
    call.setProperty(Call.SEND_TYPE_ATTR, Boolean.FALSE);

    call.addParameter(new QName("Sei", "siglaSistema"), XMLType.XSD_STRING, ParameterMode.IN);
    call.addParameter(new QName("Sei", "identificacaoServico"), XMLType.XSD_STRING, ParameterMode.IN);
    call.addParameter(new QName("Sei", "idUnidade"), XMLType.XSD_STRING, ParameterMode.IN);
    call.setReturnType(XMLType.SOAP_ARRAY);

    Object resp = call.invoke(new Object[]{siglaSistema, identificacaoServico, idUnidade});
    extractAttachments(call);
    return (TipoPrioridade[]) JavaUtils.convert(resp, TipoPrioridade[].class);
}
```

2. **Criar ou estender a interface de serviço na `api.service`**, como `ProcedimentoService`, `DocumentoService`, etc.

3. **Implementar na `service.impl`**, injetando e utilizando o stub SOAP manualmente configurado.

4. **Verificar obrigatoriedade e regras de validação** descritas na documentação oficial do SEI:
    - Campos obrigatórios
    - Exclusividade entre `conteudo`, `conteudoMTOM` e `idArquivo`
    - Tamanho máximo por arquivo
    - Quantidade máxima de documentos por procedimento

5. **Exemplo de comando para gerar assinatura com ajuda da IA (ChatGPT)**:
> "Me gere o stub Axis 1.4 do método `listarTiposDeUnidade` do SEI, com base no WSDL do SEI 4.1, incluindo todos os parâmetros, retorno e sem usar `operations[]`."

---
## 🔧 Como o Stub Axis foi Adaptado

### Local do WSDL

O WSDL original está em:
```
sei-integration-api/src/main/resources/sei.wsdl
```

### Geração e Patch Manual

1. O WSDL foi editado para remover `use="encoded"` e corrigir definições de tipos incompatíveis com Axis.
2. O stub foi gerado usando o seguinte comando:
   ```bash
   java -cp axis.jar org.apache.axis.wsdl.WSDL2Java -v -d Session -s -o ./generated sei.wsdl
   ```
3. Os arquivos gerados foram inseridos em:
   ```
   sei-integration-api/src/main/java/br/com/seatecnologia/sei/integration/api/service/ws/
   ```
4. Foi **removido o uso de `QName[] _operations`** e inserido manualmente cada parâmetro com:
   ```java
   call.addParameter(new QName("Sei", "siglaSistema"), XMLType.XSD_STRING, ParameterMode.IN);
   call.setReturnType(XMLType.SOAP_ELEMENT);
   ```

### Configuração do Axis

O arquivo de configuração do cliente está em:
```
sei-integration-service/src/main/resources/client-config.wsdd
```

### Patch do Axis

Substituímos o `axis.jar` original por uma versão **patched**. A principal alteração foi para permitir suporte à SSL antiga da Sun (necessária no ambiente do SEI).

- O JAR alterado está em:
  ```
  sei-integration-service/libs/axis-patched.jar
  ```
- A modificação foi feita em `AxisSSLProtocolSocketFactory` para compatibilidade com endpoints legados.

---

## 🧠 Considerações Técnicas e Padrões

- **Enums**: Sempre que possível, utilize enums (`TipoDocumento`, `NivelAcesso`) para garantir segurança em tempo de compilação.
- **Builders**:
    - Todos os objetos enviados para o SEI devem ser criados via builder (`DocumentoBuilder`, `ProcedimentoBuilder`), garantindo consistência com as regras de obrigatoriedade da documentação oficial.
    - Builders já validam campos obrigatórios e evitam erros comuns de serialização.
- **Base64 vs MTOM**:
    - `conteudo` (Base64): usado para documentos pequenos. O tamanho é estimado a partir do conteúdo codificado.
    - `conteudoMTOM`: usado para grandes volumes. Utilize `.length` para validação.
- **Validações automáticas**:
    - Quantidade de documentos por procedimento (máximo configurável).
    - Tamanho máximo de cada documento (também configurável).
    - Essas validações estão nos validators injetados nos services.
- **Arquitetura limpa**:
    - Separação clara entre API (`sei-integration-api`) e implementação (`sei-integration-service`).
    - O pacote `impl` implementa as interfaces definidas na API.
    - O pacote `internal.command` contém comandos Gogo para testes manuais.
    - O pacote `validator` centraliza validações e limites configuráveis (como tamanho de arquivos).
    - Todas as configurações vêm de System Settings (`SeiWSConfiguration`, `SeiWSDocumentConfiguration`), ou pode criar uma nova caso julgue necessário.

---
Para dúvidas, consulte os exemplos no `SeiGogoCommand` ou os serviços `DocumentoServiceImpl`, `ArquivoServiceImpl`, `ProcedimentoServiceImpl`.
---
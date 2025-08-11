<%@ include file="/init.jsp" %>

<%@ page import="br.com.seatecnologia.gdf.negocia.model.Edital" %>
<%@ page import="com.liferay.portal.kernel.util.Validator" %>

<%
  long editalId = ParamUtil.getLong(request, "editalId");
  String backURL = ParamUtil.getString(request, "backURL", themeDisplay.getURLCurrent());

  Edital edital = null;
  Calendar dataInicioCalendar = null;
  Calendar dataFimCalendar = null;
  Calendar dataPublicacaoCalendar = null;

  if (editalId > 0) {
    edital = EditalLocalServiceUtil.getEdital(editalId);

    if (edital.getDataInicio() != null) {
      dataInicioCalendar = CalendarFactoryUtil.getCalendar();
      dataInicioCalendar.setTime(edital.getDataInicio());
    }

    if (edital.getDataFim() != null) {
      dataFimCalendar = CalendarFactoryUtil.getCalendar();
      dataFimCalendar.setTime(edital.getDataFim());
    }
  }
%>

<portlet:actionURL var="saveEditalUrl" name="saveEdital" />

<div class="container-fluid container-fluid-max-xl container-form-lg">
  <div class="sheet">
    <h2 class="sheet-title">
      <%= edital == null ? "Novo Edital" : "Editar Edital" %>
    </h2>

    <!-- Disclaimers -->
    <div class="alert alert-warning">
      <strong>Atenção:</strong> Propostas por edital não geram processo no SEI, via de regra. No entanto, caso a negociação envolva dívidas em situação "parcelado" um processo será gerado automaticamente no SEI.
    </div>

    <div class="alert alert-warning">
      <strong>Atenção:</strong> A data de vencimento do pagamento do sinal (ou da parcela única ou da primeira parcela, caso não haja sinal) é sempre o último dia útil do mês corrente.
    </div>

    <aui:form name="fm" action="<%= saveEditalUrl %>" enctype="multipart/form-data" method="post">
      <aui:model-context bean="<%= edital %>" model="<%= Edital.class %>" />
      <aui:input type="hidden" name="editalId" />

      <!-- IDENTIFICAÇÃO BÁSICA -->
      <div class="sheet-section">
        <h3 class="sheet-subtitle">Identificação Básica</h3>

        <aui:input
                name="titulo"
                label="Título do edital"
                type="text"
                required="true"
                maxLength="120"
                value="<%= edital == null ? "" : edital.getTitulo() %>"
                helpMessage="Exemplo: Edital Transação PGDF Nº 3, de 01 de julho de 2025"
        >
          <aui:validator name="custom" errorMessage="O título deve ser único.">
                    function(val, fieldNode, ruleValue) {
                      // Implementar validação de unicidade via AJAX
                      return true;
                    }
          </aui:validator>
        </aui:input>

        <aui:input
                name="descricao"
                label="Descrição do edital"
                type="textarea"
                required="true"
                maxLength="255"
                value="<%= edital == null ? "" : edital.getDescricao() %>"
        />

        <aui:input
                name="numeroEdital"
                label="Número do edital"
                type="number"
                required="true"
                maxLength="255"
                value="<%= edital == null ? "" : edital.getNumero() %>"
        />

        <aui:input
                name="anoEdital"
                label="Ano do edital"
                type="number"
                required="true"
                maxLength="4"
                value="<%= edital == null ? "" : edital.getAno() %>"
        />

        <aui:input
                name="numeroSEI"
                label="Número SEI do edital"
                type="number"
                required="true"
                maxLength="255"
                value="<%= edital == null ? "" : edital.getNumeroSei() %>"
        />

        <aui:input
                name="prefixoParcelamentoSITAF"
                label="Prefixo do parcelamento no SITAF"
                type="number"
                required="true"
                maxLength="255"
                value="<%= edital == null ? "" : edital.getPrefixoSitaf() %>"
        />

        <aui:input
                name="criarProcessoAutomatico"
                label="Criar processo automático no SEI para este edital"
                type="checkbox"
                helpMessage="Se selecionado, todas as solicitações vinculadas ao edital gerará automaticamente um processo no SEI, seguindo o fluxo correspondente."
                value="<%= edital == null ? false : edital.getProcessoAutomaticoSEI() %>"
        />

        <!-- Assinatura Gestor -->
        <aui:input
                name="assinaturaGestor"
                label="Assinatura gestor"
                type="file"
                required="<%= edital == null %>"
                cssClass="mt-3"
                helpMessage="Envie uma imagem com fundo transparente, em formato retangular e com largura mínima de 500px. Essa imagem será utilizada como assinatura e inserida automaticamente em todos os termos de adesão gerados para o edital selecionado. Formato: PNG. Máximo: 2MB"
                accept=".png"
        />

        <c:if test="<%= edital != null %>">
          <div class="mt-2">
            <div class="alert alert-info">
              <strong>Nota:</strong> Se nenhum novo arquivo for enviado, a assinatura atual do gestor será mantida.
            </div>
          </div>
        </c:if>

        <!-- Assinatura Secretária -->
        <aui:input
                name="assinaturaSecretaria"
                label="Assinatura secretária"
                type="file"
                required="<%= edital == null %>"
                cssClass="mt-3"
                helpMessage="Envie uma imagem com fundo transparente, em formato retangular e com largura mínima de 500px. Essa imagem será utilizada como assinatura e inserida automaticamente em todos os termos de adesão gerados para o edital selecionado, desde que ele abranja dívidas não judicializadas. Formato: PNG. Máximo: 2MB"
                accept=".png"
        />

        <c:if test="<%= edital != null %>">
          <div class="mt-2">
            <div class="alert alert-info">
              <strong>Nota:</strong> Se nenhum novo arquivo for enviado, a assinatura atual da secretária será mantida.
            </div>
          </div>
        </c:if>
      </div>

      <!-- VIGÊNCIA & DOCUMENTAÇÃO -->
      <div class="sheet-section">
        <h3 class="sheet-subtitle">Vigência & Documentação</h3>

        <div class="form-group">
          <label for="<portlet:namespace />dataInicio" class="control-label">
            Data de início da vigência <span class="text-warning">*</span>
          </label>
          <p class="text-muted small">A partir dessa data o requerente pode selecionar o edital para fazer uma negociação por edital</p>
          <liferay-ui:input-date
                  name="dataInicio"
                  dayValue="<%= (dataInicioCalendar != null) ? dataInicioCalendar.get(Calendar.DAY_OF_MONTH) : 0 %>"
                  monthValue="<%= (dataInicioCalendar != null) ? dataInicioCalendar.get(Calendar.MONTH) : 0 %>"
                  yearValue="<%= (dataInicioCalendar != null) ? dataInicioCalendar.get(Calendar.YEAR) : 0 %>"
                  required="true"
          />
        </div>

        <div class="form-group">
          <label for="<portlet:namespace />dataFim" class="control-label">
            Data de fim da vigência <span class="text-warning">*</span>
          </label>
          <p class="text-muted small">Último dia para que o requerente selecione o edital, preencha e envie o formulário de proposta por edital</p>
          <liferay-ui:input-date
                  name="dataFim"
                  dayValue="<%= (dataFimCalendar != null) ? dataFimCalendar.get(Calendar.DAY_OF_MONTH) : 0 %>"
                  monthValue="<%= (dataFimCalendar != null) ? dataFimCalendar.get(Calendar.MONTH) : 0 %>"
                  yearValue="<%= (dataFimCalendar != null) ? dataFimCalendar.get(Calendar.YEAR) : 0 %>"
                  required="true"
          />
        </div>

        <div class="form-group">
          <label for="<portlet:namespace />dataPublicacao" class="control-label">
            Data de publicação <span class="text-warning">*</span>
          </label>
          <p class="text-muted small">Data que o edital foi publicado</p>
          <liferay-ui:input-date
                  name="dataPublicacao"
                  dayValue="<%= (dataPublicacaoCalendar != null) ? dataPublicacaoCalendar.get(Calendar.DAY_OF_MONTH) : 0 %>"
                  monthValue="<%= (dataPublicacaoCalendar != null) ? dataPublicacaoCalendar.get(Calendar.MONTH) : 0 %>"
                  yearValue="<%= (dataPublicacaoCalendar != null) ? dataPublicacaoCalendar.get(Calendar.YEAR) : 0 %>"
                  required="true"
          />
        </div>

        <aui:input
                name="arquivo"
                label="Upload do edital"
                type="file"
                required="<%= edital == null %>"
                cssClass="mt-3"
                helpMessage="Formato: PDF. Máximo: 10MB"
                accept=".pdf"
        />

        <c:if test="<%= edital != null && Validator.isNotNull(edital.getArquivoURL()) %>">
          <div class="mt-3">
            <div class="alert alert-info">
              <strong>Nota:</strong> Se nenhum novo arquivo for enviado, o
              <a href="<%= edital.getArquivoURL() %>" target="_blank">arquivo atual</a>
              será mantido.
            </div>
          </div>
        </c:if>
      </div>

      <!-- ESCOPO -->
      <div class="sheet-section">
        <h3 class="sheet-subtitle">Escopo</h3>

        <aui:input
                name="tipos"
                label="Tipo"
                type="text"
                value="Dívida ativa"
                disabled="true"
                cssClass="form-control-plaintext"
        />

        <aui:select
                name="receitas"
                label="Receita"
                required="true"
                multiple="true"
                cssClass="multiselect-searchable"
                helpMessage="Exemplo: 122 - IPTU - INSCRICAO DIVIDA ATIVA - IPTU"
        >
          <aui:option value="122" label="122 - IPTU - INSCRICAO DIVIDA ATIVA - IPTU" />
          <aui:option value="941" label="941 - ISS - IMPOSTO SOBRE SERVICOS" />
          <aui:option value="944" label="944 - TRSD - TAXA DE REMOCAO DE RESIDUOS SOLIDOS DOMICILIARES" />
          <!-- Adicionar mais opções conforme tabela SITAF -->
        </aui:select>

        <aui:select
                name="situacoes"
                label="Situação"
                required="true"
                multiple="true"
                cssClass="multiselect-searchable"
                helpMessage="Exemplo: [00 ABERTO] 00 NAO PAGO"
        >
          <optgroup label="00 Aberto">
            <aui:option value="00" label="00 NAO PAGO" />
            <!-- Adicionar mais opções da categoria -->
          </optgroup>
          <optgroup label="02 Suspenso">
            <!-- Adicionar opções da categoria -->
          </optgroup>
          <optgroup label="08 Parcelado">
            <!-- Adicionar opções da categoria -->
          </optgroup>
        </aui:select>

        <aui:field-wrapper label="Judicializada" required="true">
          <aui:input
                  name="judicializada"
                  label="Judicializada"
                  type="radio"
                  value="judicializada"
                  inlineField="true"
          />
          <aui:input
                  name="judicializada"
                  label="Não judicializada"
                  type="radio"
                  value="nao_judicializada"
                  inlineField="true"
          />
          <aui:input
                  name="judicializada"
                  label="Ambos"
                  type="radio"
                  value="ambos"
                  checked="true"
                  inlineField="true"
          />
        </aui:field-wrapper>

        <aui:input
                name="valorMinimoElegivelCPF"
                label="Valor mínimo para estar elegível para CPF logado"
                type="text"
                cssClass="money-mask"
                helpMessage="Para utilizar este edital, é necessário que a soma das dívidas elegíveis atinja o valor mínimo estipulado"
        />

        <aui:input
                name="valorMinimoElegivelCNPJ"
                label="Valor mínimo para estar elegível para CNPJ logado"
                type="text"
                cssClass="money-mask"
                helpMessage="Para utilizar este edital, é necessário que a soma das dívidas elegíveis atinja o valor mínimo estipulado"
        />

        <aui:select
                name="especificarValorMinimoCNPJ"
                label="Especificar um valor mínimo para cada tipo de CNPJ logado?"
                multiple="true"
                required="true"
        >
          <aui:option value="MEI" label="MEI ? Microempreendedor Individual" />
          <aui:option value="ME" label="ME ? Microempresa" />
          <aui:option value="EPP" label="EPP ? Empresa de Pequeno Porte" />
          <aui:option value="DEMAIS" label="Demais empresas (sem enquadramento específico)" />
          <aui:option value="ENTIDADE_SEM_FINS" label="Entidade sem fins lucrativos" />
          <aui:option value="OSC" label="Organização da sociedade civil (OSC)" />
          <aui:option value="ASSOCIACAO" label="Associação Privada" />
          <aui:option value="FUNDACAO" label="Fundação Privada" />
          <aui:option value="SOCIEDADE_SIMPLES" label="Sociedade Simples" />
          <aui:option value="LTDA" label="Sociedade Empresária Limitada (LTDA)" />
          <aui:option value="SA" label="Sociedade Anônima (S.A.)" />
          <aui:option value="EI" label="Empresa Individual (EI)" />
          <aui:option value="EMPRESARIO_INDIVIDUAL" label="Empresário Individual" />
          <aui:option value="COOPERATIVA" label="Cooperativa" />
          <aui:option value="CONSORCIO" label="Consórcio de empresas" />
          <aui:option value="SCP" label="Sociedade em Conta de Participação (SCP)" />
          <aui:option value="CONSORCIO_PUBLICO" label="Consórcio Público" />
          <aui:option value="ORG_RELIGIOSA" label="Organização Religiosa" />
          <aui:option value="ORGAO_PUBLICO" label="Órgão Público" />
          <aui:option value="ORG_INTERNACIONAL" label="Organização Internacional" />
          <aui:option value="ORG_SINDICAL" label="Organização Sindical/Patronal" />
          <aui:option value="FUNDO_PUBLICO" label="Fundo Público" />
          <aui:option value="CARTORIO" label="Cartório não oficializado" />
        </aui:select>

        <!-- Container dinâmico para valores mínimos por tipo de CNPJ -->
        <div id="<portlet:namespace />valoresMinimosCNPJContainer" class="mt-3">
          <!-- Campos serão adicionados dinamicamente via JavaScript -->
        </div>

        <aui:input
                name="entradaMinima"
                label="Entrada mínima (sinal)"
                type="number"
                min="0"
                max="100"
                step="0.01"
                helpMessage="Insira o valor em porcentagem"
                suffix="%"
        />

        <aui:input
                name="valorMinimoParcelaCPF"
                label="Valor mínimo de parcela CPF"
                type="text"
                cssClass="money-mask"
                helpMessage="Insira o valor em real"
        />

        <aui:input
                name="valorMinimoParcelaCNPJ"
                label="Valor mínimo de parcela CNPJ"
                type="text"
                cssClass="money-mask"
                helpMessage="Insira o valor em real"
        />

        <aui:field-wrapper label="Aplicável para CPF/CNPJ" required="true" helpMessage="Defina se o edital está disponível para usuários com CPF, CNPJ ou ambos. O sistema utilizará essa configuração para verificar se o tipo de usuário logado é elegível.">
          <aui:input
                  name="aplicavelPara"
                  label="CPF"
                  type="radio"
                  value="CPF"
                  inlineField="true"
          />
          <aui:input
                  name="aplicavelPara"
                  label="CNPJ"
                  type="radio"
                  value="CNPJ"
                  inlineField="true"
          />
          <aui:input
                  name="aplicavelPara"
                  label="Ambos"
                  type="radio"
                  value="ambos"
                  checked="true"
                  inlineField="true"
          />
        </aui:field-wrapper>

        <aui:select
                name="parcelamentoDias"
                label="Parcelamento que o requerente pode selecionar, se parcelar o pagamento"
                required="true"
                multiple="true"
                helpMessage="Opções de dias que o requerente escolher para pagar o boleto mensalmente"
        >
          <aui:option value="1" label="1" />
          <aui:option value="5" label="5" />
          <aui:option value="10" label="10" />
          <aui:option value="15" label="15" />
          <aui:option value="25" label="25" />
        </aui:select>
      </div>

      <!-- DESCONTOS E PARCELAS -->
      <div class="sheet-section">
        <h3 class="sheet-subtitle">Descontos e Parcelas</h3>

        <aui:field-wrapper label="Este edital aplica algum tipo de desconto para dívidas elegíveis?" required="true">
          <aui:input
                  name="aplicaDesconto"
                  label="Sim"
                  type="radio"
                  value="true"
                  checked="false"
                  onClick="toggleDescontoFields(true)"
                  inlineField="true"
          />
          <aui:input
                  name="aplicaDesconto"
                  label="Não"
                  type="radio"
                  value="false"
                  checked="true"
                  onClick="toggleDescontoFields(false)"
                  inlineField="true"
          />
        </aui:field-wrapper>

        <!-- Container para elementos repetíveis de desconto -->
        <div id="<portlet:namespace />descontoContainer" style="display: none;">
          <liferay-frontend:fieldset-group>
            <liferay-frontend:fieldset collapsible="<%= true %>" label="Configurações de Desconto">

              <!-- Botão Visualizar Tabela Gerada -->
              <div class="mb-3">
                <button type="button" class="btn btn-info" id="<portlet:namespace />visualizarTabelaBtn" disabled onclick="visualizarTabelaGerada()">
                  <i class="icon-eye-open"></i> Visualizar tabela gerada
                </button>
                <p class="text-muted small mt-1">Botão só fica ativo quando todos os campos obrigatórios estiverem preenchidos</p>
              </div>

              <div class="alert alert-info mb-3">
                <strong>Instruções:</strong>
                <ul class="mb-0 mt-2">
                  <li>Cada <strong>Configuração de Desconto</strong> representa um conjunto de regras diferentes</li>
                  <li>Dentro de cada configuração, você pode adicionar múltiplas <strong>Configurações de Parcelas</strong></li>
                  <li>Use os botões verdes para adicionar novos itens</li>
                  <li>Use os botões vermelhos para remover itens</li>
                  <li>O número máximo de parcelas é 1000</li>
                </ul>
              </div>

              <!-- Container onde os dados JSON serão armazenados -->
              <aui:input name="descontosData" type="hidden" />

              <div id="<portlet:namespace />descontoRepeater">
                <!-- Os elementos de desconto serão adicionados dinamicamente aqui -->
              </div>

              <button type="button" class="btn btn-success btn-lg mt-3" onclick="adicionarDesconto()">
                <i class="icon-plus-sign"></i> Adicionar nova configuração de desconto
              </button>
            </liferay-frontend:fieldset>
          </liferay-frontend:fieldset-group>
        </div>
      </div>

      <!-- TERMO GERADO AUTOMATICAMENTE -->
      <div class="sheet-section">
        <h3 class="sheet-subtitle">Termo Gerado Automaticamente</h3>

        <!-- Card de exemplo -->
        <div class="alert alert-info mb-3">
          <strong>Exemplo de texto de requerimento:</strong>
          <div class="mt-2" style="font-style: italic;">
            "SOLICITO adesão à transação tributária pelo Programa Negocia-DF, regido pelo Edital PGDF nº 1, de XX de julho de 2025, pela Lei n.º 7.684, de 5 de junho de 2025 e regulamentado pela Portaria PGDF n.º 330, de 25 de junho de 2025, para regularizar os débitos tributários compreendidos nos processos abaixo relacionados, cujos valores serão pagos conforme disposto no item 5 do edital de transação resolutiva e na Tabela III do Anexo I do referido Decreto."
          </div>
        </div>

        <aui:input
                name="requerimento"
                label="Requerimento"
                type="textarea"
                required="true"
                rows="5"
                maxLength="400"
                helpMessage="Para que o termo gerado traga os dados corretos na seção 'Requerimento', este campo precisa ser preenchido."
        />
      </div>

      <aui:button-row cssClass="d-flex justify-content-end mt-4">
        <a class="btn btn-secondary mr-2" href="<%= backURL %>">Cancelar</a>
        <aui:button type="submit" value="Salvar" cssClass="btn-primary" onClick="return validateAndSubmit();" />
      </aui:button-row>
    </aui:form>
  </div>
</div>

<!-- Modal para visualizar tabela gerada -->
<div class="modal fade" id="<portlet:namespace />tabelaModal" tabindex="-1" role="dialog">
  <div class="modal-dialog modal-lg" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title">Tabela de Descontos Gerada</h5>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
      <div class="modal-body" id="<portlet:namespace />tabelaContent">
        <!-- Conteúdo da tabela será inserido aqui -->
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-secondary" data-dismiss="modal">Fechar</button>
      </div>
    </div>
  </div>
</div>

<!-- JAVASCRIPT -->
<script type="text/javascript">
  // ========== CONFIGURAÇÃO INICIAL ==========
  window.portletNamespace = '<portlet:namespace />';
  window.descontoCount = 0;
  window.parcelaCounters = {};
  window.maxParcelasGlobal = null;

  // ========== MÁSCARA MONETÁRIA ==========
  function formatarMoeda(valor) {
    if (!valor) return '';

    // Remove tudo que não é número
    valor = valor.replace(/\D/g, '');

    // Converte para número e divide por 100 para ter os centavos
    valor = (parseInt(valor) / 100).toFixed(2) + '';

    // Separa a parte inteira da decimal
    valor = valor.replace(".", ",");

    // Adiciona pontos como separador de milhar
    valor = valor.replace(/(\d)(?=(\d{3})+(?!\d))/g, "$1.");

    return "R$ " + valor;
  }

  function aplicarMascaraMonetaria() {
    document.querySelectorAll('.money-mask').forEach(function(input) {
      input.addEventListener('input', function(e) {
        e.target.value = formatarMoeda(e.target.value);
      });

      input.addEventListener('focus', function(e) {
        if (e.target.value === '') {
          e.target.value = 'R$ 0,00';
        }
      });

      input.addEventListener('blur', function(e) {
        if (e.target.value === 'R$ 0,00' || e.target.value === 'R$ ') {
          e.target.value = '';
        }
      });
    });
  }

  function obterValorMonetario(campo) {
    if (!campo || !campo.value) return 0;

    var valor = campo.value.replace(/[^\d,]/g, '');
    valor = valor.replace(',', '.');

    return parseFloat(valor) || 0;
  }

  // ========== FUNÇÕES DE TOGGLE ==========
  window.toggleDescontoFields = function(show) {
    var container = document.getElementById(window.portletNamespace + 'descontoContainer');
    container.style.display = show ? 'block' : 'none';

    if (!show) {
      container.querySelectorAll('[required]').forEach(function(field) {
        field.removeAttribute('data-was-required');
        field.setAttribute('data-was-required', 'true');
        field.removeAttribute('required');
      });
    } else {
      container.querySelectorAll('[data-was-required]').forEach(function(field) {
        field.setAttribute('required', 'true');
        field.removeAttribute('data-was-required');
      });
    }

    verificarCamposObrigatorios();
  }

  window.togglePequenoValor = function(descontoIndex, show) {
    var container = document.getElementById(window.portletNamespace + 'pequenoValorContainer_' + descontoIndex);
    if (container) {
      container.style.display = show ? 'block' : 'none';
      var input = container.querySelector('input');
      if (input) {
        if (show) {
          input.setAttribute('required', 'true');
          input.classList.add('money-mask');
          aplicarMascaraMonetaria();
        } else {
          input.removeAttribute('required');
          input.value = '';
        }
      }
    }
    verificarCamposObrigatorios();
  }

  // ========== VALORES MÍNIMOS POR TIPO CNPJ ==========
  function updateValoresMinimosCNPJ() {
    var select = document.getElementById(window.portletNamespace + 'especificarValorMinimoCNPJ');
    var container = document.getElementById(window.portletNamespace + 'valoresMinimosCNPJContainer');

    if (!select || !container) return;

    container.innerHTML = '';

    var selectedOptions = Array.from(select.selectedOptions);

    selectedOptions.forEach(function(option) {
      var fieldDiv = document.createElement('div');
      fieldDiv.className = 'form-group';
      fieldDiv.innerHTML =
              '<label>Valor mínimo para ' + option.text + ' <span class="text-warning">*</span></label>' +
              '<input type="text" name="' + window.portletNamespace + 'valorMinimo_' + option.value + '" ' +
              'class="form-control money-mask" required placeholder="R$ 0,00">';
      container.appendChild(fieldDiv);
    });

    aplicarMascaraMonetaria();
  }

  // ========== VISUALIZAR TABELA GERADA ==========
  window.visualizarTabelaGerada = function() {
    var descontosData = [];

    document.querySelectorAll('.desconto-item-container').forEach(function(descontoContainer) {
      var descontoIndex = descontoContainer.getAttribute('data-index');

      var descontoData = {
        tipoCredito: getRadioValue('tipoCredito_' + descontoIndex),
        empresaRegime: getRadioValue('empresaRegime_' + descontoIndex),
        pequenoValorAplicavel: getRadioValue('pequenoValorAplicavel_' + descontoIndex),
        pequenoValor: document.getElementById(window.portletNamespace + 'pequenoValor_' + descontoIndex)?.value || '',
        transacaoEnvolve: getMultiSelectValues('transacaoEnvolve_' + descontoIndex),
        parcelas: []
      };

      descontoContainer.querySelectorAll('.parcela-item-container').forEach(function(parcelaContainer) {
        var parcelaIndex = parcelaContainer.getAttribute('data-parcela-index');

        descontoData.parcelas.push({
          quantidadeParcelasMin: document.getElementById(window.portletNamespace + 'quantidadeParcelasMin_' + descontoIndex + '_' + parcelaIndex)?.value || 1,
          quantidadeParcelasMax: document.getElementById(window.portletNamespace + 'quantidadeParcelasMax_' + descontoIndex + '_' + parcelaIndex)?.value || 1,
          porcentagemDesconto: document.getElementById(window.portletNamespace + 'porcentagemDesconto_' + descontoIndex + '_' + parcelaIndex)?.value || 0,
          sobreOQueAplicado: getRadioValue('sobreOQueAplicado_' + descontoIndex + '_' + parcelaIndex),
          classificacaoCredito: getMultiSelectValues('classificacaoCredito_' + descontoIndex + '_' + parcelaIndex)
        });
      });

      descontosData.push(descontoData);
    });

    // Gerar HTML da tabela
    var tabelaHTML = '';

    descontosData.forEach(function(desconto, index) {
      tabelaHTML += '<h6>Configuração de Desconto #' + (index + 1) + '</h6>';
      tabelaHTML += '<table class="table table-bordered">';
      tabelaHTML += '<tr><th>Tipo de crédito:</th><td>' + getTipoCreditoLabel(desconto.tipoCredito) + '</td></tr>';
      tabelaHTML += '<tr><th>Empresa em regime especial?</th><td>' + (desconto.empresaRegime === 'true' ? 'Sim' : desconto.empresaRegime === 'false' ? 'Não' : '-') + '</td></tr>';
      tabelaHTML += '<tr><th>Pequeno valor aplicável?</th><td>' + (desconto.pequenoValorAplicavel === 'true' ? 'Sim' : 'Não') + '</td></tr>';
      tabelaHTML += '<tr><th>Pequeno valor:</th><td>' + (desconto.pequenoValor ? desconto.pequenoValor : '-') + '</td></tr>';
      tabelaHTML += '<tr><th>Transação envolve?</th><td>' + (desconto.transacaoEnvolve.length > 0 ? desconto.transacaoEnvolve.join(', ') : '-') + '</td></tr>';
      tabelaHTML += '</table>';

      tabelaHTML += '<table class="table table-bordered table-striped">';
      tabelaHTML += '<thead><tr>';
      tabelaHTML += '<th>Quantidade de parcelas (Min - Max)</th>';
      tabelaHTML += '<th>Classificação do crédito</th>';
      tabelaHTML += '<th>Sobre o que é aplicado</th>';
      tabelaHTML += '<th>% Desconto</th>';
      tabelaHTML += '</tr></thead><tbody>';

      desconto.parcelas.forEach(function(parcela) {
        var qtdParcelas = parcela.quantidadeParcelasMin + ' - ' + parcela.quantidadeParcelasMax;

        tabelaHTML += '<tr>';
        tabelaHTML += '<td>' + qtdParcelas + '</td>';
        tabelaHTML += '<td>' + parcela.classificacaoCredito.join(', ') + '</td>';
        tabelaHTML += '<td>' + getSobreOQueAplicadoLabel(parcela.sobreOQueAplicado) + '</td>';
        tabelaHTML += '<td>' + parcela.porcentagemDesconto + '%</td>';
        tabelaHTML += '</tr>';
      });

      tabelaHTML += '</tbody></table><hr>';
    });

    document.getElementById(window.portletNamespace + 'tabelaContent').innerHTML = tabelaHTML;
    $('#' + window.portletNamespace + 'tabelaModal').modal('show');
  }

  function getTipoCreditoLabel(value) {
    switch(value) {
      case 'T': return 'Tributária (T)';
      case 'N': return 'Não tributária (N)';
      case 'ambos': return 'Ambos';
      default: return value;
    }
  }

  function getSobreOQueAplicadoLabel(value) {
    switch(value) {
      case 'principal': return 'Sobre valor principal';
      case 'acrescimos': return 'Sobre multas, juros e demais acréscimos legais';
      case 'ambos': return 'Ambos';
      default: return '-';
    }
  }

  // ========== VALIDAÇÃO E SUBMIT ==========
  window.validateAndSubmit = function() {
    // Validação de campos obrigatórios
    if (!verificarCamposObrigatorios()) {
      alert('Por favor, preencha todos os campos obrigatórios antes de salvar.');
      return false;
    }

    // Validação de data de publicação
    var dataInicio = getDateFromInputs('dataInicio');
    var dataPublicacao = getDateFromInputs('dataPublicacao');

    if (dataPublicacao && dataInicio && dataPublicacao > dataInicio) {
      alert('A data de publicação não pode ser maior que a data de início da vigência');
      return false;
    }

    // Validação de data fim
    var dataFim = getDateFromInputs('dataFim');
    if (dataFim && dataInicio && dataFim <= dataInicio) {
      alert('A data de fim da vigência deve ser maior que a data de início');
      return false;
    }

    // Validação de arquivos PNG
    var assinaturaGestor = document.getElementById(window.portletNamespace + 'assinaturaGestor');
    var assinaturaSecretaria = document.getElementById(window.portletNamespace + 'assinaturaSecretaria');

    if (assinaturaGestor && assinaturaGestor.files.length > 0) {
      if (!assinaturaGestor.files[0].name.toLowerCase().endsWith('.png')) {
        alert('A assinatura do gestor deve ser um arquivo PNG');
        return false;
      }
      if (assinaturaGestor.files[0].size > 2 * 1024 * 1024) {
        alert('A assinatura do gestor não pode exceder 2MB');
        return false;
      }
    }

    if (assinaturaSecretaria && assinaturaSecretaria.files.length > 0) {
      if (!assinaturaSecretaria.files[0].name.toLowerCase().endsWith('.png')) {
        alert('A assinatura da secretária deve ser um arquivo PNG');
        return false;
      }
      if (assinaturaSecretaria.files[0].size > 2 * 1024 * 1024) {
        alert('A assinatura da secretária não pode exceder 2MB');
        return false;
      }
    }

    // Converter valores monetários para números antes de enviar
    document.querySelectorAll('.money-mask').forEach(function(input) {
      var hiddenInput = document.createElement('input');
      hiddenInput.type = 'hidden';
      hiddenInput.name = input.name + '_numeric';
      hiddenInput.value = obterValorMonetario(input);
      input.parentNode.appendChild(hiddenInput);
    });

    // Coleta todos os dados de desconto e parcelas
    var descontosData = [];

    document.querySelectorAll('.desconto-item-container').forEach(function(descontoContainer) {
      var descontoIndex = descontoContainer.getAttribute('data-index');

      var descontoData = {
        tipoCredito: getRadioValue('tipoCredito_' + descontoIndex),
        empresaRegime: getRadioValue('empresaRegime_' + descontoIndex),
        pequenoValorAplicavel: getRadioValue('pequenoValorAplicavel_' + descontoIndex),
        pequenoValor: obterValorMonetario(document.getElementById(window.portletNamespace + 'pequenoValor_' + descontoIndex)) || 0,
        transacaoEnvolve: getMultiSelectValues('transacaoEnvolve_' + descontoIndex),
        parcelas: []
      };

      // Coleta dados das parcelas
      descontoContainer.querySelectorAll('.parcela-item-container').forEach(function(parcelaContainer) {
        var parcelaIndex = parcelaContainer.getAttribute('data-parcela-index');

        descontoData.parcelas.push({
          quantidadeParcelasMin: parseInt(document.getElementById(window.portletNamespace + 'quantidadeParcelasMin_' + descontoIndex + '_' + parcelaIndex)?.value) || 1,
          quantidadeParcelasMax: parseInt(document.getElementById(window.portletNamespace + 'quantidadeParcelasMax_' + descontoIndex + '_' + parcelaIndex)?.value) || 1,
          porcentagemDesconto: parseFloat(document.getElementById(window.portletNamespace + 'porcentagemDesconto_' + descontoIndex + '_' + parcelaIndex)?.value) || 0,
          sobreOQueAplicado: getRadioValue('sobreOQueAplicado_' + descontoIndex + '_' + parcelaIndex),
          classificacaoCredito: getMultiSelectValues('classificacaoCredito_' + descontoIndex + '_' + parcelaIndex)
        });
      });

      descontosData.push(descontoData);
    });

    // Armazena os dados no campo hidden
    var descontosDataField = document.getElementById(window.portletNamespace + 'descontosData');
    if (descontosDataField) {
      descontosDataField.value = JSON.stringify(descontosData);
    }

    return true;
  }

  function getDateFromInputs(fieldName) {
    var day = document.querySelector('select[name="' + window.portletNamespace + fieldName + 'Day"]')?.value;
    var month = document.querySelector('select[name="' + window.portletNamespace + fieldName + 'Month"]')?.value;
    var year = document.querySelector('select[name="' + window.portletNamespace + fieldName + 'Year"]')?.value;

    if (day && month && year) {
      return new Date(year, month, day);
    }
    return null;
  }

  function getMultiSelectValues(fieldId) {
    var select = document.getElementById(window.portletNamespace + fieldId);
    if (!select) return [];

    return Array.from(select.selectedOptions).map(option => option.value);
  }

  function getRadioValue(fieldName) {
    var radios = document.querySelectorAll('input[name="' + window.portletNamespace + fieldName + '"]:checked');
    if (radios.length > 0) {
      return radios[0].value;
    }
    return '';
  }

  // ========== FUNÇÕES DE PARCELAS ==========
  window.adicionarParcela = function(descontoIndex) {
    if (!window.parcelaCounters[descontoIndex]) {
      window.parcelaCounters[descontoIndex] = 1;
    }

    var parcelaIndex = window.parcelaCounters[descontoIndex]++;
    var container = document.getElementById(window.portletNamespace + 'parcelasRepeater_' + descontoIndex);

    if (!container) {
      console.error('Container não encontrado para desconto index: ' + descontoIndex);
      return;
    }

    // Obter o último valor máximo da parcela anterior
    var ultimoMax = 1;
    var parcelas = container.querySelectorAll('.parcela-item-container');
    if (parcelas.length > 0) {
      var ultimaParcela = parcelas[parcelas.length - 1];
      var ultimoMaxInput = ultimaParcela.querySelector('[id*="_quantidadeParcelasMax_"]');
      if (ultimoMaxInput && ultimoMaxInput.value) {
        ultimoMax = parseInt(ultimoMaxInput.value) + 1;
      }
    }

    var newParcela = document.createElement('div');
    newParcela.className = 'parcela-item-container';
    newParcela.setAttribute('data-desconto-index', descontoIndex);
    newParcela.setAttribute('data-parcela-index', parcelaIndex);

    newParcela.innerHTML =
            '<span class="parcela-indicator">' + (parcelaIndex + 1) + '</span>' +
            '<div class="row">' +
            '<div class="col-md-3">' +
            '<div class="form-group">' +
            '<label>Quantidade de parcelas <span class="text-warning">*</span></label>' +
            '<div class="parcelas-range-container">' +
            '<input type="number" ' +
            'id="' + window.portletNamespace + 'quantidadeParcelasMin_' + descontoIndex + '_' + parcelaIndex + '" ' +
            'class="form-control parcelas-input" ' +
            'min="1" max="1000" value="' + ultimoMax + '" ' +
            'placeholder="Min" required ' +
            'onchange="validarRangeParcelas(' + descontoIndex + ', ' + parcelaIndex + ')" ' +
            'oninput="verificarCamposObrigatorios()">' +
            '<span class="parcelas-separator">-</span>' +
            '<input type="number" ' +
            'id="' + window.portletNamespace + 'quantidadeParcelasMax_' + descontoIndex + '_' + parcelaIndex + '" ' +
            'class="form-control parcelas-input" ' +
            'min="1" max="1000" value="' + ultimoMax + '" ' +
            'placeholder="Max" required ' +
            'onchange="validarRangeParcelas(' + descontoIndex + ', ' + parcelaIndex + ')" ' +
            'oninput="verificarCamposObrigatorios()">' +
            '</div>' +
            '<small class="form-text text-muted">Apenas números inteiros (1 a 1000)</small>' +
            '</div>' +
            '</div>' +
            '<div class="col-md-3">' +
            '<div class="form-group">' +
            '<label>Porcentagem do desconto <span class="text-warning">*</span></label>' +
            '<input type="number" id="' + window.portletNamespace + 'porcentagemDesconto_' + descontoIndex + '_' + parcelaIndex + '" ' +
            'class="form-control" min="0" max="100" step="0.01" required ' +
            'oninput="verificarCamposObrigatorios()" ' +
            'placeholder="0 a 100">' +
            '<small class="form-text text-muted">A aplicação do percentual ocorrerá de acordo com o número de parcelas escolhido</small>' +
            '</div>' +
            '</div>' +
            '<div class="col-md-3">' +
            '<div class="form-group">' +
            '<label>Sobre o que é aplicado? <span class="text-warning">*</span></label>' +
            '<div>' +
            '<div class="form-check">' +
            '<input type="radio" class="form-check-input" ' +
            'id="' + window.portletNamespace + 'sobreOQueAplicado_' + descontoIndex + '_' + parcelaIndex + '_principal" ' +
            'name="' + window.portletNamespace + 'sobreOQueAplicado_' + descontoIndex + '_' + parcelaIndex + '" ' +
            'value="principal" onchange="verificarCamposObrigatorios()" required>' +
            '<label class="form-check-label" for="' + window.portletNamespace + 'sobreOQueAplicado_' + descontoIndex + '_' + parcelaIndex + '_principal">' +
            'Sobre valor principal' +
            '</label>' +
            '</div>' +
            '<div class="form-check">' +
            '<input type="radio" class="form-check-input" ' +
            'id="' + window.portletNamespace + 'sobreOQueAplicado_' + descontoIndex + '_' + parcelaIndex + '_acrescimos" ' +
            'name="' + window.portletNamespace + 'sobreOQueAplicado_' + descontoIndex + '_' + parcelaIndex + '" ' +
            'value="acrescimos" onchange="verificarCamposObrigatorios()">' +
            '<label class="form-check-label" for="' + window.portletNamespace + 'sobreOQueAplicado_' + descontoIndex + '_' + parcelaIndex + '_acrescimos">' +
            'Sobre multas, juros e demais acréscimos legais' +
            '</label>' +
            '</div>' +
            '<div class="form-check">' +
            '<input type="radio" class="form-check-input" ' +
            'id="' + window.portletNamespace + 'sobreOQueAplicado_' + descontoIndex + '_' + parcelaIndex + '_ambos" ' +
            'name="' + window.portletNamespace + 'sobreOQueAplicado_' + descontoIndex + '_' + parcelaIndex + '" ' +
            'value="ambos" onchange="verificarCamposObrigatorios()">' +
            '<label class="form-check-label" for="' + window.portletNamespace + 'sobreOQueAplicado_' + descontoIndex + '_' + parcelaIndex + '_ambos">' +
            'Ambos' +
            '</label>' +
            '</div>' +
            '</div>' +
            '</div>' +
            '</div>' +
            '<div class="col-md-3">' +
            '<div class="form-group">' +
            '<label>Classificação do crédito <span class="text-warning">*</span></label>' +
            '<select id="' + window.portletNamespace + 'classificacaoCredito_' + descontoIndex + '_' + parcelaIndex + '" ' +
            'class="form-control" multiple required onchange="verificarCamposObrigatorios()">' +
            '<option value="A">A - Crédito de liquidação provável</option>' +
            '<option value="B">B - Crédito de liquidação possível</option>' +
            '<option value="C">C - Crédito de difícil recuperação</option>' +
            '<option value="D">D - Crédito irrecuperável</option>' +
            '</select>' +
            '</div>' +
            '</div>' +
            '</div>' +
            '<button type="button" class="btn btn-sm btn-danger remove-parcela-btn" onclick="removerParcela(this)">' +
            '<i class="icon-trash"></i> Remover parcela' +
            '</button>';

    container.appendChild(newParcela);
    atualizarNumeracaoParcelas(descontoIndex);
    verificarCamposObrigatorios();
  }

  window.validarRangeParcelas = function(descontoIndex, parcelaIndex) {
    var minInput = document.getElementById(window.portletNamespace + 'quantidadeParcelasMin_' + descontoIndex + '_' + parcelaIndex);
    var maxInput = document.getElementById(window.portletNamespace + 'quantidadeParcelasMax_' + descontoIndex + '_' + parcelaIndex);

    if (!minInput || !maxInput) return;

    var minVal = parseInt(minInput.value) || 1;
    var maxVal = parseInt(maxInput.value) || 1;

    // Validar que min não seja maior que max
    if (minVal > maxVal) {
      maxInput.value = minVal;
    }

    // Validar limites
    if (minVal < 1) minInput.value = 1;
    if (maxVal > 1000) maxInput.value = 1000;

    // Se for a primeira tabela, salvar o máximo global
    var isFirstTable = document.querySelectorAll('.desconto-item-container').length === 1;
    if (isFirstTable) {
      var allMaxInputs = document.querySelectorAll('[id*="_quantidadeParcelasMax_"]');
      var maxValue = 0;
      allMaxInputs.forEach(function(input) {
        var val = parseInt(input.value) || 0;
        if (val > maxValue) maxValue = val;
      });
      window.maxParcelasGlobal = maxValue;
    }

    // Se não for a primeira tabela, aplicar o limite global
    if (!isFirstTable && window.maxParcelasGlobal) {
      if (maxVal > window.maxParcelasGlobal) {
        maxInput.value = window.maxParcelasGlobal;
        alert('O número máximo de parcelas não pode exceder ' + window.maxParcelasGlobal + ' (definido na primeira tabela)');
      }
    }

    verificarCamposObrigatorios();
  }

  window.removerParcela = function(button) {
    var container = button.closest('.parcela-item-container');
    if (container) {
      var descontoIndex = container.getAttribute('data-desconto-index');
      container.remove();
      atualizarNumeracaoParcelas(descontoIndex);
      verificarCamposObrigatorios();
    }
  }

  window.atualizarNumeracaoParcelas = function(descontoIndex) {
    var container = document.getElementById(window.portletNamespace + 'parcelasRepeater_' + descontoIndex);
    if (container) {
      var parcelas = container.querySelectorAll('.parcela-item-container');
      parcelas.forEach(function(parcela, index) {
        var indicator = parcela.querySelector('.parcela-indicator');
        if (indicator) {
          indicator.textContent = index + 1;
        }
      });
    }
  }

  // ========== FUNÇÕES DE DESCONTO ==========
  window.adicionarDesconto = function() {
    var container = document.getElementById(window.portletNamespace + 'descontoRepeater');
    var newDescontoIndex = window.descontoCount++;
    window.parcelaCounters[newDescontoIndex] = 1;

    var newDesconto = document.createElement('div');
    newDesconto.className = 'desconto-item-container';
    newDesconto.setAttribute('data-index', newDescontoIndex);

    var htmlContent =
            '<span class="desconto-indicator">' + (newDescontoIndex + 1) + '</span>' +
            '<div class="desconto-content">' +
            '<h5 class="desconto-title">Configuração de Desconto #' + (newDescontoIndex + 1) + '</h5>' +

            '<div class="form-group">' +
            '<label>Tipo de crédito <span class="text-warning">*</span></label>' +
            '<div>' +
            '<div class="form-check form-check-inline">' +
            '<input type="radio" class="form-check-input" id="' + window.portletNamespace + 'tipoCredito_' + newDescontoIndex + '_T" ' +
            'name="' + window.portletNamespace + 'tipoCredito_' + newDescontoIndex + '" value="T" required ' +
            'onchange="verificarCamposObrigatorios()">' +
            '<label class="form-check-label" for="' + window.portletNamespace + 'tipoCredito_' + newDescontoIndex + '_T">Tributária (T)</label>' +
            '</div>' +
            '<div class="form-check form-check-inline">' +
            '<input type="radio" class="form-check-input" id="' + window.portletNamespace + 'tipoCredito_' + newDescontoIndex + '_N" ' +
            'name="' + window.portletNamespace + 'tipoCredito_' + newDescontoIndex + '" value="N" ' +
            'onchange="verificarCamposObrigatorios()">' +
            '<label class="form-check-label" for="' + window.portletNamespace + 'tipoCredito_' + newDescontoIndex + '_N">Não tributária (N)</label>' +
            '</div>' +
            '<div class="form-check form-check-inline">' +
            '<input type="radio" class="form-check-input" id="' + window.portletNamespace + 'tipoCredito_' + newDescontoIndex + '_ambos" ' +
            'name="' + window.portletNamespace + 'tipoCredito_' + newDescontoIndex + '" value="ambos" ' +
            'onchange="verificarCamposObrigatorios()">' +
            '<label class="form-check-label" for="' + window.portletNamespace + 'tipoCredito_' + newDescontoIndex + '_ambos">Ambos</label>' +
            '</div>' +
            '</div>' +
            '</div>' +

            '<div class="empresaRegimeContainer" style="display: none;">' +
            '<div class="form-group">' +
            '<label>A empresa está em regime de falência ou de recuperação judicial ou extrajudicial ou liquidação judicial ou extrajudicial?</label>' +
            '<div>' +
            '<div class="form-check form-check-inline">' +
            '<input type="radio" class="form-check-input" id="' + window.portletNamespace + 'empresaRegime_' + newDescontoIndex + '_sim" ' +
            'name="' + window.portletNamespace + 'empresaRegime_' + newDescontoIndex + '" value="true">' +
            '<label class="form-check-label" for="' + window.portletNamespace + 'empresaRegime_' + newDescontoIndex + '_sim">Sim</label>' +
            '</div>' +
            '<div class="form-check form-check-inline">' +
            '<input type="radio" class="form-check-input" id="' + window.portletNamespace + 'empresaRegime_' + newDescontoIndex + '_nao" ' +
            'name="' + window.portletNamespace + 'empresaRegime_' + newDescontoIndex + '" value="false" checked>' +
            '<label class="form-check-label" for="' + window.portletNamespace + 'empresaRegime_' + newDescontoIndex + '_nao">Não</label>' +
            '</div>' +
            '</div>' +
            '</div>' +
            '</div>' +

            '<div class="form-group">' +
            '<label>Pequeno valor aplicável? <span class="text-warning">*</span></label>' +
            '<div>' +
            '<div class="form-check form-check-inline">' +
            '<input type="radio" class="form-check-input" id="' + window.portletNamespace + 'pequenoValorAplicavel_' + newDescontoIndex + '_sim" ' +
            'name="' + window.portletNamespace + 'pequenoValorAplicavel_' + newDescontoIndex + '" ' +
            'value="true" onclick="togglePequenoValor(' + newDescontoIndex + ', true)" ' +
            'onchange="verificarCamposObrigatorios()" required>' +
            '<label class="form-check-label" for="' + window.portletNamespace + 'pequenoValorAplicavel_' + newDescontoIndex + '_sim">Sim</label>' +
            '</div>' +
            '<div class="form-check form-check-inline">' +
            '<input type="radio" class="form-check-input" id="' + window.portletNamespace + 'pequenoValorAplicavel_' + newDescontoIndex + '_nao" ' +
            'name="' + window.portletNamespace + 'pequenoValorAplicavel_' + newDescontoIndex + '" ' +
            'value="false" onclick="togglePequenoValor(' + newDescontoIndex + ', false)" checked ' +
            'onchange="verificarCamposObrigatorios()">' +
            '<label class="form-check-label" for="' + window.portletNamespace + 'pequenoValorAplicavel_' + newDescontoIndex + '_nao">Não</label>' +
            '</div>' +
            '</div>' +
            '</div>' +

            '<div class="pequenoValorContainer" id="' + window.portletNamespace + 'pequenoValorContainer_' + newDescontoIndex + '" style="display: none;">' +
            '<div class="form-group">' +
            '<label>Pequeno valor <span class="text-warning">*</span></label>' +
            '<input type="text" id="' + window.portletNamespace + 'pequenoValor_' + newDescontoIndex + '" ' +
            'class="form-control money-mask" placeholder="R$ 0,00" oninput="verificarCamposObrigatorios()">' +
            '</div>' +
            '</div>' +

            '<div class="form-group">' +
            '<label>Transação envolve</label>' +
            '<select id="' + window.portletNamespace + 'transacaoEnvolve_' + newDescontoIndex + '" class="form-control" multiple>' +
            '<option value="pessoa_natural">Pessoa natural</option>' +
            '<option value="microempresa">Microempresa ou empresa de pequeno porte</option>' +
            '<option value="cooperativas">Sociedades cooperativas e demais organizações da sociedade civil (Lei nº 13.019/2014)</option>' +
            '<option value="instituicoes_ensino">Instituições de ensino</option>' +
            '<option value="mei">Microempreendedor individual</option>' +
            '</select>' +
            '</div>' +

            '<div class="parcelas-section">' +
            '<h6 class="parcelas-title">Configurações de Parcelas e Descontos</h6>' +
            '<div class="parcelas-repeater" id="' + window.portletNamespace + 'parcelasRepeater_' + newDescontoIndex + '">' +
            // Primeira parcela padrão
            '<div class="parcela-item-container" data-desconto-index="' + newDescontoIndex + '" data-parcela-index="0">' +
            '<span class="parcela-indicator">1</span>' +
            '<div class="row">' +
            '<div class="col-md-3">' +
            '<div class="form-group">' +
            '<label>Quantidade de parcelas <span class="text-warning">*</span></label>' +
            '<div class="parcelas-range-container">' +
            '<input type="number" ' +
            'id="' + window.portletNamespace + 'quantidadeParcelasMin_' + newDescontoIndex + '_0" ' +
            'class="form-control parcelas-input" ' +
            'min="1" max="1000" value="1" ' +
            'placeholder="Min" required ' +
            'onchange="validarRangeParcelas(' + newDescontoIndex + ', 0)" ' +
            'oninput="verificarCamposObrigatorios()">' +
            '<span class="parcelas-separator">-</span>' +
            '<input type="number" ' +
            'id="' + window.portletNamespace + 'quantidadeParcelasMax_' + newDescontoIndex + '_0" ' +
            'class="form-control parcelas-input" ' +
            'min="1" max="1000" value="1" ' +
            'placeholder="Max" required ' +
            'onchange="validarRangeParcelas(' + newDescontoIndex + ', 0)" ' +
            'oninput="verificarCamposObrigatorios()">' +
            '</div>' +
            '<small class="form-text text-muted">Apenas números inteiros (1 a 1000)</small>' +
            '</div>' +
            '</div>' +
            '<div class="col-md-3">' +
            '<div class="form-group">' +
            '<label>Porcentagem do desconto <span class="text-warning">*</span></label>' +
            '<input type="number" id="' + window.portletNamespace + 'porcentagemDesconto_' + newDescontoIndex + '_0" ' +
            'class="form-control" min="0" max="100" step="0.01" required ' +
            'oninput="verificarCamposObrigatorios()" ' +
            'placeholder="0 a 100">' +
            '<small class="form-text text-muted">A aplicação do percentual ocorrerá de acordo com o número de parcelas escolhido</small>' +
            '</div>' +
            '</div>' +
            '<div class="col-md-3">' +
            '<div class="form-group">' +
            '<label>Sobre o que é aplicado? <span class="text-warning">*</span></label>' +
            '<div>' +
            '<div class="form-check">' +
            '<input type="radio" class="form-check-input" ' +
            'id="' + window.portletNamespace + 'sobreOQueAplicado_' + newDescontoIndex + '_0_principal" ' +
            'name="' + window.portletNamespace + 'sobreOQueAplicado_' + newDescontoIndex + '_0" ' +
            'value="principal" required onchange="verificarCamposObrigatorios()">' +
            '<label class="form-check-label" for="' + window.portletNamespace + 'sobreOQueAplicado_' + newDescontoIndex + '_0_principal">' +
            'Sobre valor principal' +
            '</label>' +
            '</div>' +
            '<div class="form-check">' +
            '<input type="radio" class="form-check-input" ' +
            'id="' + window.portletNamespace + 'sobreOQueAplicado_' + newDescontoIndex + '_0_acrescimos" ' +
            'name="' + window.portletNamespace + 'sobreOQueAplicado_' + newDescontoIndex + '_0" ' +
            'value="acrescimos" onchange="verificarCamposObrigatorios()">' +
            '<label class="form-check-label" for="' + window.portletNamespace + 'sobreOQueAplicado_' + newDescontoIndex + '_0_acrescimos">' +
            'Sobre multas, juros e demais acréscimos legais' +
            '</label>' +
            '</div>' +
            '<div class="form-check">' +
            '<input type="radio" class="form-check-input" ' +
            'id="' + window.portletNamespace + 'sobreOQueAplicado_' + newDescontoIndex + '_0_ambos" ' +
            'name="' + window.portletNamespace + 'sobreOQueAplicado_' + newDescontoIndex + '_0" ' +
            'value="ambos" onchange="verificarCamposObrigatorios()">' +
            '<label class="form-check-label" for="' + window.portletNamespace + 'sobreOQueAplicado_' + newDescontoIndex + '_0_ambos">' +
            'Ambos' +
            '</label>' +
            '</div>' +
            '</div>' +
            '</div>' +
            '</div>' +
            '<div class="col-md-3">' +
            '<div class="form-group">' +
            '<label>Classificação do crédito <span class="text-warning">*</span></label>' +
            '<select id="' + window.portletNamespace + 'classificacaoCredito_' + newDescontoIndex + '_0" ' +
            'class="form-control" multiple required onchange="verificarCamposObrigatorios()">' +
            '<option value="A">A - Crédito de liquidação provável</option>' +
            '<option value="B">B - Crédito de liquidação possível</option>' +
            '<option value="C">C - Crédito de difícil recuperação</option>' +
            '<option value="D">D - Crédito irrecuperável</option>' +
            '</select>' +
            '</div>' +
            '</div>' +
            '</div>' +
            '<button type="button" class="btn btn-sm btn-danger remove-parcela-btn" onclick="removerParcela(this)">' +
            '<i class="icon-trash"></i> Remover parcela' +
            '</button>' +
            '</div>' +
            '</div>' +
            '<button type="button" class="btn btn-sm btn-success add-parcela-btn" ' +
            'onclick="adicionarParcela(' + newDescontoIndex + ')">' +
            '<i class="icon-plus"></i> Adicionar configuração de parcela' +
            '</button>' +
            '</div>' +

            '<hr class="section-divider"/>' +

            '<button type="button" class="btn btn-danger btn-sm remove-desconto-btn" onclick="removerDesconto(this)">' +
            '<i class="icon-trash"></i> Remover esta configuração de desconto' +
            '</button>' +
            '</div>';

    newDesconto.innerHTML = htmlContent;
    container.appendChild(newDesconto);

    checkCNPJStatus();
    aplicarMascaraMonetaria();
    atualizarNumeracaoDescontos();
    verificarCamposObrigatorios();
  }

  window.removerDesconto = function(button) {
    var container = button.closest('.desconto-item-container');
    if (container) {
      var index = container.getAttribute('data-index');
      delete window.parcelaCounters[index];
      container.remove();

      atualizarNumeracaoDescontos();
      verificarCamposObrigatorios();
    }
  }

  window.atualizarNumeracaoDescontos = function() {
    var descontos = document.querySelectorAll('.desconto-item-container');
    descontos.forEach(function(desconto, index) {
      var indicator = desconto.querySelector('.desconto-indicator');
      if (indicator) {
        indicator.textContent = index + 1;
      }

      var titulo = desconto.querySelector('.desconto-title');
      if (titulo) {
        titulo.textContent = 'Configuração de Desconto #' + (index + 1);
      }
    });
  }

  // ========== VERIFICAR CAMPOS OBRIGATÓRIOS (CORRIGIDA) ==========
  function verificarCamposObrigatorios() {
    var todosPreenchidos = true;
    var aplicaDesconto = document.querySelector('input[name="' + window.portletNamespace + 'aplicaDesconto"]:checked');

    if (aplicaDesconto && aplicaDesconto.value === 'true') {
      // Verificar se há pelo menos um desconto
      var descontos = document.querySelectorAll('.desconto-item-container');
      if (descontos.length === 0) {
        todosPreenchidos = false;
      } else {
        // Verificar campos obrigatórios em cada desconto
        descontos.forEach(function(desconto) {
          var descontoIndex = desconto.getAttribute('data-index');

          // Verificar tipo de crédito
          if (!getRadioValue('tipoCredito_' + descontoIndex)) {
            todosPreenchidos = false;
          }

          // Verificar pequeno valor aplicável
          if (!getRadioValue('pequenoValorAplicavel_' + descontoIndex)) {
            todosPreenchidos = false;
          }

          // Se pequeno valor aplicável = sim, verificar se tem valor
          if (getRadioValue('pequenoValorAplicavel_' + descontoIndex) === 'true') {
            var pequenoValor = document.getElementById(window.portletNamespace + 'pequenoValor_' + descontoIndex);
            if (!pequenoValor || !pequenoValor.value || obterValorMonetario(pequenoValor) <= 0) {
              todosPreenchidos = false;
            }
          }

          // Verificar parcelas
          var parcelas = desconto.querySelectorAll('.parcela-item-container');
          if (parcelas.length === 0) {
            todosPreenchidos = false;
          } else {
            parcelas.forEach(function(parcela) {
              var descontoIdx = parcela.getAttribute('data-desconto-index');
              var parcelaIdx = parcela.getAttribute('data-parcela-index');

              // Verificar quantidade de parcelas MIN
              var qtdParcelasMin = document.getElementById(window.portletNamespace + 'quantidadeParcelasMin_' + descontoIdx + '_' + parcelaIdx);
              if (!qtdParcelasMin || !qtdParcelasMin.value) {
                todosPreenchidos = false;
              }

              // Verificar quantidade de parcelas MAX
              var qtdParcelasMax = document.getElementById(window.portletNamespace + 'quantidadeParcelasMax_' + descontoIdx + '_' + parcelaIdx);
              if (!qtdParcelasMax || !qtdParcelasMax.value) {
                todosPreenchidos = false;
              }

              // Verificar porcentagem
              var porcentagem = document.getElementById(window.portletNamespace + 'porcentagemDesconto_' + descontoIdx + '_' + parcelaIdx);
              if (!porcentagem || !porcentagem.value) {
                todosPreenchidos = false;
              }

              // Verificar sobre o que é aplicado
              if (!getRadioValue('sobreOQueAplicado_' + descontoIdx + '_' + parcelaIdx)) {
                todosPreenchidos = false;
              }

              // Verificar classificação
              var classificacao = getMultiSelectValues('classificacaoCredito_' + descontoIdx + '_' + parcelaIdx);
              if (!classificacao || classificacao.length === 0) {
                todosPreenchidos = false;
              }
            });
          }
        });
      }
    }

    // Habilitar/desabilitar botão de visualizar tabela
    var btnVisualizar = document.getElementById(window.portletNamespace + 'visualizarTabelaBtn');
    if (btnVisualizar) {
      btnVisualizar.disabled = !todosPreenchidos;
    }

    return todosPreenchidos;
  }

  // ========== FUNÇÕES AUXILIARES ==========
  function checkCNPJStatus() {
    var aplicavelPara = document.querySelector('input[name="' + window.portletNamespace + 'aplicavelPara"]:checked');
    if (aplicavelPara) {
      var empresaRegimeContainers = document.querySelectorAll('.empresaRegimeContainer');

      empresaRegimeContainers.forEach(function(container) {
        container.style.display = (aplicavelPara.value === 'CNPJ' || aplicavelPara.value === 'ambos') ? 'block' : 'none';
      });
    }
  }

  // ========== INICIALIZAÇÃO ==========
  document.addEventListener('DOMContentLoaded', function() {
    // Aplicar máscara monetária aos campos existentes
    aplicarMascaraMonetaria();

    // Se aplicaDesconto for true na edição, mostra o container e adiciona um desconto
    var aplicaDescontoSim = document.querySelector('input[name="<portlet:namespace />aplicaDesconto"][value="true"]');
    if (aplicaDescontoSim && aplicaDescontoSim.checked) {
      toggleDescontoFields(true);
      // Adiciona um desconto padrão se não houver nenhum
      if (document.querySelectorAll('.desconto-item-container').length === 0) {
        adicionarDesconto();
      }
    }

    // Adicionar listener para mudanças nos campos required
    document.addEventListener('change', verificarCamposObrigatorios);
    document.addEventListener('input', verificarCamposObrigatorios);
  });
</script>

<!-- LIFERAY SCRIPT -->
<aui:script>
  Liferay.on('allPortletsReady', function() {
  // Listener para aplicável CPF/CNPJ
  var radiosAplicavel = document.querySelectorAll('input[name="<portlet:namespace />aplicavelPara"]');
  radiosAplicavel.forEach(function(radio) {
  radio.addEventListener('change', checkCNPJStatus);
  });

  // Listener para valores mínimos por tipo CNPJ
  var especificarSelect = document.getElementById('<portlet:namespace />especificarValorMinimoCNPJ');
  if (especificarSelect) {
  especificarSelect.addEventListener('change', updateValoresMinimosCNPJ);
  }

  // Validação de datas
  document.addEventListener('change', function(e) {
  if (e.target.name && (e.target.name.includes('dataFim') || e.target.name.includes('dataPublicacao'))) {
  var dataInicio = getDateFromInputs('dataInicio');
  var dataFim = getDateFromInputs('dataFim');
  var dataPublicacao = getDateFromInputs('dataPublicacao');

  if (dataFim && dataInicio && dataFim <= dataInicio) {
  alert('A data de fim da vigência deve ser maior que a data de início');
  e.target.value = '';
  }

  if (dataPublicacao && dataInicio && dataPublicacao > dataInicio) {
  alert('A data de publicação não pode ser maior que a data de início da vigência');
  e.target.value = '';
  }
  }
  });
  });
</aui:script>

<!-- CSS (mantido igual ao original) -->
<style>
  /* CSS mantido exatamente igual ao original para preservar o layout */
  /* ========== LAYOUT BASE ========== */
  .sheet {
    max-width: 1200px;
    margin: 0 auto;
    padding: 2rem;
  }

  .sheet-section {
    margin-bottom: 3rem;
    padding-bottom: 2rem;
    border-bottom: 1px solid #e9ecef;
  }

  .sheet-section:last-child {
    border-bottom: none;
  }

  .sheet-subtitle {
    margin-bottom: 1.5rem;
    color: #343a40;
    font-size: 1.3rem;
    font-weight: 600;
    border-left: 4px solid #007bff;
    padding-left: 1rem;
  }

  /* ========== GRID E LAYOUT DOS CAMPOS ========== */
  .form-row {
    display: flex;
    flex-wrap: wrap;
    margin: 0 -0.75rem;
    gap: 0;
  }

  .form-col {
    flex: 0 0 100%;
    max-width: 100%;
    padding: 0 0.75rem;
    margin-bottom: 1.5rem;
  }

  .form-col-6 {
    flex: 0 0 50%;
    max-width: 50%;
  }

  .form-col-4 {
    flex: 0 0 33.333333%;
    max-width: 33.333333%;
  }

  .form-col-3 {
    flex: 0 0 25%;
    max-width: 25%;
  }

  .form-col-8 {
    flex: 0 0 66.666667%;
    max-width: 66.666667%;
  }

  /* ========== FORMULÁRIO BÁSICO ========== */
  .form-group {
    margin-bottom: 1.5rem;
  }

  .form-group label {
    font-weight: 500;
    color: #495057;
    margin-bottom: 0.5rem;
    display: block;
  }

  .form-control {
    border: 1px solid #ced4da;
    border-radius: 0.375rem;
    padding: 0.5rem 0.75rem;
    transition: border-color 0.15s ease-in-out, box-shadow 0.15s ease-in-out;
  }

  .form-control:focus {
    border-color: #80bdff;
    box-shadow: 0 0 0 0.2rem rgba(0, 123, 255, 0.25);
    outline: 0;
  }

  .form-text {
    font-size: 0.875rem;
    color: #6c757d;
    margin-top: 0.25rem;
  }

  /* Campos obrigatórios */
  .text-warning {
    color: #dc3545 !important;
  }

  /* ========== MULTISELECT MELHORADO ========== */
  .enhanced-multiselect {
    border: 1px solid #ced4da;
    border-radius: 0.375rem;
    padding: 0.5rem;
    min-height: 120px;
    background-color: #fff;
    transition: border-color 0.15s ease-in-out, box-shadow 0.15s ease-in-out;
  }

  .enhanced-multiselect:focus {
    border-color: #80bdff;
    box-shadow: 0 0 0 0.2rem rgba(0, 123, 255, 0.25);
    outline: 0;
  }

  .enhanced-multiselect option:checked {
    background: #007bff;
    color: white;
  }

  .enhanced-multiselect optgroup {
    font-weight: 600;
    color: #495057;
    background-color: #f8f9fa;
    padding: 0.5rem;
    border-bottom: 1px solid #dee2e6;
  }

  /* ========== SEARCH CONTAINER SIMPLIFICADO ========== */
  .multiselect-search-container {
    background-color: #f8f9fa;
    padding: 1rem;
    border-radius: 0.375rem;
    border: 1px solid #dee2e6;
    margin-top: 0.75rem;
  }

  .multiselect-actions {
    display: flex;
    flex-wrap: wrap;
    gap: 0.5rem;
    margin-top: 0.75rem;
  }

  .multiselect-actions .btn {
    padding: 0.25rem 0.75rem;
    font-size: 0.875rem;
    border-radius: 0.25rem;
  }

  .multiselect-counter {
    text-align: center;
    padding: 0.5rem;
    background-color: #e7f3ff;
    border-radius: 0.25rem;
    margin-top: 0.5rem;
  }

  .multiselect-counter span {
    font-weight: 600;
    color: #0056b3;
  }

  /* ========== CONTAINERS DE DESCONTO ========== */
  .desconto-item-container {
    background: #f8f9fa;
    border: 1px solid #dee2e6;
    border-radius: 0.5rem;
    padding: 1.5rem;
    margin-bottom: 1.5rem;
    position: relative;
    box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
  }

  .desconto-content {
    padding-left: 2.5rem;
  }

  .desconto-title {
    color: #495057;
    font-size: 1.1rem;
    font-weight: 600;
    margin-bottom: 1.5rem;
    padding-bottom: 0.75rem;
    border-bottom: 2px solid #007bff;
  }

  /* ========== SEÇÃO DE PARCELAS ========== */
  .parcelas-section {
    background: #fff;
    border: 1px solid #e9ecef;
    border-radius: 0.5rem;
    padding: 1.5rem;
    margin-top: 1.5rem;
    box-shadow: 0 1px 3px rgba(0, 0, 0, 0.1);
  }

  .parcelas-title {
    color: #6c757d;
    font-size: 1rem;
    font-weight: 600;
    margin-bottom: 1.25rem;
    padding-bottom: 0.5rem;
    border-bottom: 1px solid #e9ecef;
  }

  .parcela-item-container {
    background: #f8f9fa;
    border: 1px solid #e9ecef;
    border-radius: 0.5rem;
    padding: 1.25rem;
    margin-bottom: 1rem;
    position: relative;
  }

  .parcela-item-container .row {
    margin-left: 2rem;
  }

  /* ========== INDICADORES MELHORADOS ========== */
  .desconto-indicator {
    position: absolute;
    left: 0.75rem;
    top: 1.5rem;
    width: 1.75rem;
    height: 1.75rem;
    background: linear-gradient(135deg, #007bff, #0056b3);
    color: white;
    border-radius: 50%;
    display: flex;
    align-items: center;
    justify-content: center;
    font-size: 0.875rem;
    font-weight: 600;
    box-shadow: 0 2px 4px rgba(0, 123, 255, 0.3);
  }

  .parcela-indicator {
    position: absolute;
    left: 0.5rem;
    top: 1.25rem;
    width: 1.5rem;
    height: 1.5rem;
    background: linear-gradient(135deg, #28a745, #1e7e34);
    color: white;
    border-radius: 50%;
    display: flex;
    align-items: center;
    justify-content: center;
    font-size: 0.75rem;
    font-weight: 600;
    box-shadow: 0 1px 3px rgba(40, 167, 69, 0.3);
  }

  /* ========== RANGE DE PARCELAS ========== */
  .parcelas-range-container {
    display: flex;
    align-items: center;
    gap: 0.5rem;
  }

  .parcelas-input {
    flex: 1;
    min-width: 80px;
  }

  .parcelas-separator {
    color: #6c757d;
    font-weight: 600;
    padding: 0 0.25rem;
  }

  /* ========== BOTÕES MELHORADOS ========== */
  .btn {
    border-radius: 0.375rem;
    font-weight: 500;
    transition: all 0.15s ease-in-out;
  }

  .btn:hover {
    transform: translateY(-1px);
    box-shadow: 0 4px 8px rgba(0, 0, 0, 0.15);
  }

  .btn-success {
    background: #28a745;
    border: none;
  }

  .btn-info {
    background: #2e5aac;
    border: none;
  }

  .btn-info:disabled {
    opacity: 0.6;
    cursor: not-allowed;
    transform: none;
    box-shadow: none;
  }

  /* ========== CONTAINER DE VALORES MÍNIMOS ========== */
  #<portlet:namespace />valoresMinimosCNPJContainer {
    background: #f8f9fa;
    padding: 1.5rem;
    border-radius: 0.5rem;
    border: 1px solid #dee2e6;
    margin-top: 1rem;
  }

  .valor-minimo-cnpj-field {
    background: #fff;
    padding: 1rem;
    margin-bottom: 1rem;
    border-radius: 0.375rem;
    border: 1px solid #e9ecef;
    box-shadow: 0 1px 2px rgba(0, 0, 0, 0.05);
  }

  .valor-minimo-cnpj-field:last-child {
    margin-bottom: 0;
  }

  /* ========== RADIO E CHECKBOX INLINE ========== */
  .form-check-inline {
    display: inline-flex;
    align-items: center;
    margin-right: 1rem;
    margin-bottom: 0.5rem;
  }

  .form-check-input {
    margin-right: 0.5rem;
  }

  /* ========== MODAIS ========== */
  .modal-body table {
    margin-bottom: 1.5rem;
  }

  .modal-body h6 {
    color: #495057;
    font-weight: 600;
    margin-top: 1rem;
    margin-bottom: 0.5rem;
    padding-left: 0.5rem;
    border-left: 3px solid #007bff;
  }

  .modal-body h6:first-child {
    margin-top: 0;
  }

  /* ========== ALERTAS MELHORADOS ========== */
  .alert {
    border-radius: 0.5rem;
    border: none;
    box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
  }

  .alert-warning {
    background: linear-gradient(135deg, #fff3cd, #ffeaa7);
    color: #856404;
  }

  .alert-info {
    background: linear-gradient(135deg, #d1ecf1, #a8e6f1);
    color: #0c5460;
  }

  /* ========== SECTION DIVIDER ========== */
  .section-divider {
    border: none;
    height: 2px;
    background: linear-gradient(to right, #dee2e6, #007bff, #dee2e6);
    margin: 2rem 0;
  }

  /* ========== RESPONSIVIDADE MELHORADA ========== */
  @media (max-width: 992px) {
    .form-col-4,
    .form-col-3 {
      flex: 0 0 50%;
      max-width: 50%;
    }
  }

  @media (max-width: 768px) {
    .sheet {
      padding: 1rem;
    }

    .form-col,
    .form-col-6,
    .form-col-4,
    .form-col-3,
    .form-col-8 {
      flex: 0 0 100%;
      max-width: 100%;
    }

    .parcela-item-container .row {
      margin-left: 1.5rem;
    }

    .desconto-content {
      padding-left: 2rem;
    }

    .form-check-inline {
      display: block;
      margin-bottom: 0.75rem;
    }

    .multiselect-actions {
      flex-direction: column;
    }

    .multiselect-actions .btn {
      width: 100%;
    }

    .parcelas-range-container {
      flex-direction: column;
      align-items: stretch;
    }

    .parcelas-separator {
      text-align: center;
      padding: 0.25rem 0;
    }
  }

  @media (max-width: 576px) {
    .sheet-subtitle {
      font-size: 1.1rem;
      padding-left: 0.75rem;
      border-left-width: 3px;
    }

    .enhanced-multiselect {
      min-height: 100px;
    }
  }

  /* ========== MELHORIAS GERAIS ========== */
  /* Remove spinner em campos numéricos */
  input[type="number"]::-webkit-inner-spin-button,
  input[type="number"]::-webkit-outer-spin-button {
    -webkit-appearance: none;
    margin: 0;
  }

  input[type="number"] {
    -moz-appearance: textfield;
  }

  /* Estados de validação */
  .form-group.has-error .form-control,
  .form-group.has-error .enhanced-multiselect {
    border-color: #dc3545;
  }

  .form-group.has-error .form-control:focus,
  .form-group.has-error .enhanced-multiselect:focus {
    box-shadow: 0 0 0 0.2rem rgba(220, 53, 69, 0.25);
  }

  /* Smooth transitions */
  * {
    box-sizing: border-box;
  }

  .form-control,
  .enhanced-multiselect,
  .btn,
  .multiselect-search-container,
  .alert {
    transition: all 0.2s ease-in-out;
  }

  /* Input groups melhorados */
  .input-group-addon {
    background: linear-gradient(135deg, #007bff, #0056b3);
    color: white;
    border: 1px solid #007bff;
    font-weight: 500;
  }

  /* Focus ring personalizado */
  .form-control:focus,
  .enhanced-multiselect:focus,
  .btn:focus {
    outline: none;
    box-shadow: 0 0 0 0.2rem rgba(0, 123, 255, 0.25);
  }

  /* Máscara monetária */
  .money-mask {
    text-align: right;
  }

  .money-mask:focus {
    text-align: left;
  }
</style>
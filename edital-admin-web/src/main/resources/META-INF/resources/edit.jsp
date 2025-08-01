<%@ include file="/init.jsp" %>

<%@ page import="br.com.seatecnologia.gdf.negocia.model.Edital" %>
<%@ page import="com.liferay.portal.kernel.util.Validator" %>

<%
    long editalId = ParamUtil.getLong(request, "editalId");
    String backURL = ParamUtil.getString(request, "backURL", themeDisplay.getURLCurrent());

    Edital edital = null;
    Calendar dataInicioCalendar = null;
    Calendar dataFimCalendar = null;

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

    <!-- Disclaimer -->
    <div class="alert alert-warning">
      <strong>Atenção:</strong> Propostas por edital não geram processo no SEI, via de regra. No entanto, caso a negociação envolva dívidas em situação "parcelado" e/ou o devedor seja:
      <ul class="mt-2">
        <li>Pessoa natural</li>
        <li>Microempresa (ME) ou Empresa de Pequeno Porte (EPP)</li>
        <li>Sociedade cooperativa</li>
        <li>Organização da sociedade civil nos termos da Lei nº 13.019/2014</li>
        <li>Instituição de ensino</li>
        <li>Microempreendedor Individual (MEI)</li>
        <li>Empresa em regime de falência, recuperação judicial ou extrajudicial</li>
      </ul>
      um processo será gerado automaticamente no SEI.
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
        />

        <!-- Campo sem name - não será enviado -->
        <div class="form-group">
          <label for="<portlet:namespace />anoEdital">Ano do edital <span class="text-warning">*</span></label>
          <input
            id="<portlet:namespace />anoEdital"
            type="number"
            class="form-control"
            value="<%= Calendar.getInstance().get(Calendar.YEAR) %>"
            required
            maxLength="4"
          />
          <small class="form-text text-muted">Exemplo: 2025</small>
        </div>
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
          <p class="text-muted small">Último dia para que o requerente selecione o edital, preencha e envie o formulário de proposta individual</p>
          <liferay-ui:input-date
              name="dataFim"
              dayValue="<%= (dataFimCalendar != null) ? dataFimCalendar.get(Calendar.DAY_OF_MONTH) : 0 %>"
              monthValue="<%= (dataFimCalendar != null) ? dataFimCalendar.get(Calendar.MONTH) : 0 %>"
              yearValue="<%= (dataFimCalendar != null) ? dataFimCalendar.get(Calendar.YEAR) : 0 %>"
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

        <!-- Campos sem name - não serão enviados -->
        <div class="form-group">
          <label for="<portlet:namespace />receitas">Receita <span class="text-warning">*</span></label>
          <select
            id="<portlet:namespace />receitas"
            class="form-control"
            multiple="true"
            required="true"
          >
            <option value="941">941 - ISS</option>
            <option value="944">944 - TRSD</option>
          </select>
          <small class="form-text text-muted">Exemplo: 941 - ISS, 944 - TRSD</small>
        </div>

        <div class="form-group">
          <label for="<portlet:namespace />tipos">Tipo <span class="text-warning">*</span></label>
          <select
            id="<portlet:namespace />tipos"
            class="form-control"
            multiple="true"
            required="true"
          >
            <option value="divida_ativa">Dívida Ativa</option>
          </select>
          <small class="form-text text-muted">Exemplo: dívida ativa</small>
        </div>

        <div class="form-group">
          <label for="<portlet:namespace />situacoes">Situação <span class="text-warning">*</span></label>
          <select
            id="<portlet:namespace />situacoes"
            class="form-control"
            multiple="true"
            required="true"
          >
            <option value="00">00 - Aberto</option>
          </select>
          <small class="form-text text-muted">Exemplo: 00 - Aberto</small>
        </div>

        <div class="form-group">
          <div class="form-check">
            <input
              type="checkbox"
              class="form-check-input"
              id="<portlet:namespace />judicializada"
              value="true"
            />
            <label class="form-check-label" for="<portlet:namespace />judicializada">
              Judicializada
            </label>
          </div>
        </div>

        <div class="form-group">
          <label for="<portlet:namespace />valorMinimoElegivel">Valor mínimo para estar elegível</label>
          <input
            type="text"
            id="<portlet:namespace />valorMinimoElegivel"
            class="form-control money-input"
          />
          <small class="form-text text-muted">Para utilizar este edital, é necessário que a soma das dívidas elegíveis atinja o valor mínimo estipulado.</small>
        </div>

        <div class="form-group">
          <label for="<portlet:namespace />aplicavelPara">Aplicável para CPF/CNPJ <span class="text-warning">*</span></label>
          <select
            id="<portlet:namespace />aplicavelPara"
            class="form-control"
            multiple="true"
            required="true"
          >
            <option value="CPF">CPF</option>
            <option value="CNPJ">CNPJ</option>
          </select>
          <small class="form-text text-muted">Defina se o edital está disponível para usuários com CPF, CNPJ ou ambos. O sistema utilizará essa configuração para verificar se o tipo de usuário logado é elegível.</small>
        </div>
      </div>

      <!-- DESCONTOS E PARCELAS -->
      <div class="sheet-section">
        <h3 class="sheet-subtitle">Descontos e Parcelas</h3>

        <div class="form-group">
          <label>Este edital aplica algum tipo de desconto para dívidas elegíveis? <span class="text-warning">*</span></label>
          <div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                id="<portlet:namespace />aplicaDescontoSim"
                value="true"
                onclick="toggleDescontoFields(true)"
              />
              <label class="form-check-label" for="<portlet:namespace />aplicaDescontoSim">
                Sim
              </label>
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                id="<portlet:namespace />aplicaDescontoNao"
                value="false"
                checked
                onclick="toggleDescontoFields(false)"
              />
              <label class="form-check-label" for="<portlet:namespace />aplicaDescontoNao">
                Não
              </label>
            </div>
          </div>
        </div>

        <!-- Container para elementos repetíveis de desconto -->
        <div id="<portlet:namespace />descontoContainer" style="display: none;">
          <liferay-frontend:fieldset-group>
            <liferay-frontend:fieldset collapsible="<%= true %>" label="Configurações de Desconto">

              <div class="alert alert-info mb-3">
                <strong>Instruções:</strong>
                <ul class="mb-0 mt-2">
                  <li>Cada <strong>Configuração de Desconto</strong> representa um conjunto de regras diferentes</li>
                  <li>Dentro de cada configuração, você pode adicionar múltiplas <strong>Configurações de Parcelas</strong></li>
                  <li>Use os botões verdes para adicionar novos itens</li>
                  <li>Use os botões vermelhos para remover itens</li>
                </ul>
              </div>

              <div id="<portlet:namespace />descontoRepeater">
                <% int descontoCount = 1; %>

                <c:forEach begin="0" end="<%= descontoCount - 1 %>" var="descontoIndex">
                  <div class="desconto-item-container" data-index="${descontoIndex}">
                    <span class="desconto-indicator">${descontoIndex + 1}</span>
                    <div class="desconto-content">
                      <h5 class="desconto-title">Configuração de Desconto #${descontoIndex + 1}</h5>

                      <div class="form-group">
                        <label>Tipo de crédito <span class="text-warning">*</span></label>
                        <select
                          id="<portlet:namespace />tipoCredito_${descontoIndex}"
                          class="form-control"
                          multiple="true"
                          required="true"
                        >
                          <option value="T">Tributária (T)</option>
                          <option value="N">Não tributária (N)</option>
                        </select>
                      </div>

                      <div class="empresaRegimeContainer" style="display: none;">
                        <div class="form-group">
                          <label>A empresa está em regime de falência ou de recuperação judicial ou extrajudicial?</label>
                          <div>
                            <div class="form-check form-check-inline">
                              <input type="radio" class="form-check-input" id="<portlet:namespace />empresaRegime_${descontoIndex}_sim" value="true">
                              <label class="form-check-label" for="<portlet:namespace />empresaRegime_${descontoIndex}_sim">Sim</label>
                            </div>
                            <div class="form-check form-check-inline">
                              <input type="radio" class="form-check-input" id="<portlet:namespace />empresaRegime_${descontoIndex}_nao" value="false" checked>
                              <label class="form-check-label" for="<portlet:namespace />empresaRegime_${descontoIndex}_nao">Não</label>
                            </div>
                          </div>
                        </div>
                      </div>

                      <div class="form-group">
                        <label>Pequeno valor aplicável? <span class="text-warning">*</span></label>
                        <div>
                          <div class="form-check form-check-inline">
                            <input
                              type="radio"
                              class="form-check-input"
                              id="<portlet:namespace />pequenoValorAplicavel_${descontoIndex}_sim"
                              value="true"
                              onclick="togglePequenoValor(${descontoIndex}, true)"
                            >
                            <label class="form-check-label" for="<portlet:namespace />pequenoValorAplicavel_${descontoIndex}_sim">
                              Sim
                            </label>
                          </div>
                          <div class="form-check form-check-inline">
                            <input
                              type="radio"
                              class="form-check-input"
                              id="<portlet:namespace />pequenoValorAplicavel_${descontoIndex}_nao"
                              value="false"
                              checked
                              onclick="togglePequenoValor(${descontoIndex}, false)"
                            >
                            <label class="form-check-label" for="<portlet:namespace />pequenoValorAplicavel_${descontoIndex}_nao">
                              Não
                            </label>
                          </div>
                        </div>
                      </div>

                      <div class="pequenoValorContainer" id="<portlet:namespace />pequenoValorContainer_${descontoIndex}" style="display: none;">
                        <div class="form-group">
                          <label>Pequeno valor <span class="text-warning">*</span></label>
                          <input
                            type="text"
                            id="<portlet:namespace />pequenoValor_${descontoIndex}"
                            class="form-control money-input"
                            required="true"
                          />
                        </div>
                      </div>

                      <div class="form-group">
                        <label>Transação envolve</label>
                        <select
                          id="<portlet:namespace />transacaoEnvolve_${descontoIndex}"
                          class="form-control"
                          multiple="true"
                        >
                          <option value="pessoa_natural">Pessoa natural</option>
                          <option value="microempresa">Microempresa ou empresa de pequeno porte</option>
                          <option value="cooperativas">Sociedades cooperativas e demais organizações da sociedade civil de que trata a Lei nº 13.019, de 31 de julho de 2014</option>
                          <option value="instituicoes_ensino">Instituições de ensino</option>
                          <option value="mei">Microempreendedor individual</option>
                        </select>
                      </div>

                      <!-- PACOTES DE PARCELAS (ELEMENTO REPETÍVEL INTERNO) -->
                      <div class="parcelas-section">
                        <h6 class="parcelas-title">Configurações de Parcelas e Descontos</h6>

                        <div class="parcelas-repeater" id="<portlet:namespace />parcelasRepeater_${descontoIndex}">
                          <c:forEach begin="0" end="0" var="parcelaIndex">
                            <div class="parcela-item-container" data-desconto-index="${descontoIndex}" data-parcela-index="${parcelaIndex}">
                              <span class="parcela-indicator">${parcelaIndex + 1}</span>
                              <div class="row">
                                <div class="col-md-3">
                                  <div class="form-group">
                                    <label>Quantidade de parcelas</label>
                                    <input
                                      type="range"
                                      id="<portlet:namespace />quantidadeParcelas_${descontoIndex}_${parcelaIndex}"
                                      min="1"
                                      max="120"
                                      value="1"
                                      class="form-control-range parcelas-range"
                                      data-target="parcelasValue_${descontoIndex}_${parcelaIndex}"
                                    >
                                    <span id="parcelasValue_${descontoIndex}_${parcelaIndex}" class="parcelas-value">1</span> parcela(s)
                                  </div>
                                </div>

                                <div class="col-md-3">
                                  <div class="form-group">
                                    <label>% Desconto</label>
                                    <input
                                      type="number"
                                      id="<portlet:namespace />porcentagemDesconto_${descontoIndex}_${parcelaIndex}"
                                      class="form-control"
                                      min="0"
                                      max="100"
                                    />
                                  </div>
                                </div>

                                <div class="col-md-3">
                                  <div class="form-group">
                                    <label>Aplicar sobre</label>
                                    <select
                                      id="<portlet:namespace />sobreOQueAplicado_${descontoIndex}_${parcelaIndex}"
                                      class="form-control"
                                      multiple="true"
                                    >
                                      <option value="principal">Valor principal</option>
                                      <option value="acrescimos">Multas e juros</option>
                                    </select>
                                  </div>
                                </div>

                                <div class="col-md-3">
                                  <div class="form-group">
                                    <label>Rating</label>
                                    <select
                                      id="<portlet:namespace />classificacaoCredito_${descontoIndex}_${parcelaIndex}"
                                      class="form-control"
                                      multiple="true"
                                    >
                                      <option value="A">A</option>
                                      <option value="B">B</option>
                                      <option value="C">C</option>
                                      <option value="D">D</option>
                                    </select>
                                  </div>
                                </div>
                              </div>

                              <button type="button" class="btn btn-sm btn-danger remove-parcela-btn" onclick="removerParcela(this)">
                                <i class="icon-trash"></i> Remover parcela
                              </button>
                            </div>
                          </c:forEach>
                        </div>

                        <button type="button" class="btn btn-sm btn-success add-parcela-btn" onclick="adicionarParcela(${descontoIndex})">
                          <i class="icon-plus"></i> Adicionar configuração de parcela
                        </button>
                      </div>

                      <hr class="section-divider"/>

                      <c:if test="${descontoIndex > 0}">
                        <button type="button" class="btn btn-danger btn-sm remove-desconto-btn" onclick="removerDesconto(this)">
                          <i class="icon-trash"></i> Remover esta configuração de desconto
                        </button>
                      </c:if>
                    </div>
                  </div>
                </c:forEach>
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

        <div class="form-group">
          <label for="<portlet:namespace />requerimento">Requerimento <span class="text-warning">*</span></label>
                <aui:input
                  name="requerimento"
                  label="Requerimento"
                  type="textarea"
                  required="true"
                  maxLength="400"
                  rows="5"
                  cssClass="form-control"
                  helpMessage="Para que o termo gerado traga os dados corretos na seção 'Requerimento', este campo precisa ser preenchido conforme o exemplo acima."
                >
                  <aui:validator name="required" />
                  <aui:validator name="maxLength">400</aui:validator>
                </aui:input>
          <small class="form-text text-muted">Para que o termo gerado traga os dados corretos na seção 'Requerimento', este campo precisa ser preenchido conforme o exemplo acima.</small>
        </div>
      </div>

      <aui:button-row cssClass="d-flex justify-content-end mt-4">
        <a class="btn btn-secondary mr-2" href="<%= backURL %>">Cancelar</a>
        <aui:button type="submit" value="Salvar" cssClass="btn-primary" />
      </aui:button-row>
    </aui:form>
  </div>
</div>

<!-- JAVASCRIPT -->
<script type="text/javascript">
  // ========== CONFIGURAÇÃO INICIAL ==========
  window.portletNamespace = '<portlet:namespace />';
  window.descontoCount = 1;
  window.parcelaCounters = {0: 1};

  // ========== FUNÇÕES DE TOGGLE ==========
  window.toggleDescontoFields = function(show) {
    var container = document.getElementById(window.portletNamespace + 'descontoContainer');
    container.style.display = show ? 'block' : 'none';
  }

  window.togglePequenoValor = function(descontoIndex, show) {
    var container = document.getElementById(window.portletNamespace + 'pequenoValorContainer_' + descontoIndex);
    if (container) {
      container.style.display = show ? 'block' : 'none';
    }
  }

  // ========== FUNÇÕES DE PARCELAS ==========
  window.configurarRangeListeners = function() {
    document.querySelectorAll('.parcelas-range').forEach(function(range) {
      range.addEventListener('input', function() {
        var targetId = this.getAttribute('data-target');
        var targetElement = document.getElementById(targetId);
        if (targetElement) {
          targetElement.textContent = this.value;
        }
      });
    });
  }

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

    var newParcela = document.createElement('div');
    newParcela.className = 'parcela-item-container';
    newParcela.setAttribute('data-desconto-index', descontoIndex);
    newParcela.setAttribute('data-parcela-index', parcelaIndex);

    newParcela.innerHTML =
      '<span class="parcela-indicator">' + (parcelaIndex + 1) + '</span>' +
      '<div class="row">' +
        '<div class="col-md-3">' +
          '<div class="form-group">' +
            '<label>Quantidade de parcelas</label>' +
            '<input type="range" ' +
              'id="' + window.portletNamespace + 'quantidadeParcelas_' + descontoIndex + '_' + parcelaIndex + '" ' +
              'min="1" max="120" value="1" ' +
              'class="form-control-range parcelas-range" ' +
              'data-target="parcelasValue_' + descontoIndex + '_' + parcelaIndex + '">' +
            '<span id="parcelasValue_' + descontoIndex + '_' + parcelaIndex + '" class="parcelas-value">1</span> parcela(s)' +
          '</div>' +
        '</div>' +
        '<div class="col-md-3">' +
          '<div class="form-group">' +
            '<label>% Desconto</label>' +
            '<input type="number" id="' + window.portletNamespace + 'porcentagemDesconto_' + descontoIndex + '_' + parcelaIndex + '" ' +
              'class="form-control" min="0" max="100">' +
          '</div>' +
        '</div>' +
        '<div class="col-md-3">' +
          '<div class="form-group">' +
            '<label>Aplicar sobre</label>' +
            '<select id="' + window.portletNamespace + 'sobreOQueAplicado_' + descontoIndex + '_' + parcelaIndex + '" ' +
              'class="form-control" multiple>' +
              '<option value="principal">Valor principal</option>' +
              '<option value="acrescimos">Multas e juros</option>' +
            '</select>' +
          '</div>' +
        '</div>' +
        '<div class="col-md-3">' +
          '<div class="form-group">' +
            '<label>Rating</label>' +
            '<select id="' + window.portletNamespace + 'classificacaoCredito_' + descontoIndex + '_' + parcelaIndex + '" ' +
              'class="form-control" multiple>' +
              '<option value="A">A</option>' +
              '<option value="B">B</option>' +
              '<option value="C">C</option>' +
              '<option value="D">D</option>' +
            '</select>' +
          '</div>' +
        '</div>' +
      '</div>' +
      '<button type="button" class="btn btn-sm btn-danger remove-parcela-btn" onclick="removerParcela(this)">' +
        '<i class="icon-trash"></i> Remover parcela' +
      '</button>';

    container.appendChild(newParcela);
    window.configurarRangeListeners();
    atualizarNumeracaoParcelas(descontoIndex);
  }

  window.removerParcela = function(button) {
    var container = button.closest('.parcela-item-container');
    if (container) {
      var descontoIndex = container.getAttribute('data-desconto-index');
      container.remove();
      atualizarNumeracaoParcelas(descontoIndex);
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
          '<label>Tipo de crédito *</label>' +
          '<select id="' + window.portletNamespace + 'tipoCredito_' + newDescontoIndex + '" class="form-control" multiple required>' +
            '<option value="T">Tributária (T)</option>' +
            '<option value="N">Não tributária (N)</option>' +
          '</select>' +
        '</div>' +

        '<div class="empresaRegimeContainer" style="display: none;">' +
          '<label>A empresa está em regime de falência ou de recuperação judicial ou extrajudicial?</label>' +
          '<div>' +
            '<label class="radio-inline">' +
              '<input type="radio" id="' + window.portletNamespace + 'empresaRegime_' + newDescontoIndex + '_sim" value="true"> Sim' +
            '</label>' +
            '<label class="radio-inline">' +
              '<input type="radio" id="' + window.portletNamespace + 'empresaRegime_' + newDescontoIndex + '_nao" value="false" checked> Não' +
            '</label>' +
          '</div>' +
        '</div>' +

        '<div class="form-group">' +
          '<label>Pequeno valor aplicável? *</label>' +
          '<div>' +
            '<label class="radio-inline">' +
              '<input type="radio" id="' + window.portletNamespace + 'pequenoValorAplicavel_' + newDescontoIndex + '_sim" ' +
                'value="true" onclick="togglePequenoValor(' + newDescontoIndex + ', true)"> Sim' +
            '</label>' +
            '<label class="radio-inline">' +
              '<input type="radio" id="' + window.portletNamespace + 'pequenoValorAplicavel_' + newDescontoIndex + '_nao" ' +
                'value="false" onclick="togglePequenoValor(' + newDescontoIndex + ', false)" checked> Não' +
            '</label>' +
          '</div>' +
        '</div>' +

        '<div class="pequenoValorContainer" id="' + window.portletNamespace + 'pequenoValorContainer_' + newDescontoIndex + '" style="display: none;">' +
          '<div class="form-group">' +
            '<label>Pequeno valor *</label>' +
            '<input type="text" id="' + window.portletNamespace + 'pequenoValor_' + newDescontoIndex + '" ' +
              'class="form-control money-input">' +
          '</div>' +
        '</div>' +

        '<div class="form-group">' +
          '<label>Transação envolve</label>' +
          '<select id="' + window.portletNamespace + 'transacaoEnvolve_' + newDescontoIndex + '" class="form-control" multiple>' +
            '<option value="pessoa_natural">Pessoa natural</option>' +
            '<option value="microempresa">Microempresa ou empresa de pequeno porte</option>' +
            '<option value="cooperativas">Sociedades cooperativas</option>' +
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
                    '<label>Quantidade de parcelas</label>' +
                    '<input type="range" ' +
                      'id="' + window.portletNamespace + 'quantidadeParcelas_' + newDescontoIndex + '_0" ' +
                      'min="1" max="120" value="1" ' +
                      'class="form-control-range parcelas-range" ' +
                      'data-target="parcelasValue_' + newDescontoIndex + '_0">' +
                    '<span id="parcelasValue_' + newDescontoIndex + '_0" class="parcelas-value">1</span> parcela(s)' +
                  '</div>' +
                '</div>' +
                '<div class="col-md-3">' +
                  '<div class="form-group">' +
                    '<label>% Desconto</label>' +
                    '<input type="number" id="' + window.portletNamespace + 'porcentagemDesconto_' + newDescontoIndex + '_0" ' +
                      'class="form-control" min="0" max="100">' +
                  '</div>' +
                '</div>' +
                '<div class="col-md-3">' +
                  '<div class="form-group">' +
                    '<label>Aplicar sobre</label>' +
                    '<select id="' + window.portletNamespace + 'sobreOQueAplicado_' + newDescontoIndex + '_0" ' +
                      'class="form-control" multiple>' +
                      '<option value="principal">Valor principal</option>' +
                      '<option value="acrescimos">Multas e juros</option>' +
                    '</select>' +
                  '</div>' +
                '</div>' +
                '<div class="col-md-3">' +
                  '<div class="form-group">' +
                    '<label>Rating</label>' +
                    '<select id="' + window.portletNamespace + 'classificacaoCredito_' + newDescontoIndex + '_0" ' +
                      'class="form-control" multiple>' +
                      '<option value="A">A</option>' +
                      '<option value="B">B</option>' +
                      '<option value="C">C</option>' +
                      '<option value="D">D</option>' +
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
    window.configurarRangeListeners();
    aplicarMascaraMoeda();

    atualizarNumeracaoDescontos();
  }

  window.removerDesconto = function(button) {
    var container = button.closest('.desconto-item-container');
    if (container) {
      var index = container.getAttribute('data-index');
      delete window.parcelaCounters[index];
      container.remove();

      atualizarNumeracaoDescontos();
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

  // ========== FUNÇÕES AUXILIARES ==========
  function checkCNPJStatus() {
    var aplicavelParaSelect = document.getElementById(window.portletNamespace + 'aplicavelPara');
    if (aplicavelParaSelect) {
      var selectedOptions = Array.from(aplicavelParaSelect.selectedOptions).map(option => option.value);
      var empresaRegimeContainers = document.querySelectorAll('.empresaRegimeContainer');

      empresaRegimeContainers.forEach(function(container) {
        container.style.display = selectedOptions.includes('CNPJ') ? 'block' : 'none';
      });
    }
  }

  // ========== FORMATAÇÃO DE MOEDA ==========
  function formatarMoeda(input) {
    var valor = input.value;

    // Remove tudo que não for número
    valor = valor.replace(/\D/g, '');

    // Converte para número
    valor = parseInt(valor) / 100;

    // Formata como moeda brasileira
    valor = valor.toLocaleString('pt-BR', {
      style: 'currency',
      currency: 'BRL'
    });

    // Atualiza o valor do input
    input.value = valor;
  }

  function aplicarMascaraMoeda() {
    document.querySelectorAll('.money-input').forEach(function(input) {
      // Remove listeners existentes para evitar duplicação
      input.removeEventListener('input', handleMoneyInput);
      input.removeEventListener('focus', handleMoneyFocus);

      // Adiciona os listeners
      input.addEventListener('input', handleMoneyInput);
      input.addEventListener('focus', handleMoneyFocus);

      // Formata valor inicial se houver
      if (input.value) {
        formatarMoeda(input);
      }
    });
  }

  function handleMoneyInput(e) {
    formatarMoeda(e.target);
  }

  function handleMoneyFocus(e) {
    var input = e.target;
    if (input.value === '') {
      input.value = 'R$ 0,00';
      setTimeout(function() {
        input.setSelectionRange(3, input.value.length);
      }, 0);
    }
  }
</script>

<!-- LIFERAY SCRIPT -->
<aui:script>
  Liferay.on('allPortletsReady', function() {
    var aplicavelParaSelect = document.getElementById('<portlet:namespace />aplicavelPara');
    if (aplicavelParaSelect) {
      aplicavelParaSelect.addEventListener('change', checkCNPJStatus);
    }

    window.configurarRangeListeners();
    aplicarMascaraMoeda();
  });
</aui:script>

<!-- CSS LIMPO E PROFISSIONAL -->
<style>
  /* ========== LAYOUT BASE ========== */
  .sheet-section {
    margin-bottom: 2rem;
    padding-bottom: 2rem;
    border-bottom: 1px solid #dee2e6;
  }

  .sheet-section:last-child {
    border-bottom: none;
  }

  .sheet-subtitle {
    margin-bottom: 1.5rem;
    color: #212529;
    font-size: 1.25rem;
    font-weight: 600;
  }

  /* ========== CONTAINERS DE DESCONTO ========== */
  .desconto-item-container {
    background: #f8f9fa;
    border: 1px solid #dee2e6;
    border-radius: 0.25rem;
    padding: 1.5rem;
    margin-bottom: 1.5rem;
    position: relative;
  }

  .desconto-content {
    padding-left: 2rem;
  }

  .desconto-title {
    color: #495057;
    font-size: 1.1rem;
    font-weight: 600;
    margin-bottom: 1.5rem;
    padding-bottom: 0.75rem;
    border-bottom: 2px solid #dee2e6;
  }

  /* ========== SEÇÃO DE PARCELAS ========== */
  .parcelas-section {
    background: #fff;
    border: 1px solid #e9ecef;
    border-radius: 0.25rem;
    padding: 1.25rem;
    margin-top: 1.5rem;
  }

  .parcelas-title {
    color: #6c757d;
    font-size: 1rem;
    font-weight: 600;
    margin-bottom: 1.25rem;
    padding-bottom: 0.5rem;
    border-bottom: 1px solid #e9ecef;
  }

  /* ========== ITEMS DE PARCELA ========== */
  .parcela-item-container {
    background: #f8f9fa;
    border: 1px solid #e9ecef;
    border-radius: 0.25rem;
    padding: 1.25rem;
    margin-bottom: 1rem;
    position: relative;
  }

  .parcela-item-container .row {
    margin-left: 1.5rem;
  }

  /* ========== INDICADORES ========== */
  .desconto-indicator {
    position: absolute;
    left: 0.75rem;
    top: 1.5rem;
    width: 1.75rem;
    height: 1.75rem;
    background: #495057;
    color: white;
    border-radius: 50%;
    display: flex;
    align-items: center;
    justify-content: center;
    font-size: 0.875rem;
    font-weight: 600;
  }

  .parcela-indicator {
    position: absolute;
    left: 0.5rem;
    top: 1.25rem;
    width: 1.5rem;
    height: 1.5rem;
    background: #6c757d;
    color: white;
    border-radius: 50%;
    display: flex;
    align-items: center;
    justify-content: center;
    font-size: 0.75rem;
    font-weight: 600;
  }

  /* ========== FORMULÁRIO ========== */
  .form-group label {
    font-weight: 500;
    color: #495057;
    margin-bottom: 0.5rem;
  }

  /* Campos obrigatórios */
  .control-label .text-warning {
    color: #dc3545;
  }

  /* ========== CONTROLES ========== */
  /* Range slider */
  .form-control-range {
    width: 100%;
  }

  .parcelas-value {
    display: inline-block;
    background: #007bff;
    color: white;
    padding: 0.125rem 0.5rem;
    border-radius: 0.25rem;
    font-size: 0.875rem;
    font-weight: 500;
    margin-left: 0.5rem;
  }

  /* Radio buttons */
  .radio-inline {
    margin-right: 1.5rem;
  }

  /* Multiselect */
  select[multiple] {
    min-height: 6rem;
  }

  /* ========== BOTÕES ========== */
  .btn-success {
    background-color: #28a745;
    border-color: #28a745;
  }

  .add-parcela-btn {
    margin-top: 1rem;
  }

  .remove-parcela-btn,
  .remove-desconto-btn {
    margin-top: 1rem;
  }

  /* ========== UTILIDADES ========== */
  #<portlet:namespace />descontoContainer {
    background: #fff;
    padding: 1.5rem;
    border: 1px solid #dee2e6;
    border-radius: 0.25rem;
    margin-top: 1rem;
  }

  .section-divider {
    border-top: 1px solid #dee2e6;
    margin: 1.5rem 0;
  }

  /* ========== RESPONSIVIDADE ========== */
  @media (max-width: 768px) {
    .parcela-item-container .col-md-3 {
      margin-bottom: 1rem;
    }

    .desconto-content {
      padding-left: 1.5rem;
    }

    .parcela-item-container .row {
      margin-left: 1rem;
    }
  }
</style>
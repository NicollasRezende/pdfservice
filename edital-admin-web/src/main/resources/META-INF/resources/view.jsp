<%@ include file="/init.jsp" %>

<%
    String currentURL = PortalUtil.getCurrentURL(request);

    PortletURL iteratorURL = renderResponse.createRenderURL();
    iteratorURL.setParameter("mvcPath", "/view.jsp");

    Long documentFolderId = ParamUtil.getLong(request, "documentFolderId");
%>

<portlet:renderURL var="editURL">
    <portlet:param name="mvcPath" value="/edit.jsp" />
    <portlet:param name="backURL" value="<%= currentURL %>" />
</portlet:renderURL>

<div class="management-bar management-bar-light navbar navbar-expand-md">
  <clay:container-fluid>
		<ul class="end m-auto navbar-nav d-flex justify-content-end w-100">
			<li class="nav-item">
			  <a class="btn btn-primary" href="${editURL}">Novo</a>
			</li>
    </ul>
  </clay:container-fluid>
</div>
<clay:container-fluid>
  <c:if test="<%= documentFolderId != 0 %>">
      <div class="alert alert-warning d-flex justify-content-between align-items-center mb-4">
          <div><strong>Aviso:</strong> Você precisa configurar uma pasta de documentos para cadastrar editais.</div>
          <a href="/group/control_panel/manage?p_p_id=com_liferay_configuration_admin_web_portlet_SystemSettingsPortlet&p_p_lifecycle=0&p_p_state=maximized&p_p_mode=view&_com_liferay_configuration_admin_web_portlet_SystemSettingsPortlet_factoryPid=br.com.seatecnologia.gdf.edital.admin.web.internal.configuration.EditalAdminWebConfiguration&_com_liferay_configuration_admin_web_portlet_SystemSettingsPortlet_mvcRenderCommandName=%2Fconfiguration_admin%2Fedit_configuration&_com_liferay_configuration_admin_web_portlet_SystemSettingsPortlet_pid=br.com.seatecnologia.gdf.edital.admin.web.internal.configuration.EditalAdminWebConfiguration" class="btn btn-secondary">Configurar</a>
      </div>
  </c:if>

  <liferay-ui:search-container
      delta="10"
      emptyResultsMessage="Nenhum edital cadastrado"
      iteratorURL="<%= iteratorURL %>"
      total="${editais != null ? editais.size() : 0}"
  >
      <liferay-ui:search-container-results
          results="${editais}"
      />

      <liferay-ui:search-container-row
          className="br.com.seatecnologia.gdf.negocia.model.Edital"
          modelVar="edital"
          keyProperty="editalId"
      >
          <liferay-ui:search-container-column-text
              name="Título"
              value="${edital.titulo}"
          />

          <liferay-ui:search-container-column-text
              name="Descrição"
              value="${edital.descricao}"
          />

          <liferay-ui:search-container-column-text name="Data início">
              <fmt:formatDate value="${edital.dataInicio}" pattern="dd/MM/yyyy HH:mm" />
          </liferay-ui:search-container-column-text>

          <liferay-ui:search-container-column-text name="Data fim">
              <fmt:formatDate value="${edital.dataFim}" pattern="dd/MM/yyyy HH:mm" />
          </liferay-ui:search-container-column-text>

          <liferay-ui:search-container-column-jsp
              name="Ações"
              align="right"
              path="/edital/edital_actions.jsp"
          />
      </liferay-ui:search-container-row>
      <liferay-ui:search-iterator markupView="lexicon" />
  </liferay-ui:search-container>
</clay:container-fluid>
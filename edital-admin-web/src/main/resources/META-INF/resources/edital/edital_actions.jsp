<%@ include file="/init.jsp" %>


<%
    String currentURL = PortalUtil.getCurrentURL(request);

    ResultRow row = (ResultRow) request.getAttribute("SEARCH_CONTAINER_RESULT_ROW");
    Edital edital = (Edital) row.getObject();
%>

<portlet:renderURL var="editURL">
    <portlet:param name="mvcPath" value="/edit.jsp" />
    <portlet:param name="editalId" value="<%= String.valueOf(edital.getEditalId()) %>" />
    <portlet:param name="backURL" value="<%= currentURL %>" />
</portlet:renderURL>

<liferay-ui:icon-menu showWhenSingleIcon="true">
    <liferay-ui:icon
        image="edit"
        message="Editar"
        url="<%= editURL.toString() %>"
    />

    <c:if test="<%= edital.getArquivoURL() != null && !edital.getArquivoURL().isEmpty() %>">
        <liferay-ui:icon
            image="download"
            message="Baixar Arquivo"
            url="<%= edital.getArquivoURL() %>"
        />
    </c:if>
</liferay-ui:icon-menu>
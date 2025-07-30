<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>

<%@ page import="br.com.seatecnologia.gdf.negocia.configuration.SeiConectorConfiguration" %>
<%@ page import="java.util.LinkedHashMap" %>
<%@ page import="com.liferay.portal.kernel.language.LanguageUtil" %>

<%
SeiConectorConfiguration seiConectorConfiguration = (SeiConectorConfiguration)request.getAttribute(SeiConectorConfiguration.class.getName());

LinkedHashMap<String, String> protocolos = (LinkedHashMap<String, String>)request.getAttribute("protocolos");
LinkedHashMap<String, String> tipoProcessos = (LinkedHashMap<String, String>)request.getAttribute("tipoProcessos");
LinkedHashMap<String, String> niveisAcesso = (LinkedHashMap<String, String>)request.getAttribute("niveisAcesso");
LinkedHashMap<String, String> hipotesesLegais = (LinkedHashMap<String, String>)request.getAttribute("hipotesesLegais");
LinkedHashMap<String, String> tiposPrioridade = (LinkedHashMap<String, String>)request.getAttribute("tiposPrioridade");

%>

	<aui:select name="protocolo" label="protocolo">
		<%
		for (String key : protocolos.keySet()) {
			String value = protocolos.get(key);
			boolean selected = (seiConectorConfiguration != null) && value.equals(seiConectorConfiguration.protocolo());
		%>
		<aui:option value="<%= value %>" selected="<%= selected %>"><%= key %></aui:option>
		<%
		}
		%>
	</aui:select>

    <aui:select name="tipoPrioridade" label="Prioridade">
        <%
        for (String key : tiposPrioridade.keySet()) {
            String value = tiposPrioridade.get(key);
            boolean selected = (seiConectorConfiguration != null) && value.equals(seiConectorConfiguration.tipoPrioridade());
        %>
        <aui:option value="<%= value %>" selected="<%= selected %>"><%= key %></aui:option>
        <%
        }
        %>
    </aui:select>


	<aui:select name="tipoProcesso" label="tipoProcesso">
		<%
		for (String key : tipoProcessos.keySet()) {
			String value = tipoProcessos.get(key);
			boolean selected = (seiConectorConfiguration != null) && value.equals(seiConectorConfiguration.tipoProcesso());
		%>
		<aui:option value="<%= value %>" selected="<%= selected %>"><%= key %></aui:option>
		<%
		}
		%>
	</aui:select>

	<aui:select name="nivelAcesso" label="nivelAcesso">
		<%
		for (String key : niveisAcesso.keySet()) {
			String value = niveisAcesso.get(key);
			boolean selected = (seiConectorConfiguration != null) && value.equals(seiConectorConfiguration.nivelAcesso());
		%>
		<aui:option value="<%= value %>" selected="<%= selected %>"><%= key %></aui:option>
		<%
		}
		%>
	</aui:select>

	<div id="hipoteseLegalContainer" style="<%= (seiConectorConfiguration != null && "1".equals(seiConectorConfiguration.nivelAcesso())) ? "" : "display: none;" %>">
		<aui:select name="hipoteseLegal" label="hipoteseLegal">
			<aui:option value="" selected="<%= (seiConectorConfiguration == null) || "".equals(seiConectorConfiguration.hipoteseLegal()) %>"><liferay-ui:message key="hipoteseLegal-selecione" /></aui:option>
			<%
			for (String key : hipotesesLegais.keySet()) {
				String value = hipotesesLegais.get(key);
				boolean selected = (seiConectorConfiguration != null) && value.equals(seiConectorConfiguration.hipoteseLegal());
			%>
			<aui:option value="<%= value %>" selected="<%= selected %>"><%= key %></aui:option>
			<%
			}
			%>
		</aui:select>
	</div>


<script>
(function() {
	function toggleHipoteseLegal() {
		var nivelAcessoSelect = document.querySelector('select[name="nivelAcesso"]') ||
								document.querySelector('select[id*="nivelAcesso"]');

		var hipoteseLegalContainer = document.getElementById('hipoteseLegalContainer');
		var hipoteseLegalSelect = document.querySelector('select[name="hipoteseLegal"]') ||
								  document.querySelector('select[id*="hipoteseLegal"]');

		if (nivelAcessoSelect && hipoteseLegalContainer) {
			if (nivelAcessoSelect.value === '1') {
				hipoteseLegalContainer.style.display = 'block';
			} else {
				hipoteseLegalContainer.style.display = 'none';
				if (hipoteseLegalSelect) {
					hipoteseLegalSelect.value = '';
				}
			}
		}
	}

	var interval = setInterval(function() {
		var nivelAcessoSelect = document.querySelector('select[name="nivelAcesso"]') ||
								document.querySelector('select[id*="nivelAcesso"]');

		if (nivelAcessoSelect) {
			nivelAcessoSelect.addEventListener('change', toggleHipoteseLegal);
			toggleHipoteseLegal();
			clearInterval(interval);
		}
	}, 200);
})();
</script>
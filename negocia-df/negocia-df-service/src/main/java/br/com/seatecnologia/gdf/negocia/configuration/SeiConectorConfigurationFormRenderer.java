package br.com.seatecnologia.gdf.negocia.configuration;

import br.com.seatecnologia.sei.integration.api.service.ListarHipoteseLegalService;
import br.com.seatecnologia.sei.integration.api.service.ProcedimentoService;
import br.com.seatecnologia.sei.integration.api.service.ws.HipoteseLegal;
import br.com.seatecnologia.sei.integration.api.service.ws.TipoPrioridade;
import br.com.seatecnologia.sei.integration.api.service.ws.TipoProcedimento;
import com.liferay.configuration.admin.display.ConfigurationFormRenderer;
import com.liferay.portal.configuration.module.configuration.ConfigurationProvider;
import com.liferay.portal.kernel.util.ParamUtil;
import org.osgi.service.component.annotations.Reference;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import org.osgi.service.component.annotations.Component;

@Component(service = ConfigurationFormRenderer.class)
public class SeiConectorConfigurationFormRenderer implements ConfigurationFormRenderer {
    @Override
    public String getPid() {
        return "br.com.seatecnologia.gdf.negocia.configuration.SeiConectorConfiguration";
    }

    @Override
    public Map<String, Object> getRequestParameters(HttpServletRequest httpServletRequest) {
        String protocolo = ParamUtil.getString(httpServletRequest, "protocolo");
        String tipoProcesso = ParamUtil.getString(httpServletRequest, "tipoProcesso");
        String nivelAcesso = ParamUtil.getString(httpServletRequest, "nivelAcesso");
        String hipoteseLegal = ParamUtil.getString(httpServletRequest, "hipoteseLegal");
        String tipoPrioridade = ParamUtil.getString(httpServletRequest, "tipoPrioridade");

        return new LinkedHashMap<String, Object>() {
            {
                put("protocolo", protocolo);
                put("tipoProcesso", tipoProcesso);
                put("nivelAcesso", nivelAcesso);
                put("hipoteseLegal", hipoteseLegal);
                put("tipoPrioridade", tipoPrioridade);
            }
        };
    }

    @Override
    public void render(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws IOException {

        try {
            httpServletRequest.setAttribute(
                    br.com.seatecnologia.gdf.negocia.configuration.SeiConectorConfiguration.class.getName(),
                    _configurationProvider.getSystemConfiguration(
                            br.com.seatecnologia.gdf.negocia.configuration.SeiConectorConfiguration.class));

            LinkedHashMap<String, String> protocolos = new LinkedHashMap<>();
            protocolos.put("Automático", "automatico");
            protocolos.put("Informado", "informado");

            LinkedHashMap<String, String> tiposPrioridade = new LinkedHashMap<>();
            TipoPrioridade[] tiposPrioridadeArray = _procedimentoService.listarTiposPrioridade();
            if (tiposPrioridadeArray != null) {
                for (TipoPrioridade tipoPrioridadeItem : tiposPrioridadeArray) {
                    tiposPrioridade.put(tipoPrioridadeItem.getNome(), tipoPrioridadeItem.getIdTipoPrioridade());
                }
            }

            TipoProcedimento[] tiposProcedimento = _procedimentoService.listarTiposProcedimento(null, null, null);
            LinkedHashMap<String, String> tipoProcessos = new LinkedHashMap<>();
            if (tiposProcedimento != null) {
                for (TipoProcedimento tipo : tiposProcedimento) {
                    tipoProcessos.put(tipo.getNome(), tipo.getIdTipoProcedimento());
                }
            }

            LinkedHashMap<String, String> niveisAcesso = new LinkedHashMap<>();
            niveisAcesso.put("Público", "0");
            niveisAcesso.put("Restrito", "1");
            niveisAcesso.put("Sigiloso", "2");

            HipoteseLegal[] hipotesesDoServico = _listarHipoteseLegalService.listarHipoteseLegal();
            LinkedHashMap<String, String> hipotesesLegais = new LinkedHashMap<>();
            if (hipotesesDoServico != null) {
                for (HipoteseLegal hipotese : hipotesesDoServico) {
                    hipotesesLegais.put(hipotese.getNome(), hipotese.getIdHipoteseLegal());
                }
            }
            httpServletRequest.setAttribute("protocolos", protocolos);
            httpServletRequest.setAttribute("tipoProcessos", tipoProcessos);
            httpServletRequest.setAttribute("niveisAcesso", niveisAcesso);
            httpServletRequest.setAttribute("hipotesesLegais", hipotesesLegais);
            httpServletRequest.setAttribute("tiposPrioridade", tiposPrioridade);

            RequestDispatcher requestDispatcher =
                    _servletContext.getRequestDispatcher("/META-INF/jsp/configuration_form_renderer.jsp");
            requestDispatcher.include(httpServletRequest, httpServletResponse);
        }
        catch (Exception exception) {
            throw new IOException("Unable to render /META-INF/jsp/configuration_form_renderer.jsp", exception);
        }
    }

    @Reference
    private ConfigurationProvider _configurationProvider;

    @Reference
    private ListarHipoteseLegalService _listarHipoteseLegalService;

    @Reference
    ProcedimentoService _procedimentoService;

    @Reference(
            target = "(osgi.web.symbolicname=br.com.seatecnologia.gdf.negocia.service)", unbind = "-"
    )

    private ServletContext _servletContext;
}
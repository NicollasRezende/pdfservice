package br.com.seatecnologia.gdf.negocia.indexer;

import com.liferay.portal.kernel.search.BooleanQuery;
import com.liferay.portal.kernel.search.SearchContext;
import com.liferay.portal.search.query.QueryHelper;
import com.liferay.portal.search.spi.model.query.contributor.KeywordQueryContributor;
import com.liferay.portal.search.spi.model.query.contributor.helper.KeywordQueryContributorHelper;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(
    immediate = true,
    property = "indexer.class.name=br.com.seatecnologia.gdf.negocia.model.Proposta",
    service = KeywordQueryContributor.class
)
public class PropostaKeywordQueryContributor
    implements KeywordQueryContributor {

    @Override
    public void contribute(
        String keywords, BooleanQuery booleanQuery,
        KeywordQueryContributorHelper keywordQueryContributorHelper) {

        SearchContext searchContext =
            keywordQueryContributorHelper.getSearchContext();

        queryHelper.addSearchTerm(
            booleanQuery, searchContext, "status", false);
        queryHelper.addSearchTerm(
            booleanQuery, searchContext, "tipoProposta", false);
        queryHelper.addSearchTerm(
            booleanQuery, searchContext, "numeroProtocoloSei", false);
        queryHelper.addSearchTerm(
            booleanQuery, searchContext, "protocolo", false);
        queryHelper.addSearchTerm(
            booleanQuery, searchContext, "propostaId", false);
        queryHelper.addSearchTerm(
            booleanQuery, searchContext, "editalId", false);
        queryHelper.addSearchTerm(
            booleanQuery, searchContext, "cpfCnpj", false);

        queryHelper.addSearchTerm(
                booleanQuery, searchContext, "documentosCompletosURL", false);
    }

    @Reference
    protected QueryHelper queryHelper;
}
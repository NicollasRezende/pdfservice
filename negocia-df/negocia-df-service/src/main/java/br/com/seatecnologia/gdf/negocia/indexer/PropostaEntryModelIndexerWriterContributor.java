package br.com.seatecnologia.gdf.negocia.indexer;

import br.com.seatecnologia.gdf.negocia.model.Proposta;
import br.com.seatecnologia.gdf.negocia.service.PropostaLocalService;
import com.liferay.portal.search.spi.model.index.contributor.ModelIndexerWriterContributor;
import com.liferay.portal.search.batch.BatchIndexingActionable;
import com.liferay.portal.search.batch.DynamicQueryBatchIndexingActionableFactory;
import com.liferay.portal.search.spi.model.index.contributor.helper.ModelIndexerWriterDocumentHelper;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(
        property = "indexer.class.name=br.com.seatecnologia.gdf.negocia.model.Proposta",
        service = ModelIndexerWriterContributor.class
)
public class PropostaEntryModelIndexerWriterContributor
        implements ModelIndexerWriterContributor<Proposta> {


    @Override
    public void customize(
            BatchIndexingActionable batchIndexingActionable,
            ModelIndexerWriterDocumentHelper modelIndexerWriterDocumentHelper) {

        batchIndexingActionable.setPerformActionMethod(
                (Proposta proposta) -> batchIndexingActionable.addDocuments(
                        modelIndexerWriterDocumentHelper.getDocument(proposta)));
    }

    @Override
    public BatchIndexingActionable getBatchIndexingActionable() {
        return dynamicQueryBatchIndexingActionableFactory.
                getBatchIndexingActionable(
                        propostaLocalService.getIndexableActionableDynamicQuery());
    }

    @Override
    public long getCompanyId(Proposta baseModel) {
        return baseModel.getCompanyId();
    }

    @Reference
    protected DynamicQueryBatchIndexingActionableFactory
            dynamicQueryBatchIndexingActionableFactory;

    @Reference
    protected PropostaLocalService propostaLocalService;

}
package br.com.seatecnologia.gdf.negocia.indexer;

import br.com.seatecnologia.gdf.negocia.model.Proposta;
import com.liferay.portal.search.spi.model.registrar.ModelSearchConfigurator;

import com.liferay.portal.kernel.search.Field;
import com.liferay.portal.search.spi.model.index.contributor.ModelIndexerWriterContributor;
import com.liferay.portal.search.spi.model.result.contributor.ModelSummaryContributor;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(service = ModelSearchConfigurator.class)
public class PropostaEntryModelSearchConfigurator
        implements ModelSearchConfigurator<Proposta> {

    @Override
    public String getClassName() {
        return Proposta.class.getName();
    }

    @Override
    public String[] getDefaultSelectedFieldNames() {
        return new String[] {
                Field.COMPANY_ID, Field.ENTRY_CLASS_NAME, Field.ENTRY_CLASS_PK,
                Field.SCOPE_GROUP_ID, Field.GROUP_ID, Field.UID
        };
    }

    @Override
    public String[] getDefaultSelectedLocalizedFieldNames() {
        return new String[] {Field.CONTENT, Field.TITLE};
    }


    @Override
    public ModelIndexerWriterContributor<Proposta>
    getModelIndexerWriterContributor() {
        return modelIndexWriterContributor;
    }

    @Override
    public ModelSummaryContributor getModelSummaryContributor() {
        return modelSummaryContributor;
    }


    @Override
    public boolean isSelectAllLocales() {
        return true;
    }

    @Reference(target = "(indexer.class.name=br.com.seatecnologia.gdf.negocia.model.Proposta)")
    protected ModelIndexerWriterContributor<Proposta>
            modelIndexWriterContributor;

    @Reference(target = "(indexer.class.name=br.com.seatecnologia.gdf.negocia.model.Proposta)")
    protected ModelSummaryContributor modelSummaryContributor;

}
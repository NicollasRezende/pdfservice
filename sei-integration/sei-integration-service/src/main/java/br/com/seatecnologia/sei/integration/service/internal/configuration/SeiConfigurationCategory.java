package br.com.seatecnologia.sei.integration.service.internal.configuration;

import br.com.seatecnologia.sei.integration.service.internal.constants.SeiWSConstants;
import com.liferay.configuration.admin.category.ConfigurationCategory;
import org.osgi.service.component.annotations.Component;

@Component(service = ConfigurationCategory.class)
public class SeiConfigurationCategory implements ConfigurationCategory {

    @Override
    public String getCategoryKey() {
        return SeiWSConstants.SEI_CATEGORY_KEY;
    }

    @Override
    public String getCategorySection() {
        return SeiWSConstants.CATEGORY_SECTION;
    }

    @Override
    public String getCategoryIcon() {
        return SeiWSConstants.CATEGORY_ICON;
    }
}

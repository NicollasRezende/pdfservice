package br.com.seatecnologia.gdf.negocia.upgrade;


import br.com.seatecnologia.gdf.negocia.upgrade.v2_0_0.AddingDocumentosCompletosURLFieldInProposta;
import br.com.seatecnologia.gdf.negocia.upgrade.v3_0_0.AddColumnToAdvogadoModel;
import br.com.seatecnologia.gdf.negocia.upgrade.v4_0_0.AddCpfCnpjFieldToProposta;
import br.com.seatecnologia.gdf.negocia.upgrade.v5_0_0.ChangeTextSize;
import br.com.seatecnologia.gdf.negocia.upgrade.v6_0_0.AddUserNameToProposta;
import br.com.seatecnologia.gdf.negocia.upgrade.v7_0_0.ChangeColumnNumeroTableEndereco;
import br.com.seatecnologia.gdf.negocia.upgrade.v8_0_0.ChangeColumnsTextSize;
import br.com.seatecnologia.gdf.negocia.upgrade.v8_0_1.ChangeAllColunsTextSize;
import br.com.seatecnologia.gdf.negocia.upgrade.v8_0_2.ChangeOtherColunsTextSize;
import br.com.seatecnologia.gdf.negocia.upgrade.v8_0_3.ChangeFundamentacaoPedidoColumnSize;
import br.com.seatecnologia.gdf.negocia.upgrade.v9_0_0.AddTipoDocumentoToDemonstracaoContabil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.upgrade.registry.UpgradeStepRegistrator;
import org.osgi.service.component.annotations.Component;


@Component(immediate = true, service = UpgradeStepRegistrator.class)
public class NegociaDFServiceUpgradeStepRegistrator implements UpgradeStepRegistrator {

    @Override
    public void register(Registry registry) {

        if (_log.isDebugEnabled()) {
            _log.debug("Iniciando upgrade step  [Negocia DF SERVICES]");
        }

        registry.register("1.0.0", "2.0.0", new AddingDocumentosCompletosURLFieldInProposta());
        registry.register("2.0.0", "3.0.0", new AddColumnToAdvogadoModel());
        registry.register("3.0.0", "4.0.0", new AddCpfCnpjFieldToProposta());
        registry.register("4.0.0", "5.0.0", new ChangeTextSize());
        registry.register("5.0.0", "6.0.0", new AddUserNameToProposta());
        registry.register("6.0.0","7.0.0", new ChangeColumnNumeroTableEndereco());
        registry.register("7.0.0", "8.0.0", new ChangeColumnsTextSize());
        registry.register("8.0.0", "8.0.1", new ChangeAllColunsTextSize());
        registry.register("8.0.1", "8.0.2", new ChangeOtherColunsTextSize());
        registry.register("8.0.2", "8.0.3", new ChangeFundamentacaoPedidoColumnSize());
        registry.register("8.0.3", "9.0.0", new AddTipoDocumentoToDemonstracaoContabil());

        if (_log.isDebugEnabled()) {
            _log.debug("Finalizando upgrade step [Negocia DF SERVICES] - 0.0.0 -> 1.0.0");
        }

    }

    private static final Log _log = LogFactoryUtil.getLog(NegociaDFServiceUpgradeStepRegistrator.class);
}

package br.com.seatecnologia.gdf.negocia.upgrade;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.upgrade.UpgradeProcess;
import com.liferay.portal.kernel.util.StringUtil;

import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;
import java.util.Objects;

public abstract class BaseUpgradeStep extends UpgradeProcess {

    protected final void executeSql(Class clazz, String file) throws IOException, SQLException {

        InputStream stream = Objects.requireNonNull(clazz.getResourceAsStream(file));

        final String sql = StringUtil.read(stream);

        log.debug(sql);

        runSQL(sql);
    }

    private final Log log = LogFactoryUtil.getLog(BaseUpgradeStep.class);
}

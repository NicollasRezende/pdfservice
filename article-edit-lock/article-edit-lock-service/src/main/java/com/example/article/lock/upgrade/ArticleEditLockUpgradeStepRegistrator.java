package com.example.article.lock.upgrade;

import com.example.article.lock.upgrade.v1_0_0.UpgradeSchema;
import com.liferay.portal.kernel.module.framework.ModuleServiceLifecycle;
import com.liferay.portal.upgrade.registry.UpgradeStepRegistrator;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(
    immediate = true,
    service = UpgradeStepRegistrator.class
)
public class ArticleEditLockUpgradeStepRegistrator implements UpgradeStepRegistrator {

    @Override
    public void register(Registry registry) {
        registry.register(
            "0.0.0", "1.0.0",
            new UpgradeSchema()
        );
    }

    @Reference(target = ModuleServiceLifecycle.PORTAL_INITIALIZED)
    private ModuleServiceLifecycle _moduleServiceLifecycle;
}
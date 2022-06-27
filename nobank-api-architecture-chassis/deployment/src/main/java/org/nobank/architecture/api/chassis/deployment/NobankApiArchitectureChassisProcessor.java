package org.nobank.architecture.api.chassis.deployment;

import io.quarkus.deployment.annotations.BuildStep;
import io.quarkus.deployment.builditem.FeatureBuildItem;

class NobankApiArchitectureChassisProcessor {

    private static final String FEATURE = "nobank-api-architecture-chassis";

    @BuildStep
    FeatureBuildItem feature() {
        return new FeatureBuildItem(FEATURE);
    }
}

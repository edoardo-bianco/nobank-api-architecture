package org.nobank.architecture.chassis.deployment;

import org.nobank.architecture.chassis.utility.EchoUtil;

import io.quarkus.arc.deployment.AdditionalBeanBuildItem;
import io.quarkus.arc.processor.DotNames;
import io.quarkus.deployment.annotations.BuildStep;
import io.quarkus.deployment.builditem.FeatureBuildItem;

class NobankApiArchitectureChassisProcessor {

    private static final String FEATURE = "nobank-api-architecture-chassis";

    @BuildStep
    FeatureBuildItem feature() {
        return new FeatureBuildItem(FEATURE);
    }

    @BuildStep
    AdditionalBeanBuildItem createBean(){

        AdditionalBeanBuildItem additionalBeanBuildItem = new AdditionalBeanBuildItem.Builder()
        .addBeanClasses(EchoUtil.class).setUnremovable()
        .setDefaultScope(DotNames.APPLICATION_SCOPED).build();
        return additionalBeanBuildItem;

    }    
}

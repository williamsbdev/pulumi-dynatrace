// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;


public final class K8sWorkloadAnomaliesHighMemoryUsageConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final K8sWorkloadAnomaliesHighMemoryUsageConfigurationArgs Empty = new K8sWorkloadAnomaliesHighMemoryUsageConfigurationArgs();

    @Import(name="observationPeriodInMinutes", required=true)
    private Output<Integer> observationPeriodInMinutes;

    public Output<Integer> observationPeriodInMinutes() {
        return this.observationPeriodInMinutes;
    }

    @Import(name="samplePeriodInMinutes", required=true)
    private Output<Integer> samplePeriodInMinutes;

    public Output<Integer> samplePeriodInMinutes() {
        return this.samplePeriodInMinutes;
    }

    @Import(name="threshold", required=true)
    private Output<Integer> threshold;

    public Output<Integer> threshold() {
        return this.threshold;
    }

    private K8sWorkloadAnomaliesHighMemoryUsageConfigurationArgs() {}

    private K8sWorkloadAnomaliesHighMemoryUsageConfigurationArgs(K8sWorkloadAnomaliesHighMemoryUsageConfigurationArgs $) {
        this.observationPeriodInMinutes = $.observationPeriodInMinutes;
        this.samplePeriodInMinutes = $.samplePeriodInMinutes;
        this.threshold = $.threshold;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(K8sWorkloadAnomaliesHighMemoryUsageConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private K8sWorkloadAnomaliesHighMemoryUsageConfigurationArgs $;

        public Builder() {
            $ = new K8sWorkloadAnomaliesHighMemoryUsageConfigurationArgs();
        }

        public Builder(K8sWorkloadAnomaliesHighMemoryUsageConfigurationArgs defaults) {
            $ = new K8sWorkloadAnomaliesHighMemoryUsageConfigurationArgs(Objects.requireNonNull(defaults));
        }

        public Builder observationPeriodInMinutes(Output<Integer> observationPeriodInMinutes) {
            $.observationPeriodInMinutes = observationPeriodInMinutes;
            return this;
        }

        public Builder observationPeriodInMinutes(Integer observationPeriodInMinutes) {
            return observationPeriodInMinutes(Output.of(observationPeriodInMinutes));
        }

        public Builder samplePeriodInMinutes(Output<Integer> samplePeriodInMinutes) {
            $.samplePeriodInMinutes = samplePeriodInMinutes;
            return this;
        }

        public Builder samplePeriodInMinutes(Integer samplePeriodInMinutes) {
            return samplePeriodInMinutes(Output.of(samplePeriodInMinutes));
        }

        public Builder threshold(Output<Integer> threshold) {
            $.threshold = threshold;
            return this;
        }

        public Builder threshold(Integer threshold) {
            return threshold(Output.of(threshold));
        }

        public K8sWorkloadAnomaliesHighMemoryUsageConfigurationArgs build() {
            $.observationPeriodInMinutes = Objects.requireNonNull($.observationPeriodInMinutes, "expected parameter 'observationPeriodInMinutes' to be non-null");
            $.samplePeriodInMinutes = Objects.requireNonNull($.samplePeriodInMinutes, "expected parameter 'samplePeriodInMinutes' to be non-null");
            $.threshold = Objects.requireNonNull($.threshold, "expected parameter 'threshold' to be non-null");
            return $;
        }
    }

}

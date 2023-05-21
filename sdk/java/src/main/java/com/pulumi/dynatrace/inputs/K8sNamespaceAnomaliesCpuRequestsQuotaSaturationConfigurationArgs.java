// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;


public final class K8sNamespaceAnomaliesCpuRequestsQuotaSaturationConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final K8sNamespaceAnomaliesCpuRequestsQuotaSaturationConfigurationArgs Empty = new K8sNamespaceAnomaliesCpuRequestsQuotaSaturationConfigurationArgs();

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

    private K8sNamespaceAnomaliesCpuRequestsQuotaSaturationConfigurationArgs() {}

    private K8sNamespaceAnomaliesCpuRequestsQuotaSaturationConfigurationArgs(K8sNamespaceAnomaliesCpuRequestsQuotaSaturationConfigurationArgs $) {
        this.observationPeriodInMinutes = $.observationPeriodInMinutes;
        this.samplePeriodInMinutes = $.samplePeriodInMinutes;
        this.threshold = $.threshold;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(K8sNamespaceAnomaliesCpuRequestsQuotaSaturationConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private K8sNamespaceAnomaliesCpuRequestsQuotaSaturationConfigurationArgs $;

        public Builder() {
            $ = new K8sNamespaceAnomaliesCpuRequestsQuotaSaturationConfigurationArgs();
        }

        public Builder(K8sNamespaceAnomaliesCpuRequestsQuotaSaturationConfigurationArgs defaults) {
            $ = new K8sNamespaceAnomaliesCpuRequestsQuotaSaturationConfigurationArgs(Objects.requireNonNull(defaults));
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

        public K8sNamespaceAnomaliesCpuRequestsQuotaSaturationConfigurationArgs build() {
            $.observationPeriodInMinutes = Objects.requireNonNull($.observationPeriodInMinutes, "expected parameter 'observationPeriodInMinutes' to be non-null");
            $.samplePeriodInMinutes = Objects.requireNonNull($.samplePeriodInMinutes, "expected parameter 'samplePeriodInMinutes' to be non-null");
            $.threshold = Objects.requireNonNull($.threshold, "expected parameter 'threshold' to be non-null");
            return $;
        }
    }

}
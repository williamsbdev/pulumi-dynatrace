// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.dynatrace.outputs.HostAnomaliesV2NetworkHighNetworkDetectionCustomThresholdsEventThresholds;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class HostAnomaliesV2NetworkHighNetworkDetectionCustomThresholds {
    private Integer errorsPercentage;
    private HostAnomaliesV2NetworkHighNetworkDetectionCustomThresholdsEventThresholds eventThresholds;

    private HostAnomaliesV2NetworkHighNetworkDetectionCustomThresholds() {}
    public Integer errorsPercentage() {
        return this.errorsPercentage;
    }
    public HostAnomaliesV2NetworkHighNetworkDetectionCustomThresholdsEventThresholds eventThresholds() {
        return this.eventThresholds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HostAnomaliesV2NetworkHighNetworkDetectionCustomThresholds defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer errorsPercentage;
        private HostAnomaliesV2NetworkHighNetworkDetectionCustomThresholdsEventThresholds eventThresholds;
        public Builder() {}
        public Builder(HostAnomaliesV2NetworkHighNetworkDetectionCustomThresholds defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.errorsPercentage = defaults.errorsPercentage;
    	      this.eventThresholds = defaults.eventThresholds;
        }

        @CustomType.Setter
        public Builder errorsPercentage(Integer errorsPercentage) {
            this.errorsPercentage = Objects.requireNonNull(errorsPercentage);
            return this;
        }
        @CustomType.Setter
        public Builder eventThresholds(HostAnomaliesV2NetworkHighNetworkDetectionCustomThresholdsEventThresholds eventThresholds) {
            this.eventThresholds = Objects.requireNonNull(eventThresholds);
            return this;
        }
        public HostAnomaliesV2NetworkHighNetworkDetectionCustomThresholds build() {
            final var o = new HostAnomaliesV2NetworkHighNetworkDetectionCustomThresholds();
            o.errorsPercentage = errorsPercentage;
            o.eventThresholds = eventThresholds;
            return o;
        }
    }
}
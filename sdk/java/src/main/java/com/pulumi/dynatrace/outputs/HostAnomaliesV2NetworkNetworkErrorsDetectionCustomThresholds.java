// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.dynatrace.outputs.HostAnomaliesV2NetworkNetworkErrorsDetectionCustomThresholdsEventThresholds;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class HostAnomaliesV2NetworkNetworkErrorsDetectionCustomThresholds {
    private Integer errorsPercentage;
    private HostAnomaliesV2NetworkNetworkErrorsDetectionCustomThresholdsEventThresholds eventThresholds;
    private Integer totalPacketsRate;

    private HostAnomaliesV2NetworkNetworkErrorsDetectionCustomThresholds() {}
    public Integer errorsPercentage() {
        return this.errorsPercentage;
    }
    public HostAnomaliesV2NetworkNetworkErrorsDetectionCustomThresholdsEventThresholds eventThresholds() {
        return this.eventThresholds;
    }
    public Integer totalPacketsRate() {
        return this.totalPacketsRate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HostAnomaliesV2NetworkNetworkErrorsDetectionCustomThresholds defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer errorsPercentage;
        private HostAnomaliesV2NetworkNetworkErrorsDetectionCustomThresholdsEventThresholds eventThresholds;
        private Integer totalPacketsRate;
        public Builder() {}
        public Builder(HostAnomaliesV2NetworkNetworkErrorsDetectionCustomThresholds defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.errorsPercentage = defaults.errorsPercentage;
    	      this.eventThresholds = defaults.eventThresholds;
    	      this.totalPacketsRate = defaults.totalPacketsRate;
        }

        @CustomType.Setter
        public Builder errorsPercentage(Integer errorsPercentage) {
            this.errorsPercentage = Objects.requireNonNull(errorsPercentage);
            return this;
        }
        @CustomType.Setter
        public Builder eventThresholds(HostAnomaliesV2NetworkNetworkErrorsDetectionCustomThresholdsEventThresholds eventThresholds) {
            this.eventThresholds = Objects.requireNonNull(eventThresholds);
            return this;
        }
        @CustomType.Setter
        public Builder totalPacketsRate(Integer totalPacketsRate) {
            this.totalPacketsRate = Objects.requireNonNull(totalPacketsRate);
            return this;
        }
        public HostAnomaliesV2NetworkNetworkErrorsDetectionCustomThresholds build() {
            final var o = new HostAnomaliesV2NetworkNetworkErrorsDetectionCustomThresholds();
            o.errorsPercentage = errorsPercentage;
            o.eventThresholds = eventThresholds;
            o.totalPacketsRate = totalPacketsRate;
            return o;
        }
    }
}

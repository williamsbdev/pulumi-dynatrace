// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class HostAnomaliesV2NetworkNetworkTcpProblemsDetectionCustomThresholdsEventThresholds {
    private Integer dealertingEvaluationWindow;
    private Integer dealertingSamples;
    private Integer violatingEvaluationWindow;
    private Integer violatingSamples;

    private HostAnomaliesV2NetworkNetworkTcpProblemsDetectionCustomThresholdsEventThresholds() {}
    public Integer dealertingEvaluationWindow() {
        return this.dealertingEvaluationWindow;
    }
    public Integer dealertingSamples() {
        return this.dealertingSamples;
    }
    public Integer violatingEvaluationWindow() {
        return this.violatingEvaluationWindow;
    }
    public Integer violatingSamples() {
        return this.violatingSamples;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HostAnomaliesV2NetworkNetworkTcpProblemsDetectionCustomThresholdsEventThresholds defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer dealertingEvaluationWindow;
        private Integer dealertingSamples;
        private Integer violatingEvaluationWindow;
        private Integer violatingSamples;
        public Builder() {}
        public Builder(HostAnomaliesV2NetworkNetworkTcpProblemsDetectionCustomThresholdsEventThresholds defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dealertingEvaluationWindow = defaults.dealertingEvaluationWindow;
    	      this.dealertingSamples = defaults.dealertingSamples;
    	      this.violatingEvaluationWindow = defaults.violatingEvaluationWindow;
    	      this.violatingSamples = defaults.violatingSamples;
        }

        @CustomType.Setter
        public Builder dealertingEvaluationWindow(Integer dealertingEvaluationWindow) {
            this.dealertingEvaluationWindow = Objects.requireNonNull(dealertingEvaluationWindow);
            return this;
        }
        @CustomType.Setter
        public Builder dealertingSamples(Integer dealertingSamples) {
            this.dealertingSamples = Objects.requireNonNull(dealertingSamples);
            return this;
        }
        @CustomType.Setter
        public Builder violatingEvaluationWindow(Integer violatingEvaluationWindow) {
            this.violatingEvaluationWindow = Objects.requireNonNull(violatingEvaluationWindow);
            return this;
        }
        @CustomType.Setter
        public Builder violatingSamples(Integer violatingSamples) {
            this.violatingSamples = Objects.requireNonNull(violatingSamples);
            return this;
        }
        public HostAnomaliesV2NetworkNetworkTcpProblemsDetectionCustomThresholdsEventThresholds build() {
            final var o = new HostAnomaliesV2NetworkNetworkTcpProblemsDetectionCustomThresholdsEventThresholds();
            o.dealertingEvaluationWindow = dealertingEvaluationWindow;
            o.dealertingSamples = dealertingSamples;
            o.violatingEvaluationWindow = violatingEvaluationWindow;
            o.violatingSamples = violatingSamples;
            return o;
        }
    }
}

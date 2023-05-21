// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class ServiceAnomaliesV2ResponseTimeFixedDetectionOverAlertingProtection {
    private Integer minutesAbnormalState;
    private Double requestsPerMinute;

    private ServiceAnomaliesV2ResponseTimeFixedDetectionOverAlertingProtection() {}
    public Integer minutesAbnormalState() {
        return this.minutesAbnormalState;
    }
    public Double requestsPerMinute() {
        return this.requestsPerMinute;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceAnomaliesV2ResponseTimeFixedDetectionOverAlertingProtection defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer minutesAbnormalState;
        private Double requestsPerMinute;
        public Builder() {}
        public Builder(ServiceAnomaliesV2ResponseTimeFixedDetectionOverAlertingProtection defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.minutesAbnormalState = defaults.minutesAbnormalState;
    	      this.requestsPerMinute = defaults.requestsPerMinute;
        }

        @CustomType.Setter
        public Builder minutesAbnormalState(Integer minutesAbnormalState) {
            this.minutesAbnormalState = Objects.requireNonNull(minutesAbnormalState);
            return this;
        }
        @CustomType.Setter
        public Builder requestsPerMinute(Double requestsPerMinute) {
            this.requestsPerMinute = Objects.requireNonNull(requestsPerMinute);
            return this;
        }
        public ServiceAnomaliesV2ResponseTimeFixedDetectionOverAlertingProtection build() {
            final var o = new ServiceAnomaliesV2ResponseTimeFixedDetectionOverAlertingProtection();
            o.minutesAbnormalState = minutesAbnormalState;
            o.requestsPerMinute = requestsPerMinute;
            return o;
        }
    }
}

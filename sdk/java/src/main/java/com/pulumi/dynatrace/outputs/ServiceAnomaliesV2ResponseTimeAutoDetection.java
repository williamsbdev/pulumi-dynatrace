// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.dynatrace.outputs.ServiceAnomaliesV2ResponseTimeAutoDetectionOverAlertingProtection;
import com.pulumi.dynatrace.outputs.ServiceAnomaliesV2ResponseTimeAutoDetectionResponseTimeAll;
import com.pulumi.dynatrace.outputs.ServiceAnomaliesV2ResponseTimeAutoDetectionResponseTimeSlowest;
import java.util.Objects;

@CustomType
public final class ServiceAnomaliesV2ResponseTimeAutoDetection {
    private ServiceAnomaliesV2ResponseTimeAutoDetectionOverAlertingProtection overAlertingProtection;
    private ServiceAnomaliesV2ResponseTimeAutoDetectionResponseTimeAll responseTimeAll;
    private ServiceAnomaliesV2ResponseTimeAutoDetectionResponseTimeSlowest responseTimeSlowest;

    private ServiceAnomaliesV2ResponseTimeAutoDetection() {}
    public ServiceAnomaliesV2ResponseTimeAutoDetectionOverAlertingProtection overAlertingProtection() {
        return this.overAlertingProtection;
    }
    public ServiceAnomaliesV2ResponseTimeAutoDetectionResponseTimeAll responseTimeAll() {
        return this.responseTimeAll;
    }
    public ServiceAnomaliesV2ResponseTimeAutoDetectionResponseTimeSlowest responseTimeSlowest() {
        return this.responseTimeSlowest;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceAnomaliesV2ResponseTimeAutoDetection defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private ServiceAnomaliesV2ResponseTimeAutoDetectionOverAlertingProtection overAlertingProtection;
        private ServiceAnomaliesV2ResponseTimeAutoDetectionResponseTimeAll responseTimeAll;
        private ServiceAnomaliesV2ResponseTimeAutoDetectionResponseTimeSlowest responseTimeSlowest;
        public Builder() {}
        public Builder(ServiceAnomaliesV2ResponseTimeAutoDetection defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.overAlertingProtection = defaults.overAlertingProtection;
    	      this.responseTimeAll = defaults.responseTimeAll;
    	      this.responseTimeSlowest = defaults.responseTimeSlowest;
        }

        @CustomType.Setter
        public Builder overAlertingProtection(ServiceAnomaliesV2ResponseTimeAutoDetectionOverAlertingProtection overAlertingProtection) {
            this.overAlertingProtection = Objects.requireNonNull(overAlertingProtection);
            return this;
        }
        @CustomType.Setter
        public Builder responseTimeAll(ServiceAnomaliesV2ResponseTimeAutoDetectionResponseTimeAll responseTimeAll) {
            this.responseTimeAll = Objects.requireNonNull(responseTimeAll);
            return this;
        }
        @CustomType.Setter
        public Builder responseTimeSlowest(ServiceAnomaliesV2ResponseTimeAutoDetectionResponseTimeSlowest responseTimeSlowest) {
            this.responseTimeSlowest = Objects.requireNonNull(responseTimeSlowest);
            return this;
        }
        public ServiceAnomaliesV2ResponseTimeAutoDetection build() {
            final var o = new ServiceAnomaliesV2ResponseTimeAutoDetection();
            o.overAlertingProtection = overAlertingProtection;
            o.responseTimeAll = responseTimeAll;
            o.responseTimeSlowest = responseTimeSlowest;
            return o;
        }
    }
}

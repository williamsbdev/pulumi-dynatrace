// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.dynatrace.outputs.WebAppAnomaliesResponseTimeResponseTimeFixedOverAlertingProtection;
import com.pulumi.dynatrace.outputs.WebAppAnomaliesResponseTimeResponseTimeFixedResponseTimeAll;
import com.pulumi.dynatrace.outputs.WebAppAnomaliesResponseTimeResponseTimeFixedResponseTimeSlowest;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class WebAppAnomaliesResponseTimeResponseTimeFixed {
    private WebAppAnomaliesResponseTimeResponseTimeFixedOverAlertingProtection overAlertingProtection;
    private WebAppAnomaliesResponseTimeResponseTimeFixedResponseTimeAll responseTimeAll;
    private WebAppAnomaliesResponseTimeResponseTimeFixedResponseTimeSlowest responseTimeSlowest;
    private String sensitivity;

    private WebAppAnomaliesResponseTimeResponseTimeFixed() {}
    public WebAppAnomaliesResponseTimeResponseTimeFixedOverAlertingProtection overAlertingProtection() {
        return this.overAlertingProtection;
    }
    public WebAppAnomaliesResponseTimeResponseTimeFixedResponseTimeAll responseTimeAll() {
        return this.responseTimeAll;
    }
    public WebAppAnomaliesResponseTimeResponseTimeFixedResponseTimeSlowest responseTimeSlowest() {
        return this.responseTimeSlowest;
    }
    public String sensitivity() {
        return this.sensitivity;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAppAnomaliesResponseTimeResponseTimeFixed defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private WebAppAnomaliesResponseTimeResponseTimeFixedOverAlertingProtection overAlertingProtection;
        private WebAppAnomaliesResponseTimeResponseTimeFixedResponseTimeAll responseTimeAll;
        private WebAppAnomaliesResponseTimeResponseTimeFixedResponseTimeSlowest responseTimeSlowest;
        private String sensitivity;
        public Builder() {}
        public Builder(WebAppAnomaliesResponseTimeResponseTimeFixed defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.overAlertingProtection = defaults.overAlertingProtection;
    	      this.responseTimeAll = defaults.responseTimeAll;
    	      this.responseTimeSlowest = defaults.responseTimeSlowest;
    	      this.sensitivity = defaults.sensitivity;
        }

        @CustomType.Setter
        public Builder overAlertingProtection(WebAppAnomaliesResponseTimeResponseTimeFixedOverAlertingProtection overAlertingProtection) {
            this.overAlertingProtection = Objects.requireNonNull(overAlertingProtection);
            return this;
        }
        @CustomType.Setter
        public Builder responseTimeAll(WebAppAnomaliesResponseTimeResponseTimeFixedResponseTimeAll responseTimeAll) {
            this.responseTimeAll = Objects.requireNonNull(responseTimeAll);
            return this;
        }
        @CustomType.Setter
        public Builder responseTimeSlowest(WebAppAnomaliesResponseTimeResponseTimeFixedResponseTimeSlowest responseTimeSlowest) {
            this.responseTimeSlowest = Objects.requireNonNull(responseTimeSlowest);
            return this;
        }
        @CustomType.Setter
        public Builder sensitivity(String sensitivity) {
            this.sensitivity = Objects.requireNonNull(sensitivity);
            return this;
        }
        public WebAppAnomaliesResponseTimeResponseTimeFixed build() {
            final var o = new WebAppAnomaliesResponseTimeResponseTimeFixed();
            o.overAlertingProtection = overAlertingProtection;
            o.responseTimeAll = responseTimeAll;
            o.responseTimeSlowest = responseTimeSlowest;
            o.sensitivity = sensitivity;
            return o;
        }
    }
}

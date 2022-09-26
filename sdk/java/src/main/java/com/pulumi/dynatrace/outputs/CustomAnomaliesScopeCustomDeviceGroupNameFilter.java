// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class CustomAnomaliesScopeCustomDeviceGroupNameFilter {
    private String operator;
    private String value;

    private CustomAnomaliesScopeCustomDeviceGroupNameFilter() {}
    public String operator() {
        return this.operator;
    }
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomAnomaliesScopeCustomDeviceGroupNameFilter defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String operator;
        private String value;
        public Builder() {}
        public Builder(CustomAnomaliesScopeCustomDeviceGroupNameFilter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.operator = defaults.operator;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder operator(String operator) {
            this.operator = Objects.requireNonNull(operator);
            return this;
        }
        @CustomType.Setter
        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public CustomAnomaliesScopeCustomDeviceGroupNameFilter build() {
            final var o = new CustomAnomaliesScopeCustomDeviceGroupNameFilter();
            o.operator = operator;
            o.value = value;
            return o;
        }
    }
}
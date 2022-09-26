// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CalculatedServiceMetricMetricDefinition {
    private String metric;
    private @Nullable String requestAttribute;

    private CalculatedServiceMetricMetricDefinition() {}
    public String metric() {
        return this.metric;
    }
    public Optional<String> requestAttribute() {
        return Optional.ofNullable(this.requestAttribute);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CalculatedServiceMetricMetricDefinition defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String metric;
        private @Nullable String requestAttribute;
        public Builder() {}
        public Builder(CalculatedServiceMetricMetricDefinition defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.metric = defaults.metric;
    	      this.requestAttribute = defaults.requestAttribute;
        }

        @CustomType.Setter
        public Builder metric(String metric) {
            this.metric = Objects.requireNonNull(metric);
            return this;
        }
        @CustomType.Setter
        public Builder requestAttribute(@Nullable String requestAttribute) {
            this.requestAttribute = requestAttribute;
            return this;
        }
        public CalculatedServiceMetricMetricDefinition build() {
            final var o = new CalculatedServiceMetricMetricDefinition();
            o.metric = metric;
            o.requestAttribute = requestAttribute;
            return o;
        }
    }
}
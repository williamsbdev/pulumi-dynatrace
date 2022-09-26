// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class HostAnomaliesDisksSpaceThresholds {
    private Integer percentage;

    private HostAnomaliesDisksSpaceThresholds() {}
    public Integer percentage() {
        return this.percentage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HostAnomaliesDisksSpaceThresholds defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer percentage;
        public Builder() {}
        public Builder(HostAnomaliesDisksSpaceThresholds defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.percentage = defaults.percentage;
        }

        @CustomType.Setter
        public Builder percentage(Integer percentage) {
            this.percentage = Objects.requireNonNull(percentage);
            return this;
        }
        public HostAnomaliesDisksSpaceThresholds build() {
            final var o = new HostAnomaliesDisksSpaceThresholds();
            o.percentage = percentage;
            return o;
        }
    }
}
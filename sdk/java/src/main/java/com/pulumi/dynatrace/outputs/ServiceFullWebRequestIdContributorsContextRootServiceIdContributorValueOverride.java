// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ServiceFullWebRequestIdContributorsContextRootServiceIdContributorValueOverride {
    private String value;

    private ServiceFullWebRequestIdContributorsContextRootServiceIdContributorValueOverride() {}
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceFullWebRequestIdContributorsContextRootServiceIdContributorValueOverride defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String value;
        public Builder() {}
        public Builder(ServiceFullWebRequestIdContributorsContextRootServiceIdContributorValueOverride defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public ServiceFullWebRequestIdContributorsContextRootServiceIdContributorValueOverride build() {
            final var o = new ServiceFullWebRequestIdContributorsContextRootServiceIdContributorValueOverride();
            o.value = value;
            return o;
        }
    }
}

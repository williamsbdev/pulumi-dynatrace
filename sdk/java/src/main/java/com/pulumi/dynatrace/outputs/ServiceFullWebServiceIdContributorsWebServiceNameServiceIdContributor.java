// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.dynatrace.outputs.ServiceFullWebServiceIdContributorsWebServiceNameServiceIdContributorTransformations;
import com.pulumi.dynatrace.outputs.ServiceFullWebServiceIdContributorsWebServiceNameServiceIdContributorValueOverride;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServiceFullWebServiceIdContributorsWebServiceNameServiceIdContributor {
    private String contributionType;
    private @Nullable ServiceFullWebServiceIdContributorsWebServiceNameServiceIdContributorTransformations transformations;
    private @Nullable ServiceFullWebServiceIdContributorsWebServiceNameServiceIdContributorValueOverride valueOverride;

    private ServiceFullWebServiceIdContributorsWebServiceNameServiceIdContributor() {}
    public String contributionType() {
        return this.contributionType;
    }
    public Optional<ServiceFullWebServiceIdContributorsWebServiceNameServiceIdContributorTransformations> transformations() {
        return Optional.ofNullable(this.transformations);
    }
    public Optional<ServiceFullWebServiceIdContributorsWebServiceNameServiceIdContributorValueOverride> valueOverride() {
        return Optional.ofNullable(this.valueOverride);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceFullWebServiceIdContributorsWebServiceNameServiceIdContributor defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String contributionType;
        private @Nullable ServiceFullWebServiceIdContributorsWebServiceNameServiceIdContributorTransformations transformations;
        private @Nullable ServiceFullWebServiceIdContributorsWebServiceNameServiceIdContributorValueOverride valueOverride;
        public Builder() {}
        public Builder(ServiceFullWebServiceIdContributorsWebServiceNameServiceIdContributor defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contributionType = defaults.contributionType;
    	      this.transformations = defaults.transformations;
    	      this.valueOverride = defaults.valueOverride;
        }

        @CustomType.Setter
        public Builder contributionType(String contributionType) {
            this.contributionType = Objects.requireNonNull(contributionType);
            return this;
        }
        @CustomType.Setter
        public Builder transformations(@Nullable ServiceFullWebServiceIdContributorsWebServiceNameServiceIdContributorTransformations transformations) {
            this.transformations = transformations;
            return this;
        }
        @CustomType.Setter
        public Builder valueOverride(@Nullable ServiceFullWebServiceIdContributorsWebServiceNameServiceIdContributorValueOverride valueOverride) {
            this.valueOverride = valueOverride;
            return this;
        }
        public ServiceFullWebServiceIdContributorsWebServiceNameServiceIdContributor build() {
            final var o = new ServiceFullWebServiceIdContributorsWebServiceNameServiceIdContributor();
            o.contributionType = contributionType;
            o.transformations = transformations;
            o.valueOverride = valueOverride;
            return o;
        }
    }
}
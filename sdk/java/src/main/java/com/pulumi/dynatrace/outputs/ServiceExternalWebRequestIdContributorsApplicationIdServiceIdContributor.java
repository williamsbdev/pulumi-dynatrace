// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.dynatrace.outputs.ServiceExternalWebRequestIdContributorsApplicationIdServiceIdContributorTransformations;
import com.pulumi.dynatrace.outputs.ServiceExternalWebRequestIdContributorsApplicationIdServiceIdContributorValueOverride;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServiceExternalWebRequestIdContributorsApplicationIdServiceIdContributor {
    private String contributionType;
    private @Nullable ServiceExternalWebRequestIdContributorsApplicationIdServiceIdContributorTransformations transformations;
    private @Nullable ServiceExternalWebRequestIdContributorsApplicationIdServiceIdContributorValueOverride valueOverride;

    private ServiceExternalWebRequestIdContributorsApplicationIdServiceIdContributor() {}
    public String contributionType() {
        return this.contributionType;
    }
    public Optional<ServiceExternalWebRequestIdContributorsApplicationIdServiceIdContributorTransformations> transformations() {
        return Optional.ofNullable(this.transformations);
    }
    public Optional<ServiceExternalWebRequestIdContributorsApplicationIdServiceIdContributorValueOverride> valueOverride() {
        return Optional.ofNullable(this.valueOverride);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceExternalWebRequestIdContributorsApplicationIdServiceIdContributor defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String contributionType;
        private @Nullable ServiceExternalWebRequestIdContributorsApplicationIdServiceIdContributorTransformations transformations;
        private @Nullable ServiceExternalWebRequestIdContributorsApplicationIdServiceIdContributorValueOverride valueOverride;
        public Builder() {}
        public Builder(ServiceExternalWebRequestIdContributorsApplicationIdServiceIdContributor defaults) {
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
        public Builder transformations(@Nullable ServiceExternalWebRequestIdContributorsApplicationIdServiceIdContributorTransformations transformations) {
            this.transformations = transformations;
            return this;
        }
        @CustomType.Setter
        public Builder valueOverride(@Nullable ServiceExternalWebRequestIdContributorsApplicationIdServiceIdContributorValueOverride valueOverride) {
            this.valueOverride = valueOverride;
            return this;
        }
        public ServiceExternalWebRequestIdContributorsApplicationIdServiceIdContributor build() {
            final var o = new ServiceExternalWebRequestIdContributorsApplicationIdServiceIdContributor();
            o.contributionType = contributionType;
            o.transformations = transformations;
            o.valueOverride = valueOverride;
            return o;
        }
    }
}
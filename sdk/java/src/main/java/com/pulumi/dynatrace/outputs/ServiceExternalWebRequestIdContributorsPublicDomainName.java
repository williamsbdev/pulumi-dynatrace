// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.dynatrace.outputs.ServiceExternalWebRequestIdContributorsPublicDomainNameServiceIdContributor;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServiceExternalWebRequestIdContributorsPublicDomainName {
    private Boolean enableIdContributor;
    private @Nullable ServiceExternalWebRequestIdContributorsPublicDomainNameServiceIdContributor serviceIdContributor;

    private ServiceExternalWebRequestIdContributorsPublicDomainName() {}
    public Boolean enableIdContributor() {
        return this.enableIdContributor;
    }
    public Optional<ServiceExternalWebRequestIdContributorsPublicDomainNameServiceIdContributor> serviceIdContributor() {
        return Optional.ofNullable(this.serviceIdContributor);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceExternalWebRequestIdContributorsPublicDomainName defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean enableIdContributor;
        private @Nullable ServiceExternalWebRequestIdContributorsPublicDomainNameServiceIdContributor serviceIdContributor;
        public Builder() {}
        public Builder(ServiceExternalWebRequestIdContributorsPublicDomainName defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableIdContributor = defaults.enableIdContributor;
    	      this.serviceIdContributor = defaults.serviceIdContributor;
        }

        @CustomType.Setter
        public Builder enableIdContributor(Boolean enableIdContributor) {
            this.enableIdContributor = Objects.requireNonNull(enableIdContributor);
            return this;
        }
        @CustomType.Setter
        public Builder serviceIdContributor(@Nullable ServiceExternalWebRequestIdContributorsPublicDomainNameServiceIdContributor serviceIdContributor) {
            this.serviceIdContributor = serviceIdContributor;
            return this;
        }
        public ServiceExternalWebRequestIdContributorsPublicDomainName build() {
            final var o = new ServiceExternalWebRequestIdContributorsPublicDomainName();
            o.enableIdContributor = enableIdContributor;
            o.serviceIdContributor = serviceIdContributor;
            return o;
        }
    }
}

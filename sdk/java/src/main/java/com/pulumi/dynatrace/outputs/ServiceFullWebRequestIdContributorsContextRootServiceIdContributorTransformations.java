// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.dynatrace.outputs.ServiceFullWebRequestIdContributorsContextRootServiceIdContributorTransformationsTransformation;
import java.util.List;
import java.util.Objects;

@CustomType
public final class ServiceFullWebRequestIdContributorsContextRootServiceIdContributorTransformations {
    private List<ServiceFullWebRequestIdContributorsContextRootServiceIdContributorTransformationsTransformation> transformations;

    private ServiceFullWebRequestIdContributorsContextRootServiceIdContributorTransformations() {}
    public List<ServiceFullWebRequestIdContributorsContextRootServiceIdContributorTransformationsTransformation> transformations() {
        return this.transformations;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceFullWebRequestIdContributorsContextRootServiceIdContributorTransformations defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<ServiceFullWebRequestIdContributorsContextRootServiceIdContributorTransformationsTransformation> transformations;
        public Builder() {}
        public Builder(ServiceFullWebRequestIdContributorsContextRootServiceIdContributorTransformations defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.transformations = defaults.transformations;
        }

        @CustomType.Setter
        public Builder transformations(List<ServiceFullWebRequestIdContributorsContextRootServiceIdContributorTransformationsTransformation> transformations) {
            this.transformations = Objects.requireNonNull(transformations);
            return this;
        }
        public Builder transformations(ServiceFullWebRequestIdContributorsContextRootServiceIdContributorTransformationsTransformation... transformations) {
            return transformations(List.of(transformations));
        }
        public ServiceFullWebRequestIdContributorsContextRootServiceIdContributorTransformations build() {
            final var o = new ServiceFullWebRequestIdContributorsContextRootServiceIdContributorTransformations();
            o.transformations = transformations;
            return o;
        }
    }
}

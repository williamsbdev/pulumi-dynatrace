// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.dynatrace.outputs.OwnershipConfigOwnershipIdentifiersOwnershipIdentifier;
import java.util.List;
import java.util.Objects;

@CustomType
public final class OwnershipConfigOwnershipIdentifiers {
    private List<OwnershipConfigOwnershipIdentifiersOwnershipIdentifier> ownershipIdentifiers;

    private OwnershipConfigOwnershipIdentifiers() {}
    public List<OwnershipConfigOwnershipIdentifiersOwnershipIdentifier> ownershipIdentifiers() {
        return this.ownershipIdentifiers;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OwnershipConfigOwnershipIdentifiers defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<OwnershipConfigOwnershipIdentifiersOwnershipIdentifier> ownershipIdentifiers;
        public Builder() {}
        public Builder(OwnershipConfigOwnershipIdentifiers defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ownershipIdentifiers = defaults.ownershipIdentifiers;
        }

        @CustomType.Setter
        public Builder ownershipIdentifiers(List<OwnershipConfigOwnershipIdentifiersOwnershipIdentifier> ownershipIdentifiers) {
            this.ownershipIdentifiers = Objects.requireNonNull(ownershipIdentifiers);
            return this;
        }
        public Builder ownershipIdentifiers(OwnershipConfigOwnershipIdentifiersOwnershipIdentifier... ownershipIdentifiers) {
            return ownershipIdentifiers(List.of(ownershipIdentifiers));
        }
        public OwnershipConfigOwnershipIdentifiers build() {
            final var o = new OwnershipConfigOwnershipIdentifiers();
            o.ownershipIdentifiers = ownershipIdentifiers;
            return o;
        }
    }
}

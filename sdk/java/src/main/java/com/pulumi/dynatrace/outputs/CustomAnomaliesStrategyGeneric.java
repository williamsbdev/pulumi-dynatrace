// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CustomAnomaliesStrategyGeneric {
    private String type;
    /**
     * @return allows for configuring properties that are not explicitly supported by the current version of this provider
     * 
     */
    private @Nullable String unknowns;

    private CustomAnomaliesStrategyGeneric() {}
    public String type() {
        return this.type;
    }
    /**
     * @return allows for configuring properties that are not explicitly supported by the current version of this provider
     * 
     */
    public Optional<String> unknowns() {
        return Optional.ofNullable(this.unknowns);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomAnomaliesStrategyGeneric defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String type;
        private @Nullable String unknowns;
        public Builder() {}
        public Builder(CustomAnomaliesStrategyGeneric defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
    	      this.unknowns = defaults.unknowns;
        }

        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        @CustomType.Setter
        public Builder unknowns(@Nullable String unknowns) {
            this.unknowns = unknowns;
            return this;
        }
        public CustomAnomaliesStrategyGeneric build() {
            final var o = new CustomAnomaliesStrategyGeneric();
            o.type = type;
            o.unknowns = unknowns;
            return o;
        }
    }
}
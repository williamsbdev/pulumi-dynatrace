// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.dynatrace.outputs.AutotagRuleConditionCustomProcessMetadataDynamicKey;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AutotagRuleConditionCustomProcessMetadata {
    private String attribute;
    private AutotagRuleConditionCustomProcessMetadataDynamicKey dynamicKey;
    private @Nullable String unknowns;

    private AutotagRuleConditionCustomProcessMetadata() {}
    public String attribute() {
        return this.attribute;
    }
    public AutotagRuleConditionCustomProcessMetadataDynamicKey dynamicKey() {
        return this.dynamicKey;
    }
    public Optional<String> unknowns() {
        return Optional.ofNullable(this.unknowns);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutotagRuleConditionCustomProcessMetadata defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String attribute;
        private AutotagRuleConditionCustomProcessMetadataDynamicKey dynamicKey;
        private @Nullable String unknowns;
        public Builder() {}
        public Builder(AutotagRuleConditionCustomProcessMetadata defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attribute = defaults.attribute;
    	      this.dynamicKey = defaults.dynamicKey;
    	      this.unknowns = defaults.unknowns;
        }

        @CustomType.Setter
        public Builder attribute(String attribute) {
            this.attribute = Objects.requireNonNull(attribute);
            return this;
        }
        @CustomType.Setter
        public Builder dynamicKey(AutotagRuleConditionCustomProcessMetadataDynamicKey dynamicKey) {
            this.dynamicKey = Objects.requireNonNull(dynamicKey);
            return this;
        }
        @CustomType.Setter
        public Builder unknowns(@Nullable String unknowns) {
            this.unknowns = unknowns;
            return this;
        }
        public AutotagRuleConditionCustomProcessMetadata build() {
            final var o = new AutotagRuleConditionCustomProcessMetadata();
            o.attribute = attribute;
            o.dynamicKey = dynamicKey;
            o.unknowns = unknowns;
            return o;
        }
    }
}
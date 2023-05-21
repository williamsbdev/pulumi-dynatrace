// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GenericTypesRulesRuleAttributesAttribute {
    /**
     * @return The human readable type name for this entity type.
     * 
     */
    private @Nullable String displayName;
    private String key;
    private String pattern;

    private GenericTypesRulesRuleAttributesAttribute() {}
    /**
     * @return The human readable type name for this entity type.
     * 
     */
    public Optional<String> displayName() {
        return Optional.ofNullable(this.displayName);
    }
    public String key() {
        return this.key;
    }
    public String pattern() {
        return this.pattern;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GenericTypesRulesRuleAttributesAttribute defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String displayName;
        private String key;
        private String pattern;
        public Builder() {}
        public Builder(GenericTypesRulesRuleAttributesAttribute defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayName = defaults.displayName;
    	      this.key = defaults.key;
    	      this.pattern = defaults.pattern;
        }

        @CustomType.Setter
        public Builder displayName(@Nullable String displayName) {
            this.displayName = displayName;
            return this;
        }
        @CustomType.Setter
        public Builder key(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }
        @CustomType.Setter
        public Builder pattern(String pattern) {
            this.pattern = Objects.requireNonNull(pattern);
            return this;
        }
        public GenericTypesRulesRuleAttributesAttribute build() {
            final var o = new GenericTypesRulesRuleAttributesAttribute();
            o.displayName = displayName;
            o.key = key;
            o.pattern = pattern;
            return o;
        }
    }
}
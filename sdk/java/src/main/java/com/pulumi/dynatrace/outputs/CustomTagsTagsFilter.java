// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CustomTagsTagsFilter {
    private String context;
    private String key;
    private @Nullable String value;

    private CustomTagsTagsFilter() {}
    public String context() {
        return this.context;
    }
    public String key() {
        return this.key;
    }
    public Optional<String> value() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomTagsTagsFilter defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String context;
        private String key;
        private @Nullable String value;
        public Builder() {}
        public Builder(CustomTagsTagsFilter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.context = defaults.context;
    	      this.key = defaults.key;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder context(String context) {
            this.context = Objects.requireNonNull(context);
            return this;
        }
        @CustomType.Setter
        public Builder key(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }
        @CustomType.Setter
        public Builder value(@Nullable String value) {
            this.value = value;
            return this;
        }
        public CustomTagsTagsFilter build() {
            final var o = new CustomTagsTagsFilter();
            o.context = context;
            o.key = key;
            o.value = value;
            return o;
        }
    }
}

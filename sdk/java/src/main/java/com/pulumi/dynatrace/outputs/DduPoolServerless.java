// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DduPoolServerless {
    /**
     * @return Is the limit configuration enabled
     * 
     */
    private Boolean enabled;
    /**
     * @return Type of the limit applied: MONTHLY or ANNUAL
     * 
     */
    private @Nullable String type;
    /**
     * @return Value of the DDU limit applied for provided timerange
     * 
     */
    private @Nullable Integer value;

    private DduPoolServerless() {}
    /**
     * @return Is the limit configuration enabled
     * 
     */
    public Boolean enabled() {
        return this.enabled;
    }
    /**
     * @return Type of the limit applied: MONTHLY or ANNUAL
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }
    /**
     * @return Value of the DDU limit applied for provided timerange
     * 
     */
    public Optional<Integer> value() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DduPoolServerless defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean enabled;
        private @Nullable String type;
        private @Nullable Integer value;
        public Builder() {}
        public Builder(DduPoolServerless defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.type = defaults.type;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder enabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }
        @CustomType.Setter
        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }
        @CustomType.Setter
        public Builder value(@Nullable Integer value) {
            this.value = value;
            return this;
        }
        public DduPoolServerless build() {
            final var o = new DduPoolServerless();
            o.enabled = enabled;
            o.type = type;
            o.value = value;
            return o;
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DatabaseAnomaliesLoadSpikes {
    private @Nullable Integer minutes;
    private @Nullable Integer percent;
    private @Nullable String unknowns;

    private DatabaseAnomaliesLoadSpikes() {}
    public Optional<Integer> minutes() {
        return Optional.ofNullable(this.minutes);
    }
    public Optional<Integer> percent() {
        return Optional.ofNullable(this.percent);
    }
    public Optional<String> unknowns() {
        return Optional.ofNullable(this.unknowns);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatabaseAnomaliesLoadSpikes defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer minutes;
        private @Nullable Integer percent;
        private @Nullable String unknowns;
        public Builder() {}
        public Builder(DatabaseAnomaliesLoadSpikes defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.minutes = defaults.minutes;
    	      this.percent = defaults.percent;
    	      this.unknowns = defaults.unknowns;
        }

        @CustomType.Setter
        public Builder minutes(@Nullable Integer minutes) {
            this.minutes = minutes;
            return this;
        }
        @CustomType.Setter
        public Builder percent(@Nullable Integer percent) {
            this.percent = percent;
            return this;
        }
        @CustomType.Setter
        public Builder unknowns(@Nullable String unknowns) {
            this.unknowns = unknowns;
            return this;
        }
        public DatabaseAnomaliesLoadSpikes build() {
            final var o = new DatabaseAnomaliesLoadSpikes();
            o.minutes = minutes;
            o.percent = percent;
            o.unknowns = unknowns;
            return o;
        }
    }
}
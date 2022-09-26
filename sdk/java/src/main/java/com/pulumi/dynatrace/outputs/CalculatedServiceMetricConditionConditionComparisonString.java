// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CalculatedServiceMetricConditionConditionComparisonString {
    private @Nullable Boolean caseSensitive;
    private @Nullable String operator;
    private @Nullable String unknowns;
    private @Nullable String value;
    private @Nullable List<String> values;

    private CalculatedServiceMetricConditionConditionComparisonString() {}
    public Optional<Boolean> caseSensitive() {
        return Optional.ofNullable(this.caseSensitive);
    }
    public Optional<String> operator() {
        return Optional.ofNullable(this.operator);
    }
    public Optional<String> unknowns() {
        return Optional.ofNullable(this.unknowns);
    }
    public Optional<String> value() {
        return Optional.ofNullable(this.value);
    }
    public List<String> values() {
        return this.values == null ? List.of() : this.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CalculatedServiceMetricConditionConditionComparisonString defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean caseSensitive;
        private @Nullable String operator;
        private @Nullable String unknowns;
        private @Nullable String value;
        private @Nullable List<String> values;
        public Builder() {}
        public Builder(CalculatedServiceMetricConditionConditionComparisonString defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.caseSensitive = defaults.caseSensitive;
    	      this.operator = defaults.operator;
    	      this.unknowns = defaults.unknowns;
    	      this.value = defaults.value;
    	      this.values = defaults.values;
        }

        @CustomType.Setter
        public Builder caseSensitive(@Nullable Boolean caseSensitive) {
            this.caseSensitive = caseSensitive;
            return this;
        }
        @CustomType.Setter
        public Builder operator(@Nullable String operator) {
            this.operator = operator;
            return this;
        }
        @CustomType.Setter
        public Builder unknowns(@Nullable String unknowns) {
            this.unknowns = unknowns;
            return this;
        }
        @CustomType.Setter
        public Builder value(@Nullable String value) {
            this.value = value;
            return this;
        }
        @CustomType.Setter
        public Builder values(@Nullable List<String> values) {
            this.values = values;
            return this;
        }
        public Builder values(String... values) {
            return values(List.of(values));
        }
        public CalculatedServiceMetricConditionConditionComparisonString build() {
            final var o = new CalculatedServiceMetricConditionConditionComparisonString();
            o.caseSensitive = caseSensitive;
            o.operator = operator;
            o.unknowns = unknowns;
            o.value = value;
            o.values = values;
            return o;
        }
    }
}
// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CalculatedServiceMetricConditionConditionComparisonBooleanArgs extends com.pulumi.resources.ResourceArgs {

    public static final CalculatedServiceMetricConditionConditionComparisonBooleanArgs Empty = new CalculatedServiceMetricConditionConditionComparisonBooleanArgs();

    @Import(name="operator")
    private @Nullable Output<String> operator;

    public Optional<Output<String>> operator() {
        return Optional.ofNullable(this.operator);
    }

    @Import(name="unknowns")
    private @Nullable Output<String> unknowns;

    public Optional<Output<String>> unknowns() {
        return Optional.ofNullable(this.unknowns);
    }

    @Import(name="value", required=true)
    private Output<Boolean> value;

    public Output<Boolean> value() {
        return this.value;
    }

    @Import(name="values")
    private @Nullable Output<List<Boolean>> values;

    public Optional<Output<List<Boolean>>> values() {
        return Optional.ofNullable(this.values);
    }

    private CalculatedServiceMetricConditionConditionComparisonBooleanArgs() {}

    private CalculatedServiceMetricConditionConditionComparisonBooleanArgs(CalculatedServiceMetricConditionConditionComparisonBooleanArgs $) {
        this.operator = $.operator;
        this.unknowns = $.unknowns;
        this.value = $.value;
        this.values = $.values;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CalculatedServiceMetricConditionConditionComparisonBooleanArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CalculatedServiceMetricConditionConditionComparisonBooleanArgs $;

        public Builder() {
            $ = new CalculatedServiceMetricConditionConditionComparisonBooleanArgs();
        }

        public Builder(CalculatedServiceMetricConditionConditionComparisonBooleanArgs defaults) {
            $ = new CalculatedServiceMetricConditionConditionComparisonBooleanArgs(Objects.requireNonNull(defaults));
        }

        public Builder operator(@Nullable Output<String> operator) {
            $.operator = operator;
            return this;
        }

        public Builder operator(String operator) {
            return operator(Output.of(operator));
        }

        public Builder unknowns(@Nullable Output<String> unknowns) {
            $.unknowns = unknowns;
            return this;
        }

        public Builder unknowns(String unknowns) {
            return unknowns(Output.of(unknowns));
        }

        public Builder value(Output<Boolean> value) {
            $.value = value;
            return this;
        }

        public Builder value(Boolean value) {
            return value(Output.of(value));
        }

        public Builder values(@Nullable Output<List<Boolean>> values) {
            $.values = values;
            return this;
        }

        public Builder values(List<Boolean> values) {
            return values(Output.of(values));
        }

        public Builder values(Boolean... values) {
            return values(List.of(values));
        }

        public CalculatedServiceMetricConditionConditionComparisonBooleanArgs build() {
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            return $;
        }
    }

}

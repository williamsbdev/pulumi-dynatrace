// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.dynatrace.inputs.CalculatedServiceMetricConditionConditionComparisonTagValuesValueArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CalculatedServiceMetricConditionConditionComparisonTagValuesArgs extends com.pulumi.resources.ResourceArgs {

    public static final CalculatedServiceMetricConditionConditionComparisonTagValuesArgs Empty = new CalculatedServiceMetricConditionConditionComparisonTagValuesArgs();

    @Import(name="values")
    private @Nullable Output<List<CalculatedServiceMetricConditionConditionComparisonTagValuesValueArgs>> values;

    public Optional<Output<List<CalculatedServiceMetricConditionConditionComparisonTagValuesValueArgs>>> values() {
        return Optional.ofNullable(this.values);
    }

    private CalculatedServiceMetricConditionConditionComparisonTagValuesArgs() {}

    private CalculatedServiceMetricConditionConditionComparisonTagValuesArgs(CalculatedServiceMetricConditionConditionComparisonTagValuesArgs $) {
        this.values = $.values;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CalculatedServiceMetricConditionConditionComparisonTagValuesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CalculatedServiceMetricConditionConditionComparisonTagValuesArgs $;

        public Builder() {
            $ = new CalculatedServiceMetricConditionConditionComparisonTagValuesArgs();
        }

        public Builder(CalculatedServiceMetricConditionConditionComparisonTagValuesArgs defaults) {
            $ = new CalculatedServiceMetricConditionConditionComparisonTagValuesArgs(Objects.requireNonNull(defaults));
        }

        public Builder values(@Nullable Output<List<CalculatedServiceMetricConditionConditionComparisonTagValuesValueArgs>> values) {
            $.values = values;
            return this;
        }

        public Builder values(List<CalculatedServiceMetricConditionConditionComparisonTagValuesValueArgs> values) {
            return values(Output.of(values));
        }

        public Builder values(CalculatedServiceMetricConditionConditionComparisonTagValuesValueArgs... values) {
            return values(List.of(values));
        }

        public CalculatedServiceMetricConditionConditionComparisonTagValuesArgs build() {
            return $;
        }
    }

}
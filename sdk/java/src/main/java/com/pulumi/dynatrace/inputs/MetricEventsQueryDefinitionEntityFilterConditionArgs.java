// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.dynatrace.inputs.MetricEventsQueryDefinitionEntityFilterConditionConditionArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MetricEventsQueryDefinitionEntityFilterConditionArgs extends com.pulumi.resources.ResourceArgs {

    public static final MetricEventsQueryDefinitionEntityFilterConditionArgs Empty = new MetricEventsQueryDefinitionEntityFilterConditionArgs();

    @Import(name="conditions")
    private @Nullable Output<List<MetricEventsQueryDefinitionEntityFilterConditionConditionArgs>> conditions;

    public Optional<Output<List<MetricEventsQueryDefinitionEntityFilterConditionConditionArgs>>> conditions() {
        return Optional.ofNullable(this.conditions);
    }

    private MetricEventsQueryDefinitionEntityFilterConditionArgs() {}

    private MetricEventsQueryDefinitionEntityFilterConditionArgs(MetricEventsQueryDefinitionEntityFilterConditionArgs $) {
        this.conditions = $.conditions;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MetricEventsQueryDefinitionEntityFilterConditionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MetricEventsQueryDefinitionEntityFilterConditionArgs $;

        public Builder() {
            $ = new MetricEventsQueryDefinitionEntityFilterConditionArgs();
        }

        public Builder(MetricEventsQueryDefinitionEntityFilterConditionArgs defaults) {
            $ = new MetricEventsQueryDefinitionEntityFilterConditionArgs(Objects.requireNonNull(defaults));
        }

        public Builder conditions(@Nullable Output<List<MetricEventsQueryDefinitionEntityFilterConditionConditionArgs>> conditions) {
            $.conditions = conditions;
            return this;
        }

        public Builder conditions(List<MetricEventsQueryDefinitionEntityFilterConditionConditionArgs> conditions) {
            return conditions(Output.of(conditions));
        }

        public Builder conditions(MetricEventsQueryDefinitionEntityFilterConditionConditionArgs... conditions) {
            return conditions(List.of(conditions));
        }

        public MetricEventsQueryDefinitionEntityFilterConditionArgs build() {
            return $;
        }
    }

}

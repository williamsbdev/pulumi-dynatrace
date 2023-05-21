// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.dynatrace.inputs.ManagementZoneV2RulesRuleDimensionRuleDimensionConditionsConditionArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ManagementZoneV2RulesRuleDimensionRuleDimensionConditionsArgs extends com.pulumi.resources.ResourceArgs {

    public static final ManagementZoneV2RulesRuleDimensionRuleDimensionConditionsArgs Empty = new ManagementZoneV2RulesRuleDimensionRuleDimensionConditionsArgs();

    @Import(name="conditions")
    private @Nullable Output<List<ManagementZoneV2RulesRuleDimensionRuleDimensionConditionsConditionArgs>> conditions;

    public Optional<Output<List<ManagementZoneV2RulesRuleDimensionRuleDimensionConditionsConditionArgs>>> conditions() {
        return Optional.ofNullable(this.conditions);
    }

    private ManagementZoneV2RulesRuleDimensionRuleDimensionConditionsArgs() {}

    private ManagementZoneV2RulesRuleDimensionRuleDimensionConditionsArgs(ManagementZoneV2RulesRuleDimensionRuleDimensionConditionsArgs $) {
        this.conditions = $.conditions;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ManagementZoneV2RulesRuleDimensionRuleDimensionConditionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ManagementZoneV2RulesRuleDimensionRuleDimensionConditionsArgs $;

        public Builder() {
            $ = new ManagementZoneV2RulesRuleDimensionRuleDimensionConditionsArgs();
        }

        public Builder(ManagementZoneV2RulesRuleDimensionRuleDimensionConditionsArgs defaults) {
            $ = new ManagementZoneV2RulesRuleDimensionRuleDimensionConditionsArgs(Objects.requireNonNull(defaults));
        }

        public Builder conditions(@Nullable Output<List<ManagementZoneV2RulesRuleDimensionRuleDimensionConditionsConditionArgs>> conditions) {
            $.conditions = conditions;
            return this;
        }

        public Builder conditions(List<ManagementZoneV2RulesRuleDimensionRuleDimensionConditionsConditionArgs> conditions) {
            return conditions(Output.of(conditions));
        }

        public Builder conditions(ManagementZoneV2RulesRuleDimensionRuleDimensionConditionsConditionArgs... conditions) {
            return conditions(List.of(conditions));
        }

        public ManagementZoneV2RulesRuleDimensionRuleDimensionConditionsArgs build() {
            return $;
        }
    }

}

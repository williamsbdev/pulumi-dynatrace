// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class DeclarativeGroupingDetectionProcessDefinitionRulesRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final DeclarativeGroupingDetectionProcessDefinitionRulesRuleArgs Empty = new DeclarativeGroupingDetectionProcessDefinitionRulesRuleArgs();

    @Import(name="condition", required=true)
    private Output<String> condition;

    public Output<String> condition() {
        return this.condition;
    }

    @Import(name="property", required=true)
    private Output<String> property;

    public Output<String> property() {
        return this.property;
    }

    private DeclarativeGroupingDetectionProcessDefinitionRulesRuleArgs() {}

    private DeclarativeGroupingDetectionProcessDefinitionRulesRuleArgs(DeclarativeGroupingDetectionProcessDefinitionRulesRuleArgs $) {
        this.condition = $.condition;
        this.property = $.property;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeclarativeGroupingDetectionProcessDefinitionRulesRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeclarativeGroupingDetectionProcessDefinitionRulesRuleArgs $;

        public Builder() {
            $ = new DeclarativeGroupingDetectionProcessDefinitionRulesRuleArgs();
        }

        public Builder(DeclarativeGroupingDetectionProcessDefinitionRulesRuleArgs defaults) {
            $ = new DeclarativeGroupingDetectionProcessDefinitionRulesRuleArgs(Objects.requireNonNull(defaults));
        }

        public Builder condition(Output<String> condition) {
            $.condition = condition;
            return this;
        }

        public Builder condition(String condition) {
            return condition(Output.of(condition));
        }

        public Builder property(Output<String> property) {
            $.property = property;
            return this;
        }

        public Builder property(String property) {
            return property(Output.of(property));
        }

        public DeclarativeGroupingDetectionProcessDefinitionRulesRuleArgs build() {
            $.condition = Objects.requireNonNull($.condition, "expected parameter 'condition' to be non-null");
            $.property = Objects.requireNonNull($.property, "expected parameter 'property' to be non-null");
            return $;
        }
    }

}
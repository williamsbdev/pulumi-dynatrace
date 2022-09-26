// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AlertingRulesRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final AlertingRulesRuleArgs Empty = new AlertingRulesRuleArgs();

    @Import(name="delayInMinutes", required=true)
    private Output<Integer> delayInMinutes;

    public Output<Integer> delayInMinutes() {
        return this.delayInMinutes;
    }

    @Import(name="includeMode", required=true)
    private Output<String> includeMode;

    public Output<String> includeMode() {
        return this.includeMode;
    }

    @Import(name="severityLevel", required=true)
    private Output<String> severityLevel;

    public Output<String> severityLevel() {
        return this.severityLevel;
    }

    @Import(name="tags")
    private @Nullable Output<List<String>> tags;

    public Optional<Output<List<String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private AlertingRulesRuleArgs() {}

    private AlertingRulesRuleArgs(AlertingRulesRuleArgs $) {
        this.delayInMinutes = $.delayInMinutes;
        this.includeMode = $.includeMode;
        this.severityLevel = $.severityLevel;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AlertingRulesRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AlertingRulesRuleArgs $;

        public Builder() {
            $ = new AlertingRulesRuleArgs();
        }

        public Builder(AlertingRulesRuleArgs defaults) {
            $ = new AlertingRulesRuleArgs(Objects.requireNonNull(defaults));
        }

        public Builder delayInMinutes(Output<Integer> delayInMinutes) {
            $.delayInMinutes = delayInMinutes;
            return this;
        }

        public Builder delayInMinutes(Integer delayInMinutes) {
            return delayInMinutes(Output.of(delayInMinutes));
        }

        public Builder includeMode(Output<String> includeMode) {
            $.includeMode = includeMode;
            return this;
        }

        public Builder includeMode(String includeMode) {
            return includeMode(Output.of(includeMode));
        }

        public Builder severityLevel(Output<String> severityLevel) {
            $.severityLevel = severityLevel;
            return this;
        }

        public Builder severityLevel(String severityLevel) {
            return severityLevel(Output.of(severityLevel));
        }

        public Builder tags(@Nullable Output<List<String>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(List<String> tags) {
            return tags(Output.of(tags));
        }

        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }

        public AlertingRulesRuleArgs build() {
            $.delayInMinutes = Objects.requireNonNull($.delayInMinutes, "expected parameter 'delayInMinutes' to be non-null");
            $.includeMode = Objects.requireNonNull($.includeMode, "expected parameter 'includeMode' to be non-null");
            $.severityLevel = Objects.requireNonNull($.severityLevel, "expected parameter 'severityLevel' to be non-null");
            return $;
        }
    }

}
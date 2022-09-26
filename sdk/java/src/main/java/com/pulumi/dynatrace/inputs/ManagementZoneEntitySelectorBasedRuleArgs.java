// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ManagementZoneEntitySelectorBasedRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final ManagementZoneEntitySelectorBasedRuleArgs Empty = new ManagementZoneEntitySelectorBasedRuleArgs();

    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    @Import(name="selector")
    private @Nullable Output<String> selector;

    public Optional<Output<String>> selector() {
        return Optional.ofNullable(this.selector);
    }

    @Import(name="unknowns")
    private @Nullable Output<String> unknowns;

    public Optional<Output<String>> unknowns() {
        return Optional.ofNullable(this.unknowns);
    }

    private ManagementZoneEntitySelectorBasedRuleArgs() {}

    private ManagementZoneEntitySelectorBasedRuleArgs(ManagementZoneEntitySelectorBasedRuleArgs $) {
        this.enabled = $.enabled;
        this.selector = $.selector;
        this.unknowns = $.unknowns;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ManagementZoneEntitySelectorBasedRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ManagementZoneEntitySelectorBasedRuleArgs $;

        public Builder() {
            $ = new ManagementZoneEntitySelectorBasedRuleArgs();
        }

        public Builder(ManagementZoneEntitySelectorBasedRuleArgs defaults) {
            $ = new ManagementZoneEntitySelectorBasedRuleArgs(Objects.requireNonNull(defaults));
        }

        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public Builder selector(@Nullable Output<String> selector) {
            $.selector = selector;
            return this;
        }

        public Builder selector(String selector) {
            return selector(Output.of(selector));
        }

        public Builder unknowns(@Nullable Output<String> unknowns) {
            $.unknowns = unknowns;
            return this;
        }

        public Builder unknowns(String unknowns) {
            return unknowns(Output.of(unknowns));
        }

        public ManagementZoneEntitySelectorBasedRuleArgs build() {
            return $;
        }
    }

}
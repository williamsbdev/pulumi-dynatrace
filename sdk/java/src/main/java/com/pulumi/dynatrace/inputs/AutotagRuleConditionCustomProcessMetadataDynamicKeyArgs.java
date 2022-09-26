// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AutotagRuleConditionCustomProcessMetadataDynamicKeyArgs extends com.pulumi.resources.ResourceArgs {

    public static final AutotagRuleConditionCustomProcessMetadataDynamicKeyArgs Empty = new AutotagRuleConditionCustomProcessMetadataDynamicKeyArgs();

    @Import(name="key", required=true)
    private Output<String> key;

    public Output<String> key() {
        return this.key;
    }

    @Import(name="source", required=true)
    private Output<String> source;

    public Output<String> source() {
        return this.source;
    }

    @Import(name="unknowns")
    private @Nullable Output<String> unknowns;

    public Optional<Output<String>> unknowns() {
        return Optional.ofNullable(this.unknowns);
    }

    private AutotagRuleConditionCustomProcessMetadataDynamicKeyArgs() {}

    private AutotagRuleConditionCustomProcessMetadataDynamicKeyArgs(AutotagRuleConditionCustomProcessMetadataDynamicKeyArgs $) {
        this.key = $.key;
        this.source = $.source;
        this.unknowns = $.unknowns;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AutotagRuleConditionCustomProcessMetadataDynamicKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AutotagRuleConditionCustomProcessMetadataDynamicKeyArgs $;

        public Builder() {
            $ = new AutotagRuleConditionCustomProcessMetadataDynamicKeyArgs();
        }

        public Builder(AutotagRuleConditionCustomProcessMetadataDynamicKeyArgs defaults) {
            $ = new AutotagRuleConditionCustomProcessMetadataDynamicKeyArgs(Objects.requireNonNull(defaults));
        }

        public Builder key(Output<String> key) {
            $.key = key;
            return this;
        }

        public Builder key(String key) {
            return key(Output.of(key));
        }

        public Builder source(Output<String> source) {
            $.source = source;
            return this;
        }

        public Builder source(String source) {
            return source(Output.of(source));
        }

        public Builder unknowns(@Nullable Output<String> unknowns) {
            $.unknowns = unknowns;
            return this;
        }

        public Builder unknowns(String unknowns) {
            return unknowns(Output.of(unknowns));
        }

        public AutotagRuleConditionCustomProcessMetadataDynamicKeyArgs build() {
            $.key = Objects.requireNonNull($.key, "expected parameter 'key' to be non-null");
            $.source = Objects.requireNonNull($.source, "expected parameter 'source' to be non-null");
            return $;
        }
    }

}
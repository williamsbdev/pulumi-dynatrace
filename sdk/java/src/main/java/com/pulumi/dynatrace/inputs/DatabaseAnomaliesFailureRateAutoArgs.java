// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DatabaseAnomaliesFailureRateAutoArgs extends com.pulumi.resources.ResourceArgs {

    public static final DatabaseAnomaliesFailureRateAutoArgs Empty = new DatabaseAnomaliesFailureRateAutoArgs();

    @Import(name="absolute", required=true)
    private Output<Integer> absolute;

    public Output<Integer> absolute() {
        return this.absolute;
    }

    @Import(name="relative", required=true)
    private Output<Integer> relative;

    public Output<Integer> relative() {
        return this.relative;
    }

    @Import(name="unknowns")
    private @Nullable Output<String> unknowns;

    public Optional<Output<String>> unknowns() {
        return Optional.ofNullable(this.unknowns);
    }

    private DatabaseAnomaliesFailureRateAutoArgs() {}

    private DatabaseAnomaliesFailureRateAutoArgs(DatabaseAnomaliesFailureRateAutoArgs $) {
        this.absolute = $.absolute;
        this.relative = $.relative;
        this.unknowns = $.unknowns;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DatabaseAnomaliesFailureRateAutoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DatabaseAnomaliesFailureRateAutoArgs $;

        public Builder() {
            $ = new DatabaseAnomaliesFailureRateAutoArgs();
        }

        public Builder(DatabaseAnomaliesFailureRateAutoArgs defaults) {
            $ = new DatabaseAnomaliesFailureRateAutoArgs(Objects.requireNonNull(defaults));
        }

        public Builder absolute(Output<Integer> absolute) {
            $.absolute = absolute;
            return this;
        }

        public Builder absolute(Integer absolute) {
            return absolute(Output.of(absolute));
        }

        public Builder relative(Output<Integer> relative) {
            $.relative = relative;
            return this;
        }

        public Builder relative(Integer relative) {
            return relative(Output.of(relative));
        }

        public Builder unknowns(@Nullable Output<String> unknowns) {
            $.unknowns = unknowns;
            return this;
        }

        public Builder unknowns(String unknowns) {
            return unknowns(Output.of(unknowns));
        }

        public DatabaseAnomaliesFailureRateAutoArgs build() {
            $.absolute = Objects.requireNonNull($.absolute, "expected parameter 'absolute' to be non-null");
            $.relative = Objects.requireNonNull($.relative, "expected parameter 'relative' to be non-null");
            return $;
        }
    }

}
// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.dynatrace.inputs.FailureDetectionParametersExceptionRulesIgnoredExceptionsCustomHandledExceptionArgs;
import java.util.List;
import java.util.Objects;


public final class FailureDetectionParametersExceptionRulesIgnoredExceptionsArgs extends com.pulumi.resources.ResourceArgs {

    public static final FailureDetectionParametersExceptionRulesIgnoredExceptionsArgs Empty = new FailureDetectionParametersExceptionRulesIgnoredExceptionsArgs();

    @Import(name="customHandledExceptions", required=true)
    private Output<List<FailureDetectionParametersExceptionRulesIgnoredExceptionsCustomHandledExceptionArgs>> customHandledExceptions;

    public Output<List<FailureDetectionParametersExceptionRulesIgnoredExceptionsCustomHandledExceptionArgs>> customHandledExceptions() {
        return this.customHandledExceptions;
    }

    private FailureDetectionParametersExceptionRulesIgnoredExceptionsArgs() {}

    private FailureDetectionParametersExceptionRulesIgnoredExceptionsArgs(FailureDetectionParametersExceptionRulesIgnoredExceptionsArgs $) {
        this.customHandledExceptions = $.customHandledExceptions;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FailureDetectionParametersExceptionRulesIgnoredExceptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FailureDetectionParametersExceptionRulesIgnoredExceptionsArgs $;

        public Builder() {
            $ = new FailureDetectionParametersExceptionRulesIgnoredExceptionsArgs();
        }

        public Builder(FailureDetectionParametersExceptionRulesIgnoredExceptionsArgs defaults) {
            $ = new FailureDetectionParametersExceptionRulesIgnoredExceptionsArgs(Objects.requireNonNull(defaults));
        }

        public Builder customHandledExceptions(Output<List<FailureDetectionParametersExceptionRulesIgnoredExceptionsCustomHandledExceptionArgs>> customHandledExceptions) {
            $.customHandledExceptions = customHandledExceptions;
            return this;
        }

        public Builder customHandledExceptions(List<FailureDetectionParametersExceptionRulesIgnoredExceptionsCustomHandledExceptionArgs> customHandledExceptions) {
            return customHandledExceptions(Output.of(customHandledExceptions));
        }

        public Builder customHandledExceptions(FailureDetectionParametersExceptionRulesIgnoredExceptionsCustomHandledExceptionArgs... customHandledExceptions) {
            return customHandledExceptions(List.of(customHandledExceptions));
        }

        public FailureDetectionParametersExceptionRulesIgnoredExceptionsArgs build() {
            $.customHandledExceptions = Objects.requireNonNull($.customHandledExceptions, "expected parameter 'customHandledExceptions' to be non-null");
            return $;
        }
    }

}

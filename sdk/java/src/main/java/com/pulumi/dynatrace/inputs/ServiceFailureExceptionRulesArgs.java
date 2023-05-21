// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.dynatrace.inputs.ServiceFailureExceptionRulesCustomErrorRulesArgs;
import com.pulumi.dynatrace.inputs.ServiceFailureExceptionRulesCustomHandledExceptionsArgs;
import com.pulumi.dynatrace.inputs.ServiceFailureExceptionRulesIgnoredExceptionsArgs;
import com.pulumi.dynatrace.inputs.ServiceFailureExceptionRulesSuccessForcingExceptionsArgs;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceFailureExceptionRulesArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceFailureExceptionRulesArgs Empty = new ServiceFailureExceptionRulesArgs();

    /**
     * Some custom error situations are only detectable via a return value or other means. To support such cases, [define a request attribute](https://dt-url.net/ys5k0p4y) that captures the required data. Then define a custom error rule that determines if the request has failed based on the value of the request attribute.
     * 
     */
    @Import(name="customErrorRules")
    private @Nullable Output<ServiceFailureExceptionRulesCustomErrorRulesArgs> customErrorRules;

    /**
     * @return Some custom error situations are only detectable via a return value or other means. To support such cases, [define a request attribute](https://dt-url.net/ys5k0p4y) that captures the required data. Then define a custom error rule that determines if the request has failed based on the value of the request attribute.
     * 
     */
    public Optional<Output<ServiceFailureExceptionRulesCustomErrorRulesArgs>> customErrorRules() {
        return Optional.ofNullable(this.customErrorRules);
    }

    /**
     * There may be situations where your application code handles exceptions gracefully in a manner that these failures aren&#39;t detected by Dynatrace. Use this setting to define specific gracefully-handled exceptions that should be treated as service failures.
     * 
     */
    @Import(name="customHandledExceptions")
    private @Nullable Output<ServiceFailureExceptionRulesCustomHandledExceptionsArgs> customHandledExceptions;

    /**
     * @return There may be situations where your application code handles exceptions gracefully in a manner that these failures aren&#39;t detected by Dynatrace. Use this setting to define specific gracefully-handled exceptions that should be treated as service failures.
     * 
     */
    public Optional<Output<ServiceFailureExceptionRulesCustomHandledExceptionsArgs>> customHandledExceptions() {
        return Optional.ofNullable(this.customHandledExceptions);
    }

    /**
     * Ignore all exceptions
     * 
     */
    @Import(name="ignoreAllExceptions", required=true)
    private Output<Boolean> ignoreAllExceptions;

    /**
     * @return Ignore all exceptions
     * 
     */
    public Output<Boolean> ignoreAllExceptions() {
        return this.ignoreAllExceptions;
    }

    /**
     * Ignore span failure detection
     * 
     */
    @Import(name="ignoreSpanFailureDetection", required=true)
    private Output<Boolean> ignoreSpanFailureDetection;

    /**
     * @return Ignore span failure detection
     * 
     */
    public Output<Boolean> ignoreSpanFailureDetection() {
        return this.ignoreSpanFailureDetection;
    }

    /**
     * Some exceptions that are thrown by legacy or 3rd-party code indicate a specific response, not an error. Use this setting to instruct Dynatrace to treat such exceptions as non-failed requests.. If an exception matching any of the defined patterns occurs in a request, it will not be considered as a failure. Other exceptions occurring at the same request might still mark the request as failed.
     * 
     */
    @Import(name="ignoredExceptions")
    private @Nullable Output<ServiceFailureExceptionRulesIgnoredExceptionsArgs> ignoredExceptions;

    /**
     * @return Some exceptions that are thrown by legacy or 3rd-party code indicate a specific response, not an error. Use this setting to instruct Dynatrace to treat such exceptions as non-failed requests.. If an exception matching any of the defined patterns occurs in a request, it will not be considered as a failure. Other exceptions occurring at the same request might still mark the request as failed.
     * 
     */
    public Optional<Output<ServiceFailureExceptionRulesIgnoredExceptionsArgs>> ignoredExceptions() {
        return Optional.ofNullable(this.ignoredExceptions);
    }

    /**
     * Define exceptions which indicate that a service call should not be considered as failed. E.g. an exception indicating that the client aborted the operation.. If an exception matching any of the defined patterns occurs on the entry node of the service, it will be considered successful. Compared to ignored exceptions, the request will be considered successful even if other exceptions occur in the same request.
     * 
     */
    @Import(name="successForcingExceptions")
    private @Nullable Output<ServiceFailureExceptionRulesSuccessForcingExceptionsArgs> successForcingExceptions;

    /**
     * @return Define exceptions which indicate that a service call should not be considered as failed. E.g. an exception indicating that the client aborted the operation.. If an exception matching any of the defined patterns occurs on the entry node of the service, it will be considered successful. Compared to ignored exceptions, the request will be considered successful even if other exceptions occur in the same request.
     * 
     */
    public Optional<Output<ServiceFailureExceptionRulesSuccessForcingExceptionsArgs>> successForcingExceptions() {
        return Optional.ofNullable(this.successForcingExceptions);
    }

    private ServiceFailureExceptionRulesArgs() {}

    private ServiceFailureExceptionRulesArgs(ServiceFailureExceptionRulesArgs $) {
        this.customErrorRules = $.customErrorRules;
        this.customHandledExceptions = $.customHandledExceptions;
        this.ignoreAllExceptions = $.ignoreAllExceptions;
        this.ignoreSpanFailureDetection = $.ignoreSpanFailureDetection;
        this.ignoredExceptions = $.ignoredExceptions;
        this.successForcingExceptions = $.successForcingExceptions;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceFailureExceptionRulesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceFailureExceptionRulesArgs $;

        public Builder() {
            $ = new ServiceFailureExceptionRulesArgs();
        }

        public Builder(ServiceFailureExceptionRulesArgs defaults) {
            $ = new ServiceFailureExceptionRulesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param customErrorRules Some custom error situations are only detectable via a return value or other means. To support such cases, [define a request attribute](https://dt-url.net/ys5k0p4y) that captures the required data. Then define a custom error rule that determines if the request has failed based on the value of the request attribute.
         * 
         * @return builder
         * 
         */
        public Builder customErrorRules(@Nullable Output<ServiceFailureExceptionRulesCustomErrorRulesArgs> customErrorRules) {
            $.customErrorRules = customErrorRules;
            return this;
        }

        /**
         * @param customErrorRules Some custom error situations are only detectable via a return value or other means. To support such cases, [define a request attribute](https://dt-url.net/ys5k0p4y) that captures the required data. Then define a custom error rule that determines if the request has failed based on the value of the request attribute.
         * 
         * @return builder
         * 
         */
        public Builder customErrorRules(ServiceFailureExceptionRulesCustomErrorRulesArgs customErrorRules) {
            return customErrorRules(Output.of(customErrorRules));
        }

        /**
         * @param customHandledExceptions There may be situations where your application code handles exceptions gracefully in a manner that these failures aren&#39;t detected by Dynatrace. Use this setting to define specific gracefully-handled exceptions that should be treated as service failures.
         * 
         * @return builder
         * 
         */
        public Builder customHandledExceptions(@Nullable Output<ServiceFailureExceptionRulesCustomHandledExceptionsArgs> customHandledExceptions) {
            $.customHandledExceptions = customHandledExceptions;
            return this;
        }

        /**
         * @param customHandledExceptions There may be situations where your application code handles exceptions gracefully in a manner that these failures aren&#39;t detected by Dynatrace. Use this setting to define specific gracefully-handled exceptions that should be treated as service failures.
         * 
         * @return builder
         * 
         */
        public Builder customHandledExceptions(ServiceFailureExceptionRulesCustomHandledExceptionsArgs customHandledExceptions) {
            return customHandledExceptions(Output.of(customHandledExceptions));
        }

        /**
         * @param ignoreAllExceptions Ignore all exceptions
         * 
         * @return builder
         * 
         */
        public Builder ignoreAllExceptions(Output<Boolean> ignoreAllExceptions) {
            $.ignoreAllExceptions = ignoreAllExceptions;
            return this;
        }

        /**
         * @param ignoreAllExceptions Ignore all exceptions
         * 
         * @return builder
         * 
         */
        public Builder ignoreAllExceptions(Boolean ignoreAllExceptions) {
            return ignoreAllExceptions(Output.of(ignoreAllExceptions));
        }

        /**
         * @param ignoreSpanFailureDetection Ignore span failure detection
         * 
         * @return builder
         * 
         */
        public Builder ignoreSpanFailureDetection(Output<Boolean> ignoreSpanFailureDetection) {
            $.ignoreSpanFailureDetection = ignoreSpanFailureDetection;
            return this;
        }

        /**
         * @param ignoreSpanFailureDetection Ignore span failure detection
         * 
         * @return builder
         * 
         */
        public Builder ignoreSpanFailureDetection(Boolean ignoreSpanFailureDetection) {
            return ignoreSpanFailureDetection(Output.of(ignoreSpanFailureDetection));
        }

        /**
         * @param ignoredExceptions Some exceptions that are thrown by legacy or 3rd-party code indicate a specific response, not an error. Use this setting to instruct Dynatrace to treat such exceptions as non-failed requests.. If an exception matching any of the defined patterns occurs in a request, it will not be considered as a failure. Other exceptions occurring at the same request might still mark the request as failed.
         * 
         * @return builder
         * 
         */
        public Builder ignoredExceptions(@Nullable Output<ServiceFailureExceptionRulesIgnoredExceptionsArgs> ignoredExceptions) {
            $.ignoredExceptions = ignoredExceptions;
            return this;
        }

        /**
         * @param ignoredExceptions Some exceptions that are thrown by legacy or 3rd-party code indicate a specific response, not an error. Use this setting to instruct Dynatrace to treat such exceptions as non-failed requests.. If an exception matching any of the defined patterns occurs in a request, it will not be considered as a failure. Other exceptions occurring at the same request might still mark the request as failed.
         * 
         * @return builder
         * 
         */
        public Builder ignoredExceptions(ServiceFailureExceptionRulesIgnoredExceptionsArgs ignoredExceptions) {
            return ignoredExceptions(Output.of(ignoredExceptions));
        }

        /**
         * @param successForcingExceptions Define exceptions which indicate that a service call should not be considered as failed. E.g. an exception indicating that the client aborted the operation.. If an exception matching any of the defined patterns occurs on the entry node of the service, it will be considered successful. Compared to ignored exceptions, the request will be considered successful even if other exceptions occur in the same request.
         * 
         * @return builder
         * 
         */
        public Builder successForcingExceptions(@Nullable Output<ServiceFailureExceptionRulesSuccessForcingExceptionsArgs> successForcingExceptions) {
            $.successForcingExceptions = successForcingExceptions;
            return this;
        }

        /**
         * @param successForcingExceptions Define exceptions which indicate that a service call should not be considered as failed. E.g. an exception indicating that the client aborted the operation.. If an exception matching any of the defined patterns occurs on the entry node of the service, it will be considered successful. Compared to ignored exceptions, the request will be considered successful even if other exceptions occur in the same request.
         * 
         * @return builder
         * 
         */
        public Builder successForcingExceptions(ServiceFailureExceptionRulesSuccessForcingExceptionsArgs successForcingExceptions) {
            return successForcingExceptions(Output.of(successForcingExceptions));
        }

        public ServiceFailureExceptionRulesArgs build() {
            $.ignoreAllExceptions = Objects.requireNonNull($.ignoreAllExceptions, "expected parameter 'ignoreAllExceptions' to be non-null");
            $.ignoreSpanFailureDetection = Objects.requireNonNull($.ignoreSpanFailureDetection, "expected parameter 'ignoreSpanFailureDetection' to be non-null");
            return $;
        }
    }

}

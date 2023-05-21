// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.dynatrace.inputs.CustomServiceRuleClassArgs;
import com.pulumi.dynatrace.inputs.CustomServiceRuleFileArgs;
import com.pulumi.dynatrace.inputs.CustomServiceRuleMethodArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CustomServiceRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final CustomServiceRuleArgs Empty = new CustomServiceRuleArgs();

    /**
     * Additional annotations filter of the rule. Only classes where all listed annotations are available in the class itself or any of its superclasses are instrumented. Not applicable to PHP
     * 
     */
    @Import(name="annotations")
    private @Nullable Output<List<String>> annotations;

    /**
     * @return Additional annotations filter of the rule. Only classes where all listed annotations are available in the class itself or any of its superclasses are instrumented. Not applicable to PHP
     * 
     */
    public Optional<Output<List<String>>> annotations() {
        return Optional.ofNullable(this.annotations);
    }

    /**
     * The fully qualified class or interface to instrument (or a substring if matching to a string). Required for Java and .NET custom services. Not applicable to PHP
     * 
     */
    @Import(name="class")
    private @Nullable Output<CustomServiceRuleClassArgs> class_;

    /**
     * @return The fully qualified class or interface to instrument (or a substring if matching to a string). Required for Java and .NET custom services. Not applicable to PHP
     * 
     */
    public Optional<Output<CustomServiceRuleClassArgs>> class_() {
        return Optional.ofNullable(this.class_);
    }

    /**
     * Rule enabled/disabled
     * 
     */
    @Import(name="enabled", required=true)
    private Output<Boolean> enabled;

    /**
     * @return Rule enabled/disabled
     * 
     */
    public Output<Boolean> enabled() {
        return this.enabled;
    }

    /**
     * The PHP file containing the class or methods to instrument. Required for PHP custom service. Not applicable to Java and .NET
     * 
     */
    @Import(name="file")
    private @Nullable Output<CustomServiceRuleFileArgs> file;

    /**
     * @return The PHP file containing the class or methods to instrument. Required for PHP custom service. Not applicable to Java and .NET
     * 
     */
    public Optional<Output<CustomServiceRuleFileArgs>> file() {
        return Optional.ofNullable(this.file);
    }

    /**
     * methods to instrument
     * 
     */
    @Import(name="methods", required=true)
    private Output<List<CustomServiceRuleMethodArgs>> methods;

    /**
     * @return methods to instrument
     * 
     */
    public Output<List<CustomServiceRuleMethodArgs>> methods() {
        return this.methods;
    }

    /**
     * allows for configuring properties that are not explicitly supported by the current version of this provider
     * 
     */
    @Import(name="unknowns")
    private @Nullable Output<String> unknowns;

    /**
     * @return allows for configuring properties that are not explicitly supported by the current version of this provider
     * 
     */
    public Optional<Output<String>> unknowns() {
        return Optional.ofNullable(this.unknowns);
    }

    private CustomServiceRuleArgs() {}

    private CustomServiceRuleArgs(CustomServiceRuleArgs $) {
        this.annotations = $.annotations;
        this.class_ = $.class_;
        this.enabled = $.enabled;
        this.file = $.file;
        this.methods = $.methods;
        this.unknowns = $.unknowns;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CustomServiceRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CustomServiceRuleArgs $;

        public Builder() {
            $ = new CustomServiceRuleArgs();
        }

        public Builder(CustomServiceRuleArgs defaults) {
            $ = new CustomServiceRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param annotations Additional annotations filter of the rule. Only classes where all listed annotations are available in the class itself or any of its superclasses are instrumented. Not applicable to PHP
         * 
         * @return builder
         * 
         */
        public Builder annotations(@Nullable Output<List<String>> annotations) {
            $.annotations = annotations;
            return this;
        }

        /**
         * @param annotations Additional annotations filter of the rule. Only classes where all listed annotations are available in the class itself or any of its superclasses are instrumented. Not applicable to PHP
         * 
         * @return builder
         * 
         */
        public Builder annotations(List<String> annotations) {
            return annotations(Output.of(annotations));
        }

        /**
         * @param annotations Additional annotations filter of the rule. Only classes where all listed annotations are available in the class itself or any of its superclasses are instrumented. Not applicable to PHP
         * 
         * @return builder
         * 
         */
        public Builder annotations(String... annotations) {
            return annotations(List.of(annotations));
        }

        /**
         * @param class_ The fully qualified class or interface to instrument (or a substring if matching to a string). Required for Java and .NET custom services. Not applicable to PHP
         * 
         * @return builder
         * 
         */
        public Builder class_(@Nullable Output<CustomServiceRuleClassArgs> class_) {
            $.class_ = class_;
            return this;
        }

        /**
         * @param class_ The fully qualified class or interface to instrument (or a substring if matching to a string). Required for Java and .NET custom services. Not applicable to PHP
         * 
         * @return builder
         * 
         */
        public Builder class_(CustomServiceRuleClassArgs class_) {
            return class_(Output.of(class_));
        }

        /**
         * @param enabled Rule enabled/disabled
         * 
         * @return builder
         * 
         */
        public Builder enabled(Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Rule enabled/disabled
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param file The PHP file containing the class or methods to instrument. Required for PHP custom service. Not applicable to Java and .NET
         * 
         * @return builder
         * 
         */
        public Builder file(@Nullable Output<CustomServiceRuleFileArgs> file) {
            $.file = file;
            return this;
        }

        /**
         * @param file The PHP file containing the class or methods to instrument. Required for PHP custom service. Not applicable to Java and .NET
         * 
         * @return builder
         * 
         */
        public Builder file(CustomServiceRuleFileArgs file) {
            return file(Output.of(file));
        }

        /**
         * @param methods methods to instrument
         * 
         * @return builder
         * 
         */
        public Builder methods(Output<List<CustomServiceRuleMethodArgs>> methods) {
            $.methods = methods;
            return this;
        }

        /**
         * @param methods methods to instrument
         * 
         * @return builder
         * 
         */
        public Builder methods(List<CustomServiceRuleMethodArgs> methods) {
            return methods(Output.of(methods));
        }

        /**
         * @param methods methods to instrument
         * 
         * @return builder
         * 
         */
        public Builder methods(CustomServiceRuleMethodArgs... methods) {
            return methods(List.of(methods));
        }

        /**
         * @param unknowns allows for configuring properties that are not explicitly supported by the current version of this provider
         * 
         * @return builder
         * 
         */
        public Builder unknowns(@Nullable Output<String> unknowns) {
            $.unknowns = unknowns;
            return this;
        }

        /**
         * @param unknowns allows for configuring properties that are not explicitly supported by the current version of this provider
         * 
         * @return builder
         * 
         */
        public Builder unknowns(String unknowns) {
            return unknowns(Output.of(unknowns));
        }

        public CustomServiceRuleArgs build() {
            $.enabled = Objects.requireNonNull($.enabled, "expected parameter 'enabled' to be non-null");
            $.methods = Objects.requireNonNull($.methods, "expected parameter 'methods' to be non-null");
            return $;
        }
    }

}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ExtensionExecutionControllerArgs extends com.pulumi.resources.ResourceArgs {

    public static final ExtensionExecutionControllerArgs Empty = new ExtensionExecutionControllerArgs();

    /**
     * This setting is enabled (`true`) or disabled (`false`)
     * 
     */
    @Import(name="enabled", required=true)
    private Output<Boolean> enabled;

    /**
     * @return This setting is enabled (`true`) or disabled (`false`)
     * 
     */
    public Output<Boolean> enabled() {
        return this.enabled;
    }

    /**
     * Enable local PIPE/HTTP metric and Log Ingest API
     * 
     */
    @Import(name="ingestActive")
    private @Nullable Output<Boolean> ingestActive;

    /**
     * @return Enable local PIPE/HTTP metric and Log Ingest API
     * 
     */
    public Optional<Output<Boolean>> ingestActive() {
        return Optional.ofNullable(this.ingestActive);
    }

    /**
     * Possible Values: `DEFAULT`, `HIGH`
     * 
     */
    @Import(name="performanceProfile")
    private @Nullable Output<String> performanceProfile;

    /**
     * @return Possible Values: `DEFAULT`, `HIGH`
     * 
     */
    public Optional<Output<String>> performanceProfile() {
        return Optional.ofNullable(this.performanceProfile);
    }

    /**
     * The scope of this setting (HOST, HOST_GROUP). Omit this property if you want to cover the whole environment.
     * 
     */
    @Import(name="scope")
    private @Nullable Output<String> scope;

    /**
     * @return The scope of this setting (HOST, HOST_GROUP). Omit this property if you want to cover the whole environment.
     * 
     */
    public Optional<Output<String>> scope() {
        return Optional.ofNullable(this.scope);
    }

    /**
     * Enable Dynatrace StatsD
     * 
     */
    @Import(name="statsdActive")
    private @Nullable Output<Boolean> statsdActive;

    /**
     * @return Enable Dynatrace StatsD
     * 
     */
    public Optional<Output<Boolean>> statsdActive() {
        return Optional.ofNullable(this.statsdActive);
    }

    private ExtensionExecutionControllerArgs() {}

    private ExtensionExecutionControllerArgs(ExtensionExecutionControllerArgs $) {
        this.enabled = $.enabled;
        this.ingestActive = $.ingestActive;
        this.performanceProfile = $.performanceProfile;
        this.scope = $.scope;
        this.statsdActive = $.statsdActive;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ExtensionExecutionControllerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ExtensionExecutionControllerArgs $;

        public Builder() {
            $ = new ExtensionExecutionControllerArgs();
        }

        public Builder(ExtensionExecutionControllerArgs defaults) {
            $ = new ExtensionExecutionControllerArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enabled This setting is enabled (`true`) or disabled (`false`)
         * 
         * @return builder
         * 
         */
        public Builder enabled(Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled This setting is enabled (`true`) or disabled (`false`)
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param ingestActive Enable local PIPE/HTTP metric and Log Ingest API
         * 
         * @return builder
         * 
         */
        public Builder ingestActive(@Nullable Output<Boolean> ingestActive) {
            $.ingestActive = ingestActive;
            return this;
        }

        /**
         * @param ingestActive Enable local PIPE/HTTP metric and Log Ingest API
         * 
         * @return builder
         * 
         */
        public Builder ingestActive(Boolean ingestActive) {
            return ingestActive(Output.of(ingestActive));
        }

        /**
         * @param performanceProfile Possible Values: `DEFAULT`, `HIGH`
         * 
         * @return builder
         * 
         */
        public Builder performanceProfile(@Nullable Output<String> performanceProfile) {
            $.performanceProfile = performanceProfile;
            return this;
        }

        /**
         * @param performanceProfile Possible Values: `DEFAULT`, `HIGH`
         * 
         * @return builder
         * 
         */
        public Builder performanceProfile(String performanceProfile) {
            return performanceProfile(Output.of(performanceProfile));
        }

        /**
         * @param scope The scope of this setting (HOST, HOST_GROUP). Omit this property if you want to cover the whole environment.
         * 
         * @return builder
         * 
         */
        public Builder scope(@Nullable Output<String> scope) {
            $.scope = scope;
            return this;
        }

        /**
         * @param scope The scope of this setting (HOST, HOST_GROUP). Omit this property if you want to cover the whole environment.
         * 
         * @return builder
         * 
         */
        public Builder scope(String scope) {
            return scope(Output.of(scope));
        }

        /**
         * @param statsdActive Enable Dynatrace StatsD
         * 
         * @return builder
         * 
         */
        public Builder statsdActive(@Nullable Output<Boolean> statsdActive) {
            $.statsdActive = statsdActive;
            return this;
        }

        /**
         * @param statsdActive Enable Dynatrace StatsD
         * 
         * @return builder
         * 
         */
        public Builder statsdActive(Boolean statsdActive) {
            return statsdActive(Output.of(statsdActive));
        }

        public ExtensionExecutionControllerArgs build() {
            $.enabled = Objects.requireNonNull($.enabled, "expected parameter 'enabled' to be non-null");
            return $;
        }
    }

}

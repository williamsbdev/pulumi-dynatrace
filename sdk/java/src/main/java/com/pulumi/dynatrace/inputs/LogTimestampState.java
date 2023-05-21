// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.dynatrace.inputs.LogTimestampMatchersArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LogTimestampState extends com.pulumi.resources.ResourceArgs {

    public static final LogTimestampState Empty = new LogTimestampState();

    /**
     * Name
     * 
     */
    @Import(name="configItemTitle")
    private @Nullable Output<String> configItemTitle;

    /**
     * @return Name
     * 
     */
    public Optional<Output<String>> configItemTitle() {
        return Optional.ofNullable(this.configItemTitle);
    }

    /**
     * Date-time pattern
     * 
     */
    @Import(name="dateTimePattern")
    private @Nullable Output<String> dateTimePattern;

    /**
     * @return Date-time pattern
     * 
     */
    public Optional<Output<String>> dateTimePattern() {
        return Optional.ofNullable(this.dateTimePattern);
    }

    /**
     * This setting is enabled (`true`) or disabled (`false`)
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return This setting is enabled (`true`) or disabled (`false`)
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * no documentation available
     * 
     */
    @Import(name="matchers")
    private @Nullable Output<LogTimestampMatchersArgs> matchers;

    /**
     * @return no documentation available
     * 
     */
    public Optional<Output<LogTimestampMatchersArgs>> matchers() {
        return Optional.ofNullable(this.matchers);
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
     * Timezone
     * 
     */
    @Import(name="timezone")
    private @Nullable Output<String> timezone;

    /**
     * @return Timezone
     * 
     */
    public Optional<Output<String>> timezone() {
        return Optional.ofNullable(this.timezone);
    }

    private LogTimestampState() {}

    private LogTimestampState(LogTimestampState $) {
        this.configItemTitle = $.configItemTitle;
        this.dateTimePattern = $.dateTimePattern;
        this.enabled = $.enabled;
        this.matchers = $.matchers;
        this.scope = $.scope;
        this.timezone = $.timezone;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LogTimestampState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LogTimestampState $;

        public Builder() {
            $ = new LogTimestampState();
        }

        public Builder(LogTimestampState defaults) {
            $ = new LogTimestampState(Objects.requireNonNull(defaults));
        }

        /**
         * @param configItemTitle Name
         * 
         * @return builder
         * 
         */
        public Builder configItemTitle(@Nullable Output<String> configItemTitle) {
            $.configItemTitle = configItemTitle;
            return this;
        }

        /**
         * @param configItemTitle Name
         * 
         * @return builder
         * 
         */
        public Builder configItemTitle(String configItemTitle) {
            return configItemTitle(Output.of(configItemTitle));
        }

        /**
         * @param dateTimePattern Date-time pattern
         * 
         * @return builder
         * 
         */
        public Builder dateTimePattern(@Nullable Output<String> dateTimePattern) {
            $.dateTimePattern = dateTimePattern;
            return this;
        }

        /**
         * @param dateTimePattern Date-time pattern
         * 
         * @return builder
         * 
         */
        public Builder dateTimePattern(String dateTimePattern) {
            return dateTimePattern(Output.of(dateTimePattern));
        }

        /**
         * @param enabled This setting is enabled (`true`) or disabled (`false`)
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
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
         * @param matchers no documentation available
         * 
         * @return builder
         * 
         */
        public Builder matchers(@Nullable Output<LogTimestampMatchersArgs> matchers) {
            $.matchers = matchers;
            return this;
        }

        /**
         * @param matchers no documentation available
         * 
         * @return builder
         * 
         */
        public Builder matchers(LogTimestampMatchersArgs matchers) {
            return matchers(Output.of(matchers));
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
         * @param timezone Timezone
         * 
         * @return builder
         * 
         */
        public Builder timezone(@Nullable Output<String> timezone) {
            $.timezone = timezone;
            return this;
        }

        /**
         * @param timezone Timezone
         * 
         * @return builder
         * 
         */
        public Builder timezone(String timezone) {
            return timezone(Output.of(timezone));
        }

        public LogTimestampState build() {
            return $;
        }
    }

}

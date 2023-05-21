// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.dynatrace.inputs.BusinessEventsOneagentEventArgs;
import com.pulumi.dynatrace.inputs.BusinessEventsOneagentTriggersArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BusinessEventsOneagentState extends com.pulumi.resources.ResourceArgs {

    public static final BusinessEventsOneagentState Empty = new BusinessEventsOneagentState();

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
     * Event meta data
     * 
     */
    @Import(name="event")
    private @Nullable Output<BusinessEventsOneagentEventArgs> event;

    /**
     * @return Event meta data
     * 
     */
    public Optional<Output<BusinessEventsOneagentEventArgs>> event() {
        return Optional.ofNullable(this.event);
    }

    /**
     * Rule name
     * 
     */
    @Import(name="ruleName")
    private @Nullable Output<String> ruleName;

    /**
     * @return Rule name
     * 
     */
    public Optional<Output<String>> ruleName() {
        return Optional.ofNullable(this.ruleName);
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
     * Define conditions to trigger business events from incoming web requests. Whenever one condition applies the event gets captured.
     * 
     */
    @Import(name="triggers")
    private @Nullable Output<BusinessEventsOneagentTriggersArgs> triggers;

    /**
     * @return Define conditions to trigger business events from incoming web requests. Whenever one condition applies the event gets captured.
     * 
     */
    public Optional<Output<BusinessEventsOneagentTriggersArgs>> triggers() {
        return Optional.ofNullable(this.triggers);
    }

    private BusinessEventsOneagentState() {}

    private BusinessEventsOneagentState(BusinessEventsOneagentState $) {
        this.enabled = $.enabled;
        this.event = $.event;
        this.ruleName = $.ruleName;
        this.scope = $.scope;
        this.triggers = $.triggers;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BusinessEventsOneagentState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BusinessEventsOneagentState $;

        public Builder() {
            $ = new BusinessEventsOneagentState();
        }

        public Builder(BusinessEventsOneagentState defaults) {
            $ = new BusinessEventsOneagentState(Objects.requireNonNull(defaults));
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
         * @param event Event meta data
         * 
         * @return builder
         * 
         */
        public Builder event(@Nullable Output<BusinessEventsOneagentEventArgs> event) {
            $.event = event;
            return this;
        }

        /**
         * @param event Event meta data
         * 
         * @return builder
         * 
         */
        public Builder event(BusinessEventsOneagentEventArgs event) {
            return event(Output.of(event));
        }

        /**
         * @param ruleName Rule name
         * 
         * @return builder
         * 
         */
        public Builder ruleName(@Nullable Output<String> ruleName) {
            $.ruleName = ruleName;
            return this;
        }

        /**
         * @param ruleName Rule name
         * 
         * @return builder
         * 
         */
        public Builder ruleName(String ruleName) {
            return ruleName(Output.of(ruleName));
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
         * @param triggers Define conditions to trigger business events from incoming web requests. Whenever one condition applies the event gets captured.
         * 
         * @return builder
         * 
         */
        public Builder triggers(@Nullable Output<BusinessEventsOneagentTriggersArgs> triggers) {
            $.triggers = triggers;
            return this;
        }

        /**
         * @param triggers Define conditions to trigger business events from incoming web requests. Whenever one condition applies the event gets captured.
         * 
         * @return builder
         * 
         */
        public Builder triggers(BusinessEventsOneagentTriggersArgs triggers) {
            return triggers(Output.of(triggers));
        }

        public BusinessEventsOneagentState build() {
            return $;
        }
    }

}

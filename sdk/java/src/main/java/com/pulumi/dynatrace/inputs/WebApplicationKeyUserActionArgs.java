// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.dynatrace.inputs.WebApplicationKeyUserActionActionArgs;
import java.util.List;
import java.util.Objects;


public final class WebApplicationKeyUserActionArgs extends com.pulumi.resources.ResourceArgs {

    public static final WebApplicationKeyUserActionArgs Empty = new WebApplicationKeyUserActionArgs();

    /**
     * Configuration of the key user action
     * 
     */
    @Import(name="actions", required=true)
    private Output<List<WebApplicationKeyUserActionActionArgs>> actions;

    /**
     * @return Configuration of the key user action
     * 
     */
    public Output<List<WebApplicationKeyUserActionActionArgs>> actions() {
        return this.actions;
    }

    private WebApplicationKeyUserActionArgs() {}

    private WebApplicationKeyUserActionArgs(WebApplicationKeyUserActionArgs $) {
        this.actions = $.actions;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebApplicationKeyUserActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebApplicationKeyUserActionArgs $;

        public Builder() {
            $ = new WebApplicationKeyUserActionArgs();
        }

        public Builder(WebApplicationKeyUserActionArgs defaults) {
            $ = new WebApplicationKeyUserActionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param actions Configuration of the key user action
         * 
         * @return builder
         * 
         */
        public Builder actions(Output<List<WebApplicationKeyUserActionActionArgs>> actions) {
            $.actions = actions;
            return this;
        }

        /**
         * @param actions Configuration of the key user action
         * 
         * @return builder
         * 
         */
        public Builder actions(List<WebApplicationKeyUserActionActionArgs> actions) {
            return actions(Output.of(actions));
        }

        /**
         * @param actions Configuration of the key user action
         * 
         * @return builder
         * 
         */
        public Builder actions(WebApplicationKeyUserActionActionArgs... actions) {
            return actions(List.of(actions));
        }

        public WebApplicationKeyUserActionArgs build() {
            $.actions = Objects.requireNonNull($.actions, "expected parameter 'actions' to be non-null");
            return $;
        }
    }

}
// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.dynatrace.inputs.BrowserMonitorScriptEventsEventSelectTargetLocatorLocatorArgs;
import java.util.List;
import java.util.Objects;


public final class BrowserMonitorScriptEventsEventSelectTargetLocatorArgs extends com.pulumi.resources.ResourceArgs {

    public static final BrowserMonitorScriptEventsEventSelectTargetLocatorArgs Empty = new BrowserMonitorScriptEventsEventSelectTargetLocatorArgs();

    @Import(name="locators", required=true)
    private Output<List<BrowserMonitorScriptEventsEventSelectTargetLocatorLocatorArgs>> locators;

    public Output<List<BrowserMonitorScriptEventsEventSelectTargetLocatorLocatorArgs>> locators() {
        return this.locators;
    }

    private BrowserMonitorScriptEventsEventSelectTargetLocatorArgs() {}

    private BrowserMonitorScriptEventsEventSelectTargetLocatorArgs(BrowserMonitorScriptEventsEventSelectTargetLocatorArgs $) {
        this.locators = $.locators;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BrowserMonitorScriptEventsEventSelectTargetLocatorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BrowserMonitorScriptEventsEventSelectTargetLocatorArgs $;

        public Builder() {
            $ = new BrowserMonitorScriptEventsEventSelectTargetLocatorArgs();
        }

        public Builder(BrowserMonitorScriptEventsEventSelectTargetLocatorArgs defaults) {
            $ = new BrowserMonitorScriptEventsEventSelectTargetLocatorArgs(Objects.requireNonNull(defaults));
        }

        public Builder locators(Output<List<BrowserMonitorScriptEventsEventSelectTargetLocatorLocatorArgs>> locators) {
            $.locators = locators;
            return this;
        }

        public Builder locators(List<BrowserMonitorScriptEventsEventSelectTargetLocatorLocatorArgs> locators) {
            return locators(Output.of(locators));
        }

        public Builder locators(BrowserMonitorScriptEventsEventSelectTargetLocatorLocatorArgs... locators) {
            return locators(List.of(locators));
        }

        public BrowserMonitorScriptEventsEventSelectTargetLocatorArgs build() {
            $.locators = Objects.requireNonNull($.locators, "expected parameter 'locators' to be non-null");
            return $;
        }
    }

}
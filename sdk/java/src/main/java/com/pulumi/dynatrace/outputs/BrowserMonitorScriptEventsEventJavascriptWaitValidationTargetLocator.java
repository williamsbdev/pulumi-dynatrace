// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.dynatrace.outputs.BrowserMonitorScriptEventsEventJavascriptWaitValidationTargetLocatorLocator;
import java.util.List;
import java.util.Objects;

@CustomType
public final class BrowserMonitorScriptEventsEventJavascriptWaitValidationTargetLocator {
    private List<BrowserMonitorScriptEventsEventJavascriptWaitValidationTargetLocatorLocator> locators;

    private BrowserMonitorScriptEventsEventJavascriptWaitValidationTargetLocator() {}
    public List<BrowserMonitorScriptEventsEventJavascriptWaitValidationTargetLocatorLocator> locators() {
        return this.locators;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BrowserMonitorScriptEventsEventJavascriptWaitValidationTargetLocator defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<BrowserMonitorScriptEventsEventJavascriptWaitValidationTargetLocatorLocator> locators;
        public Builder() {}
        public Builder(BrowserMonitorScriptEventsEventJavascriptWaitValidationTargetLocator defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.locators = defaults.locators;
        }

        @CustomType.Setter
        public Builder locators(List<BrowserMonitorScriptEventsEventJavascriptWaitValidationTargetLocatorLocator> locators) {
            this.locators = Objects.requireNonNull(locators);
            return this;
        }
        public Builder locators(BrowserMonitorScriptEventsEventJavascriptWaitValidationTargetLocatorLocator... locators) {
            return locators(List.of(locators));
        }
        public BrowserMonitorScriptEventsEventJavascriptWaitValidationTargetLocator build() {
            final var o = new BrowserMonitorScriptEventsEventJavascriptWaitValidationTargetLocator();
            o.locators = locators;
            return o;
        }
    }
}
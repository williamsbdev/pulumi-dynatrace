// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.dynatrace.outputs.BrowserMonitorScriptEventsEventNavigateTargetLocatorLocator;
import java.util.List;
import java.util.Objects;

@CustomType
public final class BrowserMonitorScriptEventsEventNavigateTargetLocator {
    private List<BrowserMonitorScriptEventsEventNavigateTargetLocatorLocator> locators;

    private BrowserMonitorScriptEventsEventNavigateTargetLocator() {}
    public List<BrowserMonitorScriptEventsEventNavigateTargetLocatorLocator> locators() {
        return this.locators;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BrowserMonitorScriptEventsEventNavigateTargetLocator defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<BrowserMonitorScriptEventsEventNavigateTargetLocatorLocator> locators;
        public Builder() {}
        public Builder(BrowserMonitorScriptEventsEventNavigateTargetLocator defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.locators = defaults.locators;
        }

        @CustomType.Setter
        public Builder locators(List<BrowserMonitorScriptEventsEventNavigateTargetLocatorLocator> locators) {
            this.locators = Objects.requireNonNull(locators);
            return this;
        }
        public Builder locators(BrowserMonitorScriptEventsEventNavigateTargetLocatorLocator... locators) {
            return locators(List.of(locators));
        }
        public BrowserMonitorScriptEventsEventNavigateTargetLocator build() {
            final var o = new BrowserMonitorScriptEventsEventNavigateTargetLocator();
            o.locators = locators;
            return o;
        }
    }
}
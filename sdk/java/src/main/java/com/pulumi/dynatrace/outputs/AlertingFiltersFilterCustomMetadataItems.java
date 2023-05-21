// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.dynatrace.outputs.AlertingFiltersFilterCustomMetadataItemsFilter;
import java.util.List;
import java.util.Objects;

@CustomType
public final class AlertingFiltersFilterCustomMetadataItems {
    private List<AlertingFiltersFilterCustomMetadataItemsFilter> filters;

    private AlertingFiltersFilterCustomMetadataItems() {}
    public List<AlertingFiltersFilterCustomMetadataItemsFilter> filters() {
        return this.filters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AlertingFiltersFilterCustomMetadataItems defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<AlertingFiltersFilterCustomMetadataItemsFilter> filters;
        public Builder() {}
        public Builder(AlertingFiltersFilterCustomMetadataItems defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filters = defaults.filters;
        }

        @CustomType.Setter
        public Builder filters(List<AlertingFiltersFilterCustomMetadataItemsFilter> filters) {
            this.filters = Objects.requireNonNull(filters);
            return this;
        }
        public Builder filters(AlertingFiltersFilterCustomMetadataItemsFilter... filters) {
            return filters(List.of(filters));
        }
        public AlertingFiltersFilterCustomMetadataItems build() {
            final var o = new AlertingFiltersFilterCustomMetadataItems();
            o.filters = filters;
            return o;
        }
    }
}
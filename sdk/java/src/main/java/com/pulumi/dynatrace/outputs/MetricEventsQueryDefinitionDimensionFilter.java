// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.dynatrace.outputs.MetricEventsQueryDefinitionDimensionFilterFilter;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class MetricEventsQueryDefinitionDimensionFilter {
    private @Nullable List<MetricEventsQueryDefinitionDimensionFilterFilter> filters;

    private MetricEventsQueryDefinitionDimensionFilter() {}
    public List<MetricEventsQueryDefinitionDimensionFilterFilter> filters() {
        return this.filters == null ? List.of() : this.filters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetricEventsQueryDefinitionDimensionFilter defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<MetricEventsQueryDefinitionDimensionFilterFilter> filters;
        public Builder() {}
        public Builder(MetricEventsQueryDefinitionDimensionFilter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filters = defaults.filters;
        }

        @CustomType.Setter
        public Builder filters(@Nullable List<MetricEventsQueryDefinitionDimensionFilterFilter> filters) {
            this.filters = filters;
            return this;
        }
        public Builder filters(MetricEventsQueryDefinitionDimensionFilterFilter... filters) {
            return filters(List.of(filters));
        }
        public MetricEventsQueryDefinitionDimensionFilter build() {
            final var o = new MetricEventsQueryDefinitionDimensionFilter();
            o.filters = filters;
            return o;
        }
    }
}
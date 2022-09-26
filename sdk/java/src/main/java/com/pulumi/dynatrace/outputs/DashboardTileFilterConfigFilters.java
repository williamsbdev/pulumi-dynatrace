// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.dynatrace.outputs.DashboardTileFilterConfigFiltersFilter;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class DashboardTileFilterConfigFilters {
    private @Nullable List<DashboardTileFilterConfigFiltersFilter> filters;

    private DashboardTileFilterConfigFilters() {}
    public List<DashboardTileFilterConfigFiltersFilter> filters() {
        return this.filters == null ? List.of() : this.filters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DashboardTileFilterConfigFilters defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<DashboardTileFilterConfigFiltersFilter> filters;
        public Builder() {}
        public Builder(DashboardTileFilterConfigFilters defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filters = defaults.filters;
        }

        @CustomType.Setter
        public Builder filters(@Nullable List<DashboardTileFilterConfigFiltersFilter> filters) {
            this.filters = filters;
            return this;
        }
        public Builder filters(DashboardTileFilterConfigFiltersFilter... filters) {
            return filters(List.of(filters));
        }
        public DashboardTileFilterConfigFilters build() {
            final var o = new DashboardTileFilterConfigFilters();
            o.filters = filters;
            return o;
        }
    }
}
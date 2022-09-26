// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.dynatrace.inputs.CustomAnomaliesDimensionArgs;
import com.pulumi.dynatrace.inputs.CustomAnomaliesScopeArgs;
import com.pulumi.dynatrace.inputs.CustomAnomaliesStrategyArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CustomAnomaliesArgs extends com.pulumi.resources.ResourceArgs {

    public static final CustomAnomaliesArgs Empty = new CustomAnomaliesArgs();

    /**
     * How the metric data points are aggregated for the evaluation. The timeseries must support this aggregation
     * 
     */
    @Import(name="aggregationType")
    private @Nullable Output<String> aggregationType;

    /**
     * @return How the metric data points are aggregated for the evaluation. The timeseries must support this aggregation
     * 
     */
    public Optional<Output<String>> aggregationType() {
        return Optional.ofNullable(this.aggregationType);
    }

    /**
     * The description of the metric event
     * 
     */
    @Import(name="description", required=true)
    private Output<String> description;

    /**
     * @return The description of the metric event
     * 
     */
    public Output<String> description() {
        return this.description;
    }

    /**
     * Defines the dimensions of the metric to alert on. The filters are combined by conjunction
     * 
     */
    @Import(name="dimensions")
    private @Nullable Output<List<CustomAnomaliesDimensionArgs>> dimensions;

    /**
     * @return Defines the dimensions of the metric to alert on. The filters are combined by conjunction
     * 
     */
    public Optional<Output<List<CustomAnomaliesDimensionArgs>>> dimensions() {
        return Optional.ofNullable(this.dimensions);
    }

    /**
     * The reason of automatic disabling.  The `NONE` means config was not disabled automatically. Possible values are `METRIC_DEFINITION_INCONSISTENCY`, `NONE`, `TOO_MANY_DIMS` and `TOPX_FORCIBLY_DEACTIVATED`
     * 
     * @deprecated
     * This property is not meant to be configured from the outside. It will get removed completely in future versions
     * 
     */
    @Deprecated /* This property is not meant to be configured from the outside. It will get removed completely in future versions */
    @Import(name="disabledReason")
    private @Nullable Output<String> disabledReason;

    /**
     * @return The reason of automatic disabling.  The `NONE` means config was not disabled automatically. Possible values are `METRIC_DEFINITION_INCONSISTENCY`, `NONE`, `TOO_MANY_DIMS` and `TOPX_FORCIBLY_DEACTIVATED`
     * 
     * @deprecated
     * This property is not meant to be configured from the outside. It will get removed completely in future versions
     * 
     */
    @Deprecated /* This property is not meant to be configured from the outside. It will get removed completely in future versions */
    public Optional<Output<String>> disabledReason() {
        return Optional.ofNullable(this.disabledReason);
    }

    /**
     * The metric event is enabled (`true`) or disabled (`false`)
     * 
     */
    @Import(name="enabled", required=true)
    private Output<Boolean> enabled;

    /**
     * @return The metric event is enabled (`true`) or disabled (`false`)
     * 
     */
    public Output<Boolean> enabled() {
        return this.enabled;
    }

    /**
     * The ID of the metric evaluated by the metric event
     * 
     */
    @Import(name="metricId")
    private @Nullable Output<String> metricId;

    /**
     * @return The ID of the metric evaluated by the metric event
     * 
     */
    public Optional<Output<String>> metricId() {
        return Optional.ofNullable(this.metricId);
    }

    /**
     * The metric selector that should be executed
     * 
     */
    @Import(name="metricSelector")
    private @Nullable Output<String> metricSelector;

    /**
     * @return The metric selector that should be executed
     * 
     */
    public Optional<Output<String>> metricSelector() {
        return Optional.ofNullable(this.metricSelector);
    }

    /**
     * The name of the metric event displayed in the UI
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the metric event displayed in the UI
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Defines which dimension key should be used for the **alertingScope**
     * 
     */
    @Import(name="primaryDimensionKey")
    private @Nullable Output<String> primaryDimensionKey;

    /**
     * @return Defines which dimension key should be used for the **alertingScope**
     * 
     */
    public Optional<Output<String>> primaryDimensionKey() {
        return Optional.ofNullable(this.primaryDimensionKey);
    }

    /**
     * Defines the scope of the metric event. Only one filter is allowed per filter type, except for tags, where up to 3 are allowed. The filters are combined by conjunction
     * 
     */
    @Import(name="scopes")
    private @Nullable Output<List<CustomAnomaliesScopeArgs>> scopes;

    /**
     * @return Defines the scope of the metric event. Only one filter is allowed per filter type, except for tags, where up to 3 are allowed. The filters are combined by conjunction
     * 
     */
    public Optional<Output<List<CustomAnomaliesScopeArgs>>> scopes() {
        return Optional.ofNullable(this.scopes);
    }

    /**
     * The type of the event to trigger on the threshold violation.  The `CUSTOM_ALERT` type is not correlated with other alerts. The `INFO` type does not open a problem
     * 
     */
    @Import(name="severity")
    private @Nullable Output<String> severity;

    /**
     * @return The type of the event to trigger on the threshold violation.  The `CUSTOM_ALERT` type is not correlated with other alerts. The `INFO` type does not open a problem
     * 
     */
    public Optional<Output<String>> severity() {
        return Optional.ofNullable(this.severity);
    }

    /**
     * A monitoring strategy for a metric event config. This is the base version of the monitoring strategy, depending on the type,  the actual JSON may contain additional fields
     * 
     */
    @Import(name="strategy", required=true)
    private Output<CustomAnomaliesStrategyArgs> strategy;

    /**
     * @return A monitoring strategy for a metric event config. This is the base version of the monitoring strategy, depending on the type,  the actual JSON may contain additional fields
     * 
     */
    public Output<CustomAnomaliesStrategyArgs> strategy() {
        return this.strategy;
    }

    /**
     * allows for configuring properties that are not explicitly supported by the current version of this provider
     * 
     */
    @Import(name="unknowns")
    private @Nullable Output<String> unknowns;

    /**
     * @return allows for configuring properties that are not explicitly supported by the current version of this provider
     * 
     */
    public Optional<Output<String>> unknowns() {
        return Optional.ofNullable(this.unknowns);
    }

    /**
     * The reason of a warning set on the config. The `NONE` means config has no warnings. The other supported value is `TOO_MANY_DIMS`
     * 
     * @deprecated
     * This property is not meant to be configured from the outside. It will get removed completely in future versions
     * 
     */
    @Deprecated /* This property is not meant to be configured from the outside. It will get removed completely in future versions */
    @Import(name="warningReason")
    private @Nullable Output<String> warningReason;

    /**
     * @return The reason of a warning set on the config. The `NONE` means config has no warnings. The other supported value is `TOO_MANY_DIMS`
     * 
     * @deprecated
     * This property is not meant to be configured from the outside. It will get removed completely in future versions
     * 
     */
    @Deprecated /* This property is not meant to be configured from the outside. It will get removed completely in future versions */
    public Optional<Output<String>> warningReason() {
        return Optional.ofNullable(this.warningReason);
    }

    private CustomAnomaliesArgs() {}

    private CustomAnomaliesArgs(CustomAnomaliesArgs $) {
        this.aggregationType = $.aggregationType;
        this.description = $.description;
        this.dimensions = $.dimensions;
        this.disabledReason = $.disabledReason;
        this.enabled = $.enabled;
        this.metricId = $.metricId;
        this.metricSelector = $.metricSelector;
        this.name = $.name;
        this.primaryDimensionKey = $.primaryDimensionKey;
        this.scopes = $.scopes;
        this.severity = $.severity;
        this.strategy = $.strategy;
        this.unknowns = $.unknowns;
        this.warningReason = $.warningReason;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CustomAnomaliesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CustomAnomaliesArgs $;

        public Builder() {
            $ = new CustomAnomaliesArgs();
        }

        public Builder(CustomAnomaliesArgs defaults) {
            $ = new CustomAnomaliesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param aggregationType How the metric data points are aggregated for the evaluation. The timeseries must support this aggregation
         * 
         * @return builder
         * 
         */
        public Builder aggregationType(@Nullable Output<String> aggregationType) {
            $.aggregationType = aggregationType;
            return this;
        }

        /**
         * @param aggregationType How the metric data points are aggregated for the evaluation. The timeseries must support this aggregation
         * 
         * @return builder
         * 
         */
        public Builder aggregationType(String aggregationType) {
            return aggregationType(Output.of(aggregationType));
        }

        /**
         * @param description The description of the metric event
         * 
         * @return builder
         * 
         */
        public Builder description(Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of the metric event
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param dimensions Defines the dimensions of the metric to alert on. The filters are combined by conjunction
         * 
         * @return builder
         * 
         */
        public Builder dimensions(@Nullable Output<List<CustomAnomaliesDimensionArgs>> dimensions) {
            $.dimensions = dimensions;
            return this;
        }

        /**
         * @param dimensions Defines the dimensions of the metric to alert on. The filters are combined by conjunction
         * 
         * @return builder
         * 
         */
        public Builder dimensions(List<CustomAnomaliesDimensionArgs> dimensions) {
            return dimensions(Output.of(dimensions));
        }

        /**
         * @param dimensions Defines the dimensions of the metric to alert on. The filters are combined by conjunction
         * 
         * @return builder
         * 
         */
        public Builder dimensions(CustomAnomaliesDimensionArgs... dimensions) {
            return dimensions(List.of(dimensions));
        }

        /**
         * @param disabledReason The reason of automatic disabling.  The `NONE` means config was not disabled automatically. Possible values are `METRIC_DEFINITION_INCONSISTENCY`, `NONE`, `TOO_MANY_DIMS` and `TOPX_FORCIBLY_DEACTIVATED`
         * 
         * @return builder
         * 
         * @deprecated
         * This property is not meant to be configured from the outside. It will get removed completely in future versions
         * 
         */
        @Deprecated /* This property is not meant to be configured from the outside. It will get removed completely in future versions */
        public Builder disabledReason(@Nullable Output<String> disabledReason) {
            $.disabledReason = disabledReason;
            return this;
        }

        /**
         * @param disabledReason The reason of automatic disabling.  The `NONE` means config was not disabled automatically. Possible values are `METRIC_DEFINITION_INCONSISTENCY`, `NONE`, `TOO_MANY_DIMS` and `TOPX_FORCIBLY_DEACTIVATED`
         * 
         * @return builder
         * 
         * @deprecated
         * This property is not meant to be configured from the outside. It will get removed completely in future versions
         * 
         */
        @Deprecated /* This property is not meant to be configured from the outside. It will get removed completely in future versions */
        public Builder disabledReason(String disabledReason) {
            return disabledReason(Output.of(disabledReason));
        }

        /**
         * @param enabled The metric event is enabled (`true`) or disabled (`false`)
         * 
         * @return builder
         * 
         */
        public Builder enabled(Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled The metric event is enabled (`true`) or disabled (`false`)
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param metricId The ID of the metric evaluated by the metric event
         * 
         * @return builder
         * 
         */
        public Builder metricId(@Nullable Output<String> metricId) {
            $.metricId = metricId;
            return this;
        }

        /**
         * @param metricId The ID of the metric evaluated by the metric event
         * 
         * @return builder
         * 
         */
        public Builder metricId(String metricId) {
            return metricId(Output.of(metricId));
        }

        /**
         * @param metricSelector The metric selector that should be executed
         * 
         * @return builder
         * 
         */
        public Builder metricSelector(@Nullable Output<String> metricSelector) {
            $.metricSelector = metricSelector;
            return this;
        }

        /**
         * @param metricSelector The metric selector that should be executed
         * 
         * @return builder
         * 
         */
        public Builder metricSelector(String metricSelector) {
            return metricSelector(Output.of(metricSelector));
        }

        /**
         * @param name The name of the metric event displayed in the UI
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the metric event displayed in the UI
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param primaryDimensionKey Defines which dimension key should be used for the **alertingScope**
         * 
         * @return builder
         * 
         */
        public Builder primaryDimensionKey(@Nullable Output<String> primaryDimensionKey) {
            $.primaryDimensionKey = primaryDimensionKey;
            return this;
        }

        /**
         * @param primaryDimensionKey Defines which dimension key should be used for the **alertingScope**
         * 
         * @return builder
         * 
         */
        public Builder primaryDimensionKey(String primaryDimensionKey) {
            return primaryDimensionKey(Output.of(primaryDimensionKey));
        }

        /**
         * @param scopes Defines the scope of the metric event. Only one filter is allowed per filter type, except for tags, where up to 3 are allowed. The filters are combined by conjunction
         * 
         * @return builder
         * 
         */
        public Builder scopes(@Nullable Output<List<CustomAnomaliesScopeArgs>> scopes) {
            $.scopes = scopes;
            return this;
        }

        /**
         * @param scopes Defines the scope of the metric event. Only one filter is allowed per filter type, except for tags, where up to 3 are allowed. The filters are combined by conjunction
         * 
         * @return builder
         * 
         */
        public Builder scopes(List<CustomAnomaliesScopeArgs> scopes) {
            return scopes(Output.of(scopes));
        }

        /**
         * @param scopes Defines the scope of the metric event. Only one filter is allowed per filter type, except for tags, where up to 3 are allowed. The filters are combined by conjunction
         * 
         * @return builder
         * 
         */
        public Builder scopes(CustomAnomaliesScopeArgs... scopes) {
            return scopes(List.of(scopes));
        }

        /**
         * @param severity The type of the event to trigger on the threshold violation.  The `CUSTOM_ALERT` type is not correlated with other alerts. The `INFO` type does not open a problem
         * 
         * @return builder
         * 
         */
        public Builder severity(@Nullable Output<String> severity) {
            $.severity = severity;
            return this;
        }

        /**
         * @param severity The type of the event to trigger on the threshold violation.  The `CUSTOM_ALERT` type is not correlated with other alerts. The `INFO` type does not open a problem
         * 
         * @return builder
         * 
         */
        public Builder severity(String severity) {
            return severity(Output.of(severity));
        }

        /**
         * @param strategy A monitoring strategy for a metric event config. This is the base version of the monitoring strategy, depending on the type,  the actual JSON may contain additional fields
         * 
         * @return builder
         * 
         */
        public Builder strategy(Output<CustomAnomaliesStrategyArgs> strategy) {
            $.strategy = strategy;
            return this;
        }

        /**
         * @param strategy A monitoring strategy for a metric event config. This is the base version of the monitoring strategy, depending on the type,  the actual JSON may contain additional fields
         * 
         * @return builder
         * 
         */
        public Builder strategy(CustomAnomaliesStrategyArgs strategy) {
            return strategy(Output.of(strategy));
        }

        /**
         * @param unknowns allows for configuring properties that are not explicitly supported by the current version of this provider
         * 
         * @return builder
         * 
         */
        public Builder unknowns(@Nullable Output<String> unknowns) {
            $.unknowns = unknowns;
            return this;
        }

        /**
         * @param unknowns allows for configuring properties that are not explicitly supported by the current version of this provider
         * 
         * @return builder
         * 
         */
        public Builder unknowns(String unknowns) {
            return unknowns(Output.of(unknowns));
        }

        /**
         * @param warningReason The reason of a warning set on the config. The `NONE` means config has no warnings. The other supported value is `TOO_MANY_DIMS`
         * 
         * @return builder
         * 
         * @deprecated
         * This property is not meant to be configured from the outside. It will get removed completely in future versions
         * 
         */
        @Deprecated /* This property is not meant to be configured from the outside. It will get removed completely in future versions */
        public Builder warningReason(@Nullable Output<String> warningReason) {
            $.warningReason = warningReason;
            return this;
        }

        /**
         * @param warningReason The reason of a warning set on the config. The `NONE` means config has no warnings. The other supported value is `TOO_MANY_DIMS`
         * 
         * @return builder
         * 
         * @deprecated
         * This property is not meant to be configured from the outside. It will get removed completely in future versions
         * 
         */
        @Deprecated /* This property is not meant to be configured from the outside. It will get removed completely in future versions */
        public Builder warningReason(String warningReason) {
            return warningReason(Output.of(warningReason));
        }

        public CustomAnomaliesArgs build() {
            $.description = Objects.requireNonNull($.description, "expected parameter 'description' to be non-null");
            $.enabled = Objects.requireNonNull($.enabled, "expected parameter 'enabled' to be non-null");
            $.strategy = Objects.requireNonNull($.strategy, "expected parameter 'strategy' to be non-null");
            return $;
        }
    }

}
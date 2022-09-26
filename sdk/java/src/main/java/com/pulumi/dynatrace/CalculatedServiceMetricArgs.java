// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.dynatrace.inputs.CalculatedServiceMetricConditionArgs;
import com.pulumi.dynatrace.inputs.CalculatedServiceMetricDimensionDefinitionArgs;
import com.pulumi.dynatrace.inputs.CalculatedServiceMetricMetricDefinitionArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CalculatedServiceMetricArgs extends com.pulumi.resources.ResourceArgs {

    public static final CalculatedServiceMetricArgs Empty = new CalculatedServiceMetricArgs();

    /**
     * The set of conditions for the metric usage. **All** the specified conditions must be fulfilled to use the metric
     * 
     */
    @Import(name="conditions")
    private @Nullable Output<List<CalculatedServiceMetricConditionArgs>> conditions;

    /**
     * @return The set of conditions for the metric usage. **All** the specified conditions must be fulfilled to use the metric
     * 
     */
    public Optional<Output<List<CalculatedServiceMetricConditionArgs>>> conditions() {
        return Optional.ofNullable(this.conditions);
    }

    /**
     * The displayed description of the metric
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The displayed description of the metric
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Parameters of a definition of a calculated service metric
     * 
     */
    @Import(name="dimensionDefinition")
    private @Nullable Output<CalculatedServiceMetricDimensionDefinitionArgs> dimensionDefinition;

    /**
     * @return Parameters of a definition of a calculated service metric
     * 
     */
    public Optional<Output<CalculatedServiceMetricDimensionDefinitionArgs>> dimensionDefinition() {
        return Optional.ofNullable(this.dimensionDefinition);
    }

    /**
     * The metric is enabled (`true`) or disabled (`false`)
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return The metric is enabled (`true`) or disabled (`false`)
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * Restricts the metric usage to the specified service. This field is mutually exclusive with the `management_zones` field
     * 
     */
    @Import(name="entityId")
    private @Nullable Output<String> entityId;

    /**
     * @return Restricts the metric usage to the specified service. This field is mutually exclusive with the `management_zones` field
     * 
     */
    public Optional<Output<String>> entityId() {
        return Optional.ofNullable(this.entityId);
    }

    /**
     * Restricts the metric usage to specified management zones. This field is mutually exclusive with the `entity_id` field
     * 
     */
    @Import(name="managementZones")
    private @Nullable Output<List<String>> managementZones;

    /**
     * @return Restricts the metric usage to specified management zones. This field is mutually exclusive with the `entity_id` field
     * 
     */
    public Optional<Output<List<String>>> managementZones() {
        return Optional.ofNullable(this.managementZones);
    }

    /**
     * The definition of a calculated service metric
     * 
     */
    @Import(name="metricDefinition")
    private @Nullable Output<CalculatedServiceMetricMetricDefinitionArgs> metricDefinition;

    /**
     * @return The definition of a calculated service metric
     * 
     */
    public Optional<Output<CalculatedServiceMetricMetricDefinitionArgs>> metricDefinition() {
        return Optional.ofNullable(this.metricDefinition);
    }

    /**
     * The key of the calculated service metric
     * 
     */
    @Import(name="metricKey", required=true)
    private Output<String> metricKey;

    /**
     * @return The key of the calculated service metric
     * 
     */
    public Output<String> metricKey() {
        return this.metricKey;
    }

    /**
     * The displayed name of the metric
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The displayed name of the metric
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The unit of the metric. Possible values are `BIT`, `BIT_PER_HOUR`, `BIT_PER_MINUTE`, `BIT_PER_SECOND`, `BYTE`,
     * `BYTE_PER_HOUR`, `BYTE_PER_MINUTE`, `BYTE_PER_SECOND`, `CORES`, `COUNT`, `DAY`, `DECIBEL_MILLI_WATT`, `GIBI_BYTE`,
     * `GIGA`, `GIGA_BYTE`, `HOUR`, `KIBI_BYTE`, `KIBI_BYTE_PER_HOUR`, `KIBI_BYTE_PER_MINUTE`, `KIBI_BYTE_PER_SECOND`, `KILO`,
     * `KILO_BYTE`, `KILO_BYTE_PER_HOUR`, `KILO_BYTE_PER_MINUTE`, `KILO_BYTE_PER_SECOND`, `MEBI_BYTE`, `MEBI_BYTE_PER_HOUR`,
     * `MEBI_BYTE_PER_MINUTE`, `MEBI_BYTE_PER_SECOND`, `MEGA`, `MEGA_BYTE`, `MEGA_BYTE_PER_HOUR`, `MEGA_BYTE_PER_MINUTE`,
     * `MEGA_BYTE_PER_SECOND`, `MICRO_SECOND`, `MILLI_CORES`, `MILLI_SECOND`, `MILLI_SECOND_PER_MINUTE`, `MINUTE`, `MONTH`,
     * `MSU`, `NANO_SECOND`, `NANO_SECOND_PER_MINUTE`, `NOT_APPLICABLE`, `PERCENT`, `PER_HOUR`, `PER_MINUTE`, `PER_SECOND`,
     * `PIXEL`, `PROMILLE`, `RATIO`, `SECOND`, `STATE`, `UNSPECIFIED`, `WEEK` and `YEAR`
     * 
     */
    @Import(name="unit", required=true)
    private Output<String> unit;

    /**
     * @return The unit of the metric. Possible values are `BIT`, `BIT_PER_HOUR`, `BIT_PER_MINUTE`, `BIT_PER_SECOND`, `BYTE`,
     * `BYTE_PER_HOUR`, `BYTE_PER_MINUTE`, `BYTE_PER_SECOND`, `CORES`, `COUNT`, `DAY`, `DECIBEL_MILLI_WATT`, `GIBI_BYTE`,
     * `GIGA`, `GIGA_BYTE`, `HOUR`, `KIBI_BYTE`, `KIBI_BYTE_PER_HOUR`, `KIBI_BYTE_PER_MINUTE`, `KIBI_BYTE_PER_SECOND`, `KILO`,
     * `KILO_BYTE`, `KILO_BYTE_PER_HOUR`, `KILO_BYTE_PER_MINUTE`, `KILO_BYTE_PER_SECOND`, `MEBI_BYTE`, `MEBI_BYTE_PER_HOUR`,
     * `MEBI_BYTE_PER_MINUTE`, `MEBI_BYTE_PER_SECOND`, `MEGA`, `MEGA_BYTE`, `MEGA_BYTE_PER_HOUR`, `MEGA_BYTE_PER_MINUTE`,
     * `MEGA_BYTE_PER_SECOND`, `MICRO_SECOND`, `MILLI_CORES`, `MILLI_SECOND`, `MILLI_SECOND_PER_MINUTE`, `MINUTE`, `MONTH`,
     * `MSU`, `NANO_SECOND`, `NANO_SECOND_PER_MINUTE`, `NOT_APPLICABLE`, `PERCENT`, `PER_HOUR`, `PER_MINUTE`, `PER_SECOND`,
     * `PIXEL`, `PROMILLE`, `RATIO`, `SECOND`, `STATE`, `UNSPECIFIED`, `WEEK` and `YEAR`
     * 
     */
    public Output<String> unit() {
        return this.unit;
    }

    /**
     * The display name of the metric&#39;s unit. Only applicable when the **unit** parameter is set to `UNSPECIFIED`
     * 
     */
    @Import(name="unitDisplayName")
    private @Nullable Output<String> unitDisplayName;

    /**
     * @return The display name of the metric&#39;s unit. Only applicable when the **unit** parameter is set to `UNSPECIFIED`
     * 
     */
    public Optional<Output<String>> unitDisplayName() {
        return Optional.ofNullable(this.unitDisplayName);
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

    private CalculatedServiceMetricArgs() {}

    private CalculatedServiceMetricArgs(CalculatedServiceMetricArgs $) {
        this.conditions = $.conditions;
        this.description = $.description;
        this.dimensionDefinition = $.dimensionDefinition;
        this.enabled = $.enabled;
        this.entityId = $.entityId;
        this.managementZones = $.managementZones;
        this.metricDefinition = $.metricDefinition;
        this.metricKey = $.metricKey;
        this.name = $.name;
        this.unit = $.unit;
        this.unitDisplayName = $.unitDisplayName;
        this.unknowns = $.unknowns;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CalculatedServiceMetricArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CalculatedServiceMetricArgs $;

        public Builder() {
            $ = new CalculatedServiceMetricArgs();
        }

        public Builder(CalculatedServiceMetricArgs defaults) {
            $ = new CalculatedServiceMetricArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param conditions The set of conditions for the metric usage. **All** the specified conditions must be fulfilled to use the metric
         * 
         * @return builder
         * 
         */
        public Builder conditions(@Nullable Output<List<CalculatedServiceMetricConditionArgs>> conditions) {
            $.conditions = conditions;
            return this;
        }

        /**
         * @param conditions The set of conditions for the metric usage. **All** the specified conditions must be fulfilled to use the metric
         * 
         * @return builder
         * 
         */
        public Builder conditions(List<CalculatedServiceMetricConditionArgs> conditions) {
            return conditions(Output.of(conditions));
        }

        /**
         * @param conditions The set of conditions for the metric usage. **All** the specified conditions must be fulfilled to use the metric
         * 
         * @return builder
         * 
         */
        public Builder conditions(CalculatedServiceMetricConditionArgs... conditions) {
            return conditions(List.of(conditions));
        }

        /**
         * @param description The displayed description of the metric
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The displayed description of the metric
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param dimensionDefinition Parameters of a definition of a calculated service metric
         * 
         * @return builder
         * 
         */
        public Builder dimensionDefinition(@Nullable Output<CalculatedServiceMetricDimensionDefinitionArgs> dimensionDefinition) {
            $.dimensionDefinition = dimensionDefinition;
            return this;
        }

        /**
         * @param dimensionDefinition Parameters of a definition of a calculated service metric
         * 
         * @return builder
         * 
         */
        public Builder dimensionDefinition(CalculatedServiceMetricDimensionDefinitionArgs dimensionDefinition) {
            return dimensionDefinition(Output.of(dimensionDefinition));
        }

        /**
         * @param enabled The metric is enabled (`true`) or disabled (`false`)
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled The metric is enabled (`true`) or disabled (`false`)
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param entityId Restricts the metric usage to the specified service. This field is mutually exclusive with the `management_zones` field
         * 
         * @return builder
         * 
         */
        public Builder entityId(@Nullable Output<String> entityId) {
            $.entityId = entityId;
            return this;
        }

        /**
         * @param entityId Restricts the metric usage to the specified service. This field is mutually exclusive with the `management_zones` field
         * 
         * @return builder
         * 
         */
        public Builder entityId(String entityId) {
            return entityId(Output.of(entityId));
        }

        /**
         * @param managementZones Restricts the metric usage to specified management zones. This field is mutually exclusive with the `entity_id` field
         * 
         * @return builder
         * 
         */
        public Builder managementZones(@Nullable Output<List<String>> managementZones) {
            $.managementZones = managementZones;
            return this;
        }

        /**
         * @param managementZones Restricts the metric usage to specified management zones. This field is mutually exclusive with the `entity_id` field
         * 
         * @return builder
         * 
         */
        public Builder managementZones(List<String> managementZones) {
            return managementZones(Output.of(managementZones));
        }

        /**
         * @param managementZones Restricts the metric usage to specified management zones. This field is mutually exclusive with the `entity_id` field
         * 
         * @return builder
         * 
         */
        public Builder managementZones(String... managementZones) {
            return managementZones(List.of(managementZones));
        }

        /**
         * @param metricDefinition The definition of a calculated service metric
         * 
         * @return builder
         * 
         */
        public Builder metricDefinition(@Nullable Output<CalculatedServiceMetricMetricDefinitionArgs> metricDefinition) {
            $.metricDefinition = metricDefinition;
            return this;
        }

        /**
         * @param metricDefinition The definition of a calculated service metric
         * 
         * @return builder
         * 
         */
        public Builder metricDefinition(CalculatedServiceMetricMetricDefinitionArgs metricDefinition) {
            return metricDefinition(Output.of(metricDefinition));
        }

        /**
         * @param metricKey The key of the calculated service metric
         * 
         * @return builder
         * 
         */
        public Builder metricKey(Output<String> metricKey) {
            $.metricKey = metricKey;
            return this;
        }

        /**
         * @param metricKey The key of the calculated service metric
         * 
         * @return builder
         * 
         */
        public Builder metricKey(String metricKey) {
            return metricKey(Output.of(metricKey));
        }

        /**
         * @param name The displayed name of the metric
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The displayed name of the metric
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param unit The unit of the metric. Possible values are `BIT`, `BIT_PER_HOUR`, `BIT_PER_MINUTE`, `BIT_PER_SECOND`, `BYTE`,
         * `BYTE_PER_HOUR`, `BYTE_PER_MINUTE`, `BYTE_PER_SECOND`, `CORES`, `COUNT`, `DAY`, `DECIBEL_MILLI_WATT`, `GIBI_BYTE`,
         * `GIGA`, `GIGA_BYTE`, `HOUR`, `KIBI_BYTE`, `KIBI_BYTE_PER_HOUR`, `KIBI_BYTE_PER_MINUTE`, `KIBI_BYTE_PER_SECOND`, `KILO`,
         * `KILO_BYTE`, `KILO_BYTE_PER_HOUR`, `KILO_BYTE_PER_MINUTE`, `KILO_BYTE_PER_SECOND`, `MEBI_BYTE`, `MEBI_BYTE_PER_HOUR`,
         * `MEBI_BYTE_PER_MINUTE`, `MEBI_BYTE_PER_SECOND`, `MEGA`, `MEGA_BYTE`, `MEGA_BYTE_PER_HOUR`, `MEGA_BYTE_PER_MINUTE`,
         * `MEGA_BYTE_PER_SECOND`, `MICRO_SECOND`, `MILLI_CORES`, `MILLI_SECOND`, `MILLI_SECOND_PER_MINUTE`, `MINUTE`, `MONTH`,
         * `MSU`, `NANO_SECOND`, `NANO_SECOND_PER_MINUTE`, `NOT_APPLICABLE`, `PERCENT`, `PER_HOUR`, `PER_MINUTE`, `PER_SECOND`,
         * `PIXEL`, `PROMILLE`, `RATIO`, `SECOND`, `STATE`, `UNSPECIFIED`, `WEEK` and `YEAR`
         * 
         * @return builder
         * 
         */
        public Builder unit(Output<String> unit) {
            $.unit = unit;
            return this;
        }

        /**
         * @param unit The unit of the metric. Possible values are `BIT`, `BIT_PER_HOUR`, `BIT_PER_MINUTE`, `BIT_PER_SECOND`, `BYTE`,
         * `BYTE_PER_HOUR`, `BYTE_PER_MINUTE`, `BYTE_PER_SECOND`, `CORES`, `COUNT`, `DAY`, `DECIBEL_MILLI_WATT`, `GIBI_BYTE`,
         * `GIGA`, `GIGA_BYTE`, `HOUR`, `KIBI_BYTE`, `KIBI_BYTE_PER_HOUR`, `KIBI_BYTE_PER_MINUTE`, `KIBI_BYTE_PER_SECOND`, `KILO`,
         * `KILO_BYTE`, `KILO_BYTE_PER_HOUR`, `KILO_BYTE_PER_MINUTE`, `KILO_BYTE_PER_SECOND`, `MEBI_BYTE`, `MEBI_BYTE_PER_HOUR`,
         * `MEBI_BYTE_PER_MINUTE`, `MEBI_BYTE_PER_SECOND`, `MEGA`, `MEGA_BYTE`, `MEGA_BYTE_PER_HOUR`, `MEGA_BYTE_PER_MINUTE`,
         * `MEGA_BYTE_PER_SECOND`, `MICRO_SECOND`, `MILLI_CORES`, `MILLI_SECOND`, `MILLI_SECOND_PER_MINUTE`, `MINUTE`, `MONTH`,
         * `MSU`, `NANO_SECOND`, `NANO_SECOND_PER_MINUTE`, `NOT_APPLICABLE`, `PERCENT`, `PER_HOUR`, `PER_MINUTE`, `PER_SECOND`,
         * `PIXEL`, `PROMILLE`, `RATIO`, `SECOND`, `STATE`, `UNSPECIFIED`, `WEEK` and `YEAR`
         * 
         * @return builder
         * 
         */
        public Builder unit(String unit) {
            return unit(Output.of(unit));
        }

        /**
         * @param unitDisplayName The display name of the metric&#39;s unit. Only applicable when the **unit** parameter is set to `UNSPECIFIED`
         * 
         * @return builder
         * 
         */
        public Builder unitDisplayName(@Nullable Output<String> unitDisplayName) {
            $.unitDisplayName = unitDisplayName;
            return this;
        }

        /**
         * @param unitDisplayName The display name of the metric&#39;s unit. Only applicable when the **unit** parameter is set to `UNSPECIFIED`
         * 
         * @return builder
         * 
         */
        public Builder unitDisplayName(String unitDisplayName) {
            return unitDisplayName(Output.of(unitDisplayName));
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

        public CalculatedServiceMetricArgs build() {
            $.metricKey = Objects.requireNonNull($.metricKey, "expected parameter 'metricKey' to be non-null");
            $.unit = Objects.requireNonNull($.unit, "expected parameter 'unit' to be non-null");
            return $;
        }
    }

}
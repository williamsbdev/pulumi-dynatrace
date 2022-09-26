// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.dynatrace.CalculatedServiceMetricArgs;
import com.pulumi.dynatrace.Utilities;
import com.pulumi.dynatrace.inputs.CalculatedServiceMetricState;
import com.pulumi.dynatrace.outputs.CalculatedServiceMetricCondition;
import com.pulumi.dynatrace.outputs.CalculatedServiceMetricDimensionDefinition;
import com.pulumi.dynatrace.outputs.CalculatedServiceMetricMetricDefinition;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

@ResourceType(type="dynatrace:index/calculatedServiceMetric:CalculatedServiceMetric")
public class CalculatedServiceMetric extends com.pulumi.resources.CustomResource {
    /**
     * The set of conditions for the metric usage. **All** the specified conditions must be fulfilled to use the metric
     * 
     */
    @Export(name="conditions", type=List.class, parameters={CalculatedServiceMetricCondition.class})
    private Output</* @Nullable */ List<CalculatedServiceMetricCondition>> conditions;

    /**
     * @return The set of conditions for the metric usage. **All** the specified conditions must be fulfilled to use the metric
     * 
     */
    public Output<Optional<List<CalculatedServiceMetricCondition>>> conditions() {
        return Codegen.optional(this.conditions);
    }
    /**
     * The displayed description of the metric
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return The displayed description of the metric
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Parameters of a definition of a calculated service metric
     * 
     */
    @Export(name="dimensionDefinition", type=CalculatedServiceMetricDimensionDefinition.class, parameters={})
    private Output</* @Nullable */ CalculatedServiceMetricDimensionDefinition> dimensionDefinition;

    /**
     * @return Parameters of a definition of a calculated service metric
     * 
     */
    public Output<Optional<CalculatedServiceMetricDimensionDefinition>> dimensionDefinition() {
        return Codegen.optional(this.dimensionDefinition);
    }
    /**
     * The metric is enabled (`true`) or disabled (`false`)
     * 
     */
    @Export(name="enabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enabled;

    /**
     * @return The metric is enabled (`true`) or disabled (`false`)
     * 
     */
    public Output<Optional<Boolean>> enabled() {
        return Codegen.optional(this.enabled);
    }
    /**
     * Restricts the metric usage to the specified service. This field is mutually exclusive with the `management_zones` field
     * 
     */
    @Export(name="entityId", type=String.class, parameters={})
    private Output</* @Nullable */ String> entityId;

    /**
     * @return Restricts the metric usage to the specified service. This field is mutually exclusive with the `management_zones` field
     * 
     */
    public Output<Optional<String>> entityId() {
        return Codegen.optional(this.entityId);
    }
    /**
     * Restricts the metric usage to specified management zones. This field is mutually exclusive with the `entity_id` field
     * 
     */
    @Export(name="managementZones", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> managementZones;

    /**
     * @return Restricts the metric usage to specified management zones. This field is mutually exclusive with the `entity_id` field
     * 
     */
    public Output<Optional<List<String>>> managementZones() {
        return Codegen.optional(this.managementZones);
    }
    /**
     * The definition of a calculated service metric
     * 
     */
    @Export(name="metricDefinition", type=CalculatedServiceMetricMetricDefinition.class, parameters={})
    private Output</* @Nullable */ CalculatedServiceMetricMetricDefinition> metricDefinition;

    /**
     * @return The definition of a calculated service metric
     * 
     */
    public Output<Optional<CalculatedServiceMetricMetricDefinition>> metricDefinition() {
        return Codegen.optional(this.metricDefinition);
    }
    /**
     * The key of the calculated service metric
     * 
     */
    @Export(name="metricKey", type=String.class, parameters={})
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
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The displayed name of the metric
     * 
     */
    public Output<String> name() {
        return this.name;
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
    @Export(name="unit", type=String.class, parameters={})
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
    @Export(name="unitDisplayName", type=String.class, parameters={})
    private Output</* @Nullable */ String> unitDisplayName;

    /**
     * @return The display name of the metric&#39;s unit. Only applicable when the **unit** parameter is set to `UNSPECIFIED`
     * 
     */
    public Output<Optional<String>> unitDisplayName() {
        return Codegen.optional(this.unitDisplayName);
    }
    /**
     * allows for configuring properties that are not explicitly supported by the current version of this provider
     * 
     */
    @Export(name="unknowns", type=String.class, parameters={})
    private Output</* @Nullable */ String> unknowns;

    /**
     * @return allows for configuring properties that are not explicitly supported by the current version of this provider
     * 
     */
    public Output<Optional<String>> unknowns() {
        return Codegen.optional(this.unknowns);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public CalculatedServiceMetric(String name) {
        this(name, CalculatedServiceMetricArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CalculatedServiceMetric(String name, CalculatedServiceMetricArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CalculatedServiceMetric(String name, CalculatedServiceMetricArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("dynatrace:index/calculatedServiceMetric:CalculatedServiceMetric", name, args == null ? CalculatedServiceMetricArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private CalculatedServiceMetric(String name, Output<String> id, @Nullable CalculatedServiceMetricState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("dynatrace:index/calculatedServiceMetric:CalculatedServiceMetric", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static CalculatedServiceMetric get(String name, Output<String> id, @Nullable CalculatedServiceMetricState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new CalculatedServiceMetric(name, id, state, options);
    }
}
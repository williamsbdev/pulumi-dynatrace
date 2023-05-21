# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities
from . import outputs
from ._inputs import *

__all__ = ['OpentelemetryMetricsArgs', 'OpentelemetryMetrics']

@pulumi.input_type
class OpentelemetryMetricsArgs:
    def __init__(__self__, *,
                 additional_attributes_to_dimension_enabled: pulumi.Input[bool],
                 meter_name_to_dimension_enabled: pulumi.Input[bool],
                 additional_attributes: Optional[pulumi.Input['OpentelemetryMetricsAdditionalAttributesArgs']] = None,
                 scope: Optional[pulumi.Input[str]] = None,
                 to_drop_attributes: Optional[pulumi.Input['OpentelemetryMetricsToDropAttributesArgs']] = None):
        """
        The set of arguments for constructing a OpentelemetryMetrics resource.
        :param pulumi.Input[bool] additional_attributes_to_dimension_enabled: Add the resource and scope attributes configured below as dimensions
        :param pulumi.Input[bool] meter_name_to_dimension_enabled: When enabled, the Meter name (also referred to as InstrumentationScope or InstrumentationLibrary in OpenTelemetry SDKs) and version will be added as dimensions (`otel.scope.name` and `otel.scope.version`) to ingested OTLP metrics.
        :param pulumi.Input['OpentelemetryMetricsAdditionalAttributesArgs'] additional_attributes: When enabled, the attributes defined in the list below will be added as dimensions to ingested OTLP metrics if they are
               present in the OpenTelemetry resource or in the instrumentation scope. **Notes:** * Modifying this setting (renaming,
               disabling or removing attributes) will cause the metric to change. This may have an impact on existing dashboards,
               events and alerts that make use of these dimensions. In this case, they will need to be updated manually. * Dynatrace
               does not recommend changing/removing the attributes starting with "dt.". Dynatrace leverages these attributes to [Enrich
               metrics](https://www.dynatrace.com/support/help/extend-dynatrace/extend-metrics/reference/enrich-metrics).
        :param pulumi.Input[str] scope: The scope of this setting (environment-default). Omit this property if you want to cover the whole environment.
        :param pulumi.Input['OpentelemetryMetricsToDropAttributesArgs'] to_drop_attributes: The attributes defined in the list below will be dropped from all ingested OTLP metrics. Upon ingest, the *Allow list:
               resource and scope attributes* above is applied first. Then, the *Deny list: all attributes* below is applied. The deny
               list therefore applies to all attributes from all sources (data points, scope and resource). **Notes:** * Modifying this
               setting (adding, renaming, disabling or removing attributes) will cause the metric to change. This may have an impact on
               existing dashboards, events and alerts that make use of these dimensions. In this case, they will need to be updated
               manually. * Dynatrace does not recommend including attributes starting with "dt." to the deny list. Dynatrace leverages
               these attributes to [Enrich
               metrics](https://www.dynatrace.com/support/help/extend-dynatrace/extend-metrics/reference/enrich-metrics).
        """
        pulumi.set(__self__, "additional_attributes_to_dimension_enabled", additional_attributes_to_dimension_enabled)
        pulumi.set(__self__, "meter_name_to_dimension_enabled", meter_name_to_dimension_enabled)
        if additional_attributes is not None:
            pulumi.set(__self__, "additional_attributes", additional_attributes)
        if scope is not None:
            pulumi.set(__self__, "scope", scope)
        if to_drop_attributes is not None:
            pulumi.set(__self__, "to_drop_attributes", to_drop_attributes)

    @property
    @pulumi.getter(name="additionalAttributesToDimensionEnabled")
    def additional_attributes_to_dimension_enabled(self) -> pulumi.Input[bool]:
        """
        Add the resource and scope attributes configured below as dimensions
        """
        return pulumi.get(self, "additional_attributes_to_dimension_enabled")

    @additional_attributes_to_dimension_enabled.setter
    def additional_attributes_to_dimension_enabled(self, value: pulumi.Input[bool]):
        pulumi.set(self, "additional_attributes_to_dimension_enabled", value)

    @property
    @pulumi.getter(name="meterNameToDimensionEnabled")
    def meter_name_to_dimension_enabled(self) -> pulumi.Input[bool]:
        """
        When enabled, the Meter name (also referred to as InstrumentationScope or InstrumentationLibrary in OpenTelemetry SDKs) and version will be added as dimensions (`otel.scope.name` and `otel.scope.version`) to ingested OTLP metrics.
        """
        return pulumi.get(self, "meter_name_to_dimension_enabled")

    @meter_name_to_dimension_enabled.setter
    def meter_name_to_dimension_enabled(self, value: pulumi.Input[bool]):
        pulumi.set(self, "meter_name_to_dimension_enabled", value)

    @property
    @pulumi.getter(name="additionalAttributes")
    def additional_attributes(self) -> Optional[pulumi.Input['OpentelemetryMetricsAdditionalAttributesArgs']]:
        """
        When enabled, the attributes defined in the list below will be added as dimensions to ingested OTLP metrics if they are
        present in the OpenTelemetry resource or in the instrumentation scope. **Notes:** * Modifying this setting (renaming,
        disabling or removing attributes) will cause the metric to change. This may have an impact on existing dashboards,
        events and alerts that make use of these dimensions. In this case, they will need to be updated manually. * Dynatrace
        does not recommend changing/removing the attributes starting with "dt.". Dynatrace leverages these attributes to [Enrich
        metrics](https://www.dynatrace.com/support/help/extend-dynatrace/extend-metrics/reference/enrich-metrics).
        """
        return pulumi.get(self, "additional_attributes")

    @additional_attributes.setter
    def additional_attributes(self, value: Optional[pulumi.Input['OpentelemetryMetricsAdditionalAttributesArgs']]):
        pulumi.set(self, "additional_attributes", value)

    @property
    @pulumi.getter
    def scope(self) -> Optional[pulumi.Input[str]]:
        """
        The scope of this setting (environment-default). Omit this property if you want to cover the whole environment.
        """
        return pulumi.get(self, "scope")

    @scope.setter
    def scope(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "scope", value)

    @property
    @pulumi.getter(name="toDropAttributes")
    def to_drop_attributes(self) -> Optional[pulumi.Input['OpentelemetryMetricsToDropAttributesArgs']]:
        """
        The attributes defined in the list below will be dropped from all ingested OTLP metrics. Upon ingest, the *Allow list:
        resource and scope attributes* above is applied first. Then, the *Deny list: all attributes* below is applied. The deny
        list therefore applies to all attributes from all sources (data points, scope and resource). **Notes:** * Modifying this
        setting (adding, renaming, disabling or removing attributes) will cause the metric to change. This may have an impact on
        existing dashboards, events and alerts that make use of these dimensions. In this case, they will need to be updated
        manually. * Dynatrace does not recommend including attributes starting with "dt." to the deny list. Dynatrace leverages
        these attributes to [Enrich
        metrics](https://www.dynatrace.com/support/help/extend-dynatrace/extend-metrics/reference/enrich-metrics).
        """
        return pulumi.get(self, "to_drop_attributes")

    @to_drop_attributes.setter
    def to_drop_attributes(self, value: Optional[pulumi.Input['OpentelemetryMetricsToDropAttributesArgs']]):
        pulumi.set(self, "to_drop_attributes", value)


@pulumi.input_type
class _OpentelemetryMetricsState:
    def __init__(__self__, *,
                 additional_attributes: Optional[pulumi.Input['OpentelemetryMetricsAdditionalAttributesArgs']] = None,
                 additional_attributes_to_dimension_enabled: Optional[pulumi.Input[bool]] = None,
                 meter_name_to_dimension_enabled: Optional[pulumi.Input[bool]] = None,
                 scope: Optional[pulumi.Input[str]] = None,
                 to_drop_attributes: Optional[pulumi.Input['OpentelemetryMetricsToDropAttributesArgs']] = None):
        """
        Input properties used for looking up and filtering OpentelemetryMetrics resources.
        :param pulumi.Input['OpentelemetryMetricsAdditionalAttributesArgs'] additional_attributes: When enabled, the attributes defined in the list below will be added as dimensions to ingested OTLP metrics if they are
               present in the OpenTelemetry resource or in the instrumentation scope. **Notes:** * Modifying this setting (renaming,
               disabling or removing attributes) will cause the metric to change. This may have an impact on existing dashboards,
               events and alerts that make use of these dimensions. In this case, they will need to be updated manually. * Dynatrace
               does not recommend changing/removing the attributes starting with "dt.". Dynatrace leverages these attributes to [Enrich
               metrics](https://www.dynatrace.com/support/help/extend-dynatrace/extend-metrics/reference/enrich-metrics).
        :param pulumi.Input[bool] additional_attributes_to_dimension_enabled: Add the resource and scope attributes configured below as dimensions
        :param pulumi.Input[bool] meter_name_to_dimension_enabled: When enabled, the Meter name (also referred to as InstrumentationScope or InstrumentationLibrary in OpenTelemetry SDKs) and version will be added as dimensions (`otel.scope.name` and `otel.scope.version`) to ingested OTLP metrics.
        :param pulumi.Input[str] scope: The scope of this setting (environment-default). Omit this property if you want to cover the whole environment.
        :param pulumi.Input['OpentelemetryMetricsToDropAttributesArgs'] to_drop_attributes: The attributes defined in the list below will be dropped from all ingested OTLP metrics. Upon ingest, the *Allow list:
               resource and scope attributes* above is applied first. Then, the *Deny list: all attributes* below is applied. The deny
               list therefore applies to all attributes from all sources (data points, scope and resource). **Notes:** * Modifying this
               setting (adding, renaming, disabling or removing attributes) will cause the metric to change. This may have an impact on
               existing dashboards, events and alerts that make use of these dimensions. In this case, they will need to be updated
               manually. * Dynatrace does not recommend including attributes starting with "dt." to the deny list. Dynatrace leverages
               these attributes to [Enrich
               metrics](https://www.dynatrace.com/support/help/extend-dynatrace/extend-metrics/reference/enrich-metrics).
        """
        if additional_attributes is not None:
            pulumi.set(__self__, "additional_attributes", additional_attributes)
        if additional_attributes_to_dimension_enabled is not None:
            pulumi.set(__self__, "additional_attributes_to_dimension_enabled", additional_attributes_to_dimension_enabled)
        if meter_name_to_dimension_enabled is not None:
            pulumi.set(__self__, "meter_name_to_dimension_enabled", meter_name_to_dimension_enabled)
        if scope is not None:
            pulumi.set(__self__, "scope", scope)
        if to_drop_attributes is not None:
            pulumi.set(__self__, "to_drop_attributes", to_drop_attributes)

    @property
    @pulumi.getter(name="additionalAttributes")
    def additional_attributes(self) -> Optional[pulumi.Input['OpentelemetryMetricsAdditionalAttributesArgs']]:
        """
        When enabled, the attributes defined in the list below will be added as dimensions to ingested OTLP metrics if they are
        present in the OpenTelemetry resource or in the instrumentation scope. **Notes:** * Modifying this setting (renaming,
        disabling or removing attributes) will cause the metric to change. This may have an impact on existing dashboards,
        events and alerts that make use of these dimensions. In this case, they will need to be updated manually. * Dynatrace
        does not recommend changing/removing the attributes starting with "dt.". Dynatrace leverages these attributes to [Enrich
        metrics](https://www.dynatrace.com/support/help/extend-dynatrace/extend-metrics/reference/enrich-metrics).
        """
        return pulumi.get(self, "additional_attributes")

    @additional_attributes.setter
    def additional_attributes(self, value: Optional[pulumi.Input['OpentelemetryMetricsAdditionalAttributesArgs']]):
        pulumi.set(self, "additional_attributes", value)

    @property
    @pulumi.getter(name="additionalAttributesToDimensionEnabled")
    def additional_attributes_to_dimension_enabled(self) -> Optional[pulumi.Input[bool]]:
        """
        Add the resource and scope attributes configured below as dimensions
        """
        return pulumi.get(self, "additional_attributes_to_dimension_enabled")

    @additional_attributes_to_dimension_enabled.setter
    def additional_attributes_to_dimension_enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "additional_attributes_to_dimension_enabled", value)

    @property
    @pulumi.getter(name="meterNameToDimensionEnabled")
    def meter_name_to_dimension_enabled(self) -> Optional[pulumi.Input[bool]]:
        """
        When enabled, the Meter name (also referred to as InstrumentationScope or InstrumentationLibrary in OpenTelemetry SDKs) and version will be added as dimensions (`otel.scope.name` and `otel.scope.version`) to ingested OTLP metrics.
        """
        return pulumi.get(self, "meter_name_to_dimension_enabled")

    @meter_name_to_dimension_enabled.setter
    def meter_name_to_dimension_enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "meter_name_to_dimension_enabled", value)

    @property
    @pulumi.getter
    def scope(self) -> Optional[pulumi.Input[str]]:
        """
        The scope of this setting (environment-default). Omit this property if you want to cover the whole environment.
        """
        return pulumi.get(self, "scope")

    @scope.setter
    def scope(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "scope", value)

    @property
    @pulumi.getter(name="toDropAttributes")
    def to_drop_attributes(self) -> Optional[pulumi.Input['OpentelemetryMetricsToDropAttributesArgs']]:
        """
        The attributes defined in the list below will be dropped from all ingested OTLP metrics. Upon ingest, the *Allow list:
        resource and scope attributes* above is applied first. Then, the *Deny list: all attributes* below is applied. The deny
        list therefore applies to all attributes from all sources (data points, scope and resource). **Notes:** * Modifying this
        setting (adding, renaming, disabling or removing attributes) will cause the metric to change. This may have an impact on
        existing dashboards, events and alerts that make use of these dimensions. In this case, they will need to be updated
        manually. * Dynatrace does not recommend including attributes starting with "dt." to the deny list. Dynatrace leverages
        these attributes to [Enrich
        metrics](https://www.dynatrace.com/support/help/extend-dynatrace/extend-metrics/reference/enrich-metrics).
        """
        return pulumi.get(self, "to_drop_attributes")

    @to_drop_attributes.setter
    def to_drop_attributes(self, value: Optional[pulumi.Input['OpentelemetryMetricsToDropAttributesArgs']]):
        pulumi.set(self, "to_drop_attributes", value)


class OpentelemetryMetrics(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 additional_attributes: Optional[pulumi.Input[pulumi.InputType['OpentelemetryMetricsAdditionalAttributesArgs']]] = None,
                 additional_attributes_to_dimension_enabled: Optional[pulumi.Input[bool]] = None,
                 meter_name_to_dimension_enabled: Optional[pulumi.Input[bool]] = None,
                 scope: Optional[pulumi.Input[str]] = None,
                 to_drop_attributes: Optional[pulumi.Input[pulumi.InputType['OpentelemetryMetricsToDropAttributesArgs']]] = None,
                 __props__=None):
        """
        Create a OpentelemetryMetrics resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[pulumi.InputType['OpentelemetryMetricsAdditionalAttributesArgs']] additional_attributes: When enabled, the attributes defined in the list below will be added as dimensions to ingested OTLP metrics if they are
               present in the OpenTelemetry resource or in the instrumentation scope. **Notes:** * Modifying this setting (renaming,
               disabling or removing attributes) will cause the metric to change. This may have an impact on existing dashboards,
               events and alerts that make use of these dimensions. In this case, they will need to be updated manually. * Dynatrace
               does not recommend changing/removing the attributes starting with "dt.". Dynatrace leverages these attributes to [Enrich
               metrics](https://www.dynatrace.com/support/help/extend-dynatrace/extend-metrics/reference/enrich-metrics).
        :param pulumi.Input[bool] additional_attributes_to_dimension_enabled: Add the resource and scope attributes configured below as dimensions
        :param pulumi.Input[bool] meter_name_to_dimension_enabled: When enabled, the Meter name (also referred to as InstrumentationScope or InstrumentationLibrary in OpenTelemetry SDKs) and version will be added as dimensions (`otel.scope.name` and `otel.scope.version`) to ingested OTLP metrics.
        :param pulumi.Input[str] scope: The scope of this setting (environment-default). Omit this property if you want to cover the whole environment.
        :param pulumi.Input[pulumi.InputType['OpentelemetryMetricsToDropAttributesArgs']] to_drop_attributes: The attributes defined in the list below will be dropped from all ingested OTLP metrics. Upon ingest, the *Allow list:
               resource and scope attributes* above is applied first. Then, the *Deny list: all attributes* below is applied. The deny
               list therefore applies to all attributes from all sources (data points, scope and resource). **Notes:** * Modifying this
               setting (adding, renaming, disabling or removing attributes) will cause the metric to change. This may have an impact on
               existing dashboards, events and alerts that make use of these dimensions. In this case, they will need to be updated
               manually. * Dynatrace does not recommend including attributes starting with "dt." to the deny list. Dynatrace leverages
               these attributes to [Enrich
               metrics](https://www.dynatrace.com/support/help/extend-dynatrace/extend-metrics/reference/enrich-metrics).
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: OpentelemetryMetricsArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Create a OpentelemetryMetrics resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param OpentelemetryMetricsArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(OpentelemetryMetricsArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 additional_attributes: Optional[pulumi.Input[pulumi.InputType['OpentelemetryMetricsAdditionalAttributesArgs']]] = None,
                 additional_attributes_to_dimension_enabled: Optional[pulumi.Input[bool]] = None,
                 meter_name_to_dimension_enabled: Optional[pulumi.Input[bool]] = None,
                 scope: Optional[pulumi.Input[str]] = None,
                 to_drop_attributes: Optional[pulumi.Input[pulumi.InputType['OpentelemetryMetricsToDropAttributesArgs']]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = OpentelemetryMetricsArgs.__new__(OpentelemetryMetricsArgs)

            __props__.__dict__["additional_attributes"] = additional_attributes
            if additional_attributes_to_dimension_enabled is None and not opts.urn:
                raise TypeError("Missing required property 'additional_attributes_to_dimension_enabled'")
            __props__.__dict__["additional_attributes_to_dimension_enabled"] = additional_attributes_to_dimension_enabled
            if meter_name_to_dimension_enabled is None and not opts.urn:
                raise TypeError("Missing required property 'meter_name_to_dimension_enabled'")
            __props__.__dict__["meter_name_to_dimension_enabled"] = meter_name_to_dimension_enabled
            __props__.__dict__["scope"] = scope
            __props__.__dict__["to_drop_attributes"] = to_drop_attributes
        super(OpentelemetryMetrics, __self__).__init__(
            'dynatrace:index/opentelemetryMetrics:OpentelemetryMetrics',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            additional_attributes: Optional[pulumi.Input[pulumi.InputType['OpentelemetryMetricsAdditionalAttributesArgs']]] = None,
            additional_attributes_to_dimension_enabled: Optional[pulumi.Input[bool]] = None,
            meter_name_to_dimension_enabled: Optional[pulumi.Input[bool]] = None,
            scope: Optional[pulumi.Input[str]] = None,
            to_drop_attributes: Optional[pulumi.Input[pulumi.InputType['OpentelemetryMetricsToDropAttributesArgs']]] = None) -> 'OpentelemetryMetrics':
        """
        Get an existing OpentelemetryMetrics resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[pulumi.InputType['OpentelemetryMetricsAdditionalAttributesArgs']] additional_attributes: When enabled, the attributes defined in the list below will be added as dimensions to ingested OTLP metrics if they are
               present in the OpenTelemetry resource or in the instrumentation scope. **Notes:** * Modifying this setting (renaming,
               disabling or removing attributes) will cause the metric to change. This may have an impact on existing dashboards,
               events and alerts that make use of these dimensions. In this case, they will need to be updated manually. * Dynatrace
               does not recommend changing/removing the attributes starting with "dt.". Dynatrace leverages these attributes to [Enrich
               metrics](https://www.dynatrace.com/support/help/extend-dynatrace/extend-metrics/reference/enrich-metrics).
        :param pulumi.Input[bool] additional_attributes_to_dimension_enabled: Add the resource and scope attributes configured below as dimensions
        :param pulumi.Input[bool] meter_name_to_dimension_enabled: When enabled, the Meter name (also referred to as InstrumentationScope or InstrumentationLibrary in OpenTelemetry SDKs) and version will be added as dimensions (`otel.scope.name` and `otel.scope.version`) to ingested OTLP metrics.
        :param pulumi.Input[str] scope: The scope of this setting (environment-default). Omit this property if you want to cover the whole environment.
        :param pulumi.Input[pulumi.InputType['OpentelemetryMetricsToDropAttributesArgs']] to_drop_attributes: The attributes defined in the list below will be dropped from all ingested OTLP metrics. Upon ingest, the *Allow list:
               resource and scope attributes* above is applied first. Then, the *Deny list: all attributes* below is applied. The deny
               list therefore applies to all attributes from all sources (data points, scope and resource). **Notes:** * Modifying this
               setting (adding, renaming, disabling or removing attributes) will cause the metric to change. This may have an impact on
               existing dashboards, events and alerts that make use of these dimensions. In this case, they will need to be updated
               manually. * Dynatrace does not recommend including attributes starting with "dt." to the deny list. Dynatrace leverages
               these attributes to [Enrich
               metrics](https://www.dynatrace.com/support/help/extend-dynatrace/extend-metrics/reference/enrich-metrics).
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _OpentelemetryMetricsState.__new__(_OpentelemetryMetricsState)

        __props__.__dict__["additional_attributes"] = additional_attributes
        __props__.__dict__["additional_attributes_to_dimension_enabled"] = additional_attributes_to_dimension_enabled
        __props__.__dict__["meter_name_to_dimension_enabled"] = meter_name_to_dimension_enabled
        __props__.__dict__["scope"] = scope
        __props__.__dict__["to_drop_attributes"] = to_drop_attributes
        return OpentelemetryMetrics(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="additionalAttributes")
    def additional_attributes(self) -> pulumi.Output[Optional['outputs.OpentelemetryMetricsAdditionalAttributes']]:
        """
        When enabled, the attributes defined in the list below will be added as dimensions to ingested OTLP metrics if they are
        present in the OpenTelemetry resource or in the instrumentation scope. **Notes:** * Modifying this setting (renaming,
        disabling or removing attributes) will cause the metric to change. This may have an impact on existing dashboards,
        events and alerts that make use of these dimensions. In this case, they will need to be updated manually. * Dynatrace
        does not recommend changing/removing the attributes starting with "dt.". Dynatrace leverages these attributes to [Enrich
        metrics](https://www.dynatrace.com/support/help/extend-dynatrace/extend-metrics/reference/enrich-metrics).
        """
        return pulumi.get(self, "additional_attributes")

    @property
    @pulumi.getter(name="additionalAttributesToDimensionEnabled")
    def additional_attributes_to_dimension_enabled(self) -> pulumi.Output[bool]:
        """
        Add the resource and scope attributes configured below as dimensions
        """
        return pulumi.get(self, "additional_attributes_to_dimension_enabled")

    @property
    @pulumi.getter(name="meterNameToDimensionEnabled")
    def meter_name_to_dimension_enabled(self) -> pulumi.Output[bool]:
        """
        When enabled, the Meter name (also referred to as InstrumentationScope or InstrumentationLibrary in OpenTelemetry SDKs) and version will be added as dimensions (`otel.scope.name` and `otel.scope.version`) to ingested OTLP metrics.
        """
        return pulumi.get(self, "meter_name_to_dimension_enabled")

    @property
    @pulumi.getter
    def scope(self) -> pulumi.Output[Optional[str]]:
        """
        The scope of this setting (environment-default). Omit this property if you want to cover the whole environment.
        """
        return pulumi.get(self, "scope")

    @property
    @pulumi.getter(name="toDropAttributes")
    def to_drop_attributes(self) -> pulumi.Output[Optional['outputs.OpentelemetryMetricsToDropAttributes']]:
        """
        The attributes defined in the list below will be dropped from all ingested OTLP metrics. Upon ingest, the *Allow list:
        resource and scope attributes* above is applied first. Then, the *Deny list: all attributes* below is applied. The deny
        list therefore applies to all attributes from all sources (data points, scope and resource). **Notes:** * Modifying this
        setting (adding, renaming, disabling or removing attributes) will cause the metric to change. This may have an impact on
        existing dashboards, events and alerts that make use of these dimensions. In this case, they will need to be updated
        manually. * Dynatrace does not recommend including attributes starting with "dt." to the deny list. Dynatrace leverages
        these attributes to [Enrich
        metrics](https://www.dynatrace.com/support/help/extend-dynatrace/extend-metrics/reference/enrich-metrics).
        """
        return pulumi.get(self, "to_drop_attributes")


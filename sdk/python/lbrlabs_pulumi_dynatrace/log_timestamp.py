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

__all__ = ['LogTimestampArgs', 'LogTimestamp']

@pulumi.input_type
class LogTimestampArgs:
    def __init__(__self__, *,
                 config_item_title: pulumi.Input[str],
                 date_time_pattern: pulumi.Input[str],
                 enabled: pulumi.Input[bool],
                 timezone: pulumi.Input[str],
                 matchers: Optional[pulumi.Input['LogTimestampMatchersArgs']] = None,
                 scope: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a LogTimestamp resource.
        :param pulumi.Input[str] config_item_title: Name
        :param pulumi.Input[str] date_time_pattern: Date-time pattern
        :param pulumi.Input[bool] enabled: This setting is enabled (`true`) or disabled (`false`)
        :param pulumi.Input[str] timezone: Timezone
        :param pulumi.Input['LogTimestampMatchersArgs'] matchers: no documentation available
        :param pulumi.Input[str] scope: The scope of this setting (HOST, HOST_GROUP). Omit this property if you want to cover the whole environment.
        """
        pulumi.set(__self__, "config_item_title", config_item_title)
        pulumi.set(__self__, "date_time_pattern", date_time_pattern)
        pulumi.set(__self__, "enabled", enabled)
        pulumi.set(__self__, "timezone", timezone)
        if matchers is not None:
            pulumi.set(__self__, "matchers", matchers)
        if scope is not None:
            pulumi.set(__self__, "scope", scope)

    @property
    @pulumi.getter(name="configItemTitle")
    def config_item_title(self) -> pulumi.Input[str]:
        """
        Name
        """
        return pulumi.get(self, "config_item_title")

    @config_item_title.setter
    def config_item_title(self, value: pulumi.Input[str]):
        pulumi.set(self, "config_item_title", value)

    @property
    @pulumi.getter(name="dateTimePattern")
    def date_time_pattern(self) -> pulumi.Input[str]:
        """
        Date-time pattern
        """
        return pulumi.get(self, "date_time_pattern")

    @date_time_pattern.setter
    def date_time_pattern(self, value: pulumi.Input[str]):
        pulumi.set(self, "date_time_pattern", value)

    @property
    @pulumi.getter
    def enabled(self) -> pulumi.Input[bool]:
        """
        This setting is enabled (`true`) or disabled (`false`)
        """
        return pulumi.get(self, "enabled")

    @enabled.setter
    def enabled(self, value: pulumi.Input[bool]):
        pulumi.set(self, "enabled", value)

    @property
    @pulumi.getter
    def timezone(self) -> pulumi.Input[str]:
        """
        Timezone
        """
        return pulumi.get(self, "timezone")

    @timezone.setter
    def timezone(self, value: pulumi.Input[str]):
        pulumi.set(self, "timezone", value)

    @property
    @pulumi.getter
    def matchers(self) -> Optional[pulumi.Input['LogTimestampMatchersArgs']]:
        """
        no documentation available
        """
        return pulumi.get(self, "matchers")

    @matchers.setter
    def matchers(self, value: Optional[pulumi.Input['LogTimestampMatchersArgs']]):
        pulumi.set(self, "matchers", value)

    @property
    @pulumi.getter
    def scope(self) -> Optional[pulumi.Input[str]]:
        """
        The scope of this setting (HOST, HOST_GROUP). Omit this property if you want to cover the whole environment.
        """
        return pulumi.get(self, "scope")

    @scope.setter
    def scope(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "scope", value)


@pulumi.input_type
class _LogTimestampState:
    def __init__(__self__, *,
                 config_item_title: Optional[pulumi.Input[str]] = None,
                 date_time_pattern: Optional[pulumi.Input[str]] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 matchers: Optional[pulumi.Input['LogTimestampMatchersArgs']] = None,
                 scope: Optional[pulumi.Input[str]] = None,
                 timezone: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering LogTimestamp resources.
        :param pulumi.Input[str] config_item_title: Name
        :param pulumi.Input[str] date_time_pattern: Date-time pattern
        :param pulumi.Input[bool] enabled: This setting is enabled (`true`) or disabled (`false`)
        :param pulumi.Input['LogTimestampMatchersArgs'] matchers: no documentation available
        :param pulumi.Input[str] scope: The scope of this setting (HOST, HOST_GROUP). Omit this property if you want to cover the whole environment.
        :param pulumi.Input[str] timezone: Timezone
        """
        if config_item_title is not None:
            pulumi.set(__self__, "config_item_title", config_item_title)
        if date_time_pattern is not None:
            pulumi.set(__self__, "date_time_pattern", date_time_pattern)
        if enabled is not None:
            pulumi.set(__self__, "enabled", enabled)
        if matchers is not None:
            pulumi.set(__self__, "matchers", matchers)
        if scope is not None:
            pulumi.set(__self__, "scope", scope)
        if timezone is not None:
            pulumi.set(__self__, "timezone", timezone)

    @property
    @pulumi.getter(name="configItemTitle")
    def config_item_title(self) -> Optional[pulumi.Input[str]]:
        """
        Name
        """
        return pulumi.get(self, "config_item_title")

    @config_item_title.setter
    def config_item_title(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "config_item_title", value)

    @property
    @pulumi.getter(name="dateTimePattern")
    def date_time_pattern(self) -> Optional[pulumi.Input[str]]:
        """
        Date-time pattern
        """
        return pulumi.get(self, "date_time_pattern")

    @date_time_pattern.setter
    def date_time_pattern(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "date_time_pattern", value)

    @property
    @pulumi.getter
    def enabled(self) -> Optional[pulumi.Input[bool]]:
        """
        This setting is enabled (`true`) or disabled (`false`)
        """
        return pulumi.get(self, "enabled")

    @enabled.setter
    def enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "enabled", value)

    @property
    @pulumi.getter
    def matchers(self) -> Optional[pulumi.Input['LogTimestampMatchersArgs']]:
        """
        no documentation available
        """
        return pulumi.get(self, "matchers")

    @matchers.setter
    def matchers(self, value: Optional[pulumi.Input['LogTimestampMatchersArgs']]):
        pulumi.set(self, "matchers", value)

    @property
    @pulumi.getter
    def scope(self) -> Optional[pulumi.Input[str]]:
        """
        The scope of this setting (HOST, HOST_GROUP). Omit this property if you want to cover the whole environment.
        """
        return pulumi.get(self, "scope")

    @scope.setter
    def scope(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "scope", value)

    @property
    @pulumi.getter
    def timezone(self) -> Optional[pulumi.Input[str]]:
        """
        Timezone
        """
        return pulumi.get(self, "timezone")

    @timezone.setter
    def timezone(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "timezone", value)


class LogTimestamp(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 config_item_title: Optional[pulumi.Input[str]] = None,
                 date_time_pattern: Optional[pulumi.Input[str]] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 matchers: Optional[pulumi.Input[pulumi.InputType['LogTimestampMatchersArgs']]] = None,
                 scope: Optional[pulumi.Input[str]] = None,
                 timezone: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Create a LogTimestamp resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] config_item_title: Name
        :param pulumi.Input[str] date_time_pattern: Date-time pattern
        :param pulumi.Input[bool] enabled: This setting is enabled (`true`) or disabled (`false`)
        :param pulumi.Input[pulumi.InputType['LogTimestampMatchersArgs']] matchers: no documentation available
        :param pulumi.Input[str] scope: The scope of this setting (HOST, HOST_GROUP). Omit this property if you want to cover the whole environment.
        :param pulumi.Input[str] timezone: Timezone
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: LogTimestampArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Create a LogTimestamp resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param LogTimestampArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(LogTimestampArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 config_item_title: Optional[pulumi.Input[str]] = None,
                 date_time_pattern: Optional[pulumi.Input[str]] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 matchers: Optional[pulumi.Input[pulumi.InputType['LogTimestampMatchersArgs']]] = None,
                 scope: Optional[pulumi.Input[str]] = None,
                 timezone: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = LogTimestampArgs.__new__(LogTimestampArgs)

            if config_item_title is None and not opts.urn:
                raise TypeError("Missing required property 'config_item_title'")
            __props__.__dict__["config_item_title"] = config_item_title
            if date_time_pattern is None and not opts.urn:
                raise TypeError("Missing required property 'date_time_pattern'")
            __props__.__dict__["date_time_pattern"] = date_time_pattern
            if enabled is None and not opts.urn:
                raise TypeError("Missing required property 'enabled'")
            __props__.__dict__["enabled"] = enabled
            __props__.__dict__["matchers"] = matchers
            __props__.__dict__["scope"] = scope
            if timezone is None and not opts.urn:
                raise TypeError("Missing required property 'timezone'")
            __props__.__dict__["timezone"] = timezone
        super(LogTimestamp, __self__).__init__(
            'dynatrace:index/logTimestamp:LogTimestamp',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            config_item_title: Optional[pulumi.Input[str]] = None,
            date_time_pattern: Optional[pulumi.Input[str]] = None,
            enabled: Optional[pulumi.Input[bool]] = None,
            matchers: Optional[pulumi.Input[pulumi.InputType['LogTimestampMatchersArgs']]] = None,
            scope: Optional[pulumi.Input[str]] = None,
            timezone: Optional[pulumi.Input[str]] = None) -> 'LogTimestamp':
        """
        Get an existing LogTimestamp resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] config_item_title: Name
        :param pulumi.Input[str] date_time_pattern: Date-time pattern
        :param pulumi.Input[bool] enabled: This setting is enabled (`true`) or disabled (`false`)
        :param pulumi.Input[pulumi.InputType['LogTimestampMatchersArgs']] matchers: no documentation available
        :param pulumi.Input[str] scope: The scope of this setting (HOST, HOST_GROUP). Omit this property if you want to cover the whole environment.
        :param pulumi.Input[str] timezone: Timezone
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _LogTimestampState.__new__(_LogTimestampState)

        __props__.__dict__["config_item_title"] = config_item_title
        __props__.__dict__["date_time_pattern"] = date_time_pattern
        __props__.__dict__["enabled"] = enabled
        __props__.__dict__["matchers"] = matchers
        __props__.__dict__["scope"] = scope
        __props__.__dict__["timezone"] = timezone
        return LogTimestamp(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="configItemTitle")
    def config_item_title(self) -> pulumi.Output[str]:
        """
        Name
        """
        return pulumi.get(self, "config_item_title")

    @property
    @pulumi.getter(name="dateTimePattern")
    def date_time_pattern(self) -> pulumi.Output[str]:
        """
        Date-time pattern
        """
        return pulumi.get(self, "date_time_pattern")

    @property
    @pulumi.getter
    def enabled(self) -> pulumi.Output[bool]:
        """
        This setting is enabled (`true`) or disabled (`false`)
        """
        return pulumi.get(self, "enabled")

    @property
    @pulumi.getter
    def matchers(self) -> pulumi.Output[Optional['outputs.LogTimestampMatchers']]:
        """
        no documentation available
        """
        return pulumi.get(self, "matchers")

    @property
    @pulumi.getter
    def scope(self) -> pulumi.Output[Optional[str]]:
        """
        The scope of this setting (HOST, HOST_GROUP). Omit this property if you want to cover the whole environment.
        """
        return pulumi.get(self, "scope")

    @property
    @pulumi.getter
    def timezone(self) -> pulumi.Output[str]:
        """
        Timezone
        """
        return pulumi.get(self, "timezone")

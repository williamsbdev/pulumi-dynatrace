# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['RumIpDeterminationArgs', 'RumIpDetermination']

@pulumi.input_type
class RumIpDeterminationArgs:
    def __init__(__self__, *,
                 header_name: pulumi.Input[str]):
        """
        The set of arguments for constructing a RumIpDetermination resource.
        :param pulumi.Input[str] header_name: Client IP header name
        """
        pulumi.set(__self__, "header_name", header_name)

    @property
    @pulumi.getter(name="headerName")
    def header_name(self) -> pulumi.Input[str]:
        """
        Client IP header name
        """
        return pulumi.get(self, "header_name")

    @header_name.setter
    def header_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "header_name", value)


@pulumi.input_type
class _RumIpDeterminationState:
    def __init__(__self__, *,
                 header_name: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering RumIpDetermination resources.
        :param pulumi.Input[str] header_name: Client IP header name
        """
        if header_name is not None:
            pulumi.set(__self__, "header_name", header_name)

    @property
    @pulumi.getter(name="headerName")
    def header_name(self) -> Optional[pulumi.Input[str]]:
        """
        Client IP header name
        """
        return pulumi.get(self, "header_name")

    @header_name.setter
    def header_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "header_name", value)


class RumIpDetermination(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 header_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Create a RumIpDetermination resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] header_name: Client IP header name
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: RumIpDeterminationArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Create a RumIpDetermination resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param RumIpDeterminationArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(RumIpDeterminationArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 header_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = RumIpDeterminationArgs.__new__(RumIpDeterminationArgs)

            if header_name is None and not opts.urn:
                raise TypeError("Missing required property 'header_name'")
            __props__.__dict__["header_name"] = header_name
        super(RumIpDetermination, __self__).__init__(
            'dynatrace:index/rumIpDetermination:RumIpDetermination',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            header_name: Optional[pulumi.Input[str]] = None) -> 'RumIpDetermination':
        """
        Get an existing RumIpDetermination resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] header_name: Client IP header name
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _RumIpDeterminationState.__new__(_RumIpDeterminationState)

        __props__.__dict__["header_name"] = header_name
        return RumIpDetermination(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="headerName")
    def header_name(self) -> pulumi.Output[str]:
        """
        Client IP header name
        """
        return pulumi.get(self, "header_name")


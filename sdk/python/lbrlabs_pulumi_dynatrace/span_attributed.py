# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['SpanAttributedArgs', 'SpanAttributed']

@pulumi.input_type
class SpanAttributedArgs:
    def __init__(__self__, *,
                 key: pulumi.Input[str],
                 masking: pulumi.Input[str],
                 persistent: Optional[pulumi.Input[bool]] = None):
        """
        The set of arguments for constructing a SpanAttributed resource.
        :param pulumi.Input[str] key: the key of the attribute to capture
        :param pulumi.Input[str] masking: granular control over the visibility of attribute values
        :param pulumi.Input[bool] persistent: Prevents the Span Attribute from getting deleted when running `terraform destroy` - to be used for Span Attributes that
               are defined by default on every Dynatrace environment.
        """
        pulumi.set(__self__, "key", key)
        pulumi.set(__self__, "masking", masking)
        if persistent is not None:
            pulumi.set(__self__, "persistent", persistent)

    @property
    @pulumi.getter
    def key(self) -> pulumi.Input[str]:
        """
        the key of the attribute to capture
        """
        return pulumi.get(self, "key")

    @key.setter
    def key(self, value: pulumi.Input[str]):
        pulumi.set(self, "key", value)

    @property
    @pulumi.getter
    def masking(self) -> pulumi.Input[str]:
        """
        granular control over the visibility of attribute values
        """
        return pulumi.get(self, "masking")

    @masking.setter
    def masking(self, value: pulumi.Input[str]):
        pulumi.set(self, "masking", value)

    @property
    @pulumi.getter
    def persistent(self) -> Optional[pulumi.Input[bool]]:
        """
        Prevents the Span Attribute from getting deleted when running `terraform destroy` - to be used for Span Attributes that
        are defined by default on every Dynatrace environment.
        """
        return pulumi.get(self, "persistent")

    @persistent.setter
    def persistent(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "persistent", value)


@pulumi.input_type
class _SpanAttributedState:
    def __init__(__self__, *,
                 key: Optional[pulumi.Input[str]] = None,
                 masking: Optional[pulumi.Input[str]] = None,
                 persistent: Optional[pulumi.Input[bool]] = None):
        """
        Input properties used for looking up and filtering SpanAttributed resources.
        :param pulumi.Input[str] key: the key of the attribute to capture
        :param pulumi.Input[str] masking: granular control over the visibility of attribute values
        :param pulumi.Input[bool] persistent: Prevents the Span Attribute from getting deleted when running `terraform destroy` - to be used for Span Attributes that
               are defined by default on every Dynatrace environment.
        """
        if key is not None:
            pulumi.set(__self__, "key", key)
        if masking is not None:
            pulumi.set(__self__, "masking", masking)
        if persistent is not None:
            pulumi.set(__self__, "persistent", persistent)

    @property
    @pulumi.getter
    def key(self) -> Optional[pulumi.Input[str]]:
        """
        the key of the attribute to capture
        """
        return pulumi.get(self, "key")

    @key.setter
    def key(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "key", value)

    @property
    @pulumi.getter
    def masking(self) -> Optional[pulumi.Input[str]]:
        """
        granular control over the visibility of attribute values
        """
        return pulumi.get(self, "masking")

    @masking.setter
    def masking(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "masking", value)

    @property
    @pulumi.getter
    def persistent(self) -> Optional[pulumi.Input[bool]]:
        """
        Prevents the Span Attribute from getting deleted when running `terraform destroy` - to be used for Span Attributes that
        are defined by default on every Dynatrace environment.
        """
        return pulumi.get(self, "persistent")

    @persistent.setter
    def persistent(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "persistent", value)


class SpanAttributed(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 key: Optional[pulumi.Input[str]] = None,
                 masking: Optional[pulumi.Input[str]] = None,
                 persistent: Optional[pulumi.Input[bool]] = None,
                 __props__=None):
        """
        Create a SpanAttributed resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] key: the key of the attribute to capture
        :param pulumi.Input[str] masking: granular control over the visibility of attribute values
        :param pulumi.Input[bool] persistent: Prevents the Span Attribute from getting deleted when running `terraform destroy` - to be used for Span Attributes that
               are defined by default on every Dynatrace environment.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: SpanAttributedArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Create a SpanAttributed resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param SpanAttributedArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(SpanAttributedArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 key: Optional[pulumi.Input[str]] = None,
                 masking: Optional[pulumi.Input[str]] = None,
                 persistent: Optional[pulumi.Input[bool]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = SpanAttributedArgs.__new__(SpanAttributedArgs)

            if key is None and not opts.urn:
                raise TypeError("Missing required property 'key'")
            __props__.__dict__["key"] = key
            if masking is None and not opts.urn:
                raise TypeError("Missing required property 'masking'")
            __props__.__dict__["masking"] = masking
            __props__.__dict__["persistent"] = persistent
        super(SpanAttributed, __self__).__init__(
            'dynatrace:index/spanAttributed:SpanAttributed',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            key: Optional[pulumi.Input[str]] = None,
            masking: Optional[pulumi.Input[str]] = None,
            persistent: Optional[pulumi.Input[bool]] = None) -> 'SpanAttributed':
        """
        Get an existing SpanAttributed resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] key: the key of the attribute to capture
        :param pulumi.Input[str] masking: granular control over the visibility of attribute values
        :param pulumi.Input[bool] persistent: Prevents the Span Attribute from getting deleted when running `terraform destroy` - to be used for Span Attributes that
               are defined by default on every Dynatrace environment.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _SpanAttributedState.__new__(_SpanAttributedState)

        __props__.__dict__["key"] = key
        __props__.__dict__["masking"] = masking
        __props__.__dict__["persistent"] = persistent
        return SpanAttributed(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def key(self) -> pulumi.Output[str]:
        """
        the key of the attribute to capture
        """
        return pulumi.get(self, "key")

    @property
    @pulumi.getter
    def masking(self) -> pulumi.Output[str]:
        """
        granular control over the visibility of attribute values
        """
        return pulumi.get(self, "masking")

    @property
    @pulumi.getter
    def persistent(self) -> pulumi.Output[bool]:
        """
        Prevents the Span Attribute from getting deleted when running `terraform destroy` - to be used for Span Attributes that
        are defined by default on every Dynatrace environment.
        """
        return pulumi.get(self, "persistent")


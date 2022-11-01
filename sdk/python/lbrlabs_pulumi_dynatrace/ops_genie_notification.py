# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['OpsGenieNotificationArgs', 'OpsGenieNotification']

@pulumi.input_type
class OpsGenieNotificationArgs:
    def __init__(__self__, *,
                 active: pulumi.Input[bool],
                 domain: pulumi.Input[str],
                 message: pulumi.Input[str],
                 profile: pulumi.Input[str],
                 api_key: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a OpsGenieNotification resource.
        :param pulumi.Input[bool] active: The configuration is enabled (`true`) or disabled (`false`)
        :param pulumi.Input[str] domain: The region domain of the OpsGenie
        :param pulumi.Input[str] message: The content of the message.  You can use the following placeholders:  * `{ProblemID}`: The display number of the reported problem.  * `{ProblemImpact}`: The [impact level](https://www.dynatrace.com/support/help/shortlink/impact-analysis) of the problem. Possible values are `APPLICATION`, `SERVICE`, and `INFRASTRUCTURE`.  * `{ProblemSeverity}`: The [severity level](https://www.dynatrace.com/support/help/shortlink/event-types) of the problem. Possible values are `AVAILABILITY`, `ERROR`, `PERFORMANCE`, `RESOURCE_CONTENTION`, and `CUSTOM_ALERT`.  * `{ProblemTitle}`: A short description of the problem
        :param pulumi.Input[str] profile: The ID of the associated alerting profile
        :param pulumi.Input[str] api_key: The API key to access OpsGenie
        :param pulumi.Input[str] name: The name of the notification configuration
        """
        pulumi.set(__self__, "active", active)
        pulumi.set(__self__, "domain", domain)
        pulumi.set(__self__, "message", message)
        pulumi.set(__self__, "profile", profile)
        if api_key is not None:
            pulumi.set(__self__, "api_key", api_key)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter
    def active(self) -> pulumi.Input[bool]:
        """
        The configuration is enabled (`true`) or disabled (`false`)
        """
        return pulumi.get(self, "active")

    @active.setter
    def active(self, value: pulumi.Input[bool]):
        pulumi.set(self, "active", value)

    @property
    @pulumi.getter
    def domain(self) -> pulumi.Input[str]:
        """
        The region domain of the OpsGenie
        """
        return pulumi.get(self, "domain")

    @domain.setter
    def domain(self, value: pulumi.Input[str]):
        pulumi.set(self, "domain", value)

    @property
    @pulumi.getter
    def message(self) -> pulumi.Input[str]:
        """
        The content of the message.  You can use the following placeholders:  * `{ProblemID}`: The display number of the reported problem.  * `{ProblemImpact}`: The [impact level](https://www.dynatrace.com/support/help/shortlink/impact-analysis) of the problem. Possible values are `APPLICATION`, `SERVICE`, and `INFRASTRUCTURE`.  * `{ProblemSeverity}`: The [severity level](https://www.dynatrace.com/support/help/shortlink/event-types) of the problem. Possible values are `AVAILABILITY`, `ERROR`, `PERFORMANCE`, `RESOURCE_CONTENTION`, and `CUSTOM_ALERT`.  * `{ProblemTitle}`: A short description of the problem
        """
        return pulumi.get(self, "message")

    @message.setter
    def message(self, value: pulumi.Input[str]):
        pulumi.set(self, "message", value)

    @property
    @pulumi.getter
    def profile(self) -> pulumi.Input[str]:
        """
        The ID of the associated alerting profile
        """
        return pulumi.get(self, "profile")

    @profile.setter
    def profile(self, value: pulumi.Input[str]):
        pulumi.set(self, "profile", value)

    @property
    @pulumi.getter(name="apiKey")
    def api_key(self) -> Optional[pulumi.Input[str]]:
        """
        The API key to access OpsGenie
        """
        return pulumi.get(self, "api_key")

    @api_key.setter
    def api_key(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "api_key", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the notification configuration
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)


@pulumi.input_type
class _OpsGenieNotificationState:
    def __init__(__self__, *,
                 active: Optional[pulumi.Input[bool]] = None,
                 api_key: Optional[pulumi.Input[str]] = None,
                 domain: Optional[pulumi.Input[str]] = None,
                 message: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 profile: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering OpsGenieNotification resources.
        :param pulumi.Input[bool] active: The configuration is enabled (`true`) or disabled (`false`)
        :param pulumi.Input[str] api_key: The API key to access OpsGenie
        :param pulumi.Input[str] domain: The region domain of the OpsGenie
        :param pulumi.Input[str] message: The content of the message.  You can use the following placeholders:  * `{ProblemID}`: The display number of the reported problem.  * `{ProblemImpact}`: The [impact level](https://www.dynatrace.com/support/help/shortlink/impact-analysis) of the problem. Possible values are `APPLICATION`, `SERVICE`, and `INFRASTRUCTURE`.  * `{ProblemSeverity}`: The [severity level](https://www.dynatrace.com/support/help/shortlink/event-types) of the problem. Possible values are `AVAILABILITY`, `ERROR`, `PERFORMANCE`, `RESOURCE_CONTENTION`, and `CUSTOM_ALERT`.  * `{ProblemTitle}`: A short description of the problem
        :param pulumi.Input[str] name: The name of the notification configuration
        :param pulumi.Input[str] profile: The ID of the associated alerting profile
        """
        if active is not None:
            pulumi.set(__self__, "active", active)
        if api_key is not None:
            pulumi.set(__self__, "api_key", api_key)
        if domain is not None:
            pulumi.set(__self__, "domain", domain)
        if message is not None:
            pulumi.set(__self__, "message", message)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if profile is not None:
            pulumi.set(__self__, "profile", profile)

    @property
    @pulumi.getter
    def active(self) -> Optional[pulumi.Input[bool]]:
        """
        The configuration is enabled (`true`) or disabled (`false`)
        """
        return pulumi.get(self, "active")

    @active.setter
    def active(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "active", value)

    @property
    @pulumi.getter(name="apiKey")
    def api_key(self) -> Optional[pulumi.Input[str]]:
        """
        The API key to access OpsGenie
        """
        return pulumi.get(self, "api_key")

    @api_key.setter
    def api_key(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "api_key", value)

    @property
    @pulumi.getter
    def domain(self) -> Optional[pulumi.Input[str]]:
        """
        The region domain of the OpsGenie
        """
        return pulumi.get(self, "domain")

    @domain.setter
    def domain(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "domain", value)

    @property
    @pulumi.getter
    def message(self) -> Optional[pulumi.Input[str]]:
        """
        The content of the message.  You can use the following placeholders:  * `{ProblemID}`: The display number of the reported problem.  * `{ProblemImpact}`: The [impact level](https://www.dynatrace.com/support/help/shortlink/impact-analysis) of the problem. Possible values are `APPLICATION`, `SERVICE`, and `INFRASTRUCTURE`.  * `{ProblemSeverity}`: The [severity level](https://www.dynatrace.com/support/help/shortlink/event-types) of the problem. Possible values are `AVAILABILITY`, `ERROR`, `PERFORMANCE`, `RESOURCE_CONTENTION`, and `CUSTOM_ALERT`.  * `{ProblemTitle}`: A short description of the problem
        """
        return pulumi.get(self, "message")

    @message.setter
    def message(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "message", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the notification configuration
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def profile(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the associated alerting profile
        """
        return pulumi.get(self, "profile")

    @profile.setter
    def profile(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "profile", value)


class OpsGenieNotification(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 active: Optional[pulumi.Input[bool]] = None,
                 api_key: Optional[pulumi.Input[str]] = None,
                 domain: Optional[pulumi.Input[str]] = None,
                 message: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 profile: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Create a OpsGenieNotification resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] active: The configuration is enabled (`true`) or disabled (`false`)
        :param pulumi.Input[str] api_key: The API key to access OpsGenie
        :param pulumi.Input[str] domain: The region domain of the OpsGenie
        :param pulumi.Input[str] message: The content of the message.  You can use the following placeholders:  * `{ProblemID}`: The display number of the reported problem.  * `{ProblemImpact}`: The [impact level](https://www.dynatrace.com/support/help/shortlink/impact-analysis) of the problem. Possible values are `APPLICATION`, `SERVICE`, and `INFRASTRUCTURE`.  * `{ProblemSeverity}`: The [severity level](https://www.dynatrace.com/support/help/shortlink/event-types) of the problem. Possible values are `AVAILABILITY`, `ERROR`, `PERFORMANCE`, `RESOURCE_CONTENTION`, and `CUSTOM_ALERT`.  * `{ProblemTitle}`: A short description of the problem
        :param pulumi.Input[str] name: The name of the notification configuration
        :param pulumi.Input[str] profile: The ID of the associated alerting profile
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: OpsGenieNotificationArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Create a OpsGenieNotification resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param OpsGenieNotificationArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(OpsGenieNotificationArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 active: Optional[pulumi.Input[bool]] = None,
                 api_key: Optional[pulumi.Input[str]] = None,
                 domain: Optional[pulumi.Input[str]] = None,
                 message: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 profile: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = OpsGenieNotificationArgs.__new__(OpsGenieNotificationArgs)

            if active is None and not opts.urn:
                raise TypeError("Missing required property 'active'")
            __props__.__dict__["active"] = active
            __props__.__dict__["api_key"] = None if api_key is None else pulumi.Output.secret(api_key)
            if domain is None and not opts.urn:
                raise TypeError("Missing required property 'domain'")
            __props__.__dict__["domain"] = domain
            if message is None and not opts.urn:
                raise TypeError("Missing required property 'message'")
            __props__.__dict__["message"] = message
            __props__.__dict__["name"] = name
            if profile is None and not opts.urn:
                raise TypeError("Missing required property 'profile'")
            __props__.__dict__["profile"] = profile
        secret_opts = pulumi.ResourceOptions(additional_secret_outputs=["apiKey"])
        opts = pulumi.ResourceOptions.merge(opts, secret_opts)
        super(OpsGenieNotification, __self__).__init__(
            'dynatrace:index/opsGenieNotification:OpsGenieNotification',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            active: Optional[pulumi.Input[bool]] = None,
            api_key: Optional[pulumi.Input[str]] = None,
            domain: Optional[pulumi.Input[str]] = None,
            message: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            profile: Optional[pulumi.Input[str]] = None) -> 'OpsGenieNotification':
        """
        Get an existing OpsGenieNotification resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] active: The configuration is enabled (`true`) or disabled (`false`)
        :param pulumi.Input[str] api_key: The API key to access OpsGenie
        :param pulumi.Input[str] domain: The region domain of the OpsGenie
        :param pulumi.Input[str] message: The content of the message.  You can use the following placeholders:  * `{ProblemID}`: The display number of the reported problem.  * `{ProblemImpact}`: The [impact level](https://www.dynatrace.com/support/help/shortlink/impact-analysis) of the problem. Possible values are `APPLICATION`, `SERVICE`, and `INFRASTRUCTURE`.  * `{ProblemSeverity}`: The [severity level](https://www.dynatrace.com/support/help/shortlink/event-types) of the problem. Possible values are `AVAILABILITY`, `ERROR`, `PERFORMANCE`, `RESOURCE_CONTENTION`, and `CUSTOM_ALERT`.  * `{ProblemTitle}`: A short description of the problem
        :param pulumi.Input[str] name: The name of the notification configuration
        :param pulumi.Input[str] profile: The ID of the associated alerting profile
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _OpsGenieNotificationState.__new__(_OpsGenieNotificationState)

        __props__.__dict__["active"] = active
        __props__.__dict__["api_key"] = api_key
        __props__.__dict__["domain"] = domain
        __props__.__dict__["message"] = message
        __props__.__dict__["name"] = name
        __props__.__dict__["profile"] = profile
        return OpsGenieNotification(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def active(self) -> pulumi.Output[bool]:
        """
        The configuration is enabled (`true`) or disabled (`false`)
        """
        return pulumi.get(self, "active")

    @property
    @pulumi.getter(name="apiKey")
    def api_key(self) -> pulumi.Output[Optional[str]]:
        """
        The API key to access OpsGenie
        """
        return pulumi.get(self, "api_key")

    @property
    @pulumi.getter
    def domain(self) -> pulumi.Output[str]:
        """
        The region domain of the OpsGenie
        """
        return pulumi.get(self, "domain")

    @property
    @pulumi.getter
    def message(self) -> pulumi.Output[str]:
        """
        The content of the message.  You can use the following placeholders:  * `{ProblemID}`: The display number of the reported problem.  * `{ProblemImpact}`: The [impact level](https://www.dynatrace.com/support/help/shortlink/impact-analysis) of the problem. Possible values are `APPLICATION`, `SERVICE`, and `INFRASTRUCTURE`.  * `{ProblemSeverity}`: The [severity level](https://www.dynatrace.com/support/help/shortlink/event-types) of the problem. Possible values are `AVAILABILITY`, `ERROR`, `PERFORMANCE`, `RESOURCE_CONTENTION`, and `CUSTOM_ALERT`.  * `{ProblemTitle}`: A short description of the problem
        """
        return pulumi.get(self, "message")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name of the notification configuration
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def profile(self) -> pulumi.Output[str]:
        """
        The ID of the associated alerting profile
        """
        return pulumi.get(self, "profile")

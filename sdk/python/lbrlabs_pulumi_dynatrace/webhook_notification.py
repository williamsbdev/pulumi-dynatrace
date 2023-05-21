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

__all__ = ['WebhookNotificationArgs', 'WebhookNotification']

@pulumi.input_type
class WebhookNotificationArgs:
    def __init__(__self__, *,
                 active: pulumi.Input[bool],
                 payload: pulumi.Input[str],
                 profile: pulumi.Input[str],
                 url: pulumi.Input[str],
                 headers: Optional[pulumi.Input['WebhookNotificationHeadersArgs']] = None,
                 insecure: Optional[pulumi.Input[bool]] = None,
                 legacy_id: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 notify_closed_problems: Optional[pulumi.Input[bool]] = None,
                 notify_event_merges: Optional[pulumi.Input[bool]] = None):
        """
        The set of arguments for constructing a WebhookNotification resource.
        :param pulumi.Input[bool] active: The configuration is enabled (`true`) or disabled (`false`)
        :param pulumi.Input[str] payload: The content of the notification message. You can use the following placeholders:  * `{ImpactedEntities}`: Details about the entities impacted by the problem in form of a JSON array.  * `{ImpactedEntity}`: The entity impacted by the problem or *X* impacted entities.  * `{PID}`: The ID of the reported problem.  * `{ProblemDetailsHTML}`: All problem event details, including root cause, as an HTML-formatted string.  * `{ProblemDetailsJSON}`: All problem event details, including root cause, as a JSON object.  * `{ProblemDetailsMarkdown}`: All problem event details, including root cause, as a [Markdown-formatted](https://www.markdownguide.org/cheat-sheet/) string.  * `{ProblemDetailsText}`: All problem event details, including root cause, as a text-formatted string.  * `{ProblemID}`: The display number of the reported problem.  * `{ProblemImpact}`: The [impact level](https://www.dynatrace.com/support/help/shortlink/impact-analysis) of the problem. Possible values are `APPLICATION`, `SERVICE`, and `INFRASTRUCTURE`.  * `{ProblemSeverity}`: The [severity level](https://www.dynatrace.com/support/help/shortlink/event-types) of the problem. Possible values are `AVAILABILITY`, `ERROR`, `PERFORMANCE`, `RESOURCE_CONTENTION`, and `CUSTOM_ALERT`.  * `{ProblemTitle}`: A short description of the problem.  * `{ProblemURL}`: The URL of the problem within Dynatrace.  * `{State}`: The state of the problem. Possible values are `OPEN` and `RESOLVED`.  * `{Tags}`: The list of tags that are defined for all impacted entities, separated by commas
        :param pulumi.Input[str] profile: The ID of the associated alerting profile
        :param pulumi.Input[str] url: The URL of the WebHook endpoint
        :param pulumi.Input['WebhookNotificationHeadersArgs'] headers: A list of the additional HTTP headers
        :param pulumi.Input[bool] insecure: Accept any, including self-signed and invalid, SSL certificate (`true`) or only trusted (`false`) certificates
        :param pulumi.Input[str] legacy_id: The ID of these settings when referred to from resources requiring the REST API V1 keys
        :param pulumi.Input[str] name: The name of the notification configuration
        :param pulumi.Input[bool] notify_closed_problems: Send email if problem is closed
        :param pulumi.Input[bool] notify_event_merges: Call webhook if new events merge into existing problems
        """
        pulumi.set(__self__, "active", active)
        pulumi.set(__self__, "payload", payload)
        pulumi.set(__self__, "profile", profile)
        pulumi.set(__self__, "url", url)
        if headers is not None:
            pulumi.set(__self__, "headers", headers)
        if insecure is not None:
            pulumi.set(__self__, "insecure", insecure)
        if legacy_id is not None:
            pulumi.set(__self__, "legacy_id", legacy_id)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if notify_closed_problems is not None:
            pulumi.set(__self__, "notify_closed_problems", notify_closed_problems)
        if notify_event_merges is not None:
            pulumi.set(__self__, "notify_event_merges", notify_event_merges)

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
    def payload(self) -> pulumi.Input[str]:
        """
        The content of the notification message. You can use the following placeholders:  * `{ImpactedEntities}`: Details about the entities impacted by the problem in form of a JSON array.  * `{ImpactedEntity}`: The entity impacted by the problem or *X* impacted entities.  * `{PID}`: The ID of the reported problem.  * `{ProblemDetailsHTML}`: All problem event details, including root cause, as an HTML-formatted string.  * `{ProblemDetailsJSON}`: All problem event details, including root cause, as a JSON object.  * `{ProblemDetailsMarkdown}`: All problem event details, including root cause, as a [Markdown-formatted](https://www.markdownguide.org/cheat-sheet/) string.  * `{ProblemDetailsText}`: All problem event details, including root cause, as a text-formatted string.  * `{ProblemID}`: The display number of the reported problem.  * `{ProblemImpact}`: The [impact level](https://www.dynatrace.com/support/help/shortlink/impact-analysis) of the problem. Possible values are `APPLICATION`, `SERVICE`, and `INFRASTRUCTURE`.  * `{ProblemSeverity}`: The [severity level](https://www.dynatrace.com/support/help/shortlink/event-types) of the problem. Possible values are `AVAILABILITY`, `ERROR`, `PERFORMANCE`, `RESOURCE_CONTENTION`, and `CUSTOM_ALERT`.  * `{ProblemTitle}`: A short description of the problem.  * `{ProblemURL}`: The URL of the problem within Dynatrace.  * `{State}`: The state of the problem. Possible values are `OPEN` and `RESOLVED`.  * `{Tags}`: The list of tags that are defined for all impacted entities, separated by commas
        """
        return pulumi.get(self, "payload")

    @payload.setter
    def payload(self, value: pulumi.Input[str]):
        pulumi.set(self, "payload", value)

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
    @pulumi.getter
    def url(self) -> pulumi.Input[str]:
        """
        The URL of the WebHook endpoint
        """
        return pulumi.get(self, "url")

    @url.setter
    def url(self, value: pulumi.Input[str]):
        pulumi.set(self, "url", value)

    @property
    @pulumi.getter
    def headers(self) -> Optional[pulumi.Input['WebhookNotificationHeadersArgs']]:
        """
        A list of the additional HTTP headers
        """
        return pulumi.get(self, "headers")

    @headers.setter
    def headers(self, value: Optional[pulumi.Input['WebhookNotificationHeadersArgs']]):
        pulumi.set(self, "headers", value)

    @property
    @pulumi.getter
    def insecure(self) -> Optional[pulumi.Input[bool]]:
        """
        Accept any, including self-signed and invalid, SSL certificate (`true`) or only trusted (`false`) certificates
        """
        return pulumi.get(self, "insecure")

    @insecure.setter
    def insecure(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "insecure", value)

    @property
    @pulumi.getter(name="legacyId")
    def legacy_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of these settings when referred to from resources requiring the REST API V1 keys
        """
        return pulumi.get(self, "legacy_id")

    @legacy_id.setter
    def legacy_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "legacy_id", value)

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
    @pulumi.getter(name="notifyClosedProblems")
    def notify_closed_problems(self) -> Optional[pulumi.Input[bool]]:
        """
        Send email if problem is closed
        """
        return pulumi.get(self, "notify_closed_problems")

    @notify_closed_problems.setter
    def notify_closed_problems(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "notify_closed_problems", value)

    @property
    @pulumi.getter(name="notifyEventMerges")
    def notify_event_merges(self) -> Optional[pulumi.Input[bool]]:
        """
        Call webhook if new events merge into existing problems
        """
        return pulumi.get(self, "notify_event_merges")

    @notify_event_merges.setter
    def notify_event_merges(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "notify_event_merges", value)


@pulumi.input_type
class _WebhookNotificationState:
    def __init__(__self__, *,
                 active: Optional[pulumi.Input[bool]] = None,
                 headers: Optional[pulumi.Input['WebhookNotificationHeadersArgs']] = None,
                 insecure: Optional[pulumi.Input[bool]] = None,
                 legacy_id: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 notify_closed_problems: Optional[pulumi.Input[bool]] = None,
                 notify_event_merges: Optional[pulumi.Input[bool]] = None,
                 payload: Optional[pulumi.Input[str]] = None,
                 profile: Optional[pulumi.Input[str]] = None,
                 url: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering WebhookNotification resources.
        :param pulumi.Input[bool] active: The configuration is enabled (`true`) or disabled (`false`)
        :param pulumi.Input['WebhookNotificationHeadersArgs'] headers: A list of the additional HTTP headers
        :param pulumi.Input[bool] insecure: Accept any, including self-signed and invalid, SSL certificate (`true`) or only trusted (`false`) certificates
        :param pulumi.Input[str] legacy_id: The ID of these settings when referred to from resources requiring the REST API V1 keys
        :param pulumi.Input[str] name: The name of the notification configuration
        :param pulumi.Input[bool] notify_closed_problems: Send email if problem is closed
        :param pulumi.Input[bool] notify_event_merges: Call webhook if new events merge into existing problems
        :param pulumi.Input[str] payload: The content of the notification message. You can use the following placeholders:  * `{ImpactedEntities}`: Details about the entities impacted by the problem in form of a JSON array.  * `{ImpactedEntity}`: The entity impacted by the problem or *X* impacted entities.  * `{PID}`: The ID of the reported problem.  * `{ProblemDetailsHTML}`: All problem event details, including root cause, as an HTML-formatted string.  * `{ProblemDetailsJSON}`: All problem event details, including root cause, as a JSON object.  * `{ProblemDetailsMarkdown}`: All problem event details, including root cause, as a [Markdown-formatted](https://www.markdownguide.org/cheat-sheet/) string.  * `{ProblemDetailsText}`: All problem event details, including root cause, as a text-formatted string.  * `{ProblemID}`: The display number of the reported problem.  * `{ProblemImpact}`: The [impact level](https://www.dynatrace.com/support/help/shortlink/impact-analysis) of the problem. Possible values are `APPLICATION`, `SERVICE`, and `INFRASTRUCTURE`.  * `{ProblemSeverity}`: The [severity level](https://www.dynatrace.com/support/help/shortlink/event-types) of the problem. Possible values are `AVAILABILITY`, `ERROR`, `PERFORMANCE`, `RESOURCE_CONTENTION`, and `CUSTOM_ALERT`.  * `{ProblemTitle}`: A short description of the problem.  * `{ProblemURL}`: The URL of the problem within Dynatrace.  * `{State}`: The state of the problem. Possible values are `OPEN` and `RESOLVED`.  * `{Tags}`: The list of tags that are defined for all impacted entities, separated by commas
        :param pulumi.Input[str] profile: The ID of the associated alerting profile
        :param pulumi.Input[str] url: The URL of the WebHook endpoint
        """
        if active is not None:
            pulumi.set(__self__, "active", active)
        if headers is not None:
            pulumi.set(__self__, "headers", headers)
        if insecure is not None:
            pulumi.set(__self__, "insecure", insecure)
        if legacy_id is not None:
            pulumi.set(__self__, "legacy_id", legacy_id)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if notify_closed_problems is not None:
            pulumi.set(__self__, "notify_closed_problems", notify_closed_problems)
        if notify_event_merges is not None:
            pulumi.set(__self__, "notify_event_merges", notify_event_merges)
        if payload is not None:
            pulumi.set(__self__, "payload", payload)
        if profile is not None:
            pulumi.set(__self__, "profile", profile)
        if url is not None:
            pulumi.set(__self__, "url", url)

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
    @pulumi.getter
    def headers(self) -> Optional[pulumi.Input['WebhookNotificationHeadersArgs']]:
        """
        A list of the additional HTTP headers
        """
        return pulumi.get(self, "headers")

    @headers.setter
    def headers(self, value: Optional[pulumi.Input['WebhookNotificationHeadersArgs']]):
        pulumi.set(self, "headers", value)

    @property
    @pulumi.getter
    def insecure(self) -> Optional[pulumi.Input[bool]]:
        """
        Accept any, including self-signed and invalid, SSL certificate (`true`) or only trusted (`false`) certificates
        """
        return pulumi.get(self, "insecure")

    @insecure.setter
    def insecure(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "insecure", value)

    @property
    @pulumi.getter(name="legacyId")
    def legacy_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of these settings when referred to from resources requiring the REST API V1 keys
        """
        return pulumi.get(self, "legacy_id")

    @legacy_id.setter
    def legacy_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "legacy_id", value)

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
    @pulumi.getter(name="notifyClosedProblems")
    def notify_closed_problems(self) -> Optional[pulumi.Input[bool]]:
        """
        Send email if problem is closed
        """
        return pulumi.get(self, "notify_closed_problems")

    @notify_closed_problems.setter
    def notify_closed_problems(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "notify_closed_problems", value)

    @property
    @pulumi.getter(name="notifyEventMerges")
    def notify_event_merges(self) -> Optional[pulumi.Input[bool]]:
        """
        Call webhook if new events merge into existing problems
        """
        return pulumi.get(self, "notify_event_merges")

    @notify_event_merges.setter
    def notify_event_merges(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "notify_event_merges", value)

    @property
    @pulumi.getter
    def payload(self) -> Optional[pulumi.Input[str]]:
        """
        The content of the notification message. You can use the following placeholders:  * `{ImpactedEntities}`: Details about the entities impacted by the problem in form of a JSON array.  * `{ImpactedEntity}`: The entity impacted by the problem or *X* impacted entities.  * `{PID}`: The ID of the reported problem.  * `{ProblemDetailsHTML}`: All problem event details, including root cause, as an HTML-formatted string.  * `{ProblemDetailsJSON}`: All problem event details, including root cause, as a JSON object.  * `{ProblemDetailsMarkdown}`: All problem event details, including root cause, as a [Markdown-formatted](https://www.markdownguide.org/cheat-sheet/) string.  * `{ProblemDetailsText}`: All problem event details, including root cause, as a text-formatted string.  * `{ProblemID}`: The display number of the reported problem.  * `{ProblemImpact}`: The [impact level](https://www.dynatrace.com/support/help/shortlink/impact-analysis) of the problem. Possible values are `APPLICATION`, `SERVICE`, and `INFRASTRUCTURE`.  * `{ProblemSeverity}`: The [severity level](https://www.dynatrace.com/support/help/shortlink/event-types) of the problem. Possible values are `AVAILABILITY`, `ERROR`, `PERFORMANCE`, `RESOURCE_CONTENTION`, and `CUSTOM_ALERT`.  * `{ProblemTitle}`: A short description of the problem.  * `{ProblemURL}`: The URL of the problem within Dynatrace.  * `{State}`: The state of the problem. Possible values are `OPEN` and `RESOLVED`.  * `{Tags}`: The list of tags that are defined for all impacted entities, separated by commas
        """
        return pulumi.get(self, "payload")

    @payload.setter
    def payload(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "payload", value)

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

    @property
    @pulumi.getter
    def url(self) -> Optional[pulumi.Input[str]]:
        """
        The URL of the WebHook endpoint
        """
        return pulumi.get(self, "url")

    @url.setter
    def url(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "url", value)


class WebhookNotification(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 active: Optional[pulumi.Input[bool]] = None,
                 headers: Optional[pulumi.Input[pulumi.InputType['WebhookNotificationHeadersArgs']]] = None,
                 insecure: Optional[pulumi.Input[bool]] = None,
                 legacy_id: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 notify_closed_problems: Optional[pulumi.Input[bool]] = None,
                 notify_event_merges: Optional[pulumi.Input[bool]] = None,
                 payload: Optional[pulumi.Input[str]] = None,
                 profile: Optional[pulumi.Input[str]] = None,
                 url: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Create a WebhookNotification resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] active: The configuration is enabled (`true`) or disabled (`false`)
        :param pulumi.Input[pulumi.InputType['WebhookNotificationHeadersArgs']] headers: A list of the additional HTTP headers
        :param pulumi.Input[bool] insecure: Accept any, including self-signed and invalid, SSL certificate (`true`) or only trusted (`false`) certificates
        :param pulumi.Input[str] legacy_id: The ID of these settings when referred to from resources requiring the REST API V1 keys
        :param pulumi.Input[str] name: The name of the notification configuration
        :param pulumi.Input[bool] notify_closed_problems: Send email if problem is closed
        :param pulumi.Input[bool] notify_event_merges: Call webhook if new events merge into existing problems
        :param pulumi.Input[str] payload: The content of the notification message. You can use the following placeholders:  * `{ImpactedEntities}`: Details about the entities impacted by the problem in form of a JSON array.  * `{ImpactedEntity}`: The entity impacted by the problem or *X* impacted entities.  * `{PID}`: The ID of the reported problem.  * `{ProblemDetailsHTML}`: All problem event details, including root cause, as an HTML-formatted string.  * `{ProblemDetailsJSON}`: All problem event details, including root cause, as a JSON object.  * `{ProblemDetailsMarkdown}`: All problem event details, including root cause, as a [Markdown-formatted](https://www.markdownguide.org/cheat-sheet/) string.  * `{ProblemDetailsText}`: All problem event details, including root cause, as a text-formatted string.  * `{ProblemID}`: The display number of the reported problem.  * `{ProblemImpact}`: The [impact level](https://www.dynatrace.com/support/help/shortlink/impact-analysis) of the problem. Possible values are `APPLICATION`, `SERVICE`, and `INFRASTRUCTURE`.  * `{ProblemSeverity}`: The [severity level](https://www.dynatrace.com/support/help/shortlink/event-types) of the problem. Possible values are `AVAILABILITY`, `ERROR`, `PERFORMANCE`, `RESOURCE_CONTENTION`, and `CUSTOM_ALERT`.  * `{ProblemTitle}`: A short description of the problem.  * `{ProblemURL}`: The URL of the problem within Dynatrace.  * `{State}`: The state of the problem. Possible values are `OPEN` and `RESOLVED`.  * `{Tags}`: The list of tags that are defined for all impacted entities, separated by commas
        :param pulumi.Input[str] profile: The ID of the associated alerting profile
        :param pulumi.Input[str] url: The URL of the WebHook endpoint
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: WebhookNotificationArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Create a WebhookNotification resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param WebhookNotificationArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(WebhookNotificationArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 active: Optional[pulumi.Input[bool]] = None,
                 headers: Optional[pulumi.Input[pulumi.InputType['WebhookNotificationHeadersArgs']]] = None,
                 insecure: Optional[pulumi.Input[bool]] = None,
                 legacy_id: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 notify_closed_problems: Optional[pulumi.Input[bool]] = None,
                 notify_event_merges: Optional[pulumi.Input[bool]] = None,
                 payload: Optional[pulumi.Input[str]] = None,
                 profile: Optional[pulumi.Input[str]] = None,
                 url: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = WebhookNotificationArgs.__new__(WebhookNotificationArgs)

            if active is None and not opts.urn:
                raise TypeError("Missing required property 'active'")
            __props__.__dict__["active"] = active
            __props__.__dict__["headers"] = headers
            __props__.__dict__["insecure"] = insecure
            __props__.__dict__["legacy_id"] = legacy_id
            __props__.__dict__["name"] = name
            __props__.__dict__["notify_closed_problems"] = notify_closed_problems
            __props__.__dict__["notify_event_merges"] = notify_event_merges
            if payload is None and not opts.urn:
                raise TypeError("Missing required property 'payload'")
            __props__.__dict__["payload"] = payload
            if profile is None and not opts.urn:
                raise TypeError("Missing required property 'profile'")
            __props__.__dict__["profile"] = profile
            if url is None and not opts.urn:
                raise TypeError("Missing required property 'url'")
            __props__.__dict__["url"] = url
        super(WebhookNotification, __self__).__init__(
            'dynatrace:index/webhookNotification:WebhookNotification',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            active: Optional[pulumi.Input[bool]] = None,
            headers: Optional[pulumi.Input[pulumi.InputType['WebhookNotificationHeadersArgs']]] = None,
            insecure: Optional[pulumi.Input[bool]] = None,
            legacy_id: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            notify_closed_problems: Optional[pulumi.Input[bool]] = None,
            notify_event_merges: Optional[pulumi.Input[bool]] = None,
            payload: Optional[pulumi.Input[str]] = None,
            profile: Optional[pulumi.Input[str]] = None,
            url: Optional[pulumi.Input[str]] = None) -> 'WebhookNotification':
        """
        Get an existing WebhookNotification resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] active: The configuration is enabled (`true`) or disabled (`false`)
        :param pulumi.Input[pulumi.InputType['WebhookNotificationHeadersArgs']] headers: A list of the additional HTTP headers
        :param pulumi.Input[bool] insecure: Accept any, including self-signed and invalid, SSL certificate (`true`) or only trusted (`false`) certificates
        :param pulumi.Input[str] legacy_id: The ID of these settings when referred to from resources requiring the REST API V1 keys
        :param pulumi.Input[str] name: The name of the notification configuration
        :param pulumi.Input[bool] notify_closed_problems: Send email if problem is closed
        :param pulumi.Input[bool] notify_event_merges: Call webhook if new events merge into existing problems
        :param pulumi.Input[str] payload: The content of the notification message. You can use the following placeholders:  * `{ImpactedEntities}`: Details about the entities impacted by the problem in form of a JSON array.  * `{ImpactedEntity}`: The entity impacted by the problem or *X* impacted entities.  * `{PID}`: The ID of the reported problem.  * `{ProblemDetailsHTML}`: All problem event details, including root cause, as an HTML-formatted string.  * `{ProblemDetailsJSON}`: All problem event details, including root cause, as a JSON object.  * `{ProblemDetailsMarkdown}`: All problem event details, including root cause, as a [Markdown-formatted](https://www.markdownguide.org/cheat-sheet/) string.  * `{ProblemDetailsText}`: All problem event details, including root cause, as a text-formatted string.  * `{ProblemID}`: The display number of the reported problem.  * `{ProblemImpact}`: The [impact level](https://www.dynatrace.com/support/help/shortlink/impact-analysis) of the problem. Possible values are `APPLICATION`, `SERVICE`, and `INFRASTRUCTURE`.  * `{ProblemSeverity}`: The [severity level](https://www.dynatrace.com/support/help/shortlink/event-types) of the problem. Possible values are `AVAILABILITY`, `ERROR`, `PERFORMANCE`, `RESOURCE_CONTENTION`, and `CUSTOM_ALERT`.  * `{ProblemTitle}`: A short description of the problem.  * `{ProblemURL}`: The URL of the problem within Dynatrace.  * `{State}`: The state of the problem. Possible values are `OPEN` and `RESOLVED`.  * `{Tags}`: The list of tags that are defined for all impacted entities, separated by commas
        :param pulumi.Input[str] profile: The ID of the associated alerting profile
        :param pulumi.Input[str] url: The URL of the WebHook endpoint
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _WebhookNotificationState.__new__(_WebhookNotificationState)

        __props__.__dict__["active"] = active
        __props__.__dict__["headers"] = headers
        __props__.__dict__["insecure"] = insecure
        __props__.__dict__["legacy_id"] = legacy_id
        __props__.__dict__["name"] = name
        __props__.__dict__["notify_closed_problems"] = notify_closed_problems
        __props__.__dict__["notify_event_merges"] = notify_event_merges
        __props__.__dict__["payload"] = payload
        __props__.__dict__["profile"] = profile
        __props__.__dict__["url"] = url
        return WebhookNotification(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def active(self) -> pulumi.Output[bool]:
        """
        The configuration is enabled (`true`) or disabled (`false`)
        """
        return pulumi.get(self, "active")

    @property
    @pulumi.getter
    def headers(self) -> pulumi.Output[Optional['outputs.WebhookNotificationHeaders']]:
        """
        A list of the additional HTTP headers
        """
        return pulumi.get(self, "headers")

    @property
    @pulumi.getter
    def insecure(self) -> pulumi.Output[Optional[bool]]:
        """
        Accept any, including self-signed and invalid, SSL certificate (`true`) or only trusted (`false`) certificates
        """
        return pulumi.get(self, "insecure")

    @property
    @pulumi.getter(name="legacyId")
    def legacy_id(self) -> pulumi.Output[str]:
        """
        The ID of these settings when referred to from resources requiring the REST API V1 keys
        """
        return pulumi.get(self, "legacy_id")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name of the notification configuration
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="notifyClosedProblems")
    def notify_closed_problems(self) -> pulumi.Output[Optional[bool]]:
        """
        Send email if problem is closed
        """
        return pulumi.get(self, "notify_closed_problems")

    @property
    @pulumi.getter(name="notifyEventMerges")
    def notify_event_merges(self) -> pulumi.Output[Optional[bool]]:
        """
        Call webhook if new events merge into existing problems
        """
        return pulumi.get(self, "notify_event_merges")

    @property
    @pulumi.getter
    def payload(self) -> pulumi.Output[str]:
        """
        The content of the notification message. You can use the following placeholders:  * `{ImpactedEntities}`: Details about the entities impacted by the problem in form of a JSON array.  * `{ImpactedEntity}`: The entity impacted by the problem or *X* impacted entities.  * `{PID}`: The ID of the reported problem.  * `{ProblemDetailsHTML}`: All problem event details, including root cause, as an HTML-formatted string.  * `{ProblemDetailsJSON}`: All problem event details, including root cause, as a JSON object.  * `{ProblemDetailsMarkdown}`: All problem event details, including root cause, as a [Markdown-formatted](https://www.markdownguide.org/cheat-sheet/) string.  * `{ProblemDetailsText}`: All problem event details, including root cause, as a text-formatted string.  * `{ProblemID}`: The display number of the reported problem.  * `{ProblemImpact}`: The [impact level](https://www.dynatrace.com/support/help/shortlink/impact-analysis) of the problem. Possible values are `APPLICATION`, `SERVICE`, and `INFRASTRUCTURE`.  * `{ProblemSeverity}`: The [severity level](https://www.dynatrace.com/support/help/shortlink/event-types) of the problem. Possible values are `AVAILABILITY`, `ERROR`, `PERFORMANCE`, `RESOURCE_CONTENTION`, and `CUSTOM_ALERT`.  * `{ProblemTitle}`: A short description of the problem.  * `{ProblemURL}`: The URL of the problem within Dynatrace.  * `{State}`: The state of the problem. Possible values are `OPEN` and `RESOLVED`.  * `{Tags}`: The list of tags that are defined for all impacted entities, separated by commas
        """
        return pulumi.get(self, "payload")

    @property
    @pulumi.getter
    def profile(self) -> pulumi.Output[str]:
        """
        The ID of the associated alerting profile
        """
        return pulumi.get(self, "profile")

    @property
    @pulumi.getter
    def url(self) -> pulumi.Output[str]:
        """
        The URL of the WebHook endpoint
        """
        return pulumi.get(self, "url")


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

__all__ = ['AlertingArgs', 'Alerting']

@pulumi.input_type
class AlertingArgs:
    def __init__(__self__, *,
                 filters: Optional[pulumi.Input['AlertingFiltersArgs']] = None,
                 legacy_id: Optional[pulumi.Input[str]] = None,
                 management_zone: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 rules: Optional[pulumi.Input['AlertingRulesArgs']] = None):
        """
        The set of arguments for constructing a Alerting resource.
        :param pulumi.Input['AlertingFiltersArgs'] filters: The list of event filters.  For all filters that are *negated* inside of these event filters, that is all `Predefined` as well as `Custom` (Title and/or Description) ones the AND logic applies. For all *non-negated* ones the OR logic applies. Between these two groups, negated and non-negated, the AND logic applies.  If you specify both severity rule and event filter, the AND logic applies
        :param pulumi.Input[str] legacy_id: The ID of this setting when referred to by the Config REST API V1
        :param pulumi.Input[str] management_zone: The ID of the management zone to which the alerting profile applies
        :param pulumi.Input[str] name: The name of the alerting profile, displayed in the UI
        :param pulumi.Input['AlertingRulesArgs'] rules: A list of rules for management zone usage.  Each rule is evaluated independently of all other rules
        """
        if filters is not None:
            pulumi.set(__self__, "filters", filters)
        if legacy_id is not None:
            pulumi.set(__self__, "legacy_id", legacy_id)
        if management_zone is not None:
            pulumi.set(__self__, "management_zone", management_zone)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if rules is not None:
            pulumi.set(__self__, "rules", rules)

    @property
    @pulumi.getter
    def filters(self) -> Optional[pulumi.Input['AlertingFiltersArgs']]:
        """
        The list of event filters.  For all filters that are *negated* inside of these event filters, that is all `Predefined` as well as `Custom` (Title and/or Description) ones the AND logic applies. For all *non-negated* ones the OR logic applies. Between these two groups, negated and non-negated, the AND logic applies.  If you specify both severity rule and event filter, the AND logic applies
        """
        return pulumi.get(self, "filters")

    @filters.setter
    def filters(self, value: Optional[pulumi.Input['AlertingFiltersArgs']]):
        pulumi.set(self, "filters", value)

    @property
    @pulumi.getter(name="legacyId")
    def legacy_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of this setting when referred to by the Config REST API V1
        """
        return pulumi.get(self, "legacy_id")

    @legacy_id.setter
    def legacy_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "legacy_id", value)

    @property
    @pulumi.getter(name="managementZone")
    def management_zone(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the management zone to which the alerting profile applies
        """
        return pulumi.get(self, "management_zone")

    @management_zone.setter
    def management_zone(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "management_zone", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the alerting profile, displayed in the UI
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def rules(self) -> Optional[pulumi.Input['AlertingRulesArgs']]:
        """
        A list of rules for management zone usage.  Each rule is evaluated independently of all other rules
        """
        return pulumi.get(self, "rules")

    @rules.setter
    def rules(self, value: Optional[pulumi.Input['AlertingRulesArgs']]):
        pulumi.set(self, "rules", value)


@pulumi.input_type
class _AlertingState:
    def __init__(__self__, *,
                 filters: Optional[pulumi.Input['AlertingFiltersArgs']] = None,
                 legacy_id: Optional[pulumi.Input[str]] = None,
                 management_zone: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 rules: Optional[pulumi.Input['AlertingRulesArgs']] = None):
        """
        Input properties used for looking up and filtering Alerting resources.
        :param pulumi.Input['AlertingFiltersArgs'] filters: The list of event filters.  For all filters that are *negated* inside of these event filters, that is all `Predefined` as well as `Custom` (Title and/or Description) ones the AND logic applies. For all *non-negated* ones the OR logic applies. Between these two groups, negated and non-negated, the AND logic applies.  If you specify both severity rule and event filter, the AND logic applies
        :param pulumi.Input[str] legacy_id: The ID of this setting when referred to by the Config REST API V1
        :param pulumi.Input[str] management_zone: The ID of the management zone to which the alerting profile applies
        :param pulumi.Input[str] name: The name of the alerting profile, displayed in the UI
        :param pulumi.Input['AlertingRulesArgs'] rules: A list of rules for management zone usage.  Each rule is evaluated independently of all other rules
        """
        if filters is not None:
            pulumi.set(__self__, "filters", filters)
        if legacy_id is not None:
            pulumi.set(__self__, "legacy_id", legacy_id)
        if management_zone is not None:
            pulumi.set(__self__, "management_zone", management_zone)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if rules is not None:
            pulumi.set(__self__, "rules", rules)

    @property
    @pulumi.getter
    def filters(self) -> Optional[pulumi.Input['AlertingFiltersArgs']]:
        """
        The list of event filters.  For all filters that are *negated* inside of these event filters, that is all `Predefined` as well as `Custom` (Title and/or Description) ones the AND logic applies. For all *non-negated* ones the OR logic applies. Between these two groups, negated and non-negated, the AND logic applies.  If you specify both severity rule and event filter, the AND logic applies
        """
        return pulumi.get(self, "filters")

    @filters.setter
    def filters(self, value: Optional[pulumi.Input['AlertingFiltersArgs']]):
        pulumi.set(self, "filters", value)

    @property
    @pulumi.getter(name="legacyId")
    def legacy_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of this setting when referred to by the Config REST API V1
        """
        return pulumi.get(self, "legacy_id")

    @legacy_id.setter
    def legacy_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "legacy_id", value)

    @property
    @pulumi.getter(name="managementZone")
    def management_zone(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the management zone to which the alerting profile applies
        """
        return pulumi.get(self, "management_zone")

    @management_zone.setter
    def management_zone(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "management_zone", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the alerting profile, displayed in the UI
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def rules(self) -> Optional[pulumi.Input['AlertingRulesArgs']]:
        """
        A list of rules for management zone usage.  Each rule is evaluated independently of all other rules
        """
        return pulumi.get(self, "rules")

    @rules.setter
    def rules(self, value: Optional[pulumi.Input['AlertingRulesArgs']]):
        pulumi.set(self, "rules", value)


class Alerting(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 filters: Optional[pulumi.Input[pulumi.InputType['AlertingFiltersArgs']]] = None,
                 legacy_id: Optional[pulumi.Input[str]] = None,
                 management_zone: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 rules: Optional[pulumi.Input[pulumi.InputType['AlertingRulesArgs']]] = None,
                 __props__=None):
        """
        Create a Alerting resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[pulumi.InputType['AlertingFiltersArgs']] filters: The list of event filters.  For all filters that are *negated* inside of these event filters, that is all `Predefined` as well as `Custom` (Title and/or Description) ones the AND logic applies. For all *non-negated* ones the OR logic applies. Between these two groups, negated and non-negated, the AND logic applies.  If you specify both severity rule and event filter, the AND logic applies
        :param pulumi.Input[str] legacy_id: The ID of this setting when referred to by the Config REST API V1
        :param pulumi.Input[str] management_zone: The ID of the management zone to which the alerting profile applies
        :param pulumi.Input[str] name: The name of the alerting profile, displayed in the UI
        :param pulumi.Input[pulumi.InputType['AlertingRulesArgs']] rules: A list of rules for management zone usage.  Each rule is evaluated independently of all other rules
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[AlertingArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Create a Alerting resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param AlertingArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(AlertingArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 filters: Optional[pulumi.Input[pulumi.InputType['AlertingFiltersArgs']]] = None,
                 legacy_id: Optional[pulumi.Input[str]] = None,
                 management_zone: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 rules: Optional[pulumi.Input[pulumi.InputType['AlertingRulesArgs']]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = AlertingArgs.__new__(AlertingArgs)

            __props__.__dict__["filters"] = filters
            __props__.__dict__["legacy_id"] = legacy_id
            __props__.__dict__["management_zone"] = management_zone
            __props__.__dict__["name"] = name
            __props__.__dict__["rules"] = rules
        super(Alerting, __self__).__init__(
            'dynatrace:index/alerting:Alerting',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            filters: Optional[pulumi.Input[pulumi.InputType['AlertingFiltersArgs']]] = None,
            legacy_id: Optional[pulumi.Input[str]] = None,
            management_zone: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            rules: Optional[pulumi.Input[pulumi.InputType['AlertingRulesArgs']]] = None) -> 'Alerting':
        """
        Get an existing Alerting resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[pulumi.InputType['AlertingFiltersArgs']] filters: The list of event filters.  For all filters that are *negated* inside of these event filters, that is all `Predefined` as well as `Custom` (Title and/or Description) ones the AND logic applies. For all *non-negated* ones the OR logic applies. Between these two groups, negated and non-negated, the AND logic applies.  If you specify both severity rule and event filter, the AND logic applies
        :param pulumi.Input[str] legacy_id: The ID of this setting when referred to by the Config REST API V1
        :param pulumi.Input[str] management_zone: The ID of the management zone to which the alerting profile applies
        :param pulumi.Input[str] name: The name of the alerting profile, displayed in the UI
        :param pulumi.Input[pulumi.InputType['AlertingRulesArgs']] rules: A list of rules for management zone usage.  Each rule is evaluated independently of all other rules
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _AlertingState.__new__(_AlertingState)

        __props__.__dict__["filters"] = filters
        __props__.__dict__["legacy_id"] = legacy_id
        __props__.__dict__["management_zone"] = management_zone
        __props__.__dict__["name"] = name
        __props__.__dict__["rules"] = rules
        return Alerting(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def filters(self) -> pulumi.Output[Optional['outputs.AlertingFilters']]:
        """
        The list of event filters.  For all filters that are *negated* inside of these event filters, that is all `Predefined` as well as `Custom` (Title and/or Description) ones the AND logic applies. For all *non-negated* ones the OR logic applies. Between these two groups, negated and non-negated, the AND logic applies.  If you specify both severity rule and event filter, the AND logic applies
        """
        return pulumi.get(self, "filters")

    @property
    @pulumi.getter(name="legacyId")
    def legacy_id(self) -> pulumi.Output[str]:
        """
        The ID of this setting when referred to by the Config REST API V1
        """
        return pulumi.get(self, "legacy_id")

    @property
    @pulumi.getter(name="managementZone")
    def management_zone(self) -> pulumi.Output[Optional[str]]:
        """
        The ID of the management zone to which the alerting profile applies
        """
        return pulumi.get(self, "management_zone")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name of the alerting profile, displayed in the UI
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def rules(self) -> pulumi.Output[Optional['outputs.AlertingRules']]:
        """
        A list of rules for management zone usage.  Each rule is evaluated independently of all other rules
        """
        return pulumi.get(self, "rules")


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

__all__ = ['ManagementZoneArgs', 'ManagementZone']

@pulumi.input_type
class ManagementZoneArgs:
    def __init__(__self__, *,
                 description: Optional[pulumi.Input[str]] = None,
                 dimensional_rules: Optional[pulumi.Input[Sequence[pulumi.Input['ManagementZoneDimensionalRuleArgs']]]] = None,
                 entity_selector_based_rules: Optional[pulumi.Input[Sequence[pulumi.Input['ManagementZoneEntitySelectorBasedRuleArgs']]]] = None,
                 metadata: Optional[pulumi.Input['ManagementZoneMetadataArgs']] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 rules: Optional[pulumi.Input[Sequence[pulumi.Input['ManagementZoneRuleArgs']]]] = None,
                 unknowns: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a ManagementZone resource.
        :param pulumi.Input[str] description: The description of the management zone
        :param pulumi.Input[Sequence[pulumi.Input['ManagementZoneDimensionalRuleArgs']]] dimensional_rules: A list of dimensional data rules for management zone usage. If several rules are specified, the `or` logic applies
        :param pulumi.Input[Sequence[pulumi.Input['ManagementZoneEntitySelectorBasedRuleArgs']]] entity_selector_based_rules: A list of entity-selector based rules for management zone usage. If several rules are specified, the `or` logic applies
        :param pulumi.Input['ManagementZoneMetadataArgs'] metadata: `metadata` exists for backwards compatibility but shouldn't get specified anymore
        :param pulumi.Input[str] name: The name of the management zone
        :param pulumi.Input[Sequence[pulumi.Input['ManagementZoneRuleArgs']]] rules: A list of rules for management zone usage. Each rule is evaluated independently of all other rules
        :param pulumi.Input[str] unknowns: allows for configuring properties that are not explicitly supported by the current version of this provider
        """
        if description is not None:
            pulumi.set(__self__, "description", description)
        if dimensional_rules is not None:
            pulumi.set(__self__, "dimensional_rules", dimensional_rules)
        if entity_selector_based_rules is not None:
            pulumi.set(__self__, "entity_selector_based_rules", entity_selector_based_rules)
        if metadata is not None:
            warnings.warn("""`metadata` exists for backwards compatibility but shouldn't get specified anymore""", DeprecationWarning)
            pulumi.log.warn("""metadata is deprecated: `metadata` exists for backwards compatibility but shouldn't get specified anymore""")
        if metadata is not None:
            pulumi.set(__self__, "metadata", metadata)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if rules is not None:
            pulumi.set(__self__, "rules", rules)
        if unknowns is not None:
            pulumi.set(__self__, "unknowns", unknowns)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        The description of the management zone
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="dimensionalRules")
    def dimensional_rules(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['ManagementZoneDimensionalRuleArgs']]]]:
        """
        A list of dimensional data rules for management zone usage. If several rules are specified, the `or` logic applies
        """
        return pulumi.get(self, "dimensional_rules")

    @dimensional_rules.setter
    def dimensional_rules(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['ManagementZoneDimensionalRuleArgs']]]]):
        pulumi.set(self, "dimensional_rules", value)

    @property
    @pulumi.getter(name="entitySelectorBasedRules")
    def entity_selector_based_rules(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['ManagementZoneEntitySelectorBasedRuleArgs']]]]:
        """
        A list of entity-selector based rules for management zone usage. If several rules are specified, the `or` logic applies
        """
        return pulumi.get(self, "entity_selector_based_rules")

    @entity_selector_based_rules.setter
    def entity_selector_based_rules(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['ManagementZoneEntitySelectorBasedRuleArgs']]]]):
        pulumi.set(self, "entity_selector_based_rules", value)

    @property
    @pulumi.getter
    def metadata(self) -> Optional[pulumi.Input['ManagementZoneMetadataArgs']]:
        """
        `metadata` exists for backwards compatibility but shouldn't get specified anymore
        """
        return pulumi.get(self, "metadata")

    @metadata.setter
    def metadata(self, value: Optional[pulumi.Input['ManagementZoneMetadataArgs']]):
        pulumi.set(self, "metadata", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the management zone
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def rules(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['ManagementZoneRuleArgs']]]]:
        """
        A list of rules for management zone usage. Each rule is evaluated independently of all other rules
        """
        return pulumi.get(self, "rules")

    @rules.setter
    def rules(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['ManagementZoneRuleArgs']]]]):
        pulumi.set(self, "rules", value)

    @property
    @pulumi.getter
    def unknowns(self) -> Optional[pulumi.Input[str]]:
        """
        allows for configuring properties that are not explicitly supported by the current version of this provider
        """
        return pulumi.get(self, "unknowns")

    @unknowns.setter
    def unknowns(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "unknowns", value)


@pulumi.input_type
class _ManagementZoneState:
    def __init__(__self__, *,
                 description: Optional[pulumi.Input[str]] = None,
                 dimensional_rules: Optional[pulumi.Input[Sequence[pulumi.Input['ManagementZoneDimensionalRuleArgs']]]] = None,
                 entity_selector_based_rules: Optional[pulumi.Input[Sequence[pulumi.Input['ManagementZoneEntitySelectorBasedRuleArgs']]]] = None,
                 metadata: Optional[pulumi.Input['ManagementZoneMetadataArgs']] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 rules: Optional[pulumi.Input[Sequence[pulumi.Input['ManagementZoneRuleArgs']]]] = None,
                 unknowns: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering ManagementZone resources.
        :param pulumi.Input[str] description: The description of the management zone
        :param pulumi.Input[Sequence[pulumi.Input['ManagementZoneDimensionalRuleArgs']]] dimensional_rules: A list of dimensional data rules for management zone usage. If several rules are specified, the `or` logic applies
        :param pulumi.Input[Sequence[pulumi.Input['ManagementZoneEntitySelectorBasedRuleArgs']]] entity_selector_based_rules: A list of entity-selector based rules for management zone usage. If several rules are specified, the `or` logic applies
        :param pulumi.Input['ManagementZoneMetadataArgs'] metadata: `metadata` exists for backwards compatibility but shouldn't get specified anymore
        :param pulumi.Input[str] name: The name of the management zone
        :param pulumi.Input[Sequence[pulumi.Input['ManagementZoneRuleArgs']]] rules: A list of rules for management zone usage. Each rule is evaluated independently of all other rules
        :param pulumi.Input[str] unknowns: allows for configuring properties that are not explicitly supported by the current version of this provider
        """
        if description is not None:
            pulumi.set(__self__, "description", description)
        if dimensional_rules is not None:
            pulumi.set(__self__, "dimensional_rules", dimensional_rules)
        if entity_selector_based_rules is not None:
            pulumi.set(__self__, "entity_selector_based_rules", entity_selector_based_rules)
        if metadata is not None:
            warnings.warn("""`metadata` exists for backwards compatibility but shouldn't get specified anymore""", DeprecationWarning)
            pulumi.log.warn("""metadata is deprecated: `metadata` exists for backwards compatibility but shouldn't get specified anymore""")
        if metadata is not None:
            pulumi.set(__self__, "metadata", metadata)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if rules is not None:
            pulumi.set(__self__, "rules", rules)
        if unknowns is not None:
            pulumi.set(__self__, "unknowns", unknowns)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        The description of the management zone
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="dimensionalRules")
    def dimensional_rules(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['ManagementZoneDimensionalRuleArgs']]]]:
        """
        A list of dimensional data rules for management zone usage. If several rules are specified, the `or` logic applies
        """
        return pulumi.get(self, "dimensional_rules")

    @dimensional_rules.setter
    def dimensional_rules(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['ManagementZoneDimensionalRuleArgs']]]]):
        pulumi.set(self, "dimensional_rules", value)

    @property
    @pulumi.getter(name="entitySelectorBasedRules")
    def entity_selector_based_rules(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['ManagementZoneEntitySelectorBasedRuleArgs']]]]:
        """
        A list of entity-selector based rules for management zone usage. If several rules are specified, the `or` logic applies
        """
        return pulumi.get(self, "entity_selector_based_rules")

    @entity_selector_based_rules.setter
    def entity_selector_based_rules(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['ManagementZoneEntitySelectorBasedRuleArgs']]]]):
        pulumi.set(self, "entity_selector_based_rules", value)

    @property
    @pulumi.getter
    def metadata(self) -> Optional[pulumi.Input['ManagementZoneMetadataArgs']]:
        """
        `metadata` exists for backwards compatibility but shouldn't get specified anymore
        """
        return pulumi.get(self, "metadata")

    @metadata.setter
    def metadata(self, value: Optional[pulumi.Input['ManagementZoneMetadataArgs']]):
        pulumi.set(self, "metadata", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the management zone
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def rules(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['ManagementZoneRuleArgs']]]]:
        """
        A list of rules for management zone usage. Each rule is evaluated independently of all other rules
        """
        return pulumi.get(self, "rules")

    @rules.setter
    def rules(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['ManagementZoneRuleArgs']]]]):
        pulumi.set(self, "rules", value)

    @property
    @pulumi.getter
    def unknowns(self) -> Optional[pulumi.Input[str]]:
        """
        allows for configuring properties that are not explicitly supported by the current version of this provider
        """
        return pulumi.get(self, "unknowns")

    @unknowns.setter
    def unknowns(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "unknowns", value)


class ManagementZone(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 dimensional_rules: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ManagementZoneDimensionalRuleArgs']]]]] = None,
                 entity_selector_based_rules: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ManagementZoneEntitySelectorBasedRuleArgs']]]]] = None,
                 metadata: Optional[pulumi.Input[pulumi.InputType['ManagementZoneMetadataArgs']]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 rules: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ManagementZoneRuleArgs']]]]] = None,
                 unknowns: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Create a ManagementZone resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] description: The description of the management zone
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ManagementZoneDimensionalRuleArgs']]]] dimensional_rules: A list of dimensional data rules for management zone usage. If several rules are specified, the `or` logic applies
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ManagementZoneEntitySelectorBasedRuleArgs']]]] entity_selector_based_rules: A list of entity-selector based rules for management zone usage. If several rules are specified, the `or` logic applies
        :param pulumi.Input[pulumi.InputType['ManagementZoneMetadataArgs']] metadata: `metadata` exists for backwards compatibility but shouldn't get specified anymore
        :param pulumi.Input[str] name: The name of the management zone
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ManagementZoneRuleArgs']]]] rules: A list of rules for management zone usage. Each rule is evaluated independently of all other rules
        :param pulumi.Input[str] unknowns: allows for configuring properties that are not explicitly supported by the current version of this provider
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[ManagementZoneArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Create a ManagementZone resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param ManagementZoneArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ManagementZoneArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 dimensional_rules: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ManagementZoneDimensionalRuleArgs']]]]] = None,
                 entity_selector_based_rules: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ManagementZoneEntitySelectorBasedRuleArgs']]]]] = None,
                 metadata: Optional[pulumi.Input[pulumi.InputType['ManagementZoneMetadataArgs']]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 rules: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ManagementZoneRuleArgs']]]]] = None,
                 unknowns: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ManagementZoneArgs.__new__(ManagementZoneArgs)

            __props__.__dict__["description"] = description
            __props__.__dict__["dimensional_rules"] = dimensional_rules
            __props__.__dict__["entity_selector_based_rules"] = entity_selector_based_rules
            if metadata is not None and not opts.urn:
                warnings.warn("""`metadata` exists for backwards compatibility but shouldn't get specified anymore""", DeprecationWarning)
                pulumi.log.warn("""metadata is deprecated: `metadata` exists for backwards compatibility but shouldn't get specified anymore""")
            __props__.__dict__["metadata"] = metadata
            __props__.__dict__["name"] = name
            __props__.__dict__["rules"] = rules
            __props__.__dict__["unknowns"] = unknowns
        super(ManagementZone, __self__).__init__(
            'dynatrace:index/managementZone:ManagementZone',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            description: Optional[pulumi.Input[str]] = None,
            dimensional_rules: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ManagementZoneDimensionalRuleArgs']]]]] = None,
            entity_selector_based_rules: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ManagementZoneEntitySelectorBasedRuleArgs']]]]] = None,
            metadata: Optional[pulumi.Input[pulumi.InputType['ManagementZoneMetadataArgs']]] = None,
            name: Optional[pulumi.Input[str]] = None,
            rules: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ManagementZoneRuleArgs']]]]] = None,
            unknowns: Optional[pulumi.Input[str]] = None) -> 'ManagementZone':
        """
        Get an existing ManagementZone resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] description: The description of the management zone
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ManagementZoneDimensionalRuleArgs']]]] dimensional_rules: A list of dimensional data rules for management zone usage. If several rules are specified, the `or` logic applies
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ManagementZoneEntitySelectorBasedRuleArgs']]]] entity_selector_based_rules: A list of entity-selector based rules for management zone usage. If several rules are specified, the `or` logic applies
        :param pulumi.Input[pulumi.InputType['ManagementZoneMetadataArgs']] metadata: `metadata` exists for backwards compatibility but shouldn't get specified anymore
        :param pulumi.Input[str] name: The name of the management zone
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ManagementZoneRuleArgs']]]] rules: A list of rules for management zone usage. Each rule is evaluated independently of all other rules
        :param pulumi.Input[str] unknowns: allows for configuring properties that are not explicitly supported by the current version of this provider
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ManagementZoneState.__new__(_ManagementZoneState)

        __props__.__dict__["description"] = description
        __props__.__dict__["dimensional_rules"] = dimensional_rules
        __props__.__dict__["entity_selector_based_rules"] = entity_selector_based_rules
        __props__.__dict__["metadata"] = metadata
        __props__.__dict__["name"] = name
        __props__.__dict__["rules"] = rules
        __props__.__dict__["unknowns"] = unknowns
        return ManagementZone(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        The description of the management zone
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="dimensionalRules")
    def dimensional_rules(self) -> pulumi.Output[Optional[Sequence['outputs.ManagementZoneDimensionalRule']]]:
        """
        A list of dimensional data rules for management zone usage. If several rules are specified, the `or` logic applies
        """
        return pulumi.get(self, "dimensional_rules")

    @property
    @pulumi.getter(name="entitySelectorBasedRules")
    def entity_selector_based_rules(self) -> pulumi.Output[Optional[Sequence['outputs.ManagementZoneEntitySelectorBasedRule']]]:
        """
        A list of entity-selector based rules for management zone usage. If several rules are specified, the `or` logic applies
        """
        return pulumi.get(self, "entity_selector_based_rules")

    @property
    @pulumi.getter
    def metadata(self) -> pulumi.Output[Optional['outputs.ManagementZoneMetadata']]:
        """
        `metadata` exists for backwards compatibility but shouldn't get specified anymore
        """
        return pulumi.get(self, "metadata")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name of the management zone
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def rules(self) -> pulumi.Output[Optional[Sequence['outputs.ManagementZoneRule']]]:
        """
        A list of rules for management zone usage. Each rule is evaluated independently of all other rules
        """
        return pulumi.get(self, "rules")

    @property
    @pulumi.getter
    def unknowns(self) -> pulumi.Output[Optional[str]]:
        """
        allows for configuring properties that are not explicitly supported by the current version of this provider
        """
        return pulumi.get(self, "unknowns")

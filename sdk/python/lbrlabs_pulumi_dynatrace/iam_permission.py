# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['IamPermissionArgs', 'IamPermission']

@pulumi.input_type
class IamPermissionArgs:
    def __init__(__self__, *,
                 group: pulumi.Input[str],
                 account: Optional[pulumi.Input[str]] = None,
                 environment: Optional[pulumi.Input[str]] = None,
                 management_zone: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a IamPermission resource.
        :param pulumi.Input[str] group: The ID of the group this permission is valid for
        :param pulumi.Input[str] account: The UUID of the account this permission is valid for
        :param pulumi.Input[str] environment: The environment this permission is valid (`https://<environmentid>.live.dynatrace.com`). Also required in when trying to specify a management zone permission.
        :param pulumi.Input[str] management_zone: The management zone this permission is valid for. You need to use the attribute `legacy_id` when referring to a resource `ManagementZoneV2` or a data source `ManagementZone`. The attribute `environment` is required to get specified also in order to identify the management zone uniquely.
        :param pulumi.Input[str] name: Possible values: `account-company-info`, `account-user-management`, `account-viewer`, `tenant-viewer`, `tenant-manage-settings`, `tenant-agent-install`, `tenant-logviewer`, `tenant-view-sensitive-request-data`, `tenant-configure-request-capture-data`, `tenant-replay-sessions-with-masking`, `tenant-replay-sessions-without-masking`, `tenant-manage-security-problems`, `tenant-manage-support-tickets`
        """
        pulumi.set(__self__, "group", group)
        if account is not None:
            pulumi.set(__self__, "account", account)
        if environment is not None:
            pulumi.set(__self__, "environment", environment)
        if management_zone is not None:
            pulumi.set(__self__, "management_zone", management_zone)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter
    def group(self) -> pulumi.Input[str]:
        """
        The ID of the group this permission is valid for
        """
        return pulumi.get(self, "group")

    @group.setter
    def group(self, value: pulumi.Input[str]):
        pulumi.set(self, "group", value)

    @property
    @pulumi.getter
    def account(self) -> Optional[pulumi.Input[str]]:
        """
        The UUID of the account this permission is valid for
        """
        return pulumi.get(self, "account")

    @account.setter
    def account(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "account", value)

    @property
    @pulumi.getter
    def environment(self) -> Optional[pulumi.Input[str]]:
        """
        The environment this permission is valid (`https://<environmentid>.live.dynatrace.com`). Also required in when trying to specify a management zone permission.
        """
        return pulumi.get(self, "environment")

    @environment.setter
    def environment(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "environment", value)

    @property
    @pulumi.getter(name="managementZone")
    def management_zone(self) -> Optional[pulumi.Input[str]]:
        """
        The management zone this permission is valid for. You need to use the attribute `legacy_id` when referring to a resource `ManagementZoneV2` or a data source `ManagementZone`. The attribute `environment` is required to get specified also in order to identify the management zone uniquely.
        """
        return pulumi.get(self, "management_zone")

    @management_zone.setter
    def management_zone(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "management_zone", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Possible values: `account-company-info`, `account-user-management`, `account-viewer`, `tenant-viewer`, `tenant-manage-settings`, `tenant-agent-install`, `tenant-logviewer`, `tenant-view-sensitive-request-data`, `tenant-configure-request-capture-data`, `tenant-replay-sessions-with-masking`, `tenant-replay-sessions-without-masking`, `tenant-manage-security-problems`, `tenant-manage-support-tickets`
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)


@pulumi.input_type
class _IamPermissionState:
    def __init__(__self__, *,
                 account: Optional[pulumi.Input[str]] = None,
                 environment: Optional[pulumi.Input[str]] = None,
                 group: Optional[pulumi.Input[str]] = None,
                 management_zone: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering IamPermission resources.
        :param pulumi.Input[str] account: The UUID of the account this permission is valid for
        :param pulumi.Input[str] environment: The environment this permission is valid (`https://<environmentid>.live.dynatrace.com`). Also required in when trying to specify a management zone permission.
        :param pulumi.Input[str] group: The ID of the group this permission is valid for
        :param pulumi.Input[str] management_zone: The management zone this permission is valid for. You need to use the attribute `legacy_id` when referring to a resource `ManagementZoneV2` or a data source `ManagementZone`. The attribute `environment` is required to get specified also in order to identify the management zone uniquely.
        :param pulumi.Input[str] name: Possible values: `account-company-info`, `account-user-management`, `account-viewer`, `tenant-viewer`, `tenant-manage-settings`, `tenant-agent-install`, `tenant-logviewer`, `tenant-view-sensitive-request-data`, `tenant-configure-request-capture-data`, `tenant-replay-sessions-with-masking`, `tenant-replay-sessions-without-masking`, `tenant-manage-security-problems`, `tenant-manage-support-tickets`
        """
        if account is not None:
            pulumi.set(__self__, "account", account)
        if environment is not None:
            pulumi.set(__self__, "environment", environment)
        if group is not None:
            pulumi.set(__self__, "group", group)
        if management_zone is not None:
            pulumi.set(__self__, "management_zone", management_zone)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter
    def account(self) -> Optional[pulumi.Input[str]]:
        """
        The UUID of the account this permission is valid for
        """
        return pulumi.get(self, "account")

    @account.setter
    def account(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "account", value)

    @property
    @pulumi.getter
    def environment(self) -> Optional[pulumi.Input[str]]:
        """
        The environment this permission is valid (`https://<environmentid>.live.dynatrace.com`). Also required in when trying to specify a management zone permission.
        """
        return pulumi.get(self, "environment")

    @environment.setter
    def environment(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "environment", value)

    @property
    @pulumi.getter
    def group(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the group this permission is valid for
        """
        return pulumi.get(self, "group")

    @group.setter
    def group(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "group", value)

    @property
    @pulumi.getter(name="managementZone")
    def management_zone(self) -> Optional[pulumi.Input[str]]:
        """
        The management zone this permission is valid for. You need to use the attribute `legacy_id` when referring to a resource `ManagementZoneV2` or a data source `ManagementZone`. The attribute `environment` is required to get specified also in order to identify the management zone uniquely.
        """
        return pulumi.get(self, "management_zone")

    @management_zone.setter
    def management_zone(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "management_zone", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Possible values: `account-company-info`, `account-user-management`, `account-viewer`, `tenant-viewer`, `tenant-manage-settings`, `tenant-agent-install`, `tenant-logviewer`, `tenant-view-sensitive-request-data`, `tenant-configure-request-capture-data`, `tenant-replay-sessions-with-masking`, `tenant-replay-sessions-without-masking`, `tenant-manage-security-problems`, `tenant-manage-support-tickets`
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)


class IamPermission(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account: Optional[pulumi.Input[str]] = None,
                 environment: Optional[pulumi.Input[str]] = None,
                 group: Optional[pulumi.Input[str]] = None,
                 management_zone: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        ## Dynatrace Documentation

        - Dynatrace IAM - https://www.dynatrace.com/support/help/how-to-use-dynatrace/user-management-and-sso/manage-groups-and-permissions

        - Settings API - https://www.dynatrace.com/support/help/how-to-use-dynatrace/user-management-and-sso/manage-groups-and-permissions/iam/iam-getting-started

        ## Prerequisites

        Using this resource requires an OAuth client to be configured within your account settings.
        The scopes of the OAuth Client need to include `account-idm-read`, `account-idm-write`, `account-env-read`, `account-env-write`, `iam-policies-management`, `iam:policies:write`, `iam:policies:read`, `iam:bindings:write`, `iam:bindings:read` and `iam:effective-permissions:read`.

        Finally the provider configuration requires the credentials for that OAuth Client.
        The configuration section of your provider needs to look like this.
        ```python
        import pulumi
        ```

        ## Resource Example Usage

        ```python
        import pulumi
        import lbrlabs_pulumi_dynatrace as dynatrace

        perm_a = dynatrace.IamPermission("permA",
            account="023733f0-86d8-47d1-88bd-7f5cc2e22eb8",
            group="74ec0a82-8010-4f11-8579-b29a5ba865f0")
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] account: The UUID of the account this permission is valid for
        :param pulumi.Input[str] environment: The environment this permission is valid (`https://<environmentid>.live.dynatrace.com`). Also required in when trying to specify a management zone permission.
        :param pulumi.Input[str] group: The ID of the group this permission is valid for
        :param pulumi.Input[str] management_zone: The management zone this permission is valid for. You need to use the attribute `legacy_id` when referring to a resource `ManagementZoneV2` or a data source `ManagementZone`. The attribute `environment` is required to get specified also in order to identify the management zone uniquely.
        :param pulumi.Input[str] name: Possible values: `account-company-info`, `account-user-management`, `account-viewer`, `tenant-viewer`, `tenant-manage-settings`, `tenant-agent-install`, `tenant-logviewer`, `tenant-view-sensitive-request-data`, `tenant-configure-request-capture-data`, `tenant-replay-sessions-with-masking`, `tenant-replay-sessions-without-masking`, `tenant-manage-security-problems`, `tenant-manage-support-tickets`
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: IamPermissionArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Dynatrace Documentation

        - Dynatrace IAM - https://www.dynatrace.com/support/help/how-to-use-dynatrace/user-management-and-sso/manage-groups-and-permissions

        - Settings API - https://www.dynatrace.com/support/help/how-to-use-dynatrace/user-management-and-sso/manage-groups-and-permissions/iam/iam-getting-started

        ## Prerequisites

        Using this resource requires an OAuth client to be configured within your account settings.
        The scopes of the OAuth Client need to include `account-idm-read`, `account-idm-write`, `account-env-read`, `account-env-write`, `iam-policies-management`, `iam:policies:write`, `iam:policies:read`, `iam:bindings:write`, `iam:bindings:read` and `iam:effective-permissions:read`.

        Finally the provider configuration requires the credentials for that OAuth Client.
        The configuration section of your provider needs to look like this.
        ```python
        import pulumi
        ```

        ## Resource Example Usage

        ```python
        import pulumi
        import lbrlabs_pulumi_dynatrace as dynatrace

        perm_a = dynatrace.IamPermission("permA",
            account="023733f0-86d8-47d1-88bd-7f5cc2e22eb8",
            group="74ec0a82-8010-4f11-8579-b29a5ba865f0")
        ```

        :param str resource_name: The name of the resource.
        :param IamPermissionArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(IamPermissionArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account: Optional[pulumi.Input[str]] = None,
                 environment: Optional[pulumi.Input[str]] = None,
                 group: Optional[pulumi.Input[str]] = None,
                 management_zone: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = IamPermissionArgs.__new__(IamPermissionArgs)

            __props__.__dict__["account"] = account
            __props__.__dict__["environment"] = environment
            if group is None and not opts.urn:
                raise TypeError("Missing required property 'group'")
            __props__.__dict__["group"] = group
            __props__.__dict__["management_zone"] = management_zone
            __props__.__dict__["name"] = name
        super(IamPermission, __self__).__init__(
            'dynatrace:index/iamPermission:IamPermission',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            account: Optional[pulumi.Input[str]] = None,
            environment: Optional[pulumi.Input[str]] = None,
            group: Optional[pulumi.Input[str]] = None,
            management_zone: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None) -> 'IamPermission':
        """
        Get an existing IamPermission resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] account: The UUID of the account this permission is valid for
        :param pulumi.Input[str] environment: The environment this permission is valid (`https://<environmentid>.live.dynatrace.com`). Also required in when trying to specify a management zone permission.
        :param pulumi.Input[str] group: The ID of the group this permission is valid for
        :param pulumi.Input[str] management_zone: The management zone this permission is valid for. You need to use the attribute `legacy_id` when referring to a resource `ManagementZoneV2` or a data source `ManagementZone`. The attribute `environment` is required to get specified also in order to identify the management zone uniquely.
        :param pulumi.Input[str] name: Possible values: `account-company-info`, `account-user-management`, `account-viewer`, `tenant-viewer`, `tenant-manage-settings`, `tenant-agent-install`, `tenant-logviewer`, `tenant-view-sensitive-request-data`, `tenant-configure-request-capture-data`, `tenant-replay-sessions-with-masking`, `tenant-replay-sessions-without-masking`, `tenant-manage-security-problems`, `tenant-manage-support-tickets`
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _IamPermissionState.__new__(_IamPermissionState)

        __props__.__dict__["account"] = account
        __props__.__dict__["environment"] = environment
        __props__.__dict__["group"] = group
        __props__.__dict__["management_zone"] = management_zone
        __props__.__dict__["name"] = name
        return IamPermission(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def account(self) -> pulumi.Output[Optional[str]]:
        """
        The UUID of the account this permission is valid for
        """
        return pulumi.get(self, "account")

    @property
    @pulumi.getter
    def environment(self) -> pulumi.Output[Optional[str]]:
        """
        The environment this permission is valid (`https://<environmentid>.live.dynatrace.com`). Also required in when trying to specify a management zone permission.
        """
        return pulumi.get(self, "environment")

    @property
    @pulumi.getter
    def group(self) -> pulumi.Output[str]:
        """
        The ID of the group this permission is valid for
        """
        return pulumi.get(self, "group")

    @property
    @pulumi.getter(name="managementZone")
    def management_zone(self) -> pulumi.Output[Optional[str]]:
        """
        The management zone this permission is valid for. You need to use the attribute `legacy_id` when referring to a resource `ManagementZoneV2` or a data source `ManagementZone`. The attribute `environment` is required to get specified also in order to identify the management zone uniquely.
        """
        return pulumi.get(self, "management_zone")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Possible values: `account-company-info`, `account-user-management`, `account-viewer`, `tenant-viewer`, `tenant-manage-settings`, `tenant-agent-install`, `tenant-logviewer`, `tenant-view-sensitive-request-data`, `tenant-configure-request-capture-data`, `tenant-replay-sessions-with-masking`, `tenant-replay-sessions-without-masking`, `tenant-manage-security-problems`, `tenant-manage-support-tickets`
        """
        return pulumi.get(self, "name")


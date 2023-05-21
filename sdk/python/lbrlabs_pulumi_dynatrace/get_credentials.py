# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = [
    'GetCredentialsResult',
    'AwaitableGetCredentialsResult',
    'get_credentials',
    'get_credentials_output',
]

@pulumi.output_type
class GetCredentialsResult:
    """
    A collection of values returned by getCredentials.
    """
    def __init__(__self__, id=None, name=None, scope=None, type=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if scope and not isinstance(scope, str):
            raise TypeError("Expected argument 'scope' to be a str")
        pulumi.set(__self__, "scope", scope)
        if type and not isinstance(type, str):
            raise TypeError("Expected argument 'type' to be a str")
        pulumi.set(__self__, "type", type)

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def name(self) -> Optional[str]:
        """
        The name of the credential as shown within the Dynatrace WebUI. If not specified all names will match
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def scope(self) -> Optional[str]:
        """
        The scope of the credential. Possible values are `ALL`, `EXTENSION` and `SYNTHETIC`. If not specified all scopes will match.
        """
        return pulumi.get(self, "scope")

    @property
    @pulumi.getter
    def type(self) -> Optional[str]:
        """
        The type of the credential. Possible values are `CERTIFICATE`, `PUBLIC_CERTIFICATE`, `TOKEN`, `USERNAME_PASSWORD` and `UNKNOWN`. If not specified all credential types will match
        """
        return pulumi.get(self, "type")


class AwaitableGetCredentialsResult(GetCredentialsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetCredentialsResult(
            id=self.id,
            name=self.name,
            scope=self.scope,
            type=self.type)


def get_credentials(name: Optional[str] = None,
                    scope: Optional[str] = None,
                    type: Optional[str] = None,
                    opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetCredentialsResult:
    """
    The `Credentials` data source queries for Credentials stored within the Credentials Vault using the properties `name`, `scope` and `type`. At least one of `name`, `scope` or `type` needs to be specified as a non empty value. Combinations of the three properties are also possible.

    ## Example Usage

    ```python
    import pulumi
    import lbrlabs_pulumi_dynatrace as dynatrace
    import pulumi_dynatrace as dynatrace

    creds = dynatrace.get_credentials(name="Office365 Access Token")
    _name_ = dynatrace.HttpMonitor("#name#",
        enabled=True,
        frequency=60,
        locations=["SYNTHETIC_LOCATION-781752216580B1BC"],
        anomaly_detections=[dynatrace.HttpMonitorAnomalyDetectionArgs(
            loading_time_thresholds=[dynatrace.HttpMonitorAnomalyDetectionLoadingTimeThresholdArgs(
                enabled=True,
            )],
            outage_handlings=[dynatrace.HttpMonitorAnomalyDetectionOutageHandlingArgs(
                global_outage=True,
                local_outage=False,
                retry_on_error=False,
            )],
        )],
        script=dynatrace.HttpMonitorScriptArgs(
            requests=[dynatrace.HttpMonitorScriptRequestArgs(
                description="google.com",
                method="GET",
                url="https://www.google.com",
                authentication=dynatrace.HttpMonitorScriptRequestAuthenticationArgs(
                    type="BASIC_AUTHENTICATION",
                    credentials=creds.id,
                ),
                configuration=dynatrace.HttpMonitorScriptRequestConfigurationArgs(
                    accept_any_certificate=True,
                    follow_redirects=True,
                ),
                validation=dynatrace.HttpMonitorScriptRequestValidationArgs(
                    rules=[dynatrace.HttpMonitorScriptRequestValidationRuleArgs(
                        type="httpStatusesList",
                        pass_if_found=False,
                        value=">=400",
                    )],
                ),
            )],
        ))
    ```


    :param str name: The name of the credential as shown within the Dynatrace WebUI. If not specified all names will match
    :param str scope: The scope of the credential. Possible values are `ALL`, `EXTENSION` and `SYNTHETIC`. If not specified all scopes will match.
    :param str type: The type of the credential. Possible values are `CERTIFICATE`, `PUBLIC_CERTIFICATE`, `TOKEN`, `USERNAME_PASSWORD` and `UNKNOWN`. If not specified all credential types will match
    """
    __args__ = dict()
    __args__['name'] = name
    __args__['scope'] = scope
    __args__['type'] = type
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('dynatrace:index/getCredentials:getCredentials', __args__, opts=opts, typ=GetCredentialsResult).value

    return AwaitableGetCredentialsResult(
        id=__ret__.id,
        name=__ret__.name,
        scope=__ret__.scope,
        type=__ret__.type)


@_utilities.lift_output_func(get_credentials)
def get_credentials_output(name: Optional[pulumi.Input[Optional[str]]] = None,
                           scope: Optional[pulumi.Input[Optional[str]]] = None,
                           type: Optional[pulumi.Input[Optional[str]]] = None,
                           opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetCredentialsResult]:
    """
    The `Credentials` data source queries for Credentials stored within the Credentials Vault using the properties `name`, `scope` and `type`. At least one of `name`, `scope` or `type` needs to be specified as a non empty value. Combinations of the three properties are also possible.

    ## Example Usage

    ```python
    import pulumi
    import lbrlabs_pulumi_dynatrace as dynatrace
    import pulumi_dynatrace as dynatrace

    creds = dynatrace.get_credentials(name="Office365 Access Token")
    _name_ = dynatrace.HttpMonitor("#name#",
        enabled=True,
        frequency=60,
        locations=["SYNTHETIC_LOCATION-781752216580B1BC"],
        anomaly_detections=[dynatrace.HttpMonitorAnomalyDetectionArgs(
            loading_time_thresholds=[dynatrace.HttpMonitorAnomalyDetectionLoadingTimeThresholdArgs(
                enabled=True,
            )],
            outage_handlings=[dynatrace.HttpMonitorAnomalyDetectionOutageHandlingArgs(
                global_outage=True,
                local_outage=False,
                retry_on_error=False,
            )],
        )],
        script=dynatrace.HttpMonitorScriptArgs(
            requests=[dynatrace.HttpMonitorScriptRequestArgs(
                description="google.com",
                method="GET",
                url="https://www.google.com",
                authentication=dynatrace.HttpMonitorScriptRequestAuthenticationArgs(
                    type="BASIC_AUTHENTICATION",
                    credentials=creds.id,
                ),
                configuration=dynatrace.HttpMonitorScriptRequestConfigurationArgs(
                    accept_any_certificate=True,
                    follow_redirects=True,
                ),
                validation=dynatrace.HttpMonitorScriptRequestValidationArgs(
                    rules=[dynatrace.HttpMonitorScriptRequestValidationRuleArgs(
                        type="httpStatusesList",
                        pass_if_found=False,
                        value=">=400",
                    )],
                ),
            )],
        ))
    ```


    :param str name: The name of the credential as shown within the Dynatrace WebUI. If not specified all names will match
    :param str scope: The scope of the credential. Possible values are `ALL`, `EXTENSION` and `SYNTHETIC`. If not specified all scopes will match.
    :param str type: The type of the credential. Possible values are `CERTIFICATE`, `PUBLIC_CERTIFICATE`, `TOKEN`, `USERNAME_PASSWORD` and `UNKNOWN`. If not specified all credential types will match
    """
    ...

// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Lbrlabs.PulumiPackage.Dynatrace.Inputs
{

    public sealed class WebApplicationMonitoringSettingsIpAddressRestrictionSettingsArgs : global::Pulumi.ResourceArgs
    {
        [Input("mode", required: true)]
        public Input<string> Mode { get; set; } = null!;

        [Input("restrictions")]
        public Input<Inputs.WebApplicationMonitoringSettingsIpAddressRestrictionSettingsRestrictionsArgs>? Restrictions { get; set; }

        public WebApplicationMonitoringSettingsIpAddressRestrictionSettingsArgs()
        {
        }
        public static new WebApplicationMonitoringSettingsIpAddressRestrictionSettingsArgs Empty => new WebApplicationMonitoringSettingsIpAddressRestrictionSettingsArgs();
    }
}
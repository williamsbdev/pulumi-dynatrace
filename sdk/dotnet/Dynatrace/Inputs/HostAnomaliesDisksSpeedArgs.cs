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

    public sealed class HostAnomaliesDisksSpeedArgs : global::Pulumi.ResourceArgs
    {
        [Input("enabled", required: true)]
        public Input<bool> Enabled { get; set; } = null!;

        [Input("thresholds")]
        public Input<Inputs.HostAnomaliesDisksSpeedThresholdsArgs>? Thresholds { get; set; }

        public HostAnomaliesDisksSpeedArgs()
        {
        }
        public static new HostAnomaliesDisksSpeedArgs Empty => new HostAnomaliesDisksSpeedArgs();
    }
}
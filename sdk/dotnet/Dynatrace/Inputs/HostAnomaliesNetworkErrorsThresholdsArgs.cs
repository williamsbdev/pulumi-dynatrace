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

    public sealed class HostAnomaliesNetworkErrorsThresholdsArgs : global::Pulumi.ResourceArgs
    {
        [Input("errorsPercentage", required: true)]
        public Input<int> ErrorsPercentage { get; set; } = null!;

        [Input("totalPacketsRate", required: true)]
        public Input<int> TotalPacketsRate { get; set; } = null!;

        public HostAnomaliesNetworkErrorsThresholdsArgs()
        {
        }
        public static new HostAnomaliesNetworkErrorsThresholdsArgs Empty => new HostAnomaliesNetworkErrorsThresholdsArgs();
    }
}
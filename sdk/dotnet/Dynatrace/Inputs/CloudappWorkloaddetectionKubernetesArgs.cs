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

    public sealed class CloudappWorkloaddetectionKubernetesArgs : global::Pulumi.ResourceArgs
    {
        [Input("enabled", required: true)]
        public Input<bool> Enabled { get; set; } = null!;

        [Input("filters")]
        public Input<Inputs.CloudappWorkloaddetectionKubernetesFiltersArgs>? Filters { get; set; }

        public CloudappWorkloaddetectionKubernetesArgs()
        {
        }
        public static new CloudappWorkloaddetectionKubernetesArgs Empty => new CloudappWorkloaddetectionKubernetesArgs();
    }
}

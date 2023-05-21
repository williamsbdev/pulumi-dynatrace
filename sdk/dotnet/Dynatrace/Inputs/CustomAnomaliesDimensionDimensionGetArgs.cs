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

    public sealed class CustomAnomaliesDimensionDimensionGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("index")]
        public Input<int>? Index { get; set; }

        [Input("key")]
        public Input<string>? Key { get; set; }

        /// <summary>
        /// The name of the metric event displayed in the UI
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        /// <summary>
        /// allows for configuring properties that are not explicitly supported by the current version of this provider
        /// </summary>
        [Input("unknowns")]
        public Input<string>? Unknowns { get; set; }

        public CustomAnomaliesDimensionDimensionGetArgs()
        {
        }
        public static new CustomAnomaliesDimensionDimensionGetArgs Empty => new CustomAnomaliesDimensionDimensionGetArgs();
    }
}

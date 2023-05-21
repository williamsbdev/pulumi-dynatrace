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

    public sealed class ServiceAnomaliesV2LoadDropsArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Detect service load drops
        /// </summary>
        [Input("enabled", required: true)]
        public Input<bool> Enabled { get; set; } = null!;

        /// <summary>
        /// Threshold
        /// </summary>
        [Input("loadDropPercent")]
        public Input<double>? LoadDropPercent { get; set; }

        /// <summary>
        /// Time span
        /// </summary>
        [Input("minutesAbnormalState")]
        public Input<int>? MinutesAbnormalState { get; set; }

        public ServiceAnomaliesV2LoadDropsArgs()
        {
        }
        public static new ServiceAnomaliesV2LoadDropsArgs Empty => new ServiceAnomaliesV2LoadDropsArgs();
    }
}

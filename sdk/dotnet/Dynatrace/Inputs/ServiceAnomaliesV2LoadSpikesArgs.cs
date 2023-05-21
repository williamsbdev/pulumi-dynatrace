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

    public sealed class ServiceAnomaliesV2LoadSpikesArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Detect service load spikes
        /// </summary>
        [Input("enabled", required: true)]
        public Input<bool> Enabled { get; set; } = null!;

        /// <summary>
        /// Threshold
        /// </summary>
        [Input("loadSpikePercent")]
        public Input<double>? LoadSpikePercent { get; set; }

        /// <summary>
        /// Time span
        /// </summary>
        [Input("minutesAbnormalState")]
        public Input<int>? MinutesAbnormalState { get; set; }

        public ServiceAnomaliesV2LoadSpikesArgs()
        {
        }
        public static new ServiceAnomaliesV2LoadSpikesArgs Empty => new ServiceAnomaliesV2LoadSpikesArgs();
    }
}

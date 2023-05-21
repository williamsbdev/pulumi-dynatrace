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

    public sealed class SloV2ErrorBudgetBurnRateGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Burn rate visualization enabled
        /// </summary>
        [Input("burnRateVisualizationEnabled", required: true)]
        public Input<bool> BurnRateVisualizationEnabled { get; set; } = null!;

        /// <summary>
        /// The threshold defines when a burn rate is marked as fast-burning (high-emergency). Burn rates lower than this threshold (and greater than 1) are highlighted as slow-burn (low-emergency).
        /// </summary>
        [Input("fastBurnThreshold")]
        public Input<double>? FastBurnThreshold { get; set; }

        public SloV2ErrorBudgetBurnRateGetArgs()
        {
        }
        public static new SloV2ErrorBudgetBurnRateGetArgs Empty => new SloV2ErrorBudgetBurnRateGetArgs();
    }
}

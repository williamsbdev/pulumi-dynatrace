// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Lbrlabs.PulumiPackage.Dynatrace.Outputs
{

    [OutputType]
    public sealed class WebApplicationSessionReplayConfig
    {
        /// <summary>
        /// (Field has overlap with `dynatrace.WebAppEnablement`) Session replay sampling rating in percent
        /// </summary>
        public readonly int CostControlPercentage;
        /// <summary>
        /// (Field has overlap with `dynatrace.SessionReplayResourceCapture`) A list of URLs to be excluded from CSS resource capturing
        /// </summary>
        public readonly ImmutableArray<string> CssResourceCapturingExclusionRules;
        /// <summary>
        /// (Field has overlap with `dynatrace.SessionReplayResourceCapture`) Capture (`true`) or don't capture (`false`) CSS resources from the session
        /// </summary>
        public readonly bool? EnableCssResourceCapturing;
        /// <summary>
        /// (Field has overlap with `dynatrace.WebAppEnablement`) SessionReplay Enabled/Disabled
        /// </summary>
        public readonly bool? Enabled;

        [OutputConstructor]
        private WebApplicationSessionReplayConfig(
            int costControlPercentage,

            ImmutableArray<string> cssResourceCapturingExclusionRules,

            bool? enableCssResourceCapturing,

            bool? enabled)
        {
            CostControlPercentage = costControlPercentage;
            CssResourceCapturingExclusionRules = cssResourceCapturingExclusionRules;
            EnableCssResourceCapturing = enableCssResourceCapturing;
            Enabled = enabled;
        }
    }
}

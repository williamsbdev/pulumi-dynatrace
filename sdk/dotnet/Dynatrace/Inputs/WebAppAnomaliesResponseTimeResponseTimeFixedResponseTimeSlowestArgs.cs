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

    public sealed class WebAppAnomaliesResponseTimeResponseTimeFixedResponseTimeSlowestArgs : global::Pulumi.ResourceArgs
    {
        [Input("slowestDegradationMilliseconds", required: true)]
        public Input<double> SlowestDegradationMilliseconds { get; set; } = null!;

        public WebAppAnomaliesResponseTimeResponseTimeFixedResponseTimeSlowestArgs()
        {
        }
        public static new WebAppAnomaliesResponseTimeResponseTimeFixedResponseTimeSlowestArgs Empty => new WebAppAnomaliesResponseTimeResponseTimeFixedResponseTimeSlowestArgs();
    }
}

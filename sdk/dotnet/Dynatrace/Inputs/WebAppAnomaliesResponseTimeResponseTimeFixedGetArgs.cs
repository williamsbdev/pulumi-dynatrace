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

    public sealed class WebAppAnomaliesResponseTimeResponseTimeFixedGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("overAlertingProtection", required: true)]
        public Input<Inputs.WebAppAnomaliesResponseTimeResponseTimeFixedOverAlertingProtectionGetArgs> OverAlertingProtection { get; set; } = null!;

        [Input("responseTimeAll", required: true)]
        public Input<Inputs.WebAppAnomaliesResponseTimeResponseTimeFixedResponseTimeAllGetArgs> ResponseTimeAll { get; set; } = null!;

        [Input("responseTimeSlowest", required: true)]
        public Input<Inputs.WebAppAnomaliesResponseTimeResponseTimeFixedResponseTimeSlowestGetArgs> ResponseTimeSlowest { get; set; } = null!;

        [Input("sensitivity", required: true)]
        public Input<string> Sensitivity { get; set; } = null!;

        public WebAppAnomaliesResponseTimeResponseTimeFixedGetArgs()
        {
        }
        public static new WebAppAnomaliesResponseTimeResponseTimeFixedGetArgs Empty => new WebAppAnomaliesResponseTimeResponseTimeFixedGetArgs();
    }
}

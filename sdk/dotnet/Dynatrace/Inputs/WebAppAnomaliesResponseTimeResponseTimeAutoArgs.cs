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

    public sealed class WebAppAnomaliesResponseTimeResponseTimeAutoArgs : global::Pulumi.ResourceArgs
    {
        [Input("overAlertingProtection", required: true)]
        public Input<Inputs.WebAppAnomaliesResponseTimeResponseTimeAutoOverAlertingProtectionArgs> OverAlertingProtection { get; set; } = null!;

        [Input("responseTimeAll", required: true)]
        public Input<Inputs.WebAppAnomaliesResponseTimeResponseTimeAutoResponseTimeAllArgs> ResponseTimeAll { get; set; } = null!;

        [Input("responseTimeSlowest", required: true)]
        public Input<Inputs.WebAppAnomaliesResponseTimeResponseTimeAutoResponseTimeSlowestArgs> ResponseTimeSlowest { get; set; } = null!;

        public WebAppAnomaliesResponseTimeResponseTimeAutoArgs()
        {
        }
        public static new WebAppAnomaliesResponseTimeResponseTimeAutoArgs Empty => new WebAppAnomaliesResponseTimeResponseTimeAutoArgs();
    }
}

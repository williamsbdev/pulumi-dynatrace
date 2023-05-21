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

    public sealed class DatabaseAnomaliesV2ResponseTimeFixedDetectionGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("overAlertingProtection", required: true)]
        public Input<Inputs.DatabaseAnomaliesV2ResponseTimeFixedDetectionOverAlertingProtectionGetArgs> OverAlertingProtection { get; set; } = null!;

        [Input("responseTimeAll", required: true)]
        public Input<Inputs.DatabaseAnomaliesV2ResponseTimeFixedDetectionResponseTimeAllGetArgs> ResponseTimeAll { get; set; } = null!;

        [Input("responseTimeSlowest", required: true)]
        public Input<Inputs.DatabaseAnomaliesV2ResponseTimeFixedDetectionResponseTimeSlowestGetArgs> ResponseTimeSlowest { get; set; } = null!;

        [Input("sensitivity", required: true)]
        public Input<string> Sensitivity { get; set; } = null!;

        public DatabaseAnomaliesV2ResponseTimeFixedDetectionGetArgs()
        {
        }
        public static new DatabaseAnomaliesV2ResponseTimeFixedDetectionGetArgs Empty => new DatabaseAnomaliesV2ResponseTimeFixedDetectionGetArgs();
    }
}

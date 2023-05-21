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

    public sealed class DatabaseAnomaliesV2ResponseTimeAutoDetectionGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("overAlertingProtection", required: true)]
        public Input<Inputs.DatabaseAnomaliesV2ResponseTimeAutoDetectionOverAlertingProtectionGetArgs> OverAlertingProtection { get; set; } = null!;

        [Input("responseTimeAll", required: true)]
        public Input<Inputs.DatabaseAnomaliesV2ResponseTimeAutoDetectionResponseTimeAllGetArgs> ResponseTimeAll { get; set; } = null!;

        [Input("responseTimeSlowest", required: true)]
        public Input<Inputs.DatabaseAnomaliesV2ResponseTimeAutoDetectionResponseTimeSlowestGetArgs> ResponseTimeSlowest { get; set; } = null!;

        public DatabaseAnomaliesV2ResponseTimeAutoDetectionGetArgs()
        {
        }
        public static new DatabaseAnomaliesV2ResponseTimeAutoDetectionGetArgs Empty => new DatabaseAnomaliesV2ResponseTimeAutoDetectionGetArgs();
    }
}

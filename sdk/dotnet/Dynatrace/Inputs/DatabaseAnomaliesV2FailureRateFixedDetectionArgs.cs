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

    public sealed class DatabaseAnomaliesV2FailureRateFixedDetectionArgs : global::Pulumi.ResourceArgs
    {
        [Input("overAlertingProtection", required: true)]
        public Input<Inputs.DatabaseAnomaliesV2FailureRateFixedDetectionOverAlertingProtectionArgs> OverAlertingProtection { get; set; } = null!;

        [Input("sensitivity", required: true)]
        public Input<string> Sensitivity { get; set; } = null!;

        [Input("threshold", required: true)]
        public Input<double> Threshold { get; set; } = null!;

        public DatabaseAnomaliesV2FailureRateFixedDetectionArgs()
        {
        }
        public static new DatabaseAnomaliesV2FailureRateFixedDetectionArgs Empty => new DatabaseAnomaliesV2FailureRateFixedDetectionArgs();
    }
}
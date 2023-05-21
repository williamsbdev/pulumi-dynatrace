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
    public sealed class DatabaseAnomaliesV2FailureRateFixedDetection
    {
        public readonly Outputs.DatabaseAnomaliesV2FailureRateFixedDetectionOverAlertingProtection OverAlertingProtection;
        public readonly string Sensitivity;
        public readonly double Threshold;

        [OutputConstructor]
        private DatabaseAnomaliesV2FailureRateFixedDetection(
            Outputs.DatabaseAnomaliesV2FailureRateFixedDetectionOverAlertingProtection overAlertingProtection,

            string sensitivity,

            double threshold)
        {
            OverAlertingProtection = overAlertingProtection;
            Sensitivity = sensitivity;
            Threshold = threshold;
        }
    }
}

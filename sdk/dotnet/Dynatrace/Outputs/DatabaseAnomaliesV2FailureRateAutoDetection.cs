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
    public sealed class DatabaseAnomaliesV2FailureRateAutoDetection
    {
        public readonly double AbsoluteIncrease;
        public readonly Outputs.DatabaseAnomaliesV2FailureRateAutoDetectionOverAlertingProtection OverAlertingProtection;
        public readonly double RelativeIncrease;

        [OutputConstructor]
        private DatabaseAnomaliesV2FailureRateAutoDetection(
            double absoluteIncrease,

            Outputs.DatabaseAnomaliesV2FailureRateAutoDetectionOverAlertingProtection overAlertingProtection,

            double relativeIncrease)
        {
            AbsoluteIncrease = absoluteIncrease;
            OverAlertingProtection = overAlertingProtection;
            RelativeIncrease = relativeIncrease;
        }
    }
}

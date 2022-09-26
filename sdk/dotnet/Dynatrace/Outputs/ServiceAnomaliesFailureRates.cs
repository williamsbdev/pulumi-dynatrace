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
    public sealed class ServiceAnomaliesFailureRates
    {
        /// <summary>
        /// Parameters of failure rate increase auto-detection. Example: If the expected error rate is 1.5%, and you set an absolute increase of 1%, and a relative increase of 50%, the thresholds will be:  Absolute: 1.5% + **1%** = 2.5%  Relative: 1.5% + 1.5% * **50%** = 2.25%
        /// </summary>
        public readonly Outputs.ServiceAnomaliesFailureRatesAuto? Auto;
        /// <summary>
        /// Fixed thresholds for failure rate increase detection
        /// </summary>
        public readonly Outputs.ServiceAnomaliesFailureRatesThresholds? Thresholds;

        [OutputConstructor]
        private ServiceAnomaliesFailureRates(
            Outputs.ServiceAnomaliesFailureRatesAuto? auto,

            Outputs.ServiceAnomaliesFailureRatesThresholds? thresholds)
        {
            Auto = auto;
            Thresholds = thresholds;
        }
    }
}
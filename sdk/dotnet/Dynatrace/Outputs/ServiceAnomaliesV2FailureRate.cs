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
    public sealed class ServiceAnomaliesV2FailureRate
    {
        /// <summary>
        /// . Alert if the percentage of failing service calls increases by **both** the absolute and relative thresholds:
        /// </summary>
        public readonly Outputs.ServiceAnomaliesV2FailureRateAutoDetection? AutoDetection;
        /// <summary>
        /// Detection mode for increases in failure rate
        /// </summary>
        public readonly string? DetectionMode;
        /// <summary>
        /// Detect increases in failure rate
        /// </summary>
        public readonly bool Enabled;
        /// <summary>
        /// . Alert if a given failure rate is exceeded during any 5-minute-period
        /// </summary>
        public readonly Outputs.ServiceAnomaliesV2FailureRateFixedDetection? FixedDetection;

        [OutputConstructor]
        private ServiceAnomaliesV2FailureRate(
            Outputs.ServiceAnomaliesV2FailureRateAutoDetection? autoDetection,

            string? detectionMode,

            bool enabled,

            Outputs.ServiceAnomaliesV2FailureRateFixedDetection? fixedDetection)
        {
            AutoDetection = autoDetection;
            DetectionMode = detectionMode;
            Enabled = enabled;
            FixedDetection = fixedDetection;
        }
    }
}

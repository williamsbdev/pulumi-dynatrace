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
    public sealed class HostAnomaliesV2HostHighSystemLoadDetection
    {
        public readonly Outputs.HostAnomaliesV2HostHighSystemLoadDetectionCustomThresholds? CustomThresholds;
        public readonly string? DetectionMode;
        public readonly bool Enabled;

        [OutputConstructor]
        private HostAnomaliesV2HostHighSystemLoadDetection(
            Outputs.HostAnomaliesV2HostHighSystemLoadDetectionCustomThresholds? customThresholds,

            string? detectionMode,

            bool enabled)
        {
            CustomThresholds = customThresholds;
            DetectionMode = detectionMode;
            Enabled = enabled;
        }
    }
}

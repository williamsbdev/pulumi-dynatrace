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

    public sealed class AwsAnomaliesEc2CandidateHighCpuDetectionArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Alert if the condition is met in 3 out of 5 samples
        /// </summary>
        [Input("customThresholds")]
        public Input<Inputs.AwsAnomaliesEc2CandidateHighCpuDetectionCustomThresholdsArgs>? CustomThresholds { get; set; }

        /// <summary>
        /// Possible Values: `Auto`, `Custom`
        /// </summary>
        [Input("detectionMode")]
        public Input<string>? DetectionMode { get; set; }

        /// <summary>
        /// This setting is enabled (`true`) or disabled (`false`)
        /// </summary>
        [Input("enabled", required: true)]
        public Input<bool> Enabled { get; set; } = null!;

        public AwsAnomaliesEc2CandidateHighCpuDetectionArgs()
        {
        }
        public static new AwsAnomaliesEc2CandidateHighCpuDetectionArgs Empty => new AwsAnomaliesEc2CandidateHighCpuDetectionArgs();
    }
}
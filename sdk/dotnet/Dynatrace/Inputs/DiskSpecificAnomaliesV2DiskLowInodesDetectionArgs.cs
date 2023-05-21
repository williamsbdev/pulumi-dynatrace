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

    public sealed class DiskSpecificAnomaliesV2DiskLowInodesDetectionArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// no documentation available
        /// </summary>
        [Input("customThresholds")]
        public Input<Inputs.DiskSpecificAnomaliesV2DiskLowInodesDetectionCustomThresholdsArgs>? CustomThresholds { get; set; }

        /// <summary>
        /// Detection mode for low inodes number available
        /// </summary>
        [Input("detectionMode")]
        public Input<string>? DetectionMode { get; set; }

        /// <summary>
        /// Detect low inodes number available
        /// </summary>
        [Input("enabled", required: true)]
        public Input<bool> Enabled { get; set; } = null!;

        public DiskSpecificAnomaliesV2DiskLowInodesDetectionArgs()
        {
        }
        public static new DiskSpecificAnomaliesV2DiskLowInodesDetectionArgs Empty => new DiskSpecificAnomaliesV2DiskLowInodesDetectionArgs();
    }
}

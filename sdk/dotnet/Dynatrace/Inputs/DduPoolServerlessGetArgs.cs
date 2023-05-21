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

    public sealed class DduPoolServerlessGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Is the limit configuration enabled
        /// </summary>
        [Input("enabled", required: true)]
        public Input<bool> Enabled { get; set; } = null!;

        /// <summary>
        /// Type of the limit applied: MONTHLY or ANNUAL
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        /// <summary>
        /// Value of the DDU limit applied for provided timerange
        /// </summary>
        [Input("value")]
        public Input<int>? Value { get; set; }

        public DduPoolServerlessGetArgs()
        {
        }
        public static new DduPoolServerlessGetArgs Empty => new DduPoolServerlessGetArgs();
    }
}

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

    public sealed class LogSensitiveDataMaskingMaskingArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Maximum one capture group is allowed. If none was given, the whole expression will be treated as a capture group.
        /// </summary>
        [Input("expression", required: true)]
        public Input<string> Expression { get; set; } = null!;

        /// <summary>
        /// The string to replace the masked expression with. Irrelevant if `type` is `SHA1`.
        /// </summary>
        [Input("replacement")]
        public Input<string>? Replacement { get; set; }

        /// <summary>
        /// Possible Values: `SHA1`, `STRING`
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public LogSensitiveDataMaskingMaskingArgs()
        {
        }
        public static new LogSensitiveDataMaskingMaskingArgs Empty => new LogSensitiveDataMaskingMaskingArgs();
    }
}

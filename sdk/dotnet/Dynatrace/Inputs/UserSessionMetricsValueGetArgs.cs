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

    public sealed class UserSessionMetricsValueGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Field name
        /// </summary>
        [Input("fieldName")]
        public Input<string>? FieldName { get; set; }

        /// <summary>
        /// Possible Values: `COUNTER`, `FIELD`
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public UserSessionMetricsValueGetArgs()
        {
        }
        public static new UserSessionMetricsValueGetArgs Empty => new UserSessionMetricsValueGetArgs();
    }
}

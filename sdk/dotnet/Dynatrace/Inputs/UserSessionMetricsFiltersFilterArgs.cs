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

    public sealed class UserSessionMetricsFiltersFilterArgs : global::Pulumi.ResourceArgs
    {
        [Input("fieldName", required: true)]
        public Input<string> FieldName { get; set; } = null!;

        [Input("operator", required: true)]
        public Input<string> Operator { get; set; } = null!;

        /// <summary>
        /// Defines the type of value to be extracted from the user session. When using **User session counter**, the number of user sessions is counted (similar to count(*) when using USQL). When using **User session field value**, the value of a user session field is extracted.
        /// </summary>
        [Input("value")]
        public Input<string>? Value { get; set; }

        [Input("valueIns")]
        private InputList<string>? _valueIns;
        public InputList<string> ValueIns
        {
            get => _valueIns ?? (_valueIns = new InputList<string>());
            set => _valueIns = value;
        }

        public UserSessionMetricsFiltersFilterArgs()
        {
        }
        public static new UserSessionMetricsFiltersFilterArgs Empty => new UserSessionMetricsFiltersFilterArgs();
    }
}

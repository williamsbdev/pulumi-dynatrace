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
    public sealed class UserSessionMetricsFiltersFilter
    {
        public readonly string FieldName;
        public readonly string Operator;
        /// <summary>
        /// Defines the type of value to be extracted from the user session. When using **User session counter**, the number of user sessions is counted (similar to count(*) when using USQL). When using **User session field value**, the value of a user session field is extracted.
        /// </summary>
        public readonly string? Value;
        public readonly ImmutableArray<string> ValueIns;

        [OutputConstructor]
        private UserSessionMetricsFiltersFilter(
            string fieldName,

            string @operator,

            string? value,

            ImmutableArray<string> valueIns)
        {
            FieldName = fieldName;
            Operator = @operator;
            Value = value;
            ValueIns = valueIns;
        }
    }
}

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

    public sealed class GenericTypesRulesRuleRequiredDimensionsRequiredDimensionGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("key", required: true)]
        public Input<string> Key { get; set; } = null!;

        [Input("valuePattern")]
        public Input<string>? ValuePattern { get; set; }

        public GenericTypesRulesRuleRequiredDimensionsRequiredDimensionGetArgs()
        {
        }
        public static new GenericTypesRulesRuleRequiredDimensionsRequiredDimensionGetArgs Empty => new GenericTypesRulesRuleRequiredDimensionsRequiredDimensionGetArgs();
    }
}

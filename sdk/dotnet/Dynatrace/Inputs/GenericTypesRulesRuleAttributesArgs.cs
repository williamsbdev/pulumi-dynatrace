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

    public sealed class GenericTypesRulesRuleAttributesArgs : global::Pulumi.ResourceArgs
    {
        [Input("attributes", required: true)]
        private InputList<Inputs.GenericTypesRulesRuleAttributesAttributeArgs>? _attributes;
        public InputList<Inputs.GenericTypesRulesRuleAttributesAttributeArgs> Attributes
        {
            get => _attributes ?? (_attributes = new InputList<Inputs.GenericTypesRulesRuleAttributesAttributeArgs>());
            set => _attributes = value;
        }

        public GenericTypesRulesRuleAttributesArgs()
        {
        }
        public static new GenericTypesRulesRuleAttributesArgs Empty => new GenericTypesRulesRuleAttributesArgs();
    }
}

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

    public sealed class AutotagEntitySelectorBasedRuleGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        [Input("selector")]
        public Input<string>? Selector { get; set; }

        [Input("unknowns")]
        public Input<string>? Unknowns { get; set; }

        [Input("valueFormat")]
        public Input<string>? ValueFormat { get; set; }

        public AutotagEntitySelectorBasedRuleGetArgs()
        {
        }
        public static new AutotagEntitySelectorBasedRuleGetArgs Empty => new AutotagEntitySelectorBasedRuleGetArgs();
    }
}
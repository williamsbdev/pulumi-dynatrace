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

    public sealed class ResourceAttributesKeysRuleArgs : global::Pulumi.ResourceArgs
    {
        [Input("attributeKey", required: true)]
        public Input<string> AttributeKey { get; set; } = null!;

        [Input("enabled", required: true)]
        public Input<bool> Enabled { get; set; } = null!;

        [Input("masking", required: true)]
        public Input<string> Masking { get; set; } = null!;

        public ResourceAttributesKeysRuleArgs()
        {
        }
        public static new ResourceAttributesKeysRuleArgs Empty => new ResourceAttributesKeysRuleArgs();
    }
}

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
    public sealed class ManagementZoneRuleConditionCustomHostMetadataConditionKey
    {
        public readonly string Attribute;
        public readonly Outputs.ManagementZoneRuleConditionCustomHostMetadataConditionKeyDynamicKey DynamicKey;
        public readonly string? Type;
        public readonly string? Unknowns;

        [OutputConstructor]
        private ManagementZoneRuleConditionCustomHostMetadataConditionKey(
            string attribute,

            Outputs.ManagementZoneRuleConditionCustomHostMetadataConditionKeyDynamicKey dynamicKey,

            string? type,

            string? unknowns)
        {
            Attribute = attribute;
            DynamicKey = dynamicKey;
            Type = type;
            Unknowns = unknowns;
        }
    }
}
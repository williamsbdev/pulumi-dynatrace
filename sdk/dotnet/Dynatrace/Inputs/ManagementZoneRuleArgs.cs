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

    public sealed class ManagementZoneRuleArgs : global::Pulumi.ResourceArgs
    {
        [Input("conditions")]
        private InputList<Inputs.ManagementZoneRuleConditionArgs>? _conditions;
        public InputList<Inputs.ManagementZoneRuleConditionArgs> Conditions
        {
            get => _conditions ?? (_conditions = new InputList<Inputs.ManagementZoneRuleConditionArgs>());
            set => _conditions = value;
        }

        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        [Input("propagationTypes")]
        private InputList<string>? _propagationTypes;
        public InputList<string> PropagationTypes
        {
            get => _propagationTypes ?? (_propagationTypes = new InputList<string>());
            set => _propagationTypes = value;
        }

        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        [Input("unknowns")]
        public Input<string>? Unknowns { get; set; }

        public ManagementZoneRuleArgs()
        {
        }
        public static new ManagementZoneRuleArgs Empty => new ManagementZoneRuleArgs();
    }
}
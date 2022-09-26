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

    public sealed class ApplicationErrorRulesCustomErrorsRuleArgs : global::Pulumi.ResourceArgs
    {
        [Input("capture")]
        public Input<bool>? Capture { get; set; }

        [Input("customAlerting")]
        public Input<bool>? CustomAlerting { get; set; }

        [Input("impactApdex")]
        public Input<bool>? ImpactApdex { get; set; }

        [Input("keyMatcher")]
        public Input<string>? KeyMatcher { get; set; }

        [Input("keyPattern")]
        public Input<string>? KeyPattern { get; set; }

        [Input("valueMatcher")]
        public Input<string>? ValueMatcher { get; set; }

        [Input("valuePattern")]
        public Input<string>? ValuePattern { get; set; }

        public ApplicationErrorRulesCustomErrorsRuleArgs()
        {
        }
        public static new ApplicationErrorRulesCustomErrorsRuleArgs Empty => new ApplicationErrorRulesCustomErrorsRuleArgs();
    }
}
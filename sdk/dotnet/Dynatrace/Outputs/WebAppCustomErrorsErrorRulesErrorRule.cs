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
    public sealed class WebAppCustomErrorsErrorRulesErrorRule
    {
        public readonly Outputs.WebAppCustomErrorsErrorRulesErrorRuleCaptureSettings CaptureSettings;
        public readonly string KeyMatcher;
        public readonly string? KeyPattern;
        public readonly string ValueMatcher;
        public readonly string? ValuePattern;

        [OutputConstructor]
        private WebAppCustomErrorsErrorRulesErrorRule(
            Outputs.WebAppCustomErrorsErrorRulesErrorRuleCaptureSettings captureSettings,

            string keyMatcher,

            string? keyPattern,

            string valueMatcher,

            string? valuePattern)
        {
            CaptureSettings = captureSettings;
            KeyMatcher = keyMatcher;
            KeyPattern = keyPattern;
            ValueMatcher = valueMatcher;
            ValuePattern = valuePattern;
        }
    }
}

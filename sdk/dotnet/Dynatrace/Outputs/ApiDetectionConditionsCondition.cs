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
    public sealed class ApiDetectionConditionsCondition
    {
        public readonly string Base;
        public readonly string Matcher;
        public readonly string Pattern;

        [OutputConstructor]
        private ApiDetectionConditionsCondition(
            string @base,

            string matcher,

            string pattern)
        {
            Base = @base;
            Matcher = matcher;
            Pattern = pattern;
        }
    }
}

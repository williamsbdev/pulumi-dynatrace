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
    public sealed class AlertingFiltersFilterPredefined
    {
        public readonly bool? Negate;
        public readonly string Type;

        [OutputConstructor]
        private AlertingFiltersFilterPredefined(
            bool? negate,

            string type)
        {
            Negate = negate;
            Type = type;
        }
    }
}
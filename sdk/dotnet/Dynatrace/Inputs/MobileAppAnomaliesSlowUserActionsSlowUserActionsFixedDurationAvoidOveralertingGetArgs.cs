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

    public sealed class MobileAppAnomaliesSlowUserActionsSlowUserActionsFixedDurationAvoidOveralertingGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("minActionRate", required: true)]
        public Input<int> MinActionRate { get; set; } = null!;

        public MobileAppAnomaliesSlowUserActionsSlowUserActionsFixedDurationAvoidOveralertingGetArgs()
        {
        }
        public static new MobileAppAnomaliesSlowUserActionsSlowUserActionsFixedDurationAvoidOveralertingGetArgs Empty => new MobileAppAnomaliesSlowUserActionsSlowUserActionsFixedDurationAvoidOveralertingGetArgs();
    }
}

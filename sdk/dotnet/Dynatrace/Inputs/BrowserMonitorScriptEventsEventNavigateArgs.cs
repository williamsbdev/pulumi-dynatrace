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

    public sealed class BrowserMonitorScriptEventsEventNavigateArgs : global::Pulumi.ResourceArgs
    {
        [Input("authentication")]
        public Input<Inputs.BrowserMonitorScriptEventsEventNavigateAuthenticationArgs>? Authentication { get; set; }

        [Input("target")]
        public Input<Inputs.BrowserMonitorScriptEventsEventNavigateTargetArgs>? Target { get; set; }

        [Input("url", required: true)]
        public Input<string> Url { get; set; } = null!;

        [Input("validate")]
        public Input<Inputs.BrowserMonitorScriptEventsEventNavigateValidateArgs>? Validate { get; set; }

        [Input("wait")]
        public Input<Inputs.BrowserMonitorScriptEventsEventNavigateWaitArgs>? Wait { get; set; }

        public BrowserMonitorScriptEventsEventNavigateArgs()
        {
        }
        public static new BrowserMonitorScriptEventsEventNavigateArgs Empty => new BrowserMonitorScriptEventsEventNavigateArgs();
    }
}
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

    public sealed class HttpMonitorAnomalyDetectionOutageHandlingGlobalOutagePolicyGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("consecutiveRuns", required: true)]
        public Input<int> ConsecutiveRuns { get; set; } = null!;

        public HttpMonitorAnomalyDetectionOutageHandlingGlobalOutagePolicyGetArgs()
        {
        }
        public static new HttpMonitorAnomalyDetectionOutageHandlingGlobalOutagePolicyGetArgs Empty => new HttpMonitorAnomalyDetectionOutageHandlingGlobalOutagePolicyGetArgs();
    }
}

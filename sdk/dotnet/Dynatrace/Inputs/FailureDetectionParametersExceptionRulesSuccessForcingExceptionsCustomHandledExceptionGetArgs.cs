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

    public sealed class FailureDetectionParametersExceptionRulesSuccessForcingExceptionsCustomHandledExceptionGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("classPattern")]
        public Input<string>? ClassPattern { get; set; }

        [Input("messagePattern")]
        public Input<string>? MessagePattern { get; set; }

        public FailureDetectionParametersExceptionRulesSuccessForcingExceptionsCustomHandledExceptionGetArgs()
        {
        }
        public static new FailureDetectionParametersExceptionRulesSuccessForcingExceptionsCustomHandledExceptionGetArgs Empty => new FailureDetectionParametersExceptionRulesSuccessForcingExceptionsCustomHandledExceptionGetArgs();
    }
}

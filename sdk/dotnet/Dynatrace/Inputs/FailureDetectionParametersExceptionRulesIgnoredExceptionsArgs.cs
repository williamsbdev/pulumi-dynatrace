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

    public sealed class FailureDetectionParametersExceptionRulesIgnoredExceptionsArgs : global::Pulumi.ResourceArgs
    {
        [Input("customHandledExceptions", required: true)]
        private InputList<Inputs.FailureDetectionParametersExceptionRulesIgnoredExceptionsCustomHandledExceptionArgs>? _customHandledExceptions;
        public InputList<Inputs.FailureDetectionParametersExceptionRulesIgnoredExceptionsCustomHandledExceptionArgs> CustomHandledExceptions
        {
            get => _customHandledExceptions ?? (_customHandledExceptions = new InputList<Inputs.FailureDetectionParametersExceptionRulesIgnoredExceptionsCustomHandledExceptionArgs>());
            set => _customHandledExceptions = value;
        }

        public FailureDetectionParametersExceptionRulesIgnoredExceptionsArgs()
        {
        }
        public static new FailureDetectionParametersExceptionRulesIgnoredExceptionsArgs Empty => new FailureDetectionParametersExceptionRulesIgnoredExceptionsArgs();
    }
}

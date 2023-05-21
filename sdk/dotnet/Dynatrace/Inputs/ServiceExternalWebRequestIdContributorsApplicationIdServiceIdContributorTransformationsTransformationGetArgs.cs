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

    public sealed class ServiceExternalWebRequestIdContributorsApplicationIdServiceIdContributorTransformationsTransformationGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("includeHexNumbers")]
        public Input<bool>? IncludeHexNumbers { get; set; }

        [Input("minDigitCount")]
        public Input<int>? MinDigitCount { get; set; }

        [Input("prefix")]
        public Input<string>? Prefix { get; set; }

        [Input("replacementValue")]
        public Input<string>? ReplacementValue { get; set; }

        [Input("segmentCount")]
        public Input<int>? SegmentCount { get; set; }

        [Input("selectIndex")]
        public Input<int>? SelectIndex { get; set; }

        [Input("splitDelimiter")]
        public Input<string>? SplitDelimiter { get; set; }

        [Input("suffix")]
        public Input<string>? Suffix { get; set; }

        [Input("takeFromEnd")]
        public Input<bool>? TakeFromEnd { get; set; }

        [Input("transformationType", required: true)]
        public Input<string> TransformationType { get; set; } = null!;

        public ServiceExternalWebRequestIdContributorsApplicationIdServiceIdContributorTransformationsTransformationGetArgs()
        {
        }
        public static new ServiceExternalWebRequestIdContributorsApplicationIdServiceIdContributorTransformationsTransformationGetArgs Empty => new ServiceExternalWebRequestIdContributorsApplicationIdServiceIdContributorTransformationsTransformationGetArgs();
    }
}

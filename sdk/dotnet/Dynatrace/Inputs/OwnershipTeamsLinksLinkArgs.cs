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

    public sealed class OwnershipTeamsLinksLinkArgs : global::Pulumi.ResourceArgs
    {
        [Input("linkType", required: true)]
        public Input<string> LinkType { get; set; } = null!;

        [Input("url", required: true)]
        public Input<string> Url { get; set; } = null!;

        public OwnershipTeamsLinksLinkArgs()
        {
        }
        public static new OwnershipTeamsLinksLinkArgs Empty => new OwnershipTeamsLinksLinkArgs();
    }
}

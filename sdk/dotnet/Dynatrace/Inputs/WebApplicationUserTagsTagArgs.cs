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

    public sealed class WebApplicationUserTagsTagArgs : global::Pulumi.ResourceArgs
    {
        [Input("cleanupRule")]
        public Input<string>? CleanupRule { get; set; }

        /// <summary>
        /// The ID of this resource.
        /// </summary>
        [Input("id")]
        public Input<int>? Id { get; set; }

        [Input("ignoreCase")]
        public Input<bool>? IgnoreCase { get; set; }

        [Input("metadataId")]
        public Input<int>? MetadataId { get; set; }

        [Input("serverSideRequestAttribute")]
        public Input<string>? ServerSideRequestAttribute { get; set; }

        [Input("uniqueId")]
        public Input<int>? UniqueId { get; set; }

        public WebApplicationUserTagsTagArgs()
        {
        }
        public static new WebApplicationUserTagsTagArgs Empty => new WebApplicationUserTagsTagArgs();
    }
}

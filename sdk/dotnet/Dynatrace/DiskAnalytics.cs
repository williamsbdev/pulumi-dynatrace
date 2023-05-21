// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Lbrlabs.PulumiPackage.Dynatrace
{
    [DynatraceResourceType("dynatrace:index/diskAnalytics:DiskAnalytics")]
    public partial class DiskAnalytics : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The Disk Analytics feature requires an extension to be added to your environment. The Disk Analytics extension consumes custom metrics and [Davis data units](https://www.dynatrace.com/support/help/shortlink/metric-cost-calculation).
        /// </summary>
        [Output("enabled")]
        public Output<bool> Enabled { get; private set; } = null!;

        /// <summary>
        /// The scope of this setting (HOST, HOST_GROUP)
        /// </summary>
        [Output("scope")]
        public Output<string> Scope { get; private set; } = null!;


        /// <summary>
        /// Create a DiskAnalytics resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public DiskAnalytics(string name, DiskAnalyticsArgs args, CustomResourceOptions? options = null)
            : base("dynatrace:index/diskAnalytics:DiskAnalytics", name, args ?? new DiskAnalyticsArgs(), MakeResourceOptions(options, ""))
        {
        }

        private DiskAnalytics(string name, Input<string> id, DiskAnalyticsState? state = null, CustomResourceOptions? options = null)
            : base("dynatrace:index/diskAnalytics:DiskAnalytics", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                PluginDownloadURL = "github://api.github.com/lbrlabs",
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing DiskAnalytics resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static DiskAnalytics Get(string name, Input<string> id, DiskAnalyticsState? state = null, CustomResourceOptions? options = null)
        {
            return new DiskAnalytics(name, id, state, options);
        }
    }

    public sealed class DiskAnalyticsArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Disk Analytics feature requires an extension to be added to your environment. The Disk Analytics extension consumes custom metrics and [Davis data units](https://www.dynatrace.com/support/help/shortlink/metric-cost-calculation).
        /// </summary>
        [Input("enabled", required: true)]
        public Input<bool> Enabled { get; set; } = null!;

        /// <summary>
        /// The scope of this setting (HOST, HOST_GROUP)
        /// </summary>
        [Input("scope", required: true)]
        public Input<string> Scope { get; set; } = null!;

        public DiskAnalyticsArgs()
        {
        }
        public static new DiskAnalyticsArgs Empty => new DiskAnalyticsArgs();
    }

    public sealed class DiskAnalyticsState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Disk Analytics feature requires an extension to be added to your environment. The Disk Analytics extension consumes custom metrics and [Davis data units](https://www.dynatrace.com/support/help/shortlink/metric-cost-calculation).
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// The scope of this setting (HOST, HOST_GROUP)
        /// </summary>
        [Input("scope")]
        public Input<string>? Scope { get; set; }

        public DiskAnalyticsState()
        {
        }
        public static new DiskAnalyticsState Empty => new DiskAnalyticsState();
    }
}

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
    [DynatraceResourceType("dynatrace:index/rumOverloadPrevention:RumOverloadPrevention")]
    public partial class RumOverloadPrevention : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Once this limit is reached, Dynatrace [throttles the number of captured user sessions](https://dt-url.net/fm3v0p7g).
        /// </summary>
        [Output("overloadPreventionLimit")]
        public Output<int> OverloadPreventionLimit { get; private set; } = null!;


        /// <summary>
        /// Create a RumOverloadPrevention resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public RumOverloadPrevention(string name, RumOverloadPreventionArgs args, CustomResourceOptions? options = null)
            : base("dynatrace:index/rumOverloadPrevention:RumOverloadPrevention", name, args ?? new RumOverloadPreventionArgs(), MakeResourceOptions(options, ""))
        {
        }

        private RumOverloadPrevention(string name, Input<string> id, RumOverloadPreventionState? state = null, CustomResourceOptions? options = null)
            : base("dynatrace:index/rumOverloadPrevention:RumOverloadPrevention", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing RumOverloadPrevention resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static RumOverloadPrevention Get(string name, Input<string> id, RumOverloadPreventionState? state = null, CustomResourceOptions? options = null)
        {
            return new RumOverloadPrevention(name, id, state, options);
        }
    }

    public sealed class RumOverloadPreventionArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Once this limit is reached, Dynatrace [throttles the number of captured user sessions](https://dt-url.net/fm3v0p7g).
        /// </summary>
        [Input("overloadPreventionLimit", required: true)]
        public Input<int> OverloadPreventionLimit { get; set; } = null!;

        public RumOverloadPreventionArgs()
        {
        }
        public static new RumOverloadPreventionArgs Empty => new RumOverloadPreventionArgs();
    }

    public sealed class RumOverloadPreventionState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Once this limit is reached, Dynatrace [throttles the number of captured user sessions](https://dt-url.net/fm3v0p7g).
        /// </summary>
        [Input("overloadPreventionLimit")]
        public Input<int>? OverloadPreventionLimit { get; set; }

        public RumOverloadPreventionState()
        {
        }
        public static new RumOverloadPreventionState Empty => new RumOverloadPreventionState();
    }
}

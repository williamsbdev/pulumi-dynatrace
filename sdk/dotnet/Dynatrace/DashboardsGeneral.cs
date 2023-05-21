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
    [DynatraceResourceType("dynatrace:index/dashboardsGeneral:DashboardsGeneral")]
    public partial class DashboardsGeneral : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Configure home dashboard for selected user group. The selected preset dashboard will be loaded as default landing page for this environment.
        /// </summary>
        [Output("defaultDashboardList")]
        public Output<Outputs.DashboardsGeneralDefaultDashboardList?> DefaultDashboardList { get; private set; } = null!;

        /// <summary>
        /// Allow users to grant anonymous access to dashboards. No sign-in will be required to view those dashboards read-only.
        /// </summary>
        [Output("enablePublicSharing")]
        public Output<bool> EnablePublicSharing { get; private set; } = null!;


        /// <summary>
        /// Create a DashboardsGeneral resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public DashboardsGeneral(string name, DashboardsGeneralArgs args, CustomResourceOptions? options = null)
            : base("dynatrace:index/dashboardsGeneral:DashboardsGeneral", name, args ?? new DashboardsGeneralArgs(), MakeResourceOptions(options, ""))
        {
        }

        private DashboardsGeneral(string name, Input<string> id, DashboardsGeneralState? state = null, CustomResourceOptions? options = null)
            : base("dynatrace:index/dashboardsGeneral:DashboardsGeneral", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing DashboardsGeneral resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static DashboardsGeneral Get(string name, Input<string> id, DashboardsGeneralState? state = null, CustomResourceOptions? options = null)
        {
            return new DashboardsGeneral(name, id, state, options);
        }
    }

    public sealed class DashboardsGeneralArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Configure home dashboard for selected user group. The selected preset dashboard will be loaded as default landing page for this environment.
        /// </summary>
        [Input("defaultDashboardList")]
        public Input<Inputs.DashboardsGeneralDefaultDashboardListArgs>? DefaultDashboardList { get; set; }

        /// <summary>
        /// Allow users to grant anonymous access to dashboards. No sign-in will be required to view those dashboards read-only.
        /// </summary>
        [Input("enablePublicSharing", required: true)]
        public Input<bool> EnablePublicSharing { get; set; } = null!;

        public DashboardsGeneralArgs()
        {
        }
        public static new DashboardsGeneralArgs Empty => new DashboardsGeneralArgs();
    }

    public sealed class DashboardsGeneralState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Configure home dashboard for selected user group. The selected preset dashboard will be loaded as default landing page for this environment.
        /// </summary>
        [Input("defaultDashboardList")]
        public Input<Inputs.DashboardsGeneralDefaultDashboardListGetArgs>? DefaultDashboardList { get; set; }

        /// <summary>
        /// Allow users to grant anonymous access to dashboards. No sign-in will be required to view those dashboards read-only.
        /// </summary>
        [Input("enablePublicSharing")]
        public Input<bool>? EnablePublicSharing { get; set; }

        public DashboardsGeneralState()
        {
        }
        public static new DashboardsGeneralState Empty => new DashboardsGeneralState();
    }
}

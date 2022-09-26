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
    public static class GetSyntheticLocations
    {
        public static Task<GetSyntheticLocationsResult> InvokeAsync(GetSyntheticLocationsArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetSyntheticLocationsResult>("dynatrace:index/getSyntheticLocations:getSyntheticLocations", args ?? new GetSyntheticLocationsArgs(), options.WithDefaults());

        public static Output<GetSyntheticLocationsResult> Invoke(GetSyntheticLocationsInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetSyntheticLocationsResult>("dynatrace:index/getSyntheticLocations:getSyntheticLocations", args ?? new GetSyntheticLocationsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetSyntheticLocationsArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The ID of this resource.
        /// </summary>
        [Input("id")]
        public string? Id { get; set; }

        [Input("locations")]
        public Inputs.GetSyntheticLocationsLocationsArgs? Locations { get; set; }

        [Input("name")]
        public string? Name { get; set; }

        public GetSyntheticLocationsArgs()
        {
        }
        public static new GetSyntheticLocationsArgs Empty => new GetSyntheticLocationsArgs();
    }

    public sealed class GetSyntheticLocationsInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The ID of this resource.
        /// </summary>
        [Input("id")]
        public Input<string>? Id { get; set; }

        [Input("locations")]
        public Input<Inputs.GetSyntheticLocationsLocationsInputArgs>? Locations { get; set; }

        [Input("name")]
        public Input<string>? Name { get; set; }

        public GetSyntheticLocationsInvokeArgs()
        {
        }
        public static new GetSyntheticLocationsInvokeArgs Empty => new GetSyntheticLocationsInvokeArgs();
    }


    [OutputType]
    public sealed class GetSyntheticLocationsResult
    {
        /// <summary>
        /// The ID of this resource.
        /// </summary>
        public readonly string? Id;
        public readonly Outputs.GetSyntheticLocationsLocationsResult Locations;
        public readonly string? Name;

        [OutputConstructor]
        private GetSyntheticLocationsResult(
            string? id,

            Outputs.GetSyntheticLocationsLocationsResult locations,

            string? name)
        {
            Id = id;
            Locations = locations;
            Name = name;
        }
    }
}

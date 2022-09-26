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
    public static class GetSyntheticLocation
    {
        public static Task<GetSyntheticLocationResult> InvokeAsync(GetSyntheticLocationArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetSyntheticLocationResult>("dynatrace:index/getSyntheticLocation:getSyntheticLocation", args ?? new GetSyntheticLocationArgs(), options.WithDefaults());

        public static Output<GetSyntheticLocationResult> Invoke(GetSyntheticLocationInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetSyntheticLocationResult>("dynatrace:index/getSyntheticLocation:getSyntheticLocation", args ?? new GetSyntheticLocationInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetSyntheticLocationArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The cloud provider where the location is hosted.
        /// </summary>
        [Input("cloudPlatform")]
        public string? CloudPlatform { get; set; }

        [Input("id")]
        public string? Id { get; set; }

        [Input("ips")]
        private List<string>? _ips;
        public List<string> Ips
        {
            get => _ips ?? (_ips = new List<string>());
            set => _ips = value;
        }

        [Input("name")]
        public string? Name { get; set; }

        [Input("stage")]
        public string? Stage { get; set; }

        [Input("status")]
        public string? Status { get; set; }

        [Input("type")]
        public string? Type { get; set; }

        public GetSyntheticLocationArgs()
        {
        }
        public static new GetSyntheticLocationArgs Empty => new GetSyntheticLocationArgs();
    }

    public sealed class GetSyntheticLocationInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The cloud provider where the location is hosted.
        /// </summary>
        [Input("cloudPlatform")]
        public Input<string>? CloudPlatform { get; set; }

        [Input("id")]
        public Input<string>? Id { get; set; }

        [Input("ips")]
        private InputList<string>? _ips;
        public InputList<string> Ips
        {
            get => _ips ?? (_ips = new InputList<string>());
            set => _ips = value;
        }

        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("stage")]
        public Input<string>? Stage { get; set; }

        [Input("status")]
        public Input<string>? Status { get; set; }

        [Input("type")]
        public Input<string>? Type { get; set; }

        public GetSyntheticLocationInvokeArgs()
        {
        }
        public static new GetSyntheticLocationInvokeArgs Empty => new GetSyntheticLocationInvokeArgs();
    }


    [OutputType]
    public sealed class GetSyntheticLocationResult
    {
        /// <summary>
        /// The cloud provider where the location is hosted.
        /// </summary>
        public readonly string CloudPlatform;
        public readonly string? Id;
        public readonly ImmutableArray<string> Ips;
        public readonly string? Name;
        public readonly string Stage;
        public readonly string Status;
        public readonly string? Type;

        [OutputConstructor]
        private GetSyntheticLocationResult(
            string cloudPlatform,

            string? id,

            ImmutableArray<string> ips,

            string? name,

            string stage,

            string status,

            string? type)
        {
            CloudPlatform = cloudPlatform;
            Id = id;
            Ips = ips;
            Name = name;
            Stage = stage;
            Status = status;
            Type = type;
        }
    }
}

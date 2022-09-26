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
    public static class GetProcess
    {
        public static Task<GetProcessResult> InvokeAsync(GetProcessArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetProcessResult>("dynatrace:index/getProcess:getProcess", args ?? new GetProcessArgs(), options.WithDefaults());

        public static Output<GetProcessResult> Invoke(GetProcessInvokeArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.Invoke<GetProcessResult>("dynatrace:index/getProcess:getProcess", args ?? new GetProcessInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetProcessArgs : global::Pulumi.InvokeArgs
    {
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        [Input("tags")]
        private List<string>? _tags;

        /// <summary>
        /// Required tags of the process to find
        /// </summary>
        public List<string> Tags
        {
            get => _tags ?? (_tags = new List<string>());
            set => _tags = value;
        }

        public GetProcessArgs()
        {
        }
        public static new GetProcessArgs Empty => new GetProcessArgs();
    }

    public sealed class GetProcessInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        [Input("tags")]
        private InputList<string>? _tags;

        /// <summary>
        /// Required tags of the process to find
        /// </summary>
        public InputList<string> Tags
        {
            get => _tags ?? (_tags = new InputList<string>());
            set => _tags = value;
        }

        public GetProcessInvokeArgs()
        {
        }
        public static new GetProcessInvokeArgs Empty => new GetProcessInvokeArgs();
    }


    [OutputType]
    public sealed class GetProcessResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string Name;
        /// <summary>
        /// Required tags of the process to find
        /// </summary>
        public readonly ImmutableArray<string> Tags;

        [OutputConstructor]
        private GetProcessResult(
            string id,

            string name,

            ImmutableArray<string> tags)
        {
            Id = id;
            Name = name;
            Tags = tags;
        }
    }
}
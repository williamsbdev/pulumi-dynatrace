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
    public static class GetCredentials
    {
        public static Task<GetCredentialsResult> InvokeAsync(GetCredentialsArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetCredentialsResult>("dynatrace:index/getCredentials:getCredentials", args ?? new GetCredentialsArgs(), options.WithDefaults());

        public static Output<GetCredentialsResult> Invoke(GetCredentialsInvokeArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.Invoke<GetCredentialsResult>("dynatrace:index/getCredentials:getCredentials", args ?? new GetCredentialsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetCredentialsArgs : global::Pulumi.InvokeArgs
    {
        [Input("credentials")]
        private Dictionary<string, string>? _credentials;
        public Dictionary<string, string> Credentials
        {
            get => _credentials ?? (_credentials = new Dictionary<string, string>());
            set => _credentials = value;
        }

        public GetCredentialsArgs()
        {
        }
        public static new GetCredentialsArgs Empty => new GetCredentialsArgs();
    }

    public sealed class GetCredentialsInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("credentials")]
        private InputMap<string>? _credentials;
        public InputMap<string> Credentials
        {
            get => _credentials ?? (_credentials = new InputMap<string>());
            set => _credentials = value;
        }

        public GetCredentialsInvokeArgs()
        {
        }
        public static new GetCredentialsInvokeArgs Empty => new GetCredentialsInvokeArgs();
    }


    [OutputType]
    public sealed class GetCredentialsResult
    {
        public readonly ImmutableDictionary<string, string>? Credentials;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;

        [OutputConstructor]
        private GetCredentialsResult(
            ImmutableDictionary<string, string>? credentials,

            string id)
        {
            Credentials = credentials;
            Id = id;
        }
    }
}
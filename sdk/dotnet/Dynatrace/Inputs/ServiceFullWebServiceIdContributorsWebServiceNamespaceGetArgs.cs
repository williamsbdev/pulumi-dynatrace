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

    public sealed class ServiceFullWebServiceIdContributorsWebServiceNamespaceGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("enableIdContributor", required: true)]
        public Input<bool> EnableIdContributor { get; set; } = null!;

        [Input("serviceIdContributor")]
        public Input<Inputs.ServiceFullWebServiceIdContributorsWebServiceNamespaceServiceIdContributorGetArgs>? ServiceIdContributor { get; set; }

        public ServiceFullWebServiceIdContributorsWebServiceNamespaceGetArgs()
        {
        }
        public static new ServiceFullWebServiceIdContributorsWebServiceNamespaceGetArgs Empty => new ServiceFullWebServiceIdContributorsWebServiceNamespaceGetArgs();
    }
}

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

    public sealed class ServiceHttpFailureHttpResponseCodesGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// HTTP response codes which indicate client side errors
        /// </summary>
        [Input("clientSideErrors", required: true)]
        public Input<string> ClientSideErrors { get; set; } = null!;

        /// <summary>
        /// Treat missing HTTP response code as client side error
        /// </summary>
        [Input("failOnMissingResponseCodeClientSide", required: true)]
        public Input<bool> FailOnMissingResponseCodeClientSide { get; set; } = null!;

        /// <summary>
        /// Treat missing HTTP response code as server side errors
        /// </summary>
        [Input("failOnMissingResponseCodeServerSide", required: true)]
        public Input<bool> FailOnMissingResponseCodeServerSide { get; set; } = null!;

        /// <summary>
        /// HTTP response codes which indicate an error on the server side
        /// </summary>
        [Input("serverSideErrors", required: true)]
        public Input<string> ServerSideErrors { get; set; } = null!;

        public ServiceHttpFailureHttpResponseCodesGetArgs()
        {
        }
        public static new ServiceHttpFailureHttpResponseCodesGetArgs Empty => new ServiceHttpFailureHttpResponseCodesGetArgs();
    }
}

// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Lbrlabs.PulumiPackage.Dynatrace.Outputs
{

    [OutputType]
    public sealed class HttpMonitorScriptRequestAuthentication
    {
        public readonly string Credentials;
        public readonly string? KdcIp;
        public readonly string? RealmName;
        public readonly string Type;

        [OutputConstructor]
        private HttpMonitorScriptRequestAuthentication(
            string credentials,

            string? kdcIp,

            string? realmName,

            string type)
        {
            Credentials = credentials;
            KdcIp = kdcIp;
            RealmName = realmName;
            Type = type;
        }
    }
}
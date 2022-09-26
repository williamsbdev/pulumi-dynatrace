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
    public sealed class QueueManagerRemoteQueue
    {
        /// <summary>
        /// Remote queue definitions for queue manager
        /// </summary>
        public readonly ImmutableArray<Outputs.QueueManagerRemoteQueueRemoteQueue> RemoteQueues;

        [OutputConstructor]
        private QueueManagerRemoteQueue(ImmutableArray<Outputs.QueueManagerRemoteQueueRemoteQueue> remoteQueues)
        {
            RemoteQueues = remoteQueues;
        }
    }
}
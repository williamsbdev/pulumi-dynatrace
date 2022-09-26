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
    public sealed class QueueManagerRemoteQueueRemoteQueue
    {
        public readonly ImmutableArray<string> ClusterVisibilities;
        public readonly string LocalQueueName;
        public readonly string RemoteQueueManager;
        public readonly string RemoteQueueName;

        [OutputConstructor]
        private QueueManagerRemoteQueueRemoteQueue(
            ImmutableArray<string> clusterVisibilities,

            string localQueueName,

            string remoteQueueManager,

            string remoteQueueName)
        {
            ClusterVisibilities = clusterVisibilities;
            LocalQueueName = localQueueName;
            RemoteQueueManager = remoteQueueManager;
            RemoteQueueName = remoteQueueName;
        }
    }
}
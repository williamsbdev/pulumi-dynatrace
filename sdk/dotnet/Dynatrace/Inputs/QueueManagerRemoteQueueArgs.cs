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

    public sealed class QueueManagerRemoteQueueArgs : global::Pulumi.ResourceArgs
    {
        [Input("remoteQueues")]
        private InputList<Inputs.QueueManagerRemoteQueueRemoteQueueArgs>? _remoteQueues;

        /// <summary>
        /// Remote queue definitions for queue manager
        /// </summary>
        public InputList<Inputs.QueueManagerRemoteQueueRemoteQueueArgs> RemoteQueues
        {
            get => _remoteQueues ?? (_remoteQueues = new InputList<Inputs.QueueManagerRemoteQueueRemoteQueueArgs>());
            set => _remoteQueues = value;
        }

        public QueueManagerRemoteQueueArgs()
        {
        }
        public static new QueueManagerRemoteQueueArgs Empty => new QueueManagerRemoteQueueArgs();
    }
}
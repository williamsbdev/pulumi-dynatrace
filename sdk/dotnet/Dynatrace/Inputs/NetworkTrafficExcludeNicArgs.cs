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

    public sealed class NetworkTrafficExcludeNicArgs : global::Pulumi.ResourceArgs
    {
        [Input("nicForms", required: true)]
        private InputList<Inputs.NetworkTrafficExcludeNicNicFormArgs>? _nicForms;
        public InputList<Inputs.NetworkTrafficExcludeNicNicFormArgs> NicForms
        {
            get => _nicForms ?? (_nicForms = new InputList<Inputs.NetworkTrafficExcludeNicNicFormArgs>());
            set => _nicForms = value;
        }

        public NetworkTrafficExcludeNicArgs()
        {
        }
        public static new NetworkTrafficExcludeNicArgs Empty => new NetworkTrafficExcludeNicArgs();
    }
}

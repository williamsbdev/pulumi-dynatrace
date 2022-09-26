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
    public sealed class DashboardTileBounds
    {
        public readonly int Height;
        public readonly int Left;
        public readonly int Top;
        /// <summary>
        /// allows for configuring properties that are not explicitly supported by the current version of this provider
        /// </summary>
        public readonly string? Unknowns;
        public readonly int Width;

        [OutputConstructor]
        private DashboardTileBounds(
            int height,

            int left,

            int top,

            string? unknowns,

            int width)
        {
            Height = height;
            Left = left;
            Top = top;
            Unknowns = unknowns;
            Width = width;
        }
    }
}
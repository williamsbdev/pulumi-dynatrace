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

    public sealed class OwnershipTeamsResponsibilitiesArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Responsible for developing and maintaining high quality software. Development teams are responsible for making code changes to address performance regressions, errors, or security vulnerabilities.
        /// </summary>
        [Input("development", required: true)]
        public Input<bool> Development { get; set; } = null!;

        /// <summary>
        /// Responsible for the administration, management, and support of the IT infrastructure including physical servers, virtualization, and cloud. Teams with infrastructure responsibility are responsible for addressing hardware issues, resource limits, and operating system vulnerabilities.
        /// </summary>
        [Input("infrastructure", required: true)]
        public Input<bool> Infrastructure { get; set; } = null!;

        /// <summary>
        /// Responsible for ensuring that applications in development align with business needs and meet the usability requirements of users, stakeholders, customers, and external partners. Teams with line of business responsibility are responsible for understanding the customer experience and how it affects business goals.
        /// </summary>
        [Input("lineOfBusiness", required: true)]
        public Input<bool> LineOfBusiness { get; set; } = null!;

        /// <summary>
        /// Responsible for deploying and managing software, with a focus on high availability and performance. Teams with operations responsibilities needs to understand the impact, priority, and team responsible for addressing problems detected by Dynatrace.
        /// </summary>
        [Input("operations", required: true)]
        public Input<bool> Operations { get; set; } = null!;

        /// <summary>
        /// Responsible for the security posture of the organization. Teams with security responsibility must understand the impact, priority, and team responsible for addressing security vulnerabilities.
        /// </summary>
        [Input("security", required: true)]
        public Input<bool> Security { get; set; } = null!;

        public OwnershipTeamsResponsibilitiesArgs()
        {
        }
        public static new OwnershipTeamsResponsibilitiesArgs Empty => new OwnershipTeamsResponsibilitiesArgs();
    }
}

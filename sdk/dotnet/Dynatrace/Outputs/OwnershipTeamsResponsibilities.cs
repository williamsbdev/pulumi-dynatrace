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
    public sealed class OwnershipTeamsResponsibilities
    {
        /// <summary>
        /// Responsible for developing and maintaining high quality software. Development teams are responsible for making code changes to address performance regressions, errors, or security vulnerabilities.
        /// </summary>
        public readonly bool Development;
        /// <summary>
        /// Responsible for the administration, management, and support of the IT infrastructure including physical servers, virtualization, and cloud. Teams with infrastructure responsibility are responsible for addressing hardware issues, resource limits, and operating system vulnerabilities.
        /// </summary>
        public readonly bool Infrastructure;
        /// <summary>
        /// Responsible for ensuring that applications in development align with business needs and meet the usability requirements of users, stakeholders, customers, and external partners. Teams with line of business responsibility are responsible for understanding the customer experience and how it affects business goals.
        /// </summary>
        public readonly bool LineOfBusiness;
        /// <summary>
        /// Responsible for deploying and managing software, with a focus on high availability and performance. Teams with operations responsibilities needs to understand the impact, priority, and team responsible for addressing problems detected by Dynatrace.
        /// </summary>
        public readonly bool Operations;
        /// <summary>
        /// Responsible for the security posture of the organization. Teams with security responsibility must understand the impact, priority, and team responsible for addressing security vulnerabilities.
        /// </summary>
        public readonly bool Security;

        [OutputConstructor]
        private OwnershipTeamsResponsibilities(
            bool development,

            bool infrastructure,

            bool lineOfBusiness,

            bool operations,

            bool security)
        {
            Development = development;
            Infrastructure = infrastructure;
            LineOfBusiness = lineOfBusiness;
            Operations = operations;
            Security = security;
        }
    }
}
